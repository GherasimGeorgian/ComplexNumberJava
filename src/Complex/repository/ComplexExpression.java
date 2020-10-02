package Complex.repository;

import java.util.ArrayList;
import java.util.List;
import Complex.model.NumarComplex;
import Complex.Operation;


public abstract class ComplexExpression {

    Operation operation;
    NumarComplex[] complex_numbers;

    public ComplexExpression(Operation operation, NumarComplex[] args){
        this.operation = operation;
        this.complex_numbers = args;
    }

    abstract NumarComplex executeOneOperation();

    public final NumarComplex execute(){
        return executeOneOperation();
    }
    public final String CreeazaExpresie(){
        return new String(this.operation.toString());
    }

}





