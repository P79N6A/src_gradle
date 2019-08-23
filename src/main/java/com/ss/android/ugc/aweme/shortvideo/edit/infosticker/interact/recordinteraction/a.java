package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.h;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.guide.ExtraParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a implements MessageCenter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67296a;

    /* renamed from: b  reason: collision with root package name */
    public String f67297b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f67298c = "";

    /* renamed from: d  reason: collision with root package name */
    public boolean f67299d = true;

    /* renamed from: e  reason: collision with root package name */
    public LinkedHashMap<String, List<NormalTrackTimeStamp>> f67300e = new LinkedHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public LinkedHashMap<String, ExtraParams> f67301f = new LinkedHashMap<>();
    public int g = 0;

    public a() {
        h.a().a(this);
    }

    public void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67296a, false, 77010, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67296a, false, 77010, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f67299d) {
            for (Map.Entry<String, List<NormalTrackTimeStamp>> value : this.f67300e.entrySet()) {
                List list = (List) value.getValue();
                if (!CollectionUtils.isEmpty(list)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((NormalTrackTimeStamp) it2.next()).getPts() > i) {
                            it2.remove();
                        }
                    }
                }
            }
        }
    }

    public final void a(fh fhVar) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{fhVar}, this, f67296a, false, 77009, new Class[]{fh.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fhVar}, this, f67296a, false, 77009, new Class[]{fh.class}, Void.TYPE);
        } else if (this.f67299d) {
            int i2 = (int) fhVar.n;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f67296a, false, 77011, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f67296a, false, 77011, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (this.f67299d && i2 - this.g < -10) {
                a(i2);
                this.g = i2;
            }
            LinkedList linkedList = new LinkedList();
            for (Map.Entry next : this.f67300e.entrySet()) {
                ExtraParams extraParams = this.f67301f.get(next.getKey());
                List list = (List) next.getValue();
                if (!CollectionUtils.isEmpty(list) && extraParams != null) {
                    RecordInteractExtra recordInteractExtra = new RecordInteractExtra();
                    recordInteractExtra.formatFromExtraParams(extraParams, (String) next.getKey());
                    InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("interaction_extra", recordInteractExtra);
                    interactStickerStruct.setAttr(com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().toJson((Object) linkedHashMap));
                    interactStickerStruct.setType(2);
                    interactStickerStruct.setIndex(i);
                    interactStickerStruct.setTrackList(com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().toJson((Object) list));
                    linkedList.add(interactStickerStruct);
                    i++;
                }
            }
            fhVar.ae = b.a(fhVar.ae, (List<InteractStickerStruct>) linkedList, d.TRACK_PAGE_RECORD);
        }
    }

    public final void a(int i, ExtraParams extraParams) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), extraParams}, this, f67296a, false, 77008, new Class[]{Integer.TYPE, ExtraParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), extraParams}, this, f67296a, false, 77008, new Class[]{Integer.TYPE, ExtraParams.class}, Void.TYPE);
        } else if (this.f67299d && !StringUtils.isEmpty(this.f67297b)) {
            ArrayList arrayList = new ArrayList();
            List list = this.f67300e.get(this.f67298c);
            if (!CollectionUtils.isEmpty(list)) {
                arrayList.addAll(list);
            }
            EffectLocationMessage effectLocationMessage = null;
            try {
                effectLocationMessage = (EffectLocationMessage) com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().fromJson(this.f67297b, EffectLocationMessage.class);
            } catch (Exception unused) {
            }
            if (effectLocationMessage != null && !CollectionUtils.isEmpty(effectLocationMessage.locations)) {
                LinkedList linkedList = new LinkedList();
                for (EffectLocation next : effectLocationMessage.locations) {
                    NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                    normalTrackTimeStamp.setPts(i);
                    normalTrackTimeStamp.setWidth(next.getW());
                    normalTrackTimeStamp.setHeight(next.getH());
                    normalTrackTimeStamp.setX(next.getX());
                    normalTrackTimeStamp.setY(next.getY());
                    normalTrackTimeStamp.setScale(Float.valueOf(1.0f));
                    normalTrackTimeStamp.setRotation(next.getR());
                    linkedList.add(normalTrackTimeStamp);
                }
                arrayList.addAll(linkedList);
                this.f67300e.put(this.f67298c, arrayList);
                this.f67301f.put(this.f67298c, extraParams);
            }
        }
    }

    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 28) {
            this.f67297b = str;
        }
    }
}
