package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.f.b;
import com.tt.appbrandimpl.MicroGameVideoModel;

public final class l extends a<MicroGameVideoModel, b<MicroGameVideoModel>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41237a;

    /* renamed from: e  reason: collision with root package name */
    private boolean f41238e;

    public l(@Nullable a aVar) {
        MicroGameVideoModel microGameVideoModel;
        if (aVar instanceof MicroGameVideoModel) {
            microGameVideoModel = (MicroGameVideoModel) aVar;
        } else {
            microGameVideoModel = new MicroGameVideoModel();
        }
        this.f41200c = microGameVideoModel;
        this.f41201d = new b();
    }

    public final int a(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41237a, false, 34779, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41237a, false, 34779, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.f41238e) {
            i2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        } else {
            i2 = 2000;
        }
        return i2 + i;
    }

    public final void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41237a, false, 34780, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41237a, false, 34780, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        String microAppId = bVar.getMicroAppId();
        String hashTagName = bVar.getHashTagName();
        int cursor = bVar.getCursor();
        int count = bVar.getCount();
        this.f41201d.a(4, microAppId, hashTagName, Integer.valueOf(count), Integer.valueOf(cursor));
    }
}
