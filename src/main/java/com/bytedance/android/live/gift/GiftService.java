package com.bytedance.android.live.gift;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Keep;
import android.support.v4.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.a.a;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.al;
import com.bytedance.android.livesdk.chatroom.presenter.r;
import com.bytedance.android.livesdk.chatroom.ui.az;
import com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.g;
import com.bytedance.android.livesdk.gift.assets.h;
import com.bytedance.android.livesdk.gift.effect.video.a.c;
import com.bytedance.android.livesdk.gift.l;
import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.gift.panel.widget.ab;
import com.bytedance.android.livesdk.j.c.n;
import com.bytedance.android.livesdkapi.depend.d.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.d;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.DownloaderBuilder;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import com.ss.ugc.live.b.a.e;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Keep
public class GiftService implements IGiftService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public Fragment createLiveGiftAdFragment() {
        return null;
    }

    public GiftService() {
        b.a(f.class, this);
        b.a(IGiftService.class, this);
    }

    public void clearGiftIconBitmapCache() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 1722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 1722, new Class[0], Void.TYPE);
            return;
        }
        GiftManager.inst().clearGiftIconBitmapCache();
    }

    public h getAssetsManager() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 1727, new Class[0], h.class)) {
            return com.bytedance.android.livesdk.gift.assets.f.a("effects");
        }
        return (h) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 1727, new Class[0], h.class);
    }

    public com.bytedance.android.livesdk.gift.model.b getFastGift() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 1735, new Class[0], com.bytedance.android.livesdk.gift.model.b.class)) {
            return GiftManager.inst().getFastGift();
        }
        return (com.bytedance.android.livesdk.gift.model.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 1735, new Class[0], com.bytedance.android.livesdk.gift.model.b.class);
    }

    public com.bytedance.android.livesdkapi.depend.d.a.b getLiveGiftPlayControllerManager() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 1708, new Class[0], com.bytedance.android.livesdkapi.depend.d.a.b.class)) {
            return giftPlayControllerManager();
        }
        return (com.bytedance.android.livesdkapi.depend.d.a.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 1708, new Class[0], com.bytedance.android.livesdkapi.depend.d.a.b.class);
    }

    public com.bytedance.android.livesdk.gift.model.b getRedEnvelopeGift() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 1737, new Class[0], com.bytedance.android.livesdk.gift.model.b.class)) {
            return GiftManager.inst().getRedEnvelopeGift();
        }
        return (com.bytedance.android.livesdk.gift.model.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 1737, new Class[0], com.bytedance.android.livesdk.gift.model.b.class);
    }

    public List<com.bytedance.android.livesdk.gift.model.b> getStickerGifts() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 1736, new Class[0], List.class)) {
            return GiftManager.inst().getStickerGifts();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 1736, new Class[0], List.class);
    }

    public Widget getVideoGiftWidget() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 1728, new Class[0], Widget.class)) {
            return new GiftWidget();
        }
        return (Widget) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 1728, new Class[0], Widget.class);
    }

    public void syncGiftList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 1711, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 1711, new Class[0], Void.TYPE);
            return;
        }
        GiftManager.inst().syncGiftList(1);
    }

    public com.bytedance.android.livesdkapi.depend.d.a.b giftPlayControllerManager() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 1710, new Class[0], com.bytedance.android.livesdkapi.depend.d.a.b.class)) {
            return (com.bytedance.android.livesdkapi.depend.d.a.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 1710, new Class[0], com.bytedance.android.livesdkapi.depend.d.a.b.class);
        } else if (PatchProxy.isSupport(new Object[0], null, c.f14992a, true, 9657, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, c.f14992a, true, 9657, new Class[0], c.class);
        } else {
            if (c.f14993b == null) {
                c.f14993b = new c(((d) b.a(d.class)).a(), (i) b.a(i.class));
            }
            return c.f14993b;
        }
    }

    public void clearAssets(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 1720, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 1720, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.gift.assets.f.a(str).a();
    }

    public a getGiftGuidePresenter(DataCenter dataCenter) {
        DataCenter dataCenter2 = dataCenter;
        if (!PatchProxy.isSupport(new Object[]{dataCenter2}, this, changeQuickRedirect, false, 1714, new Class[]{DataCenter.class}, a.class)) {
            return new r(dataCenter2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{dataCenter2}, this, changeQuickRedirect, false, 1714, new Class[]{DataCenter.class}, a.class);
    }

    public n getSendGiftResultLog(com.bytedance.android.livesdk.gift.model.i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 1732, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, n.class)) {
            return l.a(iVar);
        }
        return (n) PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 1732, new Class[]{com.bytedance.android.livesdk.gift.model.i.class}, n.class);
    }

    public com.bytedance.android.livesdk.gift.model.b findGiftById(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 1723, new Class[]{Long.TYPE}, com.bytedance.android.livesdk.gift.model.b.class)) {
            return GiftManager.inst().findGiftById(j2);
        }
        return (com.bytedance.android.livesdk.gift.model.b) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 1723, new Class[]{Long.TYPE}, com.bytedance.android.livesdk.gift.model.b.class);
    }

    public com.bytedance.android.livesdk.message.a getAssetsInterceptor(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 1734, new Class[]{Boolean.TYPE}, com.bytedance.android.livesdk.message.a.class)) {
            return new com.bytedance.android.livesdk.message.c.a(z);
        }
        return (com.bytedance.android.livesdk.message.a) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 1734, new Class[]{Boolean.TYPE}, com.bytedance.android.livesdk.message.a.class);
    }

    public Bitmap getGiftIconBitmap(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 1724, new Class[]{Long.TYPE}, Bitmap.class)) {
            return GiftManager.inst().getGiftIconBitmap(j2);
        }
        return (Bitmap) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 1724, new Class[]{Long.TYPE}, Bitmap.class);
    }

    public void syncGiftList(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1738, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1738, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        GiftManager.inst().syncGiftList(i);
    }

    public void initGiftResourceManager(Context context) {
        IDownloadHttpService iDownloadHttpService;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 1707, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 1707, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.uikit.a.a.j()) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, com.bytedance.android.livesdk.gift.a.a.f14693a, true, 9372, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, null, com.bytedance.android.livesdk.gift.a.a.f14693a, true, 9372, new Class[]{Context.class}, Void.TYPE);
            } else if (!com.bytedance.android.livesdk.gift.a.a.f14694b) {
                DownloaderBuilder downloaderBuilder = new DownloaderBuilder(context2);
                if (PatchProxy.isSupport(new Object[0], null, com.bytedance.android.livesdk.gift.a.a.f14693a, true, 9373, new Class[0], IDownloadHttpService.class)) {
                    iDownloadHttpService = (IDownloadHttpService) PatchProxy.accessDispatch(new Object[0], null, com.bytedance.android.livesdk.gift.a.a.f14693a, true, 9373, new Class[0], IDownloadHttpService.class);
                } else {
                    iDownloadHttpService = new com.bytedance.android.livesdk.gift.a.b();
                }
                Downloader.init(downloaderBuilder.httpService(iDownloadHttpService));
                com.bytedance.android.livesdk.gift.a.a.f14694b = true;
            }
        }
        e.a aVar = new e.a(context2);
        aVar.f78659b = new com.bytedance.android.livesdk.gift.a.e();
        aVar.f78658a = new com.bytedance.android.livesdk.gift.assets.a(context2);
        if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
            aVar.a(1);
        } else {
            aVar.a(3);
        }
        if (aVar.f78658a == null) {
            aVar.f78658a = new com.ss.ugc.live.b.a.a.a(aVar.f78663f);
        }
        if (aVar.f78659b == null) {
            aVar.f78659b = new com.ss.ugc.live.b.a.d.e();
        }
        e eVar = new e(aVar, (byte) 0);
        if (com.ss.ugc.live.b.a.f.f78665a == null) {
            com.ss.ugc.live.b.a.f.f78665a = new com.ss.ugc.live.b.a.f(eVar);
        }
    }

    public void onTurnTableUrlEmpty(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 1715, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 1715, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str2}, null, o.f15142a, true, 9303, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, o.f15142a, true, 9303, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str2);
        com.bytedance.android.live.core.d.e.a(o.b("ttlive_turn_table_url_empty"), 1, (Map<String, Object>) hashMap);
        com.bytedance.android.livesdk.j.a.a.a().a(com.bytedance.android.livesdk.j.a.b.Gift.info, "ttlive_turn_table_url_empty", 1, (Map) hashMap);
    }

    public void removeAnimationEngine(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, changeQuickRedirect, false, 1730, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, changeQuickRedirect, false, 1730, new Class[]{b.class}, Void.TYPE);
            return;
        }
        a a2 = a.a();
        if (PatchProxy.isSupport(new Object[]{bVar2}, a2, a.f8454a, false, 1703, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, a2, a.f8454a, false, 1703, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (a2.f8456b.containsKey(bVar2)) {
            c cVar = a2.f8456b.get(bVar2);
            if (cVar != null) {
                cVar.a();
            }
            a2.f8456b.remove(bVar2);
        }
    }

    public AssetsModel getAssets(String str, long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{str, new Long(j2)}, this, changeQuickRedirect, false, 1721, new Class[]{String.class, Long.TYPE}, AssetsModel.class)) {
            return com.bytedance.android.livesdk.gift.assets.f.a(str).c(j2);
        }
        return (AssetsModel) PatchProxy.accessDispatch(new Object[]{str, new Long(j2)}, this, changeQuickRedirect, false, 1721, new Class[]{String.class, Long.TYPE}, AssetsModel.class);
    }

    public String getAssetsPath(String str, long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{str, new Long(j2)}, this, changeQuickRedirect, false, 1717, new Class[]{String.class, Long.TYPE}, String.class)) {
            return com.bytedance.android.livesdk.gift.assets.f.a(str).b(j2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str, new Long(j2)}, this, changeQuickRedirect, false, 1717, new Class[]{String.class, Long.TYPE}, String.class);
    }

    public com.bytedance.android.livesdk.message.a getGiftInterceptor(long j, boolean z) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 1733, new Class[]{Long.TYPE, Boolean.TYPE}, com.bytedance.android.livesdk.message.a.class)) {
            return new com.bytedance.android.livesdk.message.c.d(j2, z);
        }
        return (com.bytedance.android.livesdk.message.a) PatchProxy.accessDispatch(new Object[]{new Long(j2), Byte.valueOf(z)}, this, changeQuickRedirect, false, 1733, new Class[]{Long.TYPE, Boolean.TYPE}, com.bytedance.android.livesdk.message.a.class);
    }

    public boolean isAssetsDownloaded(String str, long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{str, new Long(j2)}, this, changeQuickRedirect, false, 1719, new Class[]{String.class, Long.TYPE}, Boolean.TYPE)) {
            return com.bytedance.android.livesdk.gift.assets.f.a(str).a(j2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, new Long(j2)}, this, changeQuickRedirect, false, 1719, new Class[]{String.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public void openGiftDialog(String str, boolean z) {
        ab abVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 1726, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 1726, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a a2 = com.bytedance.android.livesdk.u.a.a();
        if ("gift".equals(str2)) {
            abVar = ab.GIFT;
        } else {
            abVar = ab.PROP;
        }
        a2.a((Object) new al(abVar, z));
    }

    public void sendGift(String str, boolean z) {
        ab abVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 1709, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 1709, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a a2 = com.bytedance.android.livesdk.u.a.a();
        if ("gift".equals(str2)) {
            abVar = ab.GIFT;
        } else {
            abVar = ab.PROP;
        }
        a2.a((Object) new al(abVar, z));
    }

    public void syncAssetsList(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1716, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1716, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.gift.assets.f.a(str).a(i);
    }

    public void setGiftAnimationEngine(b bVar, c cVar) throws Exception {
        b bVar2 = bVar;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, cVar2}, this, changeQuickRedirect, false, 1729, new Class[]{b.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, cVar2}, this, changeQuickRedirect, false, 1729, new Class[]{b.class, c.class}, Void.TYPE);
            return;
        }
        a a2 = a.a();
        if (PatchProxy.isSupport(new Object[]{bVar2, cVar2}, a2, a.f8454a, false, 1700, new Class[]{b.class, c.class}, Void.TYPE)) {
            Object[] objArr = {bVar2, cVar2};
            Object[] objArr2 = objArr;
            a aVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = a.f8454a;
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, 1700, new Class[]{b.class, c.class}, Void.TYPE);
        } else if (!a2.f8456b.containsKey(bVar2)) {
            a2.f8456b.put(bVar2, cVar2);
        } else {
            throw new Exception("GiftType " + bVar.toString() + " already has been set, or you should call release firstly.");
        }
    }

    public com.bytedance.android.livesdk.message.model.ab getGiftMessage(long j, com.bytedance.android.livesdk.gift.model.i iVar, User user) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2), iVar, user}, this, changeQuickRedirect, false, 1731, new Class[]{Long.TYPE, com.bytedance.android.livesdk.gift.model.i.class, User.class}, com.bytedance.android.livesdk.message.model.ab.class)) {
            return l.a(j, iVar, user);
        }
        return (com.bytedance.android.livesdk.message.model.ab) PatchProxy.accessDispatch(new Object[]{new Long(j2), iVar, user}, this, changeQuickRedirect, false, 1731, new Class[]{Long.TYPE, com.bytedance.android.livesdk.gift.model.i.class, User.class}, com.bytedance.android.livesdk.message.model.ab.class);
    }

    public void downloadAssets(String str, long j, g gVar, int i) {
        long j2 = j;
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), gVar2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1718, new Class[]{String.class, Long.TYPE, g.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, new Long(j2), gVar2, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 1718, new Class[]{String.class, Long.TYPE, g.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.gift.assets.f.a(str).a(j2, gVar2, i);
    }

    public Observable<com.bytedance.android.live.core.network.response.d<com.bytedance.android.livesdk.gift.model.i>> sendGift(long j, long j2, long j3, int i) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (!PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5), new Long(j6), Integer.valueOf(i)}, this, changeQuickRedirect, false, 1725, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE}, Observable.class)) {
            return ((GiftRetrofitApi) ((com.bytedance.android.livesdkapi.host.h) b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(GiftRetrofitApi.class)).send(j, j2, j3, i);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5), new Long(j6), Integer.valueOf(i)}, this, changeQuickRedirect, false, 1725, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE}, Observable.class);
    }

    public void syncGiftList(d dVar, long j, int i, boolean z) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{dVar, new Long(j2), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 1712, new Class[]{d.class, Long.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar, new Long(j2), Integer.valueOf(i), Byte.valueOf(z)}, this, changeQuickRedirect, false, 1712, new Class[]{d.class, Long.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        GiftManager.inst().syncGiftList(dVar, j, i, z);
    }

    public Dialog getGiftGuideDialog(Context context, Room room, com.bytedance.android.live.base.model.user.i iVar, com.bytedance.android.live.gift.a.b bVar, long j, String str, long j2, String str2, DataCenter dataCenter) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, room, iVar, bVar, new Long(j3), str, new Long(j4), str2, dataCenter}, this, changeQuickRedirect, false, 1713, new Class[]{Context.class, Room.class, com.bytedance.android.live.base.model.user.i.class, com.bytedance.android.live.gift.a.b.class, Long.TYPE, String.class, Long.TYPE, String.class, DataCenter.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{context, room, iVar, bVar, new Long(j3), str, new Long(j4), str2, dataCenter}, this, changeQuickRedirect, false, 1713, new Class[]{Context.class, Room.class, com.bytedance.android.live.base.model.user.i.class, com.bytedance.android.live.gift.a.b.class, Long.TYPE, String.class, Long.TYPE, String.class, DataCenter.class}, Dialog.class);
        }
        az azVar = new az(context, room, iVar, bVar, j, str, j2, str2, dataCenter);
        return azVar;
    }
}
