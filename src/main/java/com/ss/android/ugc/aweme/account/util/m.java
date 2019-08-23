package com.ss.android.ugc.aweme.account.util;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/account/util/SettingUtils;", "", "()V", "isFlipchatLoginEnable", "", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33100a;

    /* renamed from: b  reason: collision with root package name */
    public static final m f33101b = new m();

    private m() {
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f33100a, false, 21340, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33100a, false, 21340, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            FlipChatSettings av = b2.av();
            Boolean mainSwitch = av.getMainSwitch();
            Intrinsics.checkExpressionValueIsNotNull(mainSwitch, "mainSwitch");
            if (mainSwitch.booleanValue()) {
                Boolean showLoginIcon = av.getShowLoginIcon();
                Intrinsics.checkExpressionValueIsNotNull(showLoginIcon, "showLoginIcon");
                if (showLoginIcon.booleanValue() && Build.VERSION.SDK_INT >= 21) {
                    z = true;
                }
            }
        } catch (com.bytedance.ies.a unused) {
        }
        return z;
    }
}
