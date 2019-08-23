package com.ss.android.ugc.aweme.story.shootvideo.record.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.c.b;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/MainThreadNativeInitCallback;", "Lcom/ss/android/medialib/listener/NativeInitListener;", "safeHandler", "Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;", "nativeInitListener", "(Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;Lcom/ss/android/medialib/listener/NativeInitListener;)V", "onNativeInitCallBack", "", "ret", "", "onNativeInitHardEncoderRetCallback", "isCPUEncode", "encoderProfile", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73893a;

    /* renamed from: b  reason: collision with root package name */
    public final b f73894b;

    /* renamed from: c  reason: collision with root package name */
    private final SafeHandler f73895c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f73897b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f73898c;

        a(e eVar, int i) {
            this.f73897b = eVar;
            this.f73898c = i;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73896a, false, 85846, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73896a, false, 85846, new Class[0], Void.TYPE);
                return;
            }
            this.f73897b.f73894b.a(this.f73898c);
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f73893a, false, 85845, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f73893a, false, 85845, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f73895c.post(new a(this, i));
    }

    public e(@NotNull SafeHandler safeHandler, @NotNull b bVar) {
        Intrinsics.checkParameterIsNotNull(safeHandler, "safeHandler");
        Intrinsics.checkParameterIsNotNull(bVar, "nativeInitListener");
        this.f73895c = safeHandler;
        this.f73894b = bVar;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f73893a, false, 85844, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f73893a, false, 85844, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f73894b.a(i, i2);
    }
}
