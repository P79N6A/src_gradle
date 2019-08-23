package com.ss.ugc.live.barrage.a;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/ugc/live/barrage/barrage/ImageBarrage;", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "getBitmap", "barrage_release"}, k = 1, mv = {1, 1, 15})
public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f78688a;

    @NotNull
    public final Bitmap b() {
        return this.f78688a;
    }

    public b(@NotNull Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        this.f78688a = bitmap;
        this.k.right = this.k.left + ((float) this.f78688a.getWidth());
        this.k.bottom = this.k.top + ((float) this.f78688a.getHeight());
        e();
    }
}
