package com.ss.android.ugc.aweme.message.a;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.message.d.a;
import com.ss.android.ugc.aweme.message.model.NoticeCountMessage;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55351a;

    /* renamed from: b  reason: collision with root package name */
    private static final SparseArray<Class> f55352b;

    static {
        SparseArray<Class> sparseArray = new SparseArray<>();
        f55352b = sparseArray;
        sparseArray.put(1, NoticeCountMessage.class);
    }

    public final Class a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f55351a, false, 58726, new Class[]{Integer.TYPE}, Class.class)) {
            return f55352b.get(i);
        }
        return (Class) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f55351a, false, 58726, new Class[]{Integer.TYPE}, Class.class);
    }
}
