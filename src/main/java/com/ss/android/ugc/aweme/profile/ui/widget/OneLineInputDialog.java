package com.ss.android.ugc.aweme.profile.ui.widget;

import a.g;
import a.i;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.text.Editable;
import android.text.Selection;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0004J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0004J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0004J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0004R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/ui/widget/OneLineInputDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "theme", "", "(Landroid/content/Context;I)V", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "cancel", "defaultInput", "", "dismiss", "maxInputLength", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "show", "showToastAfterBeyondMaxInputLength", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class OneLineInputDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63011a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f63012c = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    protected View f63013b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/ui/widget/OneLineInputDialog$Companion;", "", "()V", "CONFIRM_DISABLE_ALPHA", "", "INPUT_MAX_LENGTH", "", "L_100", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/profile/ui/widget/OneLineInputDialog$onCreate$1", "Lcom/ss/android/ugc/aweme/base/ui/SimpleTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends com.ss.android.ugc.aweme.base.ui.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneLineInputDialog f63015b;

        b(OneLineInputDialog oneLineInputDialog) {
            this.f63015b = oneLineInputDialog;
        }

        public final void afterTextChanged(@NotNull Editable editable) {
            boolean z;
            boolean z2;
            String str;
            String str2;
            Editable editable2 = editable;
            if (PatchProxy.isSupport(new Object[]{editable2}, this, f63014a, false, 69688, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable2}, this, f63014a, false, 69688, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(editable2, NotifyType.SOUND);
            CharSequence charSequence = editable2;
            if (Character.codePointCount(charSequence, 0, editable.length()) > 20) {
                OneLineInputDialog oneLineInputDialog = this.f63015b;
                if (PatchProxy.isSupport(new Object[0], oneLineInputDialog, OneLineInputDialog.f63011a, false, 69683, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], oneLineInputDialog, OneLineInputDialog.f63011a, false, 69683, new Class[0], Void.TYPE);
                } else {
                    com.bytedance.ies.dmt.ui.d.a.b(oneLineInputDialog.getContext(), oneLineInputDialog.getContext().getString(C0906R.string.lw)).a();
                }
                int selectionEnd = Selection.getSelectionEnd(charSequence);
                String obj = editable.toString();
                if (selectionEnd == 0) {
                    str = "";
                } else if (obj != null) {
                    str = obj.substring(0, selectionEnd);
                    Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                if (selectionEnd == obj.length()) {
                    str2 = "";
                } else if (obj != null) {
                    str2 = obj.substring(selectionEnd);
                    Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                int codePointCount = Character.codePointCount(str2, 0, str2.length());
                StringBuilder sb = new StringBuilder();
                int i = 20 - codePointCount;
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(Character.toChars(Character.codePointAt(str, sb.length())));
                }
                sb.append(str2);
                ((DmtEditText) this.f63015b.findViewById(C0906R.id.a_z)).setText(sb.toString());
                DmtEditText dmtEditText = (DmtEditText) this.f63015b.findViewById(C0906R.id.a_z);
                Intrinsics.checkExpressionValueIsNotNull(dmtEditText, "etInput");
                Selection.setSelection(dmtEditText.getText(), Math.min(((DmtEditText) this.f63015b.findViewById(C0906R.id.a_z)).length() - str2.length(), ((DmtEditText) this.f63015b.findViewById(C0906R.id.a_z)).length()));
            }
            OneLineInputDialog oneLineInputDialog2 = this.f63015b;
            if (PatchProxy.isSupport(new Object[]{editable2}, oneLineInputDialog2, OneLineInputDialog.f63011a, false, 69684, new Class[]{Editable.class}, Void.TYPE)) {
                Object[] objArr = {editable2};
                OneLineInputDialog oneLineInputDialog3 = oneLineInputDialog2;
                ChangeQuickRedirect changeQuickRedirect = OneLineInputDialog.f63011a;
                PatchProxy.accessDispatch(objArr, oneLineInputDialog3, changeQuickRedirect, false, 69684, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(editable2, NotifyType.SOUND);
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImageButton imageButton = (ImageButton) oneLineInputDialog2.findViewById(C0906R.id.nm);
                Intrinsics.checkExpressionValueIsNotNull(imageButton, "btnClear");
                imageButton.setVisibility(4);
            } else {
                ImageButton imageButton2 = (ImageButton) oneLineInputDialog2.findViewById(C0906R.id.nm);
                Intrinsics.checkExpressionValueIsNotNull(imageButton2, "btnClear");
                imageButton2.setVisibility(0);
            }
            String obj2 = editable.toString();
            if (obj2 != null) {
                if (StringsKt.trim((CharSequence) obj2).toString().length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    DmtButton dmtButton = (DmtButton) oneLineInputDialog2.findViewById(C0906R.id.y0);
                    Intrinsics.checkExpressionValueIsNotNull(dmtButton, "confirm");
                    dmtButton.setEnabled(true);
                    DmtButton dmtButton2 = (DmtButton) oneLineInputDialog2.findViewById(C0906R.id.y0);
                    Intrinsics.checkExpressionValueIsNotNull(dmtButton2, "confirm");
                    dmtButton2.setAlpha(1.0f);
                    return;
                }
                DmtButton dmtButton3 = (DmtButton) oneLineInputDialog2.findViewById(C0906R.id.y0);
                Intrinsics.checkExpressionValueIsNotNull(dmtButton3, "confirm");
                dmtButton3.setEnabled(false);
                DmtButton dmtButton4 = (DmtButton) oneLineInputDialog2.findViewById(C0906R.id.y0);
                Intrinsics.checkExpressionValueIsNotNull(dmtButton4, "confirm");
                dmtButton4.setAlpha(0.34f);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneLineInputDialog f63017b;

        c(OneLineInputDialog oneLineInputDialog) {
            this.f63017b = oneLineInputDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63016a, false, 69689, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63016a, false, 69689, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ((DmtEditText) this.f63017b.findViewById(C0906R.id.a_z)).setText("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63018a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneLineInputDialog f63019b;

        d(OneLineInputDialog oneLineInputDialog) {
            this.f63019b = oneLineInputDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63018a, false, 69690, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63018a, false, 69690, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f63019b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class e<TTaskResult, TContinuationResult> implements g<Void, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneLineInputDialog f63021b;

        e(OneLineInputDialog oneLineInputDialog) {
            this.f63021b = oneLineInputDialog;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f63020a, false, 69691, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f63020a, false, 69691, new Class[]{i.class}, Void.class);
            }
            DmtEditText dmtEditText = (DmtEditText) this.f63021b.findViewById(C0906R.id.a_z);
            if (dmtEditText != null) {
                dmtEditText.requestFocus();
                KeyboardUtils.a(dmtEditText);
            }
            return null;
        }
    }

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, f63011a, false, 69687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63011a, false, 69687, new Class[0], Void.TYPE);
            return;
        }
        KeyboardUtils.c((DmtEditText) findViewById(C0906R.id.a_z));
        super.cancel();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f63011a, false, 69686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63011a, false, 69686, new Class[0], Void.TYPE);
            return;
        }
        KeyboardUtils.c((DmtEditText) findViewById(C0906R.id.a_z));
        super.dismiss();
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f63011a, false, 69685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63011a, false, 69685, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        i.a(100).a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(this), i.f1052b);
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63011a, false, 69682, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63011a, false, 69682, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window == null) {
            Intrinsics.throwNpe();
        }
        window.setLayout(-1, -2);
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.ju, null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…alog_oneline_input, null)");
        this.f63013b = inflate;
        View view = this.f63013b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        setContentView(view);
        ((DmtEditText) findViewById(C0906R.id.a_z)).addTextChangedListener(new b(this));
        ((DmtEditText) findViewById(C0906R.id.a_z)).setText("");
        ((ImageButton) findViewById(C0906R.id.nm)).setOnClickListener(new c(this));
        ((DmtButton) findViewById(C0906R.id.q2)).setOnClickListener(new d(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private OneLineInputDialog(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public /* synthetic */ OneLineInputDialog(Context context, int i, int i2) {
        this(context, 0);
    }
}
