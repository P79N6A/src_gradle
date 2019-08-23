package com.rocket.android.api;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.common.utility.Logger;
import com.rocket.android.commonsdk.utils.ActivityStack;
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

public final class FusionFuelSdk {
    private static boolean hasInit;
    private static volatile IFusionFuelSdkBridge iFusionFuelSdkBridge;
    private static a pendingInitInfo;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Application f27363a;

        /* renamed from: b  reason: collision with root package name */
        final AppContext f27364b;

        /* renamed from: c  reason: collision with root package name */
        final IFusionFuelSdkDepend f27365c;

        /* renamed from: d  reason: collision with root package name */
        final ExecutorService f27366d;

        /* renamed from: e  reason: collision with root package name */
        final ExecutorService f27367e;

        a(Application application, AppContext appContext, IFusionFuelSdkDepend iFusionFuelSdkDepend, ExecutorService executorService, ExecutorService executorService2) {
            this.f27363a = application;
            this.f27364b = appContext;
            this.f27365c = iFusionFuelSdkDepend;
            this.f27366d = executorService;
            this.f27367e = executorService2;
        }
    }

    public static List<FFShareUserData> getFFShareUserData() {
        if (ensureInit()) {
            return iFusionFuelSdkBridge.getFFShareUserData();
        }
        return null;
    }

    public static FFMsgData getLastMsg() {
        if (!ensureInit()) {
            return null;
        }
        return iFusionFuelSdkBridge.getLastMsg();
    }

    public static LoginUserData getLoginUserData() {
        if (ensureInit()) {
            return iFusionFuelSdkBridge.getLoginUserData();
        }
        return null;
    }

    public static boolean isFusionFuelAvailable() {
        if (loadBridgeIfNeed() != null) {
            return true;
        }
        return false;
    }

    public static boolean isSdkEnable() {
        if (ensureInit()) {
            return iFusionFuelSdkBridge.isSdkEnable();
        }
        return false;
    }

    public static boolean isUserInfoFetched() {
        if (ensureInit()) {
            return iFusionFuelSdkBridge.isUserInfoFetched();
        }
        return false;
    }

    public static void login() {
        if (ensureInit()) {
            iFusionFuelSdkBridge.login();
        }
    }

    public static void logout() {
        if (ensureInit()) {
            iFusionFuelSdkBridge.logout();
        }
    }

    public static void onApplogUpdate() {
        if (ensureInit()) {
            iFusionFuelSdkBridge.onApplogUpdate();
        }
    }

    public static int getMsgUnReadCount() {
        if (ensureInit() && iFusionFuelSdkBridge.getUnReadCount() != null) {
            try {
                return (int) iFusionFuelSdkBridge.getUnReadCount().unReadMgsCount;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    private static IFusionFuelSdkBridge loadBridgeIfNeed() {
        if (iFusionFuelSdkBridge == null) {
            synchronized (FusionFuelSdk.class) {
                if (iFusionFuelSdkBridge == null) {
                    iFusionFuelSdkBridge = loadClass();
                }
            }
        }
        return iFusionFuelSdkBridge;
    }

    private static IFusionFuelSdkBridge loadClass() {
        try {
            Object obj = Class.forName("com.rocket.android.conversation.fusion.fuel.FusionFuelSdkBridge").getField("INSTANCE").get(null);
            if (obj instanceof IFusionFuelSdkBridge) {
                return (IFusionFuelSdkBridge) obj;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static UnReadCountData getMsgUnReadCountData() {
        if (ensureInit() && iFusionFuelSdkBridge.getUnReadCount() != null) {
            try {
                return iFusionFuelSdkBridge.getUnReadCount();
            } catch (Exception unused) {
            }
        }
        UnReadCountData unReadCountData = new UnReadCountData(0, 0, 0, 0);
        return unReadCountData;
    }

    private static synchronized boolean ensureInit() {
        synchronized (FusionFuelSdk.class) {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            if (hasInit) {
                return true;
            }
            if (pendingInitInfo != null) {
                IFusionFuelSdkBridge loadBridgeIfNeed = loadBridgeIfNeed();
                if (loadBridgeIfNeed != null) {
                    loadBridgeIfNeed.init(pendingInitInfo.f27363a, pendingInitInfo.f27364b, pendingInitInfo.f27365c, pendingInitInfo.f27366d, pendingInitInfo.f27367e);
                    pendingInitInfo = null;
                    hasInit = true;
                    return true;
                }
            }
            Logger.debug();
            return false;
        }
    }

    public static void addAccountListener(AccountListener accountListener) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.addAccountListener(accountListener);
        }
    }

    public static LiveData<FFShareUserData> getLiveShareUserData(FFShareUserData fFShareUserData) {
        if (ensureInit()) {
            return iFusionFuelSdkBridge.getLiveShareUserData(fFShareUserData);
        }
        return null;
    }

    public static void getRecommendShareData(IFFRequestListener<List<FFShareUserData>> iFFRequestListener) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.getRecommendShareData(iFFRequestListener);
        }
    }

    public static void injectSettings(JSONObject jSONObject) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.injectSettings(jSONObject);
        }
    }

    public static void onReceiverWsMsg(@NonNull FFWsMsg fFWsMsg) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.onReceiverWsMsg(fFWsMsg);
        }
    }

    public static void removeAccountListener(AccountListener accountListener) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.removeAccountListener(accountListener);
        }
    }

    public static void setHostRecommendMeSwitchStatus(boolean z) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.notifyHostRecommendMeSwitch(z);
        }
    }

    public static void startCloudMsgClosedActivity(Context context) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.startCloudMsgClosed(context);
        }
    }

    public static void startConversationList(@NonNull Activity activity) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.startConversationList(activity);
        }
    }

    public static void startPassportSetting(@NonNull Context context) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.startPassportSetting(context);
        }
    }

    public static void onReceiveConnectEvent(int i, @NonNull JSONObject jSONObject) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.onReceiveConnectEvent(i, jSONObject);
        }
    }

    public static void openSchema(Context context, String str) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.openSchema(context, str);
        }
    }

    public static void shareMsg(List<FFShareUserData> list, ShareData shareData, String str, IFFRequestListener iFFRequestListener) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.shareMsg(list, shareData, str, iFFRequestListener);
        }
    }

    public static void startForwardActivity(ShareData shareData, String str, ArrayList<FFShareUserData> arrayList, Context context) {
        if (ensureInit()) {
            iFusionFuelSdkBridge.startForwardActivity(shareData, str, arrayList, context);
        }
    }

    public static void init(@NonNull Application application, @NonNull AppContext appContext, @NonNull IFusionFuelSdkDepend iFusionFuelSdkDepend, @Nullable ExecutorService executorService, @Nullable ExecutorService executorService2) {
        a aVar = new a(application, appContext, iFusionFuelSdkDepend, executorService, executorService2);
        pendingInitInfo = aVar;
        application.registerActivityLifecycleCallbacks(ActivityStack.lifecycleCallbacks);
    }
}
