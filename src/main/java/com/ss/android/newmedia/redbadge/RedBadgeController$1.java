package com.ss.android.newmedia.redbadge;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class RedBadgeController$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30267a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f30268b;

    RedBadgeController$1(d dVar) {
        this.f30268b = dVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f30267a, false, 18760, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f30267a, false, 18760, new Class[]{Context.class, Intent.class}, Void.TYPE);
        } else if (context != null && intent != null) {
            try {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && NetworkUtils.isNetworkAvailable(context) && this.f30268b.f30331b) {
                    this.f30268b.f30334e.sendEmptyMessage(0);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
