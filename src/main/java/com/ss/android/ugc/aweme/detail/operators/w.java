package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.profile.presenter.b;

public final class w extends a<b, com.ss.android.ugc.aweme.common.f.b<b>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41282a;

    /* renamed from: e  reason: collision with root package name */
    private boolean f41283e;

    /* renamed from: f  reason: collision with root package name */
    private String f41284f;

    private int d() {
        if (this.f41283e) {
            return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
        return 2000;
    }

    public final int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41282a, false, 34831, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return d() + i;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41282a, false, 34831, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public w(@Nullable a aVar, boolean z, String str) {
        b bVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
        } else {
            bVar = new b();
        }
        this.f41200c = bVar;
        this.f41201d = new com.ss.android.ugc.aweme.common.f.b();
        this.f41283e = z;
        this.f41284f = str;
    }

    public final void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41282a, false, 34832, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41282a, false, 34832, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41201d.a(Integer.valueOf(i), Boolean.TRUE, this.f41284f, Integer.valueOf(bVar.getVideoType()), Integer.valueOf(d()));
    }
}
