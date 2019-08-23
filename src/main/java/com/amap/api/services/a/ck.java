package com.amap.api.services.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.services.a.cq;
import com.amap.api.services.a.cu;
import com.amap.api.services.a.dd;
import com.ss.android.ugc.aweme.q.c;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.List;

public class ck extends Thread implements dd.a {

    /* renamed from: a  reason: collision with root package name */
    private cl f6716a;

    /* renamed from: b  reason: collision with root package name */
    private dd f6717b;

    /* renamed from: c  reason: collision with root package name */
    private bn f6718c;

    /* renamed from: d  reason: collision with root package name */
    private String f6719d;

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f6720e;

    /* renamed from: f  reason: collision with root package name */
    private Context f6721f;

    public void e() {
    }

    private boolean g() {
        if (Build.VERSION.SDK_INT < this.f6716a.g || Build.VERSION.SDK_INT > this.f6716a.f6727f) {
            return false;
        }
        return true;
    }

    private boolean f() {
        ce ceVar = new ce(this.f6721f, ct.c());
        if (a(ceVar)) {
            return true;
        }
        cu a2 = cq.a.a(ceVar, this.f6716a.f6722a);
        if (a2 != null) {
            return a(ceVar, a2, this.f6716a);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        try {
            if (!b() || !g() || !a(this.f6721f) || f()) {
                return false;
            }
            cq.b(this.f6721f, this.f6718c.a());
            return true;
        } catch (Throwable th) {
            cv.a(th, "dDownLoad", "isNeedDownload()");
            return false;
        }
    }

    public void run() {
        try {
            if (c()) {
                Cdo doVar = new Cdo(this.f6721f, this.f6718c.a(), this.f6718c.b(), "O008");
                doVar.a("{\"param_int_first\":0}");
                dp.a(doVar, this.f6721f);
                this.f6717b.a(this);
            }
        } catch (Throwable th) {
            cv.a(th, "dDownLoad", "run()");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if (this.f6718c != null && this.f6718c.a().equals(this.f6716a.f6723b) && this.f6718c.b().equals(this.f6716a.f6724c)) {
            return true;
        }
        return false;
    }

    public void d() {
        try {
            if (this.f6720e != null) {
                cv.a((Closeable) this.f6720e);
                String b2 = this.f6716a.b();
                if (cv.b(this.f6719d, b2)) {
                    a(b2);
                    Cdo doVar = new Cdo(this.f6721f, this.f6718c.a(), this.f6718c.b(), "O008");
                    doVar.a("{\"param_int_first\":1}");
                    dp.a(doVar, this.f6721f);
                } else {
                    new File(this.f6719d).delete();
                }
            }
        } catch (Throwable th) {
            cv.a(th, "dDownLoad", "onFinish()");
        }
    }

    public void a() {
        try {
            start();
        } catch (Throwable th) {
            cv.a(th, "dDownLoad", "startDownload()");
        }
    }

    public void a(Throwable th) {
        try {
            cv.a((Closeable) this.f6720e);
        } catch (Throwable unused) {
        }
    }

    private boolean a(Context context) {
        if (bj.p(context) == 1) {
            return true;
        }
        return false;
    }

    private boolean a(ce ceVar) {
        try {
            List a2 = cq.a.a(ceVar, this.f6716a.f6723b, "used");
            if (a2 != null && a2.size() > 0 && cv.a(((cu) a2.get(0)).e(), this.f6716a.f6725d) > 0) {
                return true;
            }
        } catch (Throwable th) {
            cv.a(th, "dDownLoad", "isUsed()");
        }
        return false;
    }

    private void b(ce ceVar) {
        if (!new File(cq.b(this.f6721f, this.f6718c.a(), this.f6718c.b())).exists() && !TextUtils.isEmpty(cq.a(this.f6721f, ceVar, this.f6718c))) {
            try {
                cq.a(this.f6721f, this.f6718c);
            } catch (Throwable unused) {
            }
        }
    }

    private void a(String str) {
        String c2 = this.f6716a.c();
        ce ceVar = new ce(this.f6721f, ct.c());
        cu.a aVar = new cu.a(this.f6716a.f6722a, str, this.f6716a.f6723b, c2, this.f6716a.f6725d);
        cq.a.a(ceVar, aVar.a("copy").a(), cu.a(this.f6716a.f6722a, this.f6716a.f6723b, c2, this.f6716a.f6725d));
        a(this.f6721f, this.f6716a.f6723b);
        try {
            cq.a(this.f6721f, ceVar, this.f6718c, this.f6719d, this.f6716a.f6725d);
            cq.a(this.f6721f, this.f6718c);
        } catch (Throwable th) {
            cv.a(th, "dDownLoad", "onFinish1");
        }
    }

    private void a(Context context, String str) {
        try {
            SharedPreferences.Editor edit = c.a(context, str, 0).edit();
            edit.clear();
            edit.commit();
        } catch (Throwable th) {
            cv.a(th, "dDownLoad", "clearMarker()");
        }
    }

    public void a(byte[] bArr, long j) {
        try {
            if (this.f6720e == null) {
                File file = new File(this.f6719d);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.f6720e = new RandomAccessFile(file, "rw");
            }
            this.f6720e.seek(j);
            this.f6720e.write(bArr);
        } catch (Throwable th) {
            cv.a(th, "dDownLoad", "onDownload()");
        }
    }

    public ck(Context context, cl clVar, bn bnVar) {
        try {
            this.f6721f = context.getApplicationContext();
            this.f6718c = bnVar;
            if (clVar != null) {
                this.f6716a = clVar;
                this.f6717b = new dd(new cp(this.f6716a));
                this.f6719d = cq.a(context, this.f6716a.f6722a);
            }
        } catch (Throwable th) {
            cv.a(th, "dDownLoad", "DexDownLoad()");
        }
    }

    private boolean a(ce ceVar, cu cuVar, cl clVar) {
        String str = clVar.f6723b;
        String str2 = clVar.f6724c;
        String str3 = clVar.f6725d;
        if ("errorstatus".equals(cuVar.f())) {
            b(ceVar);
            return true;
        } else if (!new File(this.f6719d).exists()) {
            return false;
        } else {
            List b2 = ceVar.b(cu.a(cq.a(this.f6721f, str, str2), str, str2, str3), cu.class);
            if (b2 != null && b2.size() > 0) {
                return true;
            }
            try {
                cq.a(this.f6721f, str, this.f6718c.b());
                cq.a(this.f6721f, ceVar, this.f6718c, this.f6719d, str3);
                cq.a(this.f6721f, this.f6718c);
            } catch (Throwable th) {
                cv.a(th, "dDownLoad", "processDownloadedFile()");
            }
            return true;
        }
    }
}
