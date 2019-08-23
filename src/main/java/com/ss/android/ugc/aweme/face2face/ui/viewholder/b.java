package com.ss.android.ugc.aweme.face2face.ui.viewholder;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44100a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnTouchListener f44101b = new b();

    private b() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f44100a, false, 39267, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f44100a, false, 39267, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            view.animate().alpha(0.75f).setDuration(100).start();
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            view.animate().alpha(1.0f).setDuration(100).start();
        }
        return false;
    }
}
