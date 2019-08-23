package com.ss.android.ugc.effectmanager.common.e;

import android.os.Handler;
import android.os.Message;

public abstract class d implements a {

    /* renamed from: a  reason: collision with root package name */
    protected Handler f77321a;

    /* renamed from: b  reason: collision with root package name */
    protected String f77322b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f77323c;

    /* renamed from: d  reason: collision with root package name */
    public String f77324d;

    public d(Handler handler, String str) {
        this.f77321a = handler;
        this.f77322b = str;
        this.f77324d = "NORMAL";
    }

    public final void a(int i, b bVar) {
        bVar.f77314a = this.f77322b;
        Message obtainMessage = this.f77321a.obtainMessage(i);
        obtainMessage.obj = bVar;
        obtainMessage.sendToTarget();
    }

    public d(Handler handler, String str, String str2) {
        this.f77321a = handler;
        this.f77322b = str;
        this.f77324d = str2;
    }
}
