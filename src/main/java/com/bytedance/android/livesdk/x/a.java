package com.bytedance.android.livesdk.x;

import com.bytedance.android.livesdkapi.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

public final class a implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18581a;

    /* renamed from: b  reason: collision with root package name */
    private int f18582b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<f> f18583c;

    /* renamed from: d  reason: collision with root package name */
    private f.b f18584d;

    public final f.b b() {
        return this.f18584d;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18581a, false, 13330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18581a, false, 13330, new Class[0], Void.TYPE);
        } else if (this.f18582b <= this.f18583c.size()) {
            this.f18583c.get(this.f18582b).a(new a(this.f18582b + 1, this.f18583c, this.f18584d));
        }
    }

    public a(int i, ArrayList<f> arrayList, f.b bVar) {
        this.f18582b = i;
        this.f18583c = arrayList;
        this.f18584d = bVar;
    }
}
