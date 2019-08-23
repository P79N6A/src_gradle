package com.ss.android.ugc.aweme.feed.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/DebugInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDebugInfoAll", "Landroid/widget/RelativeLayout;", "mDebugInfoContainer", "Landroid/widget/ScrollView;", "mDebugSwitch", "Landroid/widget/Switch;", "addView", "", "info", "", "init", "setContent", "debugInfos", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DebugInfoView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46091a;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f46092d = true;

    /* renamed from: e  reason: collision with root package name */
    public static final a f46093e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public ScrollView f46094b;

    /* renamed from: c  reason: collision with root package name */
    public Switch f46095c;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f46096f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/DebugInfoView$Companion;", "", "()V", "mDebugInfoShow", "", "getMDebugInfoShow", "()Z", "setMDebugInfoShow", "(Z)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public static boolean a() {
            return DebugInfoView.f46092d;
        }

        public static void a(boolean z) {
            DebugInfoView.f46092d = z;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DebugInfoView f46098b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f46099c;

        b(DebugInfoView debugInfoView, String str) {
            this.f46098b = debugInfoView;
            this.f46099c = str;
        }

        public final boolean onLongClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f46097a, false, 42476, new Class[]{View.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f46097a, false, 42476, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            }
            Object systemService = this.f46098b.getContext().getSystemService("clipboard");
            if (systemService != null) {
                ClipboardManager clipboardManager = (ClipboardManager) systemService;
                String str2 = this.f46099c;
                if (str2 == null) {
                    str = null;
                } else if (str2 != null) {
                    str = StringsKt.trim((CharSequence) str2).toString();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                clipboardManager.setText(str);
                com.bytedance.ies.dmt.ui.d.a.a(this.f46098b.getContext(), this.f46098b.getResources().getString(C0906R.string.a2_)).a();
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, k = 3, mv = {1, 1, 15})
    static final class c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DebugInfoView f46101b;

        c(DebugInfoView debugInfoView) {
            this.f46101b = debugInfoView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f46100a, false, 42477, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f46100a, false, 42477, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                DebugInfoView.a(this.f46101b).setVisibility(0);
                a.a(true);
                DebugInfoView.b(this.f46101b).setChecked(a.a());
            } else {
                DebugInfoView.a(this.f46101b).setVisibility(8);
                a.a(false);
                DebugInfoView.b(this.f46101b).setChecked(a.a());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DebugInfoView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public static final /* synthetic */ ScrollView a(DebugInfoView debugInfoView) {
        ScrollView scrollView = debugInfoView.f46094b;
        if (scrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDebugInfoContainer");
        }
        return scrollView;
    }

    public static final /* synthetic */ Switch b(DebugInfoView debugInfoView) {
        Switch switchR = debugInfoView.f46095c;
        if (switchR == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDebugSwitch");
        }
        return switchR;
    }

    public final void setContent(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f46091a, false, 42472, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f46091a, false, 42472, new Class[]{String.class}, Void.TYPE);
            return;
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        if (a2.isLogin() && (com.ss.android.ugc.aweme.g.a.a() || StringUtils.equal(com.ss.android.ugc.aweme.framework.core.a.b().f3304b, "lark_inhouse"))) {
            if (com.ss.android.g.a.a()) {
                x a3 = x.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "CommonSharePrefCache.inst()");
                an<Boolean> x = a3.x();
                Intrinsics.checkExpressionValueIsNotNull(x, "CommonSharePrefCache.inst().openDebugText");
                Object c2 = x.c();
                Intrinsics.checkExpressionValueIsNotNull(c2, "CommonSharePrefCache.inst().openDebugText.cache");
                if (!((Boolean) c2).booleanValue()) {
                    return;
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f46091a, false, 42471, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46091a, false, 42471, new Class[0], Void.TYPE);
            } else {
                LayoutInflater.from(getContext()).inflate(C0906R.layout.aql, this, true);
                View findViewById = findViewById(C0906R.id.cxv);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.sv_debugInfoContainer)");
                this.f46094b = (ScrollView) findViewById;
                View findViewById2 = findViewById(C0906R.id.cy8);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.switch_debugInfoView)");
                this.f46095c = (Switch) findViewById2;
                View findViewById3 = findViewById(C0906R.id.cfv);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.rl_debugInfoAll)");
                this.f46096f = (RelativeLayout) findViewById3;
                Switch switchR = this.f46095c;
                if (switchR == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDebugSwitch");
                }
                switchR.setOnCheckedChangeListener(new c(this));
            }
            RelativeLayout relativeLayout = this.f46096f;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDebugInfoAll");
            }
            relativeLayout.setVisibility(0);
            Switch switchR2 = this.f46095c;
            if (switchR2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDebugSwitch");
            }
            switchR2.setChecked(f46092d);
            if (f46092d) {
                ScrollView scrollView = this.f46094b;
                if (scrollView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDebugInfoContainer");
                }
                scrollView.setVisibility(0);
                if (PatchProxy.isSupport(new Object[]{str}, this, f46091a, false, 42473, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f46091a, false, 42473, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                DmtTextView dmtTextView = new DmtTextView(getContext());
                dmtTextView.setText(str);
                dmtTextView.setTextColor(getResources().getColor(C0906R.color.hb));
                dmtTextView.setGravity(getLeft());
                dmtTextView.setTextAlignment(5);
                dmtTextView.setLineSpacing(0.0f, 1.5f);
                dmtTextView.setTextDirection(5);
                ScrollView scrollView2 = this.f46094b;
                if (scrollView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDebugInfoContainer");
                }
                scrollView2.removeAllViews();
                ScrollView scrollView3 = this.f46094b;
                if (scrollView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDebugInfoContainer");
                }
                scrollView3.addView(dmtTextView);
                dmtTextView.setOnLongClickListener(new b(this, str));
                return;
            }
            ScrollView scrollView4 = this.f46094b;
            if (scrollView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDebugInfoContainer");
            }
            scrollView4.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
