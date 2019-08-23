package com.ss.android.ugc.aweme.shortvideo.record;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/record/MainThreadCameraOpenListener;", "Lcom/ss/android/medialib/camera/CameraOpenListener;", "mCameraOpenListener", "(Lcom/ss/android/medialib/camera/CameraOpenListener;)V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "onOpenFail", "", "cameraType", "", "errorCode", "info", "", "onOpenSuccess", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69106a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Handler f69107b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final c f69108c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69109a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f69110b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f69111c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f69112d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f69113e;

        a(j jVar, int i, int i2, String str) {
            this.f69110b = jVar;
            this.f69111c = i;
            this.f69112d = i2;
            this.f69113e = str;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f69109a, false, 78384, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69109a, false, 78384, new Class[0], Void.TYPE);
                return;
            }
            this.f69110b.f69108c.a(this.f69111c, this.f69112d, this.f69113e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69114a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f69115b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f69116c;

        b(j jVar, int i) {
            this.f69115b = jVar;
            this.f69116c = i;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f69114a, false, 78385, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69114a, false, 78385, new Class[0], Void.TYPE);
                return;
            }
            this.f69115b.f69108c.a(this.f69116c);
        }
    }

    public j(@NotNull c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "mCameraOpenListener");
        this.f69108c = cVar;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69106a, false, 78382, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69106a, false, 78382, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (Intrinsics.areEqual((Object) Looper.getMainLooper(), (Object) Looper.myLooper())) {
            this.f69108c.a(i);
        } else {
            this.f69107b.post(new b(this, i));
        }
    }

    public final void a(int i, int i2, @Nullable String str) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f69106a, false, 78383, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f69106a, false, 78383, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
        } else if (Intrinsics.areEqual((Object) Looper.getMainLooper(), (Object) Looper.myLooper())) {
            this.f69108c.a(i3, i4, str2);
        } else {
            this.f69107b.post(new a(this, i3, i4, str2));
        }
    }
}
