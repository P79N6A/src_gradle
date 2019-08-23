package com.ss.ugc.live.c.a.c;

import android.os.Handler;
import android.os.Message;

public final class b implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public boolean f78723a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f78724b;

    /* renamed from: c  reason: collision with root package name */
    private final long f78725c;

    /* renamed from: d  reason: collision with root package name */
    private a f78726d;

    /* renamed from: e  reason: collision with root package name */
    private int f78727e;

    public final void a() {
        if (!this.f78723a) {
            this.f78727e = 2;
            b(0);
            this.f78723a = true;
        }
    }

    public b(a aVar) {
        this(aVar, 0);
    }

    public final boolean handleMessage(Message message) {
        if (102 == message.what) {
            b(0);
        }
        return true;
    }

    private void b(int i) {
        this.f78724b.removeMessages(102);
        this.f78726d.a(this.f78727e, i);
        if (4 != this.f78727e) {
            this.f78724b.sendEmptyMessageDelayed(102, this.f78725c);
        }
    }

    public final void a(int i) {
        if (this.f78723a) {
            this.f78724b.removeMessages(102);
            this.f78723a = false;
            a(4, i);
        }
    }

    public void a(int i, int i2) {
        this.f78727e = i;
        b(i2);
    }

    private b(a aVar, long j) {
        this.f78727e = 1;
        this.f78724b = new Handler(this);
        this.f78725c = 5000;
        this.f78726d = aVar;
    }
}
