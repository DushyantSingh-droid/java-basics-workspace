package polymorphism3;

public class PayrollManager {

	public static void main(String[] args) {
		StaffMember staffMember = new FullTimeStaff();
        StaffMember staffMember1 = new ContractStaff();
        staffMember.calculateSalary();
        staffMember1.calculateSalary();
        FullTimeStaff fullTimeStaff = (FullTimeStaff)staffMember;
        fullTimeStaff.accessBenefits();
	}

}
