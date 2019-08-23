package com.ss.android.ugc.aweme.ag;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J&\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/router/RedirectRouter;", "Lcom/ss/android/ugc/aweme/router/IRouter;", "routerOpen", "Lcom/ss/android/ugc/aweme/router/RouterManager$IRouterOpen;", "(Lcom/ss/android/ugc/aweme/router/RouterManager$IRouterOpen;)V", "convertUrl", "", "url", "open", "", "context", "Landroid/app/Activity;", "view", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33240a;

    /* renamed from: b  reason: collision with root package name */
    private final h.b f33241b;

    public e(@NotNull h.b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "routerOpen");
        this.f33241b = bVar;
    }

    private final String b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f33240a, false, 70927, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f33240a, false, 70927, new Class[]{String.class}, String.class);
        } else if (str2 == null) {
            return null;
        } else {
            return this.f33241b.a(str2);
        }
    }

    public final boolean a(@Nullable String str) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str}, this, f33240a, false, 70924, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f33240a, false, 70924, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        String b2 = b(str);
        CharSequence charSequence = b2;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            return false;
        }
        return h.a().a(b2);
    }

    public final boolean a(@Nullable Activity activity, @Nullable String str) {
        Activity activity2 = activity;
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, this, f33240a, false, 70925, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f33240a, false, 70925, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        String b2 = b(str2);
        CharSequence charSequence = b2;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            return false;
        }
        return h.a().a(activity2, b2);
    }

    public final boolean a(@Nullable Activity activity, @Nullable String str, @Nullable View view) {
        Activity activity2 = activity;
        String str2 = str;
        View view2 = view;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, view2}, this, f33240a, false, 70926, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2, view2}, this, f33240a, false, 70926, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        String b2 = b(str2);
        CharSequence charSequence = b2;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            return false;
        }
        return h.a().a(activity2, b2, view2);
    }
}
