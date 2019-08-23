package com.ss.android.ugc.aweme.im.service.session;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public abstract class a {
    public static ChangeQuickRedirect g;
    public String h;
    public Object i;
    public String j;
    public String k;
    public long l;
    public int m;
    public int n;
    public int o;
    public long p;
    public String q;
    public HashMap<String, String> r;
    public boolean s;
    public boolean t;
    public IAction u = a();

    public abstract String O_();

    public int P_() {
        return 0;
    }

    public abstract IAction a();

    public abstract int b();

    public abstract void d();

    public void g() {
    }

    public a() {
        d();
    }

    public final boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 54436, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 54436, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (b() == 0 || b() == 20) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(long j2) {
        if (j2 < 10000000000L) {
            this.l = j2 * 1000;
        } else {
            this.l = j2;
        }
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, g, false, 54437, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, g, false, 54437, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (obj2 instanceof a) {
            if (TextUtils.equals(this.h, ((a) obj2).h)) {
                return true;
            }
        }
        return false;
    }
}
