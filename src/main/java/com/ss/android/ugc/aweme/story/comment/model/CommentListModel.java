package com.ss.android.ugc.aweme.story.comment.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.base.c.a.a;
import com.ss.android.ugc.aweme.story.base.viewmodel.BaseListViewModel;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class CommentListModel extends BaseListViewModel<b> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f72182d;

    /* renamed from: e  reason: collision with root package name */
    public String f72183e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f72184f = "";

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72182d, false, 82858, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72182d, false, 82858, new Class[0], Void.TYPE);
        } else if (this.f72128c.getValue() != a.m) {
            CommentPageRequestApi.a(this.f72183e, 0, 30, this.f72184f).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<b>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72185a;

                public final void onComplete() {
                }

                public final void onSubscribe(Disposable disposable) {
                    if (PatchProxy.isSupport(new Object[]{disposable}, this, f72185a, false, 82860, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable}, this, f72185a, false, 82860, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    CommentListModel.this.f72128c.postValue(a.m);
                }

                public final void onError(Throwable th) {
                    Throwable th2 = th;
                    if (PatchProxy.isSupport(new Object[]{th2}, this, f72185a, false, 82862, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th2}, this, f72185a, false, 82862, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    if (th2 instanceof Exception) {
                        CommentListModel.this.f72128c.postValue(a.c((Exception) th2));
                    }
                }

                public final /* synthetic */ void onNext(Object obj) {
                    b bVar = (b) obj;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f72185a, false, 82861, new Class[]{b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f72185a, false, 82861, new Class[]{b.class}, Void.TYPE);
                        return;
                    }
                    CommentListModel.this.c().postValue(bVar);
                    if (bVar == null || CollectionUtils.isEmpty(bVar.getStoryCommentList())) {
                        CommentListModel.this.f72128c.postValue(a.o);
                    } else {
                        CommentListModel.this.f72128c.postValue(a.n);
                    }
                }
            });
        }
    }

    public final void b() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f72182d, false, 82859, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72182d, false, 82859, new Class[0], Void.TYPE);
        } else if (this.f72128c.getValue() != a.p) {
            b bVar = (b) c().getValue();
            String str = this.f72183e;
            if (bVar != null) {
                j = bVar.cursor;
            } else {
                j = 0;
            }
            CommentPageRequestApi.a(str, j, 30, this.f72184f).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<b>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72187a;

                public final void onComplete() {
                    if (PatchProxy.isSupport(new Object[0], this, f72187a, false, 82866, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f72187a, false, 82866, new Class[0], Void.TYPE);
                        return;
                    }
                    CommentListModel.this.f72128c.postValue(a.q);
                }

                public final void onSubscribe(Disposable disposable) {
                    if (PatchProxy.isSupport(new Object[]{disposable}, this, f72187a, false, 82863, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable}, this, f72187a, false, 82863, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    CommentListModel.this.f72128c.postValue(a.p);
                }

                public final void onError(Throwable th) {
                    Throwable th2 = th;
                    if (PatchProxy.isSupport(new Object[]{th2}, this, f72187a, false, 82865, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th2}, this, f72187a, false, 82865, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    if (th2 instanceof Exception) {
                        CommentListModel.this.f72128c.postValue(a.c((Exception) th2));
                    }
                }

                public final /* synthetic */ void onNext(Object obj) {
                    b bVar = (b) obj;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f72187a, false, 82864, new Class[]{b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f72187a, false, 82864, new Class[]{b.class}, Void.TYPE);
                        return;
                    }
                    ((b) CommentListModel.this.d()).storyCommentList.addAll(bVar.storyCommentList);
                    bVar.setStoryCommentList(((b) CommentListModel.this.d()).storyCommentList);
                    CommentListModel.this.c().postValue(bVar);
                }
            });
        }
    }
}
