package com.ss.android.ugc.aweme.commercialize.loft;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.loft.LoftPlayFragment;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/LoftPlayActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "()V", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "finish", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LoftPlayActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39096a;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public static Bitmap f39097c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f39098d = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public View f39099b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/LoftPlayActivity$Companion;", "", "()V", "EVENT_TYPE", "", "VIEW_TYPE_COUNT", "", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "startLoftPlayActivity", "", "context", "Landroid/content/Context;", "loftId", "pageType", "bmp", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Landroid/graphics/Bitmap;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39100a;

        private a() {
        }

        @Nullable
        public static Bitmap a() {
            return LoftPlayActivity.f39097c;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39096a, false, 31053, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39096a, false, 31053, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f39096a, false, 31049, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39096a, false, 31049, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f39099b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        view.setBackgroundColor(getResources().getColor(C0906R.color.a7l));
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f39096a, false, 31048, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39096a, false, 31048, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity", "onResume", true);
        super.onResume();
        View view = this.f39099b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        view.setBackgroundColor(getResources().getColor(C0906R.color.d5));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity", "onResume", false);
    }

    public final void setRootView(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f39096a, false, 31046, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f39096a, false, 31046, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "<set-?>");
        this.f39099b = view2;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f39096a, false, 31047, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f39096a, false, 31047, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView((int) C0906R.layout.cb);
        Intent intent = getIntent();
        if (intent != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            LoftPlayFragment.a aVar = LoftPlayFragment.f2903f;
            String stringExtra = intent.getStringExtra("loft_event_type");
            int intExtra = intent.getIntExtra("loft_page_type", -1);
            String stringExtra2 = intent.getStringExtra("loft_id");
            Intrinsics.checkExpressionValueIsNotNull(stringExtra2, "it.getStringExtra(LoftPlayFragment.LOFT_ID)");
            beginTransaction.add((int) C0906R.id.z1, (Fragment) aVar.a(stringExtra, intExtra, stringExtra2, true)).commitAllowingStateLoss();
        }
        View findViewById = findViewById(C0906R.id.ci4);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.root_view)");
        this.f39099b = findViewById;
        v.b((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity", "onCreate", false);
    }

    @JvmStatic
    public static final void a(@Nullable Context context, @NotNull String str, @Nullable Integer num, @Nullable Bitmap bitmap) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, num, bitmap}, null, f39096a, true, 31052, new Class[]{Context.class, String.class, Integer.class, Bitmap.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, num, bitmap};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39096a, true, 31052, new Class[]{Context.class, String.class, Integer.class, Bitmap.class}, Void.TYPE);
            return;
        }
        a aVar = f39098d;
        if (PatchProxy.isSupport(new Object[]{context2, str2, num, bitmap}, aVar, a.f39100a, false, 31054, new Class[]{Context.class, String.class, Integer.class, Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, num, bitmap}, aVar, a.f39100a, false, 31054, new Class[]{Context.class, String.class, Integer.class, Bitmap.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "loftId");
        if (context2 != null) {
            f39097c = bitmap;
            Intent intent = new Intent(context2, LoftPlayActivity.class);
            intent.putExtra("loft_event_type", "discovery_second_floor");
            intent.putExtra("loft_page_type", num);
            intent.putExtra("loft_id", str2);
            context2.startActivity(intent);
        }
    }
}
