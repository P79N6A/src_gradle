package com.ss.android.ugc.aweme.story.friends.a;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73050a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnTouchListener f73051b = new b();

    private b() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f73050a, false, 84632, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f73050a, false, 84632, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (!PatchProxy.isSupport(new Object[]{view2}, null, a.f73049a, true, 84630, new Class[]{View.class}, Void.TYPE)) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, 0.92f});
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, 0.92f});
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.75f});
                        ofFloat.setDuration(150);
                        ofFloat2.setDuration(150);
                        ofFloat.start();
                        ofFloat2.start();
                        ofFloat3.start();
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[]{view2}, null, a.f73049a, true, 84630, new Class[]{View.class}, Void.TYPE);
                        break;
                    }
                case 1:
                    break;
            }
        }
        if (PatchProxy.isSupport(new Object[]{view2}, null, a.f73049a, true, 84631, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, a.f73049a, true, 84631, new Class[]{View.class}, Void.TYPE);
        } else {
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{view.getScaleX(), 1.0f});
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{view.getScaleY(), 1.0f});
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.75f, 1.0f});
            ofFloat4.setDuration(150);
            ofFloat5.setDuration(150);
            ofFloat4.start();
            ofFloat5.start();
            ofFloat6.start();
        }
        return false;
    }
}
