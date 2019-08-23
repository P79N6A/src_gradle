package com.bytedance.im.core.b.b.a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.l;
import com.bytedance.im.core.b.b.a;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.b;
import com.bytedance.im.core.b.e.i;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.im.core.proto.RequestBody;
import org.json.JSONObject;

public final class n extends l {

    /* renamed from: a  reason: collision with root package name */
    public int f21068a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21069b;

    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    public final void b() {
        a.f(this.f21068a);
        d.a().f();
        if (this.f21069b) {
            a.a();
            return;
        }
        m.a();
        m.a(this.f21068a);
        m.a();
        m.a(this.f21068a, 0);
    }

    public n(int i) {
        super(IMCMD.GET_MESSAGES_BY_USER_INIT_V2.getValue());
        this.f21068a = i;
    }

    public final void a(long j) {
        a(this.f21068a, new RequestBody.Builder().messages_per_user_init_v2_body(new MessagesPerUserInitV2RequestBody(Long.valueOf(j))).build(), null, new Object[0]);
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.messages_per_user_init_v2_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(final f fVar, Runnable runnable) {
        boolean z;
        long j;
        if (!fVar.g() || !a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            final MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody = fVar.g.body.messages_per_user_init_v2_body;
            if (i.a().a(this.f21068a) == -1) {
                i a2 = i.a();
                int i = this.f21068a;
                if (messagesPerUserInitV2ResponseBody.per_user_cursor != null) {
                    j = messagesPerUserInitV2ResponseBody.per_user_cursor.longValue();
                } else {
                    j = 0;
                }
                a2.a(i, j);
            }
            e.a(new com.bytedance.im.core.b.d.d<Pair<Long, Long>>() {
                public final /* synthetic */ Object a() {
                    return n.a(fVar.g.inbox_type.intValue(), messagesPerUserInitV2ResponseBody);
                }
            }, new c<Pair<Long, Long>>() {
                public final /* synthetic */ void a(Object obj) {
                    Pair pair = (Pair) obj;
                    com.bytedance.im.core.a.c.a();
                    ((Long) pair.first).longValue();
                    ((Long) pair.second).longValue();
                    if (!messagesPerUserInitV2ResponseBody.has_more.booleanValue() || messagesPerUserInitV2ResponseBody.next_cursor == null) {
                        i.a().f21240a.edit().putBoolean(i.a(n.this.f21068a, "im_init"), true).commit();
                        com.bytedance.im.core.a.c.a();
                        n.this.b();
                    } else {
                        i a2 = i.a();
                        int i = n.this.f21068a;
                        a2.f21240a.edit().putLong(i.a(i, "im_init_page_cursor"), messagesPerUserInitV2ResponseBody.next_cursor.longValue()).commit();
                        n.this.a(messagesPerUserInitV2ResponseBody.next_cursor.longValue());
                    }
                    if (com.bytedance.im.core.a.c.a().b().t == 1) {
                        a.a();
                    }
                    com.bytedance.im.core.c.d.a(fVar, true).b();
                }
            }, com.bytedance.im.core.b.d.a.c());
            return;
        }
        com.bytedance.im.core.a.c.a();
        b();
        com.bytedance.im.core.c.d.a(fVar, false).b();
    }

    public static Pair<Long, Long> a(int i, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
        long j;
        int i2;
        int i3 = i;
        MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody2 = messagesPerUserInitV2ResponseBody;
        com.bytedance.im.core.b.a.a.d.a();
        com.bytedance.im.core.b.a.a.d.a("IMInitHandler.doInit(int,ResponseBody)");
        long j2 = Long.MAX_VALUE;
        if (messagesPerUserInitV2ResponseBody2.messages != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            j = 0;
            for (MessageBody next : messagesPerUserInitV2ResponseBody2.messages) {
                if (u.a(next, true, 2) != null) {
                    a.a(i3, next);
                }
                if (next != null) {
                    j2 = Math.min(j2, next.create_time.longValue());
                    j = Math.max(j, next.create_time.longValue());
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                jSONObject.put("msg_count", messagesPerUserInitV2ResponseBody2.messages.size());
                jSONObject.put("msg_source", 2);
                com.bytedance.im.core.c.d.a("im_save_msg_list_duration", jSONObject, (JSONObject) null);
            } catch (Exception unused) {
            }
        } else {
            j = 0;
        }
        if (messagesPerUserInitV2ResponseBody2.conversations != null) {
            for (ConversationInfoV2 next2 : messagesPerUserInitV2ResponseBody2.conversations) {
                l.a();
                String str = next2.conversation_id;
                if (next2.conversation_type == null) {
                    i2 = -1;
                } else {
                    i2 = next2.conversation_type.intValue();
                }
                l.b(str, i2, b.a(next2.conversation_id, next2.first_page_participants.participants));
                com.bytedance.im.core.d.b a2 = b.a(i3, (com.bytedance.im.core.d.b) null, next2, 0);
                k.a();
                k.a(a2);
                a.a(i3, next2.conversation_id);
                if (next2.first_page_participants.has_more != null && next2.first_page_participants.has_more.booleanValue()) {
                    String str2 = next2.conversation_id;
                    if (!TextUtils.isEmpty(str2)) {
                        a.g.add(str2);
                    }
                }
            }
        }
        com.bytedance.im.core.b.a.a.d.a();
        com.bytedance.im.core.b.a.a.d.b("IMInitHandler.doInit(int,ResponseBody)");
        return new Pair<>(Long.valueOf(j2), Long.valueOf(j));
    }
}
