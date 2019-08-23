package com.ss.android.ugc.aweme.im.sdk.module.session;

import android.text.TextUtils;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.m;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseVideoRedEnvelopeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommonRedEnvelopeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.c;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.d;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.an;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51885a;

    public static com.ss.android.ugc.aweme.im.service.session.a a(b bVar) {
        b bVar2 = bVar;
        if (!PatchProxy.isSupport(new Object[]{bVar2}, null, f51885a, true, 52378, new Class[]{b.class}, com.ss.android.ugc.aweme.im.service.session.a.class)) {
            return a(bVar2, false);
        }
        return (com.ss.android.ugc.aweme.im.service.session.a) PatchProxy.accessDispatch(new Object[]{bVar2}, null, f51885a, true, 52378, new Class[]{b.class}, com.ss.android.ugc.aweme.im.service.session.a.class);
    }

    private static com.ss.android.ugc.aweme.im.service.session.a a(b bVar, boolean z) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, (byte) 0}, null, f51885a, true, 52379, new Class[]{b.class, Boolean.TYPE}, com.ss.android.ugc.aweme.im.service.session.a.class)) {
            return (com.ss.android.ugc.aweme.im.service.session.a) PatchProxy.accessDispatch(new Object[]{bVar2, (byte) 0}, null, f51885a, true, 52379, new Class[]{b.class, Boolean.TYPE}, com.ss.android.ugc.aweme.im.service.session.a.class);
        } else if (bVar2 == null) {
            return null;
        } else {
            if (bVar.isSingleChat()) {
                return b(bVar2, false);
            }
            if (bVar.isGroupChat()) {
                return c(bVar2, false);
            }
            return null;
        }
    }

    private static String a(BaseContent baseContent, n nVar) {
        BaseContent baseContent2 = baseContent;
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{baseContent2, nVar2}, null, f51885a, true, 52381, new Class[]{BaseContent.class, n.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{baseContent2, nVar2}, null, f51885a, true, 52381, new Class[]{BaseContent.class, n.class}, String.class);
        } else if (baseContent2 instanceof StoryReplyContent) {
            return StoryReplyContent.wrapMessageHint(nVar2, baseContent.getMsgHint());
        } else {
            if ((baseContent2 instanceof CommonRedEnvelopeContent) || (baseContent2 instanceof BaseVideoRedEnvelopeContent)) {
                return com.ss.android.ugc.aweme.im.sdk.chat.c.b.a(nVar2, baseContent.getMsgHint());
            }
            return baseContent.getMsgHint();
        }
    }

    private static com.ss.android.ugc.aweme.im.service.session.a b(b bVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{bVar, Byte.valueOf(z ? (byte) 1 : 0)}, null, f51885a, true, 52380, new Class[]{b.class, Boolean.TYPE}, com.ss.android.ugc.aweme.im.service.session.a.class)) {
            return (com.ss.android.ugc.aweme.im.service.session.a) PatchProxy.accessDispatch(new Object[]{bVar, Byte.valueOf(z)}, null, f51885a, true, 52380, new Class[]{b.class, Boolean.TYPE}, com.ss.android.ugc.aweme.im.service.session.a.class);
        }
        n lastMessage = bVar.getLastMessage();
        if (lastMessage == null || e.a(bVar.getConversationId()) <= 0) {
            return null;
        }
        com.ss.android.ugc.aweme.im.sdk.module.session.a.a aVar = new com.ss.android.ugc.aweme.im.sdk.module.session.a.a();
        aVar.h = bVar.getConversationId();
        if (!z) {
            aVar.o = an.a(bVar);
        }
        aVar.m = (int) bVar.getUnreadCount();
        long createdAt = lastMessage.getCreatedAt();
        if (!z && bVar.isStickTop()) {
            createdAt = Math.max(createdAt, bVar.getUpdatedTime());
        }
        aVar.a(createdAt);
        if (13 == lastMessage.getMsgType()) {
            aVar.f51917c = d.a.SUCCESS;
        } else {
            aVar.f51917c = d.a(lastMessage.getMsgStatus());
        }
        BaseContent content = m.content(lastMessage);
        if (content != null) {
            aVar.k = a(content, lastMessage);
        }
        if (lastMessage.getMsgType() == 7 || lastMessage.getMsgType() == 52) {
            aVar.t = true;
        }
        return aVar;
    }

    private static String b(BaseContent baseContent, n nVar) {
        BaseContent baseContent2 = baseContent;
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{baseContent2, nVar2}, null, f51885a, true, 52383, new Class[]{BaseContent.class, n.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{baseContent2, nVar2}, null, f51885a, true, 52383, new Class[]{BaseContent.class, n.class}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (nVar.isRecalled()) {
            IMUser a2 = com.ss.android.ugc.aweme.im.sdk.d.e.a().a(nVar.getExt().get("s:recall_uid"));
            if (!nVar.isSelf() && a2 != null) {
                sb.append(a2.getDisplayName());
                sb.append(": ");
            }
            if (ad.g(nVar)) {
                sb.append(GlobalContext.getContext().getResources().getString(C0906R.string.auw));
            } else if (nVar.isSelf()) {
                sb.append(baseContent.getMsgHint());
            } else {
                sb.append(GlobalContext.getContext().getResources().getString(C0906R.string.av0));
            }
        } else {
            IMUser a3 = com.ss.android.ugc.aweme.im.sdk.d.e.a().a(String.valueOf(nVar.getSender()));
            if (!(nVar.isSelf() || a3 == null || nVar.getMsgType() == 1002 || nVar.getMsgType() == 1001)) {
                sb.append(a3.getDisplayName());
                sb.append(": ");
            }
            if (baseContent2 instanceof StoryReplyContent) {
                sb.append(StoryReplyContent.wrapMessageHint(nVar2, baseContent.getMsgHint()));
            } else if ((baseContent2 instanceof CommonRedEnvelopeContent) || (baseContent2 instanceof BaseVideoRedEnvelopeContent)) {
                sb.append(com.ss.android.ugc.aweme.im.sdk.chat.c.b.a(nVar2, baseContent.getMsgHint()));
            } else {
                sb.append(baseContent.getMsgHint());
            }
        }
        return sb.toString();
    }

    private static com.ss.android.ugc.aweme.im.service.session.a c(b bVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{bVar, Byte.valueOf(z ? (byte) 1 : 0)}, null, f51885a, true, 52382, new Class[]{b.class, Boolean.TYPE}, com.ss.android.ugc.aweme.im.service.session.a.class)) {
            return (com.ss.android.ugc.aweme.im.service.session.a) PatchProxy.accessDispatch(new Object[]{bVar, Byte.valueOf(z)}, null, f51885a, true, 52382, new Class[]{b.class, Boolean.TYPE}, com.ss.android.ugc.aweme.im.service.session.a.class);
        }
        n lastMessage = bVar.getLastMessage();
        String str = null;
        if (lastMessage == null) {
            return null;
        }
        c cVar = new c();
        cVar.h = bVar.getConversationId();
        if (!z) {
            cVar.o = an.a(bVar);
        }
        cVar.m = (int) bVar.getUnreadCount();
        long createdAt = lastMessage.getCreatedAt();
        if (!z && bVar.isStickTop()) {
            createdAt = Math.max(createdAt, bVar.getUpdatedTime());
        }
        cVar.a(createdAt);
        if (bVar.getCoreInfo() != null) {
            str = bVar.getCoreInfo().getIcon();
        }
        cVar.i = str;
        if (13 == lastMessage.getMsgType()) {
            cVar.f51917c = d.a.SUCCESS;
        } else {
            cVar.f51917c = d.a(lastMessage.getMsgStatus());
        }
        BaseContent content = m.content(lastMessage);
        if (content != null) {
            cVar.k = b(content, lastMessage);
        }
        if (lastMessage.getMsgType() == 7 || lastMessage.getMsgType() == 52) {
            cVar.t = true;
        }
        if (lastMessage.getMsgType() == 1001 && content != null) {
            Map ext = lastMessage.getExt();
            if (ext == null) {
                ext = new HashMap();
            }
            if (!ext.containsKey("group_notice_show")) {
                ext.put("group_notice_show", "show");
                lastMessage.setExt(ext);
                lastMessage.setContent(l.a(content));
                ad.a(lastMessage);
            }
        }
        if (bVar.getCoreInfo() == null || TextUtils.isEmpty(bVar.getCoreInfo().getName())) {
            cVar.j = GlobalContext.getContext().getString(C0906R.string.as8);
        } else {
            cVar.j = bVar.getCoreInfo().getName();
        }
        return cVar;
    }
}
