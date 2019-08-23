package com.bytedance.android.live.core.setting;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.LoginGuideConfig;
import com.bytedance.android.live.core.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8165a;

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f8165a, true, 891, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f8165a, true, 891, new Class[0], String.class);
        }
        LoginGuideConfig loginGuideConfig = (LoginGuideConfig) CoreSettingKeys.LOGIN_GUIDE.a();
        if (loginGuideConfig == null) {
            return null;
        }
        return loginGuideConfig.getImageUrlFromFollow();
    }

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f8165a, true, 890, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f8165a, true, 890, new Class[0], String.class);
        }
        LoginGuideConfig loginGuideConfig = (LoginGuideConfig) CoreSettingKeys.LOGIN_GUIDE.a();
        if (loginGuideConfig == null || TextUtils.isEmpty(loginGuideConfig.getFromFollow())) {
            return ac.a((int) C0906R.string.csj);
        }
        return loginGuideConfig.getFromFollow();
    }
}
