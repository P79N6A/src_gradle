package com.bytedance.android.livesdk.live.data;

import android.arch.lifecycle.MutableLiveData;
import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.live.model.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.retrofit2.Retrofit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RoomStatsViewModel extends RxViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15830a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableLiveData<Map<String, a>> f15831b = new MutableLiveData<>();

    /* renamed from: c  reason: collision with root package name */
    private final Retrofit f15832c;

    public RoomStatsViewModel(Retrofit retrofit) {
        this.f15832c = retrofit;
    }

    public final void a(List<Room> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f15830a, false, 10313, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f15830a, false, 10313, new Class[]{List.class}, Void.TYPE);
        } else if (Lists.isEmpty(list)) {
            this.f15831b.setValue(new HashMap());
        } else {
            LinkedList linkedList = new LinkedList();
            for (Room next : list) {
                if (next != null) {
                    linkedList.add(Long.valueOf(next.getId()));
                }
            }
            ((RoomStatApi) this.f15832c.create(RoomStatApi.class)).checkRoom(TextUtils.join(",", linkedList)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(this), new c(this));
        }
    }
}
