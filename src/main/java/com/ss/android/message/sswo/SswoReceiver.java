package com.ss.android.message.sswo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.setting.b;

public class SswoReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30052a;

    public void onReceive(Context context, Intent intent) {
        final Context context2 = context;
        final Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2}, this, f30052a, false, 18121, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2}, this, f30052a, false, 18121, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        ThreadPlus.submitRunnable(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f30053a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f30053a, false, 18123, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f30053a, false, 18123, new Class[0], Void.TYPE);
                    return;
                }
                SswoReceiver sswoReceiver = SswoReceiver.this;
                Intent intent = intent2;
                Context context = context2;
                if (PatchProxy.isSupport(new Object[]{intent, context}, sswoReceiver, SswoReceiver.f30052a, false, 18122, new Class[]{Intent.class, Context.class}, Void.TYPE)) {
                    Object[] objArr = {intent, context};
                    SswoReceiver sswoReceiver2 = sswoReceiver;
                    PatchProxy.accessDispatch(objArr, sswoReceiver2, SswoReceiver.f30052a, false, 18122, new Class[]{Intent.class, Context.class}, Void.TYPE);
                    return;
                }
                try {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        a a2 = a.a(context);
                        if (PatchProxy.isSupport(new Object[0], a2, a.f30057a, false, 18118, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], a2, a.f30057a, false, 18118, new Class[0], Void.TYPE);
                        } else if (!b.a().o()) {
                            a2.b();
                        } else {
                            Context context2 = a2.f30059b;
                            if (PatchProxy.isSupport(new Object[]{context2}, null, SswoActivity.f30050a, true, 18104, new Class[]{Context.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{context2}, null, SswoActivity.f30050a, true, 18104, new Class[]{Context.class}, Void.TYPE);
                            } else if (context2 != null) {
                                try {
                                    Intent intent2 = new Intent(context2, SswoActivity.class);
                                    intent2.addFlags(268435456);
                                    context2.startActivity(intent2);
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    } else if ("android.intent.action.USER_PRESENT".equals(action) || "android.intent.action.SCREEN_ON".equals(action)) {
                        a.a(context).b();
                    }
                } catch (Throwable unused2) {
                }
            }
        });
    }
}
