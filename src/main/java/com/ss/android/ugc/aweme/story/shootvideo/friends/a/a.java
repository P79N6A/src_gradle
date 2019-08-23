package com.ss.android.ugc.aweme.story.shootvideo.friends.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public class a extends BaseResponse {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73520a;
    @SerializedName("friend_list")

    /* renamed from: b  reason: collision with root package name */
    public List<User> f73521b;
    @SerializedName("rid")

    /* renamed from: c  reason: collision with root package name */
    public String f73522c;
    @SerializedName("cursor")

    /* renamed from: d  reason: collision with root package name */
    public int f73523d;
    @SerializedName("has_more")

    /* renamed from: e  reason: collision with root package name */
    public boolean f73524e;
    @SerializedName("new_user_count")

    /* renamed from: f  reason: collision with root package name */
    public int f73525f;
    @SerializedName("shield_im_user")
    public List<String> g;

    public final List<User> a() {
        if (PatchProxy.isSupport(new Object[0], this, f73520a, false, 85318, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f73520a, false, 85318, new Class[0], List.class);
        }
        if (this.f73521b == null) {
            this.f73521b = new ArrayList(0);
        }
        return this.f73521b;
    }
}
