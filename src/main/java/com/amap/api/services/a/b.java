package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.ServiceSettings;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class b<T, V> extends a<T, V> {
    public Map<String, String> d() {
        return null;
    }

    /* access modifiers changed from: protected */
    public V f() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract String g();

    public Map<String, String> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("User-Agent", "AMAP SDK Android Search 6.1.0");
        hashMap.put("X-INFO", bi.a(this.f6444d));
        hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", new Object[]{"6.1.0", "sea"}));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    public byte[] h() {
        try {
            StringBuffer stringBuffer = new StringBuffer(g());
            stringBuffer.append("&language=");
            stringBuffer.append(ServiceSettings.getInstance().getLanguage());
            String stringBuffer2 = stringBuffer.toString();
            String b2 = b(stringBuffer2);
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(stringBuffer2);
            String a2 = bi.a();
            stringBuffer3.append("&ts=" + a2);
            stringBuffer3.append("&scode=" + bi.a(this.f6444d, a2, b2));
            return stringBuffer3.toString().getBytes("utf-8");
        } catch (Throwable th) {
            j.a(th, "ProtocalHandler", "getEntity");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public String c(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            j.a(e2, "ProtocalHandler", "strEncoderUnsupportedEncodingException");
            return "";
        } catch (Exception e3) {
            j.a(e3, "ProtocalHandler", "strEncoderException");
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public String d(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            j.a(e2, "ProtocalHandler", "strReEncoder");
            return "";
        } catch (Exception e3) {
            j.a(e3, "ProtocalHandler", "strReEncoderException");
            return "";
        }
    }

    public String b(String str) {
        String[] split = str.split("&");
        Arrays.sort(split);
        StringBuffer stringBuffer = new StringBuffer();
        for (String d2 : split) {
            stringBuffer.append(d(d2));
            stringBuffer.append("&");
        }
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2.length() > 1) {
            return (String) stringBuffer2.subSequence(0, stringBuffer2.length() - 1);
        }
        return str;
    }

    public b(Context context, T t) {
        super(context, t);
    }
}
