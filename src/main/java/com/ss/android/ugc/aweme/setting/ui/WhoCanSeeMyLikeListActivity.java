package com.ss.android.ugc.aweme.setting.ui;

import android.os.Bundle;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import com.ss.android.ugc.aweme.setting.serverpush.b.d;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0014J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/ui/WhoCanSeeMyLikeListActivity;", "Lcom/ss/android/ugc/aweme/setting/ui/BaseControlSettingActivity;", "()V", "mPushChangePresenter", "Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;", "getMPushChangePresenter", "()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;", "mPushChangePresenter$delegate", "Lkotlin/Lazy;", "bindSettingValueByTag", "", "getSettingName", "", "initData", "initView", "onDestroy", "sentChange", "value", "", "setCheckedState", "tag", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class WhoCanSeeMyLikeListActivity extends BaseControlSettingActivity {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f64389e;

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f64390f = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WhoCanSeeMyLikeListActivity.class), "mPushChangePresenter", "getMPushChangePresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;"))};
    @NotNull
    public static final a.C0028a g = new b();
    public static final a h = new a((byte) 0);
    private final Lazy i = LazyKt.lazy(new c(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/ui/WhoCanSeeMyLikeListActivity$Companion;", "", "()V", "SETTING_NAME", "", "callback", "Lcom/ss/android/ugc/aweme/setting/serverpush/PushSettingsManager$PushSettingCallback;", "getCallback", "()Lcom/ss/android/ugc/aweme/setting/serverpush/PushSettingsManager$PushSettingCallback;", "launchActivityForResult", "", "context", "Landroid/app/Activity;", "currentValue", "", "requestCode", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64391a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/setting/ui/WhoCanSeeMyLikeListActivity$Companion$callback$1", "Lcom/ss/android/ugc/aweme/setting/serverpush/PushSettingsManager$PushSettingCallback;", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements a.C0028a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64392a;

        public final void a(@NotNull Exception exc) {
            Exception exc2 = exc;
            if (PatchProxy.isSupport(new Object[]{exc2}, this, f64392a, false, 72879, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc2}, this, f64392a, false, 72879, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(exc2, "e");
        }

        b() {
        }

        public final void a(@NotNull com.ss.android.ugc.aweme.setting.serverpush.a.c cVar) {
            com.ss.android.ugc.aweme.setting.serverpush.a.c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f64392a, false, 72878, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar2}, this, f64392a, false, 72878, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "settings");
            x a2 = x.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "CommonSharePrefCache.inst()");
            an<Integer> g = a2.g();
            Intrinsics.checkExpressionValueIsNotNull(g, "CommonSharePrefCache.ins….whoCanSeeMyLikeListValue");
            g.a(Integer.valueOf(cVar2.v));
            bg.a(new af());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<d> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ WhoCanSeeMyLikeListActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(WhoCanSeeMyLikeListActivity whoCanSeeMyLikeListActivity) {
            super(0);
            this.this$0 = whoCanSeeMyLikeListActivity;
        }

        @NotNull
        public final d invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72880, new Class[0], d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72880, new Class[0], d.class);
            }
            d dVar = new d();
            dVar.a(this.this$0);
            return dVar;
        }
    }

    private final d g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f64389e, false, 72865, new Class[0], d.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f64389e, false, 72865, new Class[0], d.class);
        } else {
            value = this.i.getValue();
        }
        return (d) value;
    }

    @NotNull
    public final String e() {
        return "favorite_permission";
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64389e, false, 72874, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64389e, false, 72874, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onCreate", false);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64389e, false, 72875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64389e, false, 72875, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64389e, false, 72876, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64389e, false, 72876, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64389e, false, 72867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64389e, false, 72867, new Class[0], Void.TYPE);
            return;
        }
        this.f64104b = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f64389e, false, 72866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64389e, false, 72866, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        g().k();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f64389e, false, 72869, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64389e, false, 72869, new Class[0], Void.TYPE);
            return;
        }
        CommonItemView commonItemView = this.mEveryoneItem;
        Intrinsics.checkExpressionValueIsNotNull(commonItemView, "mEveryoneItem");
        commonItemView.setTag(0);
        CommonItemView commonItemView2 = this.mFriendsItem;
        Intrinsics.checkExpressionValueIsNotNull(commonItemView2, "mFriendsItem");
        commonItemView2.setTag(1);
        CommonItemView commonItemView3 = this.mOffItem;
        Intrinsics.checkExpressionValueIsNotNull(commonItemView3, "mOffItem");
        commonItemView3.setTag(3);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f64389e, false, 72868, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64389e, false, 72868, new Class[0], Void.TYPE);
            return;
        }
        x a2 = x.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "CommonSharePrefCache.inst()");
        an<Boolean> h2 = a2.h();
        Intrinsics.checkExpressionValueIsNotNull(h2, "CommonSharePrefCache.ins…redLikeSelfVisibleSetting");
        h2.a(Boolean.TRUE);
        TextView textView = this.mTitle;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mTitle");
        textView.setText(getString(C0906R.string.dtq));
        CommonItemView commonItemView = this.mOffItem;
        Intrinsics.checkExpressionValueIsNotNull(commonItemView, "mOffItem");
        commonItemView.setVisibility(8);
        this.mFriendsItem.setLeftText(getString(C0906R.string.bk_));
        switch (this.f64104b) {
            case 0:
                a(this.mEveryoneItem);
                return;
            case 1:
                a(this.mFriendsItem);
                break;
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f64389e, false, 72864, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f64389e, false, 72864, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 != 3) {
            switch (i2) {
                case 0:
                    a(this.mEveryoneItem);
                    return;
                case 1:
                    a(this.mFriendsItem);
                    return;
            }
        } else {
            a(this.mOffItem);
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f64389e, false, 72870, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f64389e, false, 72870, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        g().a(e(), Integer.valueOf(i2));
    }
}
