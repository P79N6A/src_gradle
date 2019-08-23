package com.bytedance.android.live.core.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Comparator;

public final /* synthetic */ class e implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8163a;

    /* renamed from: b  reason: collision with root package name */
    static final Comparator f8164b = new e();

    private e() {
    }

    public final int compare(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f8163a, false, 889, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return m.a((l) obj).compareTo(m.a((l) obj2));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f8163a, false, 889, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
    }
}
