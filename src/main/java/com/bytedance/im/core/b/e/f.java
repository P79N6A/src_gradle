package com.bytedance.im.core.b.e;

import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class f {
    public static boolean b(MessageBody messageBody) {
        if (messageBody == null) {
            return false;
        }
        MessageType fromValue = MessageType.fromValue(messageBody.message_type.intValue());
        if (fromValue != null && fromValue == MessageType.MESSAGE_TYPE_MESSAGE_PROPERTY) {
            return true;
        }
        return false;
    }

    public static long b(n nVar) {
        if (nVar == null) {
            return -1;
        }
        Map<String, String> ext = nVar.getExt();
        if (ext == null || !ext.containsKey("s:do_not_pop_conversation") || !"true".equals(ext.get("s:do_not_pop_conversation"))) {
            return nVar.getCreatedAt();
        }
        return -1;
    }

    public static boolean a(n nVar) {
        if (nVar == null || nVar.getSvrStatus() != 0) {
            return false;
        }
        Map<String, String> ext = nVar.getExt();
        if (ext != null && ext.containsKey("s:do_not_increase_unread") && "true".equals(ext.get("s:do_not_increase_unread"))) {
            return false;
        }
        k.a();
        b a2 = k.a(nVar.getConversationId());
        boolean e2 = d.a().e(nVar.getConversationId());
        c.a();
        if (a2 != null) {
            long readIndex = a2.getReadIndex();
            if (e2 || nVar.isSelf() || nVar.getIndex() <= readIndex) {
                return false;
            }
            return true;
        } else if (e2 || nVar.isSelf()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(MessageBody messageBody) {
        if (messageBody == null) {
            return false;
        }
        if (messageBody.message_type.intValue() == 50010) {
            return true;
        }
        MessageType fromValue = MessageType.fromValue(messageBody.message_type.intValue());
        if (fromValue != null) {
            switch (fromValue) {
                case MESSAGE_TYPE_NOT_USED:
                    return false;
                case MESSAGE_TYPE_COMMAND:
                case MESSAGE_TYPE_UPDATE_MESSAGE:
                case MESSAGE_TYPE_CONVERSATION_DESTROY:
                case MESSAGE_TYPE_MESSAGE_PROPERTY:
                    return true;
            }
        }
        if (messageBody.message_type.intValue() < MessageType.MESSAGE_TYPE_COMMAND.getValue()) {
            return true;
        }
        return false;
    }

    public static List<n> a(String str, List<n> list) {
        if (list == null || list.isEmpty() || d.a().e(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (n next : list) {
            if (!next.isSelf()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
