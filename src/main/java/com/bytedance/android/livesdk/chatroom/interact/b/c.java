package com.bytedance.android.livesdk.chatroom.interact.b;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.d;
import com.bytedance.b.a.a.c.a;
import com.bytedance.b.a.a.f.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class c implements a.C0144a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10345a;

    /* renamed from: b  reason: collision with root package name */
    private a f10346b;

    public interface a {
        long a(int i);
    }

    public c(a aVar) {
        this.f10346b = aVar;
    }

    public final List<b> a(int i, int i2, int i3, List<Integer> list) {
        int i4;
        List<Integer> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list2}, this, f10345a, false, 4617, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list2}, this, f10345a, false, 4617, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, List.class}, List.class);
        }
        int i5 = d.a().h;
        long b2 = TTLiveSDKContext.getHostService().k().b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b().a(1).b(1.0d, 1.0d).a(0.0d, 0.0d).b(i5).a(b2).c(0));
        if (list2 == null || list.isEmpty()) {
            i4 = 0;
        } else {
            i4 = list.size();
        }
        for (int i6 = 0; i6 < i4; i6++) {
            int intValue = list2.get(i6).intValue();
            arrayList.add(new b().a(2).b(1.0d, 1.0d).a(0.0d, 0.0d).b(intValue).a(this.f10346b.a(intValue)));
        }
        return arrayList;
    }
}
