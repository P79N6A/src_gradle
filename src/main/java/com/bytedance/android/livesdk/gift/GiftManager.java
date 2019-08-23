package com.bytedance.android.livesdk.gift;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Keep;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.f;
import com.bytedance.android.livesdk.gift.assets.h;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdk.gift.model.l;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.SimpleThreadFactory;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import com.ss.ugc.live.b.a.c.c;
import com.ss.ugc.live.b.a.c.d;
import com.ss.ugc.live.b.a.c.e;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
public class GiftManager {
    private static final Executor EXECUTOR;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static GiftManager sInst;
    public int continuousFail = 0;
    Gson gson = com.bytedance.android.live.a.a();
    public boolean isDownloading = false;
    private final HashMap<Long, Bitmap> localGiftBitmapCache = new HashMap<>();
    private final h mAssetsManager = f.a("effects");
    public final Queue<b> mDownloadingQueue = new LinkedList();
    private List<Long> mFansClubIds = new ArrayList();
    private b mFastGift;
    private com.ss.ugc.live.b.a.b mGetResourceListener = new com.ss.ugc.live.b.a.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14690a;

        public final void a(com.ss.ugc.live.b.a.c.a aVar) {
            int i;
            com.ss.ugc.live.b.a.c.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, f14690a, false, 9268, new Class[]{com.ss.ugc.live.b.a.c.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, f14690a, false, 9268, new Class[]{com.ss.ugc.live.b.a.c.a.class}, Void.TYPE);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                int i2 = -1;
                if (aVar2 instanceof c) {
                    jSONObject.put("response_code", ((c) aVar2).getErrorCode());
                    i = 1;
                } else if (aVar2 instanceof e) {
                    i = 2;
                } else if (aVar2 instanceof com.ss.ugc.live.b.a.c.b) {
                    i = 3;
                } else if (aVar2 instanceof d) {
                    i = 4;
                } else if (aVar2 instanceof com.bytedance.android.livesdk.gift.a.c) {
                    i = 5;
                    jSONObject.put("downloader_error_code", ((com.bytedance.android.livesdk.gift.a.c) aVar2).getErrorCode());
                } else {
                    i = -1;
                }
                long j = -1;
                AssetsModel c2 = f.a("effects").c((long) ((int) aVar.getId()));
                if (c2 != null) {
                    i2 = c2.getResourceType();
                    j = c2.getSize();
                }
                jSONObject.put("gift_id", aVar.getId());
                jSONObject.put("gift_type", i2);
                jSONObject.put("size", j);
                jSONObject.put("error_code", i);
                jSONObject.put("error_desc", aVar.toString());
                new com.bytedance.android.livesdk.j.h().a(jSONObject).a("hotsoon_live_gift_resource_download_rate", 1);
                HashMap hashMap = new HashMap(1);
                hashMap.put("info", jSONObject.toString());
                com.bytedance.android.livesdk.j.a.a().a("hotsoon_live_gift_resource_download_failed", hashMap, new Object[0]);
                if (aVar2 instanceof com.bytedance.android.livesdk.gift.a.c) {
                    i = ((com.bytedance.android.livesdk.gift.a.c) aVar2).getErrorCode();
                }
                long id = aVar.getId();
                String aVar3 = aVar.toString();
                if (PatchProxy.isSupport(new Object[]{new Long(id), Integer.valueOf(i2), Integer.valueOf(i), aVar3}, null, o.f15142a, true, 9283, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(id), Integer.valueOf(i2), Integer.valueOf(i), aVar3}, null, o.f15142a, true, 9283, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("asset_id", Long.valueOf(id));
                hashMap2.put("asset_type", Integer.valueOf(i2));
                hashMap2.put("error_code", Integer.valueOf(i));
                hashMap2.put("error_msg", aVar3);
                com.bytedance.android.live.core.d.e.a(o.a("ttlive_gift_asset_download_status"), 1, (Map<String, Object>) hashMap2);
                com.bytedance.android.live.core.d.e.a(o.b("ttlive_gift_asset_download_status"), 1, (Map<String, Object>) hashMap2);
                com.bytedance.android.livesdk.j.a.a.a().a(com.bytedance.android.livesdk.j.a.b.Gift.info, "ttlive_gift_asset_download_status", 1, (Map) hashMap2);
            } catch (JSONException unused) {
            }
        }

