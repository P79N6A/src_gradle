package com.vivo.push.c;

import com.tencent.bugly.CrashModule;
import com.vivo.push.a.a;
import com.vivo.push.b.c;
import com.vivo.push.b.e;
import com.vivo.push.model.b;
import com.vivo.push.p;
import com.vivo.push.util.q;
import com.vivo.push.util.r;
import com.vivo.push.v;
import com.vivo.push.y;

public final class aj extends v {
    aj(y yVar) {
        super(yVar);
    }

    public final void a(y yVar) {
        c cVar = (c) yVar;
        b a2 = r.a(this.f81705a);
        if (a2 == null) {
            p.a().a(cVar.h(), 1005, new Object[0]);
            return;
        }
        String a3 = a2.a();
        if (a2.c()) {
            p.a().a(cVar.h(), CrashModule.MODULE_ID, new Object[0]);
            yVar = new e();
        } else {
            int a4 = q.a(cVar);
            if (a4 != 0) {
                p.a().a(cVar.h(), a4, new Object[0]);
                return;
            }
        }
        a.a(this.f81705a, a3, yVar);
    }
}
