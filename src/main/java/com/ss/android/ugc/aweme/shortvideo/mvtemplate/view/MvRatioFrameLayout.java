package com.ss.android.ugc.aweme.shortvideo.mvtemplate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class MvRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68730a;

    /* renamed from: b  reason: collision with root package name */
    private float f68731b = 0.5625f;

    public void setRatio(float f2) {
        this.f68731b = f2;
    }

    public MvRatioFrameLayout(Context context) {
        super(context);
    }

    public MvRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f68730a, false, 78110, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f68730a, false, 78110, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f68731b != 0.0f) {
            i3 = View.MeasureSpec.makeMeasureSpec((int) (((float) size) * this.f68731b), 1073741824);
        } else {
            i3 = i;
        }
        super.onMeasure(i3, i2);
    }
}
