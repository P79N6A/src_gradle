package com.ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.util.aa;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.vesdk.utils.BitmapLoader;
import java.io.FileOutputStream;
import java.util.UUID;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58550a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f58550a, true, 63562, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f58550a, true, 63562, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return a.M.a(a.C0682a.PhotoEditEnabled);
    }

    public static int[] a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f58550a, true, 63568, new Class[]{String.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{str2}, null, f58550a, true, 63568, new Class[]{String.class}, int[].class);
        } else if (!bm.a(str)) {
            return new int[]{0, 0};
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str2, options);
            return new int[]{options.outWidth, options.outHeight};
        }
    }

    @Nullable
    public static PhotoContext a(@NonNull String str, @NonNull t tVar) {
        String str2 = str;
        t tVar2 = tVar;
        if (!PatchProxy.isSupport(new Object[]{str2, tVar2}, null, f58550a, true, 63564, new Class[]{String.class, t.class}, PhotoContext.class)) {
            return a(str2, tVar2, 1080, 1920);
        }
        return (PhotoContext) PatchProxy.accessDispatch(new Object[]{str2, tVar2}, null, f58550a, true, 63564, new Class[]{String.class, t.class}, PhotoContext.class);
    }

    @Nullable
    public static PhotoContext a(@NonNull String str, @NonNull t tVar, int i, int i2) {
        FileOutputStream fileOutputStream;
        Throwable th;
        Throwable th2;
        Throwable th3;
        int i3;
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, tVar, Integer.valueOf(i), Integer.valueOf(i2)}, null, f58550a, true, 63565, new Class[]{String.class, t.class, Integer.TYPE, Integer.TYPE}, PhotoContext.class)) {
            return (PhotoContext) PatchProxy.accessDispatch(new Object[]{str2, tVar, Integer.valueOf(i), Integer.valueOf(i2)}, null, f58550a, true, 63565, new Class[]{String.class, t.class, Integer.TYPE, Integer.TYPE}, PhotoContext.class);
        }
        try {
            Bitmap loadBitmap = BitmapLoader.loadBitmap(str2, i, i2);
            long j = aa.a().i;
            ai.b(" totalPss: " + j);
            if (PatchProxy.isSupport(new Object[]{loadBitmap}, null, f58550a, true, 63567, new Class[]{Bitmap.class}, Bitmap.class)) {
                loadBitmap = (Bitmap) PatchProxy.accessDispatch(new Object[]{loadBitmap}, null, f58550a, true, 63567, new Class[]{Bitmap.class}, Bitmap.class);
            } else if (loadBitmap == null) {
                loadBitmap = null;
            } else {
                int width = loadBitmap.getWidth();
                int height = loadBitmap.getHeight();
                if ((loadBitmap.getWidth() & 1) == 1) {
                    i3 = loadBitmap.getWidth() - 1;
                    z = true;
                } else {
                    i3 = width;
                    z = false;
                }
                if ((loadBitmap.getHeight() & 1) == 1) {
                    height = loadBitmap.getHeight() - 1;
                    z = true;
                }
                if (z) {
                    Bitmap createBitmap = Bitmap.createBitmap(loadBitmap, 0, 0, i3, height);
                    loadBitmap.recycle();
                    loadBitmap = createBitmap;
                }
            }
            if (loadBitmap != null) {
                String a2 = tVar.a();
                fileOutputStream = new FileOutputStream(a2);
                try {
                    boolean compress = loadBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    if (!compress) {
                        ai.b("compress bitmap fail");
                    }
                    if (compress) {
                        return PhotoContext.fromUpload(a2, loadBitmap.getWidth(), loadBitmap.getHeight(), UUID.randomUUID().toString());
                    }
                    return null;
                } catch (Throwable th4) {
                    th = th3;
                    th2 = th4;
                }
            } else {
                ai.b("bitmap = null");
                return null;
            }
        } catch (Throwable th5) {
            ai.b(th5.getMessage());
        }
        throw th2;
        if (th != null) {
            fileOutputStream.close();
        } else {
            fileOutputStream.close();
        }
        throw th2;
    }
}
