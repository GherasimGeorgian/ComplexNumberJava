package Complex.repository;
import Complex.Operation;
import Complex.model.NumarComplex;

public class ExpressionFactory {

    public ComplexExpression createExpression(Operation operation, NumarComplex[] args){
         return new creeazaExpresie(operation,args);
    }
}
