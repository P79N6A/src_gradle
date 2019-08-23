package com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.vesdk.m;

public final /* synthetic */ class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68700a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68701b;

    c(a aVar) {
        this.f68701b = aVar;
    }

    public final void a(int i, int i2, float f2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f68700a, false, 78064, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f68700a, false, 78064, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
            return;
        }
        a aVar = this.f68701b;
        if (i == 4101) {
            if (aVar.g >= aVar.f68688d) {
                aVar.k.sendEmptyMessage(1003);
            } else {
                aVar.g++;
                aVar.i.sendEmptyMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
            }
        }
    }
}
