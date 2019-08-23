package com.ss.android.ugc.aweme.commerce.sdk.verify;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.commerce.sdk.auth.AuthFailRetryActivity;
import com.ss.android.ugc.aweme.commerce.service.logs.ar;
import com.ss.android.ugc.aweme.commerce.service.models.c;
import com.ss.android.ugc.aweme.login.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J2\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0019H\u0007¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/verify/AuthUtils;", "", "()V", "checkLoginAndLawHint", "", "context", "Landroid/content/Context;", "enterFrom", "", "enterMethod", "promotionSource", "", "callback", "Lkotlin/Function0;", "getLawHintContent", "needToShowLawHint", "", "setLawHintShowed", "syncTaobaoVerifyStatus", "ctx", "vcb", "Lcom/ss/android/ugc/aweme/commerce/sdk/verify/SyncCB;", "tryCheckRealName", "verifyStatus", "", "Lcom/ss/android/ugc/aweme/commerce/service/callbacks/AuthCB;", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37916a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f37917b = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onResultOK"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.verify.a$a  reason: collision with other inner class name */
    static final class C0493a implements f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f37919b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37920c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f37921d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f37922e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Function0 f37923f;

        C0493a(Context context, String str, String str2, long j, Function0 function0) {
            this.f37919b = context;
            this.f37920c = str;
            this.f37921d = str2;
            this.f37922e = j;
            this.f37923f = function0;
        }

        public final void a(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{null}, this, f37918a, false, 29592, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null}, this, f37918a, false, 29592, new Class[]{Bundle.class}, Void.TYPE);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f37918a, false, 29591, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37918a, false, 29591, new Class[0], Void.TYPE);
                return;
            }
            i.a(400).a((g<TResult, TContinuationResult>) new g<Void, Void>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f37924a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C0493a f37925b;

                {
                    this.f37925b = r1;
                }

                public final /* synthetic */ Object then(i iVar) {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f37924a, false, 29593, new Class[]{i.class}, Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37924a, false, 29593, new Class[]{i.class}, Void.class);
                    }
                    a.f37917b.a(this.f37925b.f37919b, this.f37925b.f37920c, this.f37925b.f37921d, this.f37925b.f37922e, this.f37925b.f37923f);
                    return null;
                }
            }, i.f1052b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f37927b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f37928c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f37929d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f37930e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Function0 f37931f;

        b(long j, Context context, String str, String str2, Function0 function0) {
            this.f37927b = j;
            this.f37928c = context;
            this.f37929d = str;
            this.f37930e = str2;
            this.f37931f = function0;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37926a, false, 29594, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37926a, false, 29594, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ar arVar = new ar();
            arVar.f38088f = "confirm";
            arVar.b();
            a aVar = a.f37917b;
            long j = this.f37927b;
            Context context = this.f37928c;
            if (PatchProxy.isSupport(new Object[]{new Long(j), context}, aVar, a.f37916a, false, 29590, new Class[]{Long.TYPE, Context.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{new Long(j), context}, aVar2, a.f37916a, false, 29590, new Class[]{Long.TYPE, Context.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(context);
                if (a2 != null) {
                    if (com.ss.android.ugc.aweme.commerce.service.models.c.Companion.a(j)) {
                        a2.b(false);
                    } else if (j == c.b.JINGDONG.getType()) {
                        a2.d(false);
                    } else if (j == c.b.KAOLA.getType()) {
                        a2.f(false);
                    } else if (!c.b.Companion.a(Long.valueOf(j))) {
                        a2.h(false);
                    } else {
                        a2.j(false);
                    }
                }
            }
            a.f37917b.a(this.f37928c, this.f37929d, this.f37930e, this.f37927b, this.f37931f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37932a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f37933b = new c();

        c() {
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37932a, false, 29595, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37932a, false, 29595, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ar arVar = new ar();
            arVar.f38088f = "cancel";
            arVar.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/sdk/verify/dto/VerifyStatusDTO;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class d<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.commerce.sdk.verify.a.a, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37934a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f37935b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f37936c;

        d(b bVar, Context context) {
            this.f37935b = bVar;
            this.f37936c = context;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f37934a, false, 29596, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37934a, false, 29596, new Class[]{i.class}, Void.class);
            } else if (iVar == null || iVar.e() == null || iVar.d() || ((com.ss.android.ugc.aweme.commerce.sdk.verify.a.a) iVar.e()).statusCode != 0) {
                b bVar = this.f37935b;
                if (bVar != null) {
                    bVar.a();
                }
                return null;
            } else {
                com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(this.f37936c);
                if (a2 != null) {
                    a2.l(((com.ss.android.ugc.aweme.commerce.sdk.verify.a.a) iVar.e()).getAgreementCommit());
                }
                b bVar2 = this.f37935b;
                if (bVar2 != null) {
                    long openId = ((com.ss.android.ugc.aweme.commerce.sdk.verify.a.a) iVar.e()).getOpenId();
                    String schemaUrl = ((com.ss.android.ugc.aweme.commerce.sdk.verify.a.a) iVar.e()).getSchemaUrl();
                    if (schemaUrl == null) {
                        schemaUrl = "";
                    }
                    bVar2.a(openId, schemaUrl);
                }
                return null;
            }
        }
    }

    private a() {
    }

    public final void a(@NotNull Context context, @Nullable b bVar) {
        Context context2 = context;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{context2, bVar2}, this, f37916a, false, 29586, new Class[]{Context.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bVar2}, this, f37916a, false, 29586, new Class[]{Context.class, b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "ctx");
        if (com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e.c().getWithCommerceRights()) {
            i b2 = com.ss.android.ugc.aweme.commerce.sdk.verify.api.a.f37941c.b();
            if (b2 != null) {
                b2.a((g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(bVar2, context2), i.f1052b);
            }
        } else if (bVar2 != null) {
            bVar.a();
        }
    }

    private final String a(long j, Context context) {
        Map<String, String> map;
        String str;
        long j2 = j;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), context2}, this, f37916a, false, 29588, new Class[]{Long.TYPE, Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2), context2}, this, f37916a, false, 29588, new Class[]{Long.TYPE, Context.class}, String.class);
        }
        com.ss.android.ugc.aweme.commerce.service.j.a f2 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e.f();
        String str2 = null;
        if (f2 != null) {
            map = f2.f37976a;
        } else {
            map = null;
        }
        if (map != null && map.containsKey(String.valueOf(j))) {
            str2 = map.get(String.valueOf(j));
        }
        if (TextUtils.isEmpty(str2) && com.ss.android.ugc.aweme.commerce.service.models.c.Companion.a(j2)) {
            str2 = context2.getString(C0906R.string.c7s);
        }
        if (TextUtils.isEmpty(str2)) {
            if (j2 == c.b.JINGDONG.getType()) {
                str = context2.getString(C0906R.string.yg);
            } else if (j2 == c.b.KAOLA.getType()) {
                str = context2.getString(C0906R.string.yh);
            } else if (!c.b.Companion.a(Long.valueOf(j))) {
                str = context2.getString(C0906R.string.zx);
            } else {
                str = context2.getString(C0906R.string.a05);
            }
            str2 = context2.getString(C0906R.string.zq, new Object[]{str});
        }
        if (str2 == null) {
            str2 = "";
        }
        return str2;
    }

    private final boolean b(long j, Context context) {
        long j2 = j;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), context2}, this, f37916a, false, 29589, new Class[]{Long.TYPE, Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), context2}, this, f37916a, false, 29589, new Class[]{Long.TYPE, Context.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(context2);
        if (a2 == null) {
            return false;
        }
        if (com.ss.android.ugc.aweme.commerce.service.models.c.Companion.a(j2)) {
            return a2.a(true);
        }
        if (j2 == c.b.JINGDONG.getType()) {
            return a2.c(true);
        }
        if (j2 == c.b.KAOLA.getType()) {
            return a2.e(true);
        }
        if (!c.b.Companion.a(Long.valueOf(j))) {
            return a2.g(true);
        }
        return a2.i(true);
    }

    @JvmStatic
    public static final void a(@NotNull Context context, int i, @NotNull String str, @NotNull String str2, @Nullable com.ss.android.ugc.aweme.commerce.service.a.a aVar) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        com.ss.android.ugc.aweme.commerce.service.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), str3, str4, aVar2}, null, f37916a, true, 29585, new Class[]{Context.class, Integer.TYPE, String.class, String.class, com.ss.android.ugc.aweme.commerce.service.a.a.class}, Void.TYPE)) {
            Object[] objArr = {context2, Integer.valueOf(i), str3, str4, aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f37916a, true, 29585, new Class[]{Context.class, Integer.TYPE, String.class, String.class, com.ss.android.ugc.aweme.commerce.service.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str3, "enterFrom");
        Intrinsics.checkParameterIsNotNull(str4, "enterMethod");
        switch (i) {
            case 0:
                com.ss.android.ugc.aweme.commerce.sdk.c.b.f37709b.a();
                return;
            case 1:
                UIUtils.displayToast(context2, context2.getString(C0906R.string.bvw));
                break;
            case 2:
                new c().a((Activity) context2, str3, str4, aVar2);
                return;
            case 3:
                context2.startActivity(new Intent(context2, AuthFailRetryActivity.class));
                return;
        }
    }

    public final void a(@Nullable Context context, @Nullable String str, @Nullable String str2, long j, @NotNull Function0<Unit> function0) {
        String str3;
        String str4;
        Context context2 = context;
        long j2 = j;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{context2, str, str2, new Long(j2), function02}, this, f37916a, false, 29587, new Class[]{Context.class, String.class, String.class, Long.TYPE, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str, str2, new Long(j2), function02}, this, f37916a, false, 29587, new Class[]{Context.class, String.class, String.class, Long.TYPE, Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "callback");
        if (context2 != null) {
            if (!com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e.d()) {
                Activity activity = (Activity) context2;
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (str2 == null) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                C0493a aVar = new C0493a(context, str, str2, j, function0);
                e.a(activity, str3, str4, (f) aVar);
            } else if (!com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e.e() || !b(j2, context2)) {
                function0.invoke();
            } else {
                com.ss.android.ugc.aweme.commerce.sdk.b.a aVar2 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
                b bVar = new b(j, context, str, str2, function0);
                aVar2.a((View.OnClickListener) bVar, (View.OnClickListener) c.f37933b, a(j2, context2));
            }
        }
    }
}
