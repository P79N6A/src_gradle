package com.ta.utdid2.a;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ta.utdid2.b.a.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    /* access modifiers changed from: private */
    public static final String TAG = "com.ta.utdid2.a.b";

    /* renamed from: a  reason: collision with root package name */
    private static b f78833a;

    /* renamed from: a  reason: collision with other field name */
    private Object f35a = new Object();
    private Context mContext;

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        com.ut.device.a f78834a;

        /* renamed from: a  reason: collision with other field name */
        String f36a = "";

        /* renamed from: a  reason: collision with other field name */
        HttpPost f37a;

        /* renamed from: b  reason: collision with other field name */
        String f38b;

        /* renamed from: c  reason: collision with root package name */
        String f78836c;

        /* renamed from: d  reason: collision with root package name */
        String f78837d = "";

        public String b() {
            return this.f36a;
        }

        public void run() {
            HttpResponse httpResponse;
            if (this.f78834a != null) {
                this.f78834a.a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, this.f38b);
            }
            BufferedReader bufferedReader = null;
            try {
                httpResponse = new DefaultHttpClient().execute(this.f37a);
            } catch (Exception unused) {
                if (this.f78834a != null) {
                    this.f78834a.a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, this.f38b);
                }
                httpResponse = null;
            }
            if (httpResponse != null) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(), Charset.forName("UTF-8")));
                } catch (Exception unused2) {
                    if (this.f78834a != null) {
                        this.f78834a.a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, this.f38b);
                    }
                }
            }
            if (bufferedReader != null) {
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        this.f36a = readLine;
                    } catch (Exception unused3) {
                        if (this.f78834a != null) {
                            this.f78834a.a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, this.f38b);
                        }
                    }
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused4) {
                }
            }
            if (this.f78834a == null) {
                synchronized (b.a(b.this)) {
                    b.a(b.this).notifyAll();
                }
                return;
            }
            String b2 = b.a(this.f36a, this.f38b);
            this.f78834a.a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, b2);
            c.a(b.a(b.this), this.f78836c, b2, this.f78837d);
        }

        public a(HttpPost httpPost) {
            this.f37a = httpPost;
        }

        public a(HttpPost httpPost, com.ut.device.a aVar, String str, String str2, String str3) {
            this.f37a = httpPost;
            this.f78834a = aVar;
            this.f38b = str;
            this.f78836c = str2;
            this.f78837d = str3;
        }
    }

    public b(Context context) {
        this.mContext = context;
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f78833a == null) {
                f78833a = new b(context);
            }
            bVar = f78833a;
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2.has("action") && jSONObject2.has("aid")) {
                        String string = jSONObject2.getString("action");
                        if (string.equalsIgnoreCase("new") || string.equalsIgnoreCase("changed")) {
                            return jSONObject2.getString("aid");
                        }
                    }
                } else if (jSONObject.has("isError") && jSONObject.has("status")) {
                    String string2 = jSONObject.getString("isError");
                    String string3 = jSONObject.getString("status");
                    if (string2.equalsIgnoreCase("true") && (string3.equalsIgnoreCase("404") || string3.equalsIgnoreCase("401"))) {
                        return "";
                    }
                }
            } catch (Exception | JSONException unused) {
            }
        }
        return str2;
    }

    private static String b(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        try {
            str3 = URLEncoder.encode(str3, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        sb.append("http://hydra.alibaba.com/");
        sb.append(str);
        sb.append("/get_aid/?");
        sb.append("auth[token]=");
        sb.append(str2);
        sb.append("&type=utdid");
        sb.append("&id=");
        sb.append(str3);
        sb.append("&aid=");
        sb.append(str4);
        return sb.toString();
    }

    public String a(String str, String str2, String str3, String str4) {
        int i;
        String b2 = b(str, str2, str3, str4);
        if (f.b(this.mContext)) {
            i = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
        } else {
            i = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
        a aVar = new a(new HttpPost(b2));
        aVar.start();
        try {
            synchronized (this.f35a) {
                this.f35a.wait((long) i);
            }
        } catch (Exception unused) {
        }
        return a(aVar.b(), str4);
    }

    public void a(String str, String str2, String str3, String str4, com.ut.device.a aVar) {
        a aVar2 = new a(new HttpPost(b(str, str2, str3, str4)), aVar, str4, str, str2);
        aVar2.start();
    }
}
