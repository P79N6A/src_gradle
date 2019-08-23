package com.ss.android.ugc.aweme.account.shortvideo.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PressFadeTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32771a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f32772b;

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return null;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32771a, false, 20916, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32771a, false, 20916, new Class[0], Void.TYPE);
            return;
        }
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat.setDuration(100);
        ofFloat.start();
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32773a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f32773a, false, 20917, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f32773a, false, 20917, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
            }
        });
    }

    public void setEnable(boolean z) {
        this.f32772b = z;
    }

    public PressFadeTextView(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f32771a, false, 20915, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f32771a, false, 20915, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f32772b) {
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        if (!PatchProxy.isSupport(new Object[0], this, f32771a, false, 20914, new Class[0], Void.TYPE)) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
                            ofFloat.setDuration(100);
                            ofFloat.start();
                            break;
                        } else {
                            PatchProxy.accessDispatch(new Object[0], this, f32771a, false, 20914, new Class[0], Void.TYPE);
                            break;
                        }
                    case 1:
                        a();
                        break;
                }
            } else {
                a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PressFadeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32772b = true;
    }
}
