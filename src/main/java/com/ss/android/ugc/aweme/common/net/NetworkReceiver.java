package com.ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.framework.d.a;
import org.greenrobot.eventbus.c;

public class NetworkReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40265a;

    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f40265a, false, 33457, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f40265a, false, 33457, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        NetworkUtils.h networkType = NetworkUtils.getNetworkType(context);
        if (a.f48482b != null) {
            a.f48482b = networkType;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (!NetworkUtils.isNetworkAvailable(context)) {
                c.a().d(new a(a.f40266a));
            } else if (NetworkUtils.isWifi(context)) {
                c.a().d(new a(a.f40268c));
            } else if (NetworkUtils.isMobile(context)) {
                c.a().d(new a(a.f40267b));
            }
        }
    }
}
