package com.ss.android.ugc.aweme.story.feed.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0006R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/presenter/DeleteLifePresenter;", "", "mView", "Lcom/ss/android/ugc/aweme/story/feed/presenter/DeleteLifePresenter$IDeleteView;", "(Lcom/ss/android/ugc/aweme/story/feed/presenter/DeleteLifePresenter$IDeleteView;)V", "deleteStory", "", "storyId", "", "uid", "unBindView", "IDeleteView", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72464a;

    /* renamed from: b  reason: collision with root package name */
    public C0030a f72465b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/presenter/DeleteLifePresenter$IDeleteView;", "", "onDeleteFail", "", "throwable", "", "onDeleteSuccess", "baseResponse", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.story.feed.b.a$a  reason: collision with other inner class name */
    public interface C0030a {
        void a(@NotNull BaseResponse baseResponse);

        void a(@NotNull Throwable th);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/story/feed/presenter/DeleteLifePresenter$deleteStory$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "onComplete", "", "onError", "throwable", "", "onNext", "baseResponse", "onSubscribe", "disposable", "Lio/reactivex/disposables/Disposable;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Observer<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72466a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f72467b;

        public final void onComplete() {
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f72466a, false, 83613, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f72466a, false, 83613, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "disposable");
        }

        public b(a aVar) {
            this.f72467b = aVar;
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f72466a, false, 83615, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f72466a, false, 83615, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "throwable");
            C0030a aVar = this.f72467b.f72465b;
            if (aVar != null) {
                aVar.a(th2);
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f72466a, false, 83614, new Class[]{BaseResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f72466a, false, 83614, new Class[]{BaseResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(baseResponse, "baseResponse");
            C0030a aVar = this.f72467b.f72465b;
            if (aVar != null) {
                aVar.a(baseResponse);
            }
        }
    }

    public a(@Nullable C0030a aVar) {
        this.f72465b = aVar;
    }
}
