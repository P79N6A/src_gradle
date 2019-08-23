package com.umeng.message;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.IRegister;
import com.taobao.agoo.TaobaoRegister;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.UTrack;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.common.d;
import com.umeng.message.proguard.h;
import com.umeng.message.proguard.k;
import com.umeng.message.service.UMJobIntentService;
import com.umeng.message.tag.TagManager;
import com.umeng.message.util.b;
import java.util.Random;
import org.android.spdy.SpdyAgent;

public class PushAgent {
    public static boolean DEBUG = false;
    public static final String TAG = "com.umeng.message.PushAgent";
    private static boolean sAppLaunchBy;
    private static PushAgent singleton;
    private Handler handler;
    private UHandler mAd;
    public Context mContext;
    private UHandler mMessageHandler;
    private UHandler mNotificationClickHandler;
    private boolean mPushCheck;
    private IUmengRegisterCallback mRegisterCallback;
    private TagManager mTagMgr;
    private IUmengCallback mUnregisterCallback;
    private boolean powerMode = true;

    public static void setAppLaunchByMessage() {
        sAppLaunchBy = true;
    }

    private boolean getPowerMode() {
        return this.powerMode;
    }

    public static boolean isAppLaunchByMessage() {
        return sAppLaunchBy;
    }

    public UHandler getAdHandler() {
        return this.mAd;
    }

    public IUmengCallback getCallback() {
        return this.mUnregisterCallback;
    }

    public UHandler getMessageHandler() {
        return this.mMessageHandler;
    }

    public UHandler getNotificationClickHandler() {
        return this.mNotificationClickHandler;
    }

    public IUmengRegisterCallback getRegisterCallback() {
        return this.mRegisterCallback;
    }

    public TagManager getTagManager() {
        return this.mTagMgr;
    }

    public boolean isPushCheck() {
        return this.mPushCheck;
    }

    private PushAgent() {
    }

    public int getDisplayNotificationNumber() {
        return MessageSharedPrefs.getInstance(this.mContext).getDisplayNotificationNumber();
    }

    public String getMessageAppkey() {
        return MessageSharedPrefs.getInstance(this.mContext).getMessageAppKey();
    }

    public int getMuteDurationSeconds() {
        return MessageSharedPrefs.getInstance(this.mContext).getMuteDuration();
    }

    public int getNoDisturbEndHour() {
        return MessageSharedPrefs.getInstance(this.mContext).c();
    }

    public int getNoDisturbEndMinute() {
        return MessageSharedPrefs.getInstance(this.mContext).d();
    }

    public int getNoDisturbStartHour() {
        return MessageSharedPrefs.getInstance(this.mContext).a();
    }

    public int getNoDisturbStartMinute() {
        return MessageSharedPrefs.getInstance(this.mContext).b();
    }

    public String getNotificationChannelName() {
        return MessageSharedPrefs.getInstance(this.mContext).h();
    }

    public boolean getNotificationOnForeground() {
        return MessageSharedPrefs.getInstance(this.mContext).getNotificaitonOnForeground();
    }

    public int getNotificationPlayLights() {
        return MessageSharedPrefs.getInstance(this.mContext).getNotificationPlayLights();
    }

    public int getNotificationPlaySound() {
        return MessageSharedPrefs.getInstance(this.mContext).getNotificationPlaySound();
    }

    public int getNotificationPlayVibrate() {
        return MessageSharedPrefs.getInstance(this.mContext).getNotificationPlayVibrate();
    }

    public String getPushIntentServiceClass() {
        return MessageSharedPrefs.getInstance(this.mContext).getPushIntentServiceClass();
    }

    public String getRegistrationId() {
        return MessageSharedPrefs.getInstance(this.mContext).getDeviceToken();
    }

    public String getResourcePackageName() {
        return MessageSharedPrefs.getInstance(this.mContext).getResourcePackageName();
    }

    public boolean isIncludesUmengUpdateSDK() {
        Class<?> cls;
        try {
            cls = Class.forName("com.umeng.update.UmengUpdateAgent");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            return true;
        }
        return false;
    }

