package com.bytedance.ies.dmt.ui.input.emoji;

import android.content.Context;
import com.bytedance.ies.dmt.ui.input.a;
import java.util.ArrayList;
import java.util.List;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private f f20388c;

    /* renamed from: d  reason: collision with root package name */
    private int f20389d;

    public final int a() {
        return 2130841632;
    }

    public final int e() {
        return 20;
    }

    private void f() {
        if (this.f20389d == 0) {
            this.f20389d = this.f20388c.a();
        }
    }

    public final int d() {
        f();
        if (this.f20389d == 0) {
            return 1;
        }
        return ((this.f20389d - 1) / 20) + 1;
    }

    public b(Context context) {
        this.f20388c = f.a(context);
    }

    public final List<a> b(int i) {
        ArrayList arrayList = new ArrayList(21);
        int i2 = (i + 1) * 20;
        for (int i3 = i * 20; i3 < i2; i3++) {
            a aVar = new a();
            aVar.f20387b = this.f20388c.a(i3);
            aVar.f20386a = this.f20388c.b(i3);
            arrayList.add(aVar);
        }
        a aVar2 = new a();
        aVar2.f20387b = 2130841633;
        arrayList.add(aVar2);
        return arrayList;
    }
}
