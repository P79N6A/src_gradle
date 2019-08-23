package com.ss.android.sdk.activity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.C0906R;

public class BaseActivity extends SSActivity {

    /* renamed from: a  reason: collision with root package name */
    protected int f30609a;

    /* renamed from: b  reason: collision with root package name */
    protected int f30610b;

    /* renamed from: c  reason: collision with root package name */
    protected BaseAppData f30611c;

    /* renamed from: d  reason: collision with root package name */
    protected View f30612d;

    /* renamed from: e  reason: collision with root package name */
    protected View f30613e;

    /* renamed from: f  reason: collision with root package name */
    protected TextView f30614f;
    protected TextView g;
    protected TextView h;
    protected ProgressBar i;
    protected View j;
    protected SwipeOverlayFrameLayout k;

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.f30613e != null) {
            this.f30613e.setVisibility(0);
            if (this.k != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                this.k.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (this.f30613e != null) {
            this.f30613e.setVisibility(8);
            if (this.k != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                this.k.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (this.h != null) {
            this.h.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f30610b = 0;
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView((int) C0906R.layout.mr);
        this.f30611c = BaseAppData.a();
        this.f30609a = 0;
        if (!(this.f30609a == 1 || this.f30609a == 2)) {
            this.f30609a = 0;
        }
        this.f30612d = findViewById(C0906R.id.ci4);
        this.f30613e = findViewById(C0906R.id.d3m);
        this.j = findViewById(C0906R.id.bqt);
        if (this.f30613e != null) {
            this.f30614f = (TextView) this.f30613e.findViewById(C0906R.id.iu);
            this.g = (TextView) this.f30613e.findViewById(C0906R.id.cex);
            this.h = (TextView) this.f30613e.findViewById(C0906R.id.title);
            this.i = (ProgressBar) this.f30613e.findViewById(C0906R.id.cet);
        }
        if (this.f30614f != null) {
            TextView textView = this.f30614f;
            if (Build.VERSION.SDK_INT >= 19) {
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
            this.f30614f.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    BaseActivity.this.onBackPressed();
                }
            });
        }
        View findViewById = findViewById(C0906R.id.cxy);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.k = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.k != null) {
            this.k.setOnSwipeListener(new SwipeOverlayFrameLayout.OnSwipeListener() {
                public final boolean onSwipeLeft() {
                    return false;
                }

                public final boolean onSwipeRight() {
                    BaseActivity.this.onBackPressed();
                    return true;
                }
            });
        }
    }
}
