package com.ss.android.ugc.aweme.qrcode.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/qrcode/model/ScanGuideInfoModel;", "Lcom/ss/android/ugc/aweme/mvp/base/BaseModel;", "Lcom/ss/android/ugc/aweme/qrcode/model/ScanGuideInfo;", "()V", "getQRCodeV2", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends com.ss.android.ugc.aweme.w.a.a<e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63378a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/qrcode/model/ScanGuideInfo;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
    static final class a<V> implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63379a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f63380b = new a();

        a() {
        }

        public final /* synthetic */ Object call() {
            if (!PatchProxy.isSupport(new Object[0], this, f63379a, false, 70419, new Class[0], e.class)) {
                return QRCodeApi.a();
            }
            return (e) PatchProxy.accessDispatch(new Object[0], this, f63379a, false, 70419, new Class[0], e.class);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63378a, false, 70418, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63378a, false, 70418, new Class[0], Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, a.f63380b, 0);
    }
}
