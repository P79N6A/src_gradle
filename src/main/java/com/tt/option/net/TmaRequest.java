package com.tt.option.net;

import android.text.TextUtils;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class TmaRequest {
    private long connectTimeOut = 10000;
    private Map<String, String> header;
    private String method;
    private Map<String, MultiPart> multiPartMap;
    private boolean needCompressParams;
    private Map<String, Object> postParams;
    private long readTimeOut = 10000;
    private String url;
    private long writeTimeOut = 10000;

    public class MultiPart {
        private File file;
        private String mimeType;

        public File getFile() {
            return this.file;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public void setFile(File file2) {
            this.file = file2;
        }

        public void setMimeType(String str) {
            this.mimeType = str;
        }

        public MultiPart(File file2, String str) {
            this.file = file2;
            this.mimeType = str;
        }
    }

    public long getConnectTimeOut() {
        return this.connectTimeOut;
    }

    public Map<String, String> getHeaders() {
        return this.header;
    }

    public String getMethod() {
        return this.method;
    }

    public Map<String, MultiPart> getMultiPartMap() {
        return this.multiPartMap;
    }

    public Map<String, Object> getPostParams() {
        return this.postParams;
    }

    public long getReadTimeOut() {
        return this.readTimeOut;
    }

    public String getUrl() {
        return this.url;
    }

    public long getWriteTimeOut() {
        return this.writeTimeOut;
    }

    public boolean isNeedCompressParams() {
        return this.needCompressParams;
    }

    public String getPostParamsJsonStr() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : this.postParams.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        } catch (JSONException e2) {
            AppBrandLogger.stacktrace(5, "TmaRequest", e2.getStackTrace());
        }
        return jSONObject.toString();
    }

    public void setConnectTimeOut(long j) {
        this.connectTimeOut = j;
    }

    public void setNeedCompressParams(boolean z) {
        this.needCompressParams = z;
    }

    public void setReadTimeOut(long j) {
        this.readTimeOut = j;
    }

    public void setWriteTimeOut(long j) {
        this.writeTimeOut = j;
    }

    @AnyProcess
    private String getUrlWithCommonParams(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?device_id=");
            sb.append(NetRequestUtil.getDeviceId());
        } else {
            sb.append("&device_id=");
            sb.append(NetRequestUtil.getDeviceId());
        }
        return sb.toString();
    }

    public void addHeader(String str, String str2) {
        this.header.put(str, str2);
    }

    public void addMultiPart(String str, MultiPart multiPart) {
        this.multiPartMap.put(str, multiPart);
    }

    public void addPostParam(String str, Object obj) {
        this.postParams.put(str, obj);
    }

    public TmaRequest(String str, String str2) {
        this.url = str;
        this.header = new HashMap();
        this.postParams = new HashMap();
        this.multiPartMap = new HashMap();
        this.method = str2;
        if (TextUtils.equals(str2, "GET")) {
            this.url = getUrlWithCommonParams(this.url);
        } else {
            this.postParams.put("device_id", NetRequestUtil.getDeviceId());
        }
    }

    public void addMultiPart(String str, File file, String str2) {
        this.multiPartMap.put(str, new MultiPart(file, str2));
    }
}
