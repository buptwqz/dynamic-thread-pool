package cn.wqz.middleware.dynamic.thread.pool.sdk.domain;

import cn.wqz.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * Author: Qizheng Wang
 * Email:  879680229@qq.com
 * Date:   2025/3/2 上午11:45
 * GitHub: https://github.com/buptwqz
 * Description: 动态线程池服务
 **/
public interface IDynamicThreadPoolService {
    List<ThreadPoolConfigEntity> queryThreadPoolList();

    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);
}
