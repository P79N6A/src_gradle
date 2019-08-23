package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.e.a;
import com.ss.android.ugc.aweme.q.c;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/NetCommonParamHelper;", "", "()V", "KEY_EFFECT_CHANNEL", "", "SP_FILE_NAME", "isLoaded", "", "value", "isUsingOnline", "()Z", "setUsingOnline", "(Z)V", "addEffectChannel", "", "appContext", "Lcom/ss/android/common/AppContext;", "params", "", "addEffectChannelIfNeeded", "srcUrl", "getEffectChannel", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74601a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f74602b;

    /* renamed from: c  reason: collision with root package name */
    public static final ad f74603c = new ad();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f74604d;

    private ad() {
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f74601a, false, 86973, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74601a, false, 86973, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!f74604d) {
            f74604d = true;
            f74602b = c.a(a.a(), "effect_setting", 0).getBoolean("key_effect_channle", false);
        }
        return f74602b;
    }
}
