package com.ss.android.ugc.aweme.share.seconditem;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.language.e;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class f extends j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65283a;

    private static void a(j jVar, boolean z) {
        boolean z2;
        j jVar2 = jVar;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{jVar2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f65283a, true, 73711, new Class[]{j.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2, Byte.valueOf(z)}, null, f65283a, true, 73711, new Class[]{j.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z || !a.c() || !e.c()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (com.ss.android.ugc.aweme.base.sharedpref.e.h().a("japan_share_download_dot", -1) == 1) {
                z3 = true;
            }
            if (!z3) {
                jVar2.a(true);
            }
        }
    }

    public static View a(Context context, Aweme aweme, View.OnClickListener onClickListener) {
        int i;
        Context context2 = context;
        View.OnClickListener onClickListener2 = onClickListener;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, aweme, onClickListener2}, null, f65283a, true, 73710, new Class[]{Context.class, Aweme.class, View.OnClickListener.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, aweme, onClickListener2}, null, f65283a, true, 73710, new Class[]{Context.class, Aweme.class, View.OnClickListener.class}, View.class);
        }
        if (AbTestManager.a().cn() == 0) {
            i = C0906R.string.c1g;
        } else {
            i = C0906R.string.f2;
        }
        j a2 = a(context2, i, 2130839607, onClickListener2);
        if (!a.a() ? aweme.getVideoControl() == null || aweme.getVideoControl().preventDownloadType == 1 ? aweme.isPreventDownload() || aweme.getDownloadStatus() != 0 : aweme.getVideoControl().preventDownloadType != 0 : aweme.isPreventDownload() || aweme.getDownloadStatus() != 0) {
            z = true;
        }
        a(a2, z);
        if (z) {
            a2.setIconAlpha(0.5f);
        }
        return a2;
    }
}
