package com.bytedance.android.livesdk.live.c;

import android.os.Bundle;
import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.livesdk.live.data.a;
import com.bytedance.android.livesdk.live.model.FeedDraw;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 ;2\u00020\u0001:\u0001;B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010'\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010)\u001a\u0004\u0018\u00010\u00112\u0006\u0010%\u001a\u00020\u0018J\u0006\u0010*\u001a\u00020\u0005J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0018H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0-H\u0016J\u0010\u0010.\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0011H\u0002J\u0012\u0010/\u001a\u00020\u00182\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020\u0018H\u0016J\u000e\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\tJ\u001e\u00104\u001a\u00020$2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u0011062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u00107\u001a\u00020$H\u0016J\u0010\u00108\u001a\u00020$2\u0006\u00103\u001a\u00020\tH\u0016J\b\u00109\u001a\u00020\u0018H\u0016J\b\u0010:\u001a\u00020$H\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0014j\b\u0012\u0004\u0012\u00020\t`\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0010j\b\u0012\u0004\u0012\u00020\u0003`\u0012X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0010j\b\u0012\u0004\u0012\u00020\u001b`\u0012X\u0004¢\u0006\u0002\n\u0000RJ\u0010\u001c\u001a>\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\u0014j\b\u0012\u0004\u0012\u00020\t`\u00150\u001dj\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\u0014j\b\u0012\u0004\u0012\u00020\t`\u0015`\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006<"}, d2 = {"Lcom/bytedance/android/livesdk/live/listprovider/DrawRoomListProvider;", "Lcom/bytedance/android/livesdkapi/feed/ILiveRoomListProvider;", "roomArgs", "Landroid/os/Bundle;", "url", "", "requestFrom", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "enterAnchorId", "", "enterRoomId", "extra", "Lcom/bytedance/android/live/base/model/Extra;", "listModel", "Lcom/bytedance/android/livesdk/live/data/DrawRoomListModel;", "mFeedItems", "Ljava/util/ArrayList;", "Lcom/bytedance/android/live/base/model/feed/FeedItem;", "Lkotlin/collections/ArrayList;", "mReadRoomSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "mReqFrom", "mResId", "", "mRoomArgList", "mRoomList", "Lcom/bytedance/android/livesdkapi/depend/model/live/Room;", "mUnreadMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mUrl", "reqFrom", "getReqFrom", "()Ljava/lang/String;", "alterSpecificItem", "", "pos", "item", "extractAnchorId", "extractRoomId", "getFeedItem", "getRequestFrom", "getRoomArgs", "getRoomList", "", "handleRoomParams", "indexOf", "loadMore", "curIndex", "onRoomShow", "roomId", "parseRoom", "items", "", "release", "removeRoom", "size", "uploadUnReadItem", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class a extends com.bytedance.android.livesdkapi.g.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15803a;

    /* renamed from: e  reason: collision with root package name */
    public static final c f15804e = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<FeedItem> f15805b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public Extra f15806c;

    /* renamed from: d  reason: collision with root package name */
    public String f15807d = "";
    private com.bytedance.android.livesdk.live.data.a g;
    private final ArrayList<Room> h = new ArrayList<>();
    private final ArrayList<Bundle> i = new ArrayList<>();
    private final HashSet<Long> j = new HashSet<>();
    private final HashMap<String, HashSet<Long>> k = new HashMap<>();
    private long l;
    private long m;
    private String n = "";
    private int o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "response", "Lcom/bytedance/android/live/core/network/response/Response;", "", "kotlin.jvm.PlatformType", "accept", "com/bytedance/android/livesdk/live/listprovider/DrawRoomListProvider$release$2$1$1"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.bytedance.android.livesdk.live.c.a$a  reason: collision with other inner class name */
    static final class C0111a<T> implements Consumer<com.bytedance.android.live.core.network.response.d<Object>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f15808a;

        C0111a(String str) {
            this.f15808a = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "response", "Lcom/bytedance/android/live/core/network/response/Response;", "", "kotlin.jvm.PlatformType", "accept", "com/bytedance/android/livesdk/live/listprovider/DrawRoomListProvider$uploadUnReadItem$2$1$1"}, k = 3, mv = {1, 1, 13})
    static final class b<T> implements Consumer<com.bytedance.android.live.core.network.response.d<Object>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f15809a;

        b(String str) {
            this.f15809a = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/android/livesdk/live/listprovider/DrawRoomListProvider$Companion;", "", "()V", "DEFAULT_ID", "", "TAG", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "pair", "Landroid/util/Pair;", "", "Lcom/bytedance/android/live/base/model/feed/FeedItem;", "Lcom/bytedance/android/live/base/model/Extra;", "kotlin.jvm.PlatformType", "accept", "com/bytedance/android/livesdk/live/listprovider/DrawRoomListProvider$loadMore$1$1"}, k = 3, mv = {1, 1, 13})
    static final class d<T> implements Consumer<Pair<List<? extends FeedItem>, Extra>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f15811b;

        d(a aVar) {
            this.f15811b = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Pair pair = (Pair) obj;
            if (PatchProxy.isSupport(new Object[]{pair}, this, f15810a, false, 10335, new Class[]{Pair.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pair}, this, f15810a, false, 10335, new Class[]{Pair.class}, Void.TYPE);
                return;
            }
            if (pair != null) {
                this.f15811b.f15806c = (Extra) pair.second;
                if (pair.first != null && !((List) pair.first).isEmpty()) {
                    a aVar = this.f15811b;
                    Object obj2 = pair.first;
                    Intrinsics.checkExpressionValueIsNotNull(obj2, "pair.first");
                    Object obj3 = pair.second;
                    Intrinsics.checkExpressionValueIsNotNull(obj3, "pair.second");
                    aVar.a((List) obj2, (Extra) obj3);
                    this.f15811b.e();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    static final class e<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f15812a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    static final class f<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f15813a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    static final class g<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f15814a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public final void a(int i2, @Nullable FeedItem feedItem) {
    }

    public final void a(long j2) {
    }

    @NotNull
    public final List<Room> d() {
        return this.h;
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f15803a, false, 10326, new Class[0], Integer.TYPE)) {
            return this.i.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15803a, false, 10326, new Class[0], Integer.TYPE)).intValue();
    }

    public final void c() {
        String str;
        boolean z;
        String str2;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f15803a, false, 10327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15803a, false, 10327, new Class[0], Void.TYPE);
            return;
        }
        if (FeedDraw.needCollectUnRead(this.f15807d)) {
            if (PatchProxy.isSupport(new Object[0], this, f15803a, false, 10333, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f15803a, false, 10333, new Class[0], Void.TYPE);
            } else {
                Map linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : this.k.entrySet()) {
                    ((HashSet) entry.getValue()).removeAll(this.j);
                    if (((HashSet) entry.getValue()).size() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    try {
                        String str3 = (String) entry2.getKey();
                        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) entry2.getKey(), "_", 0, false, 6, (Object) null);
                        if (str3 != null) {
                            str2 = str3.substring(0, lastIndexOf$default);
                            Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            com.bytedance.android.livesdk.live.data.a aVar = this.g;
                            if (aVar != null) {
                                Observable a2 = aVar.a(this.l, this.m, str2, new ArrayList((Collection) entry2.getValue()));
                                if (a2 != null) {
                                    a2.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(str2), g.f15814a);
                                }
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } catch (Exception unused) {
                        str2 = (String) entry2.getKey();
                    }
                }
            }
            Map linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : this.k.entrySet()) {
                ((HashSet) entry3.getValue()).removeAll(this.j);
                if (((HashSet) entry3.getValue()).size() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                try {
                    String str4 = (String) entry4.getKey();
                    int lastIndexOf$default2 = StringsKt.lastIndexOf$default((CharSequence) entry4.getKey(), "_", 0, false, 6, (Object) null);
                    if (str4 != null) {
                        str = str4.substring(0, lastIndexOf$default2);
                        Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        com.bytedance.android.livesdk.live.data.a aVar2 = this.g;
                        if (aVar2 != null) {
                            Observable a3 = aVar2.a(this.l, this.m, str, new ArrayList((Collection) entry4.getValue()));
                            if (a3 != null) {
                                a3.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0111a(str), f.f15813a);
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } catch (Exception unused2) {
                    str = (String) entry4.getKey();
                }
            }
            this.j.clear();
            this.k.clear();
            this.i.clear();
            this.h.clear();
        }
    }

    public final int a(@Nullable Bundle bundle) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15803a, false, 10323, new Class[]{Bundle.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bundle}, this, f15803a, false, 10323, new Class[]{Bundle.class}, Integer.TYPE)).intValue();
        }
        long j2 = -1;
        if (bundle != null) {
            j2 = bundle.getLong("live.intent.extra.ROOM_ID", -1);
        }
        int size = this.i.size();
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle2 = this.i.get(i2);
            if (bundle2.getLong("live.intent.extra.ROOM_ID", 0) == j2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bundle2 = null;
            }
            if (bundle2 != null) {
                return i2;
            }
        }
        return -1;
    }

    public final void b(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f15803a, false, 10328, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f15803a, false, 10328, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.j.add(Long.valueOf(j2));
    }

    @NotNull
    public final Bundle a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f15803a, false, 10324, new Class[]{Integer.TYPE}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f15803a, false, 10324, new Class[]{Integer.TYPE}, Bundle.class);
        }
        Bundle bundle = this.i.get(i2);
        Intrinsics.checkExpressionValueIsNotNull(bundle, "mRoomArgList[pos]");
        return bundle;
    }

    public final void b(int i2) {
        long j2;
        String str;
        Observable observable;
        long j3;
        String str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f15803a, false, 10325, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f15803a, false, 10325, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.l > 0) {
            Extra extra = this.f15806c;
            if (extra == null || extra.hasMore) {
                if (this.g == null) {
                    this.g = new com.bytedance.android.livesdk.live.data.a();
                }
                com.bytedance.android.livesdk.live.data.a aVar = this.g;
                if (aVar != null) {
                    Extra extra2 = this.f15806c;
                    if (extra2 != null) {
                        j2 = extra2.maxTime;
                    } else {
                        j2 = 0;
                    }
                    if (PatchProxy.isSupport(new Object[0], this, f15803a, false, 10322, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], this, f15803a, false, 10322, new Class[0], String.class);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f15807d);
                        Extra extra3 = this.f15806c;
                        if (extra3 != null) {
                            j3 = extra3.maxTime;
                        } else {
                            j3 = 0;
                        }
                        if (j3 == 0) {
                            str2 = "_refresh";
                        } else {
                            str2 = "_loadmore";
                        }
                        sb.append(str2);
                        str = sb.toString();
                    }
                    long j4 = this.l;
                    long j5 = this.m;
                    String str3 = this.n;
                    long j6 = j2;
                    com.bytedance.android.livesdk.live.data.a aVar2 = aVar;
                    if (PatchProxy.isSupport(new Object[]{new Long(j2), str, new Long(j4), new Long(j5), str3}, aVar, com.bytedance.android.livesdk.live.data.a.f15833a, false, 10307, new Class[]{Long.TYPE, String.class, Long.TYPE, Long.TYPE, String.class}, Observable.class)) {
                        observable = (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j6), str, new Long(j4), new Long(j5), str3}, aVar2, com.bytedance.android.livesdk.live.data.a.f15833a, false, 10307, new Class[]{Long.TYPE, String.class, Long.TYPE, Long.TYPE, String.class}, Observable.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(str, "reqFrom");
                        Intrinsics.checkParameterIsNotNull(str3, PushConstants.WEB_URL);
                        observable = ((FeedApi) j.q().d().a(FeedApi.class)).feed(str3, j6, str, 1, j4, j5).map(a.C0112a.f15835b).doOnNext(new a.b(aVar2));
                        Intrinsics.checkExpressionValueIsNotNull(observable, "LiveInternalService.inst…      }\n                }");
                    }
                    if (observable != null) {
                        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(this), e.f15812a);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.bytedance.android.live.base.model.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<? extends com.bytedance.android.live.base.model.feed.FeedItem> r17, com.bytedance.android.live.base.model.Extra r18) {
        /*
            r16 = this;
            r7 = r16
            r9 = r18
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r17
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f15803a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r11] = r1
            java.lang.Class<com.bytedance.android.live.base.model.Extra> r1 = com.bytedance.android.live.base.model.Extra.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 10332(0x285c, float:1.4478E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0043
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r17
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f15803a
            r3 = 0
            r4 = 10332(0x285c, float:1.4478E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r11] = r1
            java.lang.Class<com.bytedance.android.live.base.model.Extra> r1 = com.bytedance.android.live.base.model.Extra.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0043:
            if (r17 == 0) goto L_0x0156
            boolean r0 = r17.isEmpty()
            if (r0 == 0) goto L_0x004d
            goto L_0x0156
        L_0x004d:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            r0 = r17
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r8 = r0.iterator()
        L_0x005a:
            boolean r0 = r8.hasNext()
            r14 = 0
            if (r0 == 0) goto L_0x011f
            java.lang.Object r0 = r8.next()
            r15 = r0
            com.bytedance.android.live.base.model.feed.FeedItem r15 = (com.bytedance.android.live.base.model.feed.FeedItem) r15
            com.bytedance.android.live.base.model.d r0 = r15.item
            if (r0 != 0) goto L_0x00e1
            com.google.gson.Gson r0 = com.bytedance.android.live.a.a()     // Catch:{ Exception -> 0x00e0 }
            com.google.gson.JsonObject r1 = r15.data     // Catch:{ Exception -> 0x00e0 }
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1     // Catch:{ Exception -> 0x00e0 }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r2 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            java.lang.Object r0 = r0.fromJson((com.google.gson.JsonElement) r1, (java.lang.Class<T>) r2)     // Catch:{ Exception -> 0x00e0 }
            com.bytedance.android.live.base.model.d r0 = (com.bytedance.android.live.base.model.d) r0     // Catch:{ Exception -> 0x00e0 }
            r15.item = r0     // Catch:{ Exception -> 0x00e0 }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00e0 }
            r0[r11] = r15     // Catch:{ Exception -> 0x00e0 }
            com.meituan.robust.ChangeQuickRedirect r2 = f15803a     // Catch:{ Exception -> 0x00e0 }
            r3 = 0
            r4 = 10334(0x285e, float:1.4481E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x00e0 }
            java.lang.Class<com.bytedance.android.live.base.model.feed.FeedItem> r1 = com.bytedance.android.live.base.model.feed.FeedItem.class
            r5[r11] = r1     // Catch:{ Exception -> 0x00e0 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00e0 }
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00e0 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00e0 }
            r0[r11] = r15     // Catch:{ Exception -> 0x00e0 }
            com.meituan.robust.ChangeQuickRedirect r2 = f15803a     // Catch:{ Exception -> 0x00e0 }
            r3 = 0
            r4 = 10334(0x285e, float:1.4481E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x00e0 }
            java.lang.Class<com.bytedance.android.live.base.model.feed.FeedItem> r1 = com.bytedance.android.live.base.model.feed.FeedItem.class
            r5[r11] = r1     // Catch:{ Exception -> 0x00e0 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00e0 }
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00e1
        L_0x00ae:
            int r0 = r15.type     // Catch:{ Exception -> 0x00e0 }
            if (r0 == r12) goto L_0x00b6
            int r0 = r15.type     // Catch:{ Exception -> 0x00e0 }
            if (r0 != r10) goto L_0x00e1
        L_0x00b6:
            com.bytedance.android.live.base.model.d r0 = r15.item     // Catch:{ Exception -> 0x00e0 }
            boolean r0 = r0 instanceof com.bytedance.android.livesdkapi.depend.model.live.Room     // Catch:{ Exception -> 0x00e0 }
            if (r0 == 0) goto L_0x00e1
            com.bytedance.android.live.base.model.d r0 = r15.item     // Catch:{ Exception -> 0x00e0 }
            if (r0 == 0) goto L_0x00d8
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r1 = r15.logPb     // Catch:{ Exception -> 0x00e0 }
            r0.setLog_pb(r1)     // Catch:{ Exception -> 0x00e0 }
            com.bytedance.android.live.base.model.user.User r1 = r0.getOwner()     // Catch:{ Exception -> 0x00e0 }
            if (r1 == 0) goto L_0x00d2
            java.lang.String r2 = r15.logPb     // Catch:{ Exception -> 0x00e0 }
            r1.setLogPb(r2)     // Catch:{ Exception -> 0x00e0 }
        L_0x00d2:
            java.lang.String r1 = r15.resId     // Catch:{ Exception -> 0x00e0 }
            r0.setRequestId(r1)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00e1
        L_0x00d8:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r1 = "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00e0 }
            throw r0     // Catch:{ Exception -> 0x00e0 }
        L_0x00e0:
        L_0x00e1:
            com.bytedance.android.live.base.model.d r0 = r15.item
            boolean r1 = r0 instanceof com.bytedance.android.livesdkapi.depend.model.live.Room
            if (r1 != 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r14 = r0
        L_0x00e9:
            com.bytedance.android.livesdkapi.depend.model.live.Room r14 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r14
            if (r14 == 0) goto L_0x005a
            long r0 = r7.l
            com.bytedance.android.live.base.model.user.User r2 = r14.getOwner()
            if (r2 == 0) goto L_0x00ff
            long r2 = r2.getLiveRoomId()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00ff
            goto L_0x005a
        L_0x00ff:
            java.util.ArrayList<com.bytedance.android.livesdkapi.depend.model.live.Room> r0 = r7.h
            r0.add(r14)
            java.util.ArrayList<android.os.Bundle> r0 = r7.i
            android.os.Bundle r1 = com.bytedance.android.livesdkapi.g.a.a(r14)
            r0.add(r1)
            java.util.ArrayList<com.bytedance.android.live.base.model.feed.FeedItem> r0 = r7.f15805b
            r0.add(r15)
            long r0 = r14.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r13.add(r0)
            goto L_0x005a
        L_0x011f:
            java.lang.String r0 = r9.unreadExtra
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x012c
            int r1 = r1.length()
            if (r1 != 0) goto L_0x012d
        L_0x012c:
            r11 = 1
        L_0x012d:
            if (r11 != 0) goto L_0x0130
            r14 = r0
        L_0x0130:
            if (r14 == 0) goto L_0x0155
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.Long>> r0 = r7.k
            java.util.Map r0 = (java.util.Map) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r2 = 95
            r1.append(r2)
            int r2 = r7.o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.put(r1, r13)
            int r0 = r7.o
            int r0 = r0 + r12
            r7.o = r0
            return
        L_0x0155:
            return
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.live.c.a.a(java.util.List, com.bytedance.android.live.base.model.Extra):void");
    }

    public a(@NotNull Bundle bundle, @NotNull String str, @NotNull String str2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bundle, "roomArgs");
        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(str2, "requestFrom");
        this.n = str;
        long j2 = 0;
        this.l = bundle.getLong("live.intent.extra.ROOM_ID", 0);
        Object obj = bundle.get("live.intent.extra.USER_ID");
        obj = obj == null ? bundle.get("anchor_id") : obj;
        if (obj instanceof Long) {
            j2 = ((Number) obj).longValue();
        } else if (obj instanceof String) {
            Long longOrNull = StringsKt.toLongOrNull((String) obj);
            if (longOrNull != null) {
                j2 = longOrNull.longValue();
            }
        }
        this.m = j2;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle2 != null) {
                String conventRequestFrom = FeedDraw.conventRequestFrom(bundle2.getString("enter_from_merge", ""), bundle2.getString("enter_method", ""));
                Intrinsics.checkExpressionValueIsNotNull(conventRequestFrom, "FeedDraw.conventRequestF…RA_LOG_ENTER_METHOD, \"\"))");
                this.f15807d = conventRequestFrom;
            }
        } else {
            this.f15807d = str2;
        }
        this.i.add(bundle);
        ArrayList<Room> arrayList = this.h;
        Room room = new Room();
        room.setId(this.l);
        room.setIdStr(String.valueOf(this.l));
        User user = new User();
        user.setId(this.m);
        user.setIdStr(String.valueOf(this.m));
        room.setOwner(user);
        arrayList.add(room);
        this.f15805b.add(new FeedItem());
    }
}
