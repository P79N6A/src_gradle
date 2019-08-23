package com.bytedance.android.livesdk.o;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16744a;

    public static boolean a(com.bytedance.android.livesdkapi.j.a aVar) {
        if (!PatchProxy.isSupport(new Object[]{aVar}, null, f16744a, true, 12765, new Class[]{com.bytedance.android.livesdkapi.j.a.class}, Boolean.TYPE)) {
            return aVar.isInstalled();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, null, f16744a, true, 12765, new Class[]{com.bytedance.android.livesdkapi.j.a.class}, Boolean.TYPE)).booleanValue();
    }
}
