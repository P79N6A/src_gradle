package com.ss.android.ugc.aweme.friends.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SummonFriendsFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49366a;

    /* renamed from: b  reason: collision with root package name */
    private SummonFriendsFragment f49367b;

    /* renamed from: c  reason: collision with root package name */
    private View f49368c;

    /* renamed from: d  reason: collision with root package name */
    private View f49369d;

    /* renamed from: e  reason: collision with root package name */
    private View f49370e;

    /* renamed from: f  reason: collision with root package name */
    private TextWatcher f49371f;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f49366a, false, 47502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49366a, false, 47502, new Class[0], Void.TYPE);
            return;
        }
        SummonFriendsFragment summonFriendsFragment = this.f49367b;
        if (summonFriendsFragment != null) {
            this.f49367b = null;
            summonFriendsFragment.mSendView = null;
            summonFriendsFragment.mTitleView = null;
            summonFriendsFragment.mIvSearchBar = null;
            summonFriendsFragment.mBackView = null;
            summonFriendsFragment.mEditView = null;
            summonFriendsFragment.mBtnClear = null;
            summonFriendsFragment.mListView = null;
            summonFriendsFragment.mStatusView = null;
            this.f49368c.setOnClickListener(null);
            this.f49368c = null;
            this.f49369d.setOnClickListener(null);
            this.f49369d = null;
            ((TextView) this.f49370e).removeTextChangedListener(this.f49371f);
            this.f49371f = null;
            this.f49370e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SummonFriendsFragment_ViewBinding(final SummonFriendsFragment summonFriendsFragment, View view) {
        this.f49367b = summonFriendsFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.di9, "field 'mSendView' and method 'click'");
        summonFriendsFragment.mSendView = (TextView) Utils.castView(findRequiredView, C0906R.id.di9, "field 'mSendView'", TextView.class);
        this.f49368c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49372a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f49372a, false, 47503, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f49372a, false, 47503, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                summonFriendsFragment.click(view2);
            }
        });
        summonFriendsFragment.mTitleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitleView'", TextView.class);
        summonFriendsFragment.mIvSearchBar = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b4s, "field 'mIvSearchBar'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.ix, "field 'mBackView' and method 'click'");
        summonFriendsFragment.mBackView = (ImageView) Utils.castView(findRequiredView2, C0906R.id.ix, "field 'mBackView'", ImageView.class);
        this.f49369d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49375a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f49375a, false, 47504, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f49375a, false, 47504, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                summonFriendsFragment.click(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.aai, "field 'mEditView' and method 'onTextChange'");
        summonFriendsFragment.mEditView = (EditText) Utils.castView(findRequiredView3, C0906R.id.aai, "field 'mEditView'", EditText.class);
        this.f49370e = findRequiredView3;
        this.f49371f = new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49378a;

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CharSequence charSequence2 = charSequence;
                if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49378a, false, 47505, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49378a, false, 47505, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                summonFriendsFragment.onTextChange(charSequence2);
            }
        };
        ((TextView) findRequiredView3).addTextChangedListener(this.f49371f);
        summonFriendsFragment.mBtnClear = Utils.findRequiredView(view, C0906R.id.ns, "field 'mBtnClear'");
        summonFriendsFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bd0, "field 'mListView'", RecyclerView.class);
        summonFriendsFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        summonFriendsFragment.margin = view.getContext().getResources().getDimensionPixelSize(C0906R.dimen.cl);
    }
}
