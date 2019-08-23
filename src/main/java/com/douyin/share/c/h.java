package com.douyin.share.c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import com.crashlytics.android.Crashlytics;
import com.douyin.share.a.a;
import com.douyin.share.b.a.d;
import com.ss.android.ugc.aweme.C0906R;
import java.io.ByteArrayOutputStream;

public final class h extends a {
    public final String a() {
        return null;
    }

    public final boolean a(Context context) {
        return new d((Activity) context, "1462309810").f23178a.isWeiboAppInstalled();
    }

    public final void a(Context context, Uri uri) {
        a(context, uri, "", "");
    }

    public final void a(Context context, Uri uri, String str, String str2) {
        if (context instanceof Activity) {
            d dVar = new d((Activity) context, "1462309810");
            final Uri uri2 = uri;
            final String str3 = str2;
            final Context context2 = context;
            final String str4 = str;
            AnonymousClass1 r3 = new com.douyin.share.a.b.b.a() {
                public final String e() {
                    return "";
                }

                public final long j() {
                    return 0;
                }

                public final long k() {
                    return 0;
                }

                public final long l() {
                    return 0;
                }

                public final String b() {
                    return str3;
                }

                public final String d() {
                    return str4;
                }

                public final String i() {
                    return str4;
                }

                public final String a() {
                    return uri2.getPath();
                }

                public final String g() {
                    return uri2.getPath();
                }

                public final String h() {
                    return uri2.getPath();
                }

                public final String c() {
                    return context2.getString(C0906R.string.ak);
                }

                public final byte[] f() {
                    return a(BitmapFactory.decodeFile(uri2.getPath()));
                }

                private byte[] a(Bitmap bitmap) {
                    float f2;
                    if (bitmap == null) {
                        return new byte[0];
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (width > height) {
                        f2 = 720.0f / ((float) width);
                    } else {
                        f2 = 720.0f / ((float) height);
                    }
                    Matrix matrix = new Matrix();
                    matrix.postScale(f2, f2);
                    Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false).compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e2) {
                        Crashlytics.logException(e2);
                    }
                    return byteArray;
                }
            };
            dVar.a(r3);
            return;
        }
        throw new IllegalArgumentException("context must be instance of Activity.");
    }
}
