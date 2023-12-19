package Ex001Calc;

import Ex001Calc.Model.DivisionModel;
import Ex001Calc.Model.MultiModel;
import Ex001Calc.Model.SumModel;
import Ex001Calc.Presenter.Presenter;
import Ex001Calc.View.View;

public class Program {
    public static void main(String[] args) {
//        Presenter p = new Presenter(new SumModel(), new View());
//        p.buttonClick();
//
//        Presenter c = new Presenter(new MultiModel(), new View());
//        c.buttonClick();

        Presenter d = new Presenter(new DivisionModel(), new View());
        d.buttonClick();

    }
}
