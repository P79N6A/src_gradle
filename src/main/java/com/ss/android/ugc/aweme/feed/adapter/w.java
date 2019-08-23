package com.ss.android.ugc.aweme.feed.adapter;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44968a;

    /* renamed from: b  reason: collision with root package name */
    private final t f44969b;

    w(t tVar) {
        this.f44969b = tVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (!PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f44968a, false, 40592, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return this.f44969b.b(motionEvent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f44968a, false, 40592, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }
}
