package Complex.repository;

import Complex.model.NumarComplex;

public class ExpressionFactory {

    public ComplexExpression createExpression(Operation operation, NumarComplex[] args){
        if(operation is ADDITION){
         return new adauga().execute(args)
        }

    }
}
