package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.transition.ChangeBounds;
import android.support.transition.TransitionManager;
import android.support.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70089a;

    /* renamed from: b  reason: collision with root package name */
    private View f70090b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f70091c;

    /* renamed from: d  reason: collision with root package name */
    private int f70092d;

    /* renamed from: e  reason: collision with root package name */
    private int f70093e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f70094f = true;
    private FrameLayout g;
    private final int h;

    public final void a(boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70089a, false, 79357, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70089a, false, 79357, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
        if (this.f70094f) {
            this.f70092d = this.g.getMeasuredWidth();
            this.f70091c.measure(0, 0);
            this.f70093e = this.f70091c.getMeasuredWidth();
            this.f70094f = false;
        }
        if (z) {
            i = this.f70092d - (this.f70093e + this.h);
        } else {
            i = -1;
        }
        layoutParams.width = i;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds().addTarget((View) this.g).addTarget((View) this.f70091c));
        transitionSet.setInterpolator((TimeInterpolator) new AccelerateInterpolator());
        transitionSet.setDuration(300);
        TransitionManager.beginDelayedTransition((ViewGroup) this.f70090b, transitionSet);
        this.g.setLayoutParams(layoutParams);
    }

    public m(Context context, View view, TextView textView) {
        this.f70090b = view;
        this.f70091c = textView;
        this.g = (FrameLayout) this.f70090b.findViewById(C0906R.id.cge);
        this.h = (int) UIUtils.dip2Px(context, 16.0f);
    }
}
