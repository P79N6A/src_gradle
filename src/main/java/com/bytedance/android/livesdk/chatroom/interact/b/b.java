package com.bytedance.android.livesdk.chatroom.interact.b;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.b.a.a.c.a;
import com.bytedance.b.a.a.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class b implements a.C0144a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10340a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10341b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10342c = true;

    /* renamed from: d  reason: collision with root package name */
    private double f10343d;

    /* renamed from: e  reason: collision with root package name */
    private double f10344e;

    public b(a.f fVar) {
        int i = fVar.f19204f;
        int i2 = fVar.g;
        double d2 = (double) ((((float) i) * 1.0f) / 360.0f);
        Double.isNaN(d2);
        double d3 = (double) i2;
        Double.isNaN(d3);
        this.f10343d = (108.0d * d2) / d3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        this.f10344e = (d2 * 260.0d) / d3;
    }

    public final List<com.bytedance.b.a.a.f.b> a(int i, int i2, int i3, List<Integer> list) {
        List<Integer> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list2}, this, f10340a, false, 4616, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list2}, this, f10340a, false, 4616, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, List.class}, List.class);
        }
        int i4 = LinkCrossRoomDataHolder.a().n;
        long b2 = TTLiveSDKContext.getHostService().k().b();
        if (list.size() > 0 && LinkCrossRoomDataHolder.a().g <= 0) {
            LinkCrossRoomDataHolder.a().g = list2.get(0).intValue();
        }
        int i5 = LinkCrossRoomDataHolder.a().g;
        long j = LinkCrossRoomDataHolder.a().f9032f;
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0 && i5 > 0 && i5 != i3) {
            arrayList.add(new com.bytedance.b.a.a.f.b().a(1).b(0.5d, this.f10344e).a(0.5d, this.f10343d).b(i5).a(j).c(this.f10342c ^ true ? 1 : 0));
        }
        com.bytedance.b.a.a.f.b c2 = new com.bytedance.b.a.a.f.b().a(1).b(0.5d, this.f10344e).a(0.0d, this.f10343d).b(i4).a(b2).c(this.f10341b ^ true ? 1 : 0);
        c2.j = false;
        arrayList.add(c2);
        return arrayList;
    }
}
