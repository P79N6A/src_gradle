package com.ss.android.ugc.aweme.q;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import java.util.HashSet;
import java.util.List;

public final /* synthetic */ class d implements com.ss.android.ugc.aweme.global.config.settings.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63307a;

    /* renamed from: b  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.global.config.settings.d f63308b = new d();

    private d() {
    }

    public final void a(a aVar) {
        Integer num;
        List<String> list;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63307a, false, 54896, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f63307a, false, 54896, new Class[]{a.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = k.b().getSharedPreferences("keva_switch_repo", 0).edit();
        if (PatchProxy.isSupport(new Object[0], aVar, a.f49567a, false, 48783, new Class[0], Integer.class)) {
            num = (Integer) PatchProxy.accessDispatch(new Object[0], aVar, a.f49567a, false, 48783, new Class[0], Integer.class);
        } else if (aVar.f49569c == null) {
            num = aVar.f49568b.getKevaSwitch();
        } else {
            num = (Integer) a.a(aVar.f49569c, "keva_switch", Integer.class, aVar.f49568b.getKevaSwitch());
        }
        if (num.intValue() != 1) {
            z = false;
        }
        SharedPreferences.Editor putBoolean = edit.putBoolean("keva_switch", z);
        if (PatchProxy.isSupport(new Object[0], aVar, a.f49567a, false, 48784, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], aVar, a.f49567a, false, 48784, new Class[0], List.class);
        } else if (aVar.f49569c == null) {
            list = aVar.f49568b.getKevaBlacklist();
        } else {
            list = a.a(aVar.f49569c, "keva_blacklist", String.class, aVar.f49568b.getKevaBlacklist());
        }
        putBoolean.putStringSet("keva_blacklist", new HashSet(list)).apply();
    }
}
