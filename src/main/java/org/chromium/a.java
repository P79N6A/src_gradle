package org.chromium;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import java.util.Map;

public class a extends TTAppInfoProvider {

    /* renamed from: a  reason: collision with root package name */
    private static a f84068a;

    /* renamed from: b  reason: collision with root package name */
    private TTAppInfoProvider.AppInfo f84069b;

    /* renamed from: c  reason: collision with root package name */
    private Context f84070c;

    public TTAppInfoProvider.AppInfo getAppInfo() {
        try {
            synchronized (a.class) {
                if (this.f84069b == null) {
                    this.f84069b = new TTAppInfoProvider.AppInfo();
                }
            }
            this.f84069b.setAbClient(c.a().a("getAbClient"));
            this.f84069b.setAbFlag(c.a().a("getAbFlag"));
            this.f84069b.setAbVersion(c.a().a("getAbVersion"));
            this.f84069b.setAbFeature(c.a().a("getAbFeature"));
            this.f84069b.setAppId(c.a().a("getAppId"));
            this.f84069b.setAppName(c.a().a("getAppName"));
            this.f84069b.setChannel(c.a().a("getChannel"));
            this.f84069b.setCityName(c.a().a("getCityName"));
            this.f84069b.setDeviceId(c.a().a("getDeviceId"));
            if (f.a(this.f84070c)) {
                this.f84069b.setIsMainProcess(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            } else {
                this.f84069b.setIsMainProcess(PushConstants.PUSH_TYPE_NOTIFY);
            }
            this.f84069b.setAbi(c.a().a("getAbi"));
            this.f84069b.setDevicePlatform(c.a().a("getDevicePlatform"));
            this.f84069b.setDeviceType(c.a().a("getDeviceType"));
            this.f84069b.setDeviceBrand(c.a().a("getDeviceBrand"));
            this.f84069b.setIId(c.a().a("getIId"));
            this.f84069b.setNetAccessType(c.a().a("getNetAccessType"));
            this.f84069b.setOpenUdid(c.a().a("getOpenUdid"));
            this.f84069b.setSSmix(c.a().a("getSsmix"));
            this.f84069b.setRticket(c.a().a("getRticket"));
            this.f84069b.setLanguage(c.a().a("getLanguage"));
            this.f84069b.setDPI(c.a().a("getDPI"));
            this.f84069b.setOSApi(c.a().a("getOSApi"));
            this.f84069b.setOSVersion(c.a().a("getOSVersion"));
            this.f84069b.setResolution(c.a().a("getResolution"));
            this.f84069b.setUserId(c.a().a("getUserId"));
            this.f84069b.setUUID(c.a().a("getUUID"));
            this.f84069b.setVersionCode(c.a().a("getVersionCode"));
            this.f84069b.setVersionName(c.a().a("getVersionName"));
            this.f84069b.setUpdateVersionCode(c.a().a("getUpdateVersionCode"));
            this.f84069b.setManifestVersionCode(c.a().a("getManifestVersionCode"));
            this.f84069b.setStoreIdc(c.a().a("getStoreIdc"));
            this.f84069b.setRegion(c.a().a("getRegion"));
            this.f84069b.setSysRegion(c.a().a("getSysRegion"));
            this.f84069b.setCarrierRegion(c.a().a("getCarrierRegion"));
            this.f84069b.setLiveSdkVersion("");
            this.f84069b.setOpenVersion("");
            Map<String, String> b2 = c.a().b();
            if (b2 != null && !b2.isEmpty()) {
                this.f84069b.setHostFirst(b2.get("first"));
                this.f84069b.setHostSecond(b2.get("second"));
                this.f84069b.setHostThird(b2.get("third"));
                this.f84069b.setDomainBase(b2.get("ib"));
                this.f84069b.setDomainChannel(b2.get("ichannel"));
                this.f84069b.setDomainLog(b2.get("log"));
                this.f84069b.setDomainMon(b2.get("mon"));
                this.f84069b.setDomainSec(b2.get("security"));
                this.f84069b.setDomainSub(b2.get("isub"));
            }
            if (d.a().loggerDebug()) {
                String str = "AppInfo{mIId='" + this.f84069b.getIId() + '\'' + ", mUserId='" + this.f84069b.getUserId() + '\'' + ", mAppId='" + this.f84069b.getAppId() + '\'' + ", mOSApi='" + this.f84069b.getOSApi() + '\'' + ", mAbFlag='" + this.f84069b.getAbFlag() + '\'' + ", mOpenVersion='" + this.f84069b.getOpenVersion() + '\'' + ", mDeviceId='" + this.f84069b.getDeviceId() + '\'' + ", mNetAccessType='" + this.f84069b.getNetAccessType() + '\'' + ", mVersionCode='" + this.f84069b.getVersionCode() + '\'' + ", mDeviceType='" + this.f84069b.getDeviceType() + '\'' + ", mAppName='" + this.f84069b.getAppName() + '\'' + ", mChannel='" + this.f84069b.getChannel() + '\'' + ", mCityName='" + this.f84069b.getCityName() + '\'' + ", mLiveSdkVersion='" + this.f84069b.getLiveSdkVersion() + '\'' + ", mOSVersion='" + this.f84069b.getOSVersion() + '\'' + ", mAbi='" + this.f84069b.getAbi() + '\'' + ", mDevicePlatform='" + this.f84069b.getDevicePlatform() + '\'' + ", mUUID='" + this.f84069b.getUUID() + '\'' + ", mOpenUdid='" + this.f84069b.getOpenUdid() + '\'' + ", mResolution='" + this.f84069b.getResolution() + '\'' + ", mAbVersion='" + this.f84069b.getAbVersion() + '\'' + ", mAbClient='" + this.f84069b.getAbClient() + '\'' + ", mAbFeature='" + this.f84069b.getAbFeature() + '\'' + ", mDeviceBrand='" + this.f84069b.getDeviceBrand() + '\'' + ", mLanguage='" + this.f84069b.getLanguage() + '\'' + ", mVersionName='" + this.f84069b.getVersionName() + '\'' + ", mSSmix='" + this.f84069b.getSSmix() + '\'' + ", mUpdateVersionCode='" + this.f84069b.getUpdateVersionCode() + '\'' + ", mManifestVersionCode='" + this.f84069b.getManifestVersionCode() + '\'' + ", mDPI='" + this.f84069b.getDPI() + '\'' + ", mRticket='" + this.f84069b.getRticket() + '\'' + ", mHostFirst='" + this.f84069b.getHostFirst() + '\'' + ", mHostSecond='" + this.f84069b.getHostSecond() + '\'' + ", mHostThird='" + this.f84069b.getHostThird() + '\'' + ", mDomainBase='" + this.f84069b.getDomainBase() + '\'' + ", mDomainLog='" + this.f84069b.getDomainLog() + '\'' + ", mDomainSub='" + this.f84069b.getDomainSub() + '\'' + ", mDomainChannel='" + this.f84069b.getDomainChannel() + '\'' + ", mDomainMon='" + this.f84069b.getDomainMon() + '\'' + ", mDomainSec='" + this.f84069b.getDomainSec() + '\'' + '}';
                d.a().loggerD("CronetAppInfoProvider", "get appinfo = " + str);
            }
        } catch (Throwable unused) {
        }
        return this.f84069b;
    }

    private a(Context context) {
        this.f84070c = context.getApplicationContext();
    }

    public static a a(Context context) {
        if (f84068a == null) {
            synchronized (a.class) {
                if (f84068a == null) {
                    f84068a = new a(context);
                }
            }
        }
        return f84068a;
    }
}
