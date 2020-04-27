package base.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyImage {
    public static void main(String[] args) {
        int width = 300;
        int height = 320;

        BufferedImage image = null;

        try{
            File input_file = new File("D:\\Inp.jpg");
            image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(input_file);
            System.out.println("Reading complete");
        }catch (IOException e){
            System.out.println("Error :"+e);
        }

        try{
            File output_file = new File("D:\\Out.jpg");
            ImageIO.write(image,"jpg",output_file);
            System.out.println("Writing complete.");
        }catch (IOException e){
            System.out.println("Error:"+e);
        }
    }
}
