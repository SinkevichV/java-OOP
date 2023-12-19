package Ex001Calc.View;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    // print(f'{title} = {data}')
    public void print(double data, String title) {
        System.out.printf("%s %f\n", title, data);
    }
}
