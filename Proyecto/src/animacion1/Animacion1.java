package animacion1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animacion1 extends JPanel {

    private BufferedImage image,image1;

    public Animacion1() {

        try {
            image = ImageIO.read(new File("C:\\Users\\hpacac\\Desktop\\Proyectos\\Animacion1\\Imagenes\\Gohan.png"));
            image1 = ImageIO.read(new File("C:\\Users\\hpacac\\Desktop\\Proyectos\\Animacion1\\Imagenes\\Trunks2.png"));
            //La ubicacion de las imagenes puede cambiar
        } 

        catch (IOException ex) {
           System. out. println("El archivo no existe");
        }

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image, 0, 0, null); 
        g.drawImage(image1,400,100,null);

    }

    public static void main(String args[]) {

        Animacion1 obj = new Animacion1();
        JFrame mn = new JFrame();
        mn.setSize(800, 800);
        mn.add(obj);
        mn.setVisible(true);
    }

 public void move()
 {
 int dx = 0,x = 0;
 if (dx > 0 && x <= 640 - 38)
 x += dx;
 if (x==100) 
 System. out. println("Estrellados");
 else
 if (dx < 0 && x >= 2)
 x += dx;
 }
 public int xgetX()
 {
 return x;
 }
 public Image getImage()
 {
 return image;
 }
 public void keyPressed(KeyEvent e)
 {
 int key = e.getKeyCode();
 if (key == KeyEvent.VK_RIGHT)
 {
     int dx = 5;
 }
 if (key == KeyEvent.VK_LEFT)
 {
     int dx = -5;
 }
 }
 public void keyReleased(KeyEvent e)
 {
 int key = e.getKeyCode();
 if (key == KeyEvent.VK_RIGHT)
 {
 int dx = 0;
 }
 if (key == KeyEvent.VK_LEFT)
 {
 int dx = 0;
 }
 }
} 