package com.ss.android.ugc.aweme.challenge.recommend;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.recommend.a.a;
import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35415a;

    /* renamed from: b  reason: collision with root package name */
    static final Comparator f35416b = new b();

    private b() {
    }

    public final int compare(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f35415a, false, 25889, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return ((a) obj).f35408b - ((a) obj2).f35408b;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f35415a, false, 25889, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
    }
}
