package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import com.google.common.a.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.g;

public final /* synthetic */ class b implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61126a;

    /* renamed from: b  reason: collision with root package name */
    static final n f61127b = new b();

    private b() {
    }

    public final boolean apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f61126a, false, 67128, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f61126a, false, 67128, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        Activity activity = (Activity) obj;
        return (activity instanceof g) && ((g) activity).O();
    }
}
