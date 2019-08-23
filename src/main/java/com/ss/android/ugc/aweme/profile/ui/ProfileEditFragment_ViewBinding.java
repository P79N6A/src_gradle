package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public class ProfileEditFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62152a;

    /* renamed from: b  reason: collision with root package name */
    private ProfileEditFragment f62153b;

    /* renamed from: c  reason: collision with root package name */
    private View f62154c;

    /* renamed from: d  reason: collision with root package name */
    private View f62155d;

    /* renamed from: e  reason: collision with root package name */
    private View f62156e;

    /* renamed from: f  reason: collision with root package name */
    private View f62157f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62152a, false, 68746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62152a, false, 68746, new Class[0], Void.TYPE);
            return;
        }
        ProfileEditFragment profileEditFragment = this.f62153b;
        if (profileEditFragment != null) {
            this.f62153b = null;
            profileEditFragment.mHeaderImage = null;
            profileEditFragment.mNickname = null;
            profileEditFragment.editId = null;
            profileEditFragment.mGenderText = null;
            profileEditFragment.mBirthdayText = null;
            profileEditFragment.mSignature = null;
            profileEditFragment.mDmtStatusView = null;
            profileEditFragment.schoolInput = null;
            profileEditFragment.locationLayout = null;
            profileEditFragment.mWeiboLayout = null;
            profileEditFragment.mAvatarDecoName = null;
            profileEditFragment.mAvatarDecoSettingItemContainer = null;
            this.f62154c.setOnClickListener(null);
            this.f62154c = null;
            this.f62155d.setOnClickListener(null);
            this.f62155d = null;
            this.f62156e.setOnClickListener(null);
            this.f62156e = null;
            this.f62157f.setOnClickListener(null);
            this.f62157f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.k.setOnClickListener(null);
            this.k = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ProfileEditFragment_ViewBinding(final ProfileEditFragment profileEditFragment, View view) {
        this.f62153b = profileEditFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ank, "field 'mHeaderImage' and method 'editHeaderImage'");
        profileEditFragment.mHeaderImage = (AnimatedImageView) Utils.castView(findRequiredView, C0906R.id.ank, "field 'mHeaderImage'", AnimatedImageView.class);
        this.f62154c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62158a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62158a, false, 68747, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62158a, false, 68747, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditFragment.editHeaderImage(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.bqq, "field 'mNickname' and method 'onNicknameClick'");
        profileEditFragment.mNickname = (CommonItemView) Utils.castView(findRequiredView2, C0906R.id.bqq, "field 'mNickname'", CommonItemView.class);
        this.f62155d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62161a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62161a, false, 68748, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62161a, false, 68748, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditFragment.onNicknameClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.aqx, "field 'editId' and method 'onIdClick'");
        profileEditFragment.editId = (CommonItemView) Utils.castView(findRequiredView3, C0906R.id.aqx, "field 'editId'", CommonItemView.class);
        this.f62156e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62164a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62164a, false, 68749, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62164a, false, 68749, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditFragment.onIdClick(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.aj6, "field 'mGenderText' and method 'editGender'");
        profileEditFragment.mGenderText = (CommonItemView) Utils.castView(findRequiredView4, C0906R.id.aj6, "field 'mGenderText'", CommonItemView.class);
        this.f62157f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62167a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62167a, false, 68750, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62167a, false, 68750, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditFragment.editGender(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.la, "field 'mBirthdayText' and method 'editBirthday'");
        profileEditFragment.mBirthdayText = (CommonItemView) Utils.castView(findRequiredView5, C0906R.id.la, "field 'mBirthdayText'", CommonItemView.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62170a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62170a, false, 68751, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62170a, false, 68751, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditFragment.editBirthday(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.crg, "field 'mSignature' and method 'editSignature'");
        profileEditFragment.mSignature = (CommonItemView) Utils.castView(findRequiredView6, C0906R.id.crg, "field 'mSignature'", CommonItemView.class);
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62173a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62173a, false, 68752, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62173a, false, 68752, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditFragment.editSignature(view2);
            }
        });
        profileEditFragment.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mDmtStatusView'", DmtStatusView.class);
        View findRequiredView7 = Utils.findRequiredView(view, C0906R.id.cjv, "field 'schoolInput' and method 'onSchoolClick'");
        profileEditFragment.schoolInput = (CommonItemView) Utils.castView(findRequiredView7, C0906R.id.cjv, "field 'schoolInput'", CommonItemView.class);
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62176a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62176a, false, 68753, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62176a, false, 68753, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditFragment.onSchoolClick(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, C0906R.id.bjy, "field 'locationLayout' and method 'editLocation'");
        profileEditFragment.locationLayout = (CommonItemView) Utils.castView(findRequiredView8, C0906R.id.bjy, "field 'locationLayout'", CommonItemView.class);
        this.j = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62179a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62179a, false, 68754, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62179a, false, 68754, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditFragment.editLocation(view2);
            }
        });
        profileEditFragment.mWeiboLayout = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.dxa, "field 'mWeiboLayout'", CommonItemView.class);
        View findRequiredView9 = Utils.findRequiredView(view, C0906R.id.hv, "method 'changeDecoClicked'");
        profileEditFragment.mAvatarDecoName = (CommonItemView) Utils.castView(findRequiredView9, C0906R.id.hv, "field 'mAvatarDecoName'", CommonItemView.class);
        this.k = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62182a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62182a, false, 68755, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62182a, false, 68755, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditFragment.changeDecoClicked(view2);
            }
        });
        profileEditFragment.mAvatarDecoSettingItemContainer = view.findViewById(C0906R.id.hy);
    }
}
