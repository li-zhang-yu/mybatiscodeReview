package Plugin;

import com.mybatis.plugin.MybatisSqlLoggingInterceptor;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lizhangyu
 * @version 1.0
 * @description
 * @date 2021/5/6 14:39
 */
public class PluginTest {

    private static final Logger log = LoggerFactory.getLogger(PluginTest.class);

    @Test
    public void pluginShouldInterceptGet() {
        String sql = "select * from person where age = 27 and name = \"李四\"";
        MybatisSqlLoggingInterceptor mybatisSqlLoggingInterceptor = new MybatisSqlLoggingInterceptor();
        Object object = mybatisSqlLoggingInterceptor.plugin(sql);
        log.info("输出的结果：{}", object);
    }
}
