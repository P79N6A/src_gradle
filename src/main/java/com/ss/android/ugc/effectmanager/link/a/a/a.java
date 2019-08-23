package com.ss.android.ugc.effectmanager.link.a.a;

import com.ss.android.ugc.effectmanager.common.e.b;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.ArrayList;
import java.util.List;

public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public List<Host> f77524b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public c f77525c;

    public final String toString() {
        String str = "HostListStatusUpdateTaskResult{ Hosts{";
        while (this.f77524b.iterator().hasNext()) {
            str = str + r1.next().toString() + ", ";
        }
        return str + " }, mExceptionResult=" + this.f77525c + '}';
    }

    public a(List<Host> list, c cVar) {
        this.f77524b.clear();
        this.f77524b.addAll(list);
        this.f77525c = null;
    }
}
