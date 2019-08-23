package com.ss.android.ugc.aweme.setting.api;

import a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.setting.model.SettingUserHasSetPwd;

public final class d extends com.ss.android.ugc.aweme.common.a<SettingUserHasSetPwd> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63848a;

    /* renamed from: b  reason: collision with root package name */
    public a f63849b;

    /* renamed from: c  reason: collision with root package name */
    private final SettingApi f63850c = ((SettingApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(SettingApi.class));

    public interface a {
        void a(String str);

        void a(boolean z);
    }

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63848a, false, 72149, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63848a, false, 72149, new Class[0], Void.TYPE);
            return;
        }
        this.f63850c.queryUserHasSetPwd().a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
    }

    public final /* synthetic */ void handleData(Object obj) {
        SettingUserHasSetPwd settingUserHasSetPwd = (SettingUserHasSetPwd) obj;
        if (PatchProxy.isSupport(new Object[]{settingUserHasSetPwd}, this, f63848a, false, 72150, new Class[]{SettingUserHasSetPwd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{settingUserHasSetPwd}, this, f63848a, false, 72150, new Class[]{SettingUserHasSetPwd.class}, Void.TYPE);
            return;
        }
        super.handleData(settingUserHasSetPwd);
        if (!(this.f63849b == null || settingUserHasSetPwd == null || settingUserHasSetPwd.data == null)) {
            if ("success".equals(settingUserHasSetPwd.message)) {
                this.f63849b.a(settingUserHasSetPwd.data.hasSet);
                return;
            }
            this.f63849b.a(settingUserHasSetPwd.data.description);
        }
    }
}
