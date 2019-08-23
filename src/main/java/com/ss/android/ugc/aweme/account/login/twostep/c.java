package com.ss.android.ugc.aweme.account.login.twostep;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.JsonUtils;
import com.bytedance.common.utility.android.ClipboardCompat;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.f;
import com.ss.android.ugc.aweme.account.login.ui.i;
import com.ss.android.ugc.aweme.account.ui.o;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.y;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012H\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u0012H\u0016J\u0012\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010\fH\u0016J+\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u00152\b\u0010)\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010*J\u0012\u0010+\u001a\u00020\u001d2\b\u0010,\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0003R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/twostep/SendSmsAuthenticator;", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/ugc/aweme/account/ui/IBackPressManager$OnBackPressListener;", "activity", "Landroid/support/v7/app/AppCompatActivity;", "viewStub", "Landroid/view/ViewStub;", "authCallback", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;", "(Landroid/support/v7/app/AppCompatActivity;Landroid/view/ViewStub;Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;)V", "bodyView", "Landroid/view/View;", "confirmSmsBtn", "Landroid/widget/TextView;", "handler", "Lcom/ss/android/ugc/aweme/base/SafeHandler;", "interceptBackPress", "", "openSmsBtn", "smsContent", "", "smsContentText", "smsTargetNumber", "smsTargetText", "timer", "Lcom/ss/android/ugc/aweme/account/login/ui/CountDownTimer;", "verifyTicket", "enableConfirmButton", "", "enabled", "inflateView", "initData", "initViews", "onBackPressed", "onClick", "v", "onSmsFailed", "errorCode", "", "errorDesc", "toastErrorText", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "onSmsVerified", "ticket", "startTimer", "verifySmsResult", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class c extends f implements View.OnClickListener, o.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32292a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f32293b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f32294c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f32295d;

    /* renamed from: e  reason: collision with root package name */
    i f32296e;

    /* renamed from: f  reason: collision with root package name */
    public String f32297f;
    public String g;
    public String h;
    public boolean i;
    private View p;
    private View q;
    private SafeHandler r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 13})
    static final class a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32298a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f32299b;

        a(c cVar) {
            this.f32299b = cVar;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            JSONObject jSONObject;
            if (PatchProxy.isSupport(new Object[0], this, f32298a, false, 20360, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32298a, false, 20360, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                JSONObject jSONObject2 = this.f32299b.l;
                if (jSONObject2 != null) {
                    jSONObject = jSONObject2.getJSONObject("data");
                } else {
                    jSONObject = null;
                }
                this.f32299b.g = JsonUtils.queryString(jSONObject, "sms_content", "");
                this.f32299b.h = JsonUtils.queryString(jSONObject, "channel_mobile", "");
                this.f32299b.f32297f = JsonUtils.queryString(jSONObject, "verify_ticket", "");
                z = (!TextUtils.isEmpty(this.f32299b.g)) & (!TextUtils.isEmpty(this.f32299b.h)) & (!TextUtils.isEmpty(this.f32299b.f32297f));
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then", "(Lbolts/Task;)Lkotlin/Unit;"}, k = 3, mv = {1, 1, 13})
    static final class b<TTaskResult, TContinuationResult> implements a.g<Boolean, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32300a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f32301b;

        b(c cVar) {
            this.f32301b = cVar;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f32300a, false, 20361, new Class[]{a.i.class}, Unit.class)) {
                return (Unit) PatchProxy.accessDispatch(new Object[]{iVar}, this, f32300a, false, 20361, new Class[]{a.i.class}, Unit.class);
            } else if (!y.a(iVar)) {
                return null;
            } else {
                TextView textView = this.f32301b.f32293b;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smsContentText");
                }
                textView.setText(this.f32301b.g);
                TextView textView2 = this.f32301b.f32294c;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smsTargetText");
                }
                textView2.setText(this.f32301b.h);
                c cVar = this.f32301b;
                if (PatchProxy.isSupport(new Object[0], cVar, c.f32292a, false, 20353, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], cVar, c.f32292a, false, 20353, new Class[0], Void.TYPE);
                } else {
                    i iVar2 = new i(5000, 1000, new f(cVar));
                    cVar.f32296e = iVar2;
                    i iVar3 = cVar.f32296e;
                    if (iVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("timer");
                    }
                    iVar3.a();
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c$c  reason: collision with other inner class name */
    static final class C0411c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32302a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f32303b;

        C0411c(c cVar) {
            this.f32303b = cVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f32302a, false, 20362, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32302a, false, 20362, new Class[0], Void.TYPE);
                return;
            }
            c cVar = this.f32303b;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f32292a, false, 20357, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f32292a, false, 20357, new Class[0], Void.TYPE);
                return;
            }
            a.i<TwoStepAuthApi.a> a2 = TwoStepAuthApi.f32267b.a(cVar.f32297f, "1128");
            if (a2 != null) {
                a2.a((a.g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(cVar), a.i.f1052b);
            } else {
                cVar.a(null, "TwoStepAuthApi.verifySms bolts Task null", null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f32304a = new d();

        d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 13})
    static final class e<TTaskResult, TContinuationResult> implements a.g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f32306b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32307c;

        e(c cVar, String str) {
            this.f32306b = cVar;
            this.f32307c = str;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f32305a, false, 20363, new Class[]{a.i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f32305a, false, 20363, new Class[]{a.i.class}, Void.TYPE);
            } else {
                this.f32306b.i = false;
                this.f32306b.b(this.f32307c);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/account/login/twostep/SendSmsAuthenticator$startTimer$1", "Lcom/ss/android/ugc/aweme/account/login/ui/CountDownTimer$SimpleCountDownTimerListener;", "onFinish", "", "onStart", "onTick", "millisUntilFinished", "", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class f extends i.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f32309b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32310a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f32311b;

            a(f fVar) {
                this.f32311b = fVar;
            }

            public final void run() {
                String str;
                if (PatchProxy.isSupport(new Object[0], this, f32310a, false, 20366, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32310a, false, 20366, new Class[0], Void.TYPE);
                    return;
                }
                this.f32311b.f32309b.a(true);
                TextView a2 = c.a(this.f32311b.f32309b);
                AppCompatActivity c2 = this.f32311b.f32309b.c();
                if (c2 != null) {
                    str = c2.getString(C0906R.string.ant);
                } else {
                    str = null;
                }
                a2.setText(str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32312a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f32313b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f32314c;

            b(f fVar, long j) {
                this.f32313b = fVar;
                this.f32314c = j;
            }

            public final void run() {
                String str;
                if (PatchProxy.isSupport(new Object[0], this, f32312a, false, 20367, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32312a, false, 20367, new Class[0], Void.TYPE);
                    return;
                }
                TextView a2 = c.a(this.f32313b.f32309b);
                StringBuilder sb = new StringBuilder();
                AppCompatActivity c2 = this.f32313b.f32309b.c();
                if (c2 != null) {
                    str = c2.getString(C0906R.string.ant);
                } else {
                    str = null;
                }
                sb.append(str);
                sb.append(" (");
                sb.append((this.f32314c / 1000) + 1);
                sb.append("s)");
                a2.setText(sb.toString());
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f32308a, false, 20365, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32308a, false, 20365, new Class[0], Void.TYPE);
                return;
            }
            y.a((Runnable) new a(this));
        }

        f(c cVar) {
            this.f32309b = cVar;
        }

        public final void a(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f32308a, false, 20364, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f32308a, false, 20364, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            y.a((Runnable) new b(this, j2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$TwoStepApiResponse;", "kotlin.jvm.PlatformType", "then", "(Lbolts/Task;)Lkotlin/Unit;"}, k = 3, mv = {1, 1, 13})
    static final class g<TTaskResult, TContinuationResult> implements a.g<TwoStepAuthApi.a, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32315a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f32316b;

        g(c cVar) {
            this.f32316b = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x0118  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f32315a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<kotlin.Unit> r6 = kotlin.Unit.class
                r3 = 0
                r4 = 20368(0x4f90, float:2.8542E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f32315a
                r3 = 0
                r4 = 20368(0x4f90, float:2.8542E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<kotlin.Unit> r6 = kotlin.Unit.class
                r1 = r18
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                kotlin.Unit r0 = (kotlin.Unit) r0
                return r0
            L_0x0039:
                boolean r0 = com.ss.android.ugc.aweme.utils.y.a((a.i) r19)
                r1 = 0
                if (r0 != 0) goto L_0x0048
                com.ss.android.ugc.aweme.account.login.twostep.c r0 = r7.f32316b
                java.lang.String r2 = "TwoStepAuthApi.verifySms bolts Task error"
                r0.a(r1, r2, r1)
                return r1
            L_0x0048:
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a r0 = (com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.a) r0
                java.lang.String r2 = r0.f32271b
                if (r2 == 0) goto L_0x006b
                if (r2 == 0) goto L_0x0063
                java.lang.String r2 = r2.toLowerCase()
                java.lang.String r3 = "(this as java.lang.String).toLowerCase()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                goto L_0x006c
            L_0x0063:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x006b:
                r2 = r1
            L_0x006c:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.String r3 = "success"
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto L_0x010c
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r2 = r0.f32272c
                if (r2 == 0) goto L_0x010c
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r2 = r0.f32272c
                java.lang.String r2 = r2.f32274b
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L_0x008a
                goto L_0x010c
            L_0x008a:
                com.ss.android.ugc.aweme.account.login.twostep.c r1 = r7.f32316b
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r0 = r0.f32272c
                java.lang.String r0 = r0.f32274b
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.login.twostep.c.f32292a
                r14 = 0
                r15 = 20358(0x4f86, float:2.8528E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r2[r10] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x00c2
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.login.twostep.c.f32292a
                r14 = 0
                r15 = 20358(0x4f86, float:2.8528E-41)
                java.lang.Class[] r0 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r0[r10] = r2
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0109
            L_0x00c2:
                java.lang.String r2 = "double_verify_pass"
                com.ss.android.ugc.aweme.account.a.a.b r3 = new com.ss.android.ugc.aweme.account.a.a.b
                r3.<init>()
                java.lang.String r4 = "enter_url"
                java.lang.String r5 = r1.m
                com.ss.android.ugc.aweme.account.a.a.b r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "verify_way"
                java.lang.String r5 = "sms_verify"
                com.ss.android.ugc.aweme.account.a.a.b r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "verify_pass"
                com.ss.android.ugc.aweme.account.a.a.b r3 = r3.a((java.lang.String) r4, (int) r9)
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.f31599b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r2, (java.util.Map) r3)
                r1.d()
                android.support.v7.app.AppCompatActivity r2 = r1.c()
                android.content.Context r2 = (android.content.Context) r2
                r3 = 2131558749(0x7f0d015d, float:1.8742823E38)
                com.bytedance.ies.dmt.ui.d.a r2 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r2, (int) r3)
                r2.a()
                r1.i = r9
                r2 = 1000(0x3e8, double:4.94E-321)
                a.i r2 = a.i.a((long) r2)
                com.ss.android.ugc.aweme.account.login.twostep.c$e r3 = new com.ss.android.ugc.aweme.account.login.twostep.c$e
                r3.<init>(r1, r0)
                a.g r3 = (a.g) r3
                r2.a((a.g<TResult, TContinuationResult>) r3)
            L_0x0109:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L_0x010c:
                if (r0 == 0) goto L_0x0115
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r2 = r0.f32272c
                if (r2 == 0) goto L_0x0115
                java.lang.Integer r2 = r2.f32275c
                goto L_0x0116
            L_0x0115:
                r2 = r1
            L_0x0116:
                if (r0 == 0) goto L_0x011f
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r0 = r0.f32272c
                if (r0 == 0) goto L_0x011f
                java.lang.String r0 = r0.f32276d
                goto L_0x0120
            L_0x011f:
                r0 = r1
            L_0x0120:
                com.ss.android.ugc.aweme.account.login.twostep.c r3 = r7.f32316b
                r3.a(r2, r0, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.c.g.then(a.i):java.lang.Object");
        }
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f32292a, false, 20356, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32292a, false, 20356, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.i) {
            r.a("click_return", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_url", this.m).f31599b);
        }
        return this.i;
    }

    @Nullable
    public final View a() {
        String str;
        boolean z;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f32292a, false, 20350, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f32292a, false, 20350, new Class[0], View.class);
        }
        if (this.n.getLayoutResource() <= 0) {
            this.n.setLayoutResource(C0906R.layout.a9q);
        }
        View inflate = this.n.inflate();
        Intrinsics.checkExpressionValueIsNotNull(inflate, "viewStub.inflate()");
        this.p = inflate;
        if (PatchProxy.isSupport(new Object[0], this, f32292a, false, 20351, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32292a, false, 20351, new Class[0], Void.TYPE);
        } else {
            View view = this.p;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bodyView");
            }
            View findViewById = view.findViewById(C0906R.id.dme);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "bodyView.findViewById(R.…ep_auth_sms_content_text)");
            this.f32293b = (TextView) findViewById;
            View view2 = this.p;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bodyView");
            }
            View findViewById2 = view2.findViewById(C0906R.id.dmi);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "bodyView.findViewById(R.…tep_auth_sms_target_text)");
            this.f32294c = (TextView) findViewById2;
            View view3 = this.p;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bodyView");
            }
            View findViewById3 = view3.findViewById(C0906R.id.dmc);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "bodyView.findViewById(R.…tep_auth_sms_confirm_btn)");
            this.f32295d = (TextView) findViewById3;
            View view4 = this.p;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bodyView");
            }
            View findViewById4 = view4.findViewById(C0906R.id.dm_);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "bodyView.findViewById(R.…o_step_auth_open_sms_btn)");
            this.q = findViewById4;
            View view5 = this.q;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openSmsBtn");
            }
            com.bytedance.ies.dmt.ui.e.b.a(view5);
            View view6 = this.q;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openSmsBtn");
            }
            View.OnClickListener onClickListener = this;
            view6.setOnClickListener(onClickListener);
            View view7 = this.p;
            if (view7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bodyView");
            }
            view7.findViewById(C0906R.id.dmg).setOnClickListener(onClickListener);
            TextView textView = this.f32294c;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smsTargetText");
            }
            textView.setOnClickListener(onClickListener);
            TextView textView2 = this.f32295d;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmSmsBtn");
            }
            textView2.setOnClickListener(onClickListener);
            a(false);
            TextView textView3 = this.f32295d;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmSmsBtn");
            }
            StringBuilder sb = new StringBuilder();
            AppCompatActivity c2 = c();
            if (c2 != null) {
                str = c2.getString(C0906R.string.ant);
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(" (5");
            sb.append("s)");
            textView3.setText(sb.toString());
            View view8 = this.q;
            if (view8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openSmsBtn");
            }
            com.ss.android.ugc.aweme.account.util.o oVar = com.ss.android.ugc.aweme.account.util.o.f33105b;
            Context c3 = c();
            int i3 = 1;
            if (PatchProxy.isSupport(new Object[]{c3}, oVar, com.ss.android.ugc.aweme.account.util.o.f33104a, false, 21401, new Class[]{Context.class}, Boolean.TYPE)) {
                com.ss.android.ugc.aweme.account.util.o oVar2 = oVar;
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{c3}, oVar2, com.ss.android.ugc.aweme.account.util.o.f33104a, false, 21401, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else if (c3 == null || c3.getPackageManager() == null) {
                z = false;
            } else {
                z = c3.getPackageManager().hasSystemFeature("android.hardware.telephony");
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
                i3 = 0;
            }
            view8.setVisibility(i2);
            r.a("show_edit_sms", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_url", this.m).a("is_edit_show", i3).f31599b);
            if (c() instanceof o) {
                AppCompatActivity c4 = c();
                if (c4 != null) {
                    ((o) c4).a(this);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.ui.IBackPressManager");
                }
            }
            this.r = new SafeHandler(c());
        }
        if (PatchProxy.isSupport(new Object[0], this, f32292a, false, 20352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32292a, false, 20352, new Class[0], Void.TYPE);
        } else if (this.l != null) {
            a.i.a((Callable<TResult>) new a<TResult>(this)).a((a.g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(this), a.i.f1052b);
        }
        View view9 = this.p;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bodyView");
        }
        return view9;
    }

    @NotNull
    public static final /* synthetic */ TextView a(c cVar) {
        TextView textView = cVar.f32295d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmSmsBtn");
        }
        return textView;
    }

    public final void a(boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32292a, false, 20354, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32292a, false, 20354, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        TextView textView = this.f32295d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmSmsBtn");
        }
        textView.setEnabled(z);
        TextView textView2 = this.f32295d;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmSmsBtn");
        }
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.4f;
        }
        textView2.setAlpha(f2);
    }

    public final void onClick(@Nullable View view) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{view}, this, f32292a, false, 20355, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32292a, false, 20355, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        String str = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.dm_) {
            r.a("click_edit_msg", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_url", this.m).f31599b);
            com.ss.android.ugc.aweme.account.util.o oVar = com.ss.android.ugc.aweme.account.util.o.f33105b;
            Context c2 = c();
            String str2 = this.h;
            String str3 = this.g;
            if (PatchProxy.isSupport(new Object[]{c2, str2, str3}, oVar, com.ss.android.ugc.aweme.account.util.o.f33104a, false, 21400, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{c2, str2, str3}, oVar, com.ss.android.ugc.aweme.account.util.o.f33104a, false, 21400, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            } else if (c2 != null) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str2));
                if (Build.VERSION.SDK_INT >= 19) {
                    String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(c2);
                    intent.putExtra("sms_body", str3);
                    if (!TextUtils.isEmpty(defaultSmsPackage)) {
                        intent.setPackage(defaultSmsPackage);
                    }
                } else {
                    intent.putExtra("sms_body", str3);
                }
                try {
                    c2.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                }
            }
        } else if (num != null && num.intValue() == C0906R.id.dmc) {
            r.a("click_msg_done", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_url", this.m).f31599b);
            AppCompatActivity c3 = c();
            if (c3 != null) {
                str = c3.getString(C0906R.string.chi);
            }
            a(str);
            SafeHandler safeHandler = this.r;
            if (safeHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handler");
            }
            safeHandler.postDelayed(new C0411c(this), 3000);
        } else if (num != null && num.intValue() == C0906R.id.dmi) {
            ClipboardCompat.setText(c(), "", this.h);
            com.bytedance.ies.dmt.ui.d.a.c((Context) c(), (int) C0906R.string.a24).a();
        } else if (num != null && num.intValue() == C0906R.id.dmg) {
            new a.C0185a(c()).a((int) C0906R.string.hr).b((int) C0906R.string.hs).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) d.f32304a).a().b();
            r.a("click_msg_verify_faq", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_url", this.m).f31599b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull AppCompatActivity appCompatActivity, @NotNull ViewStub viewStub, @NotNull f.a aVar) {
        super(appCompatActivity, viewStub, aVar);
        Intrinsics.checkParameterIsNotNull(appCompatActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(viewStub, "viewStub");
        Intrinsics.checkParameterIsNotNull(aVar, "authCallback");
    }

    public final void a(Integer num, String str, String str2) {
        String str3;
        if (PatchProxy.isSupport(new Object[]{num, str, str2}, this, f32292a, false, 20359, new Class[]{Integer.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num, str, str2}, this, f32292a, false, 20359, new Class[]{Integer.class, String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.a.a.b a2 = new com.ss.android.ugc.aweme.account.a.a.b().a("enter_url", this.m).a("verify_way", "sms_verify").a("verify_pass", 0);
        if (num != null) {
            num.intValue();
            a2.a("error_code", num.intValue());
        }
        r.a("double_verify_pass", (Map) a2.f31599b);
        d();
        if (TextUtils.isEmpty(str2)) {
            AppCompatActivity c2 = c();
            if (c2 != null) {
                str3 = c2.getString(C0906R.string.hp);
            } else {
                str3 = null;
            }
        } else {
            str3 = str2;
        }
        com.bytedance.ies.dmt.ui.d.a.c((Context) c(), str3).a();
        b(num, str);
    }
}
