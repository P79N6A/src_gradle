package com.vivo.push.c;

import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.util.o;
import com.vivo.push.v;
import com.vivo.push.y;

public final class c extends v {
    c(y yVar) {
        super(yVar);
    }

    public final void a(y yVar) {
        o.a(ClientConfigManagerImpl.getInstance(this.f81705a).isDebug());
    }
}
