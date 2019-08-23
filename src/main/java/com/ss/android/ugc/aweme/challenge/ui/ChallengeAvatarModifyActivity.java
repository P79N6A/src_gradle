package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.presenter.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeAvatarModifyActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "Lcom/ss/android/ugc/aweme/profile/presenter/IAvatarView;", "()V", "mAvatarPresenter", "Lcom/ss/android/ugc/aweme/profile/presenter/AvatarPresenter;", "mChallenge", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "mTitleBar", "Lcom/bytedance/ies/dmt/ui/titlebar/TextTitleBar;", "mUploadBtn", "Landroid/view/View;", "initView", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onAvatarUploadFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onAvatarUploadSuccess", "avatarUri", "Lcom/ss/android/ugc/aweme/profile/model/AvatarUri;", "onChooseAvatarFailed", "onChooseAvatarSuccess", "filePath", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ChallengeAvatarModifyActivity extends AmeSSActivity implements l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35475a;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, Boolean> f35476d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static final a f35477e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.profile.presenter.a f35478b;

    /* renamed from: c  reason: collision with root package name */
    public Challenge f35479c;

    /* renamed from: f  reason: collision with root package name */
    private TextTitleBar f35480f;
    private View g;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R-\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeAvatarModifyActivity$Companion;", "", "()V", "EXTRA_CHALLENGE_INFO", "", "hasUploadMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getHasUploadMap", "()Ljava/util/HashMap;", "startActivity", "", "activity", "Landroid/app/Activity;", "challenge", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "fragment", "Landroid/support/v4/app/Fragment;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35481a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/challenge/ui/ChallengeAvatarModifyActivity$initView$1", "Lcom/bytedance/ies/dmt/ui/titlebar/listener/OnTitleBarClickListener;", "onBackClick", "", "view", "Landroid/view/View;", "onEndBtnClick", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35482a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChallengeAvatarModifyActivity f35483b;

        public final void b(@Nullable View view) {
        }

        b(ChallengeAvatarModifyActivity challengeAvatarModifyActivity) {
            this.f35483b = challengeAvatarModifyActivity;
        }

        public final void a(@Nullable View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35482a, false, 26018, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35482a, false, 26018, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f35483b.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChallengeAvatarModifyActivity f35485b;

        c(ChallengeAvatarModifyActivity challengeAvatarModifyActivity) {
            this.f35485b = challengeAvatarModifyActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35484a, false, 26019, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35484a, false, 26019, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (!TextUtils.isEmpty(ChallengeAvatarModifyActivity.a(this.f35485b).getChallengeProfileUrl())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.f35485b, (int) C0906R.string.alk).a();
            } else if (Intrinsics.areEqual((Object) ChallengeAvatarModifyActivity.f35476d.get(ChallengeAvatarModifyActivity.a(this.f35485b).getCid()), (Object) Boolean.TRUE) || !ChallengeAvatarModifyActivity.a(this.f35485b).allowUploadCover()) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.f35485b, (int) C0906R.string.alm).a();
            } else {
                com.ss.android.ugc.aweme.profile.presenter.a aVar = this.f35485b.f35478b;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAvatarPresenter");
                }
                aVar.a(5);
            }
        }
    }

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35475a, false, 26012, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35475a, false, 26012, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.h == null) {
            this.h = new HashMap();
        }
        View view = (View) this.h.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f35475a, false, 26014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35475a, false, 26014, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35475a, false, 26015, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35475a, false, 26015, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final /* synthetic */ Challenge a(ChallengeAvatarModifyActivity challengeAvatarModifyActivity) {
        Challenge challenge = challengeAvatarModifyActivity.f35479c;
        if (challenge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
        }
        return challenge;
    }

    public final void a(@NotNull AvatarUri avatarUri) {
        if (PatchProxy.isSupport(new Object[]{avatarUri}, this, f35475a, false, 26009, new Class[]{AvatarUri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarUri}, this, f35475a, false, 26009, new Class[]{AvatarUri.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(avatarUri, "avatarUri");
        if (isViewValid()) {
            com.ss.android.ugc.aweme.profile.presenter.a aVar = this.f35478b;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAvatarPresenter");
            }
            aVar.c();
            Map map = f35476d;
            Challenge challenge = this.f35479c;
            if (challenge == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
            }
            String cid = challenge.getCid();
            Intrinsics.checkExpressionValueIsNotNull(cid, "mChallenge.cid");
            map.put(cid, Boolean.TRUE);
            View view = this.g;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadBtn");
            }
            view.setAlpha(0.5f);
            com.bytedance.ies.dmt.ui.d.a.a((Context) this, (int) C0906R.string.alo).a();
        }
    }

    public final void a(@NotNull Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f35475a, false, 26010, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f35475a, false, 26010, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc, "e");
        if (isViewValid()) {
            com.ss.android.ugc.aweme.profile.presenter.a aVar = this.f35478b;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAvatarPresenter");
            }
            aVar.c();
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.dox).a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f35475a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26006(0x6596, float:3.6442E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f35475a
            r3 = 0
            r4 = 26006(0x6596, float:3.6442E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r7)
            super.onCreate(r10)
            r0 = 2131689566(0x7f0f005e, float:1.900815E38)
            r9.setContentView((int) r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f35475a
            r3 = 0
            r4 = 26007(0x6597, float:3.6444E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0063
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f35475a
            r3 = 0
            r4 = 26007(0x6597, float:3.6444E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0133
        L_0x0063:
            r0 = 2131170418(0x7f071472, float:1.7955194E38)
            android.view.View r0 = r9.a((int) r0)
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r0 = (com.bytedance.ies.dmt.ui.titlebar.TextTitleBar) r0
            java.lang.String r1 = "title_bar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r9.f35480f = r0
            r0 = 2131171105(0x7f071721, float:1.7956587E38)
            android.view.View r0 = r9.a((int) r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "tv_upload_avatar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.view.View r0 = (android.view.View) r0
            r9.g = r0
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = "challenge_info"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            if (r0 == 0) goto L_0x013b
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = (com.ss.android.ugc.aweme.discover.model.Challenge) r0
            r9.f35479c = r0
            android.view.View r0 = r9.g
            if (r0 != 0) goto L_0x009e
            java.lang.String r1 = "mUploadBtn"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x009e:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = f35476d
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r9.f35479c
            if (r2 != 0) goto L_0x00a9
            java.lang.String r3 = "mChallenge"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00a9:
            java.lang.String r2 = r2.getCid()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r1 = r1 ^ r7
            if (r1 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r9.f35479c
            if (r1 != 0) goto L_0x00c5
            java.lang.String r2 = "mChallenge"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00c5:
            boolean r1 = r1.allowUploadCover()
            if (r1 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r9.f35479c
            if (r1 != 0) goto L_0x00d4
            java.lang.String r2 = "mChallenge"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00d4:
            java.lang.String r1 = r1.getChallengeProfileUrl()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00e3
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00e5
        L_0x00e3:
            r1 = 1056964608(0x3f000000, float:0.5)
        L_0x00e5:
            r0.setAlpha(r1)
            com.ss.android.ugc.aweme.profile.presenter.a r0 = new com.ss.android.ugc.aweme.profile.presenter.a
            r0.<init>()
            r9.f35478b = r0
            com.ss.android.ugc.aweme.profile.presenter.a r0 = r9.f35478b
            if (r0 != 0) goto L_0x00f8
            java.lang.String r1 = "mAvatarPresenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00f8:
            r1 = r9
            com.ss.android.ugc.aweme.profile.presenter.l r1 = (com.ss.android.ugc.aweme.profile.presenter.l) r1
            r0.f61562c = r1
            com.ss.android.ugc.aweme.profile.presenter.a r0 = r9.f35478b
            if (r0 != 0) goto L_0x0106
            java.lang.String r1 = "mAvatarPresenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0106:
            r1 = r9
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = 0
            r0.a((android.app.Activity) r1, (android.support.v4.app.Fragment) r2)
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r0 = r9.f35480f
            if (r0 != 0) goto L_0x0116
            java.lang.String r1 = "mTitleBar"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0116:
            com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$b r1 = new com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$b
            r1.<init>(r9)
            com.bytedance.ies.dmt.ui.titlebar.a.a r1 = (com.bytedance.ies.dmt.ui.titlebar.a.a) r1
            r0.setOnTitleBarClickListener(r1)
            android.view.View r0 = r9.g
            if (r0 != 0) goto L_0x0129
            java.lang.String r1 = "mUploadBtn"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0129:
            com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$c r1 = new com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$c
            r1.<init>(r9)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x0133:
            java.lang.String r0 = "com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            return
        L_0x013b:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.Challenge"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity.onCreate(android.os.Bundle):void");
    }

    public final void a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f35475a, false, 26011, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f35475a, false, 26011, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "filePath");
        if (isViewValid()) {
            e[] eVarArr = new e[2];
            Challenge challenge = this.f35479c;
            if (challenge == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
            }
            eVarArr[0] = new e("challenge_id", challenge.getCid());
            eVarArr[1] = new e("source", PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION);
            List mutableListOf = CollectionsKt.mutableListOf(eVarArr);
            com.ss.android.ugc.aweme.profile.presenter.a aVar = this.f35478b;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAvatarPresenter");
            }
            aVar.a(str, mutableListOf);
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f35475a, false, 26008, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f35475a, false, 26008, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        com.ss.android.ugc.aweme.profile.presenter.a aVar = this.f35478b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatarPresenter");
        }
        aVar.a(i, i2, intent2);
    }
}
