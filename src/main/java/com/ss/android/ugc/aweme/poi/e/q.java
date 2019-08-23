package com.ss.android.ugc.aweme.poi.e;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.utils.bh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/utils/ResizeBitmapProcessor;", "Lcom/facebook/imagepipeline/request/Postprocessor;", "id", "", "url", "targetSize", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getName", "getPostprocessorCacheKey", "Lcom/facebook/cache/common/CacheKey;", "mob", "", "w", "h", "process", "Lcom/facebook/common/references/CloseableReference;", "Landroid/graphics/Bitmap;", "sourceBitmap", "bitmapFactory", "Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class q implements Postprocessor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59830a;

    /* renamed from: b  reason: collision with root package name */
    private final String f59831b;

    /* renamed from: c  reason: collision with root package name */
    private final String f59832c;

    /* renamed from: d  reason: collision with root package name */
    private final int f59833d;

    @NotNull
    public final String getName() {
        return "ResizeBitmapProcessor";
    }

    @Nullable
    public final CacheKey getPostprocessorCacheKey() {
        if (!PatchProxy.isSupport(new Object[0], this, f59830a, false, 66904, new Class[0], CacheKey.class)) {
            return new SimpleCacheKey("ResizeBitmapProcessor");
        }
        return (CacheKey) PatchProxy.accessDispatch(new Object[0], this, f59830a, false, 66904, new Class[0], CacheKey.class);
    }

    @NotNull
    public final CloseableReference<Bitmap> process(@NotNull Bitmap bitmap, @NotNull PlatformBitmapFactory platformBitmapFactory) {
        CloseableReference<Bitmap> closeableReference;
        Bitmap bitmap2 = bitmap;
        PlatformBitmapFactory platformBitmapFactory2 = platformBitmapFactory;
        if (PatchProxy.isSupport(new Object[]{bitmap2, platformBitmapFactory2}, this, f59830a, false, 66905, new Class[]{Bitmap.class, PlatformBitmapFactory.class}, CloseableReference.class)) {
            return (CloseableReference) PatchProxy.accessDispatch(new Object[]{bitmap2, platformBitmapFactory2}, this, f59830a, false, 66905, new Class[]{Bitmap.class, PlatformBitmapFactory.class}, CloseableReference.class);
        }
        Intrinsics.checkParameterIsNotNull(bitmap2, "sourceBitmap");
        Intrinsics.checkParameterIsNotNull(platformBitmapFactory2, "bitmapFactory");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= this.f59833d || height <= this.f59833d || this.f59833d == 0 || this.f59833d == 0) {
            closeableReference = platformBitmapFactory2.createBitmap(bitmap2);
            Intrinsics.checkExpressionValueIsNotNull(closeableReference, "bitmapFactory.createBitmap(sourceBitmap)");
        } else {
            float min = Math.min(((float) width) / ((float) this.f59833d), ((float) height) / ((float) this.f59833d));
            Matrix matrix = new Matrix();
            float f2 = 1.0f / min;
            matrix.postScale(f2, f2);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            Intrinsics.checkExpressionValueIsNotNull(createBitmap, "Bitmap.createBitmap(sour…W, sourceH, matrix, true)");
            closeableReference = platformBitmapFactory2.createBitmap(createBitmap);
            Intrinsics.checkExpressionValueIsNotNull(closeableReference, "bitmapFactory.createBitmap(temp)");
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(width), Integer.valueOf(height)}, this, f59830a, false, 66906, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(width), Integer.valueOf(height)}, this, f59830a, false, 66906, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                bh a2 = bh.a();
                a2.a("item_id", this.f59831b);
                a2.a(PushConstants.WEB_URL, this.f59832c);
                a2.a("width", Integer.valueOf(width));
                a2.a("height", Integer.valueOf(height));
                n.a("poi_log", "poi_preview", a2.b());
            }
        }
        return closeableReference;
    }

    public q(@Nullable String str, @Nullable String str2, int i) {
        this.f59831b = str;
        this.f59832c = str2;
        this.f59833d = i;
    }
}