        public final void a(long j, com.ss.ugc.live.b.a.c cVar) {
            long j2;
            long j3 = j;
            com.ss.ugc.live.b.a.c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{new Long(j3), cVar2}, this, f14690a, false, 9267, new Class[]{Long.TYPE, com.ss.ugc.live.b.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j3), cVar2}, this, f14690a, false, 9267, new Class[]{Long.TYPE, com.ss.ugc.live.b.a.c.class}, Void.TYPE);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            int i = -1;
            AssetsModel c2 = f.a("effects").c((long) ((int) j3));
            long j4 = -1;
            if (c2 != null) {
                i = c2.getResourceType();
                j2 = c2.getSize();
            } else {
                j2 = -1;
            }
            try {
                jSONObject.put("gift_id", j3);
                jSONObject.put("gift_type", i);
                jSONObject.put("size", j2);
                if (cVar2 != null) {
                    j4 = cVar2.f78636c;
                }
                jSONObject.put("download_assets_from", j4);
            } catch (JSONException unused) {
            }
            new com.bytedance.android.livesdk.j.h().a(jSONObject).a("hotsoon_live_gift_resource_download_rate", 0);
            com.bytedance.android.livesdk.u.a.a().a((Object) new m(j3));
            HashMap hashMap = new HashMap(1);
            hashMap.put("resource_id", String.valueOf(j));
            com.bytedance.android.livesdk.j.a.a().a("hotsoon_live_gift_resource_download_success", hashMap, new Object[0]);
            if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i)}, null, o.f15142a, true, 9282, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i)}, null, o.f15142a, true, 9282, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("asset_id", Long.valueOf(j));
            hashMap2.put("asset_type", Integer.valueOf(i));
            com.bytedance.android.live.core.d.e.a(o.a("ttlive_gift_asset_download_status"), 0, (Map<String, Object>) hashMap2);
        }
    };
    public final HashMap<Long, ImageModel> mGiftImageModelMap = new HashMap<>();
    private List<com.bytedance.android.livesdk.gift.relay.a.c> mGiftRelayInfoList;
    private Map<Integer, List<b>> mGiftsMap = new HashMap();
    private SparseArray<LongSparseArray<b>> mGiftsMapByFind = new SparseArray<>();
    private final List<com.bytedance.android.livesdk.gift.model.d> mGroupCountInfo = new ArrayList();
    private boolean mHasNewGift = false;
    private long mNewGiftId = -1;
    private String mNewGiftTip = "";
    public final Handler mUIHandler = new Handler(Looper.getMainLooper());
    private long mXgCoinCache = 0;

    @FunctionalInterface
    public interface a {
    }

    static final /* synthetic */ void lambda$loadLocal$5$GiftManager(Throwable th) throws Exception {
    }

    public b getFastGift() {
        return this.mFastGift;
    }

    public long getXgCoinCache() {
        return this.mXgCoinCache;
    }

    public String getNewGiftTip() {
        if (!this.mHasNewGift) {
            return null;
        }
        this.mHasNewGift = false;
        this.mNewGiftId = -1;
        return this.mNewGiftTip;
    }

    public static synchronized GiftManager inst() {
        synchronized (GiftManager.class) {
            if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 9232, new Class[0], GiftManager.class)) {
                GiftManager giftManager = (GiftManager) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 9232, new Class[0], GiftManager.class);
                return giftManager;
            }
            if (sInst == null) {
                sInst = new GiftManager();
            }
            GiftManager giftManager2 = sInst;
            return giftManager2;
        }
    }

    public void clearGiftIconBitmapCache() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9237, new Class[0], Void.TYPE);
            return;
        }
        this.localGiftBitmapCache.clear();
    }

    public List<com.bytedance.android.livesdk.gift.model.d> getGroupCountInfo() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9241, new Class[0], List.class)) {
            return new ArrayList(this.mGroupCountInfo);
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9241, new Class[0], List.class);
    }

    static {
        ExecutorService executorService;
        SimpleThreadFactory simpleThreadFactory = new SimpleThreadFactory("gift_icon_download");
        if (PatchProxy.isSupport(new Object[]{simpleThreadFactory}, null, k.f15091a, true, 9269, new Class[]{ThreadFactory.class}, ExecutorService.class)) {
            executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[]{simpleThreadFactory}, null, k.f15091a, true, 9269, new Class[]{ThreadFactory.class}, ExecutorService.class);
        } else {
            executorService = com.ss.android.ugc.aweme.thread.h.a(m.a(p.FIXED).a(1).a((ThreadFactory) simpleThreadFactory).a());
        }
        EXECUTOR = executorService;
    }

    private void loadLocal() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9250, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9250, new Class[0], Void.TYPE);
            return;
        }
        Flowable.create(new g(this), BackpressureStrategy.BUFFER).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new h(this), i.f15031b);
    }

    public List<b> getGiftList() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9239, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9239, new Class[0], List.class);
        }
        Room a2 = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).room().a();
        if (a2 != null) {
            i = a2.getOrientation();
        }
        List list = this.mGiftsMap.get(Integer.valueOf(i));
        if (list != null) {
            return new ArrayList(list);
        }
        return new ArrayList();
    }

    public b getRedEnvelopeGift() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9234, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9234, new Class[0], b.class);
        }
        Room a2 = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).room().a();
        if (a2 != null) {
            i = a2.getOrientation();
        }
        List<b> list = this.mGiftsMap.get(Integer.valueOf(i));
        if (list == null) {
            return null;
        }
        for (b bVar : list) {
            if (bVar != null && 3 == bVar.f15106e) {
                return bVar;
            }
        }
        return null;
    }

    public List<b> getStickerGifts() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9240, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9240, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        Room a2 = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).room().a();
        if (a2 != null) {
            i = a2.getOrientation();
        }
        List<b> list = this.mGiftsMap.get(Integer.valueOf(i));
        if (list == null) {
            return arrayList;
        }
        for (b bVar : list) {
            if (bVar.f15106e == 4) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public boolean isGiftListLoaded() {
        int i;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9238, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9238, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Room a2 = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).room().a();
        if (a2 != null) {
            i = a2.getOrientation();
        } else {
            i = 0;
        }
        List list = this.mGiftsMap.get(Integer.valueOf(i));
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        return z;
    }

    private GiftManager() {
        ((IHostApp) com.bytedance.android.live.utility.b.a(IHostApp.class)).c();
        loadLocal();
        try {
            ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).initGiftResourceManager(ac.e());
        } catch (Exception unused) {
        }
        com.ss.ugc.live.b.a.f a2 = com.ss.ugc.live.b.a.f.a();
        com.ss.ugc.live.b.a.b bVar = this.mGetResourceListener;
        if (bVar != null && !a2.f78668d.contains(bVar)) {
            a2.f78668d.add(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$loadLocal$3$GiftManager(FlowableEmitter flowableEmitter) throws Exception {
        String d2 = ((com.bytedance.android.livesdkapi.d) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.d.class)).d(com.bytedance.android.livesdk.w.e.GIFT_LIST);
        if (!StringUtils.isEmpty(d2)) {
            flowableEmitter.onNext((Map) this.gson.fromJson(d2, new TypeToken<Map<Integer, List<b>>>() {
            }.getType()));
            flowableEmitter.onComplete();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$loadLocal$4$GiftManager(Map map) throws Exception {
        if (map != null) {
            for (Integer num : map.keySet()) {
                if (num != null) {
                    addGiftMap((List) map.get(num), num.intValue());
                }
            }
        }
    }

    public static void filterNotDisplayedOnPanel(Collection<? extends b> collection) {
        if (PatchProxy.isSupport(new Object[]{collection}, null, changeQuickRedirect, true, 9255, new Class[]{Collection.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{collection}, null, changeQuickRedirect, true, 9255, new Class[]{Collection.class}, Void.TYPE);
            return;
        }
        Iterator<? extends b> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!((b) it2.next()).p) {
                it2.remove();
            }
        }
    }

    public List<b> filterFansClubGifts(Collection<? extends b> collection) {
        if (PatchProxy.isSupport(new Object[]{collection}, this, changeQuickRedirect, false, 9256, new Class[]{Collection.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{collection}, this, changeQuickRedirect, false, 9256, new Class[]{Collection.class}, List.class);
        } else if (collection == null || collection.isEmpty() || this.mFansClubIds == null || this.mFansClubIds.isEmpty()) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (b bVar : collection) {
                if (this.mFansClubIds.contains(Long.valueOf(bVar.f15105d))) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }
    }

    public b findGiftById(long j) {
        long j2 = j;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 9233, new Class[]{Long.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 9233, new Class[]{Long.TYPE}, b.class);
        }
        Room a2 = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).room().a();
        if (a2 != null) {
            i = a2.getOrientation();
        }
        LongSparseArray longSparseArray = this.mGiftsMapByFind.get(i);
        if (longSparseArray == null) {
            return null;
        }
        return (b) longSparseArray.get(j2);
    }

    public com.bytedance.android.livesdk.gift.relay.a.c getGiftRelayInfo(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9252, new Class[]{Integer.TYPE}, com.bytedance.android.livesdk.gift.relay.a.c.class)) {
            return (com.bytedance.android.livesdk.gift.relay.a.c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9252, new Class[]{Integer.TYPE}, com.bytedance.android.livesdk.gift.relay.a.c.class);
        } else if (this.mGiftRelayInfoList == null || this.mGiftRelayInfoList.size() <= i) {
            return null;
        } else {
            return this.mGiftRelayInfoList.get(i);
        }
    }

    public com.bytedance.android.live.gift.b getGiftType(b bVar) {
        if (bVar == null) {
            return com.bytedance.android.live.gift.b.UNKNOWN;
        }
        if (bVar.f15106e == 10) {
            return com.bytedance.android.live.gift.b.GOLDEN_BEAN_CELL;
        }
        if (bVar.f15106e == 9) {
            return com.bytedance.android.live.gift.b.FREE_CELL;
        }
        if (bVar.f15106e == 1) {
            return com.bytedance.android.live.gift.b.NORMAL_GIFT;
        }
        if (bVar.f15106e == 5) {
            return com.bytedance.android.live.gift.b.TASK_GIFT;
        }
        if (bVar.f15106e == 4) {
            return com.bytedance.android.live.gift.b.STICKER_GIFT;
        }
        if (bVar.f15106e == 8) {
            return com.bytedance.android.live.gift.b.MIDDLE_GIFT;
        }
        if (bVar.f15106e == 2) {
            return com.bytedance.android.live.gift.b.SPECIAL_GIFT;
        }
        return com.bytedance.android.live.gift.b.UNKNOWN;
    }

    public boolean isDownloadedGiftIcon(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 9236, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 9236, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (findGiftById(j) != null && this.mGiftImageModelMap.containsKey(Long.valueOf(j))) {
            return true;
        } else {
            return false;
        }
    }

    public void syncGiftList(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9242, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9242, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        syncGiftList(null, 0, i, false);
    }

    public void syncXgCoin(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 9244, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 9244, new Class[]{a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            ((com.bytedance.android.livesdk.utils.b.b) ((GiftRetrofitApi) ((com.bytedance.android.livesdkapi.host.h) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(GiftRetrofitApi.class)).syncXgCoin().compose(i.a()).as(com.bytedance.android.livesdk.utils.b.c.a())).a(3).subscribe((Consumer<? super T>) new f<Object>(this, aVar2));
        }
    }

    public Bitmap getGiftIconBitmap(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 9235, new Class[]{Long.TYPE}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 9235, new Class[]{Long.TYPE}, Bitmap.class);
        }
        b findGiftById = findGiftById(j);
        if (!isDownloadedGiftIcon(j)) {
            return null;
        }
        if (!this.localGiftBitmapCache.containsKey(Long.valueOf(j))) {
            ImageModel imageModel = findGiftById.f15103b;
            if (imageModel != null && imageModel.getUrls().size() > 0) {
                this.localGiftBitmapCache.put(Long.valueOf(j), BitmapFactory.decodeFile(((com.bytedance.android.livesdkapi.host.e) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.e.class)).b(imageModel)));
            }
        }
        return this.localGiftBitmapCache.get(Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$syncXgCoin$2$GiftManager(a aVar, com.bytedance.android.live.core.network.response.d dVar) throws Exception {
        if (dVar != null && dVar.f7871b != null) {
            this.mXgCoinCache = ((l) dVar.f7871b).f15140a;
        }
    }

    public static void filterInteractNotSupportGift(Collection<? extends b> collection, boolean z) {
        if (PatchProxy.isSupport(new Object[]{collection, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 9254, new Class[]{Collection.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{collection, Byte.valueOf(z)}, null, changeQuickRedirect, true, 9254, new Class[]{Collection.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        filterNotSupportGift(collection, z);
        Iterator<? extends b> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!((b) it2.next()).k) {
                it2.remove();
            }
        }
    }

    private void addGiftMap(List<b> list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, changeQuickRedirect, false, 9247, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, changeQuickRedirect, false, 9247, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
        } else if (list != null && !list.isEmpty()) {
            List list2 = this.mGiftsMap.get(Integer.valueOf(i));
            if (list2 != null) {
                list2.clear();
                list2.addAll(list);
            } else {
                this.mGiftsMap.put(Integer.valueOf(i), new ArrayList(list));
            }
            LongSparseArray longSparseArray = this.mGiftsMapByFind.get(i);
            if (longSparseArray != null) {
                longSparseArray.clear();
            } else {
                longSparseArray = new LongSparseArray();
                this.mGiftsMapByFind.append(i, longSparseArray);
            }
            this.mDownloadingQueue.clear();
            for (b next : list) {
                longSparseArray.append(next.f15105d, next);
                this.mDownloadingQueue.offer(next);
            }
            if (!this.isDownloading) {
                new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f14681a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f14681a, false, 9263, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f14681a, false, 9263, new Class[0], Void.TYPE);
                            return;
                        }
                        if (GiftManager.this.continuousFail > 0 && GiftManager.this.continuousFail > ((Integer) LiveSettingKeys.LIVE_GIFT_ICON_DOWNLOAD_MAX_FAIL.a()).intValue()) {
                            GiftManager.this.mDownloadingQueue.clear();
                        }
                        b poll = GiftManager.this.mDownloadingQueue.poll();
                        if (poll == null) {
                            GiftManager.this.isDownloading = false;
                            GiftManager.this.continuousFail = 0;
                            return;
                        }
                        GiftManager.this.isDownloading = true;
                        GiftManager.this.downloadIconBitmap(poll.f15105d, poll.f15103b, this);
                    }
                }.run();
            }
        }
    }

    public static void filterNotSupportGift(Collection<? extends b> collection, boolean z) {
        if (PatchProxy.isSupport(new Object[]{collection, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 9253, new Class[]{Collection.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{collection, Byte.valueOf(z)}, null, changeQuickRedirect, true, 9253, new Class[]{Collection.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Iterator<? extends b> it2 = collection.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            if (bVar.f15105d == 998) {
                it2.remove();
            } else if ((bVar.f15106e == 2 || bVar.f15106e == 8) && !f.a("effects").a(bVar.r)) {
                it2.remove();
            } else if (bVar.f15106e == 4 && z && !f.a("effects").a(bVar.r)) {
                it2.remove();
            }
        }
    }

    private boolean needDownload(long j, ImageModel imageModel) {
        long j2 = j;
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), imageModel2}, this, changeQuickRedirect, false, 9248, new Class[]{Long.TYPE, ImageModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), imageModel2}, this, changeQuickRedirect, false, 9248, new Class[]{Long.TYPE, ImageModel.class}, Boolean.TYPE)).booleanValue();
        } else if (this.mGiftImageModelMap.containsKey(Long.valueOf(j)) || imageModel2 == null || imageModel.getUrls() == null || imageModel.getUrls().isEmpty()) {
            return false;
        } else {
            if (!((com.bytedance.android.livesdkapi.host.e) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.e.class)).a(imageModel2)) {
                return true;
            }
            this.mGiftImageModelMap.put(Long.valueOf(j), imageModel2);
            return false;
        }
    }

    private void notifyFastGiftModule(long j, boolean z) {
        long j2 = j;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 9251, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j), Byte.valueOf(z)}, this, changeQuickRedirect, false, 9251, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (0 == j2) {
            this.mFastGift = null;
            com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.chatroom.event.i(null));
        } else {
            Room a2 = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).room().a();
            if (a2 != null) {
                i = a2.getOrientation();
            }
            List list = this.mGiftsMap.get(Integer.valueOf(i));
            if (list != null) {
                ArrayList<b> arrayList = new ArrayList<>(list);
                filterNotSupportGift(arrayList, z);
                for (b bVar : arrayList) {
                    if (bVar.f15105d == j2) {
                        this.mFastGift = bVar;
                        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.chatroom.event.i(bVar));
                        return;
                    }
                }
            }
        }
    }

    static final /* synthetic */ void lambda$syncGiftList$1$GiftManager(boolean z, WeakReference weakReference, Throwable th) throws Exception {
        Exception exc = new Exception(th);
        com.bytedance.android.live.core.c.a.c("GIFT_MANAGER", "syncgiftlist error! " + exc.getMessage());
        if (z) {
            o.c(exc.getMessage());
        }
        if (weakReference.get() != null) {
            ((com.bytedance.android.live.gift.d) weakReference.get()).a();
        }
    }

    private void onSyncGiftListSuccess(com.bytedance.android.livesdk.gift.model.e eVar, boolean z, com.bytedance.android.live.gift.d dVar) {
        com.bytedance.android.livesdk.gift.model.e eVar2 = eVar;
        com.bytedance.android.live.gift.d dVar2 = dVar;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{eVar2, Byte.valueOf(z ? (byte) 1 : 0), dVar2}, this, changeQuickRedirect, false, 9245, new Class[]{com.bytedance.android.livesdk.gift.model.e.class, Boolean.TYPE, com.bytedance.android.live.gift.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, Byte.valueOf(z), dVar2}, this, changeQuickRedirect, false, 9245, new Class[]{com.bytedance.android.livesdk.gift.model.e.class, Boolean.TYPE, com.bytedance.android.live.gift.d.class}, Void.TYPE);
        } else if (eVar2 == null) {
            if (dVar2 != null) {
                dVar2.a(new ArrayList());
            }
        } else {
            if (!Lists.isEmpty(eVar2.f15114a)) {
                ((com.bytedance.android.livesdkapi.d) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.d.class)).a((d.a) com.bytedance.android.livesdk.w.e.GIFT_LIST, this.gson.toJson((Object) eVar2.f15114a));
            }
            List<b> list = eVar2.f15114a;
            if (list != null && !list.isEmpty()) {
                Room a2 = ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).room().a();
                if (a2 != null) {
                    i = a2.getOrientation();
                }
                addGiftMap(list, i);
                ((com.bytedance.android.livesdkapi.d) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.d.class)).a((d.a) com.bytedance.android.livesdk.w.e.GIFT_LIST, this.gson.toJson((Object) this.mGiftsMap));
            }
            if (dVar2 != null) {
                dVar2.a(list);
            }
            com.bytedance.android.livesdk.gift.model.f fVar = eVar2.f15115b;
            if (fVar != null) {
                this.mGiftRelayInfoList = fVar.f15121f;
                if (fVar.f15119d > 0 && !TextUtils.isEmpty(fVar.f15120e)) {
                    updateNewGiftTip(eVar2.f15114a, fVar.f15119d, fVar.f15120e);
                }
                notifyFastGiftModule(fVar.f15116a, z);
                if (fVar.f15117b != null) {
                    this.mGroupCountInfo.clear();
                    this.mGroupCountInfo.addAll(fVar.f15117b);
                }
                if (fVar.f15118c != null) {
                    this.mFansClubIds = fVar.f15118c;
                }
            }
        }
    }

    private void updateNewGiftTip(List<b> list, long j, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, new Long(j2), str2}, this, changeQuickRedirect, false, 9246, new Class[]{List.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, new Long(j2), str2}, this, changeQuickRedirect, false, 9246, new Class[]{List.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        b bVar = null;
        Iterator<b> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            b next = it2.next();
            if (next.f15105d == j2) {
                bVar = next;
                break;
            }
        }
        if (bVar != null) {
            this.mNewGiftId = j2;
            this.mNewGiftTip = str2;
            if (((Long) com.bytedance.android.livesdk.w.b.y.a()).longValue() == this.mNewGiftId) {
                this.mHasNewGift = false;
            } else {
                this.mHasNewGift = true;
            }
        }
    }

    public void downloadIconBitmap(long j, ImageModel imageModel, Runnable runnable) {
        long j2 = j;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), imageModel, runnable2}, this, changeQuickRedirect, false, 9249, new Class[]{Long.TYPE, ImageModel.class, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), imageModel, runnable2}, this, changeQuickRedirect, false, 9249, new Class[]{Long.TYPE, ImageModel.class, Runnable.class}, Void.TYPE);
        } else if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().isEmpty()) {
            this.mUIHandler.post(runnable2);
        } else if (!needDownload(j, imageModel)) {
            this.mUIHandler.post(runnable2);
        } else {
            String str = imageModel.getUrls().get(0);
            final long j3 = j;
            final ImageModel imageModel2 = imageModel;
            final Runnable runnable3 = runnable;
            final String str2 = str;
            AnonymousClass2 r0 = new e.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14683a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f14683a, false, 9264, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f14683a, false, 9264, new Class[0], Void.TYPE);
                        return;
                    }
                    GiftManager.this.mGiftImageModelMap.put(Long.valueOf(j3), imageModel2);
                    GiftManager.this.mUIHandler.post(runnable3);
                    o.a(j3, str2);
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f14683a, false, 9265, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f14683a, false, 9265, new Class[0], Void.TYPE);
                        return;
                    }
                    GiftManager.this.mUIHandler.post(new j(this));
                    GiftManager.this.mUIHandler.post(runnable3);
                    o.a(j3, str2, "download gift icon failure");
                }
            };
            ((com.bytedance.android.livesdkapi.host.e) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.e.class)).a(str, (e.b) r0);
        }
    }

    public void syncGiftList(com.bytedance.android.live.gift.d dVar, long j, int i, boolean z) {
        boolean z2;
        com.bytedance.android.live.core.rxutils.h hVar;
        com.bytedance.android.live.gift.d dVar2 = dVar;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{dVar2, new Long(j2), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 9243, new Class[]{com.bytedance.android.live.gift.d.class, Long.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, new Long(j2), Integer.valueOf(i), Byte.valueOf(z)}, this, changeQuickRedirect, false, 9243, new Class[]{com.bytedance.android.live.gift.d.class, Long.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (NetworkUtils.isNetworkAvailable(ac.e())) {
            this.mAssetsManager.a(i, z);
            WeakReference weakReference = new WeakReference(dVar2);
            if (j2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            com.bytedance.android.livesdk.utils.b.b bVar = (com.bytedance.android.livesdk.utils.b.b) ((GiftRetrofitApi) ((com.bytedance.android.livesdkapi.host.h) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(GiftRetrofitApi.class)).syncGiftList(String.valueOf(j)).compose(i.a()).as(com.bytedance.android.livesdk.utils.b.c.a());
            if (PatchProxy.isSupport(new Object[]{3}, null, i.f8106a, true, 632, new Class[]{Integer.TYPE}, com.bytedance.android.live.core.rxutils.h.class)) {
                Object[] objArr = {3};
                hVar = (com.bytedance.android.live.core.rxutils.h) PatchProxy.accessDispatch(objArr, null, i.f8106a, true, 632, new Class[]{Integer.TYPE}, com.bytedance.android.live.core.rxutils.h.class);
            } else {
                if (PatchProxy.isSupport(new Object[]{3, 500L}, null, i.f8106a, true, 633, new Class[]{Integer.TYPE, Long.TYPE}, com.bytedance.android.live.core.rxutils.h.class)) {
                    Object[] objArr2 = {3, 500L};
                    hVar = (com.bytedance.android.live.core.rxutils.h) PatchProxy.accessDispatch(objArr2, null, i.f8106a, true, 633, new Class[]{Integer.TYPE, Long.TYPE}, com.bytedance.android.live.core.rxutils.h.class);
                } else {
                    hVar = new com.bytedance.android.live.core.rxutils.h(3, 500);
                }
            }
            Observable a2 = bVar.a((Function<Observable<Throwable>, ObservableSource<?>>) hVar);
            d dVar3 = new d(this, z, weakReference, uptimeMillis, z2);
            a2.subscribe(dVar3, new e(z2, weakReference));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$syncGiftList$0$GiftManager(boolean z, WeakReference weakReference, long j, boolean z2, com.bytedance.android.live.core.network.response.d dVar) throws Exception {
        String str;
        if (dVar != null && dVar.f7871b != null) {
            onSyncGiftListSuccess((com.bytedance.android.livesdk.gift.model.e) dVar.f7871b, z, (com.bytedance.android.live.gift.d) weakReference.get());
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            if (z2) {
                if (PatchProxy.isSupport(new Object[]{new Long(uptimeMillis)}, null, o.f15142a, true, 9286, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(uptimeMillis)}, null, o.f15142a, true, 9286, new Class[]{Long.TYPE}, Void.TYPE);
                } else {
                    com.bytedance.android.live.core.d.e.a(o.a("ttlive_gift_list_status"), 0, uptimeMillis);
                }
            }
        } else if (z2) {
            if (dVar == null) {
                str = "response is empty";
            } else {
                str = "response.data is empty";
            }
            o.c(str);
        }
    }
}
