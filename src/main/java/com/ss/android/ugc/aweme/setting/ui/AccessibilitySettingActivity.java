package com.ss.android.ugc.aweme.setting.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItem;
import com.bytedance.ies.dmt.ui.widget.setting.a;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.livewallpaper.c.e;
import com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity;
import com.ss.android.ugc.aweme.setting.f;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u0004H\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/ui/AccessibilitySettingActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeBaseActivity;", "()V", "clickDynamicCover", "", "clickLiveWallpaper", "getLayout", "", "initData", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setStatusBarColor", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AccessibilitySettingActivity extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64095a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f64096b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccessibilitySettingActivity f64098b;

        a(AccessibilitySettingActivity accessibilitySettingActivity) {
            this.f64098b = accessibilitySettingActivity;
        }

        public final void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f64097a, false, 72386, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f64097a, false, 72386, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            AccessibilitySettingActivity accessibilitySettingActivity = this.f64098b;
            if (PatchProxy.isSupport(new Object[0], accessibilitySettingActivity, AccessibilitySettingActivity.f64095a, false, 72381, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], accessibilitySettingActivity, AccessibilitySettingActivity.f64095a, false, 72381, new Class[0], Void.TYPE);
                return;
            }
            CommonItemView commonItemView = (CommonItemView) accessibilitySettingActivity.a(C0906R.id.a1f);
            Intrinsics.checkExpressionValueIsNotNull(commonItemView, "cover_item");
            CommonItemView commonItemView2 = (CommonItemView) accessibilitySettingActivity.a(C0906R.id.a1f);
            Intrinsics.checkExpressionValueIsNotNull(commonItemView2, "cover_item");
            commonItemView.setChecked(!commonItemView2.c());
            Context context = accessibilitySettingActivity;
            CommonItemView commonItemView3 = (CommonItemView) accessibilitySettingActivity.a(C0906R.id.a1f);
            Intrinsics.checkExpressionValueIsNotNull(commonItemView3, "cover_item");
            if (commonItemView3.c()) {
                str = "on";
            } else {
                str = "off";
            }
            com.ss.android.common.lib.a.a(context, "dynamic_cover", str);
            CommonItemView commonItemView4 = (CommonItemView) accessibilitySettingActivity.a(C0906R.id.a1f);
            Intrinsics.checkExpressionValueIsNotNull(commonItemView4, "cover_item");
            f.a(context, commonItemView4.c());
            CommonItemView commonItemView5 = (CommonItemView) accessibilitySettingActivity.a(C0906R.id.a1f);
            Intrinsics.checkExpressionValueIsNotNull(commonItemView5, "cover_item");
            bg.a(new com.ss.android.ugc.aweme.challenge.a.c(true ^ commonItemView5.c() ? 1 : 0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "OnSettingItemClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements a.C0015a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64099a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccessibilitySettingActivity f64100b;

        b(AccessibilitySettingActivity accessibilitySettingActivity) {
            this.f64100b = accessibilitySettingActivity;
        }

        public final void a(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f64099a, false, 72387, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f64099a, false, 72387, new Class[]{View.class}, Void.TYPE);
            } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                AccessibilitySettingActivity accessibilitySettingActivity = this.f64100b;
                if (PatchProxy.isSupport(new Object[0], accessibilitySettingActivity, AccessibilitySettingActivity.f64095a, false, 72382, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], accessibilitySettingActivity, AccessibilitySettingActivity.f64095a, false, 72382, new Class[0], Void.TYPE);
                    return;
                }
                r.a("live_photo_manage", (Map) d.a().a("enter_from", "accessibility").f34114b);
                accessibilitySettingActivity.startActivity(new Intent(accessibilitySettingActivity, LocalLiveWallPaperActivity.class));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccessibilitySettingActivity f64102b;

        c(AccessibilitySettingActivity accessibilitySettingActivity) {
            this.f64102b = accessibilitySettingActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f64101a, false, 72388, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f64101a, false, 72388, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f64102b.finish();
        }
    }

    public final int a() {
        return C0906R.layout.a6;
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64095a, false, 72384, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64095a, false, 72384, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f64096b == null) {
            this.f64096b = new HashMap();
        }
        View view = (View) this.f64096b.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f64096b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f64095a, false, 72383, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64095a, false, 72383, new Class[0], Void.TYPE);
            return;
        }
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f64095a, false, 72380, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64095a, false, 72380, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.b()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) C0906R.color.w1).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64095a, false, 72377, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64095a, false, 72377, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f64095a, false, 72378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64095a, false, 72378, new Class[0], Void.TYPE);
        } else {
            View findViewById = findViewById(C0906R.id.title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<TextView>(R.id.title)");
            ((TextView) findViewById).setText(getString(C0906R.string.bb));
            if (com.ss.android.ugc.aweme.common.h.c.a()) {
                CommonItemView commonItemView = (CommonItemView) a(C0906R.id.a1f);
                Intrinsics.checkExpressionValueIsNotNull(commonItemView, "cover_item");
                commonItemView.setVisibility(8);
            }
            ((CommonItemView) a(C0906R.id.a1f)).setOnClickListener(new a(this));
            if (com.ss.android.g.a.b()) {
                ((RelativeLayout) a(C0906R.id.chu)).setBackgroundColor(getResources().getColor(C0906R.color.a25));
                a(C0906R.id.d3v).setBackgroundColor(getResources().getColor(C0906R.color.a17));
            }
            if (e.c()) {
                EffectiveSettingItem effectiveSettingItem = (EffectiveSettingItem) a(C0906R.id.bjn);
                Intrinsics.checkExpressionValueIsNotNull(effectiveSettingItem, "local_livewallpaper");
                effectiveSettingItem.setVisibility(8);
            } else {
                EffectiveSettingItem effectiveSettingItem2 = (EffectiveSettingItem) a(C0906R.id.bjn);
                Intrinsics.checkExpressionValueIsNotNull(effectiveSettingItem2, "local_livewallpaper");
                effectiveSettingItem2.setVisibility(0);
                ((EffectiveSettingItem) a(C0906R.id.bjn)).setOnSettingItemClickListener(new b(this));
            }
            findViewById(C0906R.id.ix).setOnClickListener(new c(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f64095a, false, 72379, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64095a, false, 72379, new Class[0], Void.TYPE);
            return;
        }
        CommonItemView commonItemView2 = (CommonItemView) a(C0906R.id.a1f);
        Intrinsics.checkExpressionValueIsNotNull(commonItemView2, "cover_item");
        commonItemView2.setChecked(f.a(this));
    }
}
