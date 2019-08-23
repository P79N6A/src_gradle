package com.ss.android.ugc.aweme.commercialize.im.model;

import android.util.SparseArray;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;

public class b extends BaseResponse {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38926a;
    @SerializedName("level_one_im_bluev_msgs")

    /* renamed from: b  reason: collision with root package name */
    public List<c> f38927b;
    @SerializedName("level_two_im_bluev_msgs")

    /* renamed from: c  reason: collision with root package name */
    public List<d> f38928c;

    public final SparseArray<List<c>> a() {
        if (PatchProxy.isSupport(new Object[0], this, f38926a, false, 30843, new Class[0], SparseArray.class)) {
            return (SparseArray) PatchProxy.accessDispatch(new Object[0], this, f38926a, false, 30843, new Class[0], SparseArray.class);
        }
        SparseArray<List<c>> sparseArray = new SparseArray<>();
        if (this.f38928c != null && !this.f38928c.isEmpty()) {
            for (d next : this.f38928c) {
                if (next.f38933b != null && !next.f38933b.isEmpty()) {
                    List list = sparseArray.get(next.f38932a);
                    if (list == null) {
                        list = new ArrayList();
                        sparseArray.put(next.f38932a, list);
                    }
                    list.addAll(next.f38933b);
                }
            }
        }
        return sparseArray;
    }
}
