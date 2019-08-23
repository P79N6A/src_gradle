package com.ss.android.ugc.aweme.story.shootvideo.friends.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public class l extends BaseResponse {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73555a;
    @SerializedName("user_list")

    /* renamed from: b  reason: collision with root package name */
    public List<User> f73556b;
    @SerializedName("cursor")

    /* renamed from: c  reason: collision with root package name */
    public int f73557c;
    @SerializedName("has_more")

    /* renamed from: d  reason: collision with root package name */
    public boolean f73558d;
    @SerializedName("shield_im_user")

    /* renamed from: e  reason: collision with root package name */
    public List<String> f73559e;

    public final List<User> a() {
        if (PatchProxy.isSupport(new Object[0], this, f73555a, false, 85333, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f73555a, false, 85333, new Class[0], List.class);
        }
        if (this.f73556b == null) {
            this.f73556b = new ArrayList(0);
        }
        return this.f73556b;
    }
}
