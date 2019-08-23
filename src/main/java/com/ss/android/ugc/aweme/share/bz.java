package com.ss.android.ugc.aweme.share;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.aweme.sticker.model.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

public final /* synthetic */ class bz implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64865a;

    /* renamed from: b  reason: collision with root package name */
    private final bv.AnonymousClass4 f64866b;

    /* renamed from: c  reason: collision with root package name */
    private final Effect f64867c;

    /* renamed from: d  reason: collision with root package name */
    private final String f64868d;

    bz(bv.AnonymousClass4 r1, Effect effect, String str) {
        this.f64866b = r1;
        this.f64867c = effect;
        this.f64868d = str;
    }

    public final Object then(i iVar) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f64865a, false, 73275, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f64865a, false, 73275, new Class[]{i.class}, Object.class);
        }
        bv.AnonymousClass4 r0 = this.f64866b;
        Effect effect = this.f64867c;
        String str = this.f64868d;
        if (PatchProxy.isSupport(new Object[]{iVar}, r0, bv.AnonymousClass4.f64851a, false, 73272, new Class[]{i.class}, Boolean.TYPE)) {
            Object[] objArr = {iVar};
            bv.AnonymousClass4 r9 = r0;
            ChangeQuickRedirect changeQuickRedirect = bv.AnonymousClass4.f64851a;
            z = ((Boolean) PatchProxy.accessDispatch(objArr, r9, changeQuickRedirect, false, 73272, new Class[]{i.class}, Boolean.TYPE)).booleanValue();
        } else if (!iVar.c() && !iVar.d() && iVar.e() != null) {
            List<d> list = ((e) iVar.e()).mStickers;
            if (!(list == null || list.size() == 0)) {
                IStickerUtilsService stickerUtilsService = ((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService();
                d dVar = list.get(0);
                if (stickerUtilsService != null && stickerUtilsService.isLockCommerceFaceSticker(dVar)) {
                    stickerUtilsService.showCommerceStickerDialog(bv.this.g, dVar, "homepage_hot");
                    z = true;
                }
            }
        }
        if (!z) {
            bv.this.b(effect, str);
        }
        return null;
    }
}
