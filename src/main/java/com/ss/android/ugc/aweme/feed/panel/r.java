package com.ss.android.ugc.aweme.feed.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

public final class r extends CellFeedFragmentPanel {
    public static ChangeQuickRedirect p;

    private void a(List<Aweme> list) {
        List<Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, p, false, 41904, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, p, false, 41904, new Class[]{List.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme next : list) {
            if (next.isLive()) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            list2.removeAll(arrayList);
        }
    }

    public final void b(List<Aweme> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, p, false, 41903, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, p, false, 41903, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(list);
        super.b(list, z);
    }

    public final void a(List<Aweme> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, p, false, 41902, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, p, false, 41902, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(list);
        super.a(list, z);
    }

    public r(String str, d dVar, m mVar, int i) {
        super(str, dVar, mVar, i);
    }
}
