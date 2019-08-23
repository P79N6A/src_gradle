package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

public class FullFeedPagerAdapter extends FeedPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44741a;

    public final VideoViewHolder a(View view, aa<ar> aaVar, View.OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        if (PatchProxy.isSupport(new Object[]{view, aaVar, onTouchListener, fragment, baseFeedPageParams}, this, f44741a, false, 40554, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class)) {
            return (VideoViewHolder) PatchProxy.accessDispatch(new Object[]{view, aaVar, onTouchListener, fragment, baseFeedPageParams}, this, f44741a, false, 40554, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class);
        }
        n nVar = new n(view, aaVar, onTouchListener, fragment, baseFeedPageParams, this.j);
        return nVar;
    }

    public FullFeedPagerAdapter(Context context, LayoutInflater layoutInflater, int i, aa<ar> aaVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        super(context, layoutInflater, i, aaVar, fragment, onTouchListener, baseFeedPageParams);
    }

    public final FeedImageViewHolder a(int i, View view, aa<ar> aaVar, String str, View.OnTouchListener onTouchListener, Fragment fragment, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, aaVar, str, onTouchListener, fragment, Integer.valueOf(i2)}, this, f44741a, false, 40555, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class)) {
            return (FeedImageViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, aaVar, str, onTouchListener, fragment, Integer.valueOf(i2)}, this, f44741a, false, 40555, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class);
        }
        m mVar = new m(i, view, aaVar, str, onTouchListener, fragment, i2);
        return mVar;
    }
}
