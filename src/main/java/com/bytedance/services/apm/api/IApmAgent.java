package com.bytedance.services.apm.api;

import com.bytedance.news.common.service.manager.IService;
import org.json.JSONObject;

public interface IApmAgent extends IService {
    @Deprecated
    void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorLog(String str, JSONObject jSONObject);

    @Deprecated
    void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2);

    @Deprecated
    void monitorStatusRate(String str, int i, JSONObject jSONObject);
}
