package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.mapcore2d.er;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;

public class cx extends Thread implements er.a {
    private static String h = "sodownload";
    private static String i = "sofail";

    /* renamed from: a  reason: collision with root package name */
    private er f5896a = new er(this.f5897b);

    /* renamed from: b  reason: collision with root package name */
    private a f5897b;

    /* renamed from: c  reason: collision with root package name */
    private RandomAccessFile f5898c;

    /* renamed from: d  reason: collision with root package name */
    private String f5899d;

    /* renamed from: e  reason: collision with root package name */
    private String f5900e;

    /* renamed from: f  reason: collision with root package name */
    private String f5901f;
    private Context g;

    static class a extends ev {

        /* renamed from: a  reason: collision with root package name */
        private String f5902a;

        public Map<String, String> e() {
            return null;
        }

        public Map<String, String> f() {
            return null;
        }

        public String g() {
            return this.f5902a;
        }

        a(String str) {
            this.f5902a = str;
        }
    }

    public void b() {
        d();
    }

    private void d() {
        File file = new File(this.f5899d);
        if (file.exists()) {
            file.delete();
        }
    }

    public void run() {
        try {
            File file = new File(b(this.g, "tempfile"));
            if (file.exists()) {
                file.delete();
            }
            this.f5896a.a(this);
        } catch (Throwable th) {
            dd.a(th, "SDKCoordinatorDownload", "run");
            d();
        }
    }

    public void a() {
        if (this.f5897b != null && !TextUtils.isEmpty(this.f5897b.g()) && this.f5897b.g().contains("libJni_wgs2gcj.so") && this.f5897b.g().contains(Build.CPU_ABI) && !new File(this.f5900e).exists()) {
            start();
        }
    }

    public void c() {
        try {
            if (this.f5898c != null) {
                this.f5898c.close();
            }
            String a2 = cv.a(this.f5899d);
            if (a2 == null || !a2.equalsIgnoreCase(this.f5901f)) {
                d();
            } else if (new File(this.f5900e).exists()) {
                d();
            } else {
                new File(this.f5899d).renameTo(new File(this.f5900e));
            }
        } catch (Throwable th) {
            d();
            File file = new File(this.f5900e);
            if (file.exists()) {
                file.delete();
            }
            dd.a(th, "SDKCoordinatorDownload", "onFinish");
        }
    }

    public void a(Throwable th) {
        try {
            if (this.f5898c != null) {
                this.f5898c.close();
            }
            d();
            File file = new File(b(this.g, "tempfile"));
            if (!file.exists()) {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdir();
                }
                file.createNewFile();
            }
        } catch (Throwable th2) {
            dd.a(th2, "SDKCoordinatorDownload", "onException");
        }
    }

    private static String b(Context context, String str) {
        return a(context, str);
    }

    public static String a(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "libso" + File.separator + str;
    }

    public void a(byte[] bArr, long j) {
        try {
            if (this.f5898c == null) {
                File file = new File(this.f5899d);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.f5898c = new RandomAccessFile(file, "rw");
            }
        } catch (FileNotFoundException e2) {
            dd.a((Throwable) e2, "SDKCoordinatorDownload", "onDownload");
            d();
        } catch (Throwable th) {
            d();
            dd.a(th, "SDKCoordinatorDownload", "onDownload");
        }
        if (this.f5898c != null) {
            try {
                this.f5898c.seek(j);
                this.f5898c.write(bArr);
            } catch (IOException e3) {
                d();
                dd.a((Throwable) e3, "SDKCoordinatorDownload", "onDownload");
            }
        }
    }

    public cx(Context context, String str, String str2, String str3) {
        this.g = context;
        this.f5901f = str3;
        this.f5899d = a(context, str + "temp.so");
        this.f5900e = a(context, "libwgs2gcj.so");
        this.f5897b = new a(str2);
    }
}
