package com.huawei.android.pushagent.plugin.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a.a.f;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f25120a;

    /* renamed from: b  reason: collision with root package name */
    private Context f25121b;

    /* renamed from: c  reason: collision with root package name */
    private String f25122c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f25123d;

    public a(Context context, String str) {
        this.f25120a = "";
        this.f25122c = "";
        this.f25123d = new HashMap();
        this.f25120a = "PushPluginInfo";
        this.f25121b = context;
        this.f25122c = str;
        f();
    }

    private int a(String str, int i) {
        Object a2 = a(str, (Object) Integer.valueOf(i));
        return a2 instanceof Integer ? ((Integer) a2).intValue() : a2 instanceof Long ? (int) ((Long) a2).longValue() : i;
    }

    private long a(String str, long j) {
        Object a2 = a(str, (Object) Long.valueOf(j));
        return a2 instanceof Integer ? (long) ((Integer) a2).intValue() : a2 instanceof Long ? ((Long) a2).longValue() : j;
    }

    private Object a(String str, Object obj) {
        Object obj2 = this.f25123d.get(str);
        return obj2 == null ? obj : obj2;
    }

    private String a(String str, String str2) {
        return String.valueOf(a(str, (Object) str2));
    }

    public static HashMap a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String valueOf = String.valueOf(keys.next());
                hashMap.put(valueOf, jSONObject.get(valueOf));
            }
        } catch (JSONException e2) {
            e.d("PushLogSC2815", "parse json error, err message:" + e2.getMessage());
        }
        return hashMap;
    }

    private void b(String str, Object obj) {
        String str2;
        StringBuilder sb;
        String message;
        this.f25123d.put(str, obj);
        try {
            new h(this.f25121b, this.f25120a).a(this.f25122c, new JSONObject(this.f25123d).toString());
        } catch (NullPointerException e2) {
            str2 = "PushLogSC2815";
            sb = new StringBuilder("encode json from map NullPointerException, err message:");
            message = e2.getMessage();
            sb.append(message);
            e.d(str2, sb.toString());
        } catch (Exception e3) {
            str2 = "PushLogSC2815";
            sb = new StringBuilder("encode json from map error, err message:");
            message = e3.getMessage();
            sb.append(message);
            e.d(str2, sb.toString());
        }
    }

    private void c(String str) {
        String str2;
        StringBuilder sb;
        String message;
        this.f25123d.remove(str);
        if (!this.f25123d.isEmpty()) {
            try {
                new h(this.f25121b, this.f25120a).a(this.f25122c, new JSONObject(this.f25123d).toString());
            } catch (NullPointerException e2) {
                str2 = "PushLogSC2815";
                sb = new StringBuilder("remove value, encode json from map NullPointerException, err message:");
                message = e2.getMessage();
                sb.append(message);
                e.d(str2, sb.toString());
            } catch (Exception e3) {
                str2 = "PushLogSC2815";
                sb = new StringBuilder("remove value, encode json from map error, err message:");
                message = e3.getMessage();
                sb.append(message);
                e.d(str2, sb.toString());
            }
        }
    }

    private void f() {
        String b2 = new h(this.f25121b, this.f25120a).b(this.f25122c);
        if (!TextUtils.isEmpty(b2)) {
            this.f25123d = a(b2);
        }
    }

    public String a() {
        return f.b(this.f25121b, a("salt_v2", ""));
    }

    public void a(int i) {
        b("belongId", Integer.valueOf(i));
    }

    public void a(Long l) {
        b("delayTime", l);
    }

    public long b() {
        return a("delayTime", 0);
    }

    public void b(Long l) {
        b("minUp", l);
    }

    public void b(String str) {
        b("salt_v2", f.a(this.f25121b, str));
    }

    public int c() {
        return a("belongId", -1);
    }

    public void c(Long l) {
        b("maxUp", l);
    }

    public void d() {
        c("salt_v2");
    }

    public void e() {
        c("delayTime");
    }
}
