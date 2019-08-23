package com.ss.android.ugc.aweme.commercialize.ad;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.bytex.a.a.a;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0014R$\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0015@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR$\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/ad/AdRatingView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "ratingDivide", "getRatingDivide", "()I", "setRatingDivide", "(I)V", "Landroid/graphics/drawable/Drawable;", "ratingImage", "getRatingImage", "()Landroid/graphics/drawable/Drawable;", "setRatingImage", "(Landroid/graphics/drawable/Drawable;)V", "", "ratingProgress", "getRatingProgress", "()F", "setRatingProgress", "(F)V", "ratingStarNumber", "getRatingStarNumber", "setRatingStarNumber", "ratingUnImage", "getRatingUnImage", "setRatingUnImage", "draw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AdRatingView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38457a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private Drawable f38458b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private Drawable f38459c;

    /* renamed from: d  reason: collision with root package name */
    private float f38460d;

    /* renamed from: e  reason: collision with root package name */
    private int f38461e;

    /* renamed from: f  reason: collision with root package name */
    private int f38462f;

    @JvmOverloads
    public AdRatingView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AdRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getRatingDivide() {
        return this.f38462f;
    }

    @NotNull
    public final Drawable getRatingImage() {
        return this.f38459c;
    }

    public final float getRatingProgress() {
        return this.f38460d;
    }

    public final int getRatingStarNumber() {
        return this.f38461e;
    }

    @NotNull
    public final Drawable getRatingUnImage() {
        return this.f38458b;
    }

    public final void setRatingDivide(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38457a, false, 30374, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38457a, false, 30374, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f38462f = i;
        invalidate();
    }

    public final void setRatingImage(@NotNull Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f38457a, false, 30371, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f38457a, false, 30371, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(drawable2, "value");
        this.f38459c = drawable2;
        invalidate();
    }

    public final void setRatingProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f38457a, false, 30372, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f38457a, false, 30372, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f38460d = f2;
        invalidate();
    }

    public final void setRatingStarNumber(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38457a, false, 30373, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38457a, false, 30373, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f38461e = i;
        invalidate();
    }

    public final void setRatingUnImage(@NotNull Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f38457a, false, 30370, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f38457a, false, 30370, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(drawable2, "value");
        this.f38458b = drawable2;
        invalidate();
    }

    public final void draw(@Nullable Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f38457a, false, 30376, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f38457a, false, 30376, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.draw(canvas);
        if (canvas != null) {
            float intrinsicHeight = ((float) ((((int) this.f38460d) * this.f38458b.getIntrinsicHeight()) + (((int) this.f38460d) * this.f38462f))) + ((this.f38460d - ((float) ((int) this.f38460d))) * ((float) this.f38458b.getIntrinsicWidth()));
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, intrinsicHeight, (float) this.f38459c.getIntrinsicHeight());
            int i = this.f38461e;
            for (int i2 = 0; i2 < i; i2++) {
                int intrinsicWidth = (this.f38459c.getIntrinsicWidth() * i2) + (this.f38462f * i2);
                this.f38459c.setBounds(intrinsicWidth, 0, this.f38459c.getIntrinsicWidth() + intrinsicWidth, this.f38459c.getIntrinsicHeight());
                this.f38459c.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            canvas.clipRect(intrinsicHeight, 0.0f, (float) getWidth(), (float) this.f38458b.getIntrinsicHeight());
            int i3 = this.f38461e;
            for (int i4 = 0; i4 < i3; i4++) {
                int intrinsicWidth2 = (this.f38458b.getIntrinsicWidth() * i4) + (this.f38462f * i4);
                this.f38458b.setBounds(intrinsicWidth2, 0, this.f38458b.getIntrinsicWidth() + intrinsicWidth2, this.f38458b.getIntrinsicHeight());
                this.f38458b.draw(canvas);
            }
            canvas.restore();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38457a, false, 30375, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38457a, false, 30375, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i3 = (this.f38458b.getIntrinsicWidth() * this.f38461e) + ((this.f38461e - 1) * this.f38462f);
        } else if (mode == 0) {
            i3 = View.MeasureSpec.getSize(i);
        } else if (mode != 1073741824) {
            i3 = 0;
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            i4 = this.f38458b.getIntrinsicHeight();
        } else if (mode2 == 0) {
            i4 = View.MeasureSpec.getSize(i2);
        } else if (mode2 == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i3, i4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AdRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        Drawable drawable2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = context.getResources().getDrawable(2130840572, null);
            Intrinsics.checkExpressionValueIsNotNull(drawable, "context.resources.getDra…le.star_un_shining, null)");
        } else {
            drawable = a.a(context.getResources(), 2130840572);
            Intrinsics.checkExpressionValueIsNotNull(drawable, "context.resources.getDra…drawable.star_un_shining)");
        }
        this.f38458b = drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            drawable2 = context.getResources().getDrawable(2130840571, null);
            Intrinsics.checkExpressionValueIsNotNull(drawable2, "context.resources.getDra…wable.star_shining, null)");
        } else {
            drawable2 = a.a(context.getResources(), 2130840571);
            Intrinsics.checkExpressionValueIsNotNull(drawable2, "context.resources.getDra…(R.drawable.star_shining)");
        }
        this.f38459c = drawable2;
        this.f38461e = 5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AdRatingView);
            Drawable drawable3 = obtainStyledAttributes.getDrawable(2);
            if (drawable3 != null) {
                setRatingImage(drawable3);
            }
            Drawable drawable4 = obtainStyledAttributes.getDrawable(5);
            if (drawable4 != null) {
                setRatingUnImage(drawable4);
            }
            setRatingProgress(obtainStyledAttributes.getFloat(3, this.f38460d));
            setRatingStarNumber(obtainStyledAttributes.getInt(4, this.f38461e));
            setRatingDivide(obtainStyledAttributes.getDimensionPixelSize(1, this.f38462f));
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdRatingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
