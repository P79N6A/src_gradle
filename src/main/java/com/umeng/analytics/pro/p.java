package com.umeng.analytics.pro;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class p implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private Map<String, k> f80683b = new HashMap();

    public Map<String, k> a() {
        return this.f80683b;
    }

    public void b() {
        this.f80683b.clear();
    }

    public void a(Map<String, k> map) {
        this.f80683b = map;
    }

    private void b(k kVar) {
        this.f80683b.put(kVar.c(), this.f80683b.get(kVar.c()).a(kVar));
    }

    private void c(String str) {
        this.f80683b.put(str, this.f80683b.get(str).a());
    }

    private void b(String str) {
        k kVar = new k(str, System.currentTimeMillis(), 1);
        this.f80683b.put(str, kVar);
    }

    public void a(k kVar) {
        if (a(kVar.c())) {
            b(kVar);
        } else {
            this.f80683b.put(kVar.c(), kVar);
        }
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (Map.Entry<String, k> key : this.f80683b.entrySet()) {
            if (((String) key.getKey()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void a(f fVar, String str) {
        if (this.f80683b.containsKey(str)) {
            c(str);
        } else {
            b(str);
        }
        fVar.a(this, false);
    }
}
