package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public enum d implements Disposable {
    DISPOSED;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }

    static boolean dispose(AtomicReference<Disposable> atomicReference) {
        AtomicReference<Disposable> atomicReference2 = atomicReference;
        if (PatchProxy.isSupport(new Object[]{atomicReference2}, null, changeQuickRedirect, true, 669, new Class[]{AtomicReference.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{atomicReference2}, null, changeQuickRedirect, true, 669, new Class[]{AtomicReference.class}, Boolean.TYPE)).booleanValue();
        }
        Disposable disposable = atomicReference.get();
        d dVar = DISPOSED;
        if (disposable != dVar) {
            Disposable andSet = atomicReference2.getAndSet(dVar);
            if (andSet != dVar) {
                if (andSet != null) {
                    andSet.dispose();
                }
                return true;
            }
        }
        return false;
    }
}
