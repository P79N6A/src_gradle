package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.b.a.j;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.c.d;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.c;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.ConversationOperationStatus;
import com.bytedance.im.core.proto.IMCMD;

public final class ad extends l<b> {
    ad() {
        super(IMCMD.SET_CONVERSATION_CORE_INFO.getValue());
    }

    public ad(com.bytedance.im.core.a.a.b<b> bVar) {
        super(IMCMD.SET_CONVERSATION_CORE_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.set_conversation_core_info_body == null || fVar.g.body.set_conversation_core_info_body.status == null || fVar.g.body.set_conversation_core_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || fVar.g.body.set_conversation_core_info_body.conversation_core_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        final String str = (String) fVar.f21166e[0];
        final String str2 = (String) fVar.f21166e[1];
        if (!fVar.g() || !a(fVar)) {
            b(fVar);
            runnable.run();
            d.a(fVar, false).a("conversation_id", str).a("keys", str2).b();
            return;
        }
        final ConversationCoreInfo conversationCoreInfo = fVar.g.body.set_conversation_core_info_body.conversation_core_info;
        AnonymousClass1 r1 = new com.bytedance.im.core.b.d.d<b>() {
            public final /* bridge */ /* synthetic */ Object a() {
                j.a();
                c a2 = com.bytedance.im.core.b.e.b.a(conversationCoreInfo.conversation_id, j.a(conversationCoreInfo.conversation_id), conversationCoreInfo);
                j.a();
                if (!j.a(a2)) {
                    return null;
                }
                k.a();
                return k.a(conversationCoreInfo.conversation_id);
            }
        };
        final f fVar2 = fVar;
        final Runnable runnable2 = runnable;
        AnonymousClass2 r2 = new com.bytedance.im.core.b.d.c<b>() {
            public final /* synthetic */ void a(Object obj) {
                b bVar = (b) obj;
                if (bVar != null) {
                    com.bytedance.im.core.d.d.a().b(bVar);
                    ad.this.a(bVar);
                    d.a(fVar2, true).a("conversation_id", str).a("keys", str2).b();
                } else {
                    ad.this.b(f.a(-3001));
                    d.a(fVar2, false).a("conversation_id", str).a("keys", str2).b();
                }
                runnable2.run();
            }
        };
        e.a(r1, r2);
    }
}
