package com.ss.android.ugc.aweme.story.comment.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.base.c.a.a;
import com.ss.android.ugc.aweme.story.base.viewmodel.BaseListViewModel;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

public class ViewerListModel extends BaseListViewModel<d> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f72200d;

    /* renamed from: e  reason: collision with root package name */
    public String f72201e = "";

    /* renamed from: f  reason: collision with root package name */
    public CompositeDisposable f72202f = new CompositeDisposable();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72200d, false, 82895, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72200d, false, 82895, new Class[0], Void.TYPE);
        } else if (this.f72128c.getValue() != a.s) {
            CommentPageRequestApi.a(this.f72201e, 0, 20).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<d>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72203a;

                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                    Throwable th2 = th;
                    if (PatchProxy.isSupport(new Object[]{th2}, this, f72203a, false, 82900, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th2}, this, f72203a, false, 82900, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    if (th2 instanceof Exception) {
                        ViewerListModel.this.f72128c.postValue(a.d((Exception) th2));
                    }
                }

                public final /* synthetic */ void onNext(Object obj) {
                    d dVar = (d) obj;
                    if (PatchProxy.isSupport(new Object[]{dVar}, this, f72203a, false, 82899, new Class[]{d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar}, this, f72203a, false, 82899, new Class[]{d.class}, Void.TYPE);
                        return;
                    }
                    ViewerListModel.this.c().postValue(dVar);
                    if (dVar == null || CollectionUtils.isEmpty(dVar.getStoryViewerList())) {
                        ViewerListModel.this.f72128c.postValue(a.u);
                    } else {
                        ViewerListModel.this.f72128c.postValue(a.t);
                    }
                }

                public final void onSubscribe(Disposable disposable) {
                    if (PatchProxy.isSupport(new Object[]{disposable}, this, f72203a, false, 82898, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable}, this, f72203a, false, 82898, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    ViewerListModel.this.f72202f.add(disposable);
                    ViewerListModel.this.f72128c.postValue(a.s);
                }
            });
        }
    }

    public final void b() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f72200d, false, 82896, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72200d, false, 82896, new Class[0], Void.TYPE);
        } else if (this.f72128c.getValue() != a.v) {
            d dVar = (d) c().getValue();
            String str = this.f72201e;
            if (dVar != null) {
                j = dVar.getCursor();
            } else {
                j = 0;
            }
            CommentPageRequestApi.a(str, j, 20).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<d>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72205a;

                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                    Throwable th2 = th;
                    if (PatchProxy.isSupport(new Object[]{th2}, this, f72205a, false, 82903, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th2}, this, f72205a, false, 82903, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    if (th2 instanceof Exception) {
                        ViewerListModel.this.f72128c.postValue(a.d((Exception) th2));
                    }
                }

                public final /* synthetic */ void onNext(Object obj) {
                    d dVar = (d) obj;
                    if (PatchProxy.isSupport(new Object[]{dVar}, this, f72205a, false, 82902, new Class[]{d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar}, this, f72205a, false, 82902, new Class[]{d.class}, Void.TYPE);
                        return;
                    }
                    List<c> list = dVar.storyViewerList;
                    if (!CollectionUtils.isEmpty(((d) ViewerListModel.this.d()).getStoryViewerList()) && list != null) {
                        ((d) ViewerListModel.this.d()).getStoryViewerList().addAll(list);
                    }
                    dVar.setStoryViewerList(((d) ViewerListModel.this.d()).storyViewerList);
                    ViewerListModel.this.c().postValue(dVar);
                }

                public final void onSubscribe(Disposable disposable) {
                    if (PatchProxy.isSupport(new Object[]{disposable}, this, f72205a, false, 82901, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable}, this, f72205a, false, 82901, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    ViewerListModel.this.f72202f.add(disposable);
                    ViewerListModel.this.f72128c.postValue(a.v);
                }
            });
        }
    }
}
