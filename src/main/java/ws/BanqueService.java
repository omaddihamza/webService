package src.main.java.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

   @WebMethod(operationName = "convertDHtoEURO")
   public double conversion(@WebParam(name = "montant") double mt){
       return mt*11;
   }

   @WebMethod
   public Compte getComte(@WebParam(name = "code") int code){
       return  new Compte(code, 1000+Math.random()*90000, new Date());
   }


    public List<Compte> listCompte(){
        return List.of(new Compte(1, 1000+Math.random()*90000, new Date()),
                new Compte(2, 1000+Math.random()*90000, new Date()),
                new Compte(3, 1000+Math.random()*90000, new Date()));
    }
}
