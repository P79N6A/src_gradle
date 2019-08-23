package com.ss.android.mobilelib.b;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.mobilelib.a;
import com.ss.android.mobilelib.c.b;
import java.lang.ref.WeakReference;

public abstract class a implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public boolean f30078a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakHandler f30079b = new WeakHandler(this);

    /* renamed from: c  reason: collision with root package name */
    protected com.ss.android.mobilelib.a f30080c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<Context> f30081d;

    /* renamed from: e  reason: collision with root package name */
    private b f30082e;

    public abstract void a(String str, int i);

    public void a() {
        this.f30078a = false;
        this.f30080c = null;
        this.f30079b = null;
        this.f30082e = null;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (this.f30082e != null) {
            this.f30082e.b();
        }
    }

    public final void a(int i) {
        b();
        com.ss.android.mobilelib.a aVar = this.f30080c;
        new a.d((Context) aVar.f30061a.get(), this.f30079b, i).b();
    }

    public void handleMsg(Message message) {
        boolean z;
        if (this.f30078a && message.obj != null) {
            if (this.f30082e != null) {
                this.f30082e.a();
            }
            if (message.what == 10) {
                if (message.obj instanceof a.e) {
                    a.e eVar = (a.e) message.obj;
                    this.f30082e.a(eVar.f30071f, "", eVar.f30070e);
                }
            } else if (message.what == 11 && (message.obj instanceof a.c)) {
                a.c cVar = (a.c) message.obj;
                if ((cVar.f30066a == 1101 || cVar.f30066a == 1102 || cVar.f30066a == 1103) && !TextUtils.isEmpty(cVar.f30068c)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f30082e.a(cVar.f30068c, cVar.f30067b, cVar.f30070e);
                    this.f30082e.a(cVar.f30067b, cVar.f30066a, true);
                    return;
                }
                this.f30082e.a(cVar.f30067b, cVar.f30066a, cVar instanceof a.e);
            }
        }
    }

    public a(Context context, b bVar) {
        this.f30080c = new com.ss.android.mobilelib.a(context);
        this.f30081d = new WeakReference<>(context);
        this.f30082e = bVar;
        this.f30078a = true;
    }
}
