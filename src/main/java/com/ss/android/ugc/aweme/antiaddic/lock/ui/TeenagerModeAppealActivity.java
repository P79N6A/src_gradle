package com.ss.android.ugc.aweme.antiaddic.lock.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.d;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.utils.v;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0007H\u0014J\b\u0010\u0012\u001a\u00020\u0007H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/ui/TeenagerModeAppealActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeBaseActivity;", "()V", "mType", "", "getLayout", "initView", "", "isRegisterEventBus", "", "onBackPressed", "onCloseAntiAddictionEvent", "event", "Lcom/ss/android/ugc/aweme/antiaddic/event/CloseAntiAddictionTipEvent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setStatusBarColor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TeenagerModeAppealActivity extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2603a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f2604b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private int f2605c = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/ui/TeenagerModeAppealActivity$Companion;", "", "()V", "APPEAL_TYPE", "", "TYPE_ANTI_ADDIC", "", "TYPE_LOGOUT", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33465a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f33466b = new b();

        b() {
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f33465a, false, 21914, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f33465a, false, 21914, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            d.a("teen_mode", "appeal");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33467a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TeenagerModeAppealActivity f33468b;

        c(TeenagerModeAppealActivity teenagerModeAppealActivity) {
            this.f33468b = teenagerModeAppealActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f33467a, false, 21915, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f33467a, false, 21915, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f33468b.finish();
        }
    }

    public final int a() {
        return C0906R.layout.e6;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2603a, false, 21912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2603a, false, 21912, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2603a, false, 21913, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2603a, false, 21913, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f2603a, false, 21908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2603a, false, 21908, new Class[0], Void.TYPE);
        } else if (this.f2605c != 1) {
            super.onBackPressed();
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2603a, false, 21907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2603a, false, 21907, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f2603a, false, 21906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2603a, false, 21906, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    @Subscribe(a = ThreadMode.MAIN)
    public final void onCloseAntiAddictionEvent(@NotNull com.ss.android.ugc.aweme.antiaddic.b.a aVar) {
        com.ss.android.ugc.aweme.antiaddic.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2603a, false, 21909, new Class[]{com.ss.android.ugc.aweme.antiaddic.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2603a, false, 21909, new Class[]{com.ss.android.ugc.aweme.antiaddic.b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
        finish();
    }

    public final void onCreate(@Nullable Bundle bundle) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2603a, false, 21904, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2603a, false, 21904, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f2605c = getIntent().getIntExtra("type", -1);
        if (PatchProxy.isSupport(new Object[0], this, f2603a, false, 21905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2603a, false, 21905, new Class[0], Void.TYPE);
        } else {
            View findViewById = findViewById(C0906R.id.bkn);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.logout_appeal_button)");
            ((TextView) findViewById).setOnClickListener(b.f33466b);
            View findViewById2 = findViewById(C0906R.id.czv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.teenager_logout_whiteclose)");
            ImageView imageView = (ImageView) findViewById2;
            imageView.setOnClickListener(new c(this));
            if (this.f2605c != 1) {
                z = true;
            } else {
                z = false;
            }
            v.a(z, imageView);
            View findViewById3 = findViewById(C0906R.id.fe);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.appeal_title)");
            TextView textView = (TextView) findViewById3;
            View findViewById4 = findViewById(C0906R.id.fd);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.appeal_content)");
            TextView textView2 = (TextView) findViewById4;
            if (this.f2605c == 1) {
                textView.setText(C0906R.string.fc);
                textView2.setText(C0906R.string.fa);
            } else if (this.f2605c == 2) {
                textView.setText(C0906R.string.b98);
                textView2.setText(C0906R.string.cil);
            }
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                double screenHeight = (double) UIUtils.getScreenHeight(this);
                Double.isNaN(screenHeight);
                layoutParams2.topMargin = (int) (screenHeight * 0.3d);
                textView.setLayoutParams(layoutParams2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity", "onCreate", false);
    }
}
