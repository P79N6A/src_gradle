package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LiveEndTriangleView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18235a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f18236b;

    /* renamed from: c  reason: collision with root package name */
    private Path f18237c;

    public LiveEndTriangleView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18235a, false, 14450, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18235a, false, 14450, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        this.f18237c.moveTo(0.0f, (float) getMeasuredHeight());
        this.f18237c.lineTo((float) getMeasuredWidth(), (float) getMeasuredHeight());
        this.f18237c.lineTo((float) (getMeasuredWidth() / 2), 0.0f);
        this.f18237c.close();
        canvas.drawPath(this.f18237c, this.f18236b);
    }

    public LiveEndTriangleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveEndTriangleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f18235a, false, 14449, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18235a, false, 14449, new Class[0], Void.TYPE);
            return;
        }
        this.f18236b = new Paint();
        this.f18236b.setAntiAlias(true);
        this.f18236b.setStyle(Paint.Style.FILL);
        this.f18236b.setColor(Color.parseColor("#14ffffff"));
        this.f18237c = new Path();
    }
}
