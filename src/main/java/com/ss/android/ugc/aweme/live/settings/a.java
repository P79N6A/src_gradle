package com.ss.android.ugc.aweme.live.settings;

import com.bytedance.android.live.base.sp.TTLiveSettingUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53534a;

    /* renamed from: b  reason: collision with root package name */
    public static a f53535b = new a();

    /* renamed from: c  reason: collision with root package name */
    public LiveSDKSettingApi f53536c = ((LiveSDKSettingApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://" + com.ss.android.ugc.aweme.live.a.a()).create(LiveSDKSettingApi.class));

    private a() {
        if (PatchProxy.isSupport(new Object[0], null, d.f53357a, true, 55389, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, d.f53357a, true, 55389, new Class[0], Void.TYPE);
            return;
        }
        if ("local_test".equals(i.a().getChannel())) {
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, null, com.bytedance.android.livesdk.feed.j.a.f14209a, true, 8901, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 1}, null, com.bytedance.android.livesdk.feed.j.a.f14209a, true, 8901, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            TTLiveSettingUtil.setLocalTest(true);
        }
    }
}
