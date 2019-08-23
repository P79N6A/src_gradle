package com.ss.android.ugc.aweme.newfollow.e;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.newfollow.vh.UpLoadItemViewHolder;

public final class e extends FollowFeed {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57109a;

    /* renamed from: b  reason: collision with root package name */
    public int f57110b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f57111c;

    /* renamed from: d  reason: collision with root package name */
    public UpLoadItemViewHolder f57112d;

    public e() {
        setFeedType(65282);
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f57111c = bitmap;
        }
    }
}
