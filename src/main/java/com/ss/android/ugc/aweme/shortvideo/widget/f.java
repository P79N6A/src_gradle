package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0002 !BA\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J(\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0012\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/widget/ShadowDrawable;", "Landroid/graphics/drawable/Drawable;", "mShape", "", "mBgColor", "", "mShapeRadius", "shadowColor", "mShadowRadius", "mOffsetX", "mOffsetY", "(I[IIIIII)V", "mBgPaint", "Landroid/graphics/Paint;", "mRect", "Landroid/graphics/RectF;", "mShadowPaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "setAlpha", "alpha", "setBounds", "left", "top", "right", "bottom", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "Builder", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71432a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final int f71433b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f71434c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final b f71435d = new b((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private final Paint f71436e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f71437f;
    private RectF g;
    private final int h;
    private final int[] i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/widget/ShadowDrawable$Builder;", "", "()V", "mBgColor", "", "mOffsetX", "", "mOffsetY", "mShadowColor", "mShadowRadius", "mShape", "mShapeRadius", "builder", "Lcom/ss/android/ugc/aweme/shortvideo/widget/ShadowDrawable;", "setBgColor", "BgColor", "setOffsetX", "OffsetX", "setOffsetY", "OffsetY", "setShadowColor", "shadowColor", "setShadowRadius", "shadowRadius", "setShape", "setShapeRadius", "ShapeRadius", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71438a;

        /* renamed from: b  reason: collision with root package name */
        private int f71439b = f.f71433b;

        /* renamed from: c  reason: collision with root package name */
        private int f71440c = 12;

        /* renamed from: d  reason: collision with root package name */
        private int f71441d = Color.parseColor("#4d000000");

        /* renamed from: e  reason: collision with root package name */
        private int f71442e = 18;

        /* renamed from: f  reason: collision with root package name */
        private int f71443f = 0;
        private int g = 0;
        private int[] h = new int[1];

        public a() {
            this.h[0] = 0;
        }

        @NotNull
        public final f a() {
            if (PatchProxy.isSupport(new Object[0], this, f71438a, false, 81403, new Class[0], f.class)) {
                return (f) PatchProxy.accessDispatch(new Object[0], this, f71438a, false, 81403, new Class[0], f.class);
            }
            f fVar = new f(this.f71439b, this.h, this.f71440c, this.f71441d, this.f71442e, this.f71443f, this.g, (byte) 0);
            return fVar;
        }

        @NotNull
        public final a a(int i) {
            this.f71440c = i;
            return this;
        }

        @NotNull
        public final a b(int i) {
            this.f71441d = i;
            return this;
        }

        @NotNull
        public final a c(int i) {
            this.f71442e = i;
            return this;
        }

        @NotNull
        public final a d(int i) {
            this.f71443f = i;
            return this;
        }

        @NotNull
        public final a e(int i) {
            this.g = i;
            return this;
        }

        @NotNull
        public final a f(int i) {
            this.h[0] = i;
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004J>\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004JF\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004J>\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/widget/ShadowDrawable$Companion;", "", "()V", "SHAPE_CIRCLE", "", "getSHAPE_CIRCLE", "()I", "SHAPE_ROUND", "getSHAPE_ROUND", "setShadowDrawable", "", "view", "Landroid/view/View;", "drawable", "Landroid/graphics/drawable/Drawable;", "shapeRadius", "shadowColor", "shadowRadius", "offsetX", "offsetY", "bgColor", "shape", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71444a;

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 0, 0}, this, f71444a, false, 81406, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 0, 0}, this, f71444a, false, 81406, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            f a2 = new a().f(i).a(i2).b(i3).c(i4).d(0).e(0).a();
            view2.setLayerType(1, null);
            ViewCompat.setBackground(view2, a2);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        ColorFilter colorFilter2 = colorFilter;
        if (PatchProxy.isSupport(new Object[]{colorFilter2}, this, f71432a, false, 81401, new Class[]{ColorFilter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{colorFilter2}, this, f71432a, false, 81401, new Class[]{ColorFilter.class}, Void.TYPE);
            return;
        }
        this.f71436e.setColorFilter(colorFilter2);
    }

    public final void setAlpha(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71432a, false, 81400, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71432a, false, 81400, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71436e.setAlpha(i2);
    }

    public final void draw(@NotNull Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f71432a, false, 81399, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f71432a, false, 81399, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas2, "canvas");
        if (this.i != null) {
            if (this.i.length == 1) {
                this.f71437f.setColor(this.i[0]);
            } else {
                Paint paint = this.f71437f;
                RectF rectF = this.g;
                if (rectF == null) {
                    Intrinsics.throwNpe();
                }
                float f2 = rectF.left;
                RectF rectF2 = this.g;
                if (rectF2 == null) {
                    Intrinsics.throwNpe();
                }
                float height = rectF2.height() / 2.0f;
                RectF rectF3 = this.g;
                if (rectF3 == null) {
                    Intrinsics.throwNpe();
                }
                float f3 = rectF3.right;
                RectF rectF4 = this.g;
                if (rectF4 == null) {
                    Intrinsics.throwNpe();
                }
                LinearGradient linearGradient = new LinearGradient(f2, height, f3, rectF4.height() / 2.0f, this.i, null, Shader.TileMode.CLAMP);
                paint.setShader(linearGradient);
            }
        }
        if (this.h == f71433b) {
            RectF rectF5 = this.g;
            if (rectF5 == null) {
                Intrinsics.throwNpe();
            }
            canvas2.drawRoundRect(rectF5, (float) this.j, (float) this.j, this.f71436e);
            RectF rectF6 = this.g;
            if (rectF6 == null) {
                Intrinsics.throwNpe();
            }
            canvas2.drawRoundRect(rectF6, (float) this.j, (float) this.j, this.f71437f);
            return;
        }
        RectF rectF7 = this.g;
        if (rectF7 == null) {
            Intrinsics.throwNpe();
        }
        float centerX = rectF7.centerX();
        RectF rectF8 = this.g;
        if (rectF8 == null) {
            Intrinsics.throwNpe();
        }
        float centerY = rectF8.centerY();
        RectF rectF9 = this.g;
        if (rectF9 == null) {
            Intrinsics.throwNpe();
        }
        float width = rectF9.width();
        RectF rectF10 = this.g;
        if (rectF10 == null) {
            Intrinsics.throwNpe();
        }
        canvas2.drawCircle(centerX, centerY, Math.min(width, rectF10.height()) / 2.0f, this.f71436e);
        RectF rectF11 = this.g;
        if (rectF11 == null) {
            Intrinsics.throwNpe();
        }
        float centerX2 = rectF11.centerX();
        RectF rectF12 = this.g;
        if (rectF12 == null) {
            Intrinsics.throwNpe();
        }
        float centerY2 = rectF12.centerY();
        RectF rectF13 = this.g;
        if (rectF13 == null) {
            Intrinsics.throwNpe();
        }
        float width2 = rectF13.width();
        RectF rectF14 = this.g;
        if (rectF14 == null) {
            Intrinsics.throwNpe();
        }
        canvas2.drawCircle(centerX2, centerY2, Math.min(width2, rectF14.height()) / 2.0f, this.f71437f);
    }

    public final void setBounds(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f71432a, false, 81398, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f71432a, false, 81398, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setBounds(i2, i3, i4, i5);
        this.g = new RectF((float) ((this.l + i2) - this.m), (float) ((this.l + i3) - this.n), (float) ((i4 - this.l) - this.m), (float) ((i5 - this.l) - this.n));
    }

    private f(int i2, int[] iArr, int i3, int i4, int i5, int i6, int i7) {
        this.h = i2;
        this.i = iArr;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = i7;
        this.f71436e = new Paint();
        this.f71436e.setColor(0);
        this.f71436e.setAntiAlias(true);
        this.f71436e.setShadowLayer((float) this.l, (float) this.m, (float) this.n, this.k);
        this.f71436e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        this.f71437f = new Paint();
        this.f71437f.setAntiAlias(true);
    }

    public /* synthetic */ f(int i2, int[] iArr, int i3, int i4, int i5, int i6, int i7, byte b2) {
        this(i2, iArr, i3, i4, i5, i6, i7);
    }
}
