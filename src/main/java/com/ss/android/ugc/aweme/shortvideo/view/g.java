package com.ss.android.ugc.aweme.shortvideo.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.views.mention.c;
import java.util.Comparator;

public final /* synthetic */ class g implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71303a;

    /* renamed from: b  reason: collision with root package name */
    static final Comparator f71304b = new g();

    private g() {
    }

    public final int compare(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f71303a, false, 81238, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return Integer.compare(((c) obj).f76513a, ((c) obj2).f76513a);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f71303a, false, 81238, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
    }
}
