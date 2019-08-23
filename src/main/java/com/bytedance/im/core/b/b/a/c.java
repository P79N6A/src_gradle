package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody;
import java.util.List;

public final class c extends l {
    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    public c(b<int[]> bVar) {
        super(IMCMD.CHECK_MESSAGES_BY_USER.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.check_messages_per_user_body == null) {
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
        int[] iArr = (int[]) fVar.f21166e[0];
        if (z) {
            CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody = fVar.g.body.check_messages_per_user_body;
            if (checkMessagesPerUserResponseBody == null) {
                b(fVar);
                return;
            }
            List<InboxMessagesPerUserResponseBody> list = checkMessagesPerUserResponseBody.messages;
            if (list == null || list.isEmpty()) {
                b(fVar);
            } else if (iArr == null || iArr.length == 0) {
                b(fVar);
            } else {
                for (InboxMessagesPerUserResponseBody next : list) {
                    if (next != null) {
                        Integer num = next.inbox_type;
                        Boolean bool = next.has_more;
                        if (!(num == null || bool == null)) {
                            for (int i = 0; i < iArr.length; i++) {
                                if (iArr[i] == num.intValue() && !bool.booleanValue()) {
                                    iArr[i] = -1;
                                }
                            }
                        }
                    }
                }
                a(iArr);
            }
        } else {
            b(fVar);
        }
    }
}
