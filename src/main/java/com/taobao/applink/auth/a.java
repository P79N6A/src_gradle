package com.taobao.applink.auth;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Messenger;
import com.taobao.applink.util.TBAppLinkUtil;

public class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static ServiceConnection f79148a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f79149b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f79150c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public TBAppLinkAuthListener f79151d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Messenger f79152e;

    public a(TBAppLinkAuthListener tBAppLinkAuthListener) {
        if (tBAppLinkAuthListener != null) {
            this.f79151d = tBAppLinkAuthListener;
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        try {
            if (f79148a != null && f79149b) {
                f79149b = false;
                TBAppLinkUtil.getApplication().getApplicationContext().unbindService(f79148a);
            }
        } catch (Throwable unused) {
        }
    }

    private void c() {
        this.f79150c = new Handler(new b(this));
        this.f79152e = new Messenger(this.f79150c);
        f79148a = new c(this);
    }

    public void a(String str) {
        if (TBAppLinkUtil.getApplication() != null) {
            b();
            c();
            Intent intent = new Intent();
            intent.setAction(TBAppLinkUtil.getServerAction(str));
            intent.setPackage(TBAppLinkUtil.getPackageName(str));
            try {
                TBAppLinkUtil.getApplication().getApplicationContext().bindService(intent, f79148a, 1);
                f79149b = true;
            } catch (Throwable unused) {
            }
        }
    }
}
