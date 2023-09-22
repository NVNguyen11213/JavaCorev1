/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfficialManager;

/**
 *
 * @author Admin
 */
public class Engineer extends Officer{
    private String majors;

    public Engineer(String name, int age, String sex, String address, String majors) {
        super(name, age, sex,address);
        this.majors = majors;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }
    @Override
    void display(){
        super.display();
        System.out.println("majors: " + majors);
    }
    
}
