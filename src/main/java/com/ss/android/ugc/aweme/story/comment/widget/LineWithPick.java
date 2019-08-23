package com.ss.android.ugc.aweme.story.comment.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.R$styleable;

public class LineWithPick extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72325a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f72326b;

    /* renamed from: c  reason: collision with root package name */
    private int f72327c;

    /* renamed from: d  reason: collision with root package name */
    private int f72328d;

    /* renamed from: e  reason: collision with root package name */
    private String f72329e;

    public LineWithPick(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f72325a, false, 83074, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f72325a, false, 83074, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        this.f72327c = getWidth();
        this.f72328d = getHeight() - ((int) UIUtils.dip2Px(getContext(), 0.5f));
        int dip2Px = (int) UIUtils.dip2Px(getContext(), 38.0f);
        int dip2Px2 = dip2Px + ((int) UIUtils.dip2Px(getContext(), 6.0f));
        canvas.save();
        float dip2Px3 = (float) (dip2Px - ((int) UIUtils.dip2Px(getContext(), 6.0f)));
        canvas.drawLine(0.0f, (float) this.f72328d, dip2Px3, (float) this.f72328d, this.f72326b);
        float f2 = (float) dip2Px;
        canvas.drawLine(dip2Px3, (float) this.f72328d, f2, 0.0f, this.f72326b);
        float f3 = (float) dip2Px2;
        canvas.drawLine(f2, 0.0f, f3, (float) this.f72328d, this.f72326b);
        canvas.drawLine(f3, (float) this.f72328d, (float) this.f72327c, (float) this.f72328d, this.f72326b);
        canvas.restore();
    }

    public LineWithPick(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LineWithPick(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LineWithPick);
        this.f72329e = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        if (PatchProxy.isSupport(new Object[0], this, f72325a, false, 83073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72325a, false, 83073, new Class[0], Void.TYPE);
            return;
        }
        this.f72326b = new Paint(1);
        this.f72326b.setColor(Color.parseColor("#33161823"));
        this.f72326b.setStyle(Paint.Style.FILL);
        this.f72326b.setStrokeWidth(UIUtils.dip2Px(getContext(), 0.5f));
    }
}
