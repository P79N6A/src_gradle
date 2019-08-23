package com.ss.android.ugc.aweme.challenge.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class AddChallengeFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35441a;

    /* renamed from: b  reason: collision with root package name */
    private AddChallengeFragment f35442b;

    /* renamed from: c  reason: collision with root package name */
    private View f35443c;

    /* renamed from: d  reason: collision with root package name */
    private View f35444d;

    /* renamed from: e  reason: collision with root package name */
    private TextWatcher f35445e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f35441a, false, 25972, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35441a, false, 25972, new Class[0], Void.TYPE);
            return;
        }
        AddChallengeFragment addChallengeFragment = this.f35442b;
        if (addChallengeFragment != null) {
            this.f35442b = null;
            addChallengeFragment.mSendView = null;
            addChallengeFragment.mLabelView = null;
            addChallengeFragment.mEditView = null;
            addChallengeFragment.mListView = null;
            addChallengeFragment.mLoadingView = null;
            addChallengeFragment.mHideChallengeLayout = null;
            addChallengeFragment.mTitleBar = null;
            this.f35443c.setOnClickListener(null);
            this.f35443c = null;
            ((TextView) this.f35444d).removeTextChangedListener(this.f35445e);
            this.f35445e = null;
            this.f35444d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public AddChallengeFragment_ViewBinding(final AddChallengeFragment addChallengeFragment, View view) {
        this.f35442b = addChallengeFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.clx, "field 'mSendView' and method 'click'");
        addChallengeFragment.mSendView = (TextView) Utils.castView(findRequiredView, C0906R.id.clx, "field 'mSendView'", TextView.class);
        this.f35443c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35446a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f35446a, false, 25973, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f35446a, false, 25973, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                addChallengeFragment.click(view2);
            }
        });
        addChallengeFragment.mLabelView = Utils.findRequiredView(view, C0906R.id.aox, "field 'mLabelView'");
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.cl9, "field 'mEditView' and method 'onTextChange'");
        addChallengeFragment.mEditView = (EditText) Utils.castView(findRequiredView2, C0906R.id.cl9, "field 'mEditView'", EditText.class);
        this.f35444d = findRequiredView2;
        this.f35445e = new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35449a;

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CharSequence charSequence2 = charSequence;
                if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f35449a, false, 25974, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f35449a, false, 25974, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                addChallengeFragment.onTextChange(charSequence2);
            }
        };
        ((TextView) findRequiredView2).addTextChangedListener(this.f35445e);
        addChallengeFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bd0, "field 'mListView'", RecyclerView.class);
        addChallengeFragment.mLoadingView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.biy, "field 'mLoadingView'", ImageView.class);
        addChallengeFragment.mHideChallengeLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.aw5, "field 'mHideChallengeLayout'", LinearLayout.class);
        addChallengeFragment.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", ButtonTitleBar.class);
        addChallengeFragment.margin = view.getContext().getResources().getDimensionPixelSize(C0906R.dimen.cl);
    }
}
