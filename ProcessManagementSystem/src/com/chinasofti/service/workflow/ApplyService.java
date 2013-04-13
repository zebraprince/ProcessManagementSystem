package com.chinasofti.service.workflow;

import org.hibernate.Session;
import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

import com.chinasofti.consts.WorkflowConsts;
import com.chinasofti.service.IApplyService;

public class ApplyService implements IApplyService {

	public void apply(String content, String jbpmName) {

		Session session = null;
		try {
			// jbpm配置
			JbpmConfiguration jbpmConfiguration = JbpmConfiguration
					.getInstance();
			// 得到一个JBPM的关联
			JbpmContext jbpmContext = jbpmConfiguration.getCurrentJbpmContext();
			// 通过关联或者一个sessionFactory.
			session = jbpmContext.getSessionFactory().openSession();
			// 开始一个事务
			session.beginTransaction();
			// 查找最新版本流程实例并创建流程实例
			ProcessDefinition pDefinition = jbpmContext.getGraphSession()
					.findLatestProcessDefinition(jbpmName);
			// 创建一个工作流实例
			ProcessInstance pInstance = pDefinition.createProcessInstance();
			// 开启流程也就是让start开始流向下一个节点。
			pInstance.signal();

			// 获取到第一个申请任务.
			TaskInstance taskInstance = (TaskInstance) pInstance
					.getTaskMgmtInstance().getTaskInstances().iterator().next();
			System.out.println("任务名称" + taskInstance.getName());
			//
			taskInstance.setVariable(WorkflowConsts.WF_VAR_CONTENT, content);
			taskInstance.setVariable(WorkflowConsts.WF_PROCESS_ID, pInstance
					.getId());
			taskInstance.setVariable("I,AM,","YJC");

			pInstance.signal();
			jbpmContext.save(pInstance);
			jbpmContext.save(taskInstance);

		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
