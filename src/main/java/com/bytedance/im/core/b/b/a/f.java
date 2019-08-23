package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.b.b.a;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.RequestBody;

public final class f extends l<String> {
    /* access modifiers changed from: protected */
    public final boolean a(com.bytedance.im.core.b.c.f fVar) {
        return true;
    }

    public f() {
        super(IMCMD.MARK_CONVERSATION_DELETE.getValue());
    }

    /* access modifiers changed from: protected */
    public final void a(com.bytedance.im.core.b.c.f fVar, Runnable runnable) {
        runnable.run();
    }

    public final void a(int i, String str, long j, int i2, long j2) {
        a.a(i, str);
        a(i, new RequestBody.Builder().delete_conversation_body(new DeleteConversationRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).last_message_index(Long.valueOf(j2)).build()).build(), null, new Object[0]);
    }
}
