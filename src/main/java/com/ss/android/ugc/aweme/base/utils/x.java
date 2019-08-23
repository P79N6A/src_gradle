package com.ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class x implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35062a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnTouchListener f35063b = new x();

    private x() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f35062a, false, 25341, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f35062a, false, 25341, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Context context = view.getContext();
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, C0906R.anim.o);
                    loadAnimation.setFillAfter(true);
                    view2.startAnimation(loadAnimation);
                    break;
                case 1:
                    break;
            }
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, C0906R.anim.p);
        loadAnimation2.setFillAfter(true);
        view2.startAnimation(loadAnimation2);
        return false;
    }
}
