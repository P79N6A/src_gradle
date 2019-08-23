package com.ss.android.ugc.broker.a;

import com.ss.android.ugc.broker.g;
import java.util.ArrayList;
import java.util.List;

public final class b extends g {

    /* renamed from: c  reason: collision with root package name */
    private List<g> f77182c = new ArrayList();

    public b() {
        this.f77182c.add(new a());
    }

    public final g a(Class cls) {
        if (this.f77188b.get(cls) != null) {
            return this;
        }
        for (g next : this.f77182c) {
            if (next.a(cls) != null) {
                return next;
            }
        }
        return this;
    }

    public final g a(String str) {
        if (this.f77187a.contains(str)) {
            return this;
        }
        for (g next : this.f77182c) {
            if (next.a(str) != null) {
                return next;
            }
        }
        return this;
    }

    public final <T> T a(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? null : null;
    }

    public final <T> List<T> a(Class<T> cls, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            if (this.f77188b.get(cls) != null) {
                return a((List) this.f77188b.get(cls), new Object[0]);
            }
            return null;
        } else if (this.f77188b.get(cls) != null) {
            return a((List) this.f77188b.get(cls), objArr);
        } else {
            return null;
        }
    }
}
