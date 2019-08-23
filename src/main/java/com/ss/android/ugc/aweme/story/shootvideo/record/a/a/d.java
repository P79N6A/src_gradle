package com.ss.android.ugc.aweme.story.shootvideo.record.a.a;

import android.text.format.DateUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/festival/effect/SpringCacheStrategyImpl;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/festival/effect/EffectCacheStrategy;", "()V", "needLoadDataOnAppStart", "", "needRefreshDataOnRecord", "key", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73861a;

    public final boolean a() {
        return true;
    }

    public final boolean a(@NotNull String str) {
        long j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f73861a, false, 85911, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f73861a, false, 85911, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "key");
        b bVar = b.f73856c;
        if (PatchProxy.isSupport(new Object[]{str2}, bVar, b.f73854a, false, 85906, new Class[]{String.class}, Long.TYPE)) {
            b bVar2 = bVar;
            j = ((Long) PatchProxy.accessDispatch(new Object[]{str2}, bVar2, b.f73854a, false, 85906, new Class[]{String.class}, Long.TYPE)).longValue();
        } else {
            Intrinsics.checkParameterIsNotNull(str2, "key");
            j = bVar.a().getLong(str2, 0);
        }
        if (DateUtils.isToday(j)) {
            return false;
        }
        return true;
    }
}
