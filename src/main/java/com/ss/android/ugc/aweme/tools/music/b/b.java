package com.ss.android.ugc.aweme.tools.music.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"ABMusicPanelType", "", "tools.music_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74853a;

    public static final int a() {
        if (PatchProxy.isSupport(new Object[0], null, f74853a, true, 87201, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f74853a, true, 87201, new Class[0], Integer.TYPE)).intValue();
        }
        if (a.a()) {
            return 1;
        }
        IAVSettingsService avSettingsService = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService();
        Intrinsics.checkExpressionValueIsNotNull(avSettingsService, "ServiceManager.get().get…java).avSettingsService()");
        return avSettingsService.getEditPageMusicPanelOptimization();
    }
}
