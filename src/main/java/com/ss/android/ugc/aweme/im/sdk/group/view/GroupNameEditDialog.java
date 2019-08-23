package com.ss.android.ugc.aweme.im.sdk.group.view;

import a.i;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.im.core.d.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0012\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u0016H\u0002J\b\u0010$\u001a\u00020\u0016H\u0002R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u000b*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupNameEditDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "conversationId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "mCancelBtn", "Lcom/bytedance/ies/dmt/ui/widget/DmtButton;", "kotlin.jvm.PlatformType", "mClearBtn", "Landroid/widget/ImageButton;", "mConfirmBtn", "mConversationModel", "Lcom/bytedance/im/core/model/ConversationModel;", "mNameEdit", "Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;", "mRootView", "Landroid/view/View;", "cancel", "", "checkLength", "editText", "Landroid/widget/EditText;", "length", "", "dismiss", "hideKeyboard", "initData", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveGroupName", "showKeyBoard", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupNameEditDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51610a;
    public static final a g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final DmtEditText f51611b = ((DmtEditText) this.h.findViewById(C0906R.id.aab));

    /* renamed from: c  reason: collision with root package name */
    public final ImageButton f51612c = ((ImageButton) this.h.findViewById(C0906R.id.ns));

    /* renamed from: d  reason: collision with root package name */
    public final DmtButton f51613d = ((DmtButton) this.h.findViewById(C0906R.id.y0));

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.im.core.d.e f51614e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final String f51615f;
    private final View h;
    private final DmtButton i = ((DmtButton) this.h.findViewById(C0906R.id.q2));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupNameEditDialog$Companion;", "", "()V", "MAX_COUNT_GROUP_NAME", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/view/GroupNameEditDialog$initView$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupNameEditDialog f51617b;

        public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51616a, false, 52309, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51616a, false, 52309, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence2, NotifyType.SOUND);
        }

        b(GroupNameEditDialog groupNameEditDialog) {
            this.f51617b = groupNameEditDialog;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            if (PatchProxy.isSupport(new Object[]{editable}, this, f51616a, false, 52308, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f51616a, false, 52308, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            GroupNameEditDialog groupNameEditDialog = this.f51617b;
            DmtEditText dmtEditText = this.f51617b.f51611b;
            Intrinsics.checkExpressionValueIsNotNull(dmtEditText, "mNameEdit");
            EditText editText = dmtEditText;
            if (PatchProxy.isSupport(new Object[]{editText, 20}, groupNameEditDialog, GroupNameEditDialog.f51610a, false, 52307, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {editText, 20};
                ChangeQuickRedirect changeQuickRedirect = GroupNameEditDialog.f51610a;
                GroupNameEditDialog groupNameEditDialog2 = groupNameEditDialog;
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                PatchProxy.accessDispatch(objArr, groupNameEditDialog2, changeQuickRedirect2, false, 52307, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Editable text = editText.getText();
            if (text.length() > 20) {
                Context context = groupNameEditDialog.getContext();
                Context context2 = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
                com.bytedance.ies.dmt.ui.d.a.b(context, context2.getResources().getString(C0906R.string.asz, new Object[]{"20"})).a();
                int selectionEnd = Selection.getSelectionEnd(text);
                String obj = text.toString();
                if (obj != null) {
                    String substring = obj.substring(0, 20);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    editText.setText(substring);
                    Editable text2 = editText.getText();
                    if (selectionEnd > text2.length()) {
                        selectionEnd = text2.length();
                    }
                    Selection.setSelection(text2, selectionEnd);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x00cd  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00f2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onTextChanged(@org.jetbrains.annotations.NotNull java.lang.CharSequence r15, int r16, int r17, int r18) {
            /*
                r14 = this;
                r7 = r14
                r8 = r15
                r9 = 4
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
                r11 = 1
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
                r12 = 2
                r0[r12] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
                r13 = 3
                r0[r13] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f51616a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.lang.CharSequence> r1 = java.lang.CharSequence.class
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r13] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 52310(0xcc56, float:7.3302E-41)
                r1 = r14
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0073
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
                r0[r12] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
                r0[r13] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f51616a
                r3 = 0
                r4 = 52310(0xcc56, float:7.3302E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.lang.CharSequence> r1 = java.lang.CharSequence.class
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r13] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r14
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0073:
                java.lang.String r0 = "s"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r0)
                boolean r0 = android.text.TextUtils.isEmpty(r15)
                r1 = 1056964608(0x3f000000, float:0.5)
                if (r0 == 0) goto L_0x00a7
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r0 = r7.f51617b
                android.widget.ImageButton r0 = r0.f51612c
                java.lang.String r2 = "mClearBtn"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                r2 = 8
                r0.setVisibility(r2)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r0 = r7.f51617b
                com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r0.f51613d
                java.lang.String r2 = "mConfirmBtn"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                r0.setEnabled(r10)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r0 = r7.f51617b
                com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r0.f51613d
                java.lang.String r2 = "mConfirmBtn"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                r0.setAlpha(r1)
                return
            L_0x00a7:
                java.lang.String r0 = r15.toString()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r2 = r7.f51617b
                com.bytedance.im.core.d.e r2 = r2.f51614e
                if (r2 == 0) goto L_0x00c4
                com.bytedance.im.core.d.b r2 = r2.a()
                if (r2 == 0) goto L_0x00c4
                com.bytedance.im.core.d.c r2 = r2.getCoreInfo()
                if (r2 == 0) goto L_0x00c4
                java.lang.String r2 = r2.getName()
                goto L_0x00c5
            L_0x00c4:
                r2 = 0
            L_0x00c5:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r0 = android.text.TextUtils.equals(r0, r2)
                if (r0 == 0) goto L_0x00f2
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r0 = r7.f51617b
                android.widget.ImageButton r0 = r0.f51612c
                java.lang.String r2 = "mClearBtn"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                r0.setVisibility(r10)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r0 = r7.f51617b
                com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r0.f51613d
                java.lang.String r2 = "mConfirmBtn"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                r0.setEnabled(r10)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r0 = r7.f51617b
                com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r0.f51613d
                java.lang.String r2 = "mConfirmBtn"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                r0.setAlpha(r1)
                return
            L_0x00f2:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r0 = r7.f51617b
                android.widget.ImageButton r0 = r0.f51612c
                java.lang.String r1 = "mClearBtn"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r10)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r0 = r7.f51617b
                com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r0.f51613d
                java.lang.String r1 = "mConfirmBtn"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setEnabled(r11)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r0 = r7.f51617b
                com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r0.f51613d
                java.lang.String r1 = "mConfirmBtn"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.setAlpha(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog.b.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupNameEditDialog f51619b;

        c(GroupNameEditDialog groupNameEditDialog) {
            this.f51619b = groupNameEditDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51618a, false, 52311, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51618a, false, 52311, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f51619b.f51611b.setText("");
            this.f51619b.f51611b.clearFocus();
            this.f51619b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51620a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupNameEditDialog f51621b;

        d(GroupNameEditDialog groupNameEditDialog) {
            this.f51621b = groupNameEditDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51620a, false, 52312, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51620a, false, 52312, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f51621b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51622a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupNameEditDialog f51623b;

        e(GroupNameEditDialog groupNameEditDialog) {
            this.f51623b = groupNameEditDialog;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r18) {
            /*
                r17 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r4 = f51622a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<android.view.View> r3 = android.view.View.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 52313(0xcc59, float:7.3306E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0034
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r12 = f51622a
                r13 = 0
                r14 = 52313(0xcc59, float:7.3306E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<android.view.View> r0 = android.view.View.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x0034:
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r18)
                r0 = r17
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog r10 = r0.f51623b
                java.lang.Object[] r2 = new java.lang.Object[r9]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog.f51610a
                r5 = 0
                r6 = 52306(0xcc52, float:7.3296E-41)
                java.lang.Class[] r7 = new java.lang.Class[r9]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r10
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x005f
                java.lang.Object[] r2 = new java.lang.Object[r9]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog.f51610a
                r5 = 0
                r6 = 52306(0xcc52, float:7.3296E-41)
                java.lang.Class[] r7 = new java.lang.Class[r9]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x005f:
                com.bytedance.ies.dmt.ui.widget.DmtEditText r2 = r10.f51611b
                java.lang.String r3 = "mNameEdit"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                android.text.Editable r2 = r2.getText()
                if (r2 == 0) goto L_0x006f
            L_0x006c:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                goto L_0x0072
            L_0x006f:
                java.lang.String r2 = ""
                goto L_0x006c
            L_0x0072:
                java.lang.String r2 = r2.toString()
                java.lang.String r2 = com.ss.android.ugc.aweme.im.sdk.utils.ap.a(r2)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                if (r2 == 0) goto L_0x0086
                int r3 = r2.length()
                if (r3 != 0) goto L_0x0085
                goto L_0x0086
            L_0x0085:
                r1 = 0
            L_0x0086:
                if (r1 == 0) goto L_0x0097
                android.content.Context r1 = r10.getContext()
                r2 = 2131560523(0x7f0d084b, float:1.874642E38)
                com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r1, (int) r2)
                r1.a()
                return
            L_0x0097:
                com.bytedance.im.core.d.e r1 = r10.f51614e
                if (r1 == 0) goto L_0x00ac
                com.bytedance.im.core.d.b r1 = r1.a()
                if (r1 == 0) goto L_0x00ac
                com.bytedance.im.core.d.c r1 = r1.getCoreInfo()
                if (r1 == 0) goto L_0x00ac
                java.lang.String r1 = r1.getName()
                goto L_0x00ad
            L_0x00ac:
                r1 = 0
            L_0x00ad:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.equals(r2, r1)
                if (r1 != 0) goto L_0x00e6
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.util.Map r1 = (java.util.Map) r1
                java.lang.String r2 = "conversation_id"
                java.lang.String r3 = r10.f51615f
                r1.put(r2, r3)
                java.lang.String r2 = "group_name_confirm_quick_click"
                com.ss.android.ugc.aweme.im.sdk.utils.z.a((java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r1)
                com.bytedance.im.core.d.e r1 = r10.f51614e
                if (r1 == 0) goto L_0x00e6
                com.bytedance.ies.dmt.ui.widget.DmtEditText r2 = r10.f51611b
                java.lang.String r3 = "mNameEdit"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                android.text.Editable r2 = r2.getText()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog$g r3 = new com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog$g
                r3.<init>(r10)
                com.bytedance.im.core.a.a.b r3 = (com.bytedance.im.core.a.a.b) r3
                r1.a((java.lang.String) r2, (com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.b>) r3)
                return
            L_0x00e6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog.e.onClick(android.view.View):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, k = 3, mv = {1, 1, 15})
    static final class f implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51624a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupNameEditDialog f51625b;

        f(GroupNameEditDialog groupNameEditDialog) {
            this.f51625b = groupNameEditDialog;
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f51624a, false, 52314, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f51624a, false, 52314, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            i.a(100).a((a.g<TResult, TContinuationResult>) new a.g<Void, Object>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51626a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ f f51627b;

                {
                    this.f51627b = r1;
                }

                public final /* synthetic */ Object then(i iVar) {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f51626a, false, 52315, new Class[]{i.class}, Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f51626a, false, 52315, new Class[]{i.class}, Void.class);
                    }
                    if (this.f51627b.f51625b.f51611b != null) {
                        this.f51627b.f51625b.f51611b.requestFocus();
                        GroupNameEditDialog groupNameEditDialog = this.f51627b.f51625b;
                        if (PatchProxy.isSupport(new Object[0], groupNameEditDialog, GroupNameEditDialog.f51610a, false, 52304, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], groupNameEditDialog, GroupNameEditDialog.f51610a, false, 52304, new Class[0], Void.TYPE);
                        } else {
                            InputMethodManager inputMethodManager = (InputMethodManager) groupNameEditDialog.getContext().getSystemService("input_method");
                            if (inputMethodManager != null) {
                                inputMethodManager.showSoftInput(groupNameEditDialog.f51611b, 1);
                            }
                        }
                    }
                    return null;
                }
            }, i.f1052b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/group/view/GroupNameEditDialog$saveGroupName$1", "Lcom/bytedance/im/core/client/callback/IRequestListener;", "Lcom/bytedance/im/core/model/Conversation;", "onFailure", "", "error", "Lcom/bytedance/im/core/model/IMError;", "onSuccess", "conversation", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GroupNameEditDialog f51629b;

        g(GroupNameEditDialog groupNameEditDialog) {
            this.f51629b = groupNameEditDialog;
        }

        public final void a(@Nullable j jVar) {
            j jVar2 = jVar;
            if (PatchProxy.isSupport(new Object[]{jVar2}, this, f51628a, false, 52317, new Class[]{j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jVar2}, this, f51628a, false, 52317, new Class[]{j.class}, Void.TYPE);
                return;
            }
            Context context = this.f51629b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            com.ss.android.ugc.aweme.im.sdk.group.b.b.a(context, jVar2);
        }

        public final /* synthetic */ void a(Object obj) {
            com.bytedance.im.core.d.b bVar = (com.bytedance.im.core.d.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51628a, false, 52316, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51628a, false, 52316, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            if (bVar != null) {
                com.bytedance.ies.dmt.ui.d.a.b(this.f51629b.getContext(), (int) C0906R.string.asy).a();
                this.f51629b.dismiss();
            }
        }
    }

    public final void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, f51610a, false, 52303, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51610a, false, 52303, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.cancel();
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f51610a, false, 52302, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51610a, false, 52302, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.dismiss();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51610a, false, 52305, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51610a, false, 52305, new Class[0], Void.TYPE);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            DmtEditText dmtEditText = this.f51611b;
            Intrinsics.checkExpressionValueIsNotNull(dmtEditText, "mNameEdit");
            inputMethodManager.hideSoftInputFromWindow(dmtEditText.getWindowToken(), 0);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        boolean z = true;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51610a, false, 52299, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51610a, false, 52299, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(this.h);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        if (PatchProxy.isSupport(new Object[0], this, f51610a, false, 52300, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51610a, false, 52300, new Class[0], Void.TYPE);
        } else {
            this.f51614e = new com.bytedance.im.core.d.e(this.f51615f);
        }
        if (PatchProxy.isSupport(new Object[0], this, f51610a, false, 52301, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51610a, false, 52301, new Class[0], Void.TYPE);
            return;
        }
        this.f51611b.addTextChangedListener(new b(this));
        com.bytedance.im.core.d.e eVar = this.f51614e;
        if (eVar != null) {
            com.bytedance.im.core.d.b a2 = eVar.a();
            if (a2 != null) {
                com.bytedance.im.core.d.c coreInfo = a2.getCoreInfo();
                if (coreInfo != null) {
                    Map<String, String> ext = coreInfo.getExt();
                    if (ext != null && ext.containsKey("a:s_name_operator") && (!Intrinsics.areEqual((Object) ext.get("a:s_name_operator"), (Object) PushConstants.PUSH_TYPE_NOTIFY))) {
                        this.f51611b.setText(coreInfo.getName());
                        DmtEditText dmtEditText = this.f51611b;
                        Intrinsics.checkExpressionValueIsNotNull(dmtEditText, "mNameEdit");
                        Editable text = dmtEditText.getText();
                        if (text != null) {
                            this.f51611b.setSelection(text.length());
                        }
                    }
                }
            }
        }
        ImageButton imageButton = this.f51612c;
        Intrinsics.checkExpressionValueIsNotNull(imageButton, "mClearBtn");
        DmtEditText dmtEditText2 = this.f51611b;
        Intrinsics.checkExpressionValueIsNotNull(dmtEditText2, "mNameEdit");
        CharSequence text2 = dmtEditText2.getText();
        if (!(text2 == null || text2.length() == 0)) {
            z = false;
        }
        if (z) {
            i2 = 4;
        }
        imageButton.setVisibility(i2);
        this.f51612c.setOnClickListener(new c(this));
        this.i.setOnClickListener(new d(this));
        this.f51613d.setOnClickListener(new e(this));
        setOnShowListener(new f(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupNameEditDialog(@NotNull Context context, @Nullable String str) {
        super(context, C0906R.style.sm);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f51615f = str;
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.a4o, null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…p_name_edit_dialog, null)");
        this.h = inflate;
    }
}
