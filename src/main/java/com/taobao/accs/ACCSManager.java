package com.taobao.accs;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.internal.ACCSManagerImpl;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.k;
import java.io.Serializable;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class ACCSManager {
    public static Map<String, b> mAccsInstances = new ConcurrentHashMap(2);
    public static Context mContext = null;
    public static String mDefaultAppkey = null;
    public static String mDefaultConfigTag = "default";
    public static int mEnv;

    public static class AccsRequest implements Serializable {
        public String businessId;
        public byte[] data;
        public String dataId;
        public URL host;
        public boolean isUnitBusiness;
        public String serviceId;
        public String tag;
        public String target;
        public String targetServiceName;
        public int timeout;
        public String userId;

        public void setBusinessId(String str) {
            this.businessId = str;
        }

        public void setHost(URL url) {
            this.host = url;
        }

        public void setIsUnitBusiness(boolean z) {
            this.isUnitBusiness = z;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setTarget(String str) {
            this.target = str;
        }

        public void setTargetServiceName(String str) {
            this.targetServiceName = str;
        }

        public void setTimeOut(int i) {
            this.timeout = i;
        }

        public AccsRequest(String str, String str2, byte[] bArr, String str3) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
        }

        public AccsRequest(String str, String str2, byte[] bArr, String str3, String str4, URL url, String str5) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
            this.target = str4;
            this.host = url;
            this.businessId = str5;
        }
    }

    @Deprecated
    public static String getUserUnit(Context context) {
        return null;
    }

    @Deprecated
    public static void setServiceListener(Context context, String str, IServiceReceiver iServiceReceiver) {
    }

    @Deprecated
    public static void unbindApp(Context context) {
    }

    private ACCSManager() {
    }

    public static String getDefaultConfig(Context context) {
        return mDefaultConfigTag;
    }

    @Deprecated
    public static void clearLoginInfoImpl(Context context) {
        getManagerImpl(context).e(context);
    }

    public static void forceDisableService(Context context) {
        getManagerImpl(context).c(context);
    }

    public static void forceEnableService(Context context) {
        getManagerImpl(context).d(context);
    }

    @Deprecated
    public static void unbindUser(Context context) {
        getManagerImpl(context).a(context);
    }

    @Deprecated
    public static Map<String, Boolean> forceReConnectChannel(Context context) throws Exception {
        return getManagerImpl(context).b();
    }

    @Deprecated
    public static Map<String, Boolean> getChannelState(Context context) throws Exception {
        return getManagerImpl(context).a();
    }

    @Deprecated
    public static boolean isNetworkReachable(Context context) {
        return getManagerImpl(context).b(context);
    }

    private static synchronized b getManagerImpl(Context context) {
        b accsInstance;
        synchronized (ACCSManager.class) {
            accsInstance = getAccsInstance(context, null, getDefaultConfig(context));
        }
        return accsInstance;
    }

    public static String[] getAppkey(Context context) {
        try {
            String string = c.a(context, "ACCS_SDK", 0).getString("appkey", null);
            ALog.i("ACCSManager", "getAppkey:" + string, new Object[0]);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return string.split("\\|");
        } catch (Throwable unused) {
            return null;
        }
    }

    @Deprecated
    public static String getDefaultAppkey(Context context) {
        if (TextUtils.isEmpty(mDefaultAppkey)) {
            ALog.e("ACCSManager", "old interface!!, please AccsManager.setAppkey() first!", new Object[0]);
            String b2 = k.b(context, "defaultAppkey", null);
            mDefaultAppkey = b2;
            if (TextUtils.isEmpty(b2)) {
                try {
                    mDefaultAppkey = SecurityGuardManager.getInstance(context).getStaticDataStoreComp().getAppKeyByIndex(0, null);
                } catch (Throwable th) {
                    ALog.e("ACCSManager", "getDefaultAppkey", th, new Object[0]);
                }
            }
            if (TextUtils.isEmpty(mDefaultAppkey)) {
                mDefaultAppkey = PushConstants.PUSH_TYPE_NOTIFY;
            }
        }
        return mDefaultAppkey;
    }

    @Deprecated
    public static void bindService(Context context, String str) {
        getManagerImpl(context).b(context, str);
    }

    @Deprecated
    public static void bindUser(Context context, String str) {
        bindUser(context, str, false);
    }

    protected static b createAccsInstance(Context context, String str) {
        return new ACCSManagerImpl(context, str);
    }

    @Deprecated
    public static void setLoginInfoImpl(Context context, ILoginInfo iLoginInfo) {
        getManagerImpl(context).a(context, iLoginInfo);
    }

    @Deprecated
    public static void unRegisterDataListener(Context context, String str) {
        getManagerImpl(context).e(context, str);
    }

    @Deprecated
    public static void unbindService(Context context, String str) {
        getManagerImpl(context).c(context, str);
    }

    @Deprecated
    public static void unregisterService(Context context, String str) {
        getManagerImpl(context).d(context, str);
    }

    @Deprecated
    public static boolean isChannelError(Context context, int i) {
        return getManagerImpl(context).a(i);
    }

    @Deprecated
    public static String sendData(Context context, AccsRequest accsRequest) {
        return getManagerImpl(context).a(context, accsRequest);
    }

    @Deprecated
    public static String sendRequest(Context context, AccsRequest accsRequest) {
        return getManagerImpl(context).b(context, accsRequest);
    }

    @Deprecated
    public static void setMode(Context context, int i) {
        mEnv = i;
        getManagerImpl(context).a(context, i);
    }

    @Deprecated
    public static void setDefaultConfig(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            ALog.i("ACCSManager", "setDefaultConfig", "configTag", str);
            mDefaultConfigTag = str;
        }
    }

    @Deprecated
    public static void registerSerivce(Context context, String str, String str2) {
        getManagerImpl(context).a(context, str, str2);
    }

    @Deprecated
    public static void setProxy(Context context, String str, int i) {
        getManagerImpl(context).a(context, str, i);
    }

    @Deprecated
    public static String sendPushResponse(Context context, AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        return getManagerImpl(context).a(context, accsRequest, extraInfo);
    }

    @Deprecated
    public static void bindUser(Context context, String str, boolean z) {
        if (!TextUtils.isEmpty(mDefaultAppkey)) {
            getManagerImpl(context).a(context, str, z);
            return;
        }
        throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
    }

    @Deprecated
    public static void registerDataListener(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        if (getManagerImpl(context) == null) {
            ALog.e("ACCSManager", "getManagerImpl null, return", new Object[0]);
        } else {
            getManagerImpl(context).a(context, str, accsAbstractDataListener);
        }
    }

    @Deprecated
    public static void setAppkey(Context context, String str, @AccsClientConfig.ENV int i) {
        k.a(context, str);
        mContext = context.getApplicationContext();
        mDefaultAppkey = str;
        k.a(mContext, "defaultAppkey", mDefaultAppkey);
        mEnv = i;
        AccsClientConfig.mEnv = i;
    }

    public static b getAccsInstance(Context context, String str, String str2) {
        b bVar;
        if (context == null || TextUtils.isEmpty(str2)) {
            ALog.e("ACCSManager", "getAccsInstance param null", "configTag", str2);
            return null;
        }
        String str3 = str2 + "|" + AccsClientConfig.mEnv;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("ACCSManager", "getAccsInstance", "key", str3);
        }
        b bVar2 = mAccsInstances.get(str3);
        if (bVar2 == null) {
            synchronized (ACCSManager.class) {
                if (bVar2 == null) {
                    try {
                        bVar = createAccsInstance(context, str2);
                    } catch (Exception e2) {
                        ALog.e("ACCSManager", "createAccsInstance error", e2.getMessage());
                        bVar = bVar2;
                    }
                    if (bVar != null) {
                        mAccsInstances.put(str3, bVar);
                    }
                    bVar2 = bVar;
                }
            }
        }
        return bVar2;
    }

    @Deprecated
    public static void bindApp(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        bindApp(context, mDefaultAppkey, "", str2, iAppReceiver);
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        startInAppConnection(context, mDefaultAppkey, "", str2, iAppReceiver);
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        k.a();
        getManagerImpl(context).b(context, mDefaultAppkey, str3, iAppReceiver);
    }

    @Deprecated
    public static void bindApp(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        if (!TextUtils.isEmpty(mDefaultAppkey)) {
            k.a();
            getManagerImpl(context).a(context, mDefaultAppkey, str3, iAppReceiver);
            return;
        }
        throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3) {
        return getManagerImpl(context).a(context, str, str2, bArr, str3);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3) {
        return sendRequest(context, str, str2, bArr, str3, null);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return getManagerImpl(context).a(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return getManagerImpl(context).b(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return getManagerImpl(context).a(context, str, str2, bArr, str3, str4, url);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return getManagerImpl(context).b(context, str, str2, bArr, str3, str4, url);
    }
}
