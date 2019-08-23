package com.ss.android.ugc.aweme.im.sdk.providedservices;

import a.i;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.m;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommandShareContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.net.s;
import com.ss.android.ugc.aweme.im.sdk.chat.net.x;
import com.ss.android.ugc.aweme.im.sdk.comment.ImCommentReplyDialog;
import com.ss.android.ugc.aweme.im.sdk.d.c;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.d.h;
import com.ss.android.ugc.aweme.im.sdk.d.j;
import com.ss.android.ugc.aweme.im.sdk.d.k;
import com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog;
import com.ss.android.ugc.aweme.im.sdk.model.UserStruct;
import com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity;
import com.ss.android.ugc.aweme.im.sdk.module.session.SessionListFragment;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.f;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.g;
import com.ss.android.ugc.aweme.im.sdk.module.stranger.b;
import com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity;
import com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectFragment;
import com.ss.android.ugc.aweme.im.sdk.share.b;
import com.ss.android.ugc.aweme.im.sdk.story.c;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.ba;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.o;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.b;
import com.ss.android.ugc.aweme.im.service.b.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public class IMService implements IIMService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static IIMService inst;
    private b abInterface;
    private a inputMenuCustomizer;
    private int xplanStyle;

    public b getAbInterface() {
        return this.abInterface;
    }

    public a getInputMenuCustomizer() {
        return this.inputMenuCustomizer;
    }

    public Class getSessionListActivityClass() {
        return SessionListActivity.class;
    }

    public boolean isXPlanB() {
        if (this.xplanStyle <= 0 || this.xplanStyle >= 1001) {
            return false;
        }
        return true;
    }

    public static IIMService get() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 52557, new Class[0], IIMService.class)) {
            return (IIMService) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 52557, new Class[0], IIMService.class);
        }
        return (IIMService) com.ss.android.ugc.aweme.im.sdk.g.a.a(IIMService.class);
    }

    public boolean clearAudioDownloadCache() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52586, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.im.sdk.chat.net.a.a().b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52586, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void fetchFollowList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52606, new Class[0], Void.TYPE);
            return;
        }
        if (d.a()) {
            Runnable a2 = c.a();
            if (a2 != null) {
                com.ss.android.b.a.a.a.a(a2);
            }
        }
    }

    public void forceRefreshSessionList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52605, new Class[0], Void.TYPE);
            return;
        }
        k.a().f();
    }

    public File getAudioDownloadCachePath() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52585, new Class[0], File.class)) {
            return com.ss.android.ugc.aweme.im.sdk.chat.net.a.a().c();
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52585, new Class[0], File.class);
    }

    public com.ss.android.websocket.b.c.b getImParser() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52579, new Class[0], com.ss.android.websocket.b.c.b.class)) {
            return new com.ss.android.ugc.aweme.im.sdk.j.b();
        }
        return (com.ss.android.websocket.b.c.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52579, new Class[0], com.ss.android.websocket.b.c.b.class);
    }

    public com.ss.android.ugc.aweme.im.service.c.a getRelationSelectFragment() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52563, new Class[0], com.ss.android.ugc.aweme.im.service.c.a.class)) {
            return (com.ss.android.ugc.aweme.im.service.c.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52563, new Class[0], com.ss.android.ugc.aweme.im.service.c.a.class);
        }
        RelationSelectFragment relationSelectFragment = new RelationSelectFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_no_title", Boolean.TRUE);
        relationSelectFragment.setArguments(bundle);
        return relationSelectFragment;
    }

    public boolean isXPlanOpen() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52604, new Class[0], Boolean.TYPE)) {
            return isXPlanB();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52604, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void resetLoginState() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52560, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.d.a.a().d();
        h.b().a();
    }

    public boolean canFetchFollowListIdle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52607, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52607, new Class[0], Boolean.TYPE)).booleanValue();
        }
        o a2 = o.a();
        if (PatchProxy.isSupport(new Object[0], a2, o.f52605a, false, 53444, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, o.f52605a, false, 53444, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (a2.f52608b.getLong("follow_list_fetch_time", 0) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public List<IMUser> getAllFollowIMUsers() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52625, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52625, new Class[0], List.class);
        }
        e a2 = e.a();
        if (!PatchProxy.isSupport(new Object[0], a2, e.f51217a, false, 51737, new Class[0], List.class)) {
            return com.ss.android.ugc.aweme.im.sdk.h.c.a.a().c(com.ss.android.ugc.aweme.im.sdk.h.c.a.e());
        }
        return (List) PatchProxy.accessDispatch(new Object[0], a2, e.f51217a, false, 51737, new Class[0], List.class);
    }

    public List<IMUser> getAllFriends() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52626, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52626, new Class[0], List.class);
        }
        e a2 = e.a();
        if (!PatchProxy.isSupport(new Object[0], a2, e.f51217a, false, 51738, new Class[0], List.class)) {
            return com.ss.android.ugc.aweme.im.sdk.h.c.a.a().c(com.ss.android.ugc.aweme.im.sdk.h.c.a.d());
        }
        return (List) PatchProxy.accessDispatch(new Object[0], a2, e.f51217a, false, 51738, new Class[0], List.class);
    }

    public com.ss.android.ugc.aweme.im.service.c.a getSessionListFragment() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52561, new Class[0], com.ss.android.ugc.aweme.im.service.c.a.class)) {
            return (com.ss.android.ugc.aweme.im.service.c.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52561, new Class[0], com.ss.android.ugc.aweme.im.service.c.a.class);
        }
        if (com.ss.android.ugc.aweme.im.sdk.d.a.a().e() != null) {
            i = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getXPlanStyle();
        }
        this.xplanStyle = i;
        return new SessionListFragment();
    }

    public List<IMUser> getRecentIMUsers() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52627, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52627, new Class[0], List.class);
        }
        e a2 = e.a();
        if (PatchProxy.isSupport(new Object[0], a2, e.f51217a, false, 51739, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], a2, e.f51217a, false, 51739, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        List<com.bytedance.im.core.d.b> b2 = com.bytedance.im.core.d.d.a().b();
        if (b2 != null) {
            Iterator<com.bytedance.im.core.d.b> it2 = b2.iterator();
            while (it2.hasNext()) {
                com.bytedance.im.core.d.b next = it2.next();
                n lastMessage = next.getLastMessage();
                long a3 = com.bytedance.im.core.d.e.a(next.getConversationId());
                if (next.getConversationType() != d.a.f20886a || lastMessage == null || lastMessage.getMsgType() == 15 || a3 <= 0) {
                    it2.remove();
                }
            }
            if (b2.size() > 10) {
                b2 = b2.subList(0, 10);
            }
            for (com.bytedance.im.core.d.b conversationId : b2) {
                IMUser b3 = a2.b(String.valueOf(com.bytedance.im.core.d.e.a(conversationId.getConversationId())));
                if (b3 != null) {
                    b3.setType(1);
                    arrayList.add(b3);
                }
            }
        }
        return arrayList;
    }

    public void refreshLoginState() {
        long j;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52559, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.d.a a2 = com.ss.android.ugc.aweme.im.sdk.d.a.a();
        if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.im.sdk.d.a.f3370a, false, 51695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.im.sdk.d.a.f3370a, false, 51695, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.im.core.b.e.k.a();
        if (com.ss.android.ugc.aweme.im.sdk.utils.d.a()) {
            long d2 = com.ss.android.ugc.aweme.im.sdk.utils.d.d();
            o a3 = o.a();
            if (PatchProxy.isSupport(new Object[0], a3, o.f52605a, false, 53434, new Class[0], Long.TYPE)) {
                j = ((Long) PatchProxy.accessDispatch(new Object[0], a3, o.f52605a, false, 53434, new Class[0], Long.TYPE)).longValue();
            } else {
                j = a3.f52609c.getLong("userid", -1);
            }
            if (d2 != j) {
                z = true;
            } else {
                z = false;
            }
            o a4 = o.a();
            if (PatchProxy.isSupport(new Object[]{new Long(d2)}, a4, o.f52605a, false, 53433, new Class[]{Long.TYPE}, Void.TYPE)) {
                o oVar = a4;
                PatchProxy.accessDispatch(new Object[]{new Long(d2)}, oVar, o.f52605a, false, 53433, new Class[]{Long.TYPE}, Void.TYPE);
            } else {
                a4.f52609c.edit().putLong("userid", d2).commit();
            }
            Runnable a5 = c.a(z);
            if (a5 != null) {
                com.ss.android.b.a.a.a.a(a5);
            }
            if (a2.e().showNewStyle()) {
                com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a().b();
            }
            h.b().a();
            return;
        }
        a2.d();
        if (a2.e().showNewStyle()) {
            com.ss.android.ugc.aweme.im.sdk.feedupdate.a a6 = com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a();
            if (PatchProxy.isSupport(new Object[0], a6, com.ss.android.ugc.aweme.im.sdk.feedupdate.a.f51460a, false, 52074, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a6, com.ss.android.ugc.aweme.im.sdk.feedupdate.a.f51460a, false, 52074, new Class[0], Void.TYPE);
            } else {
                a6.f51462b.clear();
                a6.f51463c = false;
            }
        }
        e a7 = e.a();
        if (PatchProxy.isSupport(new Object[0], a7, e.f51217a, false, 51732, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a7, e.f51217a, false, 51732, new Class[0], Void.TYPE);
            return;
        }
        a7.f51219b.evictAll();
    }

    public void setAbInterface(b bVar) {
        this.abInterface = bVar;
    }

    public void setInputMenuCustomizer(a aVar) {
        this.inputMenuCustomizer = aVar;
    }

    static final /* synthetic */ Void lambda$addGroupByPassword$0$IMService(String str) throws Exception {
        Activity a2 = com.ss.android.ugc.aweme.framework.core.a.b().a();
        if (a2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        new GroupInviteDialog(a2, str, 1).show();
        return null;
    }

    public void cleanUpdateTagCount(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 52603, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 52603, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a().b(str2);
    }

    public void deleteIMUser(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 52623, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 52623, new Class[]{String.class}, Void.TYPE);
            return;
        }
        e.a().c(str2);
    }

    public boolean isXInstalled(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 52600, new Class[]{Context.class}, Boolean.TYPE)) {
            return bc.a(context);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 52600, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    public void updateNoticeSession(com.ss.android.ugc.aweme.im.service.session.a aVar) {
        com.ss.android.ugc.aweme.im.service.session.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 52577, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 52577, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE);
            return;
        }
        k.a().a(aVar2);
    }

    private static boolean isExistHistoryMsg(IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, null, changeQuickRedirect, true, 52582, new Class[]{IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMUser}, null, changeQuickRedirect, true, 52582, new Class[]{IMUser.class}, Boolean.TYPE)).booleanValue();
        }
        com.bytedance.im.core.d.b a2 = com.bytedance.im.core.d.d.a().a(com.bytedance.im.core.d.e.a(Long.parseLong(iMUser.getUid())));
        if (a2 == null) {
            return false;
        }
        if (a2.getLastMessage() == null && iMUser.getFollowStatus() == 0 && (iMUser.getType() == 4 || iMUser.getType() == -1)) {
            return false;
        }
        return true;
    }

    private void onFlipChatUnreadConfigUpdate(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 52614, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 52614, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        long j = bundle2.getLong("flip_chat_msg_last_unread_time");
        long j2 = bundle2.getLong("flip_chat_msg_last_unread_dot_time");
        if (j <= o.a().h()) {
            bundle2.putLong("flip_chat_msg_unread_count", 0);
        }
        if (j2 <= o.a().i()) {
            bundle2.putLong("flip_chat_msg_unread_dot_count", 0);
        }
    }

    public void addGroupByPassword(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 52622, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 52622, new Class[]{String.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new IMService$$Lambda$0<TResult>(str2), i.f1052b);
    }

    public void cleanFeedUpdateCount(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 52584, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 52584, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a().b(str2);
        }
    }

    public void deleteNoticeSession(com.ss.android.ugc.aweme.im.service.session.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 52578, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 52578, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE);
            return;
        }
        k a2 = k.a();
        if (PatchProxy.isSupport(new Object[]{aVar}, a2, k.f51273a, false, 51806, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, a2, k.f51273a, false, 51806, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE);
            return;
        }
        a2.f51276d.remove(aVar.O_());
        a2.i.sendEmptyMessage(2);
    }

    public boolean exitUser(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 52581, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 52581, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (e.a().b(str2) != null) {
            return true;
        } else {
            return false;
        }
    }

    public String getConversationId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 52609, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 52609, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            com.ss.android.ugc.aweme.im.sdk.d.a.a().f();
            return com.bytedance.im.core.d.e.a(Long.valueOf(str).longValue());
        }
    }

    public IMUser getIMUserByUid(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 52624, new Class[]{String.class}, IMUser.class)) {
            return e.a().b(str2);
        }
        return (IMUser) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 52624, new Class[]{String.class}, IMUser.class);
    }

    public com.ss.android.ugc.aweme.im.service.session.a getNoticeSession(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 52576, new Class[]{String.class}, com.ss.android.ugc.aweme.im.service.session.a.class)) {
            return (com.ss.android.ugc.aweme.im.service.session.a) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 52576, new Class[]{String.class}, com.ss.android.ugc.aweme.im.service.session.a.class);
        }
        k a2 = k.a();
        if (!PatchProxy.isSupport(new Object[]{str2}, a2, k.f51273a, false, 51808, new Class[]{String.class}, com.ss.android.ugc.aweme.im.service.session.a.class)) {
            return a2.f51276d.get(str2);
        }
        return (com.ss.android.ugc.aweme.im.service.session.a) PatchProxy.accessDispatch(new Object[]{str2}, a2, k.f51273a, false, 51808, new Class[]{String.class}, com.ss.android.ugc.aweme.im.service.session.a.class);
    }

    public int getUpdateTagCount(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 52602, new Class[]{String.class}, Integer.TYPE)) {
            return com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a().a(str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 52602, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    public void onFlipChatConversationListFinish(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 52615, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 52615, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle2 != null) {
            long j = bundle2.getLong("flip_chat_msg_last_unread_time");
            long j2 = bundle2.getLong("flip_chat_msg_last_unread_dot_time");
            if (j > o.a().h()) {
                o.a().b(j);
            }
            if (j2 > o.a().i()) {
                o.a().c(j2);
            }
            bundle2.putLong("flip_chat_msg_unread_count", 0);
            bundle2.putLong("flip_chat_msg_unread_dot_count", 0);
            k.a().a(bundle2);
        }
    }

    public void onFlipChatMsgBind(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 52616, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 52616, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle != null) {
            o.a().b(false);
            onFlipChatLastMsgUpdate(bundle);
        }
    }

    public void onFlipChatMsgUnbind(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 52617, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 52617, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        updateFlipChatConfig(false, "", 0);
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            i.a((Callable<TResult>) new Callable<Void>() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public Void call() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52640, new Class[0], Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52640, new Class[0], Void.class);
                    }
                    k.a().g();
                    return null;
                }
            }, i.f1052b);
        } else {
            k.a().g();
        }
        if (z) {
            r.a(2);
        }
    }

    public void onFlipChatUnreadCountUpdate(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 52613, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 52613, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle2 != null) {
            onFlipChatUnreadConfigUpdate(bundle);
            k.a().a(bundle2);
        }
    }

    public void openSessionListActivity(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 52564, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 52564, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2}, null, SessionListActivity.f51838a, true, 52389, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, SessionListActivity.f51838a, true, 52389, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        context2.startActivity(new Intent(context2, SessionListActivity.class));
    }

    public void resetShareHeadListView(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 52588, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 52588, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view2 instanceof com.ss.android.ugc.aweme.im.sdk.share.a) {
            com.ss.android.ugc.aweme.im.sdk.share.a aVar = (com.ss.android.ugc.aweme.im.sdk.share.a) view2;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.im.sdk.share.a.f52370a, false, 53192, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.im.sdk.share.a.f52370a, false, 53192, new Class[0], Void.TYPE);
            } else if (aVar.f52372c != null) {
                aVar.f52372c.c();
                aVar.f52371b.scrollToPosition(0);
            }
        }
    }

    public void updateContactName(IMUser iMUser) {
        IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{iMUser2}, this, changeQuickRedirect, false, 52620, new Class[]{IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser2}, this, changeQuickRedirect, false, 52620, new Class[]{IMUser.class}, Void.TYPE);
        } else if (iMUser2 != null) {
            IMUser b2 = e.a().b(iMUser.getUid());
            if (b2 != null) {
                iMUser2.setContactName(b2.getContactName());
            }
        }
    }

    public void updateIMUser(IMUser iMUser) {
        final IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{iMUser2}, this, changeQuickRedirect, false, 52619, new Class[]{IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser2}, this, changeQuickRedirect, false, 52619, new Class[]{IMUser.class}, Void.TYPE);
        } else if (iMUser2 == null) {
            com.ss.android.ugc.aweme.framework.a.a.a("IMService.updateSimpleUser user = null");
        } else {
            if (iMUser.isBlock()) {
                iMUser2.setFollowStatus(0);
            }
            com.ss.android.b.a.a.a.a(new Runnable() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public void run() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52641, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52641, new Class[0], Void.TYPE);
                    } else if (iMUser2.getAvatarThumb() == null) {
                        UserStruct userStruct = null;
                        try {
                            userStruct = (UserStruct) r.a().queryUser(iMUser2.getUid(), j.f51270d.b(iMUser2)).get();
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                        if (!(userStruct == null || userStruct.getUser() == null)) {
                            IMUser fromUser = IMUser.fromUser(userStruct.getUser());
                            IMService.this.updateContactName(fromUser);
                            e.a().a(fromUser);
                        }
                    } else {
                        IMService.this.updateContactName(iMUser2);
                        e.a().a(iMUser2);
                    }
                }
            });
        }
    }

    public void updateIMUserFollowStatus(IMUser iMUser) {
        IMService iMService;
        if (PatchProxy.isSupport(new Object[]{iMUser}, this, changeQuickRedirect, false, 52621, new Class[]{IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser}, this, changeQuickRedirect, false, 52621, new Class[]{IMUser.class}, Void.TYPE);
            return;
        }
        IMUser b2 = e.a().b(iMUser.getUid());
        if (b2 != null) {
            b2.setFollowStatus(iMUser.getFollowStatus());
            iMService = this;
        } else {
            iMService = this;
            b2 = iMUser;
        }
        iMService.updateIMUser(b2);
    }

    public boolean checkGroupChatGuide(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 52608, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 52608, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        o a2 = o.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, o.f52605a, false, 53442, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, a2, o.f52605a, false, 53442, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        long j = a2.f52608b.getLong("last_group_guide_show_time", 0);
        int i2 = a2.f52608b.getInt("group_guide_show_times", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j <= ((long) (i * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)) || i2 >= 2) {
            return false;
        }
        a2.f52608b.edit().putInt("group_guide_show_times", i2 + 1).commit();
        a2.f52608b.edit().putLong("last_group_guide_show_time", currentTimeMillis).commit();
        return true;
    }

    public void onFlipChatLastMsgUpdate(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 52611, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 52611, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle2 != null) {
            long j = bundle2.getLong("flip_chat_msg_update_time");
            ALog.e("im_flip_chat", "onFlipChatLastMsgUpdate-updateTime=" + j);
            ALog.e("im_flip_chat", "onFlipChatLastMsgUpdate-spTime=" + o.a().g());
            String string = bundle2.getString("flip_chat_msg_src_content");
            if (j > o.a().g() && !TextUtils.isEmpty(string)) {
                o.a().a(j);
                o.a().b(false);
            }
            onFlipChatUnreadConfigUpdate(bundle);
            k.a().a(bundle2);
        }
    }

    public void markSessionInMsgHelperRead(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 52630, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 52630, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        o.a().a(Math.max(0, o.a().b() - i2));
        k.a().f();
    }

    public List<IMUser> searchFollowIMUser(List<IMUser> list, String str) {
        List<IMUser> list2 = list;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{list2, str2}, this, changeQuickRedirect, false, 52628, new Class[]{List.class, String.class}, List.class)) {
            return e.a().a(list2, str2);
        }
        return (List) PatchProxy.accessDispatch(new Object[]{list2, str2}, this, changeQuickRedirect, false, 52628, new Class[]{List.class, String.class}, List.class);
    }

    public void setImage(ImageView imageView, Object obj) {
        if (PatchProxy.isSupport(new Object[]{imageView, obj}, this, changeQuickRedirect, false, 52610, new Class[]{ImageView.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, obj}, this, changeQuickRedirect, false, 52610, new Class[]{ImageView.class, Object.class}, Void.TYPE);
            return;
        }
        ImShareDialog.a((RemoteImageView) imageView, (IShareService.ShareStruct) obj);
    }

    public boolean startChat(Context context, IMContact iMContact) {
        final Context context2 = context;
        final IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{context2, iMContact2}, this, changeQuickRedirect, false, 52570, new Class[]{Context.class, IMContact.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, iMContact2}, this, changeQuickRedirect, false, 52570, new Class[]{Context.class, IMContact.class}, Boolean.TYPE)).booleanValue();
        } else if (iMContact2 == null) {
            com.ss.android.ugc.aweme.framework.a.a.a("IMService.startChat contact = null");
            return false;
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            com.ss.android.ugc.aweme.login.d.a((Activity) context2);
            return false;
        } else {
            com.ss.android.ugc.aweme.im.sdk.d.d.b(context2, iMContact2, new Function0<Unit>() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public Unit invoke() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52632, new Class[0], Unit.class)) {
                        return (Unit) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52632, new Class[0], Unit.class);
                    }
                    IMUser a2 = e.a(iMContact2);
                    if (a2 != null) {
                        ChatRoomActivity.a(context2, a2, 6);
                        z.a().a(com.bytedance.im.core.d.e.a(Long.valueOf(a2.getUid()).longValue()), a2.getUid(), PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE, "share_toast", "");
                    }
                    return null;
                }
            });
            return true;
        }
    }

    public void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i) {
        if (PatchProxy.isSupport(new Object[]{remoteImageView, Integer.valueOf(i)}, this, changeQuickRedirect, false, 52590, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView, Integer.valueOf(i)}, this, changeQuickRedirect, false, 52590, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bc.a(remoteImageView, i);
    }

    public void addSessionListFragmentHeader(Fragment fragment, View view) {
        Fragment fragment2 = fragment;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{fragment2, view2}, this, changeQuickRedirect, false, 52562, new Class[]{Fragment.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, view2}, this, changeQuickRedirect, false, 52562, new Class[]{Fragment.class, View.class}, Void.TYPE);
            return;
        }
        if (fragment2 instanceof SessionListFragment) {
            SessionListFragment sessionListFragment = (SessionListFragment) fragment2;
            if (PatchProxy.isSupport(new Object[]{view2}, sessionListFragment, SessionListFragment.f51853a, false, 52427, new Class[]{View.class}, Void.TYPE)) {
                SessionListFragment sessionListFragment2 = sessionListFragment;
                PatchProxy.accessDispatch(new Object[]{view2}, sessionListFragment2, SessionListFragment.f51853a, false, 52427, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (!view2.equals(sessionListFragment.f51854b)) {
                sessionListFragment.f51854b = view2;
            }
            if (sessionListFragment.f51855c != null) {
                sessionListFragment.f51855c.a(view2);
            }
        }
    }

    public void commandShareVideo(Context context, com.ss.android.ugc.aweme.im.service.model.b bVar) {
        final IMUser iMUser;
        final Context context2 = context;
        final com.ss.android.ugc.aweme.im.service.model.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{context2, bVar2}, this, changeQuickRedirect, false, 52580, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.model.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bVar2}, this, changeQuickRedirect, false, 52580, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.model.b.class}, Void.TYPE);
            return;
        }
        CommandShareContent obtain = CommandShareContent.obtain(bVar);
        if (bVar2.f52871f != null) {
            iMUser = bVar2.f52871f;
        } else {
            iMUser = e.a().b(bVar2.f52869d);
        }
        if (iMUser == null || isExistHistoryMsg(iMUser)) {
            if (iMUser != null) {
                ba.a().a(iMUser.getUid(), (BaseContent) obtain);
            }
            com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
            a2.a(com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + bVar2.f52866a).a("from_uid", bVar2.f52869d).a());
            return;
        }
        ba.a().a(iMUser.getUid(), (BaseContent) obtain, (ba.a) new ba.a() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onSendFailure(com.bytedance.im.core.d.j jVar) {
            }

            public void onSendSuccess(n nVar) {
            }

            public void onSend(com.bytedance.im.core.d.b bVar, List<n> list) {
                if (PatchProxy.isSupport(new Object[]{bVar, list}, this, changeQuickRedirect, false, 52637, new Class[]{com.bytedance.im.core.d.b.class, List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar, list}, this, changeQuickRedirect, false, 52637, new Class[]{com.bytedance.im.core.d.b.class, List.class}, Void.TYPE);
                    return;
                }
                z.a().a(bVar.getConversationId(), iMUser.getUid(), PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE, "token", "");
                Context context = context2;
                IMUser iMUser = iMUser;
                String str = bVar2.f52869d;
                if (PatchProxy.isSupport(new Object[]{context, iMUser, 1, str}, null, ChatRoomActivity.f50196a, true, 50240, new Class[]{Context.class, IMUser.class, Integer.TYPE, String.class}, Boolean.TYPE)) {
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{context, iMUser, 1, str}, null, ChatRoomActivity.f50196a, true, 50240, new Class[]{Context.class, IMUser.class, Integer.TYPE, String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    ChatRoomActivity.a(context, iMUser, 1, str, null, null);
                }
            }
        });
    }

    public void commentReply(Context context, com.ss.android.ugc.aweme.im.service.model.c cVar) {
        ImCommentReplyDialog imCommentReplyDialog;
        Context context2 = context;
        com.ss.android.ugc.aweme.im.service.model.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context2, cVar2}, this, changeQuickRedirect, false, 52583, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.model.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, cVar2}, this, changeQuickRedirect, false, 52583, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.model.c.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, cVar2}, null, com.ss.android.ugc.aweme.im.sdk.comment.a.f51196a, true, 51679, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.model.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, cVar2}, null, com.ss.android.ugc.aweme.im.sdk.comment.a.f51196a, true, 51679, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.model.c.class}, Void.TYPE);
            return;
        }
        ImCommentReplyDialog.b bVar = new ImCommentReplyDialog.b(context2);
        bVar.f51193c = cVar2;
        bVar.f51195e = new ImCommentReplyDialog.a(context2, cVar2) {

            /* renamed from: a */
            public static ChangeQuickRedirect f51197a;

            /* renamed from: b */
            final /* synthetic */ Context f51198b;

            /* renamed from: c */
            final /* synthetic */ com.ss.android.ugc.aweme.im.service.model.c f51199c;

            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.im.sdk.comment.a.2.a(java.lang.String):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.im.sdk.comment.a.2.a(java.lang.String):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        };
        bVar.f51194d = new ImCommentReplyDialog.a() {
            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.im.sdk.comment.a.1.a(java.lang.String):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.im.sdk.comment.a.1.a(java.lang.String):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        };
        if (PatchProxy.isSupport(new Object[0], bVar, ImCommentReplyDialog.b.f51191a, false, 51678, new Class[0], ImCommentReplyDialog.class)) {
            imCommentReplyDialog = (ImCommentReplyDialog) PatchProxy.accessDispatch(new Object[0], bVar, ImCommentReplyDialog.b.f51191a, false, 51678, new Class[0], ImCommentReplyDialog.class);
        } else {
            imCommentReplyDialog = new ImCommentReplyDialog(bVar, (byte) 0);
        }
        imCommentReplyDialog.show();
    }

    public void onFlipChatPushMsgUpdate(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 52612, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 52612, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str) && j2 > 0) {
            updateFlipChatConfig(true, str2, j2);
            Bundle bundle = new Bundle();
            bundle.putLong("flip_chat_msg_unread_count", 0);
            bundle.putLong("flip_chat_msg_unread_dot_count", 0);
            bundle.putString("flip_chat_msg_content", str2);
            bundle.putLong("flip_chat_msg_update_time", j2);
            k.a().a(bundle);
        }
    }

    public void openX(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 52601, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 52601, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, null, bc.f52548a, true, 53817, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, null, bc.f52548a, true, 53817, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bc.a(context2, i, (Object) null);
    }

    public void sendMutilMsg(String str, View view) {
        String str2 = str;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{str2, view2}, this, changeQuickRedirect, false, 52587, new Class[]{String.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, view2}, this, changeQuickRedirect, false, 52587, new Class[]{String.class, View.class}, Void.TYPE);
            return;
        }
        if ((view2 instanceof com.ss.android.ugc.aweme.im.sdk.share.a) && str2 != null) {
            if (str.length() <= ad.a()) {
                com.ss.android.ugc.aweme.im.sdk.share.a aVar = (com.ss.android.ugc.aweme.im.sdk.share.a) view2;
                if (PatchProxy.isSupport(new Object[]{str2}, aVar, com.ss.android.ugc.aweme.im.sdk.share.a.f52370a, false, 53199, new Class[]{String.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.im.sdk.share.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{str2}, aVar2, com.ss.android.ugc.aweme.im.sdk.share.a.f52370a, false, 53199, new Class[]{String.class}, Void.TYPE);
                } else {
                    IShareService.ShareStruct iMShareStruct = aVar.f52373d.getIMShareStruct();
                    if (iMShareStruct == null) {
                        aVar.f52373d.dismiss();
                    } else {
                        IMContact[] a2 = aVar.f52372c.a();
                        if (a2.length != 0) {
                            new com.ss.android.ugc.aweme.im.sdk.a.b(aVar.getContext(), new com.ss.android.ugc.aweme.im.sdk.a.c(a2, iMShareStruct, str2) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f52385a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ IMContact[] f52386b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ IShareService.ShareStruct f52387c;

                                /* renamed from: d  reason: collision with root package name */
                                final /* synthetic */ String f52388d;

                                public final void sendMsg() {
                                    if (PatchProxy.isSupport(new Object[0], this, f52385a, false, 53207, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f52385a, false, 53207, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    z.a().a(this.f52386b.length);
                                    a.this.a(this.f52387c, this.f52388d, this.f52386b);
                                }

                                {
                                    this.f52386b = r2;
                                    this.f52387c = r3;
                                    this.f52388d = r4;
                                }
                            }).sendMsg();
                            com.ss.android.ugc.aweme.im.sdk.relations.c.a(iMShareStruct, (BaseContent) null, a2.length);
                        }
                    }
                }
            } else {
                UIUtils.displayToast(GlobalContext.getContext(), GlobalContext.getContext().getResources().getString(C0906R.string.aur));
            }
        }
    }

    public boolean startChat(Context context, IMUser iMUser) {
        Context context2 = context;
        IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{context2, iMUser2}, this, changeQuickRedirect, false, 52565, new Class[]{Context.class, IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, iMUser2}, this, changeQuickRedirect, false, 52565, new Class[]{Context.class, IMUser.class}, Boolean.TYPE)).booleanValue();
        } else if (iMUser2 == null) {
            com.ss.android.ugc.aweme.framework.a.a.a("IMService.startChat user = null");
            return false;
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            com.ss.android.ugc.aweme.login.d.a((Activity) context2);
            return false;
        } else {
            if (PatchProxy.isSupport(new Object[]{context2, iMUser2}, null, ChatRoomActivity.f50196a, true, 50238, new Class[]{Context.class, IMUser.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, iMUser2}, null, ChatRoomActivity.f50196a, true, 50238, new Class[]{Context.class, IMUser.class}, Boolean.TYPE)).booleanValue();
            } else {
                ChatRoomActivity.a(context2, iMUser2, 0);
            }
            return true;
        }
    }

    public void wrapperIMShareText(Context context, TextView textView) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{context, textView2}, this, changeQuickRedirect, false, 52599, new Class[]{Context.class, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, textView2}, this, changeQuickRedirect, false, 52599, new Class[]{Context.class, TextView.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context, textView2}, null, bc.f52548a, true, 53834, new Class[]{Context.class, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, textView2}, null, bc.f52548a, true, 53834, new Class[]{Context.class, TextView.class}, Void.TYPE);
            return;
        }
        textView2.setVisibility(0);
        com.ss.android.ugc.aweme.im.service.model.e eVar = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting().f52883f;
        String str = null;
        if (eVar != null) {
            str = eVar.u;
        }
        if (TextUtils.isEmpty(str)) {
            str = context.getResources().getString(C0906R.string.b0d);
        }
        textView2.setText(str);
    }

    public void onNewNoticeArrived(int i, @NonNull Bundle bundle) {
        f fVar;
        long j;
        int i2 = i;
        final Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bundle2}, this, changeQuickRedirect, false, 52575, new Class[]{Integer.TYPE, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bundle2}, this, changeQuickRedirect, false, 52575, new Class[]{Integer.TYPE, Bundle.class}, Void.TYPE);
        } else if (i2 == 1) {
            com.ss.android.ugc.aweme.im.sdk.module.stranger.b.a().a(new b.C0605b() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public void onFetch(g gVar) {
                    if (PatchProxy.isSupport(new Object[]{gVar}, this, changeQuickRedirect, false, 52636, new Class[]{g.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{gVar}, this, changeQuickRedirect, false, 52636, new Class[]{g.class}, Void.TYPE);
                    } else if (gVar != null) {
                        f a2 = f.a(gVar);
                        a2.m = bundle2.getInt("unread_count");
                        k.a().a((com.ss.android.ugc.aweme.im.service.session.a) a2);
                    } else {
                        k.a().a("stranger_1");
                    }
                }
            });
        } else {
            if (i2 == 3) {
                if (PatchProxy.isSupport(new Object[]{bundle2}, null, f.f51921d, true, 52487, new Class[]{Bundle.class}, f.class)) {
                    fVar = (f) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f.f51921d, true, 52487, new Class[]{Bundle.class}, f.class);
                } else {
                    fVar = new f();
                    long j2 = bundle2.getLong("last_create_time");
                    String string = bundle2.getString("from_user_name");
                    String string2 = bundle2.getString("from_user_content");
                    int i3 = bundle2.getInt("from_user_msg_type");
                    int i4 = bundle2.getInt("unread_count");
                    boolean z = bundle2.getBoolean("is_recalled");
                    String string3 = bundle2.getString("from_user_id");
                    if (TextUtils.isEmpty(string3)) {
                        j = 0;
                    } else {
                        j = Long.parseLong(string3);
                    }
                    fVar.k = m.content(i3, string2, z, j).getMsgHint();
                    fVar.a(j2);
                    fVar.m = i4;
                    fVar.j = string;
                }
                k.a().a((com.ss.android.ugc.aweme.im.service.session.a) fVar);
                return;
            }
            if (i2 == 4) {
                org.greenrobot.eventbus.c.a().d(new com.ss.android.ugc.aweme.im.sdk.model.d());
            }
        }
    }

    public void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i) {
        final Activity activity2 = activity;
        final IMUser iMUser2 = iMUser;
        final int i2 = i;
        if (PatchProxy.isSupport(new Object[]{activity2, iMUser2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 52591, new Class[]{Activity.class, IMUser.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, iMUser2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 52591, new Class[]{Activity.class, IMUser.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bc.a(activity2, iMUser2, i2, (Runnable) new Runnable() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void run() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52638, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52638, new Class[0], Void.TYPE);
                } else if (i2 == 2) {
                    IMService.this.startChat(activity2, iMUser2, 5);
                } else if (i2 == 3) {
                    IMService.this.startChat(activity2, iMUser2, 10);
                } else {
                    IMService.this.startChat((Context) activity2, iMUser2);
                }
            }
        });
    }

    public void wrapperShareToX(Activity activity, Bundle bundle, int i) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{activity2, bundle2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 52593, new Class[]{Activity.class, Bundle.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bundle2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 52593, new Class[]{Activity.class, Bundle.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (bundle2 != null) {
            bc.a(activity2, bundle2.get("share_struct"), i);
        }
    }

    public void wrapperSyncXBlockWithDialog(Context context, boolean z, DialogInterface.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0), onClickListener}, this, changeQuickRedirect, false, 52597, new Class[]{Context.class, Boolean.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z), onClickListener}, this, changeQuickRedirect, false, 52597, new Class[]{Context.class, Boolean.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE);
            return;
        }
        bc.a(context, z, onClickListener);
    }

    public void enterChooseContact(Context context, Bundle bundle, com.ss.android.ugc.aweme.base.a<Boolean> aVar) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context, bundle2, aVar}, this, changeQuickRedirect, false, 52571, new Class[]{Context.class, Bundle.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, bundle2, aVar}, this, changeQuickRedirect, false, 52571, new Class[]{Context.class, Bundle.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            com.ss.android.ugc.aweme.login.d.a((Activity) context);
        } else {
            if (bundle2 != null) {
                int i = bundle2.getInt("key_share_type", -1);
                if (i == 8) {
                    wrapperShareToX(com.ss.android.ugc.aweme.framework.core.a.b().a(), bundle2, i);
                    return;
                }
            }
            RelationSelectActivity.a(context, bundle, aVar);
        }
    }

    public boolean startChatWithAdLog(Context context, IMUser iMUser, com.ss.android.ugc.aweme.im.service.model.a aVar) {
        Context context2 = context;
        IMUser iMUser2 = iMUser;
        com.ss.android.ugc.aweme.im.service.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, iMUser2, aVar2}, this, changeQuickRedirect, false, 52568, new Class[]{Context.class, IMUser.class, com.ss.android.ugc.aweme.im.service.model.a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, iMUser2, aVar2}, this, changeQuickRedirect, false, 52568, new Class[]{Context.class, IMUser.class, com.ss.android.ugc.aweme.im.service.model.a.class}, Boolean.TYPE)).booleanValue();
        } else if (iMUser2 == null) {
            com.ss.android.ugc.aweme.framework.a.a.a("IMService.startChat user = null");
            return false;
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            com.ss.android.ugc.aweme.login.d.a((Activity) context2);
            return false;
        } else {
            if (PatchProxy.isSupport(new Object[]{context2, iMUser2, aVar2}, null, ChatRoomActivity.f50196a, true, 50241, new Class[]{Context.class, IMUser.class, com.ss.android.ugc.aweme.im.service.model.a.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, iMUser2, aVar2}, null, ChatRoomActivity.f50196a, true, 50241, new Class[]{Context.class, IMUser.class, com.ss.android.ugc.aweme.im.service.model.a.class}, Boolean.TYPE)).booleanValue();
            } else {
                ChatRoomActivity.a(context2, iMUser2, 0, aVar2, null);
            }
            return true;
        }
    }

    public boolean startChatWithExt(Context context, IMUser iMUser, Serializable serializable) {
        Context context2 = context;
        IMUser iMUser2 = iMUser;
        Serializable serializable2 = serializable;
        if (PatchProxy.isSupport(new Object[]{context2, iMUser2, serializable2}, this, changeQuickRedirect, false, 52567, new Class[]{Context.class, IMUser.class, Serializable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, iMUser2, serializable2}, this, changeQuickRedirect, false, 52567, new Class[]{Context.class, IMUser.class, Serializable.class}, Boolean.TYPE)).booleanValue();
        } else if (iMUser2 == null) {
            com.ss.android.ugc.aweme.framework.a.a.a("IMService.startChat user = null");
            return false;
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            com.ss.android.ugc.aweme.login.d.a((Activity) context2);
            return false;
        } else {
            if (PatchProxy.isSupport(new Object[]{context2, iMUser2, serializable2}, null, ChatRoomActivity.f50196a, true, 50242, new Class[]{Context.class, IMUser.class, Serializable.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, iMUser2, serializable2}, null, ChatRoomActivity.f50196a, true, 50242, new Class[]{Context.class, IMUser.class, Serializable.class}, Boolean.TYPE)).booleanValue();
            } else {
                ChatRoomActivity.a(context2, iMUser2, 0, null, serializable2);
            }
            return true;
        }
    }

    private void updateFlipChatConfig(boolean z, String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2, new Long(j2)}, this, changeQuickRedirect, false, 52618, new Class[]{Boolean.TYPE, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2, new Long(j2)}, this, changeQuickRedirect, false, 52618, new Class[]{Boolean.TYPE, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        o.a().a(0);
        o.a().b(false);
        o.a().b(0);
        o.a().c(0);
        o a2 = o.a();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, a2, o.f52605a, false, 53423, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            o oVar = a2;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, oVar, o.f52605a, false, 53423, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            a2.f52608b.edit().putBoolean("flip_chat_push_click_show_state", z).commit();
        }
        o a3 = o.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a3, o.f52605a, false, 53425, new Class[]{String.class}, Void.TYPE)) {
            o oVar2 = a3;
            PatchProxy.accessDispatch(new Object[]{str2}, oVar2, o.f52605a, false, 53425, new Class[]{String.class}, Void.TYPE);
        } else {
            a3.f52608b.edit().putString("flip_chat_push_click_show_desc", str2).commit();
        }
        o a4 = o.a();
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, a4, o.f52605a, false, 53427, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, a4, o.f52605a, false, 53427, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        a4.f52608b.edit().putLong("flip_chat_push_click_show_time", j2).commit();
    }

    public void initialize(Application application, com.ss.android.ugc.aweme.im.service.a aVar, com.ss.android.ugc.aweme.im.service.c cVar) {
        int i;
        com.ss.android.ugc.aweme.im.service.c cVar2;
        com.bytedance.im.core.a.e eVar;
        Application application2 = application;
        com.ss.android.ugc.aweme.im.service.a aVar2 = aVar;
        int i2 = 3;
        if (PatchProxy.isSupport(new Object[]{application2, aVar2, cVar}, this, changeQuickRedirect, false, 52558, new Class[]{Application.class, com.ss.android.ugc.aweme.im.service.a.class, com.ss.android.ugc.aweme.im.service.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application2, aVar2, cVar}, this, changeQuickRedirect, false, 52558, new Class[]{Application.class, com.ss.android.ugc.aweme.im.service.a.class, com.ss.android.ugc.aweme.im.service.c.class}, Void.TYPE);
            return;
        }
        inst = this;
        if (aVar2 != null) {
            com.ss.android.ugc.aweme.im.sdk.utils.g.f52586b = aVar2.f52864e;
            com.ss.android.ugc.aweme.im.sdk.utils.g.f52585a = aVar2.f52861b;
            com.ss.android.ugc.aweme.im.sdk.utils.g.f52588d = aVar2.f52863d;
            com.ss.android.ugc.aweme.im.sdk.utils.g.f52587c = aVar2.f52862c;
        }
        if (cVar != null) {
            i = cVar.getXPlanStyle();
        } else {
            i = 0;
        }
        this.xplanStyle = i;
        com.ss.android.ugc.aweme.im.sdk.d.a a2 = com.ss.android.ugc.aweme.im.sdk.d.a.a();
        if (PatchProxy.isSupport(new Object[]{application2, aVar2, cVar}, a2, com.ss.android.ugc.aweme.im.sdk.d.a.f3370a, false, 51690, new Class[]{Application.class, com.ss.android.ugc.aweme.im.service.a.class, com.ss.android.ugc.aweme.im.service.c.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.im.sdk.d.a aVar3 = a2;
            PatchProxy.accessDispatch(new Object[]{application2, aVar2, cVar}, aVar3, com.ss.android.ugc.aweme.im.sdk.d.a.f3370a, false, 51690, new Class[]{Application.class, com.ss.android.ugc.aweme.im.service.a.class, com.ss.android.ugc.aweme.im.service.c.class}, Void.TYPE);
            return;
        }
        a2.f3373c = aVar2;
        if (cVar != null) {
            cVar2 = cVar;
        } else {
            cVar2 = new DefaultMainProxy();
        }
        a2.f3372b = cVar2;
        com.bytedance.im.core.a.c a3 = com.bytedance.im.core.a.c.a();
        if (PatchProxy.isSupport(new Object[]{aVar2}, a2, com.ss.android.ugc.aweme.im.sdk.d.a.f3370a, false, 51694, new Class[]{com.ss.android.ugc.aweme.im.service.a.class}, com.bytedance.im.core.a.e.class)) {
            com.ss.android.ugc.aweme.im.sdk.d.a aVar4 = a2;
            eVar = (com.bytedance.im.core.a.e) PatchProxy.accessDispatch(new Object[]{aVar2}, aVar4, com.ss.android.ugc.aweme.im.sdk.d.a.f3370a, false, 51694, new Class[]{com.ss.android.ugc.aweme.im.service.a.class}, com.bytedance.im.core.a.e.class);
        } else {
            eVar = new com.bytedance.im.core.a.e();
            eVar.f20897c = aVar2.g;
            eVar.f20898d = aVar2.f52865f;
            eVar.j = 0;
            if (!aVar2.f52860a) {
                i2 = 6;
            }
            eVar.f20895a = i2;
            eVar.f20900f = com.ss.android.ugc.aweme.im.sdk.utils.g.f52587c;
            eVar.f20896b = 2;
            eVar.r = 1;
            eVar.i = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            eVar.z = true;
            eVar.I = "1000";
            if (!com.ss.android.ugc.aweme.im.sdk.utils.m.a()) {
                eVar.p = new int[]{1};
            }
        }
        a3.f20877a = application2;
        a3.f20878b = eVar;
        com.bytedance.im.core.b.e.d.f21188a = a3.b().f20895a;
        com.bytedance.im.core.a.c.a().a(a2.f3374d);
        com.bytedance.im.core.a.c.a().f20880d = new com.bytedance.im.core.c.a() {

            /* renamed from: a */
            public static ChangeQuickRedirect f51203a;

            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.im.sdk.d.a.1.a(java.lang.String, org.json.JSONObject):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.im.sdk.d.a.1.a(java.lang.String, org.json.JSONObject):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        };
        com.ss.android.ugc.aweme.im.sdk.j.c.a(application.getApplicationContext());
        com.ss.android.ugc.aweme.im.sdk.j.c a4 = com.ss.android.ugc.aweme.im.sdk.j.c.a();
        if (PatchProxy.isSupport(new Object[0], a4, com.ss.android.ugc.aweme.im.sdk.j.c.f3379a, false, 54000, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a4, com.ss.android.ugc.aweme.im.sdk.j.c.f3379a, false, 54000, new Class[0], Void.TYPE);
        } else if (!org.greenrobot.eventbus.c.a().b((Object) a4)) {
            org.greenrobot.eventbus.c.a().a((Object) a4);
        }
        if (!org.greenrobot.eventbus.c.a().b((Object) a2)) {
            org.greenrobot.eventbus.c.a().a((Object) a2);
        }
        com.bytedance.im.core.a.c.a();
        com.bytedance.im.core.b.e.g.a().f21191a = new com.ss.android.ugc.aweme.im.sdk.chat.c();
        com.bytedance.im.core.c.d.f21249a = new com.bytedance.im.core.c.b() {

            /* renamed from: a */
            public static ChangeQuickRedirect f51205a;

            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.im.sdk.d.a.2.a(java.lang.Object):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.im.sdk.d.a.2.a(java.lang.Object):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:427)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/

            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.im.sdk.d.a.2.a(java.lang.String, java.lang.String, java.lang.Throwable):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.im.sdk.d.a.2.a(java.lang.String, java.lang.String, java.lang.Throwable):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:427)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/

            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.im.sdk.d.a.2.a(java.lang.String, java.lang.String, org.json.JSONObject):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.im.sdk.d.a.2.a(java.lang.String, java.lang.String, org.json.JSONObject):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:427)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/

            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.im.sdk.d.a.2.a(java.lang.String, org.json.JSONObject, org.json.JSONObject):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.im.sdk.d.a.2.a(java.lang.String, org.json.JSONObject, org.json.JSONObject):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:427)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/

            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.im.sdk.d.a.2.a(java.lang.String, java.lang.String, java.util.Map, java.util.Map):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.im.sdk.d.a.2.a(java.lang.String, java.lang.String, java.util.Map, java.util.Map):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:427)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        };
        h.b().a();
    }

    public boolean startChat(Context context, IMUser iMUser, int i) {
        if (!PatchProxy.isSupport(new Object[]{context, iMUser, Integer.valueOf(i)}, this, changeQuickRedirect, false, 52566, new Class[]{Context.class, IMUser.class, Integer.TYPE}, Boolean.TYPE)) {
            return ChatRoomActivity.a(context, iMUser, i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, iMUser, Integer.valueOf(i)}, this, changeQuickRedirect, false, 52566, new Class[]{Context.class, IMUser.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public String convertSearchKeyword(String str, String str2, String str3, String str4) {
        if (!PatchProxy.isSupport(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 52629, new Class[]{String.class, String.class, String.class, String.class}, String.class)) {
            return com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(str, str2, str3, str4);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 52629, new Class[]{String.class, String.class, String.class, String.class}, String.class);
    }

    public void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), runnable}, this, changeQuickRedirect, false, 52595, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), Byte.valueOf(z), runnable}, this, changeQuickRedirect, false, 52595, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, Runnable.class}, Void.TYPE);
            return;
        }
        bc.a(context, i, z, runnable);
    }

    public void wrapperSyncXStory(Activity activity, com.ss.android.ugc.aweme.im.service.model.h hVar, int i, com.ss.android.ugc.aweme.im.service.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{activity, hVar, Integer.valueOf(i), aVar}, this, changeQuickRedirect, false, 52594, new Class[]{Activity.class, com.ss.android.ugc.aweme.im.service.model.h.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, hVar, Integer.valueOf(i), aVar}, this, changeQuickRedirect, false, 52594, new Class[]{Activity.class, com.ss.android.ugc.aweme.im.service.model.h.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.a.a.class}, Void.TYPE);
            return;
        }
        bc.a(activity, (Object) hVar, i, aVar);
    }

    public void directlyShare(Activity activity, Object obj, int i, com.ss.android.ugc.aweme.im.service.a.b bVar) {
        View view;
        if (PatchProxy.isSupport(new Object[]{activity, obj, Integer.valueOf(i), bVar}, this, changeQuickRedirect, false, 52573, new Class[]{Activity.class, Object.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, obj, Integer.valueOf(i), bVar}, this, changeQuickRedirect, false, 52573, new Class[]{Activity.class, Object.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.a.b.class}, Void.TYPE);
            return;
        }
        if (obj != null) {
            IShareService.SharePage sharePage = (IShareService.SharePage) obj;
            if (PatchProxy.isSupport(new Object[]{sharePage}, null, com.ss.android.ugc.aweme.im.sdk.share.b.f52398a, true, 53213, new Class[]{IShareService.SharePage.class}, View.class)) {
                view = (View) PatchProxy.accessDispatch(new Object[]{sharePage}, null, com.ss.android.ugc.aweme.im.sdk.share.b.f52398a, true, 53213, new Class[]{IShareService.SharePage.class}, View.class);
            } else {
                view = sharePage.getTopShareIMView();
            }
            if (view instanceof com.ss.android.ugc.aweme.im.sdk.share.a) {
                com.ss.android.ugc.aweme.im.sdk.share.a aVar = (com.ss.android.ugc.aweme.im.sdk.share.a) view;
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.im.sdk.share.a.f52370a, false, 53196, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.im.sdk.share.a.f52370a, false, 53196, new Class[0], Void.TYPE);
                    return;
                }
                aVar.a(aVar.f52374e);
            }
        }
    }

    public void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i, com.ss.android.ugc.aweme.im.service.model.a aVar) {
        final Activity activity2 = activity;
        final IMUser iMUser2 = iMUser;
        final com.ss.android.ugc.aweme.im.service.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, iMUser2, Integer.valueOf(i), aVar2}, this, changeQuickRedirect, false, 52592, new Class[]{Activity.class, IMUser.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, iMUser2, Integer.valueOf(i), aVar2}, this, changeQuickRedirect, false, 52592, new Class[]{Activity.class, IMUser.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE);
            return;
        }
        bc.a(activity2, iMUser2, i, (Runnable) new Runnable() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void run() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52639, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52639, new Class[0], Void.TYPE);
                    return;
                }
                ChatRoomActivity.a(activity2, iMUser2, 5, aVar2, null);
            }
        });
    }

    public void showShareDialog(Activity activity, Object obj, IMUser iMUser, com.ss.android.ugc.aweme.base.a<Boolean> aVar) {
        Activity activity2 = activity;
        Object obj2 = obj;
        final com.ss.android.ugc.aweme.base.a<Boolean> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, obj2, iMUser, aVar2}, this, changeQuickRedirect, false, 52574, new Class[]{Activity.class, Object.class, IMUser.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, obj2, iMUser, aVar2}, this, changeQuickRedirect, false, 52574, new Class[]{Activity.class, Object.class, IMUser.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
            return;
        }
        if ((obj2 instanceof IShareService.ShareStruct) && iMUser != null) {
            IShareService.ShareStruct shareStruct = (IShareService.ShareStruct) obj2;
            IMUser[] iMUserArr = {iMUser};
            final Activity activity3 = activity;
            final IShareService.ShareStruct shareStruct2 = shareStruct;
            final IMUser iMUser2 = iMUser;
            final com.ss.android.ugc.aweme.base.a<Boolean> aVar3 = aVar;
            AnonymousClass2 r0 = new b.a() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public void onShare(final String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 52633, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 52633, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    new com.ss.android.ugc.aweme.im.sdk.a.b(activity3, new com.ss.android.ugc.aweme.im.sdk.a.c() {
                        public static ChangeQuickRedirect changeQuickRedirect;

                        public void sendMsg() {
                            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52634, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52634, new Class[0], Void.TYPE);
                                return;
                            }
                            IShareService.ShareStruct shareStruct = shareStruct2;
                            IMUser iMUser = iMUser2;
                            String str = str;
                            if (PatchProxy.isSupport(new Object[]{shareStruct, iMUser, str}, null, com.ss.android.ugc.aweme.im.sdk.share.b.f52398a, true, 53219, new Class[]{IShareService.ShareStruct.class, IMUser.class, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{shareStruct, iMUser, str}, null, com.ss.android.ugc.aweme.im.sdk.share.b.f52398a, true, 53219, new Class[]{IShareService.ShareStruct.class, IMUser.class, String.class}, Void.TYPE);
                            } else {
                                BaseContent b2 = com.ss.android.ugc.aweme.im.sdk.share.b.b(shareStruct);
                                if (TextUtils.equals(shareStruct.itemType, "poi")) {
                                    SharePoiContent sharePoiContent = (SharePoiContent) b2;
                                    if (sharePoiContent != null) {
                                        String uri = sharePoiContent.getMapUrl().getUri();
                                        if (uri.startsWith("file://")) {
                                            s.a().a(uri.substring(7), (x) new x(sharePoiContent, iMUser, str) {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f52399a;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ SharePoiContent f52400b;

                                                /* renamed from: c  reason: collision with root package name */
                                                final /* synthetic */ IMUser f52401c;

                                                /* renamed from: d  reason: collision with root package name */
                                                final /* synthetic */ String f52402d;

                                                public final void a() {
                                                }

                                                public final void a(double d2) {
                                                }

                                                public final void a(Throwable th) {
                                                }

                                                public final void a(String str) {
                                                    if (PatchProxy.isSupport(new Object[]{str}, this, f52399a, false, 53228, new Class[]{String.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{str}, this, f52399a, false, 53228, new Class[]{String.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    b.a(this.f52401c, this.f52402d, (BaseContent) this.f52400b);
                                                }

                                                public final void a(String str, UrlModel urlModel) {
                                                    if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f52399a, false, 53227, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f52399a, false, 53227, new Class[]{String.class, UrlModel.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    this.f52400b.setMapUrl(urlModel);
                                                    b.a(this.f52401c, this.f52402d, (BaseContent) this.f52400b);
                                                }

                                                {
                                                    this.f52400b = r1;
                                                    this.f52401c = r2;
                                                    this.f52402d = r3;
                                                }
                                            });
                                        } else {
                                            com.ss.android.ugc.aweme.im.sdk.share.b.a(iMUser, str, b2);
                                        }
                                    }
                                } else {
                                    com.ss.android.ugc.aweme.im.sdk.share.b.a(iMUser, str, b2);
                                }
                            }
                            if (aVar3 != null) {
                                aVar3.run(Boolean.TRUE);
                            }
                        }
                    }).sendMsg();
                }
            };
            AnonymousClass3 r02 = new b.a() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public void onShare(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 52635, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 52635, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    if (aVar2 != null) {
                        aVar2.run(Boolean.FALSE);
                    }
                }
            };
            if (PatchProxy.isSupport(new Object[]{activity2, shareStruct, iMUserArr, "", r0, r02}, null, com.ss.android.ugc.aweme.im.sdk.share.b.f52398a, true, 53217, new Class[]{Context.class, IShareService.ShareStruct.class, IMUser[].class, String.class, b.a.class, b.a.class}, Void.TYPE)) {
                Object[] objArr = {activity2, shareStruct, iMUserArr, "", r0, r02};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, null, com.ss.android.ugc.aweme.im.sdk.share.b.f52398a, true, 53217, new Class[]{Context.class, IShareService.ShareStruct.class, IMUser[].class, String.class, b.a.class, b.a.class}, Void.TYPE);
                return;
            }
            ImShareDialog.a aVar4 = new ImShareDialog.a(activity2);
            aVar4.f52777d = iMUserArr;
            aVar4.f52776c = null;
            aVar4.a(shareStruct).a((b.a) r02).b((b.a) r0).a(416).b(335).a("").a().show();
        }
    }

    public boolean startChatWithAdLog(Context context, IMUser iMUser, com.ss.android.ugc.aweme.im.service.model.a aVar, Serializable serializable) {
        Context context2 = context;
        IMUser iMUser2 = iMUser;
        com.ss.android.ugc.aweme.im.service.model.a aVar2 = aVar;
        Serializable serializable2 = serializable;
        if (PatchProxy.isSupport(new Object[]{context2, iMUser2, aVar2, serializable2}, this, changeQuickRedirect, false, 52569, new Class[]{Context.class, IMUser.class, com.ss.android.ugc.aweme.im.service.model.a.class, Serializable.class}, Boolean.TYPE)) {
            Object[] objArr = {context2, iMUser2, aVar2, serializable2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 52569, new Class[]{Context.class, IMUser.class, com.ss.android.ugc.aweme.im.service.model.a.class, Serializable.class}, Boolean.TYPE)).booleanValue();
        } else if (iMUser2 == null) {
            com.ss.android.ugc.aweme.framework.a.a.a("IMService.startChat user = null");
            return false;
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            com.ss.android.ugc.aweme.login.d.a((Activity) context2);
            return false;
        } else {
            ChatRoomActivity.a(context2, iMUser2, 5, aVar2, serializable2);
            return true;
        }
    }

    public void storyMessageReply(Context context, Bundle bundle, Runnable runnable, Runnable runnable2) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        Runnable runnable3 = runnable;
        Runnable runnable4 = runnable2;
        if (PatchProxy.isSupport(new Object[]{context2, bundle2, runnable3, runnable4}, this, changeQuickRedirect, false, 52589, new Class[]{Context.class, Bundle.class, Runnable.class, Runnable.class}, Void.TYPE)) {
            Object[] objArr = {context2, bundle2, runnable3, runnable4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 52589, new Class[]{Context.class, Bundle.class, Runnable.class, Runnable.class}, Void.TYPE);
            return;
        }
        if (bundle2 != null) {
            IShareService.ShareStruct shareStruct = (IShareService.ShareStruct) bundle2.get("share_struct");
            if (shareStruct != null) {
                if (PatchProxy.isSupport(new Object[]{context2, shareStruct, runnable3, runnable4}, null, com.ss.android.ugc.aweme.im.sdk.story.c.f52428a, true, 53285, new Class[]{Context.class, IShareService.ShareStruct.class, Runnable.class, Runnable.class}, Void.TYPE)) {
                    Object[] objArr3 = {context2, shareStruct, runnable3, runnable4};
                    Object[] objArr4 = objArr3;
                    PatchProxy.accessDispatch(objArr4, null, com.ss.android.ugc.aweme.im.sdk.story.c.f52428a, true, 53285, new Class[]{Context.class, IShareService.ShareStruct.class, Runnable.class, Runnable.class}, Void.TYPE);
                    return;
                }
                c.a aVar = com.ss.android.ugc.aweme.im.sdk.story.c.f52429b;
                if (PatchProxy.isSupport(new Object[]{context2, shareStruct, runnable3, runnable4}, aVar, c.a.f52430a, false, 53287, new Class[]{Context.class, IShareService.ShareStruct.class, Runnable.class, Runnable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context2, shareStruct, runnable3, runnable4}, aVar, c.a.f52430a, false, 53287, new Class[]{Context.class, IShareService.ShareStruct.class, Runnable.class, Runnable.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(context2, "context");
                Intrinsics.checkParameterIsNotNull(shareStruct, "storyStruct");
                new com.ss.android.ugc.aweme.im.sdk.a.b(context2, new c.a.C0608a(shareStruct, context2, runnable3, runnable4)).sendMsg();
            }
        }
    }

    public void wrapperIMShareIcon(Context context, RemoteImageView remoteImageView, int i, boolean z) {
        RemoteImageView remoteImageView2 = remoteImageView;
        if (PatchProxy.isSupport(new Object[]{context, remoteImageView2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 52598, new Class[]{Context.class, RemoteImageView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, remoteImageView2, Integer.valueOf(i), Byte.valueOf(z)}, this, changeQuickRedirect, false, 52598, new Class[]{Context.class, RemoteImageView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context, remoteImageView2, Integer.valueOf(i), Byte.valueOf(z)}, null, bc.f52548a, true, 53833, new Class[]{Context.class, RemoteImageView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, remoteImageView2, Integer.valueOf(i), Byte.valueOf(z)}, null, bc.f52548a, true, 53833, new Class[]{Context.class, RemoteImageView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        remoteImageView2.setVisibility(0);
        com.ss.android.ugc.aweme.im.service.model.e eVar = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting().f52883f;
        com.ss.android.ugc.aweme.im.service.model.f fVar = null;
        switch (i) {
            case 0:
            case 2:
                if (eVar != null) {
                    fVar = eVar.q;
                }
                if (fVar == null || fVar.f52891b == null) {
                    remoteImageView2.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130840125));
                    break;
                } else {
                    bc.b(remoteImageView2, 2130840125);
                    com.ss.android.ugc.aweme.base.c.b(remoteImageView2, fVar.f52891b);
                    return;
                }
            case 1:
            case 4:
                boolean isXPlanRedPacketOpen = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().isXPlanRedPacketOpen();
                if (eVar != null) {
                    if (!z || !bc.b() || !isXPlanRedPacketOpen) {
                        fVar = eVar.q;
                    } else {
                        fVar = eVar.s;
                    }
                }
                if (fVar == null || fVar.f52891b == null) {
                    remoteImageView2.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130840125));
                    return;
                }
                bc.b(remoteImageView2, 2130840125);
                com.ss.android.ugc.aweme.base.c.b(remoteImageView2, fVar.f52891b);
                return;
            case 3:
                if (eVar != null) {
                    fVar = eVar.r;
                }
                if (fVar == null || fVar.f52891b == null) {
                    remoteImageView2.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130840126));
                    return;
                }
                bc.b(remoteImageView2, 2130840126);
                com.ss.android.ugc.aweme.base.c.b(remoteImageView2, fVar.f52891b);
                return;
        }
    }

    public void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable, com.ss.android.ugc.aweme.im.service.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), runnable, aVar}, this, changeQuickRedirect, false, 52596, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, Runnable.class, com.ss.android.ugc.aweme.im.service.a.a.class}, Void.TYPE)) {
            Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z), runnable, aVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 52596, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, Runnable.class, com.ss.android.ugc.aweme.im.service.a.a.class}, Void.TYPE);
            return;
        }
        bc.a(context, i, z, runnable, aVar);
    }

    public void addShareHeadList(Activity activity, Object obj, int i, com.ss.android.ugc.aweme.im.service.a.e eVar, com.ss.android.ugc.aweme.im.service.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{activity, obj, Integer.valueOf(i), eVar, bVar}, this, changeQuickRedirect, false, 52572, new Class[]{Activity.class, Object.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.a.e.class, com.ss.android.ugc.aweme.im.service.a.b.class}, Void.TYPE)) {
            Object[] objArr = {activity, obj, Integer.valueOf(i), eVar, bVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 52572, new Class[]{Activity.class, Object.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.a.e.class, com.ss.android.ugc.aweme.im.service.a.b.class}, Void.TYPE);
            return;
        }
        IShareService.SharePage sharePage = (IShareService.SharePage) obj;
        if (PatchProxy.isSupport(new Object[]{sharePage, 0}, null, com.ss.android.ugc.aweme.im.sdk.share.b.f52398a, true, 53212, new Class[]{IShareService.SharePage.class, Integer.TYPE}, IShareService.SharePage.class)) {
            Object[] objArr3 = {sharePage, 0};
            IShareService.SharePage sharePage2 = (IShareService.SharePage) PatchProxy.accessDispatch(objArr3, null, com.ss.android.ugc.aweme.im.sdk.share.b.f52398a, true, 53212, new Class[]{IShareService.SharePage.class, Integer.TYPE}, IShareService.SharePage.class);
        } else {
            sharePage.setShareItemVisible("chat_merge", 0);
        }
        if (i == 1) {
            if (PatchProxy.isSupport(new Object[]{activity, sharePage, 10, eVar, bVar}, null, com.ss.android.ugc.aweme.im.sdk.share.b.f52398a, true, 53211, new Class[]{Activity.class, IShareService.SharePage.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.a.e.class, com.ss.android.ugc.aweme.im.service.a.b.class}, IShareService.SharePage.class)) {
                Object[] objArr4 = {activity, sharePage, 10, eVar, bVar};
                IShareService.SharePage sharePage3 = (IShareService.SharePage) PatchProxy.accessDispatch(objArr4, null, com.ss.android.ugc.aweme.im.sdk.share.b.f52398a, true, 53211, new Class[]{Activity.class, IShareService.SharePage.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.a.e.class, com.ss.android.ugc.aweme.im.service.a.b.class}, IShareService.SharePage.class);
            } else {
                com.ss.android.ugc.aweme.im.sdk.share.a aVar = new com.ss.android.ugc.aweme.im.sdk.share.a(activity, sharePage, 10, eVar, bVar);
                sharePage.addShareViewInTop(aVar);
            }
        }
    }
}
