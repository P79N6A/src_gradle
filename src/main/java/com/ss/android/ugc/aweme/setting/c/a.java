package com.ss.android.ugc.aweme.setting.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import com.ss.android.ugc.aweme.setting.serverpush.a.b;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/joinbeta/JoinBetaManager;", "Lcom/ss/android/ugc/aweme/setting/serverpush/PushSettingsManager$PushSettingCallback;", "()V", "joinBetaEntrance", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/JoinBetaEntrance;", "getJoinBetaEntrance", "()Lcom/ss/android/ugc/aweme/setting/serverpush/model/JoinBetaEntrance;", "setJoinBetaEntrance", "(Lcom/ss/android/ugc/aweme/setting/serverpush/model/JoinBetaEntrance;)V", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements a.C0028a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63860a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f63861b = new a();
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private static b f63862c;

    private a() {
    }

    @Nullable
    public static b a() {
        return f63862c;
    }

    public final void a(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f63860a, false, 72224, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f63860a, false, 72224, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        f63862c = null;
    }

    public final void a(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f63860a, false, 72223, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f63860a, false, 72223, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "settings");
        if (com.ss.android.g.a.a()) {
            f63862c = cVar2.G;
        }
    }
}
