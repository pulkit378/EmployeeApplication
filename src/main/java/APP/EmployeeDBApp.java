// Program is done. Just need to fix the update method and the name in load employee and thesortdb thing


package APP;
import java.util.Scanner;

import EmpDatabase.EmployeeDBImpl;
import EmpDatabase.EmployeeDBUtil;

public class EmployeeDBApp {
	


		static Scanner scanner = new Scanner(System.in);
		static EmployeeDBImpl empl;

		public static void main(String[] args) throws Exception {

			empl = new EmployeeDBImpl();

			EmployeeDBUtil.displayMenu();
			EmployeeDBUtil.operateMenu(empl);

		}

}
		

