
package Complex.repository;
import Complex.Operation;
import Complex.model.NumarComplex;

public class creeazaExpresie extends ComplexExpression {

    public creeazaExpresie(Operation operation, NumarComplex[] args){
        super(operation,args);
    }
    @Override
    NumarComplex executeOneOperation() {
        NumarComplex c = new NumarComplex().adauga(this.complex_numbers[0],this.complex_numbers[1]);
        return c;
    }

}
