package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ChoosePromotionCheckbox extends View implements View.OnClickListener, Checkable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16224a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f16225b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    private int f16226c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f16227d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f16228e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f16229f = 0;
    private int g = 0;
    private boolean h = false;
    private float i;
    private float j;
    private int k = 0;
    private a l;
    private View.OnClickListener m;

    public interface a {
    }

    public boolean isChecked() {
        return this.h;
    }

    public void toggle() {
        if (PatchProxy.isSupport(new Object[0], this, f16224a, false, 10759, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16224a, false, 10759, new Class[0], Void.TYPE);
            return;
        }
        this.h = !this.h;
        invalidate();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.l = aVar;
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.m = onClickListener;
    }

    public ChoosePromotionCheckbox(Context context) {
        super(context);
        a(context);
    }

    private void a(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f16224a, false, 10755, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f16224a, false, 10755, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        this.f16225b.setColor(this.f16228e);
        this.f16225b.setStyle(Paint.Style.STROKE);
        this.f16225b.setStrokeWidth(this.i);
        float measuredWidth = ((float) getMeasuredWidth()) / 2.0f;
        canvas.drawCircle(measuredWidth, ((float) getMeasuredHeight()) / 2.0f, measuredWidth - (this.i / 2.0f), this.f16225b);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16224a, false, 10760, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16224a, false, 10760, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (isClickable()) {
            toggle();
            if (this.m != null) {
                this.m.onClick(view);
            }
        }
    }

    public void setChecked(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f16224a, false, 10757, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f16224a, false, 10757, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.h = z;
        invalidate();
    }

    public void setNum(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f16224a, false, 10758, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f16224a, false, 10758, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.k = i2;
        invalidate();
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16224a, false, 10752, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16224a, false, 10752, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Resources resources = context.getResources();
        this.f16225b.setAntiAlias(true);
        if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
            this.f16226c = resources.getColor(C0906R.color.ll);
        } else {
            this.f16226c = resources.getColor(C0906R.color.lf);
        }
        this.f16228e = resources.getColor(C0906R.color.l3);
        this.f16227d = resources.getColor(C0906R.color.l0);
        this.f16229f = resources.getColor(C0906R.color.lm);
        this.g = resources.getColor(C0906R.color.l3);
        this.i = UIUtils.dip2Px(context, 1.0f);
        this.j = UIUtils.dip2Px(context, 13.0f);
        super.setOnClickListener(this);
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f16224a, false, 10754, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f16224a, false, 10754, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.h) {
            Paint paint = this.f16225b;
            if (isEnabled()) {
                i2 = this.f16226c;
            } else {
                i2 = this.f16227d;
            }
            paint.setColor(i2);
            float f2 = (float) measuredWidth;
            float f3 = f2 / 2.0f;
            float f4 = ((float) measuredHeight) / 2.0f;
            this.f16225b.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f3, f4, f3, this.f16225b);
            if (this.k > 0) {
                this.f16225b.setTextSize(this.j);
                Paint paint2 = this.f16225b;
                if (isEnabled()) {
                    i3 = this.f16229f;
                } else {
                    i3 = this.g;
                }
                paint2.setColor(i3);
                String valueOf = String.valueOf(this.k);
                Paint.FontMetrics fontMetrics = this.f16225b.getFontMetrics();
                canvas.drawText(valueOf, (f2 - this.f16225b.measureText(valueOf)) / 2.0f, (f4 + ((fontMetrics.descent - fontMetrics.ascent) / 2.0f)) - fontMetrics.descent, this.f16225b);
            }
            if (!isEnabled()) {
                a(canvas);
            }
        } else {
            a(canvas);
        }
        if (PatchProxy.isSupport(new Object[0], this, f16224a, false, 10756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16224a, false, 10756, new Class[0], Void.TYPE);
            return;
        }
        this.f16225b.setTextSize(0.0f);
        this.f16225b.setStyle(Paint.Style.FILL);
        this.f16225b.setStrokeWidth(0.0f);
    }

    public ChoosePromotionCheckbox(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f16224a, false, 10753, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f16224a, false, 10753, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public ChoosePromotionCheckbox(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }
}
