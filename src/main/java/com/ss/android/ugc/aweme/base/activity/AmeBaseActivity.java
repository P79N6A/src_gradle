package com.ss.android.ugc.aweme.base.activity;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.a.a;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.C0906R;

public abstract class AmeBaseActivity extends AmeSSActivity {
    public static ChangeQuickRedirect h;
    protected int i;
    protected int j;
    protected boolean k;
    protected BaseAppData l;
    protected View m;
    protected View n;
    protected TextView o;
    protected TextView p;
    protected TextView q;
    protected ProgressBar r;
    protected View s;
    protected SwipeOverlayFrameLayout t;

    public int a() {
        return C0906R.layout.mr;
    }

    public int e() {
        return 0;
    }

    public int f() {
        return C0906R.color.j1;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 24066, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 24066, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (PatchProxy.isSupport(new Object[0], this, h, false, 24067, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 24067, new Class[0], Void.TYPE);
            return;
        }
        boolean a2 = a.a();
        if (this.k != a2) {
            this.k = a2;
            g();
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 24064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 24064, new Class[0], Void.TYPE);
            return;
        }
        this.i = e();
        if (!(this.i == 1 || this.i == 2)) {
            this.i = 0;
        }
        this.m = findViewById(C0906R.id.ci4);
        this.n = findViewById(C0906R.id.d3m);
        this.s = findViewById(C0906R.id.bqt);
        if (this.n != null) {
            this.o = (TextView) this.n.findViewById(C0906R.id.iu);
            this.p = (TextView) this.n.findViewById(C0906R.id.cex);
            this.q = (TextView) this.n.findViewById(C0906R.id.title);
            this.r = (ProgressBar) this.n.findViewById(C0906R.id.cet);
        }
        if (this.o != null) {
            this.o.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34485a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f34485a, false, 24072, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f34485a, false, 24072, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    AmeBaseActivity ameBaseActivity = AmeBaseActivity.this;
                    if (PatchProxy.isSupport(new Object[0], ameBaseActivity, AmeBaseActivity.h, false, 24065, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], ameBaseActivity, AmeBaseActivity.h, false, 24065, new Class[0], Void.TYPE);
                        return;
                    }
                    ameBaseActivity.onBackPressed();
                }
            });
        }
        View findViewById = findViewById(C0906R.id.cxy);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.t = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.t != null) {
            this.t.setOnSwipeListener(new SwipeOverlayFrameLayout.OnSwipeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34487a;

                public final boolean onSwipeLeft() {
                    if (!PatchProxy.isSupport(new Object[0], this, f34487a, false, 24074, new Class[0], Boolean.TYPE)) {
                        return false;
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34487a, false, 24074, new Class[0], Boolean.TYPE)).booleanValue();
                }

                public final boolean onSwipeRight() {
                    if (PatchProxy.isSupport(new Object[0], this, f34487a, false, 24073, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34487a, false, 24073, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    AmeBaseActivity.this.onBackPressed();
                    return true;
                }
            });
        }
    }

    public void g() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 24068, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 24068, new Class[0], Void.TYPE);
        } else if (this.i != 1) {
            if (this.i == 2) {
                if (this.s != null) {
                    if (this.k) {
                        this.s.setVisibility(0);
                        return;
                    }
                    this.s.setVisibility(8);
                }
                return;
            }
            Resources resources = getResources();
            boolean z = this.k;
            if (z) {
                i2 = C0906R.color.j2;
            } else {
                i2 = f();
            }
            if (z) {
                i3 = 2130838254;
            } else {
                i3 = 2130838252;
            }
            if (z) {
                i4 = C0906R.color.a7a;
            } else {
                i4 = C0906R.color.a7_;
            }
            if (z) {
                i5 = 2130838306;
            } else {
                i5 = 2130838305;
            }
            if (z) {
                i6 = 2130838300;
            } else {
                i6 = 2130838299;
            }
            if (z) {
                i7 = C0906R.color.ds;
            } else {
                i7 = C0906R.color.dr;
            }
            ColorStateList colorStateList = resources.getColorStateList(i7);
            if (this.m != null) {
                this.m.setBackgroundResource(i2);
            }
            if (this.q != null) {
                this.q.setTextColor(resources.getColor(i4));
            }
            if (this.n != null) {
                this.n.setBackgroundResource(i3);
            }
            if (this.o != null) {
                UIUtils.setViewBackgroundWithPadding((View) this.o, i5);
                this.o.setTextColor(colorStateList);
                this.o.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                this.o.setCompoundDrawablesWithIntrinsicBounds(i6, 0, 0, 0);
            }
            if (this.p != null) {
                UIUtils.setViewBackgroundWithPadding((View) this.p, i5);
                this.p.setTextColor(colorStateList);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, h, false, 24061, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, h, false, 24061, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.q.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, h, false, 24062, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, h, false, 24062, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.j = 0;
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, h, false, 24063, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 24063, new Class[0], Void.TYPE);
        } else {
            supportRequestWindowFeature(10);
        }
        setContentView(a());
        this.l = BaseAppData.a();
        b();
    }
}
