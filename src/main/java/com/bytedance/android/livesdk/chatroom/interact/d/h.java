package com.bytedance.android.livesdk.chatroom.interact.d;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.chatroom.interact.d.a;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10853a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10854b;

    h(a aVar) {
        this.f10854b = aVar;
    }

    public final void accept(Object obj) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10853a, false, 5052, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10853a, false, 5052, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f10854b;
        aVar.f10837c = false;
        List list = ((c) obj).f7867b;
        if (!list.isEmpty()) {
            int size = aVar.i.size();
            int i = 0;
            while (i < size) {
                j jVar = aVar.i.get(i);
                jVar.n = z2;
                Iterator it2 = list.iterator();
                char c2 = z2;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    j jVar2 = (j) it2.next();
                    Object[] objArr = new Object[2];
                    objArr[0] = jVar;
                    objArr[c2] = jVar2;
                    ChangeQuickRedirect changeQuickRedirect = a.f10835a;
                    Class[] clsArr = new Class[2];
                    clsArr[0] = j.class;
                    clsArr[c2] = j.class;
                    if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, 5044, clsArr, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{jVar, jVar2}, aVar, a.f10835a, false, 5044, new Class[]{j.class, j.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        z = (jVar == null || jVar.f11052e == null || jVar2 == null || jVar2.f11052e == null || ((jVar.f11051d <= 0 || jVar.f11051d != jVar2.f11051d) && (jVar.f11052e.getId() <= 0 || jVar.f11052e.getId() != jVar2.f11052e.getId()))) ? false : true;
                    }
                    if (z) {
                        aVar.i.set(i, jVar2);
                        it2.remove();
                        break;
                    }
                    c2 = 1;
                }
                i++;
                z2 = true;
            }
            Iterator<j> it3 = aVar.i.iterator();
            while (it3.hasNext()) {
                j next = it3.next();
                if (next.n) {
                    it3.remove();
                    aVar.a(next);
                }
            }
            aVar.i.addAll(list);
            for (j next2 : aVar.i) {
                aVar.k.put(Integer.valueOf(next2.f11051d), Boolean.valueOf(next2.f11049b == 0));
            }
            for (a.C0089a a2 : aVar.g) {
                a2.a(aVar.i);
            }
        }
    }
}
