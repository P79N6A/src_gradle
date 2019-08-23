package com.ss.android.ugc.aweme.story.detail.controller;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.comment.view.CommentActivity;
import com.ss.android.ugc.aweme.story.feed.api.StoryApi;
import com.ss.android.ugc.aweme.story.feed.b.d;
import com.ss.android.ugc.aweme.story.feed.b.e;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.model.UserStoryDetail;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;

public class StoryDetailController extends LifecycleController implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72398a;

    /* renamed from: b  reason: collision with root package name */
    public f f72399b;

    /* renamed from: c  reason: collision with root package name */
    public UserStory f72400c;
    private d g;
    private com.ss.android.ugc.aweme.story.feed.b.f h;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72398a, false, 83150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72398a, false, 83150, new Class[0], Void.TYPE);
            return;
        }
        a.c((Context) this.f4119f, (int) C0906R.string.cf2).a();
        this.f72399b.storyState = false;
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72403a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f72403a, false, 83153, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72403a, false, 83153, new Class[0], Void.TYPE);
                    return;
                }
                if (StoryDetailController.this.f4119f != null && !StoryDetailController.this.f4119f.isFinishing()) {
                    StoryDetailController.this.f4119f.supportFinishAfterTransition();
                }
            }
        }, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f72398a, false, 83147, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72398a, false, 83147, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.g != null) {
            this.g.f72473b = null;
            d dVar = this.g;
            if (PatchProxy.isSupport(new Object[0], dVar, d.f72472a, false, 83621, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar, d.f72472a, false, 83621, new Class[0], Void.TYPE);
            } else {
                dVar.f72474c.dispose();
            }
        }
        if (this.h != null) {
            this.h.a();
            this.h.b();
        }
    }

    public void onCreate() {
        Observable<UserStoryDetail> observable;
        if (PatchProxy.isSupport(new Object[0], this, f72398a, false, 83144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72398a, false, 83144, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f72398a, false, 83145, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72398a, false, 83145, new Class[0], Void.TYPE);
            return;
        }
        AnonymousClass1 r0 = new e() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72401a;

            public final void a(Throwable th) {
            }

            public final void d() {
                if (PatchProxy.isSupport(new Object[0], this, f72401a, false, 83151, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72401a, false, 83151, new Class[0], Void.TYPE);
                    return;
                }
                StoryDetailController.this.a();
            }

            public final void a(UserStory userStory) {
                UserStory userStory2 = userStory;
                if (PatchProxy.isSupport(new Object[]{userStory2}, this, f72401a, false, 83152, new Class[]{UserStory.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{userStory2}, this, f72401a, false, 83152, new Class[]{UserStory.class}, Void.TYPE);
                } else if (userStory2 == null || userStory.getAwemeList() == null || userStory.getAwemeList().isEmpty() || StoryDetailController.this.f4117d == null) {
                    d();
                } else {
                    StoryDetailController.this.f4117d.c().postValue(StoryDetailController.this.a(userStory2));
                    if (StoryDetailController.this.f72399b.detailType == 6) {
                        com.ss.android.ugc.aweme.story.detail.f.a().f72430b = userStory2;
                        FragmentActivity fragmentActivity = StoryDetailController.this.f4119f;
                        String str = StoryDetailController.this.f72399b.uid;
                        int i = StoryDetailController.this.f72399b.detailType;
                        if (PatchProxy.isSupport(new Object[]{fragmentActivity, "", str, Integer.valueOf(i)}, null, CommentActivity.f72210a, true, 82904, new Class[]{Activity.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{fragmentActivity, "", str, Integer.valueOf(i)}, null, CommentActivity.f72210a, true, 82904, new Class[]{Activity.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        CommentActivity.a(fragmentActivity, "", str, i, false);
                    }
                }
            }
        };
        if (this.f72399b != null) {
            switch (this.f72399b.detailType) {
                case 1:
                    this.g = new d(this);
                    d dVar = this.g;
                    String str = this.f72399b.storyId;
                    if (PatchProxy.isSupport(new Object[]{str}, dVar, d.f72472a, false, 83620, new Class[]{String.class}, Void.TYPE)) {
                        d dVar2 = dVar;
                        PatchProxy.accessDispatch(new Object[]{str}, dVar2, d.f72472a, false, 83620, new Class[]{String.class}, Void.TYPE);
                        break;
                    } else {
                        if (PatchProxy.isSupport(new Object[]{str}, null, StoryApi.f72459a, true, 83216, new Class[]{String.class}, Observable.class)) {
                            observable = (Observable) PatchProxy.accessDispatch(new Object[]{str}, null, StoryApi.f72459a, true, 83216, new Class[]{String.class}, Observable.class);
                        } else {
                            observable = ((StoryApi.RealApi) StoryApi.f72460b.create(StoryApi.RealApi.class)).getStoryDetail(str);
                        }
                        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<UserStoryDetail>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f72475a;

                            public final void onComplete() {
                            }

                            public final void onSubscribe(Disposable disposable) {
                                Disposable disposable2 = disposable;
                                if (PatchProxy.isSupport(new Object[]{disposable2}, this, f72475a, false, 83622, new Class[]{Disposable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{disposable2}, this, f72475a, false, 83622, new Class[]{Disposable.class}, Void.TYPE);
                                    return;
                                }
                                d.this.f72474c.add(disposable2);
                            }

                            public final void onError(Throwable th) {
                                if (PatchProxy.isSupport(new Object[]{th}, this, f72475a, false, 83624, new Class[]{Throwable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{th}, this, f72475a, false, 83624, new Class[]{Throwable.class}, Void.TYPE);
                                    return;
                                }
                                d.this.f72473b.a((Exception) th);
                            }

                            public final /* synthetic */ void onNext(Object obj) {
                                UserStoryDetail userStoryDetail = (UserStoryDetail) obj;
                                int i = 0;
                                if (PatchProxy.isSupport(new Object[]{userStoryDetail}, this, f72475a, false, 83623, new Class[]{UserStoryDetail.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{userStoryDetail}, this, f72475a, false, 83623, new Class[]{UserStoryDetail.class}, Void.TYPE);
                                    return;
                                }
                                if (userStoryDetail != null) {
                                    UserStory userStory = userStoryDetail.getUserStory();
                                    if (userStory != null) {
                                        userStory.setLogPb(userStoryDetail.getLogPb());
                                        if (userStory.getAwemeList() != null) {
                                            i = userStory.getAwemeList().size();
                                        }
                                        userStory.setTotalCount((long) i);
                                        com.ss.android.ugc.aweme.story.detail.f.a().f72430b = userStory;
                                        d.this.f72473b.b(userStory);
                                        return;
                                    }
                                }
                                d.this.f72473b.a();
                            }
                        });
                        return;
                    }
                case 2:
                case 3:
                case 5:
                    this.f4117d.c().postValue(a(this.f72400c));
                    break;
                case 6:
                    this.h = new com.ss.android.ugc.aweme.story.feed.b.f(r0);
                    this.h.f72481e = 1;
                    this.h.a(this.f72399b.storyId);
                    return;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                    this.h = new com.ss.android.ugc.aweme.story.feed.b.f(r0);
                    this.h.f72481e = 0;
                    this.h.a(this.f72399b.uid);
                    return;
            }
        }
    }

    public final com.ss.android.ugc.aweme.story.feed.model.a a(UserStory userStory) {
        UserStory userStory2 = userStory;
        if (PatchProxy.isSupport(new Object[]{userStory2}, this, f72398a, false, 83146, new Class[]{UserStory.class}, com.ss.android.ugc.aweme.story.feed.model.a.class)) {
            return (com.ss.android.ugc.aweme.story.feed.model.a) PatchProxy.accessDispatch(new Object[]{userStory2}, this, f72398a, false, 83146, new Class[]{UserStory.class}, com.ss.android.ugc.aweme.story.feed.model.a.class);
        } else if (userStory2 == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(userStory2);
            com.ss.android.ugc.aweme.story.feed.model.a aVar = new com.ss.android.ugc.aweme.story.feed.model.a();
            aVar.setUserStoryList(arrayList);
            aVar.setHasMore(0);
            aVar.setCursor(0);
            return aVar;
        }
    }

    public final void b(UserStory userStory) {
        if (PatchProxy.isSupport(new Object[]{userStory}, this, f72398a, false, 83148, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory}, this, f72398a, false, 83148, new Class[]{UserStory.class}, Void.TYPE);
            return;
        }
        this.f72399b.uid = g.a(userStory);
        this.f4117d.c().postValue(a(userStory));
        this.f72399b.storyState = true;
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f72398a, false, 83149, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f72398a, false, 83149, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.base.utils.d.a(this.f4119f, exc2);
    }

    public StoryDetailController(FragmentActivity fragmentActivity, Fragment fragment) {
        super(fragmentActivity, fragment);
    }
}
