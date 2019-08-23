package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.push.aj;
import com.xiaomi.push.dh;
import com.xiaomi.push.service.ag;
import com.xiaomi.push.service.be;

public class cv {

    /* renamed from: a  reason: collision with root package name */
    private static volatile cv f81914a;

    /* renamed from: a  reason: collision with other field name */
    private Context f242a;

    /* renamed from: a  reason: collision with other field name */
    private aj.a f243a = new cw(this);

    /* renamed from: a  reason: collision with other field name */
    private dk f244a;

    /* renamed from: a  reason: collision with other field name */
    private dl f245a;

    /* renamed from: a  reason: collision with other field name */
    private final String f246a = "push_stat_sp";

    /* renamed from: b  reason: collision with root package name */
    private aj.a f81915b = new cx(this);

    /* renamed from: b  reason: collision with other field name */
    private final String f247b = "upload_time";

    /* renamed from: c  reason: collision with root package name */
    private aj.a f81916c = new cy(this);

    /* renamed from: c  reason: collision with other field name */
    private final String f248c = "delete_time";

    /* renamed from: d  reason: collision with root package name */
    private final String f81917d = "check_time";

    /* renamed from: e  reason: collision with root package name */
    private String f81918e;

    /* renamed from: f  reason: collision with root package name */
    private String f81919f;

    private cv(Context context) {
        this.f242a = context;
    }

    public static cv a(Context context) {
        if (f81914a == null) {
            synchronized (cv.class) {
                try {
                    if (f81914a == null) {
                        f81914a = new cv(context);
                    }
                } catch (Throwable th) {
                    Class<cv> cls = cv.class;
                    throw th;
                }
            }
        }
        return f81914a;
    }

    private boolean a() {
        return ag.a(this.f242a).a(ip.StatDataSwitch.a(), true);
    }

    /* access modifiers changed from: private */
    public void b(String str) {
        SharedPreferences.Editor edit = c.a(this.f242a, "push_stat_sp", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        s.a(edit);
    }

    private String c() {
        return this.f242a.getDatabasePath(cz.f250a).getAbsolutePath();
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m171a() {
        return this.f81918e;
    }

    public void a(dh.a aVar) {
        dh.a(this.f242a).a(aVar);
    }

    public void a(io ioVar) {
        if (a() && be.a(ioVar.e())) {
            a((dh.a) de.a(this.f242a, c(), ioVar));
        }
    }

    public void a(String str) {
        if (a() && !TextUtils.isEmpty(str)) {
            a(dm.a(this.f242a, str));
        }
    }

    public void a(String str, String str2, Boolean bool) {
        if (this.f244a == null) {
            return;
        }
        if (bool.booleanValue()) {
            this.f244a.a(this.f242a, str2, str);
        } else {
            this.f244a.b(this.f242a, str2, str);
        }
    }

    public String b() {
        return this.f81919f;
    }
}
