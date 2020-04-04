package phong;

public abstract class SalaryPolicy {
	private static  float baseSalary;
	public float getBaseSalary() {
        return baseSalary;
    }

    public static void setBaseSalary(float _baseSalary) {
       baseSalary = _baseSalary;
    }
	abstract float getSalary();
}
