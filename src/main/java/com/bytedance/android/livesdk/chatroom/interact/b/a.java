package com.bytedance.android.livesdk.chatroom.interact.b;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.d;
import com.bytedance.b.a.a.c.a;
import com.bytedance.b.a.a.f.a;
import com.bytedance.b.a.a.f.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class a implements a.C0144a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10334a;

    /* renamed from: b  reason: collision with root package name */
    private double f10335b;

    /* renamed from: c  reason: collision with root package name */
    private double f10336c;

    /* renamed from: d  reason: collision with root package name */
    private double f10337d;

    /* renamed from: e  reason: collision with root package name */
    private double f10338e;

    /* renamed from: f  reason: collision with root package name */
    private double f10339f;
    private C0085a g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.b.a$a  reason: collision with other inner class name */
    public interface C0085a {
        boolean a(int i);

        int b(int i);

        long c(int i);
    }

    public a(a.f fVar, C0085a aVar) {
        this.g = aVar;
        int i = fVar.f19204f;
        int i2 = fVar.g;
        double d2 = (double) ((((float) i) * 1.0f) / 360.0f);
        Double.isNaN(d2);
        double d3 = (double) i;
        Double.isNaN(d3);
        this.f10335b = (120.0d * d2) / d3;
        Double.isNaN(d2);
        double d4 = (double) i2;
        Double.isNaN(d4);
        this.f10336c = (160.0d * d2) / d4;
        Double.isNaN(d2);
        Double.isNaN(d3);
        this.f10337d = (1.0d - this.f10335b) - ((12.0d * d2) / d3);
        Double.isNaN(d2);
        Double.isNaN(d4);
        this.f10338e = (60.0d * d2) / d4;
        Double.isNaN(d2);
        Double.isNaN(d4);
        this.f10339f = (d2 * 4.0d) / d4;
    }

    public final List<b> a(int i, int i2, int i3, List<Integer> list) {
        List<Integer> list2 = list;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list2}, this, f10334a, false, 4615, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list2}, this, f10334a, false, 4615, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, List.class}, List.class);
        }
        int i5 = d.a().h;
        long b2 = TTLiveSDKContext.getHostService().k().b();
        ArrayList arrayList = new ArrayList();
        double d2 = 1.0d;
        arrayList.add(new b().a(1).b(1.0d, 1.0d).a(0.0d, 0.0d).b(i5).a(b2).c(0));
        if (list2 != null && !list.isEmpty()) {
            i4 = list.size();
        }
        int i6 = 1;
        while (i6 <= i4) {
            int i7 = i6 - 1;
            int intValue = list2.get(i7).intValue();
            double d3 = d2 - this.f10338e;
            double d4 = (double) i6;
            double d5 = this.f10336c;
            Double.isNaN(d4);
            double d6 = d3 - (d4 * d5);
            if (i6 > 1) {
                double d7 = (double) i7;
                double d8 = this.f10339f;
                Double.isNaN(d7);
                d6 -= d7 * d8;
            }
            arrayList.add(new b().a(this.g.b(intValue)).b(this.f10335b, this.f10336c).a(this.f10337d, d6).b(intValue).a(this.g.c(intValue)).c(this.g.a(intValue) ^ true ? 1 : 0));
            i6++;
            d2 = 1.0d;
        }
        return arrayList;
    }
}
