package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/BusinessInteractStickerPresenter;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/BaseStickerPresenter;", "context", "Landroid/content/Context;", "view", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BaseInteractStickerView;", "stickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "businessExtraData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/BusinessExtraData;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BaseInteractStickerView;Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/BusinessExtraData;)V", "getFinalStickerLocation", "", "Lcom/ss/android/ugc/aweme/sticker/data/NormalTrackTimeStamp;", "curPts", "", "handleClickEvent", "", "type", "", "pointX", "", "pointY", "poiPopListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IPoiPopListener;", "needConsumeClickEvent", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f69946f;
    private final BusinessExtraData g;

    @Nullable
    public final List<NormalTrackTimeStamp> a(long j, @NotNull InteractStickerStruct interactStickerStruct) {
        long j2 = j;
        InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), interactStickerStruct2}, this, f69946f, false, 79604, new Class[]{Long.TYPE, InteractStickerStruct.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j2), interactStickerStruct2}, this, f69946f, false, 79604, new Class[]{Long.TYPE, InteractStickerStruct.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(interactStickerStruct2, "stickerStruct");
        return a.a(j, interactStickerStruct);
    }

    public final void a(int i, float f2, float f3, @NotNull e eVar) {
        String str;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2}, this, f69946f, false, 79603, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2}, this, f69946f, false, 79603, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "poiPopListener");
        IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
        BusinessExtraData businessExtraData = this.g;
        if (businessExtraData != null) {
            str = businessExtraData.getSchemaUrl();
        } else {
            str = null;
        }
        if (!iMiniAppService.isAppBrandSchema(str) || (Build.VERSION.SDK_INT >= 21 && !com.ss.android.g.a.a())) {
            eVar2.a(this.f69942c.a(f2, f3));
        }
    }

    public final boolean a(long j, int i, float f2, float f3) {
        String str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, f69946f, false, 79602, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, f69946f, false, 79602, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        BusinessExtraData businessExtraData = this.g;
        String str2 = null;
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        BusinessExtraData businessExtraData2 = this.g;
        if (businessExtraData2 != null) {
            str2 = businessExtraData2.getSchemaUrl();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return super.a(j, i, f2, f3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @NotNull com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a aVar, @NotNull InteractStickerStruct interactStickerStruct, @Nullable d dVar, @Nullable BusinessExtraData businessExtraData) {
        super(context, aVar, interactStickerStruct, dVar);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "view");
        Intrinsics.checkParameterIsNotNull(interactStickerStruct, "stickerStruct");
        this.g = businessExtraData;
    }
}
