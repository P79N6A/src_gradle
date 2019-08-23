package com.ss.android.ugc.aweme.feed.adapter;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.c.m;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.main.a;

public final class n extends VideoViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44956a;

    public final void a(boolean z) {
        boolean z2;
        n nVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44956a, false, 40556, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44956a, false, 40556, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(O(), "homepage_follow") || !MainPageExperimentHelper.b()) {
            nVar = this;
            z2 = z;
        } else {
            z2 = a.a().f54287c;
            nVar = this;
        }
        super.a(z2);
    }

    public final void a(View view, boolean z) {
        boolean z2;
        n nVar;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f44956a, false, 40557, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z)}, this, f44956a, false, 40557, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(O(), "homepage_follow") || !MainPageExperimentHelper.b()) {
            nVar = this;
            z2 = z;
        } else {
            z2 = a.a().f54287c;
            nVar = this;
        }
        super.a(view2, z2);
    }

    public n(View view, aa<ar> aaVar, View.OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams, m mVar) {
        super(view, aaVar, onTouchListener, fragment, baseFeedPageParams, mVar);
    }
}
