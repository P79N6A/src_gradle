package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\rJ\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\rJ\u0016\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rJ\u000e\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\rJ\u0010\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010)\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtAudioWaveView;", "", "()V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "centerLinePaint", "Landroid/graphics/Paint;", "isShowCenterLine", "", "isValidWaveData", "()Z", "mColor", "", "mItemList", "", "mItemSpace", "mItemWidth", "mPaint", "mRadius", "mTopMargin", "viewHeight", "viewWidth", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onDrawProgress", "paint", "setColor", "color", "setItemSpace", "itemSpace", "setSize", "width", "height", "setTopMargin", "margin", "setWaveData", "itemList", "showCenterLine", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66676a;

    /* renamed from: b  reason: collision with root package name */
    public int f66677b;

    /* renamed from: c  reason: collision with root package name */
    public int f66678c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f66679d = new float[0];

    /* renamed from: e  reason: collision with root package name */
    public boolean f66680e = true;

    /* renamed from: f  reason: collision with root package name */
    private int f66681f;
    private int g;
    private int h;
    private int i;
    private Paint j;
    private int k = -1;
    private Paint l;

    public c() {
    }

    public c(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        a(context);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66676a, false, 76051, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66676a, false, 76051, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.k = i2;
        Paint paint = this.j;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
        }
        paint.setColor(i2);
    }

    public final void a(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f66676a, false, 76047, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f66676a, false, 76047, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.j = new Paint();
        Paint paint = this.j;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
        }
        paint.setColor(this.k);
        Paint paint2 = this.j;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
        }
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = this.j;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
        }
        paint3.setAntiAlias(true);
        this.l = new Paint();
        if (a.b()) {
            Paint paint4 = this.l;
            if (paint4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("centerLinePaint");
            }
            paint4.setColor(context.getResources().getColor(C0906R.color.ex));
        } else {
            Paint paint5 = this.l;
            if (paint5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("centerLinePaint");
            }
            paint5.setColor(context.getResources().getColor(C0906R.color.ek));
        }
        Paint paint6 = this.l;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("centerLinePaint");
        }
        paint6.setStrokeWidth((float) ((int) UIUtils.dip2Px(context, 1.0f)));
        Paint paint7 = this.l;
        if (paint7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("centerLinePaint");
        }
        paint7.setStyle(Paint.Style.FILL);
        Paint paint8 = this.l;
        if (paint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("centerLinePaint");
        }
        paint8.setAntiAlias(true);
        this.i = (int) UIUtils.dip2Px(context, 3.0f);
        this.f66677b = f.b.a().f66695b;
        this.g = f.b.a().f66696c;
    }

    public final void a(@NotNull Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f66676a, false, 76048, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f66676a, false, 76048, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (this.f66680e) {
            float f2 = (float) ((this.h / 2) + this.f66678c);
            float f3 = (float) this.f66681f;
            float f4 = (float) ((this.h / 2) + this.f66678c);
            Paint paint = this.l;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("centerLinePaint");
            }
            canvas.drawLine(0.0f, f2, f3, f4, paint);
        }
        int length = this.f66679d.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = (int) (this.f66679d[i2] * ((float) this.h));
            int i4 = ((this.g + this.f66677b) * i2) + this.f66677b;
            int i5 = ((this.h - i3) / 2) + this.f66678c;
            RectF rectF = new RectF((float) i4, (float) i5, (float) (this.g + i4), (float) (i3 + i5));
            float f5 = (float) this.i;
            float f6 = (float) this.i;
            Paint paint2 = this.j;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPaint");
            }
            canvas.drawRoundRect(rectF, f5, f6, paint2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable float[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f66676a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<float[]> r3 = float[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 76050(0x12912, float:1.06569E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f66676a
            r13 = 0
            r14 = 76050(0x12912, float:1.06569E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<float[]> r0 = float[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            boolean r1 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.b.a((float[]) r18)
            if (r1 == 0) goto L_0x0050
            if (r0 != 0) goto L_0x0041
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0041:
            int r1 = r0.length
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "java.util.Arrays.copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = r17
            r1.f66679d = r0
            goto L_0x0052
        L_0x0050:
            r1 = r17
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cutmusic.c.a(float[]):void");
    }

    public final void a(int i2, int i3) {
        this.f66681f = i2;
        this.h = i3;
        this.h -= this.f66678c * 2;
    }

    public final void a(@NotNull Canvas canvas, @NotNull Paint paint) {
        if (PatchProxy.isSupport(new Object[]{canvas, paint}, this, f66676a, false, 76049, new Class[]{Canvas.class, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas, paint}, this, f66676a, false, 76049, new Class[]{Canvas.class, Paint.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        int length = this.f66679d.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = (int) (this.f66679d[i2] * ((float) this.h));
            int i4 = ((this.g + this.f66677b) * i2) + this.f66677b;
            int i5 = ((this.h - i3) / 2) + this.f66678c;
            canvas.drawRoundRect(new RectF((float) i4, (float) i5, (float) (this.g + i4), (float) (i3 + i5)), (float) this.i, (float) this.i, paint);
        }
    }
}
