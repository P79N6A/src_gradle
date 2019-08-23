package com.sina.weibo.sdk.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.exception.WeiboHttpException;
import com.sina.weibo.sdk.net.AsyncWeiboRunner;
import com.sina.weibo.sdk.net.WeiboParameters;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

public class AidTask {
    private static AidTask sInstance;
    private String mAppKey;
    private Context mContext;
    public volatile ReentrantLock mTaskLock = new ReentrantLock(true);

    public static final class AidInfo {
        private String mAid;
        private String mSubCookie;

        public final String getAid() {
            return this.mAid;
        }

        public final String getSubCookie() {
            return this.mSubCookie;
        }

        public static AidInfo parseJson(String str) throws WeiboException {
            AidInfo aidInfo = new AidInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("error") || jSONObject.has("error_code")) {
                    LogUtil.d("AidTask", "loadAidFromNet has error !!!");
                    throw new WeiboException("loadAidFromNet has error !!!");
                }
                aidInfo.mAid = jSONObject.optString("aid", "");
                aidInfo.mSubCookie = jSONObject.optString("sub", "");
                return aidInfo;
            } catch (JSONException e2) {
                LogUtil.d("AidTask", "loadAidFromNet JSONException Msg : " + e2.getMessage());
                throw new WeiboException("loadAidFromNet has error !!!");
            }
        }
    }

    public ReentrantLock getTaskLock() {
        return this.mTaskLock;
    }

    private String getCpu() {
        try {
            return Build.CPU_ABI;
        } catch (Exception unused) {
            return "";
        }
    }

    private String getDeviceName() {
        try {
            return Build.BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    private String getModel() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    public void aidTaskInit() {
        aidTaskInit(this.mAppKey);
    }

    private String getAndroidId() {
        try {
            return Settings.Secure.getString(this.mContext.getContentResolver(), "android_id");
        } catch (Exception unused) {
            return "";
        }
    }

    private String getIccid() {
        try {
            return ((TelephonyManager) this.mContext.getSystemService("phone")).getSimSerialNumber();
        } catch (Exception unused) {
            return "";
        }
    }

    private String getImei() {
        try {
            return ((TelephonyManager) this.mContext.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return "";
        }
    }

    private String getImsi() {
        try {
            return ((TelephonyManager) this.mContext.getSystemService("phone")).getSubscriberId();
        } catch (Exception unused) {
            return "";
        }
    }

    private String getMac() {
        try {
            WifiManager wifiManager = (WifiManager) this.mContext.getSystemService("wifi");
            if (wifiManager == null) {
                return "";
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getMacAddress();
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    private String getMeid() {
        try {
            return ((TelephonyManager) this.mContext.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return "";
        }
    }

    private String getOS() {
        try {
            return "Android " + Build.VERSION.RELEASE;
        } catch (Exception unused) {
            return "";
        }
    }

    private String getSsid() {
        try {
            WifiInfo connectionInfo = ((WifiManager) this.mContext.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getSSID();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public AidInfo getAidSync() throws WeiboException {
        if (TextUtils.isEmpty(this.mAppKey)) {
            return null;
        }
        String loadAidFromNet = loadAidFromNet();
        AidInfo parseJson = AidInfo.parseJson(loadAidFromNet);
        cacheAidInfo(loadAidFromNet);
        return parseJson;
    }

    public synchronized String loadAidFromCache() {
        AidInfo loadAidInfoFromCache = loadAidInfoFromCache();
        if (loadAidInfoFromCache == null) {
            return "";
        }
        return loadAidInfoFromCache.getAid();
    }

    public synchronized String loadSubCookieFromCache() {
        AidInfo loadAidInfoFromCache = loadAidInfoFromCache();
        if (loadAidInfoFromCache == null) {
            return "";
        }
        return loadAidInfoFromCache.getSubCookie();
    }

    private String getResolution() {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return String.valueOf(String.valueOf(displayMetrics.widthPixels)) + "*" + String.valueOf(displayMetrics.heightPixels);
        } catch (Exception unused) {
            return "";
        }
    }

    private String getSdSize() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.toString(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
        } catch (Exception unused) {
            return "";
        }
    }

    private String getSerialNo() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls, new Object[]{"ro.serialno", "unknown"});
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002c */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029 A[SYNTHETIC, Splitter:B:15:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[SYNTHETIC, Splitter:B:23:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.sina.weibo.sdk.utils.AidTask.AidInfo loadAidInfoFromCache() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 1
            r1 = 0
            java.io.File r0 = r4.getAidInfoFile(r0)     // Catch:{ Exception -> 0x002d, all -> 0x0025 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002d, all -> 0x0025 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x002d, all -> 0x0025 }
            int r0 = r2.available()     // Catch:{ Exception -> 0x002e, all -> 0x0023 }
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x002e, all -> 0x0023 }
            r2.read(r0)     // Catch:{ Exception -> 0x002e, all -> 0x0023 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x002e, all -> 0x0023 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x002e, all -> 0x0023 }
            com.sina.weibo.sdk.utils.AidTask$AidInfo r0 = com.sina.weibo.sdk.utils.AidTask.AidInfo.parseJson(r3)     // Catch:{ Exception -> 0x002e, all -> 0x0023 }
            r2.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            monitor-exit(r4)
            return r0
        L_0x0023:
            r0 = move-exception
            goto L_0x0027
        L_0x0025:
            r0 = move-exception
            r2 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x002c
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x002d:
            r2 = r1
        L_0x002e:
            if (r2 == 0) goto L_0x0037
            r2.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0037
        L_0x0034:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0037:
            monitor-exit(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.utils.AidTask.loadAidInfoFromCache():com.sina.weibo.sdk.utils.AidTask$AidInfo");
    }

    private String getConnectType() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 0) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case e.l /*?: ONE_ARG  (7 int)*/:
                        case 11:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        case 14:
                        case 15:
                            return "3G";
                        case 13:
                            return "4G";
                        default:
                            return "none";
                    }
                } else if (activeNetworkInfo.getType() == 1) {
                    return "wifi";
                }
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    private String getMfp() {
        String str = "";
        try {
            str = new String(genMfpString().getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        LogUtil.d("AidTask", "genMfpString() utf-8 string : ".concat(String.valueOf(str)));
        try {
            String encryptRsa = encryptRsa(str, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDHHM0Fi2Z6+QYKXqFUX2Cy6AaWq3cPi+GSn9oeAwQbPZR75JB7Netm0HtBVVbtPhzT7UO2p1JhFUKWqrqoYuAjkgMVPmA0sFrQohns5EE44Y86XQopD4ZO+dE5KjUZFE6vrPO3rWW3np2BqlgKpjnYZri6TJApmIpGcQg9/G/3zQIDAQAB");
            LogUtil.d("AidTask", "encryptRsa() string : ".concat(String.valueOf(encryptRsa)));
            return encryptRsa;
        } catch (Exception e2) {
            LogUtil.e("AidTask", e2.getMessage());
            return "";
        }
    }

    public String loadAidFromNet() throws WeiboException {
        String packageName = this.mContext.getPackageName();
        String sign = Utility.getSign(this.mContext, packageName);
        String mfp = getMfp();
        WeiboParameters weiboParameters = new WeiboParameters(this.mAppKey);
        weiboParameters.put("appkey", this.mAppKey);
        weiboParameters.put("mfp", mfp);
        weiboParameters.put("packagename", packageName);
        weiboParameters.put("key_hash", sign);
        try {
            String request = new AsyncWeiboRunner(this.mContext).request("http://api.weibo.com/oauth2/getaid.json", weiboParameters, "GET");
            LogUtil.d("AidTask", "loadAidFromNet response : ".concat(String.valueOf(request)));
            return request;
        } catch (WeiboException e2) {
            LogUtil.d("AidTask", "loadAidFromNet WeiboException Msg : " + e2.getMessage());
            throw e2;
        }
    }

    private String genMfpString() {
        JSONObject jSONObject = new JSONObject();
        try {
            String os = getOS();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, os);
            }
            String imei = getImei();
            if (!TextUtils.isEmpty(imei)) {
                jSONObject.put(PushConstants.PUSH_TYPE_UPLOAD_LOG, imei);
            }
            String meid = getMeid();
            if (!TextUtils.isEmpty(meid)) {
                jSONObject.put("3", meid);
            }
            String imsi = getImsi();
            if (!TextUtils.isEmpty(imsi)) {
                jSONObject.put(PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION, imsi);
            }
            String mac = getMac();
            if (!TextUtils.isEmpty(mac)) {
                jSONObject.put("5", mac);
            }
            String iccid = getIccid();
            if (!TextUtils.isEmpty(iccid)) {
                jSONObject.put("6", iccid);
            }
            String serialNo = getSerialNo();
            if (!TextUtils.isEmpty(serialNo)) {
                jSONObject.put("7", serialNo);
            }
            String androidId = getAndroidId();
            if (!TextUtils.isEmpty(androidId)) {
                jSONObject.put("10", androidId);
            }
            String cpu = getCpu();
            if (!TextUtils.isEmpty(cpu)) {
                jSONObject.put("13", cpu);
            }
            String model = getModel();
            if (!TextUtils.isEmpty(model)) {
                jSONObject.put("14", model);
            }
            String sdSize = getSdSize();
            if (!TextUtils.isEmpty(sdSize)) {
                jSONObject.put("15", sdSize);
            }
            String resolution = getResolution();
            if (!TextUtils.isEmpty(resolution)) {
                jSONObject.put("16", resolution);
            }
            String ssid = getSsid();
            if (!TextUtils.isEmpty(ssid)) {
                jSONObject.put("17", ssid);
            }
            String deviceName = getDeviceName();
            if (!TextUtils.isEmpty(deviceName)) {
                jSONObject.put("18", deviceName);
            }
            String connectType = getConnectType();
            if (!TextUtils.isEmpty(connectType)) {
                jSONObject.put("19", connectType);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public void setAppkey(String str) {
        this.mAppKey = str;
    }

    private AidTask(Context context) {
        this.mContext = context.getApplicationContext();
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 0; i++) {
                    try {
                        AidTask.this.getAidInfoFile(0).delete();
                    } catch (Exception unused) {
                    }
                }
            }
        }).start();
    }

    public static synchronized AidTask getInstance(Context context) {
        AidTask aidTask;
        synchronized (AidTask.class) {
            if (sInstance == null) {
                sInstance = new AidTask(context);
            }
            aidTask = sInstance;
        }
        return aidTask;
    }

    private PublicKey getPublicKey(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes())));
    }

    public void aidTaskInit(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mAppKey = str;
            new Thread(new Runnable() {
                public void run() {
                    if (AidTask.this.mTaskLock.tryLock()) {
                        if (!TextUtils.isEmpty(AidTask.this.loadAidFromCache())) {
                            AidTask.this.mTaskLock.unlock();
                            return;
                        }
                        int i = 0;
                        while (i < 3) {
                            try {
                                String loadAidFromNet = AidTask.this.loadAidFromNet();
                                AidInfo.parseJson(loadAidFromNet);
                                AidTask.this.cacheAidInfo(loadAidFromNet);
                                break;
                            } catch (WeiboException e2) {
                                LogUtil.e("AidTask", "AidTaskInit WeiboException Msg : " + e2.getMessage());
                                i++;
                            }
                        }
                        AidTask.this.mTaskLock.unlock();
                    }
                }
            }).start();
        }
    }

    public void getAidAsync(final Handler handler) {
        if (!TextUtils.isEmpty(this.mAppKey)) {
            final Message obtain = Message.obtain();
            new Thread(new Runnable() {
                public void run() {
                    try {
                        String loadAidFromNet = AidTask.this.loadAidFromNet();
                        AidInfo parseJson = AidInfo.parseJson(loadAidFromNet);
                        AidTask.this.cacheAidInfo(loadAidFromNet);
                        obtain.what = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST;
                        obtain.obj = parseJson;
                        if (handler != null) {
                            handler.sendMessage(obtain);
                        }
                    } catch (WeiboException e2) {
                        if ((e2.getCause() instanceof IOException) || (e2 instanceof WeiboHttpException)) {
                            obtain.what = 1003;
                            if (handler != null) {
                                handler.sendMessage(obtain);
                            }
                            return;
                        }
                        obtain.what = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR;
                        if (handler != null) {
                            handler.sendMessage(obtain);
                        }
                    }
                }
            }).start();
        }
    }

    public File getAidInfoFile(int i) {
        return new File(this.mContext.getFilesDir(), "weibo_sdk_aid".concat(String.valueOf(i)));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|(0)|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0028 A[SYNTHETIC, Splitter:B:21:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x002e A[SYNTHETIC, Splitter:B:27:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void cacheAidInfo(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            r0 = 0
            r1 = 1
            java.io.File r1 = r3.getAidInfoFile(r1)     // Catch:{ Exception -> 0x002c, all -> 0x0025 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002c, all -> 0x0025 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x002c, all -> 0x0025 }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x0023, all -> 0x0020 }
            r2.write(r4)     // Catch:{ Exception -> 0x0023, all -> 0x0020 }
            r2.close()     // Catch:{ IOException -> 0x0035 }
            monitor-exit(r3)
            return
        L_0x0020:
            r4 = move-exception
            r0 = r2
            goto L_0x0026
        L_0x0023:
            r0 = r2
            goto L_0x002c
        L_0x0025:
            r4 = move-exception
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            r0.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r4     // Catch:{ all -> 0x0037 }
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ IOException -> 0x0033 }
            monitor-exit(r3)
            return
        L_0x0033:
            monitor-exit(r3)
            return
        L_0x0035:
            monitor-exit(r3)
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.utils.AidTask.cacheAidInfo(java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00af A[SYNTHETIC, Splitter:B:20:0x00af] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String encryptRsa(java.lang.String r8, java.lang.String r9) throws java.lang.Exception {
        /*
            r7 = this;
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            java.security.PublicKey r9 = r7.getPublicKey(r9)
            r1 = 1
            r0.init(r1, r9)
            java.lang.String r9 = "UTF-8"
            byte[] r8 = r8.getBytes(r9)
            r9 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            r9 = 0
        L_0x001b:
            r2 = 117(0x75, float:1.64E-43)
            int r2 = r7.splite(r8, r9, r2)     // Catch:{ all -> 0x00a9 }
            r3 = -1
            if (r2 != r3) goto L_0x007b
            r1.flush()     // Catch:{ all -> 0x00a9 }
            byte[] r8 = r1.toByteArray()     // Catch:{ all -> 0x00a9 }
            java.lang.String r9 = "AidTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "encryptRsa total enBytes len = "
            r0.<init>(r2)     // Catch:{ all -> 0x00a9 }
            int r2 = r8.length     // Catch:{ all -> 0x00a9 }
            r0.append(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a9 }
            com.sina.weibo.sdk.utils.LogUtil.d(r9, r0)     // Catch:{ all -> 0x00a9 }
            byte[] r8 = com.sina.weibo.sdk.utils.Base64.encodebyte(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r9 = "AidTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "encryptRsa total base64byte len = "
            r0.<init>(r2)     // Catch:{ all -> 0x00a9 }
            int r2 = r8.length     // Catch:{ all -> 0x00a9 }
            r0.append(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a9 }
            com.sina.weibo.sdk.utils.LogUtil.d(r9, r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "UTF-8"
            r9.<init>(r8, r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = "01"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = r8.concat(r9)     // Catch:{ all -> 0x00a9 }
            java.lang.String r9 = "AidTask"
            java.lang.String r0 = "encryptRsa total base64string : "
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x00a9 }
            com.sina.weibo.sdk.utils.LogUtil.d(r9, r0)     // Catch:{ all -> 0x00a9 }
            r1.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            return r8
        L_0x007b:
            byte[] r3 = r0.doFinal(r8, r9, r2)     // Catch:{ all -> 0x00a9 }
            r1.write(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = "AidTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            java.lang.String r6 = "encryptRsa offset = "
            r5.<init>(r6)     // Catch:{ all -> 0x00a9 }
            r5.append(r9)     // Catch:{ all -> 0x00a9 }
            java.lang.String r6 = "     len = "
            r5.append(r6)     // Catch:{ all -> 0x00a9 }
            r5.append(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.String r6 = "     enBytes len = "
            r5.append(r6)     // Catch:{ all -> 0x00a9 }
            int r3 = r3.length     // Catch:{ all -> 0x00a9 }
            r5.append(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00a9 }
            com.sina.weibo.sdk.utils.LogUtil.d(r4, r3)     // Catch:{ all -> 0x00a9 }
            int r9 = r9 + r2
            goto L_0x001b
        L_0x00a9:
            r8 = move-exception
            goto L_0x00ad
        L_0x00ab:
            r8 = move-exception
            r1 = r9
        L_0x00ad:
            if (r1 == 0) goto L_0x00b2
            r1.close()     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.utils.AidTask.encryptRsa(java.lang.String, java.lang.String):java.lang.String");
    }

    private int splite(byte[] bArr, int i, int i2) {
        if (i >= bArr.length) {
            return -1;
        }
        return Math.min(bArr.length - i, i2);
    }
}
