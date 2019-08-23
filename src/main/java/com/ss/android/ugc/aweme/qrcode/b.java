package com.ss.android.ugc.aweme.qrcode;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.qr.EnigmaScanner;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63342a;

    /* renamed from: b  reason: collision with root package name */
    public EnigmaScanner f63343b;

    public interface a {
        void a(int i, String str);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63342a, false, 70349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63342a, false, 70349, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63347a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f63347a, false, 70352, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63347a, false, 70352, new Class[0], Void.TYPE);
                    return;
                }
                if (b.this.f63343b != null) {
                    b.this.f63343b.stop();
                    b.this.f63343b.release();
                    b.this.f63343b.setListener(null);
                    b.this.f63343b = null;
                }
            }
        });
    }
}
