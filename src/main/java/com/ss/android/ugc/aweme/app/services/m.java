package com.ss.android.ugc.aweme.app.services;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.main.h.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/DownloadService;", "Lcom/ss/android/ugc/aweme/main/service/IDownloadService;", "()V", "download", "", "url", "", "appName", "context", "Landroid/content/Context;", "isApk", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class m implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34281a;

    public final void a(@NotNull String str, @NotNull String str2, @NotNull Context context, boolean z) {
        String str3 = str;
        String str4 = str2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str3, str4, context2, (byte) 1}, this, f34281a, false, 23618, new Class[]{String.class, String.class, Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, context2, (byte) 1}, this, f34281a, false, 23618, new Class[]{String.class, String.class, Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(str4, "appName");
        Intrinsics.checkParameterIsNotNull(context2, "context");
        e.a(str3, str4, context2, true, (JSONObject) null);
    }
}
