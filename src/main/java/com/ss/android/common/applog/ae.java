package com.ss.android.common.applog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28117a;

    /* renamed from: b  reason: collision with root package name */
    public static final ae f28118b;

    /* renamed from: c  reason: collision with root package name */
    public static final ae f28119c;

    /* renamed from: d  reason: collision with root package name */
    public static final ae f28120d;

    /* renamed from: e  reason: collision with root package name */
    public static final ae f28121e;

    /* renamed from: f  reason: collision with root package name */
    public static final ae f28122f;
    public static final ae g;
    public static final ae h;
    final String i;
    final String j;
    final String k;
    final String l;
    final String[] m;
    final String n;
    final String o;

    static {
        ae aeVar = new ae("https://log.snssdk.com/service/2/app_log/", "https://rtlog.snssdk.com/service/2/app_log/", new String[]{"https://log.snssdk.com/service/2/device_register/", "http://log.snssdk.com/service/2/device_register/"}, "https://ichannel.snssdk.com/service/2/app_alert_check/", "https://log.snssdk.com/service/2/log_settings/", "http://log.snssdk.com/service/2/app_log/", "http://log.snssdk.com/service/2/log_settings/");
        f28118b = aeVar;
        ae aeVar2 = new ae("https://log.isnssdk.com/service/2/app_log/", "https://rtlog.isnssdk.com/service/2/app_log/", new String[]{"https://log.isnssdk.com/service/2/device_register/", "http://log.isnssdk.com/service/2/device_register/"}, "https://ichannel.isnssdk.com/service/2/app_alert_check/", "https://log.isnssdk.com/service/2/log_settings/", "http://log.isnssdk.com/service/2/app_log/", "http://log.isnssdk.com/service/2/log_settings/");
        f28119c = aeVar2;
        ae aeVar3 = new ae("http://log.isnssdk.com/service/2/app_log/", "http://rtlog.isnssdk.com/service/2/app_log/", new String[]{"http://log.isnssdk.com/service/2/device_register/", "http://log.isnssdk.com/service/2/device_register/"}, "http://ichannel.isnssdk.com/service/2/app_alert_check/", "http://log.isnssdk.com/service/2/log_settings/", "http://log.isnssdk.com/service/2/app_log/", "http://log.isnssdk.com/service/2/log_settings/");
        f28120d = aeVar3;
        ae aeVar4 = new ae("https://log.sgsnssdk.com/service/2/app_log/", "https://rtlog.sgsnssdk.com/service/2/app_log/", new String[]{"https://log.sgsnssdk.com/service/2/device_register/", "https://log15.byteoversea.com/service/2/device_register/", "http://log.sgsnssdk.com/service/2/device_register/", "http://log15.byteoversea.com/service/2/device_register/"}, "https://ichannel.sgsnssdk.com/service/2/app_alert_check/", "https://log.sgsnssdk.com/service/2/log_settings/", "http://log.sgsnssdk.com/service/2/app_log/", "http://log.sgsnssdk.com/service/2/log_settings/");
        f28121e = aeVar4;
        ae aeVar5 = new ae("https://log.byteoversea.com/service/2/app_log/", "https://rtlog.byteoversea.com/service/2/app_log/", new String[]{"https://log.byteoversea.com/service/2/device_register/", "http://log.byteoversea.com/service/2/device_register/"}, "https://i.byteoversea.com/service/2/app_alert_check/", "https://log.byteoversea.com/service/2/log_settings/", "http://log.byteoversea.com/service/2/app_log/", "http://log.byteoversea.com/service/2/log_settings/");
        f28122f = aeVar5;
        ae aeVar6 = new ae("https://applog.musical.ly/service/2/app_log/", "https://rtlog.musical.ly/service/2/app_log/", new String[]{"https://applog.musical.ly/service/2/device_register/", "http://applog.musical.ly/service/2/device_register/"}, "https://ichannel.musical.ly/service/2/app_alert_check/", "https://applog.musical.ly/service/2/log_settings/", "http://applog.musical.ly/service/2/app_log/", "http://applog.musical.ly/service/2/log_settings/");
        g = aeVar6;
        ae aeVar7 = new ae("http://applog.musical.ly/service/2/app_log/", "http://rtlog.musical.ly/service/2/app_log/", new String[]{"http://applog.musical.ly/service/2/device_register/", "http://applog.musical.ly/service/2/device_register/"}, "http://ichannel.musical.ly/service/2/app_alert_check/", "http://applog.musical.ly/service/2/log_settings/", "http://applog.musical.ly/service/2/app_log/", "http://applog.musical.ly/service/2/log_settings/");
        h = aeVar7;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f28117a, false, 15685, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f28117a, false, 15685, new Class[0], String.class);
        }
        return super.toString() + ":\nmApplogURL : " + this.i + "\nmApplogTimelyUrl : " + this.k + "\nmDeviceRegisterUrl : " + this.m + "\nmAppActiveUrl : " + this.l + "\nmApplogSettingsUrl : " + this.j + "\n\nmApplogFallbackUrl : " + this.n + "\nmApplogSettingsFallbackUrl : " + this.o + "\n\n\n\n";
    }

    private ae(String str, String str2, String[] strArr, String str3, String str4, String str5, String str6) {
        this.i = str;
        this.j = str4;
        this.k = str2;
        this.l = str3;
        this.m = strArr;
        this.n = str5;
        this.o = str6;
    }
}
