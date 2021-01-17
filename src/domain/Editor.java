package domain;
/**
 * Клас представляє об'єкт редактора.
 */
public class Editor extends Artist {
  /**
  * Ініціалізує новий об'єкт {@code Editor} зі всіма параметрами.
 */

    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
 /**
     * Створює новий об'єкт з параметром навиків редактора та електронної обробки.
 */

    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
 /**
     * Створює новий об'єкт з параметром електронної обробки.
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Створює новий об'єкт.
     */
    
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * Строкове представлення об'єкта.
     */

    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }
    /**
     * Електронна обробка
     */

    private boolean electronicEditing;
    /**
     * Повертає перевагу редактора.
     */

    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * Встановлює поле електронної обробки. 
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
