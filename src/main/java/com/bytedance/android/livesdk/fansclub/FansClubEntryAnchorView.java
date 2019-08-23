package com.bytedance.android.livesdk.fansclub;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.fansclub.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FansClubEntryAnchorView extends LinearLayout implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13843a;

    public float getAnchorX() {
        if (!PatchProxy.isSupport(new Object[0], this, f13843a, false, 8286, new Class[0], Float.TYPE)) {
            return getX() + ((((float) getWidth()) * 3.0f) / 4.0f);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f13843a, false, 8286, new Class[0], Float.TYPE)).floatValue();
    }

    public float getAnchorY() {
        if (!PatchProxy.isSupport(new Object[0], this, f13843a, false, 8287, new Class[0], Float.TYPE)) {
            return getY() + (((float) getHeight()) / 2.0f);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f13843a, false, 8287, new Class[0], Float.TYPE)).floatValue();
    }

    public FansClubEntryAnchorView(Context context) {
        this(context, null);
    }

    public final void a(d.a aVar) {
        final d.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f13843a, false, 8288, new Class[]{d.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f13843a, false, 8288, new Class[]{d.a.class}, Void.TYPE);
            return;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f, 1, 0.5f, 1, 0.5f);
        final ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.1f, 1.0f, 1.1f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(180);
        scaleAnimation.setStartOffset(180);
        scaleAnimation2.setDuration(180);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13844a;

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f13844a, false, 8289, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f13844a, false, 8289, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                FansClubEntryAnchorView.this.startAnimation(scaleAnimation2);
            }
        });
        scaleAnimation2.setAnimationListener(new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13847a;

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f13847a, false, 8290, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f13847a, false, 8290, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        });
        startAnimation(scaleAnimation);
    }

    public FansClubEntryAnchorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public FansClubEntryAnchorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
