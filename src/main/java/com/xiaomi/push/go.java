package com.xiaomi.push;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.fi;
import com.xiaomi.push.gq;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.au;
import com.xiaomi.push.service.ba;

public class go extends gx {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public gk f82114a;

    /* renamed from: a  reason: collision with other field name */
    private gl f449a;

    /* renamed from: a  reason: collision with other field name */
    private Thread f450a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f451a;

    public go(XMPushService xMPushService, gr grVar) {
        super(xMPushService, grVar);
    }

    private gj a(boolean z) {
        gn gnVar = new gn();
        if (z) {
            gnVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
        byte[] a2 = ie.a();
        if (a2 != null) {
            fi.j jVar = new fi.j();
            jVar.a(a.a(a2));
            gnVar.a(jVar.a(), (String) null);
        }
        return gnVar;
    }

    private void h() {
        try {
            this.f82114a = new gk(this.f472a.getInputStream(), this);
            this.f449a = new gl(this.f472a.getOutputStream(), this);
            this.f450a = new gp(this, "Blob Reader (" + this.f82117b + ")");
            this.f450a.start();
        } catch (Exception e2) {
            throw new hb("Error to init reader and writer", e2);
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
        synchronized (this) {
            h();
            this.f449a.a();
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i, Exception exc) {
        synchronized (this) {
            if (this.f82114a != null) {
                this.f82114a.b();
                this.f82114a = null;
            }
            if (this.f449a != null) {
                try {
                    this.f449a.b();
                } catch (Exception e2) {
                    b.a((Throwable) e2);
                }
                this.f449a = null;
            }
            this.f451a = null;
            super.a(i, exc);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(gj gjVar) {
        if (gjVar != null) {
            if (gjVar.a()) {
                b.a("[Slim] RCV blob chid=" + gjVar.a() + "; id=" + gjVar.e() + "; errCode=" + gjVar.b() + "; err=" + gjVar.c());
            }
            if (gjVar.a() == 0) {
                if ("PING".equals(gjVar.a())) {
                    b.a("[Slim] RCV ping id=" + gjVar.e());
                    g();
                } else if ("CLOSE".equals(gjVar.a())) {
                    c(13, null);
                }
            }
            for (gq.a a2 : this.f461a.values()) {
                a2.a(gjVar);
            }
        }
    }

    @Deprecated
    public void a(hh hhVar) {
        b(gj.a(hhVar, (String) null));
    }

    public void a(al.b bVar) {
        synchronized (this) {
            gi.a(bVar, c(), (gq) this);
        }
    }

    public void a(String str, String str2) {
        synchronized (this) {
            gi.a(str, str2, (gq) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: collision with other method in class */
    public void m337a(boolean z) {
        if (this.f449a != null) {
            gj a2 = a(z);
            b.a("[Slim] SND ping id=" + a2.e());
            b(a2);
            f();
            return;
        }
        throw new hb("The BlobWriter is null.");
    }

    public void a(gj[] gjVarArr) {
        for (gj b2 : gjVarArr) {
            b(b2);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m338a() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public byte[] m339a() {
        byte[] bArr;
        synchronized (this) {
            if (this.f451a == null && !TextUtils.isEmpty(this.f458a)) {
                String a2 = ba.a();
                this.f451a = au.a(this.f458a.getBytes(), (this.f458a.substring(this.f458a.length() / 2) + a2.substring(a2.length() / 2)).getBytes());
            }
            bArr = this.f451a;
        }
        return bArr;
    }

    public void b(gj gjVar) {
        if (this.f449a != null) {
            try {
                int a2 = this.f449a.a(gjVar);
                this.f82119d = System.currentTimeMillis();
                String f2 = gjVar.f();
                if (!TextUtils.isEmpty(f2)) {
                    hv.a(this.f457a, f2, (long) a2, false, true, System.currentTimeMillis());
                }
                for (gq.a a3 : this.f464b.values()) {
                    a3.a(gjVar);
                }
            } catch (Exception e2) {
                throw new hb((Throwable) e2);
            }
        } else {
            throw new hb("the writer is null.");
        }
    }

    /* access modifiers changed from: package-private */
    public void b(hh hhVar) {
        if (hhVar != null) {
            for (gq.a a2 : this.f461a.values()) {
                a2.a(hhVar);
            }
        }
    }
}
