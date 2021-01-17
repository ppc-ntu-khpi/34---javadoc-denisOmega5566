package domain;

import java.util.StringJoiner;

/**
 * Клас представляє об'єкт артиста.
 */

public class Artist extends Employee {
	
	/**
	 * Ініціалізує новий об'єкт зі всіма параметрами.
	 */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    
    /**
     * Створює новий об'єкт з параметром навиків артиста.
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Створює новий об'єкт.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Строкове представлення об'єкта.
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }
    
    /**
     * Навики артиста
     */
    private String[] skiils;
    
    /**
     * Повертає строку навиків артиста.
     */
    public String getSkills() {
        /*String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;*/
    	StringJoiner sj = new StringJoiner(", ");
    	for (String skiil : skiils) {
    		sj.add(skiil);
        }
    	return sj.toString();
    }
    
    /**
     * Встановлює массив навиків артисту. 
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }
    
    /**
     * Повертає массив навиків артиста. 
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
