package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;

public final /* synthetic */ class h implements FaceBeautyInvoker.OnARTextBitmapCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65701a;

    /* renamed from: b  reason: collision with root package name */
    static final FaceBeautyInvoker.OnARTextBitmapCallback f65702b = new h();

    private h() {
    }

    public final BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout) {
        Bitmap bitmap;
        StaticLayout staticLayout;
        BefTextLayout befTextLayout2 = befTextLayout;
        if (PatchProxy.isSupport(new Object[]{str, befTextLayout2}, this, f65701a, false, 75153, new Class[]{String.class, BefTextLayout.class}, BefTextLayoutResult.class)) {
            return (BefTextLayoutResult) PatchProxy.accessDispatch(new Object[]{str, befTextLayout2}, this, f65701a, false, 75153, new Class[]{String.class, BefTextLayout.class}, BefTextLayoutResult.class);
        }
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        k kVar = new k(befTextLayout2);
        if (PatchProxy.isSupport(new Object[]{str}, kVar, k.f65714a, false, 75158, new Class[]{String.class}, Bitmap.class)) {
            bitmap = (Bitmap) PatchProxy.accessDispatch(new Object[]{str}, kVar, k.f65714a, false, 75158, new Class[]{String.class}, Bitmap.class);
        } else {
            if (kVar.f65719f != 2) {
                StaticLayout staticLayout2 = new StaticLayout(str, kVar.f65715b, kVar.f65716c, Layout.Alignment.ALIGN_NORMAL, kVar.i, 0.0f, false);
                staticLayout = staticLayout2;
            } else {
                staticLayout = new StaticLayout(str, 0, str.length(), kVar.f65715b, kVar.f65716c, Layout.Alignment.ALIGN_NORMAL, kVar.i, 0.0f, false, TextUtils.TruncateAt.END, kVar.f65716c * kVar.f65718e);
            }
            kVar.j = Math.min(kVar.f65718e == 0 ? Integer.MAX_VALUE : kVar.f65718e, staticLayout.getLineCount());
            Bitmap createBitmap = Bitmap.createBitmap(staticLayout.getWidth(), staticLayout.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(((((int) kVar.g) >> 8) & 16777215) | ((((int) kVar.g) << 24) & -16777216));
            staticLayout.draw(canvas);
            kVar.f65717d = Math.min(Math.round((((float) kVar.j) * kVar.i * ((float) kVar.h)) + kVar.f65715b.getFontMetrics().descent), createBitmap.getHeight());
            bitmap = Bitmap.createBitmap(createBitmap, 0, 0, kVar.f65716c, kVar.f65717d);
        }
        befTextLayoutResult.setBitmap(bitmap);
        befTextLayoutResult.setLineCount(kVar.j);
        befTextLayoutResult.setHeight(bitmap.getHeight());
        befTextLayoutResult.setWidth(bitmap.getWidth());
        return befTextLayoutResult;
    }
}
