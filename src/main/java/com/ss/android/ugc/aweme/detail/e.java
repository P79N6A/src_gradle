package com.ss.android.ugc.aweme.detail;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0003H\u0016J\u0012\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/VerticalRoundedRectDrawable;", "Landroid/graphics/drawable/Drawable;", "color", "", "shadow", "Lcom/ss/android/ugc/aweme/detail/Shadow;", "(ILcom/ss/android/ugc/aweme/detail/Shadow;)V", "value", "getColor", "()I", "setColor", "(I)V", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint$delegate", "Lkotlin/Lazy;", "getShadow", "()Lcom/ss/android/ugc/aweme/detail/Shadow;", "setShadow", "(Lcom/ss/android/ugc/aweme/detail/Shadow;)V", "shadowPaint", "getShadowPaint", "shadowPaint$delegate", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41173a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f41174b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(e.class), "paint", "getPaint()Landroid/graphics/Paint;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(e.class), "shadowPaint", "getShadowPaint()Landroid/graphics/Paint;"))};
    @ColorInt

    /* renamed from: c  reason: collision with root package name */
    public int f41175c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public d f41176d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f41177e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f41178f = LazyKt.lazy(new b(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Paint> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ int $color;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i) {
            super(0);
            this.$color = i;
        }

        @NotNull
        public final Paint invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34656, new Class[0], Paint.class)) {
                return (Paint) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34656, new Class[0], Paint.class);
            }
            Paint paint = new Paint(1);
            paint.setColor(this.$color);
            return paint;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Paint> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @NotNull
        public final Paint invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34657, new Class[0], Paint.class)) {
                return (Paint) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34657, new Class[0], Paint.class);
            }
            Paint paint = new Paint(1);
            d dVar = this.this$0.f41176d;
            if (dVar != null) {
                paint.setColor(dVar.f41170f);
                paint.setMaskFilter(new BlurMaskFilter(dVar.f41166b, dVar.f41167c));
            }
            return paint;
        }
    }

    @NotNull
    private Paint a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f41173a, false, 34649, new Class[0], Paint.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f41173a, false, 34649, new Class[0], Paint.class);
        } else {
            value = this.f41177e.getValue();
        }
        return (Paint) value;
    }

    public final int getOpacity() {
        if (!PatchProxy.isSupport(new Object[0], this, f41173a, false, 34653, new Class[0], Integer.TYPE)) {
            return a().getAlpha();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41173a, false, 34653, new Class[0], Integer.TYPE)).intValue();
    }

    public final void onBoundsChange(@Nullable Rect rect) {
        if (PatchProxy.isSupport(new Object[]{rect}, this, f41173a, false, 34655, new Class[]{Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect}, this, f41173a, false, 34655, new Class[]{Rect.class}, Void.TYPE);
            return;
        }
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41173a, false, 34652, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41173a, false, 34652, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (a().getAlpha() != i2) {
            a().setAlpha(i2);
            invalidateSelf();
        }
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        ColorFilter colorFilter2 = colorFilter;
        if (PatchProxy.isSupport(new Object[]{colorFilter2}, this, f41173a, false, 34654, new Class[]{ColorFilter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{colorFilter2}, this, f41173a, false, 34654, new Class[]{ColorFilter.class}, Void.TYPE);
            return;
        }
        a().setColorFilter(colorFilter2);
        invalidateSelf();
    }

    public final void draw(@NotNull Canvas canvas) {
        Object value;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f41173a, false, 34651, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f41173a, false, 34651, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            float f2 = (float) width;
            float f3 = f2 / 2.0f;
            RectF rectF = new RectF(0.0f, 0.0f, f2, (float) height);
            d dVar = this.f41176d;
            if (dVar != null) {
                float abs = Math.abs(dVar.f41168d) + dVar.f41166b;
                float abs2 = Math.abs(dVar.f41169e) + dVar.f41166b;
                rectF.top += abs2;
                rectF.bottom -= abs2;
                rectF.left += abs;
                rectF.right -= abs;
                canvas.save();
                canvas.translate(dVar.f41168d, dVar.f41169e);
                if (PatchProxy.isSupport(new Object[0], this, f41173a, false, 34650, new Class[0], Paint.class)) {
                    value = PatchProxy.accessDispatch(new Object[0], this, f41173a, false, 34650, new Class[0], Paint.class);
                } else {
                    value = this.f41178f.getValue();
                }
                canvas.drawRoundRect(rectF, f3, f3, (Paint) value);
                canvas.restore();
            }
            canvas.drawRoundRect(rectF, f3, f3, a());
        }
    }

    public e(@ColorInt int i, @Nullable d dVar) {
        this.f41175c = i;
        this.f41176d = dVar;
        this.f41177e = LazyKt.lazy(new a(i));
    }
}
