package com.bytedance.im.core.b.b.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.l;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.d;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.d.m;
import com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody;
import com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.im.core.proto.ConversationOperationStatus;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SecUidPair;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a extends l<List<m>> {

    /* renamed from: a  reason: collision with root package name */
    public long f20952a = -1;

    a() {
        super(IMCMD.ADD_CONVERSATION_PARTICIPANTS.getValue());
    }

    a(b<List<m>> bVar) {
        super(IMCMD.ADD_CONVERSATION_PARTICIPANTS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.conversation_add_participants_body == null || fVar.g.body.conversation_add_participants_body.status == null || fVar.g.body.conversation_add_participants_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        boolean z;
        if (!fVar.g() || !a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        final String str = (String) fVar.f21166e[0];
        final List list = (List) fVar.f21166e[1];
        final int size = list.size();
        if (z) {
            final ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody = fVar.g.body.conversation_add_participants_body;
            AnonymousClass1 r2 = new d<Pair<com.bytedance.im.core.d.b, List<m>>>() {
                public final /* synthetic */ Object a() {
                    int i;
                    if (conversationAddParticipantsResponseBody.failed_participants != null) {
                        list.removeAll(conversationAddParticipantsResponseBody.failed_participants);
                    }
                    l.a();
                    long c2 = l.c(str);
                    com.bytedance.im.core.d.b a2 = com.bytedance.im.core.d.d.a().a(str);
                    if (a.this.f20952a > 0 && a2 == null) {
                        a aVar = a.this;
                        String str = str;
                        com.bytedance.im.core.d.b bVar = new com.bytedance.im.core.d.b();
                        bVar.setConversationId(str);
                        bVar.setConversationShortId(aVar.f20952a);
                        bVar.setConversationType(d.a.f20887b);
                        bVar.setIsMember(true);
                        k.a();
                        k.b(bVar);
                    }
                    l.a();
                    String str2 = str;
                    if (a2 == null) {
                        i = -1;
                    } else {
                        i = a2.getConversationType();
                    }
                    String str3 = str;
                    List list = list;
                    ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody = conversationAddParticipantsResponseBody;
                    HashMap hashMap = null;
                    if (conversationAddParticipantsResponseBody != null) {
                        List<SecUidPair> list2 = conversationAddParticipantsResponseBody.sec_success_participants;
                        if (list2 != null && !list2.isEmpty()) {
                            hashMap = new HashMap();
                            for (SecUidPair next : list2) {
                                if (!(next == null || next.uid == null)) {
                                    hashMap.put(next.uid, next.sec_uid);
                                }
                            }
                        }
                    }
                    l.a(str2, i, com.bytedance.im.core.b.e.b.a(str3, list, (Map<Long, String>) hashMap, c2));
                    k.a();
                    com.bytedance.im.core.d.b a3 = k.a(str);
                    if (a3 != null) {
                        a3.setMemberCount(a3.getMemberCount() + list.size());
                        k.a();
                        k.b(a3);
                    }
                    l.a();
                    return new Pair(a3, l.a(str, list));
                }
            };
            final f fVar2 = fVar;
            final Runnable runnable2 = runnable;
            AnonymousClass2 r4 = new c<Pair<com.bytedance.im.core.d.b, List<m>>>() {
                public final /* synthetic */ void a(Object obj) {
                    Pair pair = (Pair) obj;
                    if (pair.first != null) {
                        com.bytedance.im.core.d.d.a().b((com.bytedance.im.core.d.b) pair.first);
                    }
                    a.this.a(pair.second, fVar2);
                    g.a().a((List) pair.second);
                    com.bytedance.im.core.c.d.a(fVar2, true).a("conversation_id", str).a("total_count", Integer.valueOf(size)).a("count", Integer.valueOf(((List) pair.second).size())).b();
                    runnable2.run();
                }
            };
            e.a(r2, r4);
            return;
        }
        b(fVar);
        runnable.run();
        com.bytedance.im.core.c.d.a(fVar, false).a("conversation_id", str).a("total_count", Integer.valueOf(size)).b();
    }

    /* access modifiers changed from: package-private */
    public long a(String str, long j, List<Long> list, int i, int i2, Map<String, String> map, com.bytedance.im.core.b.c.e eVar) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return -1;
        }
        ConversationAddParticipantsRequestBody.Builder participants = new ConversationAddParticipantsRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i)).participants(list);
        if (map != null) {
            participants.biz_ext(map);
        }
        return a(i2, new RequestBody.Builder().conversation_add_participants_body(participants.build()).build(), eVar, str, list);
    }
}
