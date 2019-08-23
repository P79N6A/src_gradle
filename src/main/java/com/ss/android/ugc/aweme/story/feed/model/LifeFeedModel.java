package com.ss.android.ugc.aweme.story.feed.model;

import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.base.c.a.a;
import com.ss.android.ugc.aweme.story.base.viewmodel.BaseListViewModel;
import com.ss.android.ugc.aweme.story.feed.api.StoryApi;
import com.ss.android.ugc.aweme.story.feed.c.g;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class LifeFeedModel extends BaseListViewModel<a> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f72661d;

    /* renamed from: e  reason: collision with root package name */
    public CompositeDisposable f72662e = new CompositeDisposable();

    /* renamed from: f  reason: collision with root package name */
    public int f72663f = -1;
    boolean g = false;
    public boolean h = false;

    public int e() {
        return 0;
    }

    public final a f() {
        if (!PatchProxy.isSupport(new Object[0], this, f72661d, false, 83604, new Class[0], a.class)) {
            return (a) this.f72128c.getValue();
        }
        return (a) PatchProxy.accessDispatch(new Object[0], this, f72661d, false, 83604, new Class[0], a.class);
    }

    public final void b() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f72661d, false, 83601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72661d, false, 83601, new Class[0], Void.TYPE);
        } else if (!this.h) {
            a aVar = (a) d();
            if (aVar != null) {
                j = aVar.cursor;
            } else {
                j = 0;
            }
            StoryApi.a(j, 20, e(), null).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<a>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72666a;

                public final void onComplete() {
                    LifeFeedModel.this.h = false;
                }

                public final void onError(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f72666a, false, 83611, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f72666a, false, 83611, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    LifeFeedModel.this.h = false;
                    if (th instanceof Exception) {
                        LifeFeedModel.this.f72128c.postValue(a.b((Exception) th));
                    }
                }

                public final void onSubscribe(Disposable disposable) {
                    if (PatchProxy.isSupport(new Object[]{disposable}, this, f72666a, false, 83609, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable}, this, f72666a, false, 83609, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    LifeFeedModel.this.h = true;
                    LifeFeedModel.this.f72662e.add(disposable);
                    LifeFeedModel.this.f72128c.postValue(a.g);
                }

                public final /* synthetic */ void onNext(Object obj) {
                    int i;
                    boolean z;
                    Integer num;
                    a aVar = (a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f72666a, false, 83610, new Class[]{a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f72666a, false, 83610, new Class[]{a.class}, Void.TYPE);
                        return;
                    }
                    if (aVar != null) {
                        g.b(aVar);
                        g.a(aVar);
                        List<UserStory> list = aVar.userStoryList;
                        if (!(LifeFeedModel.this.d() == null || ((a) LifeFeedModel.this.d()).userStoryList == null)) {
                            if (CollectionUtils.isEmpty(aVar.liveStories)) {
                                aVar.liveStories = ((a) LifeFeedModel.this.d()).liveStories;
                            }
                            List<UserStory> list2 = ((a) LifeFeedModel.this.d()).userStoryList;
                            if (PatchProxy.isSupport(new Object[]{list2, list}, null, g.f72502a, true, 83738, new Class[]{List.class, List.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{list2, list}, null, g.f72502a, true, 83738, new Class[]{List.class, List.class}, Void.TYPE);
                            } else {
                                g.a aVar2 = g.f72503b;
                                if (PatchProxy.isSupport(new Object[]{list2, list}, aVar2, g.a.f72504a, false, 83812, new Class[]{List.class, List.class}, Void.TYPE)) {
                                    Object[] objArr = {list2, list};
                                    Object[] objArr2 = objArr;
                                    g.a aVar3 = aVar2;
                                    PatchProxy.accessDispatch(objArr2, aVar3, g.a.f72504a, false, 83812, new Class[]{List.class, List.class}, Void.TYPE);
                                } else {
                                    Intrinsics.checkParameterIsNotNull(list2, "userStoryList");
                                    if (list != null) {
                                        i = list.size();
                                    } else {
                                        i = 0;
                                    }
                                    if (i > 0 && list != null) {
                                        int i2 = i - 1;
                                        if (i2 >= 0) {
                                            int i3 = 0;
                                            while (true) {
                                                UserStory userStory = list.get(i3);
                                                g.a aVar4 = g.f72503b;
                                                if (PatchProxy.isSupport(new Object[]{list2, userStory}, aVar4, g.a.f72504a, false, 83813, new Class[]{List.class, UserStory.class}, Boolean.TYPE)) {
                                                    Class[] clsArr = {List.class, UserStory.class};
                                                    g.a aVar5 = aVar4;
                                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{list2, userStory}, aVar5, g.a.f72504a, false, 83813, clsArr, Boolean.TYPE)).booleanValue();
                                                } else {
                                                    if (list2 != null) {
                                                        num = Integer.valueOf(list2.size());
                                                    } else {
                                                        num = null;
                                                    }
                                                    if (num.intValue() > 0) {
                                                        Iterator<UserStory> it2 = list2.iterator();
                                                        while (true) {
                                                            if (!it2.hasNext()) {
                                                                break;
                                                            }
                                                            if (aVar4.a(it2.next(), userStory)) {
                                                                z = true;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    z = false;
                                                }
                                                if (!z) {
                                                    list2.add(userStory);
                                                }
                                                if (i3 == i2) {
                                                    break;
                                                }
                                                i3++;
                                            }
                                        }
                                    }
                                }
                            }
                            aVar.setUserStoryList(((a) LifeFeedModel.this.d()).userStoryList);
                        }
                        LifeFeedModel.this.f72128c.setValue(a.h);
                        LifeFeedModel.this.c().postValue(aVar);
                    }
                }
            });
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72661d, false, 83598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72661d, false, 83598, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{""}, this, f72661d, false, 83599, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{""}, this, f72661d, false, 83599, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!this.g) {
            StoryApi.a(0, 20, e(), "").subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<a>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72664a;

                public final void onComplete() {
                    LifeFeedModel.this.g = false;
                }

                public final void onError(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f72664a, false, 83608, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f72664a, false, 83608, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    LifeFeedModel.this.g = false;
                    if (th instanceof Exception) {
                        LifeFeedModel.this.f72128c.postValue(a.a((Exception) th));
                    }
                }

                public final /* synthetic */ void onNext(Object obj) {
                    a aVar = (a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f72664a, false, 83607, new Class[]{a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f72664a, false, 83607, new Class[]{a.class}, Void.TYPE);
                        return;
                    }
                    g.b(aVar);
                    g.a(aVar);
                    LifeFeedModel.this.f72128c.setValue(a.f71932e);
                    LifeFeedModel.this.c().postValue(aVar);
                }

                public final void onSubscribe(Disposable disposable) {
                    if (PatchProxy.isSupport(new Object[]{disposable}, this, f72664a, false, 83606, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable}, this, f72664a, false, 83606, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    LifeFeedModel.this.g = true;
                    LifeFeedModel.this.f72662e.add(disposable);
                    LifeFeedModel.this.f72128c.postValue(a.f71931d);
                }
            });
        }
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f72661d, false, 83600, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f72661d, false, 83600, new Class[]{a.class}, Void.TYPE);
            return;
        }
        c().postValue(aVar2);
    }

    public static LifeFeedModel a(@NonNull FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f72661d, true, 83597, new Class[]{FragmentActivity.class}, LifeFeedModel.class)) {
            return (LifeFeedModel) ViewModelProviders.of(fragmentActivity).get(LifeFeedModel.class);
        }
        return (LifeFeedModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f72661d, true, 83597, new Class[]{FragmentActivity.class}, LifeFeedModel.class);
    }

    public final void a(UserStory userStory) {
        int i;
        boolean z;
        UserStory userStory2 = userStory;
        if (PatchProxy.isSupport(new Object[]{userStory2}, this, f72661d, false, 83602, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory2}, this, f72661d, false, 83602, new Class[]{UserStory.class}, Void.TYPE);
            return;
        }
        a aVar = (a) d();
        if (aVar != null) {
            List userStoryList = aVar.getUserStoryList();
            if (userStoryList == null) {
                i = 0;
            } else {
                i = userStoryList.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                UserStory userStory3 = (UserStory) userStoryList.get(i2);
                if (PatchProxy.isSupport(new Object[]{userStory3, userStory2}, this, f72661d, false, 83603, new Class[]{UserStory.class, UserStory.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory3, userStory2}, this, f72661d, false, 83603, new Class[]{UserStory.class, UserStory.class}, Boolean.TYPE)).booleanValue();
                } else if (userStory3 == null || userStory2 == null || userStory3.getUser() == null || userStory.getUser() == null || !TextUtils.equals(userStory3.getUser().getUid(), userStory.getUser().getUid())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    userStoryList.set(i2, userStory2);
                    c().postValue(aVar);
                    return;
                }
            }
        }
    }
}
