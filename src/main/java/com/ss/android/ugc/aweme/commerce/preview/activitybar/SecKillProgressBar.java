package com.ss.android.ugc.aweme.commerce.preview.activitybar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/SecKillProgressBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBgColor", "mCorner", "mPaint", "Landroid/graphics/Paint;", "mPath", "Landroid/graphics/Path;", "mPgColor", "mProgress", "mRectF", "Landroid/graphics/RectF;", "offset", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setProgress", "value", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SecKillProgressBar extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37292a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37293b;

    /* renamed from: c  reason: collision with root package name */
    private final int f37294c;

    /* renamed from: d  reason: collision with root package name */
    private final int f37295d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f37296e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f37297f;
    private final Path g;
    private int h;
    private final int i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SecKillProgressBar(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setProgress(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f37292a, false, 28847, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f37292a, false, 28847, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 >= 0 && i2 <= 100 && this.h != i2) {
            this.h = i2;
            invalidate();
        }
    }

    public final void onDraw(@Nullable Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f37292a, false, 28848, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f37292a, false, 28848, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.save();
        }
        this.f37297f.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.g.reset();
        this.g.addRoundRect(this.f37297f, (float) this.f37293b, (float) this.f37293b, Path.Direction.CW);
        if (canvas != null) {
            canvas.clipPath(this.g);
        }
        this.f37296e.setColor(this.f37294c);
        if (canvas != null) {
            canvas.drawRoundRect(this.f37297f, (float) this.f37293b, (float) this.f37293b, this.f37296e);
        }
        this.f37296e.setColor(this.f37295d);
        this.g.reset();
        this.g.lineTo(0.0f, 0.0f);
        this.g.lineTo((((float) getWidth()) * (((float) this.h) / 100.0f)) + ((float) this.i), 0.0f);
        this.g.lineTo((((float) getWidth()) * (((float) this.h) / 100.0f)) - ((float) this.i), (float) getHeight());
        this.g.lineTo(0.0f, (float) getHeight());
        this.g.close();
        if (canvas != null) {
            canvas.drawPath(this.g, this.f37296e);
        }
        if (canvas != null) {
            canvas.restore();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SecKillProgressBar(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecKillProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f37296e = new Paint();
        this.f37296e.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SecKillProgressBar);
        this.f37293b = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f37294c = obtainStyledAttributes.getColor(0, 0);
        this.f37295d = obtainStyledAttributes.getColor(3, 0);
        this.h = obtainStyledAttributes.getInteger(2, 0);
        obtainStyledAttributes.recycle();
        this.f37297f = new RectF();
        this.g = new Path();
        this.i = (int) UIUtils.dip2Px(context, 2.0f);
    }
}
