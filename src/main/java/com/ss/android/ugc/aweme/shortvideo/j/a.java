package com.ss.android.ugc.aweme.shortvideo.j;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.au;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68241a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f68242b = new a(0);

    /* renamed from: c  reason: collision with root package name */
    public int f68243c;

    public int hashCode() {
        return this.f68243c;
    }

    public String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f68241a, false, 78444, new Class[0], String.class)) {
            return au.a(this.f68243c);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f68241a, false, 78444, new Class[0], String.class);
    }

    public a(int i) {
        this.f68243c = i;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f68241a, false, 78445, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f68241a, false, 78445, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj != null && getClass() == obj.getClass() && this.f68243c == ((a) obj).f68243c) {
                return true;
            }
            return false;
        }
    }
}
