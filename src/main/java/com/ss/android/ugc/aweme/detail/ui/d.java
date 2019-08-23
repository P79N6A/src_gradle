package com.ss.android.ugc.aweme.detail.ui;

import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder;
import com.ss.android.ugc.aweme.feed.c.m;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

public final class d extends VideoViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41369a;
    private i w;

    public final boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f41369a, false, 35056, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f41369a, false, 35056, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (this.w == null) {
            return true;
        } else {
            return this.w.a();
        }
    }

    public d(i iVar, View view, aa<ar> aaVar, View.OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams, m mVar) {
        super(view, aaVar, onTouchListener, fragment, baseFeedPageParams, mVar);
        this.w = iVar;
    }
}
