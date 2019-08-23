package com.bytedance.apm.impl;

import com.bytedance.apm.b;
import com.bytedance.services.apm.api.IApmAgent;
import org.json.JSONObject;

public class ApmAgentServiceImpl implements IApmAgent {
    public void monitorLog(String str, JSONObject jSONObject) {
        b.a(str, jSONObject);
    }

    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        b.a(str, jSONObject, jSONObject2);
    }

    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        b.a(str, i, jSONObject);
    }

    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b.a(str, jSONObject, jSONObject2, jSONObject3);
    }

    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        b.a(str, i, jSONObject, jSONObject2);
    }
}
