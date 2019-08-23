package com.ss.android.ugc.aweme.base.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collection;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35034a;

    public static <T> boolean a(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return true;
        }
        return false;
    }

    public static <T> boolean a(Collection<T> collection) {
        if (PatchProxy.isSupport(new Object[]{collection}, null, f35034a, true, 25243, new Class[]{Collection.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{collection}, null, f35034a, true, 25243, new Class[]{Collection.class}, Boolean.TYPE)).booleanValue();
        } else if (collection == null || collection.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static <T> boolean b(Collection<T> collection) {
        if (PatchProxy.isSupport(new Object[]{collection}, null, f35034a, true, 25244, new Class[]{Collection.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{collection}, null, f35034a, true, 25244, new Class[]{Collection.class}, Boolean.TYPE)).booleanValue();
        } else if (collection == null || collection.size() <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
