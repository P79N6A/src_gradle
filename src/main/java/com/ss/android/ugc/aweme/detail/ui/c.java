package com.ss.android.ugc.aweme.detail.ui;

import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.adapter.FeedImageViewHolder;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class c extends FeedImageViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41368a;
    private i m;

    public final boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f41368a, false, 35055, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f41368a, false, 35055, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (this.m == null) {
            return true;
        } else {
            return this.m.a();
        }
    }

    public c(i iVar, int i, View view, aa<ar> aaVar, String str, View.OnTouchListener onTouchListener, Fragment fragment, int i2) {
        super(i, view, aaVar, str, onTouchListener, fragment, i2);
        this.m = iVar;
    }
}
