package com.ss.android.ugc.aweme.feed.h;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ui.al;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.feedpage.LiveFeedApi;
import com.ss.android.ugc.aweme.live.feedpage.g;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/presenter/FollowLiveSkyLightPresenter;", "", "view", "Lcom/ss/android/ugc/aweme/feed/ui/IFollowLiveSkyLightView;", "(Lcom/ss/android/ugc/aweme/feed/ui/IFollowLiveSkyLightView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "fetchLiveFeed", "", "urlString", "", "refreshType", "", "onDestroy", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45521a;

    /* renamed from: b  reason: collision with root package name */
    public final CompositeDisposable f45522b = new CompositeDisposable();

    /* renamed from: c  reason: collision with root package name */
    public final al f45523c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/feed/presenter/FollowLiveSkyLightPresenter$fetchLiveFeed$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/live/feedpage/LiveFeedResponse;", "onComplete", "", "onError", "e", "", "onNext", "response", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Observer<com.ss.android.ugc.aweme.live.feedpage.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45524a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f45525b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f45526c;

        public final void onComplete() {
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f45524a, false, 42061, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f45524a, false, 42061, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
        }

        public final /* synthetic */ void onNext(Object obj) {
            com.ss.android.ugc.aweme.live.feedpage.a aVar = (com.ss.android.ugc.aweme.live.feedpage.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f45524a, false, 42060, new Class[]{com.ss.android.ugc.aweme.live.feedpage.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f45524a, false, 42060, new Class[]{com.ss.android.ugc.aweme.live.feedpage.a.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aVar, "response");
            if (CollectionUtils.isEmpty(aVar.f53379a)) {
                this.f45525b.f45523c.b(this.f45526c);
                return;
            }
            al alVar = this.f45525b.f45523c;
            List<g> list = aVar.f53379a;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            alVar.a(list, this.f45526c);
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f45524a, false, 42059, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f45524a, false, 42059, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
            this.f45525b.f45522b.add(disposable2);
        }

        a(q qVar, int i) {
            this.f45525b = qVar;
            this.f45526c = i;
        }
    }

    public q(@NotNull al alVar) {
        Intrinsics.checkParameterIsNotNull(alVar, "view");
        this.f45523c = alVar;
    }

    public final void a(@NotNull String str, int i) {
        LiveFeedApi liveFeedApi;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f45521a, false, 42057, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f45521a, false, 42057, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "urlString");
        LiveFeedApi.a aVar = LiveFeedApi.f53376a;
        if (PatchProxy.isSupport(new Object[0], aVar, LiveFeedApi.a.f53377a, false, 55651, new Class[0], LiveFeedApi.class)) {
            liveFeedApi = (LiveFeedApi) PatchProxy.accessDispatch(new Object[0], aVar, LiveFeedApi.a.f53377a, false, 55651, new Class[0], LiveFeedApi.class);
        } else {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://" + com.ss.android.ugc.aweme.live.a.a()).create(LiveFeedApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…(LiveFeedApi::class.java)");
            liveFeedApi = (LiveFeedApi) create;
        }
        liveFeedApi.fetchLiveFeed(str2).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new a<Object>(this, i));
    }
}
