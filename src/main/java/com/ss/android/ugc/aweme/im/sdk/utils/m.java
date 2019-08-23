package com.ss.android.ugc.aweme.im.sdk.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52603a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f52603a, true, 53395, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f52603a, true, 53395, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (b() || c()) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f52603a, true, 53396, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f52603a, true, 53396, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return TextUtils.equals("douyin", "musically");
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f52603a, true, 53397, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f52603a, true, 53397, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return TextUtils.equals("douyin", "tiktok");
    }
}
