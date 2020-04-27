package base.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Algotithm for converting an colored image to green colored:
 * 1.Get the rgb value of the pixel.
 * 2.Set the rgb values as follows:
 *  *R:Set to 0;
 *  *G:no change
 *  *B:Set to 0
 * 3.Replace the T,G and B value of the pixel with the values calculated in step2
 * 4.Repeat Step 1 to Step 3 for each pixels of the image.
 */

public class RedImage {
    public static void main(String[] args) {
        BufferedImage img = null;
        File f = null;
        try{
            f = new File("D:\\Inp.jpg");
            img = ImageIO.read(f);

        }catch(IOException e){
            System.out.println(e);
        }
        int width = img.getWidth();
        int height = img.getHeight();
        for(int y=0;y<height;y++){
            for(int x=0;x<width;x++){
                int p = img.getRGB(x,y);
                int a = (p>>24)&0xff;
                int r=(p>>16)&0xff;
                p=(a<<24)|(r<<16)|(0<<8)|0;
                img.setRGB(x,y,p);
            }
        }
        try{
            f = new File("D:\\OutRed.jpg");
            ImageIO.write(img,"jpg",f);

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
