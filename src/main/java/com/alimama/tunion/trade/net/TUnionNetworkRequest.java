package com.alimama.tunion.trade.net;

import android.text.TextUtils;
import com.alimama.tunion.trade.BuildConfig;
import com.alimama.tunion.trade.TUnionTradeSDK;
import com.alimama.tunion.trade.convert.TUnionMediaParams;
import com.alimama.tunion.utils.TUnionPhoneInfoUtils;
import java.util.HashMap;
import java.util.Map;

public class TUnionNetworkRequest {

    /* renamed from: a  reason: collision with root package name */
    private String f5218a;

    /* renamed from: b  reason: collision with root package name */
    private String f5219b;

    /* renamed from: c  reason: collision with root package name */
    private String f5220c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5221d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5222e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5223f;
    private boolean g;
    private String h = "";
    private Map<String, String> i;
    private String j;
    private String k;
    private int l;
    private boolean m;
    private int n = -1;
    private boolean o = true;
    private Map<String, String> p;

    public String getMtopAccessToken() {
        return this.k;
    }

    public String getMtopApiName() {
        return this.f5219b;
    }

    public String getMtopApiVersion() {
        return this.f5220c;
    }

    public String getMtopAuthParams() {
        return this.h;
    }

    public Map<String, String> getMtopExtHeaders() {
        return this.i;
    }

    public String getMtopOpenAppKey() {
        return this.j;
    }

    public int getMtopRequestType() {
        return this.l;
    }

    public Map<String, String> getParamMap() {
        return this.p;
    }

    public int getTimeOut() {
        return this.n;
    }

    public String getUrlName() {
        return this.f5218a;
    }

    public boolean isMtopIsVip() {
        return this.m;
    }

    public boolean isMtopNeedAuth() {
        return this.f5222e;
    }

    public boolean isMtopNeedCache() {
        return this.g;
    }

    public boolean isMtopNeedLogin() {
        return this.f5221d;
    }

    public boolean isMtopNeedWua() {
        return this.f5223f;
    }

    public boolean isPost() {
        return this.o;
    }

    public void setMtopAccessToken(String str) {
        this.k = str;
    }

    public void setMtopApiName(String str) {
        this.f5219b = str;
    }

    public void setMtopApiVersion(String str) {
        this.f5220c = str;
    }

    public void setMtopAuthParams(String str) {
        this.h = str;
    }

    public void setMtopExtHeaders(Map<String, String> map) {
        this.i = map;
    }

    public void setMtopIsVip(boolean z) {
        this.m = z;
    }

    public void setMtopNeedAuth(boolean z) {
        this.f5222e = z;
    }

    public void setMtopNeedCache(boolean z) {
        this.g = z;
    }

    public void setMtopNeedLogin(boolean z) {
        this.f5221d = z;
    }

    public void setMtopNeedWua(boolean z) {
        this.f5223f = z;
    }

    public void setMtopOpenAppKey(String str) {
        this.j = str;
    }

    public void setMtopRequestType(int i2) {
        this.l = i2;
    }

    public void setParamMap(Map<String, String> map) {
        this.p = map;
    }

    public void setPost(boolean z) {
        this.o = z;
    }

    public void setTimeOut(int i2) {
        this.n = i2;
    }

    public void setUrlName(String str) {
        this.f5218a = str;
    }

    public static TUnionNetworkRequest createTokenRequest(String str) {
        TUnionNetworkRequest tUnionNetworkRequest = new TUnionNetworkRequest();
        tUnionNetworkRequest.setUrlName("https://tunion-api.m.taobao.com/token");
        tUnionNetworkRequest.setTimeOut(300000);
        tUnionNetworkRequest.setPost(true);
        tUnionNetworkRequest.setParamMap(a(str));
        return tUnionNetworkRequest;
    }

