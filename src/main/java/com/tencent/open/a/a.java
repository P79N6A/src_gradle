package com.tencent.open.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.format.Time;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

public final class a extends i implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public b f79643a;

    /* renamed from: e  reason: collision with root package name */
    private FileWriter f79644e;

    /* renamed from: f  reason: collision with root package name */
    private File f79645f;
    private char[] g;
    private volatile g h;
    private volatile g i;
    private volatile g j;
    private volatile g k;
    private volatile boolean l;
    private HandlerThread m;
    private Handler n;

    private void d() {
        try {
            if (this.f79644e != null) {
                this.f79644e.flush();
                this.f79644e.close();
            }
        } catch (IOException unused) {
        }
    }

    public final void b() {
        d();
        this.m.quit();
    }

    private void e() {
        synchronized (this) {
            if (this.j == this.h) {
                this.j = this.i;
                this.k = this.h;
            } else {
                this.j = this.h;
                this.k = this.i;
            }
        }
    }

    public final void a() {
        if (this.n.hasMessages(1024)) {
            this.n.removeMessages(1024);
        }
        this.n.sendEmptyMessage(1024);
    }

    private Writer c() {
        File a2 = this.f79643a.a(System.currentTimeMillis());
        if ((a2 != null && !a2.equals(this.f79645f)) || (this.f79644e == null && a2 != null)) {
            this.f79645f = a2;
            d();
            try {
                this.f79644e = new FileWriter(this.f79645f, true);
            } catch (IOException unused) {
                return null;
            }
        }
        return this.f79644e;
    }

    public a(b bVar) {
        this(c.f79659b, true, h.f79676a, bVar);
    }

    public final boolean handleMessage(Message message) {
        int i2;
        if (message.what == 1024 && Thread.currentThread() == this.m && !this.l) {
            this.l = true;
            e();
            try {
                g gVar = this.k;
                Writer c2 = c();
                char[] cArr = this.g;
                if (!(c2 == null || cArr == null)) {
                    if (cArr.length != 0) {
                        int length = cArr.length;
                        Iterator it2 = gVar.iterator();
                        int i3 = length;
                        int i4 = 0;
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            int length2 = str.length();
                            int i5 = 0;
                            while (length2 > 0) {
                                if (i3 > length2) {
                                    i2 = length2;
                                } else {
                                    i2 = i3;
                                }
                                int i6 = i5 + i2;
                                str.getChars(i5, i6, cArr, i4);
                                i3 -= i2;
                                i4 += i2;
                                length2 -= i2;
                                if (i3 == 0) {
                                    c2.write(cArr, 0, length);
                                    i3 = length;
                                    i5 = i6;
                                    i4 = 0;
                                } else {
                                    i5 = i6;
                                }
                            }
                        }
                        if (i4 > 0) {
                            c2.write(cArr, 0, i4);
                        }
                        c2.flush();
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.k.a();
                throw th;
            }
            this.k.a();
            this.l = false;
        }
        return true;
    }

    private a(int i2, boolean z, h hVar, b bVar) {
        super(i2, true, hVar);
        this.f79643a = bVar;
        this.h = new g();
        this.i = new g();
        this.j = this.h;
        this.k = this.i;
        this.g = new char[bVar.f79650d];
        c();
        this.m = new HandlerThread(bVar.f79647a, bVar.g);
        if (this.m != null) {
            this.m.start();
        }
        if (this.m.isAlive() && this.m.getLooper() != null) {
            this.n = new Handler(this.m.getLooper(), this);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, Thread thread, long j2, String str, String str2, Throwable th) {
        String str3;
        h hVar = this.f79679d;
        long j3 = j2 % 1000;
        Time time = new Time();
        time.set(j2);
        StringBuilder sb = new StringBuilder();
        if (i2 == 4) {
            str3 = "I";
        } else if (i2 == 8) {
            str3 = "W";
        } else if (i2 == 16) {
            str3 = "E";
        } else if (i2 != 32) {
            switch (i2) {
                case 1:
                    str3 = "V";
                    break;
                case 2:
                    str3 = "D";
                    break;
                default:
                    str3 = "-";
                    break;
            }
        } else {
            str3 = "A";
        }
        sb.append(str3);
        sb.append('/');
        sb.append(time.format("%Y-%m-%d %H:%M:%S"));
        sb.append('.');
        if (j3 < 10) {
            sb.append("00");
        } else if (j3 < 100) {
            sb.append('0');
        }
        sb.append(j3);
        sb.append(' ');
        sb.append('[');
        if (thread == null) {
            sb.append("N/A");
        } else {
            sb.append(thread.getName());
        }
        sb.append(']');
        sb.append('[');
        sb.append(str);
        sb.append(']');
        sb.append(' ');
        sb.append(str2);
        sb.append(10);
        if (th != null) {
            sb.append("* Exception : \n");
            sb.append(Log.getStackTraceString(th));
            sb.append(10);
        }
        String sb2 = sb.toString();
        g gVar = this.j;
        int length = sb2.length();
        gVar.f79674a.add(sb2);
        gVar.f79675b.addAndGet(length);
        if (this.j.f79675b.get() >= this.f79643a.f79650d) {
            a();
        }
    }
}
