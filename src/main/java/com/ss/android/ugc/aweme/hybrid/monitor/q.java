package com.ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/hybrid/monitor/UriFactory;", "", "()V", "provideH5Uri", "Landroid/net/Uri;", "url", "", "provideReactNativeUri", "channel", "module", "aweme-hybrid-monitor_release"}, k = 1, mv = {1, 1, 15})
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49995a;

    /* renamed from: b  reason: collision with root package name */
    public static final q f49996b = new q();

    private q() {
    }

    @NotNull
    public final Uri a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f49995a, false, 49936, new Class[]{String.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{str2}, this, f49995a, false, 49936, new Class[]{String.class}, Uri.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        Uri parse = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(url)");
        return parse;
    }

    @NotNull
    public final Uri a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f49995a, false, 49935, new Class[]{String.class, String.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f49995a, false, 49935, new Class[]{String.class, String.class}, Uri.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "channel");
        Intrinsics.checkParameterIsNotNull(str4, "module");
        Uri build = new Uri.Builder().scheme("react-native").authority(str3).path(str4).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "Uri.Builder().scheme(\"re…nel).path(module).build()");
        return build;
    }
}
