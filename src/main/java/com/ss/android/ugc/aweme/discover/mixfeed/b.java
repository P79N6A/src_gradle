package com.ss.android.ugc.aweme.discover.mixfeed;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.List;

public class b extends SearchApiResult {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42546a;
    @SerializedName("cursor")

    /* renamed from: b  reason: collision with root package name */
    public int f42547b;
    @SerializedName("has_more")

    /* renamed from: c  reason: collision with root package name */
    public boolean f42548c;
    @SerializedName("data")

    /* renamed from: d  reason: collision with root package name */
    public List<a> f42549d;

    public void setRequestId(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f42546a, false, 36787, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f42546a, false, 36787, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.setRequestId(str);
        for (a requestId : this.f42549d) {
            requestId.setRequestId(str2);
        }
    }
}
