package com.ss.android.common.applog;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.a.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28224a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile y f28225c;

    /* renamed from: b  reason: collision with root package name */
    public Context f28226b;

    private y(Context context) {
        this.f28226b = context.getApplicationContext();
    }

    public static y a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f28224a, true, 15602, new Class[]{Context.class}, y.class)) {
            return (y) PatchProxy.accessDispatch(new Object[]{context2}, null, f28224a, true, 15602, new Class[]{Context.class}, y.class);
        }
        if (f28225c == null) {
            synchronized (y.class) {
                if (f28225c == null) {
                    f28225c = new y(context2);
                }
            }
        }
        return f28225c;
    }

    public final Pair<Long, String> a(d dVar, JSONObject jSONObject) {
        Pair<Long, String> pair;
        boolean z;
        boolean z2;
        long j;
        int i;
        long j2;
        d dVar2 = dVar;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{dVar2, jSONObject2}, this, f28224a, false, 15604, new Class[]{d.class, JSONObject.class}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{dVar2, jSONObject2}, this, f28224a, false, 15604, new Class[]{d.class, JSONObject.class}, Pair.class);
        } else if (dVar2 == null) {
            return null;
        } else {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("magic_tag", "ss_app_log");
                jSONObject3.put("header", jSONObject2);
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("datetime", AppLog.formatDate(dVar2.f28092b));
                jSONObject4.put("local_time_ms", System.currentTimeMillis());
                jSONObject4.put("session_id", dVar2.f28093c);
                jSONObject4.put("bg_session", 1);
                if (PatchProxy.isSupport(new Object[0], dVar, d.f28091a, false, 15714, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], dVar, d.f28091a, false, 15714, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (!TextUtils.isEmpty(dVar2.f28095e)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    jSONObject4.put("from_session", dVar2.f28095e);
                }
                if (PatchProxy.isSupport(new Object[0], dVar, d.f28091a, false, 15715, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], dVar, d.f28091a, false, 15715, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (!TextUtils.isEmpty(dVar2.g)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    jSONObject4.put("to_session", dVar2.g);
                }
                if (PatchProxy.isSupport(new Object[0], dVar, d.f28091a, false, 15720, new Class[0], Long.TYPE)) {
                    j = ((Long) PatchProxy.accessDispatch(new Object[0], dVar, d.f28091a, false, 15720, new Class[0], Long.TYPE)).longValue();
                } else {
                    try {
                        if (PatchProxy.isSupport(new Object[0], dVar, d.f28091a, false, 15719, new Class[0], Long.TYPE)) {
                            try {
                                j2 = ((Long) PatchProxy.accessDispatch(new Object[0], dVar, d.f28091a, false, 15719, new Class[0], Long.TYPE)).longValue();
                            } catch (JSONException unused) {
                                pair = null;
                                return pair;
                            }
                        } else {
                            j2 = Math.max(0, (dVar2.h - dVar2.f28092b) - dVar2.i);
                        }
                        j = Math.max(1, j2 / 1000);
                    } catch (JSONException unused2) {
                        pair = null;
                        return pair;
                    }
                }
                jSONObject4.put("duration", j);
                boolean z3 = dVar2.f28094d;
                boolean z4 = dVar2.f28096f;
                if (!z3 && !z4) {
                    i = 1;
                } else if (z3 && !z4) {
                    i = 2;
                } else if (z3 || !z4) {
                    i = 4;
                } else {
                    i = 3;
                }
                jSONObject4.put("session_type", i);
                jSONObject4.put("is_background", false);
                AppLog.tryPutEventIndex(jSONObject4);
                jSONArray.put(jSONObject4);
                jSONObject3.put("terminate", jSONArray);
                new StringBuilder("save task session to db : ").append(dVar.toString());
                String jSONObject5 = jSONObject3.toString();
                try {
                    return Pair.create(Long.valueOf(h.a(this.f28226b).a(jSONObject5, 0)), jSONObject5);
                } catch (JSONException unused3) {
                    pair = null;
                    return pair;
                }
            } catch (JSONException unused4) {
                pair = null;
                return pair;
            }
        }
    }
}
