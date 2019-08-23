package com.ss.avframework.livestreamv2.log;

import org.json.JSONObject;

public interface ILogUploader {
    void uploadLog(JSONObject jSONObject);
}
