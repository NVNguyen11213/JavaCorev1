/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfficialManager;


public class Worker extends Officer{
    private String work;

    public Worker(String work, String name, int age, String sex, String address) {
        super(name, age, sex, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
    @Override
    void display(){
        super.display();
        System.out.println("work: "+ work);
    }
}
