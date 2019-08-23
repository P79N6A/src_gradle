package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteDetailApi;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020\u001fJ\u0016\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J(\u0010(\u001a\u00020\u001f2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010)2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u001dH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/VoteDetailPresenter;", "", "view", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "iVoteDetailSaveData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;", "state", "", "(Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;I)V", "api", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/api/VoteDetailApi;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getIVoteDetailSaveData", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;", "setIVoteDetailSaveData", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;)V", "loadMoreParams", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailLoadMoreParams;", "getLoadMoreParams", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailLoadMoreParams;", "setLoadMoreParams", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailLoadMoreParams;)V", "getState", "()I", "setState", "(I)V", "isHasMore", "", "loadMoreList", "", "voteId", "", "optionId", "onDestory", "refreshList", "removeDuplicatedData", "", "users", "setSaveData", "", "append", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69948a;

    /* renamed from: b  reason: collision with root package name */
    public final VoteDetailApi f69949b;

    /* renamed from: c  reason: collision with root package name */
    public final CompositeDisposable f69950c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public c f69951d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.common.f.c<User> f69952e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public g f69953f;
    public int g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/VoteDetailPresenter$loadMoreList$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailResponse;", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Observer<VoteDetailResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69954a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f69955b;

        public final void onComplete() {
        }

        public a(d dVar) {
            this.f69955b = dVar;
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f69954a, false, 79618, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f69954a, false, 79618, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
            this.f69955b.f69952e.c(new Exception(th2));
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            if (PatchProxy.isSupport(new Object[]{disposable}, this, f69954a, false, 79616, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable}, this, f69954a, false, 79616, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable, "d");
            this.f69955b.f69950c.add(disposable);
            this.f69955b.f69952e.s_();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.util.List<com.ss.android.ugc.aweme.profile.model.User>} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00b9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(java.lang.Object r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse r8 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse) r8
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f69954a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse> r1 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 79617(0x13701, float:1.11567E-40)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003a
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f69954a
                r3 = 0
                r4 = 79617(0x13701, float:1.11567E-40)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse> r1 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r18
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x003a:
                java.lang.String r0 = "t"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d r0 = r7.f69955b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c
                int r2 = r8.getOffset()
                boolean r3 = r8.getHasMore()
                r1.<init>(r2, r3)
                r0.a(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d r0 = r7.f69955b
                java.util.List r1 = r8.getUsers()
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d.f69948a
                r14 = 0
                r15 = 79614(0x136fe, float:1.11563E-40)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<java.util.List> r3 = java.util.List.class
                r2[r10] = r3
                java.lang.Class<java.util.List> r17 = java.util.List.class
                r12 = r0
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x0090
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d.f69948a
                r14 = 0
                r15 = 79614(0x136fe, float:1.11563E-40)
                java.lang.Class[] r1 = new java.lang.Class[r9]
                java.lang.Class<java.util.List> r2 = java.util.List.class
                r1[r10] = r2
                java.lang.Class<java.util.List> r17 = java.util.List.class
                r12 = r0
                r16 = r1
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                r1 = r0
                java.util.List r1 = (java.util.List) r1
                goto L_0x0134
            L_0x0090:
                int r2 = r0.g
                r3 = 0
                if (r2 != 0) goto L_0x00a4
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r0 = r0.f69953f
                if (r0 == 0) goto L_0x00a2
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r0 = r0.ag_()
                if (r0 == 0) goto L_0x00a2
                java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f69897b
                goto L_0x00b0
            L_0x00a2:
                r0 = r3
                goto L_0x00b0
            L_0x00a4:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r0 = r0.f69953f
                if (r0 == 0) goto L_0x00a2
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r0 = r0.ag_()
                if (r0 == 0) goto L_0x00a2
                java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f69899d
            L_0x00b0:
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x0134
                r2 = r1
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r4 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r2)
                if (r4 == 0) goto L_0x00c4
                goto L_0x0134
            L_0x00c4:
                if (r1 == 0) goto L_0x011d
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Collection r4 = (java.util.Collection) r4
                java.util.Iterator r1 = r1.iterator()
            L_0x00d3:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x011a
                java.lang.Object r5 = r1.next()
                r6 = r5
                com.ss.android.ugc.aweme.profile.model.User r6 = (com.ss.android.ugc.aweme.profile.model.User) r6
                if (r0 == 0) goto L_0x010e
                r11 = r0
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.Iterator r11 = r11.iterator()
            L_0x00e9:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x0109
                java.lang.Object r12 = r11.next()
                r13 = r12
                com.ss.android.ugc.aweme.profile.model.User r13 = (com.ss.android.ugc.aweme.profile.model.User) r13
                java.lang.String r14 = r6.getUid()
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                java.lang.String r13 = r13.getUid()
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = android.text.TextUtils.equals(r14, r13)
                if (r13 == 0) goto L_0x00e9
                goto L_0x010a
            L_0x0109:
                r12 = r3
            L_0x010a:
                r6 = r12
                com.ss.android.ugc.aweme.profile.model.User r6 = (com.ss.android.ugc.aweme.profile.model.User) r6
                goto L_0x010f
            L_0x010e:
                r6 = r3
            L_0x010f:
                if (r6 == 0) goto L_0x0113
                r6 = 1
                goto L_0x0114
            L_0x0113:
                r6 = 0
            L_0x0114:
                if (r6 == 0) goto L_0x00d3
                r4.add(r5)
                goto L_0x00d3
            L_0x011a:
                java.util.List r4 = (java.util.List) r4
                goto L_0x0121
            L_0x011d:
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L_0x0121:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r2)
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r4)
                if (r1 != 0) goto L_0x0131
                r0.removeAll(r4)
            L_0x0131:
                r1 = r0
                java.util.List r1 = (java.util.List) r1
            L_0x0134:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d r0 = r7.f69955b
                com.ss.android.ugc.aweme.common.f.c<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f69952e
                boolean r2 = r8.getHasMore()
                r0.b(r1, r2)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d r0 = r7.f69955b
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.Collection r1 = (java.util.Collection) r1
                r2.<init>(r1)
                java.util.List r2 = (java.util.List) r2
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d r1 = r7.f69955b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r1 = r1.f69951d
                r0.a(r2, r1, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d.a.onNext(java.lang.Object):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/VoteDetailPresenter$refreshList$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailResponse;", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Observer<VoteDetailResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f69957b;

        public final void onComplete() {
        }

        b(d dVar) {
            this.f69957b = dVar;
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f69956a, false, 79621, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f69956a, false, 79621, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
            this.f69957b.f69952e.b(new Exception(th2));
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            if (PatchProxy.isSupport(new Object[]{disposable}, this, f69956a, false, 79619, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable}, this, f69956a, false, 79619, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable, "d");
            this.f69957b.f69950c.add(disposable);
            this.f69957b.f69952e.n_();
        }

        public final /* synthetic */ void onNext(Object obj) {
            VoteDetailResponse voteDetailResponse = (VoteDetailResponse) obj;
            if (PatchProxy.isSupport(new Object[]{voteDetailResponse}, this, f69956a, false, 79620, new Class[]{VoteDetailResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{voteDetailResponse}, this, f69956a, false, 79620, new Class[]{VoteDetailResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(voteDetailResponse, "t");
            this.f69957b.a(new c(voteDetailResponse.getOffset(), voteDetailResponse.getHasMore()));
            if (CollectionUtils.isEmpty(voteDetailResponse.getUsers())) {
                this.f69957b.f69952e.y_();
                return;
            }
            this.f69957b.f69952e.a(voteDetailResponse.getUsers(), voteDetailResponse.getHasMore());
            this.f69957b.a(new ArrayList(voteDetailResponse.getUsers()), this.f69957b.f69951d, false);
        }
    }

    public final void a(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f69948a, false, 79610, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f69948a, false, 79610, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "<set-?>");
        this.f69951d = cVar2;
    }

    public final void a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f69948a, false, 79611, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f69948a, false, 79611, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        this.f69949b.getVoteDetail(j, j2, 0).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new b<Object>(this));
    }

    public d(@NotNull com.ss.android.ugc.aweme.common.f.c<User> cVar, @Nullable g gVar, int i) {
        VoteDetailApi voteDetailApi;
        Intrinsics.checkParameterIsNotNull(cVar, "view");
        this.f69952e = cVar;
        this.f69953f = gVar;
        this.g = i;
        VoteDetailApi.a aVar = VoteDetailApi.f69859a;
        if (PatchProxy.isSupport(new Object[0], aVar, VoteDetailApi.a.f69860a, false, 79501, new Class[0], VoteDetailApi.class)) {
            voteDetailApi = (VoteDetailApi) PatchProxy.accessDispatch(new Object[0], aVar, VoteDetailApi.a.f69860a, false, 79501, new Class[0], VoteDetailApi.class);
        } else {
            Object create = VoteDetailApi.a.f69861b.createNewRetrofit("https://aweme.snssdk.com").create(VoteDetailApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "retrofitService.createNe…oteDetailApi::class.java)");
            voteDetailApi = (VoteDetailApi) create;
        }
        this.f69949b = voteDetailApi;
        this.f69950c = new CompositeDisposable();
        this.f69951d = new c(0, false);
    }

    public final void a(List<User> list, c cVar, boolean z) {
        List<User> list2 = list;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{list2, cVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f69948a, false, 79615, new Class[]{List.class, c.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, cVar2, Byte.valueOf(z)}, this, f69948a, false, 79615, new Class[]{List.class, c.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d dVar = null;
        if (z) {
            Collection collection = list2;
            if (!CollectionUtils.isEmpty(collection)) {
                g gVar = this.f69953f;
                if (gVar != null) {
                    dVar = gVar.ag_();
                }
                if (dVar == null) {
                    dVar = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d(null, null, null, null, 15);
                }
                if (this.g == 0) {
                    if (dVar.f69897b == null) {
                        dVar.f69897b = new ArrayList();
                    }
                    List<User> list3 = dVar.f69897b;
                    if (list3 != null) {
                        list3.addAll(collection);
                    }
                    dVar.a(cVar2);
                } else {
                    if (dVar.f69899d == null) {
                        dVar.f69899d = new ArrayList();
                    }
                    List<User> list4 = dVar.f69899d;
                    if (list4 != null) {
                        list4.addAll(collection);
                    }
                    dVar.b(cVar2);
                }
                g gVar2 = this.f69953f;
                if (gVar2 != null) {
                    gVar2.a(dVar);
                }
            }
        } else if (!CollectionUtils.isEmpty(list2)) {
            g gVar3 = this.f69953f;
            if (gVar3 != null) {
                dVar = gVar3.ag_();
            }
            if (dVar == null) {
                dVar = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d(null, null, null, null, 15);
            }
            if (this.g == 0) {
                dVar.f69897b = list2;
                dVar.a(cVar2);
            } else {
                dVar.f69899d = list2;
                dVar.b(cVar2);
            }
            g gVar4 = this.f69953f;
            if (gVar4 != null) {
                gVar4.a(dVar);
            }
        }
    }
}
