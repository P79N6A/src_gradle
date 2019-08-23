package com.bytedance.services.apm.api;

import com.bytedance.news.common.service.manager.IService;
import java.util.Map;

public interface IHttpService extends IService {
    b doGet(String str, Map<String, String> map) throws Exception;

    b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception;
}
