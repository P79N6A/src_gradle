package com.ss.android.ugc.aweme.feed.ui;

import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.a;

public final /* synthetic */ class by implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46647a;

    /* renamed from: b  reason: collision with root package name */
    private final bx f46648b;

    by(bx bxVar) {
        this.f46648b = bxVar;
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent2}, this, f46647a, false, 43329, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return this.f46648b.a(i, keyEvent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent2}, this, f46647a, false, 43329, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
    }
}
