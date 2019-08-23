package com.ss.android.ugc.aweme.commerce.service.models;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/PortParams;", "", "promotionId", "", "productId", "orderType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderType", "()Ljava/lang/String;", "setOrderType", "(Ljava/lang/String;)V", "getProductId", "setProductId", "getPromotionId", "setPromotionId", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38209a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f38210b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f38211c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f38212d;

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f38209a, false, 29841, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38209a, false, 29841, new Class[0], String.class);
        }
        return "PortParams(promotionId=" + this.f38210b + ", productId=" + this.f38211c + ')';
    }

    public l(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f38210b = str;
        this.f38211c = str2;
        this.f38212d = str3;
    }
}
