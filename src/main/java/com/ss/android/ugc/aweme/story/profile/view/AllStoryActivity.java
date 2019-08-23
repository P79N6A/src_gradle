package com.ss.android.ugc.aweme.story.profile.view;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.profile.j;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "dataCenter", "Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "widgetManager", "Lcom/ss/android/ugc/aweme/arch/widgets/base/WidgetManager;", "initData", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setStatusBarColor", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AllStoryActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73305a = null;
    @NotNull
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public static final String f73306b = f73306b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f73307c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private WidgetManager f73308d;

    /* renamed from: e  reason: collision with root package name */
    private DataCenter f73309e;

    /* renamed from: f  reason: collision with root package name */
    private User f73310f;
    private HashMap g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryActivity$Companion;", "", "()V", "USER", "", "startActivity", "", "activity", "Landroid/app/Activity;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73311a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73312a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AllStoryActivity f73313b;

        b(AllStoryActivity allStoryActivity) {
            this.f73313b = allStoryActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73312a, false, 84912, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73312a, false, 84912, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f73313b.finish();
        }
    }

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f73305a, false, 84906, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f73305a, false, 84906, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.g == null) {
            this.g = new HashMap();
        }
        View view = (View) this.g.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f73305a, false, 84909, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73305a, false, 84909, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73305a, false, 84910, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73305a, false, 84910, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f73305a, false, 84904, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73305a, false, 84904, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f73305a, false, 84902, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f73305a, false, 84902, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity", "onCreate", true);
        super.onCreate(bundle);
        requestDisableOptimizeViewHierarchy();
        setContentView((int) C0906R.layout.a9);
        Serializable serializableExtra = getIntent().getSerializableExtra(f73306b);
        if (!(serializableExtra instanceof User)) {
            serializableExtra = null;
        }
        this.f73310f = (User) serializableExtra;
        if (PatchProxy.isSupport(new Object[0], this, f73305a, false, 84903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73305a, false, 84903, new Class[0], Void.TYPE);
        } else {
            ((DmtTextView) a(C0906R.id.dkk)).setFontType(c.f20595b);
            DmtTextView dmtTextView = (DmtTextView) a(C0906R.id.dkk);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "tv_title");
            TextPaint paint = dmtTextView.getPaint();
            Intrinsics.checkExpressionValueIsNotNull(paint, "tv_title.paint");
            paint.setFakeBoldText(true);
            ((ImageView) a(C0906R.id.ayw)).setOnClickListener(new b(this));
            if (Build.VERSION.SDK_INT >= 19) {
                View findViewById = findViewById(C0906R.id.cv0);
                if (findViewById != null) {
                    ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = StatusBarUtils.getStatusBarHeight(this);
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f73305a, false, 84905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73305a, false, 84905, new Class[0], Void.TYPE);
        } else {
            FragmentActivity fragmentActivity = this;
            DataCenter a2 = DataCenter.a(ViewModelProviders.of(fragmentActivity), (LifecycleOwner) this);
            Intrinsics.checkExpressionValueIsNotNull(a2, "DataCenter.create(ViewMo…Providers.of(this), this)");
            this.f73309e = a2;
            WidgetManager a3 = WidgetManager.a(fragmentActivity, findViewById(C0906R.id.cga));
            Intrinsics.checkExpressionValueIsNotNull(a3, "WidgetManager.of(this, rootView)");
            this.f73308d = a3;
            WidgetManager widgetManager = this.f73308d;
            if (widgetManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetManager");
            }
            DataCenter dataCenter = this.f73309e;
            if (dataCenter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dataCenter");
            }
            widgetManager.a(dataCenter);
            WidgetManager widgetManager2 = this.f73308d;
            if (widgetManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetManager");
            }
            widgetManager2.a((int) C0906R.id.c76, (Widget) new AllStoryWidget());
            DataCenter dataCenter2 = this.f73309e;
            if (dataCenter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dataCenter");
            }
            dataCenter2.a(j.f61548a, (Object) this.f73310f);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity", "onCreate", false);
    }
}
