package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.chatroom.model.TaskGiftEvent;
import com.bytedance.android.livesdk.chatroom.presenter.s;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11414a;

    /* renamed from: b  reason: collision with root package name */
    private final s f11415b;

    public v(s sVar) {
        this.f11415b = sVar;
    }

    public final void accept(Object obj) {
        List list;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11414a, false, 5205, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11414a, false, 5205, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        s sVar = this.f11415b;
        JsonObject jsonObject = (JsonObject) obj;
        sVar.f11399b = false;
        try {
            if (PatchProxy.isSupport(new Object[]{jsonObject}, sVar, s.f11398a, false, 5202, new Class[]{JsonObject.class}, List.class)) {
                s sVar2 = sVar;
                list = (List) PatchProxy.accessDispatch(new Object[]{jsonObject}, sVar2, s.f11398a, false, 5202, new Class[]{JsonObject.class}, List.class);
            } else {
                ArrayList arrayList = new ArrayList();
                JsonArray asJsonArray = jsonObject.getAsJsonArray("data");
                for (int i = 0; i < asJsonArray.size(); i++) {
                    JsonObject asJsonObject = asJsonArray.get(i).getAsJsonObject();
                    TaskGiftEvent taskGiftEvent = new TaskGiftEvent();
                    taskGiftEvent.setData(asJsonObject.get("data").toString());
                    taskGiftEvent.setType(asJsonObject.get("type").getAsInt());
                    taskGiftEvent.setSubtitle(asJsonObject.get("subtitle").getAsString());
                    arrayList.add(taskGiftEvent);
                }
                list = arrayList;
            }
            if (!CollectionUtils.isEmpty(list) && list.size() >= 3 && sVar.b() != null) {
                ((s.a) sVar.b()).a(list);
            }
        } catch (Exception e2) {
            a.c("GiftPresenter", e2.toString());
        }
    }
}
