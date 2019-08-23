package com.ss.android.agilelogger.d;

import android.os.Looper;
import com.ss.android.agilelogger.c.a;
import com.ss.android.agilelogger.e;
import com.ss.android.agilelogger.f.b;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public abstract class b implements c {

    /* renamed from: a  reason: collision with root package name */
    protected List<a> f27902a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    protected com.ss.android.agilelogger.c.b f27903b = new com.ss.android.agilelogger.c.b();

    /* renamed from: c  reason: collision with root package name */
    public int f27904c;

    /* renamed from: d  reason: collision with root package name */
    protected SimpleDateFormat f27905d = new SimpleDateFormat("yyyy-MM-dd z HH:mm:ss.SSS", Locale.ENGLISH);

    public void a() {
    }

    /* access modifiers changed from: protected */
    public abstract void a(e eVar);

    public void b() {
    }

    public b() {
        this.f27905d.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        this.f27902a.add(this.f27903b);
    }

    public final void a(int i) {
        this.f27903b.f27892a = i;
    }

    public final void a(List<a> list) {
        if (!com.ss.android.agilelogger.f.e.a(list)) {
            this.f27902a.addAll(list);
        }
    }

    public final void b(e eVar) {
        boolean z = false;
        for (a a2 : this.f27902a) {
            if (!a2.a(eVar)) {
                z = true;
            }
        }
        if (!(z || eVar == null || eVar.f27909d == null)) {
            String str = eVar.f27909d;
            if (str.length() <= this.f27904c) {
                a(eVar);
            } else {
                int length = str.length();
                int i = this.f27904c + 0;
                int i2 = 0;
                while (i2 < length) {
                    eVar.f27909d = str.substring(i2, i);
                    a(eVar);
                    int i3 = i;
                    i = Math.min(this.f27904c + i, length);
                    i2 = i3;
                }
            }
        }
        eVar.f27907b = 0;
        eVar.f27908c = "";
        eVar.f27909d = "";
        eVar.g = b.a.MSG;
        eVar.f27910e = -1;
        eVar.f27911f = false;
        eVar.h = null;
        eVar.i = null;
        eVar.j = "";
        eVar.k = "";
        eVar.l = "";
        if (Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (e.r) {
                if (e.p < 60) {
                    eVar.m = e.n;
                    e.n = eVar;
                    e.p++;
                }
            }
        } else if (e.q < 60) {
            eVar.m = e.o;
            e.o = eVar;
            e.q++;
        }
    }
}
