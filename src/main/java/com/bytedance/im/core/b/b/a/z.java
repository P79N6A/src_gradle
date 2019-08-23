package com.bytedance.im.core.b.b.a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.a;
import com.bytedance.im.core.b.d.d;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.c.c;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.SendMessageResponseBody;
import com.bytedance.im.core.proto.SendMessageStatus;

public final class z extends l<n> {
    z() {
        super(IMCMD.SEND_MESSAGE.getValue());
    }

    public z(b<n> bVar) {
        super(IMCMD.SEND_MESSAGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.send_message_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(final f fVar, Runnable runnable) {
        final boolean z;
        if (!fVar.g() || !a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        final n nVar = (n) fVar.f21166e[0];
        e.a(new d<Pair<com.bytedance.im.core.d.b, n>>() {
            public final /* synthetic */ Object a() {
                if (z) {
                    SendMessageResponseBody sendMessageResponseBody = fVar.g.body.send_message_body;
                    if (sendMessageResponseBody.status != null) {
                        nVar.addLocalExt("s:send_response_extra_code", String.valueOf(sendMessageResponseBody.status));
                    }
                    if (sendMessageResponseBody.extra_info != null) {
                        nVar.addLocalExt("s:send_response_extra_msg", sendMessageResponseBody.extra_info);
                    } else {
                        nVar.clearLocalExt("s:send_response_extra_msg");
                    }
                    if (sendMessageResponseBody.check_code != null) {
                        nVar.addLocalExt("s:send_response_check_code", String.valueOf(sendMessageResponseBody.check_code));
                    } else {
                        nVar.clearLocalExt("s:send_response_check_code");
                    }
                    if (sendMessageResponseBody.check_message != null) {
                        nVar.addLocalExt("s:send_response_check_msg", sendMessageResponseBody.check_message);
                    } else {
                        nVar.clearLocalExt("s:send_response_check_msg");
                    }
                    if (sendMessageResponseBody.status == null || !(sendMessageResponseBody.status.intValue() == SendMessageStatus.SEND_SUCCEED.getValue() || sendMessageResponseBody.status.intValue() == SendMessageStatus.CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE.getValue())) {
                        nVar.setMsgStatus(3);
                        n nVar = nVar;
                        nVar.addLocalExt("s:err_code", fVar.i);
                        nVar.addLocalExt("s:err_msg", fVar.h());
                    } else {
                        nVar.setMsgStatus(2);
                        if (sendMessageResponseBody.server_message_id != null) {
                            nVar.setMsgId(sendMessageResponseBody.server_message_id.longValue());
                        }
                        nVar.clearLocalExt("s:err_code");
                        nVar.clearLocalExt("s:err_msg");
                    }
                } else {
                    nVar.setMsgStatus(3);
                    n nVar2 = nVar;
                    nVar2.addLocalExt("s:err_code", fVar.i);
                    nVar.addLocalExt("s:err_msg", fVar.h());
                }
                o.a();
                if (!o.d(nVar.getUuid())) {
                    com.bytedance.im.core.b.e.d.c("msg has already been deleted: " + nVar.getUuid());
                    return null;
                }
                o.a().a(nVar);
                c.a().a("core").b("send_insert").a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.j)).a("create_time", Long.valueOf(nVar.getCreatedAt())).a("conversation_id", nVar.getConversationId()).a("message_type", Integer.valueOf(nVar.getMsgType())).a("message_uuid", nVar.getUuid()).b();
                k.a();
                com.bytedance.im.core.d.b a2 = k.a(nVar.getConversationId());
                o.a();
                return new Pair(a2, o.c(nVar.getUuid()));
            }
        }, new com.bytedance.im.core.b.d.c<Pair<com.bytedance.im.core.d.b, n>>() {
            public final /* synthetic */ void a(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    if (pair.first != null) {
                        com.bytedance.im.core.d.d.a().b((com.bytedance.im.core.d.b) pair.first);
                    }
                    if (pair.second != null) {
                        g.a().a(d.b.f20889a, (n) pair.second);
                        if (((n) pair.second).getMsgStatus() == 2 || ((n) pair.second).getMsgStatus() == 5) {
                            z.this.a(pair.second);
                        } else {
                            z.this.b(fVar);
                        }
                    } else {
                        z.this.b(f.a(-3001));
                    }
                } else {
                    z.this.b(f.a(-1015));
                }
                com.bytedance.im.core.c.d.a(fVar, z).a("conversation_id", nVar.getConversationId()).a("message_type", Integer.valueOf(nVar.getMsgType())).a("message_uuid", nVar.getUuid()).b();
            }
        }, a.b());
    }
}
