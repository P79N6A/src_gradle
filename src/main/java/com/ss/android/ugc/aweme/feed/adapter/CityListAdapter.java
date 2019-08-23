package com.ss.android.ugc.aweme.feed.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.feed.ui.aj;
import com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.c;
import com.ss.android.ugc.aweme.poi.e.o;

public class CityListAdapter extends RecyclerView.Adapter implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44669a;

    /* renamed from: b  reason: collision with root package name */
    public NearbyCities f44670b;

    /* renamed from: c  reason: collision with root package name */
    private aj f44671c;

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f44669a, false, 40337, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44669a, false, 40337, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f44670b == null || this.f44670b.all == null) {
            return 0;
        } else {
            return this.f44670b.all.size() + 1;
        }
    }

    public CityListAdapter(aj ajVar) {
        this.f44671c = ajVar;
    }

    public final long a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44669a, false, 40332, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44669a, false, 40332, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
        } else if (i == 0) {
            return -1;
        } else {
            return (long) this.f44670b.all.get(i - 1).en.charAt(0);
        }
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f44669a, false, 40333, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new CityHeadViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.so, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f44669a, false, 40333, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f44669a, false, 40335, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f44669a, false, 40335, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 0) {
            return new CityListHeadViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sq, viewGroup, false), this.f44671c);
        } else {
            return new CityItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sp, viewGroup, false), this.f44671c);
        }
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44669a, false, 40334, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44669a, false, 40334, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        CityHeadViewHolder cityHeadViewHolder = (CityHeadViewHolder) viewHolder;
        String valueOf = String.valueOf(this.f44670b.all.get(i - 1).en.charAt(0));
        if (PatchProxy.isSupport(new Object[]{valueOf, Integer.valueOf(i)}, cityHeadViewHolder, CityHeadViewHolder.f44661a, false, 40328, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {valueOf, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            CityHeadViewHolder cityHeadViewHolder2 = cityHeadViewHolder;
            PatchProxy.accessDispatch(objArr2, cityHeadViewHolder2, CityHeadViewHolder.f44661a, false, 40328, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        cityHeadViewHolder.f44662b.setText(valueOf);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44669a, false, 40336, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f44669a, false, 40336, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getItemViewType(i3) == 0) {
            CityListHeadViewHolder cityListHeadViewHolder = (CityListHeadViewHolder) viewHolder;
            NearbyCities nearbyCities = this.f44670b;
            if (PatchProxy.isSupport(new Object[]{nearbyCities}, cityListHeadViewHolder, CityListHeadViewHolder.f44672a, false, 40338, new Class[]{NearbyCities.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{nearbyCities}, cityListHeadViewHolder, CityListHeadViewHolder.f44672a, false, 40338, new Class[]{NearbyCities.class}, Void.TYPE);
            } else {
                NearbyCities.CityBean cityBean = nearbyCities.current;
                if (TextUtils.isEmpty(cityBean.name)) {
                    if (PatchProxy.isSupport(new Object[0], null, o.f59816a, true, 66871, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, o.f59816a, true, 66871, new Class[0], Void.TYPE);
                    } else {
                        n.a("poi_log", "select_city", null);
                    }
                }
                if (af.b(d.a())) {
                    i2 = C0906R.string.a4a;
                } else {
                    i2 = C0906R.string.a3k;
                }
                cityListHeadViewHolder.f44674c.setText(i2);
                cityListHeadViewHolder.f44675d.setTag(cityBean);
                cityListHeadViewHolder.f44675d.setText(cityBean.name);
                if (nearbyCities.old == null || nearbyCities.old.size() == 0) {
                    cityListHeadViewHolder.g.setVisibility(8);
                } else {
                    cityListHeadViewHolder.g.setVisibility(0);
                    cityListHeadViewHolder.f44673b.setData(nearbyCities.old);
                }
                cityListHeadViewHolder.f44676e.setData(nearbyCities.hot);
            }
        } else {
            CityItemViewHolder cityItemViewHolder = (CityItemViewHolder) viewHolder;
            int i4 = i3 - 1;
            NearbyCities.CityBean cityBean2 = this.f44670b.all.get(i4);
            if (PatchProxy.isSupport(new Object[]{cityBean2, Integer.valueOf(i4)}, cityItemViewHolder, CityItemViewHolder.f44663a, false, 40329, new Class[]{NearbyCities.CityBean.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cityBean2, Integer.valueOf(i4)}, cityItemViewHolder, CityItemViewHolder.f44663a, false, 40329, new Class[]{NearbyCities.CityBean.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            cityItemViewHolder.f44665c = cityBean2;
            cityItemViewHolder.f44664b.setText(cityBean2.name);
            cityItemViewHolder.f44664b.setTag(cityBean2);
        }
    }
}
