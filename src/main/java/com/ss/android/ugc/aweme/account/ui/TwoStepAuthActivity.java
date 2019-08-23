package com.ss.android.ugc.aweme.account.ui;

import a.g;
import a.i;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.account.login.twostep.e;
import com.ss.android.ugc.aweme.account.login.twostep.f;
import com.ss.android.ugc.aweme.account.ui.o;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.y;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J!\u0010)\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010\"2\b\u0010+\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020%H\u0014J\u0012\u0010.\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\nH\u0016J\b\u00102\u001a\u00020%H\u0002J\u0010\u00103\u001a\u00020%2\u0006\u00101\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\b\n\u0000\u0012\u0004\b#\u0010\u0004¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/account/ui/TwoStepAuthActivity;", "Lcom/ss/android/ugc/aweme/account/base/activity/AmeSSActivity;", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;", "Lcom/ss/android/ugc/aweme/account/ui/IBackPressManager;", "()V", "authData", "", "authenticator", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator;", "backPressListener", "Lcom/ss/android/ugc/aweme/account/ui/IBackPressManager$OnBackPressListener;", "contentStub", "Landroid/view/ViewStub;", "getContentStub", "()Landroid/view/ViewStub;", "setContentStub", "(Landroid/view/ViewStub;)V", "instructionText", "Landroid/widget/TextView;", "getInstructionText", "()Landroid/widget/TextView;", "setInstructionText", "(Landroid/widget/TextView;)V", "isUserAbortingProcess", "", "profileKey", "sourceUrlPath", "titleBar", "Lcom/bytedance/ies/dmt/ui/titlebar/NormalTitleBar;", "getTitleBar", "()Lcom/bytedance/ies/dmt/ui/titlebar/NormalTitleBar;", "setTitleBar", "(Lcom/bytedance/ies/dmt/ui/titlebar/NormalTitleBar;)V", "type", "", "type$annotations", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onError", "errorCode", "errorMessage", "(Ljava/lang/Integer;Ljava/lang/String;)V", "onStop", "onSuccess", "successTicket", "registerBackPressListener", "listener", "setupViews", "unregisterBackPressListener", "Companion", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class TwoStepAuthActivity extends AmeSSActivity implements f.a, o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32926a;
    public static final boolean i = com.ss.android.ugc.aweme.g.a.a();
    public static final a j = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public NormalTitleBar f32927b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public ViewStub f32928c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public TextView f32929d;

    /* renamed from: e  reason: collision with root package name */
    public f f32930e;

    /* renamed from: f  reason: collision with root package name */
    public String f32931f;
    public String g;
    public String h;
    private int k = -1;
    private o.a l;
    private boolean o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/account/ui/TwoStepAuthActivity$Companion;", "", "()V", "DEBUG", "", "TAG", "", "TWO_STEP_AUTH_DATA", "TWO_STEP_AUTH_TYPE", "TWO_STEP_URL_PATH", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/account/ui/TwoStepAuthActivity$onCreate$1", "Lcom/bytedance/ies/dmt/ui/titlebar/listener/OnTitleBarClickListener;", "onBackClick", "", "view", "Landroid/view/View;", "onEndBtnClick", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32932a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TwoStepAuthActivity f32933b;

        public final void b(@Nullable View view) {
        }

        b(TwoStepAuthActivity twoStepAuthActivity) {
            this.f32933b = twoStepAuthActivity;
        }

        public final void a(@Nullable View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f32932a, false, 21180, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f32932a, false, 21180, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f32933b.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 13})
    static final class c<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32934a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TwoStepAuthActivity f32935b;

        c(TwoStepAuthActivity twoStepAuthActivity) {
            this.f32935b = twoStepAuthActivity;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(a());
        }

        private boolean a() {
            JSONObject jSONObject;
            if (PatchProxy.isSupport(new Object[0], this, f32934a, false, 21181, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32934a, false, 21181, new Class[0], Boolean.TYPE)).booleanValue();
            }
            String str = null;
            try {
                jSONObject = new JSONObject(this.f32935b.g);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                return false;
            }
            f fVar = this.f32935b.f32930e;
            if (fVar != null) {
                if (PatchProxy.isSupport(new Object[]{jSONObject}, fVar, f.j, false, 20396, new Class[]{JSONObject.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{jSONObject}, fVar, f.j, false, 20396, new Class[]{JSONObject.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(jSONObject, "fullJson");
                    fVar.l = jSONObject;
                }
            }
            TwoStepAuthActivity twoStepAuthActivity = this.f32935b;
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 != null) {
                str = jSONObject2.optString("profile_key");
            }
            twoStepAuthActivity.h = str;
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 13})
    static final class d<TTaskResult, TContinuationResult> implements g<Boolean, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32936a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TwoStepAuthActivity f32937b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f32938c;

        d(TwoStepAuthActivity twoStepAuthActivity, Ref.ObjectRef objectRef) {
            this.f32937b = twoStepAuthActivity;
            this.f32938c = objectRef;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f32936a, false, 21182, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f32936a, false, 21182, new Class[]{i.class}, Void.TYPE);
            } else if (y.a(iVar)) {
                f fVar = this.f32937b.f32930e;
                if (fVar != null) {
                    fVar.m = this.f32937b.f32931f;
                }
                f fVar2 = this.f32937b.f32930e;
                if (fVar2 != null) {
                    fVar2.a();
                }
                r.a("double_verify_request", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_url", this.f32937b.f32931f).a("verify_way", (String) this.f32938c.element).f31599b);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f32926a, false, 21178, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32926a, false, 21178, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.TwoStepAuthActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.TwoStepAuthActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32926a, false, 21179, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32926a, false, 21179, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.TwoStepAuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f32926a, false, 21174, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32926a, false, 21174, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null) {
            o.a aVar = this.l;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            z = aVar.b();
        }
        if (!z) {
            this.o = true;
            finish();
        }
    }

    public final void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f32926a, false, 21175, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32926a, false, 21175, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.o) {
            e.a().a(new com.ss.android.ugc.aweme.account.g.c(null, null, 0, "User left TwoStepAuthActivity before completing auth process"));
        }
    }

    public final void a(@NotNull o.a aVar) {
        o.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f32926a, false, 21172, new Class[]{o.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f32926a, false, 21172, new Class[]{o.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "listener");
        this.l = aVar2;
    }

    public final void a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f32926a, false, 21171, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f32926a, false, 21171, new Class[]{String.class}, Void.TYPE);
            return;
        }
        e.a().a(new com.ss.android.ugc.aweme.account.g.c(str2, this.h, 0, null));
        finish();
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32926a, false, 21169, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32926a, false, 21169, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.TwoStepAuthActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ee);
        v.a((Activity) this, ContextCompat.getColor(this, C0906R.color.a17));
        View findViewById = findViewById(C0906R.id.dml);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.two_step_auth_title_bar)");
        this.f32927b = (NormalTitleBar) findViewById;
        View findViewById2 = findViewById(C0906R.id.dm8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.two_step_auth_content_stub)");
        this.f32928c = (ViewStub) findViewById2;
        View findViewById3 = findViewById(C0906R.id.dm9);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.two_step_auth_instruction_text)");
        this.f32929d = (TextView) findViewById3;
        NormalTitleBar normalTitleBar = this.f32927b;
        if (normalTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        ImageView startBtn = normalTitleBar.getStartBtn();
        if (startBtn != null) {
            startBtn.setImageResource(2130838753);
        }
        NormalTitleBar normalTitleBar2 = this.f32927b;
        if (normalTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        ImageView startBtn2 = normalTitleBar2.getStartBtn();
        if (startBtn2 != null) {
            startBtn2.setAlpha(0.8f);
        }
        NormalTitleBar normalTitleBar3 = this.f32927b;
        if (normalTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        normalTitleBar3.setOnTitleBarClickListener(new b(this));
        this.k = getIntent().getIntExtra("auth_type", -1);
        this.g = getIntent().getStringExtra("auth_data");
        this.f32931f = getIntent().getStringExtra("url_path");
        if (PatchProxy.isSupport(new Object[0], this, f32926a, false, 21170, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32926a, false, 21170, new Class[0], Void.TYPE);
        } else if (this.k == -1) {
            new StringBuilder("Unknown TwoStepAuthType: ").append(this.k);
            finish();
        } else if (TextUtils.isEmpty(this.g)) {
            finish();
        } else {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = null;
            switch (this.k) {
                case 1:
                    objectRef.element = "sms_verify";
                    TextView textView = this.f32929d;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("instructionText");
                    }
                    textView.setText(C0906R.string.dm_);
                    AppCompatActivity appCompatActivity = this;
                    ViewStub viewStub = this.f32928c;
                    if (viewStub == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("contentStub");
                    }
                    this.f32930e = new com.ss.android.ugc.aweme.account.login.twostep.c(appCompatActivity, viewStub, this);
                    break;
                case 2:
                    objectRef.element = "code_verify";
                    TextView textView2 = this.f32929d;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("instructionText");
                    }
                    textView2.setText(C0906R.string.dm9);
                    AppCompatActivity appCompatActivity2 = this;
                    ViewStub viewStub2 = this.f32928c;
                    if (viewStub2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("contentStub");
                    }
                    this.f32930e = new com.ss.android.ugc.aweme.account.login.twostep.b(appCompatActivity2, viewStub2, this);
                    break;
                case 3:
                    objectRef.element = "third_party_verify";
                    TextView textView3 = this.f32929d;
                    if (textView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("instructionText");
                    }
                    textView3.setText(C0906R.string.dma);
                    AppCompatActivity appCompatActivity3 = this;
                    ViewStub viewStub3 = this.f32928c;
                    if (viewStub3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("contentStub");
                    }
                    this.f32930e = new com.ss.android.ugc.aweme.account.login.twostep.d(appCompatActivity3, viewStub3, this);
                    break;
            }
            i.a((Callable<TResult>) new c<TResult>(this)).a((g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(this, objectRef), i.f1052b);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.TwoStepAuthActivity", "onCreate", false);
    }
}
