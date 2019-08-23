package com.ss.android.ugc.aweme.sec.a;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sec.g;
import com.ss.sys.ck.SCCheckListener;
import com.ss.sys.ck.SCCheckUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/sec/captcha/SSCheckerHandler;", "Lcom/ss/sys/ck/SCCheckListener;", "activity", "Landroid/app/Activity;", "captchaListener", "Lcom/ss/android/ugc/aweme/sec/SecCaptchaListener;", "(Landroid/app/Activity;Lcom/ss/android/ugc/aweme/sec/SecCaptchaListener;)V", "checker", "Lcom/ss/sys/ck/SCCheckUtils;", "bindChecker", "dialogOnClose", "", "type", "", "dialogOnReady", "dialogOnResult", "isSuccess", "", "message", "", "release", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends SCCheckListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63737a;

    /* renamed from: b  reason: collision with root package name */
    private SCCheckUtils f63738b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f63739c;

    /* renamed from: d  reason: collision with root package name */
    private g f63740d;

    public final void dialogOnReady() {
        if (PatchProxy.isSupport(new Object[0], this, f63737a, false, 71133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63737a, false, 71133, new Class[0], Void.TYPE);
            return;
        }
        super.dialogOnReady();
    }

    @NotNull
    public final b a(@NotNull SCCheckUtils sCCheckUtils) {
        if (PatchProxy.isSupport(new Object[]{sCCheckUtils}, this, f63737a, false, 71131, new Class[]{SCCheckUtils.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{sCCheckUtils}, this, f63737a, false, 71131, new Class[]{SCCheckUtils.class}, b.class);
        }
        Intrinsics.checkParameterIsNotNull(sCCheckUtils, "checker");
        this.f63738b = sCCheckUtils;
        return this;
    }

    public final void dialogOnClose(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f63737a, false, 71132, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f63737a, false, 71132, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.dialogOnClose(i);
        g gVar = this.f63740d;
        if (gVar != null) {
            gVar.a(i);
        }
    }

    public b(@Nullable Activity activity, @Nullable g gVar) {
        this.f63739c = activity;
        this.f63740d = gVar;
    }

    public final void dialogOnResult(boolean z, @NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f63737a, false, 71134, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f63737a, false, 71134, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "message");
        super.dialogOnResult(z, str);
        g gVar = this.f63740d;
        if (gVar != null) {
            gVar.a(z, str);
        }
        SCCheckUtils sCCheckUtils = this.f63738b;
        if (sCCheckUtils != null) {
            sCCheckUtils.activity = null;
        }
        this.f63739c = null;
    }
}
