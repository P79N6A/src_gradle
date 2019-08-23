package com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.v;

public class RTLLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66596a;

    /* renamed from: b  reason: collision with root package name */
    private int f66597b;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66596a, false, 76013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66596a, false, 76013, new Class[0], Void.TYPE);
            return;
        }
        this.f66597b = p.b(v.a(getContext()));
    }

    public float getLeftX() {
        if (!PatchProxy.isSupport(new Object[0], this, f66596a, false, 76014, new Class[0], Float.TYPE)) {
            return super.getX();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f66596a, false, 76014, new Class[0], Float.TYPE)).floatValue();
    }

    public float getStartX() {
        if (PatchProxy.isSupport(new Object[0], this, f66596a, false, 76016, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f66596a, false, 76016, new Class[0], Float.TYPE)).floatValue();
        } else if (ViewCompat.getLayoutDirection(this) == 1) {
            return (((float) this.f66597b) - super.getX()) - ((float) getMeasuredWidth());
        } else {
            return super.getX();
        }
    }

    public RTLLinearLayout(Context context) {
        super(context);
        a();
    }

    public void setLeftX(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66596a, false, 76015, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66596a, false, 76015, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        super.setX(f2);
    }

    public void setStartX(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66596a, false, 76017, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66596a, false, 76017, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (ViewCompat.getLayoutDirection(this) == 1) {
            super.setX((((float) this.f66597b) - f2) - ((float) getMeasuredWidth()));
        } else {
            super.setX(f2);
        }
    }

    public RTLLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public RTLLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
