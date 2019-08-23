package com.bytedance.im.core.b.b.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.l;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.c.d;
import com.bytedance.im.core.d.m;
import com.bytedance.im.core.proto.ConversationOperationStatus;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import java.util.ArrayList;
import java.util.List;

public final class w extends l<List<m>> {
    w() {
        super(IMCMD.REMOVE_CONVERSATION_PARTICIPANTS.getValue());
    }

    public w(b<List<m>> bVar) {
        super(IMCMD.REMOVE_CONVERSATION_PARTICIPANTS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.conversation_remove_participants_body == null || fVar.g.body.conversation_remove_participants_body.status == null || fVar.g.body.conversation_remove_participants_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue()) {
            return false;
        }
        return true;
    }

    public static List<m> a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Long next : list) {
            if (next != null) {
                m mVar = new m();
                mVar.setUid(next.longValue());
                mVar.setConversationId(str);
                arrayList.add(mVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final void a(final f fVar, final Runnable runnable) {
        if (!fVar.g() || !a(fVar)) {
            b(fVar);
            runnable.run();
            d.a(fVar, false).b();
            return;
        }
        final String str = (String) fVar.f21166e[0];
        final List list = (List) fVar.f21166e[1];
        final ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody = fVar.g.body.conversation_remove_participants_body;
        e.a(new com.bytedance.im.core.b.d.d<Pair<com.bytedance.im.core.d.b, List<m>>>() {
            public final /* synthetic */ Object a() {
                if (conversationRemoveParticipantsResponseBody.failed_participants != null) {
                    list.removeAll(conversationRemoveParticipantsResponseBody.failed_participants);
                }
                if (list.size() <= 0) {
                    return null;
                }
                l.a();
                List<m> a2 = l.a(str, list);
                l.a();
                int b2 = l.b(str, list);
                k.a();
                com.bytedance.im.core.d.b a3 = k.a(str);
                if (a3 != null && b2 > 0) {
                    a3.setMemberCount(Math.max(0, a3.getMemberCount() - b2));
                    k.a();
                    k.b(a3);
                }
                if (a2 == null || a2.isEmpty()) {
                    a2 = w.a(str, list);
                }
                return new Pair(a3, a2);
            }
        }, new c<Pair<com.bytedance.im.core.d.b, List<m>>>() {
            public final /* synthetic */ void a(Object obj) {
                List list;
                Pair pair = (Pair) obj;
                if (pair != null) {
                    if (pair.first != null) {
                        com.bytedance.im.core.d.d.a().b((com.bytedance.im.core.d.b) pair.first);
                    }
                    g.a().b((List) pair.second);
                    d.a(fVar, true).b();
                }
                w wVar = w.this;
                if (pair != null) {
                    list = (List) pair.second;
                } else {
                    list = null;
                }
                wVar.a(list);
                runnable.run();
            }
        });
    }
}
