
package Complex.repository;

import Complex.model.NumarComplex;

public class creeazaExpresie extends ComplexExpression {
    @Override
    NumarComplex executeOneOperation(NumarComplex a, NumarComplex b) {
        NumarComplex c = new NumarComplex().adauga(a,b);
        return c;
    }

}
