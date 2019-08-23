package com.ss.android.ugc.aweme.live.feedpage;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.HashMap;
import java.util.Map;

public class f extends BaseResponse {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53400a;
    @SerializedName("data")

    /* renamed from: b  reason: collision with root package name */
    public a f53401b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53402a;
        @SerializedName("room_id")

        /* renamed from: b  reason: collision with root package name */
        public Map<Long, Long> f53403b;

        public final Map<Long, Long> a() {
            if (PatchProxy.isSupport(new Object[0], this, f53402a, false, 55674, new Class[0], Map.class)) {
                return (Map) PatchProxy.accessDispatch(new Object[0], this, f53402a, false, 55674, new Class[0], Map.class);
            } else if (this.f53403b == null) {
                return new HashMap(0);
            } else {
                return this.f53403b;
            }
        }
    }

    public final Map<Long, Long> a() {
        if (PatchProxy.isSupport(new Object[0], this, f53400a, false, 55673, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f53400a, false, 55673, new Class[0], Map.class);
        } else if (this.f53401b == null) {
            return new HashMap(0);
        } else {
            return this.f53401b.a();
        }
    }
}
