package com.bytedance.im.core.b.e;

import android.text.TextUtils;
import com.bytedance.im.core.b.a.l;
import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.c.d;
import com.bytedance.im.core.d.c;
import com.bytedance.im.core.d.f;
import com.bytedance.im.core.d.m;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.p;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagePropertyContent;
import com.bytedance.im.core.proto.MessagePropertyType;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.SyncContent;
import com.bytedance.im.core.proto.SyncStatus;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    public static List<m> a(String str, List<Participant> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Participant next : list) {
            if (next.user_id != null) {
                m mVar = new m();
                mVar.setConversationId(str);
                mVar.setAlias(next.alias);
                if (next.role != null) {
                    mVar.setRole(next.role.intValue());
                }
                if (next.sort_order != null) {
                    mVar.setSortOrder(next.sort_order.longValue());
                }
                mVar.setUid(next.user_id.longValue());
                mVar.setSecUid(next.sec_uid);
                arrayList.add(mVar);
            }
        }
        return arrayList;
    }

    public static List<m> a(String str, List<Long> list, Map<Long, String> map, long j) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Long next : list) {
            if (next != null) {
                j++;
                m mVar = new m();
                mVar.setConversationId(str);
                mVar.setSortOrder(j);
                mVar.setUid(next.longValue());
                if (map != null) {
                    mVar.setSecUid(map.get(next));
                }
                arrayList.add(mVar);
            }
        }
        return arrayList;
    }

    public static Map<String, String> a(String str) {
        try {
            return (Map) c.f21187a.fromJson(str, new TypeToken<Map<String, String>>() {
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    public static String a(m mVar) {
        if (mVar == null) {
            return "";
        }
        try {
            return c.f21187a.toJson((Object) mVar);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() > 0) {
                    return c.f21187a.toJson((Object) map);
                }
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static m b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (m) c.f21187a.fromJson(str, m.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject b(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map == null || map.isEmpty()) {
            return jSONObject;
        }
        for (String next : map.keySet()) {
            try {
                jSONObject.put(next, map.get(next));
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    private static m a(String str, Participant participant) {
        if (participant == null || participant.user_id == null) {
            return null;
        }
        m mVar = new m();
        mVar.setConversationId(str);
        mVar.setUid(participant.user_id.longValue());
        mVar.setSecUid(participant.sec_uid);
        if (participant.role != null) {
            mVar.setRole(participant.role.intValue());
        }
        mVar.setAlias(participant.alias);
        if (participant.sort_order != null) {
            mVar.setSortOrder(participant.sort_order.longValue());
        }
        return mVar;
    }

    public static f a(f fVar, ConversationSettingInfo conversationSettingInfo) {
        int i;
        int i2;
        if (fVar == null) {
            fVar = new f();
            fVar.setConversationId(conversationSettingInfo.conversation_id);
        }
        if (conversationSettingInfo.setting_version != null && conversationSettingInfo.setting_version.longValue() >= fVar.getVersion()) {
            int i3 = 0;
            if (conversationSettingInfo.mute != null) {
                i = conversationSettingInfo.mute.intValue();
            } else {
                i = 0;
            }
            fVar.setMute(i);
            if (conversationSettingInfo.stick_on_top != null) {
                i2 = conversationSettingInfo.stick_on_top.intValue();
            } else {
                i2 = 0;
            }
            fVar.setStickTop(i2);
            fVar.setExt(conversationSettingInfo.ext);
            if (conversationSettingInfo.favorite != null) {
                i3 = conversationSettingInfo.favorite.intValue();
            }
            fVar.setFavor(i3);
            fVar.setVersion(conversationSettingInfo.setting_version.longValue());
        }
        return fVar;
    }

    public static p a(String str, MessageBody messageBody) {
        MessagePropertyContent messagePropertyContent;
        p pVar = new p();
        String str2 = messageBody.content;
        HashMap hashMap = null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            messagePropertyContent = (MessagePropertyContent) c.f21187a.fromJson(str2, MessagePropertyContent.class);
        } catch (Exception e2) {
            d.a(e2);
            messagePropertyContent = null;
        }
        if (messagePropertyContent == null || messagePropertyContent.type == null || messagePropertyContent.type.intValue() != MessagePropertyType.SYNC.getValue()) {
            return null;
        }
        pVar.setPropertyType(messagePropertyContent.type.intValue());
        SyncContent syncContent = messagePropertyContent.sync_content;
        if (syncContent == null || syncContent.status == null || syncContent.status.intValue() != SyncStatus.R_CLICK.getValue()) {
            return null;
        }
        pVar.setPropertyId(syncContent.status.intValue());
        pVar.setTargetUuid(syncContent.target_client_message_id);
        if (syncContent.target_message_id != null) {
            pVar.setTargetServerId(syncContent.target_message_id.longValue());
        }
        if (messagePropertyContent.index_in_message != null) {
            pVar.setIndex(messagePropertyContent.index_in_message.longValue());
            pVar.setOrderIndex(messagePropertyContent.index_in_message.longValue() * 1000);
        }
        if (messageBody.server_message_id != null) {
            pVar.setServerId(messageBody.server_message_id.longValue());
        }
        if (TextUtils.isEmpty(str)) {
            str = UUID.randomUUID().toString();
        }
        pVar.setUuid(str);
        if (messageBody.create_time != null) {
            pVar.setCreatedTime(messageBody.create_time.longValue());
        }
        if (messageBody.message_type != null) {
            pVar.setMsgType(messageBody.message_type.intValue());
        }
        pVar.setConversationId(messageBody.conversation_id);
        if (messageBody.sender != null) {
            pVar.setSender(messageBody.sender.longValue());
        }
        pVar.setContent(messageBody.content);
        int i = 0;
        pVar.setDeleted(0);
        pVar.setStatus(5);
        if (messageBody.status != null) {
            i = messageBody.status.intValue();
        }
        pVar.setNetStatus(i);
        if (messageBody.version != null) {
            pVar.setVersion(messageBody.version.longValue());
        }
        if (messageBody.ext != null) {
            hashMap = new HashMap(messageBody.ext);
        }
        pVar.setExt(hashMap);
        return pVar;
    }

    public static n a(String str, n nVar, MessageBody messageBody) {
        return a(str, nVar, messageBody, false);
    }

    public static c a(String str, c cVar, ConversationCoreInfo conversationCoreInfo) {
        long j;
        if (cVar == null) {
            cVar = new c();
            if (conversationCoreInfo.conversation_id != null) {
                str = conversationCoreInfo.conversation_id;
            }
            cVar.setConversationId(str);
        }
        if (conversationCoreInfo.info_version != null && conversationCoreInfo.info_version.longValue() >= cVar.getVersion()) {
            cVar.setName(conversationCoreInfo.name);
            cVar.setIcon(conversationCoreInfo.icon);
            cVar.setDesc(conversationCoreInfo.desc);
            cVar.setNotice(conversationCoreInfo.notice);
            cVar.setExt(conversationCoreInfo.ext);
            cVar.setVersion(conversationCoreInfo.info_version.longValue());
            if (conversationCoreInfo.owner != null) {
                j = conversationCoreInfo.owner.longValue();
            } else {
                j = -1;
            }
            cVar.setOwner(j);
            cVar.setSecOwner(conversationCoreInfo.sec_owner);
        }
        return cVar;
    }

    public static com.bytedance.im.core.d.b a(int i, com.bytedance.im.core.d.b bVar, ConversationInfoV2 conversationInfoV2, long j) {
        ConversationCoreInfo conversationCoreInfo = conversationInfoV2.conversation_core_info;
        ConversationSettingInfo conversationSettingInfo = conversationInfoV2.conversation_setting_info;
        if (bVar == null) {
            bVar = new com.bytedance.im.core.d.b();
            bVar.setConversationId(conversationInfoV2.conversation_id);
            if (conversationInfoV2.conversation_type != null) {
                bVar.setConversationType(conversationInfoV2.conversation_type.intValue());
            }
        }
        o.a();
        bVar.setLastMessage(o.g(conversationInfoV2.conversation_id));
        long updatedTime = bVar.getUpdatedTime();
        if (bVar.getLastMessage() != null) {
            j = bVar.getLastMessage().getCreatedAt();
        }
        bVar.setUpdatedTime(Math.max(updatedTime, j));
        bVar.setLastMessageIndex(o.a().f(conversationInfoV2.conversation_id));
        if (conversationInfoV2.conversation_short_id != null) {
            bVar.setConversationShortId(conversationInfoV2.conversation_short_id.longValue());
        }
        l.a();
        bVar.setMemberIds(l.a(conversationInfoV2.conversation_id));
        if (conversationInfoV2.participants_count != null) {
            bVar.setMemberCount(conversationInfoV2.participants_count.intValue());
        }
        if (!(conversationSettingInfo == null || conversationSettingInfo.min_index == null || conversationSettingInfo.min_index.longValue() <= bVar.getMinIndex())) {
            bVar.setMinIndex(conversationSettingInfo.min_index.longValue());
        }
        if (!(conversationSettingInfo == null || conversationSettingInfo.read_index == null || conversationSettingInfo.read_index.longValue() <= bVar.getReadIndex())) {
            bVar.setReadIndex(conversationSettingInfo.read_index.longValue());
        }
        if (bVar.getMinIndex() > 0) {
            o.a();
            o.a(conversationInfoV2.conversation_id, bVar.getMinIndex());
            if (bVar.getLastMessage() != null && bVar.getLastMessage().getIndex() <= bVar.getMinIndex() && bVar.getLastMessage().getIndex() > 0) {
                bVar.setLastMessage(null);
            }
        }
        if (!(conversationSettingInfo == null || conversationSettingInfo.read_index == null)) {
            o.a();
            bVar.setUnreadCount(o.a(conversationInfoV2.conversation_id, bVar.getReadIndex(), Long.MAX_VALUE, com.bytedance.im.core.a.c.a().f20879c.a()));
        }
        bVar.setInboxType(i);
        if (conversationCoreInfo != null) {
            bVar.setCoreInfo(a(conversationInfoV2.conversation_id, bVar.getCoreInfo(), conversationCoreInfo));
        }
        if (conversationSettingInfo != null) {
            bVar.setSettingInfo(a(bVar.getSettingInfo(), conversationSettingInfo));
        }
        if (!TextUtils.isEmpty(conversationInfoV2.ticket)) {
            bVar.setTicket(conversationInfoV2.ticket);
        }
        if (conversationInfoV2.is_participant != null) {
            bVar.setIsMember(conversationInfoV2.is_participant.booleanValue());
        }
        bVar.setMember(a(conversationInfoV2.conversation_id, conversationInfoV2.user_info));
        Map<String, String> localExt = bVar.getLocalExt();
        if (localExt != null && localExt.containsKey("s:conv_wait_info")) {
            localExt.remove("s:conv_wait_info");
            bVar.setLocalExt(localExt);
        }
        return bVar;
    }

    public static n a(String str, n nVar, MessageBody messageBody, boolean z) {
        HashMap hashMap;
        long j;
        int i = 0;
        if (nVar == null) {
            nVar = new n();
            if (messageBody.order_in_conversation != null) {
                j = messageBody.order_in_conversation.longValue();
            } else {
                j = 0;
            }
            nVar.setOrderIndex(j);
            nVar.setMsgId(messageBody.server_message_id.longValue());
            if (TextUtils.isEmpty(str)) {
                str = UUID.randomUUID().toString();
            }
            nVar.setUuid(str);
            if (messageBody.create_time != null) {
                nVar.setCreatedAt(messageBody.create_time.longValue());
            }
            nVar.setMsgType(messageBody.message_type.intValue());
            nVar.setConversationId(messageBody.conversation_id);
            nVar.setConversationType(messageBody.conversation_type.intValue());
            nVar.setSender(messageBody.sender.longValue());
            nVar.setContent(messageBody.content);
            nVar.setDeleted(0);
            nVar.setMsgStatus(5);
            if (com.bytedance.im.core.a.c.a().b().v) {
                nVar = a.b(nVar);
            }
        } else if (com.bytedance.im.core.a.c.a().b().u) {
            nVar.setMsgStatus(5);
        }
        if (!z && com.bytedance.im.core.a.c.a().b().y && messageBody.create_time != null) {
            nVar.setCreatedAt(messageBody.create_time.longValue());
        }
        nVar.setConversationShortId(messageBody.conversation_short_id.longValue());
        if (!z && messageBody.index_in_conversation != null) {
            nVar.setIndex(messageBody.index_in_conversation.longValue());
        }
        if (!z && messageBody.order_in_conversation != null && (nVar.getOrderIndex() < 10000 || com.bytedance.im.core.a.c.a().b().s == 1)) {
            nVar.setOrderIndex(messageBody.order_in_conversation.longValue());
        }
        if (messageBody.status != null) {
            i = messageBody.status.intValue();
        }
        nVar.setSvrStatus(i);
        if (messageBody.version != null) {
            nVar.setVersion(messageBody.version.longValue());
        }
        if (messageBody.ext == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(messageBody.ext);
        }
        nVar.setExt(hashMap);
        nVar.setReadStatus(true ^ f.a(nVar) ? 1 : 0);
        com.bytedance.im.core.a.b e2 = com.bytedance.im.core.a.c.a().f20879c.e();
        if (nVar.getSvrStatus() == 0 && e2 != null) {
            nVar.setSvrStatus(e2.a(nVar));
        }
        return nVar;
    }
}
