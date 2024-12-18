package ws;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println("********** convert DH to EURO **************");
         System.out.println(proxy.convertDHtoEURO(200));
         System.out.println("********** get Compte *************");
         Compte compte = proxy.getComte(2);
         System.out.println(compte.getCode());
         System.out.println(compte.getSolde());
         System.out.println(compte.getDate());
        System.out.println("********** List of Compte **************");
        List<Compte> compteList = proxy.listCompte();
        for (Compte c : compteList) {

            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println(c.getDate());
        }
    }
}
