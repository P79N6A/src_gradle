package com.bytedance.android.livesdk.b;

import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.chatroom.api.BanTalkApi;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9082a;

    /* renamed from: b  reason: collision with root package name */
    public f f9083b;

    public final void a(boolean z, long j, long j2) {
        boolean z2 = z;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), new Long(j3), new Long(j4)}, this, f9082a, false, 3181, new Class[]{Boolean.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j3), new Long(j4)}, this, f9082a, false, 3181, new Class[]{Boolean.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        BanTalkApi banTalkApi = (BanTalkApi) j.q().d().a(BanTalkApi.class);
        if (z2) {
            banTalkApi.silence(j3, j4).compose(i.a()).subscribe(new b(this, z2), new c(this, z2));
        } else {
            banTalkApi.unsilence(j3, j4).compose(i.a()).subscribe(new d(this, z2), new e(this, z2));
        }
    }
}
