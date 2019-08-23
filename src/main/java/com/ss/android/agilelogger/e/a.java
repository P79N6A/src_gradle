package com.ss.android.agilelogger.e;

import android.text.TextUtils;
import com.ss.android.agilelogger.d.c;
import com.ss.android.agilelogger.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<c> f27912a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public volatile Set<String> f27913b = null;

    /* renamed from: com.ss.android.agilelogger.e.a$a  reason: collision with other inner class name */
    public static class C0325a {

        /* renamed from: a  reason: collision with root package name */
        public a f27914a = new a();
    }

    public final void a() {
        if (this.f27912a != null) {
            for (c a2 : this.f27912a) {
                a2.a();
            }
        }
    }

    public final void a(Set<String> set) {
        if (set != null) {
            this.f27913b = Collections.unmodifiableSet(set);
        }
    }

    public final void a(e eVar) {
        if (this.f27912a != null) {
            if (this.f27913b == null || TextUtils.isEmpty(eVar.f27908c) || !this.f27913b.contains(eVar.f27908c)) {
                for (c b2 : this.f27912a) {
                    b2.b(eVar);
                }
            }
        }
    }
}
