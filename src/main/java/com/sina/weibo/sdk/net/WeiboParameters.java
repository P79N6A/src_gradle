package com.sina.weibo.sdk.net;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.sina.weibo.sdk.utils.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Set;

public class WeiboParameters {
    private String mAppKey;
    private LinkedHashMap<String, Object> mParams = new LinkedHashMap<>();

    public String getAppKey() {
        return this.mAppKey;
    }

    public LinkedHashMap<String, Object> getParams() {
        return this.mParams;
    }

    public Set<String> keySet() {
        return this.mParams.keySet();
    }

    public int size() {
        return this.mParams.size();
    }

    public boolean hasBinaryData() {
        for (String str : this.mParams.keySet()) {
            Object obj = this.mParams.get(str);
            if (!(obj instanceof ByteArrayOutputStream)) {
                if (obj instanceof Bitmap) {
                }
            }
            return true;
        }
        return false;
    }

    public String encodeUrl() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String next : this.mParams.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            Object obj = this.mParams.get(next);
            if (obj instanceof String) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        sb.append(String.valueOf(URLEncoder.encode(next, "UTF-8")) + "=" + URLEncoder.encode(str, "UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                LogUtil.i("encodeUrl", sb.toString());
            }
        }
        return sb.toString();
    }

    public void setParams(LinkedHashMap<String, Object> linkedHashMap) {
        this.mParams = linkedHashMap;
    }

    public boolean containsKey(String str) {
        return this.mParams.containsKey(str);
    }

    public boolean containsValue(String str) {
        return this.mParams.containsValue(str);
    }

    public Object get(String str) {
        return this.mParams.get(str);
    }

    public WeiboParameters(String str) {
        this.mAppKey = str;
    }

    public void remove(String str) {
        if (this.mParams.containsKey(str)) {
            this.mParams.remove(str);
            this.mParams.remove(this.mParams.get(str));
        }
    }

    @Deprecated
    public void add(String str, String str2) {
        this.mParams.put(str, str2);
    }

    public void put(String str, Bitmap bitmap) {
        this.mParams.put(str, bitmap);
    }

    @Deprecated
    public void add(String str, int i) {
        this.mParams.put(str, String.valueOf(i));
    }

    public void put(String str, int i) {
        this.mParams.put(str, String.valueOf(i));
    }

    @Deprecated
    public void add(String str, long j) {
        this.mParams.put(str, String.valueOf(j));
    }

    public void put(String str, long j) {
        this.mParams.put(str, String.valueOf(j));
    }

    @Deprecated
    public void add(String str, Object obj) {
        this.mParams.put(str, obj.toString());
    }

    public void put(String str, Object obj) {
        this.mParams.put(str, obj.toString());
    }

    public void put(String str, String str2) {
        this.mParams.put(str, str2);
    }
}
