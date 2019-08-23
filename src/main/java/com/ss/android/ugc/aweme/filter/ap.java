package com.ss.android.ugc.aweme.filter;

import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.a;

public final /* synthetic */ class ap implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47518a;

    /* renamed from: b  reason: collision with root package name */
    private final FilterViewImpl f47519b;

    ap(FilterViewImpl filterViewImpl) {
        this.f47519b = filterViewImpl;
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f47518a, false, 44396, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return this.f47519b.a(i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f47518a, false, 44396, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
    }
}
