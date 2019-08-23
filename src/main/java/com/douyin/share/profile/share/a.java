package com.douyin.share.profile.share;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Environment;
import android.os.SystemClock;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.io.FileUtils;
import com.ss.android.ugc.aweme.video.b;
import java.io.ByteArrayOutputStream;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f23251a;

    /* renamed from: b  reason: collision with root package name */
    private static String f23252b;

    public static String a() {
        return f23251a + "/" + f23252b;
    }

    public static String b(Bitmap bitmap) {
        File d2 = b.d();
        if (d2 != null) {
            f23251a = d2.getAbsolutePath();
        } else {
            f23251a = "";
        }
        f23252b = "profile.data";
        BitmapUtils.saveBitmapToSD(bitmap, f23251a, f23252b);
        return new File(f23251a, f23252b).getPath();
    }

    public static byte[] a(Bitmap bitmap) {
        if (bitmap == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        float sqrt = (float) Math.sqrt((double) (32768.0f / ((float) byteArrayOutputStream.toByteArray().length)));
        Matrix matrix = new Matrix();
        matrix.setScale(sqrt, sqrt);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        byteArrayOutputStream.reset();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        Bitmap bitmap2 = createBitmap;
        while (byteArrayOutputStream.toByteArray().length > 32768) {
            matrix.setScale(0.9f, 0.9f);
            bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            byteArrayOutputStream.reset();
            bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String a(String str, String str2) {
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || !Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        File file = new File(str);
        String md5Hex = DigestUtils.md5Hex(String.valueOf(SystemClock.currentThreadTimeMillis()));
        File file2 = new File(str2, md5Hex);
        FileUtils.copyFile(file.getAbsolutePath(), str2, md5Hex);
        return file2.getAbsolutePath();
    }
}
