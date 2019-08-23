package com.bytedance.im.core.b.b.a;

import android.text.TextUtils;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.l;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.d;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.proto.ConversationOperationStatus;
import com.bytedance.im.core.proto.CreateConversationV2RequestBody;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class e extends l<b> {
    public e() {
        super(IMCMD.CREATE_CONVERSATION_V2.getValue());
    }

    public e(com.bytedance.im.core.a.a.b<b> bVar) {
        super(IMCMD.CREATE_CONVERSATION_V2.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.create_conversation_v2_body == null || fVar.g.body.create_conversation_v2_body.status == null || fVar.g.body.create_conversation_v2_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || fVar.g.body.create_conversation_v2_body.conversation == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(final f fVar, final Runnable runnable) {
        boolean z;
        if (!fVar.g() || !a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            final CreateConversationV2ResponseBody createConversationV2ResponseBody = fVar.g.body.create_conversation_v2_body;
            com.bytedance.im.core.b.d.e.a(new d<b>() {
                public final /* synthetic */ Object a() {
                    boolean z;
                    int i;
                    boolean z2;
                    k.a();
                    b a2 = k.a(createConversationV2ResponseBody.conversation.conversation_id);
                    if (a2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    l.a();
                    String str = createConversationV2ResponseBody.conversation.conversation_id;
                    if (createConversationV2ResponseBody.conversation.conversation_type == null) {
                        i = -1;
                    } else {
                        i = createConversationV2ResponseBody.conversation.conversation_type.intValue();
                    }
                    l.a(str, i, com.bytedance.im.core.b.e.b.a(createConversationV2ResponseBody.conversation.conversation_id, createConversationV2ResponseBody.conversation.first_page_participants.participants));
                    b a3 = com.bytedance.im.core.b.e.b.a(fVar.g.inbox_type.intValue(), a2, createConversationV2ResponseBody.conversation, System.currentTimeMillis());
                    a3.setUpdatedTime(System.currentTimeMillis());
                    if (z) {
                        k.a();
                        z2 = k.b(a3);
                    } else {
                        k.a();
                        z2 = k.a(a3);
                    }
                    if (z2) {
                        return a3;
                    }
                    return null;
                }
            }, new c<b>() {
                public final /* synthetic */ void a(Object obj) {
                    b bVar = (b) obj;
                    if (bVar != null) {
                        com.bytedance.im.core.d.d.a().c(bVar);
                        e.this.a(bVar, fVar);
                    } else {
                        e.this.b(f.a(-3001));
                    }
                    runnable.run();
                    com.bytedance.im.core.c.d.a(fVar, true).a("conversation_id", createConversationV2ResponseBody.conversation.conversation_id).a("conversation_type", createConversationV2ResponseBody.conversation.conversation_type).a("total_count", createConversationV2ResponseBody.conversation.participants_count).b();
                }
            });
            return;
        }
        b(fVar);
        runnable.run();
        com.bytedance.im.core.c.d.a(fVar, false).b();
    }

    public final long a(int i, long j, com.bytedance.im.core.b.c.e eVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(com.bytedance.im.core.a.c.a().f20879c.a()));
        arrayList.add(Long.valueOf(j));
        return a(i, d.a.f20886a, arrayList, null, null, eVar);
    }

    /* access modifiers changed from: package-private */
    public long a(int i, int i2, List<Long> list, String str, Map<String, String> map, com.bytedance.im.core.b.c.e eVar) {
        CreateConversationV2RequestBody createConversationV2RequestBody;
        if (list.contains(-1L) && com.bytedance.im.core.b.e.d.a()) {
            throw new IllegalArgumentException("id is invalid");
        } else if (list.contains(-1L)) {
            if (eVar != null) {
                eVar.b(f.a(-1015));
            }
            b(f.a(-1015));
            return -1;
        } else {
            CreateConversationV2RequestBody.Builder participants = new CreateConversationV2RequestBody.Builder().conversation_type(Integer.valueOf(i2)).participants(list);
            if (map != null) {
                participants.biz_ext(map);
            }
            if (i2 == d.a.f20886a) {
                createConversationV2RequestBody = participants.build();
            } else {
                boolean z = !TextUtils.isEmpty(str);
                CreateConversationV2RequestBody.Builder persistent = participants.persistent(Boolean.valueOf(z));
                if (!z) {
                    str = UUID.randomUUID().toString();
                }
                createConversationV2RequestBody = persistent.idempotent_id(str).build();
            }
            return a(i, new RequestBody.Builder().create_conversation_v2_body(createConversationV2RequestBody).build(), eVar, new Object[0]);
        }
    }
}
