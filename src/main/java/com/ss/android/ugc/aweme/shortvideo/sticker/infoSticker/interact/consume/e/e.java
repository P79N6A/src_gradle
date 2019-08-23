package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0016\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u001eH\u0002¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/VoteStickerPresenter;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/BaseStickerPresenter;", "context", "Landroid/content/Context;", "view", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteInteractStickerView;", "stickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteInteractStickerView;Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;)V", "getFinalStickerLocation", "", "Lcom/ss/android/ugc/aweme/sticker/data/NormalTrackTimeStamp;", "curPts", "", "getViewPoints", "", "handleClickEvent", "", "type", "", "pointX", "", "pointY", "poiPopListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IPoiPopListener;", "needConsumeClickEvent", "", "transformView", "Landroid/view/View;", "scale", "transformViewImpl", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f69958f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f69960b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f69961c;

        a(e eVar, View view) {
            this.f69960b = eVar;
            this.f69961c = view;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f69959a, false, 79628, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69959a, false, 79628, new Class[0], Void.TYPE);
                return;
            }
            this.f69960b.a(this.f69961c);
        }
    }

    @Nullable
    public final float[] a() {
        if (PatchProxy.isSupport(new Object[0], this, f69958f, false, 79625, new Class[0], float[].class)) {
            return (float[]) PatchProxy.accessDispatch(new Object[0], this, f69958f, false, 79625, new Class[0], float[].class);
        }
        List<NormalTrackTimeStamp> a2 = a(0, this.f69943d);
        if (a2 == null || CollectionUtils.isEmpty(a2) || a2.get(0) == null) {
            return null;
        }
        NormalTrackTimeStamp normalTrackTimeStamp = a2.get(0);
        if (normalTrackTimeStamp == null) {
            Intrinsics.throwNpe();
        }
        RectF a3 = a(normalTrackTimeStamp);
        float[] fArr = {a3.left, a3.top, a3.right, a3.top, a3.left, a3.bottom, a3.right, a3.bottom};
        Matrix matrix = new Matrix();
        NormalTrackTimeStamp normalTrackTimeStamp2 = a2.get(0);
        if (normalTrackTimeStamp2 == null) {
            Intrinsics.throwNpe();
        }
        matrix.postRotate(normalTrackTimeStamp2.getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
        matrix.mapPoints(fArr);
        return fArr;
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f69958f, false, 79627, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f69958f, false, 79627, new Class[]{View.class}, Void.TYPE);
        } else if (view.getWidth() != 0 && view.getHeight() != 0) {
            List<NormalTrackTimeStamp> a2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a(this.f69943d);
            if (a2 != null) {
                NormalTrackTimeStamp normalTrackTimeStamp = a2.get(0);
                if (normalTrackTimeStamp != null) {
                    RectF a3 = a(normalTrackTimeStamp);
                    view.setPivotX(((float) view.getWidth()) / 2.0f);
                    view.setPivotY(((float) view.getHeight()) / 2.0f);
                    view.setTranslationX(a3.left + ((a3.width() - ((float) view.getWidth())) / 2.0f));
                    view.setTranslationY(a3.top + ((a3.height() - ((float) view.getHeight())) / 2.0f));
                    view.setScaleX(a3.width() / ((float) view.getWidth()));
                    view.setScaleY(a3.width() / ((float) view.getWidth()));
                    view.setRotation(normalTrackTimeStamp.getRotation());
                    view.setVisibility(0);
                    view.invalidate();
                }
            }
        }
    }

    @Nullable
    public final List<NormalTrackTimeStamp> a(long j, @NotNull InteractStickerStruct interactStickerStruct) {
        long j2 = j;
        InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), interactStickerStruct2}, this, f69958f, false, 79624, new Class[]{Long.TYPE, InteractStickerStruct.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j2), interactStickerStruct2}, this, f69958f, false, 79624, new Class[]{Long.TYPE, InteractStickerStruct.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(interactStickerStruct2, "stickerStruct");
        return com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a(interactStickerStruct);
    }

    public final void a(@NotNull View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f69958f, false, 79626, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f69958f, false, 79626, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view2.post(new a(this, view2));
        } else {
            a(view);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, @NotNull g gVar, @NotNull InteractStickerStruct interactStickerStruct, @Nullable d dVar) {
        super(context, gVar, interactStickerStruct, dVar);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "view");
        Intrinsics.checkParameterIsNotNull(interactStickerStruct, "stickerStruct");
    }

    public final void a(int i, float f2, float f3, @NotNull com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e eVar) {
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2}, this, f69958f, false, 79623, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2}, this, f69958f, false, 79623, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "poiPopListener");
        eVar2.a(this.f69942c.a(f2, f3));
    }

    public final boolean a(long j, int i, float f2, float f3) {
        User user;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, f69958f, false, 79622, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, f69958f, false, 79622, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        d dVar = this.f69944e;
        if (dVar != null) {
            user = dVar.f71634c;
        } else {
            user = null;
        }
        if (!ex.g(user)) {
            return false;
        }
        return super.a(j, i, f2, f3);
    }
}
