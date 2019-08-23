package com.bytedance.ttnet.utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f22658a = "https://crash.snssdk.com";
    static AtomicBoolean l = new AtomicBoolean(false);
    private static volatile a m;

    /* renamed from: b  reason: collision with root package name */
    final MediaType f22659b = MediaType.parse("multipart/form-data");

    /* renamed from: c  reason: collision with root package name */
    OkHttpClient f22660c = new OkHttpClient();

    /* renamed from: d  reason: collision with root package name */
    String f22661d;

    /* renamed from: e  reason: collision with root package name */
    public long f22662e = 10000;

    /* renamed from: f  reason: collision with root package name */
    int f22663f = 10;
    long g = 30;
    long h = 30;
    long i = 30;
    String j;
    Context k;

    /* renamed from: com.bytedance.ttnet.utils.a$a  reason: collision with other inner class name */
    static class C0237a implements Comparator<File> {
        C0237a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            if (((File) obj).lastModified() < ((File) obj2).lastModified()) {
                return 1;
            }
            return -1;
        }
    }

    static void a(String str) {
        new File(str).delete();
    }

    public static a a(Context context) {
        if (m == null) {
            synchronized (a.class) {
                if (m == null) {
                    m = new a(context);
                }
            }
        }
        return m;
    }

    private a(Context context) {
        this.k = context;
        String packageName = context.getPackageName();
        String str = Environment.getExternalStorageDirectory().getPath() + "/Android/data/" + packageName + "/cache/";
        this.f22661d = str + "minidump";
        this.j = f22658a + "/ttnet_crash/upload";
    }
}
