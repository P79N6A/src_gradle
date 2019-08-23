package com.ss.android.ugc.aweme.story.viewpager2.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Px;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public final class a extends ViewPager2.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74450a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final List<ViewPager2.a> f74451b = new ArrayList(3);

    a(int i) {
    }

    private void a(ConcurrentModificationException concurrentModificationException) {
        ConcurrentModificationException concurrentModificationException2 = concurrentModificationException;
        if (PatchProxy.isSupport(new Object[]{concurrentModificationException2}, this, f74450a, false, 86540, new Class[]{ConcurrentModificationException.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{concurrentModificationException2}, this, f74450a, false, 86540, new Class[]{ConcurrentModificationException.class}, Void.TYPE);
            return;
        }
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException2);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74450a, false, 86538, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74450a, false, 86538, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            for (ViewPager2.a a2 : this.f74451b) {
                a2.a(i);
            }
        } catch (ConcurrentModificationException e2) {
            a(e2);
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74450a, false, 86539, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74450a, false, 86539, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            for (ViewPager2.a b2 : this.f74451b) {
                b2.b(i);
            }
        } catch (ConcurrentModificationException e2) {
            a(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ViewPager2.a aVar) {
        ViewPager2.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f74450a, false, 86535, new Class[]{ViewPager2.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f74450a, false, 86535, new Class[]{ViewPager2.a.class}, Void.TYPE);
            return;
        }
        this.f74451b.add(aVar2);
    }

    public final void a(int i, float f2, @Px int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f74450a, false, 86537, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f74450a, false, 86537, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            for (ViewPager2.a a2 : this.f74451b) {
                a2.a(i, f2, i2);
            }
        } catch (ConcurrentModificationException e2) {
            a(e2);
        }
    }
}
