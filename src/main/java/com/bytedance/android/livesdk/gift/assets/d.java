package com.bytedance.android.livesdk.gift.assets;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14735a;

    /* renamed from: b  reason: collision with root package name */
    private final c f14736b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14737c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14738d;

    d(c cVar, int i, boolean z) {
        this.f14736b = cVar;
        this.f14737c = i;
        this.f14738d = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14735a, false, 9343, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14735a, false, 9343, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f14736b;
        int i = this.f14737c;
        boolean z = this.f14738d;
        cVar.f14723d = ((b) ((com.bytedance.android.live.core.network.response.d) obj).f7871b).f14719a;
        List<AssetsModel> list = cVar.f14723d;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, cVar, c.f14720a, false, 9339, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, cVar, c.f14720a, false, 9339, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            for (AssetsModel next : list) {
                if (!(!(((double) (currentTimeMillis - ((Long) cVar.f14722c.get(next.getId(), 0L)).longValue())) > 150000.0d) || next.getDownloadType() == 2 || next.getResourceType() == 5)) {
                    cVar.a(next, i);
                    cVar.f14722c.put(next.getId(), Long.valueOf(currentTimeMillis));
                }
            }
        }
        if (z) {
            cVar.a(cVar.f14723d, i);
        }
        cVar.a(cVar.f14723d);
        cVar.b(cVar.f14723d, i);
        for (int size = cVar.f14721b.size() - 1; size >= 0; size--) {
            cVar.f14721b.get(size).a(cVar.f14723d);
        }
        if (cVar.f14724e != null && !cVar.f14724e.isDisposed()) {
            cVar.f14724e.dispose();
            cVar.f14724e = null;
        }
    }
}
