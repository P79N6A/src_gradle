package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/PoiStickerFeedView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "points", "", "getPoints", "()[F", "setPoints", "([F)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70030a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private float[] f70031b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f70032c = new Paint();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Path f70033d = new Path();

    @NotNull
    public final Path getPath() {
        return this.f70033d;
    }

    @Nullable
    public final float[] getPoints() {
        return this.f70031b;
    }

    public final void setPoints(@Nullable float[] fArr) {
        this.f70031b = fArr;
    }

    public f(@Nullable Context context) {
        super(context);
        if (a.a()) {
            Paint paint = this.f70032c;
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            paint.setColor(context2.getResources().getColor(C0906R.color.yq));
            this.f70032c.setStyle(Paint.Style.STROKE);
            this.f70032c.setStrokeWidth(10.0f);
        }
    }

    public final void onDraw(@Nullable Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f70030a, false, 79675, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f70030a, false, 79675, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a(context) && this.f70031b != null) {
            this.f70033d.reset();
            Path path = this.f70033d;
            float[] fArr = this.f70031b;
            if (fArr == null) {
                Intrinsics.throwNpe();
            }
            float f2 = fArr[0];
            float[] fArr2 = this.f70031b;
            if (fArr2 == null) {
                Intrinsics.throwNpe();
            }
            path.moveTo(f2, fArr2[1]);
            Path path2 = this.f70033d;
            float[] fArr3 = this.f70031b;
            if (fArr3 == null) {
                Intrinsics.throwNpe();
            }
            float f3 = fArr3[2];
            float[] fArr4 = this.f70031b;
            if (fArr4 == null) {
                Intrinsics.throwNpe();
            }
            path2.lineTo(f3, fArr4[3]);
            Path path3 = this.f70033d;
            float[] fArr5 = this.f70031b;
            if (fArr5 == null) {
                Intrinsics.throwNpe();
            }
            float f4 = fArr5[6];
            float[] fArr6 = this.f70031b;
            if (fArr6 == null) {
                Intrinsics.throwNpe();
            }
            path3.lineTo(f4, fArr6[7]);
            Path path4 = this.f70033d;
            float[] fArr7 = this.f70031b;
            if (fArr7 == null) {
                Intrinsics.throwNpe();
            }
            float f5 = fArr7[4];
            float[] fArr8 = this.f70031b;
            if (fArr8 == null) {
                Intrinsics.throwNpe();
            }
            path4.lineTo(f5, fArr8[5]);
            this.f70033d.close();
            if (canvas != null) {
                canvas.drawPath(this.f70033d, this.f70032c);
            }
        }
    }
}
