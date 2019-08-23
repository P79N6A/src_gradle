package com.alimama.tunion.a;

import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f5140a;

    /* renamed from: b  reason: collision with root package name */
    private LruCache<String, String> f5141b;

    private a() {
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 10240);
        if (Build.VERSION.SDK_INT > 11) {
            this.f5141b = new LruCache<String, String>(maxMemory) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int sizeOf(String str, String str2) {
                    return str2.length();
                }
            };
        }
    }

    public static a a() {
        if (f5140a == null) {
            synchronized (a.class) {
                if (f5140a == null) {
                    f5140a = new a();
                }
            }
        }
        return f5140a;
    }

    public String a(String str) {
        if (this.f5141b == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f5141b.get(str);
    }

    public void a(String str, String str2) {
        if (this.f5141b != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f5141b.put(str, str2);
        }
    }
}
