package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.DetailFeedPagerAdapter;
import com.ss.android.ugc.aweme.detail.ui.c;
import com.ss.android.ugc.aweme.detail.ui.d;
import com.ss.android.ugc.aweme.detail.ui.i;
import com.ss.android.ugc.aweme.feed.adapter.FeedImageViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

public class DiscoverDetailFeedPagerAdapter extends DetailFeedPagerAdapter {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f41590c;

    /* renamed from: d  reason: collision with root package name */
    public String f41591d;

    /* renamed from: e  reason: collision with root package name */
    public String f41592e;

    /* renamed from: f  reason: collision with root package name */
    public String f41593f;
    private VerticalViewPager q;
    private int r = ((int) UIUtils.dip2Px(k.a(), 47.0f));

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41590c, false, 35556, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41590c, false, 35556, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r = i;
        if (this.q != null) {
            for (int i2 = 0; i2 < this.q.getChildCount(); i2++) {
                View childAt = this.q.getChildAt(i2);
                if (!(childAt == null || childAt.getTag(C0906R.id.acv) == null)) {
                    Object tag = childAt.getTag(C0906R.id.acv);
                    if (tag instanceof d) {
                        ((d) tag).e(this.r);
                    } else if (tag instanceof c) {
                        ((c) tag).e(this.r);
                    }
                }
            }
            if (this.m != null) {
                for (int i3 = 0; i3 < this.m[0].size(); i3++) {
                    View view = (View) this.m[0].get(i3);
                    if (!(view == null || view.getTag(C0906R.id.acv) == null)) {
                        Object tag2 = view.getTag(C0906R.id.acv);
                        if (tag2 instanceof d) {
                            ((d) tag2).e(this.r);
                        } else if (tag2 instanceof c) {
                            ((c) tag2).e(this.r);
                        }
                    }
                }
            }
        }
    }

    public final VideoViewHolder a(View view, aa<ar> aaVar, View.OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        if (PatchProxy.isSupport(new Object[]{view, aaVar, onTouchListener, fragment, baseFeedPageParams}, this, f41590c, false, 35557, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class)) {
            return (VideoViewHolder) PatchProxy.accessDispatch(new Object[]{view, aaVar, onTouchListener, fragment, baseFeedPageParams}, this, f41590c, false, 35557, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class);
        }
        d dVar = new d(this.f41090b, view, aaVar, onTouchListener, fragment, baseFeedPageParams, this.j);
        dVar.v = true;
        dVar.a(this.f41591d, this.f41592e, this.f41593f);
        dVar.e(this.r);
        return dVar;
    }

    public final FeedImageViewHolder a(int i, View view, aa<ar> aaVar, String str, View.OnTouchListener onTouchListener, Fragment fragment, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, aaVar, str, onTouchListener, fragment, Integer.valueOf(i2)}, this, f41590c, false, 35558, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class)) {
            return (FeedImageViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, aaVar, str, onTouchListener, fragment, Integer.valueOf(i2)}, this, f41590c, false, 35558, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class);
        }
        c cVar = new c(this.f41090b, i, view, aaVar, str, onTouchListener, fragment, i2);
        cVar.a(this.f41591d, this.f41592e, this.f41593f);
        cVar.e(this.r);
        return cVar;
    }

    public DiscoverDetailFeedPagerAdapter(i iVar, Context context, LayoutInflater layoutInflater, int i, aa<ar> aaVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, VerticalViewPager verticalViewPager) {
        super(iVar, context, layoutInflater, i, aaVar, fragment, onTouchListener, baseFeedPageParams);
        this.q = verticalViewPager;
    }
}