    private static Map<String, String> a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("userId", str);
        }
        String appkey = TUnionTradeSDK.getInstance().getAppkey();
        if (!TextUtils.isEmpty(appkey)) {
            hashMap.put("appkey", appkey);
        }
        return hashMap;
    }

    public static TUnionNetworkRequest createABTestRequest(boolean z) {
        TUnionNetworkRequest tUnionNetworkRequest = new TUnionNetworkRequest();
        tUnionNetworkRequest.setUrlName("https://tunion-api.m.taobao.com/config");
        tUnionNetworkRequest.setMtopApiName("mtop.taobao.tbk.sdk.config");
        tUnionNetworkRequest.setMtopApiVersion("1.0");
        tUnionNetworkRequest.setTimeOut(300000);
        if (z) {
            tUnionNetworkRequest.setPost(false);
        } else {
            tUnionNetworkRequest.setPost(true);
        }
        tUnionNetworkRequest.setParamMap(a(z));
        return tUnionNetworkRequest;
    }

    private static Map<String, String> a(boolean z) {
        HashMap hashMap = new HashMap();
        String aliApp = TUnionPhoneInfoUtils.getInstance().getAliApp();
        if (!TextUtils.isEmpty(aliApp)) {
            hashMap.put("aliapp", aliApp);
        } else {
            hashMap.put("aliapp", "");
        }
        if (!TextUtils.isEmpty(TUnionPhoneInfoUtils.getInstance().getMcid())) {
            hashMap.put("mcid", TUnionPhoneInfoUtils.getInstance().getMcid());
        }
        String appkey = TUnionTradeSDK.getInstance().getAppkey();
        if (!z && !TextUtils.isEmpty(appkey)) {
            hashMap.put("appkey", appkey);
        }
        StringBuilder sb = new StringBuilder("android");
        TUnionPhoneInfoUtils.getInstance();
        sb.append(TUnionPhoneInfoUtils.getSDKVersion());
        hashMap.put("os", sb.toString());
        TUnionPhoneInfoUtils.getInstance();
        hashMap.put("deviceModel", TUnionPhoneInfoUtils.getBuildModel());
        hashMap.put("packageName", TUnionPhoneInfoUtils.getInstance().getPackageName());
        hashMap.put("sdkVersion", BuildConfig.VERSION_NAME);
        hashMap.put("appVersion", TUnionPhoneInfoUtils.getInstance().getAppVersion());
        return hashMap;
    }

    public static TUnionNetworkRequest createConvertRequest(TUnionMediaParams tUnionMediaParams, boolean z) {
        TUnionNetworkRequest tUnionNetworkRequest = new TUnionNetworkRequest();
        tUnionNetworkRequest.setUrlName("https://tunion-api.m.taobao.com/convert");
        tUnionNetworkRequest.setMtopApiName("mtop.taobao.tbk.sdk.item.convert");
        tUnionNetworkRequest.setMtopApiVersion("1.0");
        tUnionNetworkRequest.setTimeOut(300000);
        if (z) {
            tUnionNetworkRequest.setPost(false);
        } else {
            tUnionNetworkRequest.setPost(true);
        }
        tUnionNetworkRequest.setParamMap(a(tUnionMediaParams, z));
        return tUnionNetworkRequest;
    }

    private static Map<String, String> a(TUnionMediaParams tUnionMediaParams, boolean z) {
        HashMap hashMap = new HashMap();
        String aliApp = TUnionPhoneInfoUtils.getInstance().getAliApp();
        if (!TextUtils.isEmpty(aliApp)) {
            hashMap.put("aliapp", aliApp);
        }
        if (!TextUtils.isEmpty(TUnionPhoneInfoUtils.getInstance().getCnaCookie())) {
            hashMap.put("acookie", TUnionPhoneInfoUtils.getInstance().getCnaCookie());
        }
        if (!TextUtils.isEmpty(TUnionPhoneInfoUtils.getInstance().getMcid())) {
            hashMap.put("mcid", TUnionPhoneInfoUtils.getInstance().getMcid());
        }
        if (!TextUtils.isEmpty(TUnionPhoneInfoUtils.getInstance().getCid())) {
            hashMap.put("cid", TUnionPhoneInfoUtils.getInstance().getCid());
        }
        StringBuilder sb = new StringBuilder("android");
        TUnionPhoneInfoUtils.getInstance();
        sb.append(TUnionPhoneInfoUtils.getSDKVersion());
        hashMap.put("os", sb.toString());
        TUnionPhoneInfoUtils.getInstance();
        hashMap.put("deviceModel", TUnionPhoneInfoUtils.getBuildModel());
        hashMap.put("packageName", TUnionPhoneInfoUtils.getInstance().getPackageName());
        hashMap.put("sdkVersion", BuildConfig.VERSION_NAME);
        hashMap.put("appVersion", TUnionPhoneInfoUtils.getInstance().getAppVersion());
        String adzoneId = tUnionMediaParams.getAdzoneId();
        String appkey = TUnionTradeSDK.getInstance().getAppkey();
        if (TextUtils.isEmpty(adzoneId)) {
            adzoneId = TUnionTradeSDK.getInstance().getAdzoneId();
        }
        if (!z && !TextUtils.isEmpty(appkey)) {
            hashMap.put("appkey", appkey);
        }
        if (!TextUtils.isEmpty(adzoneId)) {
            hashMap.put("adzoneid", adzoneId);
        }
        if (!TextUtils.isEmpty(tUnionMediaParams.getSubpid())) {
            hashMap.put("subpid", tUnionMediaParams.getSubpid());
        }
        if (!TextUtils.isEmpty(tUnionMediaParams.getUnid())) {
            hashMap.put("unid", tUnionMediaParams.getUnid());
        }
        if (tUnionMediaParams.getExtra() != null && !tUnionMediaParams.getExtra().isEmpty()) {
            hashMap.putAll(tUnionMediaParams.getExtra());
        }
        return hashMap;
    }
}
