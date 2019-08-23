package com.bytedance.android.livesdk.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class LiveNetworkBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16727a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<Context> f16728b;

    /* renamed from: c  reason: collision with root package name */
    public NetworkUtils.h f16729c = NetworkUtils.h.NONE;

    /* renamed from: d  reason: collision with root package name */
    public List<WeakReference<a>> f16730d = new ArrayList();

    public interface a {
        void a(NetworkUtils.h hVar);
    }

    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f16727a, false, 12535, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f16727a, false, 12535, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        if (!(intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))) {
            NetworkUtils.h hVar = this.f16729c;
            this.f16729c = NetworkUtils.getNetworkType(context);
            if (!(this.f16730d == null || hVar == this.f16729c)) {
                for (WeakReference next : this.f16730d) {
                    if (next != null) {
                        ((a) next.get()).a(this.f16729c);
                    }
                }
            }
        }
    }
}
