package com.ss.android.ugc.aweme.choosemusic.view;

import android.support.design.widget.CoordinatorLayout;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment;

public class ChooseMusicFragmentView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36021a;

    /* renamed from: b  reason: collision with root package name */
    public ChooseMusicFragment f36022b;

    /* renamed from: c  reason: collision with root package name */
    public int f36023c;

    /* renamed from: d  reason: collision with root package name */
    public TextWatcher f36024d;
    @BindView(2131493213)
    public View mBackView;
    @BindView(2131498114)
    public TextView mCancelSearch;
    @BindView(2131494986)
    public ImageView mClearView;
    @BindView(2131495584)
    public LinearLayout mLinearSearch;
    @BindView(2131493757)
    public FrameLayout mMainLayout;
    @BindView(2131496798)
    public LinearLayout mRelativeSearch;
    @BindView(2131496800)
    public LinearLayout mSearchEditTextContainer;
    @BindView(2131498111)
    public EditText mSearchEditView;
    @BindView(2131493756)
    public LinearLayout mSearchLayout;
    @BindView(2131498112)
    public TextView mSearchTextView;
    @BindView(2131497167)
    public View mSkipView;
    @BindView(2131493566)
    public TextView txtClickRecommend;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36021a, false, 26831, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36021a, false, 26831, new Class[0], Void.TYPE);
            return;
        }
        this.mCancelSearch.setVisibility(4);
        this.mSearchTextView.setVisibility(0);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36021a, false, 26835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36021a, false, 26835, new Class[0], Void.TYPE);
        } else if (this.f36022b.getActivity() != null) {
            this.mSearchEditView.post(new d(this));
        }
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f36021a, false, 26836, new Class[0], String.class)) {
            return this.mSearchEditView.getText().toString();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f36021a, false, 26836, new Class[0], String.class);
    }

    public ViewGroup a(View view) {
        View view2 = view;
        while (true) {
            if (PatchProxy.isSupport(new Object[]{view2}, this, f36021a, false, 26839, new Class[]{View.class}, ViewGroup.class)) {
                return (ViewGroup) PatchProxy.accessDispatch(new Object[]{view2}, this, f36021a, false, 26839, new Class[]{View.class}, ViewGroup.class);
            } else if (view2 == null) {
                return null;
            } else {
                ViewParent parent = view2.getParent();
                if (!(parent instanceof ViewGroup)) {
                    return null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if ((layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof ViewPagerBottomSheetBehavior)) {
                    return viewGroup;
                }
                view2 = (View) parent;
            }
        }
    }

    public ChooseMusicFragmentView(View view, ChooseMusicFragment chooseMusicFragment, int i, TextWatcher textWatcher) {
        this.f36022b = chooseMusicFragment;
        this.f36023c = i;
        this.f36024d = textWatcher;
        ButterKnife.bind((Object) this, view);
    }
}
