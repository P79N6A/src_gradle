package com.taobao.accs.utl;

import com.ut.mini.IUTApplication;
import com.ut.mini.core.sign.IUTRequestAuthentication;
import com.ut.mini.core.sign.UTSecuritySDKRequestAuthentication;
import com.ut.mini.crashhandler.IUTCrashCaughtListner;

public class j implements IUTApplication {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f79104a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f79105b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ UTMini f79106c;

    public String getUTAppVersion() {
        return null;
    }

    public IUTCrashCaughtListner getUTCrashCraughtListener() {
        return null;
    }

    public boolean isAliyunOsSystem() {
        return false;
    }

    public boolean isUTCrashHandlerDisable() {
        return false;
    }

    public boolean isUTLogEnable() {
        return false;
    }

    public String getUTChannel() {
        return this.f79104a;
    }

    public IUTRequestAuthentication getUTRequestAuthInstance() {
        return new UTSecuritySDKRequestAuthentication(this.f79105b);
    }

    j(UTMini uTMini, String str, String str2) {
        this.f79106c = uTMini;
        this.f79104a = str;
        this.f79105b = str2;
    }
}
