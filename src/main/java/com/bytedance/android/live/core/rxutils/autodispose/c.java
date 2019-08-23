package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends AtomicReference<Throwable> {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3949248817947090603L;

    c() {
    }

    @Nullable
    public final Throwable terminate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 666, new Class[0], Throwable.class)) {
            return (Throwable) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 666, new Class[0], Throwable.class);
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, x.f8088a, true, 802, new Class[]{AtomicReference.class}, Throwable.class)) {
            return (Throwable) PatchProxy.accessDispatch(new Object[]{this}, null, x.f8088a, true, 802, new Class[]{AtomicReference.class}, Throwable.class);
        }
        Throwable th = (Throwable) get();
        if (th != x.f8089b) {
            th = (Throwable) getAndSet(x.f8089b);
        }
        return th;
    }

    public final boolean addThrowable(Throwable th) {
        Throwable th2;
        Throwable th3;
        if (PatchProxy.isSupport(new Object[]{th}, this, changeQuickRedirect, false, 665, new Class[]{Throwable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{th}, this, changeQuickRedirect, false, 665, new Class[]{Throwable.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{this, th}, null, x.f8088a, true, 801, new Class[]{AtomicReference.class, Throwable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{this, th}, null, x.f8088a, true, 801, new Class[]{AtomicReference.class, Throwable.class}, Boolean.TYPE)).booleanValue();
        }
        do {
            th2 = (Throwable) get();
            if (th2 == x.f8089b) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!compareAndSet(th2, th3));
        return true;
    }
}
