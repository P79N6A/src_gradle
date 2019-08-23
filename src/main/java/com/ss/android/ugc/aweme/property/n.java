package com.ss.android.ugc.aweme.property;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\tH\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0014J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J)\u0010\u0014\u001a\u00020\u000f2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000f0\u0016J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0013R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/property/TestSettingRangeView;", "Lcom/bytedance/ies/dmt/ui/widget/setting/SettingItemBase;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mEditText", "Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;", "getRightLayoutId", "initView", "", "context", "setStartStr", "startStr", "", "setValueChangedCallback", "onValueChanged", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "setValueStr", "valueStr", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class n extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63303a;

    /* renamed from: b  reason: collision with root package name */
    private DmtEditText f63304b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/property/TestSettingRangeView$setValueChangedCallback$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function1 f63306b;

        public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f63305a, false, 70317, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f63305a, false, 70317, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence2, NotifyType.SOUND);
        }

        public final void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f63305a, false, 70318, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f63305a, false, 70318, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence2, NotifyType.SOUND);
        }

        a(Function1 function1) {
            this.f63306b = function1;
        }

        public final void afterTextChanged(@NotNull Editable editable) {
            Editable editable2 = editable;
            if (PatchProxy.isSupport(new Object[]{editable2}, this, f63305a, false, 70319, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable2}, this, f63305a, false, 70319, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(editable2, NotifyType.SOUND);
            if (StringsKt.endsWith$default(editable.toString(), "\n", false, 2, null)) {
                editable2.delete(editable.length() - 1, editable.length());
                this.f63306b.invoke(editable.toString());
            }
        }
    }

    public final int getRightLayoutId() {
        return C0906R.layout.ge;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
    }

    public final void setStartStr(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63303a, false, 70312, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63303a, false, 70312, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "startStr");
        setStartText(str);
    }

    public final void a(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f63303a, false, 70311, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f63303a, false, 70311, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.a(context);
        View childAt = this.h.getChildAt(0);
        if (childAt != null) {
            this.f63304b = (DmtEditText) childAt;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtEditText");
    }

    public final void setValueChangedCallback(@NotNull Function1<? super String, Unit> function1) {
        Function1<? super String, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{function12}, this, f63303a, false, 70314, new Class[]{Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function12}, this, f63303a, false, 70314, new Class[]{Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "onValueChanged");
        DmtEditText dmtEditText = this.f63304b;
        if (dmtEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        dmtEditText.addTextChangedListener(new a(function12));
    }

    public final void setValueStr(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63303a, false, 70313, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63303a, false, 70313, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "valueStr");
        DmtEditText dmtEditText = this.f63304b;
        if (dmtEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditText");
        }
        dmtEditText.setText(str2);
    }
}
