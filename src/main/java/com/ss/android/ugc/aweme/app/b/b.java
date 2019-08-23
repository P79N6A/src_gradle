package com.ss.android.ugc.aweme.app.b;

import android.support.annotation.Nullable;
import com.bytedance.crash.a;
import com.bytedance.crash.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.utils.ay;
import java.util.HashMap;
import java.util.Map;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33972a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f33973b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private a f33974c;

    public b(a aVar) {
        this.f33974c = aVar;
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        this.f33973b.put("git_sha", "70269d3c718");
        this.f33973b.put("git_branch", "HEAD");
        this.f33973b.put("abi", System.getProperty("os.arch"));
        this.f33973b.put("veSdk", iAVService.getVESDKVersion());
        this.f33973b.put("effectSdk", iAVService.getEffectSDKVersion());
        this.f33973b.put("player_type", String.valueOf(com.ss.android.ugc.playerkit.c.a.r().a()));
        this.f33973b.put("preloader_type", String.valueOf(com.ss.android.ugc.playerkit.c.a.r().h()));
        this.f33973b.put("ttplayer_version", "295308");
        this.f33973b.put("real_machine", String.valueOf(com.ss.android.ugc.aweme.common.h.b.a()));
        Map<? extends String, ? extends String> a2 = this.f33974c.a(d.ALL);
        if (a2 != null) {
            this.f33973b.putAll(a2);
        }
        a(this.f33973b);
    }

    private Map<String, String> a(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, this, f33972a, false, 23309, new Class[]{Map.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{map2}, this, f33972a, false, 23309, new Class[]{Map.class}, Map.class);
        }
        if (map2 != null && !map2.containsKey("curUserId") && com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            map2.put("curUserId", com.ss.android.ugc.aweme.account.d.a().getCurUserId());
            if (com.ss.android.ugc.aweme.account.d.a().getCurUser() != null) {
                map2.put("shortId", com.ss.android.ugc.aweme.account.d.a().getCurUser().getShortId());
                map2.put("nickname", com.ss.android.ugc.aweme.account.d.a().getCurUser().getNickname());
            }
        }
        return map2;
    }

    @Nullable
    public final Map<? extends String, ? extends String> a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f33972a, false, 23310, new Class[]{d.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{dVar}, this, f33972a, false, 23310, new Class[]{d.class}, Map.class);
        }
        if (dVar == d.JAVA || dVar == d.LAUNCH || dVar == d.NATIVE) {
            if (PatchProxy.isSupport(new Object[0], this, f33972a, false, 23312, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33972a, false, 23312, new Class[0], Void.TYPE);
            } else {
                ay.f e2 = ay.e();
                if (e2 != null) {
                    this.f33973b.put("vmPeak", String.valueOf(e2.f75569a));
                    this.f33973b.put("vmSize", String.valueOf(e2.f75570b));
                    this.f33973b.put("fdCount", String.valueOf(e2.f75572d));
                    this.f33973b.put("maxFdCount", String.valueOf(e2.f75571c));
                    this.f33973b.put("threadCount", String.valueOf(e2.f75573e));
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f33972a, false, 23311, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33972a, false, 23311, new Class[0], Void.TYPE);
        } else {
            this.f33973b.put("root", String.valueOf(ay.f()));
        }
        return a(this.f33973b);
    }
}
