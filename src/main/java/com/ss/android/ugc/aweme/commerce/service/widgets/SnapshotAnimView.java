package com.ss.android.ugc.aweme.commerce.service.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.v7.widget.AppCompatImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/widgets/SnapshotAnimView;", "Landroid/support/v7/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "circleRadius", "", "mPath", "Landroid/graphics/Path;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "startFromRaw", "update", "floatValue", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class SnapshotAnimView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38297a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f38298b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public float f38299c = -1.0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotAnimView(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void onDraw(@Nullable Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f38297a, false, 30095, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f38297a, false, 30095, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (this.f38299c == -1.0f) {
            this.f38299c = ((float) getWidth()) / 2.0f;
        }
        if (this.f38299c > 0.0f) {
            this.f38298b.addCircle((float) (getWidth() >> 1), (float) (getHeight() >> 1), this.f38299c, Path.Direction.CW);
            if (canvas != null) {
                canvas.clipPath(this.f38298b);
            }
        }
        super.onDraw(canvas);
    }
}
