package com.bytedance.android.livesdk.live.data;

import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.d;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fJ\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0002JF\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0012\u0004\u0012\u00020\u00120\u00100\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\nJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¨\u0006\u0019"}, d2 = {"Lcom/bytedance/android/livesdk/live/data/DrawRoomListModel;", "", "()V", "collectUnreadRequest", "Lio/reactivex/Observable;", "Lcom/bytedance/android/live/core/network/response/Response;", "roomId", "", "anchorId", "unreadExtra", "", "roomIds", "", "getObjectsStr", "objects", "getRoomList", "Landroid/util/Pair;", "Lcom/bytedance/android/live/base/model/feed/FeedItem;", "Lcom/bytedance/android/live/base/model/Extra;", "maxTime", "reqFrom", "url", "handleRoomParams", "", "item", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15833a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00010\u00012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Landroid/util/Pair;", "", "Lcom/bytedance/android/live/base/model/feed/FeedItem;", "kotlin.jvm.PlatformType", "Lcom/bytedance/android/live/base/model/Extra;", "response", "Lcom/bytedance/android/live/core/network/response/ListResponse;", "apply"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.bytedance.android.livesdk.live.data.a$a  reason: collision with other inner class name */
    public static final class C0112a<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15834a;

        /* renamed from: b  reason: collision with root package name */
        public static final C0112a f15835b = new C0112a();

        C0112a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            c cVar = (c) obj;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f15834a, false, 10311, new Class[]{c.class}, Pair.class)) {
                return (Pair) PatchProxy.accessDispatch(new Object[]{cVar}, this, f15834a, false, 10311, new Class[]{c.class}, Pair.class);
            }
            Intrinsics.checkParameterIsNotNull(cVar, "response");
            ArrayList arrayList = new ArrayList();
            List list = cVar.f7867b;
            if (list != null) {
                arrayList.addAll(list);
            }
            return Pair.create(arrayList, cVar.f7868c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007 \u0006*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "pair", "Landroid/util/Pair;", "", "Lcom/bytedance/android/live/base/model/feed/FeedItem;", "kotlin.jvm.PlatformType", "Lcom/bytedance/android/live/base/model/Extra;", "accept"}, k = 3, mv = {1, 1, 13})
    public static final class b<T> implements Consumer<Pair<List<? extends FeedItem>, Extra>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f15837b;

        public b(a aVar) {
            this.f15837b = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Pair pair = (Pair) obj;
            if (PatchProxy.isSupport(new Object[]{pair}, this, f15836a, false, 10312, new Class[]{Pair.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pair}, this, f15836a, false, 10312, new Class[]{Pair.class}, Void.TYPE);
            } else if (pair == null || pair.first == null || ((List) pair.first).isEmpty() || pair.second == null) {
            } else {
                JsonObject jsonObject = ((Extra) pair.second).logPb;
                if (jsonObject != null) {
                    Object obj2 = pair.first;
                    Intrinsics.checkExpressionValueIsNotNull(obj2, "pair.first");
                    for (FeedItem feedItem : (Iterable) obj2) {
                        feedItem.logPb = jsonObject.toString();
                        a aVar = this.f15837b;
                        if (PatchProxy.isSupport(new Object[]{feedItem}, aVar, a.f15833a, false, 10309, new Class[]{FeedItem.class}, Void.TYPE)) {
                            a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{feedItem}, aVar2, a.f15833a, false, 10309, new Class[]{FeedItem.class}, Void.TYPE);
                        } else if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
                            d dVar = feedItem.item;
                            if (dVar != null) {
                                Room room = (Room) dVar;
                                room.setLog_pb(feedItem.logPb);
                                User owner = room.getOwner();
                                if (owner != null) {
                                    owner.setLogPb(feedItem.logPb);
                                }
                                room.setRequestId(feedItem.resId);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                            }
                        }
                    }
                    return;
                }
            }
        }
    }

    private final String a(List<? extends Object> list) {
        boolean z;
        StringBuilder sb;
        List<? extends Object> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f15833a, false, 10310, new Class[]{List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list2}, this, f15833a, false, 10310, new Class[]{List.class}, String.class);
        } else if (list2 == null || list.isEmpty()) {
            return "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                sb2.append(list2.get(i).toString());
                if (i < list.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    sb = sb2;
                } else {
                    sb = null;
                }
                if (sb != null) {
                    sb.append(",");
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb3, "builder.toString()");
            return sb3;
        }
    }

    @NotNull
    public final Observable<com.bytedance.android.live.core.network.response.d<Object>> a(long j, long j2, @NotNull String str, @NotNull List<Long> list) {
        long j3 = j;
        long j4 = j2;
        String str2 = str;
        List<Long> list2 = list;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str2, list2}, this, f15833a, false, 10308, new Class[]{Long.TYPE, Long.TYPE, String.class, List.class}, Observable.class)) {
            Object[] objArr = {new Long(j3), new Long(j4), str2, list2};
            return (Observable) PatchProxy.accessDispatch(objArr, this, f15833a, false, 10308, new Class[]{Long.TYPE, Long.TYPE, String.class, List.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "unreadExtra");
        Intrinsics.checkParameterIsNotNull(list2, "roomIds");
        Observable<com.bytedance.android.live.core.network.response.d<Object>> collectUnreadRequest = ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).collectUnreadRequest(j, j2, str, a(list2));
        Intrinsics.checkExpressionValueIsNotNull(collectUnreadRequest, "LiveInternalService.inst…, getObjectsStr(roomIds))");
        return collectUnreadRequest;
    }
}
