package com.ss.android.ugc.aweme.photo.publish;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem;

public class PhotoPublishFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58654a;

    /* renamed from: b  reason: collision with root package name */
    private PhotoPublishFragment f58655b;

    /* renamed from: c  reason: collision with root package name */
    private View f58656c;

    /* renamed from: d  reason: collision with root package name */
    private View f58657d;

    /* renamed from: e  reason: collision with root package name */
    private View f58658e;

    /* renamed from: f  reason: collision with root package name */
    private View f58659f;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f58654a, false, 63752, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58654a, false, 63752, new Class[0], Void.TYPE);
            return;
        }
        PhotoPublishFragment photoPublishFragment = this.f58655b;
        if (photoPublishFragment != null) {
            this.f58655b = null;
            photoPublishFragment.mPermissionSettingItem = null;
            photoPublishFragment.mPhotoThumbView = null;
            photoPublishFragment.mLayoutSettingContainer = null;
            this.f58656c.setOnClickListener(null);
            this.f58656c = null;
            this.f58657d.setOnClickListener(null);
            this.f58657d = null;
            this.f58658e.setOnClickListener(null);
            this.f58658e = null;
            this.f58659f.setOnClickListener(null);
            this.f58659f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PhotoPublishFragment_ViewBinding(final PhotoPublishFragment photoPublishFragment, View view) {
        this.f58655b = photoPublishFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bxe, "field 'mPermissionSettingItem' and method 'onClick'");
        photoPublishFragment.mPermissionSettingItem = (PermissionSettingItem) Utils.castView(findRequiredView, C0906R.id.bxe, "field 'mPermissionSettingItem'", PermissionSettingItem.class);
        this.f58656c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58660a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f58660a, false, 63753, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f58660a, false, 63753, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                photoPublishFragment.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.ar7, "field 'mPhotoThumbView' and method 'onClick'");
        photoPublishFragment.mPhotoThumbView = (ImageView) Utils.castView(findRequiredView2, C0906R.id.ar7, "field 'mPhotoThumbView'", ImageView.class);
        this.f58657d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58663a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f58663a, false, 63754, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f58663a, false, 63754, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                photoPublishFragment.onClick(view2);
            }
        });
        photoPublishFragment.mLayoutSettingContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.b_k, "field 'mLayoutSettingContainer'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.g1, "method 'onClick'");
        this.f58658e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58666a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f58666a, false, 63755, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f58666a, false, 63755, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                photoPublishFragment.onClick(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.c8h, "method 'onClick'");
        this.f58659f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58669a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f58669a, false, 63756, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f58669a, false, 63756, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                photoPublishFragment.onClick(view2);
            }
        });
    }
}
