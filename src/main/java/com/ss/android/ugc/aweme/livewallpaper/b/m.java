package com.ss.android.ugc.aweme.livewallpaper.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicInteger;

public final class m implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53640a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f53641b;

    public m() {
        this(0);
    }

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f53640a, false, 56171, new Class[0], Integer.TYPE)) {
            return this.f53641b.getAndIncrement();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53640a, false, 56171, new Class[0], Integer.TYPE)).intValue();
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f53640a, false, 56172, new Class[0], Integer.TYPE)) {
            return this.f53641b.getAndDecrement();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53640a, false, 56172, new Class[0], Integer.TYPE)).intValue();
    }

    public m(int i) {
        this.f53641b = new AtomicInteger(0);
    }
}
