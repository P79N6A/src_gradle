package com.ss.android.pushmanager.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.f;

public class OpenUrlReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30489a;

    /* renamed from: b  reason: collision with root package name */
    public static a f30490b;

    /* renamed from: c  reason: collision with root package name */
    private static OpenUrlReceiver f30491c;

    private OpenUrlReceiver() {
    }

    public static OpenUrlReceiver a() {
        if (PatchProxy.isSupport(new Object[0], null, f30489a, true, 19015, new Class[0], OpenUrlReceiver.class)) {
            return (OpenUrlReceiver) PatchProxy.accessDispatch(new Object[0], null, f30489a, true, 19015, new Class[0], OpenUrlReceiver.class);
        }
        if (f30491c == null) {
            synchronized (OpenUrlReceiver.class) {
                if (f30491c == null) {
                    f30491c = new OpenUrlReceiver();
                }
            }
        }
        return f30491c;
    }

    public void onReceive(Context context, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context, intent2}, this, f30489a, false, 19018, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent2}, this, f30489a, false, 19018, new Class[]{Context.class, Intent.class}, Void.TYPE);
        } else if (context != null && intent2 != null) {
            Logger.debug();
            if ("com.ss.android.action.openurl".equals(intent.getAction())) {
                String stringExtra = intent2.getStringExtra(f.f34168b);
                Logger.debug();
                if (f30490b != null) {
                    f30490b.a(stringExtra);
                }
            }
        }
    }
}
