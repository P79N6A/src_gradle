package com.ss.android.ugc.aweme.shortvideo.filter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.filter.as;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.b.p;
import java.util.List;

public final class b implements as {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67726a;

    /* renamed from: b  reason: collision with root package name */
    private EffectPlatform f67727b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67726a, false, 77251, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67726a, false, 77251, new Class[0], Void.TYPE);
            return;
        }
        this.f67727b.e();
    }

    public b(@NonNull EffectPlatform effectPlatform) {
        this.f67727b = effectPlatform;
    }

    public final void a(@Nullable String str, @Nullable String str2, @NonNull p pVar) {
        String str3 = str;
        String str4 = str2;
        p pVar2 = pVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, pVar2}, this, f67726a, false, 77250, new Class[]{String.class, String.class, p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, pVar2}, this, f67726a, false, 77250, new Class[]{String.class, String.class, p.class}, Void.TYPE);
            return;
        }
        this.f67727b.a(str3, str4, pVar2);
    }

    public final void a(String str, List<String> list, String str2, @NonNull m mVar) {
        String str3 = str;
        List<String> list2 = list;
        String str4 = str2;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{str3, list2, str4, mVar2}, this, f67726a, false, 77249, new Class[]{String.class, List.class, String.class, m.class}, Void.TYPE)) {
            Object[] objArr = {str3, list2, str4, mVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f67726a, false, 77249, new Class[]{String.class, List.class, String.class, m.class}, Void.TYPE);
            return;
        }
        this.f67727b.a(str3, list2, str4, mVar2);
    }
}
