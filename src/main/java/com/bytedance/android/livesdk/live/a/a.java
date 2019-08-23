package com.bytedance.android.livesdk.live.a;

import com.bytedance.android.livesdkapi.depend.model.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15784a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<f.a> f15785b = new ArrayList<>();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15784a, false, 10293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15784a, false, 10293, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f15784a, false, 10294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15784a, false, 10294, new Class[0], Void.TYPE);
            return;
        }
        Iterator<f.a> it2 = this.f15785b.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
    }

    public final void a(f.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f15784a, false, 10291, new Class[]{f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f15784a, false, 10291, new Class[]{f.a.class}, Void.TYPE);
            return;
        }
        if (!this.f15785b.contains(aVar)) {
            this.f15785b.add(aVar);
        }
    }

    public final void b(f.a aVar) {
        f.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f15784a, false, 10292, new Class[]{f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f15784a, false, 10292, new Class[]{f.a.class}, Void.TYPE);
            return;
        }
        this.f15785b.remove(aVar2);
    }
}
