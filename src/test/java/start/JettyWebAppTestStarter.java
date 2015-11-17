package start;

import com.oneplus.web.test.WebAppTestServer;
import com.oneplus.web.test.lunch.JettyWebAppTestServer;

/**
 * 功能描述：jetty测试启动器
 *
 * @author: Zhenbin.Li
 * email： lizhenbin@oneplus.cn
 * company：一加科技
 * Date: 15/8/24 Time: 16:15
 */
public class JettyWebAppTestStarter {

    public static void main(String[] args) {
        WebAppTestServer server = new JettyWebAppTestServer();
        server.start();
    }
}
