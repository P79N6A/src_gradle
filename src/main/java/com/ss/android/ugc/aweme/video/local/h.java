package com.ss.android.ugc.aweme.video.local;

import com.bytedance.keva.Keva;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\tH\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/video/local/PlayerSettingConfig;", "", "()V", "KEY_USE_SURFACE_VIEW", "", "REPO_NAME", "keva", "Lcom/bytedance/keva/Keva;", "useSurfaceView", "", "getUseSurfaceView", "loadCache", "", "setUseSurfaceView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76170a;

    /* renamed from: b  reason: collision with root package name */
    public static final Keva f76171b;

    /* renamed from: c  reason: collision with root package name */
    public static final h f76172c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f76173d = f76171b.getBoolean("useSurfaceView", false);

    private h() {
    }

    @JvmStatic
    public static final boolean a() {
        return f76173d;
    }

    static {
        h hVar = new h();
        f76172c = hVar;
        Keva repoSync = Keva.getRepoSync("player_setting", 0);
        Intrinsics.checkExpressionValueIsNotNull(repoSync, "Keva.getRepoSync(PlayerS…ants.MODE_SINGLE_PROCESS)");
        f76171b = repoSync;
        if (PatchProxy.isSupport(new Object[0], hVar, f76170a, false, 89161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], hVar, f76170a, false, 89161, new Class[0], Void.TYPE);
            return;
        }
    }
}
