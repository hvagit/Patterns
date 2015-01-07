/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Henrik
 */
abstract class Shape {
    protected DrawingAPI drawingAPI;
 
    protected Shape(DrawingAPI drawingAPI){
        this.drawingAPI = drawingAPI;
    }
 
    public abstract void draw();                             // low-level
    public abstract void resizeByPercentage(double pct);     // high-level
}