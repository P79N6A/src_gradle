package com.ss.android.ugc.aweme.shortvideo.util;

import android.support.annotation.NonNull;
import com.google.common.a.f;
import com.google.common.a.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71220a;

    @NonNull
    public static <T> List<T> a(@NonNull List<T> list, @NonNull f<T, Boolean> fVar) {
        f<T, Boolean> fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{list, fVar2}, null, f71220a, true, 80985, new Class[]{List.class, f.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, fVar2}, null, f71220a, true, 80985, new Class[]{List.class, f.class}, List.class);
        }
        m.a(list);
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (((Boolean) fVar2.apply(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
