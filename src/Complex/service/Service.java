package Complex.service;
import Complex.model.NumarComplex;
import Complex.repository.adauga;
import Complex.repository.Repository;
import Complex.repository.ComplexExpression;
public class Service {
    private Repository repository;

    public void setRepository(Repository repo) {
        this.repository = repo;
    }
    public boolean checkExpresion(String expresion){


        NumarComplex c= new NumarComplex();
        boolean result = c.DescompuneExpresie(expresion);

        ComplexExpression cx = new adauga();
        NumarComplex d = cx.execute(new NumarComplex(2,3),new NumarComplex(1,2));
        System.out.println("Partea reala:" + d.getReal() + " " + "partea imaginara:" + d.getImag());

        return result;

    }




}
