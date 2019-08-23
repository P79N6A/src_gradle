package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.n;

public class StripAdBottomLabelView extends l {
    public static ChangeQuickRedirect l;
    public View m;
    private int n;
    private Runnable o;

    /* access modifiers changed from: package-private */
    public int getLayoutId() {
        return C0906R.layout.abd;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void u() {
        g.q(getContext(), this.j);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, l, false, 32998, new Class[0], Boolean.TYPE)) {
            return c.E(this.j);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 32998, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 33006, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 33006, new Class[0], Void.TYPE);
            return;
        }
        super.i();
        this.f40119e.setText(C0906R.string.a7s);
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 33008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 33008, new Class[0], Void.TYPE);
            return;
        }
        super.n();
        int showSeconds = getShowSeconds();
        if (this.o == null) {
            this.o = new x(this);
        }
        postDelayed(this.o, (long) (showSeconds - 100));
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 33009, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 33009, new Class[0], Void.TYPE);
            return;
        }
        super.o();
        if (this.o != null) {
            removeCallbacks(this.o);
        }
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 33005, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 33005, new Class[0], Void.TYPE);
            return;
        }
        d();
        com.ss.android.ugc.aweme.utils.c.a((View) this, getBackGroundColor(), this.n, 300);
        com.ss.android.ugc.aweme.utils.c.a(this.m, getBackGroundColor(), this.n, 300);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 32997, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 32997, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.j == null || !this.j.isAd() || this.j.getAwemeRawAd().getButtonStyle() != 0 || TextUtils.isEmpty(this.j.getAwemeRawAd().getWebUrl())) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 32999, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 32999, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.j == null || this.j.getAwemeRawAd() == null || this.j.getAwemeRawAd().getAnimationType() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 33007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 33007, new Class[0], Void.TYPE);
            return;
        }
        super.h();
        this.f40119e.setText("");
        this.f40118d.setVisibility(0);
        this.f40118d.setText(C0906R.string.b10);
        this.f40118d.setTextColor(ContextCompat.getColor(getContext(), C0906R.color.ao4));
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 33004, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 33004, new Class[0], Void.TYPE);
            return;
        }
        d();
        com.ss.android.ugc.aweme.utils.c.a((View) this, getBackGroundColor(), getDefaultColor(), 300);
        com.ss.android.ugc.aweme.utils.c.a(this.m, getBackGroundColor(), getDefaultColor(), 300);
    }

    public final void r() {
        boolean z;
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 33003, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 33003, new Class[0], Void.TYPE);
        } else if (!a()) {
            setLabelVisibility(8);
        } else {
            d();
            setLabelVisibility(0);
            if (b()) {
                this.n = Color.parseColor(c.C(this.j));
                i2 = getDefaultColor();
                ao.a((View) this, (Runnable) new w(this));
                i = 0;
                z = true;
            } else {
                this.n = getContext().getResources().getColor(C0906R.color.ry);
                i2 = this.n;
                i = getResources().getDimensionPixelOffset(C0906R.dimen.bk);
                z = false;
            }
            a(i2, 0);
            n.a(this, i, 0, z);
            n.a(this.m, i, 0, z);
        }
    }

    public StripAdBottomLabelView(Context context) {
        this(context, null);
    }

    public void setBackgroundColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, l, false, 33002, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, l, false, 33002, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i, 0);
    }

    /* access modifiers changed from: package-private */
    public void setLabelVisibility(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, l, false, 33000, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, l, false, 33000, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setVisibility(i);
        if (this.m != null) {
            this.m.setVisibility(i);
        }
    }

    public StripAdBottomLabelView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, l, false, 33001, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, l, false, 33001, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i2 > 0) {
            com.ss.android.ugc.aweme.utils.c.a((View) this, getBackGroundColor(), i, (long) i2);
        } else {
            super.setBackgroundColor(i);
            if (this.m != null) {
                this.m.setBackgroundColor(i);
            }
            float f2 = 1.0f;
            if (i == getDefaultColor()) {
                f2 = 0.6f;
            }
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).setAlpha(f2);
            }
        }
    }

    public StripAdBottomLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setDefaultColor(ContextCompat.getColor(context, C0906R.color.a0o));
    }
}
