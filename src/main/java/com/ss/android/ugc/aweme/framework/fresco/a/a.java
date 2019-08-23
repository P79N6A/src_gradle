package com.ss.android.ugc.aweme.framework.fresco.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.LinkedBlockingDeque;

public final class a<E> extends LinkedBlockingDeque<E> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mFixedSize;

    public a(int i) {
        this.mFixedSize = i;
    }

    public final boolean offer(E e2) {
        if (PatchProxy.isSupport(new Object[]{e2}, this, changeQuickRedirect, false, 45915, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{e2}, this, changeQuickRedirect, false, 45915, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        synchronized (this) {
            if (size() == this.mFixedSize) {
                removeLast();
            }
        }
        return super.offerFirst(e2);
    }
}
