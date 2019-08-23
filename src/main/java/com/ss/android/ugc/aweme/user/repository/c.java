package com.ss.android.ugc.aweme.user.repository;

import android.arch.lifecycle.Observer;
import com.bytedance.jedi.model.c.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.b.d;
import com.ss.android.ugc.aweme.story.api.i;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.bg;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\tH\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/JediUserBridge;", "", "()V", "bridgeUserMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "followObserver", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "storyReadObserver", "Lcom/ss/android/ugc/aweme/story/api/userstory/UserStoryReadState;", "diffUser", "", "old", "new", "postFollowStatus", "followStatus", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75370a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, User> f75371b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final Observer<FollowStatus> f75372c = new a(this);

    /* renamed from: d  reason: collision with root package name */
    private final Observer<d> f75373d = new b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<FollowStatus> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75376a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f75377b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "optional", "Lcom/bytedance/jedi/model/datasource/Optional;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "kotlin.jvm.PlatformType", "accept", "com/ss/android/ugc/aweme/user/repository/JediUserBridge$followObserver$1$1$1$1", "com/ss/android/ugc/aweme/user/repository/JediUserBridge$followObserver$1$$special$$inlined$let$lambda$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.user.repository.c$a$a  reason: collision with other inner class name */
        static final class C0790a<T> implements Consumer<f<? extends User>> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75378a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FollowStatus f75379b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f75380c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ FollowStatus f75381d;

            C0790a(FollowStatus followStatus, a aVar, FollowStatus followStatus2) {
                this.f75379b = followStatus;
                this.f75380c = aVar;
                this.f75381d = followStatus2;
            }

            public final /* synthetic */ void accept(Object obj) {
                f fVar = (f) obj;
                if (PatchProxy.isSupport(new Object[]{fVar}, this, f75378a, false, 87665, new Class[]{f.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fVar}, this, f75378a, false, 87665, new Class[]{f.class}, Void.TYPE);
                    return;
                }
                User user = (User) fVar.a();
                if (user != null) {
                    User clone = user.clone();
                    if (clone != null) {
                        Intrinsics.checkExpressionValueIsNotNull(clone, AllStoryActivity.f73306b);
                        int followStatus = clone.getFollowStatus();
                        FollowStatus followStatus2 = this.f75379b;
                        Intrinsics.checkExpressionValueIsNotNull(followStatus2, "this");
                        if (followStatus != followStatus2.followStatus) {
                            FollowStatus followStatus3 = this.f75379b;
                            Intrinsics.checkExpressionValueIsNotNull(followStatus3, "this");
                            clone.setFollowStatus(followStatus3.followStatus);
                            String uid = clone.getUid();
                            Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
                            this.f75380c.f75377b.f75371b.put(uid, clone);
                            g a2 = com.ss.android.ugc.aweme.base.arch.b.a();
                            String uid2 = clone.getUid();
                            Intrinsics.checkExpressionValueIsNotNull(uid2, "user.uid");
                            a2.a(uid2, clone);
                        }
                    }
                }
            }
        }

        a(c cVar) {
            this.f75377b = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            FollowStatus followStatus = (FollowStatus) obj;
            if (PatchProxy.isSupport(new Object[]{followStatus}, this, f75376a, false, 87664, new Class[]{FollowStatus.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{followStatus}, this, f75376a, false, 87664, new Class[]{FollowStatus.class}, Void.TYPE);
                return;
            }
            if (followStatus != null) {
                String str = followStatus.userId;
                if (str != null) {
                    com.ss.android.ugc.aweme.base.arch.b.a().a(str).subscribe((Consumer<? super T>) new C0790a<Object>(followStatus, this, followStatus));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/ugc/aweme/story/api/userstory/UserStoryReadState;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<d> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75382a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f75383b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "optional", "Lcom/bytedance/jedi/model/datasource/Optional;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "kotlin.jvm.PlatformType", "accept", "com/ss/android/ugc/aweme/user/repository/JediUserBridge$storyReadObserver$1$1$1"}, k = 3, mv = {1, 1, 15})
        static final class a<T> implements Consumer<f<? extends User>> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75384a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f75385b;

            a(b bVar) {
                this.f75385b = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                f fVar = (f) obj;
                if (PatchProxy.isSupport(new Object[]{fVar}, this, f75384a, false, 87667, new Class[]{f.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fVar}, this, f75384a, false, 87667, new Class[]{f.class}, Void.TYPE);
                    return;
                }
                User user = (User) fVar.a();
                if (user != null) {
                    User clone = user.clone();
                    if (clone != null) {
                        Intrinsics.checkExpressionValueIsNotNull(clone, AllStoryActivity.f73306b);
                        clone.setHasUnreadStory(false);
                        String uid = clone.getUid();
                        Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
                        this.f75385b.f75383b.f75371b.put(uid, clone);
                        g a2 = com.ss.android.ugc.aweme.base.arch.b.a();
                        String uid2 = clone.getUid();
                        Intrinsics.checkExpressionValueIsNotNull(uid2, "user.uid");
                        a2.a(uid2, clone);
                        return;
                    }
                }
            }
        }

        b(c cVar) {
            this.f75383b = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            d dVar = (d) obj;
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f75382a, false, 87666, new Class[]{d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f75382a, false, 87666, new Class[]{d.class}, Void.TYPE);
            } else if (dVar != null) {
                if (dVar.f71832b) {
                    g a2 = com.ss.android.ugc.aweme.base.arch.b.a();
                    String str = dVar.f71831a;
                    Intrinsics.checkExpressionValueIsNotNull(str, "this.userId");
                    a2.a(str).subscribe((Consumer<? super T>) new a<Object>(this));
                }
            }
        }
    }

    public c() {
        Observable observable;
        com.ss.android.ugc.aweme.base.livedata.a.a().a("#FollowStatus", FollowStatus.class).observeForever(this.f75372c);
        if (!com.ss.android.g.a.a()) {
            ((i) ServiceManager.get().getService(i.class)).b().observeForever(this.f75373d);
        }
        h b2 = com.ss.android.ugc.aweme.base.arch.b.b();
        if (PatchProxy.isSupport(new Object[0], b2, h.f75392a, false, 87684, new Class[0], Observable.class)) {
            observable = (Observable) PatchProxy.accessDispatch(new Object[0], b2, h.f75392a, false, 87684, new Class[0], Observable.class);
        } else {
            observable = b2.f75394c.a().a(true);
        }
        observable.observeOn(Schedulers.single()).subscribe((Consumer<? super T>) new Consumer<List<? extends Pair<? extends String, ? extends User>>>(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75374a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f75375b;

            {
                this.f75375b = r1;
            }

            public final /* synthetic */ void accept(Object obj) {
                List<Pair> list = (List) obj;
                if (PatchProxy.isSupport(new Object[]{list}, this, f75374a, false, 87663, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list}, this, f75374a, false, 87663, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkExpressionValueIsNotNull(list, "pairList");
                for (Pair pair : list) {
                    c cVar = this.f75375b;
                    User user = this.f75375b.f75371b.get(pair.getFirst());
                    User user2 = (User) pair.getSecond();
                    if (PatchProxy.isSupport(new Object[]{user, user2}, cVar, c.f75370a, false, 87661, new Class[]{User.class, User.class}, Void.TYPE)) {
                        c cVar2 = cVar;
                        PatchProxy.accessDispatch(new Object[]{user, user2}, cVar2, c.f75370a, false, 87661, new Class[]{User.class, User.class}, Void.TYPE);
                    } else if (!(user == null || user2 == null || user.getFollowStatus() == user2.getFollowStatus())) {
                        FollowStatus followStatus = new FollowStatus(user2.getUid(), user2.getFollowStatus());
                        if (PatchProxy.isSupport(new Object[]{followStatus}, cVar, c.f75370a, false, 87662, new Class[]{FollowStatus.class}, Void.TYPE)) {
                            c cVar3 = cVar;
                            PatchProxy.accessDispatch(new Object[]{followStatus}, cVar3, c.f75370a, false, 87662, new Class[]{FollowStatus.class}, Void.TYPE);
                        } else {
                            bg.a(followStatus);
                            com.ss.android.ugc.aweme.base.livedata.a.a().a("#FollowStatus", FollowStatus.class).postValue(followStatus);
                        }
                        com.ss.android.ugc.aweme.im.b.a().updateIMUserFollowStatus(com.ss.android.ugc.aweme.im.b.a(user2));
                    }
                    this.f75375b.f75371b.put(pair.getFirst(), pair.getSecond());
                }
            }
        });
    }
}
