package base.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Negative {
    public static void main(String[] args) {
        BufferedImage img = null;
        File f = null;

        try{
            f= new File("D:\\Inp.jpg");
            img = ImageIO.read(f);
        }catch(IOException e){
            System.out.println(e);
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for(int y=0;y<height;y++){
            for(int x=0;x<width;x++){
                int p =img.getRGB(x,y);
                int a =(p>>24)&0xff;
                int r = (p>>16)&0xff;
                int g = (p>>8)&0xff;
                int b = p&0xff;
                r = 255-r;
                g=255-g;
                b=255-b;
                p=(a<<24)|(r<<16)|(g<<8)|b;
                img.setRGB(x,y,p);
            }
        }

        try {
            f = new File("D:\\Out.jpg");
            ImageIO.write(img,"jpg", f);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
