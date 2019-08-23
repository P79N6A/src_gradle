package com.ss.android.ugc.aweme.story.feed.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.a.a;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.model.b;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.TimeZone;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72477a;

    /* renamed from: b  reason: collision with root package name */
    public c f72478b;

    /* renamed from: c  reason: collision with root package name */
    public UserStory f72479c;

    /* renamed from: d  reason: collision with root package name */
    public CompositeDisposable f72480d = new CompositeDisposable();

    /* renamed from: e  reason: collision with root package name */
    public int f72481e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f72482f = false;
    public boolean g = false;

    public final void a() {
        this.f72478b = null;
    }

    private boolean c() {
        if (this.f72481e == 0) {
            return true;
        }
        return false;
    }

    private String d() {
        if (!PatchProxy.isSupport(new Object[0], this, f72477a, false, 83655, new Class[0], String.class)) {
            return e();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f72477a, false, 83655, new Class[0], String.class);
    }

    private static String e() {
        if (PatchProxy.isSupport(new Object[0], null, f72477a, true, 83656, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f72477a, true, 83656, new Class[0], String.class);
        }
        return TimeZone.getDefault().getID();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72477a, false, 83661, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72477a, false, 83661, new Class[0], Void.TYPE);
            return;
        }
        this.f72480d.dispose();
    }

    public f(c cVar) {
        this.f72478b = cVar;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f72477a, false, 83650, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f72477a, false, 83650, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, -1);
    }

    public final void b(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f72477a, false, 83652, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f72477a, false, 83652, new Class[]{String.class}, Void.TYPE);
        } else if (!this.f72482f) {
            UserStory userStory = this.f72479c;
            if (PatchProxy.isSupport(new Object[]{userStory, 20}, null, g.f72502a, true, 83735, new Class[]{UserStory.class, Integer.TYPE}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{userStory, 20}, null, g.f72502a, true, 83735, new Class[]{UserStory.class, Integer.TYPE}, String.class);
            } else {
                str2 = g.f72503b.a(userStory, 20);
            }
            a.a().a(this.f72479c.getUser().getUid(), str2, 1).toObservable().observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<b>(20) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72486a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f72487b = 20;

                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f72486a, false, 83667, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f72486a, false, 83667, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    f.this.f72478b.b(th);
                    f.this.f72482f = false;
                }

                public final void onSubscribe(Disposable disposable) {
                    if (PatchProxy.isSupport(new Object[]{disposable}, this, f72486a, false, 83665, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable}, this, f72486a, false, 83665, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    f.this.f72480d.add(disposable);
                    f.this.f72482f = true;
                }

                public final /* synthetic */ void onNext(Object obj) {
                    long j;
                    b bVar = (b) obj;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f72486a, false, 83666, new Class[]{b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f72486a, false, 83666, new Class[]{b.class}, Void.TYPE);
                    } else if (bVar == null || bVar.getUserStory() == null) {
                        onError(new Exception());
                    } else {
                        UserStory userStory = bVar.getUserStory();
                        UserStory userStory2 = f.this.f72479c;
                        if (userStory2 != null) {
                            int i = this.f72487b;
                            if (PatchProxy.isSupport(new Object[]{userStory2, userStory, Integer.valueOf(i)}, null, g.f72502a, true, 83734, new Class[]{UserStory.class, UserStory.class, Integer.TYPE}, Long.TYPE)) {
                                j = ((Long) PatchProxy.accessDispatch(new Object[]{userStory2, userStory, Integer.valueOf(i)}, null, g.f72502a, true, 83734, new Class[]{UserStory.class, UserStory.class, Integer.TYPE}, Long.TYPE)).longValue();
                            } else {
                                j = g.f72503b.b(userStory2, userStory, i);
                            }
                            userStory2.setLastPos(j);
                            userStory2.setHasMore(userStory.getHasMore());
                            userStory2.setMaxCursor(userStory.getMaxCursor());
                            userStory2.setMinCursor(userStory.getMinCursor());
                            userStory = userStory2;
                        }
                        f.this.f72479c = userStory;
                        f.this.f72478b.c(f.this.f72479c);
                        f.this.f72482f = false;
                    }
                }
            });
        }
    }

    public final void c(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f72477a, false, 83654, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f72477a, false, 83654, new Class[]{String.class}, Void.TYPE);
        } else if (!this.g) {
            UserStory userStory = this.f72479c;
            if (PatchProxy.isSupport(new Object[]{userStory, 20}, null, g.f72502a, true, 83736, new Class[]{UserStory.class, Integer.TYPE}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{userStory, 20}, null, g.f72502a, true, 83736, new Class[]{UserStory.class, Integer.TYPE}, String.class);
            } else {
                str2 = g.f72503b.b(userStory, 20);
            }
            a.a().a(this.f72479c.getUser().getUid(), str2, 2).toObservable().observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<b>(20) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72489a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f72490b = 20;

                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f72489a, false, 83670, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f72489a, false, 83670, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    f.this.g = false;
                }

                public final void onSubscribe(Disposable disposable) {
                    if (PatchProxy.isSupport(new Object[]{disposable}, this, f72489a, false, 83668, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable}, this, f72489a, false, 83668, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    f.this.f72480d.add(disposable);
                    f.this.g = true;
                }

                public final /* synthetic */ void onNext(Object obj) {
                    long j;
                    b bVar = (b) obj;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f72489a, false, 83669, new Class[]{b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f72489a, false, 83669, new Class[]{b.class}, Void.TYPE);
                    } else if (bVar == null || bVar.getUserStory() == null) {
                        onError(new Exception());
                    } else {
                        UserStory userStory = bVar.getUserStory();
                        LogPbBean logPbBean = bVar.getLogPbBean();
                        if (PatchProxy.isSupport(new Object[]{userStory, logPbBean}, null, g.f72502a, true, 83717, new Class[]{UserStory.class, LogPbBean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{userStory, logPbBean}, null, g.f72502a, true, 83717, new Class[]{UserStory.class, LogPbBean.class}, Void.TYPE);
                        } else {
                            g.f72503b.a(userStory, logPbBean);
                        }
                        UserStory userStory2 = f.this.f72479c;
                        if (userStory2 == null) {
                            g.d(userStory);
                        } else {
                            int i = this.f72490b;
                            if (PatchProxy.isSupport(new Object[]{userStory2, userStory, Integer.valueOf(i)}, null, g.f72502a, true, 83733, new Class[]{UserStory.class, UserStory.class, Integer.TYPE}, Long.TYPE)) {
                                j = ((Long) PatchProxy.accessDispatch(new Object[]{userStory2, userStory, Integer.valueOf(i)}, null, g.f72502a, true, 83733, new Class[]{UserStory.class, UserStory.class, Integer.TYPE}, Long.TYPE)).longValue();
                            } else {
                                j = g.f72503b.a(userStory2, userStory, i);
                            }
                            userStory2.setCurPos(Long.valueOf(j).longValue());
                            userStory2.setMinCursor(userStory.getMinCursor());
                            userStory2.setMaxCursor(userStory.getMaxCursor());
                            userStory = userStory2;
                        }
                        f.this.f72479c = userStory;
                        f.this.f72478b.d(f.this.f72479c);
                        f.this.g = false;
                    }
                }
            });
        }
    }

    public final void a(String str, int i) {
        Observable observable;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f72477a, false, 83651, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f72477a, false, 83651, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (c()) {
            observable = a.a().a(str, 0, 0, 5, d(), 0, i).toObservable();
        } else {
            observable = a.a().a(0, 0, 5, str, d(), g.a(this.f72479c), i).toObservable();
        }
        final int i2 = i;
        observable.observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72483a;

            public final void onComplete() {
            }

            public final void onError(Throwable th) {
                Throwable th2 = th;
                if (PatchProxy.isSupport(new Object[]{th2}, this, f72483a, false, 83664, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th2}, this, f72483a, false, 83664, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                f.this.f72478b.a(th2);
            }

            public final void onSubscribe(Disposable disposable) {
                Disposable disposable2 = disposable;
                if (PatchProxy.isSupport(new Object[]{disposable2}, this, f72483a, false, 83662, new Class[]{Disposable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{disposable2}, this, f72483a, false, 83662, new Class[]{Disposable.class}, Void.TYPE);
                    return;
                }
                f.this.f72480d.add(disposable2);
            }

            public final /* synthetic */ void onNext(Object obj) {
                b bVar = (b) obj;
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f72483a, false, 83663, new Class[]{b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f72483a, false, 83663, new Class[]{b.class}, Void.TYPE);
                } else if (bVar == null || bVar.getUserStory() == null) {
                    f.this.f72478b.d();
                } else {
                    UserStory userStory = bVar.getUserStory();
                    if (i2 == 1 || i2 == 0) {
                        userStory.setReadFlag(i2);
                    }
                    g.d(userStory);
                    f.this.f72479c = userStory;
                    com.ss.android.ugc.aweme.story.detail.f.a().f72430b = bVar.getUserStory();
                    f.this.f72478b.a(f.this.f72479c);
                }
            }
        });
    }
}
