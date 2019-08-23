package com.ss.android.ugc.aweme.filter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;

public final class ao {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47517a;

    @NonNull
    public static List<String> a(@NonNull List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f47517a, true, 44388, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, null, f47517a, true, 44388, new Class[]{List.class}, List.class);
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().startsWith("pinyin")) {
                it2.remove();
            }
        }
        return list;
    }
}
