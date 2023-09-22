/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Candidates;

/**
 *
 * @author Admin
 */
public class BlockC extends Candidates{
    private float literaturePoint;
    private float historyPoint;
    private float geographyPoint;

    public BlockC(float literaturePoint, float historyPoint, float geographyPoint,  String name, String address, String priorityLevel) {
        super( name, address, priorityLevel);
        this.literaturePoint = literaturePoint;
        this.historyPoint = historyPoint;
        this.geographyPoint = geographyPoint;
    }

    public float getLiteraturePoint() {
        return literaturePoint;
    }

    public void setLiteraturePoint(float literaturePoint) {
        this.literaturePoint = literaturePoint;
    }

    public float getHistoryPoint() {
        return historyPoint;
    }

    public void setHistoryPoint(float historyPoint) {
        this.historyPoint = historyPoint;
    }

    public float getGeographyPoint() {
        return geographyPoint;
    }

    public void setGeographyPoint(float geographyPoint) {
        this.geographyPoint = geographyPoint;
    }
     @Override
    void display(){
        super.display();
        System.out.println("Literature Point: " + literaturePoint);
        System.out.println("History Point: " + historyPoint);
        System.out.println("Geography Point: " + geographyPoint);
    }
}
