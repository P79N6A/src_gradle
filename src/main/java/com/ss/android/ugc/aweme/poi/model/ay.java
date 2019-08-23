package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class ay extends BaseResponse {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59903a;
    @SerializedName("poi_list")

    /* renamed from: b  reason: collision with root package name */
    public List<PoiStruct> f59904b;
    @SerializedName("has_more")

    /* renamed from: c  reason: collision with root package name */
    public boolean f59905c;
    @SerializedName("page")

    /* renamed from: d  reason: collision with root package name */
    public int f59906d;
    @SerializedName("current_loc")

    /* renamed from: e  reason: collision with root package name */
    public PoiStruct f59907e;
    @SerializedName("log_pb")

    /* renamed from: f  reason: collision with root package name */
    public LogPbBean f59908f;
    @SerializedName("poi_activity")
    public e g;
    @SerializedName("enable_global_search")
    public boolean h;
    @SerializedName("is_oversea")
    public boolean i;

    public static ay a(ay ayVar) {
        ay ayVar2 = ayVar;
        if (PatchProxy.isSupport(new Object[]{ayVar2}, null, f59903a, true, 65177, new Class[]{ay.class}, ay.class)) {
            return (ay) PatchProxy.accessDispatch(new Object[]{ayVar2}, null, f59903a, true, 65177, new Class[]{ay.class}, ay.class);
        }
        ay ayVar3 = new ay();
        ayVar3.f59904b = ayVar2.f59904b;
        ayVar3.f59905c = ayVar2.f59905c;
        ayVar3.f59906d = ayVar2.f59906d;
        ayVar3.f59907e = ayVar2.f59907e;
        ayVar3.f59908f = ayVar2.f59908f;
        ayVar3.g = ayVar2.g;
        ayVar3.h = ayVar2.h;
        ayVar3.i = ayVar2.i;
        return ayVar3;
    }
}
