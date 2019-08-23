package com.ss.android.ugc.aweme.shortvideo.game;

import android.arch.lifecycle.Observer;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ax;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.y;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67862a;

    /* renamed from: b  reason: collision with root package name */
    private final a f67863b;

    /* renamed from: c  reason: collision with root package name */
    private final VideoRecordNewActivity f67864c;

    b(a aVar, VideoRecordNewActivity videoRecordNewActivity) {
        this.f67863b = aVar;
        this.f67864c = videoRecordNewActivity;
    }

    public final void onChanged(Object obj) {
        boolean z;
        long j;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67862a, false, 77356, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67862a, false, 77356, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f67863b;
        VideoRecordNewActivity videoRecordNewActivity = this.f67864c;
        Pair pair = (Pair) obj;
        if (pair != null && ((Boolean) pair.first).booleanValue()) {
            if (PatchProxy.isSupport(new Object[0], aVar, a.f67852a, false, 77354, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], aVar, a.f67852a, false, 77354, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                fh d2 = aVar.d();
                long a2 = ff.a();
                if (d2.b() && d2.ab != 1) {
                    a2 = d2.f67720c;
                }
                if (PatchProxy.isSupport(new Object[0], aVar, a.f67852a, false, 77355, new Class[0], Long.TYPE)) {
                    j = ((Long) PatchProxy.accessDispatch(new Object[0], aVar, a.f67852a, false, 77355, new Class[0], Long.TYPE)).longValue();
                } else {
                    j = TimeSpeedModelExtension.calculateRealTime(aVar.f67853b.b().b() / 1000, 1.0d) + aVar.d().n;
                }
                z = j < a2;
            }
            if (!z && aVar.f67857f) {
                aVar.i = true;
                aVar.d().ac = ((Integer) pair.second).intValue();
                videoRecordNewActivity.k().a((Object) aVar, (bc) new ax());
                videoRecordNewActivity.z.a((Object) aVar, (bc) new y("record_full"));
            }
        }
    }
}
