package com.xiaomi.push.service;

import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.am;
import com.xiaomi.push.as;
import com.xiaomi.push.dx;
import com.xiaomi.push.fh;
import com.xiaomi.push.service.ba;
import com.xiaomi.push.u;
import java.util.List;

public class bb extends am.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ba f82538a;

    /* renamed from: a  reason: collision with other field name */
    boolean f967a;

    bb(ba baVar) {
        this.f82538a = baVar;
    }

    public void b() {
        try {
            fh.a a2 = fh.a.a(Base64.decode(dx.a(u.a(), "http://resolver.msg.xiaomi.net/psc/?t=a", (List<as>) null), 10));
            if (a2 != null) {
                fh.a unused = this.f82538a.f965a = a2;
                this.f967a = true;
                ba.a(this.f82538a);
            }
        } catch (Exception e2) {
            b.a("fetch config failure: " + e2.getMessage());
        }
    }

    public void c() {
        ba.a[] aVarArr;
        am.b unused = this.f82538a.f964a = null;
        if (this.f967a) {
            synchronized (this.f82538a) {
                aVarArr = (ba.a[]) ba.a(this.f82538a).toArray(new ba.a[ba.a(this.f82538a).size()]);
            }
            for (ba.a a2 : aVarArr) {
                a2.a(ba.a(this.f82538a));
            }
        }
    }
}
