package com.ss.android.ugc.aweme.qrcode;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63457a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f63458b;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static e f63459a = new e((byte) 0);
    }

    private e() {
    }

    public static e a() {
        return a.f63459a;
    }

    public final Boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f63457a, false, 70375, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f63457a, false, 70375, new Class[0], Boolean.class);
        }
        if (this.f63458b == null) {
            this.f63458b = Boolean.valueOf(b.b().b(i.a().getContext(), "enable_home_scan_qrcode", !com.ss.android.g.a.a()));
        }
        return this.f63458b;
    }

    /* synthetic */ e(byte b2) {
        this();
    }
}
