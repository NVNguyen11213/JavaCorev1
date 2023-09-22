/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Candidates;

/**
 *
 * @author Admin
 */
public class BlockA extends Candidates{
    private float mathScores;
    private float physicalPoint; 
    private float chemistryPoint;

    public BlockA(float mathScores, float physicalPoint, float chemistryPoint, String name, String address, String priorityLevel) {
        super( name, address, priorityLevel);
        this.mathScores = mathScores;
        this.physicalPoint = physicalPoint;
        this.chemistryPoint = chemistryPoint;
    }

    public float getMathScores() {
        return mathScores;
    }

    public void setMathScores(float mathScores) {
        this.mathScores = mathScores;
    }

    public float getPhysicalPoint() {
        return physicalPoint;
    }

    public void setPhysicalPoint(float physicalPoint) {
        this.physicalPoint = physicalPoint;
    }

    public float getChemistryPoint() {
        return chemistryPoint;
    }

    public void setChemistryPoint(float chemistryPoint) {
        this.chemistryPoint = chemistryPoint;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Math Scores: " + mathScores);
        System.out.println("Physical Point: " + physicalPoint);
        System.out.println("Chemistry Point: " + chemistryPoint);
    }
}