    private void disable() {
        try {
            TaobaoRegister.unbindAgoo(this.mContext, new ICallback() {
                public void onSuccess() {
                    UMLog.mutlInfo(PushAgent.TAG, 2, "关闭推送成功");
                    Intent intent = new Intent();
                    intent.setPackage(PushAgent.this.mContext.getPackageName());
                    intent.setAction("com.umeng.message.disablecallback.action");
                    intent.putExtra("status", true);
                    UMJobIntentService.enqueueWork(PushAgent.this.mContext, UmengMessageCallbackHandlerService.class, intent);
                }

                public void onFailure(String str, String str2) {
                    String str3 = PushAgent.TAG;
                    UMLog.mutlInfo(str3, 0, "关闭推送失败-->s:" + str + ",s1:" + str2);
                    Intent intent = new Intent();
                    intent.setPackage(PushAgent.this.mContext.getPackageName());
                    intent.setAction("com.umeng.message.disablecallback.action");
                    intent.putExtra("status", false);
                    intent.putExtra(NotifyType.SOUND, str);
                    intent.putExtra("s1", str2);
                    UMJobIntentService.enqueueWork(PushAgent.this.mContext, UmengMessageCallbackHandlerService.class, intent);
                }
            });
        } catch (Exception unused) {
            UMLog.mutlInfo(TAG, 0, "关闭推送失败");
        }
    }

    private void enable() {
        try {
            TaobaoRegister.bindAgoo(this.mContext, new ICallback() {
                public void onSuccess() {
                    UMLog.mutlInfo(PushAgent.TAG, 2, "开启推送成功");
                    Intent intent = new Intent();
                    intent.setPackage(PushAgent.this.mContext.getPackageName());
                    intent.setAction("com.umeng.message.enablecallback.action");
                    intent.putExtra("status", true);
                    UMJobIntentService.enqueueWork(PushAgent.this.mContext, UmengMessageCallbackHandlerService.class, intent);
                }

                public void onFailure(String str, String str2) {
                    String str3 = PushAgent.TAG;
                    UMLog.mutlInfo(str3, 2, "开启推送失败-->s:" + str + ",s1:" + str2);
                    Intent intent = new Intent();
                    intent.setPackage(PushAgent.this.mContext.getPackageName());
                    intent.setAction("com.umeng.message.enablecallback.action");
                    intent.putExtra("status", false);
                    intent.putExtra(NotifyType.SOUND, str);
                    intent.putExtra("s1", str2);
                    UMJobIntentService.enqueueWork(PushAgent.this.mContext, UmengMessageCallbackHandlerService.class, intent);
                }
            });
        } catch (Exception unused) {
            UMLog.mutlInfo(TAG, 0, "开启推送失败");
        }
    }

    public String getMessageChannel() {
        String messageChannel = MessageSharedPrefs.getInstance(this.mContext).getMessageChannel();
        if (TextUtils.isEmpty(messageChannel)) {
            return UmengMessageDeviceConfig.getChannel(this.mContext);
        }
        return messageChannel;
    }

    public String getMessageSecret() {
        String messageAppSecret = MessageSharedPrefs.getInstance(this.mContext).getMessageAppSecret();
        if (TextUtils.isEmpty(messageAppSecret)) {
            return UmengMessageDeviceConfig.getMetaData(this.mContext, "UMENG_MESSAGE_SECRET");
        }
        return messageAppSecret;
    }

    public void onAppStart() {
        long j;
        UTrack.getInstance(this.mContext).trackAppLaunch(10000);
        if (isAppLaunchByMessage()) {
            j = Math.abs(new Random().nextLong() % MsgConstant.f81065b);
        } else {
            j = 0;
        }
        UTrack.getInstance(this.mContext).sendCachedMsgLog(j);
    }

