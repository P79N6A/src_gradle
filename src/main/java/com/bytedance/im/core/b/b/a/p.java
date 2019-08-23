package com.bytedance.im.core.b.b.a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.a;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.c.d;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class p extends l {
    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    p() {
        super(IMCMD.GET_MESSAGES_BY_CONVERSATION.getValue());
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.messages_in_conversation_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        if (!fVar.g() || !a(fVar)) {
            d.a(fVar, false).b();
            return;
        }
        final String str = (String) fVar.f21166e[0];
        MessagesInConversationResponseBody messagesInConversationResponseBody = fVar.g.body.messages_in_conversation_body;
        final List<MessageBody> list = messagesInConversationResponseBody.messages;
        final boolean booleanValue = messagesInConversationResponseBody.has_more.booleanValue();
        e.a(new com.bytedance.im.core.b.d.d<List<n>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public List<n> a() {
                int i;
                com.bytedance.im.core.b.a.a.d.a();
                com.bytedance.im.core.b.a.a.d.a("LoadHistoryHandler.saveMsg(String,List,boolean)");
                ArrayList arrayList = new ArrayList();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (list != null) {
                    for (MessageBody a2 : list) {
                        Pair<n, Boolean> a3 = u.a(a2, true, 1);
                        if (!(a3 == null || a3.first == null)) {
                            arrayList.add(a3.first);
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = 0;
                    }
                    jSONObject.put("msg_count", i);
                    jSONObject.put("msg_source", 1);
                    d.a("im_save_msg_list_duration", jSONObject, (JSONObject) null);
                } catch (Exception unused) {
                }
                if (!booleanValue) {
                    u.a(str);
                }
                com.bytedance.im.core.b.a.a.d.a();
                com.bytedance.im.core.b.a.a.d.b("LoadHistoryHandler.saveMsg(String,List,boolean)");
                Collections.sort(arrayList);
                return arrayList;
            }
        }, new c<List<n>>() {
            public final /* synthetic */ void a(Object obj) {
                g.a().b(str, (List) obj);
            }
        }, a.c());
        d.a(fVar, true).b();
    }
}
