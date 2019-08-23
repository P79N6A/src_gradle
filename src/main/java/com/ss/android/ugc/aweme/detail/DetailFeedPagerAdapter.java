package com.ss.android.ugc.aweme.detail;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.ui.c;
import com.ss.android.ugc.aweme.detail.ui.d;
import com.ss.android.ugc.aweme.detail.ui.i;
import com.ss.android.ugc.aweme.feed.adapter.FeedImageViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

public class DetailFeedPagerAdapter extends FeedPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41089a;

    /* renamed from: b  reason: collision with root package name */
    protected i f41090b;

    public VideoViewHolder a(View view, aa<ar> aaVar, View.OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        if (PatchProxy.isSupport(new Object[]{view, aaVar, onTouchListener, fragment, baseFeedPageParams}, this, f41089a, false, 34641, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class)) {
            return (VideoViewHolder) PatchProxy.accessDispatch(new Object[]{view, aaVar, onTouchListener, fragment, baseFeedPageParams}, this, f41089a, false, 34641, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class);
        }
        d dVar = new d(this.f41090b, view, aaVar, onTouchListener, fragment, baseFeedPageParams, this.j);
        return dVar;
    }

    public FeedImageViewHolder a(int i, View view, aa<ar> aaVar, String str, View.OnTouchListener onTouchListener, Fragment fragment, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, aaVar, str, onTouchListener, fragment, Integer.valueOf(i2)}, this, f41089a, false, 34642, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class)) {
            return (FeedImageViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, aaVar, str, onTouchListener, fragment, Integer.valueOf(i2)}, this, f41089a, false, 34642, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class);
        }
        c cVar = new c(this.f41090b, i, view, aaVar, str, onTouchListener, fragment, i2);
        return cVar;
    }

    public DetailFeedPagerAdapter(i iVar, Context context, LayoutInflater layoutInflater, int i, aa<ar> aaVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        super(context, layoutInflater, i, aaVar, fragment, onTouchListener, baseFeedPageParams);
        this.f41090b = iVar;
    }
}
