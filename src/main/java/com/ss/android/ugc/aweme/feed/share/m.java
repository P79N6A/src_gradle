package com.ss.android.ugc.aweme.feed.share;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.drawee.drawable.ScalingUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0017¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/share/WidthFixedScaleType;", "Lcom/facebook/drawee/drawable/ScalingUtils$AbstractScaleType;", "()V", "getTransformImpl", "", "outTransform", "Landroid/graphics/Matrix;", "parentRect", "Landroid/graphics/Rect;", "childWidth", "", "childHeight", "focusX", "", "focusY", "scaleX", "scaleY", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class m extends ScalingUtils.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46059a;
    @NotNull
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public static final m f46060b = new m();

    /* renamed from: c  reason: collision with root package name */
    public static final a f46061c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/share/WidthFixedScaleType$Companion;", "", "()V", "INSTANCE", "Lcom/ss/android/ugc/aweme/feed/share/WidthFixedScaleType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @SuppressLint({"TooManyMethodParam"})
    public final void a(@NotNull Matrix matrix, @NotNull Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
        Matrix matrix2 = matrix;
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{matrix2, rect2, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f46059a, false, 42142, new Class[]{Matrix.class, Rect.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{matrix2, rect2, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f46059a, false, 42142, new Class[]{Matrix.class, Rect.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(matrix2, "outTransform");
        Intrinsics.checkParameterIsNotNull(rect2, "parentRect");
        float f6 = f4;
        matrix2.setScale(f6, f6);
    }
}
