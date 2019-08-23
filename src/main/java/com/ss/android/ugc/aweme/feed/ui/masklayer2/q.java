package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.views.o;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionsDialog;", "Lcom/ss/android/ugc/aweme/views/ResizableDialog;", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/IOptionsDialog;", "context", "Landroid/content/Context;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "enterFrom", "", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/String;)V", "mActionsManager", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;", "mOptionsView", "Landroid/support/v7/widget/RecyclerView;", "mRootView", "Landroid/view/View;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "show", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class q extends o implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46792a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f46793b;

    /* renamed from: c  reason: collision with root package name */
    private View f46794c;

    /* renamed from: d  reason: collision with root package name */
    private a f46795d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f46797b;

        a(q qVar) {
            this.f46797b = qVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f46796a, false, 43481, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f46796a, false, 43481, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f46797b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/masklayer2/OptionsDialog$onCreate$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f46799b;

        public final void onGlobalLayout() {
            if (PatchProxy.isSupport(new Object[0], this, f46798a, false, 43482, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46798a, false, 43482, new Class[0], Void.TYPE);
                return;
            }
            int[] iArr = new int[2];
            q.a(this.f46799b).getLocationOnScreen(iArr);
            ViewGroup.LayoutParams layoutParams = q.a(this.f46799b).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 48;
                if (ToolUtils.isMiui()) {
                    layoutParams2.topMargin = iArr[1] - p.c();
                } else {
                    layoutParams2.topMargin = iArr[1];
                }
                q.a(this.f46799b).requestLayout();
                q.a(this.f46799b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }

        b(q qVar) {
            this.f46799b = qVar;
        }
    }

    public final void show() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f46792a, false, 43480, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46792a, false, 43480, new Class[0], Void.TYPE);
            return;
        }
        Activity a2 = v.a(getContext());
        if (a2 != null) {
            obj = a2.getSystemService("vibrator");
        } else {
            obj = null;
        }
        if (obj != null) {
            Vibrator vibrator = (Vibrator) obj;
            if (vibrator != null) {
                vibrator.vibrate(15);
            }
            super.show();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
    }

    public static final /* synthetic */ RecyclerView a(q qVar) {
        RecyclerView recyclerView = qVar.f46793b;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOptionsView");
        }
        return recyclerView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: com.ss.android.ugc.aweme.feed.ui.masklayer2.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r20) {
        /*
            r19 = this;
            r8 = r19
            r10 = 1
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r11 = 0
            r1[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r3 = f46792a
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r6[r11] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 43479(0xa9d7, float:6.0927E-41)
            r2 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r3 = f46792a
            r4 = 0
            r5 = 43479(0xa9d7, float:6.0927E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r6[r11] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0036:
            android.view.Window r0 = r19.getWindow()     // Catch:{ Exception -> 0x0042 }
            if (r0 == 0) goto L_0x004a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)     // Catch:{ Exception -> 0x0042 }
            goto L_0x004a
        L_0x0042:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.ss.android.ugc.aweme.util.c.a(r0)
        L_0x004a:
            super.onCreate(r20)
            r0 = 2131689857(0x7f0f0181, float:1.9008741E38)
            r8.setContentView(r0)
            r0 = 2131169611(0x7f07114b, float:1.7953557E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.root)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r8.f46794c = r0
            r0 = 2131168738(0x7f070de2, float:1.7951786E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.options)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            r8.f46793b = r0
            android.support.v7.widget.RecyclerView r0 = r8.f46793b
            if (r0 != 0) goto L_0x007a
            java.lang.String r1 = "mOptionsView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x007a:
            com.ss.android.ugc.aweme.feed.ui.masklayer2.OptionsAdapter r1 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.OptionsAdapter
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a r2 = r8.f46795d
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f46750a
            r15 = 0
            r16 = 43412(0xa994, float:6.0833E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r13 = r2
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x00aa
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f46750a
            r15 = 0
            r16 = 43412(0xa994, float:6.0833E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r13 = r2
            r17 = r3
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r2 = (java.util.List) r2
            goto L_0x022d
        L_0x00aa:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f46750a
            r15 = 0
            r16 = 43416(0xa998, float:6.0839E-41)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.masklayer2.m> r18 = com.ss.android.ugc.aweme.feed.ui.masklayer2.m.class
            r13 = r2
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            r5 = 0
            if (r4 == 0) goto L_0x00dd
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f46750a
            r15 = 0
            r16 = 43416(0xa998, float:6.0839E-41)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.masklayer2.m> r18 = com.ss.android.ugc.aweme.feed.ui.masklayer2.m.class
            r13 = r2
            r17 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.m r4 = (com.ss.android.ugc.aweme.feed.ui.masklayer2.m) r4
            goto L_0x011f
        L_0x00dd:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r2.f46752c
            if (r4 == 0) goto L_0x00ec
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            if (r4 == 0) goto L_0x00ec
            java.lang.String r4 = r4.getUid()
            goto L_0x00ed
        L_0x00ec:
            r4 = r5
        L_0x00ed:
            boolean r4 = com.ss.android.ugc.aweme.share.cg.a((java.lang.String) r4)
            if (r4 != 0) goto L_0x0103
            java.lang.String r4 = r2.f46753d
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r6 = "homepage_hot"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 == 0) goto L_0x0103
            r4 = 1
            goto L_0x0104
        L_0x0103:
            r4 = 0
        L_0x0104:
            if (r4 == 0) goto L_0x011e
            com.ss.android.ugc.aweme.feed.ui.masklayer2.m r4 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.m
            com.ss.android.ugc.aweme.feed.ui.masklayer2.p r6 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.p
            r7 = 2130839680(0x7f020880, float:1.7284377E38)
            r9 = 2131561468(0x7f0d0bfc, float:1.8748337E38)
            r6.<init>(r7, r9)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.n r7 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.n
            r7.<init>(r2)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.o r7 = (com.ss.android.ugc.aweme.feed.ui.masklayer2.o) r7
            r4.<init>(r6, r7)
            goto L_0x011f
        L_0x011e:
            r4 = r5
        L_0x011f:
            r3.add(r4)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.b r4 = r2.a()
            r3.add(r4)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f46750a
            r15 = 0
            r16 = 43417(0xa999, float:6.084E-41)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.masklayer2.m> r18 = com.ss.android.ugc.aweme.feed.ui.masklayer2.m.class
            r13 = r2
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x0155
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f46750a
            r15 = 0
            r16 = 43417(0xa999, float:6.084E-41)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.masklayer2.m> r18 = com.ss.android.ugc.aweme.feed.ui.masklayer2.m.class
            r13 = r2
            r17 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            r5 = r4
            com.ss.android.ugc.aweme.feed.ui.masklayer2.m r5 = (com.ss.android.ugc.aweme.feed.ui.masklayer2.m) r5
            goto L_0x019c
        L_0x0155:
            boolean r4 = com.ss.android.g.a.a()
            if (r4 == 0) goto L_0x0162
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r2.f46752c
            boolean r4 = com.ss.android.ugc.aweme.utils.u.f(r4)
            goto L_0x0175
        L_0x0162:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r2.f46752c
            boolean r4 = com.ss.android.ugc.aweme.report.b.b(r4)
            if (r4 != 0) goto L_0x0174
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r2.f46752c
            boolean r4 = com.ss.android.ugc.aweme.report.b.a(r4)
            if (r4 != 0) goto L_0x0174
            r4 = 1
            goto L_0x0175
        L_0x0174:
            r4 = 0
        L_0x0175:
            if (r4 == 0) goto L_0x019c
            com.ss.android.ugc.aweme.feed.ui.masklayer2.m r5 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.m
            com.ss.android.ugc.aweme.feed.ui.masklayer2.p r4 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.p
            r6 = 2130839674(0x7f02087a, float:1.7284365E38)
            com.ss.android.ugc.aweme.setting.AbTestManager r7 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r7 = r7.cn()
            if (r7 != 0) goto L_0x018c
            r7 = 2131562208(0x7f0d0ee0, float:1.8749838E38)
            goto L_0x018f
        L_0x018c:
            r7 = 2131558612(0x7f0d00d4, float:1.8742545E38)
        L_0x018f:
            r4.<init>(r6, r7)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.h r6 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.h
            r6.<init>(r2)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.o r6 = (com.ss.android.ugc.aweme.feed.ui.masklayer2.o) r6
            r5.<init>(r4, r6)
        L_0x019c:
            r3.add(r5)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f46750a
            r15 = 0
            r16 = 43418(0xa99a, float:6.0842E-41)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.masklayer2.m> r18 = com.ss.android.ugc.aweme.feed.ui.masklayer2.m.class
            r13 = r2
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f46750a
            r15 = 0
            r16 = 43418(0xa99a, float:6.0842E-41)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.masklayer2.m> r18 = com.ss.android.ugc.aweme.feed.ui.masklayer2.m.class
            r13 = r2
            r17 = r4
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.m r2 = (com.ss.android.ugc.aweme.feed.ui.masklayer2.m) r2
            goto L_0x0224
        L_0x01ca:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r2.f46752c
            r5 = 2
            if (r4 == 0) goto L_0x01f4
            boolean r4 = r4.isCollected()
            if (r4 != r10) goto L_0x01f4
            com.ss.android.ugc.aweme.setting.AbTestManager r4 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r4 = r4.cn()
            if (r4 == r5) goto L_0x01e3
            r4 = 2131559038(0x7f0d027e, float:1.8743409E38)
            goto L_0x01e6
        L_0x01e3:
            r4 = 2131558608(0x7f0d00d0, float:1.8742537E38)
        L_0x01e6:
            boolean r5 = com.ss.android.g.a.b()
            if (r5 == 0) goto L_0x01f0
            r5 = 2130839679(0x7f02087f, float:1.7284375E38)
            goto L_0x0212
        L_0x01f0:
            r5 = 2130839678(0x7f02087e, float:1.7284373E38)
            goto L_0x0212
        L_0x01f4:
            com.ss.android.ugc.aweme.setting.AbTestManager r4 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r4 = r4.cn()
            if (r4 == r5) goto L_0x0202
            r4 = 2131562708(0x7f0d10d4, float:1.8750852E38)
            goto L_0x0205
        L_0x0202:
            r4 = 2131558614(0x7f0d00d6, float:1.8742549E38)
        L_0x0205:
            boolean r5 = com.ss.android.g.a.b()
            if (r5 == 0) goto L_0x020f
            r5 = 2130839677(0x7f02087d, float:1.7284371E38)
            goto L_0x0212
        L_0x020f:
            r5 = 2130839676(0x7f02087c, float:1.728437E38)
        L_0x0212:
            com.ss.android.ugc.aweme.feed.ui.masklayer2.p r6 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.p
            r6.<init>(r5, r4)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.m r4 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.m
            com.ss.android.ugc.aweme.feed.ui.masklayer2.i r5 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.i
            r5.<init>(r2)
            com.ss.android.ugc.aweme.feed.ui.masklayer2.o r5 = (com.ss.android.ugc.aweme.feed.ui.masklayer2.o) r5
            r4.<init>(r6, r5)
            r2 = r4
        L_0x0224:
            r3.add(r2)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r2 = kotlin.collections.CollectionsKt.filterNotNull(r3)
        L_0x022d:
            r1.<init>(r2)
            android.support.v7.widget.RecyclerView$Adapter r1 = (android.support.v7.widget.RecyclerView.Adapter) r1
            r0.setAdapter(r1)
            android.view.View r0 = r8.f46794c
            if (r0 != 0) goto L_0x023e
            java.lang.String r1 = "mRootView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x023e:
            com.ss.android.ugc.aweme.feed.ui.masklayer2.q$a r1 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.q$a
            r1.<init>(r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.support.v7.widget.RecyclerView r0 = r8.f46793b
            if (r0 != 0) goto L_0x0251
            java.lang.String r1 = "mOptionsView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0251:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            com.ss.android.ugc.aweme.feed.ui.masklayer2.q$b r1 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.q$b
            r1.<init>(r8)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            r0.addOnGlobalLayoutListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.masklayer2.q.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(@NotNull Context context, @Nullable Aweme aweme, @NotNull String str) {
        super(context, C0906R.style.fj, true, false, false);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "enterFrom");
        this.f46795d = new a(this, aweme, str);
    }
}
