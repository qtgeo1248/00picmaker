import java.io.*;

public class Picmaker {
    public static int isElement(double a, double b) { //a + bi
        double x = a;
        double y = b;
        for (int i = 0; i < 255; i++) {
            double tempx = x * x - y * y;
            y = 2 * x * y;
            x = tempx;
            x += a;
            y += b;
            if (x * x + y * y > 4) {
                return i;
            }
        }
        return 255;
    }

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("mandel.ppm");
            writer.write("P3 4000 4000 255"); //you can change the pixels to however large you like
            for (int i = 2000; i > -2000; i--) { //x coord
                for (int j = -2000; j < 2000; j++) { //y coord
                    int times = isElement(j / 1000.0, i / 1000.0);
                    if (times != 255) {
                        writer.write(" 0 0 " + (times % 10 * 15 + 105));
                    } else {
                        writer.write(" 0 0 0");
                    }
                }
            }
            writer.write(" ");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
