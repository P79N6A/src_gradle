package com.ss.android.ugc.aweme.hotsearch.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.hotsearch.adapter.BaseHotSearchAdapter;
import com.ss.android.ugc.aweme.hotsearch.fragment.BaseRankingListFragment;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;

public abstract class a<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49866a;

    /* renamed from: b  reason: collision with root package name */
    Context f49867b;

    /* renamed from: c  reason: collision with root package name */
    BaseRankingListFragment f49868c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView f49869d;

    /* renamed from: e  reason: collision with root package name */
    DmtStatusView f49870e;

    /* renamed from: f  reason: collision with root package name */
    private BaseHotSearchAdapter<T> f49871f = f();

    public final void a() {
    }

    public final void b(List list, boolean z) {
    }

    public final void c() {
    }

    public final BaseAdapter d() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public abstract BaseHotSearchAdapter<T> f();

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f49866a, false, 49834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49866a, false, 49834, new Class[0], Void.TYPE);
            return;
        }
        this.f49869d.setVisibility(4);
        this.f49870e.f();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f49866a, false, 49833, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49866a, false, 49833, new Class[0], Void.TYPE);
            return;
        }
        this.f49871f.a();
    }

    public void a(boolean z) {
        if (this.f49871f != null) {
            this.f49871f.f49655d = z;
        }
    }

    public final void a(List<T> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f49866a, false, 49837, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f49866a, false, 49837, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{list}, this, f49866a, false, 49835, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f49866a, false, 49835, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(list)) {
            this.f49871f.a(list);
            this.f49871f.f49656e = (String) ((b) this.f49868c.f49754c.a("hot_search_data")).a("hot_search_last_update_time");
        }
    }

    a(View view, Context context, BaseRankingListFragment baseRankingListFragment) {
        this.f49867b = context;
        this.f49868c = baseRankingListFragment;
        this.f49869d = (RecyclerView) view.findViewById(C0906R.id.cil);
        this.f49869d.setLayoutManager(new WrapLinearLayoutManager(context, 1, false));
        this.f49871f.f49655d = baseRankingListFragment.f49756e;
        this.f49869d.setAdapter(this.f49871f);
        this.f49870e = (DmtStatusView) view.findViewById(C0906R.id.cvd);
        this.f49870e.setBuilder(DmtStatusView.a.a(context).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new b(this)));
        this.f49871f.a();
    }
}
