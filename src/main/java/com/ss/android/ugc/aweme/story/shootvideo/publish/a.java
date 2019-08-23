package com.ss.android.ugc.aweme.story.shootvideo.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73633a;

    private static FileInputStream a(File file) {
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{file2}, null, f73633a, true, 85385, new Class[]{File.class}, FileInputStream.class)) {
            return (FileInputStream) PatchProxy.accessDispatch(new Object[]{file2}, null, f73633a, true, 85385, new Class[]{File.class}, FileInputStream.class);
        }
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file2);
        } catch (FileNotFoundException unused) {
        }
        return fileInputStream;
    }

    public static FileInputStream a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f73633a, true, 85386, new Class[]{String.class}, FileInputStream.class)) {
            return a(new File(str2));
        }
        return (FileInputStream) PatchProxy.accessDispatch(new Object[]{str2}, null, f73633a, true, 85386, new Class[]{String.class}, FileInputStream.class);
    }

    private static boolean a(Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, f73633a, true, 85382, new Class[]{Closeable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{closeable}, null, f73633a, true, 85382, new Class[]{Closeable.class}, Boolean.TYPE)).booleanValue();
        }
        if (closeable != null) {
            try {
                closeable.close();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream2 = inputStream;
        if (PatchProxy.isSupport(new Object[]{inputStream2}, null, f73633a, true, 85389, new Class[]{InputStream.class}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{inputStream2}, null, f73633a, true, 85389, new Class[]{InputStream.class}, byte[].class);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (inputStream2 != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(524288);
            } catch (IOException unused) {
                byteArrayOutputStream = null;
                a((Closeable) byteArrayOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                a((Closeable) byteArrayOutputStream2);
                throw th;
            }
            try {
                a(inputStream2, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                a((Closeable) byteArrayOutputStream);
                return byteArray;
            } catch (IOException unused2) {
                a((Closeable) byteArrayOutputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream2 = byteArrayOutputStream;
                a((Closeable) byteArrayOutputStream2);
                throw th;
            }
        }
        return null;
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        InputStream inputStream2;
        InputStream inputStream3 = inputStream;
        OutputStream outputStream2 = outputStream;
        if (PatchProxy.isSupport(new Object[]{inputStream3, outputStream2}, null, f73633a, true, 85388, new Class[]{InputStream.class, OutputStream.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inputStream3, outputStream2}, null, f73633a, true, 85388, new Class[]{InputStream.class, OutputStream.class}, Void.TYPE);
            return;
        }
        try {
            byte[] bArr = new byte[524288];
            if (PatchProxy.isSupport(new Object[]{inputStream3}, null, f73633a, true, 85383, new Class[]{InputStream.class}, InputStream.class)) {
                inputStream2 = (InputStream) PatchProxy.accessDispatch(new Object[]{inputStream3}, null, f73633a, true, 85383, new Class[]{InputStream.class}, InputStream.class);
            } else if (inputStream3 instanceof BufferedInputStream) {
                inputStream2 = inputStream3;
            } else {
                inputStream2 = new BufferedInputStream(inputStream3, 524288);
            }
            try {
                if (PatchProxy.isSupport(new Object[]{outputStream2}, null, f73633a, true, 85384, new Class[]{OutputStream.class}, OutputStream.class)) {
                    outputStream2 = (OutputStream) PatchProxy.accessDispatch(new Object[]{outputStream2}, null, f73633a, true, 85384, new Class[]{OutputStream.class}, OutputStream.class);
                } else if (!(outputStream2 instanceof BufferedOutputStream)) {
                    outputStream2 = new BufferedOutputStream(outputStream2, 524288);
                }
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read != -1) {
                        outputStream2.write(bArr, 0, read);
                        outputStream2.flush();
                    } else {
                        outputStream2.flush();
                        a((Closeable) inputStream2);
                        return;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStream2 = inputStream3;
            throw e;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream3;
            a((Closeable) inputStream2);
            throw th;
        }
    }
}
