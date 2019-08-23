package com.bytedance.android.live.core.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8321a;

    public static boolean a(List<?> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f8321a, true, 1192, new Class[]{List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list}, null, f8321a, true, 1192, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
        } else if (list == null || list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
