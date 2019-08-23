package com.ss.android.ugc.aweme.qrcode.v2;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements MessageCenter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63540a;

    /* renamed from: b  reason: collision with root package name */
    private final ScanQRCodeActivityV2 f63541b;

    e(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.f63541b = scanQRCodeActivityV2;
    }

    public final void onMessageReceived(int i, int i2, int i3, String str) {
        int i4 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f63540a, false, 70587, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f63540a, false, 70587, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.f63541b;
        if (((long) i4) == 26 && scanQRCodeActivityV2.m != null && !CollectionUtils.isEmpty(scanQRCodeActivityV2.m.f63377c) && scanQRCodeActivityV2.m.f63377c.contains(str2) && !scanQRCodeActivityV2.q && scanQRCodeActivityV2.r && scanQRCodeActivityV2.j != null) {
            scanQRCodeActivityV2.j.a(scanQRCodeActivityV2.n, i4, str2, scanQRCodeActivityV2.s);
            scanQRCodeActivityV2.q = true;
        }
    }
}
