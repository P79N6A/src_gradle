package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PublishPermissionFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70541a;

    /* renamed from: b  reason: collision with root package name */
    private PublishPermissionFragment f70542b;

    /* renamed from: c  reason: collision with root package name */
    private View f70543c;

    /* renamed from: d  reason: collision with root package name */
    private View f70544d;

    /* renamed from: e  reason: collision with root package name */
    private View f70545e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f70541a, false, 80305, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70541a, false, 80305, new Class[0], Void.TYPE);
            return;
        }
        PublishPermissionFragment publishPermissionFragment = this.f70542b;
        if (publishPermissionFragment != null) {
            this.f70542b = null;
            publishPermissionFragment.mImgPermissionPrivate = null;
            publishPermissionFragment.mImgPermissionFriend = null;
            publishPermissionFragment.mImgPermissionOpen = null;
            publishPermissionFragment.permissionFriendLayout = null;
            publishPermissionFragment.permissionOpenLayout = null;
            publishPermissionFragment.permissionPrivateLayout = null;
            publishPermissionFragment.mTvPermissionOpen = null;
            publishPermissionFragment.mTvPermissionOpenText = null;
            this.f70543c.setOnClickListener(null);
            this.f70543c = null;
            this.f70544d.setOnClickListener(null);
            this.f70544d = null;
            this.f70545e.setOnClickListener(null);
            this.f70545e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PublishPermissionFragment_ViewBinding(final PublishPermissionFragment publishPermissionFragment, View view) {
        this.f70542b = publishPermissionFragment;
        publishPermissionFragment.mImgPermissionPrivate = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bxd, "field 'mImgPermissionPrivate'", ImageView.class);
        publishPermissionFragment.mImgPermissionFriend = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bx9, "field 'mImgPermissionFriend'", ImageView.class);
        publishPermissionFragment.mImgPermissionOpen = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.bxc, "field 'mImgPermissionOpen'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b9l, "field 'permissionFriendLayout' and method 'onClick'");
        publishPermissionFragment.permissionFriendLayout = (LinearLayout) Utils.castView(findRequiredView, C0906R.id.b9l, "field 'permissionFriendLayout'", LinearLayout.class);
        this.f70543c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70546a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f70546a, false, 80306, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f70546a, false, 80306, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                publishPermissionFragment.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.b9m, "field 'permissionOpenLayout' and method 'onClick'");
        publishPermissionFragment.permissionOpenLayout = (LinearLayout) Utils.castView(findRequiredView2, C0906R.id.b9m, "field 'permissionOpenLayout'", LinearLayout.class);
        this.f70544d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70549a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f70549a, false, 80307, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f70549a, false, 80307, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                publishPermissionFragment.onClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.b9n, "field 'permissionPrivateLayout' and method 'onClick'");
        publishPermissionFragment.permissionPrivateLayout = (LinearLayout) Utils.castView(findRequiredView3, C0906R.id.b9n, "field 'permissionPrivateLayout'", LinearLayout.class);
        this.f70545e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70552a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f70552a, false, 80308, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f70552a, false, 80308, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                publishPermissionFragment.onClick(view2);
            }
        });
        publishPermissionFragment.mTvPermissionOpen = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dg4, "field 'mTvPermissionOpen'", TextView.class);
        publishPermissionFragment.mTvPermissionOpenText = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dg5, "field 'mTvPermissionOpenText'", TextView.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        publishPermissionFragment.mImgSelected = ContextCompat.getDrawable(context, 2130839394);
        publishPermissionFragment.mImgNormal = ContextCompat.getDrawable(context, 2130837713);
        publishPermissionFragment.mTitle = resources.getString(C0906R.string.bt7);
    }
}
