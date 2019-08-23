package com.bytedance.im.core.b.b.a;

import android.text.TextUtils;
import com.bytedance.im.core.a.a.a;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.c.d;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.q;
import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.StrangerConversation;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public final class k extends l<List<b>> {
    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    public k(a<List<b>> aVar) {
        super(IMCMD.GET_STRANGER_CONVERSATION_LIST.getValue(), aVar);
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.get_stranger_conversation_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        n nVar;
        int i;
        HashMap hashMap;
        int i2 = 0;
        if (!fVar.g() || !a(fVar)) {
            d.a(fVar, false).b();
            b(fVar);
            return;
        }
        GetStrangerConversationListResponseBody getStrangerConversationListResponseBody = fVar.g.body.get_stranger_conversation_body;
        List<StrangerConversation> list = getStrangerConversationListResponseBody.conversation_list;
        ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (StrangerConversation next : list) {
                if (com.bytedance.im.core.b.e.f.a(next.last_message)) {
                    MessageBody messageBody = next.last_message;
                    if (messageBody == null) {
                        nVar = null;
                    } else {
                        String str = "";
                        if (messageBody.ext != null && messageBody.ext.containsKey("s:client_message_id") && !TextUtils.isEmpty(messageBody.ext.get("s:client_message_id"))) {
                            str = messageBody.ext.get("s:client_message_id");
                        }
                        n nVar2 = new n();
                        nVar2.setMsgId(messageBody.server_message_id.longValue());
                        if (TextUtils.isEmpty(str)) {
                            str = UUID.randomUUID().toString();
                        }
                        nVar2.setUuid(str);
                        if (messageBody.create_time != null) {
                            nVar2.setCreatedAt(messageBody.create_time.longValue());
                        }
                        nVar2.setMsgType(messageBody.message_type.intValue());
                        nVar2.setConversationId(messageBody.conversation_id);
                        nVar2.setConversationType(messageBody.conversation_type.intValue());
                        nVar2.setSender(messageBody.sender.longValue());
                        nVar2.setContent(messageBody.content);
                        nVar2.setDeleted(0);
                        nVar2.setMsgStatus(5);
                        if (c.a().b().v) {
                            nVar = com.bytedance.im.core.b.e.a.b(nVar2);
                        } else {
                            nVar = nVar2;
                        }
                        nVar.setConversationShortId(messageBody.conversation_short_id.longValue());
                        if (messageBody.index_in_conversation != null) {
                            nVar.setIndex(messageBody.index_in_conversation.longValue());
                        }
                        nVar.setOrderIndex(0);
                        if (messageBody.status != null) {
                            i = messageBody.status.intValue();
                        } else {
                            i = 0;
                        }
                        nVar.setSvrStatus(i);
                        if (messageBody.version != null) {
                            nVar.setVersion(messageBody.version.longValue());
                        }
                        if (messageBody.ext == null) {
                            hashMap = null;
                        } else {
                            hashMap = new HashMap(messageBody.ext);
                        }
                        nVar.setExt(hashMap);
                        nVar.setReadStatus(1);
                        com.bytedance.im.core.a.b e2 = c.a().f20879c.e();
                        if (nVar.getSvrStatus() == 0 && e2 != null) {
                            nVar.setSvrStatus(e2.a(nVar));
                        }
                    }
                    if (nVar != null) {
                        b bVar = new b();
                        bVar.setConversationId(next.conversation_id);
                        bVar.setConversationShortId(next.conversation_short_id.longValue());
                        bVar.setConversationType(d.a.f20886a);
                        bVar.setMemberCount(2);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(Long.valueOf(c.a().f20879c.a()));
                        arrayList3.add(Long.valueOf(e.a(next.conversation_id)));
                        bVar.setMemberIds(arrayList3);
                        bVar.setIsMember(true);
                        bVar.setInboxType(0);
                        bVar.setLastMessage(nVar);
                        bVar.setLastMessageIndex(nVar.getIndex());
                        bVar.setUnreadCount((long) next.unread.intValue());
                        bVar.setHasMore(false);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("s:conv_is_stranger", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        bVar.setLocalExt(hashMap2);
                        bVar.setUpdatedTime(nVar.getCreatedAt());
                        arrayList2.add(bVar);
                    }
                }
            }
            arrayList = arrayList2;
        }
        if (getStrangerConversationListResponseBody.next_cursor != null) {
            getStrangerConversationListResponseBody.next_cursor.longValue();
        }
        if (getStrangerConversationListResponseBody.has_more != null) {
            getStrangerConversationListResponseBody.has_more.booleanValue();
        }
        if (this.f21060d != null && !(this.f21060d instanceof a)) {
            this.f21060d.a(arrayList);
        }
        q a2 = q.a();
        if (getStrangerConversationListResponseBody.total_unread != null) {
            i2 = getStrangerConversationListResponseBody.total_unread.intValue();
        }
        a2.a(i2);
        com.bytedance.im.core.c.d.a(fVar, true).b();
    }
}
