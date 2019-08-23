package com.ss.android.ugc.aweme.qrcode.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/qrcode/model/ScanMaterialModel;", "Lcom/ss/android/ugc/aweme/mvp/base/BaseModel;", "Lcom/ss/android/ugc/aweme/qrcode/model/ScanMaterialResponse;", "()V", "getQRCodeV2", "", "materialId", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g extends com.ss.android.ugc.aweme.w.a.a<h> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63381a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/qrcode/model/ScanMaterialResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
    static final class a<V> implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63382a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f63383b;

        a(String str) {
            this.f63383b = str;
        }

        public final /* synthetic */ Object call() {
            if (!PatchProxy.isSupport(new Object[0], this, f63382a, false, 70421, new Class[0], h.class)) {
                return QRCodeApi.a(this.f63383b);
            }
            return (h) PatchProxy.accessDispatch(new Object[0], this, f63382a, false, 70421, new Class[0], h.class);
        }
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63381a, false, 70420, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63381a, false, 70420, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "materialId");
        m.a().a(this.mHandler, new a(str2), 0);
    }
}
