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
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BusinessStickerFeedView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "points", "", "", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70026a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private List<float[]> f70027b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f70028c = new Paint();

    /* renamed from: d  reason: collision with root package name */
    private final Path f70029d = new Path();

    @Nullable
    public final List<float[]> getPoints() {
        return this.f70027b;
    }

    public final void setPoints(@Nullable List<float[]> list) {
        this.f70027b = list;
    }

    public c(@Nullable Context context) {
        super(context);
        if (a.a()) {
            Paint paint = this.f70028c;
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            paint.setColor(context2.getResources().getColor(C0906R.color.yq));
            this.f70028c.setStyle(Paint.Style.STROKE);
            this.f70028c.setStrokeWidth(10.0f);
        }
    }

    public final void onDraw(@Nullable Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f70026a, false, 79658, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f70026a, false, 79658, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a(context) && this.f70027b != null) {
            List<float[]> list = this.f70027b;
            if (list != null) {
                for (float[] fArr : list) {
                    if (fArr != null) {
                        this.f70029d.reset();
                        this.f70029d.moveTo(fArr[0], fArr[1]);
                        this.f70029d.lineTo(fArr[2], fArr[3]);
                        this.f70029d.lineTo(fArr[6], fArr[7]);
                        this.f70029d.lineTo(fArr[4], fArr[5]);
                        this.f70029d.close();
                        if (canvas != null) {
                            canvas.drawPath(this.f70029d, this.f70028c);
                        }
                    }
                }
            }
        }
    }
}
