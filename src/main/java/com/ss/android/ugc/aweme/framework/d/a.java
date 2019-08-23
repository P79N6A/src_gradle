package com.ss.android.ugc.aweme.framework.d;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48481a;

    /* renamed from: b  reason: collision with root package name */
    public static NetworkUtils.h f48482b;

    public static boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f48481a, true, 45918, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f48481a, true, 45918, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (f48482b == null || f48482b == NetworkUtils.h.NONE) {
            f48482b = NetworkUtils.getNetworkType(context);
        }
        if (f48482b == NetworkUtils.h.WIFI) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f48481a, true, 45919, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f48481a, true, 45919, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        NetworkUtils.h c2 = c(context);
        if (NetworkUtils.h.MOBILE_2G == c2 || NetworkUtils.h.MOBILE_3G == c2 || NetworkUtils.h.MOBILE_4G == c2 || NetworkUtils.h.MOBILE == c2) {
            return true;
        }
        return false;
    }

    private static NetworkUtils.h c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f48481a, true, 45917, new Class[]{Context.class}, NetworkUtils.h.class)) {
            return (NetworkUtils.h) PatchProxy.accessDispatch(new Object[]{context}, null, f48481a, true, 45917, new Class[]{Context.class}, NetworkUtils.h.class);
        } else if (f48482b == null || f48482b == NetworkUtils.h.NONE) {
            return NetworkUtils.getNetworkType(context);
        } else {
            return f48482b;
        }
    }
}