    private void register() {
        try {
            if (Build.VERSION.SDK_INT < 14) {
                UMLog.mutlInfo(TAG, 0, "U-Push最低支持的系统版本为Android 4.0");
            } else if (!h.a(this.mContext, this.handler)) {
                UMLog.mutlInfo(TAG, 0, "AndroidManifest权限或参数错误");
            } else {
                UMLog.mutlInfo(TAG, 2, "AndroidManifest配置正确、参数正确");
                if (!TextUtils.isEmpty(getMessageAppkey())) {
                    if (!TextUtils.isEmpty(getMessageSecret())) {
                        h.a(this.mContext, UmengMessageCallbackHandlerService.class);
                        if (DEBUG) {
                            h.b(this.mContext, this.handler);
                        }
                        ALog.setUseTlog(false);
                        anet.channel.util.ALog.setUseTlog(false);
                        AwcnConfig.setAccsSessionCreateForbiddenInBg(false);
                        ACCSClient.setEnvironment(this.mContext, 0);
                        AccsClientConfig.Builder builder = new AccsClientConfig.Builder();
                        ACCSClient.init(this.mContext, builder.setAppKey("umeng:" + getMessageAppkey()).setAppSecret(getMessageSecret()).setInappHost("umengacs.m.taobao.com").setInappPubKey(11).setChannelHost("umengjmacs.m.taobao.com").setChannelPubKey(11).setKeepAlive(getPowerMode()).setAutoUnit(false).build());
                        DispatchConstants.setAmdcServerDomain(new String[]{"amdcopen.m.taobao.com", "amdc.wapa.taobao.com", "amdc.taobao.net"});
                        DispatchConstants.setAmdcServerFixIp(new String[][]{new String[]{"106.11.61.135", "106.11.61.137"}, null, null});
                        if (UmengMessageDeviceConfig.isMiui8()) {
                            TaobaoRegister.setAgooMsgReceiveService("com.umeng.message.XiaomiIntentService");
                        } else {
                            TaobaoRegister.setAgooMsgReceiveService("com.umeng.message.UmengIntentService");
                        }
                        d.a(new Runnable() {
                            public void run() {
                                String str;
                                String messageSecret = PushAgent.this.getMessageSecret();
                                String str2 = PushAgent.TAG;
                                UMLog.mutlInfo(str2, 2, "appkey:" + str + ",secret:" + messageSecret);
                                try {
                                    TaobaoRegister.register(PushAgent.this.mContext, str, messageSecret, "android@umeng", new IRegister() {
                                        public void onSuccess(String str) {
                                            String str2 = PushAgent.TAG;
                                            UMLog.mutlInfo(str2, 2, "注册成功:" + str);
                                            PushAgent.this.registerSuccesss(str);
                                        }

                                        public void onFailure(String str, String str2) {
                                            String str3 = PushAgent.TAG;
                                            UMLog.mutlInfo(str3, 0, "注册失败-->s:" + str + ",s1:" + str2);
                                            PushAgent.this.registerFailure(str, str2);
                                            UMLog.aq(k.f81297a, 0, "\\|");
                                        }
                                    });
                                } catch (AccsException unused) {
                                    UMLog.mutlInfo(PushAgent.TAG, 0, "注册失败");
                                }
                            }
                        });
                        return;
                    }
                }
                UMLog.mutlInfo(TAG, 0, "Appkey和Secret key均不能为空");
            }
        } catch (Exception unused) {
            UMLog.mutlInfo(TAG, 0, "注册失败");
        }
    }

    public void setCallback(IUmengCallback iUmengCallback) {
        this.mUnregisterCallback = iUmengCallback;
    }

    public void setMessageHandler(UHandler uHandler) {
        this.mMessageHandler = uHandler;
    }

    public void setNotificationClickHandler(UHandler uHandler) {
        this.mNotificationClickHandler = uHandler;
    }

    public void setPushCheck(boolean z) {
        this.mPushCheck = z;
    }

    public void setRegisterCallback(IUmengRegisterCallback iUmengRegisterCallback) {
        this.mRegisterCallback = iUmengRegisterCallback;
    }

    public void disable(IUmengCallback iUmengCallback) {
        setCallback(iUmengCallback);
        disable();
    }

    public void enable(IUmengCallback iUmengCallback) {
        setCallback(iUmengCallback);
        enable();
    }

    public void keepLowPowerMode(boolean z) {
        this.powerMode = !z;
    }

    public void register(IUmengRegisterCallback iUmengRegisterCallback) {
        setRegisterCallback(iUmengRegisterCallback);
        register();
    }

    private void setDebugMode(boolean z) {
        DEBUG = z;
        ALog.setPrintLog(z);
        anet.channel.util.ALog.setPrintLog(z);
        SpdyAgent.enableDebug = z;
    }

    public static synchronized PushAgent getInstance(Context context) {
        PushAgent pushAgent;
        synchronized (PushAgent.class) {
            if (singleton == null) {
                singleton = new PushAgent(context.getApplicationContext());
            }
            pushAgent = singleton;
        }
        return pushAgent;
    }

    @Deprecated
    private void setMessageChannel(String str) {
        System.currentTimeMillis();
        if (h.d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setMessageChannel(str);
            d.a(new Runnable() {
                public void run() {
                    UTrack.getInstance(PushAgent.this.mContext).updateHeader();
                }
            });
        }
    }

    public void setDisplayNotificationNumber(int i) {
        if (h.d(this.mContext) && i >= 0 && i <= 10) {
            MessageSharedPrefs.getInstance(this.mContext).setDisplayNotificationNumber(i);
        }
    }

    public void setMuteDurationSeconds(int i) {
        if (h.d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setMuteDuration(i);
        }
    }

