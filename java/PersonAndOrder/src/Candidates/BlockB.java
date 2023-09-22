/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Candidates;

/**
 *
 * @author Admin
 */
public class BlockB extends Candidates{
    private float mathScores; 
    private float chemistryPoint;
    private float biologyPoint;

    public BlockB(float mathScores, float chemistryPoint, float biologyPoint, String name, String address, String priorityLevel) {
        super( name, address, priorityLevel);
        this.mathScores = mathScores;
        this.chemistryPoint = chemistryPoint;
        this.biologyPoint = biologyPoint;
    }

    public float getMathScores() {
        return mathScores;
    }

    public void setMathScores(float mathScores) {
        this.mathScores = mathScores;
    }

    public float getChemistryPoint() {
        return chemistryPoint;
    }

    public void setChemistryPoint(float chemistryPoint) {
        this.chemistryPoint = chemistryPoint;
    }

    public float getBiologyPoint() {
        return biologyPoint;
    }

    public void setBiologyPoint(float biologyPoint) {
        this.biologyPoint = biologyPoint;
    }
     @Override
    void display(){
        super.display();
        System.out.println("Math Scores: " + mathScores);
        System.out.println("Chemistry Point: " + chemistryPoint);
        System.out.println("Biology Point: " + biologyPoint);
    }
}
