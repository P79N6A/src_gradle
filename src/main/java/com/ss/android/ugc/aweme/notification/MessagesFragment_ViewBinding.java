package com.ss.android.ugc.aweme.notification;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.notification.widget.PagerIndicator;
import com.ss.android.ugc.aweme.views.RtlViewPager;

public class MessagesFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57806a;

    /* renamed from: b  reason: collision with root package name */
    private MessagesFragment f57807b;

    /* renamed from: c  reason: collision with root package name */
    private View f57808c;

    /* renamed from: d  reason: collision with root package name */
    private View f57809d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57806a, false, 62792, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57806a, false, 62792, new Class[0], Void.TYPE);
            return;
        }
        MessagesFragment messagesFragment = this.f57807b;
        if (messagesFragment != null) {
            this.f57807b = null;
            messagesFragment.mStatusBarView = null;
            messagesFragment.mTvNoticeAdd = null;
            messagesFragment.mViewPager = null;
            messagesFragment.pagerIndicator = null;
            messagesFragment.mAddFriendIv = null;
            this.f57808c.setOnClickListener(null);
            this.f57808c = null;
            this.f57809d.setOnClickListener(null);
            this.f57809d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MessagesFragment_ViewBinding(final MessagesFragment messagesFragment, View view) {
        this.f57807b = messagesFragment;
        messagesFragment.mStatusBarView = Utils.findRequiredView(view, C0906R.id.cv0, "field 'mStatusBarView'");
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.d17, "field 'mTvNoticeAdd' and method 'noticeViewClick'");
        messagesFragment.mTvNoticeAdd = (TextView) Utils.castView(findRequiredView, C0906R.id.d17, "field 'mTvNoticeAdd'", TextView.class);
        this.f57808c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57810a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57810a, false, 62793, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f57810a, false, 62793, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                messagesFragment.noticeViewClick();
            }
        });
        messagesFragment.mViewPager = (RtlViewPager) Utils.findRequiredViewAsType(view, C0906R.id.dux, "field 'mViewPager'", RtlViewPager.class);
        messagesFragment.pagerIndicator = (PagerIndicator) Utils.findRequiredViewAsType(view, C0906R.id.f4420c, "field 'pagerIndicator'", PagerIndicator.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.dg, "field 'mAddFriendIv' and method 'addFriendViewClick'");
        messagesFragment.mAddFriendIv = (ImageView) Utils.castView(findRequiredView2, C0906R.id.dg, "field 'mAddFriendIv'", ImageView.class);
        this.f57809d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57813a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57813a, false, 62794, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f57813a, false, 62794, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                messagesFragment.addFriendViewClick();
            }
        });
    }
}
