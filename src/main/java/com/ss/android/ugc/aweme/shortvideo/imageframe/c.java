package com.ss.android.ugc.aweme.shortvideo.imageframe;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.imageframe.d;
import java.io.File;

public class c implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68221a;

    /* renamed from: b  reason: collision with root package name */
    public final b f68222b;

    /* renamed from: c  reason: collision with root package name */
    public final d f68223c;

    /* renamed from: d  reason: collision with root package name */
    public final File[] f68224d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f68225e;

    /* renamed from: f  reason: collision with root package name */
    public b f68226f;
    public boolean g;
    private final Handler h;
    private final boolean i;
    private final long j;
    private final int k;
    private final int l;
    private final float m;
    private final int n;
    private final Resources o;
    private int p;
    private boolean q;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68229a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f68230b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f68231c;

        /* renamed from: d  reason: collision with root package name */
        public long f68232d = 50;

        /* renamed from: e  reason: collision with root package name */
        public int f68233e;

        /* renamed from: f  reason: collision with root package name */
        public int f68234f;
        public float g;
        public File[] h;
        public int[] i;
        public b j;

        public a(Context context, @NonNull int[] iArr) {
            if (iArr.length != 0) {
                this.f68230b = context;
                this.i = iArr;
                return;
            }
            throw new IllegalArgumentException("resource is empty");
        }
    }

    public interface b {
        void a(BitmapDrawable bitmapDrawable, b bVar);

        void b();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68221a, false, 77522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68221a, false, 77522, new Class[0], Void.TYPE);
            return;
        }
        if (this.p < this.f68224d.length) {
            File file = this.f68224d[this.p];
            if (!file.isFile() || !a(file)) {
                this.p++;
                b();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            BitmapDrawable a2 = a.a(this.o, file.getAbsolutePath(), this.k, this.l, this.m, this.n, this.f68222b);
            long currentTimeMillis2 = this.j - (System.currentTimeMillis() - currentTimeMillis);
            if (currentTimeMillis2 < 0) {
                currentTimeMillis2 = 0;
            }
            if (this.p == 0 && !this.q) {
                currentTimeMillis2 = 0;
            }
            this.h.sendMessageDelayed(Message.obtain(this.h, 2, a2), currentTimeMillis2);
            if (this.q) {
                this.q = false;
            }
            this.p++;
        } else if (this.i) {
            this.p = 0;
            this.q = true;
            b();
        } else {
            this.h.sendEmptyMessage(3);
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f68221a, false, 77523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68221a, false, 77523, new Class[0], Void.TYPE);
        } else if (this.p < this.f68225e.length) {
            int i2 = this.f68225e[this.p];
            long currentTimeMillis = System.currentTimeMillis();
            BitmapDrawable a2 = a.a(this.o, i2, this.k, this.l, this.m, this.n, this.f68222b);
            long currentTimeMillis2 = this.j - (System.currentTimeMillis() - currentTimeMillis);
            if (currentTimeMillis2 < 0) {
                currentTimeMillis2 = 0;
            }
            if (this.p == 0 && !this.q) {
                currentTimeMillis2 = 0;
            }
            this.h.sendMessageDelayed(Message.obtain(this.h, 2, a2), currentTimeMillis2);
            if (this.q) {
                this.q = false;
            }
            this.p++;
        } else if (this.i) {
            this.p = 0;
            this.q = true;
            c();
        } else {
            this.h.sendEmptyMessage(3);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68221a, false, 77520, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68221a, false, 77520, new Class[0], Void.TYPE);
            return;
        }
        if (this.g) {
            this.g = false;
            this.p = 0;
            this.q = false;
            this.f68226f = null;
            this.f68223c.f68238d.removeCallbacksAndMessages(null);
            this.f68223c.a(this);
            a(this.f68223c);
            this.h.removeCallbacksAndMessages(this);
        }
    }

    private void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f68221a, false, 77525, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f68221a, false, 77525, new Class[]{d.class}, Void.TYPE);
            return;
        }
        try {
            Looper looper = dVar.getLooper();
            if (looper != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    looper.quitSafely();
                    return;
                }
                looper.quit();
            }
        } catch (Exception unused) {
        }
    }

    private c(a aVar) {
        this.f68222b = b.f68218b;
        this.f68223c = new d();
        this.h = new Handler(Looper.getMainLooper()) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68227a;

            public final void handleMessage(Message message) {
                int i = 1;
                if (PatchProxy.isSupport(new Object[]{message}, this, f68227a, false, 77526, new Class[]{Message.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{message}, this, f68227a, false, 77526, new Class[]{Message.class}, Void.TYPE);
                    return;
                }
                switch (message.what) {
                    case 2:
                        if (c.this.f68226f != null) {
                            c.this.f68226f.a((BitmapDrawable) message.obj, c.this.f68222b);
                        }
                        if (c.this.g) {
                            Handler handler = c.this.f68223c.f68238d;
                            if (c.this.f68224d != null) {
                                i = 0;
                            }
                            handler.sendEmptyMessage(i);
                            return;
                        }
                        break;
                    case 3:
                        if (c.this.f68226f != null) {
                            c.this.f68226f.b();
                        }
                        c.this.a();
                        break;
                }
            }
        };
        d dVar = this.f68223c;
        if (PatchProxy.isSupport(new Object[]{this}, dVar, d.f68235a, false, 77532, new Class[]{d.a.class}, Void.TYPE)) {
            d dVar2 = dVar;
            PatchProxy.accessDispatch(new Object[]{this}, dVar2, d.f68235a, false, 77532, new Class[]{d.a.class}, Void.TYPE);
        } else {
            dVar.f68237c.writeLock().lock();
            try {
                dVar.f68236b.add(this);
            } finally {
                dVar.f68237c.writeLock().unlock();
            }
        }
        this.i = aVar.f68231c;
        this.j = aVar.f68232d;
        this.k = aVar.f68233e;
        this.l = aVar.f68234f;
        this.m = aVar.g;
        this.n = aVar.f68230b.getResources().getDisplayMetrics().densityDpi;
        this.f68224d = aVar.h;
        this.f68225e = aVar.i;
        this.o = aVar.f68230b.getResources();
        this.f68226f = aVar.j;
    }

    private boolean a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f68221a, false, 77524, new Class[]{File.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f68221a, false, 77524, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
        } else if (file.getName().endsWith("png") || file.getName().endsWith("jpg")) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f68221a, false, 77521, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f68221a, false, 77521, new Class[]{Message.class}, Void.TYPE);
        } else if (message2.what == 0) {
            b();
        } else {
            if (message2.what == 1) {
                c();
            }
        }
    }

    public /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
