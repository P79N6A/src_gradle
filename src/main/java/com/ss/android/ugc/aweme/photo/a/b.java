package com.ss.android.ugc.aweme.photo.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.bytedance.common.utility.BitmapUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photo.b.a;
import com.ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.ss.android.ugc.aweme.shortvideo.q.b.f;
import com.ss.android.ugc.aweme.shortvideo.q.b.n;
import java.io.File;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58476a;

    /* renamed from: b  reason: collision with root package name */
    private final String f58477b;

    /* renamed from: c  reason: collision with root package name */
    private final IPhotoProcessService.IPhotoServiceListener f58478c;

    /* renamed from: d  reason: collision with root package name */
    private final String f58479d;

    b(String str, IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener, String str2) {
        this.f58477b = str;
        this.f58478c = iPhotoServiceListener;
        this.f58479d = str2;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f58476a, false, 63788, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f58476a, false, 63788, new Class[0], Object.class);
        }
        String str = this.f58477b;
        IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener = this.f58478c;
        String str2 = this.f58479d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile == null || decodeFile.isRecycled()) {
            if (iPhotoServiceListener != null) {
                iPhotoServiceListener.onSaved(-1, null);
            }
            return null;
        }
        f fVar = new f(str, decodeFile.getWidth(), decodeFile.getHeight());
        String[] a2 = fVar.a(false);
        n a3 = fVar.a();
        Bitmap decodeFile2 = BitmapFactory.decodeFile(a2[0]);
        new Canvas(decodeFile).drawBitmap(decodeFile2, (float) ((decodeFile.getWidth() - a3.xOffset) - decodeFile2.getWidth()), (float) ((decodeFile.getHeight() - a3.yOffset) - decodeFile2.getHeight()), null);
        if (TextUtils.isEmpty(str2)) {
            if (iPhotoServiceListener != null) {
                iPhotoServiceListener.onWaterMakerAdded(decodeFile);
            }
        } else if (BitmapUtils.saveBitmapToSD(decodeFile, new File(str2).getParent(), new File(str2).getName())) {
            a.a(com.ss.android.ugc.aweme.port.in.a.f61119b, str2);
            if (iPhotoServiceListener != null) {
                iPhotoServiceListener.onSaved(0, null);
            }
        } else if (iPhotoServiceListener != null) {
            iPhotoServiceListener.onSaved(-1, null);
        }
        return null;
    }
}
