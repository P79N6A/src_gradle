package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiTypeRecyclerAdapter;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;

public class PoiTypePagerAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59999a;

    /* renamed from: b  reason: collision with root package name */
    private PoiTypeRecyclerAdapter.a f60000b;

    /* renamed from: c  reason: collision with root package name */
    private List<List<SimplePoiInfoStruct>> f60001c;

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f59999a, false, 65206, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59999a, false, 65206, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f60001c == null) {
            return 0;
        } else {
            return this.f60001c.size();
        }
    }

    public float getPageWidth(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59999a, false, 65207, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59999a, false, 65207, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        } else if (i == getCount() - 1) {
            return 1.0f;
        } else {
            return 0.8f;
        }
    }

    public PoiTypePagerAdapter(List<List<SimplePoiInfoStruct>> list, PoiTypeRecyclerAdapter.a aVar) {
        this.f60001c = list;
        this.f60000b = aVar;
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f59999a, false, 65208, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f59999a, false, 65208, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ye, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0906R.id.c2t);
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(viewGroup.getContext(), 1, false));
        recyclerView.setAdapter(new PoiTypeRecyclerAdapter(this.f60000b, this.f60001c.get(i)));
        viewGroup.addView(inflate);
        return inflate;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f59999a, false, 65209, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f59999a, false, 65209, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        viewGroup2.removeView((View) obj);
    }
}
