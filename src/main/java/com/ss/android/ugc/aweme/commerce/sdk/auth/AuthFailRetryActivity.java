package com.ss.android.ugc.aweme.commerce.sdk.auth;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/auth/AuthFailRetryActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "mAgainBtn", "Landroid/view/View;", "mBackView", "Landroid/widget/ImageView;", "bindViews", "", "findViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class AuthFailRetryActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37694a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f37695b;

    /* renamed from: c  reason: collision with root package name */
    private View f37696c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37697a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AuthFailRetryActivity f37698b;

        a(AuthFailRetryActivity authFailRetryActivity) {
            this.f37698b = authFailRetryActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37697a, false, 29251, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37697a, false, 29251, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.commerce.sdk.c.b.f37709b.a();
            this.f37698b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AuthFailRetryActivity f37700b;

        b(AuthFailRetryActivity authFailRetryActivity) {
            this.f37700b = authFailRetryActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37699a, false, 29252, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37699a, false, 29252, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37700b.finish();
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f37694a, false, 29249, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37694a, false, 29249, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.sdk.auth.AuthFailRetryActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.sdk.auth.AuthFailRetryActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37694a, false, 29250, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37694a, false, 29250, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.sdk.auth.AuthFailRetryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37694a, false, 29244, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f37694a, false, 29244, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.sdk.auth.AuthFailRetryActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bo);
        if (PatchProxy.isSupport(new Object[0], this, f37694a, false, 29246, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37694a, false, 29246, new Class[0], Void.TYPE);
        } else {
            View findViewById = findViewById(C0906R.id.cak);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.real_auth_again_btn)");
            this.f37696c = findViewById;
            View findViewById2 = findViewById(C0906R.id.ayw);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.iv_back)");
            this.f37695b = (ImageView) findViewById2;
        }
        if (PatchProxy.isSupport(new Object[0], this, f37694a, false, 29245, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37694a, false, 29245, new Class[0], Void.TYPE);
        } else {
            View view = this.f37696c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAgainBtn");
            }
            view.setOnClickListener(new a(this));
            ImageView imageView = this.f37695b;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBackView");
            }
            imageView.setOnClickListener(new b(this));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.sdk.auth.AuthFailRetryActivity", "onCreate", false);
    }
}
