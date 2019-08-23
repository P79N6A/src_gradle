package com.ss.android.ugc.aweme.friends.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;

public class FindFriendsFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49212a;

    /* renamed from: b  reason: collision with root package name */
    private FindFriendsFragment f49213b;

    /* renamed from: c  reason: collision with root package name */
    private View f49214c;

    /* renamed from: d  reason: collision with root package name */
    private View f49215d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f49212a, false, 47183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49212a, false, 47183, new Class[0], Void.TYPE);
            return;
        }
        FindFriendsFragment findFriendsFragment = this.f49213b;
        if (findFriendsFragment != null) {
            this.f49213b = null;
            findFriendsFragment.mStatusView = null;
            findFriendsFragment.mEditSearch = null;
            findFriendsFragment.mTvSearchHit = null;
            findFriendsFragment.mTvSearchBtn = null;
            findFriendsFragment.mBtnSearchClear = null;
            findFriendsFragment.mPerfectUsrInfoGuideView = null;
            findFriendsFragment.mListView = null;
            findFriendsFragment.mSearchGroup = null;
            this.f49214c.setOnClickListener(null);
            this.f49214c = null;
            this.f49215d.setOnClickListener(null);
            this.f49215d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FindFriendsFragment_ViewBinding(final FindFriendsFragment findFriendsFragment, View view) {
        this.f49213b = findFriendsFragment;
        findFriendsFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        findFriendsFragment.mEditSearch = (DmtEditText) Utils.findRequiredViewAsType(view, C0906R.id.aai, "field 'mEditSearch'", DmtEditText.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.di7, "field 'mTvSearchHit' and method 'searchUser'");
        findFriendsFragment.mTvSearchHit = (DmtTextView) Utils.castView(findRequiredView, C0906R.id.di7, "field 'mTvSearchHit'", DmtTextView.class);
        this.f49214c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49216a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f49216a, false, 47184, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f49216a, false, 47184, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                findFriendsFragment.searchUser();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.di3, "field 'mTvSearchBtn' and method 'searchUser'");
        findFriendsFragment.mTvSearchBtn = (DmtTextView) Utils.castView(findRequiredView2, C0906R.id.di3, "field 'mTvSearchBtn'", DmtTextView.class);
        this.f49215d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49219a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f49219a, false, 47185, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f49219a, false, 47185, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                findFriendsFragment.searchUser();
            }
        });
        findFriendsFragment.mBtnSearchClear = (ImageButton) Utils.findRequiredViewAsType(view, C0906R.id.ns, "field 'mBtnSearchClear'", ImageButton.class);
        findFriendsFragment.mPerfectUsrInfoGuideView = (NoticeView) Utils.findRequiredViewAsType(view, C0906R.id.bx8, "field 'mPerfectUsrInfoGuideView'", NoticeView.class);
        findFriendsFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.acu, "field 'mListView'", RecyclerView.class);
        findFriendsFragment.mSearchGroup = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.cld, "field 'mSearchGroup'", ViewGroup.class);
        findFriendsFragment.mSearchHitString = view.getContext().getResources().getString(C0906R.string.c2i);
    }
}
