package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.c.d;
import com.bytedance.im.core.proto.IMCMD;

public final class o extends l<String> {
    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        return true;
    }

    o() {
        super(IMCMD.LEAVE_CONVERSATION.getValue());
    }

    public o(b<String> bVar) {
        super(IMCMD.LEAVE_CONVERSATION.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        final String str = (String) fVar.f21166e[0];
        final boolean booleanValue = ((Boolean) fVar.f21166e[1]).booleanValue();
        if (!fVar.g() || !a(fVar)) {
            b(fVar);
            runnable.run();
            d.a(fVar, false).a("conversation_id", str).b();
            return;
        }
        AnonymousClass1 r0 = new com.bytedance.im.core.b.d.d<Boolean>() {
            public final /* synthetic */ Object a() {
                k.a();
                k.c(str);
                return Boolean.TRUE;
            }
        };
        final Runnable runnable2 = runnable;
        final f fVar2 = fVar;
        AnonymousClass2 r2 = new c<Boolean>() {
            public final /* synthetic */ void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    com.bytedance.im.core.d.b a2 = com.bytedance.im.core.d.d.a().a(str);
                    com.bytedance.im.core.d.d.a().a(a2);
                    if (a2 != null && booleanValue) {
                        new f().a(a2.getInboxType(), str, a2.getConversationShortId(), a2.getConversationType(), a2.getLastMessageIndex());
                    }
                    o.this.a(str);
                }
                runnable2.run();
                d.a(fVar2, true).a("conversation_id", str).b();
            }
        };
        e.a(r0, r2);
    }
}
