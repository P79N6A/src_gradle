package com.bytedance.im.core.b.b.a;

import android.text.TextUtils;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.RequestBody;

public final class g extends l<n> {
    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        return true;
    }

    public g() {
        super(IMCMD.DELETE_MESSAGE.getValue());
    }

    public g(b<n> bVar) {
        super(IMCMD.DELETE_MESSAGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        runnable.run();
    }

    public final void a(final n nVar, boolean z) {
        final String uuid = nVar.getUuid();
        final String conversationId = nVar.getConversationId();
        if (!TextUtils.isEmpty(uuid) && !TextUtils.isEmpty(conversationId)) {
            com.bytedance.im.core.d.b a2 = d.a().a(conversationId);
            if (a2 != null && nVar.getMsgId() > 0 && !z) {
                a(a2.getInboxType(), conversationId, nVar.getConversationShortId(), nVar.getConversationType(), nVar.getMsgId());
            }
            e.a(new com.bytedance.im.core.b.d.d<com.bytedance.im.core.d.b>() {
                public final /* synthetic */ Object a() {
                    o.a();
                    boolean a2 = o.a(uuid);
                    com.bytedance.im.core.d.b a3 = d.a().a(conversationId);
                    if (!a2 || a3 == null || ((a3.getLastMessage() == null || !uuid.equals(a3.getLastMessage().getUuid())) && !nVar.isMention())) {
                        return null;
                    }
                    k.a();
                    return k.a(conversationId);
                }
            }, new c<com.bytedance.im.core.d.b>() {
                public final /* synthetic */ void a(Object obj) {
                    com.bytedance.im.core.d.b bVar = (com.bytedance.im.core.d.b) obj;
                    if (bVar != null) {
                        d.a().b(bVar);
                        g.this.a(nVar);
                        return;
                    }
                    g.this.b(f.a(-3001));
                }
            });
            com.bytedance.im.core.b.e.g.a().a(nVar);
        }
    }

    private void a(int i, String str, long j, int i2, long j2) {
        a(i, new RequestBody.Builder().delete_message_body(new DeleteMessageRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).message_id(Long.valueOf(j2)).build()).build(), null, new Object[0]);
    }
}
