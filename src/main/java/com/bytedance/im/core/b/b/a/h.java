package com.bytedance.im.core.b.b.a;

import android.util.Pair;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.l;
import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.b.b.a;
import com.bytedance.im.core.b.c.e;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.RequestBody;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashMap;

public final class h extends l<b> {
    h() {
        super(IMCMD.GET_CONVERSATION_INFO_V2.getValue());
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.get_conversation_info_v2_body == null || fVar.g.body.get_conversation_info_v2_body.conversation_info == null) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        b a2 = d.a().a(str);
        if (a2 == null || a2.isTemp()) {
            b(f.a(-1017));
        } else if (a.a(str)) {
            com.bytedance.im.core.b.e.d.c("Get Conversation Info running: " + str);
            b(f.a(-1018));
        } else {
            RequestBody build = new RequestBody.Builder().get_conversation_info_v2_body(new GetConversationInfoV2RequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).build()).build();
            a(a2.getInboxType(), build, null, str, Long.valueOf(a2.getConversationShortId()), Integer.valueOf(a2.getConversationType()), Long.valueOf(a2.getUpdatedTime()));
            a.b(str);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        int intValue = fVar.f21167f.inbox_type.intValue();
        String str = (String) fVar.f21166e[0];
        boolean z = true;
        final long longValue = ((Long) fVar.f21166e[1]).longValue();
        final int intValue2 = ((Integer) fVar.f21166e[2]).intValue();
        long longValue2 = ((Long) fVar.f21166e[3]).longValue();
        a.f20947b.remove(str);
        com.bytedance.im.core.b.e.d.c("Get Conversation Info finish: " + str);
        if (!fVar.g() || !a(fVar)) {
            z = false;
        }
        if (z) {
            ConversationInfoV2 conversationInfoV2 = fVar.g.body.get_conversation_info_v2_body.conversation_info;
            final int i = intValue;
            final long j = longValue2;
            final ConversationInfoV2 conversationInfoV22 = conversationInfoV2;
            AnonymousClass1 r1 = new com.bytedance.im.core.b.d.d<Pair<b, Boolean>>() {
                public final /* bridge */ /* synthetic */ Object a() {
                    return h.a(i, j, conversationInfoV22);
                }
            };
            final ConversationInfoV2 conversationInfoV23 = conversationInfoV2;
            final int i2 = intValue;
            final String str2 = str;
            final f fVar2 = fVar;
            final Runnable runnable2 = runnable;
            AnonymousClass2 r12 = new c<Pair<b, Boolean>>() {
                public final /* synthetic */ void a(Object obj) {
                    Pair pair = (Pair) obj;
                    if (pair != null) {
                        d.a().b((b) pair.first);
                        if (((Boolean) pair.second).booleanValue() && conversationInfoV23.first_page_participants.has_more != null && conversationInfoV23.first_page_participants.has_more.booleanValue()) {
                            new q().a(((b) pair.first).getConversationId(), (e) null);
                        }
                        h.this.a(pair.first);
                        a.a(i2, str2);
                        com.bytedance.im.core.c.d.a(fVar2, true).a("conversation_id", str2).b();
                    } else {
                        h.this.b(f.a(-3001));
                    }
                    runnable2.run();
                }
            };
            com.bytedance.im.core.b.d.e.a(r1, r12);
            return;
        }
        b(fVar);
        runnable.run();
        com.bytedance.im.core.c.d.a(fVar, false).a("conversation_id", str).b();
        if (fVar.i == -1000) {
            if (com.bytedance.im.core.a.c.a().b().w) {
                final int i3 = intValue;
                final String str3 = str;
                final long j2 = longValue2;
                AnonymousClass3 r13 = new com.bytedance.im.core.b.d.d<b>() {
                    public final /* synthetic */ Object a() {
                        return h.b(i3, str3, longValue, intValue2, j2);
                    }
                };
                com.bytedance.im.core.b.d.e.a(r13, new c<b>() {
                    public final /* synthetic */ void a(Object obj) {
                        b bVar = (b) obj;
                        if (bVar != null) {
                            d.a().b(bVar);
                        }
                    }
                });
                return;
            }
            a.a(intValue, str, longValue, intValue2, longValue2);
        }
    }

    static Pair<b, Boolean> a(int i, long j, ConversationInfoV2 conversationInfoV2) {
        int i2;
        boolean z;
        boolean z2;
        k.a();
        b a2 = k.a(conversationInfoV2.conversation_id);
        if (a2 == null || a2.isMember() || conversationInfoV2.is_participant == null || conversationInfoV2.is_participant.booleanValue()) {
            l.a();
            l.d(conversationInfoV2.conversation_id);
            l.a();
            String str = conversationInfoV2.conversation_id;
            if (conversationInfoV2.conversation_type == null) {
                i2 = -1;
            } else {
                i2 = conversationInfoV2.conversation_type.intValue();
            }
            l.a(str, i2, com.bytedance.im.core.b.e.b.a(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
            b a3 = com.bytedance.im.core.b.e.b.a(i, a2, conversationInfoV2, j);
            if (a2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                k.a();
                z2 = k.a(a3);
            } else {
                k.a();
                z2 = k.b(a3);
            }
            if (z2) {
                return new Pair<>(a3, Boolean.valueOf(z));
            }
        }
        return null;
    }

    public final synchronized void a(int i, String str, long j, int i2, long j2) {
        try {
            a(i, str, j, i2, j2, false);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static b b(int i, String str, long j, int i2, long j2) {
        k.a();
        if (k.b(str)) {
            return null;
        }
        com.bytedance.im.core.b.e.d.b("create local conversation for net error: convId=" + str + ", shortId=" + j + ", type=" + i2 + ", time=" + j2);
        b bVar = new b();
        bVar.setInboxType(i);
        bVar.setConversationId(str);
        bVar.setConversationShortId(j);
        bVar.setConversationType(i2);
        bVar.setUpdatedTime(j2);
        if (bVar.isSingleChat()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(com.bytedance.im.core.a.c.a().f20879c.a()));
            arrayList.add(Long.valueOf(com.bytedance.im.core.d.e.a(str)));
            bVar.setMemberIds(arrayList);
            bVar.setMemberCount(2);
        }
        bVar.setIsMember(true);
        bVar.setLastMessageIndex(o.a().f(str));
        o.a();
        bVar.setLastMessage(o.g(str));
        HashMap hashMap = new HashMap();
        hashMap.put("s:conv_wait_info", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        bVar.setLocalExt(hashMap);
        k.a();
        if (k.a(bVar)) {
            return bVar;
        }
        return null;
    }

    private synchronized void a(int i, String str, long j, int i2, long j2, boolean z) {
        if (a.a(str)) {
            com.bytedance.im.core.b.e.d.c("Get Conversation Info running: " + str);
            return;
        }
        a(i, new RequestBody.Builder().get_conversation_info_v2_body(new GetConversationInfoV2RequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).build()).build(), null, str, Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2));
        a.b(str);
    }
}
