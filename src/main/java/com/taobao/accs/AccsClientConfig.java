package com.taobao.accs;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AccsClientConfig {
    public static final String[] DEFAULT_CENTER_HOSTS = {"msgacs.m.taobao.com", "msgacs.wapa.taobao.com", "msgacs.waptest.taobao.com"};
    public static final String[] DEFAULT_CHANNEL_HOSTS = {"accscdn.m.taobao.com", "acs.wapa.taobao.com", "acs.waptest.taobao.com"};
    public static boolean loadedStaticConfig = true;
    private static Context mContext;
    public static Map<String, AccsClientConfig> mDebugConfigs = new ConcurrentHashMap(1);
    @ENV
    public static int mEnv;
    public static Map<String, AccsClientConfig> mPreviewConfigs = new ConcurrentHashMap(1);
    public static Map<String, AccsClientConfig> mReleaseConfigs = new ConcurrentHashMap(1);
    public boolean mAccsHeartbeatEnable;
    public String mAppKey;
    public String mAppSecret;
    public String mAuthCode;
    public boolean mAutoUnit;
    public String mChannelHost;
    public int mChannelPubKey;
    public int mConfigEnv;
    public boolean mDisableChannel;
    public String mInappHost;
    public int mInappPubKey;
    public boolean mKeepalive;
    public boolean mQuickReconnect;
    public int mSecurity;
    public String mStoreId;
    public String mTag;

    @Retention(RetentionPolicy.CLASS)
    public @interface ENV {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface SECURITY_TYPE {
    }

    public static class Builder {
        private boolean mAccsHeartbeatEnable;
        private String mAppKey;
        private String mAppSecret;
        private String mAuthCode;
        private boolean mAutoUnit = true;
        private String mChannelHost;
        private int mChannelPubKey = -1;
        private int mConfigEnv = -1;
        private boolean mDisableChannel;
        private String mInappHost;
        private int mInappPubKey = -1;
        private boolean mKeepalive = true;
        private boolean mQuickReconnect;
        private String mStoreId;
        private String mTag;

        public AccsClientConfig build() throws AccsException {
            Map<String, AccsClientConfig> map;
            if (!TextUtils.isEmpty(this.mAppKey)) {
                AccsClientConfig accsClientConfig = new AccsClientConfig();
                accsClientConfig.mAppKey = this.mAppKey;
                accsClientConfig.mAppSecret = this.mAppSecret;
                accsClientConfig.mAuthCode = this.mAuthCode;
                accsClientConfig.mKeepalive = this.mKeepalive;
                accsClientConfig.mAutoUnit = this.mAutoUnit;
                accsClientConfig.mInappPubKey = this.mInappPubKey;
                accsClientConfig.mChannelPubKey = this.mChannelPubKey;
                accsClientConfig.mInappHost = this.mInappHost;
                accsClientConfig.mChannelHost = this.mChannelHost;
                accsClientConfig.mTag = this.mTag;
                accsClientConfig.mStoreId = this.mStoreId;
                accsClientConfig.mConfigEnv = this.mConfigEnv;
                accsClientConfig.mDisableChannel = this.mDisableChannel;
                accsClientConfig.mQuickReconnect = this.mQuickReconnect;
                accsClientConfig.mAccsHeartbeatEnable = this.mAccsHeartbeatEnable;
                if (accsClientConfig.mConfigEnv < 0) {
                    accsClientConfig.mConfigEnv = AccsClientConfig.mEnv;
                }
                if (TextUtils.isEmpty(accsClientConfig.mAppSecret)) {
                    accsClientConfig.mSecurity = 0;
                } else {
                    accsClientConfig.mSecurity = 2;
                }
                if (TextUtils.isEmpty(accsClientConfig.mInappHost)) {
                    accsClientConfig.mInappHost = AccsClientConfig.DEFAULT_CENTER_HOSTS[accsClientConfig.mConfigEnv];
                }
                if (TextUtils.isEmpty(accsClientConfig.mChannelHost)) {
                    accsClientConfig.mChannelHost = AccsClientConfig.DEFAULT_CHANNEL_HOSTS[accsClientConfig.mConfigEnv];
                }
                if (TextUtils.isEmpty(accsClientConfig.mTag)) {
                    accsClientConfig.mTag = accsClientConfig.mAppKey;
                }
                switch (accsClientConfig.mConfigEnv) {
                    case 1:
                        map = AccsClientConfig.mPreviewConfigs;
                        break;
                    case 2:
                        map = AccsClientConfig.mDebugConfigs;
                        break;
                    default:
                        map = AccsClientConfig.mReleaseConfigs;
                        break;
                }
                ALog.d("AccsClientConfig", "build", "config", accsClientConfig);
                AccsClientConfig accsClientConfig2 = map.get(accsClientConfig.getTag());
                if (accsClientConfig2 != null) {
                    ALog.w("AccsClientConfig", "build conver", "old config", accsClientConfig2);
                }
                map.put(accsClientConfig.getTag(), accsClientConfig);
                return accsClientConfig;
            }
            throw new AccsException("appkey null");
        }

        public Builder setAccsHeartbeatEnable(boolean z) {
            this.mAccsHeartbeatEnable = z;
            return this;
        }

        public Builder setAppKey(String str) {
            this.mAppKey = str;
            return this;
        }

        public Builder setAppSecret(String str) {
            this.mAppSecret = str;
            return this;
        }

        public Builder setAutoCode(String str) {
            this.mAuthCode = str;
            return this;
        }

        public Builder setAutoUnit(boolean z) {
            this.mAutoUnit = z;
            return this;
        }

        public Builder setChannelHost(String str) {
            this.mChannelHost = str;
            return this;
        }

        public Builder setChannelPubKey(int i) {
            this.mChannelPubKey = i;
            return this;
        }

        public Builder setConfigEnv(@ENV int i) {
            this.mConfigEnv = i;
            return this;
        }

        public Builder setDisableChannel(boolean z) {
            this.mDisableChannel = z;
            return this;
        }

        public Builder setInappHost(String str) {
            this.mInappHost = str;
            return this;
        }

        public Builder setInappPubKey(int i) {
            this.mInappPubKey = i;
            return this;
        }

        public Builder setKeepAlive(boolean z) {
            this.mKeepalive = z;
            return this;
        }

        public Builder setQuickReconnect(boolean z) {
            this.mQuickReconnect = z;
            return this;
        }

        public Builder setStoreId(String str) {
            this.mStoreId = str;
            return this;
        }

        public Builder setTag(String str) {
            this.mTag = str;
            return this;
        }
    }

    protected AccsClientConfig() {
    }

    public String getAppKey() {
        return this.mAppKey;
    }

    public String getAppSecret() {
        return this.mAppSecret;
    }

    public String getAuthCode() {
        return this.mAuthCode;
    }

    public String getChannelHost() {
        return this.mChannelHost;
    }

    public int getChannelPubKey() {
        return this.mChannelPubKey;
    }

    public int getConfigEnv() {
        return this.mConfigEnv;
    }

    public boolean getDisableChannel() {
        return this.mDisableChannel;
    }

    public String getInappHost() {
        return this.mInappHost;
    }

    public int getInappPubKey() {
        return this.mInappPubKey;
    }

    public int getSecurity() {
        return this.mSecurity;
    }

    public String getStoreId() {
        return this.mStoreId;
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean isAccsHeartbeatEnable() {
        return this.mAccsHeartbeatEnable;
    }

    public boolean isAutoUnit() {
        return this.mAutoUnit;
    }

    public boolean isKeepalive() {
        return this.mKeepalive;
    }

    public boolean isQuickReconnect() {
        return this.mQuickReconnect;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Context getContext() {
        /*
            android.content.Context r0 = mContext
            if (r0 == 0) goto L_0x0007
            android.content.Context r0 = mContext
            return r0
        L_0x0007:
            java.lang.Class<com.taobao.accs.AccsClientConfig> r0 = com.taobao.accs.AccsClientConfig.class
            monitor-enter(r0)
            android.content.Context r1 = mContext     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0012
            android.content.Context r1 = mContext     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return r1
        L_0x0012:
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x003d }
            java.lang.String r2 = "currentActivityThread"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x003d }
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch:{ Exception -> 0x003d }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x003d }
            java.lang.Object r1 = r2.invoke(r1, r4)     // Catch:{ Exception -> 0x003d }
            java.lang.Class r2 = r1.getClass()     // Catch:{ Exception -> 0x003d }
            java.lang.String r4 = "getApplication"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x003d }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ Exception -> 0x003d }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x003d }
            java.lang.Object r1 = r2.invoke(r1, r3)     // Catch:{ Exception -> 0x003d }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ Exception -> 0x003d }
            mContext = r1     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            android.content.Context r1 = mContext     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return r1
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.AccsClientConfig.getContext():android.content.Context");
    }

    public String toString() {
        return "AccsClientConfig{" + "Tag=" + this.mTag + ", ConfigEnv=" + this.mConfigEnv + ", AppKey=" + this.mAppKey + ", AppSecret=" + this.mAppSecret + ", InappHost=" + this.mInappHost + ", ChannelHost=" + this.mChannelHost + ", Security=" + this.mSecurity + ", AuthCode=" + this.mAuthCode + ", InappPubKey=" + this.mInappPubKey + ", ChannelPubKey=" + this.mChannelPubKey + ", Keepalive=" + this.mKeepalive + ", AutoUnit=" + this.mAutoUnit + ", DisableChannel=" + this.mDisableChannel + ", QuickReconnect=" + this.mQuickReconnect + "}";
    }

    static {
        int i;
        String str;
        boolean z = true;
        try {
            Bundle g = k.g(getContext());
            if (g != null) {
                String str2 = null;
                String string = g.getString("accsConfigTags", null);
                ALog.i("AccsClientConfig", "init config from xml", "configtags", string);
                if (!TextUtils.isEmpty(string)) {
                    String[] split = string.split("\\|");
                    if (split == null) {
                        split = new String[]{string};
                    }
                    int length = split.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str3 = split[i2];
                        if (!TextUtils.isEmpty(str3)) {
                            int i3 = g.getInt(str3 + "_accsAppkey", -1);
                            if (i3 < 0) {
                                str = str2;
                            } else {
                                str = String.valueOf(i3);
                            }
                            String string2 = g.getString(str3 + "_accsAppSecret");
                            String string3 = g.getString(str3 + "_authCode");
                            boolean z2 = g.getBoolean(str3 + "_keepAlive", z);
                            boolean z3 = g.getBoolean(str3 + "_autoUnit", z);
                            int i4 = g.getInt(str3 + "_inappPubkey", -1);
                            int i5 = g.getInt(str3 + "_channelPubkey", -1);
                            String string4 = g.getString(str3 + "_inappHost");
                            String string5 = g.getString(str3 + "_channelHost");
                            int i6 = g.getInt(str3 + "_configEnv", 0);
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            i = length;
                            sb.append("_disableChannel");
                            boolean z4 = g.getBoolean(sb.toString());
                            if (!TextUtils.isEmpty(str)) {
                                new Builder().setTag(str3).setConfigEnv(i6).setAppKey(str).setAppSecret(string2).setAutoCode(string3).setKeepAlive(z2).setAutoUnit(z3).setInappHost(string4).setInappPubKey(i4).setChannelHost(string5).setChannelPubKey(i5).setDisableChannel(z4).build();
                                ALog.i("AccsClientConfig", "init config from xml", new Object[0]);
                            }
                        } else {
                            i = length;
                        }
                        i2++;
                        length = i;
                        str2 = null;
                        z = true;
                    }
                }
            }
        } catch (Throwable th) {
            ALog.e("AccsClientConfig", "init config from xml", th, new Object[0]);
        }
    }

    public static AccsClientConfig getConfigByTag(String str) {
        Map<String, AccsClientConfig> map;
        switch (mEnv) {
            case 1:
                map = mPreviewConfigs;
                break;
            case 2:
                map = mDebugConfigs;
                break;
            default:
                map = mReleaseConfigs;
                break;
        }
        AccsClientConfig accsClientConfig = map.get(str);
        if (accsClientConfig == null) {
            ALog.e("AccsClientConfig", "getConfigByTag return null", "configTag", str);
        }
        return accsClientConfig;
    }

    @Deprecated
    public static AccsClientConfig getConfig(String str) {
        Map<String, AccsClientConfig> map;
        switch (mEnv) {
            case 1:
                map = mPreviewConfigs;
                break;
            case 2:
                map = mDebugConfigs;
                break;
            default:
                map = mReleaseConfigs;
                break;
        }
        for (AccsClientConfig next : map.values()) {
            if (next.mAppKey.equals(str) && next.mConfigEnv == mEnv) {
                return next;
            }
        }
        ALog.e("AccsClientConfig", "getConfigByTag return null", "appkey", str);
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccsClientConfig accsClientConfig = (AccsClientConfig) obj;
        if (!this.mInappHost.equals(accsClientConfig.mInappHost) || this.mInappPubKey != accsClientConfig.mInappPubKey || !this.mChannelHost.equals(accsClientConfig.mChannelHost) || this.mChannelPubKey != accsClientConfig.mChannelPubKey || this.mSecurity != accsClientConfig.mSecurity || this.mConfigEnv != accsClientConfig.mConfigEnv || !this.mAppKey.equals(accsClientConfig.mAppKey) || this.mKeepalive != accsClientConfig.mKeepalive || this.mDisableChannel != accsClientConfig.mDisableChannel) {
            return false;
        }
        if (this.mAuthCode == null ? accsClientConfig.mAuthCode != null : !this.mAuthCode.equals(accsClientConfig.mAuthCode)) {
            return false;
        }
        if (this.mAppSecret == null ? accsClientConfig.mAppSecret == null : this.mAppSecret.equals(accsClientConfig.mAppSecret)) {
            return this.mTag.equals(accsClientConfig.mTag);
        }
        return false;
    }
}
