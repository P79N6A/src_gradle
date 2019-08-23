package com.ss.android.ugc.aweme.global.config.settings;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.WireDeserializeErrorListener;

public final /* synthetic */ class SettingsUtil$SettingsTTRetrofitFactory$$Lambda$0 implements WireDeserializeErrorListener {
    static final WireDeserializeErrorListener $instance = new SettingsUtil$SettingsTTRetrofitFactory$$Lambda$0();
    public static ChangeQuickRedirect changeQuickRedirect;

    private SettingsUtil$SettingsTTRetrofitFactory$$Lambda$0() {
    }

    public final void onError(Class cls, String str, Throwable th) {
        String str2 = str;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{cls, str2, th2}, this, changeQuickRedirect, false, 47601, new Class[]{Class.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls, str2, th2}, this, changeQuickRedirect, false, 47601, new Class[]{Class.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        String str3 = "errorFiled:" + str2 + " e.message:" + th.getMessage();
        if (PatchProxy.isSupport(new Object[]{str3}, null, SettingsUtil.f49523a, true, 47586, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, null, SettingsUtil.f49523a, true, 47586, new Class[]{String.class}, Void.TYPE);
        } else {
            TextUtils.isEmpty(str3);
        }
        SettingsUtil.a(cls.getCanonicalName(), str2, th2, "", 1);
    }
}
