package com.ss.android.ugc.aweme.im.sdk.model;

import android.text.TextUtils;
import com.crashlytics.android.Crashlytics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.m;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.g;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51827a;

    public static List<g> a(List<StrangerMsgSession> list) {
        g gVar;
        if (PatchProxy.isSupport(new Object[]{list}, null, f51827a, true, 52363, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, null, f51827a, true, 52363, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (StrangerMsgSession next : list) {
                StrangerMessage lastMsg = next.getLastMsg();
                int unreadCount = next.getUnreadCount();
                if (PatchProxy.isSupport(new Object[]{lastMsg, Integer.valueOf(unreadCount)}, null, g.f51924e, true, 52489, new Class[]{StrangerMessage.class, Integer.TYPE}, g.class)) {
                    gVar = (g) PatchProxy.accessDispatch(new Object[]{lastMsg, Integer.valueOf(unreadCount)}, null, g.f51924e, true, 52489, new Class[]{StrangerMessage.class, Integer.TYPE}, g.class);
                } else {
                    g gVar2 = new g();
                    gVar2.i = lastMsg.getFromUser().getAvatarThumb();
                    gVar2.k = m.content(lastMsg.getMsgType(), lastMsg.getContent(), lastMsg.isRecalled(), Long.valueOf(lastMsg.getFromUser().getUid()).longValue()).getMsgHint();
                    gVar2.j = lastMsg.getFromUser().getNickName();
                    String uid = lastMsg.getFromUser().getUid();
                    if (TextUtils.isEmpty(uid)) {
                        Crashlytics.log("StrangerSession convert strangerSessionId:" + uid);
                    }
                    gVar2.h = uid;
                    gVar2.a(lastMsg.getCreateTime());
                    gVar2.f51925f = lastMsg.getFromUser();
                    gVar2.m = unreadCount;
                    gVar = gVar2;
                }
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }
}
