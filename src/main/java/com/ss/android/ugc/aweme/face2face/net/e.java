package com.ss.android.ugc.aweme.face2face.net;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w.b.a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43968a;

    private static boolean a(@Nullable a aVar) {
        if (aVar == null || aVar.f76550c == a.C0799a.ERROR) {
            return false;
        }
        return true;
    }

    public static boolean a(@Nullable Context context, @Nullable a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context, aVar2}, null, f43968a, true, 39149, new Class[]{Context.class, a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, aVar2}, null, f43968a, true, 39149, new Class[]{Context.class, a.class}, Boolean.TYPE)).booleanValue();
        } else if (!a(aVar)) {
            b(context, aVar);
            return false;
        } else if (aVar2.f76549b != null) {
            return true;
        } else {
            return false;
        }
    }

    private static void b(@Nullable Context context, @Nullable a aVar) {
        Context context2 = context;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, null, f43968a, true, 39150, new Class[]{Context.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar2}, null, f43968a, true, 39150, new Class[]{Context.class, a.class}, Void.TYPE);
            return;
        }
        if (!(context2 == null || aVar2 == null || !(aVar2.f76552e instanceof com.ss.android.ugc.aweme.base.api.a.b.a))) {
            String errorMsg = ((com.ss.android.ugc.aweme.base.api.a.b.a) aVar2.f76552e).getErrorMsg();
            if (!TextUtils.isEmpty(errorMsg)) {
                com.bytedance.ies.dmt.ui.d.a.b(context2, errorMsg).a();
            }
        }
    }
}
