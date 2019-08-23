package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.n;

public class ButtonAdBottomLabelView extends l {
    public static ChangeQuickRedirect l;

    /* access modifiers changed from: package-private */
    public int getLayoutId() {
        return C0906R.layout.aat;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void s() {
        g.q(getContext(), this.j);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, l, false, 32828, new Class[0], Boolean.TYPE)) {
            return c.E(this.j);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 32828, new Class[0], Boolean.TYPE)).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 32827, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 32827, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.j == null || !this.j.isAd() || this.j.getAwemeRawAd().getButtonStyle() != 1 || TextUtils.isEmpty(this.j.getAwemeRawAd().getWebUrl())) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 32829, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 32829, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.j == null || this.j.getAwemeRawAd() == null || (this.j.getAwemeRawAd().getAnimationType() != 1 && this.j.getAwemeRawAd().getAnimationType() != 3)) {
            return false;
        } else {
            return true;
        }
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 32832, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 32832, new Class[0], Void.TYPE);
        } else if (a()) {
            d();
            if (b()) {
                n.a(this, 0, 0, true);
                ao.a((View) this, (Runnable) new p(this));
            } else {
                n.a(this, getResources().getDimensionPixelOffset(C0906R.dimen.k7), 0, false);
            }
            int defaultColor = getDefaultColor();
            if (!c()) {
                defaultColor = Color.parseColor(c.C(this.j));
            }
            a(defaultColor, 0);
        }
    }

    public ButtonAdBottomLabelView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public void setLabelVisibility(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, l, false, 32830, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, l, false, 32830, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setVisibility(i);
    }

    public ButtonAdBottomLabelView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, l, false, 32831, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, l, false, 32831, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(UIUtils.dip2Px(getContext(), 4.0f));
        if (i3 == 0) {
            gradientDrawable.setColor(i);
            setBackground(gradientDrawable);
            return;
        }
        gradientDrawable.setColor(getBackGroundColor());
        com.ss.android.ugc.aweme.utils.c.a(this, gradientDrawable, getBackGroundColor(), i, (long) i3);
    }

    public ButtonAdBottomLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setDefaultColor(ContextCompat.getColor(context, C0906R.color.a22));
    }
}
