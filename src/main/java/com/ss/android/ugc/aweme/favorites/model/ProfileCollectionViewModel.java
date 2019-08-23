package com.ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.j;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.a.e;
import com.ss.android.ugc.aweme.favorites.a.f;
import com.ss.android.ugc.aweme.favorites.a.g;
import com.ss.android.ugc.aweme.favorites.a.i;
import com.ss.android.ugc.aweme.favorites.api.ProfileCollectionJediApi;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.aweme.utils.bg;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J@\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u001a\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010!\u001a\u00020\"H\u0014R3\u0010\u0004\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/model/ProfileCollectionViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/favorites/model/ProfileCollectionState;", "()V", "profileCollectionItemStructMiddleware", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/CommonListMiddleware;", "getProfileCollectionItemStructMiddleware", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "createProfileCollectionItemStruct", "title", "", "count", "", "coverList", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "structType", "", "ids", "defaultState", "mapAwemeData", "response", "Lcom/ss/android/ugc/aweme/favorites/bean/UserCollectionResponse;", "mapChallengeData", "mapGoodsData", "mapMusicData", "mapPoiData", "mapProfileCollectionItemList", "", "mapStickerData", "onStart", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProfileCollectionViewModel extends JediViewModel<ProfileCollectionState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f44284d;

    /* renamed from: f  reason: collision with root package name */
    public static final b f44285f = new b((byte) 0);
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final ListMiddleware<ProfileCollectionState, f, k> f44286e = new ListMiddleware<>(new a(this), null, j.a(), j.b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\u00042\u0006\u0010\t\u001a\u0002H\u0007H\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "it", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/SimpleListMiddlewareKt$SingleListMiddleware$1", "com/bytedance/jedi/arch/ext/list/SimpleListMiddlewareKt$NonPayloadSingleListMiddleware$$inlined$SingleListMiddleware$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<ProfileCollectionState, Observable<Pair<? extends List<? extends f>, ? extends k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ProfileCollectionViewModel this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;", "it", "Lcom/ss/android/ugc/aweme/favorites/bean/UserCollectionResponse;", "apply", "com/ss/android/ugc/aweme/favorites/model/ProfileCollectionViewModel$profileCollectionItemStructMiddleware$1$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.favorites.model.ProfileCollectionViewModel$a$a  reason: collision with other inner class name */
        static final class C0554a<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44289a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f44290b;

            C0554a(a aVar) {
                this.f44290b = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                i iVar = (i) obj;
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f44289a, false, 39504, new Class[]{i.class}, List.class)) {
                    return (List) PatchProxy.accessDispatch(new Object[]{iVar}, this, f44289a, false, 39504, new Class[]{i.class}, List.class);
                }
                Intrinsics.checkParameterIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                ProfileCollectionViewModel profileCollectionViewModel = this.f44290b.this$0;
                if (PatchProxy.isSupport(new Object[]{iVar}, profileCollectionViewModel, ProfileCollectionViewModel.f44284d, false, 39490, new Class[]{i.class}, List.class)) {
                    return (List) PatchProxy.accessDispatch(new Object[]{iVar}, profileCollectionViewModel, ProfileCollectionViewModel.f44284d, false, 39490, new Class[]{i.class}, List.class);
                }
                List arrayList = new ArrayList();
                if (iVar != null && !CollectionUtils.isEmpty(iVar.i)) {
                    bg.a(new ar(39, Integer.valueOf((int) iVar.h)));
                    List<com.ss.android.ugc.aweme.favorites.a.c> list = iVar.i;
                    if (list == null) {
                        Intrinsics.throwNpe();
                    }
                    for (com.ss.android.ugc.aweme.favorites.a.c next : list) {
                        String str = next.f44201c;
                        switch (next.f44200b) {
                            case 1:
                                f a2 = profileCollectionViewModel.a(iVar, str);
                                if (a2 == null) {
                                    break;
                                } else {
                                    arrayList.add(a2);
                                    break;
                                }
                            case 2:
                                f b2 = profileCollectionViewModel.b(iVar, str);
                                if (b2 == null) {
                                    break;
                                } else {
                                    arrayList.add(b2);
                                    break;
                                }
                            case 3:
                                f c2 = profileCollectionViewModel.c(iVar, str);
                                if (c2 == null) {
                                    break;
                                } else {
                                    arrayList.add(c2);
                                    break;
                                }
                            case 4:
                                f d2 = profileCollectionViewModel.d(iVar, str);
                                if (d2 == null) {
                                    break;
                                } else {
                                    arrayList.add(d2);
                                    break;
                                }
                            case 5:
                                f e2 = profileCollectionViewModel.e(iVar, str);
                                if (e2 == null) {
                                    break;
                                } else {
                                    arrayList.add(e2);
                                    break;
                                }
                            case 6:
                                f f2 = profileCollectionViewModel.f(iVar, str);
                                if (f2 == null) {
                                    break;
                                } else {
                                    arrayList.add(f2);
                                    break;
                                }
                        }
                    }
                }
                return arrayList;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ProfileCollectionViewModel profileCollectionViewModel) {
            super(1);
            this.this$0 = profileCollectionViewModel;
        }

        public final Observable<Pair<List<f>, k>> invoke(@NotNull ProfileCollectionState profileCollectionState) {
            ProfileCollectionJediApi profileCollectionJediApi;
            ProfileCollectionState profileCollectionState2 = profileCollectionState;
            if (PatchProxy.isSupport(new Object[]{profileCollectionState2}, this, changeQuickRedirect, false, 39502, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{profileCollectionState2}, this, changeQuickRedirect, false, 39502, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(profileCollectionState2, AdvanceSetting.NETWORK_TYPE);
            ProfileCollectionJediApi.a aVar = ProfileCollectionJediApi.f44266a;
            if (PatchProxy.isSupport(new Object[0], aVar, ProfileCollectionJediApi.a.f44267a, false, 39424, new Class[0], ProfileCollectionJediApi.class)) {
                profileCollectionJediApi = (ProfileCollectionJediApi) PatchProxy.accessDispatch(new Object[0], aVar, ProfileCollectionJediApi.a.f44267a, false, 39424, new Class[0], ProfileCollectionJediApi.class);
            } else {
                Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ProfileCollectionJediApi.class);
                Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…ctionJediApi::class.java)");
                profileCollectionJediApi = (ProfileCollectionJediApi) create;
            }
            Single subscribeOn = Single.fromObservable(profileCollectionJediApi.getProfileCollection().map(new C0554a(this))).subscribeOn(Schedulers.io());
            Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "Single\n                 …scribeOn(Schedulers.io())");
            Single map = subscribeOn.map(AnonymousClass1.f44288b);
            Intrinsics.checkExpressionValueIsNotNull(map, "actualRefresh(state).map { it to null }");
            Observable<Pair<List<f>, k>> observable = map.toObservable();
            Intrinsics.checkExpressionValueIsNotNull(observable, "actualRefresh(it).toObservable()");
            return observable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/model/ProfileCollectionViewModel$Companion;", "", "()V", "COLLECTION_TYPE_AWEME", "", "COLLECTION_TYPE_CHALLENGE", "COLLECTION_TYPE_GOODS", "COLLECTION_TYPE_MUSIC", "COLLECTION_TYPE_POI", "COLLECTION_TYPE_STICKER", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/favorites/model/ProfileCollectionState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function2<ProfileCollectionState, ListState<f, k>, ProfileCollectionState> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(2);
        }

        @NotNull
        public final ProfileCollectionState invoke(@NotNull ProfileCollectionState profileCollectionState, @NotNull ListState<f, k> listState) {
            ProfileCollectionState profileCollectionState2 = profileCollectionState;
            ListState<f, k> listState2 = listState;
            if (PatchProxy.isSupport(new Object[]{profileCollectionState2, listState2}, this, changeQuickRedirect, false, 39508, new Class[]{ProfileCollectionState.class, ListState.class}, ProfileCollectionState.class)) {
                return (ProfileCollectionState) PatchProxy.accessDispatch(new Object[]{profileCollectionState2, listState2}, this, changeQuickRedirect, false, 39508, new Class[]{ProfileCollectionState.class, ListState.class}, ProfileCollectionState.class);
            }
            Intrinsics.checkParameterIsNotNull(profileCollectionState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState2, AdvanceSetting.NETWORK_TYPE);
            return profileCollectionState.copy(listState);
        }
    }

    public final /* synthetic */ x c() {
        ProfileCollectionState profileCollectionState;
        if (PatchProxy.isSupport(new Object[0], this, f44284d, false, 39498, new Class[0], ProfileCollectionState.class)) {
            profileCollectionState = (ProfileCollectionState) PatchProxy.accessDispatch(new Object[0], this, f44284d, false, 39498, new Class[0], ProfileCollectionState.class);
        } else {
            profileCollectionState = new ProfileCollectionState(null, 1, null);
        }
        return profileCollectionState;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f44284d, false, 39499, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44284d, false, 39499, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.f44286e.a(e.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) c.INSTANCE);
        a(this.f44286e);
    }

    /* access modifiers changed from: package-private */
    public final f b(i iVar, String str) {
        long j;
        List<Aweme> list;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2, str}, this, f44284d, false, 39492, new Class[]{i.class, String.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{iVar2, str}, this, f44284d, false, 39492, new Class[]{i.class, String.class}, f.class);
        }
        com.ss.android.ugc.aweme.favorites.a.a aVar = iVar2.f44222c;
        if (aVar != null) {
            j = aVar.f44194b;
        } else {
            j = 0;
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        com.ss.android.ugc.aweme.favorites.a.a aVar2 = iVar2.f44222c;
        List<Aweme> list2 = null;
        if (aVar2 != null) {
            list = aVar2.f44195c;
        } else {
            list = null;
        }
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        com.ss.android.ugc.aweme.favorites.a.a aVar3 = iVar2.f44222c;
        if (aVar3 != null) {
            list2 = aVar3.f44195c;
        }
        if (list2 == null) {
            Intrinsics.throwNpe();
        }
        for (Aweme next : list2) {
            arrayList2.add(next.getAid());
            if (next.getVideo() != null) {
                Video video = next.getVideo();
                Intrinsics.checkExpressionValueIsNotNull(video, "aweme.video");
                arrayList.add(video.getCover());
            } else {
                List<ImageInfo> imageInfos = next.getImageInfos();
                if (!CollectionUtils.isEmpty(imageInfos)) {
                    ImageInfo imageInfo = imageInfos.get(0);
                    Intrinsics.checkExpressionValueIsNotNull(imageInfo, "imageInfos[0]");
                    arrayList.add(imageInfo.getLabelThumb());
                }
            }
        }
        return a(str, j, arrayList, 2, arrayList2);
    }

    /* access modifiers changed from: package-private */
    public final f c(i iVar, String str) {
        long j;
        List<Challenge> list;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2, str}, this, f44284d, false, 39493, new Class[]{i.class, String.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{iVar2, str}, this, f44284d, false, 39493, new Class[]{i.class, String.class}, f.class);
        }
        com.ss.android.ugc.aweme.favorites.a.b bVar = iVar2.f44224e;
        if (bVar != null) {
            j = bVar.f44197b;
        } else {
            j = 0;
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        com.ss.android.ugc.aweme.favorites.a.b bVar2 = iVar2.f44224e;
        List<Challenge> list2 = null;
        if (bVar2 != null) {
            list = bVar2.f44198c;
        } else {
            list = null;
        }
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        com.ss.android.ugc.aweme.favorites.a.b bVar3 = iVar2.f44224e;
        if (bVar3 != null) {
            list2 = bVar3.f44198c;
        }
        if (list2 == null) {
            Intrinsics.throwNpe();
        }
        for (Challenge next : list2) {
            arrayList2.add(next.getCid());
            arrayList.add(next.getCoverItem());
        }
        return a(str, j, arrayList, 3, arrayList2);
    }

    /* access modifiers changed from: package-private */
    public final f d(i iVar, String str) {
        long j;
        List<PoiStruct> list;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2, str}, this, f44284d, false, 39494, new Class[]{i.class, String.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{iVar2, str}, this, f44284d, false, 39494, new Class[]{i.class, String.class}, f.class);
        }
        e eVar = iVar2.f44221b;
        if (eVar != null) {
            j = eVar.f44206b;
        } else {
            j = 0;
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        e eVar2 = iVar2.f44221b;
        List<PoiStruct> list2 = null;
        if (eVar2 != null) {
            list = eVar2.f44207c;
        } else {
            list = null;
        }
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        e eVar3 = iVar2.f44221b;
        if (eVar3 != null) {
            list2 = eVar3.f44207c;
        }
        if (list2 == null) {
            Intrinsics.throwNpe();
        }
        for (PoiStruct next : list2) {
            arrayList2.add(next.poiId);
            arrayList.add(next.coverItem);
        }
        return a(str, j, arrayList, 4, arrayList2);
    }

    /* access modifiers changed from: package-private */
    public final f e(i iVar, String str) {
        long j;
        List<d> list;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2, str}, this, f44284d, false, 39495, new Class[]{i.class, String.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{iVar2, str}, this, f44284d, false, 39495, new Class[]{i.class, String.class}, f.class);
        }
        g gVar = iVar2.f44225f;
        if (gVar != null) {
            j = gVar.f44215b;
        } else {
            j = 0;
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        g gVar2 = iVar2.f44225f;
        List<d> list2 = null;
        if (gVar2 != null) {
            list = gVar2.f44216c;
        } else {
            list = null;
        }
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        g gVar3 = iVar2.f44225f;
        if (gVar3 != null) {
            list2 = gVar3.f44216c;
        }
        if (list2 == null) {
            Intrinsics.throwNpe();
        }
        for (d next : list2) {
            arrayList2.add(next.id);
            arrayList.add(next.iconUrl);
        }
        return a(str, j, arrayList, 5, arrayList2);
    }

    /* access modifiers changed from: package-private */
    public final f f(i iVar, String str) {
        long j;
        List<com.ss.android.ugc.aweme.favorites.a.k> list;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2, str}, this, f44284d, false, 39496, new Class[]{i.class, String.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{iVar2, str}, this, f44284d, false, 39496, new Class[]{i.class, String.class}, f.class);
        }
        com.ss.android.ugc.aweme.favorites.a.j jVar = iVar2.g;
        if (jVar != null) {
            j = jVar.f44227b;
        } else {
            j = 0;
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        com.ss.android.ugc.aweme.favorites.a.j jVar2 = iVar2.g;
        List<com.ss.android.ugc.aweme.favorites.a.k> list2 = null;
        if (jVar2 != null) {
            list = jVar2.f44228c;
        } else {
            list = null;
        }
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        com.ss.android.ugc.aweme.favorites.a.j jVar3 = iVar2.g;
        if (jVar3 != null) {
            list2 = jVar3.f44228c;
        }
        if (list2 == null) {
            Intrinsics.throwNpe();
        }
        for (com.ss.android.ugc.aweme.favorites.a.k next : list2) {
            arrayList2.add(next.f44231c);
            arrayList.add(next.f44234f);
        }
        return a(str, j, arrayList, 6, arrayList2);
    }

    /* access modifiers changed from: package-private */
    public final f a(i iVar, String str) {
        long j;
        List<Music> list;
        List<Music> list2;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2, str}, this, f44284d, false, 39491, new Class[]{i.class, String.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{iVar2, str}, this, f44284d, false, 39491, new Class[]{i.class, String.class}, f.class);
        }
        com.ss.android.ugc.aweme.favorites.a.d dVar = iVar2.f44223d;
        if (dVar != null) {
            j = dVar.f44203b;
        } else {
            j = 0;
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        com.ss.android.ugc.aweme.favorites.a.d dVar2 = iVar2.f44223d;
        if (dVar2 != null) {
            list = dVar2.f44204c;
        } else {
            list = null;
        }
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        com.ss.android.ugc.aweme.favorites.a.d dVar3 = iVar2.f44223d;
        if (dVar3 != null) {
            list2 = dVar3.f44204c;
        } else {
            list2 = null;
        }
        if (list2 == null) {
            Intrinsics.throwNpe();
        }
        for (Music next : list2) {
            arrayList2.add(String.valueOf(next.getId()));
            if (next.getCoverMedium() != null) {
                UrlModel coverMedium = next.getCoverMedium();
                Intrinsics.checkExpressionValueIsNotNull(coverMedium, "music.coverMedium");
                if (coverMedium.getUrlList() != null) {
                    UrlModel coverMedium2 = next.getCoverMedium();
                    Intrinsics.checkExpressionValueIsNotNull(coverMedium2, "music.coverMedium");
                    if (coverMedium2.getUrlList().size() > 0) {
                        arrayList.add(next.getCoverMedium());
                    }
                }
            }
            if (next.getCoverThumb() != null) {
                UrlModel coverThumb = next.getCoverThumb();
                Intrinsics.checkExpressionValueIsNotNull(coverThumb, "music.coverThumb");
                if (coverThumb.getUrlList() != null) {
                    UrlModel coverThumb2 = next.getCoverThumb();
                    Intrinsics.checkExpressionValueIsNotNull(coverThumb2, "music.coverThumb");
                    if (coverThumb2.getUrlList().size() > 0) {
                        arrayList.add(next.getCoverThumb());
                    }
                }
            }
            if (next.getCoverLarge() != null) {
                UrlModel coverLarge = next.getCoverLarge();
                Intrinsics.checkExpressionValueIsNotNull(coverLarge, "music.coverLarge");
                if (coverLarge.getUrlList() != null) {
                    UrlModel coverLarge2 = next.getCoverLarge();
                    Intrinsics.checkExpressionValueIsNotNull(coverLarge2, "music.coverLarge");
                    if (coverLarge2.getUrlList().size() > 0) {
                        arrayList.add(next.getCoverLarge());
                    }
                }
            }
            arrayList.add(null);
        }
        return a(str, j, arrayList, 1, arrayList2);
    }

    private final f a(String str, long j, List<UrlModel> list, int i, List<String> list2) {
        String str2 = str;
        long j2 = j;
        List<UrlModel> list3 = list;
        List<String> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2), list3, Integer.valueOf(i), list4}, this, f44284d, false, 39497, new Class[]{String.class, Long.TYPE, List.class, Integer.TYPE, List.class}, f.class)) {
            Object[] objArr = {str2, new Long(j2), list3, Integer.valueOf(i), list4};
            return (f) PatchProxy.accessDispatch(objArr, this, f44284d, false, 39497, new Class[]{String.class, Long.TYPE, List.class, Integer.TYPE, List.class}, f.class);
        }
        f fVar = new f();
        fVar.a(str2);
        fVar.f44210c = j2;
        fVar.a(list3);
        fVar.f44212e = i;
        fVar.b(list4);
        return fVar;
    }
}
