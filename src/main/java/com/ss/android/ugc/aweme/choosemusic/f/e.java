package com.ss.android.ugc.aweme.choosemusic.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0013\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/choosemusic/utils/MusicPlayBean;", "", "()V", "duration", "", "musicId", "", "getMusicId$main_douyinCnRelease", "()Ljava/lang/String;", "setMusicId$main_douyinCnRelease", "(Ljava/lang/String;)V", "musicStartTime", "", "getMusicStartTime$main_douyinCnRelease", "()J", "setMusicStartTime$main_douyinCnRelease", "(J)V", "playTime", "getDuration", "getPlayTime", "logMusicPlayStart", "", "logMusicPlayStop", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35902a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f35903b;

    /* renamed from: c  reason: collision with root package name */
    public long f35904c;

    /* renamed from: d  reason: collision with root package name */
    long f35905d;

    /* renamed from: e  reason: collision with root package name */
    int f35906e;

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f35902a, false, 26792, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f35902a, false, 26792, new Class[]{String.class}, Void.TYPE);
        } else if (!Intrinsics.areEqual((Object) this.f35903b, (Object) str)) {
            this.f35904c = -1;
            this.f35905d = 0;
        } else {
            this.f35905d = System.currentTimeMillis() - this.f35904c;
        }
    }

    public final long b(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f35902a, false, 26793, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str}, this, f35902a, false, 26793, new Class[]{String.class}, Long.TYPE)).longValue();
        } else if (!Intrinsics.areEqual((Object) this.f35903b, (Object) str)) {
            return 0;
        } else {
            if (this.f35905d <= 0 && this.f35904c > 0) {
                this.f35905d = System.currentTimeMillis() - this.f35904c;
            }
            return this.f35905d;
        }
    }

    public final int c(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f35902a, false, 26794, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f35902a, false, 26794, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (!Intrinsics.areEqual((Object) this.f35903b, (Object) str)) {
            return 0;
        } else {
            return this.f35906e;
        }
    }
}
