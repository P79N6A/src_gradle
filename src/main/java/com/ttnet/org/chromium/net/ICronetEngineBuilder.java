package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.net.CronetEngine;
import java.util.Date;
import java.util.Set;

public abstract class ICronetEngineBuilder {
    public abstract ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date);

    public abstract ICronetEngineBuilder addQuicHint(String str, int i, int i2);

    public abstract ExperimentalCronetEngine build();

    public abstract ICronetEngineBuilder enableBoeProxy(boolean z);

    public abstract ICronetEngineBuilder enableDataReductionProxy(String str);

    public abstract ICronetEngineBuilder enableHttp2(boolean z);

    public abstract ICronetEngineBuilder enableHttpCache(int i, long j);

    public abstract ICronetEngineBuilder enableHttpDns(boolean z);

    public abstract ICronetEngineBuilder enableLegacyMode(boolean z);

    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        return this;
    }

    public abstract ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z);

    public abstract ICronetEngineBuilder enableQuic(boolean z);

    public abstract ICronetEngineBuilder enableSdch(boolean z);

    public abstract ICronetEngineBuilder enableVerboseLog();

    public abstract String getDefaultUserAgent();

    public abstract ICronetEngineBuilder setAppInfoProvider(TTAppInfoProvider tTAppInfoProvider);

    public abstract ICronetEngineBuilder setAppMonitorProvider(TTMonitorProvider tTMonitorProvider);

    public ICronetEngineBuilder setCertVerifierData(String str) {
        return this;
    }

    public ICronetEngineBuilder setDataReductionProxyOptions(String str, String str2, String str3) {
        return this;
    }

    public abstract ICronetEngineBuilder setEventListener(TTEventListener tTEventListener);

    public abstract ICronetEngineBuilder setExperimentalOptions(String str);

    public abstract ICronetEngineBuilder setGetDomainDefaultJSON(String str);

    public abstract ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader);

    public abstract ICronetEngineBuilder setProxyConfig(String str);

    public abstract ICronetEngineBuilder setStoragePath(String str);

    public abstract ICronetEngineBuilder setUserAgent(String str);
}
