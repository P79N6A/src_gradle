package com.ss.android.ugc.aweme.im.sdk.chat;

import com.bytedance.im.core.d.k;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.c.a;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50297a;

    public final void a(int i, p pVar) {
    }

    public final void a(n nVar) {
    }

    public final void a(boolean z) {
    }

    public final void b(int i, n nVar) {
    }

    public final void b(n nVar) {
    }

    public final void d(List<n> list) {
    }

    public final void e(List<n> list) {
    }

    public final void f(List<n> list) {
    }

    public final void g(List<p> list) {
    }

    public final void c(List<n> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f50297a, false, 50290, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f50297a, false, 50290, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{list}, null, a.f22842a, true, 51682, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, null, a.f22842a, true, 51682, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && !list.isEmpty()) {
            for (n next : list) {
                if (PatchProxy.isSupport(new Object[]{next}, null, a.f22842a, true, 51683, new Class[]{n.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{next}, null, a.f22842a, true, 51683, new Class[]{n.class}, Void.TYPE);
                } else if (next != null && !next.isSelf()) {
                    BaseContent content = m.content(next);
                    if (content != null && content.getType() == 770) {
                        Map a2 = a.a(next.getConversationId());
                        if (PatchProxy.isSupport(new Object[]{a2}, null, a.f22842a, true, 51685, new Class[]{Map.class}, Map.class)) {
                            a2 = (Map) PatchProxy.accessDispatch(new Object[]{a2}, null, a.f22842a, true, 51685, new Class[]{Map.class}, Map.class);
                        } else if (a2 == null) {
                            a2 = new HashMap();
                        }
                        a2.put("commercialize.personal_info_count", "3");
                        a.a(next.getConversationId(), a2);
                    }
                }
            }
        }
    }

    public final void a(int i, n nVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), nVar}, this, f50297a, false, 50289, new Class[]{Integer.TYPE, n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), nVar}, this, f50297a, false, 50289, new Class[]{Integer.TYPE, n.class}, Void.TYPE);
            return;
        }
        j.c(nVar);
    }
}
