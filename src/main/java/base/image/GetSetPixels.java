package base.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GetSetPixels {

    public static void main(String[] args) {
        BufferedImage img = null;
        File f = null;
        try{
            f= new File("D:\\Inp.jpg");
            img = ImageIO.read(f);
        }catch (Exception e){
            System.out.println(e);
        }

        int width = img.getWidth();
        int height = img.getHeight();
        int p = img.getRGB(0,0);
        int a=(p>>24)&0xff;
        int r = (p>>16)&0xff;
        int g = (p>>8)&0xff;
        int b = p&0xff;

        a=255;
        r=100;
        g=150;
        b=200;
        p=(a<<24)|(r<<16)|(g<<8)|b;
        img.setRGB(0,0,p);
        try{
            f= new File("D:\\Out.jpg");
            ImageIO.write(img,"jpg",f);
        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}
