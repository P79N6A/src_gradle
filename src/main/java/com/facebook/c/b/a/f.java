package com.facebook.c.b.a;

import com.facebook.c.a;
import com.facebook.c.b.h;
import java.util.List;

public final class f extends e<h, a> {
    public f(List<h> list, float[][][] fArr) {
        super(list, fArr);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(com.facebook.c.b.a aVar, com.facebook.c.b.a aVar2, float f2, Object obj) {
        h hVar = (h) aVar;
        h hVar2 = (h) aVar2;
        a aVar3 = (a) obj;
        int i = 0;
        if (hVar2 == null || f2 == 0.0f) {
            h.b bVar = hVar.f23366a;
            int size = bVar.f23370a.size();
            while (i < size) {
                bVar.f23370a.get(i).a(aVar3);
                i++;
            }
            return;
        }
        h.b bVar2 = hVar.f23366a;
        h.b bVar3 = hVar2.f23366a;
        int size2 = bVar2.f23370a.size();
        while (i < size2) {
            bVar2.f23370a.get(i).a(bVar3.f23370a.get(i), f2, aVar3);
            i++;
        }
    }
}
