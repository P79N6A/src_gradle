package com.ss.android.ugc.aweme.base.utils;

import android.content.res.Resources;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.StringRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35041a;

    public static Resources a() {
        if (PatchProxy.isSupport(new Object[0], null, f35041a, true, 25264, new Class[0], Resources.class)) {
            return (Resources) PatchProxy.accessDispatch(new Object[0], null, f35041a, true, 25264, new Class[0], Resources.class);
        }
        return GlobalContext.getContext().getResources();
    }

    @ColorInt
    public static int a(@ColorRes int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f35041a, true, 25256, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return a().getColor(i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f35041a, true, 25256, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public static String b(@StringRes int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f35041a, true, 25257, new Class[]{Integer.TYPE}, String.class)) {
            return a().getString(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f35041a, true, 25257, new Class[]{Integer.TYPE}, String.class);
    }
}
