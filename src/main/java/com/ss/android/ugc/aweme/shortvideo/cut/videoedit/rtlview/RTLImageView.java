package com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;

public class RTLImageView extends AutoRTLImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66594a;

    /* renamed from: b  reason: collision with root package name */
    private int f66595b;

    public float getLeftX() {
        if (!PatchProxy.isSupport(new Object[0], this, f66594a, false, 76009, new Class[0], Float.TYPE)) {
            return super.getX();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f66594a, false, 76009, new Class[0], Float.TYPE)).floatValue();
    }

    public float getStartX() {
        if (PatchProxy.isSupport(new Object[0], this, f66594a, false, 76011, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f66594a, false, 76011, new Class[0], Float.TYPE)).floatValue();
        } else if (ViewCompat.getLayoutDirection(this) == 1) {
            return (((float) this.f66595b) - super.getX()) - ((float) getMeasuredWidth());
        } else {
            return super.getX();
        }
    }

    public RTLImageView(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[0], this, f66594a, false, 76008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66594a, false, 76008, new Class[0], Void.TYPE);
            return;
        }
        this.f66595b = p.b(v.a(getContext()));
    }

    public void setLeftX(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66594a, false, 76010, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66594a, false, 76010, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        super.setX(f2);
    }

    public void setStartX(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66594a, false, 76012, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66594a, false, 76012, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (ViewCompat.getLayoutDirection(this) == 1) {
            super.setX((((float) this.f66595b) - f2) - ((float) getMeasuredWidth()));
        } else {
            super.setX(f2);
        }
    }
}
