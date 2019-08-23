package com.bytedance.android.livesdk.admin.c;

import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.admin.api.AdminApi2;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8963a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.android.livesdk.admin.d.a f8964b;

    /* renamed from: c  reason: collision with root package name */
    private AdminApi2 f8965c = ((AdminApi2) j.q().d().a(AdminApi2.class));

    public a(com.bytedance.android.livesdk.admin.d.a aVar) {
        this.f8964b = aVar;
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f8963a, false, 3084, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f8963a, false, 3084, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f8965c.fetchAdministrators(j, TTLiveSDKContext.getHostService().k().a(j), TTLiveSDKContext.getHostService().k().a().getSecUid()).compose(i.a()).subscribe(new d(this), new e(this));
    }

    public final void a(boolean z, long j, long j2, long j3) {
        int i;
        boolean z2 = z;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), new Long(j4), new Long(j5), new Long(j6)}, this, f8963a, false, 3083, new Class[]{Boolean.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j4), new Long(j5), new Long(j6)}, this, f8963a, false, 3083, new Class[]{Boolean.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        AdminApi2 adminApi2 = this.f8965c;
        if (z2) {
            i = 3;
        } else {
            i = 2;
        }
        adminApi2.updateAdmin(i, j, j2, j3).compose(i.a()).subscribe(new b(this, j4, z2), new c(this, z2));
    }
}
