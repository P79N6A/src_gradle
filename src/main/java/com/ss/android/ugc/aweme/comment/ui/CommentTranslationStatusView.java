package com.ss.android.ugc.aweme.comment.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class CommentTranslationStatusView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36493a;

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f36494b;

    /* renamed from: c  reason: collision with root package name */
    private ObjectAnimator f36495c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36496d;

    public CommentTranslationStatusView(@NonNull Context context) {
        this(context, null);
    }

    public void setLoading(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36493a, false, 27493, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36493a, false, 27493, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f36496d != z) {
            if (z) {
                this.f36495c.start();
            } else {
                this.f36495c.cancel();
            }
            if (!z) {
                i = 8;
            }
            setVisibility(i);
            this.f36496d = z;
        }
    }

    public CommentTranslationStatusView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommentTranslationStatusView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DmtTextView dmtTextView;
        if (PatchProxy.isSupport(new Object[0], this, f36493a, false, 27489, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36493a, false, 27489, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f36493a, false, 27491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36493a, false, 27491, new Class[0], Void.TYPE);
        } else {
            this.f36494b = new LinearLayout(getContext());
            this.f36494b.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            this.f36494b.setOrientation(0);
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2130839405);
            this.f36495c = ObjectAnimator.ofFloat(imageView, "rotation", new float[]{0.0f, 360.0f}).setDuration(800);
            this.f36495c.setInterpolator(new LinearInterpolator());
            this.f36495c.setRepeatCount(-1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            imageView.setLayoutParams(layoutParams);
            this.f36494b.addView(imageView);
            if (PatchProxy.isSupport(new Object[0], this, f36493a, false, 27492, new Class[0], DmtTextView.class)) {
                dmtTextView = (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, f36493a, false, 27492, new Class[0], DmtTextView.class);
            } else {
                dmtTextView = new DmtTextView(getContext());
                dmtTextView.setTextSize(13.0f);
                dmtTextView.setTextColor(getContext().getResources().getColor(C0906R.color.a75));
            }
            dmtTextView.setText(C0906R.string.wf);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = (int) UIUtils.dip2Px(getContext(), 1.0f);
            layoutParams2.gravity = 16;
            dmtTextView.setLayoutParams(layoutParams2);
            this.f36494b.addView(dmtTextView);
        }
        addView(this.f36494b);
        if (PatchProxy.isSupport(new Object[0], this, f36493a, false, 27490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36493a, false, 27490, new Class[0], Void.TYPE);
            return;
        }
        setLoading(false);
    }
}
