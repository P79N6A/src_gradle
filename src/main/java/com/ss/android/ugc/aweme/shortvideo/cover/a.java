package com.ss.android.ugc.aweme.shortvideo.cover;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66106a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnTouchListener f66107b = new a();

    private a() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f66106a, false, 75371, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return true;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f66106a, false, 75371, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }
}
