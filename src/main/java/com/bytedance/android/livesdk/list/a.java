package com.bytedance.android.livesdk.list;

import android.text.TextUtils;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15771a;

    /* renamed from: b  reason: collision with root package name */
    private final MultiRoomIdListProvider f15772b;

    a(MultiRoomIdListProvider multiRoomIdListProvider) {
        this.f15772b = multiRoomIdListProvider;
    }

    public final void accept(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15771a, false, 10231, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15771a, false, 10231, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        MultiRoomIdListProvider multiRoomIdListProvider = this.f15772b;
        d dVar = (d) obj;
        if (!(dVar == null || dVar.f7871b == null)) {
            Map map = (Map) dVar.f7871b;
            ArrayList<Room> arrayList = new ArrayList<>();
            String str = "";
            String str2 = "";
            if (multiRoomIdListProvider.f1864d != null) {
                str = multiRoomIdListProvider.f1864d.getString("live.intent.extra.REQUEST_ID");
                str2 = multiRoomIdListProvider.f1864d.getString("live.intent.extra.LOG_PB");
                if (TextUtils.isEmpty(str)) {
                    str = multiRoomIdListProvider.f1864d.getString("request_id");
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = multiRoomIdListProvider.f1864d.getString("log_pb");
                }
            }
            Iterator<Long> it2 = multiRoomIdListProvider.f1862b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                Long next = it2.next();
                if (next == null || !map.containsKey(String.valueOf(next))) {
                    break;
                }
                arrayList.add(map.get(String.valueOf(next)));
            }
            for (Room room : arrayList) {
                room.setLog_pb(str2);
                room.setRequestId(str);
            }
            if (!z) {
                multiRoomIdListProvider.f1863c = new ArrayList(arrayList);
                multiRoomIdListProvider.a(multiRoomIdListProvider.f1863c);
            }
        }
    }
}
