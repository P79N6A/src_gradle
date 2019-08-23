package com.facebook.common.f;

import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Nullable;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f23525a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    public static boolean c(@Nullable Uri uri) {
        return "file".equals(h(uri));
    }

    public static boolean d(@Nullable Uri uri) {
        return PushConstants.CONTENT.equals(h(uri));
    }

    public static boolean f(@Nullable Uri uri) {
        return "asset".equals(h(uri));
    }

    public static boolean g(@Nullable Uri uri) {
        return "res".equals(h(uri));
    }

    @Nullable
    public static String h(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri a(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    public static boolean b(@Nullable Uri uri) {
        String h = h(uri);
        if ("https".equals(h) || "http".equals(h)) {
            return true;
        }
        return false;
    }

    @Nullable
    public static URL a(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean e(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            boolean r0 = d(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0038
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0030 }
            if (r8 == 0) goto L_0x002a
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0028 }
            if (r9 == 0) goto L_0x002a
            java.lang.String r9 = "_data"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0028 }
            r0 = -1
            if (r9 == r0) goto L_0x002a
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x0028 }
            r1 = r9
            goto L_0x002a
        L_0x0028:
            r9 = move-exception
            goto L_0x0032
        L_0x002a:
            if (r8 == 0) goto L_0x0042
            r8.close()
            goto L_0x0042
        L_0x0030:
            r9 = move-exception
            r8 = r1
        L_0x0032:
            if (r8 == 0) goto L_0x0037
            r8.close()
        L_0x0037:
            throw r9
        L_0x0038:
            boolean r8 = c(r9)
            if (r8 == 0) goto L_0x0042
            java.lang.String r1 = r9.getPath()
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.f.f.a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
