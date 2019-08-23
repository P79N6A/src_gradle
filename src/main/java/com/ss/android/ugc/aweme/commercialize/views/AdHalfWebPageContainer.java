package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

public class AdHalfWebPageContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39874a = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f39875d = "AdHalfWebPageContainer";

    /* renamed from: b  reason: collision with root package name */
    public boolean f39876b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f39877c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39874a, false, 32751, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39874a, false, 32751, new Class[0], Void.TYPE);
            return;
        }
        setAlpha(0.0f);
        setVisibility(8);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f39874a, false, 32754, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39874a, false, 32754, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getTranslationX() >= 0.0f && getAlpha() == 1.0f) {
            z = true;
        }
        return z;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f39874a, false, 32755, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39874a, false, 32755, new Class[0], Void.TYPE);
            return;
        }
        setAlpha(1.0f);
        setVisibility(0);
    }

    public AdHalfWebPageContainer(Context context) {
        this(context, null);
    }

    public static boolean a(Aweme aweme) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39874a, true, 32757, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39874a, true, 32757, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        CardStruct m = c.m(aweme);
        if (m == null) {
            return false;
        }
        if (m.getCardStyle() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (m.getCardType() == 2 || m.getCardType() == 3 || m.getCardType() == 10) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public void setInCleanMode(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39874a, false, 32756, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39874a, false, 32756, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f39877c = z;
        if (z) {
            i = 4;
        }
        setVisibility(i);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39874a, false, 32752, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39874a, false, 32752, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            animate().alpha(0.0f).withStartAction(new e(this)).setDuration(200).withEndAction(new f(this)).start();
        } else {
            a(200, getTranslationX(), (float) (-(getWidth() + ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin)), 0.0f, 0.0f);
            animate().alpha(0.0f).withStartAction(new g(this)).setDuration(200).withEndAction(new h(this)).start();
        }
    }

    public AdHalfWebPageContainer(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdHalfWebPageContainer(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAlpha(0.0f);
    }

    public final void a(long j, int i, int i2, int i3) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f39874a, false, 32753, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f39874a, false, 32753, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(j, getTranslationX(), (float) (i2 - getLeft()), getTranslationY(), (float) (((i3 - getTop()) + i) - getHeight()));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getHeight(), i});
        ofInt.addUpdateListener(new i(this, layoutParams));
        ofInt.setDuration(j2).start();
    }

    public final void a(long j, float f2, float f3, float f4, float f5) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f39874a, false, 32749, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f39874a, false, 32749, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", new float[]{f2, f3});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "translationY", new float[]{f4, f5});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j2);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
