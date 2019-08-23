package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ProfileSetSchoolFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62297a;

    /* renamed from: b  reason: collision with root package name */
    private ProfileSetSchoolFragment f62298b;

    /* renamed from: c  reason: collision with root package name */
    private View f62299c;

    /* renamed from: d  reason: collision with root package name */
    private View f62300d;

    /* renamed from: e  reason: collision with root package name */
    private View f62301e;

    /* renamed from: f  reason: collision with root package name */
    private View f62302f;
    private View g;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62297a, false, 68924, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62297a, false, 68924, new Class[0], Void.TYPE);
            return;
        }
        ProfileSetSchoolFragment profileSetSchoolFragment = this.f62298b;
        if (profileSetSchoolFragment != null) {
            this.f62298b = null;
            profileSetSchoolFragment.mDmtStatusView = null;
            profileSetSchoolFragment.textTitleBar = null;
            profileSetSchoolFragment.mCollegeText = null;
            profileSetSchoolFragment.mSchoolText = null;
            profileSetSchoolFragment.mEnrollYearText = null;
            profileSetSchoolFragment.mDegreeText = null;
            profileSetSchoolFragment.mShowRangeText = null;
            this.f62299c.setOnClickListener(null);
            this.f62299c = null;
            this.f62300d.setOnClickListener(null);
            this.f62300d = null;
            this.f62301e.setOnClickListener(null);
            this.f62301e = null;
            this.f62302f.setOnClickListener(null);
            this.f62302f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ProfileSetSchoolFragment_ViewBinding(final ProfileSetSchoolFragment profileSetSchoolFragment, View view) {
        this.f62298b = profileSetSchoolFragment;
        profileSetSchoolFragment.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mDmtStatusView'", DmtStatusView.class);
        profileSetSchoolFragment.textTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'textTitleBar'", TextTitleBar.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.uh, "field 'mCollegeText' and method 'selectCollege'");
        profileSetSchoolFragment.mCollegeText = (CommonItemView) Utils.castView(findRequiredView, C0906R.id.uh, "field 'mCollegeText'", CommonItemView.class);
        this.f62299c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62303a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62303a, false, 68925, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62303a, false, 68925, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileSetSchoolFragment.selectCollege(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.cjw, "field 'mSchoolText' and method 'selectSchool'");
        profileSetSchoolFragment.mSchoolText = (CommonItemView) Utils.castView(findRequiredView2, C0906R.id.cjw, "field 'mSchoolText'", CommonItemView.class);
        this.f62300d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62306a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62306a, false, 68926, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62306a, false, 68926, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileSetSchoolFragment.selectSchool(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.a__, "field 'mEnrollYearText' and method 'setEnrollYear'");
        profileSetSchoolFragment.mEnrollYearText = (CommonItemView) Utils.castView(findRequiredView3, C0906R.id.a__, "field 'mEnrollYearText'", CommonItemView.class);
        this.f62301e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62309a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62309a, false, 68927, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62309a, false, 68927, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileSetSchoolFragment.setEnrollYear(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.a39, "field 'mDegreeText' and method 'selectDegree'");
        profileSetSchoolFragment.mDegreeText = (CommonItemView) Utils.castView(findRequiredView4, C0906R.id.a39, "field 'mDegreeText'", CommonItemView.class);
        this.f62302f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62312a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62312a, false, 68928, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62312a, false, 68928, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileSetSchoolFragment.selectDegree(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.dv2, "field 'mShowRangeText' and method 'changeShowRange'");
        profileSetSchoolFragment.mShowRangeText = (CommonItemView) Utils.castView(findRequiredView5, C0906R.id.dv2, "field 'mShowRangeText'", CommonItemView.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62315a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62315a, false, 68929, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62315a, false, 68929, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileSetSchoolFragment.changeShowRange(view2);
            }
        });
    }
}
