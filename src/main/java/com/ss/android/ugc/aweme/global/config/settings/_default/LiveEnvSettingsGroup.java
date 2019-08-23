package com.ss.android.ugc.aweme.global.config.settings._default;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;

public class LiveEnvSettingsGroup extends AbstractSettingsGroup {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void addOptionalObjectDefaultValue() {
    }

    public void addDefaultValues(IESSettings.Builder builder) {
        IESSettings.Builder builder2 = builder;
        if (PatchProxy.isSupport(new Object[]{builder2}, this, changeQuickRedirect, false, 47605, new Class[]{IESSettings.Builder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{builder2}, this, changeQuickRedirect, false, 47605, new Class[]{IESSettings.Builder.class}, Void.TYPE);
            return;
        }
        builder2.live_square_guide_show_count(0);
    }
}
