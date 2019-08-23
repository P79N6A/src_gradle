package com.ss.android.common.applog.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.ab;
import com.ss.android.common.applog.y;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28091a;

    /* renamed from: b  reason: collision with root package name */
    public long f28092b;

    /* renamed from: c  reason: collision with root package name */
    public String f28093c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28094d;

    /* renamed from: e  reason: collision with root package name */
    public String f28095e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f28096f;
    public String g;
    public long h;
    public long i;
    public long j;

    public d() {
    }

    public String toString() {
        if (!PatchProxy.isSupport(new Object[0], this, f28091a, false, 15721, new Class[0], String.class)) {
            return a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f28091a, false, 15721, new Class[0], String.class);
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f28091a, false, 15717, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f28091a, false, 15717, new Class[0], String.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_time", this.f28092b);
            jSONObject.put("session_id", this.f28093c);
            jSONObject.put("is_front_continuous", this.f28094d);
            jSONObject.put("front_session_id", this.f28095e);
            jSONObject.put("is_end_continuous", this.f28096f);
            jSONObject.put("end_session_id", this.g);
            jSONObject.put("latest_end_time", this.h);
            jSONObject.put("non_task_time", this.i);
            jSONObject.put("tea_event_index", this.j);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public d(long j2) {
        String str;
        long j3;
        this.f28092b = j2;
        if (PatchProxy.isSupport(new Object[0], null, y.f28224a, true, 15605, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], null, y.f28224a, true, 15605, new Class[0], String.class);
        } else {
            str = AppLog.genSession();
        }
        this.f28093c = str;
        if (PatchProxy.isSupport(new Object[0], null, y.f28224a, true, 15606, new Class[0], Long.TYPE)) {
            j3 = ((Long) PatchProxy.accessDispatch(new Object[0], null, y.f28224a, true, 15606, new Class[0], Long.TYPE)).longValue();
        } else {
            j3 = AppLog.genEventIndex();
        }
        this.j = j3;
    }

    public static d a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f28091a, true, 15718, new Class[]{String.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str2}, null, f28091a, true, 15718, new Class[]{String.class}, d.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString("session_id", "");
                d dVar = new d();
                dVar.f28093c = optString;
                dVar.f28092b = ab.a(jSONObject, "start_time");
                dVar.f28094d = jSONObject.optBoolean("is_front_continuous", false);
                dVar.f28095e = jSONObject.optString("front_session_id", "");
                dVar.f28096f = jSONObject.optBoolean("is_end_continuous", false);
                dVar.g = jSONObject.optString("end_session_id", "");
                dVar.h = ab.a(jSONObject, "latest_end_time");
                dVar.i = ab.a(jSONObject, "non_task_time");
                dVar.j = ab.a(jSONObject, "tea_event_index");
                return dVar;
            } catch (JSONException unused) {
                return null;
            }
        }
    }
}
