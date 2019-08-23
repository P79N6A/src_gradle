package com.ss.android.ugc.aweme.music.ui.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56655a;

    public static void a(String str, long j) {
        double d2;
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, null, f56655a, true, 60557, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, null, f56655a, true, 60557, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        long length = new File(str2).length();
        if (j2 == 0) {
            d2 = 0.0d;
        } else {
            d2 = (double) (length / j2);
        }
        n.a("aweme_music_download_error_rate", 0, c.a().a("duration", Long.valueOf(j)).a("use_sdk", Integer.valueOf(AbTestManager.a().ap() ? 1 : 0)).a("speed", Double.valueOf(d2)).a("size", Long.valueOf(length)).b());
        com.ss.android.ugc.traffic.a.y.b(length);
    }
}
