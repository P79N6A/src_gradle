package com.bytedance.android.livesdk.wallet.adapter;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.wallet.ReChargeHalDialogListAdapter;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class RechargeCnPagerAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17916a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f17917b;

    /* renamed from: c  reason: collision with root package name */
    private int f17918c;

    /* renamed from: d  reason: collision with root package name */
    private int f17919d;

    /* renamed from: e  reason: collision with root package name */
    private ReChargeHalDialogListAdapter.b f17920e;

    public int getItemPosition(Object obj) {
        return -2;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    public int getCount() {
        return this.f17919d;
    }

    public RechargeCnPagerAdapter(ReChargeHalDialogListAdapter.b bVar) {
        this.f17920e = bVar;
    }

    public final void a(@NonNull List<a> list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f17916a, false, 14156, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f17916a, false, 14156, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f17918c = i;
        this.f17917b = list;
        if (list.size() > 9) {
            this.f17919d = list.size() / 6;
            if (list.size() % 6 != 0) {
                this.f17919d++;
            }
        } else {
            this.f17919d = 1;
        }
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        List<a> list;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f17916a, false, 14157, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f17916a, false, 14157, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.alj, viewGroup, false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new GridLayoutManager(viewGroup.getContext(), 3));
        if (this.f17917b.size() <= 9) {
            list = this.f17917b;
        } else {
            List<a> list2 = this.f17917b;
            int i2 = i * 6;
            int i3 = (i + 1) * 6;
            if (this.f17917b.size() <= i3) {
                i3 = this.f17917b.size();
            }
            list = list2.subList(i2, i3);
        }
        recyclerView.setAdapter(new ReChargeHalDialogListAdapter(list, this.f17920e, (long) this.f17918c));
        viewGroup.addView(recyclerView);
        return recyclerView;
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f17916a, false, 14158, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f17916a, false, 14158, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        viewGroup2.removeView((View) obj);
    }
}
