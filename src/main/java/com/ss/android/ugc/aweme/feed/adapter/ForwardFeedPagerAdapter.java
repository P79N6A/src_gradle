package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import java.util.ArrayList;
import java.util.List;

public class ForwardFeedPagerAdapter extends FeedPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44739a;

    /* renamed from: b  reason: collision with root package name */
    private List<Aweme> f44740b = new ArrayList();

    public final int a(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f44739a, false, 40545, new Class[]{Aweme.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, this, f44739a, false, 40545, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
        } else if (!aweme.isForwardAweme() || aweme.getForwardItem() == null) {
            return super.a(aweme);
        } else {
            if (aweme.getForwardItem().getAwemeType() == 2) {
                return 1;
            }
            return 0;
        }
    }

    @Nullable
    public final Aweme d(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44739a, false, 40542, new Class[]{Integer.TYPE}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44739a, false, 40542, new Class[]{Integer.TYPE}, Aweme.class);
        } else if (i2 >= 0 && i2 < getCount()) {
            return this.f44740b.get(i2);
        } else {
            return null;
        }
    }

    public final void e(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44739a, false, 40544, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44739a, false, 40544, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 < 0 || i2 >= getCount()) {
        } else {
            this.f44740b.remove(i2);
            super.e(i);
        }
    }

    public int getItemPosition(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f44739a, false, 40543, new Class[]{Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f44739a, false, 40543, new Class[]{Object.class}, Integer.TYPE)).intValue();
        }
        IFeedViewHolder iFeedViewHolder = (IFeedViewHolder) ((View) obj).getTag(C0906R.id.acv);
        int count = getCount();
        for (int i = 0; i < count; i++) {
            Aweme d2 = d(i);
            if (iFeedViewHolder != null && d2 != null && StringUtils.equal(d2.getAid(), iFeedViewHolder.B().getAid())) {
                return i;
            }
        }
        return -2;
    }

    public final void a(List<Aweme> list) {
        List list2;
        List<Aweme> list3 = list;
        if (PatchProxy.isSupport(new Object[]{list3}, this, f44739a, false, 40540, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3}, this, f44739a, false, 40540, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f44740b.clear();
        if (!CollectionUtils.isEmpty(list)) {
            this.f44740b.addAll(list3);
        }
        if (PatchProxy.isSupport(new Object[]{list3}, null, f44739a, true, 40541, new Class[]{List.class}, List.class)) {
            list2 = (List) PatchProxy.accessDispatch(new Object[]{list3}, null, f44739a, true, 40541, new Class[]{List.class}, List.class);
        } else if (list3 == null) {
            list2 = null;
        } else {
            list2 = new ArrayList();
            for (Aweme next : list) {
                if (next.isForwardAweme()) {
                    list2.add(next.getForwardItem());
                } else {
                    list2.add(next);
                }
            }
        }
        super.a(list2);
    }

    public final VideoViewHolder a(View view, aa<ar> aaVar, View.OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        if (PatchProxy.isSupport(new Object[]{view, aaVar, onTouchListener, fragment, baseFeedPageParams}, this, f44739a, false, 40546, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class)) {
            return (VideoViewHolder) PatchProxy.accessDispatch(new Object[]{view, aaVar, onTouchListener, fragment, baseFeedPageParams}, this, f44739a, false, 40546, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class);
        }
        j jVar = new j(view, aaVar, onTouchListener, fragment, baseFeedPageParams, this.j);
        return jVar;
    }

    public ForwardFeedPagerAdapter(Context context, LayoutInflater layoutInflater, int i, aa<ar> aaVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        super(context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams);
    }

    public final FeedImageViewHolder a(int i, View view, aa<ar> aaVar, String str, View.OnTouchListener onTouchListener, Fragment fragment, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, aaVar, str, onTouchListener, fragment, Integer.valueOf(i2)}, this, f44739a, false, 40547, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class)) {
            return (FeedImageViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, aaVar, str, onTouchListener, fragment, Integer.valueOf(i2)}, this, f44739a, false, 40547, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class);
        }
        i iVar = new i(i, view, aaVar, str, onTouchListener, fragment, i2);
        return iVar;
    }
}
