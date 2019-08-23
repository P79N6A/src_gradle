package com.ss.android.ugc.aweme.flow.manager.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class MobileFlowMonitor$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47673a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f47674b;

    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f47673a, false, 44501, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f47673a, false, 44501, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            try {
                this.f47674b.f47698b = NetworkUtils.getNetworkType(this.f47674b.f47697a);
                this.f47674b.f47699c++;
            } catch (Exception unused) {
            }
        }
    }
}
