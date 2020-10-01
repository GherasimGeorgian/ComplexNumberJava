package Complex.repository;

import Complex.model.NumarComplex;

public class sterge extends ComplexExpression {
    @Override
    NumarComplex executeOneOperation(NumarComplex a,NumarComplex b) {
        NumarComplex c = new NumarComplex().sterge(a,b);
        return c;
    }

}
