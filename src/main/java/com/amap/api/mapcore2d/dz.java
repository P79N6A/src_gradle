package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.mapcore2d.ee;
import com.amap.api.mapcore2d.ei;
import com.amap.api.mapcore2d.er;
import com.ss.android.ugc.aweme.q.c;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.List;

public class dz extends Thread implements er.a {

    /* renamed from: a  reason: collision with root package name */
    private ea f5988a;

    /* renamed from: b  reason: collision with root package name */
    private er f5989b;

    /* renamed from: c  reason: collision with root package name */
    private cy f5990c;

    /* renamed from: d  reason: collision with root package name */
    private String f5991d;

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f5992e;

    /* renamed from: f  reason: collision with root package name */
    private Context f5993f;

    public void b() {
    }

    private boolean g() {
        if (Build.VERSION.SDK_INT < this.f5988a.g || Build.VERSION.SDK_INT > this.f5988a.f6006f) {
            return false;
        }
        return true;
    }

    private boolean f() {
        dm dmVar = new dm(this.f5993f, eg.c());
        if (a(dmVar)) {
            return true;
        }
        ei a2 = ee.a.a(dmVar, this.f5988a.f6001a);
        if (a2 != null) {
            return a(dmVar, a2, this.f5988a);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        if (this.f5990c != null && this.f5990c.a().equals(this.f5988a.f6002b) && this.f5990c.b().equals(this.f5988a.f6003c)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        try {
            if (!d() || !g() || !a(this.f5993f) || f()) {
                return false;
            }
            ee.b(this.f5993f, this.f5990c.a());
            return true;
        } catch (Throwable th) {
            ek.a(th, "dDownLoad", "isNeedDownload()");
            return false;
        }
    }

    public void run() {
        try {
            if (e()) {
                fb fbVar = new fb(this.f5993f, this.f5990c.a(), this.f5990c.b(), "O008");
                fbVar.a("{\"param_int_first\":0}");
                fc.a(fbVar, this.f5993f);
                this.f5989b.a(this);
            }
        } catch (Throwable th) {
            ek.a(th, "dDownLoad", "run()");
        }
    }

    public void c() {
        try {
            if (this.f5992e != null) {
                ek.a((Closeable) this.f5992e);
                String b2 = this.f5988a.b();
                if (ek.b(this.f5991d, b2)) {
                    a(b2);
                    fb fbVar = new fb(this.f5993f, this.f5990c.a(), this.f5990c.b(), "O008");
                    fbVar.a("{\"param_int_first\":1}");
                    fc.a(fbVar, this.f5993f);
                } else {
                    new File(this.f5991d).delete();
                }
            }
        } catch (Throwable th) {
            ek.a(th, "dDownLoad", "onFinish()");
        }
    }

    public void a() {
        try {
            start();
        } catch (Throwable th) {
            ek.a(th, "dDownLoad", "startDownload()");
        }
    }

    public void a(Throwable th) {
        try {
            ek.a((Closeable) this.f5992e);
        } catch (Throwable unused) {
        }
    }

    private boolean a(Context context) {
        if (ct.m(context) == 1) {
            return true;
        }
        return false;
    }

    private boolean a(dm dmVar) {
        try {
            List a2 = ee.a.a(dmVar, this.f5988a.f6002b, "used");
            if (a2 != null && a2.size() > 0 && ek.a(((ei) a2.get(0)).e(), this.f5988a.f6004d) > 0) {
                return true;
            }
        } catch (Throwable th) {
            ek.a(th, "dDownLoad", "isUsed()");
        }
        return false;
    }

    private void b(dm dmVar) {
        if (!new File(ee.b(this.f5993f, this.f5990c.a(), this.f5990c.b())).exists() && !TextUtils.isEmpty(ee.a(this.f5993f, dmVar, this.f5990c))) {
            try {
                ee.a(this.f5993f, this.f5990c);
            } catch (Throwable unused) {
            }
        }
    }

    private void a(String str) {
        String c2 = this.f5988a.c();
        dm dmVar = new dm(this.f5993f, eg.c());
        ei.a aVar = new ei.a(this.f5988a.f6001a, str, this.f5988a.f6002b, c2, this.f5988a.f6004d);
        ee.a.a(dmVar, aVar.a("copy").a(), ei.a(this.f5988a.f6001a, this.f5988a.f6002b, c2, this.f5988a.f6004d));
        a(this.f5993f, this.f5988a.f6002b);
        try {
            ee.a(this.f5993f, dmVar, this.f5990c, this.f5991d, this.f5988a.f6004d);
            ee.a(this.f5993f, this.f5990c);
        } catch (Throwable th) {
            ek.a(th, "dDownLoad", "onFinish1");
        }
    }

    private void a(Context context, String str) {
        try {
            SharedPreferences.Editor edit = c.a(context, str, 0).edit();
            edit.clear();
            edit.commit();
        } catch (Throwable th) {
            ek.a(th, "dDownLoad", "clearMarker()");
        }
    }

    public void a(byte[] bArr, long j) {
        try {
            if (this.f5992e == null) {
                File file = new File(this.f5991d);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.f5992e = new RandomAccessFile(file, "rw");
            }
            this.f5992e.seek(j);
            this.f5992e.write(bArr);
        } catch (Throwable th) {
            ek.a(th, "dDownLoad", "onDownload()");
        }
    }

    public dz(Context context, ea eaVar, cy cyVar) {
        try {
            this.f5993f = context.getApplicationContext();
            this.f5990c = cyVar;
            if (eaVar != null) {
                this.f5988a = eaVar;
                this.f5989b = new er(new ed(this.f5988a));
                this.f5991d = ee.a(context, this.f5988a.f6001a);
            }
        } catch (Throwable th) {
            ek.a(th, "dDownLoad", "DexDownLoad()");
        }
    }

    private boolean a(dm dmVar, ei eiVar, ea eaVar) {
        String str = eaVar.f6002b;
        String str2 = eaVar.f6003c;
        String str3 = eaVar.f6004d;
        if ("errorstatus".equals(eiVar.f())) {
            b(dmVar);
            return true;
        } else if (!new File(this.f5991d).exists()) {
            return false;
        } else {
            List<ei> b2 = dmVar.b(ei.a(ee.a(this.f5993f, str, str2), str, str2, str3), ei.class);
            if (b2 != null && b2.size() > 0) {
                return true;
            }
            try {
                ee.a(this.f5993f, str, this.f5990c.b());
                ee.a(this.f5993f, dmVar, this.f5990c, this.f5991d, str3);
                ee.a(this.f5993f, this.f5990c);
            } catch (Throwable th) {
                ek.a(th, "dDownLoad", "processDownloadedFile()");
            }
            return true;
        }
    }
}
