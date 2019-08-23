package com.bytedance.android.livesdk.feed.repository;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.a.n;
import com.bytedance.android.live.core.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14341a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14342b;

    e(String str) {
        this.f14342b = str;
    }

    public final boolean a(Object obj) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14341a, false, 8847, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f14341a, false, 8847, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        String str = this.f14342b;
        FeedItem feedItem = (FeedItem) obj;
        if (!(feedItem == null || feedItem.item == null)) {
            String mixId = feedItem.item.getMixId();
            if (PatchProxy.isSupport(new Object[]{mixId, str}, null, r.f8318a, true, 1178, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{mixId, str}, null, r.f8318a, true, 1178, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
            } else {
                z = TextUtils.equals(r.a(mixId), r.a(str));
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
