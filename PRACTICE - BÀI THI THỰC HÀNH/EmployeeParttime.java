package phong;

public class EmployeeParttime extends SalaryPolicy {
	
		private final float rate = 2.5f;
		 public EmployeeParttime() {
		       
		    }
		
		public float getSalary() {
			return rate*(super.getBaseSalary());
		}
	

}
