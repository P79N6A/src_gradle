package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.R$styleable;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.f;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0019H\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0014J\u0018\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0016J\u0012\u00102\u001a\u00020,2\b\u00103\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020\tJ\u0016\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011¨\u00069"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/AVCutMusicView;", "Landroid/view/View;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "context", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "audioWaveView", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtAudioWaveView;", "mHeight", "getMHeight", "()I", "setMHeight", "(I)V", "mPaint", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "setMPaint", "(Landroid/graphics/Paint;)V", "mProgress", "", "mStartX", "musicWaveBean", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusicWaveBean;", "getMusicWaveBean", "()Lcom/ss/android/ugc/aweme/shortvideo/AVMusicWaveBean;", "setMusicWaveBean", "(Lcom/ss/android/ugc/aweme/shortvideo/AVMusicWaveBean;)V", "tmpRect", "Landroid/graphics/RectF;", "viewWidth", "getViewWidth", "setViewWidth", "getRectF", "left", "top", "right", "bottom", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setAudioWaveViewData", "bean", "setColor", "color", "updateProgress", "startX", "progress", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66661a;

    /* renamed from: b  reason: collision with root package name */
    public c f66662b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private Paint f66663c;

    /* renamed from: d  reason: collision with root package name */
    private float f66664d;

    /* renamed from: e  reason: collision with root package name */
    private int f66665e;

    /* renamed from: f  reason: collision with root package name */
    private int f66666f;
    private int g;
    @Nullable
    private f h;
    private RectF i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.a$a  reason: collision with other inner class name */
    static final class C0710a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f66668b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f66669c;

        C0710a(a aVar, f fVar) {
            this.f66668b = aVar;
            this.f66669c = fVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f66667a, false, 76031, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66667a, false, 76031, new Class[0], Void.TYPE);
            } else if (this.f66668b.f66662b != null) {
                this.f66668b.f66662b.a(this.f66669c.getMusicWavePointArray());
                this.f66668b.invalidate();
            }
        }
    }

    public final int getMHeight() {
        return this.f66666f;
    }

    @NotNull
    public final Paint getMPaint() {
        return this.f66663c;
    }

    @Nullable
    public final f getMusicWaveBean() {
        return this.h;
    }

    public final int getViewWidth() {
        return this.f66665e;
    }

    public final void setMHeight(int i2) {
        this.f66666f = i2;
    }

    public final void setMusicWaveBean(@Nullable f fVar) {
        this.h = fVar;
    }

    public final void setViewWidth(int i2) {
        this.f66665e = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null, 0, 4);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
    }

    public final void setMPaint(@NotNull Paint paint) {
        Paint paint2 = paint;
        if (PatchProxy.isSupport(new Object[]{paint2}, this, f66661a, false, 76022, new Class[]{Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{paint2}, this, f66661a, false, 76022, new Class[]{Paint.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(paint2, "<set-?>");
        this.f66663c = paint2;
    }

    public final void setAudioWaveViewData(@Nullable f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f66661a, false, 76026, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f66661a, false, 76026, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (fVar != null) {
            this.h = fVar;
            post(new C0710a(this, fVar));
        }
    }

    public final void setColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66661a, false, 76027, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66661a, false, 76027, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f66663c.setColor(i2);
        invalidate();
    }

    public final void onDraw(@NotNull Canvas canvas) {
        RectF rectF;
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f66661a, false, 76024, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f66661a, false, 76024, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas2, "canvas");
        canvas.save();
        this.f66662b.a(canvas2);
        canvas.restore();
        canvas.save();
        float width = ((float) this.g) + (this.f66664d * ((float) getWidth()));
        float height = (float) getHeight();
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(width), Float.valueOf(height)}, this, f66661a, false, 76025, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, RectF.class)) {
            rectF = (RectF) PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(width), Float.valueOf(height)}, this, f66661a, false, 76025, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, RectF.class);
        } else {
            this.i.set(0.0f, 0.0f, width, height);
            rectF = this.i;
        }
        canvas2.clipRect(rectF);
        this.f66662b.a(canvas2, this.f66663c);
    }

    public final void a(int i2, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f66661a, false, 76028, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f66661a, false, 76028, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.g = i2;
        this.f66664d = f2;
        invalidate();
    }

    public final void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66661a, false, 76023, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66661a, false, 76023, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            f fVar = this.h;
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            if (f.b.a(fVar.getMusicWavePointArray())) {
                int i4 = f.b.a().f66695b;
                f a2 = f.b.a();
                if (a2 == null) {
                    Intrinsics.throwNpe();
                }
                int i5 = a2.f66696c;
                com.ss.android.ugc.aweme.shortvideo.f fVar2 = this.h;
                if (fVar2 == null) {
                    Intrinsics.throwNpe();
                }
                this.f66665e = ((fVar2.getMusicWavePointArray().length - 1) * (i4 + i5)) + i5;
                f a3 = f.b.a();
                if (a3 == null) {
                    Intrinsics.throwNpe();
                }
                this.f66666f = a3.f66697d;
                setMeasuredDimension(this.f66665e, this.f66666f);
                this.f66662b.a(this.f66665e, this.f66666f);
                return;
            }
        }
        super.onMeasure(i2, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.i = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KTVView, i2, 0);
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.f66663c = new Paint(1);
        this.f66663c.setStyle(Paint.Style.FILL);
        this.f66663c.setColor(color);
        this.f66662b = new c();
        this.f66662b.a(context);
        this.f66662b.f66680e = false;
    }

    private /* synthetic */ a(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, null, 0);
    }
}
