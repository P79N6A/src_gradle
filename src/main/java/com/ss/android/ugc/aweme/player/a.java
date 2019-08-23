package com.ss.android.ugc.aweme.player;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J \u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/player/PlayerDebugLog;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "d", "", "msg", "tag", "e", "tr", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59054a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final a f59055b = new a();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final String f59056c = f59056c;

    private a() {
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f59054a, false, 64186, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f59054a, false, 64186, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "tag");
        Intrinsics.checkParameterIsNotNull(str4, "msg");
        if (com.ss.android.ugc.aweme.g.a.a()) {
        }
    }
}
