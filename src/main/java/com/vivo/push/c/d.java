package com.vivo.push.c;

import android.text.TextUtils;
import com.vivo.push.b.j;
import com.vivo.push.p;
import com.vivo.push.w;
import com.vivo.push.y;

public final class d extends aa {
    d(y yVar) {
        super(yVar);
    }

    public final void a(y yVar) {
        j jVar = (j) yVar;
        String e2 = jVar.e();
        p.a().a(jVar.g(), jVar.h(), e2);
        if (TextUtils.isEmpty(jVar.g()) && !TextUtils.isEmpty(e2)) {
            p.a().a(e2);
        }
        w.b(new e(this, e2, jVar));
    }
}
