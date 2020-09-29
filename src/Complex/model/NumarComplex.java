package Complex.model;

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

    public void DescompuneExpresie(String expresie){
        //2+3*i + 5-6*i + -2+i

        String[] parts = expresie.split(" ");
        for(int i=0;i<parts.length;i++) {
            if(i%2==0){
                //verificam daca este numar complex
               System.out.println(parts[i]);
                System.out.println("\n");
            }
            else{
                // verificam daca este operator
                System.out.println(parts[i]);
                System.out.println("\n");
            }

        }


    }

}
