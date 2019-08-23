package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.f;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.b;
import io.reactivex.functions.Consumer;
import kotlin.Pair;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71427a;

    /* renamed from: b  reason: collision with root package name */
    private final a f71428b;

    /* renamed from: c  reason: collision with root package name */
    private final b f71429c;

    c(a aVar, b bVar) {
        this.f71428b = aVar;
        this.f71429c = bVar;
    }

    public final void accept(Object obj) {
        CloseableReference closeableReference;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f71427a, false, 81277, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f71427a, false, 81277, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f71428b;
        b bVar = this.f71429c;
        Bitmap bitmap = (Bitmap) ((Pair) obj).getSecond();
        if (bitmap != null && !bitmap.isRecycled()) {
            if (PatchProxy.isSupport(new Object[]{bitmap}, aVar, a.f71405a, false, 81275, new Class[]{Bitmap.class}, CloseableReference.class)) {
                Object[] objArr = {bitmap};
                a aVar2 = aVar;
                ChangeQuickRedirect changeQuickRedirect = a.f71405a;
                closeableReference = (CloseableReference) PatchProxy.accessDispatch(objArr, aVar2, changeQuickRedirect, false, 81275, new Class[]{Bitmap.class}, CloseableReference.class);
            } else {
                closeableReference = CloseableReference.of(new CloseableStaticBitmap(bitmap, (com.facebook.common.references.b<Bitmap>) f.getInstance(), com.facebook.imagepipeline.image.c.FULL_QUALITY, 0));
            }
            bVar.a(closeableReference);
        }
    }
}
