package com.ss.android.ugc.aweme.account.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;

public class DmtLoadingDialog extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33132a;

    /* renamed from: b  reason: collision with root package name */
    public Unbinder f33133b;
    @BindView(2131493195)
    LinearLayout mMainLayout;
    @BindView(2131493259)
    ProgressBar mProgressbar;

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f33132a, false, 21463, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33132a, false, 21463, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        ObjectAnimator.ofFloat(this.mMainLayout, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f33132a, false, 21465, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33132a, false, 21465, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, a.f33163a, true, 21467, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, a.f33163a, true, 21467, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        ObjectAnimator.ofFloat(this.mMainLayout, "alpha", new float[]{this.mMainLayout.getAlpha(), 0.0f}).setDuration(300).addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33134a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f33134a, false, 21466, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f33134a, false, 21466, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (DmtLoadingDialog.this.f33133b != null) {
                    DmtLoadingDialog.this.f33133b.unbind();
                }
            }
        });
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f33132a, false, 21464, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f33132a, false, 21464, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.im);
        this.f33133b = ButterKnife.bind((Dialog) this);
        this.mProgressbar.getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(getContext(), C0906R.color.vf), PorterDuff.Mode.MULTIPLY);
        setCanceledOnTouchOutside(false);
    }
}
