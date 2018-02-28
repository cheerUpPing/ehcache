import net.sf.ehcache.hibernate.SingletonEhCacheRegionFactory;

import java.util.Properties;

/**
 * 2017/7/18 12:31.
 * <p>
 * Email: cheerUpPing@163.com
 */
public class Test {

    public static void main(String[] args) {
        SingletonEhCacheRegionFactory singletonEhCacheRegionFactory = new SingletonEhCacheRegionFactory(new Properties());
    }
}
