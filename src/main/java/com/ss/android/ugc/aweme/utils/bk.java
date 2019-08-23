package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class bk {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75619a;

    private static void a(@Nullable Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, f75619a, true, 88302, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, null, f75619a, true, 88302, new Class[]{Closeable.class}, Void.TYPE);
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    private static boolean a(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) {
        InputStream inputStream2 = inputStream;
        OutputStream outputStream2 = outputStream;
        if (PatchProxy.isSupport(new Object[]{inputStream2, outputStream2}, null, f75619a, true, 88301, new Class[]{InputStream.class, OutputStream.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{inputStream2, outputStream2}, null, f75619a, true, 88301, new Class[]{InputStream.class, OutputStream.class}, Boolean.TYPE)).booleanValue();
        }
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream2.read(bArr);
                if (read != -1) {
                    outputStream2.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return true;
                }
            } catch (Exception unused) {
                return false;
            } finally {
                a(inputStream);
                a(outputStream);
            }
        }
    }

    private static boolean a(@NonNull Context context, @NonNull String str, @NonNull File file) {
        String str2 = str;
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{context, str2, file2}, null, f75619a, true, 88300, new Class[]{Context.class, String.class, File.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2, file2}, null, f75619a, true, 88300, new Class[]{Context.class, String.class, File.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return a(context.getAssets().open(str2), new FileOutputStream(file2));
        } catch (IOException unused) {
            return false;
        }
    }

    @Nullable
    public static String a(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f75619a, true, 88298, new Class[]{Context.class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f75619a, true, 88298, new Class[]{Context.class, String.class, String.class}, String.class);
        }
        File file = new File(str4);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file.getAbsoluteFile() + "/" + str3);
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        if (a(context2, str3, file2)) {
            return file2.getAbsolutePath();
        }
        return null;
    }

    @Nullable
    public static String a(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6}, null, f75619a, true, 88299, new Class[]{Context.class, String.class, String.class, String.class}, String.class)) {
            Object[] objArr = {context2, str4, str5, str6};
            return (String) PatchProxy.accessDispatch(objArr, null, f75619a, true, 88299, new Class[]{Context.class, String.class, String.class, String.class}, String.class);
        }
        File file = new File(str6);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file.getAbsoluteFile() + "/" + str5);
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        if (a(context2, str4, file2)) {
            return file2.getAbsolutePath();
        }
        return null;
    }
}
