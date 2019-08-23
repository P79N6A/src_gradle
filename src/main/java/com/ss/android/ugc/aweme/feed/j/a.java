package com.ss.android.ugc.aweme.feed.j;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\t¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/util/SkyLightLogger;", "", "()V", "logSkyLightBtnClick", "", "logSkyLightBtnClose", "logSkyLightBtnShow", "logSkyLightClose", "enterMethod", "", "logSkyLightDuration", "duration", "", "logSkyLightHeadShow", "authorId", "roomId", "requestId", "logSkyLightShow", "logTopListRefresh", "refreshType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45559a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f45560b = new a();

    private a() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f45559a, false, 43579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45559a, false, 43579, new Class[0], Void.TYPE);
            return;
        }
        r.a("livesdk_show", (Map) d.a().a("enter_from_merge", "homepage_follow").a("enter_method", "manual_show").f34114b);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45559a, false, 43580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45559a, false, 43580, new Class[0], Void.TYPE);
            return;
        }
        r.a("livesdk_click", (Map) d.a().a("enter_from_merge", "homepage_follow").a("enter_method", "manual_click").a("action_type", "click").f34114b);
    }

    public final void c(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f45559a, false, 43583, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f45559a, false, 43583, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "enterMethod");
        r.a("livesdk_skylight_close", (Map) d.a().a("enter_from_merge", "homepage_follow").a("enter_method", str2).a("action_type", "click").f34114b);
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f45559a, false, 43578, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f45559a, false, 43578, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "refreshType");
        r.a("livesdk_toplist_refresh", (Map) d.a().a("enter_from_merge", "homepage_follow").a("enter_method", "live_cover").a("action_type", "click").a("refresh_type", str2).f34114b);
    }

    public final void b(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f45559a, false, 43582, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f45559a, false, 43582, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "enterMethod");
        r.a("livesdk_skylight_show", (Map) d.a().a("enter_from_merge", "homepage_follow").a("enter_method", str2).a("action_type", "click").f34114b);
    }

    public final void a(@NotNull String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f45559a, false, 43584, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f45559a, false, 43584, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "enterMethod");
        r.a("livesdk_skylight_duration", (Map) d.a().a("enter_from_merge", "homepage_follow").a("enter_method", str2).a("duration", j2).a("action_type", "click").f34114b);
    }
}
