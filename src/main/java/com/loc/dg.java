package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.loc.aj;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;

@Deprecated
public class dg extends Thread implements aj.a {
    private static String h = "sodownload";
    private static String i = "sofail";

    /* renamed from: a  reason: collision with root package name */
    private aj f25790a = new aj(this.f25791b);

    /* renamed from: b  reason: collision with root package name */
    protected a f25791b;

    /* renamed from: c  reason: collision with root package name */
    protected RandomAccessFile f25792c;

    /* renamed from: d  reason: collision with root package name */
    protected String f25793d;

    /* renamed from: e  reason: collision with root package name */
    protected String f25794e;

    /* renamed from: f  reason: collision with root package name */
    protected String f25795f;
    protected Context g;

    public static class a extends al {

        /* renamed from: a  reason: collision with root package name */
        private String f25796a;

        a(String str) {
            this.f25796a = str;
        }

        public final Map<String, String> a() {
            return null;
        }

        public final Map<String, String> b() {
            return null;
        }

        public final String c() {
            return this.f25796a;
        }
    }

    public dg(Context context, String str, String str2, String str3) {
        this.g = context;
        this.f25795f = str3;
        this.f25793d = a(context, str + "temp.so");
        this.f25794e = a(context, "libwgs2gcj.so");
        this.f25791b = new a(str2);
    }

    public static String a(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "libso" + File.separator + str;
    }

    public void a() {
        if (this.f25791b != null && !TextUtils.isEmpty(this.f25791b.c()) && this.f25791b.c().contains("libJni_wgs2gcj.so") && this.f25791b.c().contains(di.a(this.g)) && !new File(this.f25794e).exists()) {
            start();
        }
    }

    public final void a(byte[] bArr, long j) {
        try {
            if (this.f25792c == null) {
                File file = new File(this.f25793d);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.f25792c = new RandomAccessFile(file, "rw");
            }
        } catch (FileNotFoundException e2) {
            i.b((Throwable) e2, "sdl", "oDd");
            b();
        } catch (Throwable th) {
            b();
            i.b(th, "sdl", "oDd");
            return;
        }
        if (this.f25792c != null) {
            try {
                this.f25792c.seek(j);
                this.f25792c.write(bArr);
            } catch (IOException e3) {
                b();
                i.b((Throwable) e3, "sdl", "oDd");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        File file = new File(this.f25793d);
        if (file.exists()) {
            file.delete();
        }
    }

    public final void c() {
        try {
            if (this.f25792c != null) {
                this.f25792c.close();
            }
            b();
            File file = new File(a(this.g, "tempfile"));
            if (!file.exists()) {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdir();
                }
                file.createNewFile();
            }
        } catch (Throwable th) {
            i.b(th, "sdl", "oe");
        }
    }

    public void d() {
        try {
            if (this.f25792c != null) {
                this.f25792c.close();
            }
            String a2 = de.a(this.f25793d);
            if (a2 == null || !a2.equalsIgnoreCase(this.f25795f)) {
                b();
            } else if (new File(this.f25794e).exists()) {
                b();
            } else {
                new File(this.f25793d).renameTo(new File(this.f25794e));
            }
        } catch (Throwable th) {
            b();
            File file = new File(this.f25794e);
            if (file.exists()) {
                file.delete();
            }
            i.b(th, "sdl", "ofs");
        }
    }

    public final void e() {
        b();
    }

    public void run() {
        try {
            File file = new File(a(this.g, "tempfile"));
            if (file.exists()) {
                file.delete();
            }
            this.f25790a.a(this);
        } catch (Throwable th) {
            i.b(th, "sdl", "run");
            b();
        }
    }
}
