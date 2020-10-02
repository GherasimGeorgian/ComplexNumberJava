package Complex;
import Complex.model.NumarComplex;
import Complex.repository.ComplexExpression;
import Complex.repository.ExpressionFactory;
import Complex.repository.Repository;
import Complex.service.Service;
import Complex.ui.UIConsole;
import Complex.Operation;
public class hello {
    public static void main(String[] args){
        System.out.println("Salut");

        ExpressionFactory expF = new ExpressionFactory();
        NumarComplex[] caca = {new NumarComplex(3.0,6.0),new NumarComplex(3.0,6.0)};
        ComplexExpression cmpxExp = expF.createExpression(Operation.ADDITION,caca);
        NumarComplex xxx =  cmpxExp.execute();
        System.out.println("Partea reala"+ xxx.getReal());
        System.out.println("Partea imaginara"+ xxx.getImag());

        UIConsole ui = new UIConsole();
        Service service= new Service();
        ui.setService(service);
        service.setRepository(new Repository());
        ui.showUI();
    }
}
