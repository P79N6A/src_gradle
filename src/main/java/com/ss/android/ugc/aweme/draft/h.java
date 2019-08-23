package com.ss.android.ugc.aweme.draft;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.draft.a.k;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43482a;

    /* renamed from: b  reason: collision with root package name */
    private final DraftBoxFragment f43483b;

    h(DraftBoxFragment draftBoxFragment) {
        this.f43483b = draftBoxFragment;
    }

    public final void run() {
        ArrayList arrayList;
        if (PatchProxy.isSupport(new Object[0], this, f43482a, false, 38421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43482a, false, 38421, new Class[0], Void.TYPE);
            return;
        }
        DraftBoxFragment draftBoxFragment = this.f43483b;
        ai.a("Before DraftDataProvider.getDraftData()");
        if (PatchProxy.isSupport(new Object[0], null, m.f43495a, true, 38454, new Class[0], ArrayList.class)) {
            arrayList = (ArrayList) PatchProxy.accessDispatch(new Object[0], null, m.f43495a, true, 38454, new Class[0], ArrayList.class);
        } else {
            ArrayList arrayList2 = new ArrayList();
            l a2 = l.a();
            if (a2 != null) {
                ai.a("Before DraftDataProvider.queryMusicAwemeCollection()");
                List<k> d2 = a2.d();
                ai.a("After DraftDataProvider.queryMusicAwemeCollection()");
                if (d2 != null) {
                    for (int i = 0; i < d2.size(); i++) {
                        k kVar = d2.get(i);
                        if (!(kVar == null || kVar.a() == null)) {
                            List a3 = kVar.a();
                            for (int i2 = 0; i2 < a3.size(); i2++) {
                                c cVar = (c) a3.get(i2);
                                if (cVar != null) {
                                    if (i2 == 0 && cVar.f43438f != null && !TextUtils.isEmpty(cVar.f43438f.getName())) {
                                        c cVar2 = new c();
                                        cVar2.f43438f = cVar.f43438f;
                                        cVar2.v = 1;
                                        arrayList2.add(cVar2);
                                    }
                                    if (i2 == a3.size() - 1) {
                                        cVar.x = true;
                                    } else {
                                        cVar.x = false;
                                    }
                                    arrayList2.add(cVar);
                                }
                            }
                        }
                    }
                }
            }
            arrayList = arrayList2;
        }
        ai.a("After DraftDataProvider.getDraftData()");
        a.b(new k(draftBoxFragment, arrayList));
    }
}
