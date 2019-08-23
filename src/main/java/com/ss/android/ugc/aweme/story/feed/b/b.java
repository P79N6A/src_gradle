package com.ss.android.ugc.aweme.story.feed.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/presenter/DislikeUserStoryPresenter;", "", "mView", "Lcom/ss/android/ugc/aweme/story/feed/presenter/DislikeUserStoryPresenter$IDislikeView;", "(Lcom/ss/android/ugc/aweme/story/feed/presenter/DislikeUserStoryPresenter$IDislikeView;)V", "dislikeStory", "", "userId", "", "IDislikeView", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72468a;

    /* renamed from: b  reason: collision with root package name */
    public a f72469b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/presenter/DislikeUserStoryPresenter$IDislikeView;", "", "onDislikeFail", "", "throwable", "", "onDislikeSuccess", "baseResponse", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/story/feed/presenter/DislikeUserStoryPresenter$dislikeStory$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "onComplete", "", "onError", "throwable", "", "onNext", "baseResponse", "onSubscribe", "disposable", "Lio/reactivex/disposables/Disposable;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.story.feed.b.b$b  reason: collision with other inner class name */
    public static final class C0755b implements Observer<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72470a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f72471b;

        public final void onComplete() {
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f72470a, false, 83619, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f72470a, false, 83619, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "throwable");
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f72470a, false, 83617, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f72470a, false, 83617, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "disposable");
        }

        public C0755b(b bVar) {
            this.f72471b = bVar;
        }

        public final /* synthetic */ void onNext(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f72470a, false, 83618, new Class[]{BaseResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f72470a, false, 83618, new Class[]{BaseResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(baseResponse, "baseResponse");
        }
    }

    public b(@NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mView");
        this.f72469b = aVar;
    }
}
