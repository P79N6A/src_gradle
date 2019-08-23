package com.ss.android.ugc.aweme.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.util.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/services/BusinessGoodsServiceImpl;", "Lcom/ss/android/ugc/aweme/services/IBusinessGoodsService;", "()V", "clearCache", "", "getCurBusinessDraftModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/BusinessGoodsPublishModel;", "videoPath", "", "removeUserSetting", "saveBusinessGoodsInfo", "model", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class BusinessGoodsServiceImpl implements IBusinessGoodsService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void clearCache() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71369, new Class[0], Void.TYPE);
            return;
        }
        h.a();
    }

    public final void removeUserSetting(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71368, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71368, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "videoPath");
        h.a(str);
    }

    public final void saveBusinessGoodsInfo(@NotNull BusinessGoodsPublishModel businessGoodsPublishModel) {
        BusinessGoodsPublishModel businessGoodsPublishModel2 = businessGoodsPublishModel;
        if (PatchProxy.isSupport(new Object[]{businessGoodsPublishModel2}, this, changeQuickRedirect, false, 71370, new Class[]{BusinessGoodsPublishModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{businessGoodsPublishModel2}, this, changeQuickRedirect, false, 71370, new Class[]{BusinessGoodsPublishModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(businessGoodsPublishModel2, "model");
        h.a(businessGoodsPublishModel);
    }

    @NotNull
    public final BusinessGoodsPublishModel getCurBusinessDraftModel(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71371, new Class[]{String.class}, BusinessGoodsPublishModel.class)) {
            return (BusinessGoodsPublishModel) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71371, new Class[]{String.class}, BusinessGoodsPublishModel.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "videoPath");
        BusinessGoodsPublishModel b2 = h.b(str);
        Intrinsics.checkExpressionValueIsNotNull(b2, "BusinessGoodsDraftInfoPr…nessDraftModel(videoPath)");
        return b2;
    }
}
