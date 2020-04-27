package base.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MirrorImage {
    public static void main(String[] args) {
        BufferedImage simg = null;
        File f = null;

        try{
            f = new File("D:\\Inp.jpg");
            simg = ImageIO.read(f);

        }catch (IOException e){
            System.out.println("Error:"+e);
        }

        int width = simg.getWidth();
        int height = simg.getHeight();

        BufferedImage mimg = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        for(int y = 0;y<height;y++){
            for(int lx=0,rx = width-1;lx<width;lx++,rx--){
                int p = simg.getRGB(lx,y);
                mimg.setRGB(rx,y,p);

            }
        }
        try{
            f = new File("D:\\OutSimg.jpg");
            ImageIO.write(mimg,"jpg",f);
        }catch (IOException e){
            System.out.println("Error:"+e);
        }
    }
}
