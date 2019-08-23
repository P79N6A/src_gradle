package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import java.util.Map;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private static volatile q f82451a;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public Context f884a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f885a = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with other field name */
    private Map<String, Map<String, String>> f886a = new HashMap();

    private q(Context context) {
        this.f884a = context;
    }

    public static q a(Context context) {
        if (f82451a == null) {
            synchronized (q.class) {
                try {
                    if (f82451a == null) {
                        f82451a = new q(context);
                    }
                } catch (Throwable th) {
                    Class<q> cls = q.class;
                    throw th;
                }
            }
        }
        return f82451a;
    }

    private String a(String str, String str2) {
        String str3;
        synchronized (this) {
            if (this.f886a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Map map = this.f886a.get(str);
                    if (map != null) {
                        str3 = (String) map.get(str2);
                    }
                } catch (Throwable unused) {
                }
            }
            str3 = "";
        }
        return str3;
    }

    private void b(String str, String str2, String str3) {
        synchronized (this) {
            if (this.f886a == null) {
                this.f886a = new HashMap();
            }
            Map map = this.f886a.get(str);
            if (map == null) {
                map = new HashMap();
            }
            map.put(str2, str3);
            this.f886a.put(str, map);
        }
    }

    public String a(String str, String str2, String str3) {
        String a2;
        synchronized (this) {
            a2 = a(str, str2);
            if (TextUtils.isEmpty(a2)) {
                a2 = c.a(this.f884a, str, 4).getString(str2, str3);
            }
        }
        return a2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m572a(String str, String str2, String str3) {
        synchronized (this) {
            b(str, str2, str3);
            this.f885a.post(new r(this, str, str2, str3));
        }
    }
}
