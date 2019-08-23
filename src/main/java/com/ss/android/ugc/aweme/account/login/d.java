package com.ss.android.ugc.aweme.account.login;

import a.g;
import a.i;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.bytedance.common.utility.JsonUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.sdk.account.utils.ToastUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.account.terminal.d;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.y;
import com.ss.android.ugc.aweme.w;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/LoginCallbackManager;", "", "()V", "DEBUG", "", "TAG", "", "getDateMonthYearString", "context", "Landroid/content/Context;", "targetDateInSeconds", "", "onAccountBeingRemoved", "", "info", "Lcom/ss/android/ugc/aweme/account/login/ErrorInfo;", "onError", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32194a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f32195b = com.ss.android.ugc.aweme.g.a.a();

    /* renamed from: c  reason: collision with root package name */
    public static final d f32196c = new d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f32198b;

        a(a aVar) {
            this.f32198b = aVar;
        }

        public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32197a, false, 20077, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32197a, false, 20077, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dialogInterface, "<anonymous parameter 0>");
            com.ss.android.ugc.aweme.account.terminal.d.f32793c.a(false, this.f32198b.f32037c, "", this.f32198b.g);
            Runnable runnable = this.f32198b.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f32202b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f32203c;

        b(JSONObject jSONObject, a aVar) {
            this.f32202b = jSONObject;
            this.f32203c = aVar;
        }

        public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32201a, false, 20078, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32201a, false, 20078, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dialogInterface, "<anonymous parameter 0>");
            i<String> a2 = AccountApiInModule.a(JsonUtils.queryString(this.f32202b, "token", ""));
            if (a2 == null) {
                com.ss.android.ugc.aweme.account.terminal.d.f32793c.a(false, this.f32203c.f32037c, "cancel_login: Error occurred when requesting AccountApiInModule.loginDuringAccountRemoval", this.f32203c.g);
                ToastUtils.showToast(this.f32203c.f32036b, (int) C0906R.string.b8c);
            } else {
                a2.a((g<TResult, TContinuationResult>) new g<String, Boolean>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32205a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ b f32206b;

                    {
                        this.f32206b = r1;
                    }

                    public final /* synthetic */ Object then(i iVar) {
                        LoginMethodName loginMethodName;
                        LoginMethodName loginMethodName2;
                        boolean z = true;
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f32205a, false, 20079, new Class[]{i.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{iVar}, this, f32205a, false, 20079, new Class[]{i.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            if (y.a(iVar)) {
                                Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                                JSONObject jSONObject = new JSONObject((String) iVar.e());
                                BaseLoginMethod baseLoginMethod = null;
                                String queryString = JsonUtils.queryString(jSONObject, "message", null);
                                if (jSONObject.has("message") && !TextUtils.equals(queryString, "error")) {
                                    User queryUser = w.a().queryUser(null, true);
                                    w.a(queryUser);
                                    n.d(true);
                                    if (this.f32206b.f32203c.f32039e != null) {
                                        d dVar = d.f32196c;
                                        if (d.f32195b) {
                                            StringBuilder sb = new StringBuilder("Login method: ");
                                            BaseLoginMethod baseLoginMethod2 = this.f32206b.f32203c.f32039e;
                                            if (baseLoginMethod2 != null) {
                                                loginMethodName2 = baseLoginMethod2.getLoginMethodName();
                                            } else {
                                                loginMethodName2 = null;
                                            }
                                            sb.append(loginMethodName2);
                                        }
                                        BaseLoginMethod baseLoginMethod3 = this.f32206b.f32203c.f32039e;
                                        if (baseLoginMethod3 != null) {
                                            loginMethodName = baseLoginMethod3.getLoginMethodName();
                                        } else {
                                            loginMethodName = null;
                                        }
                                        if (loginMethodName != null) {
                                            switch (e.f32215a[loginMethodName.ordinal()]) {
                                                case 1:
                                                    BaseLoginMethod baseLoginMethod4 = this.f32206b.f32203c.f32039e;
                                                    if (baseLoginMethod4 != null) {
                                                        Intrinsics.checkExpressionValueIsNotNull(queryUser, AllStoryActivity.f73306b);
                                                        String uid = queryUser.getUid();
                                                        Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
                                                        baseLoginMethod = new PhoneLoginMethod(uid, LoginMethodName.PHONE_NUMBER_PASS, ((PhoneLoginMethod) baseLoginMethod4).getPhoneNumber());
                                                        break;
                                                    } else {
                                                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod");
                                                    }
                                                case 2:
                                                    BaseLoginMethod baseLoginMethod5 = this.f32206b.f32203c.f32039e;
                                                    if (baseLoginMethod5 != null) {
                                                        Intrinsics.checkExpressionValueIsNotNull(queryUser, AllStoryActivity.f73306b);
                                                        String uid2 = queryUser.getUid();
                                                        Intrinsics.checkExpressionValueIsNotNull(uid2, "user.uid");
                                                        baseLoginMethod = new PhoneLoginMethod(uid2, LoginMethodName.PHONE_SMS, ((PhoneLoginMethod) baseLoginMethod5).getPhoneNumber());
                                                        break;
                                                    } else {
                                                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod");
                                                    }
                                                case 3:
                                                    BaseLoginMethod baseLoginMethod6 = this.f32206b.f32203c.f32039e;
                                                    if (baseLoginMethod6 != null) {
                                                        Intrinsics.checkExpressionValueIsNotNull(queryUser, AllStoryActivity.f73306b);
                                                        String uid3 = queryUser.getUid();
                                                        Intrinsics.checkExpressionValueIsNotNull(uid3, "user.uid");
                                                        baseLoginMethod = new TPLoginMethod(uid3, ((TPLoginMethod) baseLoginMethod6).getPlatform(), TPUserInfo.CREATOR.a(queryUser));
                                                        break;
                                                    } else {
                                                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.TPLoginMethod");
                                                    }
                                            }
                                        }
                                        if (baseLoginMethod != null) {
                                            g.a(baseLoginMethod);
                                        }
                                    }
                                    com.ss.android.ugc.aweme.account.terminal.d.f32793c.a(true, 0, "", this.f32206b.f32203c.g);
                                    this.f32206b.f32203c.f32040f.a(this.f32206b.f32203c.g);
                                }
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }).a((g<TResult, TContinuationResult>) new g<Boolean, Void>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32207a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ b f32208b;

                    {
                        this.f32208b = r1;
                    }

                    public final /* synthetic */ Object then(i iVar) {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f32207a, false, 20080, new Class[]{i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f32207a, false, 20080, new Class[]{i.class}, Void.class);
                        }
                        Runnable runnable = this.f32208b.f32203c.h;
                        if (runnable != null) {
                            runnable.run();
                        }
                        if (y.a(iVar)) {
                            Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                            Object e2 = iVar.e();
                            Intrinsics.checkExpressionValueIsNotNull(e2, "it.result");
                            if (((Boolean) e2).booleanValue()) {
                                return null;
                            }
                        }
                        d.a aVar = com.ss.android.ugc.aweme.account.terminal.d.f32793c;
                        int i = this.f32208b.f32203c.f32037c;
                        StringBuilder sb = new StringBuilder("cancel_login: ");
                        Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                        sb.append(iVar.f());
                        aVar.a(false, i, sb.toString(), this.f32208b.f32203c.g);
                        ToastUtils.showToast(this.f32208b.f32203c.f32036b, (int) C0906R.string.b8c);
                        return null;
                    }
                }, i.f1052b);
            }
            r.a("deleted_account_login_cancel", (Map) null);
        }
    }

    private d() {
    }

    @JvmStatic
    public static final void a(@NotNull a aVar) {
        JSONObject jSONObject;
        String str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f32194a, true, 20074, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f32194a, true, 20074, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "info");
        if (aVar2.f32037c == 1075) {
            if (PatchProxy.isSupport(new Object[]{aVar2}, null, f32194a, true, 20075, new Class[]{a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, null, f32194a, true, 20075, new Class[]{a.class}, Void.TYPE);
            } else if (aVar2.f32036b == null || aVar2.f32038d == null || aVar2.f32040f == null) {
                Runnable runnable = aVar2.h;
                if (runnable != null) {
                    runnable.run();
                }
                ToastUtils.showToast((Context) w.b(), (int) C0906R.string.b8c);
            } else {
                if (aVar2.f32038d.has("data")) {
                    jSONObject = aVar2.f32038d.optJSONObject("data");
                } else if (!aVar2.f32038d.has("cancel_time") || !aVar2.f32038d.has("token")) {
                    jSONObject = null;
                } else {
                    jSONObject = aVar2.f32038d;
                }
                if (jSONObject != null) {
                    long queryLong = JsonUtils.queryLong(jSONObject, "cancel_time", 0);
                    Locale locale = Locale.US;
                    Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                    String string = aVar2.f32036b.getString(C0906R.string.b8_);
                    Intrinsics.checkExpressionValueIsNotNull(string, "info.context.getString(R…during_acc_removal_title)");
                    Object[] objArr = new Object[1];
                    if (queryLong > 0) {
                        str = f32196c.a(aVar2.f32036b, queryLong);
                    } else {
                        str = "";
                    }
                    objArr[0] = str;
                    String format = String.format(locale, string, Arrays.copyOf(objArr, 1));
                    Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
                    Locale locale2 = Locale.US;
                    Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.US");
                    String string2 = aVar2.f32036b.getString(C0906R.string.b89);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "info.context.getString(R…_during_acc_removal_desc)");
                    String format2 = String.format(locale2, string2, Arrays.copyOf(new Object[]{aVar2.f32036b.getString(C0906R.string.ps), aVar2.f32036b.getString(C0906R.string.dns)}, 2));
                    Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(locale, format, *args)");
                    new a.C0185a(aVar2.f32036b).a(format).b(format2).b((int) C0906R.string.dns, (DialogInterface.OnClickListener) new a(aVar2)).a((int) C0906R.string.ps, (DialogInterface.OnClickListener) new b(jSONObject, aVar2)).a().b();
                    r.a("deleted_account_login_alert", (Map) null);
                } else if (!f32195b) {
                    Runnable runnable2 = aVar2.h;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    ToastUtils.showToast((Context) w.b(), (int) C0906R.string.b8c);
                } else {
                    throw new IllegalArgumentException("Invalid JSON format detected when processing " + "error code (1075): " + aVar2.f32038d);
                }
            }
        }
    }

    private final String a(Context context, long j) {
        String str;
        Context context2 = context;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, new Long(j2)}, this, f32194a, false, 20076, new Class[]{Context.class, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, new Long(j2)}, this, f32194a, false, 20076, new Class[]{Context.class, Long.TYPE}, String.class);
        }
        try {
            str = DateUtils.formatDateTime(context2, j2 * 1000, 65540);
            Intrinsics.checkExpressionValueIsNotNull(str, "DateUtils.formatDateTime…teUtils.FORMAT_SHOW_YEAR)");
        } catch (Exception unused) {
            str = "";
        }
        return str;
    }
}
