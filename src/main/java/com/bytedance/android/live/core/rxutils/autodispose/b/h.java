package com.bytedance.android.live.core.rxutils.autodispose.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Comparator;

public final /* synthetic */ class h implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8026a;

    /* renamed from: b  reason: collision with root package name */
    static final Comparator f8027b = new h();

    private h() {
    }

    public final int compare(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f8026a, false, 832, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f8026a, false, 832, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
    }
}
