package atividadeProxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet {
    private RealInternet realInternet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("www.youtube.com");
        bannedSites.add("www.facebook.com");
        bannedSites.add("www.twitter.com");
    }

    public void connectTo(String serverhost) throws Exception {
        if (bannedSites.contains(serverhost.toLowerCase())) {
            System.out.println("Acesso negado ao site " + serverhost);
        } else {
            realInternet.connectTo(serverhost);
        }
    }
}
