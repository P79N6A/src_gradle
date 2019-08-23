package com.huawei.android.pushagent.utils.a;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class c {

    /* renamed from: b  reason: collision with root package name */
    public String f25164b = "";

    /* renamed from: c  reason: collision with root package name */
    public HashMap f25165c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public Context f25166d = null;

    public c(Context context, String str) {
        this.f25164b = str;
        this.f25166d = context;
    }

    public static HashMap c(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String valueOf = String.valueOf(keys.next());
                hashMap.put(valueOf, jSONObject.get(valueOf));
            }
        } catch (Exception e2) {
            e.c("PushLogSC2815", e2.toString(), e2);
        }
        return hashMap;
    }

    public int a(String str, int i) {
        Object b2 = b(str, Integer.valueOf(i));
        return b2 instanceof Integer ? ((Integer) b2).intValue() : b2 instanceof Long ? (int) ((Long) b2).longValue() : i;
    }

    public long a(String str, long j) {
        Object b2 = b(str, Long.valueOf(j));
        return b2 instanceof Integer ? (long) ((Integer) b2).intValue() : b2 instanceof Long ? ((Long) b2).longValue() : j;
    }

    public String a(String str, String str2) {
        return String.valueOf(b(str, str2));
    }

    public boolean a(String str, Object obj) {
        this.f25165c.put(str, obj);
        new h(this.f25166d, this.f25164b).a(str, obj);
        return true;
    }

    public HashMap af() {
        HashMap hashMap = new HashMap();
        Map b2 = new h(this.f25166d, this.f25164b).b();
        if (b2 != null) {
            for (Map.Entry entry : b2.entrySet()) {
                if (entry != null) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (hashMap.size() != 0) {
            this.f25165c = hashMap;
        }
        return hashMap;
    }

    public boolean ag() {
        new h(this.f25166d, this.f25164b).a((Map) this.f25165c);
        return true;
    }

    public Object b(String str) {
        return this.f25165c.get(str);
    }

    public Object b(String str, Object obj) {
        Object b2 = b(str);
        return b2 == null ? obj : b2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry entry : this.f25165c.entrySet()) {
            stringBuffer.append((String) entry.getKey());
            stringBuffer.append(":");
            stringBuffer.append(entry.getValue());
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }
}
