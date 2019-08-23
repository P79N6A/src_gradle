package com.bytedance.android.livesdk.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class q<T> implements m<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14324a;

    public final boolean a(List<T> list, List<T> list2) {
        boolean z;
        List<T> list3 = list;
        List<T> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{list3, list4}, this, f14324a, false, 8428, new Class[]{List.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, f14324a, false, 8428, new Class[]{List.class, List.class}, Boolean.TYPE)).booleanValue();
        } else if ((list3 == null && list4 == null) || list3 == list4) {
            return true;
        } else {
            if (list3 == null || list4 == null || list.size() != list2.size()) {
                return false;
            }
            for (int i = 0; i < list.size(); i++) {
                T t = list3.get(i);
                T t2 = list4.get(i);
                if (PatchProxy.isSupport(new Object[]{t, t2}, this, f14324a, false, 8429, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f14324a, false, 8429, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
                } else if (t == null && t2 == null) {
                    z = true;
                } else if (t == null || t2 == null) {
                    z = false;
                } else {
                    z = t.equals(t2);
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
    }
}
