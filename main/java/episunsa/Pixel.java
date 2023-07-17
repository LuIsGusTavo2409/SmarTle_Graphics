package episunsa;
import java.awt.image.*;

public class Pixel{
  private int x, y;
  private BufferedImage img;
  public Pixel(int x, int y, BufferedImage img){
    this.x = x;
    this.y = y;
    this.img = img;
  }
  public void setRed(int color){
    color = (color > 255) ? 255: color;
    int rgb = img.getRGB(x, y);
    rgb = rgb & ~0xFF0000;
    color = (color & 0xFF) << 16;
    img.setRGB(x, y, rgb | color);
  }
  public void setGreen(int color){
    color = (color > 255) ? 255: color;
    int rgb = img.getRGB(x, y);
    rgb = rgb & ~0xFF00;
    color = (color & 0xFF) << 8;
    img.setRGB(x, y, rgb | color);
  }
  public void setBlue(int color){
    color = (color > 255) ? 255: color;
    int rgb = img.getRGB(x, y);
    rgb = rgb & ~0xFF;
    color = color & 0xFF;
    img.setRGB(x, y, rgb | color);
  }
  public int getRGB(){
    return img.getRGB(x, y);
  }
  public int getRed(){
    int rgb = img.getRGB(x, y);
    int red = (rgb >> 16) & 0xFF;
    return red;
  }
  public int getGreen(){
    return (img.getRGB(x, y) >> 8) & 0xFF;
  }
  public int getBlue(){
    return (img.getRGB(x, y)) & 0xFF;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
}
