package com.bytedance.frameworks.baselib.network.http.cronet;

import java.util.Map;

public interface ICronetAppProvider {
    String getAbClient();

    String getAbFeature();

    String getAbFlag();

    String getAbVersion();

    String getAbi();

    String getAppId();

    String getAppName();

    String getCarrierRegion();

    String getChannel();

    String getCityName();

    String getDPI();

    String getDeviceBrand();

    String getDeviceId();

    String getDevicePlatform();

    String getDeviceType();

    String getGetDomainDefaultJSON();

    Map<String, String> getGetDomainDependHostMap();

    String getIId();

    String getLanguage();

    String getManifestVersionCode();

    String getNetAccessType();

    String getOSApi();

    String getOSVersion();

    String getOpenUdid();

    String getRegion();

    String getResolution();

    String getRticket();

    String getSsmix();

    String getStoreIdc();

    String getSysRegion();

    String getUUID();

    String getUpdateVersionCode();

    String getUserId();

    String getVersionCode();

    String getVersionName();

    Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map);

    void onColdStartFinish();

    void onServerConfigUpdated(String str);

    void onTTNetDetectInfoChanged(String str);

    void onTTNetStateChanged(int i);

    void sendAppMonitorEvent(String str, String str2);
}
