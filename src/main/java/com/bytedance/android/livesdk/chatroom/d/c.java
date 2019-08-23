package com.bytedance.android.livesdk.chatroom.d;

import android.content.Context;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9888a = null;

    /* renamed from: b  reason: collision with root package name */
    static String f9889b = null;

    /* renamed from: c  reason: collision with root package name */
    static String f9890c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f9891d = "c";

    public static String a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f9888a, true, 5345, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f9888a, true, 5345, new Class[]{Context.class}, String.class);
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            return null;
        }
        return externalCacheDir.getAbsolutePath();
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f9888a, true, 5350, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f9888a, true, 5350, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        File file = new File(str2);
        if (file.exists() && file.isDirectory()) {
            return true;
        }
        if (!file.exists() || file.delete()) {
            return file.mkdirs();
        }
        return false;
    }

    static void a(Bitmap bitmap, String str) throws IOException {
        Bitmap bitmap2 = bitmap;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{bitmap2, str2}, null, f9888a, true, 5352, new Class[]{Bitmap.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2, str2}, null, f9888a, true, 5352, new Class[]{Bitmap.class, String.class}, Void.TYPE);
            return;
        }
        File file = new File(str2);
        if (file.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap2.compress(Bitmap.CompressFormat.JPEG, 75, fileOutputStream);
            fileOutputStream.close();
            bitmap.recycle();
            return;
        }
        bitmap.recycle();
        throw new IOException("Can not create screenshot file");
    }
}
