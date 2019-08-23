package com.ss.android.ugc.aweme.setting;

import com.douyin.share.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.c;
import com.ss.android.ugc.aweme.global.config.settings.a;
import com.ss.android.ugc.aweme.setting.a.d;
import com.ss.android.ugc.aweme.utils.bg;

public final class e extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f63952c;

    public final void b(com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar) {
        Boolean bool;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f63952c, false, 72045, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f63952c, false, 72045, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE);
            return;
        }
        bg.b(new d(aVar2));
        h a2 = h.a();
        if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48538, new Class[0], Boolean.class)) {
            bool = (Boolean) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48538, new Class[0], Boolean.class);
        } else if (aVar2.f49569c == null) {
            bool = aVar2.f49568b.getHasWeixinSuppress();
        } else {
            bool = (Boolean) com.ss.android.ugc.aweme.global.config.settings.pojo.a.a(aVar2.f49569c, "has_weixin_suppress", Boolean.class, aVar2.f49568b.getHasWeixinSuppress());
        }
        a2.f23231a = bool.booleanValue();
        c a3 = c.a();
        if (PatchProxy.isSupport(new Object[]{aVar2}, a3, c.f33371a, false, 21686, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE)) {
            c cVar = a3;
            PatchProxy.accessDispatch(new Object[]{aVar2}, cVar, c.f33371a, false, 21686, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48476, new Class[0], Integer.class)) {
                num = (Integer) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48476, new Class[0], Integer.class);
            } else if (aVar2.f49569c == null) {
                num = aVar2.f49568b.getAntiAddictionSeparation();
            } else {
                num = (Integer) com.ss.android.ugc.aweme.global.config.settings.pojo.a.a(aVar2.f49569c, "anti_addiction_separation", Integer.class, aVar2.f49568b.getAntiAddictionSeparation());
            }
            a3.f33372b = num.intValue();
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48477, new Class[0], Integer.class)) {
                num2 = (Integer) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48477, new Class[0], Integer.class);
            } else if (aVar2.f49569c == null) {
                num2 = aVar2.f49568b.getAntiAddictionDayTime();
            } else {
                num2 = (Integer) com.ss.android.ugc.aweme.global.config.settings.pojo.a.a(aVar2.f49569c, "anti_addiction_day_time", Integer.class, aVar2.f49568b.getAntiAddictionDayTime());
            }
            a3.f33373c = num2.intValue();
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48478, new Class[0], Integer.class)) {
                num3 = (Integer) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48478, new Class[0], Integer.class);
            } else if (aVar2.f49569c == null) {
                num3 = aVar2.f49568b.getAntiAddictionNightTime();
            } else {
                num3 = (Integer) com.ss.android.ugc.aweme.global.config.settings.pojo.a.a(aVar2.f49569c, "anti_addiction_night_time", Integer.class, aVar2.f49568b.getAntiAddictionNightTime());
            }
            a3.f33374d = num3.intValue();
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48479, new Class[0], Integer.class)) {
                num4 = (Integer) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48479, new Class[0], Integer.class);
            } else if (aVar2.f49569c == null) {
                num4 = aVar2.f49568b.getAntiAddictionToastTime();
            } else {
                num4 = (Integer) com.ss.android.ugc.aweme.global.config.settings.pojo.a.a(aVar2.f49569c, "anti_addiction_toast_time", Integer.class, aVar2.f49568b.getAntiAddictionToastTime());
            }
            a3.f33375e = num4.intValue();
        }
        org.greenrobot.eventbus.c.a().d(new com.ss.android.ugc.aweme.rocket.h(aVar2));
    }
}
