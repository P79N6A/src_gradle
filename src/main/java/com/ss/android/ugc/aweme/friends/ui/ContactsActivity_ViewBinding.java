package com.ss.android.ugc.aweme.friends.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public class ContactsActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49181a;

    /* renamed from: b  reason: collision with root package name */
    private ContactsActivity f49182b;

    /* renamed from: c  reason: collision with root package name */
    private View f49183c;

    /* renamed from: d  reason: collision with root package name */
    private View f49184d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f49181a, false, 47097, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49181a, false, 47097, new Class[0], Void.TYPE);
            return;
        }
        ContactsActivity contactsActivity = this.f49182b;
        if (contactsActivity != null) {
            this.f49182b = null;
            contactsActivity.mListView = null;
            contactsActivity.mTitleBar = null;
            contactsActivity.mStatusView = null;
            contactsActivity.mRefreshLayout = null;
            contactsActivity.ivBindPhone = null;
            contactsActivity.enterBindRl = null;
            this.f49183c.setOnClickListener(null);
            this.f49183c = null;
            this.f49184d.setOnClickListener(null);
            this.f49184d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ContactsActivity_ViewBinding(final ContactsActivity contactsActivity, View view) {
        this.f49182b = contactsActivity;
        contactsActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mListView'", RecyclerView.class);
        contactsActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
        contactsActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        contactsActivity.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.tl, "field 'ivBindPhone' and method 'closeBindPhoneHint'");
        contactsActivity.ivBindPhone = (ImageView) Utils.castView(findRequiredView, C0906R.id.tl, "field 'ivBindPhone'", ImageView.class);
        this.f49183c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49185a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f49185a, false, 47098, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f49185a, false, 47098, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                contactsActivity.closeBindPhoneHint();
            }
        });
        contactsActivity.enterBindRl = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.a_g, "field 'enterBindRl'", RelativeLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.a_h, "method 'enterBindPhone'");
        this.f49184d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49188a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f49188a, false, 47099, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f49188a, false, 47099, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                contactsActivity.enterBindPhone();
            }
        });
    }
}
