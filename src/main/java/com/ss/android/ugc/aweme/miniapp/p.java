package com.ss.android.ugc.aweme.miniapp;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.d;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/miniapp/MiniAppRouter;", "Lcom/ss/android/ugc/aweme/router/IRouter;", "()V", "miniAppService", "Lcom/ss/android/ugc/aweme/miniapp_api/services/IMiniAppService;", "kotlin.jvm.PlatformType", "open", "", "context", "Landroid/app/Activity;", "url", "", "view", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55871a;

    /* renamed from: b  reason: collision with root package name */
    private final IMiniAppService f55872b = ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class));

    public final boolean a(@Nullable String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f55871a, false, 59038, new Class[]{String.class}, Boolean.TYPE)) {
            return a(null, str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f55871a, false, 59038, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(@Nullable Activity activity, @Nullable String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{activity2, str2}, this, f55871a, false, 59039, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return a(activity2, str2, null);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f55871a, false, 59039, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(@Nullable Activity activity, @Nullable String str, @Nullable View view) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity, str2, view}, this, f55871a, false, 59040, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, str2, view}, this, f55871a, false, 59040, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(str2)) {
            if (this.f55872b.openMiniApp(activity, str2, new b.a().b("sslocal://microapp").a())) {
                return true;
            }
        }
        return false;
    }
}
