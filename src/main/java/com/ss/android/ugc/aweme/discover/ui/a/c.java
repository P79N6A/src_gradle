package com.ss.android.ugc.aweme.discover.ui.a;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.discover.model.SearchNilText;
import com.ss.android.ugc.aweme.discover.presenter.SearchMusicFragment;
import com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment;
import com.ss.android.ugc.aweme.discover.ui.SearchFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.music.util.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018J$\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/status/StatusViewFactory;", "", "context", "Landroid/content/Context;", "searchFragment", "Lcom/ss/android/ugc/aweme/discover/ui/SearchFragment;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/discover/ui/SearchFragment;)V", "getLimitedAfterLogin", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;", "msg", "", "getLoginNeed", "fragment", "Landroid/support/v4/app/Fragment;", "labelName", "getNormalEmptyStatus", "getSensitiveStatus", "activity", "Landroid/app/Activity;", "apiResult", "Lcom/ss/android/ugc/aweme/discover/model/SearchApiResult;", "getStatusByResponse", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getStatusName", "Lcom/ss/android/ugc/aweme/discover/ui/status/SearchStatusName;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43080a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f43081c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public Context f43082b;

    /* renamed from: d  reason: collision with root package name */
    private SearchFragment<?> f43083d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/status/StatusViewFactory$Companion;", "", "()V", "from", "Lcom/ss/android/ugc/aweme/discover/ui/status/StatusViewFactory;", "context", "Landroid/content/Context;", "searchFragment", "Lcom/ss/android/ugc/aweme/discover/ui/SearchFragment;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43084a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final c a(@NotNull Context context, @NotNull SearchFragment<?> searchFragment) {
            Context context2 = context;
            SearchFragment<?> searchFragment2 = searchFragment;
            if (PatchProxy.isSupport(new Object[]{context2, searchFragment2}, this, f43084a, false, 38142, new Class[]{Context.class, SearchFragment.class}, c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[]{context2, searchFragment2}, this, f43084a, false, 38142, new Class[]{Context.class, SearchFragment.class}, c.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(searchFragment2, "searchFragment");
            return new c(context2, searchFragment2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43085a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f43086b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f43087c;

        b(Fragment fragment, String str) {
            this.f43086b = fragment;
            this.f43087c = str;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f43085a, false, 38144, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f43085a, false, 38144, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            e.a(this.f43086b, this.f43087c, "search_freq_control", (f) AnonymousClass1.f43089b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/discover/ui/status/StatusViewFactory$getNormalEmptyStatus$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "textView", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.c$c  reason: collision with other inner class name */
    public static final class C0542c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f43091b;

        C0542c(Ref.ObjectRef objectRef) {
            this.f43091b = objectRef;
        }

        public final void onClick(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f43090a, false, 38147, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f43090a, false, 38147, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "textView");
            f.a a2 = com.ss.android.ugc.aweme.music.util.f.a((String) this.f43091b.element);
            a2.a("enter_from", "music_search_result");
            h.a().a(a2.a().toString());
            r.a("music_search_feedback_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "music_search_result").f34114b);
        }

        public final void updateDrawState(@NotNull TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f43090a, false, 38148, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f43090a, false, 38148, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(textPaint2, "ds");
            super.updateDrawState(textPaint);
            textPaint2.setUnderlineText(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/discover/ui/status/StatusViewFactory$getSensitiveStatus$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43092a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f43093b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f43094c;

        public final void updateDrawState(@NotNull TextPaint textPaint) {
            if (PatchProxy.isSupport(new Object[]{textPaint}, this, f43092a, false, 38150, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint}, this, f43092a, false, 38150, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            if (com.ss.android.g.a.b()) {
                textPaint.setColor(ContextCompat.getColor(this.f43093b.f43082b, C0906R.color.s_));
            } else if (com.ss.android.g.a.c()) {
                textPaint.setColor(ContextCompat.getColor(this.f43093b.f43082b, C0906R.color.al3));
            }
            textPaint.setUnderlineText(false);
        }

        public final void onClick(@NotNull View view) {
            i iVar;
            if (PatchProxy.isSupport(new Object[]{view}, this, f43092a, false, 38149, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f43092a, false, 38149, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "widget");
            if (com.ss.android.ugc.aweme.language.e.d()) {
                iVar = new i("https://api.tiktokv.com/magic/runtime/?id=1159");
            } else {
                iVar = new i("https://support.tiktok.com/knowledge-base/community-policy");
                iVar.a("lang", ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getLocalLanguage(this.f43094c));
            }
            Activity activity = this.f43094c;
            if (activity != null) {
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openAgreement(activity, iVar.toString(), false, activity.getString(C0906R.string.a0n));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }

        d(c cVar, Activity activity) {
            this.f43093b = cVar;
            this.f43094c = activity;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r0 == null) goto L_0x0081;
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.dmt.ui.widget.c a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.discover.model.SearchApiResult r11, @org.jetbrains.annotations.Nullable java.lang.Exception r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            r9 = 1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f43080a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchApiResult> r1 = com.ss.android.ugc.aweme.discover.model.SearchApiResult.class
            r5[r8] = r1
            java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
            r5[r9] = r1
            java.lang.Class<com.bytedance.ies.dmt.ui.widget.c> r6 = com.bytedance.ies.dmt.ui.widget.c.class
            r3 = 0
            r4 = 38136(0x94f8, float:5.344E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0042
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f43080a
            r3 = 0
            r4 = 38136(0x94f8, float:5.344E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchApiResult> r1 = com.ss.android.ugc.aweme.discover.model.SearchApiResult.class
            r5[r8] = r1
            java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
            r5[r9] = r1
            java.lang.Class<com.bytedance.ies.dmt.ui.widget.c> r6 = com.bytedance.ies.dmt.ui.widget.c.class
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.bytedance.ies.dmt.ui.widget.c r0 = (com.bytedance.ies.dmt.ui.widget.c) r0
            return r0
        L_0x0042:
            com.ss.android.ugc.aweme.discover.ui.a.a r0 = r10.b(r11, r12)
            int[] r1 = com.ss.android.ugc.aweme.discover.ui.a.d.f43095a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            switch(r0) {
                case 1: goto L_0x0088;
                case 2: goto L_0x0071;
                case 3: goto L_0x0059;
                case 4: goto L_0x0058;
                default: goto L_0x0052;
            }
        L_0x0052:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0058:
            return r1
        L_0x0059:
            android.content.Context r0 = r10.f43082b
            if (r0 == 0) goto L_0x0069
            android.app.Activity r0 = (android.app.Activity) r0
            if (r11 != 0) goto L_0x0064
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0064:
            com.bytedance.ies.dmt.ui.widget.c r0 = r10.a((android.app.Activity) r0, (com.ss.android.ugc.aweme.discover.model.SearchApiResult) r11)
            return r0
        L_0x0069:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            r0.<init>(r1)
            throw r0
        L_0x0071:
            boolean r0 = r12 instanceof com.ss.android.ugc.aweme.base.api.a.b.a
            if (r0 != 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r1 = r12
        L_0x0077:
            com.ss.android.ugc.aweme.base.api.a.b.a r1 = (com.ss.android.ugc.aweme.base.api.a.b.a) r1
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = r1.getErrorMsg()
            if (r0 != 0) goto L_0x0083
        L_0x0081:
            java.lang.String r0 = ""
        L_0x0083:
            com.bytedance.ies.dmt.ui.widget.c r0 = r10.a(r0)
            return r0
        L_0x0088:
            com.ss.android.ugc.aweme.discover.ui.SearchFragment<?> r0 = r10.f43083d
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            com.ss.android.ugc.aweme.discover.ui.SearchFragment<?> r1 = r10.f43083d
            java.lang.String r1 = r1.i()
            com.bytedance.ies.dmt.ui.widget.c r0 = r10.a((android.support.v4.app.Fragment) r0, (java.lang.String) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.a.c.a(com.ss.android.ugc.aweme.discover.model.SearchApiResult, java.lang.Exception):com.bytedance.ies.dmt.ui.widget.c");
    }

    @NotNull
    public final com.bytedance.ies.dmt.ui.widget.c a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f43080a, false, 38139, new Class[0], com.bytedance.ies.dmt.ui.widget.c.class)) {
            return (com.bytedance.ies.dmt.ui.widget.c) PatchProxy.accessDispatch(new Object[0], this, f43080a, false, 38139, new Class[0], com.bytedance.ies.dmt.ui.widget.c.class);
        } else if (com.ss.android.g.a.a()) {
            com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(this.f43082b).a(2130839718).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).d(a.EMPTY.getType()).f20493a;
            Intrinsics.checkExpressionValueIsNotNull(cVar, "DmtDefaultStatus.Builder…                 .build()");
            return cVar;
        } else {
            try {
                com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
                Boolean bM = b2.bM();
                Intrinsics.checkExpressionValueIsNotNull(bM, "SettingsReader.get().showMusicFeedbackEntrance");
                z = bM.booleanValue();
            } catch (Exception unused) {
                z = false;
            }
            if (!(this.f43083d instanceof SearchMusicFragment) || !z) {
                com.bytedance.ies.dmt.ui.widget.c cVar2 = new c.a(this.f43082b).a(2130840144).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).d(a.EMPTY.getType()).f20493a;
                Intrinsics.checkExpressionValueIsNotNull(cVar2, "emptyStatus");
                return cVar2;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            try {
                com.ss.android.ugc.aweme.global.config.settings.pojo.a b3 = g.b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "SettingsReader.get()");
                FeConfigCollection O = b3.O();
                Intrinsics.checkExpressionValueIsNotNull(O, "SettingsReader.get().feConfigCollection");
                FEConfig musicFaq = O.getMusicFaq();
                Intrinsics.checkExpressionValueIsNotNull(musicFaq, "SettingsReader.get().feConfigCollection.musicFaq");
                T schema = musicFaq.getSchema();
                Intrinsics.checkExpressionValueIsNotNull(schema, "SettingsReader.get().feC…ollection.musicFaq.schema");
                objectRef.element = schema;
            } catch (Exception unused2) {
            }
            Context context = this.f43082b;
            if (context == null) {
                Intrinsics.throwNpe();
            }
            SpannableString spannableString = new SpannableString(context.getString(C0906R.string.c2g));
            e.a(spannableString, new C0542c(objectRef), 8, spannableString.length(), 33);
            e.a(spannableString, new ForegroundColorSpan(ContextCompat.getColor(this.f43082b, C0906R.color.zl)), 8, spannableString.length(), 33);
            e.a(spannableString, new ForegroundColorSpan(ContextCompat.getColor(this.f43082b, C0906R.color.zx)), 0, 9, 33);
            com.bytedance.ies.dmt.ui.widget.c cVar3 = new c.a(this.f43082b).a(2130840144).a(true).b((int) C0906R.string.f4486dmt).a((CharSequence) spannableString).f20493a;
            Intrinsics.checkExpressionValueIsNotNull(cVar3, "emptyStatus");
            return cVar3;
        }
    }

    @NotNull
    private com.bytedance.ies.dmt.ui.widget.c a(@NotNull String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f43080a, false, 38137, new Class[]{String.class}, com.bytedance.ies.dmt.ui.widget.c.class)) {
            return (com.bytedance.ies.dmt.ui.widget.c) PatchProxy.accessDispatch(new Object[]{str}, this, f43080a, false, 38137, new Class[]{String.class}, com.bytedance.ies.dmt.ui.widget.c.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "msg");
        this.f43083d.B();
        if (TextUtils.isEmpty(str) || !com.ss.android.g.a.a()) {
            str2 = this.f43082b.getString(C0906R.string.dmy);
            Intrinsics.checkExpressionValueIsNotNull(str2, "context.getString(R.stri…uikit_search_reach_limit)");
        } else {
            str2 = str;
        }
        if (com.ss.android.g.a.a()) {
            com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(this.f43082b).a(2130839718).a(str2).d(a.LIMIT.getType()).b(true).f20493a;
            Intrinsics.checkExpressionValueIsNotNull(cVar, "DmtDefaultStatus.Builder…                 .build()");
            return cVar;
        }
        com.bytedance.ies.dmt.ui.widget.c cVar2 = new c.a(this.f43082b).a(2130840144).a(str2).d(a.LIMIT.getType()).b(true).f20493a;
        Intrinsics.checkExpressionValueIsNotNull(cVar2, "limitStatus");
        return cVar2;
    }

    public c(@NotNull Context context, @NotNull SearchFragment<?> searchFragment) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(searchFragment, "searchFragment");
        this.f43082b = context;
        this.f43083d = searchFragment;
    }

    @NotNull
    private com.bytedance.ies.dmt.ui.widget.c a(@NotNull Activity activity, @NotNull SearchApiResult searchApiResult) {
        Activity activity2 = activity;
        SearchApiResult searchApiResult2 = searchApiResult;
        if (PatchProxy.isSupport(new Object[]{activity2, searchApiResult2}, this, f43080a, false, 38140, new Class[]{Activity.class, SearchApiResult.class}, com.bytedance.ies.dmt.ui.widget.c.class)) {
            return (com.bytedance.ies.dmt.ui.widget.c) PatchProxy.accessDispatch(new Object[]{activity2, searchApiResult2}, this, f43080a, false, 38140, new Class[]{Activity.class, SearchApiResult.class}, com.bytedance.ies.dmt.ui.widget.c.class);
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(searchApiResult2, "apiResult");
        SearchNilText searchNilText = searchApiResult2.searchNilText;
        Intrinsics.checkExpressionValueIsNotNull(searchNilText, "nilText");
        String content = searchNilText.getContent();
        String link = searchNilText.getLink();
        Intrinsics.checkExpressionValueIsNotNull(content, "guideline");
        CharSequence charSequence = content;
        Intrinsics.checkExpressionValueIsNotNull(link, "community");
        int indexOf$default = StringsKt.indexOf$default(charSequence, link, 0, false, 6, (Object) null);
        int length = link.length() + indexOf$default;
        SpannableString spannableString = new SpannableString(charSequence);
        if (!TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(link) && indexOf$default >= 0) {
            e.a(spannableString, new d(this, activity2), indexOf$default, length, 34);
        }
        Context context = this.f43082b;
        if (context == null) {
            Intrinsics.throwNpe();
        }
        com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(context).a(2130839718).b((int) C0906R.string.f4486dmt).a((CharSequence) spannableString).a(true).f20493a;
        Intrinsics.checkExpressionValueIsNotNull(cVar, "DmtDefaultStatus.Builder…\n                .build()");
        return cVar;
    }

    @NotNull
    private a b(@Nullable SearchApiResult searchApiResult, @Nullable Exception exc) {
        SearchApiResult searchApiResult2 = searchApiResult;
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{searchApiResult2, exc2}, this, f43080a, false, 38135, new Class[]{SearchApiResult.class, Exception.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{searchApiResult2, exc2}, this, f43080a, false, 38135, new Class[]{SearchApiResult.class, Exception.class}, a.class);
        }
        if (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            switch (((com.ss.android.ugc.aweme.base.api.a.b.a) exc2).getErrorCode()) {
                case SearchBaseFragment.s:
                    return a.NEED_LOGIN;
                case 2484:
                    return a.LIMIT;
            }
        }
        if (searchApiResult2 != null) {
            SearchNilInfo searchNilInfo = searchApiResult2.searchNilInfo;
            if (searchNilInfo != null) {
                if (searchNilInfo.isSensitive()) {
                    return a.SENSITIVE;
                }
                if (searchNilInfo.isHitLimit()) {
                    return a.LIMIT;
                }
            }
        }
        return a.EMPTY;
    }

    @NotNull
    private com.bytedance.ies.dmt.ui.widget.c a(@NotNull Fragment fragment, @NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{fragment, str}, this, f43080a, false, 38138, new Class[]{Fragment.class, String.class}, com.bytedance.ies.dmt.ui.widget.c.class)) {
            return (com.bytedance.ies.dmt.ui.widget.c) PatchProxy.accessDispatch(new Object[]{fragment, str}, this, f43080a, false, 38138, new Class[]{Fragment.class, String.class}, com.bytedance.ies.dmt.ui.widget.c.class);
        }
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(str, "labelName");
        this.f43083d.B();
        com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(this.f43082b).a(2130840199).b((int) C0906R.string.dmw).c(C0906R.string.dmx).d(a.NEED_LOGIN.getType()).a(com.bytedance.ies.dmt.ui.widget.a.SOLID, C0906R.string.dmv, new b(fragment, str)).f20493a;
        Intrinsics.checkExpressionValueIsNotNull(cVar, "loginStatus");
        return cVar;
    }

    public static /* synthetic */ com.bytedance.ies.dmt.ui.widget.c a(c cVar, SearchApiResult searchApiResult, Exception exc, int i) {
        if ((i & 1) != 0) {
            searchApiResult = null;
        }
        if ((i & 2) != 0) {
            exc = null;
        }
        return cVar.a(searchApiResult, exc);
    }
}
