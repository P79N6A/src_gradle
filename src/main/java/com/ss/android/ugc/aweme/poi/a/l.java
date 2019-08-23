package com.ss.android.ugc.aweme.poi.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.newfollow.e.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\r\u0010\u001c\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u001dR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/bean/PoiTourProduct;", "Lcom/ss/android/ugc/aweme/newfollow/model/BaseFlowFeed;", "products", "", "Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;", "title", "", "showTopDivider", "", "(Ljava/util/List;Ljava/lang/String;Z)V", "getProducts", "()Ljava/util/List;", "setProducts", "(Ljava/util/List;)V", "getShowTopDivider", "()Z", "setShowTopDivider", "(Z)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "first", "getFeedType", "", "setFeedType", "", "type", "size", "()Ljava/lang/Integer;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class l extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59410a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<? extends AwemeRawAd> f59411b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f59412c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f59413d;

    public final int getFeedType() {
        return 65452;
    }

    public final void setFeedType(int i) {
    }

    @Nullable
    public final AwemeRawAd a() {
        if (PatchProxy.isSupport(new Object[0], this, f59410a, false, 64941, new Class[0], AwemeRawAd.class)) {
            return (AwemeRawAd) PatchProxy.accessDispatch(new Object[0], this, f59410a, false, 64941, new Class[0], AwemeRawAd.class);
        }
        List<? extends AwemeRawAd> list = this.f59411b;
        if (list != null) {
            return (AwemeRawAd) list.get(0);
        }
        return null;
    }

    public l(@Nullable List<? extends AwemeRawAd> list, @NotNull String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, PushConstants.TITLE);
        this.f59411b = list;
        this.f59412c = str;
        this.f59413d = z;
    }
}
