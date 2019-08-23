package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.Banner;
import java.util.List;

public class BannerAdapter extends AbsPagerAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f41529b;

    /* renamed from: c  reason: collision with root package name */
    protected List<Banner> f41530c;

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f41529b, false, 35491, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41529b, false, 35491, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f41530c == null) {
            return 0;
        } else {
            return this.f41530c.size();
        }
    }

    public final void a(List<Banner> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f41529b, false, 35489, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f41529b, false, 35489, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.f41530c != list) {
            this.f41530c = list;
            notifyDataSetChanged();
        }
    }

    public BannerAdapter(Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        BannerViewHolder bannerViewHolder;
        View view2;
        int i2 = i;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f41529b, false, 35490, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f41529b, false, 35490, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
        }
        if (view == null) {
            view2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tb, viewGroup2, false);
            bannerViewHolder = new BannerViewHolder(view2);
            view2.setTag(bannerViewHolder);
        } else {
            bannerViewHolder = (BannerViewHolder) view.getTag();
            view2 = view;
        }
        if (getCount() > 0) {
            bannerViewHolder.a(this.f41530c.get(i2), i2);
        }
        return view2;
    }
}
