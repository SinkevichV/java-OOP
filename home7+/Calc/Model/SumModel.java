package Ex001Calc.Model;

import static Ex001Calc.Log.Log.logger;

public class SumModel extends CalcModel {

    public SumModel() {
        logger.info("Сумма двух чисел");
    }
    // do_it
    @Override
    public double result() {
        logger.info("Результат суммы двух чисел  ");
        return x + y;
    }

    @Override
    public void setX(double value) {
        logger.info("Введено первое число");
        super.x = value;
    }

    @Override
    public void setY(double value) {
        logger.info("Введено второе число");
        super.y = value;
    }

}
