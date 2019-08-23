package com.bytedance.services.apm.api;

import com.bytedance.news.common.service.manager.IService;

public interface IActivityLifeManager extends IService {
    boolean isForeground();

    void register(c cVar);

    void unregister(c cVar);
}
