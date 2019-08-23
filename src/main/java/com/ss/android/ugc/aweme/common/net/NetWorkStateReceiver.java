package com.ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.livehostimpl.f;
import com.ss.android.ugc.aweme.qrcode.a.a;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.j;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import com.ss.android.ugc.thermometer.annotation.MeasureLapBefore;

public class NetWorkStateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40263a;

    /* renamed from: b  reason: collision with root package name */
    private NetworkUtils.NetworkType f40264b = NetworkUtils.NetworkType.UNKNOWN;

    @MeasureLapBefore
    @MeasureFunction
    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f40263a, false, 33455, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f40263a, false, 33455, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            try {
                m.a().a(((ConnectivityManager) k.a().getSystemService("connectivity")).getActiveNetworkInfo());
                NetworkUtils.NetworkType networkType = m.a().getNetworkType();
                if (networkType != this.f40264b) {
                    if (PatchProxy.isSupport(new Object[0], this, f40263a, false, 33456, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f40263a, false, 33456, new Class[0], Void.TYPE);
                    } else {
                        j.a();
                    }
                }
                this.f40264b = networkType;
                if (!"trill".equals("aweme") && !"musical_ly".equals("aweme")) {
                    ServiceManager.get().getService(IPluginService.class);
                }
                f.f53432a = true;
                bg.a(new a());
            } catch (Exception unused) {
            }
        }
    }
}
