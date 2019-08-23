package com.bytedance.android.livesdk.livecommerce.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Stack;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15983a;

    /* renamed from: b  reason: collision with root package name */
    private Stack<c> f15984b = new Stack<>();

    public final void a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f15983a, false, 10472, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f15983a, false, 10472, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f15984b.push(cVar2);
    }

    public final void b(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f15983a, false, 10473, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f15983a, false, 10473, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f15984b.pop();
        if (this.f15984b.size() > 0) {
            c peek = this.f15984b.peek();
            if (peek != null) {
                peek.b();
            }
        }
    }
}
