package com.ss.ttvideoengine.utils;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.net.URL;
import org.json.JSONObject;

public class DataLoaderCDNLog {
    public long contentLength;
    public String fileKey;
    public String host;
    public long reqEndT;
    public long reqStartT;
    public String serverIp;
    public String url;
    public String xCache;
    public String xMCache;

    public DataLoaderCDNLog(JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            try {
                this.url = jSONObject.optString(PushConstants.WEB_URL);
                this.host = new URL(this.url).getHost();
                this.serverIp = jSONObject.optString("server_ip");
                this.xCache = jSONObject.optString("x_cache");
                this.xMCache = jSONObject.optString("x_m_cache");
                this.fileKey = jSONObject.optString("f_key");
                this.contentLength = jSONObject.optLong("contentLength", -1);
                this.reqStartT = jSONObject.optLong("req_start_t", -1);
                this.reqEndT = jSONObject.optLong("req_end_t", -1);
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new Exception("log null");
        }
    }
}
