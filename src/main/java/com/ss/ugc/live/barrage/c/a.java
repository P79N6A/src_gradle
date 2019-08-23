package com.ss.ugc.live.barrage.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lcom/ss/ugc/live/barrage/util/ImageUtil;", "", "()V", "convertLayoutToBitmap", "", "context", "Landroid/content/Context;", "id", "", "listener", "Lcom/ss/ugc/live/barrage/util/ImageUtil$ConvertBitmapListener;", "convertViewToBitmap", "view", "Landroid/view/View;", "ConvertBitmapListener", "barrage_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f78709a = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/ugc/live/barrage/util/ImageUtil$ConvertBitmapListener;", "", "onConverted", "", "view", "Landroid/view/View;", "bitmap", "Landroid/graphics/Bitmap;", "barrage_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.ugc.live.barrage.c.a$a  reason: collision with other inner class name */
    public interface C0843a {
        void a(@NotNull View view, @NotNull Bitmap bitmap);
    }

    private a() {
    }

    public static void a(@NotNull View view, @NotNull C0843a aVar) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setDrawingCacheEnabled(true);
        try {
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null && !drawingCache.isRecycled()) {
                aVar.a(view, drawingCache);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(@NotNull Context context, int i, @NotNull C0843a aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        View inflate = LayoutInflater.from(context).inflate(i, null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        a(inflate, aVar);
    }
}
