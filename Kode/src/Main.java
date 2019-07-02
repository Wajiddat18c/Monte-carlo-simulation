/**
 * @author Wajid
 */
public class Main {

    public static void main(String[] args) {
        int n=0;
        int circle=0;
        double x;
        double y;
        //Stopper aldig
        while (true)
        {
            //initialisere x,y til Random værdier.
            x = Math.random();
            y = Math.random();
            //if statement sikre at x eller y ikke er et negavivt tal.
            if (x*x + y*y < 1){
                circle++;
            }
            n++;
            //forholdet mellem arealet af et firekant og cirkelen.
            // π = 4 * cirkel / firekant
            System.out.println(4*(double)circle/n);
        }
    }
}
