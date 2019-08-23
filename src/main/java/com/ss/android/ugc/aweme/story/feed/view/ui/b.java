package com.ss.android.ugc.aweme.story.feed.view.ui;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72835a;

    /* renamed from: b  reason: collision with root package name */
    private final float f72836b;

    /* renamed from: c  reason: collision with root package name */
    private final long f72837c;

    b(float f2, long j) {
        this.f72836b = f2;
        this.f72837c = j;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f72835a, false, 84141, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f72835a, false, 84141, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        float f2 = this.f72836b;
        long j = this.f72837c;
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    a.a(true, view, f2, j);
                    break;
                case 1:
                    break;
            }
        }
        a.a(false, view, f2, j);
        return false;
    }
}
