package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001,B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0016J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\bJ\u0010\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010\u0015J\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\bJ\u000e\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtBubbleTextView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "angleOffsetX", "", "anglePaint", "Landroid/graphics/Paint;", "anglePath", "Landroid/graphics/Path;", "anglePointHeight", "anglePointWidth", "bgColor", "mAngleCornerRadius", "mBgPaint", "mPadding", "mRaius", "mText", "", "textColor", "textPaint", "Landroid/text/TextPaint;", "textSize", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setAttribute", "attribute", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtBubbleTextView$BubbleTextViewAttribute;", "setBgColor", "color", "setText", "text", "setTextColor", "setTextSize", "size", "BubbleTextViewAttribute", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66682a;

    /* renamed from: b  reason: collision with root package name */
    private TextPaint f66683b;

    /* renamed from: c  reason: collision with root package name */
    private Path f66684c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f66685d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f66686e;

    /* renamed from: f  reason: collision with root package name */
    private String f66687f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtBubbleTextView$BubbleTextViewAttribute;", "", "()V", "angleOffsetX", "", "getAngleOffsetX", "()I", "setAngleOffsetX", "(I)V", "anglePointHeight", "getAnglePointHeight", "setAnglePointHeight", "anglePointWidth", "getAnglePointWidth", "setAnglePointWidth", "angleRadius", "getAngleRadius", "setAngleRadius", "bgColor", "getBgColor", "setBgColor", "padding", "getPadding", "setPadding", "radius", "getRadius", "setRadius", "textColor", "getTextColor", "setTextColor", "textSize", "getTextSize", "setTextSize", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f66688a;

        /* renamed from: b  reason: collision with root package name */
        public int f66689b;

        /* renamed from: c  reason: collision with root package name */
        public int f66690c;

        /* renamed from: d  reason: collision with root package name */
        public int f66691d;

        /* renamed from: e  reason: collision with root package name */
        public int f66692e;

        /* renamed from: f  reason: collision with root package name */
        public int f66693f;
        public int g;
        public int h;
        public int i;
    }

    public final void setText(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f66682a, false, 76056, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f66682a, false, 76056, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f66687f = str2;
        invalidate();
    }

    public final void setBgColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66682a, false, 76058, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66682a, false, 76058, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Paint paint = this.f66685d;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgPaint");
        }
        paint.setColor(i2);
        invalidate();
    }

    public final void setTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66682a, false, 76057, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66682a, false, 76057, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        TextPaint textPaint = this.f66683b;
        if (textPaint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        textPaint.setColor(i2);
        invalidate();
    }

    public final void setTextSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66682a, false, 76059, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66682a, false, 76059, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        TextPaint textPaint = this.f66683b;
        if (textPaint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        textPaint.setTextSize((float) i2);
        invalidate();
    }

    public final void setAttribute(@NotNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f66682a, false, 76055, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f66682a, false, 76055, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "attribute");
        this.m = aVar.g;
        this.n = aVar.h;
        this.k = aVar.f66692e;
        this.j = aVar.f66691d;
        this.g = aVar.f66688a;
        this.h = aVar.f66689b;
        this.i = aVar.f66690c;
        this.o = aVar.i;
        Paint paint = this.f66685d;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgPaint");
        }
        paint.setColor(this.n);
        Paint paint2 = this.f66686e;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anglePaint");
        }
        paint2.setColor(this.n);
        TextPaint textPaint = this.f66683b;
        if (textPaint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        textPaint.setColor(this.m);
        TextPaint textPaint2 = this.f66683b;
        if (textPaint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        textPaint2.setTextSize((float) this.o);
        this.l = aVar.f66693f;
        Paint paint3 = this.f66686e;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anglePaint");
        }
        paint3.setPathEffect(new CornerPathEffect((float) this.l));
        invalidate();
    }

    public final void onDraw(@NotNull Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f66682a, false, 76054, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f66682a, false, 76054, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (!TextUtils.isEmpty(this.f66687f)) {
            TextPaint textPaint = this.f66683b;
            if (textPaint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textPaint");
            }
            if (textPaint == null) {
                Intrinsics.throwNpe();
            }
            int measureText = ((int) textPaint.measureText(this.f66687f)) + (this.j * 2);
            Rect rect = new Rect();
            TextPaint textPaint2 = this.f66683b;
            if (textPaint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textPaint");
            }
            String str = this.f66687f;
            String str2 = this.f66687f;
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            textPaint2.getTextBounds(str, 0, str2.length(), rect);
            int height = rect.height() + (this.j * 2);
            float f2 = (float) height;
            RectF rectF = new RectF((float) this.k, 0.0f, (float) (this.k + measureText), f2);
            float f3 = (float) this.k;
            float f4 = (float) this.k;
            Paint paint = this.f66685d;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBgPaint");
            }
            canvas.drawRoundRect(rectF, f3, f4, paint);
            Path path = this.f66684c;
            if (path == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anglePath");
            }
            path.moveTo((float) (this.i + this.g + this.k), f2);
            Path path2 = this.f66684c;
            if (path2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anglePath");
            }
            path2.lineTo((float) (this.i + (this.g / 2) + this.k), (float) (this.h + height));
            Path path3 = this.f66684c;
            if (path3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anglePath");
            }
            path3.lineTo((float) (this.i + this.k), f2);
            Path path4 = this.f66684c;
            if (path4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anglePath");
            }
            Paint paint2 = this.f66686e;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anglePaint");
            }
            canvas.drawPath(path4, paint2);
            String str3 = this.f66687f;
            if (str3 == null) {
                Intrinsics.throwNpe();
            }
            String str4 = this.f66687f;
            if (str4 == null) {
                Intrinsics.throwNpe();
            }
            int length = str4.length();
            float f5 = (float) (this.j + this.k);
            float f6 = (float) ((height - this.j) - 4);
            TextPaint textPaint3 = this.f66683b;
            if (textPaint3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textPaint");
            }
            if (textPaint3 == null) {
                Intrinsics.throwNpe();
            }
            canvas.drawText(str3, 0, length, f5, f6, textPaint3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private d(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[0], this, f66682a, false, 76052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66682a, false, 76052, new Class[0], Void.TYPE);
            return;
        }
        this.f66683b = new TextPaint();
        TextPaint textPaint = this.f66683b;
        if (textPaint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPaint");
        }
        textPaint.setAntiAlias(true);
        this.f66685d = new Paint();
        this.f66684c = new Path();
        Paint paint = this.f66685d;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgPaint");
        }
        paint.setAntiAlias(true);
        this.f66686e = new Paint();
        Paint paint2 = this.f66686e;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anglePaint");
        }
        paint2.setAntiAlias(true);
        Typeface a2 = b.a().a(c.g);
        if (a2 != null) {
            try {
                TextPaint textPaint2 = this.f66683b;
                if (textPaint2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textPaint");
                }
                textPaint2.setTypeface(a2);
            } catch (Exception unused) {
            }
        }
    }

    public final void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66682a, false, 76053, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66682a, false, 76053, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (TextUtils.isEmpty(this.f66687f)) {
            setMeasuredDimension(0, 0);
        } else {
            TextPaint textPaint = this.f66683b;
            if (textPaint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textPaint");
            }
            if (textPaint == null) {
                Intrinsics.throwNpe();
            }
            int measureText = ((int) textPaint.measureText(this.f66687f)) + (this.j * 2) + (this.k * 2);
            Rect rect = new Rect();
            TextPaint textPaint2 = this.f66683b;
            if (textPaint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textPaint");
            }
            if (textPaint2 == null) {
                Intrinsics.throwNpe();
            }
            String str = this.f66687f;
            String str2 = this.f66687f;
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            textPaint2.getTextBounds(str, 0, str2.length(), rect);
            setMeasuredDimension(measureText, rect.height() + (this.j * 2) + this.h);
        }
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i2) {
        this(context, null);
    }
}
