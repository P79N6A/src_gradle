package com.ss.android.ugc.aweme.feed.adapter;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class x implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44970a;

    /* renamed from: b  reason: collision with root package name */
    private final t f44971b;

    x(t tVar) {
        this.f44971b = tVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (!PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f44970a, false, 40593, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return this.f44971b.a(motionEvent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f44970a, false, 40593, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }
}
