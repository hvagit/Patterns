/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypattern;

/**
 *
 * @author Henrik
 */
//on System B 
class ProxyImage implements Image {
 
    // Modsat, hvad jeg lavede i TopBiz - her havde den rigtige klasse en proxy-attribut.
    // Hvad nu, hvis der var flere typer af Image-klasserne?
    private RealImage image = null;
    private String filename = null;
    /**
     * Constructor
     * @param filename 
     */
    public ProxyImage(final String filename) { 
        this.filename = filename; 
    }
 
    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        } 
        image.displayImage();
    }
 
}