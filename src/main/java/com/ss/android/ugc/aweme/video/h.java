package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.player.ab.PlayerTypeAbConfig;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.k;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.playerkit.c.c;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76086a;

    public static PlayerTypeAbConfig a() {
        if (PatchProxy.isSupport(new Object[0], null, f76086a, true, 88930, new Class[0], PlayerTypeAbConfig.class)) {
            return (PlayerTypeAbConfig) PatchProxy.accessDispatch(new Object[0], null, f76086a, true, 88930, new Class[0], PlayerTypeAbConfig.class);
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71789, new Class[0], PlayerTypeAbConfig.class)) {
            return (PlayerTypeAbConfig) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71789, new Class[0], PlayerTypeAbConfig.class);
        }
        AbTestModel d2 = a2.d();
        if (d2 == null) {
            return null;
        }
        return d2.playerTypeV2;
    }

    private static int c() {
        if (PatchProxy.isSupport(new Object[0], null, f76086a, true, 88929, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f76086a, true, 88929, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71788, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71788, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestModel d2 = a2.d();
        if (d2 == null) {
            return 0;
        }
        return d2.playerType;
    }

    public static c.a b() {
        c.a aVar;
        if (PatchProxy.isSupport(new Object[0], null, f76086a, true, 88931, new Class[0], c.a.class)) {
            return (c.a) PatchProxy.accessDispatch(new Object[0], null, f76086a, true, 88931, new Class[0], c.a.class);
        }
        boolean z = AbTestManager.a().d().playerForceNoIJK;
        if (k.b() && !z) {
            return k.a();
        }
        if (((Integer) x.a().T().c()).intValue() == 1 && !z) {
            return c.a.IjkHardware;
        }
        PlayerTypeAbConfig a2 = a();
        if (a2 == null) {
            switch (c()) {
                case 0:
                    aVar = c.a.TT;
                    break;
                case 1:
                case 2:
                    aVar = c.a.Ijk;
                    break;
                case 3:
                    aVar = c.a.EXO;
                    break;
                case 4:
                    aVar = c.a.IjkHardware;
                    break;
                case 5:
                    aVar = c.a.TT_IJK_ENGINE;
                    break;
                case 6:
                    aVar = c.a.TT_HARDWARE;
                    break;
                default:
                    aVar = c.a.Ijk;
                    break;
            }
        } else if (a2.f59102a == 0) {
            aVar = c.a.TT;
        } else if (a2.f59103b == 1) {
            aVar = c.a.IjkHardware;
        } else {
            aVar = c.a.Ijk;
        }
        if (!(aVar == c.a.TT || aVar == c.a.TT_HARDWARE || !z)) {
            aVar = c.a.TT;
        }
        return aVar;
    }
}
