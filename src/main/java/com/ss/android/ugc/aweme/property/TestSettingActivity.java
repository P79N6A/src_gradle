package com.ss.android.ugc.aweme.property;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.property.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J«\u0001\u0010\u0003\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u0002H\u00050\f2#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00060\f28\b\u0006\u0010\u0012\u001a2\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00040\u0013H\bJ\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J#\u0010\u0019\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/property/TestSettingActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "()V", "addTestItem", "", "T", "U", "property", "Lcom/ss/android/ugc/aweme/property/AVSettings$Property;", "hintStr", "", "readTransform", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "valBeforeShow", "saveTransform", "valBeforeSave", "onChange", "Lkotlin/Function2;", "oldValue", "newValue", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "valStrToOtherType", "v", "(Lcom/ss/android/ugc/aweme/property/AVSettings$Property;Ljava/lang/String;)Ljava/lang/Object;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TestSettingActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63243a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "U", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "OnSettingItemClick", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$switchView$1$1", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$$inlined$apply$lambda$1"}, k = 3, mv = {1, 1, 15})
    public static final class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63244a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SettingItemSwitch f63245b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f63246c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63247d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e.a f63248e;

        public a(SettingItemSwitch settingItemSwitch, Object obj, String str, e.a aVar) {
            this.f63245b = settingItemSwitch;
            this.f63246c = obj;
            this.f63247d = str;
            this.f63248e = aVar;
        }

        public final void OnSettingItemClick(View view) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{view}, this, f63244a, false, 70302, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63244a, false, 70302, new Class[]{View.class}, Void.TYPE);
                return;
            }
            boolean z2 = !this.f63245b.isChecked();
            this.f63245b.setChecked(z2);
            e.a aVar = this.f63248e;
            if (z2) {
                z = false;
            }
            l.a(aVar, Boolean.valueOf(z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "U", "it", "", "invoke", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$rangeView$1$1", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$$inlined$apply$lambda$2"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $hintStr$inlined;
        final /* synthetic */ Object $oldValue;
        final /* synthetic */ e.a $property$inlined;
        final /* synthetic */ n $this_apply;
        final /* synthetic */ TestSettingActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(n nVar, Object obj, TestSettingActivity testSettingActivity, String str, e.a aVar) {
            super(1);
            this.$this_apply = nVar;
            this.$oldValue = obj;
            this.this$0 = testSettingActivity;
            this.$hintStr$inlined = str;
            this.$property$inlined = aVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 70303, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 70303, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, AdvanceSetting.NETWORK_TYPE);
            try {
                l.a(this.$property$inlined, Boolean.valueOf(!((Boolean) this.this$0.a(this.$property$inlined, str)).booleanValue()));
            } catch (NumberFormatException unused) {
                com.bytedance.ies.dmt.ui.d.a.b(this.$this_apply.getContext(), "参数格式错误").a();
            } catch (IllegalArgumentException unused2) {
                com.bytedance.ies.dmt.ui.d.a.b(this.$this_apply.getContext(), "参数区间错误").a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "U", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "OnSettingItemClick", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$switchView$1$1", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$$inlined$apply$lambda$3"}, k = 3, mv = {1, 1, 15})
    public static final class c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SettingItemSwitch f63250b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f63251c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63252d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e.a f63253e;

        public c(SettingItemSwitch settingItemSwitch, Object obj, String str, e.a aVar) {
            this.f63250b = settingItemSwitch;
            this.f63251c = obj;
            this.f63252d = str;
            this.f63253e = aVar;
        }

        public final void OnSettingItemClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63249a, false, 70304, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63249a, false, 70304, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Boolean valueOf = Boolean.valueOf(!this.f63250b.isChecked());
            this.f63250b.setChecked(valueOf.booleanValue());
            l.a(this.f63253e, valueOf);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "U", "it", "", "invoke", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$rangeView$1$1", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$$inlined$apply$lambda$4"}, k = 3, mv = {1, 1, 15})
    public static final class d extends Lambda implements Function1<String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $hintStr$inlined;
        final /* synthetic */ Object $oldValue;
        final /* synthetic */ e.a $property$inlined;
        final /* synthetic */ n $this_apply;
        final /* synthetic */ TestSettingActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(n nVar, Object obj, TestSettingActivity testSettingActivity, String str, e.a aVar) {
            super(1);
            this.$this_apply = nVar;
            this.$oldValue = obj;
            this.this$0 = testSettingActivity;
            this.$hintStr$inlined = str;
            this.$property$inlined = aVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 70305, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 70305, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, AdvanceSetting.NETWORK_TYPE);
            try {
                l.a(this.$property$inlined, this.this$0.a(this.$property$inlined, str));
            } catch (NumberFormatException unused) {
                com.bytedance.ies.dmt.ui.d.a.b(this.$this_apply.getContext(), "参数格式错误").a();
            } catch (IllegalArgumentException unused2) {
                com.bytedance.ies.dmt.ui.d.a.b(this.$this_apply.getContext(), "参数区间错误").a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "U", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "OnSettingItemClick", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$switchView$1$1", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$$inlined$apply$lambda$5"}, k = 3, mv = {1, 1, 15})
    public static final class e implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63254a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SettingItemSwitch f63255b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f63256c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63257d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e.a f63258e;

        public e(SettingItemSwitch settingItemSwitch, Object obj, String str, e.a aVar) {
            this.f63255b = settingItemSwitch;
            this.f63256c = obj;
            this.f63257d = str;
            this.f63258e = aVar;
        }

        public final void OnSettingItemClick(View view) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{view}, this, f63254a, false, 70306, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63254a, false, 70306, new Class[]{View.class}, Void.TYPE);
                return;
            }
            boolean z = !this.f63255b.isChecked();
            this.f63255b.setChecked(z);
            e.a aVar = this.f63258e;
            if (z) {
                i = 8;
            }
            l.a(aVar, Integer.valueOf(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "U", "it", "", "invoke", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$rangeView$1$1", "com/ss/android/ugc/aweme/property/TestSettingActivity$addTestItem$$inlined$apply$lambda$6"}, k = 3, mv = {1, 1, 15})
    public static final class f extends Lambda implements Function1<String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $hintStr$inlined;
        final /* synthetic */ Object $oldValue;
        final /* synthetic */ e.a $property$inlined;
        final /* synthetic */ n $this_apply;
        final /* synthetic */ TestSettingActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(n nVar, Object obj, TestSettingActivity testSettingActivity, String str, e.a aVar) {
            super(1);
            this.$this_apply = nVar;
            this.$oldValue = obj;
            this.this$0 = testSettingActivity;
            this.$hintStr$inlined = str;
            this.$property$inlined = aVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 70307, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 70307, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, AdvanceSetting.NETWORK_TYPE);
            try {
                Object a2 = this.this$0.a(this.$property$inlined, str);
                e.a aVar = this.$property$inlined;
                boolean booleanValue = ((Boolean) a2).booleanValue();
                if (booleanValue) {
                    i = 8;
                } else if (booleanValue) {
                    throw new NoWhenBranchMatchedException();
                }
                l.a(aVar, Integer.valueOf(i));
            } catch (NumberFormatException unused) {
                com.bytedance.ies.dmt.ui.d.a.b(this.$this_apply.getContext(), "参数格式错误").a();
            } catch (IllegalArgumentException unused2) {
                com.bytedance.ies.dmt.ui.d.a.b(this.$this_apply.getContext(), "参数区间错误").a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TestSettingActivity f63260b;

        g(TestSettingActivity testSettingActivity) {
            this.f63260b = testSettingActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63259a, false, 70308, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63259a, false, 70308, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f63260b.finish();
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f63243a, false, 70289, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63243a, false, 70289, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.TestSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.TestSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63243a, false, 70290, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63243a, false, 70290, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.TestSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63243a, false, 70284, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63243a, false, 70284, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.TestSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.f6);
        View findViewById = findViewById(C0906R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<TextView>(R.id.title)");
        ((TextView) findViewById).setText("工具线测试页面");
        findViewById(C0906R.id.iu).setOnClickListener(new g(this));
        e.a aVar = e.a.ModelFileTestEnv;
        if (Intrinsics.areEqual((Object) Boolean.class, (Object) Boolean.class)) {
            SettingItemSwitch settingItemSwitch = new SettingItemSwitch(this);
            settingItemSwitch.setStartText("模型文件正式环境");
            Boolean valueOf = Boolean.valueOf(!((Boolean) l.a(aVar)).booleanValue());
            settingItemSwitch.setChecked(valueOf.booleanValue());
            settingItemSwitch.setOnSettingItemClickListener(new a(settingItemSwitch, valueOf, "模型文件正式环境", aVar));
            ((LinearLayout) findViewById(C0906R.id.b7x)).addView(settingItemSwitch);
        } else if (aVar.type() == g.b.Integer || aVar.type() == g.b.Long || aVar.type() == g.b.Float || aVar.type() == g.b.String) {
            n nVar = new n(this);
            nVar.setStartStr("模型文件正式环境");
            Boolean valueOf2 = Boolean.valueOf(!((Boolean) l.a(aVar)).booleanValue());
            nVar.setValueStr(String.valueOf(valueOf2));
            b bVar = new b(nVar, valueOf2, this, "模型文件正式环境", aVar);
            nVar.setValueChangedCallback(bVar);
            ((LinearLayout) findViewById(C0906R.id.b7x)).addView(nVar);
        }
        e.a aVar2 = e.a.EnableSdkLog;
        if (Intrinsics.areEqual((Object) Boolean.class, (Object) Boolean.class)) {
            SettingItemSwitch settingItemSwitch2 = new SettingItemSwitch(this);
            settingItemSwitch2.setStartText("SDK 日志开关");
            Object a2 = l.a(aVar2);
            if (a2 != null) {
                Boolean bool = (Boolean) a2;
                if (bool != null) {
                    settingItemSwitch2.setChecked(bool.booleanValue());
                    settingItemSwitch2.setOnSettingItemClickListener(new c(settingItemSwitch2, bool, "SDK 日志开关", aVar2));
                    ((LinearLayout) findViewById(C0906R.id.b7x)).addView(settingItemSwitch2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
            }
        } else if (aVar2.type() == g.b.Integer || aVar2.type() == g.b.Long || aVar2.type() == g.b.Float || aVar2.type() == g.b.String) {
            n nVar2 = new n(this);
            nVar2.setStartStr("SDK 日志开关");
            Object a3 = l.a(aVar2);
            if (a3 != null) {
                Boolean bool2 = (Boolean) a3;
                nVar2.setValueStr(String.valueOf(bool2));
                d dVar = new d(nVar2, bool2, this, "SDK 日志开关", aVar2);
                nVar2.setValueChangedCallback(dVar);
                ((LinearLayout) findViewById(C0906R.id.b7x)).addView(nVar2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
            }
        }
        e.a aVar3 = e.a.EnableVESingleGL;
        if (Intrinsics.areEqual((Object) Boolean.class, (Object) Boolean.class)) {
            SettingItemSwitch settingItemSwitch3 = new SettingItemSwitch(this);
            settingItemSwitch3.setStartText("VEEditor GL单线程");
            if ((((Number) l.a(aVar3)).intValue() & 8) != 8) {
                z = false;
            }
            Boolean valueOf3 = Boolean.valueOf(z);
            settingItemSwitch3.setChecked(valueOf3.booleanValue());
            settingItemSwitch3.setOnSettingItemClickListener(new e(settingItemSwitch3, valueOf3, "VEEditor GL单线程", aVar3));
            ((LinearLayout) findViewById(C0906R.id.b7x)).addView(settingItemSwitch3);
        } else if (aVar3.type() == g.b.Integer || aVar3.type() == g.b.Long || aVar3.type() == g.b.Float || aVar3.type() == g.b.String) {
            n nVar3 = new n(this);
            nVar3.setStartStr("VEEditor GL单线程");
            if ((((Number) l.a(aVar3)).intValue() & 8) != 8) {
                z = false;
            }
            Boolean valueOf4 = Boolean.valueOf(z);
            nVar3.setValueStr(String.valueOf(valueOf4));
            f fVar = new f(nVar3, valueOf4, this, "VEEditor GL单线程", aVar3);
            nVar3.setValueChangedCallback(fVar);
            ((LinearLayout) findViewById(C0906R.id.b7x)).addView(nVar3);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.TestSettingActivity", "onCreate", false);
    }

    public final <T> T a(e.a aVar, String str) throws NumberFormatException {
        if (PatchProxy.isSupport(new Object[]{aVar, str}, this, f63243a, false, 70286, new Class[]{e.a.class, String.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar, str}, this, f63243a, false, 70286, new Class[]{e.a.class, String.class}, Object.class);
        }
        g.b type = aVar.type();
        if (type != null) {
            switch (k.f63299a[type.ordinal()]) {
                case 1:
                    return Integer.valueOf(Integer.parseInt(str));
                case 2:
                    return Long.valueOf(Long.parseLong(str));
                case 3:
                    return Float.valueOf(Float.parseFloat(str));
                case 4:
                    return str;
                case 5:
                    return Boolean.valueOf(Boolean.parseBoolean(str));
            }
        }
        throw new AssertionError();
    }
}
