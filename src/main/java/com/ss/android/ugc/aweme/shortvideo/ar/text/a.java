package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/ar/text/ARTextInputView;", "Lcom/ss/android/ugc/aweme/shortvideo/ar/text/EffectTextInputView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "params", "Landroid/widget/FrameLayout$LayoutParams;", "getParams", "()Landroid/widget/FrameLayout$LayoutParams;", "setParams", "(Landroid/widget/FrameLayout$LayoutParams;)V", "getLayout", "", "getTextWatcher", "Landroid/text/TextWatcher;", "setHintText", "", "str", "", "updateLayout", "height", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65675a;
    @NotNull
    private FrameLayout.LayoutParams l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/ar/text/ARTextInputView$getTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.a$a  reason: collision with other inner class name */
    public static final class C0707a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65676a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f65677b;

        public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65676a, false, 75126, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65676a, false, 75126, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence2, NotifyType.SOUND);
        }

        C0707a(a aVar) {
            this.f65677b = aVar;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            if (PatchProxy.isSupport(new Object[]{editable}, this, f65676a, false, 75128, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f65676a, false, 75128, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            if (editable != null) {
                EditText editText = this.f65677b.f65727c;
                Intrinsics.checkExpressionValueIsNotNull(editText, "editView");
                int selectionStart = editText.getSelectionStart();
                EditText editText2 = this.f65677b.f65727c;
                Intrinsics.checkExpressionValueIsNotNull(editText2, "editView");
                int selectionEnd = editText2.getSelectionEnd();
                if (this.f65677b.k.length() > this.f65677b.j && this.f65677b.j > 0) {
                    editable.delete(selectionStart - 1, selectionEnd);
                    EditText editText3 = this.f65677b.f65727c;
                    Intrinsics.checkExpressionValueIsNotNull(editText3, "editView");
                    editText3.setText(editable);
                    this.f65677b.f65727c.setSelection(editable.toString().length());
                    EditText editText4 = this.f65677b.f65727c;
                    Intrinsics.checkExpressionValueIsNotNull(editText4, "editView");
                    com.bytedance.ies.dmt.ui.d.a.c(editText4.getContext(), this.f65677b.i).a();
                } else if (this.f65677b.h != null) {
                    this.f65677b.h.a(editable.toString());
                }
            }
        }

        public final void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65676a, false, 75127, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65676a, false, 75127, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence, NotifyType.SOUND);
            this.f65677b.k = charSequence.toString();
            if (this.f65677b.k == null) {
                this.f65677b.k = "";
            }
        }
    }

    @JvmOverloads
    public a(@NotNull Context context) {
        this(context, null, 2);
    }

    public final int getLayout() {
        return C0906R.layout.a7w;
    }

    @NotNull
    public final FrameLayout.LayoutParams getParams() {
        return this.l;
    }

    @NotNull
    public final TextWatcher getTextWatcher() {
        if (!PatchProxy.isSupport(new Object[0], this, f65675a, false, 75123, new Class[0], TextWatcher.class)) {
            return new C0707a(this);
        }
        return (TextWatcher) PatchProxy.accessDispatch(new Object[0], this, f65675a, false, 75123, new Class[0], TextWatcher.class);
    }

    public final void setParams(@NotNull FrameLayout.LayoutParams layoutParams) {
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f65675a, false, 75120, new Class[]{FrameLayout.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f65675a, false, 75120, new Class[]{FrameLayout.LayoutParams.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(layoutParams2, "<set-?>");
        this.l = layoutParams2;
    }

    public final void setHintText(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f65675a, false, 75121, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f65675a, false, 75121, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f65727c != null) {
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence)) {
                EditText editText = this.f65727c;
                Intrinsics.checkExpressionValueIsNotNull(editText, "editView");
                editText.setHint(charSequence);
            }
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65675a, false, 75122, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65675a, false, 75122, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f65727c != null) {
            FrameLayout.LayoutParams layoutParams = this.l;
            EditText editText = this.f65727c;
            Intrinsics.checkExpressionValueIsNotNull(editText, "editView");
            layoutParams.bottomMargin = (int) (((float) i) + UIUtils.dip2Px(editText.getContext(), 16.0f));
            EditText editText2 = this.f65727c;
            Intrinsics.checkExpressionValueIsNotNull(editText2, "editView");
            editText2.setLayoutParams(this.l);
        }
        if (fc.a()) {
            View view = this.f65730f;
            Intrinsics.checkExpressionValueIsNotNull(view, "titleLayout");
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.topMargin = fc.c(getContext()) - fb.b(getContext(), fb.a(getContext()));
                int i2 = layoutParams3.topMargin;
                fb.a(getContext());
                View view2 = this.f65730f;
                Intrinsics.checkExpressionValueIsNotNull(view2, "titleLayout");
                view2.setLayoutParams(layoutParams3);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        EditText editText = this.f65727c;
        Intrinsics.checkExpressionValueIsNotNull(editText, "editView");
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (layoutParams != null) {
            this.l = (FrameLayout.LayoutParams) layoutParams;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    private /* synthetic */ a(Context context, AttributeSet attributeSet, int i) {
        this(context, null);
    }
}
