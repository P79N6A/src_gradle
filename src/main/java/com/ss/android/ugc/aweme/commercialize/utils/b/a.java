package com.ss.android.ugc.aweme.commercialize.utils.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\"B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010 \u001a\u00020!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0014\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/video/VideoPlayTaskInfo;", "", "videoDuration", "", "targetMilliseconds", "", "callback", "Ljava/lang/Runnable;", "repeat", "", "(JILjava/lang/Runnable;Z)V", "getCallback", "()Ljava/lang/Runnable;", "setCallback", "(Ljava/lang/Runnable;)V", "getRepeat", "()Z", "setRepeat", "(Z)V", "getTargetMilliseconds", "()I", "targetPlayedTimes", "getTargetPlayedTimes", "setTargetPlayedTimes", "(I)V", "targetPosition", "getTargetPosition", "setTargetPosition", "getVideoDuration", "()J", "setVideoDuration", "(J)V", "safeRunCallback", "", "Builder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39756a;

    /* renamed from: b  reason: collision with root package name */
    public int f39757b;

    /* renamed from: c  reason: collision with root package name */
    public int f39758c;

    /* renamed from: d  reason: collision with root package name */
    public long f39759d;

    /* renamed from: e  reason: collision with root package name */
    public final int f39760e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Runnable f39761f;
    public boolean g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/video/VideoPlayTaskInfo$Builder;", "", "()V", "callback", "Ljava/lang/Runnable;", "repeat", "", "targetMilliseconds", "", "videoDuration", "", "build", "Lcom/ss/android/ugc/aweme/commercialize/utils/video/VideoPlayTaskInfo;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a$a  reason: collision with other inner class name */
    public static final class C0517a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39762a;

        /* renamed from: b  reason: collision with root package name */
        private long f39763b = 1;

        /* renamed from: c  reason: collision with root package name */
        private int f39764c;

        /* renamed from: d  reason: collision with root package name */
        private Runnable f39765d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f39766e;

        @NotNull
        public final a a() {
            if (PatchProxy.isSupport(new Object[0], this, f39762a, false, 32720, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], this, f39762a, false, 32720, new Class[0], a.class);
            }
            long j = this.f39763b;
            int i = this.f39764c;
            Runnable runnable = this.f39765d;
            if (runnable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callback");
            }
            a aVar = new a(j, i, runnable, this.f39766e, (byte) 0);
            return aVar;
        }

        @NotNull
        public final C0517a a(int i) {
            C0517a aVar = this;
            aVar.f39764c = i;
            return aVar;
        }

        @NotNull
        public final C0517a a(boolean z) {
            C0517a aVar = this;
            aVar.f39766e = true;
            return aVar;
        }

        @NotNull
        public final C0517a a(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f39762a, false, 32718, new Class[]{Long.TYPE}, C0517a.class)) {
                return (C0517a) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f39762a, false, 32718, new Class[]{Long.TYPE}, C0517a.class);
            }
            C0517a aVar = this;
            if (j2 > 0) {
                if (j2 <= 0) {
                    j2 = 1;
                }
                aVar.f39763b = j2;
                return aVar;
            }
            throw new IllegalArgumentException("Invalid video duration " + j2);
        }

        @NotNull
        public final C0517a a(@NotNull Runnable runnable) {
            Runnable runnable2 = runnable;
            if (PatchProxy.isSupport(new Object[]{runnable2}, this, f39762a, false, 32719, new Class[]{Runnable.class}, C0517a.class)) {
                return (C0517a) PatchProxy.accessDispatch(new Object[]{runnable2}, this, f39762a, false, 32719, new Class[]{Runnable.class}, C0517a.class);
            }
            Intrinsics.checkParameterIsNotNull(runnable2, "callback");
            C0517a aVar = this;
            aVar.f39765d = runnable2;
            return aVar;
        }
    }

    private a(long j, int i, Runnable runnable, boolean z) {
        this.f39759d = j;
        this.f39760e = i;
        this.f39761f = runnable;
        this.g = z;
        this.f39757b = (int) (((long) this.f39760e) / this.f39759d);
        this.f39758c = (int) (((long) this.f39760e) % this.f39759d);
    }

    public /* synthetic */ a(long j, int i, Runnable runnable, boolean z, byte b2) {
        this(j, i, runnable, z);
    }
}
