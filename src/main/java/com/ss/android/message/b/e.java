package com.ss.android.message.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;

public class e<E> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29972a;

    /* renamed from: b  reason: collision with root package name */
    public int f29973b = 5;

    /* renamed from: c  reason: collision with root package name */
    private LinkedList<E> f29974c = new LinkedList<>();

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f29972a, false, 18146, new Class[0], Integer.TYPE)) {
            return this.f29974c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29972a, false, 18146, new Class[0], Integer.TYPE)).intValue();
    }

    public e(int i) {
    }

    public final E a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f29972a, false, 18143, new Class[]{Integer.TYPE}, Object.class)) {
            return this.f29974c.get(i);
        }
        return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f29972a, false, 18143, new Class[]{Integer.TYPE}, Object.class);
    }

    public final void a(E e2) {
        if (PatchProxy.isSupport(new Object[]{e2}, this, f29972a, false, 18142, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{e2}, this, f29972a, false, 18142, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (this.f29974c.size() >= this.f29973b) {
            this.f29974c.poll();
        }
        this.f29974c.offer(e2);
    }
}
