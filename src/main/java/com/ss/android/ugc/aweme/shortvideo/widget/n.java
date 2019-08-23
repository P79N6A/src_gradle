package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.edit.cover.b;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.subjects.ReplaySubject;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u001a\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u0013X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/widget/VideoCoverDataSource;", "", "generator", "Lcom/ss/android/ugc/aweme/photomovie/edit/cover/IVideoCoverGenerator;", "width", "", "height", "coverSize", "(Lcom/ss/android/ugc/aweme/photomovie/edit/cover/IVideoCoverGenerator;III)V", "hasSubscribed", "", "replaySubject", "Lio/reactivex/subjects/ReplaySubject;", "Lkotlin/Pair;", "Landroid/graphics/Bitmap;", "size", "getSize", "()I", "sourceObservable", "Lio/reactivex/Observable;", "videoPaths", "", "", "getVideoPaths", "()Ljava/util/List;", "asObservable", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71471a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f71472c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final int f71473b;

    /* renamed from: d  reason: collision with root package name */
    private final b f71474d;

    /* renamed from: e  reason: collision with root package name */
    private final Observable<Pair<Integer, Bitmap>> f71475e;

    /* renamed from: f  reason: collision with root package name */
    private final ReplaySubject<Pair<Integer, Bitmap>> f71476f;
    private boolean g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/widget/VideoCoverDataSource$Companion;", "", "()V", "DEBUG", "", "TAG", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public final Observable<Pair<Integer, Bitmap>> a() {
        if (PatchProxy.isSupport(new Object[0], this, f71471a, false, 81480, new Class[0], Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[0], this, f71471a, false, 81480, new Class[0], Observable.class);
        }
        if (!this.g) {
            this.f71475e.subscribe((Observer<? super T>) this.f71476f);
            this.g = true;
        }
        return this.f71476f;
    }

    public n(@NotNull final b bVar, final int i, final int i2, final int i3) {
        Intrinsics.checkParameterIsNotNull(bVar, "generator");
        ReplaySubject<Pair<Integer, Bitmap>> create = ReplaySubject.create();
        Intrinsics.checkExpressionValueIsNotNull(create, "ReplaySubject.create()");
        this.f71476f = create;
        this.f71474d = bVar;
        Observable<Pair<Integer, Bitmap>> create2 = Observable.create(new ObservableOnSubscribe<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71477a;

            public final void subscribe(@NotNull final ObservableEmitter<Pair<Integer, Bitmap>> observableEmitter) {
                if (PatchProxy.isSupport(new Object[]{observableEmitter}, this, f71477a, false, 81481, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{observableEmitter}, this, f71477a, false, 81481, new Class[]{ObservableEmitter.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
                final AtomicInteger atomicInteger = new AtomicInteger();
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = 0;
                bVar.a(i, i2, new b.a(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f71482a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f71483b;

                    {
                        this.f71483b = r1;
                    }

                    public final void a(@Nullable Bitmap bitmap) {
                        if (PatchProxy.isSupport(new Object[]{bitmap}, this, f71482a, false, 81482, new Class[]{Bitmap.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bitmap}, this, f71482a, false, 81482, new Class[]{Bitmap.class}, Void.TYPE);
                            return;
                        }
                        Ref.IntRef intRef = intRef;
                        int i = intRef.element;
                        intRef.element = i + 1;
                        observableEmitter.onNext(new Pair(Integer.valueOf(i), bitmap));
                        if (atomicInteger.incrementAndGet() == i3) {
                            observableEmitter.onComplete();
                        }
                    }
                });
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(create2, "Observable.create { emit…}\n            }\n        }");
        this.f71475e = create2;
        this.f71473b = i3;
    }
}
