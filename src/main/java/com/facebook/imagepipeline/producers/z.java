package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.common.f.f;
import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.e;
import java.io.IOException;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class z extends ab implements az<b> {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f24215a = z.class;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f24216b = {"_id", "_data"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f24217c = {"_data"};

    /* renamed from: d  reason: collision with root package name */
    private static final Rect f24218d = new Rect(0, 0, 512, 384);

    /* renamed from: e  reason: collision with root package name */
    private static final Rect f24219e = new Rect(0, 0, 96, 96);

    /* renamed from: f  reason: collision with root package name */
    private final ContentResolver f24220f;

    /* access modifiers changed from: protected */
    public final String a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    /* access modifiers changed from: protected */
    public final b a(ImageRequest imageRequest) throws IOException {
        Uri sourceUri = imageRequest.getSourceUri();
        if (f.e(sourceUri)) {
            b a2 = a(sourceUri, imageRequest.getResizeOptions());
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public boolean canProvideImageForSize(ResizeOptions resizeOptions) {
        return ba.isImageBigEnough(f24218d.width(), f24218d.height(), resizeOptions);
    }

    private static int a(String str) {
        if (str != null) {
            try {
                return e.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e2) {
                FLog.e(f24215a, (Throwable) e2, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    @Nullable
    private b a(Uri uri, ResizeOptions resizeOptions) throws IOException {
        Cursor query = this.f24220f.query(uri, f24216b, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (resizeOptions != null) {
                b a2 = a(resizeOptions, query.getInt(query.getColumnIndex("_id")));
                if (a2 != null) {
                    a2.mRotationAngle = a(string);
                    query.close();
                    return a2;
                }
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imagepipeline.image.b a(com.facebook.imagepipeline.common.ResizeOptions r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            android.graphics.Rect r0 = f24219e
            int r0 = r0.width()
            android.graphics.Rect r1 = f24219e
            int r1 = r1.height()
            boolean r0 = com.facebook.imagepipeline.producers.ba.isImageBigEnough(r0, r1, r5)
            if (r0 == 0) goto L_0x0014
            r5 = 3
            goto L_0x0029
        L_0x0014:
            android.graphics.Rect r0 = f24218d
            int r0 = r0.width()
            android.graphics.Rect r1 = f24218d
            int r1 = r1.height()
            boolean r5 = com.facebook.imagepipeline.producers.ba.isImageBigEnough(r0, r1, r5)
            if (r5 == 0) goto L_0x0028
            r5 = 1
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            r0 = 0
            if (r5 != 0) goto L_0x002d
            return r0
        L_0x002d:
            android.content.ContentResolver r1 = r4.f24220f     // Catch:{ all -> 0x0081 }
            long r2 = (long) r6     // Catch:{ all -> 0x0081 }
            java.lang.String[] r6 = f24217c     // Catch:{ all -> 0x0081 }
            android.database.Cursor r5 = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(r1, r2, r5, r6)     // Catch:{ all -> 0x0081 }
            if (r5 != 0) goto L_0x003e
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r0
        L_0x003e:
            r5.moveToFirst()     // Catch:{ all -> 0x007f }
            int r6 = r5.getCount()     // Catch:{ all -> 0x007f }
            if (r6 <= 0) goto L_0x0079
            java.lang.String r6 = "_data"
            int r6 = r5.getColumnIndex(r6)     // Catch:{ all -> 0x007f }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x007f }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x007f }
            r1.<init>(r6)     // Catch:{ all -> 0x007f }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x0079
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x007f }
            r0.<init>(r6)     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x0065
            r6 = -1
            goto L_0x006f
        L_0x0065:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x007f }
            r1.<init>(r6)     // Catch:{ all -> 0x007f }
            long r1 = r1.length()     // Catch:{ all -> 0x007f }
            int r6 = (int) r1     // Catch:{ all -> 0x007f }
        L_0x006f:
            com.facebook.imagepipeline.image.b r6 = r4.b(r0, r6)     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x0078
            r5.close()
        L_0x0078:
            return r6
        L_0x0079:
            if (r5 == 0) goto L_0x007e
            r5.close()
        L_0x007e:
            return r0
        L_0x007f:
            r6 = move-exception
            goto L_0x0083
        L_0x0081:
            r6 = move-exception
            r5 = r0
        L_0x0083:
            if (r5 == 0) goto L_0x0088
            r5.close()
        L_0x0088:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.z.a(com.facebook.imagepipeline.common.ResizeOptions, int):com.facebook.imagepipeline.image.b");
    }

    public z(Executor executor, com.facebook.common.memory.f fVar, ContentResolver contentResolver) {
        super(executor, fVar);
        this.f24220f = contentResolver;
    }
}
