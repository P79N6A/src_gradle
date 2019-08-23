package com.ss.android.ugc.aweme.base.utils;

import android.media.AudioManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35048a;

    public static double a() {
        if (PatchProxy.isSupport(new Object[0], null, f35048a, true, 25286, new Class[0], Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[0], null, f35048a, true, 25286, new Class[0], Double.TYPE)).doubleValue();
        }
        double d2 = 0.0d;
        try {
            AudioManager audioManager = (AudioManager) d.a().getSystemService("audio");
            double streamVolume = (double) audioManager.getStreamVolume(3);
            Double.isNaN(streamVolume);
            double d3 = streamVolume * 1.0d;
            double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
            Double.isNaN(streamMaxVolume);
            d2 = d3 / streamMaxVolume;
        } catch (NullPointerException unused) {
        }
        return d2;
    }
}
