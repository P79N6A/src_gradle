package com.ss.android.ugc.aweme.account.login;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.base.SSActivity;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BaseActivity extends SSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32023a;

    /* renamed from: b  reason: collision with root package name */
    protected int f32024b;

    /* renamed from: c  reason: collision with root package name */
    protected int f32025c;

    /* renamed from: d  reason: collision with root package name */
    protected View f32026d;

    /* renamed from: e  reason: collision with root package name */
    protected View f32027e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f32028f;
    public TextView g;
    public TextView h;
    protected ProgressBar i;
    protected View j;
    protected SwipeOverlayFrameLayout k;

    public int a() {
        return C0906R.layout.mr;
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32023a, false, 20059, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32023a, false, 20059, new Class[0], Void.TYPE);
            return;
        }
        this.f32024b = 0;
        if (!(this.f32024b == 1 || this.f32024b == 2)) {
            this.f32024b = 0;
        }
        this.f32026d = findViewById(C0906R.id.ci4);
        this.f32027e = findViewById(C0906R.id.d3m);
        this.j = findViewById(C0906R.id.bqt);
        if (this.f32027e != null) {
            this.f32028f = (TextView) this.f32027e.findViewById(C0906R.id.iu);
            this.g = (TextView) this.f32027e.findViewById(C0906R.id.cex);
            this.h = (TextView) this.f32027e.findViewById(C0906R.id.title);
            this.i = (ProgressBar) this.f32027e.findViewById(C0906R.id.cet);
        }
        if (this.f32028f != null) {
            TextView textView = this.f32028f;
            if (PatchProxy.isSupport(new Object[]{textView}, this, f32023a, false, 20060, new Class[]{TextView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textView}, this, f32023a, false, 20060, new Class[]{TextView.class}, Void.TYPE);
            } else if (Build.VERSION.SDK_INT >= 19) {
                Drawable background = textView.getBackground();
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                if (background != null) {
                    background.setAutoMirrored(true);
                }
                for (Drawable drawable : compoundDrawables) {
                    if (drawable != null) {
                        drawable.setAutoMirrored(true);
                    }
                }
                for (Drawable drawable2 : compoundDrawablesRelative) {
                    if (drawable2 != null) {
                        drawable2.setAutoMirrored(true);
                    }
                }
            }
            this.f32028f.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32029a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f32029a, false, 20066, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f32029a, false, 20066, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    BaseActivity baseActivity = BaseActivity.this;
                    if (PatchProxy.isSupport(new Object[0], baseActivity, BaseActivity.f32023a, false, 20061, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], baseActivity, BaseActivity.f32023a, false, 20061, new Class[0], Void.TYPE);
                        return;
                    }
                    baseActivity.onBackPressed();
                }
            });
        }
        View findViewById = findViewById(C0906R.id.cxy);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.k = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.k != null) {
            this.k.setOnSwipeListener(new SwipeOverlayFrameLayout.OnSwipeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32031a;

                public final boolean onSwipeLeft() {
                    if (!PatchProxy.isSupport(new Object[0], this, f32031a, false, 20068, new Class[0], Boolean.TYPE)) {
                        return false;
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32031a, false, 20068, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final boolean onSwipeRight() {
                    if (PatchProxy.isSupport(new Object[0], this, f32031a, false, 20067, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32031a, false, 20067, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    BaseActivity.this.onBackPressed();
                    return true;
                }
            });
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f32023a, false, 20056, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f32023a, false, 20056, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32023a, false, 20057, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32023a, false, 20057, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.f32025c = 0;
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f32023a, false, 20058, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32023a, false, 20058, new Class[0], Void.TYPE);
        } else {
            supportRequestWindowFeature(10);
        }
        setContentView(a());
        b();
    }
}
