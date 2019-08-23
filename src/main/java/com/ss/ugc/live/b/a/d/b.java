package com.ss.ugc.live.b.a.d;

import com.ss.ugc.live.b.a.a;
import com.ss.ugc.live.b.a.c;
import java.io.File;

public final class b implements a<String>, d<String> {

    /* renamed from: a  reason: collision with root package name */
    private d<String> f78640a;

    /* renamed from: b  reason: collision with root package name */
    private a<String> f78641b;

    public b(d dVar) {
        this.f78640a = dVar;
    }

    public final void a(c cVar, a<String> aVar) {
        this.f78641b = aVar;
        this.f78640a.a(cVar, this);
    }

    public final void a(c cVar, int i) {
        if (this.f78641b != null) {
            this.f78641b.a(cVar, i);
        }
    }

    public final void a(c cVar, com.ss.ugc.live.b.a.c.a aVar) {
        if (this.f78641b != null) {
            this.f78641b.a(cVar, aVar);
        }
    }

    public final /* synthetic */ void a(c cVar, Object obj) {
        String str = (String) obj;
        try {
            File file = new File(str);
            String a2 = com.ss.ugc.live.b.a.e.a.a(file);
            if (!cVar.f78637d.equals(a2)) {
                a(cVar, (com.ss.ugc.live.b.a.c.a) new com.ss.ugc.live.b.a.c.b(String.format("File %1$s md5 is not equals", new Object[]{str}), cVar, a2));
                file.delete();
                return;
            }
            if (this.f78641b != null) {
                this.f78641b.a(cVar, str);
            }
        } catch (Exception e2) {
            a(cVar, (com.ss.ugc.live.b.a.c.a) new com.ss.ugc.live.b.a.c.b(String.format("File %1$s md5 error", new Object[]{str}), e2, cVar, ""));
        }
    }
}
