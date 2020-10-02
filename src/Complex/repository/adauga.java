package Complex.repository;

import Complex.model.NumarComplex;
import Complex.Operation;

public class adauga extends ComplexExpression {

    public adauga(Operation operation, NumarComplex[] args){
        super(operation,args);
    }

    @Override
    NumarComplex executeOneOperation() {
        NumarComplex c = new NumarComplex().adauga(this.complex_numbers[0],this.complex_numbers[1]);
        return c;
    }

}
