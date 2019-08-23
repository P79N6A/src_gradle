package com.ss.android.ugc.aweme.account.login.twostep;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.utils.y;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0001/B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001f\u001a\u00020 H\u0004J\n\u0010!\u001a\u0004\u0018\u00010\u0003H\u0004J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J!\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010\u0018H\u0004¢\u0006\u0002\u0010(J\u0012\u0010)\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010\u0018H\u0004J\u000e\u0010+\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010,\u001a\u00020 2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0012\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010\u0018H\u0004R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator;", "", "activity", "Landroid/support/v7/app/AppCompatActivity;", "viewStub", "Landroid/view/ViewStub;", "callback", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;", "(Landroid/support/v7/app/AppCompatActivity;Landroid/view/ViewStub;Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;)V", "activityRef", "Ljava/lang/ref/WeakReference;", "getCallback", "()Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;", "setCallback", "(Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;)V", "fullJson", "Lorg/json/JSONObject;", "getFullJson", "()Lorg/json/JSONObject;", "setFullJson", "(Lorg/json/JSONObject;)V", "loadingDialog", "Lcom/ss/android/ugc/aweme/account/dialog/AccountStatusViewDialog;", "sourceUrlPath", "", "getSourceUrlPath", "()Ljava/lang/String;", "setSourceUrlPath", "(Ljava/lang/String;)V", "getViewStub", "()Landroid/view/ViewStub;", "dismissLoadingDialog", "", "getActivity", "inflateView", "Landroid/view/View;", "notifyError", "errorCode", "", "errorMessage", "(Ljava/lang/Integer;Ljava/lang/String;)V", "notifySuccess", "successTicket", "setServerData", "setUrlPath", "showLoadingDialog", "dialogText", "AuthResult", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public class f {
    public static ChangeQuickRedirect j;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<AppCompatActivity> f32333a;
    public com.ss.android.ugc.aweme.account.d.a k;
    @Nullable
    public JSONObject l;
    @Nullable
    public String m;
    @NotNull
    public final ViewStub n;
    @Nullable
    public a o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;", "", "onError", "", "errorCode", "", "errorMessage", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "onSuccess", "successTicket", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public interface a {
        void a(@Nullable String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f32335b;

        b(f fVar) {
            this.f32335b = fVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f32334a, false, 20401, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32334a, false, 20401, new Class[0], Void.TYPE);
                return;
            }
            bc.b(this.f32335b.k);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$showLoadingDialog$1$1"}, k = 3, mv = {1, 1, 13})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f32337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f32338c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f32339d;

        c(AppCompatActivity appCompatActivity, f fVar, String str) {
            this.f32337b = appCompatActivity;
            this.f32338c = fVar;
            this.f32339d = str;
        }

        public final void run() {
            com.ss.android.ugc.aweme.account.d.a aVar;
            if (PatchProxy.isSupport(new Object[0], this, f32336a, false, 20402, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32336a, false, 20402, new Class[0], Void.TYPE);
                return;
            }
            f fVar = this.f32338c;
            if (TextUtils.isEmpty(this.f32339d)) {
                aVar = new com.ss.android.ugc.aweme.account.d.a(this.f32337b, null);
            } else {
                Activity activity = this.f32337b;
                Context context = this.f32337b;
                String str = this.f32339d;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                com.ss.android.ugc.aweme.account.view.c cVar = new com.ss.android.ugc.aweme.account.view.c(context, str, null, 0, 12);
                new com.ss.android.ugc.aweme.account.d.a(activity, cVar);
            }
            fVar.k = aVar;
            com.ss.android.ugc.aweme.account.d.a aVar2 = this.f32338c.k;
            if (aVar2 != null) {
                aVar2.setCanceledOnTouchOutside(false);
            }
            com.ss.android.ugc.aweme.account.d.a aVar3 = this.f32338c.k;
            if (aVar3 != null) {
                aVar3.f31834b = true;
            }
            com.ss.android.ugc.aweme.account.d.a aVar4 = this.f32338c.k;
            if (aVar4 != null) {
                aVar4.setOnCancelListener(new DialogInterface.OnCancelListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32340a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ c f32341b;

                    {
                        this.f32341b = r1;
                    }

                    public final void onCancel(DialogInterface dialogInterface) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f32340a, false, 20403, new Class[]{DialogInterface.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f32340a, false, 20403, new Class[]{DialogInterface.class}, Void.TYPE);
                            return;
                        }
                        AppCompatActivity c2 = this.f32341b.f32338c.c();
                        if (c2 != null) {
                            c2.finish();
                        }
                    }
                });
            }
            bc.a(this.f32338c.k);
        }
    }

    @Nullable
    public View a() {
        return null;
    }

    public final void b(@Nullable Integer num, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{num, str}, this, j, false, 20400, new Class[]{Integer.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num, str}, this, j, false, 20400, new Class[]{Integer.class, String.class}, Void.TYPE);
        }
    }

    @Nullable
    public final AppCompatActivity c() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 20395, new Class[0], AppCompatActivity.class)) {
            return (AppCompatActivity) this.f32333a.get();
        }
        return (AppCompatActivity) PatchProxy.accessDispatch(new Object[0], this, j, false, 20395, new Class[0], AppCompatActivity.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 20398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 20398, new Class[0], Void.TYPE);
            return;
        }
        y.a((Runnable) new b(this));
    }

    public final void b(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, j, false, 20399, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, j, false, 20399, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a aVar = this.o;
        if (aVar != null) {
            aVar.a(str2);
        }
    }

    public final void a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, j, false, 20397, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, j, false, 20397, new Class[]{String.class}, Void.TYPE);
            return;
        }
        AppCompatActivity c2 = c();
        if (c2 != null) {
            y.a((Runnable) new c(c2, this, str2));
        }
    }

    public f(@NotNull AppCompatActivity appCompatActivity, @NotNull ViewStub viewStub, @Nullable a aVar) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(viewStub, "viewStub");
        this.n = viewStub;
        this.o = aVar;
        this.f32333a = new WeakReference<>(appCompatActivity);
    }
}
