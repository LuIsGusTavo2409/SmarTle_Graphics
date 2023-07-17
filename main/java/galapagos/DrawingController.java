package galapagos;

import java.awt.Graphics;

/**
 * Any class that wants to draw something on a DrawingCanvas
 * must implement this interface. The redraw method is called
 * the DrawingCanvase whenever the canvas needs to be repainted.
 * Use the setCanvas method to connect the DrawingCanvas object
 * to the object that implements this interface. 
 * 
 * Cualquier clase que quiera dibujar algo en un DrawingCanvas
 * debe implementar esta interfaz. El método de redibujar se llama
 * el DrawingCanvase cada vez que el lienzo necesita ser repintado.
 * Use el método setCanvas para conectar el objeto DrawingCanvas
 * al objeto que implementa esta interfaz.
 *
 * Date Modified: Feb 24, 2009 (Cosmetic changes)
 * 
 * @author Dr Caffeine
 * 
 */
interface DrawingController {
    
    public void redraw(Graphics g);
    
    public void setCanvas(DrawingCanvas canvas);       
}