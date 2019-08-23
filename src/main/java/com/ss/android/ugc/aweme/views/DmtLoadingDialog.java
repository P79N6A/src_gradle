package com.ss.android.ugc.aweme.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;

public class DmtLoadingDialog extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76319a;

    /* renamed from: b  reason: collision with root package name */
    public Unbinder f76320b;

    /* renamed from: c  reason: collision with root package name */
    private String f76321c;
    @BindView(2131495644)
    DmtTextView mContent;
    @BindView(2131495701)
    LinearLayout mMainLayout;
    @BindView(2131496502)
    ProgressBar mProgressbar;

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f76319a, false, 89450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76319a, false, 89450, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        ObjectAnimator.ofFloat(this.mMainLayout, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f76319a, false, 89452, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76319a, false, 89452, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, f.f76461a, true, 89454, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, f.f76461a, true, 89454, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        ObjectAnimator.ofFloat(this.mMainLayout, "alpha", new float[]{this.mMainLayout.getAlpha(), 0.0f}).setDuration(300).addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76322a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f76322a, false, 89453, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f76322a, false, 89453, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (DmtLoadingDialog.this.f76320b != null) {
                    DmtLoadingDialog.this.f76320b.unbind();
                }
            }
        });
    }

    public DmtLoadingDialog(@NonNull Context context) {
        super(context, C0906R.style.fk);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f76319a, false, 89451, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f76319a, false, 89451, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.im);
        this.f76320b = ButterKnife.bind((Dialog) this);
        this.mProgressbar.getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(getContext(), C0906R.color.vf), PorterDuff.Mode.MULTIPLY);
        setCanceledOnTouchOutside(false);
        if (!TextUtils.isEmpty(this.f76321c)) {
            UIUtils.setText(this.mContent, this.f76321c);
        }
    }

    public DmtLoadingDialog(@NonNull Context context, String str) {
        this(context);
        this.f76321c = str;
    }
}
