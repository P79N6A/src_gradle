package com.huawei.android.pushagent.plugin.a;

import android.content.Context;
import com.huawei.android.pushagent.plugin.c.a.a;
import com.huawei.android.pushagent.plugin.c.a.b;
import com.huawei.android.pushagent.utils.a.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f25129a = new JSONObject();

    public c(String str, int i, String str2, String str3, String str4, String str5) {
        try {
            e.a("PushLogSC2815", "cmd is:" + i);
            this.f25129a.put("token", str);
            this.f25129a.put("cmd", i);
            this.f25129a.put("saltHash", str2);
            this.f25129a.put(PushConstants.CONTENT, str3);
            this.f25129a.put("appVersion", str4);
            this.f25129a.put("pkgName", str5);
        } catch (JSONException e2) {
            e.b("PushLogSC2815", "init ReportReq error:" + e2.getMessage());
        }
    }

    public String a() {
        return this.f25129a.optString("token", "");
    }

    public String a(Context context) {
        Exception exc;
        String str;
        StringBuilder sb;
        String str2;
        byte[] a2 = b.a(new a(context, e()).a().toCharArray());
        if (a2.length == 0) {
            return "";
        }
        try {
            String a3 = a.a(a2).a(d());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("token=");
            stringBuffer.append(a());
            stringBuffer.append("&cmd");
            stringBuffer.append("=");
            stringBuffer.append(b());
            stringBuffer.append("&saltHash");
            stringBuffer.append("=");
            stringBuffer.append(c());
            stringBuffer.append("&mode");
            stringBuffer.append("=0");
            stringBuffer.append("&appVersion");
            stringBuffer.append("=");
            stringBuffer.append(f());
            stringBuffer.append("&content");
            stringBuffer.append("=");
            stringBuffer.append(a3);
            return stringBuffer.toString();
        } catch (InvalidKeyException e2) {
            str2 = "PushLogSC2815";
            sb = new StringBuilder("encrypt request content InvalidKeyException:");
            str = e2.getMessage();
            exc = e2;
            sb.append(str);
            e.c(str2, sb.toString(), exc);
            return "";
        } catch (NoSuchAlgorithmException e3) {
            str2 = "PushLogSC2815";
            sb = new StringBuilder("encrypt request content NoSuchAlgorithmException:");
            str = e3.getMessage();
            exc = e3;
            sb.append(str);
            e.c(str2, sb.toString(), exc);
            return "";
        } catch (NoSuchPaddingException e4) {
            str2 = "PushLogSC2815";
            sb = new StringBuilder("encrypt request content NoSuchPaddingException:");
            str = e4.getMessage();
            exc = e4;
            sb.append(str);
            e.c(str2, sb.toString(), exc);
            return "";
        } catch (IllegalBlockSizeException e5) {
            str2 = "PushLogSC2815";
            sb = new StringBuilder("encrypt request content IllegalBlockSizeException:");
            str = e5.getMessage();
            exc = e5;
            sb.append(str);
            e.c(str2, sb.toString(), exc);
            return "";
        } catch (BadPaddingException e6) {
            str2 = "PushLogSC2815";
            sb = new StringBuilder("encrypt request content BadPaddingException:");
            str = e6.getMessage();
            exc = e6;
            sb.append(str);
            e.c(str2, sb.toString(), exc);
            return "";
        } catch (UnsupportedEncodingException e7) {
            str2 = "PushLogSC2815";
            sb = new StringBuilder("encrypt request content UnsupportedEncodingException:");
            str = e7.getMessage();
            exc = e7;
            sb.append(str);
            e.c(str2, sb.toString(), exc);
            return "";
        } catch (InvalidAlgorithmParameterException e8) {
            str2 = "PushLogSC2815";
            sb = new StringBuilder("encrypt request content InvalidAlgorithmParameterException:");
            str = e8.getMessage();
            exc = e8;
            sb.append(str);
            e.c(str2, sb.toString(), exc);
            return "";
        } catch (Exception e9) {
            str2 = "PushLogSC2815";
            sb = new StringBuilder("encrypt request content Exception:");
            str = e9.getMessage();
            exc = e9;
            sb.append(str);
            e.c(str2, sb.toString(), exc);
            return "";
        }
    }

    public int b() {
        return this.f25129a.optInt("cmd", -1);
    }

    public String c() {
        return this.f25129a.optString("saltHash", "");
    }

    public String d() {
        return this.f25129a.optString(PushConstants.CONTENT, "");
    }

    public String e() {
        return this.f25129a.optString("pkgName", "");
    }

    public String f() {
        return this.f25129a.optString("appVersion", "");
    }
}
