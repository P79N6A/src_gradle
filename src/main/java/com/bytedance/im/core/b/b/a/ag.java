package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.m;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.c.d;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.proto.ConversationOperationStatus;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.IMCMD;

public final class ag extends l<b> {
    ag() {
        super(IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO.getValue());
    }

    public ag(com.bytedance.im.core.a.a.b<b> bVar) {
        super(IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.upsert_conversation_setting_ext_info_body == null || fVar.g.body.upsert_conversation_setting_ext_info_body.status == null || fVar.g.body.upsert_conversation_setting_ext_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || fVar.g.body.upsert_conversation_setting_ext_info_body.setting_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(final f fVar, final Runnable runnable) {
        final String str = (String) fVar.f21166e[0];
        if (!fVar.g() || !a(fVar)) {
            b(fVar);
            runnable.run();
            d.a(fVar, false).a("conversation_id", str).b();
            return;
        }
        final ConversationSettingInfo conversationSettingInfo = fVar.g.body.upsert_conversation_setting_ext_info_body.setting_info;
        e.a(new com.bytedance.im.core.b.d.d<b>() {
            public final /* synthetic */ Object a() {
                k.a();
                b a2 = k.a(str);
                com.bytedance.im.core.d.f a3 = com.bytedance.im.core.b.e.b.a((com.bytedance.im.core.d.f) null, conversationSettingInfo);
                if (a2 != null) {
                    a2.setSettingInfo(a3);
                }
                m.a();
                m.a(a3);
                return a2;
            }
        }, new c<b>() {
            public final /* synthetic */ void a(Object obj) {
                b bVar = (b) obj;
                if (bVar != null) {
                    com.bytedance.im.core.d.d.a().b(bVar);
                    ag.this.a(bVar);
                    d.a(fVar, true).a("conversation_id", str).b();
                } else {
                    ag.this.b(f.a(-1015));
                }
                runnable.run();
            }
        });
    }
}
