package memcache;

import net.rubyeye.xmemcached.XMemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

//memcached -d
public class MemcacheExampleRead {
    public static void main(String[] args) {
        implementXMemCachedClient();
    }

    private static void implementXMemCachedClient() {
        try {
            // XMemcached constructor,default weight is 1
            XMemcachedClient xMemCachedclient = new XMemcachedClient("localhost", 11211);

            log("=====> Key: Twitter, Value: " + xMemCachedclient.get("Twitter"));
            log("=====> Key: Crunchify, Value: " + xMemCachedclient.get("Crunchify", 3000));
            log("=====> Key: Odesa, Value: " + xMemCachedclient.get("Odesa", 3000));
            System.out.println(xMemCachedclient.get(List.of("Twitter", "Crunchify", "Odesa")));

            Thread.sleep(15000);

            log("=====> Key: Twitter, Value: " + xMemCachedclient.get("Twitter"));
            log("=====> Key: Crunchify, Value: " + xMemCachedclient.get("Crunchify", 3000));
            log("=====> Key: Odesa, Value: " + xMemCachedclient.get("Odesa", 3000));
            System.out.println(xMemCachedclient.get(List.of("Twitter", "Crunchify", "Odesa")));


        } catch (IOException e) {
            e.printStackTrace();
        } catch (MemcachedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Simple log utility
    private static void log(Object object) {
        System.out.println(object);

    }
}
