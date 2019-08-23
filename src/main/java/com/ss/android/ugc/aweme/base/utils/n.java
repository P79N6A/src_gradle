package com.ss.android.ugc.aweme.base.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35040a;

    public static boolean a(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (PatchProxy.isSupport(new Object[]{obj3, obj4}, null, f35040a, true, 25255, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj3, obj4}, null, f35040a, true, 25255, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj3 == obj4 || (obj3 != null && obj.equals(obj2))) {
            return true;
        } else {
            return false;
        }
    }
}
