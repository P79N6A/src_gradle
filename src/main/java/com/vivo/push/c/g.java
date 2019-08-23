package com.vivo.push.c;

import com.vivo.push.util.o;
import com.vivo.push.util.x;
import com.vivo.push.y;

public final class g extends aa {
    g(y yVar) {
        super(yVar);
    }

    public final void a(y yVar) {
        o.d("OnClearCacheTask", "delete push info " + this.f81705a.getPackageName());
        x.b(this.f81705a).a();
    }
}
