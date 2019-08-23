package com.bytedance.android.livesdk.feed.widget;

import android.view.View;
import com.bytedance.android.livesdk.feed.d.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14528a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveTabIndicator f14529b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14530c;

    /* renamed from: d  reason: collision with root package name */
    private final g f14531d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.android.livesdk.feed.tab.c.a f14532e;

    a(LiveTabIndicator liveTabIndicator, int i, g gVar, com.bytedance.android.livesdk.feed.tab.c.a aVar) {
        this.f14529b = liveTabIndicator;
        this.f14530c = i;
        this.f14531d = gVar;
        this.f14532e = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14528a, false, 9059, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14528a, false, 9059, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveTabIndicator liveTabIndicator = this.f14529b;
        int i = this.f14530c;
        g gVar = this.f14531d;
        com.bytedance.android.livesdk.feed.tab.c.a aVar = this.f14532e;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, liveTabIndicator, LiveTabIndicator.f14526f, false, 9052, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            LiveTabIndicator liveTabIndicator2 = liveTabIndicator;
            PatchProxy.accessDispatch(objArr2, liveTabIndicator2, LiveTabIndicator.f14526f, false, 9052, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            int childCount = liveTabIndicator.g.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    ((com.bytedance.android.livesdk.feed.tab.c.a) liveTabIndicator.g.getChildAt(i2)).setChecked(false);
                    g gVar2 = liveTabIndicator.j.get(i2);
                    gVar2.k = false;
                    liveTabIndicator.i.put(Long.valueOf(gVar2.f14080b), Boolean.FALSE);
                }
            }
        }
        gVar.k = true;
        aVar.setChecked(true);
        liveTabIndicator.i.put(Long.valueOf(gVar.f14080b), Boolean.TRUE);
        if (liveTabIndicator.h != null) {
            liveTabIndicator.h.a(gVar);
        }
    }
}
