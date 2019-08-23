package com.ss.android.ugc.aweme.newfollow.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ScreenBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57399a;

    /* renamed from: b  reason: collision with root package name */
    private a f57400b;

    /* renamed from: c  reason: collision with root package name */
    private Context f57401c;

    public interface a {
        void K_();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57399a, false, 61972, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57399a, false, 61972, new Class[0], Void.TYPE);
            return;
        }
        this.f57401c.unregisterReceiver(this);
        this.f57400b = null;
    }

    public ScreenBroadcastReceiver(Context context) {
        this.f57401c = context;
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f57399a, false, 61971, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f57399a, false, 61971, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f57400b = aVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f57401c.registerReceiver(this, intentFilter);
    }

    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f57399a, false, 61973, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f57399a, false, 61973, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        String action = intent.getAction();
        if (this.f57400b != null && !"android.intent.action.SCREEN_ON".equals(action) && !"android.intent.action.SCREEN_OFF".equals(action) && "android.intent.action.USER_PRESENT".equals(action)) {
            this.f57400b.K_();
        }
    }
}
