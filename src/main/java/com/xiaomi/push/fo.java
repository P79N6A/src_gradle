package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;

public final class fo {

    /* renamed from: a  reason: collision with root package name */
    private static volatile fo f82068a;

    /* renamed from: a  reason: collision with other field name */
    private int f393a;

    /* renamed from: a  reason: collision with other field name */
    private Context f394a;

    /* renamed from: a  reason: collision with other field name */
    private fs f395a;

    /* renamed from: a  reason: collision with other field name */
    private String f396a;

    /* renamed from: a  reason: collision with other field name */
    private HashMap<fq, fr> f397a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private String f82069b;

    private fo(Context context) {
        this.f394a = context;
        this.f397a.put(fq.SERVICE_ACTION, new fu());
        this.f397a.put(fq.SERVICE_COMPONENT, new fv());
        this.f397a.put(fq.ACTIVITY, new fm());
        this.f397a.put(fq.PROVIDER, new ft());
    }

    public static fo a(Context context) {
        if (f82068a == null) {
            synchronized (fo.class) {
                try {
                    if (f82068a == null) {
                        f82068a = new fo(context);
                    }
                } catch (Throwable th) {
                    Class<fo> cls = fo.class;
                    throw th;
                }
            }
        }
        return f82068a;
    }

    /* access modifiers changed from: private */
    public void a(fq fqVar, Context context, fn fnVar) {
        this.f397a.get(fqVar).a(context, fnVar);
    }

    public final int a() {
        return this.f393a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final fs m306a() {
        return this.f395a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final String m307a() {
        return this.f396a;
    }

    public final void a(int i) {
        this.f393a = i;
    }

    public final void a(Context context, String str, int i, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            fk.a(context, str, 1008, "A receive a incorrect message");
            return;
        }
        a(i);
        aj a2 = aj.a(this.f394a);
        fp fpVar = new fp(this, str, context, str2, str3);
        a2.a((Runnable) fpVar);
    }

    public final void a(fq fqVar, Context context, Intent intent, String str) {
        if (fqVar != null) {
            this.f397a.get(fqVar).a(context, intent, str);
        } else {
            fk.a(context, "null", 1008, "A receive a incorrect message with empty type");
        }
    }

    public final void a(fs fsVar) {
        this.f395a = fsVar;
    }

    public final void a(String str) {
        this.f396a = str;
    }

    public final void a(String str, String str2, int i, fs fsVar) {
        a(str);
        b(str2);
        a(i);
        a(fsVar);
    }

    public final String b() {
        return this.f82069b;
    }

    public final void b(String str) {
        this.f82069b = str;
    }
}
