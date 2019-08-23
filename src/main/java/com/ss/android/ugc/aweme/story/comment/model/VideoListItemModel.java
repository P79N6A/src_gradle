package com.ss.android.ugc.aweme.story.comment.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.base.c.a.a;
import com.ss.android.ugc.aweme.story.base.viewmodel.BaseListViewModel;
import com.ss.android.ugc.aweme.story.feed.api.StoryApi;
import com.ss.android.ugc.aweme.story.feed.model.b;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.TimeZone;

public class VideoListItemModel extends BaseListViewModel<b> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f72191d;

    /* renamed from: e  reason: collision with root package name */
    public String f72192e;

    /* renamed from: f  reason: collision with root package name */
    public String f72193f;
    public long g;
    public long h;
    public boolean i;
    public CompositeDisposable j = new CompositeDisposable();

    public static String e() {
        if (PatchProxy.isSupport(new Object[0], null, f72191d, true, 82876, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f72191d, true, 82876, new Class[0], String.class);
        }
        return TimeZone.getDefault().getID();
    }

    public final void a() {
        Observable<b> observable;
        if (PatchProxy.isSupport(new Object[0], this, f72191d, false, 82877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72191d, false, 82877, new Class[0], Void.TYPE);
            return;
        }
        if (this.i) {
            observable = StoryApi.a(0, 0, 5, this.f72192e, e());
        } else {
            observable = StoryApi.a(this.f72193f, 0, 0, 5, e(), 0);
        }
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72194a;

            public final void onComplete() {
            }

            public final void onError(Throwable th) {
                Throwable th2 = th;
                if (PatchProxy.isSupport(new Object[]{th2}, this, f72194a, false, 82883, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th2}, this, f72194a, false, 82883, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                if (th2 instanceof Exception) {
                    VideoListItemModel.this.f72128c.postValue(a.a((Exception) th2));
                }
            }

            public final /* synthetic */ void onNext(Object obj) {
                b bVar = (b) obj;
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f72194a, false, 82882, new Class[]{b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f72194a, false, 82882, new Class[]{b.class}, Void.TYPE);
                    return;
                }
                if (bVar == null || bVar.getUserStory() == null || CollectionUtils.isEmpty(bVar.getUserStory().getAwemeList())) {
                    VideoListItemModel.this.f72128c.postValue(a.f71933f);
                } else {
                    VideoListItemModel.this.f72128c.postValue(a.f71932e);
                }
                VideoListItemModel.this.c().postValue(bVar);
            }

            public final void onSubscribe(Disposable disposable) {
                if (PatchProxy.isSupport(new Object[]{disposable}, this, f72194a, false, 82881, new Class[]{Disposable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{disposable}, this, f72194a, false, 82881, new Class[]{Disposable.class}, Void.TYPE);
                    return;
                }
                VideoListItemModel.this.j.add(disposable);
                VideoListItemModel.this.f72128c.postValue(a.f71931d);
            }
        });
    }

    public final void b() {
        Observable<b> observable;
        if (PatchProxy.isSupport(new Object[0], this, f72191d, false, 82878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72191d, false, 82878, new Class[0], Void.TYPE);
            return;
        }
        if (this.i) {
            observable = StoryApi.a(0, this.g, 5, this.f72192e, e());
        } else {
            observable = StoryApi.a(this.f72193f, 0, this.g, 5, e(), 0);
        }
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72196a;

            public final void onComplete() {
            }

            public final void onError(Throwable th) {
                Throwable th2 = th;
                if (PatchProxy.isSupport(new Object[]{th2}, this, f72196a, false, 82886, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th2}, this, f72196a, false, 82886, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                if (th2 instanceof Exception) {
                    VideoListItemModel.this.f72128c.postValue(a.b((Exception) th2));
                }
            }

            public final /* synthetic */ void onNext(Object obj) {
                b bVar = (b) obj;
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f72196a, false, 82885, new Class[]{b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f72196a, false, 82885, new Class[]{b.class}, Void.TYPE);
                    return;
                }
                if (bVar == null || bVar.getUserStory() == null || CollectionUtils.isEmpty(bVar.getUserStory().getAwemeList())) {
                    VideoListItemModel.this.f72128c.postValue(a.i);
                } else {
                    VideoListItemModel.this.f72128c.postValue(a.h);
                }
                VideoListItemModel.this.c().postValue(bVar);
            }

            public final void onSubscribe(Disposable disposable) {
                if (PatchProxy.isSupport(new Object[]{disposable}, this, f72196a, false, 82884, new Class[]{Disposable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{disposable}, this, f72196a, false, 82884, new Class[]{Disposable.class}, Void.TYPE);
                    return;
                }
                VideoListItemModel.this.j.add(disposable);
                VideoListItemModel.this.f72128c.postValue(a.g);
            }
        });
    }
}
