package com.ss.android.ugc.aweme.qrcode.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import com.ss.android.ugc.aweme.w.a.a;
import java.io.File;
import java.util.concurrent.Callable;

public class b extends a<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63359a;

    public void a(String str) {
    }

    public boolean a() {
        return false;
    }

    public File b() {
        return null;
    }

    public final void a(final int i, final String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f63359a, false, 70412, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f63359a, false, 70412, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63365a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f63365a, false, 70414, new Class[0], Object.class)) {
                    return QRCodeApi.a(i, str);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f63365a, false, 70414, new Class[0], Object.class);
            }
        }, 0);
    }

    public final void a(final int i, String str, String str2) {
        final String str3 = str;
        final String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, this, f63359a, false, 70411, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, this, f63359a, false, 70411, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        int i2 = i;
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63360a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f63360a, false, 70413, new Class[0], Object.class)) {
                    return QRCodeApi.a(i, str3, str4);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f63360a, false, 70413, new Class[0], Object.class);
            }
        }, 0);
    }
}
