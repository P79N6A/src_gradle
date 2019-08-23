package com.bytedance.im.core.b.b.a;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.a;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.b.e.l;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageDirection;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.im.core.proto.RecallMessageRequestBody;
import com.bytedance.im.core.proto.RequestBody;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import java.util.Map;

public final class m implements l.a {

    /* renamed from: c  reason: collision with root package name */
    private static m f21065c;

    /* renamed from: a  reason: collision with root package name */
    public l f21066a = new l(Looper.getMainLooper(), this);

    /* renamed from: b  reason: collision with root package name */
    public boolean f21067b;

    public final void a(Message message) {
        if (message.obj instanceof f) {
            f fVar = (f) message.obj;
            if (fVar.h != null) {
                fVar.h.c(fVar);
            }
        }
    }

    public static void a(String str, List<Long> list, Map<String, String> map, b<List<com.bytedance.im.core.d.m>> bVar) {
        a aVar = new a(bVar);
        if (list != null && !list.isEmpty()) {
            com.bytedance.im.core.d.b a2 = d.a().a(str);
            if (a2 != null) {
                aVar.a(str, a2.getConversationShortId(), list, a2.getConversationType(), a2.getInboxType(), map, null);
            }
        }
    }

    private m() {
        com.bytedance.im.core.b.c.b a2 = com.bytedance.im.core.b.c.b.a();
        l lVar = this.f21066a;
        a2.f21151a.a(lVar);
        a2.f21152b.a(lVar);
    }

    public static m a() {
        if (f21065c == null) {
            synchronized (m.class) {
                if (f21065c == null) {
                    f21065c = new m();
                }
            }
        }
        return f21065c;
    }

    public final void a(Runnable runnable) {
        this.f21066a.post(runnable);
    }

    public static void a(int i) {
        new x(i).b();
    }

    public static void b(String str) {
        new h().a(str);
    }

    public static void a(String str) {
        p pVar = new p();
        com.bytedance.im.core.d.b a2 = d.a().a(str);
        if (a2 == null || !a2.hasMore()) {
            g.a().b(str, (List<n>) null);
        } else {
            e.a(new com.bytedance.im.core.b.d.d<Long>(str, a2) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f21085a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ com.bytedance.im.core.d.b f21086b;

                public final /* synthetic */ Object a() {
                    o.a();
                    n e2 = o.e(this.f21085a);
                    if (e2 == null) {
                        return Long.valueOf(this.f21086b.getLastMessageIndex());
                    }
                    return Long.valueOf(e2.getIndex());
                }

                {
                    this.f21085a = r2;
                    this.f21086b = r3;
                }
            }, new c<Long>(str, a2) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f21088a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ com.bytedance.im.core.d.b f21089b;

                public final /* synthetic */ void a(Object obj) {
                    Long l = (Long) obj;
                    if (l.longValue() == -1) {
                        g.a().b(this.f21088a, (List<n>) null);
                        return;
                    }
                    p pVar = p.this;
                    com.bytedance.im.core.d.b bVar = this.f21089b;
                    RequestBody build = new RequestBody.Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(bVar.getConversationId()).conversation_short_id(Long.valueOf(bVar.getConversationShortId())).conversation_type(Integer.valueOf(bVar.getConversationType())).direction(MessageDirection.OLDER).anchor_index(Long.valueOf(l.longValue())).build()).build();
                    pVar.a(bVar.getInboxType(), build, null, bVar.getConversationId());
                }

                {
                    this.f21088a = r2;
                    this.f21089b = r3;
                }
            }, a.c());
        }
    }

    public static f a(IMCMD imcmd, f fVar) {
        if (imcmd == IMCMD.NEW_MSG_NOTIFY) {
            fVar.h = new u();
        } else if (imcmd == IMCMD.MARK_READ_NOTIFY) {
            fVar.h = new t();
        } else if (imcmd != IMCMD.STRANGER_NEW_MSG_NOTIFY) {
            return null;
        } else {
            fVar.h = new af();
        }
        return fVar;
    }

    public static void a(int i, int i2) {
        new j(i).a(i2);
    }

    public static void a(n nVar, b<n> bVar) {
        boolean z;
        v vVar = new v(bVar);
        if (nVar.isSelf()) {
            if (nVar == null) {
                z = false;
            } else {
                Map<String, String> localExt = nVar.getLocalExt();
                if (localExt == null || !localExt.containsKey("s:send_response_check_code")) {
                    z = true;
                } else {
                    z = TextUtils.equals(PushConstants.PUSH_TYPE_NOTIFY, localExt.get("s:send_response_check_code"));
                }
            }
            if (z) {
                com.bytedance.im.core.d.b a2 = d.a().a(nVar.getConversationId());
                RequestBody build = new RequestBody.Builder().recall_message_body(new RecallMessageRequestBody.Builder().conversation_id(nVar.getConversationId()).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).server_message_id(Long.valueOf(nVar.getMsgId())).build()).build();
                vVar.a(a2.getInboxType(), build, null, nVar);
                return;
            }
            vVar.a(nVar);
        }
    }

    public static void a(int i, List<Long> list, String str, Map<String, String> map, b<com.bytedance.im.core.d.b> bVar) {
        e eVar = new e(bVar);
        if (list != null && !list.isEmpty()) {
            if (!list.contains(Long.valueOf(com.bytedance.im.core.a.c.a().f20879c.a()))) {
                list.add(0, Long.valueOf(com.bytedance.im.core.a.c.a().f20879c.a()));
            }
            eVar.a(i, d.a.f20887b, list, str, map, null);
        }
    }

    public static void a(String str, long j, List<Long> list, Map<String, String> map, b<List<com.bytedance.im.core.d.m>> bVar) {
        a aVar = new a(bVar);
        aVar.f20952a = j;
        aVar.a(str, j, list, d.a.f20887b, 0, map, null);
    }
}
