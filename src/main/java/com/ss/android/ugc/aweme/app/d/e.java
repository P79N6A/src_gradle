package com.ss.android.ugc.aweme.app.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/app/event/LaunchDataBoat;", "", "()V", "value", "", "enterTo", "getEnterTo", "()Ljava/lang/String;", "setEnterTo", "(Ljava/lang/String;)V", "launchMethod", "getLaunchMethod", "setLaunchMethod", "pageSource", "getPageSource", "setPageSource", "platform", "getPlatform", "setPlatform", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34119a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f34120b = "";
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f34121c = "";
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public String f34122d = "";
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public String f34123e = "";

    public final void a(@NotNull String str) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str}, this, f34119a, false, 23489, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34119a, false, 23489, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "value");
        if (this.f34120b.length() != 0) {
            z = false;
        }
        if (z) {
            this.f34120b = str;
        }
    }
}
