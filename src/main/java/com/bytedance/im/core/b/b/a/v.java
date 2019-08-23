package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.d;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.proto.IMCMD;
import java.util.List;
import java.util.Map;

public final class v extends l<n> {
    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        return true;
    }

    v() {
        super(IMCMD.RECALL_MESSAGE.getValue());
    }

    /* access modifiers changed from: package-private */
    public void a(final n nVar) {
        e.a(new d<Boolean>() {
            public final /* synthetic */ Object a() {
                Map<String, String> ext = nVar.getExt();
                ext.put("s:is_recalled", "true");
                nVar.putExt(ext);
                List<Long> mentionIds = nVar.getMentionIds();
                if (mentionIds != null && !mentionIds.isEmpty()) {
                    com.bytedance.im.core.b.a.n.a();
                    if (com.bytedance.im.core.b.a.n.a(nVar.getUuid())) {
                        com.bytedance.im.core.d.d a2 = com.bytedance.im.core.d.d.a();
                        k.a();
                        a2.b(k.a(nVar.getConversationId()));
                    }
                }
                return Boolean.valueOf(o.a().a(nVar));
            }
        }, new c<Boolean>() {
            public final /* synthetic */ void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    v.this.a(nVar);
                    g.a().b(nVar);
                    return;
                }
                v.this.b(f.a(-3001));
            }
        });
    }

    v(b<n> bVar) {
        super(IMCMD.RECALL_MESSAGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        n nVar = (n) fVar.f21166e[0];
        if (!fVar.g() || !a(fVar)) {
            b(fVar);
        } else {
            a(nVar);
        }
    }
}
