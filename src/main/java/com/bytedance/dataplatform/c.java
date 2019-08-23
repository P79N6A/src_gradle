package com.bytedance.dataplatform;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private Context f19611a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f19612b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f19613c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f19614d;

    /* renamed from: e  reason: collision with root package name */
    private String f19615e;

    /* renamed from: f  reason: collision with root package name */
    private d f19616f;
    private Set<String> g;

    private synchronized void b() {
        this.f19614d = new HashSet();
        Iterator<String> it2 = this.g.iterator();
        while (it2.hasNext()) {
            Context context = this.f19611a;
            for (Object next : com.ss.android.ugc.aweme.q.c.a(context, "SP_CLIENT_EXPOSURE_CACHE$$$" + it2.next(), 0).getAll().values()) {
                if ((next instanceof String) && !TextUtils.isEmpty((String) next)) {
                    this.f19614d.add((String) next);
                }
            }
        }
    }

    private synchronized void a() {
        String str;
        if (!this.f19613c.isEmpty() || !this.f19614d.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            if (!this.f19613c.isEmpty()) {
                Iterator<String> it2 = this.f19613c.iterator();
                sb.append(it2.next());
                while (it2.hasNext()) {
                    sb.append(',');
                    sb.append(it2.next());
                }
            }
            if (!this.f19614d.isEmpty()) {
                if (!this.f19613c.isEmpty()) {
                    sb.append(',');
                }
                Iterator<String> it3 = this.f19614d.iterator();
                sb.append(it3.next());
                while (it3.hasNext()) {
                    sb.append(',');
                    sb.append(it3.next());
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, this.f19615e)) {
            this.f19615e = str;
            if (this.f19616f != null) {
                this.f19616f.a(this.f19615e);
            }
        }
    }

    public final synchronized void a(Map<String, String> map) {
        SharedPreferences.Editor edit = this.f19612b.edit();
        edit.clear().apply();
        for (String next : map.keySet()) {
            edit.putString(next, map.get(next));
        }
        edit.apply();
        this.f19613c.retainAll(map.values());
        com.ss.android.ugc.aweme.q.c.a(this.f19611a, "SP_EXPERIMENT_CACHE", 0).edit().putStringSet("SP_EXPERIMENT_EXPOSURE_CACHE", this.f19613c).apply();
        a();
    }

    c(Context context, d dVar) {
        this.f19611a = context;
        this.f19616f = dVar;
        this.f19613c = new HashSet(com.ss.android.ugc.aweme.q.c.a(context, "SP_EXPERIMENT_CACHE", 0).getStringSet("SP_EXPERIMENT_EXPOSURE_CACHE", new HashSet()));
        this.f19612b = com.ss.android.ugc.aweme.q.c.a(context, "SP_EXPERIMENT_EXPOSURE_CACHE", 0);
        this.g = new HashSet(com.ss.android.ugc.aweme.q.c.a(context, "SP_EXPERIMENT_CACHE", 0).getStringSet("SP_CLIENT_EXPOSURE_CACHE", new HashSet()));
        b();
        a();
    }
}
