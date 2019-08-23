package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class cg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66007a;

    /* renamed from: b  reason: collision with root package name */
    AtomicInteger f66008b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    ArrayList<a> f66009c;

    public interface a {
        void a(int i, int i2);
    }

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f66007a, false, 74207, new Class[0], Integer.TYPE)) {
            return this.f66008b.get();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66007a, false, 74207, new Class[0], Integer.TYPE)).intValue();
    }

    public final int a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66007a, false, 74206, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66007a, false, 74206, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int andSet = this.f66008b.getAndSet(i);
        if (!(andSet == i || this.f66009c == null)) {
            a(andSet, i);
        }
        return andSet;
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f66007a, false, 74209, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f66007a, false, 74209, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f66009c == null) {
            this.f66009c = new ArrayList<>();
        }
        this.f66009c.add(aVar);
    }

    private void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f66007a, false, 74208, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f66007a, false, 74208, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Iterator<a> it2 = this.f66009c.iterator();
        while (it2.hasNext()) {
            it2.next().a(i, i2);
        }
    }
}
