package com.ss.android.ugc.aweme.story.a.b;

import com.bytedance.jedi.model.e.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.base.Constant;
import com.ss.android.ugc.aweme.story.feed.c.g;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007JF\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001bH\u0007J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00152\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00152\u0006\u0010\u0017\u001a\u00020\u0018JD\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u001bJD\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010)\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001bJ$\u0010-\u001a\b\u0012\u0004\u0012\u00020 0\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u001bJ\u0014\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000100H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/story/repo/storydetail/UserStoryRepository;", "Lcom/bytedance/jedi/model/repository/Repository;", "userStoryCache", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/UserStoryCache;", "followLifeFeedCache", "Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedCache;", "friendLifeFeedCache", "(Lcom/ss/android/ugc/aweme/story/repo/storydetail/UserStoryCache;Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedCache;Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedCache;)V", "storyDeleteFetcher", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryDeleteFetcher;", "storyDetailBatchFetcher", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryDetailBatchFetcher;", "storyDislikeFetcher", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryDislikeFetcher;", "storyOneDayFetcher", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryOneDayFetcher;", "storyOneUserFetcher", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryOneUserFetcher;", "storyReadStatsFetcher", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryReadStatsFetcher;", "batchStoryDetail", "Lio/reactivex/Single;", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeOneUserModel;", "userId", "", "ids", "requestType", "", "loadCount", "startPos", "endPos", "deleteStory", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "storyId", "dislikeStory", "fetchOneDayLife", "maxCursor", "", "minCursor", "count", "timeZone", "uid", "readFlag", "fetchOneUserLife", "isReverse", "storyShow", "relationTyp", "wrapUserStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "userStory", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class m extends com.bytedance.jedi.model.f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71822a;

    /* renamed from: b  reason: collision with root package name */
    public final a f71823b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final e f71824c = new e();

    /* renamed from: d  reason: collision with root package name */
    public final j f71825d = new j();

    /* renamed from: e  reason: collision with root package name */
    private final c f71826e = new c();

    /* renamed from: f  reason: collision with root package name */
    private final f f71827f = new f();
    private final h g = new h();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005* \u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$PredicatedMerge;", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncRemovedItemTo$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<a.d<String, String, Unit, List<? extends UserStory>>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.d<String, String, Unit, List<UserStory>> dVar) {
            a.d<String, String, Unit, List<UserStory>> dVar2 = dVar;
            if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 85081, new Class[]{a.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 85081, new Class[]{a.d.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dVar2, "$this$predicatedSyncTo");
            dVar2.a(AnonymousClass1.INSTANCE);
            dVar2.b(new Function2<String, List<? extends UserStory>, List<? extends UserStory>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<UserStory> invoke(String str, @NotNull List<? extends UserStory> list) {
                    List<? extends UserStory> list2 = list;
                    if (PatchProxy.isSupport(new Object[]{str, list2}, this, changeQuickRedirect, false, 85083, new Class[]{Object.class, List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{str, list2}, this, changeQuickRedirect, false, 85083, new Class[]{Object.class, List.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(list2, "curV");
                    Collection arrayList = new ArrayList();
                    for (Object next : list2) {
                        User user = ((UserStory) next).getUser();
                        Intrinsics.checkExpressionValueIsNotNull(user, "curV.user");
                        if (!Intrinsics.areEqual((Object) user.getUid(), (Object) str)) {
                            arrayList.add(next);
                        }
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005* \u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$PredicatedMerge;", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncRemovedItemTo$2"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<a.d<String, String, Unit, List<? extends UserStory>>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.d<String, String, Unit, List<UserStory>> dVar) {
            a.d<String, String, Unit, List<UserStory>> dVar2 = dVar;
            if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 85087, new Class[]{a.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 85087, new Class[]{a.d.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dVar2, "$this$predicatedSyncTo");
            dVar2.a(AnonymousClass1.INSTANCE);
            dVar2.b(new Function2<String, List<? extends UserStory>, List<? extends UserStory>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<UserStory> invoke(String str, @NotNull List<? extends UserStory> list) {
                    List<? extends UserStory> list2 = list;
                    if (PatchProxy.isSupport(new Object[]{str, list2}, this, changeQuickRedirect, false, 85089, new Class[]{Object.class, List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{str, list2}, this, changeQuickRedirect, false, 85089, new Class[]{Object.class, List.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(list2, "curV");
                    Collection arrayList = new ArrayList();
                    for (Object next : list2) {
                        User user = ((UserStory) next).getUser();
                        Intrinsics.checkExpressionValueIsNotNull(user, "curV.user");
                        if (!Intrinsics.areEqual((Object) user.getUid(), (Object) str)) {
                            arrayList.add(next);
                        }
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    @NotNull
    @JvmOverloads
    public final Single<com.ss.android.ugc.aweme.story.feed.model.b> a(@NotNull String str, @NotNull String str2, @Constant.IRequestType int i) {
        if (!PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i)}, this, f71822a, false, 85075, new Class[]{String.class, String.class, Integer.TYPE}, Single.class)) {
            return a(this, str, str2, i, 0, 0, 0, 56);
        }
        return (Single) PatchProxy.accessDispatch(new Object[]{str, str2, Integer.valueOf(i)}, this, f71822a, false, 85075, new Class[]{String.class, String.class, Integer.TYPE}, Single.class);
    }

    public m(@NotNull l lVar, @NotNull com.ss.android.ugc.aweme.story.a.a.a aVar, @NotNull com.ss.android.ugc.aweme.story.a.a.a aVar2) {
        Intrinsics.checkParameterIsNotNull(lVar, "userStoryCache");
        Intrinsics.checkParameterIsNotNull(aVar, "followLifeFeedCache");
        Intrinsics.checkParameterIsNotNull(aVar2, "friendLifeFeedCache");
        b(this.f71824c, aVar, new a());
        b(this.f71824c, aVar2, new b());
        a(this.f71823b.a(), lVar.a(), a.b.a(AnonymousClass4.INSTANCE, AnonymousClass5.INSTANCE));
        a(this.f71826e.a(), lVar.a(), a.b.a(AnonymousClass6.INSTANCE, new Function3<d, com.ss.android.ugc.aweme.story.feed.model.b, UserStory, UserStory>(this) {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ m this$0;

            {
                this.this$0 = r1;
            }

            @Nullable
            public final UserStory invoke(@NotNull d dVar, @Nullable com.ss.android.ugc.aweme.story.feed.model.b bVar, @Nullable UserStory userStory) {
                d dVar2 = dVar;
                UserStory userStory2 = userStory;
                if (PatchProxy.isSupport(new Object[]{dVar2, bVar, userStory2}, this, changeQuickRedirect, false, 85099, new Class[]{d.class, com.ss.android.ugc.aweme.story.feed.model.b.class, UserStory.class}, UserStory.class)) {
                    return (UserStory) PatchProxy.accessDispatch(new Object[]{dVar2, bVar, userStory2}, this, changeQuickRedirect, false, 85099, new Class[]{d.class, com.ss.android.ugc.aweme.story.feed.model.b.class, UserStory.class}, UserStory.class);
                }
                Intrinsics.checkParameterIsNotNull(dVar2, "newK");
                if (bVar == null) {
                    return userStory2;
                }
                if (userStory2 != null) {
                    UserStory userStory3 = bVar.getUserStory();
                    Intrinsics.checkExpressionValueIsNotNull(userStory3, "newV.userStory");
                    g.f72503b.a(userStory3, bVar.getLogPbBean());
                    if (dVar2.f71800e == 1) {
                        userStory2.setLastPos(g.f72503b.b(userStory2, userStory3, dVar2.f71799d));
                    } else if (dVar2.f71800e == 3) {
                        g.f72503b.a(userStory3, bVar.getLogPbBean());
                        g.f72503b.a(userStory2, userStory3, dVar2.f71801f, dVar2.g);
                        userStory2.setCurPos((long) dVar2.f71801f);
                        userStory2.setLastPos((long) (dVar2.g - 1));
                    } else {
                        userStory2.setCurPos(g.f72503b.a(userStory2, userStory3, dVar2.f71799d));
                    }
                    userStory2.setHasMore(userStory3.getHasMore());
                    userStory2.setMaxCursor(userStory3.getMaxCursor());
                    userStory2.setMinCursor(userStory3.getMinCursor());
                    return userStory2;
                }
                m mVar = this.this$0;
                UserStory userStory4 = bVar.getUserStory();
                if (PatchProxy.isSupport(new Object[]{userStory4}, mVar, m.f71822a, false, 85071, new Class[]{UserStory.class}, UserStory.class)) {
                    return (UserStory) PatchProxy.accessDispatch(new Object[]{userStory4}, mVar, m.f71822a, false, 85071, new Class[]{UserStory.class}, UserStory.class);
                }
                g.f72503b.g(userStory4);
                return userStory4;
            }
        }));
        a(this.f71825d.a(), lVar.a(), a.b.a(AnonymousClass8.INSTANCE, AnonymousClass9.INSTANCE));
        a(this.f71827f.a(), lVar.a(), a.b.a(AnonymousClass10.INSTANCE, AnonymousClass1.INSTANCE));
        a(this.g.a(), lVar.a(), a.b.a(AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE));
    }

    @NotNull
    @JvmOverloads
    private Single<com.ss.android.ugc.aweme.story.feed.model.b> a(@NotNull String str, @NotNull String str2, @Constant.IRequestType int i, int i2, int i3, int i4) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f71822a, false, 85072, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Single.class)) {
            Object[] objArr = {str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            return (Single) PatchProxy.accessDispatch(objArr, this, f71822a, false, 85072, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Single.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "userId");
        Intrinsics.checkParameterIsNotNull(str4, "ids");
        c cVar = this.f71826e;
        d dVar = new d(str, str2, i2, i, i3, i4);
        Single<com.ss.android.ugc.aweme.story.feed.model.b> fromObservable = Single.fromObservable(cVar.a(dVar));
        Intrinsics.checkExpressionValueIsNotNull(fromObservable, "Single.fromObservable(\n …)\n            )\n        )");
        return fromObservable;
    }

    @NotNull
    public final Single<com.ss.android.ugc.aweme.story.feed.model.b> a(long j, long j2, int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{0L, 0L, 5, str4, str5, str6, Integer.valueOf(i2)}, this, f71822a, false, 85080, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE, String.class, String.class, String.class, Integer.TYPE}, Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[]{0L, 0L, 5, str4, str5, str6, Integer.valueOf(i2)}, this, f71822a, false, 85080, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE, String.class, String.class, String.class, Integer.TYPE}, Single.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "storyId");
        Intrinsics.checkParameterIsNotNull(str5, "timeZone");
        Intrinsics.checkParameterIsNotNull(str6, "uid");
        f fVar = this.f71827f;
        g gVar = new g(0, 0, 5, str, str2, str3, i2);
        Single<com.ss.android.ugc.aweme.story.feed.model.b> fromObservable = Single.fromObservable(fVar.a(gVar));
        Intrinsics.checkExpressionValueIsNotNull(fromObservable, "Single.fromObservable(\n …)\n            )\n        )");
        return fromObservable;
    }

    @NotNull
    public final Single<com.ss.android.ugc.aweme.story.feed.model.b> a(@NotNull String str, long j, long j2, int i, @NotNull String str2, int i2, int i3) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, 0L, 0L, 5, str4, 0, Integer.valueOf(i3)}, this, f71822a, false, 85079, new Class[]{String.class, Long.TYPE, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[]{str3, 0L, 0L, 5, str4, 0, Integer.valueOf(i3)}, this, f71822a, false, 85079, new Class[]{String.class, Long.TYPE, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Single.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "uid");
        Intrinsics.checkParameterIsNotNull(str4, "timeZone");
        h hVar = this.g;
        i iVar = new i(str, 0, 0, 5, str2, 0, i3);
        Single<com.ss.android.ugc.aweme.story.feed.model.b> fromObservable = Single.fromObservable(hVar.a(iVar));
        Intrinsics.checkExpressionValueIsNotNull(fromObservable, "Single.fromObservable(\n …)\n            )\n        )");
        return fromObservable;
    }

    public static /* synthetic */ Single a(m mVar, String str, String str2, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if ((i5 & 8) != 0) {
            i6 = 20;
        } else {
            i6 = i2;
        }
        if ((i5 & 16) != 0) {
            i7 = 0;
        } else {
            i7 = i3;
        }
        if ((i5 & 32) != 0) {
            i8 = 0;
        } else {
            i8 = i4;
        }
        return mVar.a(str, str2, i, i6, i7, i8);
    }
}
