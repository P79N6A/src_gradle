package com.ss.android.ugc.aweme.im.sdk.detail;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\fH\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\fH\u0002J\b\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0016J\b\u0010,\u001a\u00020-H&J\b\u0010.\u001a\u00020%H\u0016J\b\u0010/\u001a\u00020%H\u0016J\b\u00100\u001a\u00020%H\u0002J\u001a\u00101\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020%2\u0006\u00106\u001a\u000207H\u0016J\u0012\u00108\u001a\u00020%2\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\u0018\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020\f2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020%H\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006@"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/BaseChatDetailActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "Landroid/view/View$OnClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "()V", "mConversationModel", "Lcom/bytedance/im/core/model/ConversationModel;", "getMConversationModel", "()Lcom/bytedance/im/core/model/ConversationModel;", "setMConversationModel", "(Lcom/bytedance/im/core/model/ConversationModel;)V", "<set-?>", "", "mIsMute", "getMIsMute", "()Z", "setMIsMute", "(Z)V", "mIsMute$delegate", "Lkotlin/properties/ReadWriteProperty;", "mIsStickTop", "getMIsStickTop", "setMIsStickTop", "mIsStickTop$delegate", "mMuteSwitch", "Landroid/support/v7/widget/SwitchCompat;", "mMuteText", "Landroid/widget/TextView;", "mStickTopSwitch", "mStickTopText", "mTitleBar", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;", "getMTitleBar", "()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;", "setMTitleBar", "(Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;)V", "changeMute", "", "mute", "changeStickTop", "stickTop", "getMuteStatus", "getStickTopStatus", "initEvents", "initLayoutRes", "", "initParams", "initViews", "initViewsParams", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setChatMuteOrTopLog", "switchState", "event", "", "setStatusBarColor", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BaseChatDetailActivity extends AmeActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51330a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f51331b = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseChatDetailActivity.class), "mIsMute", "getMIsMute()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseChatDetailActivity.class), "mIsStickTop", "getMIsStickTop()Z"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    protected ImTextTitleBar f51332c;

    /* renamed from: d  reason: collision with root package name */
    public SwitchCompat f51333d;

    /* renamed from: e  reason: collision with root package name */
    public SwitchCompat f51334e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.im.core.d.e f51335f;
    private TextView g;
    private TextView h;
    private final ReadWriteProperty i;
    private final ReadWriteProperty j;
    private HashMap k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a extends ObservableProperty<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f51337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseChatDetailActivity f51338c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, BaseChatDetailActivity baseChatDetailActivity) {
            super(obj2);
            this.f51337b = obj;
            this.f51338c = baseChatDetailActivity;
        }

        public final void afterChange(@NotNull KProperty<?> kProperty, Boolean bool, Boolean bool2) {
            KProperty<?> kProperty2 = kProperty;
            if (PatchProxy.isSupport(new Object[]{kProperty2, bool, bool2}, this, f51336a, false, 51871, new Class[]{KProperty.class, Object.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{kProperty2, bool, bool2}, this, f51336a, false, 51871, new Class[]{KProperty.class, Object.class, Object.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(kProperty, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (BaseChatDetailActivity.a(this.f51338c).isChecked() ^ booleanValue) {
                BaseChatDetailActivity.a(this.f51338c).setChecked(booleanValue);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class b extends ObservableProperty<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f51340b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseChatDetailActivity f51341c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Object obj, Object obj2, BaseChatDetailActivity baseChatDetailActivity) {
            super(obj2);
            this.f51340b = obj;
            this.f51341c = baseChatDetailActivity;
        }

        public final void afterChange(@NotNull KProperty<?> kProperty, Boolean bool, Boolean bool2) {
            KProperty<?> kProperty2 = kProperty;
            if (PatchProxy.isSupport(new Object[]{kProperty2, bool, bool2}, this, f51339a, false, 51872, new Class[]{KProperty.class, Object.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{kProperty2, bool, bool2}, this, f51339a, false, 51872, new Class[]{KProperty.class, Object.class, Object.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(kProperty, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (BaseChatDetailActivity.b(this.f51341c).isChecked() ^ booleanValue) {
                BaseChatDetailActivity.b(this.f51341c).setChecked(booleanValue);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/BaseChatDetailActivity$changeMute$1", "Lcom/bytedance/im/core/client/callback/IRequestListener;", "Lcom/bytedance/im/core/model/Conversation;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "result", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51342a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseChatDetailActivity f51343b;

        c(BaseChatDetailActivity baseChatDetailActivity) {
            this.f51343b = baseChatDetailActivity;
        }

        public final void a(@Nullable j jVar) {
            if (PatchProxy.isSupport(new Object[]{jVar}, this, f51342a, false, 51874, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar}, this, f51342a, false, 51874, new Class[]{j.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.im.sdk.group.b.b.a(this.f51343b, jVar);
            BaseChatDetailActivity.a(this.f51343b).setChecked(this.f51343b.b());
            BaseChatDetailActivity.a(this.f51343b).setEnabled(true);
        }

        public final /* synthetic */ void a(Object obj) {
            com.bytedance.im.core.d.b bVar = (com.bytedance.im.core.d.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51342a, false, 51873, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51342a, false, 51873, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            this.f51343b.a(!this.f51343b.b());
            BaseChatDetailActivity.a(this.f51343b).setEnabled(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/BaseChatDetailActivity$changeStickTop$1", "Lcom/bytedance/im/core/client/callback/IRequestListener;", "Lcom/bytedance/im/core/model/Conversation;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "result", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseChatDetailActivity f51345b;

        d(BaseChatDetailActivity baseChatDetailActivity) {
            this.f51345b = baseChatDetailActivity;
        }

        public final void a(@NotNull j jVar) {
            if (PatchProxy.isSupport(new Object[]{jVar}, this, f51344a, false, 51876, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar}, this, f51344a, false, 51876, new Class[]{j.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(jVar, "error");
            com.ss.android.ugc.aweme.im.sdk.group.b.b.a(this.f51345b, jVar);
            BaseChatDetailActivity.b(this.f51345b).setChecked(this.f51345b.c());
            BaseChatDetailActivity.b(this.f51345b).setEnabled(true);
        }

        public final /* synthetic */ void a(Object obj) {
            com.bytedance.im.core.d.b bVar = (com.bytedance.im.core.d.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51344a, false, 51875, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51344a, false, 51875, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            this.f51345b.b(!this.f51345b.c());
            BaseChatDetailActivity.b(this.f51345b).setEnabled(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/BaseChatDetailActivity$initEvents$1", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar$OnTitlebarClickListener;", "onLeftClick", "", "onRightClick", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseChatDetailActivity f51347b;

        public final void b() {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f51346a, false, 51877, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51346a, false, 51877, new Class[0], Void.TYPE);
                return;
            }
            this.f51347b.finish();
        }

        e(BaseChatDetailActivity baseChatDetailActivity) {
            this.f51347b = baseChatDetailActivity;
        }
    }

    public View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f51330a, false, 51869, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f51330a, false, 51869, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.k == null) {
            this.k = new HashMap();
        }
        View view = (View) this.k.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.k.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51330a, false, 51855, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51330a, false, 51855, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.i.setValue(this, f51331b[0], Boolean.valueOf(z));
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51330a, false, 51857, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51330a, false, 51857, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.setValue(this, f51331b[1], Boolean.valueOf(z));
    }

    public final boolean b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51330a, false, 51854, new Class[0], Boolean.TYPE)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51330a, false, 51854, new Class[0], Boolean.TYPE);
        } else {
            value = this.i.getValue(this, f51331b[0]);
        }
        return ((Boolean) value).booleanValue();
    }

    public final boolean c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51330a, false, 51856, new Class[0], Boolean.TYPE)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51330a, false, 51856, new Class[0], Boolean.TYPE);
        } else {
            value = this.j.getValue(this, f51331b[1]);
        }
        return ((Boolean) value).booleanValue();
    }

    public abstract int d();

    public void e() {
    }

    public void setStatusBarColor() {
    }

    public BaseChatDetailActivity() {
        Boolean bool = Boolean.FALSE;
        this.i = new a(bool, bool, this);
        Boolean bool2 = Boolean.FALSE;
        this.j = new b(bool2, bool2, this);
    }

    @NotNull
    public final ImTextTitleBar a() {
        if (PatchProxy.isSupport(new Object[0], this, f51330a, false, 51852, new Class[0], ImTextTitleBar.class)) {
            return (ImTextTitleBar) PatchProxy.accessDispatch(new Object[0], this, f51330a, false, 51852, new Class[0], ImTextTitleBar.class);
        }
        ImTextTitleBar imTextTitleBar = this.f51332c;
        if (imTextTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        return imTextTitleBar;
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f51330a, false, 51861, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51330a, false, 51861, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMuteText");
        }
        View.OnClickListener onClickListener = this;
        textView.setOnClickListener(onClickListener);
        TextView textView2 = this.h;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickTopText");
        }
        textView2.setOnClickListener(onClickListener);
        SwitchCompat switchCompat = this.f51333d;
        if (switchCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMuteSwitch");
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this;
        switchCompat.setOnCheckedChangeListener(onCheckedChangeListener);
        SwitchCompat switchCompat2 = this.f51334e;
        if (switchCompat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickTopSwitch");
        }
        switchCompat2.setOnCheckedChangeListener(onCheckedChangeListener);
        ImTextTitleBar imTextTitleBar = this.f51332c;
        if (imTextTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        imTextTitleBar.setOnTitlebarClickListener(new e(this));
    }

    public void f() {
        int i2;
        int i3;
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f51330a, false, 51859, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51330a, false, 51859, new Class[0], Void.TYPE);
            return;
        }
        View findViewById = findViewById(C0906R.id.d3m);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.title_bar)");
        this.f51332c = (ImTextTitleBar) findViewById;
        View findViewById2 = findViewById(C0906R.id.df5);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.tv_mute)");
        this.g = (TextView) findViewById2;
        View findViewById3 = findViewById(C0906R.id.cya);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.switch_mute)");
        this.f51333d = (SwitchCompat) findViewById3;
        View findViewById4 = findViewById(C0906R.id.djt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.tv_stick_top)");
        this.h = (TextView) findViewById4;
        View findViewById5 = findViewById(C0906R.id.cyd);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.switch_stick_top)");
        this.f51334e = (SwitchCompat) findViewById5;
        if (com.bytedance.ies.dmt.ui.common.b.b()) {
            i2 = C0906R.color.gf;
        } else {
            i2 = C0906R.color.ge;
        }
        if (com.bytedance.ies.dmt.ui.common.b.b()) {
            i3 = C0906R.color.gd;
        } else {
            i3 = C0906R.color.gc;
        }
        SwitchCompat switchCompat = this.f51333d;
        if (switchCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMuteSwitch");
        }
        Context context = this;
        switchCompat.setTrackTintList(AppCompatResources.getColorStateList(context, i2));
        SwitchCompat switchCompat2 = this.f51333d;
        if (switchCompat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMuteSwitch");
        }
        switchCompat2.setThumbTintList(AppCompatResources.getColorStateList(context, i3));
        SwitchCompat switchCompat3 = this.f51334e;
        if (switchCompat3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickTopSwitch");
        }
        switchCompat3.setTrackTintList(AppCompatResources.getColorStateList(context, i2));
        SwitchCompat switchCompat4 = this.f51334e;
        if (switchCompat4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickTopSwitch");
        }
        switchCompat4.setThumbTintList(AppCompatResources.getColorStateList(context, i3));
        if (PatchProxy.isSupport(new Object[0], this, f51330a, false, 51860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51330a, false, 51860, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f51330a, false, 51866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51330a, false, 51866, new Class[0], Void.TYPE);
        } else {
            com.bytedance.im.core.d.e eVar = this.f51335f;
            if (eVar != null) {
                com.bytedance.im.core.d.b a2 = eVar.a();
                if (a2 != null && a2.isStickTop()) {
                    z = true;
                    b(z);
                }
            }
            z = false;
            b(z);
        }
        if (PatchProxy.isSupport(new Object[0], this, f51330a, false, 51864, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51330a, false, 51864, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.im.core.d.e eVar2 = this.f51335f;
        if (eVar2 != null) {
            com.bytedance.im.core.d.b a3 = eVar2.a();
            if (a3 != null && a3.isMute()) {
                z2 = true;
            }
        }
        a(z2);
    }

    public static final /* synthetic */ SwitchCompat a(BaseChatDetailActivity baseChatDetailActivity) {
        SwitchCompat switchCompat = baseChatDetailActivity.f51333d;
        if (switchCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMuteSwitch");
        }
        return switchCompat;
    }

    public static final /* synthetic */ SwitchCompat b(BaseChatDetailActivity baseChatDetailActivity) {
        SwitchCompat switchCompat = baseChatDetailActivity.f51334e;
        if (switchCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickTopSwitch");
        }
        return switchCompat;
    }

    public void onClick(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f51330a, false, 51862, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f51330a, false, 51862, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
        int id = view.getId();
        if (id == C0906R.id.df5) {
            SwitchCompat switchCompat = this.f51333d;
            if (switchCompat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMuteSwitch");
            }
            SwitchCompat switchCompat2 = this.f51333d;
            if (switchCompat2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMuteSwitch");
            }
            switchCompat.setChecked(!switchCompat2.isChecked());
            return;
        }
        if (id == C0906R.id.djt) {
            SwitchCompat switchCompat3 = this.f51334e;
            if (switchCompat3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStickTopSwitch");
            }
            SwitchCompat switchCompat4 = this.f51334e;
            if (switchCompat4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStickTopSwitch");
            }
            switchCompat3.setChecked(!switchCompat4.isChecked());
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51330a, false, 51858, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51330a, false, 51858, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(d());
        com.ss.android.ugc.aweme.im.sdk.d.a.b().setupStatusBar(this);
        e();
        f();
        g();
    }

    private final void a(boolean z, String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f51330a, false, 51868, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f51330a, false, 51868, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        String str2 = "off";
        if (z) {
            str2 = "on";
        }
        com.bytedance.im.core.d.e eVar = this.f51335f;
        String str3 = null;
        if (eVar != null) {
            com.bytedance.im.core.d.b a2 = eVar.a();
            if (a2 != null && a2.getConversationType() == d.a.f20887b) {
                z a3 = z.a();
                com.bytedance.im.core.d.e eVar2 = this.f51335f;
                if (eVar2 != null) {
                    str3 = eVar2.f21270a;
                }
                a3.b(str3, "group", str2, str);
                return;
            }
        }
        com.bytedance.im.core.d.e eVar3 = this.f51335f;
        if (eVar3 != null) {
            com.bytedance.im.core.d.b a4 = eVar3.a();
            if (a4 != null && a4.getConversationType() == d.a.f20886a) {
                z a5 = z.a();
                com.bytedance.im.core.d.e eVar4 = this.f51335f;
                if (eVar4 != null) {
                    str3 = eVar4.f21270a;
                }
                a5.b(str3, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE, str2, str);
            }
        }
    }

    public void onCheckedChanged(@Nullable CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f51330a, false, 51863, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f51330a, false, 51863, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
        } else if (compoundButton != null) {
            int id = compoundButton.getId();
            if (id == C0906R.id.cya) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, this, f51330a, false, 51865, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51330a, false, 51865, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    if (z != b()) {
                        SwitchCompat switchCompat = this.f51333d;
                        if (switchCompat == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mMuteSwitch");
                        }
                        switchCompat.setEnabled(false);
                        a(!b(), "chat_mute_click");
                        com.bytedance.im.core.d.e eVar = this.f51335f;
                        if (eVar != null) {
                            eVar.b(!b(), new c(this));
                        }
                    }
                }
            } else if (id == C0906R.id.cyd) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, this, f51330a, false, 51867, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51330a, false, 51867, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else if (z != c()) {
                    SwitchCompat switchCompat2 = this.f51334e;
                    if (switchCompat2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mStickTopSwitch");
                    }
                    switchCompat2.setEnabled(false);
                    a(!c(), "chat_top_click");
                    com.bytedance.im.core.d.e eVar2 = this.f51335f;
                    if (eVar2 != null) {
                        eVar2.a(!c(), (com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.b>) new d<com.bytedance.im.core.d.b>(this));
                    }
                }
            }
        }
    }
}
