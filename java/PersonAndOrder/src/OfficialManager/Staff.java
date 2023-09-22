/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfficialManager;

/**
 *
 * @author Admin
 */
public class Staff extends Officer{
    private int leve;

    public Staff(String name, int age, String sex, String address, int leve) {
        super(name, age, sex, address);
        this.leve = leve;
    }

    public int getLeve() {
        return leve;
    }

    public void setLeve(int leve) {
        this.leve = leve;
    }
    @Override
    void display(){
        super.display();
        System.out.println("leve: "+ leve);
    }
}
