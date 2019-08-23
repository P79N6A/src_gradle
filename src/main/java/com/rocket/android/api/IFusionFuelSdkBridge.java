package com.rocket.android.api;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.rocket.android.commonsdk.wschannel.FFWsMsg;
import com.rocket.android.model.FFMsgData;
import com.rocket.android.model.FFShareUserData;
import com.rocket.android.model.IFFRequestListener;
import com.rocket.android.model.LoginUserData;
import com.rocket.android.model.ShareData;
import com.rocket.android.model.UnReadCountData;
import com.ss.android.common.AppContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

@Keep
public interface IFusionFuelSdkBridge {
    void addAccountListener(AccountListener accountListener);

    List<FFShareUserData> getFFShareUserData();

    FFMsgData getLastMsg();

    LiveData<FFShareUserData> getLiveShareUserData(FFShareUserData fFShareUserData);

    LoginUserData getLoginUserData();

    void getRecommendShareData(IFFRequestListener<List<FFShareUserData>> iFFRequestListener);

    UnReadCountData getUnReadCount();

    void init(@NonNull Application application, @NonNull AppContext appContext, @NonNull IFusionFuelSdkDepend iFusionFuelSdkDepend, @Nullable ExecutorService executorService, @Nullable ExecutorService executorService2);

    void injectSettings(JSONObject jSONObject);

    boolean isFFSdkMute();

    boolean isSdkEnable();

    boolean isUserInfoFetched();

    void login();

    void logout();

    void notifyHostRecommendMeSwitch(boolean z);

    void onApplogUpdate();

    void onReceiveConnectEvent(int i, @NonNull JSONObject jSONObject);

    void onReceiverWsMsg(@NonNull FFWsMsg fFWsMsg);

    void openSchema(Context context, String str);

    void removeAccountListener(AccountListener accountListener);

    void shareMsg(List<FFShareUserData> list, ShareData shareData, String str, IFFRequestListener iFFRequestListener);

    void startCloudMsgClosed(@NonNull Context context);

    void startConversationList(@NonNull Activity activity);

    void startForwardActivity(ShareData shareData, String str, ArrayList<FFShareUserData> arrayList, Context context);

    void startPassportSetting(@NonNull Context context);
}
