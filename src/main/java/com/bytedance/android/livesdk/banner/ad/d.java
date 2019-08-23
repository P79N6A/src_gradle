package com.bytedance.android.livesdk.banner.ad;

import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.banner.a;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.chatroom.model.e;
import com.bytedance.android.livesdk.chatroom.model.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9127a;

    /* renamed from: b  reason: collision with root package name */
    private final GameBannerWidget f9128b;

    d(GameBannerWidget gameBannerWidget) {
        this.f9128b = gameBannerWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9127a, false, 3205, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9127a, false, 3205, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GameBannerWidget gameBannerWidget = this.f9128b;
        f fVar = ((a.b) obj).f9105c;
        if (PatchProxy.isSupport(new Object[]{fVar}, gameBannerWidget, GameBannerWidget.f9113a, false, 3204, new Class[]{f.class}, Void.TYPE)) {
            GameBannerWidget gameBannerWidget2 = gameBannerWidget;
            PatchProxy.accessDispatch(new Object[]{fVar}, gameBannerWidget2, GameBannerWidget.f9113a, false, 3204, new Class[]{f.class}, Void.TYPE);
        } else if (fVar != null && fVar.f11116c != null && fVar.f11116c.f11118b != null && !fVar.f11116c.f11118b.isEmpty()) {
            e eVar = fVar.f11116c.f11118b.get(0);
            if (!(eVar == null || gameBannerWidget.containerView == null || gameBannerWidget.getContext() == null)) {
                gameBannerWidget.containerView.removeAllViews();
                if (gameBannerWidget.f9114b == null) {
                    gameBannerWidget.f9114b = new b(gameBannerWidget.getContext());
                }
                gameBannerWidget.containerView.addView(gameBannerWidget.f9114b, new ViewGroup.LayoutParams(-1, -1));
                b bVar = gameBannerWidget.f9114b;
                if (PatchProxy.isSupport(new Object[]{eVar}, bVar, b.f9118a, false, 3196, new Class[]{e.class}, Void.TYPE)) {
                    b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{eVar}, bVar2, b.f9118a, false, 3196, new Class[]{e.class}, Void.TYPE);
                    return;
                }
                bVar.f9122e = eVar;
                if (!bVar.f9121d && eVar.f11110c != null) {
                    bVar.setTag(eVar);
                    bVar.f9119b.setTag(eVar);
                    HSImageView hSImageView = bVar.f9120c;
                    ImageModel imageModel = eVar.f11110c;
                    if (PatchProxy.isSupport(new Object[]{hSImageView, imageModel}, bVar, b.f9118a, false, 3197, new Class[]{HSImageView.class, ImageModel.class}, Void.TYPE)) {
                        b bVar3 = bVar;
                        PatchProxy.accessDispatch(new Object[]{hSImageView, imageModel}, bVar3, b.f9118a, false, 3197, new Class[]{HSImageView.class, ImageModel.class}, Void.TYPE);
                    } else if (!(hSImageView == null || imageModel == null)) {
                        b.a(imageModel).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) new c<Object>(bVar, hSImageView));
                    }
                    if (!bVar.f9123f) {
                        bVar.a("livesdk_game_ad_banner_show");
                        bVar.f9123f = true;
                    }
                }
            }
        }
    }
}
