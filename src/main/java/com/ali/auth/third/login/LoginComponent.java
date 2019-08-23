package com.ali.auth.third.login;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ali.auth.third.core.config.AuthOption;
import com.ali.auth.third.core.config.ConfigManager;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.cookies.LoginCookieUtils;
import com.ali.auth.third.core.model.HistoryAccount;
import com.ali.auth.third.core.model.LoginReturnData;
import com.ali.auth.third.core.model.RpcRequest;
import com.ali.auth.third.core.model.RpcResponse;
import com.ali.auth.third.core.rpc.protocol.RpcException;
import com.ali.auth.third.core.service.RpcService;
import com.ali.auth.third.core.service.StorageService;
import com.ali.auth.third.core.service.UserTrackerService;
import com.ali.auth.third.core.service.impl.CredentialManager;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.core.util.CommonUtils;
import com.ali.auth.third.core.util.JSONUtils;
import com.ali.auth.third.core.util.RSAKey;
import com.ali.auth.third.core.util.ResourceUtils;
import com.ali.auth.third.core.util.Rsa;
import com.ali.auth.third.core.util.SystemUtils;
import com.ali.auth.third.login.a.a;
import com.ali.auth.third.ui.LoginWebViewActivity;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginComponent {
    public static final LoginComponent INSTANCE = new LoginComponent();

    private LoginComponent() {
    }

    private String a(TreeMap<String, String> treeMap) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : treeMap.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                sb.append(str);
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public static void addKey(Map<String, String> map, String str, String str2) {
        map.put(str, str2);
    }

    public static RpcResponse<LoginReturnData> loginByRefreshToken() {
        long currentTimeMillis;
        String str;
        String deviceId;
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.target = "com.taobao.mtop.mLoginUnitService.autoLogin";
        rpcRequest.version = "1.0";
        try {
            String str2 = CredentialManager.INSTANCE.getInternalSession().user.userId;
            rpcRequest.addParam("userId", Long.valueOf(Long.parseLong(str2)));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appName", KernelContext.getAppKey());
            jSONObject.put("token", CredentialManager.INSTANCE.getInternalSession().autoLoginToken);
            jSONObject.put("sdkVersion", KernelContext.sdkVersion);
            jSONObject.put("t", currentTimeMillis);
            jSONObject.put("clientIp", CommonUtils.getLocalIPAddress());
            if (KernelContext.isMini) {
                str = "app_id";
                deviceId = KernelContext.getApplicationContext().getPackageName() + "|" + SystemUtils.getApkPublicKeyDigest();
            } else {
                str = "utdid";
                deviceId = ((RpcService) KernelContext.getService(RpcService.class)).getDeviceId();
            }
            jSONObject.put(str, deviceId);
            if (!TextUtils.isEmpty(str2)) {
                HistoryAccount findHistoryAccount = ((StorageService) KernelContext.getService(StorageService.class)).findHistoryAccount(str2);
                if (findHistoryAccount != null) {
                    String str3 = findHistoryAccount.tokenKey;
                    if (!TextUtils.isEmpty(str3)) {
                        TreeMap treeMap = new TreeMap();
                        addKey(treeMap, LoginConstants.KEY_APPKEY, KernelContext.getAppKey());
                        addKey(treeMap, LoginConstants.KEY_HAVANAID, findHistoryAccount.userId);
                        addKey(treeMap, LoginConstants.KEY_TIMESTAMP, String.valueOf(currentTimeMillis));
                        addKey(treeMap, LoginConstants.KEY_APPVERSION, CommonUtils.getAndroidAppVersion());
                        addKey(treeMap, LoginConstants.KEY_SDKVERSION, KernelContext.sdkVersion);
                        String signMap = ((StorageService) KernelContext.getService(StorageService.class)).signMap(str3, treeMap);
                        if (!TextUtils.isEmpty(signMap)) {
                            jSONObject.put("deviceTokenSign", signMap);
                            jSONObject.put("deviceTokenKey", str3);
                            jSONObject.put("hid", findHistoryAccount.userId);
                        }
                    }
                }
            }
            try {
                JSONObject keyValues = LoginCookieUtils.getKeyValues("alimm_");
                keyValues.put("miid", LoginCookieUtils.getValue("miid"));
                jSONObject.put("ext", keyValues);
            } catch (Exception unused) {
            }
            rpcRequest.addParam("tokenInfo", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("umidToken", ((StorageService) KernelContext.getService(StorageService.class)).getUmid());
            rpcRequest.addParam("riskControlInfo", jSONObject2);
            rpcRequest.addParam("ext", new JSONObject());
        } catch (Exception | JSONException unused2) {
        }
        return ((RpcService) KernelContext.getService(RpcService.class)).invoke(rpcRequest, LoginReturnData.class);
    }

    public static RpcResponse<String> logout() {
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.target = "mtop.taobao.havana.mlogin.logout";
        rpcRequest.version = "1.0";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appKey", KernelContext.getAppKey());
            jSONObject.put("sid", CredentialManager.INSTANCE.getInternalSession().sid);
            jSONObject.put("ip", CommonUtils.getLocalIPAddress());
            rpcRequest.addParam("userId", Long.valueOf(Long.parseLong(CredentialManager.INSTANCE.getInternalSession().user.userId)));
            rpcRequest.addParam("request", jSONObject);
        } catch (Exception unused) {
        }
        return ((RpcService) KernelContext.getService(RpcService.class)).invoke(rpcRequest, String.class);
    }

    public String generateTopAppLinkToken(String str) {
        ((UserTrackerService) KernelContext.getService(UserTrackerService.class)).send("GENERATE_TOPAPPLINK_TOKEN", null);
        TreeMap treeMap = new TreeMap();
        treeMap.put("appKey", KernelContext.getAppKey());
        treeMap.put("apkSign", str);
        treeMap.put("apiName", "taobao.oauth.code.create");
        String a2 = a(treeMap);
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.target = "com.alibaba.havana.login.applink.generateTopAppLinkToken";
        rpcRequest.version = "1.0";
        String appKey = KernelContext.getAppKey();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appName", appKey);
            jSONObject.put("t", System.currentTimeMillis());
            jSONObject.put("clientIp", CommonUtils.getLocalIPAddress());
            if (KernelContext.isMini) {
                jSONObject.put("app_id", KernelContext.getApplicationContext().getPackageName() + "|" + SystemUtils.getApkPublicKeyDigest());
            }
            jSONObject.put("sdkVersion", KernelContext.sdkVersion);
            rpcRequest.addParam("baseInfo", jSONObject);
        } catch (JSONException unused) {
        }
        rpcRequest.addParam(PushConstants.CONTENT, a2);
        try {
            RpcResponse<String> invoke = ((RpcService) KernelContext.getService(RpcService.class)).invoke(rpcRequest, String.class);
            if (invoke != null) {
                return (String) invoke.returnValue;
            }
        } catch (RpcException unused2) {
        }
        return null;
    }

    public RpcResponse<LoginReturnData> loginByCode(String str) {
        String str2;
        String deviceId;
        try {
            ((UserTrackerService) KernelContext.getService(UserTrackerService.class)).send("TOP_TOKEN_LOGIN", null);
            RpcRequest rpcRequest = new RpcRequest();
            rpcRequest.target = "com.taobao.mtop.mloginService.topTokenLogin";
            rpcRequest.version = "1.0";
            try {
                JSONObject jSONObject = new JSONObject();
                if (KernelContext.isMini) {
                    str2 = "app_id";
                    deviceId = KernelContext.getApplicationContext().getPackageName() + "|" + SystemUtils.getApkPublicKeyDigest();
                } else {
                    str2 = "utdid";
                    deviceId = ((RpcService) KernelContext.getService(RpcService.class)).getDeviceId();
                }
                jSONObject.put(str2, deviceId);
                jSONObject.put("appName", KernelContext.getAppKey());
                jSONObject.put("token", str);
                jSONObject.put("t", System.currentTimeMillis());
                jSONObject.put("sdkVersion", KernelContext.sdkVersion);
                jSONObject.put("clientIp", CommonUtils.getLocalIPAddress());
                try {
                    JSONObject keyValues = LoginCookieUtils.getKeyValues("alimm_");
                    keyValues.put("miid", LoginCookieUtils.getValue("miid"));
                    jSONObject.put("ext", keyValues);
                } catch (Exception unused) {
                }
                rpcRequest.addParam("tokenInfo", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("umidToken", ((StorageService) KernelContext.getService(StorageService.class)).getUmid());
                rpcRequest.addParam("riskControlInfo", jSONObject2);
                rpcRequest.addParam("ext", new JSONObject());
            } catch (JSONException unused2) {
            }
            return ((RpcService) KernelContext.getService(RpcService.class)).invoke(rpcRequest, LoginReturnData.class);
        } catch (Exception unused3) {
            return null;
        }
    }

    public RpcResponse<LoginReturnData> loginByIVToken(String str, String str2, String str3) {
        String str4;
        String deviceId;
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.target = "com.taobao.mtop.mloginService.mloginTokenLogin";
        rpcRequest.version = "1.0";
        try {
            JSONObject jSONObject = new JSONObject();
            if (KernelContext.isMini) {
                str4 = "app_id";
                deviceId = KernelContext.getApplicationContext().getPackageName() + "|" + SystemUtils.getApkPublicKeyDigest();
            } else {
                str4 = "utdid";
                deviceId = ((RpcService) KernelContext.getService(RpcService.class)).getDeviceId();
            }
            jSONObject.put(str4, deviceId);
            jSONObject.put("appName", KernelContext.getAppKey());
            jSONObject.put("token", str);
            jSONObject.put("t", System.currentTimeMillis());
            jSONObject.put("scene", str2);
            jSONObject.put("sdkVersion", KernelContext.sdkVersion);
            jSONObject.put("clientIp", CommonUtils.getLocalIPAddress());
            try {
                JSONObject keyValues = LoginCookieUtils.getKeyValues("alimm_");
                keyValues.put("miid", LoginCookieUtils.getValue("miid"));
                keyValues.put("aliusersdk_h5querystring", str3.toString());
                jSONObject.put("ext", keyValues);
            } catch (Exception unused) {
            }
            rpcRequest.addParam("tokenInfo", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("umidToken", ((StorageService) KernelContext.getService(StorageService.class)).getUmid());
            rpcRequest.addParam("riskControlInfo", jSONObject2);
            rpcRequest.addParam("ext", JSONUtils.toJsonObject(new HashMap()));
        } catch (JSONException unused2) {
        }
        return a.f5014d.invoke(rpcRequest, LoginReturnData.class);
    }

    public RpcResponse<LoginReturnData> loginByUserName(String str) {
        String str2;
        String deviceId;
        RpcRequest rpcRequest = new RpcRequest();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = JSONUtils.optString(jSONObject, "loginid");
            if (TextUtils.isEmpty(optString)) {
                optString = JSONUtils.optString(jSONObject, "loginId");
            }
            rpcRequest.target = "com.taobao.mtop.mloginService.login";
            rpcRequest.version = "1.0";
            JSONObject jSONObject2 = new JSONObject();
            if (KernelContext.isMini) {
                str2 = "app_id";
                deviceId = KernelContext.getApplicationContext().getPackageName() + "|" + SystemUtils.getApkPublicKeyDigest();
            } else {
                str2 = "utdid";
                deviceId = ((RpcService) KernelContext.getService(RpcService.class)).getDeviceId();
            }
            jSONObject2.put(str2, deviceId);
            jSONObject2.put("appName", KernelContext.getAppKey());
            jSONObject2.put("loginId", optString);
            jSONObject2.put("clientIp", CommonUtils.getLocalIPAddress());
            long currentTimeMillis = System.currentTimeMillis();
            if (!TextUtils.isEmpty(optString)) {
                HistoryAccount matchHistoryAccount = ((StorageService) KernelContext.getService(StorageService.class)).matchHistoryAccount(optString);
                if (matchHistoryAccount != null) {
                    String str3 = matchHistoryAccount.tokenKey;
                    if (!TextUtils.isEmpty(str3)) {
                        TreeMap treeMap = new TreeMap();
                        addKey(treeMap, LoginConstants.KEY_APPKEY, KernelContext.getAppKey());
                        addKey(treeMap, LoginConstants.KEY_HAVANAID, matchHistoryAccount.userId);
                        addKey(treeMap, LoginConstants.KEY_TIMESTAMP, String.valueOf(currentTimeMillis));
                        addKey(treeMap, LoginConstants.KEY_APPVERSION, CommonUtils.getAndroidAppVersion());
                        addKey(treeMap, LoginConstants.KEY_SDKVERSION, KernelContext.sdkVersion);
                        String signMap = ((StorageService) KernelContext.getService(StorageService.class)).signMap(str3, treeMap);
                        if (!TextUtils.isEmpty(signMap)) {
                            jSONObject2.put("deviceTokenSign", signMap);
                            jSONObject2.put("deviceTokenKey", str3);
                            jSONObject2.put("hid", matchHistoryAccount.userId);
                        }
                    }
                }
            }
            jSONObject2.put("password", Rsa.encrypt(JSONUtils.optString(jSONObject, "password"), RSAKey.getRsaPubkey()));
            jSONObject2.put("pwdEncrypted", true);
            jSONObject2.put("appVersion", CommonUtils.getAndroidAppVersion());
            jSONObject2.put("sdkVersion", KernelContext.sdkVersion);
            jSONObject2.put("t", currentTimeMillis);
            jSONObject2.put("ccId", JSONUtils.optString(jSONObject, "checkCodeId"));
            jSONObject2.put("checkCode", JSONUtils.optString(jSONObject, "checkCode"));
            try {
                JSONObject keyValues = LoginCookieUtils.getKeyValues("alimm_");
                keyValues.put("miid", LoginCookieUtils.getValue("miid"));
                jSONObject2.put("ext", keyValues);
            } catch (Exception unused) {
            }
            rpcRequest.addParam("loginInfo", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            if (KernelContext.isMini) {
                String optString2 = JSONUtils.optString(jSONObject, "umidtoken");
                jSONObject3.put("umidToken", optString2);
                ((StorageService) KernelContext.getService(StorageService.class)).setUmid(optString2);
            } else {
                jSONObject3.put("umidToken", ((StorageService) KernelContext.getService(StorageService.class)).getUmid());
            }
            jSONObject3.put("ua", JSONUtils.optString(jSONObject, "ua"));
            rpcRequest.addParam("riskControlInfo", jSONObject3);
            rpcRequest.addParam("ext", new JSONObject());
        } catch (JSONException unused2) {
        }
        return ((RpcService) KernelContext.getService(RpcService.class)).invoke(rpcRequest, LoginReturnData.class);
    }

    public void showH5Login(Activity activity) {
        SDKLogger.d("login", "open H5 login");
        Intent intent = new Intent(activity, LoginWebViewActivity.class);
        intent.putExtra(PushConstants.WEB_URL, ConfigManager.LOGIN_HOST);
        intent.putExtra(PushConstants.TITLE, ResourceUtils.getString(activity.getApplicationContext(), "com_taobao_tae_sdk_authorize_title"));
        activity.startActivityForResult(intent, RequestCode.OPEN_H5_LOGIN);
    }

    public void showLogin(Activity activity) {
        SDKLogger.d("login", "showLogin");
        if (KernelContext.authOption == AuthOption.H5ONLY) {
            showH5Login(activity);
        } else {
            new a(this, SystemUtils.getApkSignNumber(), activity).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        }
    }
}
