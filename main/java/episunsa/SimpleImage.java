package episunsa;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;

import java.io.*;
import java.util.*;
public class SimpleImage implements Iterable<Pixel>{
  private BufferedImage img;
  JFrame frame;
  public SimpleImage(String fileName){
    try{
      img = ImageIO.read(new File(fileName));
      frame = new JFrame("SimpleImage");
      frame.add(new JLabel(new ImageIcon(img)));
      if(getWidth() < 200 || getHeight() < 200)
        frame.setSize(200, 200);
      else
        frame.pack();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //frame.setVisible(true);
    }catch (IOException e){
      img = null;
    }
  }
  public int getWidth(){
    return img.getWidth();
  }
  public int getHeight(){
    return img.getHeight();
  }
  public void setRed(int x, int y, int color){
    int rgb = img.getRGB(x, y);
    rgb = rgb & ~0xFF0000;
    color = (color & 0xFF) << 16;
    img.setRGB(x, y, rgb | color);
  }
  public void setGreen(int x, int y, int color){
    int rgb = img.getRGB(x, y);
    rgb = rgb & ~0xFF00;
    color = (color & 0xFF) << 8;
    img.setRGB(x, y, rgb | color);
  }
  public void setBlue(int x, int y, int color){
    int rgb = img.getRGB(x, y);
    rgb = rgb & ~0xFF;
    color = color & 0xFF;
    img.setRGB(x, y, rgb | color);
  }
  public int getRGB(int x, int y){
    return img.getRGB(x, y);
  }
  public Pixel getPixel(int x, int y){
    return new Pixel(x, y, img);
  }
  public int getRed(int x, int y){
    int rgb = img.getRGB(x, y);
    int red = (rgb >> 16) & 0xFF;
    return red;
  }
  public int getGreen(int x, int y){
    return (img.getRGB(x, y) >> 8) & 0xFF;
  }
  public int getBlue(int x, int y){
    return (img.getRGB(x, y)) & 0xFF;
  }
  public void setZoom(int scale){
    BufferedImage newImg = new BufferedImage(
                               scale * img.getWidth(),
                               scale * img.getWidth(),
                               BufferedImage.TYPE_INT_ARGB);
    
  }
  @Override
  public Iterator<Pixel> iterator(){
    return new Iterator<Pixel>(){
      private int pos = 0;

      @Override
      public boolean hasNext(){
        return pos < (img.getWidth() * img.getHeight() - 1);
      }
      @Override
      public Pixel next(){
        Pixel p = new Pixel(pos % img.getWidth(), pos / img.getWidth(), img);
        pos++;
        return p;
      }
      @Override
      public void remove(){
        throw new UnsupportedOperationException("Not modification allowed");
      }
    };
  }
  public void print(){
    frame.repaint();
    frame.setVisible(true);
  }
}
