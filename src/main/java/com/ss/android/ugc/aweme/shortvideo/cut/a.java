package com.ss.android.ugc.aweme.shortvideo.cut;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/BitmapCacheWriteAndReader;", "Lcom/ss/android/ugc/aweme/shortvideo/cut/CacheWriterAndReader;", "Landroid/graphics/Bitmap;", "()V", "read", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VideoFrameData;", "inputStream", "Ljava/io/InputStream;", "write", "", "outputStream", "Ljava/io/OutputStream;", "cacheData", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements b<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66337a;

    @NotNull
    public final as<Bitmap> a(@NotNull InputStream inputStream) {
        InputStream inputStream2 = inputStream;
        if (PatchProxy.isSupport(new Object[]{inputStream2}, this, f66337a, false, 75388, new Class[]{InputStream.class}, as.class)) {
            return (as) PatchProxy.accessDispatch(new Object[]{inputStream2}, this, f66337a, false, 75388, new Class[]{InputStream.class}, as.class);
        }
        Intrinsics.checkParameterIsNotNull(inputStream2, "inputStream");
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        Intrinsics.checkExpressionValueIsNotNull(decodeStream, "bitmap");
        return new as<>(decodeStream.getWidth(), decodeStream.getHeight(), decodeStream);
    }

    public final void a(@NotNull OutputStream outputStream, @NotNull as<Bitmap> asVar) {
        OutputStream outputStream2 = outputStream;
        as<Bitmap> asVar2 = asVar;
        if (PatchProxy.isSupport(new Object[]{outputStream2, asVar2}, this, f66337a, false, 75389, new Class[]{OutputStream.class, as.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{outputStream2, asVar2}, this, f66337a, false, 75389, new Class[]{OutputStream.class, as.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(outputStream2, "outputStream");
        Intrinsics.checkParameterIsNotNull(asVar2, "cacheData");
        ((Bitmap) asVar2.f66391d).compress(Bitmap.CompressFormat.PNG, 100, outputStream2);
    }
}
