package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\"\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012J(\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0014J\u0006\u0010#\u001a\u00020\u001bR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/PoiStickerPresenter;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/BaseStickerPresenter;", "context", "Landroid/content/Context;", "view", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/PoiInteractStickerView;", "stickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/PoiInteractStickerView;Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;)V", "poiStruct", "Lcom/ss/android/ugc/aweme/poi/model/PoiStruct;", "getPoiStruct", "()Lcom/ss/android/ugc/aweme/poi/model/PoiStruct;", "setPoiStruct", "(Lcom/ss/android/ugc/aweme/poi/model/PoiStruct;)V", "stickerLocation", "", "getFinalStickerLocation", "", "Lcom/ss/android/ugc/aweme/sticker/data/NormalTrackTimeStamp;", "curPts", "", "getStickerLocation", "getViewPoints", "handleClickEvent", "", "type", "", "pointX", "", "pointY", "poiPopListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IPoiPopListener;", "jumpToPoiDetail", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f69947f;
    @NotNull
    public PoiStruct g = new PoiStruct();
    public float[] h;

    @Nullable
    public final List<NormalTrackTimeStamp> a(long j, @NotNull InteractStickerStruct interactStickerStruct) {
        long j2 = j;
        InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), interactStickerStruct2}, this, f69947f, false, 79607, new Class[]{Long.TYPE, InteractStickerStruct.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j2), interactStickerStruct2}, this, f69947f, false, 79607, new Class[]{Long.TYPE, InteractStickerStruct.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(interactStickerStruct2, "stickerStruct");
        return a.a(interactStickerStruct);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @NotNull e eVar, @NotNull InteractStickerStruct interactStickerStruct, @Nullable d dVar) {
        super(context, eVar, interactStickerStruct, dVar);
        float[] fArr;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(eVar, "view");
        Intrinsics.checkParameterIsNotNull(interactStickerStruct, "stickerStruct");
        this.g.fromStickerPoiStruct(interactStickerStruct.getPoiStruct());
        if (PatchProxy.isSupport(new Object[0], this, f69947f, false, 79608, new Class[0], float[].class)) {
            fArr = (float[]) PatchProxy.accessDispatch(new Object[0], this, f69947f, false, 79608, new Class[0], float[].class);
        } else {
            NormalTrackTimeStamp b2 = a.b(this.f69943d);
            if (b2 == null) {
                fArr = null;
            } else {
                RectF a2 = a(b2);
                float[] fArr2 = {a2.left, a2.top, a2.right, a2.top, a2.left, a2.bottom, a2.right, a2.bottom};
                com.ss.android.ugc.aweme.g.a.a();
                Matrix matrix = new Matrix();
                matrix.postRotate(b2.getRotation(), ((fArr2[2] - fArr2[0]) / 2.0f) + fArr2[0], ((fArr2[5] - fArr2[3]) / 2.0f) + fArr2[3]);
                matrix.mapPoints(fArr2);
                fArr = fArr2;
            }
        }
        this.h = fArr;
    }

    public final void a(int i, float f2, float f3, @NotNull com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e eVar) {
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2}, this, f69947f, false, 79606, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2}, this, f69947f, false, 79606, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "poiPopListener");
        eVar2.a(this.f69942c.a(f2, f3));
    }
}
