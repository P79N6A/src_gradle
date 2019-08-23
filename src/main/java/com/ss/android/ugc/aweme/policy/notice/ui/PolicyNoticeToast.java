package com.ss.android.ugc.aweme.policy.notice.ui;

import a.g;
import a.i;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi;
import com.ss.android.ugc.aweme.policy.notice.b.a;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u001a\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0011J\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0011J\b\u0010!\u001a\u00020\u0014H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/policy/notice/ui/PolicyNoticeToast;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isInit", "", "mButton1", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mButton2", "mContent", "mLine", "mNext", "Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNotice;", "mPolicyNotice", "hide", "", "init", "setButton", "button", "policyNoticeAction", "Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeAction;", "setContent", "body", "", "setNext", "privacyNotice", "setValues", "policyNotice", "show", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PolicyNoticeToast extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61099a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.policy.notice.api.a f61100b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.policy.notice.api.a f61101c;

    /* renamed from: d  reason: collision with root package name */
    private DmtTextView f61102d;

    /* renamed from: e  reason: collision with root package name */
    private DmtTextView f61103e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f61104f;
    private DmtTextView g;
    private boolean h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PolicyNoticeToast f61106b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.policy.notice.api.b f61107c;

        a(PolicyNoticeToast policyNoticeToast, com.ss.android.ugc.aweme.policy.notice.api.b bVar) {
            this.f61106b = policyNoticeToast;
            this.f61107c = bVar;
        }

        public final void onClick(View view) {
            Object value;
            if (PatchProxy.isSupport(new Object[]{view}, this, f61105a, false, 67114, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f61105a, false, 67114, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            String str = this.f61107c.f61092d;
            int hashCode = str.hashCode();
            if (hashCode != -1052618729) {
                if (hashCode != -172220347) {
                    if (hashCode == 3277 && str.equals("h5")) {
                        Intent intent = new Intent(this.f61106b.getContext(), CrossPlatformActivity.class);
                        intent.setData(Uri.parse(this.f61107c.f61093e));
                        this.f61106b.getContext().startActivity(intent);
                    }
                } else if (str.equals("callback")) {
                    com.ss.android.ugc.aweme.policy.notice.b.a aVar = new com.ss.android.ugc.aweme.policy.notice.b.a();
                    String str2 = PolicyNoticeToast.a(this.f61106b).f61084b;
                    String str3 = PolicyNoticeToast.a(this.f61106b).f61085c;
                    String str4 = PolicyNoticeToast.a(this.f61106b).f61086d;
                    String str5 = this.f61107c.f61094f;
                    if (PatchProxy.isSupport(new Object[]{str2, str3, str4, str5}, aVar, com.ss.android.ugc.aweme.policy.notice.b.a.f61095a, false, 67084, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.policy.notice.b.a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{str2, str3, str4, str5}, aVar2, com.ss.android.ugc.aweme.policy.notice.b.a.f61095a, false, 67084, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE);
                    } else {
                        if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.policy.notice.b.a.f61095a, false, 67082, new Class[0], PolicyNoticeApi.API.class)) {
                            value = PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.policy.notice.b.a.f61095a, false, 67082, new Class[0], PolicyNoticeApi.API.class);
                        } else {
                            value = aVar.f61097c.getValue();
                        }
                        ((PolicyNoticeApi.API) value).policyNoticeApprove(str2, str3, str4, str5).a((g<TResult, TContinuationResult>) a.b.f61098a, i.f1052b);
                    }
                    if (this.f61106b.f61101c != null) {
                        com.ss.android.ugc.aweme.policy.notice.api.a aVar3 = this.f61106b.f61101c;
                        if (aVar3 == null) {
                            Intrinsics.throwNpe();
                        }
                        bg.a(new com.ss.android.ugc.aweme.policy.notice.a.b(aVar3));
                    } else {
                        bg.a(new com.ss.android.ugc.aweme.policy.notice.a.a());
                    }
                    PolicyNoticeToast policyNoticeToast = this.f61106b;
                    if (PatchProxy.isSupport(new Object[0], policyNoticeToast, PolicyNoticeToast.f61099a, false, 67109, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], policyNoticeToast, PolicyNoticeToast.f61099a, false, 67109, new Class[0], Void.TYPE);
                        return;
                    }
                    policyNoticeToast.setVisibility(8);
                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                    animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) policyNoticeToast.getHeight()));
                    animationSet.setDuration(300);
                    policyNoticeToast.startAnimation(animationSet);
                }
            } else if (str.equals("native")) {
                h.a().a(j.a(this.f61107c.f61093e).a());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61108a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PolicyNoticeToast f61109b;

        b(PolicyNoticeToast policyNoticeToast) {
            this.f61109b = policyNoticeToast;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f61108a, false, 67115, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61108a, false, 67115, new Class[0], Void.TYPE);
                return;
            }
            PolicyNoticeToast policyNoticeToast = this.f61109b;
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, (float) this.f61109b.getHeight(), 0.0f));
            animationSet.setDuration(300);
            policyNoticeToast.startAnimation(animationSet);
            this.f61109b.setVisibility(0);
        }
    }

    @JvmOverloads
    public PolicyNoticeToast(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PolicyNoticeToast(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61099a, false, 67107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61099a, false, 67107, new Class[0], Void.TYPE);
        } else if (!this.h) {
            this.h = true;
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.ae5, null);
            View findViewById = inflate.findViewById(C0906R.id.da0);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.tv_content)");
            this.f61102d = (DmtTextView) findViewById;
            View findViewById2 = inflate.findViewById(C0906R.id.pi);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.button1)");
            this.f61103e = (DmtTextView) findViewById2;
            View findViewById3 = inflate.findViewById(C0906R.id.pj);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.button2)");
            this.f61104f = (DmtTextView) findViewById3;
            View findViewById4 = inflate.findViewById(C0906R.id.dds);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.tv_line)");
            this.g = (DmtTextView) findViewById4;
            addView(inflate);
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.policy.notice.api.a a(PolicyNoticeToast policyNoticeToast) {
        com.ss.android.ugc.aweme.policy.notice.api.a aVar = policyNoticeToast.f61100b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPolicyNotice");
        }
        return aVar;
    }

    private final void setContent(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f61099a, false, 67110, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f61099a, false, 67110, new Class[]{String.class}, Void.TYPE);
            return;
        }
        DmtTextView dmtTextView = this.f61102d;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContent");
        }
        dmtTextView.setFontType(c.f20595b);
        DmtTextView dmtTextView2 = this.f61102d;
        if (dmtTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContent");
        }
        dmtTextView2.setText(str);
    }

    public final void setNext(@NotNull com.ss.android.ugc.aweme.policy.notice.api.a aVar) {
        com.ss.android.ugc.aweme.policy.notice.api.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f61099a, false, 67105, new Class[]{com.ss.android.ugc.aweme.policy.notice.api.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f61099a, false, 67105, new Class[]{com.ss.android.ugc.aweme.policy.notice.api.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "privacyNotice");
        a();
        this.f61101c = aVar2;
    }

    public final void setValues(@NotNull com.ss.android.ugc.aweme.policy.notice.api.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f61099a, false, 67106, new Class[]{com.ss.android.ugc.aweme.policy.notice.api.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f61099a, false, 67106, new Class[]{com.ss.android.ugc.aweme.policy.notice.api.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "policyNotice");
        a();
        this.f61100b = aVar;
        com.ss.android.ugc.aweme.policy.notice.api.a aVar2 = this.f61100b;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPolicyNotice");
        }
        setContent(aVar2.f61088f);
        DmtTextView dmtTextView = this.f61103e;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mButton1");
        }
        com.ss.android.ugc.aweme.policy.notice.api.a aVar3 = this.f61100b;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPolicyNotice");
        }
        a(dmtTextView, aVar3.g.get(0));
        com.ss.android.ugc.aweme.policy.notice.api.a aVar4 = this.f61100b;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPolicyNotice");
        }
        if (aVar4.g.size() > 1) {
            DmtTextView dmtTextView2 = this.g;
            if (dmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLine");
            }
            dmtTextView2.setVisibility(0);
            DmtTextView dmtTextView3 = this.f61104f;
            if (dmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mButton2");
            }
            dmtTextView3.setVisibility(0);
            DmtTextView dmtTextView4 = this.f61104f;
            if (dmtTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mButton2");
            }
            com.ss.android.ugc.aweme.policy.notice.api.a aVar5 = this.f61100b;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPolicyNotice");
            }
            a(dmtTextView4, aVar5.g.get(1));
        } else {
            DmtTextView dmtTextView5 = this.g;
            if (dmtTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLine");
            }
            dmtTextView5.setVisibility(8);
            DmtTextView dmtTextView6 = this.f61104f;
            if (dmtTextView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mButton2");
            }
            dmtTextView6.setVisibility(8);
        }
        if (PatchProxy.isSupport(new Object[0], this, f61099a, false, 67108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61099a, false, 67108, new Class[0], Void.TYPE);
            return;
        }
        setVisibility(4);
        post(new b(this));
    }

    private final void a(DmtTextView dmtTextView, com.ss.android.ugc.aweme.policy.notice.api.b bVar) {
        DmtTextView dmtTextView2 = dmtTextView;
        com.ss.android.ugc.aweme.policy.notice.api.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{dmtTextView2, bVar2}, this, f61099a, false, 67111, new Class[]{DmtTextView.class, com.ss.android.ugc.aweme.policy.notice.api.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dmtTextView2, bVar2}, this, f61099a, false, 67111, new Class[]{DmtTextView.class, com.ss.android.ugc.aweme.policy.notice.api.b.class}, Void.TYPE);
            return;
        }
        if (dmtTextView2 != null) {
            dmtTextView2.setText(bVar2.f61090b);
        }
        if (bVar2.f61091c) {
            if (dmtTextView2 != null) {
                dmtTextView2.setFontType(c.f20595b);
            }
            if (dmtTextView2 != null) {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                dmtTextView2.setTextColor(context.getResources().getColor(C0906R.color.a6j));
            }
        } else if (dmtTextView2 != null) {
            dmtTextView2.setFontType(c.f20594a);
        }
        if (dmtTextView2 != null) {
            dmtTextView2.setOnClickListener(new a(this, bVar2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PolicyNoticeToast(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PolicyNoticeToast(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
