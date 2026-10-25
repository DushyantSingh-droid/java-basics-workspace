package polymorphism3;

public class StaffMember {
  public void calculateSalary() {
	  System.out.println("general salary");
  }
}
class FullTimeStaff extends StaffMember{
	@Override
	public void calculateSalary() {
		System.out.println("Full-time salary calculated");
	}
	public void accessBenefits() {
		System.out.println("Full-time benefits acessed");
	}
}
class ContractStaff extends StaffMember{
	@Override
	public void calculateSalary() {
		System.out.println("Contract staff salary calculated");
	}
}