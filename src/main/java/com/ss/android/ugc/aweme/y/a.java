package com.ss.android.ugc.aweme.y;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76939a;

    /* renamed from: c  reason: collision with root package name */
    private static a f76940c;

    /* renamed from: b  reason: collision with root package name */
    public boolean f76941b = true;

    private boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f76939a, false, 62685, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76939a, false, 62685, new Class[0], Boolean.TYPE)).booleanValue();
        }
        bm bmVar = (bm) c.a(k.a(), bm.class);
        if (bmVar != null) {
            return bmVar.c();
        }
        return false;
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f76939a, true, 62682, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f76939a, true, 62682, new Class[0], a.class);
        }
        if (f76940c == null) {
            synchronized (a.class) {
                if (f76940c == null) {
                    f76940c = new a();
                }
            }
        }
        return f76940c;
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f76939a, false, 62683, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76939a, false, 62683, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (AbTestManager.a().bj() == 0) {
            return true;
        } else {
            if (AbTestManager.a().bj() == 1) {
                return false;
            }
            return d();
        }
    }

    public final String c() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f76939a, false, 62686, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76939a, false, 62686, new Class[0], String.class);
        }
        int bj = AbTestManager.a().bj();
        if (bj == 0 || bj == 3) {
            i = C0906R.string.ai7;
        } else {
            i = C0906R.string.ai8;
        }
        return k.a().getResources().getString(i);
    }
}
