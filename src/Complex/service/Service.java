package Complex.service;
import Complex.model.NumarComplex;
import Complex.repository.adauga;
import Complex.repository.Repository;
import Complex.repository.ComplexExpression;

import java.util.ArrayList;
import java.util.List;

public class Service{
    private Repository repository;


    public void setRepository(Repository repo) {
        this.repository = repo;
    }
   // public boolean checkExpresion(String expresion){

   //     NumarComplex c= new NumarComplex();
    //    boolean result = c.DescompuneExpresie(expresion);

   //     ComplexExpression cx = new adauga();
   //     NumarComplex d = cx.execute(new NumarComplex(2,3),new NumarComplex(1,2));
  //      System.out.println("Partea reala:" + d.getReal() + " " + "partea imaginara:" + d.getImag());

   //     return result;
   // }

    public boolean checkExpresion(String expresion){

        //2 + 3*i + 5 - 6*i + -2 + i
        boolean ok=true;
        String[] parts = expresion.split(" ");
        for(int i=0;i<parts.length;i++) {
            // verificam daca p.imag
            if (parts[i].indexOf('i') != -1) {
                if(i+1 < parts.length) {
                    if ((parts[i+1].indexOf('+') == -1) && (parts[i+1].indexOf('-') == -1) && (parts[i+1].indexOf('*') == -1)&& (parts[i+1].indexOf('/') == -1)) {
                        ok = false;
                    }
                    double imag;
                    if(parts[i].contains("i")){
                        imag = 1.0;
                    }
                    else if(parts[i].contains("-i")){
                        imag = -1.0;
                    }
                    else{
                        System.out.println(parts[i]);
                        imag = Double.parseDouble(parts[i].replace("*i",""));
                    }
                    repository.add(new NumarComplex(0.0,imag));
                    i += 1;
                }
                else{
                    double imag;
                    if(parts[i].contains("i")){
                        imag = 1.0;
                    }
                    else if(parts[i].contains("-i")){
                        imag = -1.0;
                    }
                    else{
                        System.out.println(parts[i]);
                        imag = Double.parseDouble(parts[i].replace("*i",""));
                    }
                    repository.add(new NumarComplex(0.0,imag));
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
                    double imag;
                    if(parts[i+2].contains("i")){
                        imag = 1.0;
                    }
                    else if(parts[i+2].contains("-i")){
                        imag = -1.0;
                    }
                    else{
                        System.out.println(parts[i+2]);
                        imag = Double.parseDouble(parts[i+2].replace("*i",""));
                    }
                    repository.add(new NumarComplex(Double.valueOf(parts[i]),imag));
                    i += 3;
                }
                else{
                    double imag;
                    if(parts[i+2].contains("i")){
                        imag = 1.0;
                    }
                    else if(parts[i+2].contains("-i")){
                        imag = -1.0;
                    }
                    else{
                        System.out.println(parts[i+2]);
                        imag = Double.parseDouble(parts[i+2].replace("*i",""));
                    }
                    repository.add(new NumarComplex(Double.valueOf(parts[i]),imag));
                    i += 3;
                }
            }
        }
        System.out.println("Dimensiune: " + repository.getAll().size());
        return ok;

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

    public void Calculeaza(String expresie){

    }



}
