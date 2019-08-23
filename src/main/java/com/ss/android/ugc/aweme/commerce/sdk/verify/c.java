package com.ss.android.ugc.aweme.commerce.sdk.verify;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.sdk.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J(\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/verify/VerifyHelper;", "Lcom/ss/android/ugc/aweme/commerce/sdk/avoid/AvoidOnActivityResult$Callback;", "()V", "mAuthCB", "Lcom/ss/android/ugc/aweme/commerce/service/callbacks/AuthCB;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "tryToAcquireCommerceRights", "act", "Landroid/app/Activity;", "enterFrom", "", "enterMethod", "callback", "Companion", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class c implements a.C0486a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37942a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f37943b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.commerce.service.a.a f37944c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/verify/VerifyHelper$Companion;", "", "()V", "REQUEST_VERIFY_RIGHTS", "", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commerce/sdk/verify/VerifyHelper$tryToAcquireCommerceRights$1", "Lcom/ss/android/ugc/aweme/commerce/sdk/verify/SyncCB;", "onSyncFail", "", "onSyncOk", "openId", "", "schemaUrl", "", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f37946b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f37947c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f37948d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f37949e;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f37945a, false, 29618, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37945a, false, 29618, new Class[0], Void.TYPE);
                return;
            }
            UIUtils.displayToast((Context) this.f37947c, (int) C0906R.string.bgf);
        }

        public final void a(long j, @NotNull String str) {
            long j2 = j;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, f37945a, false, 29619, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, f37945a, false, 29619, new Class[]{Long.TYPE, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "schemaUrl");
            Intent intent = new Intent(this.f37947c, VerifyActivity.class);
            intent.putExtra("verify_open_id", j2);
            intent.putExtra("verify_schema_url", str2);
            intent.putExtra("verify_enter_from", this.f37948d);
            intent.putExtra("verify_enter_method", this.f37949e);
            com.ss.android.ugc.aweme.commerce.sdk.a.a aVar = new com.ss.android.ugc.aweme.commerce.sdk.a.a(this.f37947c);
            a.C0486a aVar2 = this.f37946b;
            if (PatchProxy.isSupport(new Object[]{intent, 2, aVar2}, aVar, com.ss.android.ugc.aweme.commerce.sdk.a.a.f37688a, false, 29253, new Class[]{Intent.class, Integer.TYPE, a.C0486a.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.sdk.a.a aVar3 = aVar;
                PatchProxy.accessDispatch(new Object[]{intent, 2, aVar2}, aVar3, com.ss.android.ugc.aweme.commerce.sdk.a.a.f37688a, false, 29253, new Class[]{Intent.class, Integer.TYPE, a.C0486a.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            Intrinsics.checkParameterIsNotNull(aVar2, "callback");
            com.ss.android.ugc.aweme.commerce.sdk.a.b bVar = aVar.f37690b;
            if (PatchProxy.isSupport(new Object[]{intent, 2, aVar2}, bVar, com.ss.android.ugc.aweme.commerce.sdk.a.b.f37691a, false, 29257, new Class[]{Intent.class, Integer.TYPE, a.C0486a.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.sdk.a.b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{intent, 2, aVar2}, bVar2, com.ss.android.ugc.aweme.commerce.sdk.a.b.f37691a, false, 29257, new Class[]{Intent.class, Integer.TYPE, a.C0486a.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            Intrinsics.checkParameterIsNotNull(aVar2, "callback");
            bVar.f37692b.put(2, aVar2);
            bVar.startActivityForResult(intent, 2);
        }

        b(c cVar, Activity activity, String str, String str2) {
            this.f37946b = cVar;
            this.f37947c = activity;
            this.f37948d = str;
            this.f37949e = str2;
        }
    }

    public final void a(int i, int i2, @Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f37942a, false, 29617, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f37942a, false, 29617, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i == 2 && i2 == -1) {
            com.ss.android.ugc.aweme.commerce.service.a.a aVar = this.f37944c;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final void a(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @Nullable com.ss.android.ugc.aweme.commerce.service.a.a aVar) {
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        com.ss.android.ugc.aweme.commerce.service.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4, aVar2}, this, f37942a, false, 29616, new Class[]{Activity.class, String.class, String.class, com.ss.android.ugc.aweme.commerce.service.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str3, str4, aVar2}, this, f37942a, false, 29616, new Class[]{Activity.class, String.class, String.class, com.ss.android.ugc.aweme.commerce.service.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "act");
        Intrinsics.checkParameterIsNotNull(str3, "enterFrom");
        Intrinsics.checkParameterIsNotNull(str4, "enterMethod");
        this.f37944c = aVar2;
        Context context = activity2;
        com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(context);
        if (a2 == null || !a2.k(false)) {
            a.f37917b.a(context, (b) new b(this, activity2, str3, str4));
            return;
        }
        com.ss.android.ugc.aweme.commerce.service.a.a aVar3 = this.f37944c;
        if (aVar3 != null) {
            aVar3.a();
        }
    }
}
