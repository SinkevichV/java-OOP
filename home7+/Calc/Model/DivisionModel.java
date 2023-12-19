package Ex001Calc.Model;

import static Ex001Calc.Log.Log.logger;

public class DivisionModel extends CalcModel{
        public DivisionModel() {
            logger.info("Деление двух чисел");
        }

        @Override
        public double result() {
            logger.info("Результат деления");
            return x / y;
        }

        @Override
        public void setX(double value) {
            logger.info("Введено первое число");
            super.x = value;
        }

        @Override
        public void setY(double value) {

            if(value == 0)

                System.out.println("делить на 0 нельзя, введите другое число");

            else
                super.y = value;
            logger.info("Введено второе число");
        }
    }


