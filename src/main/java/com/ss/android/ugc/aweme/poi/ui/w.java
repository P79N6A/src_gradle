package com.ss.android.ugc.aweme.poi.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.a.a;
import com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.ss.android.ugc.aweme.poi.b;
import com.ss.android.ugc.aweme.poi.model.aa;
import java.util.List;

public final class w extends i {
    public static ChangeQuickRedirect s;
    public a t;

    public final void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 66118, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.f60804e.i() != null && ((!(this.f60804e.i() instanceof com.ss.android.ugc.aweme.common.f.a) || !((com.ss.android.ugc.aweme.common.f.a) this.f60804e.i()).isDataEmpty()) && ((aa) this.f60804e.i()).isHasMore() && this.f60804e != null)) {
            this.f60804e.a(4, new b.a().a(this.f60801b).d(this.f60802c).b(3).a());
        }
    }

    public w(a aVar, String str) {
        this.t = aVar;
        this.f60802c = str;
    }

    public final void a(List<com.ss.android.ugc.aweme.newfollow.e.b> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, s, false, 66117, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, s, false, 66117, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(list, z);
        if (this.t != null && ((PoiAwemeFeedAdapter) this.j).getItemCount() > this.t.position && this.t.position >= 0) {
            AnonymousClass1 r7 = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60968a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f60968a, false, 66120, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f60968a, false, 66120, new Class[0], Void.TYPE);
                        return;
                    }
                    PoiPureAwemeFeedViewHolder$1$1 poiPureAwemeFeedViewHolder$1$1 = new PoiPureAwemeFeedViewHolder$1$1(this, w.this.getContext());
                    poiPureAwemeFeedViewHolder$1$1.setTargetPosition(w.this.t.position);
                    w.this.k.startSmoothScroll(poiPureAwemeFeedViewHolder$1$1);
                }
            };
            if (PatchProxy.isSupport(new Object[]{r7}, this, i.f60800a, false, 65993, new Class[]{Runnable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{r7}, this, i.f60800a, false, 65993, new Class[]{Runnable.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{r7, 0}, this, i.f60800a, false, 65994, new Class[]{Runnable.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{r7, 0}, this, i.f60800a, false, 65994, new Class[]{Runnable.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.mRecyclerView.postDelayed(r7, 0);
        }
    }

    public final void a(boolean z, String str, String str2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str, str2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, s, false, 66119, new Class[]{Boolean.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str, str2, Byte.valueOf(z2)}, this, s, false, 66119, new Class[]{Boolean.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f60804e != null) {
            this.f60804e.a(1, new b.a().a(this.f60801b).d(this.f60802c).b(3).a());
        }
    }
}
