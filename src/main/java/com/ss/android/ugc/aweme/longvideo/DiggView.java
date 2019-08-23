package com.ss.android.ugc.aweme.longvideo;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.ss.android.ugc.aweme.feed.h.ab;
import com.ss.android.ugc.aweme.feed.h.u;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.login.a.c;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.longvideo.b.b;
import com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001JB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001cJ\u0006\u0010+\u001a\u00020)J\u0006\u0010,\u001a\u00020)J\u0012\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J*\u00100\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u00172\b\u00102\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\tJ\u0017\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0002\u00106J\u0006\u00107\u001a\u000204J\u0006\u00108\u001a\u000204J\u0012\u00109\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u0010:\u001a\u00020)H\u0007J\u0018\u0010;\u001a\u00020)2\u000e\u0010<\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>H\u0016J\u001e\u0010?\u001a\u00020)2\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020%\u0018\u00010AH\u0016J\b\u0010B\u001a\u00020)H\u0002J\u000e\u0010C\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001cJ\u0018\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020%H\u0002J\u0006\u0010G\u001a\u00020)J\u000e\u0010H\u001a\u00020)2\u0006\u0010I\u001a\u000204R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R!\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/DiggView;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/ugc/aweme/feed/presenter/IItemDiggView;", "Landroid/arch/lifecycle/LifecycleObserver;", "diggAnimationView", "Lcom/ss/android/ugc/aweme/longvideo/view/LongVideoDiggAnimationView;", "diggTextView", "Landroid/widget/TextView;", "mEventType", "", "(Lcom/ss/android/ugc/aweme/longvideo/view/LongVideoDiggAnimationView;Landroid/widget/TextView;Ljava/lang/String;)V", "activity", "Landroid/support/v4/app/FragmentActivity;", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "setActivity", "(Landroid/support/v4/app/FragmentActivity;)V", "getDiggAnimationView", "()Lcom/ss/android/ugc/aweme/longvideo/view/LongVideoDiggAnimationView;", "getDiggTextView", "()Landroid/widget/TextView;", "enterFrom", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mCommerceDiggView", "Lcom/ss/android/ugc/aweme/commercialize/views/CommerceLikeLayout;", "mDiggCallbacks", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/longvideo/DiggView$IDiggCallback;", "Lkotlin/collections/ArrayList;", "getMDiggCallbacks", "()Ljava/util/ArrayList;", "getMEventType", "()Ljava/lang/String;", "mItemDiggPresenter", "Lcom/ss/android/ugc/aweme/feed/presenter/ItemDiggPresenter;", "mOriginDiggCount", "", "mOriginalDiggStates", "mRealDiggStates", "addDiggCallback", "", "diggCallback", "digg", "diggAndUnDigg", "doDigg", "v", "Landroid/view/View;", "init", "aweme", "diggView", "isDigged", "", "diggStates", "(Ljava/lang/Integer;)Z", "isDiggedInUI", "isRealDigged", "onClick", "onDestroy", "onItemDiggFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onItemDiggSuccess", "pair", "Landroid/support/v4/util/Pair;", "postOperateEvent", "removeDiggCallback", "sendDiggRequest", "aid", "type", "unDigg", "updateDiggView", "selected", "IDiggCallback", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiggView implements LifecycleObserver, View.OnClickListener, u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3446a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public FragmentActivity f3447b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<a> f3448c = new ArrayList<>();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final LongVideoDiggAnimationView f3449d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final TextView f3450e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final String f3451f;
    private Aweme g;
    private ab h;
    private int i;
    private int j;
    private int k;
    private CommerceLikeLayout l;
    private String m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/DiggView$IDiggCallback;", "", "onDigg", "", "onUndigg", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a();
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3446a, false, 56517, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3446a, false, 56517, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a((Context) this.f3447b, (Throwable) exc);
        a(a(Integer.valueOf(this.k)));
    }

    public final void a(@NotNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3446a, false, 56523, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3446a, false, 56523, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "diggCallback");
        if (!this.f3448c.contains(aVar)) {
            this.f3448c.add(aVar);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3446a, false, 56510, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3446a, false, 56510, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f3449d.isSelected()) {
            a((View) null);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3446a, false, 56519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3446a, false, 56519, new Class[0], Void.TYPE);
            return;
        }
        ab abVar = this.h;
        if (abVar != null) {
            abVar.j();
        }
        ab abVar2 = this.h;
        if (abVar2 != null) {
            abVar2.k();
        }
        this.f3448c.clear();
    }

    private final void a(View view) {
        int i2;
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f3446a, false, 56513, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3446a, false, 56513, new Class[]{View.class}, Void.TYPE);
            return;
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        if (!a2.isLogin()) {
            if (TextUtils.equals(this.f3451f, "homepage_hot")) {
                i2 = C0906R.string.b92;
            } else {
                i2 = C0906R.string.b5f;
            }
            FragmentActivity fragmentActivity = this.f3447b;
            String str3 = null;
            if (fragmentActivity != null) {
                str = fragmentActivity.getString(i2);
            } else {
                str = null;
            }
            bg.a(new c(0));
            Activity activity = this.f3447b;
            String str4 = this.f3451f;
            ad a3 = ad.a().a("login_title", str);
            Aweme aweme = this.g;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            ad a4 = a3.a("group_id", str2);
            Aweme aweme2 = this.g;
            if (aweme2 != null) {
                str3 = aweme2.getAid();
            }
            e.a(activity, str4, "click_like", a4.a("log_pb", aa.g(str3)).f75487b);
            return;
        }
        this.f3449d.a(view);
        if (this.f3449d.isSelected()) {
            a(b.f53880b.a(this.g), 0);
            a(false);
            Iterator it2 = this.f3448c.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            return;
        }
        a(b.f53880b.a(this.g), 1);
        a(true);
        for (a a5 : this.f3448c) {
            a5.a();
        }
    }

    public final void onClick(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3446a, false, 56515, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3446a, false, 56515, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (PatchProxy.isSupport(new Object[0], this, f3446a, false, 56514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3446a, false, 56514, new Class[0], Void.TYPE);
        } else {
            bg.a(new com.ss.android.ugc.aweme.longvideo.a.a());
        }
        if (!this.f3449d.isSelected()) {
            IAccountUserService a2 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            if (a2.isLogin()) {
                CommerceLikeLayout commerceLikeLayout = this.l;
                if (commerceLikeLayout != null) {
                    String str = this.m;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("enterFrom");
                    }
                    commerceLikeLayout.a(str);
                }
            }
        }
        a(view);
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3446a, false, 56516, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3446a, false, 56516, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.f3449d.setSelected(z);
            TextView textView = this.f3450e;
            if (textView != null) {
                if (z) {
                    if (!a(Integer.valueOf(this.j))) {
                        textView.setText(com.ss.android.ugc.aweme.i18n.b.a((long) (this.i + 1)));
                    }
                } else if (a(Integer.valueOf(this.j))) {
                    textView.setText(com.ss.android.ugc.aweme.i18n.b.a((long) (this.i - 1)));
                }
                textView.setText(com.ss.android.ugc.aweme.i18n.b.a((long) this.i));
            }
        }
    }

    private final boolean a(Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, f3446a, false, 56520, new Class[]{Integer.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{num}, this, f3446a, false, 56520, new Class[]{Integer.class}, Boolean.TYPE)).booleanValue();
        } else if (num != null && num.intValue() == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        if (r2 == null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable android.support.v4.util.Pair<java.lang.String, java.lang.Integer> r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3446a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.util.Pair> r1 = android.support.v4.util.Pair.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 56518(0xdcc6, float:7.9199E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3446a
            r3 = 0
            r4 = 56518(0xdcc6, float:7.9199E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.util.Pair> r1 = android.support.v4.util.Pair.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.feed.f.ar r0 = new com.ss.android.ugc.aweme.feed.f.ar
            r1 = 13
            if (r8 == 0) goto L_0x0044
            F r2 = r8.first
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0046
        L_0x0044:
            java.lang.String r2 = ""
        L_0x0046:
            r0.<init>(r1, r2)
            com.ss.android.ugc.aweme.utils.bg.a(r0)
            com.ss.android.ugc.aweme.longvideo.b.b$a r0 = com.ss.android.ugc.aweme.longvideo.b.b.f53880b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.g
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.longvideo.b.b.a.f53881a
            r14 = 0
            r15 = 56751(0xddaf, float:7.9525E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r10] = r3
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0087
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.longvideo.b.b.a.f53881a
            r14 = 0
            r15 = 56751(0xddaf, float:7.9525E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r10] = r2
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x008d
        L_0x0087:
            com.ss.android.ugc.aweme.longvideo.b.b$a r0 = (com.ss.android.ugc.aweme.longvideo.b.b.a) r0
            java.lang.String r0 = r0.a(r1)
        L_0x008d:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            if (r8 == 0) goto L_0x0097
            F r2 = r8.first
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0098
        L_0x0097:
            r2 = r1
        L_0x0098:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x00ae
            if (r8 == 0) goto L_0x00a7
            S r0 = r8.second
            r1 = r0
            java.lang.Integer r1 = (java.lang.Integer) r1
        L_0x00a7:
            boolean r0 = r7.a((java.lang.Integer) r1)
            r7.a((boolean) r0)
        L_0x00ae:
            if (r8 == 0) goto L_0x00ba
            S r0 = r8.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x00ba
            int r10 = r0.intValue()
        L_0x00ba:
            r7.k = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideo.DiggView.a(android.support.v4.util.Pair):void");
    }

    private final void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f3446a, false, 56509, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f3446a, false, 56509, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ab abVar = this.h;
        if (abVar != null) {
            abVar.a(str, Integer.valueOf(i2), this.f3451f);
        }
    }

    public DiggView(@NotNull LongVideoDiggAnimationView longVideoDiggAnimationView, @Nullable TextView textView, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(longVideoDiggAnimationView, "diggAnimationView");
        Intrinsics.checkParameterIsNotNull(str, "mEventType");
        this.f3449d = longVideoDiggAnimationView;
        this.f3450e = textView;
        this.f3451f = str;
    }

    public final void a(@NotNull FragmentActivity fragmentActivity, @Nullable Aweme aweme, @Nullable CommerceLikeLayout commerceLikeLayout, @NotNull String str) {
        int i2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Aweme aweme2 = aweme;
        CommerceLikeLayout commerceLikeLayout2 = commerceLikeLayout;
        String str2 = str;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, aweme2, commerceLikeLayout2, str2}, this, f3446a, false, 56508, new Class[]{FragmentActivity.class, Aweme.class, CommerceLikeLayout.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, aweme2, commerceLikeLayout2, str2}, this, f3446a, false, 56508, new Class[]{FragmentActivity.class, Aweme.class, CommerceLikeLayout.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(str2, "enterFrom");
        this.f3447b = fragmentActivity2;
        fragmentActivity.getLifecycle().addObserver(this);
        this.g = aweme2;
        this.m = str2;
        this.l = commerceLikeLayout2;
        this.f3449d.setImageResource(2130838053);
        Aweme aweme3 = this.g;
        if (aweme3 != null) {
            i2 = aweme3.getUserDigg();
        } else {
            i2 = 0;
        }
        this.j = i2;
        this.k = this.j;
        this.f3449d.setSelected(a(Integer.valueOf(this.j)));
        this.f3449d.setOnClickListener(this);
        Aweme aweme4 = this.g;
        if (aweme4 != null) {
            AwemeStatistics statistics = aweme4.getStatistics();
            if (statistics != null) {
                i3 = statistics.getDiggCount();
            }
        }
        this.i = i3;
        TextView textView = this.f3450e;
        if (textView != null) {
            textView.setText(com.ss.android.ugc.aweme.i18n.b.a((long) this.i));
        }
        this.h = new ab();
        ab abVar = this.h;
        if (abVar != null) {
            abVar.a(new com.ss.android.ugc.aweme.feed.h.aa());
        }
        ab abVar2 = this.h;
        if (abVar2 != null) {
            abVar2.a(this);
        }
    }
}
