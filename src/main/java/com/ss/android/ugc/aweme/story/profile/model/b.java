package com.ss.android.ugc.aweme.story.profile.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.story.api.model.e;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.profile.model.AllStoryApi;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u0010\u0010\u0019\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryPresenter;", "", "view", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/story/profile/model/LifeStoryItem;", "(Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;)V", "LOAD_COUNT", "", "api", "Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryApi;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "loadMoreParams", "Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryLoadMoreParams;", "formatStoryList", "", "t", "Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryResponse;", "isHasMore", "", "loadMoreList", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "onDestroy", "refreshList", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73287a;

    /* renamed from: b  reason: collision with root package name */
    public final AllStoryApi f73288b;

    /* renamed from: c  reason: collision with root package name */
    public final CompositeDisposable f73289c;

    /* renamed from: d  reason: collision with root package name */
    public a f73290d;

    /* renamed from: e  reason: collision with root package name */
    public final int f73291e;

    /* renamed from: f  reason: collision with root package name */
    public final c<LifeStoryItem> f73292f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/story/profile/model/AllStoryPresenter$loadMoreList$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryResponse;", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Observer<AllStoryResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73293a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f73294b;

        public final void onComplete() {
        }

        public a(b bVar) {
            this.f73294b = bVar;
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f73293a, false, 84897, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f73293a, false, 84897, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
            this.f73294b.f73292f.c(new Exception(th2));
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            if (PatchProxy.isSupport(new Object[]{disposable}, this, f73293a, false, 84895, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable}, this, f73293a, false, 84895, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable, "d");
            this.f73294b.f73289c.add(disposable);
            this.f73294b.f73292f.s_();
        }

        public final /* synthetic */ void onNext(Object obj) {
            AllStoryResponse allStoryResponse = (AllStoryResponse) obj;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{allStoryResponse}, this, f73293a, false, 84896, new Class[]{AllStoryResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{allStoryResponse}, this, f73293a, false, 84896, new Class[]{AllStoryResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(allStoryResponse, "t");
            List<e> dailyStoryList = allStoryResponse.getDailyStoryList();
            if (dailyStoryList != null) {
                for (e a2 : dailyStoryList) {
                    g.f72503b.a(a2, allStoryResponse.getLogpb());
                }
            }
            this.f73294b.f73290d = new a(allStoryResponse.getCursor(), allStoryResponse.getHasMore());
            List<LifeStoryItem> a3 = this.f73294b.a(allStoryResponse);
            c<LifeStoryItem> cVar = this.f73294b.f73292f;
            if (allStoryResponse.getHasMore() != 1) {
                z = false;
            }
            cVar.b(a3, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/story/profile/model/AllStoryPresenter$refreshList$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryResponse;", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.story.profile.model.b$b  reason: collision with other inner class name */
    public static final class C0761b implements Observer<AllStoryResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f73296b;

        public final void onComplete() {
        }

        C0761b(b bVar) {
            this.f73296b = bVar;
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f73295a, false, 84900, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f73295a, false, 84900, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
            this.f73296b.f73292f.b(new Exception(th2));
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            if (PatchProxy.isSupport(new Object[]{disposable}, this, f73295a, false, 84898, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable}, this, f73295a, false, 84898, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable, "d");
            this.f73296b.f73289c.add(disposable);
            this.f73296b.f73292f.n_();
        }

        public final /* synthetic */ void onNext(Object obj) {
            AllStoryResponse allStoryResponse = (AllStoryResponse) obj;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{allStoryResponse}, this, f73295a, false, 84899, new Class[]{AllStoryResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{allStoryResponse}, this, f73295a, false, 84899, new Class[]{AllStoryResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(allStoryResponse, "t");
            List<e> dailyStoryList = allStoryResponse.getDailyStoryList();
            if (dailyStoryList != null) {
                for (e a2 : dailyStoryList) {
                    g.f72503b.a(a2, allStoryResponse.getLogpb());
                }
            }
            this.f73296b.f73290d = new a(allStoryResponse.getCursor(), allStoryResponse.getHasMore());
            ArrayList arrayList = new ArrayList(this.f73296b.a(allStoryResponse));
            c<LifeStoryItem> cVar = this.f73296b.f73292f;
            List list = arrayList;
            if (allStoryResponse.getHasMore() != 1) {
                z = false;
            }
            cVar.a(list, z);
        }
    }

    public b(@NotNull c<LifeStoryItem> cVar) {
        AllStoryApi allStoryApi;
        Intrinsics.checkParameterIsNotNull(cVar, "view");
        this.f73292f = cVar;
        AllStoryApi.a aVar = AllStoryApi.f73278a;
        if (PatchProxy.isSupport(new Object[0], aVar, AllStoryApi.a.f73279a, false, 84888, new Class[0], AllStoryApi.class)) {
            allStoryApi = (AllStoryApi) PatchProxy.accessDispatch(new Object[0], aVar, AllStoryApi.a.f73279a, false, 84888, new Class[0], AllStoryApi.class);
        } else {
            Object create = AllStoryApi.a.f73281c.createNewRetrofit(AllStoryApi.a.f73280b).create(AllStoryApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "retrofitService.createNe…(AllStoryApi::class.java)");
            allStoryApi = (AllStoryApi) create;
        }
        this.f73288b = allStoryApi;
        this.f73289c = new CompositeDisposable();
        this.f73290d = new a(0, 0);
        this.f73291e = 30;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        if (r1 == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.profile.model.User r14) {
        /*
            r13 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f73287a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 84891(0x14b9b, float:1.18958E-40)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f73287a
            r3 = 0
            r4 = 84891(0x14b9b, float:1.18958E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            com.ss.android.ugc.aweme.story.profile.model.AllStoryApi r0 = r13.f73288b
            if (r14 == 0) goto L_0x003f
            java.lang.String r1 = r14.getUid()
            if (r1 != 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r8 = r1
            goto L_0x0042
        L_0x003f:
            java.lang.String r1 = ""
            goto L_0x003d
        L_0x0042:
            r9 = 0
            int r11 = r13.f73291e
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.lang.String r2 = "TimeZone.getDefault()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r12 = r1.getID()
            java.lang.String r1 = "TimeZone.getDefault().id"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r1)
            r7 = r0
            io.reactivex.Observable r0 = r7.getAllStory(r8, r9, r11, r12)
            io.reactivex.Scheduler r1 = io.reactivex.schedulers.Schedulers.io()
            io.reactivex.Observable r0 = r0.subscribeOn(r1)
            io.reactivex.Scheduler r1 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r0 = r0.observeOn(r1)
            com.ss.android.ugc.aweme.story.profile.model.b$b r1 = new com.ss.android.ugc.aweme.story.profile.model.b$b
            r1.<init>(r13)
            io.reactivex.Observer r1 = (io.reactivex.Observer) r1
            r0.subscribe((io.reactivex.Observer<? super T>) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.model.b.a(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final List<LifeStoryItem> a(AllStoryResponse allStoryResponse) {
        if (PatchProxy.isSupport(new Object[]{allStoryResponse}, this, f73287a, false, 84893, new Class[]{AllStoryResponse.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{allStoryResponse}, this, f73287a, false, 84893, new Class[]{AllStoryResponse.class}, List.class);
        }
        List<e> dailyStoryList = allStoryResponse.getDailyStoryList();
        if (dailyStoryList == null) {
            return CollectionsKt.emptyList();
        }
        Collection arrayList = new ArrayList();
        for (e eVar : dailyStoryList) {
            List<com.ss.android.ugc.aweme.story.api.model.b> storyList = eVar.getStoryList();
            Intrinsics.checkExpressionValueIsNotNull(storyList, "dailyStory.storyList");
            Iterable<com.ss.android.ugc.aweme.story.api.model.b> iterable = storyList;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (com.ss.android.ugc.aweme.story.api.model.b lifeStoryItem : iterable) {
                arrayList2.add(new LifeStoryItem(eVar.getDate(), lifeStoryItem));
            }
            CollectionsKt.addAll(arrayList, (Iterable<? extends T>) (List) arrayList2);
        }
        return (List) arrayList;
    }
}
