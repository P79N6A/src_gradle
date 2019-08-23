package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LoadLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40390a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f40391b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f40392c;

    /* renamed from: d  reason: collision with root package name */
    private Animation f40393d;

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f40390a, false, 33628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40390a, false, 33628, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.f40391b = (ImageView) findViewById(C0906R.id.bjf);
        this.f40392c = (TextView) findViewById(C0906R.id.bji);
        this.f40393d = AnimationUtils.loadAnimation(getContext(), C0906R.anim.cf);
    }

    public LoadLayout(Context context) {
        this(context, null);
    }

    public void setLoadingText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f40390a, false, 33633, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f40390a, false, 33633, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f40392c.setText(str2);
    }

    public void setLoadingText(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40390a, false, 33632, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40390a, false, 33632, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f40392c.setText(i);
    }

    public void setLoadingViewSize(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40390a, false, 33630, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40390a, false, 33630, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i2 = i;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        this.f40391b.setLayoutParams(layoutParams);
    }

    public void setVisibility(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40390a, false, 33629, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40390a, false, 33629, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setVisibility(i);
        if (i == 0) {
            this.f40391b.startAnimation(this.f40393d);
        } else {
            this.f40391b.clearAnimation();
        }
    }

    public LoadLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
