package com.ss.android.ugc.aweme.discover.delegate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.adapter.BannerAdapter;
import com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.ss.android.ugc.aweme.shortvideo.ui.InfiniteLoopPagerAdapter;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.Collections;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.common.adapter.a<List<DiscoverItemData>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42236a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42237b = true;

    /* renamed from: c  reason: collision with root package name */
    public CategoryListAdapter.b f42238c;

    /* renamed from: d  reason: collision with root package name */
    private DiscoverBannerViewHolder f42239d;

    public final void b(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f42236a, false, 36179, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f42236a, false, 36179, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        ((DiscoverBannerViewHolder) viewHolder).a(false);
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f42236a, false, 36181, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f42236a, false, 36181, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tj, viewGroup, false);
        if (this.f42238c != null) {
            this.f42238c.a(inflate);
        }
        if (this.f42239d == null) {
            this.f42239d = new DiscoverBannerViewHolder(inflate);
        }
        return this.f42239d;
    }

    public final void a(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f42236a, false, 36178, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f42236a, false, 36178, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        if (this.f42237b) {
            ((DiscoverBannerViewHolder) viewHolder).a(true);
        }
    }

    public final void b(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42236a, false, 36183, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42236a, false, 36183, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.f42237b == z2 || this.f42239d == null)) {
            DiscoverBannerViewHolder discoverBannerViewHolder = this.f42239d;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, discoverBannerViewHolder, DiscoverBannerViewHolder.f41580a, false, 35552, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                DiscoverBannerViewHolder discoverBannerViewHolder2 = discoverBannerViewHolder;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, discoverBannerViewHolder2, DiscoverBannerViewHolder.f41580a, false, 35552, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                if (z2 && discoverBannerViewHolder.mViewPager != null && discoverBannerViewHolder.mViewPager.getChildCount() > 0) {
                    discoverBannerViewHolder.a(discoverBannerViewHolder.mViewPager.getCurrentItem());
                }
                discoverBannerViewHolder.b(z2);
            }
        }
        this.f42237b = z2;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42236a, false, 36177, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42236a, false, 36177, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f42239d != null) {
            this.f42239d.a(z);
        }
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42236a, false, 36180, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42236a, false, 36180, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (((DiscoverItemData) list.get(i)).getType() == 4) {
            return true;
        } else {
            return false;
        }
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42236a, false, 36182, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42236a, false, 36182, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        DiscoverBannerViewHolder discoverBannerViewHolder = (DiscoverBannerViewHolder) viewHolder;
        discoverBannerViewHolder.b(this.f42237b);
        List<Banner> bannerList = ((DiscoverItemData) list2.get(i)).getBannerList();
        if (PatchProxy.isSupport(new Object[]{bannerList, (byte) 1}, discoverBannerViewHolder, DiscoverBannerViewHolder.f41580a, false, 35549, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            DiscoverBannerViewHolder discoverBannerViewHolder2 = discoverBannerViewHolder;
            PatchProxy.accessDispatch(new Object[]{bannerList, (byte) 1}, discoverBannerViewHolder2, DiscoverBannerViewHolder.f41580a, false, 35549, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Context context = discoverBannerViewHolder.itemView.getContext();
        if (!DiscoverBannerViewHolder.f41581b.equals(bannerList)) {
            if (discoverBannerViewHolder.f41582c == null) {
                discoverBannerViewHolder.f41582c = new BannerAdapter(context, LayoutInflater.from(context));
                discoverBannerViewHolder.mViewPager.setAdapter(new InfiniteLoopPagerAdapter(discoverBannerViewHolder.f41582c));
            }
            boolean a2 = ey.a(context);
            if (a2) {
                Collections.reverse(bannerList);
            }
            discoverBannerViewHolder.f41583d.f42344c = bannerList.size();
            discoverBannerViewHolder.f41582c.a(bannerList);
            discoverBannerViewHolder.mIndicator.a(discoverBannerViewHolder.mViewPager);
            discoverBannerViewHolder.f41584e = bannerList;
            if (a2) {
                discoverBannerViewHolder.mViewPager.setCurrentItem(bannerList.size() - 1);
            }
            if (discoverBannerViewHolder.f41585f) {
                if (discoverBannerViewHolder.f41584e.size() != 0) {
                    discoverBannerViewHolder.a(discoverBannerViewHolder.mViewPager.getCurrentItem());
                }
                discoverBannerViewHolder.f41585f = false;
            }
            discoverBannerViewHolder.a(true);
        }
    }
}
