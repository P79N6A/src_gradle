package com.facebook.imagepipeline.memory;

import com.facebook.common.references.a;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public final class ab<V> extends f<V> {

    /* renamed from: b  reason: collision with root package name */
    private LinkedList<a<V>> f23952b = new LinkedList<>();

    public final V pop() {
        V v;
        a aVar = (a) this.f23967a.poll();
        if (aVar.f23548a == null) {
            v = null;
        } else {
            v = aVar.f23548a.get();
        }
        if (aVar.f23548a != null) {
            aVar.f23548a.clear();
            aVar.f23548a = null;
        }
        if (aVar.f23549b != null) {
            aVar.f23549b.clear();
            aVar.f23549b = null;
        }
        if (aVar.f23550c != null) {
            aVar.f23550c.clear();
            aVar.f23550c = null;
        }
        this.f23952b.add(aVar);
        return v;
    }

    /* access modifiers changed from: package-private */
    public final void a(V v) {
        a poll = this.f23952b.poll();
        if (poll == null) {
            poll = new a();
        }
        poll.f23548a = new SoftReference<>(v);
        poll.f23549b = new SoftReference<>(v);
        poll.f23550c = new SoftReference<>(v);
        this.f23967a.add(poll);
    }

    public ab(int i, int i2, int i3) {
        super(i, i2, i3, false);
    }
}
