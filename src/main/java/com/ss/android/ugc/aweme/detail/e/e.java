package com.ss.android.ugc.aweme.detail.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.poi.model.h;
import com.ss.android.ugc.aweme.u.aa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0014J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0014J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u0014¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/presenter/DetailFeedPoiPresenter;", "Lcom/ss/android/ugc/aweme/detail/presenter/DetailFeedBaseListPresenter;", "Lcom/ss/android/ugc/aweme/poi/model/PoiAwemeFeedModel;", "Lcom/ss/android/ugc/aweme/newfollow/model/BaseFlowFeed;", "()V", "getAwemeIdInData", "", "data", "getAwemeList", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getItems", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends c<h, b> {
    public static ChangeQuickRedirect h;

    @Nullable
    public final List<b> c() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35011, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, h, false, 35011, new Class[0], List.class);
        }
        h hVar = (h) this.f2978e;
        if (hVar != null) {
            return hVar.getItems();
        }
        return null;
    }

    @NotNull
    public final List<Aweme> d() {
        List<b> list;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35012, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, h, false, 35012, new Class[0], List.class);
        }
        h hVar = (h) this.f2978e;
        if (hVar != null) {
            list = hVar.getItems();
        } else {
            list = null;
        }
        List<Aweme> a2 = h.a(list);
        Intrinsics.checkExpressionValueIsNotNull(a2, "PoiAwemeFeedModel.getAwemes(mModel?.items)");
        return a2;
    }

    public final /* synthetic */ String b(Object obj) {
        b bVar = (b) obj;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, h, false, 35013, new Class[]{b.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bVar}, this, h, false, 35013, new Class[]{b.class}, String.class);
        }
        if (bVar != null) {
            Aweme aweme = bVar.getAweme();
            if (aweme != null) {
                String m = aa.m(aweme);
                Intrinsics.checkExpressionValueIsNotNull(m, "MobUtils.getAid(data?.aweme ?: return \"\")");
                return m;
            }
        }
        return "";
    }
}