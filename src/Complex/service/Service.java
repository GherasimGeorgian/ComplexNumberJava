package Complex.service;
import Complex.model.NumarComplex;
import Complex.repository.Repository;
public class Service {
    private Repository repository;

    public void setRepository(Repository repo) {
        this.repository = repo;
    }
    public boolean checkExpresion(String expresion){
        NumarComplex c= new NumarComplex();
        c.DescompuneExpresie(expresion);
        return true;
    }

}
