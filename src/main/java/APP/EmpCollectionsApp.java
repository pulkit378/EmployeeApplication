package APP;
import java.util.Scanner;

import EmpCollections.EmpCollectionsOperationsImpl;
import EmpCollections.EmpCollectionsUtil;

public class EmpCollectionsApp {

	static Scanner scanner = new Scanner(System.in);
	static EmpCollectionsOperationsImpl empl;

	public static void main(String[] args) throws Exception {

		empl = new EmpCollectionsOperationsImpl();

		EmpCollectionsUtil.displayMenu();
		EmpCollectionsUtil.operateMenu(empl);

	}

}
	