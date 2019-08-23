package com.ss.android.ugc.aweme.utils;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75506a;

    public static void a(ViewGroup viewGroup, ImageView imageView, TextView textView, int i, int i2, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        int i3;
        int i4;
        int i5;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ViewGroup viewGroup2 = viewGroup;
        ImageView imageView2 = imageView;
        TextView textView2 = textView;
        boolean z3 = z2;
        AnimatorListenerAdapter animatorListenerAdapter2 = animatorListenerAdapter;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, imageView2, textView2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), animatorListenerAdapter2}, null, f75506a, true, 88082, new Class[]{ViewGroup.class, ImageView.class, TextView.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, AnimatorListenerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, imageView2, textView2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Byte.valueOf(z2), animatorListenerAdapter2}, null, f75506a, true, 88082, new Class[]{ViewGroup.class, ImageView.class, TextView.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, AnimatorListenerAdapter.class}, Void.TYPE);
            return;
        }
        if (z3) {
            i3 = (int) UIUtils.dip2Px(imageView.getContext(), 20.0f);
        } else {
            i3 = (int) imageView.getResources().getDimension(C0906R.dimen.fy);
        }
        if (z3) {
            i4 = (int) UIUtils.dip2Px(imageView.getContext(), 12.0f);
        } else {
            i4 = (int) UIUtils.dip2Px(imageView.getContext(), 0.0f);
        }
        int i6 = -180;
        if (z) {
            i5 = 0;
        } else {
            i5 = -180;
        }
        if (!z) {
            i6 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, "rotation", new float[]{(float) i5, (float) i6});
        if (z) {
            valueAnimator = ValueAnimator.ofInt(new int[]{i3, i4});
        } else {
            valueAnimator = ValueAnimator.ofInt(new int[]{i4, i3});
        }
        if (z) {
            valueAnimator2 = ValueAnimator.ofInt(new int[]{i2, i});
        } else {
            valueAnimator2 = ValueAnimator.ofInt(new int[]{i, i2});
        }
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new al(viewGroup2, z3));
        valueAnimator2.addUpdateListener(new am(textView2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(valueAnimator).with(valueAnimator2);
        animatorSet.addListener(animatorListenerAdapter2);
        animatorSet.setDuration(400);
        animatorSet.start();
    }
}
