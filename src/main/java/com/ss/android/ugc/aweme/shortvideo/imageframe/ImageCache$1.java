package com.ss.android.ugc.aweme.shortvideo.imageframe;

import android.graphics.drawable.BitmapDrawable;
import android.support.v4.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class ImageCache$1 extends LruCache<String, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68211a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f68212b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ImageCache$1(b bVar, int i) {
        super(i);
        this.f68212b = bVar;
    }

    public /* synthetic */ int sizeOf(Object obj, Object obj2) {
        String str = (String) obj;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj2;
        if (!PatchProxy.isSupport(new Object[]{str, bitmapDrawable}, this, f68211a, false, 77513, new Class[]{String.class, BitmapDrawable.class}, Integer.TYPE)) {
            return bitmapDrawable.getBitmap().getByteCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str, bitmapDrawable}, this, f68211a, false, 77513, new Class[]{String.class, BitmapDrawable.class}, Integer.TYPE)).intValue();
    }
}
