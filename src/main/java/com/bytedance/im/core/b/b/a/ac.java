package com.bytedance.im.core.b.b.a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.a;
import com.bytedance.im.core.b.d.d;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.b;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.c.c;
import com.bytedance.im.core.d.p;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.SendMessageStatus;
import com.bytedance.im.core.proto.SyncMessageResponseBody;
import java.util.Collections;
import java.util.Map;

public final class ac extends l<p> {
    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.sync_message_body == null) {
            return false;
        }
        return true;
    }

    static void a(MessageBody messageBody) {
        Map<String, String> map = messageBody.ext;
        String str = "";
        if (map != null && map.containsKey("s:client_message_id") && !TextUtils.isEmpty(map.get("s:client_message_id"))) {
            str = map.get("s:client_message_id");
        }
        p a2 = b.a(str, messageBody);
        if (com.bytedance.im.core.b.a.p.a().a(a2)) {
            g.a().g(Collections.singletonList(a2));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(final f fVar, Runnable runnable) {
        final boolean z;
        if (!fVar.g() || !a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        final p pVar = (p) fVar.f21166e[0];
        e.a(new d<p>() {
            public final /* synthetic */ Object a() {
                if (z) {
                    SyncMessageResponseBody syncMessageResponseBody = fVar.g.body.sync_message_body;
                    if (syncMessageResponseBody.status != null) {
                        pVar.addLocalExt("s:send_response_extra_code", String.valueOf(syncMessageResponseBody.status));
                    }
                    if (syncMessageResponseBody.status == null || !(syncMessageResponseBody.status.getValue() == SendMessageStatus.SEND_SUCCEED.getValue() || syncMessageResponseBody.status.getValue() == SendMessageStatus.CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE.getValue())) {
                        pVar.setStatus(3);
                        p pVar = pVar;
                        pVar.addLocalExt("s:err_code", fVar.i);
                        pVar.addLocalExt("s:err_msg", fVar.h());
                    } else {
                        pVar.setStatus(2);
                        if (syncMessageResponseBody.server_message_id != null) {
                            pVar.setServerId(syncMessageResponseBody.server_message_id.longValue());
                        }
                        pVar.clearLocalExt("s:err_code");
                        pVar.clearLocalExt("s:err_msg");
                    }
                } else {
                    pVar.setStatus(3);
                    p pVar2 = pVar;
                    pVar2.addLocalExt("s:err_code", fVar.i);
                    pVar.addLocalExt("s:err_msg", fVar.h());
                }
                boolean a2 = com.bytedance.im.core.b.a.p.a().a(pVar);
                c.a().a("core").b("property_send_insert").a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.j)).a("create_time", Long.valueOf(pVar.getCreatedTime())).a("conversation_id", pVar.getConversationId()).a("target_message_uuid", pVar.getTargetUuid()).a("message_type", Integer.valueOf(pVar.getMsgType())).a("message_uuid", pVar.getUuid()).b();
                if (a2) {
                    return pVar;
                }
                return null;
            }
        }, new com.bytedance.im.core.b.d.c<p>() {
            public final /* synthetic */ void a(Object obj) {
                p pVar = (p) obj;
                if (pVar == null) {
                    ac.this.b(f.a(-3001));
                } else if (pVar.getStatus() == 2 || pVar.getStatus() == 5) {
                    ac.this.a(pVar);
                    g.a().a(d.b.f20889a, pVar);
                } else {
                    ac.this.b(fVar);
                }
                com.bytedance.im.core.c.d.a(fVar, z).a("conversation_id", pVar.getConversationId()).a("target_message_uuid", pVar.getTargetUuid()).a("message_type", Integer.valueOf(pVar.getMsgType())).a("message_uuid", pVar.getUuid()).b();
            }
        }, a.a());
    }
}
