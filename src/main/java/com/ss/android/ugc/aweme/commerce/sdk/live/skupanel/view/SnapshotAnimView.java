package com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.view;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SnapshotAnimView;", "Landroid/support/v7/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "circleRadius", "", "mPath", "Landroid/graphics/Path;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "update", "floatValue", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class SnapshotAnimView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37895a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f37896b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public float f37897c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotAnimView(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void onDraw(@Nullable Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f37895a, false, 29477, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f37895a, false, 29477, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        this.f37896b.addCircle((float) (getWidth() >> 1), (float) (getHeight() >> 1), this.f37897c, Path.Direction.CW);
        if (canvas != null) {
            canvas.clipPath(this.f37896b);
        }
        super.onDraw(canvas);
    }
}
