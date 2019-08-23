package com.bytedance.ies.dmt.ui.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 u2\u00020\u0001:\u0001uB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010_\u001a\u00020+J\u0006\u0010`\u001a\u00020\tJ\u0018\u0010a\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020eH\u0014J\u0010\u0010f\u001a\u00020b2\u0006\u0010g\u001a\u000201H\u0015J\u0018\u0010h\u001a\u00020b2\u0006\u0010i\u001a\u00020\t2\u0006\u0010j\u001a\u00020\tH\u0015J\u0018\u0010k\u001a\u00020\u001c2\u0006\u0010l\u001a\u00020+2\u0006\u0010m\u001a\u00020+H\u0002J\b\u0010n\u001a\u00020bH\u0002J\u000e\u0010o\u001a\u00020b2\u0006\u0010p\u001a\u00020\tJ\u0016\u0010q\u001a\u00020b2\u0006\u0010p\u001a\u00020\t2\u0006\u0010r\u001a\u00020+J\u000e\u0010s\u001a\u00020b2\u0006\u0010t\u001a\u00020>R\u001a\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u000fR\u000e\u0010*\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u000e\u0010/\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X.¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000203X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\u001a\u0010F\u001a\u00020>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010@\"\u0004\bH\u0010BR\u001a\u0010I\u001a\u00020>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010@\"\u0004\bK\u0010BR\u001a\u0010L\u001a\u00020>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010@\"\u0004\bN\u0010BR\u001a\u0010O\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010:\"\u0004\bQ\u0010<R\u001a\u0010R\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0015\"\u0004\bT\u0010\u0017R\u000e\u0010U\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u001a\u0010V\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\r\"\u0004\bX\u0010\u000fR\u001a\u0010Y\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010:\"\u0004\b[\u0010<R\u001a\u0010\\\u001a\u00020>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010@\"\u0004\b^\u0010B¨\u0006v"}, d2 = {"Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBgColor", "getMBgColor", "()I", "setMBgColor", "(I)V", "mBitmap", "Landroid/graphics/Bitmap;", "mBorderBubbleArrowPath", "Landroid/graphics/Path;", "getMBorderBubbleArrowPath", "()Landroid/graphics/Path;", "setMBorderBubbleArrowPath", "(Landroid/graphics/Path;)V", "mBorderColor", "getMBorderColor", "setMBorderColor", "mBorderMatrix", "Landroid/graphics/Matrix;", "getMBorderMatrix", "()Landroid/graphics/Matrix;", "setMBorderMatrix", "(Landroid/graphics/Matrix;)V", "mBorderRoundRect", "Landroid/graphics/RectF;", "getMBorderRoundRect", "()Landroid/graphics/RectF;", "setMBorderRoundRect", "(Landroid/graphics/RectF;)V", "mBorderWidth", "getMBorderWidth", "setMBorderWidth", "mBubbleArrowOffset", "", "mBubbleArrowPath", "getMBubbleArrowPath", "setMBubbleArrowPath", "mBubbleOrientation", "mCanvas", "Landroid/graphics/Canvas;", "mFillPaint", "Landroid/graphics/Paint;", "getMFillPaint", "()Landroid/graphics/Paint;", "setMFillPaint", "(Landroid/graphics/Paint;)V", "mHeight", "getMHeight", "()F", "setMHeight", "(F)V", "mNeedAddColor", "", "getMNeedAddColor", "()Z", "setMNeedAddColor", "(Z)V", "mNeedArrow", "getMNeedArrow", "setMNeedArrow", "mNeedPath", "getMNeedPath", "setMNeedPath", "mNeedPressFade", "getMNeedPressFade", "setMNeedPressFade", "mNeedShadow", "getMNeedShadow", "setMNeedShadow", "mPadding", "getMPadding", "setMPadding", "mPath", "getMPath", "setMPath", "mRoundRect", "mShadowColor", "getMShadowColor", "setMShadowColor", "mWidth", "getMWidth", "setMWidth", "useDefaultView", "getUseDefaultView", "setUseDefaultView", "getBubbleOffset", "getPADDING", "init", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDraw", "canvas", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "renderBubbleArrowMatrix", "width", "height", "renderBubbleLegPrototype", "setBubbleOrientation", "bubbleOrientation", "setBubbleParams", "bubbleArrowOffset", "setNeedAddColor", "need", "Companion", "awemeuikit_douyinCnRelease"}, k = 1, mv = {1, 1, 11})
public final class a extends LinearLayout {
    public static int g;
    public static int h;
    public static float i;
    public static float j;
    public static float k;
    public static int l;
    public static int m;
    public static final C0183a n = new C0183a((byte) 0);
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public Paint f20255a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public Path f20256b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public Path f20257c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public Path f20258d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public RectF f20259e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public Matrix f20260f;
    private float o;
    private RectF p;
    private float q;
    private float r;
    private int s;
    private Bitmap t;
    private Canvas u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private float z;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001c\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleLayout$Companion;", "", "()V", "BOTTOM", "", "LEFT", "RIGHT", "TOP", "cornerRadius", "", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "defaultHeight", "getDefaultHeight", "()I", "setDefaultHeight", "(I)V", "defaultPadding", "getDefaultPadding", "setDefaultPadding", "defaultWidth", "getDefaultWidth", "setDefaultWidth", "legHalfBase", "getLegHalfBase", "setLegHalfBase", "minArrowDistance", "getMinArrowDistance", "setMinArrowDistance", "padding", "getPadding", "setPadding", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "awemeuikit_douyinCnRelease"}, k = 1, mv = {1, 1, 11})
    /* renamed from: com.bytedance.ies.dmt.ui.a.a$a  reason: collision with other inner class name */
    public static final class C0183a {
        private C0183a() {
        }

        public /* synthetic */ C0183a(byte b2) {
            this();
        }
    }

    public final int getMBgColor() {
        return this.v;
    }

    public final int getMBorderColor() {
        return this.w;
    }

    public final int getMBorderWidth() {
        return this.s;
    }

    public final float getMHeight() {
        return this.r;
    }

    public final boolean getMNeedAddColor() {
        return this.E;
    }

    public final boolean getMNeedArrow() {
        return this.D;
    }

    public final boolean getMNeedPath() {
        return this.B;
    }

    public final boolean getMNeedPressFade() {
        return this.C;
    }

    public final boolean getMNeedShadow() {
        return this.y;
    }

    public final float getMPadding() {
        return this.o;
    }

    public final int getMShadowColor() {
        return this.x;
    }

    public final float getMWidth() {
        return this.q;
    }

    public final boolean getUseDefaultView() {
        return this.F;
    }

    public final int getPADDING() {
        return g / 2;
    }

    @NotNull
    public final Path getMBorderBubbleArrowPath() {
        Path path = this.f20258d;
        if (path == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderBubbleArrowPath");
        }
        return path;
    }

    @NotNull
    public final Matrix getMBorderMatrix() {
        Matrix matrix = this.f20260f;
        if (matrix == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderMatrix");
        }
        return matrix;
    }

    @NotNull
    public final RectF getMBorderRoundRect() {
        RectF rectF = this.f20259e;
        if (rectF == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderRoundRect");
        }
        return rectF;
    }

    @NotNull
    public final Path getMBubbleArrowPath() {
        Path path = this.f20257c;
        if (path == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBubbleArrowPath");
        }
        return path;
    }

    @NotNull
    public final Paint getMFillPaint() {
        Paint paint = this.f20255a;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        return paint;
    }

    @NotNull
    public final Path getMPath() {
        Path path = this.f20256b;
        if (path == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPath");
        }
        return path;
    }

    public final float getBubbleOffset() {
        float max = Math.max(this.z, k);
        switch (this.A) {
            case 0:
                return Math.min(max, this.q - k);
            case 1:
                return Math.min(max, this.r - k);
            case 2:
                return Math.min(max, this.r - k);
            case 3:
                return Math.min(max, this.q - k);
            default:
                return 0.0f;
        }
    }

    public final void setBubbleOrientation(int i2) {
        this.A = i2;
    }

    public final void setMBgColor(int i2) {
        this.v = i2;
    }

    public final void setMBorderColor(int i2) {
        this.w = i2;
    }

    public final void setMBorderWidth(int i2) {
        this.s = i2;
    }

    public final void setMHeight(float f2) {
        this.r = f2;
    }

    public final void setMNeedAddColor(boolean z2) {
        this.E = z2;
    }

    public final void setMNeedArrow(boolean z2) {
        this.D = z2;
    }

    public final void setMNeedPath(boolean z2) {
        this.B = z2;
    }

    public final void setMNeedPressFade(boolean z2) {
        this.C = z2;
    }

    public final void setMNeedShadow(boolean z2) {
        this.y = z2;
    }

    public final void setMPadding(float f2) {
        this.o = f2;
    }

    public final void setMShadowColor(int i2) {
        this.x = i2;
    }

    public final void setMWidth(float f2) {
        this.q = f2;
    }

    public final void setNeedAddColor(boolean z2) {
        this.E = z2;
    }

    public final void setUseDefaultView(boolean z2) {
        this.F = z2;
    }

    public final void setMBorderBubbleArrowPath(@NotNull Path path) {
        Intrinsics.checkParameterIsNotNull(path, "<set-?>");
        this.f20258d = path;
    }

    public final void setMBorderMatrix(@NotNull Matrix matrix) {
        Intrinsics.checkParameterIsNotNull(matrix, "<set-?>");
        this.f20260f = matrix;
    }

    public final void setMBorderRoundRect(@NotNull RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "<set-?>");
        this.f20259e = rectF;
    }

    public final void setMBubbleArrowPath(@NotNull Path path) {
        Intrinsics.checkParameterIsNotNull(path, "<set-?>");
        this.f20257c = path;
    }

    public final void setMFillPaint(@NotNull Paint paint) {
        Intrinsics.checkParameterIsNotNull(paint, "<set-?>");
        this.f20255a = paint;
    }

    public final void setMPath(@NotNull Path path) {
        Intrinsics.checkParameterIsNotNull(path, "<set-?>");
        this.f20256b = path;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"CI_DrawAllocation"})
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (this.t == null) {
            this.t = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.u = new Canvas(this.t);
        }
        float f2 = this.q;
        float f3 = this.r;
        float max = Math.max(this.z, k);
        Matrix matrix = new Matrix();
        this.f20260f = new Matrix();
        switch (this.A) {
            case 0:
                float min = Math.min(max, f2 - k);
                matrix.postRotate(90.0f);
                Matrix matrix2 = this.f20260f;
                if (matrix2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBorderMatrix");
                }
                matrix2.postRotate(90.0f);
                Matrix matrix3 = this.f20260f;
                if (matrix3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBorderMatrix");
                }
                matrix3.postTranslate((((float) ((this.s * 3) / 2)) + min) - ((float) ((g * 3) / 2)), ((float) this.s) + 0.0f);
                setPadding(0, g, 0, 0);
                setGravity(17);
                this.p = new RectF(0.0f, (float) g, this.q, this.r);
                matrix.postTranslate((min + ((float) ((this.s * 3) / 2))) - ((float) ((g * 3) / 2)), ((float) ((this.s * 3) / 2)) + 0.0f);
                break;
            case 1:
                float min2 = Math.min(max, f3 - k);
                setPadding(g, 0, 0, 0);
                setGravity(17);
                Matrix matrix4 = this.f20260f;
                if (matrix4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBorderMatrix");
                }
                matrix4.postTranslate(((float) this.s) + 0.0f, (((float) (this.s * 2)) + min2) - ((float) ((g * 3) / 2)));
                this.p = new RectF((float) g, 0.0f, this.q, this.r);
                matrix.postTranslate(((float) ((this.s * 3) / 2)) + 0.0f, (min2 + ((float) (this.s * 2))) - ((float) ((g * 3) / 2)));
                break;
            case 2:
                float min3 = Math.min(max, f3 - k);
                matrix.postRotate(180.0f);
                Matrix matrix5 = this.f20260f;
                if (matrix5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBorderMatrix");
                }
                matrix5.postRotate(180.0f);
                Matrix matrix6 = this.f20260f;
                if (matrix6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBorderMatrix");
                }
                matrix6.postTranslate(((float) (this.s * 2)) + f2, (((float) (this.s * 2)) + min3) - ((float) ((g * 3) / 2)));
                setPadding(0, 0, g, 0);
                setGravity(17);
                this.p = new RectF(0.0f, 0.0f, this.q - ((float) g), this.r);
                matrix.postTranslate(f2 + ((float) ((this.s * 3) / 2)), (min3 + ((float) (this.s * 2))) - ((float) ((g * 3) / 2)));
                break;
            case 3:
                float min4 = Math.min(max, f2 - k);
                matrix.postRotate(270.0f);
                Matrix matrix7 = this.f20260f;
                if (matrix7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBorderMatrix");
                }
                matrix7.postRotate(270.0f);
                Matrix matrix8 = this.f20260f;
                if (matrix8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBorderMatrix");
                }
                matrix8.postTranslate((((float) ((this.s * 3) / 2)) + min4) - ((float) ((g * 3) / 2)), ((float) (this.s * 2)) + f3);
                setPadding(0, 0, 0, g);
                setGravity(17);
                this.p = new RectF(0.0f, 0.0f, this.q, this.r - ((float) g));
                matrix.postTranslate((min4 + ((float) ((this.s * 3) / 2))) - ((float) ((g * 3) / 2)), f3 + ((float) ((this.s * 3) / 2)));
                break;
        }
        RectF rectF = this.p;
        if (rectF == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoundRect");
        }
        rectF.left += (float) ((this.s * 3) / 2);
        RectF rectF2 = this.p;
        if (rectF2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoundRect");
        }
        rectF2.top += (float) ((this.s * 3) / 2);
        RectF rectF3 = this.p;
        if (rectF3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoundRect");
        }
        rectF3.right += (float) ((this.s * 3) / 2);
        RectF rectF4 = this.p;
        if (rectF4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoundRect");
        }
        rectF4.bottom += (float) ((this.s * 3) / 2);
        this.f20259e = new RectF();
        RectF rectF5 = this.f20259e;
        if (rectF5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderRoundRect");
        }
        RectF rectF6 = this.p;
        if (rectF6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoundRect");
        }
        rectF5.left = rectF6.left - ((float) (this.s / 2));
        RectF rectF7 = this.f20259e;
        if (rectF7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderRoundRect");
        }
        RectF rectF8 = this.p;
        if (rectF8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoundRect");
        }
        rectF7.top = rectF8.top - ((float) (this.s / 2));
        RectF rectF9 = this.f20259e;
        if (rectF9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderRoundRect");
        }
        RectF rectF10 = this.p;
        if (rectF10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoundRect");
        }
        rectF9.right = rectF10.right + ((float) (this.s / 2));
        RectF rectF11 = this.f20259e;
        if (rectF11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderRoundRect");
        }
        RectF rectF12 = this.p;
        if (rectF12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoundRect");
        }
        rectF11.bottom = rectF12.bottom + ((float) (this.s / 2));
        if (this.y) {
            Paint paint = this.f20255a;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
            }
            paint.setShadowLayer(2.0f, 2.0f, 5.0f, this.x);
        }
        if (this.B) {
            Paint paint2 = this.f20255a;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
            }
            paint2.setColor(this.w);
            Paint paint3 = this.f20255a;
            if (paint3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
            }
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = this.f20255a;
            if (paint4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
            }
            paint4.setStrokeWidth((float) this.s);
            Path path = this.f20256b;
            if (path == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPath");
            }
            path.reset();
            Path path2 = this.f20256b;
            if (path2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPath");
            }
            RectF rectF13 = this.f20259e;
            if (rectF13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBorderRoundRect");
            }
            path2.addRoundRect(rectF13, j + ((float) (this.s / 2)), j + ((float) (this.s / 2)), Path.Direction.CW);
            if (this.D) {
                Path path3 = this.f20256b;
                if (path3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPath");
                }
                Path path4 = this.f20258d;
                if (path4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBorderBubbleArrowPath");
                }
                Matrix matrix9 = this.f20260f;
                if (matrix9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBorderMatrix");
                }
                path3.addPath(path4, matrix9);
            }
            Canvas canvas2 = this.u;
            if (canvas2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCanvas");
            }
            Path path5 = this.f20256b;
            if (path5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPath");
            }
            Paint paint5 = this.f20255a;
            if (paint5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
            }
            canvas2.drawPath(path5, paint5);
            if (this.E) {
                Paint paint6 = this.f20255a;
                if (paint6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
                }
                paint6.setColor(getResources().getColor(C0906R.color.ak8));
                Paint paint7 = this.f20255a;
                if (paint7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
                }
                paint7.setStyle(Paint.Style.STROKE);
                Path path6 = this.f20256b;
                if (path6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPath");
                }
                path6.reset();
                if (this.D) {
                    Path path7 = this.f20256b;
                    if (path7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPath");
                    }
                    Path path8 = this.f20258d;
                    if (path8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBorderBubbleArrowPath");
                    }
                    Matrix matrix10 = this.f20260f;
                    if (matrix10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBorderMatrix");
                    }
                    path7.addPath(path8, matrix10);
                }
                Path path9 = this.f20256b;
                if (path9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPath");
                }
                RectF rectF14 = this.f20259e;
                if (rectF14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBorderRoundRect");
                }
                path9.addRoundRect(rectF14, j + ((float) (this.s / 2)), j + ((float) (this.s / 2)), Path.Direction.CW);
                Canvas canvas3 = this.u;
                if (canvas3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCanvas");
                }
                Path path10 = this.f20256b;
                if (path10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPath");
                }
                Paint paint8 = this.f20255a;
                if (paint8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
                }
                canvas3.drawPath(path10, paint8);
            }
        }
        Paint paint9 = this.f20255a;
        if (paint9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        paint9.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Paint paint10 = this.f20255a;
        if (paint10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        paint10.setColor(this.v);
        Paint paint11 = this.f20255a;
        if (paint11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        paint11.setStyle(Paint.Style.FILL);
        Path path11 = this.f20256b;
        if (path11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPath");
        }
        path11.reset();
        Path path12 = this.f20256b;
        if (path12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPath");
        }
        RectF rectF15 = this.p;
        if (rectF15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRoundRect");
        }
        float f4 = j;
        path12.addRoundRect(rectF15, f4, f4, Path.Direction.CW);
        if (this.D) {
            Path path13 = this.f20256b;
            if (path13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPath");
            }
            Path path14 = this.f20257c;
            if (path14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBubbleArrowPath");
            }
            path13.addPath(path14, matrix);
        }
        Canvas canvas4 = this.u;
        if (canvas4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCanvas");
        }
        Path path15 = this.f20256b;
        if (path15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPath");
        }
        Paint paint12 = this.f20255a;
        if (paint12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        canvas4.drawPath(path15, paint12);
        Paint paint13 = this.f20255a;
        if (paint13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        paint13.setXfermode(null);
        canvas.drawBitmap(this.t, ((float) g) - UIUtils.dip2Px(getContext(), 1.4f), ((float) g) - UIUtils.dip2Px(getContext(), 1.3f), null);
    }

    public final void a(int i2, float f2) {
        this.z = f2;
        this.A = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"CI_DrawAllocation"})
    public final void onMeasure(int i2, int i3) {
        TextView textView;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        super.onMeasure(i2, i3);
        h = (int) UIUtils.dip2Px(getContext(), this.o + 5.0f);
        if (getChildAt(0) instanceof TextView) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                textView = (TextView) childAt;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
        } else {
            textView = null;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (textView != null) {
            if (((float) ((int) textView.getPaint().measureText(textView.getText().toString()))) > UIUtils.dip2Px(getContext(), 197.0f)) {
                i8 = (int) UIUtils.dip2Px(getContext(), 197.0f);
                c2 = 2;
            } else {
                i8 = (int) textView.getPaint().measureText(textView.getText().toString());
                c2 = 1;
            }
            i4 = i8 + textView.getPaddingLeft() + textView.getPaddingRight();
        } else {
            i4 = getMeasuredWidth();
            c2 = 0;
        }
        if (this.F) {
            if (this.A == 2 || this.A == 1) {
                if (i4 > l) {
                    i7 = i4 + (h * 2);
                } else {
                    i7 = l;
                }
                i5 = i7 + g;
            } else if (i4 > l) {
                i5 = i4 + (h * 2);
            } else {
                i5 = l;
            }
            if (c2 == 1) {
                i6 = m;
            } else {
                i6 = m + 19;
            }
        } else {
            PopupWindow popupWindow = new PopupWindow(getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            View contentView = popupWindow.getContentView();
            Intrinsics.checkExpressionValueIsNotNull(contentView, "pop.contentView");
            int measuredWidth = contentView.getMeasuredWidth() + (g * 3) + h;
            View contentView2 = popupWindow.getContentView();
            Intrinsics.checkExpressionValueIsNotNull(contentView2, "pop.contentView");
            i5 = measuredWidth;
            i6 = contentView2.getMeasuredHeight() + (g * 3) + h;
        }
        int i9 = i5 + (this.s * 3);
        int i10 = i6 + (this.s * 3);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(i9, i10);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(i9, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, i10);
        }
        this.q = (float) (getMeasuredWidth() - (g * 2));
        this.r = (float) (getMeasuredHeight() - (g * 2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.o = 12.0f;
        this.x = -16777216;
        this.z = 0.75f;
        this.A = 1;
        this.B = true;
        this.D = true;
        this.E = true;
        this.F = true;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.s = (int) UIUtils.dip2Px(context, 0.7f);
        g = (int) UIUtils.dip2Px(context, 7.0f);
        i = 2.0f;
        j = UIUtils.dip2Px(context, 8.0f);
        k = UIUtils.dip2Px(context, 3.0f);
        l = (int) UIUtils.dip2Px(context, 50.0f);
        m = (int) UIUtils.dip2Px(context, 56.0f);
        this.f20255a = new Paint();
        this.f20256b = new Path();
        this.f20258d = new Path();
        this.f20257c = new Path();
        Paint paint = this.f20255a;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f20255a;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        paint2.setStrokeCap(Paint.Cap.BUTT);
        Paint paint3 = this.f20255a;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        paint3.setAntiAlias(true);
        Paint paint4 = this.f20255a;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        paint4.setStrokeWidth(i);
        Paint paint5 = this.f20255a;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        paint5.setStrokeJoin(Paint.Join.MITER);
        this.v = getResources().getColor(C0906R.color.ak3);
        this.w = getResources().getColor(C0906R.color.zg);
        Paint paint6 = this.f20255a;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        paint6.setColor(this.v);
        Paint paint7 = this.f20255a;
        if (paint7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
        }
        setLayerType(1, paint7);
        if (this.y) {
            Paint paint8 = this.f20255a;
            if (paint8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFillPaint");
            }
            paint8.setShadowLayer(2.0f, 2.0f, 5.0f, this.x);
        }
        Path path = this.f20257c;
        if (path == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBubbleArrowPath");
        }
        path.moveTo(0.0f, 0.0f);
        Path path2 = this.f20257c;
        if (path2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBubbleArrowPath");
        }
        path2.lineTo((float) g, (float) (-g));
        Path path3 = this.f20257c;
        if (path3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBubbleArrowPath");
        }
        path3.lineTo((float) g, (float) g);
        Path path4 = this.f20257c;
        if (path4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBubbleArrowPath");
        }
        path4.close();
        Path path5 = this.f20258d;
        if (path5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderBubbleArrowPath");
        }
        path5.moveTo(0.0f, 0.0f);
        Path path6 = this.f20258d;
        if (path6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderBubbleArrowPath");
        }
        double d2 = (double) g;
        double d3 = (double) this.s;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d3);
        Double.isNaN(d2);
        float f2 = (float) (d2 + (d3 * sqrt));
        double d4 = (double) (-g);
        double d5 = (double) this.s;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        Double.isNaN(d4);
        path6.lineTo(f2, (float) (d4 - (d5 * sqrt2)));
        Path path7 = this.f20258d;
        if (path7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderBubbleArrowPath");
        }
        double d6 = (double) g;
        double d7 = (double) this.s;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d7);
        Double.isNaN(d6);
        float f3 = (float) (d6 + (d7 * sqrt3));
        double d8 = (double) g;
        double d9 = (double) this.s;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d9);
        Double.isNaN(d8);
        path7.lineTo(f3, (float) (d8 + (d9 * sqrt4)));
        Path path8 = this.f20258d;
        if (path8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderBubbleArrowPath");
        }
        path8.close();
        setBackgroundColor(0);
        setClipChildren(false);
    }
}
