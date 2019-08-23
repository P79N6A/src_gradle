package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.Extra;
import com.meituan.robust.ChangeQuickRedirect;

public interface a {

    /* renamed from: com.bytedance.android.livesdk.feed.a$a  reason: collision with other inner class name */
    public enum C0099a {
        REFRESH,
        LOAD_MORE;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    void a(C0099a aVar, String str);

    void a(C0099a aVar, String str, Extra extra);

    void a(C0099a aVar, String str, Throwable th);
}
