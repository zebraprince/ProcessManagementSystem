import java.util.List;

import com.chinasofti.service.ITableService;
import com.chinasofti.service.impl.TableService;
import com.chinasofti.service.workflow.action.FirInfoService;


public class test000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirInfoService firInfoService=new FirInfoService();
		System.out.println(firInfoService.getFirInfo(1,1).size());
		ITableService ts=new TableService(); 
		List<List<String>> list=ts.getTableInfo(1,1);
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(list.size());

	}

}
