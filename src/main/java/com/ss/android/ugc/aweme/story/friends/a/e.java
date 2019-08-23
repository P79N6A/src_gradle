package com.ss.android.ugc.aweme.story.friends.a;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.a.b.m;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.model.b;
import com.ss.android.ugc.aweme.story.player.c;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/util/PreloadUtils;", "", "()V", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73054a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final int f73055b = 5;

    /* renamed from: c  reason: collision with root package name */
    public static final a f73056c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0002J(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/util/PreloadUtils$Companion;", "", "()V", "ENTER_PRELOAD_STORY_COUNT", "", "getENTER_PRELOAD_STORY_COUNT", "()I", "buildIds", "", "ids", "", "getPreloadStoryIds", "userStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "startPos", "endPos", "isLoadedDataEnough", "", "enterPos", "isPreloaded", "preloadUserStory", "", "data", "callBack", "Lcom/ss/android/ugc/aweme/story/friends/util/PreloadCallBack;", "preloadVideo", "awemeWithComment", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73057a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"com/ss/android/ugc/aweme/story/friends/util/PreloadUtils$Companion$preloadUserStory$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeOneUserModel;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "onComplete", "", "onError", "e", "", "onNext", "lifeOneUserModel", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.story.friends.a.e$a$a  reason: collision with other inner class name */
        public static final class C0759a implements Observer<b> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73058a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f73059b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ UserStory f73060c;

            /* renamed from: d  reason: collision with root package name */
            private final CompositeDisposable f73061d = new CompositeDisposable();

            public final void onComplete() {
                if (PatchProxy.isSupport(new Object[0], this, f73058a, false, 84645, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f73058a, false, 84645, new Class[0], Void.TYPE);
                    return;
                }
                this.f73061d.dispose();
            }

            public final void onError(@NotNull Throwable th) {
                if (PatchProxy.isSupport(new Object[]{th}, this, f73058a, false, 84648, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f73058a, false, 84648, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(th, "e");
                if (this.f73059b != null) {
                    this.f73059b.a();
                }
            }

            public final /* synthetic */ void onNext(Object obj) {
                b bVar = (b) obj;
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f73058a, false, 84647, new Class[]{b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f73058a, false, 84647, new Class[]{b.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(bVar, "lifeOneUserModel");
                if (bVar.getUserStory() == null) {
                    onError(new Exception());
                    return;
                }
                if (this.f73059b != null) {
                    this.f73059b.a(this.f73060c);
                }
            }

            public final void onSubscribe(@NotNull Disposable disposable) {
                Disposable disposable2 = disposable;
                if (PatchProxy.isSupport(new Object[]{disposable2}, this, f73058a, false, 84646, new Class[]{Disposable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{disposable2}, this, f73058a, false, 84646, new Class[]{Disposable.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(disposable2, "d");
                this.f73061d.add(disposable2);
            }

            C0759a(d dVar, UserStory userStory) {
                this.f73059b = dVar;
                this.f73060c = userStory;
            }
        }

        private a() {
        }

        private static int a() {
            return e.f73055b;
        }

        public final boolean a(@Nullable UserStory userStory) {
            UserStory userStory2 = userStory;
            if (PatchProxy.isSupport(new Object[]{userStory2}, this, f73057a, false, 84639, new Class[]{UserStory.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory2}, this, f73057a, false, 84639, new Class[]{UserStory.class}, Boolean.TYPE)).booleanValue();
            }
            if (userStory2 != null) {
                List<com.ss.android.ugc.aweme.story.api.model.b> awemeList = userStory.getAwemeList();
                if (awemeList == null || awemeList.isEmpty()) {
                    return true;
                }
                if (g.f72503b.d(userStory2)) {
                    return e.f73056c.a(userStory2, 0);
                }
                g.a aVar = g.f72503b;
                List<com.ss.android.ugc.aweme.story.api.model.b> awemeList2 = userStory.getAwemeList();
                Intrinsics.checkExpressionValueIsNotNull(awemeList2, "userStory.awemeList");
                return e.f73056c.a(userStory2, aVar.a(awemeList2));
            }
            return true;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(@Nullable com.ss.android.ugc.aweme.story.api.model.b bVar) {
            com.ss.android.ugc.aweme.story.api.model.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f73057a, false, 84644, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f73057a, false, 84644, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
                return;
            }
            if (bVar2 != null && bVar.getAwemeType() == 14) {
                Video e2 = g.f72503b.e(bVar2);
                if (e2 != null) {
                    VideoUrlModel properPlayAddr = e2.getProperPlayAddr();
                    if (properPlayAddr != null) {
                        properPlayAddr.setSourceId(g.f72503b.c(bVar2));
                    }
                    c.d().a(e2);
                }
            }
        }

        private final String a(List<String> list) {
            int i;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{list}, this, f73057a, false, 84642, new Class[]{List.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{list}, this, f73057a, false, 84642, new Class[]{List.class}, String.class);
            }
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (i == 0) {
                return "";
            }
            String str = "";
            if (list == null) {
                Intrinsics.throwNpe();
            }
            for (String str2 : list) {
                if (i2 == i - 1) {
                    str = str + str2;
                } else {
                    str = str + str2 + ',';
                }
                i2++;
            }
            return str;
        }

        private final boolean a(UserStory userStory, int i) {
            if (PatchProxy.isSupport(new Object[]{userStory, Integer.valueOf(i)}, this, f73057a, false, 84640, new Class[]{UserStory.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory, Integer.valueOf(i)}, this, f73057a, false, 84640, new Class[]{UserStory.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            int size = userStory.getAwemeList().size();
            int min = Math.min(size - 1, Math.max(0, i - 2));
            int min2 = Math.min(size, a() + min) - 1;
            if (min <= min2) {
                while (true) {
                    com.ss.android.ugc.aweme.story.api.model.b bVar = userStory.getAwemeList().get(min);
                    if (bVar == null || bVar.getAwemeType() != 10001) {
                        if (min == min2) {
                            break;
                        }
                        min++;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }

        public final void a(@NotNull UserStory userStory, @Nullable d dVar) {
            int i;
            UserStory userStory2 = userStory;
            d dVar2 = dVar;
            if (PatchProxy.isSupport(new Object[]{userStory2, dVar2}, this, f73057a, false, 84641, new Class[]{UserStory.class, d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStory2, dVar2}, this, f73057a, false, 84641, new Class[]{UserStory.class, d.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(userStory2, "data");
            if (g.f72503b.d(userStory2)) {
                i = 0;
            } else {
                g.a aVar = g.f72503b;
                List<com.ss.android.ugc.aweme.story.api.model.b> awemeList = userStory.getAwemeList();
                Intrinsics.checkExpressionValueIsNotNull(awemeList, "data.awemeList");
                i = aVar.a(awemeList);
            }
            int size = userStory.getAwemeList().size();
            int min = Math.min(size, Math.max(0, i - 2));
            int min2 = Math.min(size, a() + min);
            a aVar2 = this;
            List<String> a2 = aVar2.a(userStory2, min, min2);
            if (CollectionUtils.isEmpty(a2)) {
                dVar.a();
                return;
            }
            m a3 = com.ss.android.ugc.aweme.story.a.a.a();
            User user = userStory.getUser();
            Intrinsics.checkExpressionValueIsNotNull(user, "data.user");
            String uid = user.getUid();
            Intrinsics.checkExpressionValueIsNotNull(uid, "data.user.uid");
            m.a(a3, uid, aVar2.a(a2), 3, 0, min, min2, 8).toObservable().observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new C0759a<Object>(dVar2, userStory2));
        }

        private final List<String> a(UserStory userStory, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{userStory, Integer.valueOf(i), Integer.valueOf(i2)}, this, f73057a, false, 84643, new Class[]{UserStory.class, Integer.TYPE, Integer.TYPE}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{userStory, Integer.valueOf(i), Integer.valueOf(i2)}, this, f73057a, false, 84643, new Class[]{UserStory.class, Integer.TYPE, Integer.TYPE}, List.class);
            } else if (userStory == null) {
                return CollectionsKt.emptyList();
            } else {
                List<String> arrayList = new ArrayList<>();
                int i3 = i2 - 1;
                int i4 = i;
                if (i4 <= i3) {
                    while (true) {
                        com.ss.android.ugc.aweme.story.api.model.b bVar = userStory.getAwemeList().get(i4);
                        if (bVar != null && bVar.getAwemeType() == 10001) {
                            String storyId = bVar.getStoryId();
                            Intrinsics.checkExpressionValueIsNotNull(storyId, "aweme.storyId");
                            arrayList.add(storyId);
                        }
                        if (i4 == i3) {
                            break;
                        }
                        i4++;
                    }
                }
                return arrayList;
            }
        }
    }
}
