package com.ss.android.ugc.aweme.video.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import com.ss.android.ugc.lib.video.bitrate.regulator.b.c;
import com.ss.android.ugc.lib.video.bitrate.regulator.b.d;
import com.ss.android.ugc.lib.video.bitrate.regulator.b.e;
import com.ss.android.ugc.playerkit.videoview.b.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76031a;

    /* renamed from: b  reason: collision with root package name */
    private e f76032b;

    public final e a(com.ss.android.ugc.playerkit.session.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f76031a, false, 89087, new Class[]{com.ss.android.ugc.playerkit.session.b.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{bVar}, this, f76031a, false, 89087, new Class[]{com.ss.android.ugc.playerkit.session.b.class}, e.class);
        }
        if (this.f76032b == null && VideoBitRateABManager.a().f76002c) {
            RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.a().f76001b;
            if (rateSettingsResponse != null) {
                if (com.ss.android.ugc.playerkit.c.a.r().g() != -1.0d) {
                    this.f76032b = new c.a(rateSettingsResponse.getAdaptiveGearGroup()).a(rateSettingsResponse.getGearSet()).b(rateSettingsResponse.getBandwidthSet()).a((com.ss.android.ugc.lib.video.bitrate.regulator.a.a) rateSettingsResponse.getAutoBitrateSet()).a();
                } else {
                    this.f76032b = new d.a(rateSettingsResponse.getAdaptiveGearGroup()).a(rateSettingsResponse.getGearSet()).b(rateSettingsResponse.getBandwidthSet()).a((com.ss.android.ugc.lib.video.bitrate.regulator.a.a) rateSettingsResponse.getAutoBitrateSet()).a();
                }
            }
        }
        return this.f76032b;
    }
}
