package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e;

import android.content.Context;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\"\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010'2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0007H$J(\u0010(\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H$J(\u0010*\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010+\u001a\u00020)2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/BaseStickerPresenter;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IInteractStickerEvent;", "context", "Landroid/content/Context;", "view", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BaseInteractStickerView;", "stickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BaseInteractStickerView;Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;)V", "TAG", "", "getContext", "()Landroid/content/Context;", "getInteractStickerParams", "()Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "setInteractStickerParams", "(Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;)V", "getStickerStruct", "()Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "getView", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BaseInteractStickerView;", "consumeClickEvent", "", "curPts", "", "type", "", "pointX", "", "pointY", "poiPopListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IPoiPopListener;", "createRawRect", "Landroid/graphics/RectF;", "location", "Lcom/ss/android/ugc/aweme/sticker/data/NormalTrackTimeStamp;", "getFinalStickerLocation", "", "handleClickEvent", "", "needConsumeClickEvent", "updateInteractStickerParams", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69940a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Context f69941b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a f69942c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final InteractStickerStruct f69943d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public d f69944e;

    /* renamed from: f  reason: collision with root package name */
    private final String f69945f = "BaseStickerPresenter";

    @Nullable
    public abstract List<NormalTrackTimeStamp> a(long j, @NotNull InteractStickerStruct interactStickerStruct);

    public abstract void a(int i, float f2, float f3, @NotNull e eVar);

    public final void a(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f69940a, false, 79599, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f69940a, false, 79599, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "interactStickerParams");
        this.f69944e = dVar2;
    }

    @NotNull
    public final RectF a(@NotNull NormalTrackTimeStamp normalTrackTimeStamp) {
        float f2;
        float f3;
        float f4;
        Float f5;
        if (PatchProxy.isSupport(new Object[]{normalTrackTimeStamp}, this, f69940a, false, 79601, new Class[]{NormalTrackTimeStamp.class}, RectF.class)) {
            return (RectF) PatchProxy.accessDispatch(new Object[]{normalTrackTimeStamp}, this, f69940a, false, 79601, new Class[]{NormalTrackTimeStamp.class}, RectF.class);
        }
        Intrinsics.checkParameterIsNotNull(normalTrackTimeStamp, "location");
        float f6 = 0.0f;
        if (this.f69944e == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        d dVar = this.f69944e;
        if (dVar != null) {
            f2 = dVar.f71632a;
        } else {
            f2 = 0.0f;
        }
        float width = f2 * normalTrackTimeStamp.getWidth();
        d dVar2 = this.f69944e;
        if (dVar2 != null) {
            f3 = dVar2.f71633b;
        } else {
            f3 = 0.0f;
        }
        float height = f3 * normalTrackTimeStamp.getHeight();
        if (com.ss.android.ugc.aweme.g.a.a()) {
            StringBuilder sb = new StringBuilder("videoWidth=");
            d dVar3 = this.f69944e;
            Float f7 = null;
            if (dVar3 != null) {
                f5 = Float.valueOf(dVar3.f71632a);
            } else {
                f5 = null;
            }
            sb.append(f5);
            StringBuilder sb2 = new StringBuilder("videoHeight=");
            d dVar4 = this.f69944e;
            if (dVar4 != null) {
                f7 = Float.valueOf(dVar4.f71633b);
            }
            sb2.append(f7);
        }
        d dVar5 = this.f69944e;
        if (dVar5 != null) {
            f4 = dVar5.f71632a;
        } else {
            f4 = 0.0f;
        }
        float x = (f4 * normalTrackTimeStamp.getX()) - (width / 2.0f);
        d dVar6 = this.f69944e;
        if (dVar6 != null) {
            f6 = dVar6.f71633b;
        }
        float y = (f6 * normalTrackTimeStamp.getY()) - (height / 2.0f);
        com.ss.android.ugc.aweme.g.a.a();
        return new RectF(x, y, width + x, height + y);
    }

    public a(@NotNull Context context, @NotNull com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a aVar, @NotNull InteractStickerStruct interactStickerStruct, @Nullable d dVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "view");
        Intrinsics.checkParameterIsNotNull(interactStickerStruct, "stickerStruct");
        this.f69941b = context;
        this.f69942c = aVar;
        this.f69943d = interactStickerStruct;
        this.f69944e = dVar;
    }

    public boolean a(long j, int i, float f2, float f3) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, f69940a, false, 79598, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, f69940a, false, 79598, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        List<NormalTrackTimeStamp> a2 = a(j2, this.f69943d);
        if (a2 == null) {
            return false;
        }
        ArrayList<RectF> arrayList = new ArrayList<>();
        if (a2 != null) {
            for (NormalTrackTimeStamp normalTrackTimeStamp : a2) {
                if (normalTrackTimeStamp == null) {
                    Intrinsics.throwNpe();
                }
                arrayList.add(a(normalTrackTimeStamp));
            }
        }
        int i2 = 0;
        for (RectF rectF : arrayList) {
            if (a2 == null || a2.get(i2) == null) {
                float f4 = f2;
                float f5 = f3;
            } else {
                NormalTrackTimeStamp normalTrackTimeStamp2 = a2.get(i2);
                if (normalTrackTimeStamp2 == null) {
                    Intrinsics.throwNpe();
                }
                if (com.ss.android.ugc.aweme.shortvideo.edit.b.a.b(rectF, f2, f3, normalTrackTimeStamp2.getRotation())) {
                    return true;
                }
            }
            i2++;
        }
        return false;
    }

    public final boolean a(long j, int i, float f2, float f3, @NotNull e eVar) {
        long j2 = j;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2}, this, f69940a, false, 79600, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, e.class}, Boolean.TYPE)) {
            Object[] objArr = {new Long(j2), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, f69940a, false, 79600, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, e.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "poiPopListener");
        if (a(j, i, f2, f3)) {
            a(i, f2, f3, eVar2);
            return true;
        }
        return false;
    }
}
