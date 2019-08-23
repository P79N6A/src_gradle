package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;

public final class g extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75119a;

    /* renamed from: b  reason: collision with root package name */
    public a f75120b;

    /* renamed from: c  reason: collision with root package name */
    public b f75121c;

    /* renamed from: d  reason: collision with root package name */
    public String f75122d;

    public enum a {
        Video("video"),
        Photo("photo"),
        MV("mv");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String value;

        public static a fromStringValue(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 58845, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 58845, new Class[]{String.class}, a.class);
            }
            for (a aVar : values()) {
                if (aVar.value.equals(str2)) {
                    return aVar;
                }
            }
            return null;
        }

        private a(String str) {
            this.value = str;
        }
    }

    public enum b {
        ShootPage("shoot_page"),
        MidPage("mid_page");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String value;

        public static b fromStringValue(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 58848, new Class[]{String.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 58848, new Class[]{String.class}, b.class);
            }
            for (b bVar : values()) {
                if (bVar.value.equals(str2)) {
                    return bVar;
                }
            }
            return null;
        }

        private b(String str) {
            this.value = str;
        }
    }

    public g() {
        super("choose_filter");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75119a, false, 58842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75119a, false, 58842, new Class[0], Void.TYPE);
            return;
        }
        a("content_type", this.f75120b.value, d.a.f75112a);
        a("enter_from", this.f75121c.value, d.a.f75112a);
        a("filter_name", this.f75122d, d.a.f75112a);
    }
}
