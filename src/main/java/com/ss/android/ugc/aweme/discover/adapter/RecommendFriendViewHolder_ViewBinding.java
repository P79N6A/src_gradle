package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class RecommendFriendViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41753a;

    /* renamed from: b  reason: collision with root package name */
    private RecommendFriendViewHolder f41754b;

    /* renamed from: c  reason: collision with root package name */
    private View f41755c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41753a, false, 35749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41753a, false, 35749, new Class[0], Void.TYPE);
            return;
        }
        RecommendFriendViewHolder recommendFriendViewHolder = this.f41754b;
        if (recommendFriendViewHolder != null) {
            this.f41754b = null;
            recommendFriendViewHolder.txtFindMore = null;
            recommendFriendViewHolder.txtInterested = null;
            recommendFriendViewHolder.recyclerView = null;
            this.f41755c.setOnClickListener(null);
            this.f41755c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RecommendFriendViewHolder_ViewBinding(final RecommendFriendViewHolder recommendFriendViewHolder, View view) {
        this.f41754b = recommendFriendViewHolder;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.aea, "field 'txtFindMore' and method 'goAddFriends'");
        recommendFriendViewHolder.txtFindMore = (TextView) Utils.castView(findRequiredView, C0906R.id.aea, "field 'txtFindMore'", TextView.class);
        this.f41755c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41756a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f41756a, false, 35750, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41756a, false, 35750, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                recommendFriendViewHolder.goAddFriends();
            }
        });
        recommendFriendViewHolder.txtInterested = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bx1, "field 'txtInterested'", TextView.class);
        recommendFriendViewHolder.recyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.cbd, "field 'recyclerView'", RecyclerView.class);
    }
}
