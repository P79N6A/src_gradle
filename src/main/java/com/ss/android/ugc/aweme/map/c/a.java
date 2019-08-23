package com.ss.android.ugc.aweme.map.c;

import com.amap.api.maps2d.CoordinateConverter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55065a;

    public static boolean a(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f55065a, true, 58415, new Class[]{Double.TYPE, Double.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, null, f55065a, true, 58415, new Class[]{Double.TYPE, Double.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!CoordinateConverter.isAMapDataAvailable(d2, d3)) {
            return true;
        } else {
            return false;
        }
    }
}
