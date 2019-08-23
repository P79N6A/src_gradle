package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.n;
import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.b.d.d;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MarkConversationReadNotify;
import com.bytedance.im.core.proto.ResponseBody;

public final class t extends b {
    t() {
        super(IMCMD.MARK_READ_NOTIFY.getValue());
    }

    /* access modifiers changed from: protected */
    public final void a(int i, ResponseBody responseBody) {
        final MarkConversationReadNotify markConversationReadNotify = responseBody.mark_conversation_read_notify;
        e.a(new d<b>() {
            public final /* synthetic */ Object a() {
                long j;
                k.a();
                b a2 = k.a(markConversationReadNotify.conversation_id);
                if (a2 != null && markConversationReadNotify.read_index.longValue() > a2.getReadIndex()) {
                    long unreadCount = a2.getUnreadCount();
                    o.a();
                    long a3 = unreadCount - o.a(a2.getConversationId(), a2.getReadIndex(), markConversationReadNotify.read_index.longValue(), c.a().f20879c.a());
                    if (a3 >= 0) {
                        j = a3;
                    } else {
                        j = 0;
                    }
                    a2.setUnreadCount(j);
                    a2.setReadIndex(markConversationReadNotify.read_index.longValue());
                    if (a3 <= 0) {
                        n.a();
                        n.b(markConversationReadNotify.conversation_id);
                        a2.setMentionMessages(null);
                    } else {
                        n.a();
                        a2.setMentionMessages(n.a(markConversationReadNotify.conversation_id, markConversationReadNotify.read_index.longValue()));
                    }
                    k.a();
                    if (k.b(a2)) {
                        return a2;
                    }
                }
                return null;
            }
        }, new com.bytedance.im.core.b.d.c<b>() {
            public final /* synthetic */ void a(Object obj) {
                b bVar = (b) obj;
                if (bVar != null) {
                    com.bytedance.im.core.d.d.a().b(bVar);
                }
            }
        });
    }
}
