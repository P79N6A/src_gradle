package com.ss.android.ugc.aweme.shortvideo.i;

import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.aweme.video.b;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68200a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68201b;

    e(a aVar) {
        this.f68201b = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68200a, false, 78291, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68200a, false, 78291, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f68201b;
        if (!b.b(aVar.j) || !b.b(aVar.k)) {
            int[] a2 = FFMpegManager.a().a(aVar.i);
            FFMpegManager.a().b();
            if (a2[0] == 0) {
                aVar.n = aVar.a(a2[2] / 2);
                aVar.o = aVar.a(a2[3] / 2);
                FFMpegManager.a aVar2 = new FFMpegManager.a();
                aVar2.o = aVar.n;
                aVar2.p = aVar.o;
                aVar2.f29317c = aVar.k;
                aVar2.f29315a = aVar.i;
                aVar2.f29316b = aVar.j;
                aVar2.f29320f = UIUtils.getScreenWidth(aVar.f68176b);
                aVar2.f29318d = 0;
                aVar2.f29319e = (long) a2[1];
                aVar2.j = 0;
                aVar2.n = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                aVar2.u = true;
                if (FFMpegManager.a().a(aVar2) == 0) {
                    aVar.c();
                    return;
                }
            }
            aVar.d();
            return;
        }
        aVar.c();
    }
}
