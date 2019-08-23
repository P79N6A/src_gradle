package com.ss.android.ugc.aweme.im;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.a.b;
import com.ss.android.ugc.aweme.im.service.a.e;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.c;
import com.ss.android.ugc.aweme.im.service.model.h;
import com.ss.android.ugc.aweme.im.service.session.a;
import java.io.File;
import java.io.Serializable;
import java.util.List;

public final class DefaultIMService implements IIMService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static DefaultIMService sInstance;

    public final void addGroupByPassword(String str) {
    }

    public final void addSessionListFragmentHeader(Fragment fragment, View view) {
    }

    public final void addShareHeadList(Activity activity, Object obj, int i, e eVar, b bVar) {
    }

    public final boolean canFetchFollowListIdle() {
        return false;
    }

    public final boolean checkGroupChatGuide(int i) {
        return false;
    }

    public final void cleanFeedUpdateCount(String str) {
    }

    public final void cleanUpdateTagCount(String str) {
    }

    public final boolean clearAudioDownloadCache() {
        return false;
    }

    public final void commandShareVideo(Context context, com.ss.android.ugc.aweme.im.service.model.b bVar) {
    }

    public final void commentReply(Context context, c cVar) {
    }

    public final String convertSearchKeyword(String str, String str2, String str3, String str4) {
        return null;
    }

    public final void deleteIMUser(String str) {
    }

    public final void deleteNoticeSession(a aVar) {
    }

    public final void directlyShare(Activity activity, Object obj, int i, b bVar) {
    }

    public final void enterChooseContact(Context context, Bundle bundle, com.ss.android.ugc.aweme.base.a<Boolean> aVar) {
    }

    public final boolean exitUser(String str) {
        return false;
    }

    public final void fetchFollowList() {
    }

    public final void forceRefreshSessionList() {
    }

    public final com.ss.android.ugc.aweme.im.service.b getAbInterface() {
        return null;
    }

    public final List<IMUser> getAllFollowIMUsers() {
        return null;
    }

    public final List<IMUser> getAllFriends() {
        return null;
    }

    public final File getAudioDownloadCachePath() {
        return null;
    }

    public final String getConversationId(String str) {
        return "";
    }

    public final IMUser getIMUserByUid(String str) {
        return null;
    }

    public final com.ss.android.websocket.b.c.b getImParser() {
        return null;
    }

    public final com.ss.android.ugc.aweme.im.service.b.a getInputMenuCustomizer() {
        return null;
    }

    public final a getNoticeSession(String str) {
        return null;
    }

    public final List<IMUser> getRecentIMUsers() {
        return null;
    }

    public final com.ss.android.ugc.aweme.im.service.c.a getRelationSelectFragment() {
        return null;
    }

    public final Class getSessionListActivityClass() {
        return null;
    }

    public final com.ss.android.ugc.aweme.im.service.c.a getSessionListFragment() {
        return null;
    }

    public final int getUpdateTagCount(String str) {
        return 0;
    }

    public final void initialize(Application application, com.ss.android.ugc.aweme.im.service.a aVar, com.ss.android.ugc.aweme.im.service.c cVar) {
    }

    public final boolean isXInstalled(Context context) {
        return false;
    }

    public final boolean isXPlanB() {
        return false;
    }

    public final boolean isXPlanOpen() {
        return false;
    }

    public final void markSessionInMsgHelperRead(int i, int i2) {
    }

    public final void onFlipChatConversationListFinish(Bundle bundle) {
    }

    public final void onFlipChatLastMsgUpdate(Bundle bundle) {
    }

    public final void onFlipChatMsgBind(Bundle bundle) {
    }

    public final void onFlipChatMsgUnbind(boolean z) {
    }

    public final void onFlipChatPushMsgUpdate(String str, long j) {
    }

    public final void onFlipChatUnreadCountUpdate(Bundle bundle) {
    }

    public final void onNewNoticeArrived(int i, Bundle bundle) {
    }

    public final void openSessionListActivity(Context context) {
    }

    public final void openX(Context context, int i) {
    }

    public final void refreshLoginState() {
    }

    public final void resetLoginState() {
    }

    public final void resetShareHeadListView(View view) {
    }

    public final List<IMUser> searchFollowIMUser(List<IMUser> list, String str) {
        return null;
    }

    public final void sendMutilMsg(String str, View view) {
    }

    public final void setAbInterface(com.ss.android.ugc.aweme.im.service.b bVar) {
    }

    public final void setImage(ImageView imageView, Object obj) {
    }

    public final void setInputMenuCustomizer(com.ss.android.ugc.aweme.im.service.b.a aVar) {
    }

    public final void showShareDialog(Activity activity, Object obj, IMUser iMUser, com.ss.android.ugc.aweme.base.a<Boolean> aVar) {
    }

    public final boolean startChat(Context context, IMContact iMContact) {
        return false;
    }

    public final boolean startChat(Context context, IMUser iMUser) {
        return false;
    }

    public final boolean startChat(Context context, IMUser iMUser, int i) {
        return false;
    }

    public final boolean startChatWithAdLog(Context context, IMUser iMUser, com.ss.android.ugc.aweme.im.service.model.a aVar) {
        return false;
    }

    public final boolean startChatWithAdLog(Context context, IMUser iMUser, com.ss.android.ugc.aweme.im.service.model.a aVar, Serializable serializable) {
        return false;
    }

    public final boolean startChatWithExt(Context context, IMUser iMUser, Serializable serializable) {
        return false;
    }

    public final void updateIMUser(IMUser iMUser) {
    }

    public final void updateIMUserFollowStatus(IMUser iMUser) {
    }

    public final void updateNoticeSession(a aVar) {
    }

    public final void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i) {
    }

    public final void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i, com.ss.android.ugc.aweme.im.service.model.a aVar) {
    }

    public final void wrapperIMShareIcon(Context context, RemoteImageView remoteImageView, int i, boolean z) {
    }

    public final void wrapperIMShareText(Context context, TextView textView) {
    }

    public final void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i) {
    }

    public final void wrapperShareToX(Activity activity, Bundle bundle, int i) {
    }

    public final void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable, com.ss.android.ugc.aweme.im.service.a.a aVar) {
    }

    public final void wrapperSyncXStory(Activity activity, h hVar, int i, com.ss.android.ugc.aweme.im.service.a.a aVar) {
    }

    private DefaultIMService() {
    }

    public static DefaultIMService inst() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 50018, new Class[0], DefaultIMService.class)) {
            return (DefaultIMService) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 50018, new Class[0], DefaultIMService.class);
        }
        if (sInstance == null) {
            synchronized (DefaultIMService.class) {
                if (sInstance == null) {
                    sInstance = new DefaultIMService();
                }
            }
        }
        return sInstance;
    }

    public final void wrapperSyncXBlockWithDialog(Context context, boolean z, DialogInterface.OnClickListener onClickListener) {
        Context context2 = context;
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0), onClickListener2}, this, changeQuickRedirect, false, 50021, new Class[]{Context.class, Boolean.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z), onClickListener2}, this, changeQuickRedirect, false, 50021, new Class[]{Context.class, Boolean.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE);
            return;
        }
        new a.C0185a(context2).b((int) C0906R.string.aph).a((int) C0906R.string.a0v, onClickListener2).b((int) C0906R.string.pm, onClickListener2).a().a();
    }

    public final void storyMessageReply(Context context, Bundle bundle, Runnable runnable, Runnable runnable2) {
        if (PatchProxy.isSupport(new Object[]{context, bundle, runnable, runnable2}, this, changeQuickRedirect, false, 50019, new Class[]{Context.class, Bundle.class, Runnable.class, Runnable.class}, Void.TYPE)) {
            Object[] objArr = {context, bundle, runnable, runnable2};
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 50019, new Class[]{Context.class, Bundle.class, Runnable.class, Runnable.class}, Void.TYPE);
            return;
        }
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), runnable}, this, changeQuickRedirect, false, 50020, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), Byte.valueOf(z), runnable}, this, changeQuickRedirect, false, 50020, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, Runnable.class}, Void.TYPE);
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
