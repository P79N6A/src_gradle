package com.rocket.android.api;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.rocket.android.commonsdk.wschannel.FFWsMsg;
import com.rocket.android.model.FFMsgData;
import com.rocket.android.model.ShareData;
import com.rocket.android.model.UnReadCountData;

@Keep
public interface IFusionFuelSdkDepend {
    void antiSpamReport(@NonNull Context context, @NonNull String str);

    boolean canRecommendMeToOthers();

    boolean canRecommendOthersToMe();

    boolean canUseHostPhoneContact();

    String getAppUserAvatar();

    String getAppUserName();

    String getDeviceFingerPrint();

    boolean goToLogin();

    void handleSchema(Context context, String str);

    void handleShareData(Context context, @NonNull ShareData shareData);

    boolean isWsConnected();

    boolean loadLibrary(@NonNull String str);

    void onAuthExpired();

    void onAuthNoBind();

    void onFFConversationListFinish();

    void onHostSessionExpired();

    void onLastMsgUpdate(FFMsgData fFMsgData);

    void onUnreadCountUpdate(UnReadCountData unReadCountData);

    void onUserUnBind();

    void openBrowserActivity(@NonNull Context context, @NonNull String str);

    byte[] secEncode(byte[] bArr);

    void sendMsg(@NonNull FFWsMsg fFWsMsg);

    void showRedBadge(int i);
}
