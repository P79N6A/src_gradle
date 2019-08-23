package com.ss.android.ugc.aweme.profile.d;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.profile.k;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61496a;

    public static void a(boolean z, RecommendCommonUserView recommendCommonUserView, View view, FrameLayout frameLayout, FrameLayout frameLayout2, View view2, View view3, View view4) {
        ValueAnimator ofFloat;
        View view5 = view;
        FrameLayout frameLayout3 = frameLayout;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), recommendCommonUserView, view5, frameLayout3, frameLayout2, view2, view3, view4}, null, f61496a, true, 70012, new Class[]{Boolean.TYPE, RecommendCommonUserView.class, View.class, FrameLayout.class, FrameLayout.class, View.class, View.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), recommendCommonUserView, view5, frameLayout3, frameLayout2, view2, view3, view4}, null, f61496a, true, 70012, new Class[]{Boolean.TYPE, RecommendCommonUserView.class, View.class, FrameLayout.class, FrameLayout.class, View.class, View.class, View.class}, Void.TYPE);
            return;
        }
        view5.measure(0, 0);
        int height = view.getHeight();
        frameLayout3.measure(0, 0);
        final int height2 = (int) (((float) (height + frameLayout.getHeight())) + UIUtils.dip2Px(i.a().getContext(), 15.0f));
        if (z) {
            ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        } else {
            ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        }
        ValueAnimator valueAnimator = ofFloat;
        valueAnimator.setDuration(300);
        final RecommendCommonUserView recommendCommonUserView2 = recommendCommonUserView;
        final View view6 = view;
        final FrameLayout frameLayout4 = frameLayout;
        final FrameLayout frameLayout5 = frameLayout2;
        final View view7 = view2;
        final View view8 = view3;
        final View view9 = view4;
        AnonymousClass1 r0 = new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61497a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f61497a, false, 70014, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f61497a, false, 70014, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RecommendCommonUserView recommendCommonUserView = recommendCommonUserView2;
                View view = view6;
                FrameLayout frameLayout = frameLayout4;
                FrameLayout frameLayout2 = frameLayout5;
                View view2 = view7;
                View view3 = view8;
                View view4 = view9;
                int i2 = height2;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(floatValue), recommendCommonUserView, view, frameLayout, frameLayout2, view2, view3, view4, Integer.valueOf(i2)}, null, v.f61496a, true, 70013, new Class[]{Float.TYPE, RecommendCommonUserView.class, View.class, FrameLayout.class, FrameLayout.class, View.class, View.class, View.class, Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr = {Float.valueOf(floatValue), recommendCommonUserView, view, frameLayout, frameLayout2, view2, view3, view4, Integer.valueOf(i2)};
                    Object[] objArr2 = objArr;
                    PatchProxy.accessDispatch(objArr2, null, v.f61496a, true, 70013, new Class[]{Float.TYPE, RecommendCommonUserView.class, View.class, FrameLayout.class, FrameLayout.class, View.class, View.class, View.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                Context context = i.a().getContext();
                int i3 = 294;
                if (AbTestManager.a().j()) {
                    if (!k.b()) {
                        i3 = 236;
                    }
                } else if (!k.b()) {
                    i3 = 260;
                }
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) recommendCommonUserView.getLayoutParams();
                layoutParams.topMargin = -((int) (((float) i2) * floatValue));
                layoutParams.height = (int) (UIUtils.dip2Px(context, (float) i3) * floatValue);
                recommendCommonUserView.setLayoutParams(layoutParams);
                float f2 = 1.0f - floatValue;
                ((LinearLayout.LayoutParams) view3.getLayoutParams()).topMargin = (int) (UIUtils.dip2Px(context, 12.0f) * f2);
                float f3 = 1.0f - (floatValue * 0.4787234f);
                if (frameLayout2 != null) {
                    frameLayout2.setScaleX(f3);
                    frameLayout2.setScaleY(f3);
                }
                if (view4 != null) {
                    view4.setScaleX(f3);
                    view4.setScaleY(f3);
                }
                float dip2Px = ((UIUtils.dip2Px(context, 94.0f) * 0.4787234f) / 2.0f) * floatValue;
                if (frameLayout2 != null) {
                    frameLayout2.setTranslationX(-dip2Px);
                }
                if (view2 != null) {
                    view2.setTranslationX(-dip2Px);
                }
                if (view4 != null) {
                    float dip2Px2 = ((UIUtils.dip2Px(context, 92.0f) * 0.4787234f) / 2.0f) * floatValue;
                    view4.setTranslationX(-dip2Px2);
                    view4.setTranslationY(dip2Px2);
                }
                view.setAlpha(f2);
                frameLayout.setAlpha(f2);
                float f4 = -floatValue;
                view.setTranslationY(UIUtils.dip2Px(context, 20.0f) * f4);
                frameLayout.setTranslationY(f4 * UIUtils.dip2Px(context, 20.0f));
            }
        };
        valueAnimator.addUpdateListener(r0);
        valueAnimator.start();
    }
}
