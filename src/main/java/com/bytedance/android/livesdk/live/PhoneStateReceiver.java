package com.bytedance.android.livesdk.live;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PhoneStateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15779a;

    /* renamed from: b  reason: collision with root package name */
    private a f15780b;

    public interface a {
        void a(String str);
    }

    public PhoneStateReceiver(a aVar) {
        this.f15780b = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context, intent2}, this, f15779a, false, 10287, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent2}, this, f15779a, false, 10287, new Class[]{Context.class, Intent.class}, Void.TYPE);
        } else if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
            this.f15780b.a(intent2.getStringExtra("state"));
        }
    }
}
