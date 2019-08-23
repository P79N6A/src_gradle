package com.ss.android.ugc.aweme.story.base.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.api.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71943a;

    /* renamed from: b  reason: collision with root package name */
    f f71944b;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f71945a = new b((byte) 0);
    }

    public static b a() {
        return a.f71945a;
    }

    private b() {
        this.f71944b = (f) ServiceManager.get().getService(f.class);
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f71943a, false, 82279, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71943a, false, 82279, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f71944b == null || this.f71944b.a() == null) {
            return false;
        } else {
            return this.f71944b.a().f71845a;
        }
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f71943a, false, 82280, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71943a, false, 82280, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f71944b == null || this.f71944b.a() == null) {
            return 0;
        } else {
            return this.f71944b.a().f71846b;
        }
    }

    public final int d() {
        if (PatchProxy.isSupport(new Object[0], this, f71943a, false, 82281, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71943a, false, 82281, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f71944b == null || this.f71944b.a() == null) {
            return 0;
        } else {
            return this.f71944b.a().f71847c;
        }
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f71943a, false, 82282, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71943a, false, 82282, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f71944b == null || this.f71944b.a() == null) {
            return 0;
        } else {
            return this.f71944b.a().f71848d;
        }
    }

    /* synthetic */ b(byte b2) {
        this();
    }
}
