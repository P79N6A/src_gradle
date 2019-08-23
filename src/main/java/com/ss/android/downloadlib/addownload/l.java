package com.ss.android.downloadlib.addownload;

import android.app.Activity;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.download.api.b.a.b;
import com.ss.android.download.api.b.c;
import com.ss.android.download.api.b.d;
import com.ss.android.download.api.c.e;
import com.ss.android.downloadlib.c.k;
import com.ss.android.downloadlib.c.l;
import com.ss.android.downloadlib.core.download.DownloadHandlerService;
import com.ss.android.downloadlib.core.download.j;
import com.ss.android.downloadlib.core.download.m;
import com.ss.android.downloadlib.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class l implements b, h, l.a {
    private static final String g = f.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public i f28842a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<Activity> f28843b;

    /* renamed from: c  reason: collision with root package name */
    public Map<Integer, d> f28844c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public e f28845d;

    /* renamed from: e  reason: collision with root package name */
    public c f28846e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean f28847f;
    private final com.ss.android.downloadlib.c.l h = new com.ss.android.downloadlib.c.l(Looper.getMainLooper(), this);
    private long i;
    private a j;
    private boolean k;
    private long l;
    private com.ss.android.download.api.b.b m = null;
    private com.ss.android.download.api.b.a n = null;
    private boolean o;
    private boolean p;

    class a extends AsyncTask<String, Void, e> {
        private a() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            String[] strArr = (String[]) objArr;
            if (strArr == null || (strArr.length >= 2 && TextUtils.isEmpty(strArr[0]))) {
                return null;
            }
            String str = strArr[0];
            String b2 = g.a().b(strArr[1]);
            com.ss.android.downloadlib.core.download.d a2 = com.ss.android.downloadlib.core.download.d.a(k.a());
            if (TextUtils.isEmpty(b2)) {
                return a2.a(str);
            }
            return a2.a(b2);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            e eVar = (e) obj;
            super.onPostExecute(eVar);
            if (!isCancelled() && l.this.f28846e != null) {
                if (eVar != null) {
                    try {
                        if (eVar.f28491a > -1 && (!com.ss.android.downloadlib.core.download.d.a(k.a()).a(eVar) || k.a(l.this.f28846e))) {
                            if (l.this.f28845d == null || l.this.f28845d.f28492b != 16) {
                                l.this.f28845d = eVar;
                                if (l.this.f28847f && (eVar.f28492b == 8 || eVar.f28492b == 2)) {
                                    double d2 = 0.0d;
                                    try {
                                        double d3 = (double) l.this.f28845d.f28494d;
                                        double d4 = (double) l.this.f28845d.f28493c;
                                        Double.isNaN(d3);
                                        Double.isNaN(d4);
                                        d2 = d3 / d4;
                                    } catch (Exception unused) {
                                    }
                                    int i = (int) (d2 * 100.0d);
                                    if (i < 0) {
                                        i = 0;
                                    }
                                    l.this.b(i);
                                    l.this.f28847f = false;
                                    return;
                                } else if (g.a().c(l.this.f28846e.q()) || !g.a().a(l.this.f28846e.q())) {
                                    com.ss.android.downloadlib.core.download.e.a(k.a()).a(Long.valueOf(l.this.f28845d.f28491a), (b) l.this).a(Long.valueOf(l.this.f28845d.f28491a), String.valueOf(l.this.f28846e.b()), 0, l.this.f28846e.p(), l.this.g().c(), l.this.f28846e.c());
                                    l.this.f28842a.a(eVar, l.this.f28844c);
                                    l.this.f28842a.b(eVar);
                                } else {
                                    if ((eVar.f28492b == 8 || eVar.f28492b == 2) && !l.this.f28844c.isEmpty()) {
                                        for (d a2 : l.this.f28844c.values()) {
                                            a2.a();
                                        }
                                    }
                                    l.this.f28842a.b(eVar);
                                }
                            } else {
                                l.this.f28845d = null;
                                l.this.f28842a.a(eVar, l.this.f28844c);
                                l.this.f28842a.b(eVar);
                            }
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                }
                if (k.a(l.this.f28846e)) {
                    if (l.this.f28845d == null) {
                        l.this.f28845d = new e();
                        l.this.f28845d.f28492b = 8;
                    }
                    l.this.f28842a.a(l.this.f28845d, l.this.f28844c);
                } else {
                    if (!l.this.f28844c.isEmpty()) {
                        for (d a3 : l.this.f28844c.values()) {
                            a3.a();
                        }
                    }
                    l.this.f28845d = null;
                }
                l.this.f28842a.b(eVar);
            }
        }

        /* synthetic */ a(l lVar, byte b2) {
            this();
        }
    }

    public final boolean e() {
        return true;
    }

    public final boolean b() {
        return this.k;
    }

    public final long d() {
        return this.l;
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            this.f28844c.clear();
        } else {
            this.f28844c.remove(Integer.valueOf(i2));
        }
        if (!this.f28844c.isEmpty()) {
            return false;
        }
        this.k = false;
        this.l = System.currentTimeMillis();
        if (this.f28845d != null) {
            com.ss.android.downloadlib.core.download.e.a(k.a()).b(Long.valueOf(this.f28845d.f28491a), (b) this);
        }
        if (!(this.j == null || this.j.getStatus() == AsyncTask.Status.FINISHED)) {
            this.j.cancel(true);
        }
        this.f28842a.a((DownloadInfo) null);
        this.h.removeCallbacksAndMessages(null);
        return true;
    }

    public final void a(boolean z) {
        if (this.f28845d != null) {
            if (z) {
                com.ss.android.downloadlib.core.download.d.a(k.a()).a(this.i);
                i.a(this.i, this.f28846e.d(), this.f28846e.a());
                return;
            }
            k.a().startService(new Intent("android.ss.intent.action.DOWNLOAD_DELETE", ContentUris.withAppendedId(j.a.f29029a, this.f28845d.f28491a), k.a(), DownloadHandlerService.class));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(e eVar, int i2, int i3, int i4) {
        Message obtain = Message.obtain();
        obtain.what = i4;
        obtain.arg1 = i3;
        obtain.arg2 = i2;
        obtain.obj = eVar;
        this.h.sendMessage(obtain);
    }

    public final void a(e eVar, int i2, long j2, long j3, long j4) {
        if (eVar != null && eVar.f28491a == this.i && !this.f28844c.isEmpty()) {
            this.f28845d = eVar;
            double d2 = 0.0d;
            try {
                double d3 = (double) eVar.f28494d;
                double d4 = (double) eVar.f28493c;
                Double.isNaN(d3);
                Double.isNaN(d4);
                d2 = d3 / d4;
            } catch (Exception unused) {
            }
            int i3 = (int) (d2 * 100.0d);
            if (i3 < 0) {
                i3 = 0;
            }
            a(eVar, i3, i2, 1);
        }
    }

    public final boolean c() {
        if (this.f28845d != null) {
            return true;
        }
        return false;
    }

    private void h() {
        i();
        this.f28842a.a();
    }

    private void j() {
        this.f28842a.a((com.ss.android.downloadlib.a.c) new com.ss.android.downloadlib.a.c() {
            public final void b() {
            }

            public final void a() {
                l lVar = l.this;
                if (lVar.f28843b != null) {
                    Activity activity = (Activity) lVar.f28843b.get();
                    if (activity != null) {
                        for (d a2 : lVar.f28844c.values()) {
                            a2.a(lVar.f28846e, lVar.g());
                        }
                        long a3 = lVar.f28842a.a((Context) activity);
                        if (a3 >= 0) {
                            lVar.f28842a.a((String) null);
                            com.ss.android.downloadlib.core.download.e.a(k.a()).a(Long.valueOf(a3), (b) lVar).a(Long.valueOf(a3), String.valueOf(lVar.f28846e.b()), 0, lVar.f28846e.p(), lVar.g().c(), lVar.f28846e.c());
                            if (lVar.f().y()) {
                                com.ss.android.downloadlib.a.a().a(new com.ss.android.downloadad.api.b.a(lVar.f28846e, a3));
                            }
                        } else if (a3 < 0) {
                            e eVar = new e();
                            eVar.f28492b = 16;
                            lVar.a(eVar, 0, 3, 2);
                            lVar.f28842a.e();
                        }
                        if (lVar.f28842a.b(lVar.c())) {
                            k.c().a(activity, lVar.f28846e, lVar.g(), lVar.f());
                        }
                    }
                }
            }
        });
    }

    private i k() {
        if (this.f28842a == null) {
            this.f28842a = new i();
        }
        return this.f28842a;
    }

    /* access modifiers changed from: package-private */
    public com.ss.android.download.api.b.b f() {
        if (this.m == null) {
            return new com.ss.android.download.api.b.e();
        }
        return this.m;
    }

    public final com.ss.android.download.api.b.a g() {
        if (this.n == null) {
            return new com.ss.android.downloadad.api.a.a();
        }
        return this.n;
    }

    private Activity l() {
        if (this.f28843b != null) {
            Activity activity = (Activity) this.f28843b.get();
            if (activity != null) {
                return activity;
            }
        }
        return null;
    }

    private void i() {
        if (this.f28845d == null) {
            this.f28842a.a(2);
            j();
        } else if (g.a().c(this.f28846e.q()) || !g.a().a(this.f28846e.q())) {
            com.ss.android.downloadlib.core.download.d.a(k.a(), this.f28845d.f28492b, this.f28845d.f28491a, this.f28846e.q());
            this.f28842a.c(this.f28845d);
            if (this.f28845d != null && this.f28845d.f28491a >= 0) {
                com.ss.android.downloadlib.core.download.e.a(k.a()).a(Long.valueOf(this.f28845d.f28491a), (b) this).a(Long.valueOf(this.f28845d.f28491a), String.valueOf(this.f28846e.b()), 0, this.f28846e.p(), g().c(), this.f28846e.c());
            }
            if (this.f28845d.f28492b == 8) {
                this.f28842a.c();
            }
        } else {
            c(this.f28845d.f28492b);
        }
    }

    public final void a() {
        this.k = true;
        if (!(this.j == null || this.j.getStatus() == AsyncTask.Status.FINISHED)) {
            this.j.cancel(true);
        }
        this.j = new a(this, (byte) 0);
        com.ss.android.downloadlib.c.a.a.a(this.j, this.f28846e.a(), this.f28846e.q());
        new com.ss.android.downloadlib.c.l(this).postDelayed(new Runnable() {
            public final void run() {
                com.ss.android.downloadlib.c.a.a.a(new a(l.this, (byte) 0), l.this.f28846e.a(), l.this.f28846e.q());
            }
        }, 1000);
    }

    public final void a(long j2) {
        this.i = j2;
    }

    public final /* synthetic */ h a(Activity activity) {
        if (activity != null) {
            this.f28843b = new WeakReference<>(activity);
        }
        return this;
    }

    public final /* synthetic */ h a(com.ss.android.download.api.b.a aVar) {
        this.n = aVar;
        k().a(g());
        return this;
    }

    public final void b(int i2) {
        if (!this.p) {
            g.a().a(this.f28846e.q(), true);
            AnonymousClass4 r3 = new CountDownTimer(1000, 100, i2) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ int f28851a;

                public final void onFinish() {
                    if (l.this.f28843b != null) {
                        Activity activity = (Activity) l.this.f28843b.get();
                        if (activity != null) {
                            g.a().a(l.this.f28846e.q(), true);
                            if (l.this.f28845d != null) {
                                com.ss.android.downloadlib.core.download.e.a(k.a()).a(Long.valueOf(l.this.f28845d.f28491a), (b) l.this).a(Long.valueOf(l.this.f28845d.f28491a), String.valueOf(l.this.f28846e.b()), 0, l.this.f28846e.p(), l.this.g().c(), l.this.f28846e.c());
                                long j = l.this.f28845d.f28491a;
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("visibility", 1);
                                com.ss.android.downloadlib.core.download.d.a((Context) activity).f28953c.a(0, null, ContentUris.withAppendedId(j.a.f29029a, j), contentValues, null, null);
                                if (this.f28851a == 100) {
                                    m.a((Context) activity, l.this.f28845d.f28491a, new int[]{268435456, 536870912}, l.this.f28846e.q());
                                    for (d c2 : l.this.f28844c.values()) {
                                        c2.c(l.this.f28845d);
                                    }
                                }
                            }
                        }
                    }
                }

                public final void onTick(long j) {
                    if (l.this.f28845d != null) {
                        int i = (int) (((1000 - j) * 100) / 1000);
                        for (d a2 : l.this.f28844c.values()) {
                            a2.a(l.this.f28845d, (int) (((float) i) * (((float) this.f28851a) / 100.0f)));
                        }
                    }
                }

                {
                    this.f28851a = r6;
                }
            };
            r3.start();
            this.p = true;
        }
    }

    public final /* synthetic */ h a(com.ss.android.download.api.b.b bVar) {
        boolean z;
        this.m = bVar;
        if (f().v() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.o = z;
        k().f28824b = f();
        return this;
    }

    private void c(int i2) {
        this.f28842a.a(f().b());
        if (i2 != 4) {
            if (i2 == 8) {
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        com.ss.android.downloadlib.a.a().a(l.this.f28846e.b(), l.this.f28846e.q());
                    }
                }, 3000);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("package_name", this.f28846e.q());
                } catch (JSONException unused) {
                }
                j.a("download_ad", "ad_click", 0, 0, jSONObject);
                b(100);
            } else if (i2 != 16) {
                switch (i2) {
                    case 1:
                    case 2:
                        if (this.f28845d != null && this.f28845d.f28491a >= 0) {
                            try {
                                com.ss.android.downloadlib.c.a.a.a(new a(this, (byte) 0), this.f28846e.a(), this.f28846e.q());
                                this.f28847f = true;
                                com.ss.android.downloadlib.a.a().a(this.f28846e.b(), this.f28846e.q());
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                }
            } else if (this.f28845d.f28491a >= 0) {
                com.ss.android.downloadlib.core.download.d.a(k.a()).a(1, this.f28845d.f28491a);
            }
        }
    }

    public final /* synthetic */ h a(c cVar) {
        if (cVar != null) {
            this.f28846e = cVar;
            k().a(this.f28846e);
            if (j.a(this.f28846e)) {
                ((com.ss.android.downloadad.api.a.c) this.f28846e).f28638a = 3;
            }
        }
        return this;
    }

    public final void a(Message message) {
        if (message != null && this.k && !this.f28844c.isEmpty()) {
            this.f28842a.a(message, this.f28845d, (Map) this.f28844c);
        }
    }

    public final /* synthetic */ h a(int i2, d dVar) {
        if (dVar != null) {
            this.f28844c.put(Integer.valueOf(i2), dVar);
        }
        return this;
    }

    public final void a(long j2, int i2) {
        if (!this.f28842a.a(k.a(), i2, this.o)) {
            switch (i2) {
                case 1:
                    this.f28842a.a(1);
                    if (g.a().c(this.f28846e.q()) || !g.a().a(this.f28846e.q())) {
                        if (!this.f28842a.a(this.f28845d)) {
                            k.c().a(l(), this.f28846e, g(), f());
                            break;
                        } else {
                            h();
                            return;
                        }
                    } else if (this.f28845d != null) {
                        c(this.f28845d.f28492b);
                        return;
                    }
                    break;
                case 2:
                    if (this.f28842a.a(this.o) == 1) {
                        this.f28842a.a(1);
                        k.c().a(l(), this.f28846e, g(), f());
                        break;
                    } else {
                        h();
                        return;
                    }
            }
        }
    }
}
