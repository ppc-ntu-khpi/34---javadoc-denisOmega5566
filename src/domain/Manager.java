package domain;

import java.util.StringJoiner;

/**
 * Клас представляє об'єкт менеджера.
 */
public class Manager extends Employee {
	
	/**
	 * Ініціалізує новий об'єкт зі всіма параметрами.
	 */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Строкове представлення об'єкта 
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Створює новий об'єкт з параметром співробітників менеджера.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Створює новий об'єкт.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Cпівробітники менеджера
     */
    private Employee[] employees;
    
    /**
     * Повертає строку імен співробітників менеджера.
     */
    public String getEmployees() {
        /*String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;*/
    	StringJoiner sj = new StringJoiner(", ");
    	for (Employee e : employees) {
    		sj.add(e.getName());
        }
    	return sj.toString();
    }
    
    /**
     * Встановлює массив співробітників менеджера. {@link Manager#employees}
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    
    /**
     * Повертає массив співробітників менеджера. {@link Manager#employees}
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
