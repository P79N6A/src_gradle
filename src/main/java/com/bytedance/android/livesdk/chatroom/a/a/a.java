package com.bytedance.android.livesdk.chatroom.a.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.barrage.a.a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012¨\u0006%"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/barrage/barrage/DiggBarrage;", "Lcom/ss/ugc/live/barrage/barrage/ImageBarrage;", "bitmap", "Landroid/graphics/Bitmap;", "random", "", "(Landroid/graphics/Bitmap;D)V", "alpha", "", "getAlpha", "()I", "setAlpha", "(I)V", "degrees", "", "getDegrees", "()F", "setDegrees", "(F)V", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "()Landroid/graphics/Matrix;", "matrix$delegate", "Lkotlin/Lazy;", "getRandom", "()D", "setRandom", "(D)V", "scaled", "getScaled", "setScaled", "draw", "", "canvas", "Landroid/graphics/Canvas;", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class a extends com.ss.ugc.live.barrage.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9706a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f9707b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "matrix", "getMatrix()Landroid/graphics/Matrix;"))};
    public static final C0079a g = new C0079a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public int f9708c = 204;

    /* renamed from: d  reason: collision with root package name */
    public float f9709d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f9710e;

    /* renamed from: f  reason: collision with root package name */
    public double f9711f;
    private final Lazy m = LazyKt.lazy(b.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/barrage/barrage/DiggBarrage$Companion;", "", "()V", "FLOAT_05", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.android.livesdk.chatroom.a.a.a$a  reason: collision with other inner class name */
    public static final class C0079a {
        private C0079a() {
        }

        public /* synthetic */ C0079a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Matrix;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class b extends Lambda implements Function0<Matrix> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final Matrix invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3926, new Class[0], Matrix.class)) {
                return new Matrix();
            }
            return (Matrix) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3926, new Class[0], Matrix.class);
        }
    }

    private final Matrix f() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f9706a, false, 3924, new Class[0], Matrix.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f9706a, false, 3924, new Class[0], Matrix.class);
        } else {
            value = this.m.getValue();
        }
        return (Matrix) value;
    }

    public final void a(@NotNull Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f9706a, false, 3925, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f9706a, false, 3925, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        a().setAlpha(this.f9708c);
        RectF rectF = this.k;
        float width = rectF.width();
        float height = rectF.height();
        float f2 = width / 2.0f;
        float f3 = height / 2.0f;
        f().setRotate(this.f9710e, f2, f3);
        f().postScale(this.f9709d, this.f9709d);
        f().postTranslate((rectF.left + ((width * 0.5f) * (1.0f - this.f9709d))) - f2, (rectF.top + ((height * 0.5f) * (1.0f - this.f9709d))) - f3);
        Matrix f4 = f();
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(f4, "matrix");
        if (!(!Intrinsics.areEqual((Object) this.l, (Object) a.C0840a.d.f78687a))) {
            Bitmap b2 = b();
            if (b2 != null && !b2.isRecycled()) {
                canvas.drawBitmap(b(), f4, a());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull Bitmap bitmap, double d2) {
        super(bitmap);
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        this.f9711f = d2;
    }
}
