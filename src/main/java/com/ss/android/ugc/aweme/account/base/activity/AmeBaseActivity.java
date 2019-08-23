package com.ss.android.ugc.aweme.account.base.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public abstract class AmeBaseActivity extends AmeSSActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f31690b;

    /* renamed from: c  reason: collision with root package name */
    protected int f31691c;

    /* renamed from: d  reason: collision with root package name */
    protected int f31692d;

    /* renamed from: e  reason: collision with root package name */
    protected View f31693e;

    /* renamed from: f  reason: collision with root package name */
    protected View f31694f;
    public TextView g;
    public TextView h;
    public TextView i;
    protected ProgressBar j;
    protected View k;
    protected SwipeOverlayFrameLayout l;

    public int a() {
        return C0906R.layout.mr;
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f31690b, false, 19660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31690b, false, 19660, new Class[0], Void.TYPE);
            return;
        }
        this.f31691c = 0;
        if (!(this.f31691c == 1 || this.f31691c == 2)) {
            this.f31691c = 0;
        }
        this.f31693e = findViewById(C0906R.id.ci4);
        this.f31694f = findViewById(C0906R.id.d3m);
        this.k = findViewById(C0906R.id.bqt);
        if (this.f31694f != null) {
            this.g = (TextView) this.f31694f.findViewById(C0906R.id.iu);
            this.h = (TextView) this.f31694f.findViewById(C0906R.id.cex);
            this.i = (TextView) this.f31694f.findViewById(C0906R.id.title);
            this.j = (ProgressBar) this.f31694f.findViewById(C0906R.id.cet);
        }
        if (this.g != null) {
            this.g.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f31695a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f31695a, false, 19666, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f31695a, false, 19666, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    AmeBaseActivity ameBaseActivity = AmeBaseActivity.this;
                    if (PatchProxy.isSupport(new Object[0], ameBaseActivity, AmeBaseActivity.f31690b, false, 19661, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], ameBaseActivity, AmeBaseActivity.f31690b, false, 19661, new Class[0], Void.TYPE);
                        return;
                    }
                    ameBaseActivity.onBackPressed();
                }
            });
        }
        View findViewById = findViewById(C0906R.id.cxy);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.l = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.l != null) {
            this.l.setOnSwipeListener(new SwipeOverlayFrameLayout.OnSwipeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f31697a;

                public final boolean onSwipeLeft() {
                    if (!PatchProxy.isSupport(new Object[0], this, f31697a, false, 19668, new Class[0], Boolean.TYPE)) {
                        return false;
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f31697a, false, 19668, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final boolean onSwipeRight() {
                    if (PatchProxy.isSupport(new Object[0], this, f31697a, false, 19667, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f31697a, false, 19667, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    AmeBaseActivity.this.onBackPressed();
                    return true;
                }
            });
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f31690b, false, 19657, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f31690b, false, 19657, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f31690b, false, 19658, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f31690b, false, 19658, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.f31692d = 0;
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f31690b, false, 19659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31690b, false, 19659, new Class[0], Void.TYPE);
        } else {
            supportRequestWindowFeature(10);
        }
        setContentView(a());
        c();
    }
}
