package com.ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.i;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;

public final /* synthetic */ class d implements LongPressLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44899a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedImageViewHolder f44900b;

    /* renamed from: c  reason: collision with root package name */
    private final int f44901c;

    d(FeedImageViewHolder feedImageViewHolder, int i) {
        this.f44900b = feedImageViewHolder;
        this.f44901c = i;
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f44899a, false, 40398, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f44899a, false, 40398, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        FeedImageViewHolder feedImageViewHolder = this.f44900b;
        int i = this.f44901c;
        if (!ex.b() && (TextUtils.equals(feedImageViewHolder.f44689c, "homepage_hot") || (MainPageExperimentHelper.n() && TextUtils.equals(feedImageViewHolder.f44689c, "homepage_follow")))) {
            bg.a(new i(true, i, feedImageViewHolder.b().hashCode()));
        }
    }
}
