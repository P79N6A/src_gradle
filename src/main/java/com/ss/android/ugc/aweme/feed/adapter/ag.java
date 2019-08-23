package com.ss.android.ugc.aweme.feed.adapter;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ag implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44878a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoViewHolder f44879b;

    /* renamed from: c  reason: collision with root package name */
    private final String f44880c;

    /* renamed from: d  reason: collision with root package name */
    private final View f44881d;

    ag(VideoViewHolder videoViewHolder, String str, View view) {
        this.f44879b = videoViewHolder;
        this.f44880c = str;
        this.f44881d = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f44878a, false, 40853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44878a, false, 40853, new Class[0], Void.TYPE);
            return;
        }
        VideoViewHolder videoViewHolder = this.f44879b;
        String str = this.f44880c;
        View view = this.f44881d;
        videoViewHolder.f44819d = null;
        if (videoViewHolder.f44818c == null) {
            videoViewHolder.f44818c = new b.a((Activity) videoViewHolder.f44820e).a(str).a(5000).a(false).c(false).e((int) UIUtils.dip2Px(videoViewHolder.f44820e, 2.0f)).a((b.C0184b) new ah(videoViewHolder)).a();
            videoViewHolder.f44818c.a((com.bytedance.ies.dmt.ui.base.b<Point>) new ai<Point>(view));
        }
        videoViewHolder.f44818c.a(view, 3, true);
    }
}
