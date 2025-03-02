package cn.wqz.middleware.dynamic.thread.pool.sdk.config;

import cn.wqz.middleware.dynamic.thread.pool.sdk.domain.DynamicThreadPoolService;
import com.alibaba.fastjson.JSON;
import jodd.util.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/2/28 下午9:30
 * GitHub: https://github.com/buptwqz
 * Description: 动态配置入口
 **/
@Configuration
public class DynamicThreadPoolAutoConfig {
    private final Logger logger = LoggerFactory.getLogger(DynamicThreadPoolAutoConfig.class);

    @Bean("dynamicThreadPoolService")
    public DynamicThreadPoolService dynamicThreadPoolService(ApplicationContext applicationContext, Map<String, ThreadPoolExecutor> threadPoolExecutorMap) {
        String applicationName = applicationContext.getEnvironment().getProperty("spring.application.name");

        if(StringUtils.isBlank(applicationName)) {
            applicationName = "缺省的";
            logger.warn("动态线程池，启动提示。Springboot 应用未配置 spring.application.name 无法获取应用名称");
        }


        logger.info("线程池信息:{}", JSON.toJSONString(threadPoolExecutorMap.keySet()));
        return new DynamicThreadPoolService(applicationName, threadPoolExecutorMap);
    }
}
