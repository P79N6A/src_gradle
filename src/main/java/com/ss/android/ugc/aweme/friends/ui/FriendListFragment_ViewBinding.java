package com.ss.android.ugc.aweme.friends.ui;

import android.annotation.SuppressLint;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FriendListFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49283a;

    /* renamed from: b  reason: collision with root package name */
    private FriendListFragment f49284b;

    /* renamed from: c  reason: collision with root package name */
    private View f49285c;

    /* renamed from: d  reason: collision with root package name */
    private View f49286d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f49283a, false, 47308, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49283a, false, 47308, new Class[0], Void.TYPE);
            return;
        }
        FriendListFragment friendListFragment = this.f49284b;
        if (friendListFragment != null) {
            this.f49284b = null;
            friendListFragment.mRecyclerView = null;
            friendListFragment.mSetNickName = null;
            friendListFragment.mSetDone = null;
            friendListFragment.mContent = null;
            friendListFragment.mStatusView = null;
            this.f49285c.setOnClickListener(null);
            this.f49285c.setOnTouchListener(null);
            this.f49285c = null;
            this.f49286d.setOnClickListener(null);
            this.f49286d.setOnTouchListener(null);
            this.f49286d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    @SuppressLint({"ClickableViewAccessibility"})
    public FriendListFragment_ViewBinding(final FriendListFragment friendListFragment, View view) {
        this.f49284b = friendListFragment;
        friendListFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.cih, "field 'mRecyclerView'", RecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bhu, "field 'mSetNickName', method 'onViewClicked', and method 'onTouch'");
        friendListFragment.mSetNickName = (LinearLayout) Utils.castView(findRequiredView, C0906R.id.bhu, "field 'mSetNickName'", LinearLayout.class);
        this.f49285c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49287a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f49287a, false, 47309, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f49287a, false, 47309, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                friendListFragment.onViewClicked(view2);
            }
        });
        findRequiredView.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49290a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                View view2 = view;
                MotionEvent motionEvent2 = motionEvent;
                if (!PatchProxy.isSupport(new Object[]{view2, motionEvent2}, this, f49290a, false, 47310, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return friendListFragment.onTouch(view2, motionEvent2);
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent2}, this, f49290a, false, 47310, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.bhv, "field 'mSetDone', method 'onViewClicked', and method 'onTouch'");
        friendListFragment.mSetDone = (LinearLayout) Utils.castView(findRequiredView2, C0906R.id.bhv, "field 'mSetDone'", LinearLayout.class);
        this.f49286d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49293a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f49293a, false, 47311, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f49293a, false, 47311, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                friendListFragment.onViewClicked(view2);
            }
        });
        findRequiredView2.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49296a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                View view2 = view;
                MotionEvent motionEvent2 = motionEvent;
                if (!PatchProxy.isSupport(new Object[]{view2, motionEvent2}, this, f49296a, false, 47312, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return friendListFragment.onTouch(view2, motionEvent2);
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent2}, this, f49296a, false, 47312, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
        });
        friendListFragment.mContent = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bg4, "field 'mContent'", LinearLayout.class);
        friendListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
