package com.ss.android.ugc.aweme.commercialize.star;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.utils.u;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/star/StarConfirmActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "postData", "confirm", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StarConfirmActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39469a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f39470b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/star/StarConfirmActivity$Companion;", "", "()V", "CONFIRM", "", "MARGIN", "", "RESULT_STAR_REQ", "", "startForResult", "", "fragment", "Landroid/support/v4/app/Fragment;", "requestCode", "confirmed", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39471a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39472a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StarConfirmActivity f39473b;

        b(StarConfirmActivity starConfirmActivity) {
            this.f39473b = starConfirmActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39472a, false, 32072, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39472a, false, 32072, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39473b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StarConfirmActivity f39475b;

        c(StarConfirmActivity starConfirmActivity) {
            this.f39475b = starConfirmActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39474a, false, 32073, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39474a, false, 32073, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39475b.a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StarConfirmActivity f39477b;

        d(StarConfirmActivity starConfirmActivity) {
            this.f39477b = starConfirmActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39476a, false, 32074, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39476a, false, 32074, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39477b.a(false);
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f39469a, false, 32069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39469a, false, 32069, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.star.StarConfirmActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.star.StarConfirmActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39469a, false, 32070, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39469a, false, 32070, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.star.StarConfirmActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f39469a, false, 32064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39469a, false, 32064, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39469a, false, 32065, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39469a, false, 32065, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("confirm", z);
        setResult(-1, intent);
        finish();
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f39469a, false, 32063, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f39469a, false, 32063, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.star.StarConfirmActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.e1);
        if (getIntent().getBooleanExtra("confirm", false)) {
            View findViewById = findViewById(C0906R.id.ay8);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<ImageView>(R.id.item_yes_image)");
            ((ImageView) findViewById).setVisibility(0);
            ((ImageView) findViewById(C0906R.id.ay8)).setImageResource(2130839394);
        } else {
            View findViewById2 = findViewById(C0906R.id.aws);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById<ImageView>(R.id.item_no_image)");
            ((ImageView) findViewById2).setVisibility(0);
            ((ImageView) findViewById(C0906R.id.aws)).setImageResource(2130839394);
        }
        findViewById(C0906R.id.iu).setOnClickListener(new b(this));
        findViewById(C0906R.id.ay7).setOnClickListener(new c(this));
        if (com.ss.android.g.a.a()) {
            if (TextUtils.isEmpty(a.c())) {
                View findViewById3 = findViewById(C0906R.id.dg5);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "tvPermissionOpenText");
                ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = u.a(16.0d);
                    marginLayoutParams.bottomMargin = u.a(16.0d);
                    ImageView imageView = (ImageView) findViewById(C0906R.id.ay8);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "itemYesImage");
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = u.a(16.0d);
                        marginLayoutParams2.bottomMargin = u.a(16.0d);
                        ImageView imageView2 = (ImageView) findViewById(C0906R.id.aws);
                        Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemNoImage");
                        ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                        if (layoutParams3 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                            marginLayoutParams3.topMargin = u.a(16.0d);
                            marginLayoutParams3.bottomMargin = u.a(16.0d);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                View findViewById4 = findViewById(C0906R.id.dg6);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById<View>(R.id.tv_permission_open_toast)");
                findViewById4.setVisibility(0);
                View findViewById5 = findViewById(C0906R.id.dg6);
                Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById<DmtTextView…tv_permission_open_toast)");
                ((DmtTextView) findViewById5).setText(a.c());
            }
        }
        findViewById(C0906R.id.awr).setOnClickListener(new d(this));
        ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).fitsSystemWindows(true).statusBarDarkFont(com.ss.android.g.a.b()).init();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.star.StarConfirmActivity", "onCreate", false);
    }
}
