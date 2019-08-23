package com.ss.android.ugc.aweme.base.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

public class m implements NetworkUtils.NetworkTypeInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35036a;

    /* renamed from: b  reason: collision with root package name */
    private NetworkInfo f35037b;

    /* renamed from: c  reason: collision with root package name */
    private NetworkUtils.NetworkType f35038c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final m f35039a = new m((byte) 0);
    }

    public static m a() {
        return a.f35039a;
    }

    public NetworkUtils.NetworkType getNetworkType() {
        return this.f35038c;
    }

    private m() {
        this.f35038c = NetworkUtils.NetworkType.NONE;
        try {
            this.f35037b = ((ConnectivityManager) GlobalContext.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
            b(this.f35037b);
            NetworkUtils.setNetworkTypeInterceptor(this);
        } catch (Exception unused) {
        }
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f35036a, false, 25251, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35036a, false, 25251, new Class[0], Boolean.TYPE)).booleanValue();
        }
        synchronized (m.class) {
            if (this.f35037b != null && this.f35037b.isAvailable()) {
                z = true;
            }
        }
        return z;
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f35036a, false, 25250, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35036a, false, 25250, new Class[0], Boolean.TYPE)).booleanValue();
        }
        synchronized (m.class) {
            if (this.f35037b != null && this.f35037b.isAvailable() && 1 == this.f35037b.getType()) {
                z = true;
            }
        }
        return z;
    }

    /* synthetic */ m(byte b2) {
        this();
    }

    public final void a(NetworkInfo networkInfo) {
        if (PatchProxy.isSupport(new Object[]{networkInfo}, this, f35036a, false, 25252, new Class[]{NetworkInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{networkInfo}, this, f35036a, false, 25252, new Class[]{NetworkInfo.class}, Void.TYPE);
            return;
        }
        synchronized (m.class) {
            this.f35037b = networkInfo;
            b(this.f35037b);
        }
    }

    private void b(NetworkInfo networkInfo) {
        if (PatchProxy.isSupport(new Object[]{networkInfo}, this, f35036a, false, 25253, new Class[]{NetworkInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{networkInfo}, this, f35036a, false, 25253, new Class[]{NetworkInfo.class}, Void.TYPE);
        } else if (networkInfo == null || !networkInfo.isAvailable()) {
            this.f35038c = NetworkUtils.NetworkType.NONE;
        } else {
            int type = networkInfo.getType();
            if (1 == type) {
                this.f35038c = NetworkUtils.NetworkType.WIFI;
            } else if (type == 0) {
                switch (((TelephonyManager) GlobalContext.getContext().getSystemService("phone")).getNetworkType()) {
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case SearchNilInfo.HIT_TYPE_SENSITIVE /*?: ONE_ARG  (12 int)*/:
                    case 14:
                    case 15:
                        this.f35038c = NetworkUtils.NetworkType.MOBILE_3G;
                        break;
                    case 13:
                        break;
                }
                this.f35038c = NetworkUtils.NetworkType.MOBILE_4G;
                this.f35038c = NetworkUtils.NetworkType.MOBILE;
            } else {
                this.f35038c = NetworkUtils.NetworkType.MOBILE;
            }
        }
    }
}
