package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.view.SurfaceView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.p;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0016R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VEVideoPlayer;", "Lcom/ss/android/ugc/aweme/shortvideo/cut/IVideoPlayer;", "context", "Landroid/content/Context;", "veEditor", "Lcom/ss/android/vesdk/VEEditor;", "surfaceView", "Landroid/view/SurfaceView;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/content/Context;Lcom/ss/android/vesdk/VEEditor;Landroid/view/SurfaceView;Landroid/arch/lifecycle/LifecycleOwner;)V", "autoStartStopArbiter", "Ldmt/av/video/VEEditorAutoStartStopArbiter;", "getAutoStartStopArbiter", "()Ldmt/av/video/VEEditorAutoStartStopArbiter;", "autoStartStopArbiter$delegate", "Lkotlin/Lazy;", "currentProgress", "", "destroy", "", "duration", "isPausedByUser", "", "isPlaying", "play", "actionFromUser", "seek", "seekTo", "seekMode", "Lcom/ss/android/vesdk/VEEditor$SEEK_MODE;", "setPausedByUser", "stop", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class aq implements ai {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66382a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f66383b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(aq.class), "autoStartStopArbiter", "getAutoStartStopArbiter()Ldmt/av/video/VEEditorAutoStartStopArbiter;"))};

    /* renamed from: c  reason: collision with root package name */
    public final p f66384c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f66385d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ldmt/av/video/VEEditorAutoStartStopArbiter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<VEEditorAutoStartStopArbiter> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Context $context;
        final /* synthetic */ LifecycleOwner $lifecycleOwner;
        final /* synthetic */ SurfaceView $surfaceView;
        final /* synthetic */ aq this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(aq aqVar, Context context, LifecycleOwner lifecycleOwner, SurfaceView surfaceView) {
            super(0);
            this.this$0 = aqVar;
            this.$context = context;
            this.$lifecycleOwner = lifecycleOwner;
            this.$surfaceView = surfaceView;
        }

        @NotNull
        public final VEEditorAutoStartStopArbiter invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 75770, new Class[0], VEEditorAutoStartStopArbiter.class)) {
                return new VEEditorAutoStartStopArbiter(this.$context, this.$lifecycleOwner, this.this$0.f66384c, this.$surfaceView);
            }
            return (VEEditorAutoStartStopArbiter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 75770, new Class[0], VEEditorAutoStartStopArbiter.class);
        }
    }

    private final VEEditorAutoStartStopArbiter e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f66382a, false, 75761, new Class[0], VEEditorAutoStartStopArbiter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f66382a, false, 75761, new Class[0], VEEditorAutoStartStopArbiter.class);
        } else {
            value = this.f66385d.getValue();
        }
        return (VEEditorAutoStartStopArbiter) value;
    }

    public final long a() {
        if (!PatchProxy.isSupport(new Object[0], this, f66382a, false, 75762, new Class[0], Long.TYPE)) {
            return (long) this.f66384c.u();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66382a, false, 75762, new Class[0], Long.TYPE)).longValue();
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f66382a, false, 75766, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66382a, false, 75766, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f66384c.l() == p.g.STARTED) {
            z = true;
        }
        return z;
    }

    public final long c() {
        if (!PatchProxy.isSupport(new Object[0], this, f66382a, false, 75767, new Class[0], Long.TYPE)) {
            return (long) this.f66384c.t();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66382a, false, 75767, new Class[0], Long.TYPE)).longValue();
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f66382a, false, 75768, new Class[0], Boolean.TYPE)) {
            return e().f4354b;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66382a, false, 75768, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66382a, false, 75764, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66382a, false, 75764, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (z) {
            e().a(true);
        } else {
            e().a();
        }
        return true;
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66382a, false, 75769, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66382a, false, 75769, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e().f4354b = z;
    }

    public final boolean a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66382a, false, 75763, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66382a, false, 75763, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (z) {
            e().a(false);
        } else {
            e().b();
        }
        return true;
    }

    public final boolean a(long j, @NotNull p.d dVar) {
        long j2 = j;
        p.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), dVar2}, this, f66382a, false, 75765, new Class[]{Long.TYPE, p.d.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), dVar2}, this, f66382a, false, 75765, new Class[]{Long.TYPE, p.d.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "seekMode");
        if (this.f66384c.a((int) j2, dVar2) == 0) {
            return true;
        }
        return false;
    }

    public aq(@NotNull Context context, @NotNull p pVar, @NotNull SurfaceView surfaceView, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(pVar, "veEditor");
        Intrinsics.checkParameterIsNotNull(surfaceView, "surfaceView");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        this.f66384c = pVar;
        this.f66385d = LazyKt.lazy(new a(this, context, lifecycleOwner, surfaceView));
    }
}
