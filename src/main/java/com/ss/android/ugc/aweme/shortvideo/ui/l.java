package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.c.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/ui/MainThreadNativeInitCallback;", "Lcom/ss/android/medialib/listener/NativeInitListener;", "mHandler", "Landroid/os/Handler;", "mNativeInitListener", "(Landroid/os/Handler;Lcom/ss/android/medialib/listener/NativeInitListener;)V", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "getMNativeInitListener", "()Lcom/ss/android/medialib/listener/NativeInitListener;", "setMNativeInitListener", "(Lcom/ss/android/medialib/listener/NativeInitListener;)V", "onNativeInitCallBack", "", "ret", "", "onNativeInitHardEncoderRetCallback", "isCPUEncode", "encoderProfile", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70909a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public Handler f70910b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public b f70911c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70912a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f70913b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f70914c;

        a(l lVar, int i) {
            this.f70913b = lVar;
            this.f70914c = i;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f70912a, false, 80241, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70912a, false, 80241, new Class[0], Void.TYPE);
                return;
            }
            this.f70913b.f70911c.a(this.f70914c);
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70909a, false, 80237, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70909a, false, 80237, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70910b.post(new a(this, i));
    }

    public l(@NotNull Handler handler, @NotNull b bVar) {
        Intrinsics.checkParameterIsNotNull(handler, "mHandler");
        Intrinsics.checkParameterIsNotNull(bVar, "mNativeInitListener");
        this.f70910b = handler;
        this.f70911c = bVar;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70909a, false, 80238, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70909a, false, 80238, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70911c.a(i, i2);
    }
}
