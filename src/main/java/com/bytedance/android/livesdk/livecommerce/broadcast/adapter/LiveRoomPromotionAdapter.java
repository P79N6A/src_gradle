package com.bytedance.android.livesdk.livecommerce.broadcast.adapter;

import android.arch.core.util.Function;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livecommerce.broadcast.ui.LiveRoomPromotionListViewModel;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.d.j;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.bytedance.android.livesdk.livecommerce.view.DragIndexView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class LiveRoomPromotionAdapter extends DataBinderAdapter<LiveRoomPromotionViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16007a;

    /* renamed from: b  reason: collision with root package name */
    private List<e> f16008b;

    /* renamed from: c  reason: collision with root package name */
    private LiveRoomPromotionListViewModel f16009c;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f16007a, false, 10515, new Class[0], String.class)) {
            return a.a(this.f16008b, (Function<T, String>) new Function<e, String>() {
                public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                    e eVar = (e) obj;
                    if (eVar != null) {
                        return eVar.m;
                    }
                    return null;
                }
            });
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f16007a, false, 10515, new Class[0], String.class);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f16007a, false, 10518, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16007a, false, 10518, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f16008b != null) {
            return this.f16008b.size();
        } else {
            return 0;
        }
    }

    public final void a(List<e> list) {
        this.f16008b = list;
    }

    public LiveRoomPromotionAdapter(LiveRoomPromotionListViewModel liveRoomPromotionListViewModel) {
        this.f16009c = liveRoomPromotionListViewModel;
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f16007a, false, 10516, new Class[]{ViewGroup.class, Integer.TYPE}, LiveRoomPromotionViewHolder.class)) {
            return new LiveRoomPromotionViewHolder(viewGroup2, this.f16009c);
        }
        return (LiveRoomPromotionViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f16007a, false, 10516, new Class[]{ViewGroup.class, Integer.TYPE}, LiveRoomPromotionViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        LiveRoomPromotionViewHolder liveRoomPromotionViewHolder = (LiveRoomPromotionViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{liveRoomPromotionViewHolder, Integer.valueOf(i)}, this, f16007a, false, 10517, new Class[]{LiveRoomPromotionViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{liveRoomPromotionViewHolder, Integer.valueOf(i)}, this, f16007a, false, 10517, new Class[]{LiveRoomPromotionViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        e eVar = this.f16008b.get(i2);
        if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, liveRoomPromotionViewHolder, LiveRoomPromotionViewHolder.f16011a, false, 10520, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, liveRoomPromotionViewHolder, LiveRoomPromotionViewHolder.f16011a, false, 10520, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (eVar != null) {
            liveRoomPromotionViewHolder.l = eVar;
            liveRoomPromotionViewHolder.k = i2;
            com.bytedance.android.livesdk.livecommerce.b.a.a(liveRoomPromotionViewHolder.f16013c, eVar.n, liveRoomPromotionViewHolder.l.f16130e, TextUtils.equals(eVar.m, liveRoomPromotionViewHolder.j.a()));
            liveRoomPromotionViewHolder.f16014d.setText(eVar.f16126a);
            liveRoomPromotionViewHolder.f16015e.setPriceText(eVar.o);
            if (liveRoomPromotionViewHolder.j.j_()) {
                DragIndexView dragIndexView = liveRoomPromotionViewHolder.f16012b;
                if (PatchProxy.isSupport(new Object[0], dragIndexView, DragIndexView.f16232a, false, 10769, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], dragIndexView, DragIndexView.f16232a, false, 10769, new Class[0], Void.TYPE);
                } else {
                    dragIndexView.f16233b = 2;
                    dragIndexView.invalidate();
                }
                liveRoomPromotionViewHolder.f16016f.setVisibility(8);
                liveRoomPromotionViewHolder.f16016f.a(false, liveRoomPromotionViewHolder.l.a());
                liveRoomPromotionViewHolder.g.setVisibility(0);
            } else {
                DragIndexView dragIndexView2 = liveRoomPromotionViewHolder.f16012b;
                if (PatchProxy.isSupport(new Object[0], dragIndexView2, DragIndexView.f16232a, false, 10770, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], dragIndexView2, DragIndexView.f16232a, false, 10770, new Class[0], Void.TYPE);
                } else {
                    dragIndexView2.f16233b = 1;
                    dragIndexView2.invalidate();
                }
                liveRoomPromotionViewHolder.f16016f.setVisibility(0);
                liveRoomPromotionViewHolder.f16016f.a(TextUtils.equals(eVar.m, liveRoomPromotionViewHolder.j.a()), liveRoomPromotionViewHolder.l.a());
                liveRoomPromotionViewHolder.g.setVisibility(8);
            }
            List<j> list = eVar.j;
            if (list == null || list.size() <= 0) {
                liveRoomPromotionViewHolder.h.setVisibility(8);
                liveRoomPromotionViewHolder.i.setVisibility(8);
            } else {
                liveRoomPromotionViewHolder.h.setVisibility(0);
                liveRoomPromotionViewHolder.h.setCouponText(list.get(0).f16174a);
                if (list.size() > 1) {
                    liveRoomPromotionViewHolder.i.setVisibility(0);
                    liveRoomPromotionViewHolder.i.setCouponText(list.get(1).f16174a);
                } else {
                    liveRoomPromotionViewHolder.i.setVisibility(8);
                }
            }
            liveRoomPromotionViewHolder.f16012b.setNum(eVar.h);
        }
    }
}
