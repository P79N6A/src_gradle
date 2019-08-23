package com.ss.android.ugc.aweme.challenge.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ae.c;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.commercialize.utils.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.utils.ee;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0014J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeDetailActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSlideSSActivity;", "()V", "detailParam", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetailParam;", "attachFragment", "", "enableUseTranslucentTheme", "", "finish", "getAnalysis", "Lcom/ss/android/ugc/aweme/analysis/Analysis;", "init", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "parseParams", "setStatusBarColor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@AddPageTrace
public final class ChallengeDetailActivity extends AmeSlideSSActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f35486b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f35487c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private ChallengeDetailParam f35488d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J:\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J0\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeDetailActivity$Companion;", "", "()V", "CHALLENGE_DETAIL_FRAGMENT_TAG", "", "FROM_MESSAGE", "FROM_RELATED_TAG", "launchActivity", "", "context", "Landroid/content/Context;", "challengeId", "from", "challengeType", "", "isHashTag", "", "awemeId", "router", "challenge", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35489a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        public final void a(@NotNull Context context, @NotNull String str, @NotNull String str2, int i, boolean z) {
            Context context2 = context;
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{context2, str3, str4, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f35489a, false, 26042, new Class[]{Context.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                Object[] objArr = {context2, str3, str4, Integer.valueOf(i), Byte.valueOf(z)};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f35489a, false, 26042, new Class[]{Context.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(str3, "challengeId");
            Intrinsics.checkParameterIsNotNull(str4, "from");
            a(context, null, str, str2, i, z);
        }

        @JvmStatic
        public final void a(@NotNull Context context, @Nullable String str, @NotNull String str2, @NotNull String str3, int i, boolean z) {
            Context context2 = context;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f35489a, false, 26041, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                Object[] objArr = {context2, str4, str5, str6, Integer.valueOf(i), Byte.valueOf(z)};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f35489a, false, 26041, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(str5, "challengeId");
            Intrinsics.checkParameterIsNotNull(str6, "from");
            Intent intent = new Intent(context2, ChallengeDetailActivity.class);
            intent.putExtra("id", str5);
            intent.putExtra("aweme_id", str4);
            intent.putExtra("extra_challenge_from", str6);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", i);
            intent.putExtra("extra_challenge_is_hashtag", z);
            context2.startActivity(intent);
        }
    }

    @JvmStatic
    public static final void a(@NotNull Context context, @Nullable String str, @NotNull String str2, @NotNull String str3, int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, 0, (byte) 1}, null, f35486b, true, 26034, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {context, str, str2, str3, 0, (byte) 1};
            PatchProxy.accessDispatch(objArr, null, f35486b, true, 26034, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        f35487c.a(context, str, str2, str3, 0, true);
    }

    public final boolean b() {
        return true;
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35486b, false, 26040, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35486b, false, 26040, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f35486b, false, 26031, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35486b, false, 26031, new Class[0], Void.TYPE);
            return;
        }
        c.a(this);
        super.finish();
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f35486b, false, 26025, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35486b, false, 26025, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", true);
        super.onResume();
        ee.a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", false);
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f35486b, false, 26026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35486b, false, 26026, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this;
        StatusBarUtils.setTransparent(activity);
        if (com.ss.android.g.a.b()) {
            v.c(activity);
        }
    }

    @NotNull
    public final Analysis getAnalysis() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f35486b, false, 26030, new Class[0], Analysis.class)) {
            return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f35486b, false, 26030, new Class[0], Analysis.class);
        }
        long j2 = 0;
        try {
            ChallengeDetailParam challengeDetailParam = this.f35488d;
            if (challengeDetailParam == null) {
                Intrinsics.throwUninitializedPropertyAccessException("detailParam");
            }
            String cid = challengeDetailParam.getCid();
            if (cid == null) {
                Intrinsics.throwNpe();
            }
            j = Long.parseLong(cid);
        } catch (Exception unused) {
            j = 0;
        }
        try {
            ChallengeDetailParam challengeDetailParam2 = this.f35488d;
            if (challengeDetailParam2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("detailParam");
            }
            String awemeId = challengeDetailParam2.getAwemeId();
            if (awemeId == null) {
                Intrinsics.throwNpe();
            }
            j2 = Long.parseLong(awemeId);
        } catch (Exception unused2) {
        }
        Analysis value = new Analysis().setLabelName("challenge").setExt_value(j).setValue(j2);
        Intrinsics.checkExpressionValueIsNotNull(value, "Analysis().setLabelName(…t_value(id).setValue(aid)");
        return value;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        ChallengeDetailFragment challengeDetailFragment;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35486b, false, 26024, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35486b, false, 26024, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b1);
        findViewById(C0906R.id.y9).setBackgroundColor(getResources().getColor(C0906R.color.a25));
        View findViewById = findViewById(C0906R.id.y9);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<View>(R.id.container)");
        findViewById.setFitsSystemWindows(false);
        if (PatchProxy.isSupport(new Object[0], this, f35486b, false, 26027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35486b, false, 26027, new Class[0], Void.TYPE);
        } else {
            Object service = ServiceManager.get().getService(IAVService.class);
            Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
            ((IAVService) service).getFilterService().refreshData();
            if (PatchProxy.isSupport(new Object[0], this, f35486b, false, 26028, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f35486b, false, 26028, new Class[0], Void.TYPE);
            } else {
                String stringExtra = getIntent().getStringExtra("id");
                String stringExtra2 = getIntent().getStringExtra("aweme_id");
                String stringExtra3 = getIntent().getStringExtra("extra_challenge_from");
                CharSequence charSequence = stringExtra3;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    stringExtra3 = getIntent().getStringExtra("enter_from");
                }
                ChallengeDetailParam challengeDetailParam = new ChallengeDetailParam(stringExtra, stringExtra2, stringExtra3, getIntent().getStringExtra("from_token"), getIntent().getBooleanExtra("extra_challenge_is_hashtag", false), getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0), getIntent().getIntExtra("click_reason", 0), getIntent().getStringExtra("extra_enterprise_challenge_uid"), getIntent().getIntExtra("show_tab_index", -1));
                this.f35488d = challengeDetailParam;
            }
            String stringExtra4 = getIntent().getStringExtra("is_commerce");
            if (TextUtils.equals(stringExtra4, PushConstants.PUSH_TYPE_THROUGH_MESSAGE) || StringsKt.equals("true", stringExtra4, true)) {
                ChallengeDetailParam challengeDetailParam2 = this.f35488d;
                if (challengeDetailParam2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("detailParam");
                }
                r.a(challengeDetailParam2.getCid());
            }
            ChallengeDetailParam challengeDetailParam3 = this.f35488d;
            if (challengeDetailParam3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("detailParam");
            }
            if (TextUtils.isEmpty(challengeDetailParam3.getCid())) {
                finish();
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f35486b, false, 26029, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f35486b, false, 26029, new Class[0], Void.TYPE);
                } else {
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                    Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fm.beginTransaction()");
                    Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("challenge_detail_fragment_tag");
                    if (findFragmentByTag == null) {
                        ChallengeDetailFragment.c cVar = ChallengeDetailFragment.p;
                        ChallengeDetailParam challengeDetailParam4 = this.f35488d;
                        if (challengeDetailParam4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("detailParam");
                        }
                        if (PatchProxy.isSupport(new Object[]{challengeDetailParam4}, cVar, ChallengeDetailFragment.c.f35490a, false, 26128, new Class[]{ChallengeDetailParam.class}, ChallengeDetailFragment.class)) {
                            ChallengeDetailFragment.c cVar2 = cVar;
                            challengeDetailFragment = (ChallengeDetailFragment) PatchProxy.accessDispatch(new Object[]{challengeDetailParam4}, cVar2, ChallengeDetailFragment.c.f35490a, false, 26128, new Class[]{ChallengeDetailParam.class}, ChallengeDetailFragment.class);
                        } else {
                            Intrinsics.checkParameterIsNotNull(challengeDetailParam4, "param");
                            challengeDetailFragment = new ChallengeDetailFragment();
                            Bundle bundle2 = new Bundle();
                            bundle2.putSerializable("challenge_detail_param", challengeDetailParam4);
                            challengeDetailFragment.setArguments(bundle2);
                        }
                        findFragmentByTag = challengeDetailFragment;
                    }
                    findFragmentByTag.setUserVisibleHint(true);
                    beginTransaction.replace(C0906R.id.y9, findFragmentByTag, "challenge_detail_fragment_tag");
                    beginTransaction.commit();
                }
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", false);
    }

    @JvmStatic
    @JvmOverloads
    public static final void a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2}, null, f35486b, true, 26037, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2}, null, f35486b, true, 26037, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        f35487c.a(context, str, str2, 0, false);
    }
}
