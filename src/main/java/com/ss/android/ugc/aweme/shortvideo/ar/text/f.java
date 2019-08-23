package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0010H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/ar/text/BubbleTextInputView;", "Lcom/ss/android/ugc/aweme/shortvideo/ar/text/EffectTextInputView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContentLayout", "Landroid/view/View;", "params", "Landroid/widget/RelativeLayout$LayoutParams;", "getParams", "()Landroid/widget/RelativeLayout$LayoutParams;", "setParams", "(Landroid/widget/RelativeLayout$LayoutParams;)V", "getLayout", "", "getTextWatcher", "Landroid/text/TextWatcher;", "initView", "", "onClickSave", "setMaxTextCount", "count", "updateLayout", "height", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65693a;
    @NotNull
    private RelativeLayout.LayoutParams l;
    private View m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/ar/text/BubbleTextInputView$getTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65694a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f65695b;

        public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65694a, false, 75144, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65694a, false, 75144, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence2, NotifyType.SOUND);
        }

        a(f fVar) {
            this.f65695b = fVar;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            if (PatchProxy.isSupport(new Object[]{editable}, this, f65694a, false, 75146, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f65694a, false, 75146, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            if (editable != null && ((this.f65695b.k.length() <= this.f65695b.j || this.f65695b.j <= 0) && this.f65695b.h != null)) {
                this.f65695b.h.a(editable.toString());
            }
        }

        public final void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65694a, false, 75145, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65694a, false, 75145, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence, NotifyType.SOUND);
            this.f65695b.k = charSequence.toString();
            if (this.f65695b.k == null) {
                this.f65695b.k = "";
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/ar/text/BubbleTextInputView$setMaxTextCount$1", "Landroid/text/InputFilter$LengthFilter;", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends InputFilter.LengthFilter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65696a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f65697b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, int i) {
            super(i);
            this.f65697b = fVar;
        }

        @Nullable
        public final CharSequence filter(@NotNull CharSequence charSequence, int i, int i2, @NotNull Spanned spanned, int i3, int i4) {
            CharSequence charSequence2 = charSequence;
            Spanned spanned2 = spanned;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), spanned2, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f65696a, false, 75147, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Spanned.class, Integer.TYPE, Integer.TYPE}, CharSequence.class)) {
                return (CharSequence) PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), spanned2, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f65696a, false, 75147, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Spanned.class, Integer.TYPE, Integer.TYPE}, CharSequence.class);
            }
            Intrinsics.checkParameterIsNotNull(charSequence2, "source");
            Intrinsics.checkParameterIsNotNull(spanned2, "dest");
            CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
            if (this.f65697b.j - (spanned.length() - (i4 - i3)) < i2 - i) {
                EditText editText = this.f65697b.f65727c;
                Intrinsics.checkExpressionValueIsNotNull(editText, "editView");
                com.bytedance.ies.dmt.ui.d.a.c(editText.getContext(), this.f65697b.i).a();
            }
            return filter;
        }
    }

    @JvmOverloads
    public f(@NotNull Context context) {
        this(context, null, 2);
    }

    public final int getLayout() {
        return C0906R.layout.a62;
    }

    @NotNull
    public final RelativeLayout.LayoutParams getParams() {
        return this.l;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65693a, false, 75139, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65693a, false, 75139, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.h.b(this.k);
    }

    @NotNull
    public final TextWatcher getTextWatcher() {
        if (!PatchProxy.isSupport(new Object[0], this, f65693a, false, 75141, new Class[0], TextWatcher.class)) {
            return new a(this);
        }
        return (TextWatcher) PatchProxy.accessDispatch(new Object[0], this, f65693a, false, 75141, new Class[0], TextWatcher.class);
    }

    public final void setParams(@NotNull RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{layoutParams2}, this, f65693a, false, 75136, new Class[]{RelativeLayout.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f65693a, false, 75136, new Class[]{RelativeLayout.LayoutParams.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(layoutParams2, "<set-?>");
        this.l = layoutParams2;
    }

    public final void a(@Nullable Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f65693a, false, 75137, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f65693a, false, 75137, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.a(context);
        this.m = this.f65729e.findViewById(C0906R.id.yv);
    }

    public final void setMaxTextCount(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65693a, false, 75138, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65693a, false, 75138, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setMaxTextCount(i);
        EditText editText = this.f65727c;
        Intrinsics.checkExpressionValueIsNotNull(editText, "editView");
        editText.setFilters((InputFilter[]) new b[]{new b(this, this.j)});
    }

    public final void a(int i) {
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65693a, false, 75140, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65693a, false, 75140, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        View view = this.m;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            View view2 = this.m;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
            if (fc.a()) {
                View view3 = this.f65730f;
                Intrinsics.checkExpressionValueIsNotNull(view3, "titleLayout");
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                if (layoutParams3 != null) {
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = fc.c(getContext()) - fb.b(getContext(), fb.a(getContext()));
                    int i2 = layoutParams4.topMargin;
                    fb.a(getContext());
                    View view4 = this.f65730f;
                    Intrinsics.checkExpressionValueIsNotNull(view4, "titleLayout");
                    view4.setLayoutParams(layoutParams4);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private f(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        EditText editText = this.f65727c;
        Intrinsics.checkExpressionValueIsNotNull(editText, "editView");
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (layoutParams != null) {
            this.l = (RelativeLayout.LayoutParams) layoutParams;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    private /* synthetic */ f(Context context, AttributeSet attributeSet, int i) {
        this(context, null);
    }
}
