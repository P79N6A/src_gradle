package com.ss.android.ugc.aweme.qrcode.f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u000e\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/qrcode/view/ScanMaskView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "left", "", "top", "right", "bottom", "(Landroid/content/Context;FFFF)V", "length", "maskPaint", "Landroid/graphics/Paint;", "onAnimation", "", "scale", "onDraw", "canvas", "Landroid/graphics/Canvas;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63478a;

    /* renamed from: b  reason: collision with root package name */
    private final float f63479b;

    /* renamed from: c  reason: collision with root package name */
    private final float f63480c;

    /* renamed from: d  reason: collision with root package name */
    private final float f63481d;

    /* renamed from: e  reason: collision with root package name */
    private final float f63482e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f63483f = new Paint();
    private float g;

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f63478a, false, 70658, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f63478a, false, 70658, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.g = ((this.f63480c - this.f63479b) * (f2 - 1.0f)) / 2.0f;
        invalidate();
    }

    public final void onDraw(@NotNull Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f63478a, false, 70659, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f63478a, false, 70659, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas2, "canvas");
        this.f63483f.setColor(getResources().getColor(C0906R.color.hv));
        this.f63483f.setAntiAlias(true);
        int b2 = p.b(getContext());
        int a2 = p.a(getContext());
        float f2 = this.f63479b - this.g;
        float f3 = this.f63480c + this.g;
        float f4 = this.f63481d - this.g;
        float f5 = this.f63482e + this.g;
        float f6 = (float) b2;
        Canvas canvas3 = canvas;
        canvas3.drawRect(0.0f, 0.0f, f6, f2, this.f63483f);
        float f7 = f3 + 1.0f;
        float f8 = f2;
        float f9 = f7;
        canvas3.drawRect(0.0f, f8, f4, f9, this.f63483f);
        float f10 = f6;
        canvas3.drawRect(f5 + 1.0f, f8, f10, f9, this.f63483f);
        canvas3.drawRect(0.0f, f7, f10, (float) a2, this.f63483f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, float f2, float f3, float f4, float f5) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63479b = f3;
        this.f63480c = f5;
        this.f63481d = f2;
        this.f63482e = f4;
    }
}
