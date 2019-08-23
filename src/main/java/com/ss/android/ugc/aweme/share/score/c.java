package com.ss.android.ugc.aweme.share.score;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65267a;

    public static boolean a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f65267a, true, 73669, new Class[]{Context.class}, Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.q.c.a(context2, "douyin_praise_sp", 0).getBoolean("douyin_has_clicked_porf", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f65267a, true, 73669, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }
}
