package Complex.model;

import java.util.NavigableMap;

public class NumarComplex {
    private double real,imag;
    public NumarComplex(){
        real=0;
        imag=0;
    }
    public NumarComplex(double r,double i){
        this.real = r;
        this.imag= i;
    }
    public NumarComplex adauga(NumarComplex a, NumarComplex b){
        return new NumarComplex(a.real + b.real,a.imag+b.imag);
    }
    public NumarComplex sterge(NumarComplex a, NumarComplex b){
        return new NumarComplex(a.real - b.real,a.imag - b.imag);
    }
    public NumarComplex inmultire(NumarComplex a, NumarComplex b){

        double _real = a.real*b.real - a.imag*b.imag;
        double _imaginary = a.real*b.imag + a.imag*b.real;
        return new NumarComplex(_real,_imaginary);
    }
    public NumarComplex imparte(NumarComplex a, NumarComplex b){

        NumarComplex output = inmultire(a,b.conjugatul());
        double div = Math.pow(b.mod(),2);
        return new NumarComplex(output.real/div,output.imag/div);
    }
    public double mod()
    {
        return Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imag,2));
    }
    public NumarComplex conjugatul()
    {
        return new NumarComplex(this.real,-this.imag);
    }

    public double getReal(){
        return real;
    }
    public double getImag(){
        return imag;
    }


    public static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            return false;
        }
        catch(NullPointerException e){
            return false;
        }
        return true;
    }

    public boolean DescompuneExpresie(String expresie){
        //2 + 3*i + 5 - 6*i + -2 + i
        boolean ok=true;
        String[] parts = expresie.split(" ");
        for(int i=0;i<parts.length;i++) {


                // verificam daca p.imag
                if (parts[i].indexOf('i') != -1) {
                    if(i+1 < parts.length) {
                        if ((parts[i+1].indexOf('+') == -1) && (parts[i+1].indexOf('-') == -1) && (parts[i+1].indexOf('*') == -1)&& (parts[i+1].indexOf('/') == -1)) {
                            ok = false;
                        }
                        System.out.println(parts[i]);

                        i += 1;
                    }
                    else{
                        System.out.println(parts[i]);
                        i += 1;
                    }

                }
                // daca argumentul este intreg inseamna ca vom avea ca argument+1 +/- iar arg+2 partea imaginara
                else if (isInteger(parts[i])) {
                    // verificam daca este operator
                    if(i+3 < parts.length) {
                        if ((parts[i+3].indexOf('+') == -1) && (parts[i+3].indexOf('-') == -1) && (parts[i+1].indexOf('*') == -1)&& (parts[i+1].indexOf('/') == -1)) {
                            ok = false;
                        }
                        System.out.println(parts[i]);
                        System.out.println(parts[i+1]);
                        System.out.println(parts[i+2]);
                        i += 3;
                    }
                    else{
                        System.out.println(parts[i]);
                        System.out.println(parts[i+1]);
                        System.out.println(parts[i+2]);
                        i += 3;
                    }
                }
            }
        return ok;
        }


    }

