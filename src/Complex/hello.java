package Complex;
import Complex.repository.Repository;
import Complex.service.Service;
import Complex.ui.UIConsole;
public class hello {
    public static void main(String[] args){
        System.out.println("Salut");

        UIConsole ui = new UIConsole();
        Service service= new Service();
        ui.setService(service);
        service.setRepository(new Repository());
        ui.showUI();
    }
}
