package com.bytedance.im.core.b.b.a;

import android.text.TextUtils;
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

public final class ae extends l<b> {
    ae() {
        super(IMCMD.SET_CONVERSATION_SETTING_INFO.getValue());
    }

    public ae(com.bytedance.im.core.a.a.b<b> bVar) {
        super(IMCMD.SET_CONVERSATION_SETTING_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.set_conversation_setting_info_body == null || fVar.g.body.set_conversation_setting_info_body.status == null || fVar.g.body.set_conversation_setting_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || fVar.g.body.set_conversation_setting_info_body.setting_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        final String str = (String) fVar.f21166e[0];
        final boolean booleanValue = ((Boolean) fVar.f21166e[1]).booleanValue();
        final String str2 = (String) fVar.f21166e[2];
        if (!fVar.g() || !a(fVar)) {
            b(fVar);
            runnable.run();
            d.a(fVar, false).a("conversation_id", str).a("keys", str2).b();
            return;
        }
        final ConversationSettingInfo conversationSettingInfo = fVar.g.body.set_conversation_setting_info_body.setting_info;
        AnonymousClass1 r8 = new com.bytedance.im.core.b.d.d<b>() {
            public final /* synthetic */ Object a() {
                m.a();
                com.bytedance.im.core.d.f a2 = com.bytedance.im.core.b.e.b.a(m.a(conversationSettingInfo.conversation_id), conversationSettingInfo);
                m.a();
                boolean a3 = m.a(a2);
                if (booleanValue) {
                    k.a();
                    String str = conversationSettingInfo.conversation_id;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(str) && currentTimeMillis > 0) {
                        com.bytedance.im.core.b.a.a.d.a();
                        com.bytedance.im.core.b.a.a.d.c("update conversation_list set " + com.bytedance.im.core.b.a.b.COLUMN_UPDATE_TIME.key + "=" + System.currentTimeMillis() + " where " + com.bytedance.im.core.b.a.b.COLUMN_ID.key + "=\"" + str + "\"");
                    }
                }
                if (!a3) {
                    return null;
                }
                k.a();
                return k.a(conversationSettingInfo.conversation_id);
            }
        };
        final f fVar2 = fVar;
        final Runnable runnable2 = runnable;
        AnonymousClass2 r2 = new c<b>() {
            public final /* synthetic */ void a(Object obj) {
                b bVar = (b) obj;
                if (bVar != null) {
                    com.bytedance.im.core.d.d.a().b(bVar);
                    ae.this.a(bVar);
                    d.a(fVar2, true).a("conversation_id", str).a("keys", str2).b();
                } else {
                    ae.this.b(f.a(-3001));
                    d.a(fVar2, false).a("conversation_id", str).a("keys", str2).b();
                }
                runnable2.run();
            }
        };
        e.a(r8, r2);
    }
}
