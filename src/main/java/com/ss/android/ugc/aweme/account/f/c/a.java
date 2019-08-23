package com.ss.android.ugc.aweme.account.f.c;

import a.g;
import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.account.c;
import com.ss.android.common.util.i;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31888a;

    /* renamed from: com.ss.android.ugc.aweme.account.f.c.a$a  reason: collision with other inner class name */
    public interface C0404a {
        void a();

        void b();
    }

    static final /* synthetic */ String a(boolean z) throws Exception {
        String str;
        i iVar = new i(b.a.f22239a + b.a.a() + "/aweme/v1/user/set/settings/");
        if (z) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        iVar.a("value", str);
        iVar.a("field", "sync_to_toutiao");
        try {
            return c.a().c().a(Integer.MAX_VALUE, iVar.toString());
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(boolean z, @NonNull C0404a aVar) {
        C0404a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), aVar2}, null, f31888a, true, 20013, new Class[]{Boolean.TYPE, C0404a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), aVar2}, null, f31888a, true, 20013, new Class[]{Boolean.TYPE, C0404a.class}, Void.TYPE);
            return;
        }
        a.i.a((Callable<TResult>) new b<TResult>(z)).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(aVar2));
    }
}
