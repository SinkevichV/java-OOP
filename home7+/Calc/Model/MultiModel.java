package Ex001Calc.Model;


import static Ex001Calc.Log.Log.logger;

public class MultiModel extends CalcModel{
    public MultiModel() {
        logger.info("Произведение двух чисел");
    }

    @Override
    public double result() {
        logger.info("Результат произведения");
        return x * y;
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
