package com.ss.android.ugc.aweme.shortvideo.presenter;

import a.i;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.player.EffectConfig;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.d;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68815a;

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f68816b = h.a(m.a(p.FIXED).a("EffectVideoCover").a(3).a());

    public static void a(@NonNull String str, @NonNull List<EffectPointModel> list, @NonNull String str2, int i, boolean z, int i2, com.ss.android.ugc.aweme.common.m mVar, @Nullable IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        if (PatchProxy.isSupport(new Object[]{str, list, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), mVar, onVideoCoverCallback}, null, f68815a, true, 78184, new Class[]{String.class, List.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.common.m.class, IEffectService.OnVideoCoverCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list, str2, Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2), mVar, onVideoCoverCallback}, null, f68815a, true, 78184, new Class[]{String.class, List.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.common.m.class, IEffectService.OnVideoCoverCallback.class}, Void.TYPE);
            return;
        }
        a(str, list, str2, i, z, i2, mVar, null, onVideoCoverCallback);
    }

    public static void a(@NonNull String str, @NonNull List<EffectPointModel> list, @NonNull String str2, int i, boolean z, int i2, com.ss.android.ugc.aweme.common.m mVar, @Nullable String str3, @Nullable IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        int i3;
        int i4;
        String str4 = str;
        List<EffectPointModel> list2 = list;
        String str5 = str2;
        com.ss.android.ugc.aweme.common.m mVar2 = mVar;
        IEffectService.OnVideoCoverCallback onVideoCoverCallback2 = onVideoCoverCallback;
        if (PatchProxy.isSupport(new Object[]{str4, list2, str5, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), mVar2, str3, onVideoCoverCallback2}, null, f68815a, true, 78185, new Class[]{String.class, List.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.common.m.class, String.class, IEffectService.OnVideoCoverCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, list2, str5, Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2), mVar2, str3, onVideoCoverCallback2}, null, f68815a, true, 78185, new Class[]{String.class, List.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.common.m.class, String.class, IEffectService.OnVideoCoverCallback.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.b.a aVar = new com.ss.android.ugc.aweme.shortvideo.b.a();
        if (mVar2 == null || mVar2.f40260b == -1 || mVar2.f40261c == -1) {
            i3 = 1;
            i4 = aVar.init(str4);
        } else {
            i3 = 1;
            i4 = aVar.init(str, (long) mVar2.f40260b, (long) mVar2.f40261c, mVar2.f40262d);
        }
        if (i4 < 0) {
            if (onVideoCoverCallback2 != null) {
                onVideoCoverCallback2.onGetVideoCoverFailed(-1);
            }
            aVar.stopRender();
            return;
        }
        boolean z2 = z;
        EffectConfig filter = d.a(list2, z2, (int) aVar.getDuration()).setFilter(str5);
        long[] jArr = new long[i3];
        jArr[0] = (long) i;
        aVar.renderVideo(jArr, filter, 256, 256);
        b bVar = new b(z2, str, i2, aVar, str3, onVideoCoverCallback);
        i.a((Callable<TResult>) bVar, (Executor) f68816b);
    }
}
