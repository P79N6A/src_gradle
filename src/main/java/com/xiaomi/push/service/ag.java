package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ae;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ag {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ag f82491a;

    /* renamed from: a  reason: collision with other field name */
    protected SharedPreferences f925a;

    /* renamed from: a  reason: collision with other field name */
    private HashSet<a> f926a = new HashSet<>();

    public static abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f82492a;

        /* renamed from: a  reason: collision with other field name */
        private String f927a;

        public a(int i, String str) {
            this.f82492a = i;
            this.f927a = str;
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f82492a == ((a) obj).f82492a;
        }

        public int hashCode() {
            return this.f82492a;
        }

        public final void run() {
            a();
        }
    }

    private ag(Context context) {
        this.f925a = c.a(context, "mipush_oc", 0);
    }

    public static ag a(Context context) {
        if (f82491a == null) {
            synchronized (ag.class) {
                try {
                    if (f82491a == null) {
                        f82491a = new ag(context);
                    }
                } catch (Throwable th) {
                    Class<ag> cls = ag.class;
                    throw th;
                }
            }
        }
        return f82491a;
    }

    private String a(int i) {
        return "normal_oc_" + i;
    }

    private void a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        if (pair.second instanceof Integer) {
            editor.putInt(str, ((Integer) pair.second).intValue());
        } else if (pair.second instanceof Long) {
            editor.putLong(str, ((Long) pair.second).longValue());
        } else if (pair.second instanceof String) {
            editor.putString(str, (String) pair.second);
        } else if (pair.second instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) pair.second).booleanValue());
        }
    }

    private String b(int i) {
        return "custom_oc_" + i;
    }

    public int a(int i, int i2) {
        String b2 = b(i);
        if (this.f925a.contains(b2)) {
            return this.f925a.getInt(b2, 0);
        }
        String a2 = a(i);
        return this.f925a.contains(a2) ? this.f925a.getInt(a2, 0) : i2;
    }

    public void a() {
        synchronized (this) {
            this.f926a.clear();
        }
    }

    public void a(a aVar) {
        synchronized (this) {
            if (!this.f926a.contains(aVar)) {
                this.f926a.add(aVar);
            }
        }
    }

    public void a(List<Pair<Integer, Object>> list) {
        if (!ae.a(list)) {
            SharedPreferences.Editor edit = this.f925a.edit();
            for (Pair next : list) {
                if (!(next.first == null || next.second == null)) {
                    a(edit, next, a(((Integer) next.first).intValue()));
                }
            }
            edit.commit();
        }
    }

    public boolean a(int i, boolean z) {
        String b2 = b(i);
        if (this.f925a.contains(b2)) {
            return this.f925a.getBoolean(b2, false);
        }
        String a2 = a(i);
        return this.f925a.contains(a2) ? this.f925a.getBoolean(a2, false) : z;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        b.c("OC_Callback : receive new oc data");
        HashSet hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f926a);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }

    public void b(List<Pair<Integer, Object>> list) {
        if (!ae.a(list)) {
            SharedPreferences.Editor edit = this.f925a.edit();
            for (Pair next : list) {
                if (next.first != null) {
                    String b2 = b(((Integer) next.first).intValue());
                    if (next.second == null) {
                        edit.remove(b2);
                    } else {
                        a(edit, next, b2);
                    }
                }
            }
            edit.commit();
        }
    }
}
