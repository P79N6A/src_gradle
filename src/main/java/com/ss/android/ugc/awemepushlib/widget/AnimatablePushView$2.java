package com.ss.android.ugc.awemepushlib.widget;

import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class AnimatablePushView$2 extends ViewDragHelper.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77094a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f77095b;

    public int clampViewPositionHorizontal(View view, int i, int i2) {
        return i;
    }

    AnimatablePushView$2(a aVar) {
        this.f77095b = aVar;
    }

    public int getViewHorizontalDragRange(View view) {
        if (!PatchProxy.isSupport(new Object[]{view}, this, f77094a, false, 90441, new Class[]{View.class}, Integer.TYPE)) {
            return view.getWidth();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f77094a, false, 90441, new Class[]{View.class}, Integer.TYPE)).intValue();
    }

    public boolean tryCaptureView(View view, int i) {
        if (view == this.f77095b.f77099d) {
            return true;
        }
        return false;
    }

    public void onViewReleased(View view, float f2, float f3) {
        int i;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f77094a, false, 90442, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f77094a, false, 90442, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (Math.abs(f2) > ((float) (this.f77095b.f77098c.getScaledMaximumFlingVelocity() / 5)) || ((float) Math.abs(view.getLeft())) >= ((float) this.f77095b.getWidth()) * 0.2f) {
            ViewDragHelper viewDragHelper = this.f77095b.f77097b;
            if (f2 > 0.0f) {
                i = this.f77095b.getWidth();
            } else {
                i = -this.f77095b.getWidth();
            }
            viewDragHelper.smoothSlideViewTo(view, i, 0);
            this.f77095b.a(this.f77095b.f77101f);
            this.f77095b.f77100e.postDelayed(this.f77095b.o, 300);
        } else {
            this.f77095b.f77097b.smoothSlideViewTo(view, 0, 0);
            this.f77095b.f77100e.postDelayed(this.f77095b.n, 5000);
        }
        this.f77095b.postInvalidate();
    }

    public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f77094a, false, 90443, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f77094a, false, 90443, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f77095b.setAlpha(1.0f - (((float) Math.abs(i)) / ((float) this.f77095b.getWidth())));
    }
}
