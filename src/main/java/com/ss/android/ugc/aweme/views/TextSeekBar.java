package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TextSeekBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76421a;

    /* renamed from: b  reason: collision with root package name */
    private DmtTextView f76422b;

    /* renamed from: c  reason: collision with root package name */
    private SeekBar f76423c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f76424d = true;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76421a, false, 89671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76421a, false, 89671, new Class[0], Void.TYPE);
            return;
        }
        int paddingLeft = this.f76423c.getPaddingLeft();
        int measuredWidth = (this.f76423c.getMeasuredWidth() - paddingLeft) - this.f76423c.getPaddingRight();
        int progress = this.f76423c.getProgress();
        this.f76422b.setText(String.valueOf(progress));
        double d2 = (double) progress;
        Double.isNaN(d2);
        int measuredWidth2 = this.f76422b.getMeasuredWidth();
        double d3 = (double) paddingLeft;
        double d4 = (double) measuredWidth;
        Double.isNaN(d4);
        Double.isNaN(d3);
        double d5 = (double) measuredWidth2;
        Double.isNaN(d5);
        double d6 = (d3 + ((d2 / 100.0d) * d4)) - (d5 / 2.0d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f76422b.getLayoutParams());
        layoutParams.leftMargin = (int) d6;
        this.f76422b.setLayoutParams(layoutParams);
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f76421a, false, 89667, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76421a, false, 89667, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        if (PatchProxy.isSupport(new Object[0], this, f76421a, false, 89668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76421a, false, 89668, new Class[0], Void.TYPE);
            return;
        }
        this.f76422b = (DmtTextView) getChildAt(0);
        this.f76423c = (SeekBar) getChildAt(1);
    }

    public TextSeekBar(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f76421a, false, 89669, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f76421a, false, 89669, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent) {
            a();
        }
        return dispatchTouchEvent;
    }

    public TextSeekBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76421a, false, 89670, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f76421a, false, 89670, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        if (this.f76423c.getMeasuredWidth() != 0 && this.f76424d) {
            a();
            this.f76424d = false;
        }
    }
}
