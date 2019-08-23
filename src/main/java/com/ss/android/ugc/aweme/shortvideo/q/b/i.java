package com.ss.android.ugc.aweme.shortvideo.q.b;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import dmt.av.video.k;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68980a;

    public static boolean a(@NonNull User user) {
        if (!PatchProxy.isSupport(new Object[]{user}, null, f68980a, true, 81142, new Class[]{User.class}, Boolean.TYPE)) {
            return TextUtils.equals(a.x.d(), user.getUid());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f68980a, true, 81142, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
    }

    public static int[] a(cb cbVar) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, null, f68980a, true, 81143, new Class[]{cb.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{cbVar2}, null, f68980a, true, 81143, new Class[]{cb.class}, int[].class);
        }
        int[] a2 = k.a(cbVar);
        if (a2[0] > 0 && a2[1] > 0) {
            return a2;
        }
        return new int[]{cbVar2.mVideoWidth, cbVar2.mVideoHeight};
    }
}
