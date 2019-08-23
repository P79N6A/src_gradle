package com.ss.android.ugc.aweme.shortvideo.c;

import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.a;

public final /* synthetic */ class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65874a;

    /* renamed from: b  reason: collision with root package name */
    private final c f65875b;

    d(c cVar) {
        this.f65875b = cVar;
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f65874a, false, 75209, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f65874a, false, 75209, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        c cVar = this.f65875b;
        if (i != 4) {
            return false;
        }
        cVar.a();
        return true;
    }
}
