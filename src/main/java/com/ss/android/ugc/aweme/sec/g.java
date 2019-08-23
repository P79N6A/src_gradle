package com.ss.android.ugc.aweme.sec;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/sec/SecCaptchaListener;", "", "()V", "onClose", "", "type", "", "onError", "error", "", "onReady", "onResult", "success", "", "msg", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class g {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f63771d;

    public void a(int i) {
    }

    public void a(boolean z, @NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f63771d, false, 71103, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2}, this, f63771d, false, 71103, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "msg");
    }
}
