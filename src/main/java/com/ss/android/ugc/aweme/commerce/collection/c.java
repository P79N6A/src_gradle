package com.ss.android.ugc.aweme.commerce.collection;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.d.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u000bR$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodResponse;", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "()V", "goods", "", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "getGoods", "()Ljava/util/List;", "setGoods", "(Ljava/util/List;)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "isValid", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36885a;
    @SerializedName("willing_list")
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public List<CollectionGood> f36886b = new ArrayList();
    @SerializedName("has_more")

    /* renamed from: c  reason: collision with root package name */
    public boolean f36887c;

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f36885a, false, 28071, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36885a, false, 28071, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.statusCode != 0 || !(!this.f36886b.isEmpty())) {
            return false;
        } else {
            return true;
        }
    }
}
