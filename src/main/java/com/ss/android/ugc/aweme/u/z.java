package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;

@Deprecated
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75168a;

    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75169a;

        public final void a() {
        }

        public final a h() {
            if (PatchProxy.isSupport(new Object[0], this, f75169a, false, 58890, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], this, f75169a, false, 58890, new Class[0], a.class);
            }
            super.f();
            return this;
        }

        public a(String str) {
            super(str);
        }

        public final a a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f75169a, false, 58889, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f75169a, false, 58889, new Class[]{String.class, String.class}, a.class);
            }
            a(str, str2, d.a.f75112a);
            return this;
        }
    }

    public static a a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f75168a, true, 58887, new Class[]{String.class}, a.class)) {
            return new a(str2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{str2}, null, f75168a, true, 58887, new Class[]{String.class}, a.class);
    }
}
