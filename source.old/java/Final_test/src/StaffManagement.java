import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StaffManagement {
	
	public ArrayList<Staff> readData(String fileName){
		try{
			File file = new File(fileName);
			Scanner sc = new Scanner(file);
			ArrayList<Staff> arr = new ArrayList<>();
			int n = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < n; i++) {
//				number, id, name,
//						age, email, basicSalary.
				int number = Integer.parseInt(sc.nextLine());
				String id = sc.nextLine();
				String name = sc.nextLine();
				int age = Integer.parseInt(sc.nextLine());
				String email = sc.nextLine();
				double basicSalary = Double.parseDouble(sc.nextLine());
				if (number == 1) {
					double hours_OT = Double.parseDouble(sc.nextLine());
					Developer tmp = new Developer(id, name, email, age, basicSalary, hours_OT);
					arr.add(tmp);
				}
				else {
					int no_errors = Integer.parseInt(sc.nextLine());
					Tester tmp = new Tester(id, name, email, age, basicSalary, no_errors);
					arr.add(tmp);
				}
			}
			return arr;

		}
		catch (Exception e) {

		}
		return null;
	}
	
	public void printInforStaffs(ArrayList <Staff> staffs) {
		for(Staff it : staffs) {
			System.out.println(it.toString());
		}
	}
	
	public void sortBySalary(ArrayList <Staff> staffs) {
		Collections.sort(staffs, new Comparator<Staff>() {
			@Override
			public int compare(Staff staff, Staff t1) {
				int cmp = Double.compare(t1.getSalary(), staff.getSalary());
				return cmp == 0 ? String_cmp(t1.getId(), staff.getId()) : cmp;
			}
		});

	}
	
	public ArrayList <Staff> filterDep_byOT(ArrayList <Staff> staffs,  String lab){
//		Tinh trung binh cong so h lam them h
		double sum = 0.0;
		ArrayList<Staff> labs = new ArrayList<>();
		ArrayList<Staff> ans = new ArrayList<>();
		for (Staff it : staffs) {
			if (it.getClass().getName().equals("Developer") && ((Developer)it).getLab().equals(lab)) {
				sum += ((Developer)it).getHours_OT();
				labs.add(it);
			}
		}
		for (Staff it : labs) {
			if (((Developer)it).getHours_OT() > sum / labs.size()) {
				ans.add(it);
			}
		}
//		c???a c??c nh??n vi??n t??m ???????c ph???i s???p x???p theo th??? t??? t??ng d???n v??? gi??? overtime
		Collections.sort(ans, new Comparator<Staff>() {
			@Override
			public int compare(Staff staff, Staff t1) {
				int cmp = Double.compare(((Developer)staff).getHours_OT(), ((Developer)t1).getHours_OT());
				return cmp == 0 ? String_cmp(staff.getId(), t1.getId()) : cmp;
			}
		});

		return ans;
	}
	
	public ArrayList <Staff> filterTest_bySalary(ArrayList <Staff> staffs) {
		double sum = 0.0;
		ArrayList<Staff> testers = new ArrayList<>();
		ArrayList<Staff> ans = new ArrayList<>();
		for (Staff it : staffs) {
			if (it.getClass().getName().equals("Tester")) {
				sum += it.getSalary();
				testers.add(it);
			}
		}
		for (Staff it : testers) {
			if (it.getSalary() > sum/testers.size()) {
				ans.add(it);
			}
		}
//		sort theo gi???m d???n v??? l????ng.
		Collections.sort(ans, new Comparator<Staff>() {
			@Override
			public int compare(Staff staff, Staff t1) {
				int cmp = Double.compare(t1.getSalary(), staff.getSalary());
				return cmp == 0 ? String_cmp(t1.getId(), staff.getId()) : cmp;

			}
		});
		return ans;
	}
	int String_cmp(String a, String b) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) < b.charAt(i)) {
				return -1;
			}
		}
		return 1;
//		1 la lon hon, -1 la be hon.
	}
	
	public static void main(String[] args) {
		
		StaffManagement stm = new StaffManagement();
		ArrayList<Staff> staffs = stm.readData("staff.txt");
		System.out.println(" Danh s??ch nh??n vi??n: ");
		stm.printInforStaffs(staffs);
		
		System.out.println("Danh s??ch nh??n vi??n sau khi s???p x???p theo l????ng: ");
		stm.sortBySalary(staffs);
		stm.printInforStaffs(staffs);
		
		System.out.println("Danh s??ch nh??n vi??n Ph??ng khoa h???c d??? li???u l??m v?????t gi??? nhi???u h??n s??? gi??? trung b??nh");
		ArrayList<Staff> ot_staffs = stm.filterDep_byOT(staffs, "Ph??ng khoa h???c d??? li???u");
		stm.printInforStaffs(ot_staffs);
		
		System.out.println("Danh s??ch nh??n vi??n ki???m th??? c?? m???c l????ng cao h??n m???c l????ng trung b??nh c???a l???p tr??nh vi??n");
		ArrayList<Staff> test_staffs = stm.filterTest_bySalary(staffs);
		stm.printInforStaffs(test_staffs);
		
	}
	
	
}
