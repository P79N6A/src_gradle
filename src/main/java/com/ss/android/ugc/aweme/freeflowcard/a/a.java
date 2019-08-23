package com.ss.android.ugc.aweme.freeflowcard.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.m;
import java.util.ArrayList;
import java.util.List;

public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48548a = null;

    /* renamed from: b  reason: collision with root package name */
    public static volatile String f48549b = "";

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f48550c;

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f48551e;

    /* renamed from: d  reason: collision with root package name */
    private List<c> f48552d;

    public final boolean b() {
        return true;
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f48548a, false, 46139, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48548a, false, 46139, new Class[0], Boolean.TYPE)).booleanValue();
        }
        f48550c = true;
        boolean c2 = c();
        f48550c = false;
        return c2;
    }

    private a() {
        if (PatchProxy.isSupport(new Object[0], this, f48548a, false, 46136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48548a, false, 46136, new Class[0], Void.TYPE);
            return;
        }
        this.f48552d = new ArrayList();
        this.f48552d.add(b.f48554b);
        this.f48552d.add(e.f3321b);
        this.f48552d.add(h.f48574d);
        this.f48552d.add(g.a());
        this.f48552d.add(f.a());
        this.f48552d.add(d.a());
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f48548a, true, 46135, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f48548a, true, 46135, new Class[0], a.class);
        }
        if (f48551e == null) {
            synchronized (a.class) {
                if (f48551e == null) {
                    f48551e = new a();
                }
            }
        }
        return f48551e;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f48548a, false, 46137, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48548a, false, 46137, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!m.a().c()) {
            return true;
        } else {
            for (c next : this.f48552d) {
                if (next.b()) {
                    return next.c();
                }
            }
            return true;
        }
    }

    public final boolean a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f48548a, false, 46138, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f48548a, false, 46138, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = str;
        }
        f48549b = str2;
        boolean c2 = c();
        f48549b = "";
        return c2;
    }
}
