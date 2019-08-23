package com.ss.android.sdk.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.ss.android.account.b.a;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f30689b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final c[] f30690a = c.j;

    /* renamed from: c  reason: collision with root package name */
    private final c[] f30691c = c.i;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30692d;

    public static b a() {
        return f30689b;
    }

    private b() {
    }

    public final boolean b() {
        b(com.ss.android.ugc.aweme.b.f34450b);
        for (c cVar : this.f30690a) {
            if (cVar.o) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        b(com.ss.android.ugc.aweme.b.f34450b);
        for (c cVar : this.f30691c) {
            if (cVar.o && !TextUtils.isEmpty(cVar.l) && cVar.l.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public final void a(@Nullable Context context) {
        if (context != null) {
            JSONObject jSONObject = new JSONObject();
            for (c cVar : this.f30690a) {
                if (cVar.u > 0) {
                    try {
                        jSONObject.put(cVar.l, cVar.u);
                    } catch (JSONException unused) {
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (c cVar2 : this.f30690a) {
                if (cVar2.o) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(cVar2.l);
                    z = false;
                }
            }
            String sb2 = sb.toString();
            SharedPreferences.Editor edit = c.a(context, "com.ss.spipe_setting", 0).edit();
            edit.putString("expire_platforms", jSONObject.toString());
            edit.putString("bind_platforms", sb2);
            SharedPrefsEditorCompat.apply(edit);
        }
    }

    private void b(@Nullable Context context) {
        JSONObject jSONObject;
        if (!this.f30692d && context != null) {
            this.f30692d = true;
            SharedPreferences a2 = c.a(context, "com.ss.spipe_setting", 0);
            try {
                HashMap hashMap = new HashMap();
                String string = a2.getString("expire_platforms", null);
                String string2 = a2.getString("bind_platforms", "");
                if (TextUtils.isEmpty(string)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(string);
                }
                for (c cVar : this.f30690a) {
                    if (!jSONObject.isNull(cVar.l)) {
                        cVar.u = jSONObject.optLong(cVar.l, -1);
                    }
                }
                hashMap.clear();
                if (!TextUtils.isEmpty(string2)) {
                    String[] split = string2.split(",");
                    if (split != null && split.length > 0) {
                        for (String str : split) {
                            hashMap.put(str, str);
                        }
                        for (c cVar2 : this.f30690a) {
                            if (hashMap.containsKey(cVar2.l)) {
                                cVar2.o = true;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(@NonNull com.ss.android.account.b bVar, @NonNull Context context) {
        for (c cVar : this.f30691c) {
            cVar.o = false;
            a aVar = null;
            if (bVar != null && cVar != null) {
                if (cVar.m != null && cVar.m.length != 0) {
                    String[] strArr = cVar.m;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        a aVar2 = bVar.b().get(strArr[i]);
                        if (aVar2 != null) {
                            aVar = aVar2;
                            break;
                        }
                        i++;
                    }
                } else {
                    aVar = bVar.b().get(cVar.l);
                }
            }
            if (aVar != null) {
                cVar.o = true;
                cVar.s = aVar.i;
                cVar.t = aVar.j;
                cVar.p = aVar.f2419e;
                cVar.q = aVar.f2420f;
                cVar.r = aVar.g;
                cVar.u = -1;
            }
        }
        a(context);
    }
}
