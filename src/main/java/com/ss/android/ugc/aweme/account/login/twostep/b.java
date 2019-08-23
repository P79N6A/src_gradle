package com.ss.android.ugc.aweme.account.login.twostep;

import a.i;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.f;
import com.ss.android.ugc.aweme.account.util.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\n\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002J+\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/twostep/PasswordAuthenticator;", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator;", "activity", "Landroid/support/v7/app/AppCompatActivity;", "viewStub", "Landroid/view/ViewStub;", "authCallback", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;", "(Landroid/support/v7/app/AppCompatActivity;Landroid/view/ViewStub;Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;)V", "confirmBtn", "Landroid/view/View;", "passwordInput", "Landroid/widget/EditText;", "verifyTicket", "", "inflateView", "initData", "", "initViews", "view", "onPasswordFailed", "errorCode", "", "errorDesc", "toastErrorText", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "onPasswordVerified", "ticket", "verifyPassword", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32280a;

    /* renamed from: b  reason: collision with root package name */
    EditText f32281b;

    /* renamed from: c  reason: collision with root package name */
    public View f32282c;

    /* renamed from: d  reason: collision with root package name */
    public String f32283d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32284a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32285b;

        a(b bVar) {
            this.f32285b = bVar;
        }

        public final void run() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f32284a, false, 20346, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32284a, false, 20346, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.f32285b;
            JSONObject jSONObject = this.f32285b.l;
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 != null) {
                    str = jSONObject2.optString("verify_ticket");
                    bVar.f32283d = str;
                }
            }
            str = null;
            bVar.f32283d = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$b  reason: collision with other inner class name */
    static final class C0410b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32286a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32287b;

        C0410b(b bVar) {
            this.f32287b = bVar;
        }

        public final void onClick(View view) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{view}, this, f32286a, false, 20347, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f32286a, false, 20347, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            b bVar = this.f32287b;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f32280a, false, 20343, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.f32280a, false, 20343, new Class[0], Void.TYPE);
                return;
            }
            EditText editText = bVar.f32281b;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("passwordInput");
            }
            String obj = editText.getText().toString();
            if (obj != null) {
                String obj2 = StringsKt.trim((CharSequence) obj).toString();
                if (obj2.length() != 0) {
                    z = false;
                }
                if (z) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) bVar.c(), (int) C0906R.string.bnc).a();
                } else if (bVar.f32283d != null) {
                    bVar.a(null);
                    TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.f32267b;
                    String str = bVar.f32283d;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    String a2 = g.a(obj2);
                    Intrinsics.checkExpressionValueIsNotNull(a2, "CryptoUtils.encryptWithXor(password)");
                    i<TwoStepAuthApi.a> a3 = twoStepAuthApi.a(str, "1128", a2);
                    if (a3 != null) {
                        a3.a((a.g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(bVar), i.f1052b);
                    } else {
                        bVar.a(null, "TwoStepAuthApi.verifyPassword returns null task", null);
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/account/login/twostep/PasswordAuthenticator$initViews$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32289b;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        c(b bVar) {
            this.f32289b = bVar;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            float f2;
            if (PatchProxy.isSupport(new Object[]{editable}, this, f32288a, false, 20348, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f32288a, false, 20348, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            b.a(this.f32289b).setEnabled(!TextUtils.isEmpty(editable));
            View a2 = b.a(this.f32289b);
            if (b.a(this.f32289b).isEnabled()) {
                f2 = 1.0f;
            } else {
                f2 = 0.4f;
            }
            a2.setAlpha(f2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$TwoStepApiResponse;", "kotlin.jvm.PlatformType", "then", "(Lbolts/Task;)Lkotlin/Unit;"}, k = 3, mv = {1, 1, 13})
    static final class d<TTaskResult, TContinuationResult> implements a.g<TwoStepAuthApi.a, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32290a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32291b;

        d(b bVar) {
            this.f32291b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00f8  */
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
                com.meituan.robust.ChangeQuickRedirect r2 = f32290a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<kotlin.Unit> r6 = kotlin.Unit.class
                r3 = 0
                r4 = 20349(0x4f7d, float:2.8515E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f32290a
                r3 = 0
                r4 = 20349(0x4f7d, float:2.8515E-41)
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
                com.ss.android.ugc.aweme.account.login.twostep.b r0 = r7.f32291b
                java.lang.String r2 = "TwoStepAuthApi.verifyPassword bolts Task error"
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
                if (r2 == 0) goto L_0x00ec
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r2 = r0.f32272c
                if (r2 == 0) goto L_0x00ec
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r2 = r0.f32272c
                java.lang.String r2 = r2.f32274b
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L_0x0089
                goto L_0x00ec
            L_0x0089:
                com.ss.android.ugc.aweme.account.login.twostep.b r1 = r7.f32291b
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r0 = r0.f32272c
                java.lang.String r0 = r0.f32274b
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.login.twostep.b.f32280a
                r14 = 0
                r15 = 20345(0x4f79, float:2.851E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r2[r10] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x00c1
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.login.twostep.b.f32280a
                r14 = 0
                r15 = 20345(0x4f79, float:2.851E-41)
                java.lang.Class[] r0 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r0[r10] = r2
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x00e9
            L_0x00c1:
                java.lang.String r2 = "double_verify_pass"
                com.ss.android.ugc.aweme.account.a.a.b r3 = new com.ss.android.ugc.aweme.account.a.a.b
                r3.<init>()
                java.lang.String r4 = "enter_url"
                java.lang.String r5 = r1.m
                com.ss.android.ugc.aweme.account.a.a.b r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "verify_way"
                java.lang.String r5 = "code_verify"
                com.ss.android.ugc.aweme.account.a.a.b r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "verify_pass"
                com.ss.android.ugc.aweme.account.a.a.b r3 = r3.a((java.lang.String) r4, (int) r9)
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.f31599b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r2, (java.util.Map) r3)
                r1.d()
                r1.b(r0)
            L_0x00e9:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L_0x00ec:
                if (r0 == 0) goto L_0x00f5
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r2 = r0.f32272c
                if (r2 == 0) goto L_0x00f5
                java.lang.Integer r2 = r2.f32275c
                goto L_0x00f6
            L_0x00f5:
                r2 = r1
            L_0x00f6:
                if (r0 == 0) goto L_0x00ff
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r0 = r0.f32272c
                if (r0 == 0) goto L_0x00ff
                java.lang.String r0 = r0.f32276d
                goto L_0x0100
            L_0x00ff:
                r0 = r1
            L_0x0100:
                com.ss.android.ugc.aweme.account.login.twostep.b r3 = r7.f32291b
                r3.a(r2, r0, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.b.d.then(a.i):java.lang.Object");
        }
    }

    @Nullable
    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f32280a, false, 20340, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f32280a, false, 20340, new Class[0], View.class);
        }
        if (this.n.getLayoutResource() <= 0) {
            this.n.setLayoutResource(C0906R.layout.a9p);
        }
        View inflate = this.n.inflate();
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f32280a, false, 20341, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f32280a, false, 20341, new Class[]{View.class}, Void.TYPE);
        } else if (inflate != null) {
            View findViewById = inflate.findViewById(C0906R.id.dma);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.two_step_auth_password_btn)");
            this.f32282c = findViewById;
            View findViewById2 = inflate.findViewById(C0906R.id.dmb);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.t…step_auth_password_input)");
            this.f32281b = (EditText) findViewById2;
            View view = this.f32282c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmBtn");
            }
            view.setOnClickListener(new C0410b(this));
            EditText editText = this.f32281b;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("passwordInput");
            }
            editText.addTextChangedListener(new c(this));
            View view2 = this.f32282c;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmBtn");
            }
            view2.setEnabled(false);
            View view3 = this.f32282c;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmBtn");
            }
            view3.setAlpha(0.4f);
        }
        if (PatchProxy.isSupport(new Object[0], this, f32280a, false, 20342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32280a, false, 20342, new Class[0], Void.TYPE);
        } else {
            y.a(new a(this), "PasswordAuthenticator");
        }
        return inflate;
    }

    @NotNull
    public static final /* synthetic */ View a(b bVar) {
        View view = bVar.f32282c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmBtn");
        }
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull AppCompatActivity appCompatActivity, @NotNull ViewStub viewStub, @NotNull f.a aVar) {
        super(appCompatActivity, viewStub, aVar);
        Intrinsics.checkParameterIsNotNull(appCompatActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(viewStub, "viewStub");
        Intrinsics.checkParameterIsNotNull(aVar, "authCallback");
    }

    public final void a(Integer num, String str, String str2) {
        String str3;
        if (PatchProxy.isSupport(new Object[]{num, str, str2}, this, f32280a, false, 20344, new Class[]{Integer.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num, str, str2}, this, f32280a, false, 20344, new Class[]{Integer.class, String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.a.a.b a2 = new com.ss.android.ugc.aweme.account.a.a.b().a("enter_url", this.m).a("verify_way", "code_verify").a("verify_pass", 0);
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
        com.bytedance.ies.dmt.ui.d.a.b((Context) c(), str3).a();
        b(num, str);
    }
}
