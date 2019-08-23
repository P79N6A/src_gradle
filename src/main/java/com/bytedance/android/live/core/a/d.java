package com.bytedance.android.live.core.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d<K, V> extends LinkedHashMap<K, V> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int capacity;

    public d(int i) {
        super(i, 0.75f, true);
        this.capacity = i;
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        if (PatchProxy.isSupport(new Object[]{entry}, this, changeQuickRedirect, false, 154, new Class[]{Map.Entry.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{entry}, this, changeQuickRedirect, false, 154, new Class[]{Map.Entry.class}, Boolean.TYPE)).booleanValue();
        } else if (size() > this.capacity) {
            return true;
        } else {
            return false;
        }
    }
}
