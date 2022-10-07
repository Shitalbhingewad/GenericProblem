package Generic.genericproblems;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("Hello to Genrics Program!");
        logger.info("Give 3 inputs of integer:");
        Scanner sc = new Scanner(System.in);
        MaxInteger i = new MaxInteger();
        MaxString s = new  MaxString();
        GenericMax g = new GenericMax();
        int inp1 = Integer.parseInt(sc.nextLine());
        int inp2 = Integer.parseInt(sc.nextLine());
        int inp3 = Integer.parseInt(sc.nextLine());
        int[] ArrayOfInputs = { inp1, inp2, inp3 };
        int max = i.calculateMaximum(ArrayOfInputs);
        int max1 = g.calculateMaximum(ArrayOfInputs);
        i.checkMaxAt2ndPos(ArrayOfInputs[1], max);
        g.checkMaxAt2ndPos(ArrayOfInputs[1], max1);
        logger.info("Give 3 inputs of strings:");
        String inp11 = sc.nextLine();
        String inp22 = sc.nextLine();
        String inp33 = sc.nextLine();
        String[] ArrayOfInputs1 = { inp11, inp22, inp33 };
        Comparable max2 = g.calculateMaximumString(ArrayOfInputs1);
        s.checkMaxAt2ndPos(ArrayOfInputs1[1], (String) max2);
        GenericMax.checkMaxAt2ndPos(ArrayOfInputs1[1], max2);
    }
}
