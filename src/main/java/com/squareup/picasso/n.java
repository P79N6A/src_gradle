package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.IOException;

public final class n extends g {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f27433b = {"orientation"};

    enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int androidKind;
        final int height;
        final int width;

        private a(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    n(Context context) {
        super(context);
    }

    public final boolean a(v vVar) {
        Uri uri = vVar.f27464d;
        if (!PushConstants.CONTENT.equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    public final x.a b(v vVar) throws IOException {
        boolean z;
        a aVar;
        Bitmap bitmap;
        int i;
        v vVar2 = vVar;
        ContentResolver contentResolver = this.f27415a.getContentResolver();
        int a2 = a(contentResolver, vVar2.f27464d);
        String type = contentResolver.getType(vVar2.f27464d);
        if (type == null || !type.startsWith("video/")) {
            z = false;
        } else {
            z = true;
        }
        if (vVar.c()) {
            int i2 = vVar2.h;
            int i3 = vVar2.i;
            if (i2 <= a.MICRO.width && i3 <= a.MICRO.height) {
                aVar = a.MICRO;
            } else if (i2 > a.MINI.width || i3 > a.MINI.height) {
                aVar = a.FULL;
            } else {
                aVar = a.MINI;
            }
            a aVar2 = aVar;
            if (!z && aVar2 == a.FULL) {
                return new x.a(null, c(vVar), s.d.DISK, a2);
            }
            long parseId = ContentUris.parseId(vVar2.f27464d);
            BitmapFactory.Options d2 = d(vVar);
            d2.inJustDecodeBounds = true;
            BitmapFactory.Options options = d2;
            a(vVar2.h, vVar2.i, aVar2.width, aVar2.height, d2, vVar);
            if (z) {
                if (aVar2 == a.FULL) {
                    i = 1;
                } else {
                    i = aVar2.androidKind;
                }
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, i, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, aVar2.androidKind, options);
            }
            if (bitmap != null) {
                return new x.a(bitmap, null, s.d.DISK, a2);
            }
        }
        return new x.a(null, c(vVar), s.d.DISK, a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = f27433b     // Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
            if (r8 == 0) goto L_0x0022
            boolean r9 = r8.moveToFirst()     // Catch:{ RuntimeException -> 0x0031, all -> 0x0020 }
            if (r9 != 0) goto L_0x0016
            goto L_0x0022
        L_0x0016:
            int r9 = r8.getInt(r0)     // Catch:{ RuntimeException -> 0x0031, all -> 0x0020 }
            if (r8 == 0) goto L_0x001f
            r8.close()
        L_0x001f:
            return r9
        L_0x0020:
            r9 = move-exception
            goto L_0x002a
        L_0x0022:
            if (r8 == 0) goto L_0x0027
            r8.close()
        L_0x0027:
            return r0
        L_0x0028:
            r9 = move-exception
            r8 = r1
        L_0x002a:
            if (r8 == 0) goto L_0x002f
            r8.close()
        L_0x002f:
            throw r9
        L_0x0030:
            r8 = r1
        L_0x0031:
            if (r8 == 0) goto L_0x0036
            r8.close()
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.n.a(android.content.ContentResolver, android.net.Uri):int");
    }
}
