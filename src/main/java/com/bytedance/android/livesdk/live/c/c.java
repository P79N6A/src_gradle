package com.bytedance.android.livesdk.live.c;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.a;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;
import org.json.JSONObject;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15820a;

    /* renamed from: b  reason: collision with root package name */
    private final b f15821b;

    c(b bVar) {
        this.f15821b = bVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15820a, false, 10345, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15820a, false, 10345, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f15821b;
        Pair pair = (Pair) obj;
        if (pair != null) {
            bVar.f15819e = (Extra) pair.second;
            List<FeedItem> list = (List) pair.first;
            if (!Lists.isEmpty(list)) {
                bVar.f15818d.addAll(list);
                if (PatchProxy.isSupport(new Object[]{list}, bVar, b.f15815a, false, 10343, new Class[]{List.class}, Void.TYPE)) {
                    b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{list}, bVar2, b.f15815a, false, 10343, new Class[]{List.class}, Void.TYPE);
                } else if (!Lists.isEmpty(list)) {
                    for (FeedItem feedItem : list) {
                        if (feedItem.item instanceof Room) {
                            Room room = (Room) feedItem.item;
                            bVar.f15817c.add(room);
                            Bundle a2 = a.a(room);
                            try {
                                if (bVar.f15819e != null) {
                                    a2.putString("live.intent.extra.LOG_PB", String.valueOf(bVar.f15819e.logPb));
                                    if (TextUtils.isEmpty(bVar.f15819e.reqId) && !TextUtils.isEmpty(String.valueOf(bVar.f15819e.logPb))) {
                                        JSONObject jSONObject = new JSONObject(bVar.f15819e.logPb.toString());
                                        bVar.f15819e.reqId = jSONObject.getString("impr_id");
                                    }
                                    a2.putString("live.intent.extra.REQUEST_ID", bVar.f15819e.reqId);
                                }
                            } catch (Exception unused) {
                            }
                            bVar.f15816b.add(a2);
                        }
                    }
                }
                bVar.e();
            }
        }
    }
}
