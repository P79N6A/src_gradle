package com.xiaomi.push;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.HandlerThread;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import java.util.ArrayList;
import java.util.List;

public class bl extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private static bl f81864a;

    /* renamed from: a  reason: collision with other field name */
    private int f180a = 0;

    /* renamed from: a  reason: collision with other field name */
    private Handler f181a;

    /* renamed from: a  reason: collision with other field name */
    private HandlerThread f182a = new HandlerThread("metoknlp_app");

    /* renamed from: a  reason: collision with other field name */
    private bu f183a = new cu(this);

    /* renamed from: a  reason: collision with other field name */
    List f184a = new ArrayList();

    /* renamed from: a  reason: collision with other field name */
    private boolean f185a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f81865b;

    private bl(Context context) {
        super(context);
        this.f182a.start();
        this.f181a = new ct(this, this.f182a.getLooper());
        bq.a(context);
        this.f181a.sendEmptyMessageDelayed(BaseLoginOrRegisterActivity.o, 1000);
    }

    public static bl a() {
        if (f81864a == null) {
            return null;
        }
        return f81864a;
    }

    public static bl a(Context context) {
        if (f81864a == null) {
            f81864a = new bl(context);
        }
        return f81864a;
    }

    /* access modifiers changed from: private */
    public void c() {
        if (!this.f185a) {
            this.f185a = true;
        }
        bz.a().a((Context) this);
    }

    /* access modifiers changed from: private */
    public void d() {
        this.f181a.sendEmptyMessageDelayed(102, 10000);
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m119a() {
        return this.f180a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Handler m120a() {
        return this.f181a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m121a() {
        bz.a().a();
    }

    public void a(cb cbVar, int i) {
        for (cb cbVar2 : this.f184a) {
            if (cbVar2 == cbVar) {
                return;
            }
        }
        this.f180a = i;
        this.f184a.add(cbVar);
    }

    public void a(String str) {
        for (cb cbVar : this.f184a) {
            if (cbVar != null) {
                cbVar.a(str);
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m122a() {
        return this.f185a;
    }

    public void b() {
        bm.a((Context) f81864a);
        bw.a((Context) f81864a);
        bw.a().a(this.f183a);
    }
}