    public void setNotificaitonOnForeground(boolean z) {
        if (h.d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setNotificaitonOnForeground(z);
        }
    }

    public void setNotificationChannelName(String str) {
        if (h.d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).b(str);
        }
    }

    public void setNotificationPlayLights(int i) {
        if (h.d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setNotificationPlayLights(i);
        }
    }

    public void setNotificationPlaySound(int i) {
        if (h.d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setNotificationPlaySound(i);
        }
    }

    public void setNotificationPlayVibrate(int i) {
        if (h.d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setNotificationPlayVibrate(i);
        }
    }

    public <U extends UmengMessageService> void setPushIntentServiceClass(Class<U> cls) {
        if (h.d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setPushIntentServiceClass(cls);
        }
    }

    public void setResourcePackageName(String str) {
        if (h.d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setResourcePackageName(str);
        }
    }

    @Deprecated
    private void setAppkey(String str) {
        if (h.d(this.mContext)) {
            if (str == null || str.equals("")) {
                UMLog.mutlInfo(TAG, 0, "appkey不能为null");
                return;
            }
            MessageSharedPrefs.getInstance(this.mContext).setMessageAppKey(str);
        }
    }

    @Deprecated
    private void setSecret(String str) {
        if (h.d(this.mContext)) {
            if (str == null || str.equals("")) {
                UMLog.mutlInfo(TAG, 0, "appSecret不能为null");
                return;
            }
            MessageSharedPrefs.getInstance(this.mContext).setMessageAppSecret(str);
        }
    }

    public void registerSuccesss(String str) {
        Intent intent = new Intent();
        intent.setPackage(this.mContext.getPackageName());
        intent.setAction("com.umeng.messge.registercallback.action");
        intent.putExtra("registration_id", str);
        intent.putExtra("status", true);
        UMJobIntentService.enqueueWork(this.mContext, UmengMessageCallbackHandlerService.class, intent);
    }

    private PushAgent(Context context) {
        try {
            this.mContext = context;
            this.mTagMgr = TagManager.getInstance(context);
            this.mMessageHandler = new UmengMessageHandler();
            this.mAd = new UmengAdHandler();
            this.mNotificationClickHandler = new UmengNotificationClickHandler();
            b.a(context);
        } catch (Exception e2) {
            UMLog.mutlInfo(TAG, 0, "PushAgent初始化失败", e2.getMessage());
        }
        this.handler = new Handler(context.getMainLooper()) {
            public void handleMessage(Message message) {
                super.handleMessage(message);
            }
        };
    }

    public void setEnableForground(Context context, boolean z) {
        GlobalConfig.setEnableForground(context, z);
    }

    public void registerFailure(String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage(this.mContext.getPackageName());
        intent.setAction("com.umeng.messge.registercallback.action");
        intent.putExtra("status", false);
        intent.putExtra(NotifyType.SOUND, str);
        intent.putExtra("s1", str2);
        UMJobIntentService.enqueueWork(this.mContext, UmengMessageCallbackHandlerService.class, intent);
    }

    @Deprecated
    private void setAppkeyAndSecret(String str, String str2) {
        if (h.d(this.mContext)) {
            String messageAppKey = MessageSharedPrefs.getInstance(this.mContext).getMessageAppKey();
            String messageAppSecret = MessageSharedPrefs.getInstance(this.mContext).getMessageAppSecret();
            if (!messageAppKey.equals(str) && !messageAppSecret.equals(str2)) {
                MessageSharedPrefs.getInstance(this.mContext).removeMessageAppKey();
                MessageSharedPrefs.getInstance(this.mContext).removeMessageAppSecret();
            }
            MessageSharedPrefs.getInstance(this.mContext).setMessageAppKey(str);
            MessageSharedPrefs.getInstance(this.mContext).setMessageAppSecret(str2);
            UTrack.getInstance(this.mContext).updateHeader();
        }
    }

    public void addAlias(String str, String str2, UTrack.ICallBack iCallBack) {
        UTrack.getInstance(this.mContext).addAlias(str, str2, iCallBack);
    }

    public void deleteAlias(String str, String str2, UTrack.ICallBack iCallBack) {
        UTrack.getInstance(this.mContext).deleteAlias(str, str2, iCallBack);
    }

    public void setAlias(String str, String str2, UTrack.ICallBack iCallBack) {
        UTrack.getInstance(this.mContext).setAlias(str, str2, iCallBack);
    }

    public void setNoDisturbMode(int i, int i2, int i3, int i4) {
        if (h.d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).a(i, i2, i3, i4);
        }
    }
}
