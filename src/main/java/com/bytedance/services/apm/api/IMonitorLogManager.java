package com.bytedance.services.apm.api;

import com.bytedance.news.common.service.manager.IService;

public interface IMonitorLogManager extends IService {
    void deleteLegacyLogByIds(String str, String str2);

    void getLegacyLog(long j, long j2, String str, f fVar);
}
