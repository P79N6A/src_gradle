package com.ss.android.ugc.aweme.feed.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/utils/FetchContentLanguageUtil;", "Lcom/ss/android/ugc/aweme/setting/serverpush/PushSettingsManager$PushSettingCallback;", "()V", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i implements a.C0028a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45596a;

    public final void a(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f45596a, false, 43619, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f45596a, false, 43619, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
    }

    public final void a(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f45596a, false, 43618, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f45596a, false, 43618, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "settings");
        if (cVar2.B != null) {
            String str = "";
            int size = cVar2.B.size();
            for (int i = 0; i < size; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                com.ss.android.ugc.aweme.setting.serverpush.a.a aVar = cVar2.B.get(i);
                Intrinsics.checkExpressionValueIsNotNull(aVar, "settings.selectedContentLanguage[i]");
                sb.append(aVar.f64020a);
                sb.append(",");
                str = sb.toString();
            }
            SharePrefCache inst = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
            an<String> userAddLanguages = inst.getUserAddLanguages();
            Intrinsics.checkExpressionValueIsNotNull(userAddLanguages, "SharePrefCache.inst().userAddLanguages");
            userAddLanguages.a(str);
        }
    }
}
