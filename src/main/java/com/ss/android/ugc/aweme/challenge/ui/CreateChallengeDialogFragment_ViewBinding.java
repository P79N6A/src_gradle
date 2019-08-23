package com.ss.android.ugc.aweme.challenge.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class CreateChallengeDialogFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35528a;

    /* renamed from: b  reason: collision with root package name */
    private CreateChallengeDialogFragment f35529b;

    /* renamed from: c  reason: collision with root package name */
    private View f35530c;

    /* renamed from: d  reason: collision with root package name */
    private TextWatcher f35531d;

    /* renamed from: e  reason: collision with root package name */
    private View f35532e;

    /* renamed from: f  reason: collision with root package name */
    private TextWatcher f35533f;
    private View g;
    private View h;
    private View i;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f35528a, false, 26209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35528a, false, 26209, new Class[0], Void.TYPE);
            return;
        }
        CreateChallengeDialogFragment createChallengeDialogFragment = this.f35529b;
        if (createChallengeDialogFragment != null) {
            this.f35529b = null;
            createChallengeDialogFragment.mTitleView = null;
            createChallengeDialogFragment.mEditTitleView = null;
            createChallengeDialogFragment.mEditDescView = null;
            createChallengeDialogFragment.mCountView = null;
            createChallengeDialogFragment.mConfirmView = null;
            createChallengeDialogFragment.mDeleteView = null;
            ((TextView) this.f35530c).removeTextChangedListener(this.f35531d);
            this.f35531d = null;
            this.f35530c = null;
            ((TextView) this.f35532e).removeTextChangedListener(this.f35533f);
            this.f35533f = null;
            this.f35532e = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CreateChallengeDialogFragment_ViewBinding(final CreateChallengeDialogFragment createChallengeDialogFragment, View view) {
        this.f35529b = createChallengeDialogFragment;
        createChallengeDialogFragment.mTitleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitleView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.rv, "field 'mEditTitleView' and method 'onTitleTextChange'");
        createChallengeDialogFragment.mEditTitleView = (EditText) Utils.castView(findRequiredView, C0906R.id.rv, "field 'mEditTitleView'", EditText.class);
        this.f35530c = findRequiredView;
        this.f35531d = new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35534a;

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CharSequence charSequence2 = charSequence;
                if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f35534a, false, 26210, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f35534a, false, 26210, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                createChallengeDialogFragment.onTitleTextChange(charSequence2);
            }
        };
        ((TextView) findRequiredView).addTextChangedListener(this.f35531d);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.ro, "field 'mEditDescView' and method 'onDescTextChange'");
        createChallengeDialogFragment.mEditDescView = (EditText) Utils.castView(findRequiredView2, C0906R.id.ro, "field 'mEditDescView'", EditText.class);
        this.f35532e = findRequiredView2;
        this.f35533f = new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35537a;

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CharSequence charSequence2 = charSequence;
                if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f35537a, false, 26211, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f35537a, false, 26211, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                createChallengeDialogFragment.onDescTextChange(charSequence2);
            }
        };
        ((TextView) findRequiredView2).addTextChangedListener(this.f35533f);
        createChallengeDialogFragment.mCountView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a08, "field 'mCountView'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.y2, "field 'mConfirmView' and method 'click'");
        createChallengeDialogFragment.mConfirmView = (TextView) Utils.castView(findRequiredView3, C0906R.id.y2, "field 'mConfirmView'", TextView.class);
        this.g = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35540a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f35540a, false, 26212, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f35540a, false, 26212, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                createChallengeDialogFragment.click(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.d0h, "field 'mDeleteView' and method 'click'");
        createChallengeDialogFragment.mDeleteView = findRequiredView4;
        this.h = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35543a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f35543a, false, 26213, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f35543a, false, 26213, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                createChallengeDialogFragment.click(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.ix, "method 'click' and method 'back'");
        this.i = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35546a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f35546a, false, 26214, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f35546a, false, 26214, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                createChallengeDialogFragment.click(view);
                createChallengeDialogFragment.back();
            }
        });
    }
}
