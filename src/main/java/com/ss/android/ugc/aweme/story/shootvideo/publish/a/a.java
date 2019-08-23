package com.ss.android.ugc.aweme.story.shootvideo.publish.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import org.jetbrains.annotations.NotNull;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73634a;

    public static a.C0028a a() {
        if (PatchProxy.isSupport(new Object[0], null, f73634a, true, 85434, new Class[0], a.C0028a.class)) {
            return (a.C0028a) PatchProxy.accessDispatch(new Object[0], null, f73634a, true, 85434, new Class[0], a.C0028a.class);
        }
        return new a.C0028a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73635a;

            public final void a(@NotNull Exception exc) {
            }

            public final void a(@NotNull c cVar) {
                boolean z;
                c cVar2 = cVar;
                boolean z2 = true;
                if (PatchProxy.isSupport(new Object[]{cVar2}, this, f73635a, false, 85435, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar2}, this, f73635a, false, 85435, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                if (cVar2 != null) {
                    SharePrefCache.inst().getStorySettingViewPermission().a(Integer.valueOf(cVar2.q));
                    SharePrefCache.inst().getStorySettingReplyPermission().a(Integer.valueOf(cVar2.r));
                    an<Boolean> storySettingSyncDuoshan = SharePrefCache.inst().getStorySettingSyncDuoshan();
                    if (cVar2.n == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    storySettingSyncDuoshan.a(Boolean.valueOf(z));
                    an<Boolean> storySettingDoudouPhoto = SharePrefCache.inst().getStorySettingDoudouPhoto();
                    if (cVar2.o != 0) {
                        z2 = false;
                    }
                    storySettingDoudouPhoto.a(Boolean.valueOf(z2));
                    SharePrefCache.inst().getStorySettingSyncToast().a(Integer.valueOf(cVar2.p));
                }
            }
        };
    }
}
