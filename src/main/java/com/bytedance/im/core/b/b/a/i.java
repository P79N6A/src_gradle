package com.bytedance.im.core.b.b.a;

import android.util.Pair;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.b.a;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.c.d;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class i extends l {
    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    public i() {
        super(IMCMD.GET_CONVERSATION_INFO_LIST_V2.getValue());
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.get_conversation_info_list_v2_body == null || fVar.g.body.get_conversation_info_list_v2_body.conversation_info_list == null) {
            return false;
        }
        return true;
    }

    public void a(int i, Map<String, MessageBody> map) {
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (MessageBody next : map.values()) {
                arrayList.add(new GetConversationInfoV2RequestBody.Builder().conversation_id(next.conversation_id).conversation_short_id(next.conversation_short_id).conversation_type(next.conversation_type).build());
            }
            a(i, new RequestBody.Builder().get_conversation_info_list_v2_body(new GetConversationInfoListV2RequestBody(arrayList)).build(), null, map);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(final f fVar, Runnable runnable) {
        final int intValue = fVar.f21167f.inbox_type.intValue();
        final Map map = (Map) fVar.f21166e[0];
        if (!fVar.g() || !a(fVar)) {
            a.a(intValue, 2);
            d.a(fVar, false).b();
            if (fVar.i == -1000 && map != null && !map.isEmpty()) {
                if (c.a().b().w) {
                    e.a(new com.bytedance.im.core.b.d.d<List<b>>() {
                        public final /* synthetic */ Object a() {
                            ArrayList arrayList = new ArrayList();
                            com.bytedance.im.core.b.a.a.d.a();
                            com.bytedance.im.core.b.a.a.d.a("GetConversationInfoListHandler.createTempConversations");
                            for (String str : map.keySet()) {
                                int i = intValue;
                                MessageBody messageBody = (MessageBody) map.get(str);
                                b b2 = h.b(i, messageBody.conversation_id, messageBody.conversation_short_id.longValue(), messageBody.conversation_type.intValue(), messageBody.create_time.longValue());
                                if (b2 != null) {
                                    arrayList.add(b2);
                                }
                            }
                            com.bytedance.im.core.b.a.a.d.a();
                            com.bytedance.im.core.b.a.a.d.b("GetConversationInfoListHandler.createTempConversations");
                            return arrayList;
                        }
                    }, new com.bytedance.im.core.b.d.c<List<b>>() {
                        public final /* synthetic */ void a(Object obj) {
                            List list = (List) obj;
                            if (list != null && !list.isEmpty()) {
                                com.bytedance.im.core.d.d.a().a((b[]) list.toArray(new b[list.size()]));
                            }
                        }
                    });
                    return;
                }
                for (String str : map.keySet()) {
                    a.a(intValue, (MessageBody) map.get(str));
                }
                return;
            }
            return;
        }
        final HashSet hashSet = new HashSet();
        final f fVar2 = fVar;
        final int i = intValue;
        final HashSet hashSet2 = hashSet;
        AnonymousClass1 r0 = new com.bytedance.im.core.b.d.d<List<Pair<b, Boolean>>>() {
            public final /* synthetic */ Object a() {
                List<ConversationInfoV2> list = fVar2.g.body.get_conversation_info_list_v2_body.conversation_info_list;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (ConversationInfoV2 next : list) {
                    MessageBody messageBody = (MessageBody) map.get(next.conversation_id);
                    if (messageBody != null) {
                        Pair a2 = h.a(i, messageBody.create_time.longValue(), next);
                        if (!(a2 == null || a2.first == null)) {
                            arrayList.add(a2);
                            if (!(next.first_page_participants == null || next.first_page_participants.has_more == null || !next.first_page_participants.has_more.booleanValue())) {
                                hashSet2.add(next.conversation_id);
                            }
                        }
                    }
                }
                return arrayList;
            }
        };
        e.a(r0, new com.bytedance.im.core.b.d.c<List<Pair<b, Boolean>>>() {
            public final /* synthetic */ void a(Object obj) {
                List<Pair> list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Pair pair : list) {
                        arrayList.add(pair.first);
                        if (((Boolean) pair.second).booleanValue() && hashSet.contains(((b) pair.first).getConversationId())) {
                            new q().a(((b) pair.first).getConversationId(), (com.bytedance.im.core.b.c.e) null);
                        }
                    }
                    com.bytedance.im.core.d.d.a().a((b[]) arrayList.toArray(new b[arrayList.size()]));
                }
                d.a(fVar, true).b();
                a.a(intValue, 1);
            }
        });
    }
}
