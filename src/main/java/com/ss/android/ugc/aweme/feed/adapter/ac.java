package com.ss.android.ugc.aweme.feed.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.feed.f.i;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.ui.masklayer.a;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;

public final /* synthetic */ class ac implements LongPressLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44868a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoViewHolder f44869b;

    /* renamed from: c  reason: collision with root package name */
    private final BaseFeedPageParams f44870c;

    ac(VideoViewHolder videoViewHolder, BaseFeedPageParams baseFeedPageParams) {
        this.f44869b = videoViewHolder;
        this.f44870c = baseFeedPageParams;
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f44868a, false, 40849, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f44868a, false, 40849, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        VideoViewHolder videoViewHolder = this.f44869b;
        BaseFeedPageParams baseFeedPageParams = this.f44870c;
        if (!ex.b() && !TimeLockRuler.isTeenModeON() && a.f46697d.a(videoViewHolder.O())) {
            i iVar = new i(true, baseFeedPageParams.awemeFromPage, f2, f3, videoViewHolder.f44820e.hashCode());
            bg.a(iVar);
        }
    }
}
