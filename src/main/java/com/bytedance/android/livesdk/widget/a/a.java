package com.bytedance.android.livesdk.widget.a;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.j;
import com.bytedance.android.live.core.widget.LiveEditText;
import com.bytedance.android.live.core.widget.LiveTextView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.n;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.v.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18376a;

    /* renamed from: b  reason: collision with root package name */
    public PublishSubject<b> f18377b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, b> f18378c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18379d;

    /* renamed from: e  reason: collision with root package name */
    private File f18380e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f18381f;

    /* renamed from: com.bytedance.android.livesdk.widget.a.a$a  reason: collision with other inner class name */
    public static final class C0128a implements h.b<j> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18389a;

        @NonNull
        public final h.b.a<j> a(h.b.a<j> aVar) {
            h.b.a<j> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f18389a, false, 14828, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new a((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f18389a, false, 14828, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Typeface f18390a;

        /* renamed from: b  reason: collision with root package name */
        public String f18391b;

        private b(String str, Typeface typeface) {
            this.f18390a = typeface;
            this.f18391b = str;
        }

        /* synthetic */ b(String str, Typeface typeface, byte b2) {
            this(str, typeface);
        }
    }

    private a() {
        this.f18377b = PublishSubject.create();
        this.f18378c = new ConcurrentHashMap();
    }

    public final Single<Typeface> b() {
        if (PatchProxy.isSupport(new Object[0], this, f18376a, false, 14813, new Class[0], Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[0], this, f18376a, false, 14813, new Class[0], Single.class);
        }
        String str = ((n) LiveConfigSettingKeys.LIVE_CUSTOM_FONT_CONFIG.a()).f11142b;
        b bVar = this.f18378c.get(str);
        if (bVar != null) {
            return Single.just(bVar.f18390a).observeOn(AndroidSchedulers.mainThread());
        }
        return this.f18377b.filter(new b(str)).map(c.f18395b).firstOrError().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f18376a, false, 14816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18376a, false, 14816, new Class[0], Void.TYPE);
        } else if (!this.f18379d) {
            n nVar = (n) LiveConfigSettingKeys.LIVE_CUSTOM_FONT_CONFIG.a();
            final String str = nVar.f11142b;
            if (!TextUtils.isEmpty(str) && this.f18378c.get(str) == null) {
                ImageModel imageModel = nVar.f11143c;
                if (imageModel != null) {
                    String str2 = null;
                    Iterator<String> it2 = imageModel.getUrls().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String next = it2.next();
                        if (!TextUtils.isEmpty(next)) {
                            str2 = next;
                            break;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        this.f18379d = true;
                        DownloadTask url = Downloader.with(TTLiveSDKContext.getHostService().a().a()).url(str2);
                        url.name(str + ".ttf").savePath(this.f18380e.getAbsolutePath()).mainThreadListener(new AbsDownloadListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f18386a;

                            public final void onSuccessed(DownloadInfo downloadInfo) {
                                if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f18386a, false, 14826, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f18386a, false, 14826, new Class[]{DownloadInfo.class}, Void.TYPE);
                                    return;
                                }
                                super.onSuccessed(downloadInfo);
                                a.this.f18379d = false;
                                try {
                                    a.this.f18377b.onNext(new b(str, Typeface.createFromFile(downloadInfo.getTargetFilePath()), (byte) 0));
                                } catch (Exception e2) {
                                    com.bytedance.android.live.core.c.a.a("LiveFontManager", "font download succeed with exception!!", (Throwable) e2);
                                }
                            }

                            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                                BaseException baseException2 = baseException;
                                if (PatchProxy.isSupport(new Object[]{downloadInfo, baseException2}, this, f18386a, false, 14827, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{downloadInfo, baseException2}, this, f18386a, false, 14827, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE);
                                    return;
                                }
                                super.onFailed(downloadInfo, baseException);
                                a.this.f18379d = false;
                                com.bytedance.android.live.core.c.a.a("LiveFontManager", (Throwable) baseException2);
                            }
                        }).download();
                    }
                }
            }
        }
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f18376a, false, 14812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18376a, false, 14812, new Class[0], Void.TYPE);
        } else if (!this.f18381f) {
            LiveTextView.setFontManager(this);
            LiveEditText.setFontManager(this);
            if (com.bytedance.android.live.uikit.a.a.j()) {
                LiveTextView.setEnableHostTypeface(true);
                LiveEditText.setEnableHostTypeface(true);
            }
            Context a2 = TTLiveSDKContext.getHostService().a().a();
            if (PatchProxy.isSupport(new Object[]{a2}, null, f18376a, true, 14817, new Class[]{Context.class}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{a2}, null, f18376a, true, 14817, new Class[]{Context.class}, String.class);
            } else {
                if (a2.getExternalCacheDir() != null) {
                    str = r4.getAbsolutePath() + "/fonts";
                } else {
                    String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                    str = absolutePath + "/Android/data/" + a2.getPackageName() + "/cache/fonts";
                }
            }
            this.f18380e = new File(str);
            if (com.bytedance.android.live.core.utils.h.a(this.f18380e)) {
                this.f18377b.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<b>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f18382a;

                    public final void onComplete() {
                    }

                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(Disposable disposable) {
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        b bVar = (b) obj;
                        if (PatchProxy.isSupport(new Object[]{bVar}, this, f18382a, false, 14822, new Class[]{b.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar}, this, f18382a, false, 14822, new Class[]{b.class}, Void.TYPE);
                            return;
                        }
                        a.this.f18378c.put(bVar.f18391b, bVar);
                    }
                });
                if (PatchProxy.isSupport(new Object[0], this, f18376a, false, 14815, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f18376a, false, 14815, new Class[0], Void.TYPE);
                } else {
                    File[] listFiles = this.f18380e.listFiles();
                    if (listFiles == null) {
                        c();
                    } else {
                        Observable.fromArray(listFiles).subscribeOn(Schedulers.io()).filter(d.f18397b).map(e.f18399b).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<b>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f18384a;

                            public final void onSubscribe(Disposable disposable) {
                            }

                            public final void onComplete() {
                                if (PatchProxy.isSupport(new Object[0], this, f18384a, false, 14825, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f18384a, false, 14825, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (!com.bytedance.android.live.uikit.a.a.c()) {
                                    a.this.c();
                                }
                            }

                            public final void onError(Throwable th) {
                                if (PatchProxy.isSupport(new Object[]{th}, this, f18384a, false, 14824, new Class[]{Throwable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{th}, this, f18384a, false, 14824, new Class[]{Throwable.class}, Void.TYPE);
                                    return;
                                }
                                a.this.c();
                            }

                            public final /* synthetic */ void onNext(Object obj) {
                                b bVar = (b) obj;
                                if (PatchProxy.isSupport(new Object[]{bVar}, this, f18384a, false, 14823, new Class[]{b.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f18384a, false, 14823, new Class[]{b.class}, Void.TYPE);
                                    return;
                                }
                                a.this.f18377b.onNext(bVar);
                            }
                        });
                    }
                }
                this.f18381f = true;
            }
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final Typeface a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18376a, false, 14814, new Class[]{Integer.TYPE}, Typeface.class)) {
            return TTLiveSDKContext.getHostService().c().b(i);
        }
        return (Typeface) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18376a, false, 14814, new Class[]{Integer.TYPE}, Typeface.class);
    }
}
