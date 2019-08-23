package com.ss.android.ugc.aweme.video;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76061a = null;

    /* renamed from: e  reason: collision with root package name */
    private static final String f76062e = "f";

    /* renamed from: f  reason: collision with root package name */
    private static f f76063f;

    /* renamed from: b  reason: collision with root package name */
    public int f76064b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public TelephonyManager f76065c;

    /* renamed from: d  reason: collision with root package name */
    public PhoneStateListener f76066d;

    private f(Context context) {
        if (context != null) {
            this.f76065c = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        }
    }

    public static synchronized f a(Context context) {
        Context context2 = context;
        synchronized (f.class) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, f76061a, true, 88919, new Class[]{Context.class}, f.class)) {
                f fVar = (f) PatchProxy.accessDispatch(new Object[]{context2}, null, f76061a, true, 88919, new Class[]{Context.class}, f.class);
                return fVar;
            }
            if (f76063f == null) {
                f76063f = new f(context2);
            }
            f fVar2 = f76063f;
            return fVar2;
        }
    }

    public final int b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f76061a, false, 88920, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, this, f76061a, false, 88920, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        try {
            if (NetworkUtils.getNetworkType(context) == NetworkUtils.h.WIFI) {
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    this.f76064b = connectionInfo.getRssi();
                }
            }
        } catch (Exception unused) {
        }
        return this.f76064b;
    }
}
