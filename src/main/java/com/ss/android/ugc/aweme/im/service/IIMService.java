package com.ss.android.ugc.aweme.im.service;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.krypton.annotation.OutService;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
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

@Keep
@OutService
public interface IIMService {
    void addGroupByPassword(String str);

    void addSessionListFragmentHeader(Fragment fragment, View view);

    void addShareHeadList(Activity activity, Object obj, int i, e eVar, b bVar);

    boolean canFetchFollowListIdle();

    boolean checkGroupChatGuide(int i);

    void cleanFeedUpdateCount(String str);

    void cleanUpdateTagCount(String str);

    boolean clearAudioDownloadCache();

    void commandShareVideo(Context context, com.ss.android.ugc.aweme.im.service.model.b bVar);

    void commentReply(Context context, c cVar);

    String convertSearchKeyword(String str, String str2, String str3, String str4);

    void deleteIMUser(String str);

    void deleteNoticeSession(a aVar);

    void directlyShare(Activity activity, Object obj, int i, b bVar);

    void enterChooseContact(Context context, Bundle bundle, com.ss.android.ugc.aweme.base.a<Boolean> aVar);

    boolean exitUser(String str);

    void fetchFollowList();

    void forceRefreshSessionList();

    b getAbInterface();

    List<IMUser> getAllFollowIMUsers();

    List<IMUser> getAllFriends();

    File getAudioDownloadCachePath();

    String getConversationId(String str);

    IMUser getIMUserByUid(String str);

    com.ss.android.websocket.b.c.b getImParser();

    com.ss.android.ugc.aweme.im.service.b.a getInputMenuCustomizer();

    a getNoticeSession(String str);

    List<IMUser> getRecentIMUsers();

    com.ss.android.ugc.aweme.im.service.c.a getRelationSelectFragment();

    Class getSessionListActivityClass();

    com.ss.android.ugc.aweme.im.service.c.a getSessionListFragment();

    int getUpdateTagCount(String str);

    void initialize(Application application, a aVar, c cVar);

    boolean isXInstalled(Context context);

    boolean isXPlanB();

    boolean isXPlanOpen();

    void markSessionInMsgHelperRead(int i, int i2);

    void onFlipChatConversationListFinish(Bundle bundle);

    void onFlipChatLastMsgUpdate(Bundle bundle);

    void onFlipChatMsgBind(Bundle bundle);

    void onFlipChatMsgUnbind(boolean z);

    void onFlipChatPushMsgUpdate(String str, long j);

    void onFlipChatUnreadCountUpdate(Bundle bundle);

    void onNewNoticeArrived(int i, Bundle bundle);

    void openSessionListActivity(Context context);

    void openX(Context context, int i);

    void refreshLoginState();

    void resetLoginState();

    void resetShareHeadListView(View view);

    List<IMUser> searchFollowIMUser(List<IMUser> list, String str);

    void sendMutilMsg(String str, View view);

    void setAbInterface(b bVar);

    void setImage(ImageView imageView, Object obj);

    void setInputMenuCustomizer(com.ss.android.ugc.aweme.im.service.b.a aVar);

    void showShareDialog(Activity activity, Object obj, IMUser iMUser, com.ss.android.ugc.aweme.base.a<Boolean> aVar);

    boolean startChat(Context context, IMContact iMContact);

    boolean startChat(Context context, IMUser iMUser);

    boolean startChat(Context context, IMUser iMUser, int i);

    boolean startChatWithAdLog(Context context, IMUser iMUser, com.ss.android.ugc.aweme.im.service.model.a aVar);

    boolean startChatWithAdLog(Context context, IMUser iMUser, com.ss.android.ugc.aweme.im.service.model.a aVar, Serializable serializable);

    boolean startChatWithExt(Context context, IMUser iMUser, Serializable serializable);

    void storyMessageReply(Context context, Bundle bundle, Runnable runnable, Runnable runnable2);

    void updateIMUser(IMUser iMUser);

    void updateIMUserFollowStatus(IMUser iMUser);

    void updateNoticeSession(a aVar);

    void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i);

    void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i, com.ss.android.ugc.aweme.im.service.model.a aVar);

    void wrapperIMShareIcon(Context context, RemoteImageView remoteImageView, int i, boolean z);

    void wrapperIMShareText(Context context, TextView textView);

    void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i);

    void wrapperShareToX(Activity activity, Bundle bundle, int i);

    void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable);

    void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable, com.ss.android.ugc.aweme.im.service.a.a aVar);

    void wrapperSyncXBlockWithDialog(Context context, boolean z, DialogInterface.OnClickListener onClickListener);

    void wrapperSyncXStory(Activity activity, h hVar, int i, com.ss.android.ugc.aweme.im.service.a.a aVar);
}
