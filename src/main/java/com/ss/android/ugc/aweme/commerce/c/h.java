package com.ss.android.ugc.aweme.commerce.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/pay/WalletSDKContext;", "", "wxAppId", "", "(Ljava/lang/String;)V", "getWxAppId", "()Ljava/lang/String;", "getWXAPI", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "context", "Landroid/content/Context;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36793a;

    /* renamed from: c  reason: collision with root package name */
    public static h f36794c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f36795d = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f36796b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/pay/WalletSDKContext$Companion;", "", "()V", "sInstance", "Lcom/ss/android/ugc/aweme/commerce/pay/WalletSDKContext;", "inst", "isInited", "", "setInstance", "", "instance", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36797a;

        private a() {
        }

        @NotNull
        public final h a() {
            if (PatchProxy.isSupport(new Object[0], this, f36797a, false, 28308, new Class[0], h.class)) {
                return (h) PatchProxy.accessDispatch(new Object[0], this, f36797a, false, 28308, new Class[0], h.class);
            } else if (h.f36794c != null) {
                h hVar = h.f36794c;
                if (hVar != null) {
                    return hVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.pay.WalletSDKContext");
            } else {
                throw new IllegalStateException("WalletSDKContext not init");
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public h(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "wxAppId");
        this.f36796b = str;
    }
}
