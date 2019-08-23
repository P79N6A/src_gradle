package com.ss.android.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class NetworkStatusMonitor$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28327a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f f28328b;

    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f28327a, false, 15985, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f28327a, false, 15985, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            try {
                this.f28328b.f28333b = NetworkUtils.getNetworkType(this.f28328b.f28332a);
            } catch (Exception unused) {
            }
        }
    }
}
