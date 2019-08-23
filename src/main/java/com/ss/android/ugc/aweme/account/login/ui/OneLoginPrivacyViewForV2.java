package com.ss.android.ugc.aweme.account.login.ui;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.viewmodel.PrivacyAcceptViewModel;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\u0017J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\nH\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/ui/OneLoginPrivacyViewForV2;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isAcceptPrivacyAndTerm", "", "loginHintString", "", "privacyAcceptViewModel", "Lcom/ss/android/ugc/aweme/account/login/viewmodel/PrivacyAcceptViewModel;", "privacyCheck", "Landroid/widget/ImageView;", "shakeAnimation", "Landroid/view/animation/Animation;", "showCheckTip", "tipsPopupWindow", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView;", "dismissCheckTips", "", "isChecked", "setCarrier", "carrier", "showShouldCheckTips", "updateTermPrivacyStatus", "isAccepted", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class OneLoginPrivacyViewForV2 extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32494a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32495b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.ies.dmt.ui.a.b f32496c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f32497d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f32498e;

    /* renamed from: f  reason: collision with root package name */
    private Animation f32499f;
    private String g;
    private PrivacyAcceptViewModel h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/account/login/ui/OneLoginPrivacyViewForV2$setCarrier$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32504a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneLoginPrivacyViewForV2 f32505b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32506c;

        public final void updateDrawState(@NotNull TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f32504a, false, 20660, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f32504a, false, 20660, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(textPaint2, "ds");
            super.updateDrawState(textPaint);
            textPaint2.setColor(this.f32505b.getResources().getColor(C0906R.color.zn));
            textPaint2.setUnderlineText(false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0098  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(@org.jetbrains.annotations.NotNull android.view.View r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f32504a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 20659(0x50b3, float:2.895E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0030
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f32504a
                r3 = 0
                r4 = 20659(0x50b3, float:2.895E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0030:
                java.lang.String r0 = "widget"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r10.setTag(r0)
                java.lang.String r0 = r9.f32506c
                int r1 = r0.hashCode()
                r2 = -1429363305(0xffffffffaacda597, float:-3.6530216E-13)
                if (r1 == r2) goto L_0x0066
                r2 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
                if (r1 == r2) goto L_0x005b
                r2 = -840542575(0xffffffffcde65691, float:-4.83054112E8)
                if (r1 == r2) goto L_0x0050
                goto L_0x0071
            L_0x0050:
                java.lang.String r1 = "unicom"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0071
                java.lang.String r0 = "https://opencloud.wostore.cn/authz/resource/html/disclaimer.html?fromsdk=true"
                goto L_0x0073
            L_0x005b:
                java.lang.String r1 = "mobile"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0071
                java.lang.String r0 = "https://wap.cmpassport.com/resources/html/contract.html"
                goto L_0x0073
            L_0x0066:
                java.lang.String r1 = "telecom"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0071
                java.lang.String r0 = "https://e.189.cn/sdk/agreement/detail.do?hidetop=true"
                goto L_0x0073
            L_0x0071:
                java.lang.String r0 = ""
            L_0x0073:
                java.lang.String r1 = r9.f32506c
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.String r2 = "unicom"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 != 0) goto L_0x0098
                java.lang.Class<com.ss.android.ugc.aweme.main.h.v> r1 = com.ss.android.ugc.aweme.main.h.v.class
                java.lang.Object r1 = com.ss.android.ugc.aweme.w.a((java.lang.Class<T>) r1)
                com.ss.android.ugc.aweme.main.h.v r1 = (com.ss.android.ugc.aweme.main.h.v) r1
                android.app.Application r2 = com.ss.android.ugc.aweme.w.b()
                java.lang.String r3 = "ModuleStore.getApplication()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                android.content.Context r2 = (android.content.Context) r2
                r1.a((android.content.Context) r2, (java.lang.String) r0, (boolean) r7)
                return
            L_0x0098:
                java.lang.Class<com.ss.android.ugc.aweme.main.h.v> r1 = com.ss.android.ugc.aweme.main.h.v.class
                java.lang.Object r1 = com.ss.android.ugc.aweme.w.a((java.lang.Class<T>) r1)
                com.ss.android.ugc.aweme.main.h.v r1 = (com.ss.android.ugc.aweme.main.h.v) r1
                android.app.Application r2 = com.ss.android.ugc.aweme.w.b()
                java.lang.String r3 = "ModuleStore.getApplication()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                android.content.Context r2 = (android.content.Context) r2
                r3 = -1
                r1.a(r2, r0, r7, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.OneLoginPrivacyViewForV2.a.onClick(android.view.View):void");
        }

        a(OneLoginPrivacyViewForV2 oneLoginPrivacyViewForV2, String str) {
            this.f32505b = oneLoginPrivacyViewForV2;
            this.f32506c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/account/login/ui/OneLoginPrivacyViewForV2$setCarrier$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32507a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneLoginPrivacyViewForV2 f32508b;

        b(OneLoginPrivacyViewForV2 oneLoginPrivacyViewForV2) {
            this.f32508b = oneLoginPrivacyViewForV2;
        }

        public final void onClick(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f32507a, false, 20661, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f32507a, false, 20661, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "widget");
            view2.setTag(Boolean.TRUE);
            Application b2 = w.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ModuleStore.getApplication()");
            ((v) w.a(v.class)).a((Context) b2, "https://www.douyin.com/falcon/douyin_falcon/user_agreement/", true);
        }

        public final void updateDrawState(@NotNull TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f32507a, false, 20662, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f32507a, false, 20662, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(textPaint2, "ds");
            super.updateDrawState(textPaint);
            textPaint2.setColor(this.f32508b.getResources().getColor(C0906R.color.zn));
            textPaint2.setUnderlineText(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/account/login/ui/OneLoginPrivacyViewForV2$setCarrier$3", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneLoginPrivacyViewForV2 f32510b;

        c(OneLoginPrivacyViewForV2 oneLoginPrivacyViewForV2) {
            this.f32510b = oneLoginPrivacyViewForV2;
        }

        public final void onClick(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f32509a, false, 20663, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f32509a, false, 20663, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "widget");
            view2.setTag(Boolean.TRUE);
            Application b2 = w.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ModuleStore.getApplication()");
            ((v) w.a(v.class)).a((Context) b2, "https://www.douyin.com/falcon/douyin_falcon/privacy_agreement/", true);
        }

        public final void updateDrawState(@NotNull TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f32509a, false, 20664, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f32509a, false, 20664, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(textPaint2, "ds");
            super.updateDrawState(textPaint);
            textPaint2.setColor(this.f32510b.getResources().getColor(C0906R.color.zn));
            textPaint2.setUnderlineText(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/account/login/ui/OneLoginPrivacyViewForV2$showShouldCheckTips$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class d implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32511a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneLoginPrivacyViewForV2 f32512b;

        public final void onAnimationRepeat(@NotNull Animation animation) {
            Animation animation2 = animation;
            if (PatchProxy.isSupport(new Object[]{animation2}, this, f32511a, false, 20667, new Class[]{Animation.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animation2}, this, f32511a, false, 20667, new Class[]{Animation.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animation2, "animation");
        }

        public final void onAnimationStart(@NotNull Animation animation) {
            Animation animation2 = animation;
            if (PatchProxy.isSupport(new Object[]{animation2}, this, f32511a, false, 20665, new Class[]{Animation.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animation2}, this, f32511a, false, 20665, new Class[]{Animation.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animation2, "animation");
        }

        d(OneLoginPrivacyViewForV2 oneLoginPrivacyViewForV2) {
            this.f32512b = oneLoginPrivacyViewForV2;
        }

        public final void onAnimationEnd(@NotNull Animation animation) {
            if (PatchProxy.isSupport(new Object[]{animation}, this, f32511a, false, 20666, new Class[]{Animation.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animation}, this, f32511a, false, 20666, new Class[]{Animation.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animation, "animation");
            if (this.f32512b.getContext() != null && this.f32512b.f32498e) {
                OneLoginPrivacyViewForV2 oneLoginPrivacyViewForV2 = this.f32512b;
                Activity a2 = com.ss.android.ugc.aweme.base.utils.v.a(this.f32512b.getContext());
                Intrinsics.checkExpressionValueIsNotNull(a2, "ViewUtils.getActivity(context)");
                b.a a3 = new b.a(a2).b((int) C0906R.string.b8z).b(true).a(true).a(2000);
                a3.f20268b = 0.0f;
                oneLoginPrivacyViewForV2.f32496c = a3.a(0.0f).d(-u.a(2.0d)).e((-this.f32512b.f32497d.getMeasuredHeight()) / 3).a();
                com.bytedance.ies.dmt.ui.a.b bVar = this.f32512b.f32496c;
                if (bVar != null) {
                    bVar.a();
                    bVar.a(this.f32512b.f32497d, 80, false);
                }
            }
        }
    }

    @JvmOverloads
    public OneLoginPrivacyViewForV2(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public OneLoginPrivacyViewForV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32494a, false, 20652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32494a, false, 20652, new Class[0], Void.TYPE);
        } else if (getContext() != null) {
            if (this.f32499f == null) {
                this.f32499f = AnimationUtils.loadAnimation(getContext(), C0906R.anim.cs);
                Animation animation = this.f32499f;
                if (animation != null) {
                    animation.setInterpolator(new CycleInterpolator(3.0f));
                }
                Animation animation2 = this.f32499f;
                if (animation2 != null) {
                    animation2.setAnimationListener(new d(this));
                }
            }
            findViewById(C0906R.id.c61).startAnimation(this.f32499f);
            this.f32498e = true;
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32494a, false, 20651, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32494a, false, 20651, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.f32497d.setImageResource(2130840254);
        } else {
            this.f32497d.setImageResource(2130840253);
        }
        if (this.f32497d.getVisibility() == 0) {
            TextView textView = (TextView) findViewById(C0906R.id.de9);
            if (z) {
                ImageView imageView = this.f32497d;
                Resources resources = getResources();
                Object[] objArr = new Object[1];
                String str = this.g;
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                imageView.setContentDescription(resources.getString(C0906R.string.s6, objArr));
                Intrinsics.checkExpressionValueIsNotNull(textView, "loginHint");
                Resources resources2 = getResources();
                Object[] objArr2 = new Object[1];
                String str2 = this.g;
                if (str2 == null) {
                    str2 = "";
                }
                objArr2[0] = str2;
                textView.setContentDescription(resources2.getString(C0906R.string.s6, objArr2));
            } else {
                ImageView imageView2 = this.f32497d;
                Resources resources3 = getResources();
                Object[] objArr3 = new Object[1];
                String str3 = this.g;
                if (str3 == null) {
                    str3 = "";
                }
                objArr3[0] = str3;
                imageView2.setContentDescription(resources3.getString(C0906R.string.dnq, objArr3));
                Intrinsics.checkExpressionValueIsNotNull(textView, "loginHint");
                Resources resources4 = getResources();
                Object[] objArr4 = new Object[1];
                String str4 = this.g;
                if (str4 == null) {
                    str4 = "";
                }
                objArr4[0] = str4;
                textView.setContentDescription(resources4.getString(C0906R.string.dnq, objArr4));
            }
        }
        this.f32495b = z;
        PrivacyAcceptViewModel privacyAcceptViewModel = this.h;
        if (privacyAcceptViewModel != null) {
            privacyAcceptViewModel.f32660a = Boolean.valueOf(this.f32495b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setCarrier(@org.jetbrains.annotations.NotNull java.lang.String r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f32494a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 20654(0x50ae, float:2.8942E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f32494a
            r3 = 0
            r4 = 20654(0x50ae, float:2.8942E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "carrier"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            int r0 = r11.hashCode()
            r1 = -1429363305(0xffffffffaacda597, float:-3.6530216E-13)
            r2 = 2131561545(0x7f0d0c49, float:1.8748494E38)
            if (r0 == r1) goto L_0x0071
            r1 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
            if (r0 == r1) goto L_0x0060
            r1 = -840542575(0xffffffffcde65691, float:-4.83054112E8)
            if (r0 == r1) goto L_0x004c
            goto L_0x0085
        L_0x004c:
            java.lang.String r0 = "unicom"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0085
            android.content.res.Resources r0 = r10.getResources()
            r1 = 2131561549(0x7f0d0c4d, float:1.8748502E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x008d
        L_0x0060:
            java.lang.String r0 = "mobile"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0085
            android.content.res.Resources r0 = r10.getResources()
            java.lang.String r0 = r0.getString(r2)
            goto L_0x008d
        L_0x0071:
            java.lang.String r0 = "telecom"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0085
            android.content.res.Resources r0 = r10.getResources()
            r1 = 2131561546(0x7f0d0c4a, float:1.8748496E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x008d
        L_0x0085:
            android.content.res.Resources r0 = r10.getResources()
            java.lang.String r0 = r0.getString(r2)
        L_0x008d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            android.content.res.Resources r2 = r10.getResources()
            boolean r3 = r10.f32495b
            if (r3 == 0) goto L_0x009b
            r3 = 2131558473(0x7f0d0049, float:1.8742263E38)
            goto L_0x009e
        L_0x009b:
            r3 = 2131561115(0x7f0d0a9b, float:1.8747621E38)
        L_0x009e:
            java.lang.String r2 = r2.getString(r3)
            r1.<init>(r2)
            java.lang.String r2 = "\n"
            r1.append(r2)
            android.content.res.Resources r2 = r10.getResources()
            r3 = 2131561555(0x7f0d0c53, float:1.8748514E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            android.text.Spannable$Factory r2 = android.text.Spannable.Factory.getInstance()
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            android.text.Spannable r2 = r2.newSpannable(r3)
            com.ss.android.ugc.aweme.account.login.ui.OneLoginPrivacyViewForV2$a r3 = new com.ss.android.ugc.aweme.account.login.ui.OneLoginPrivacyViewForV2$a
            r3.<init>(r10, r11)
            int r4 = r1.indexOf(r0)
            int r5 = r1.indexOf(r0)
            int r0 = r0.length()
            int r5 = r5 + r0
            r0 = 33
            r2.setSpan(r3, r4, r5, r0)
            android.content.res.Resources r3 = r10.getResources()
            r4 = 2131561119(0x7f0d0a9f, float:1.874763E38)
            java.lang.String r3 = r3.getString(r4)
            android.content.res.Resources r4 = r10.getResources()
            r5 = 2131561118(0x7f0d0a9e, float:1.8747627E38)
            java.lang.String r4 = r4.getString(r5)
            com.ss.android.ugc.aweme.account.login.ui.OneLoginPrivacyViewForV2$b r5 = new com.ss.android.ugc.aweme.account.login.ui.OneLoginPrivacyViewForV2$b
            r5.<init>(r10)
            int r6 = r1.indexOf(r3)
            int r7 = r1.indexOf(r3)
            int r3 = r3.length()
            int r7 = r7 + r3
            r2.setSpan(r5, r6, r7, r0)
            com.ss.android.ugc.aweme.account.login.ui.OneLoginPrivacyViewForV2$c r3 = new com.ss.android.ugc.aweme.account.login.ui.OneLoginPrivacyViewForV2$c
            r3.<init>(r10)
            int r5 = r1.indexOf(r4)
            int r1 = r1.indexOf(r4)
            int r4 = r4.length()
            int r1 = r1 + r4
            r2.setSpan(r3, r5, r1, r0)
            r0 = 2131170848(0x7f071620, float:1.7956066E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "textView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            java.lang.String r0 = r2.toString()
            r10.g = r0
            boolean r0 = r10.f32495b
            r10.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.OneLoginPrivacyViewForV2.setCarrier(java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneLoginPrivacyViewForV2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f32495b = n.a();
        LayoutInflater.from(context).inflate(C0906R.layout.abe, this);
        View findViewById = findViewById(C0906R.id.c60);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.privacy_check)");
        this.f32497d = (ImageView) findViewById;
        if (this.f32495b) {
            this.f32497d.setVisibility(8);
        } else {
            this.f32497d.setVisibility(0);
        }
        try {
            Activity a2 = com.ss.android.ugc.aweme.base.utils.v.a(context);
            if (a2 != null) {
                this.h = (PrivacyAcceptViewModel) ViewModelProviders.of((FragmentActivity) a2).get(PrivacyAcceptViewModel.class);
                PrivacyAcceptViewModel privacyAcceptViewModel = this.h;
                if (privacyAcceptViewModel != null) {
                    Boolean bool = privacyAcceptViewModel.f32660a;
                    if (bool != null) {
                        this.f32495b = bool.booleanValue();
                    }
                }
                a(this.f32495b);
                this.f32497d.setOnClickListener(new View.OnClickListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32500a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ OneLoginPrivacyViewForV2 f32501b;

                    {
                        this.f32501b = r1;
                    }

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f32500a, false, 20657, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f32500a, false, 20657, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        this.f32501b.a(!this.f32501b.f32495b);
                    }
                });
                findViewById(C0906R.id.de9).setOnClickListener(new View.OnClickListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32502a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ OneLoginPrivacyViewForV2 f32503b;

                    {
                        this.f32503b = r1;
                    }

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f32502a, false, 20658, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f32502a, false, 20658, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                        if (Intrinsics.areEqual(view.getTag(), (Object) Boolean.TRUE)) {
                            view.setTag(Boolean.FALSE);
                            return;
                        }
                        if (this.f32503b.f32497d.getVisibility() == 0) {
                            this.f32503b.a(!this.f32503b.f32495b);
                        }
                    }
                });
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public /* synthetic */ OneLoginPrivacyViewForV2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
