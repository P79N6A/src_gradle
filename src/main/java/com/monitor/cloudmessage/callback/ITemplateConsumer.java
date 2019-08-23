package com.monitor.cloudmessage.callback;

import org.json.JSONObject;

public interface ITemplateConsumer extends e {
    String handleTemplateMessage(JSONObject jSONObject);
}
