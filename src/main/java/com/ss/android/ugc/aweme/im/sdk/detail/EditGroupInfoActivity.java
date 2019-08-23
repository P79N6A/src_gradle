package com.ss.android.ugc.aweme.im.sdk.detail;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.im.sdk.utils.ap;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\rH\u0002J\b\u0010*\u001a\u00020&H\u0002J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020&H\u0002J\b\u0010-\u001a\u00020&H\u0016J\u0012\u0010.\u001a\u00020&2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020&H\u0002J\b\u00102\u001a\u00020&H\u0014R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0004\n\u0002\u0010\u000eR#\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00100\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00150\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R#\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u001c0\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u001d\u0010\u001eR#\u0010 \u001a\n \u0005*\u0004\u0018\u00010!0!8BX\u0002¢\u0006\f\n\u0004\b$\u0010\t\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/EditGroupInfoActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "mClearEditInfoImage", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getMClearEditInfoImage", "()Landroid/widget/ImageView;", "mClearEditInfoImage$delegate", "Lkotlin/Lazy;", "mConversationModel", "Lcom/bytedance/im/core/model/ConversationModel;", "mCurType", "", "Ljava/lang/Integer;", "mInfoEditText", "Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;", "getMInfoEditText", "()Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;", "mInfoEditText$delegate", "mLoadingStatusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "getMLoadingStatusView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "mLoadingStatusView$delegate", "mSrcEditInfo", "", "mTitleBar", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;", "getMTitleBar", "()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;", "mTitleBar$delegate", "mWordCountText", "Landroid/widget/TextView;", "getMWordCountText", "()Landroid/widget/TextView;", "mWordCountText$delegate", "checkLength", "", "editText", "Landroid/widget/EditText;", "length", "initEvents", "initParams", "initViews", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveEditInfo", "setStatusBarColor", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"SetTextI18n"})
public final class EditGroupInfoActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51348a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f51349b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditGroupInfoActivity.class), "mTitleBar", "getMTitleBar()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditGroupInfoActivity.class), "mInfoEditText", "getMInfoEditText()Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditGroupInfoActivity.class), "mWordCountText", "getMWordCountText()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditGroupInfoActivity.class), "mClearEditInfoImage", "getMClearEditInfoImage()Landroid/widget/ImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EditGroupInfoActivity.class), "mLoadingStatusView", "getMLoadingStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final a f51350e = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public String f51351c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.im.core.d.e f51352d;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f51353f = LazyKt.lazy(new i(this));
    private final Lazy g = LazyKt.lazy(new g(this));
    private final Lazy h = LazyKt.lazy(new j(this));
    private final Lazy i = LazyKt.lazy(new f(this));
    private final Lazy j = LazyKt.lazy(new h(this));
    private Integer k;
    private HashMap l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/EditGroupInfoActivity$Companion;", "", "()V", "KEY_CONVERSATION_ID", "", "KEY_EDIT_INFO", "KEY_TYPE", "MAX_COUNT_GROUP_NAME", "", "TYPE_MODIFY_GROUP_NAME", "start", "", "activity", "Landroid/app/Activity;", "conversationId", "editInfo", "type", "requestCode", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51354a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/EditGroupInfoActivity$initEvents$1", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar$OnTitlebarClickListener;", "onLeftClick", "", "onRightClick", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51355a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditGroupInfoActivity f51356b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f51355a, false, 51896, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51355a, false, 51896, new Class[0], Void.TYPE);
                return;
            }
            this.f51356b.onBackPressed();
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f51355a, false, 51897, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51355a, false, 51897, new Class[0], Void.TYPE);
                return;
            }
            this.f51356b.f();
        }

        b(EditGroupInfoActivity editGroupInfoActivity) {
            this.f51356b = editGroupInfoActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/detail/EditGroupInfoActivity$initEvents$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditGroupInfoActivity f51358b;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        c(EditGroupInfoActivity editGroupInfoActivity) {
            this.f51358b = editGroupInfoActivity;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            boolean z;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{editable}, this, f51357a, false, 51898, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f51357a, false, 51898, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            CharSequence charSequence = editable;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImTextTitleBar a2 = this.f51358b.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "mTitleBar");
                View rightView = a2.getRightView();
                Intrinsics.checkExpressionValueIsNotNull(rightView, "mTitleBar.rightView");
                rightView.setAlpha(0.34f);
                ImTextTitleBar a3 = this.f51358b.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "mTitleBar");
                View rightView2 = a3.getRightView();
                Intrinsics.checkExpressionValueIsNotNull(rightView2, "mTitleBar.rightView");
                rightView2.setEnabled(false);
                ImageView d2 = this.f51358b.d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "mClearEditInfoImage");
                d2.setVisibility(8);
            } else if (TextUtils.equals(charSequence, this.f51358b.f51351c)) {
                ImTextTitleBar a4 = this.f51358b.a();
                Intrinsics.checkExpressionValueIsNotNull(a4, "mTitleBar");
                View rightView3 = a4.getRightView();
                Intrinsics.checkExpressionValueIsNotNull(rightView3, "mTitleBar.rightView");
                rightView3.setAlpha(0.34f);
                ImTextTitleBar a5 = this.f51358b.a();
                Intrinsics.checkExpressionValueIsNotNull(a5, "mTitleBar");
                View rightView4 = a5.getRightView();
                Intrinsics.checkExpressionValueIsNotNull(rightView4, "mTitleBar.rightView");
                rightView4.setEnabled(false);
                ImageView d3 = this.f51358b.d();
                Intrinsics.checkExpressionValueIsNotNull(d3, "mClearEditInfoImage");
                d3.setVisibility(0);
            } else {
                ImTextTitleBar a6 = this.f51358b.a();
                Intrinsics.checkExpressionValueIsNotNull(a6, "mTitleBar");
                View rightView5 = a6.getRightView();
                Intrinsics.checkExpressionValueIsNotNull(rightView5, "mTitleBar.rightView");
                rightView5.setAlpha(1.0f);
                ImTextTitleBar a7 = this.f51358b.a();
                Intrinsics.checkExpressionValueIsNotNull(a7, "mTitleBar");
                View rightView6 = a7.getRightView();
                Intrinsics.checkExpressionValueIsNotNull(rightView6, "mTitleBar.rightView");
                rightView6.setEnabled(true);
                ImageView d4 = this.f51358b.d();
                Intrinsics.checkExpressionValueIsNotNull(d4, "mClearEditInfoImage");
                d4.setVisibility(0);
            }
            if (editable != null) {
                i = editable.length();
            }
            int i2 = 20;
            if (i <= 20) {
                i2 = i;
            }
            TextView c2 = this.f51358b.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "mWordCountText");
            c2.setText(i2 + "/20");
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51357a, false, 51899, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51357a, false, 51899, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            EditGroupInfoActivity editGroupInfoActivity = this.f51358b;
            DmtEditText b2 = this.f51358b.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "mInfoEditText");
            EditText editText = b2;
            if (PatchProxy.isSupport(new Object[]{editText, 20}, editGroupInfoActivity, EditGroupInfoActivity.f51348a, false, 51887, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {editText, 20};
                ChangeQuickRedirect changeQuickRedirect = EditGroupInfoActivity.f51348a;
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                PatchProxy.accessDispatch(objArr, editGroupInfoActivity, changeQuickRedirect2, false, 51887, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Editable text = editText.getText();
            if (text.length() > 20) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) editGroupInfoActivity, editGroupInfoActivity.getString(C0906R.string.asz, new Object[]{"20"})).a();
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditGroupInfoActivity f51360b;

        d(EditGroupInfoActivity editGroupInfoActivity) {
            this.f51360b = editGroupInfoActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51359a, false, 51900, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51359a, false, 51900, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f51360b.b().setText("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, k = 3, mv = {1, 1, 15})
    static final class e implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51361a;

        /* renamed from: b  reason: collision with root package name */
        public static final e f51362b = new e();

        e() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f51361a, false, 51901, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f51361a, false, 51901, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return false;
            } else {
                return true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<ImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ EditGroupInfoActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(EditGroupInfoActivity editGroupInfoActivity) {
            super(0);
            this.this$0 = editGroupInfoActivity;
        }

        public final ImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51902, new Class[0], ImageView.class)) {
                return (ImageView) this.this$0.a((int) C0906R.id.azw);
            }
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51902, new Class[0], ImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<DmtEditText> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ EditGroupInfoActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(EditGroupInfoActivity editGroupInfoActivity) {
            super(0);
            this.this$0 = editGroupInfoActivity;
        }

        public final DmtEditText invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51903, new Class[0], DmtEditText.class)) {
                return (DmtEditText) this.this$0.a((int) C0906R.id.aa7);
            }
            return (DmtEditText) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51903, new Class[0], DmtEditText.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<DmtStatusView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ EditGroupInfoActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(EditGroupInfoActivity editGroupInfoActivity) {
            super(0);
            this.this$0 = editGroupInfoActivity;
        }

        public final DmtStatusView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51904, new Class[0], DmtStatusView.class)) {
                return (DmtStatusView) this.this$0.a((int) C0906R.id.du3);
            }
            return (DmtStatusView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51904, new Class[0], DmtStatusView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<ImTextTitleBar> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ EditGroupInfoActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(EditGroupInfoActivity editGroupInfoActivity) {
            super(0);
            this.this$0 = editGroupInfoActivity;
        }

        public final ImTextTitleBar invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51905, new Class[0], ImTextTitleBar.class)) {
                return (ImTextTitleBar) this.this$0.a((int) C0906R.id.d3m);
            }
            return (ImTextTitleBar) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51905, new Class[0], ImTextTitleBar.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ EditGroupInfoActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(EditGroupInfoActivity editGroupInfoActivity) {
            super(0);
            this.this$0 = editGroupInfoActivity;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51906, new Class[0], TextView.class)) {
                return (TextView) this.this$0.a((int) C0906R.id.dlq);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51906, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class k implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51363a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditGroupInfoActivity f51364b;

        k(EditGroupInfoActivity editGroupInfoActivity) {
            this.f51364b = editGroupInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51363a, false, 51907, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51363a, false, 51907, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f51364b.f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class l implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51365a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditGroupInfoActivity f51366b;

        l(EditGroupInfoActivity editGroupInfoActivity) {
            this.f51366b = editGroupInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51365a, false, 51908, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51365a, false, 51908, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            EditGroupInfoActivity.super.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51367a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditGroupInfoActivity f51368b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51369c;

        m(EditGroupInfoActivity editGroupInfoActivity, String str) {
            this.f51368b = editGroupInfoActivity;
            this.f51369c = str;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f51367a, false, 51909, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51367a, false, 51909, new Class[0], Void.TYPE);
                return;
            }
            this.f51368b.e().d();
            com.bytedance.im.core.d.e eVar = this.f51368b.f51352d;
            if (eVar != null) {
                eVar.a(this.f51369c, (com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.b>) new com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.b>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f51370a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ m f51371b;

                    {
                        this.f51371b = r1;
                    }

                    public final void a(@Nullable com.bytedance.im.core.d.j jVar) {
                        if (PatchProxy.isSupport(new Object[]{jVar}, this, f51370a, false, 51911, new Class[]{com.bytedance.im.core.d.j.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{jVar}, this, f51370a, false, 51911, new Class[]{com.bytedance.im.core.d.j.class}, Void.TYPE);
                            return;
                        }
                        DmtStatusView e2 = this.f51371b.f51368b.e();
                        Intrinsics.checkExpressionValueIsNotNull(e2, "mLoadingStatusView");
                        e2.setVisibility(8);
                        com.ss.android.ugc.aweme.im.sdk.group.b.b.a(this.f51371b.f51368b, jVar);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        String str;
                        com.bytedance.im.core.d.b bVar = (com.bytedance.im.core.d.b) obj;
                        if (PatchProxy.isSupport(new Object[]{bVar}, this, f51370a, false, 51910, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar}, this, f51370a, false, 51910, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                            return;
                        }
                        DmtStatusView e2 = this.f51371b.f51368b.e();
                        Intrinsics.checkExpressionValueIsNotNull(e2, "mLoadingStatusView");
                        e2.setVisibility(8);
                        if (bVar != null) {
                            Intent intent = new Intent();
                            com.bytedance.im.core.d.c coreInfo = bVar.getCoreInfo();
                            if (coreInfo != null) {
                                str = coreInfo.getName();
                            } else {
                                str = null;
                            }
                            intent.putExtra("editInfo", str);
                            this.f51371b.f51368b.setResult(222, intent);
                            this.f51371b.f51368b.finish();
                        }
                    }
                });
            }
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f51348a, false, 51890, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f51348a, false, 51890, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.l == null) {
            this.l = new HashMap();
        }
        View view = (View) this.l.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.l.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final ImTextTitleBar a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51348a, false, 51878, new Class[0], ImTextTitleBar.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51348a, false, 51878, new Class[0], ImTextTitleBar.class);
        } else {
            value = this.f51353f.getValue();
        }
        return (ImTextTitleBar) value;
    }

    public final DmtEditText b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51348a, false, 51879, new Class[0], DmtEditText.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51348a, false, 51879, new Class[0], DmtEditText.class);
        } else {
            value = this.g.getValue();
        }
        return (DmtEditText) value;
    }

    public final TextView c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51348a, false, 51880, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51348a, false, 51880, new Class[0], TextView.class);
        } else {
            value = this.h.getValue();
        }
        return (TextView) value;
    }

    public final ImageView d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51348a, false, 51881, new Class[0], ImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51348a, false, 51881, new Class[0], ImageView.class);
        } else {
            value = this.i.getValue();
        }
        return (ImageView) value;
    }

    public final DmtStatusView e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51348a, false, 51882, new Class[0], DmtStatusView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51348a, false, 51882, new Class[0], DmtStatusView.class);
        } else {
            value = this.j.getValue();
        }
        return (DmtStatusView) value;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f51348a, false, 51893, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51348a, false, 51893, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51348a, false, 51894, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51348a, false, 51894, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    public final void f() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f51348a, false, 51888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51348a, false, 51888, new Class[0], Void.TYPE);
            return;
        }
        DmtEditText b2 = b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "mInfoEditText");
        CharSequence text = b2.getText();
        if (text == null) {
            text = "";
        }
        String a2 = ap.a(text.toString());
        CharSequence charSequence = a2;
        if (TextUtils.isEmpty(charSequence)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.asw).a();
        } else if (!TextUtils.equals(charSequence, this.f51351c)) {
            Context context = this;
            com.bytedance.im.core.d.e eVar = this.f51352d;
            if (eVar != null) {
                str = eVar.f21270a;
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.im.sdk.group.b.b.a(context, str, new m(this, a2));
        }
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f51348a, false, 51889, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51348a, false, 51889, new Class[0], Void.TYPE);
            return;
        }
        DmtEditText b2 = b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "mInfoEditText");
        if (!TextUtils.equals(this.f51351c, b2.getText())) {
            DmtEditText b3 = b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "mInfoEditText");
            if (!TextUtils.isEmpty(ap.a(String.valueOf(b3.getText())))) {
                new a.C0185a(this).b((int) C0906R.string.au3).e(C0906R.style.kx).a((int) C0906R.string.awu, (DialogInterface.OnClickListener) new k(this)).b((int) C0906R.string.art, (DialogInterface.OnClickListener) new l(this)).a().a();
                return;
            }
        }
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dc, code lost:
        if (r0 == null) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f51348a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 51883(0xcaab, float:7.2704E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f51348a
            r3 = 0
            r4 = 51883(0xcaab, float:7.2704E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            java.lang.String r0 = "com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r11)
            r0 = 2131689563(0x7f0f005b, float:1.9008145E38)
            r10.setContentView((int) r0)
            com.ss.android.ugc.aweme.im.sdk.providedservices.IImplService r0 = com.ss.android.ugc.aweme.im.sdk.d.a.b()
            r1 = r10
            android.app.Activity r1 = (android.app.Activity) r1
            r0.setupStatusBar(r1)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f51348a
            r3 = 0
            r4 = 51884(0xcaac, float:7.2705E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r7 = 0
            if (r0 == 0) goto L_0x0071
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f51348a
            r3 = 0
            r4 = 51884(0xcaac, float:7.2705E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00ab
        L_0x0071:
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x0082
            java.lang.String r1 = "type"
            int r0 = r0.getIntExtra(r1, r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0083
        L_0x0082:
            r0 = r7
        L_0x0083:
            r10.k = r0
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x0092
            java.lang.String r1 = "conversationId"
            java.lang.String r0 = r0.getStringExtra(r1)
            goto L_0x0093
        L_0x0092:
            r0 = r7
        L_0x0093:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x00a1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r1 = 0
            goto L_0x00a2
        L_0x00a1:
            r1 = 1
        L_0x00a2:
            if (r1 != 0) goto L_0x00ab
            com.bytedance.im.core.d.e r1 = new com.bytedance.im.core.d.e
            r1.<init>(r0)
            r10.f51352d = r1
        L_0x00ab:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f51348a
            r3 = 0
            r4 = 51885(0xcaad, float:7.2706E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00d0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f51348a
            r3 = 0
            r4 = 51885(0xcaad, float:7.2706E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01a0
        L_0x00d0:
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x00de
            java.lang.String r1 = "editInfo"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x00e0
        L_0x00de:
            java.lang.String r0 = ""
        L_0x00e0:
            r10.f51351c = r0
            java.lang.Integer r0 = r10.k
            if (r0 != 0) goto L_0x00e7
            goto L_0x0126
        L_0x00e7:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0126
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r0 = r10.a()
            r1 = 2131560453(0x7f0d0805, float:1.8746279E38)
            java.lang.String r1 = r10.getString(r1)
            r0.setTitle((java.lang.String) r1)
            android.widget.TextView r0 = r10.c()
            java.lang.String r1 = "mWordCountText"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.f51351c
            if (r2 == 0) goto L_0x0115
            int r2 = r2.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
        L_0x0115:
            r1.append(r7)
            java.lang.String r2 = "/20"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0126:
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r10.b()
            java.lang.String r1 = r10.f51351c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r10.b()
            java.lang.String r1 = r10.f51351c
            if (r1 != 0) goto L_0x013c
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x013c:
            int r1 = r1.length()
            r0.setSelection(r1)
            java.lang.String r0 = r10.f51351c
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0151
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0150
            goto L_0x0151
        L_0x0150:
            r8 = 0
        L_0x0151:
            if (r8 == 0) goto L_0x0161
            android.widget.ImageView r0 = r10.d()
            java.lang.String r1 = "mClearEditInfoImage"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
        L_0x0161:
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r0 = r10.a()
            java.lang.String r1 = "mTitleBar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.view.View r0 = r0.getRightView()
            java.lang.String r1 = "mTitleBar.rightView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setEnabled(r9)
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r0 = r10.a()
            java.lang.String r1 = "mTitleBar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.view.View r0 = r0.getRightView()
            java.lang.String r1 = "mTitleBar.rightView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 1051595899(0x3eae147b, float:0.34)
            r0.setAlpha(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r10.e()
            r1 = r10
            android.content.Context r1 = (android.content.Context) r1
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = com.bytedance.ies.dmt.ui.widget.DmtStatusView.a.a((android.content.Context) r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = r1.a()
            r0.setBuilder(r1)
        L_0x01a0:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f51348a
            r3 = 0
            r4 = 51886(0xcaae, float:7.2708E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01c4
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f51348a
            r3 = 0
            r4 = 51886(0xcaae, float:7.2708E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01f9
        L_0x01c4:
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r0 = r10.a()
            com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$b r1 = new com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$b
            r1.<init>(r10)
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar$a r1 = (com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar.a) r1
            r0.setOnTitlebarClickListener(r1)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r10.b()
            com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$c r1 = new com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$c
            r1.<init>(r10)
            android.text.TextWatcher r1 = (android.text.TextWatcher) r1
            r0.addTextChangedListener(r1)
            android.widget.ImageView r0 = r10.d()
            com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$d r1 = new com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$d
            r1.<init>(r10)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r10.b()
            com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$e r1 = com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity.e.f51362b
            android.widget.TextView$OnEditorActionListener r1 = (android.widget.TextView.OnEditorActionListener) r1
            r0.setOnEditorActionListener(r1)
        L_0x01f9:
            java.lang.String r0 = "com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity.onCreate(android.os.Bundle):void");
    }
}
