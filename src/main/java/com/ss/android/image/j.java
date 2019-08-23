package com.ss.android.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.io.FileUtils;
import com.ss.android.common.util.h;
import com.ss.android.download.a.c;
import java.io.ByteArrayOutputStream;
import java.io.File;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    c.a<String, String, String, Void, Object> f29266a;

    /* renamed from: b  reason: collision with root package name */
    public c<String, String, String, Void, Object> f29267b;

    /* renamed from: c  reason: collision with root package name */
    final Context f29268c;

    /* renamed from: d  reason: collision with root package name */
    final h f29269d;

    /* renamed from: e  reason: collision with root package name */
    final com.ss.android.common.util.c<String> f29270e;

    /* renamed from: f  reason: collision with root package name */
    final b f29271f;
    public final a g;
    public boolean h;

    public interface a {
        void a(String str, Object obj);
    }

    public final void a() {
        this.h = true;
        this.f29267b.d();
    }

    public final void b() {
        this.f29267b.c();
    }

    public final void c() {
        this.h = false;
        this.f29267b.b();
        if (this.f29269d != null) {
            this.f29269d.a();
        }
    }

    private static pl.droidsonroids.gif.a b(String str) {
        try {
            return new pl.droidsonroids.gif.a(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Bitmap a(String str) {
        try {
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(str, -1);
            if (bitmapFromSD == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapFromSD.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            bitmapFromSD.recycle();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPurgeable = true;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Object a(String str, String str2, String str3) {
        try {
            String d2 = this.f29271f.d(str);
            String f2 = this.f29271f.f(str);
            File file = new File(d2);
            File file2 = new File(d2);
            boolean z = false;
            if (file.isFile() || file2.isFile()) {
                z = true;
            }
            if (!z) {
                String b2 = this.f29271f.b(str);
                String c2 = b.c(str);
                String str4 = str2;
                String str5 = str3;
                z = d.a(this.f29268c, -1, str4, str5, b2, this.f29271f.e(str), c2, this.f29270e, this.f29269d);
            }
            if (z) {
                File file3 = new File(d2);
                if (!file3.isFile()) {
                    file3 = new File(f2);
                    d2 = f2;
                }
                if (!file3.isFile() || !FileUtils.isGif(file3)) {
                    return a(d2);
                }
                return b(d2);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public j(Context context, h hVar, b bVar, com.ss.android.common.util.c<String> cVar, a aVar) {
        this(context, hVar, bVar, cVar, aVar, 16, 2);
    }

    private j(Context context, h hVar, b bVar, com.ss.android.common.util.c<String> cVar, a aVar, int i, int i2) {
        this.f29268c = context.getApplicationContext();
        this.f29269d = hVar;
        this.f29271f = bVar;
        this.g = aVar;
        this.f29270e = cVar;
        this.f29266a = new c.a<String, String, String, Void, Object>() {
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
                return j.this.a((String) obj, (String) obj2, (String) obj3);
            }

            public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                String str = (String) obj2;
                j jVar = j.this;
                if (jVar.h && jVar.g != null) {
                    jVar.g.a(str, obj5);
                }
            }
        };
        this.f29267b = new c<>(16, 2, this.f29266a);
        this.h = true;
    }
}
