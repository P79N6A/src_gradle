package com.ss.android.pushmanager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.di.push.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30555a;

    @TargetClass
    @Proxy
    static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f30555a, true, 18944, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f30555a, true, 18944, new Class[]{String.class}, String.class);
        }
        return a.a().getApiUrlPrefix() + str2;
    }
}
