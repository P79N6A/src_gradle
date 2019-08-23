package com.bytedance.android.live.core.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

public final class y<T> extends CopyOnWriteArrayList<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final boolean add(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, changeQuickRedirect, false, 1206, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{t}, this, changeQuickRedirect, false, 1206, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (t != null && !contains(t)) {
            return super.add(t);
        } else {
            return false;
        }
    }

    public final boolean addAll(Collection<? extends T> collection) {
        if (PatchProxy.isSupport(new Object[]{collection}, this, changeQuickRedirect, false, 1208, new Class[]{Collection.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{collection}, this, changeQuickRedirect, false, 1208, new Class[]{Collection.class}, Boolean.TYPE)).booleanValue();
        }
        for (Object add : collection) {
            add(add);
        }
        return true;
    }

    public final boolean remove(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 1207, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 1207, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == null) {
            return false;
        } else {
            return super.remove(obj);
        }
    }
}
