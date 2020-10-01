package Complex.repository;

import java.util.ArrayList;
import java.util.List;
import Complex.model.NumarComplex;

enum Operation{
    ADDITION,
    SUBSTRACTION,
    MULTIPLICATION,
    DIVISION
}

public abstract class ComplexExpression {
    Operation operation;
    final List<NumarComplex> complex_numbers = new ArrayList<NumarComplex>();

    abstract NumarComplex executeOneOperation(NumarComplex a, NumarComplex b);

    public final NumarComplex execute(NumarComplex a,NumarComplex b){
        return executeOneOperation(a,b);
    }

}





