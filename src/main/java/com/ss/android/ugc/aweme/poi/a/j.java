package com.ss.android.ugc.aweme.poi.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.poi.model.ar;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\tJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u0006\u0010\u001d\u001a\u00020\u001eR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/poi/bean/PoiRecommendPoiFeed;", "Lcom/ss/android/ugc/aweme/newfollow/model/BaseFlowFeed;", "Ljava/io/Serializable;", "recommendType", "Ljava/lang/Integer;", "recommendPoi", "Lcom/ss/android/ugc/aweme/poi/model/PoiRecommendPoiList;", "(Ljava/lang/Integer;Lcom/ss/android/ugc/aweme/poi/model/PoiRecommendPoiList;)V", "hideDivider", "", "getHideDivider", "()Z", "setHideDivider", "(Z)V", "hideTopDivider", "getHideTopDivider", "setHideTopDivider", "getRecommendType", "()Ljava/lang/Integer;", "addNullItem", "", "getFeedType", "", "hasMore", "list", "", "Lcom/ss/android/ugc/aweme/feed/model/poi/SimplePoiInfoStruct;", "setFeedType", "type", "title", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j extends b implements Serializable {
    public static final a Companion = new a(null);
    public static final int TYPE_EXPLORE = 2;
    public static final int TYPE_FOOD = 3;
    public static final int TYPE_HOTEL = 5;
    public static final int TYPE_NEARBY = 1;
    public static final int TYPE_SCENE = 4;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean hideDivider;
    private boolean hideTopDivider = true;
    private final ar recommendPoi;
    @NotNull
    private final Integer recommendType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/bean/PoiRecommendPoiFeed$Companion;", "Ljava/io/Serializable;", "()V", "TYPE_EXPLORE", "", "getTYPE_EXPLORE", "()I", "TYPE_FOOD", "getTYPE_FOOD", "TYPE_HOTEL", "getTYPE_HOTEL", "TYPE_NEARBY", "getTYPE_NEARBY", "TYPE_SCENE", "getTYPE_SCENE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public final int getTYPE_EXPLORE() {
            return j.TYPE_EXPLORE;
        }

        public final int getTYPE_FOOD() {
            return j.TYPE_FOOD;
        }

        public final int getTYPE_HOTEL() {
            return j.TYPE_HOTEL;
        }

        public final int getTYPE_NEARBY() {
            return j.TYPE_NEARBY;
        }

        public final int getTYPE_SCENE() {
            return j.TYPE_SCENE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getFeedType() {
        return 65451;
    }

    public final void setFeedType(int i) {
    }

    public final boolean getHideDivider() {
        return this.hideDivider;
    }

    public final boolean getHideTopDivider() {
        return this.hideTopDivider;
    }

    @NotNull
    public final Integer getRecommendType() {
        return this.recommendType;
    }

    public final void addNullItem() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64939, new Class[0], Void.TYPE);
            return;
        }
        this.recommendPoi.addNullItem();
    }

    public final boolean hasMore() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64937, new Class[0], Boolean.TYPE)) {
            return this.recommendPoi.hasMore();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64937, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final List<SimplePoiInfoStruct> list() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64938, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64938, new Class[0], List.class);
        }
        List<SimplePoiInfoStruct> list = this.recommendPoi.list;
        Intrinsics.checkExpressionValueIsNotNull(list, "recommendPoi.list");
        return list;
    }

    @NotNull
    public final String title() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64936, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64936, new Class[0], String.class);
        }
        String str = this.recommendPoi.title;
        Intrinsics.checkExpressionValueIsNotNull(str, "recommendPoi.title");
        return str;
    }

    public final void setHideDivider(boolean z) {
        this.hideDivider = z;
    }

    public final void setHideTopDivider(boolean z) {
        this.hideTopDivider = z;
    }

    public j(@NotNull Integer num, @NotNull ar arVar) {
        Intrinsics.checkParameterIsNotNull(num, "recommendType");
        Intrinsics.checkParameterIsNotNull(arVar, "recommendPoi");
        this.recommendType = num;
        this.recommendPoi = arVar;
    }
}
