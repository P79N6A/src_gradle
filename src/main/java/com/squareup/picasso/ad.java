package com.squareup.picasso;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    static final StringBuilder f27398a = new StringBuilder();

    @TargetApi(12)
    static class a {
        static int a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    static class b extends Thread {
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }

        public b(Runnable runnable) {
            super(runnable);
        }
    }

    static class c implements ThreadFactory {
        c() {
        }

        public final Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    static void a() {
        if (!b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static String a(v vVar) {
        String a2 = a(vVar, f27398a);
        f27398a.setLength(0);
        return a2;
    }

    private static String a(v vVar, StringBuilder sb) {
        if (vVar.f27466f != null) {
            sb.ensureCapacity(vVar.f27466f.length() + 50);
            sb.append(vVar.f27466f);
        } else if (vVar.f27464d != null) {
            String uri = vVar.f27464d.toString();
            sb.ensureCapacity(uri.length() + 50);
            sb.append(uri);
        } else {
            sb.ensureCapacity(50);
            sb.append(vVar.f27465e);
        }
        sb.append(10);
        if (vVar.m != 0.0f) {
            sb.append("rotation:");
            sb.append(vVar.m);
            if (vVar.p) {
                sb.append('@');
                sb.append(vVar.n);
                sb.append('x');
                sb.append(vVar.o);
            }
            sb.append(10);
        }
        if (vVar.c()) {
            sb.append("resize:");
            sb.append(vVar.h);
            sb.append('x');
            sb.append(vVar.i);
            sb.append(10);
        }
        if (vVar.j) {
            sb.append("centerCrop\n");
        } else if (vVar.k) {
            sb.append("centerInside\n");
        }
        if (vVar.g != null) {
            int size = vVar.g.size();
            for (int i = 0; i < size; i++) {
                sb.append(vVar.g.get(i).a());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    static boolean a(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if (!"CONDITIONAL_CACHE".equals(split[0]) || Integer.parseInt(split[1]) != 304) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    static void a(Looper looper) {
        AnonymousClass1 r0 = new Handler(looper) {
            public final void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000);
            }
        };
        r0.sendMessageDelayed(r0.obtainMessage(), 1000);
    }

    private static boolean b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static i a(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return new r(context);
        } catch (ClassNotFoundException unused) {
            return new ac(context);
        }
    }

    static File b(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static boolean c(Context context) {
        try {
            if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    static int a(Bitmap bitmap) {
        int i;
        if (Build.VERSION.SDK_INT >= 12) {
            i = a.a(bitmap);
        } else {
            i = bitmap.getRowBytes() * bitmap.getHeight();
        }
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static long a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    static byte[] b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    static String a(c cVar) {
        return a(cVar, "");
    }

    static <T> T a(Context context, String str) {
        return context.getSystemService(str);
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static int a(Resources resources, v vVar) throws FileNotFoundException {
        int i;
        if (vVar.f27465e != 0 || vVar.f27464d == null) {
            return vVar.f27465e;
        }
        String authority = vVar.f27464d.getAuthority();
        if (authority != null) {
            List<String> pathSegments = vVar.f27464d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + vVar.f27464d);
            }
            if (pathSegments.size() == 1) {
                try {
                    i = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + vVar.f27464d);
                }
            } else if (pathSegments.size() == 2) {
                i = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + vVar.f27464d);
            }
            return i;
        }
        throw new FileNotFoundException("No package provided: " + vVar.f27464d);
    }

    static Resources a(Context context, v vVar) throws FileNotFoundException {
        if (vVar.f27465e != 0 || vVar.f27464d == null) {
            return context.getResources();
        }
        String authority = vVar.f27464d.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + vVar.f27464d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + vVar.f27464d);
        }
    }

    static String a(c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        a aVar = cVar.k;
        if (aVar != null) {
            sb.append(aVar.f27382b.a());
        }
        List<a> list = cVar.l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || aVar != null) {
                    sb.append(", ");
                }
                sb.append(list.get(i).f27382b.a());
            }
        }
        return sb.toString();
    }
}
