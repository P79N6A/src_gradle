package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ao {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ao f81754a;

    /* renamed from: a  reason: collision with other field name */
    private Context f94a;

    /* renamed from: a  reason: collision with other field name */
    private List<ab> f95a = new ArrayList();

    private ao(Context context) {
        this.f94a = context.getApplicationContext();
        if (this.f94a == null) {
            this.f94a = context;
        }
    }

    public static ao a(Context context) {
        if (f81754a == null) {
            synchronized (ao.class) {
                try {
                    if (f81754a == null) {
                        f81754a = new ao(context);
                    }
                } catch (Throwable th) {
                    Class<ao> cls = ao.class;
                    throw th;
                }
            }
        }
        return f81754a;
    }

    public int a(String str) {
        int i;
        synchronized (this.f95a) {
            ab abVar = new ab();
            abVar.f90a = str;
            if (this.f95a.contains(abVar)) {
                Iterator<ab> it2 = this.f95a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ab next = it2.next();
                    if (next.equals(abVar)) {
                        i = next.f81744a;
                        break;
                    }
                }
            }
            i = 0;
        }
        return i;
    }

    public String a(bd bdVar) {
        String string;
        synchronized (this) {
            string = c.a(this.f94a, "mipush_extra", 0).getString(bdVar.name(), "");
        }
        return string;
    }

    public void a(bd bdVar, String str) {
        synchronized (this) {
            SharedPreferences a2 = c.a(this.f94a, "mipush_extra", 0);
            a2.edit().putString(bdVar.name(), str).commit();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m36a(String str) {
        synchronized (this.f95a) {
            ab abVar = new ab();
            abVar.f81744a = 0;
            abVar.f90a = str;
            if (this.f95a.contains(abVar)) {
                this.f95a.remove(abVar);
            }
            this.f95a.add(abVar);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m37a(String str) {
        boolean z;
        synchronized (this.f95a) {
            ab abVar = new ab();
            abVar.f90a = str;
            z = this.f95a.contains(abVar);
        }
        return z;
    }

    public void b(String str) {
        synchronized (this.f95a) {
            ab abVar = new ab();
            abVar.f90a = str;
            if (this.f95a.contains(abVar)) {
                Iterator<ab> it2 = this.f95a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ab next = it2.next();
                    if (abVar.equals(next)) {
                        abVar = next;
                        break;
                    }
                }
            }
            abVar.f81744a++;
            this.f95a.remove(abVar);
            this.f95a.add(abVar);
        }
    }

    public void c(String str) {
        synchronized (this.f95a) {
            ab abVar = new ab();
            abVar.f90a = str;
            if (this.f95a.contains(abVar)) {
                this.f95a.remove(abVar);
            }
        }
    }
}
