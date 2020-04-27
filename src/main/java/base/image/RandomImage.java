package base.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RandomImage {
    public static void main(String[] args) {
        int width = 640,height=320;
        BufferedImage img = null;
        img= new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        File f = null;
        for(int y = 0;y<height;y++){
            for(int x=0;x<width;x++){
                int a = (int)(Math.random()*256);
                int r = (int)(Math.random()*256);
                int g = (int)(Math.random()*256);
                int b = (int)(Math.random()*256);

                int p = (a<<24) | (r<<16) | (g<<8) | b;
                img.setRGB(x,y,p);
            }
        }
        try{
            f = new File("D:\\OutRandom.jpg");
            ImageIO.write(img,"jpg",f);
        }catch (IOException e){
            System.out.println("Error:" +e );
        }
    }
}
