package com.ss.android.newmedia.redbadge;

import com.meituan.robust.PatchProxy;
import com.ss.android.di.push.a;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f30350a;

    static {
        String str;
        if (PatchProxy.isSupport(new Object[]{"/cloudpush/callback/android_red_badge/"}, null, h.f30351a, true, 18771, new Class[]{String.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{"/cloudpush/callback/android_red_badge/"}, null, h.f30351a, true, 18771, new Class[]{String.class}, String.class);
        } else {
            str = a.a().getApiUrlPrefix() + "/cloudpush/callback/android_red_badge/";
        }
        f30350a = str;
    }
}
