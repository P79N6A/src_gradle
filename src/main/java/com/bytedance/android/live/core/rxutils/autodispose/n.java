package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8059a;

    public static boolean a(AtomicReference<Disposable> atomicReference, Disposable disposable, Class<?> cls) {
        String str;
        AtomicReference<Disposable> atomicReference2 = atomicReference;
        Disposable disposable2 = disposable;
        if (PatchProxy.isSupport(new Object[]{atomicReference2, disposable2, cls}, null, f8059a, true, 734, new Class[]{AtomicReference.class, Disposable.class, Class.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{atomicReference2, disposable2, cls}, null, f8059a, true, 734, new Class[]{AtomicReference.class, Disposable.class, Class.class}, Boolean.TYPE)).booleanValue();
        }
        s.a(disposable2, "next is null");
        if (atomicReference2.compareAndSet(null, disposable2)) {
            return true;
        }
        disposable.dispose();
        if (atomicReference.get() != d.DISPOSED) {
            if (PatchProxy.isSupport(new Object[]{cls}, null, f8059a, true, 737, new Class[]{Class.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cls}, null, f8059a, true, 737, new Class[]{Class.class}, Void.TYPE);
            } else {
                String name = cls.getName();
                if (PatchProxy.isSupport(new Object[]{name}, null, f8059a, true, 736, new Class[]{String.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{name}, null, f8059a, true, 736, new Class[]{String.class}, String.class);
                } else {
                    str = "It is not allowed to subscribe with a(n) " + name + " multiple times. Please create a fresh instance of " + name + " and subscribe that to the target source instead.";
                }
                RxJavaPlugins.onError(new ProtocolViolationException(str));
            }
        }
        return false;
    }
}
