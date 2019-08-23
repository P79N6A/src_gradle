package com.ss.android.ugc.aweme.challenge.ui.header;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.CommerceChallengeBanner;
import com.ss.android.ugc.aweme.discover.model.InquiryStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000eH\u0016J\u0018\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0018H\u0016J\u001a\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020)H\u0002J\u001c\u0010-\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010+H\u0002J\u0012\u0010/\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u001a\u00100\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020+H\u0002J\b\u00105\u001a\u00020\"H\u0002J\u0010\u00106\u001a\u00020\"2\u0006\u00104\u001a\u00020+H\u0002J\u0010\u00107\u001a\u00020\"2\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\"H\u0002J\b\u0010;\u001a\u00020\"H\u0002J\b\u0010<\u001a\u00020\"H\u0002J\b\u0010=\u001a\u00020\"H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/header/CommerceHeaderDelegate;", "Lcom/ss/android/ugc/aweme/challenge/ui/header/IHeaderDelegate;", "()V", "mBannerContainer", "Landroid/view/View;", "mBannerContainerVs", "Landroid/view/ViewStub;", "mBannerRiv", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mChallenge", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "getMChallenge", "()Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "mChallengeDetail", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "mContext", "Landroid/content/Context;", "mDisclaimerContainer", "mDisclaimerContainerVs", "mDisclaimerContent", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mDisclaimerDivider", "mDisclaimerTitle", "mHeaderParam", "Lcom/ss/android/ugc/aweme/challenge/ui/header/HeaderParam;", "mLinkContainer", "mLinkContainerVs", "mLinkTv", "mTransformButtonI18n", "mTransformContainer", "mTransformIv", "Lcom/ss/android/ugc/aweme/music/ui/CheckableImageView;", "mTransformTv", "bindData", "", "data", "initView", "root", "Landroid/widget/FrameLayout;", "headerParam", "openAdOpenUrl", "", "url", "", "prevent", "openAdWebUrl", "title", "openGpByUrl", "openMiniApp", "extraParams", "Lcom/ss/android/ugc/aweme/miniapp_api/model/ExtraParams;", "sendBannerEvent", "event", "sendClickVariableButtonEvent", "sendLinkEvent", "setHeaderAlpha", "alpha", "", "updateBanner", "updateDisclaimer", "updateLink", "updateTransform", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35648a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f35649c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    Context f35650b;

    /* renamed from: d  reason: collision with root package name */
    private View f35651d;

    /* renamed from: e  reason: collision with root package name */
    private CheckableImageView f35652e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f35653f;
    private DmtTextView g;
    private ViewStub h;
    private View i;
    private RemoteImageView j;
    private ViewStub k;
    private View l;
    private DmtTextView m;
    private ViewStub n;
    private View o;
    private DmtTextView p;
    private DmtTextView q;
    private View r;
    private j s;
    private ChallengeDetail t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/header/CommerceHeaderDelegate$Companion;", "", "()V", "hasTransform", "", "data", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35654a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final boolean a(@NotNull ChallengeDetail challengeDetail) {
            ChallengeDetail challengeDetail2 = challengeDetail;
            if (PatchProxy.isSupport(new Object[]{challengeDetail2}, this, f35654a, false, 26376, new Class[]{ChallengeDetail.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{challengeDetail2}, this, f35654a, false, 26376, new Class[]{ChallengeDetail.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(challengeDetail2, "data");
            Challenge challenge = challengeDetail2.challenge;
            if (challenge != null) {
                InquiryStruct inquiryStruct = challenge.inquiryStruct;
                if (inquiryStruct != null) {
                    if ((b.a(inquiryStruct.getOpenUrl()) || b.a(inquiryStruct.getWebUrl())) && b.a(inquiryStruct.getDesc())) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35655a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f35656b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommerceChallengeBanner f35657c;

        b(i iVar, CommerceChallengeBanner commerceChallengeBanner) {
            this.f35656b = iVar;
            this.f35657c = commerceChallengeBanner;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35655a, false, 26377, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35655a, false, 26377, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f35656b.a("banner_click");
            if (!this.f35656b.a(this.f35657c.getOpenUrl(), false)) {
                this.f35656b.a(this.f35657c.getWebUrl(), "");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35658a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f35659b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IMiniAppService f35660c;

        c(i iVar, IMiniAppService iMiniAppService) {
            this.f35659b = iVar;
            this.f35660c = iMiniAppService;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35658a, false, 26378, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35658a, false, 26378, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f35659b.b("click_link");
            if (this.f35659b.a().isLinkActionAsOpenUrl()) {
                i iVar = this.f35659b;
                String linkAction = this.f35659b.a().getLinkAction();
                Intrinsics.checkExpressionValueIsNotNull(linkAction, "mChallenge.linkAction");
                iVar.a(StringsKt.replace$default(linkAction, "aweme://", "sslocal://", false, 4, (Object) null), true);
            } else if (com.ss.android.g.a.a() || !this.f35660c.isAppBrandSchema(this.f35659b.a().getLinkAction())) {
                this.f35659b.a(this.f35659b.a().getLinkAction(), this.f35659b.a().getLinkTitle());
            } else {
                i iVar2 = this.f35659b;
                String linkAction2 = this.f35659b.a().getLinkAction();
                com.ss.android.ugc.aweme.miniapp_api.model.b a2 = new b.a().b("challenge").a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "ExtraParams.Builder().en….Label.CHALLENGE).build()");
                if (PatchProxy.isSupport(new Object[]{linkAction2, a2}, iVar2, i.f35648a, false, 26371, new Class[]{String.class, com.ss.android.ugc.aweme.miniapp_api.model.b.class}, Boolean.TYPE)) {
                    i iVar3 = iVar2;
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{linkAction2, a2}, iVar3, i.f35648a, false, 26371, new Class[]{String.class, com.ss.android.ugc.aweme.miniapp_api.model.b.class}, Boolean.TYPE)).booleanValue();
                } else {
                    IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
                    Context context = iVar2.f35650b;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    }
                    iMiniAppService.openMiniApp(context, linkAction2, a2);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f35662b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35663c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f35664d;

        d(i iVar, String str, String str2) {
            this.f35662b = iVar;
            this.f35663c = str;
            this.f35664d = str2;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35661a, false, 26379, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35661a, false, 26379, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f35662b.b();
            if (!this.f35662b.a(this.f35663c, false)) {
                this.f35662b.a(this.f35664d, "");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f35666b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f35668d;

        e(i iVar, String str, String str2) {
            this.f35666b = iVar;
            this.f35667c = str;
            this.f35668d = str2;
        }

        public final void onClick(View view) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{view}, this, f35665a, false, 26380, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35665a, false, 26380, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            i iVar = this.f35666b;
            String str = this.f35667c;
            if (PatchProxy.isSupport(new Object[]{str}, iVar, i.f35648a, false, 26368, new Class[]{String.class}, Boolean.TYPE)) {
                Object[] objArr = {str};
                i iVar2 = iVar;
                z = ((Boolean) PatchProxy.accessDispatch(objArr, iVar2, i.f35648a, false, 26368, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else {
                Context context = iVar.f35650b;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                z = g.a(context, str);
            }
            if (z || this.f35666b.a(this.f35667c, true) || this.f35666b.a(this.f35668d, "")) {
                this.f35666b.b();
            }
        }
    }

    public final boolean a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f35648a, false, 26369, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f35648a, false, 26369, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Context context = this.f35650b;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return g.a(context, str2, z);
    }

    public final Challenge a() {
        if (PatchProxy.isSupport(new Object[0], this, f35648a, false, 26360, new Class[0], Challenge.class)) {
            return (Challenge) PatchProxy.accessDispatch(new Object[0], this, f35648a, false, 26360, new Class[0], Challenge.class);
        }
        ChallengeDetail challengeDetail = this.t;
        if (challengeDetail == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChallengeDetail");
        }
        Challenge challenge = challengeDetail.challenge;
        Intrinsics.checkExpressionValueIsNotNull(challenge, "mChallengeDetail.challenge");
        return challenge;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35648a, false, 26372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35648a, false, 26372, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("tag_id", a().getCid());
        j jVar = this.s;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderParam");
        }
        r.a("click_variable_button", (Map) a2.a("enter_from", jVar.f35673e).a("page_type", "challenge").f34114b);
    }

    public final void a(float f2) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f35648a, false, 26363, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f35648a, false, 26363, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        DmtTextView dmtTextView = this.m;
        if (dmtTextView != null) {
            if (((double) f2) > 0.9d) {
                z = false;
            }
            dmtTextView.setClickable(z);
        }
    }

    public final void b(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f35648a, false, 26374, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, this, f35648a, false, 26374, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName(str3).setLabelName("challenge").setValue(a().getCid()).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("link_type", "web_link").b()));
        User author = a().getAuthor();
        if (author != null) {
            str2 = author.getUid();
        } else {
            str2 = "";
        }
        r.a(str3, (Map) com.ss.android.ugc.aweme.app.d.d.a().a("author_id", str2).a("tag_id", a().getCid()).a("link_type", "web_link").a("enter_from", "challenge").f34114b);
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f35648a, false, 26373, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f35648a, false, 26373, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a(str2, (Map) com.ss.android.ugc.aweme.app.d.d.a().a("tag_id", a().getCid()).a("enter_from", "challenge").f34114b);
    }

    public final void a(@NotNull ChallengeDetail challengeDetail) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{challengeDetail}, this, f35648a, false, 26362, new Class[]{ChallengeDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challengeDetail}, this, f35648a, false, 26362, new Class[]{ChallengeDetail.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(challengeDetail, "data");
        this.t = challengeDetail;
        if (PatchProxy.isSupport(new Object[0], this, f35648a, false, 26364, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35648a, false, 26364, new Class[0], Void.TYPE);
        } else {
            View view = this.f35651d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTransformContainer");
            }
            view.setVisibility(8);
            DmtTextView dmtTextView = this.g;
            if (dmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTransformButtonI18n");
            }
            dmtTextView.setVisibility(8);
            a aVar = f35649c;
            ChallengeDetail challengeDetail2 = this.t;
            if (challengeDetail2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChallengeDetail");
            }
            if (aVar.a(challengeDetail2)) {
                InquiryStruct inquiryStruct = a().inquiryStruct;
                if (inquiryStruct != null) {
                    String desc = inquiryStruct.getDesc();
                    String openUrl = inquiryStruct.getOpenUrl();
                    String webUrl = inquiryStruct.getWebUrl();
                    if (!com.ss.android.g.a.a()) {
                        CheckableImageView checkableImageView = this.f35652e;
                        if (checkableImageView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mTransformIv");
                        }
                        com.ss.android.ugc.aweme.base.c.b(checkableImageView, inquiryStruct.getIcon());
                        DmtTextView dmtTextView2 = this.f35653f;
                        if (dmtTextView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mTransformTv");
                        }
                        dmtTextView2.setText(desc);
                        View view2 = this.f35651d;
                        if (view2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mTransformContainer");
                        }
                        view2.setOnClickListener(new d(this, openUrl, webUrl));
                        View view3 = this.f35651d;
                        if (view3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mTransformContainer");
                        }
                        view3.setVisibility(0);
                    } else {
                        DmtTextView dmtTextView3 = this.g;
                        if (dmtTextView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mTransformButtonI18n");
                        }
                        dmtTextView3.setText(desc);
                        DmtTextView dmtTextView4 = this.g;
                        if (dmtTextView4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mTransformButtonI18n");
                        }
                        dmtTextView4.setOnClickListener(new e(this, openUrl, webUrl));
                        DmtTextView dmtTextView5 = this.g;
                        if (dmtTextView5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mTransformButtonI18n");
                        }
                        dmtTextView5.setVisibility(0);
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f35648a, false, 26365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35648a, false, 26365, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.commercialize.utils.c.a(a())) {
            View view4 = this.o;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        } else {
            ViewStub viewStub = this.n;
            if (viewStub == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisclaimerContainerVs");
            }
            if (this.o == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                viewStub = null;
            }
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                this.p = (DmtTextView) inflate.findViewById(C0906R.id.wr);
                this.q = (DmtTextView) inflate.findViewById(C0906R.id.wq);
                this.r = inflate.findViewById(C0906R.id.bbt);
                this.o = inflate;
            }
            DmtTextView dmtTextView6 = this.p;
            if (dmtTextView6 == null) {
                Intrinsics.throwNpe();
            }
            dmtTextView6.setText(com.ss.android.ugc.aweme.commercialize.utils.c.b(a()));
            Context context = this.f35650b;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            dmtTextView6.setCompoundDrawablePadding((int) UIUtils.dip2Px(context, 8.0f));
            DmtTextView dmtTextView7 = this.q;
            if (dmtTextView7 == null) {
                Intrinsics.throwNpe();
            }
            dmtTextView7.setText(com.ss.android.ugc.aweme.commercialize.utils.c.c(a()));
            ViewGroup.LayoutParams layoutParams = dmtTextView7.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Context context2 = this.f35650b;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                marginLayoutParams.leftMargin = (int) UIUtils.dip2Px(context2, 18.0f);
                View view5 = this.r;
                if (view5 != null) {
                    if (com.ss.android.ugc.aweme.commercialize.utils.c.d(a())) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view5.setVisibility(i2);
                }
                View view6 = this.o;
                if (view6 == null) {
                    Intrinsics.throwNpe();
                }
                view6.setVisibility(0);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f35648a, false, 26366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35648a, false, 26366, new Class[0], Void.TYPE);
        } else {
            View view7 = this.i;
            if (view7 != null) {
                view7.setVisibility(8);
            }
            List<CommerceChallengeBanner> list = a().commerceChallengeBannerList;
            if (list != null) {
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    ViewStub viewStub2 = this.h;
                    if (viewStub2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBannerContainerVs");
                    }
                    if (this.i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        viewStub2 = null;
                    }
                    if (viewStub2 != null) {
                        View inflate2 = viewStub2.inflate();
                        this.j = (RemoteImageView) inflate2.findViewById(C0906R.id.w5);
                        this.i = inflate2;
                    }
                    CommerceChallengeBanner commerceChallengeBanner = list.get(0);
                    com.ss.android.ugc.aweme.base.c.b(this.j, commerceChallengeBanner.getIcon());
                    RemoteImageView remoteImageView = this.j;
                    if (remoteImageView == null) {
                        Intrinsics.throwNpe();
                    }
                    remoteImageView.setOnClickListener(new b(this, commerceChallengeBanner));
                    View view8 = this.i;
                    if (view8 == null) {
                        Intrinsics.throwNpe();
                    }
                    view8.setVisibility(0);
                    a("banner_show");
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f35648a, false, 26367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35648a, false, 26367, new Class[0], Void.TYPE);
            return;
        }
        IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
        if (!com.ss.android.ugc.aweme.commercialize.utils.c.d(a())) {
            View view9 = this.l;
            if (view9 != null) {
                view9.setVisibility(8);
            }
        } else {
            ViewStub viewStub3 = this.k;
            if (viewStub3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLinkContainerVs");
            }
            if (this.l != null) {
                z3 = false;
            }
            if (!z3) {
                viewStub3 = null;
            }
            if (viewStub3 != null) {
                View inflate3 = viewStub3.inflate();
                this.m = (DmtTextView) inflate3.findViewById(C0906R.id.f4432dmt);
                this.l = inflate3;
            }
            DmtTextView dmtTextView8 = this.m;
            if (dmtTextView8 == null) {
                Intrinsics.throwNpe();
            }
            dmtTextView8.setOnClickListener(new c(this, iMiniAppService));
            DmtTextView dmtTextView9 = this.m;
            if (dmtTextView9 == null) {
                Intrinsics.throwNpe();
            }
            dmtTextView9.setText(a().getLinkText());
            View view10 = this.l;
            if (view10 == null) {
                Intrinsics.throwNpe();
            }
            view10.setVisibility(0);
            b("show_link");
        }
    }

    public final void a(@NotNull FrameLayout frameLayout, @NotNull j jVar) {
        if (PatchProxy.isSupport(new Object[]{frameLayout, jVar}, this, f35648a, false, 26361, new Class[]{FrameLayout.class, j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{frameLayout, jVar}, this, f35648a, false, 26361, new Class[]{FrameLayout.class, j.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(frameLayout, "root");
        Intrinsics.checkParameterIsNotNull(jVar, "headerParam");
        Context context = frameLayout.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "root.context");
        this.f35650b = context;
        this.s = jVar;
        View findViewById = frameLayout.findViewById(C0906R.id.d6a);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "root.findViewById(R.id.transform_container)");
        this.f35651d = findViewById;
        View findViewById2 = frameLayout.findViewById(C0906R.id.d6_);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "root.findViewById(R.id.transform_button_i18n)");
        this.g = (DmtTextView) findViewById2;
        View findViewById3 = frameLayout.findViewById(C0906R.id.b68);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "root.findViewById(R.id.iv_transform)");
        this.f35652e = (CheckableImageView) findViewById3;
        View findViewById4 = frameLayout.findViewById(C0906R.id.dl4);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "root.findViewById(R.id.tv_transform)");
        this.f35653f = (DmtTextView) findViewById4;
        View findViewById5 = frameLayout.findViewById(C0906R.id.dvp);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "root.findViewById(R.id.v…rce_disclaimer_container)");
        this.n = (ViewStub) findViewById5;
        View findViewById6 = frameLayout.findViewById(C0906R.id.dvo);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "root.findViewById(R.id.v…ommerce_banner_container)");
        this.h = (ViewStub) findViewById6;
        View findViewById7 = frameLayout.findViewById(C0906R.id.dvq);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "root.findViewById(R.id.vs_commerce_link_container)");
        this.k = (ViewStub) findViewById7;
    }

    public final boolean a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f35648a, false, 26370, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f35648a, false, 26370, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        Context context = this.f35650b;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return g.a(context, str3, str4);
    }
}
