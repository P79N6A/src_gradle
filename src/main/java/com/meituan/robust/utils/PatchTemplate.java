package com.meituan.robust.utils;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
import java.util.WeakHashMap;

public class PatchTemplate implements ChangeQuickRedirect {
    private static final Map<Object, Object> keyToValueRelation = new WeakHashMap();

    public Object accessDispatch(String str, Object[] objArr) {
        return null;
    }

    public boolean isSupport(String str, Object[] objArr) {
        return true;
    }

    private static Object fixObj(Object obj) {
        boolean z;
        if (!(obj instanceof Byte)) {
            return obj;
        }
        if (((Byte) obj).byteValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
