package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020+H\u0016J\b\u0010B\u001a\u00020+H\u0016J\b\u0010C\u001a\u00020+H\u0016J\u001c\u0010D\u001a\u00020+2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010FH\u0016J\b\u0010H\u001a\u00020+H\u0014J\u0014\u0010I\u001a\u00020+2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020+0*J\u0014\u0010K\u001a\u00020+2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020+0*J\b\u0010M\u001a\u00020+H\u0016J\b\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020@H\u0002J\b\u0010Q\u001a\u00020OH\u0002R\u0019\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n \f*\u0004\u0018\u00010\u00140\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0019\u0010 \u001a\n \f*\u0004\u0018\u00010\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u0016\u0010/\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0019\u00100\u001a\n \f*\u0004\u0018\u00010101¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0019\u0010:\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u000eR\u0011\u0010<\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0012R\u000e\u0010>\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/FissionFeedPendantView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/ugc/aweme/feed/ui/IFeedPendant;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bigImage", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "getBigImage", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "bigWidth", "", "getBigWidth", "()F", "closeBtn", "Landroid/widget/ImageView;", "getCloseBtn", "()Landroid/widget/ImageView;", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "collapsed", "getCollapsed", "setCollapsed", "content", "getContent", "()Landroid/widget/FrameLayout;", "disposable", "Lio/reactivex/disposables/Disposable;", "getDisposable", "()Lio/reactivex/disposables/Disposable;", "setDisposable", "(Lio/reactivex/disposables/Disposable;)V", "handler", "Lkotlin/Function0;", "", "imageLoaded", "getImageLoaded", "setImageLoaded", "onImageLoaded", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "set", "Landroid/animation/AnimatorSet;", "getSet", "()Landroid/animation/AnimatorSet;", "setSet", "(Landroid/animation/AnimatorSet;)V", "smallImage", "getSmallImage", "smallWidth", "getSmallWidth", "translateRightLength", "changeImg", "Landroid/animation/ValueAnimator;", "collapse", "expand", "hide", "loadImage", "bigImageUrl", "Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UrlModel;", "smallImageUrl", "onDetachedFromWindow", "setOnImageClickListener", "onclick", "setOnImageLoadedListener", "loaded", "show", "slideBack", "Landroid/animation/Animator;", "slideLeft", "slideRight", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class af extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46416a;
    public static final a o = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final FrameLayout f46417b;

    /* renamed from: c  reason: collision with root package name */
    final RemoteImageView f46418c;

    /* renamed from: d  reason: collision with root package name */
    final RemoteImageView f46419d;

    /* renamed from: e  reason: collision with root package name */
    final ImageView f46420e;

    /* renamed from: f  reason: collision with root package name */
    public final float f46421f;
    final float g;
    final float h;
    public Function0<Unit> i;
    public Function0<Unit> j;
    boolean k;
    boolean l;
    @Nullable
    Disposable m;
    @Nullable
    AnimatorSet n;
    private final View p;
    private boolean q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/FissionFeedPendantView$Companion;", "", "()V", "CHANGE_IMAGE_TIME", "", "CLOSE_BTN_ANIMATE_TIME", "TRANSLATE_BACT_TIME", "TRANSLATE_LEFT_DURATION", "TRANSLATE_RIGHT_DURATION", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/FissionFeedPendantView$changeImg$adaper$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46428a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ af f46429b;

        public final void onAnimationEnd(@Nullable Animator animator) {
        }

        b(af afVar) {
            this.f46429b = afVar;
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f46428a, false, 42781, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f46428a, false, 42781, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            RemoteImageView bigImage = this.f46429b.getBigImage();
            Intrinsics.checkExpressionValueIsNotNull(bigImage, "bigImage");
            bigImage.setVisibility(8);
            RemoteImageView smallImage = this.f46429b.getSmallImage();
            Intrinsics.checkExpressionValueIsNotNull(smallImage, "smallImage");
            smallImage.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "t1", "t2", "apply"}, k = 3, mv = {1, 1, 15})
    static final class c<T1, T2, R> implements BiFunction<String, String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46430a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f46431b = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f46430a, false, 42782, new Class[]{String.class, String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f46430a, false, 42782, new Class[]{String.class, String.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(str, "t1");
            Intrinsics.checkParameterIsNotNull(str2, "t2");
            return str + str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Consumer<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ af f46433b;

        d(af afVar) {
            this.f46433b = afVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            if (PatchProxy.isSupport(new Object[]{str}, this, f46432a, false, 42783, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f46432a, false, 42783, new Class[]{String.class}, Void.TYPE);
                return;
            }
            this.f46433b.setImageLoaded(true);
            Function0<Unit> function0 = this.f46433b.j;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements ObservableOnSubscribe<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46434a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ af f46435b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UrlModel f46436c;

        e(af afVar, UrlModel urlModel) {
            this.f46435b = afVar;
            this.f46436c = urlModel;
        }

        public final void subscribe(@NotNull final ObservableEmitter<String> observableEmitter) {
            if (PatchProxy.isSupport(new Object[]{observableEmitter}, this, f46434a, false, 42784, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{observableEmitter}, this, f46434a, false, 42784, new Class[]{ObservableEmitter.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
            com.ss.android.ugc.aweme.base.c.a(this.f46435b.getBigImage(), this.f46436c, (ControllerListener<ImageInfo>) new BaseControllerListener<ImageInfo>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46437a;

                public final void onFailure(@Nullable String str, @Nullable Throwable th) {
                    Throwable th2 = th;
                    if (PatchProxy.isSupport(new Object[]{str, th2}, this, f46437a, false, 42786, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, th2}, this, f46437a, false, 42786, new Class[]{String.class, Throwable.class}, Void.TYPE);
                        return;
                    }
                    super.onFailure(str, th);
                    ObservableEmitter observableEmitter = observableEmitter;
                    if (th2 == null) {
                        Intrinsics.throwNpe();
                    }
                    observableEmitter.onError(th2);
                }

                public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                    ImageInfo imageInfo = (ImageInfo) obj;
                    if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f46437a, false, 42785, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f46437a, false, 42785, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                        return;
                    }
                    observableEmitter.onNext("");
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements ObservableOnSubscribe<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46439a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ af f46440b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UrlModel f46441c;

        f(af afVar, UrlModel urlModel) {
            this.f46440b = afVar;
            this.f46441c = urlModel;
        }

        public final void subscribe(@NotNull final ObservableEmitter<String> observableEmitter) {
            if (PatchProxy.isSupport(new Object[]{observableEmitter}, this, f46439a, false, 42787, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{observableEmitter}, this, f46439a, false, 42787, new Class[]{ObservableEmitter.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
            com.ss.android.ugc.aweme.base.c.a(this.f46440b.getSmallImage(), this.f46441c, (ControllerListener<ImageInfo>) new BaseControllerListener<ImageInfo>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46442a;

                public final void onFailure(@Nullable String str, @Nullable Throwable th) {
                    Throwable th2 = th;
                    if (PatchProxy.isSupport(new Object[]{str, th2}, this, f46442a, false, 42789, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, th2}, this, f46442a, false, 42789, new Class[]{String.class, Throwable.class}, Void.TYPE);
                        return;
                    }
                    super.onFailure(str, th);
                    ObservableEmitter observableEmitter = observableEmitter;
                    if (th2 == null) {
                        Intrinsics.throwNpe();
                    }
                    observableEmitter.onError(th2);
                }

                public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                    ImageInfo imageInfo = (ImageInfo) obj;
                    if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f46442a, false, 42788, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f46442a, false, 42788, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                        return;
                    }
                    observableEmitter.onNext("");
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46444a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ af f46445b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f46446c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f46447d;

        g(af afVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            this.f46445b = afVar;
            this.f46446c = floatRef;
            this.f46447d = floatRef2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46444a, false, 42790, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46444a, false, 42790, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            FrameLayout content = this.f46445b.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, PushConstants.CONTENT);
            float f2 = this.f46446c.element;
            float f3 = this.f46447d.element;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                content.setTranslationX(f2 + (f3 * ((Float) animatedValue).floatValue()));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/FissionFeedPendantView$slideBack$listener$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46448a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ af f46449b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f46450c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f46451d;

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f46448a, false, 42791, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f46448a, false, 42791, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f46450c.element = -this.f46449b.getSmallWidth();
            this.f46451d.element = this.f46449b.getSmallWidth();
        }

        h(af afVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            this.f46449b = afVar;
            this.f46450c = floatRef;
            this.f46451d = floatRef2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ af f46453b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f46454c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f46455d;

        i(af afVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            this.f46453b = afVar;
            this.f46454c = floatRef;
            this.f46455d = floatRef2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46452a, false, 42792, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46452a, false, 42792, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            FrameLayout content = this.f46453b.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, PushConstants.CONTENT);
            float f2 = this.f46454c.element;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                content.setTranslationX(f2 - (((Float) animatedValue).floatValue() * this.f46455d.element));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/FissionFeedPendantView$slideLeft$adaper$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class j extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ af f46457b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f46458c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f46459d;

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f46456a, false, 42793, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f46456a, false, 42793, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Ref.FloatRef floatRef = this.f46458c;
            FrameLayout content = this.f46457b.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, PushConstants.CONTENT);
            floatRef.element = content.getTranslationX();
            this.f46459d.element = this.f46458c.element + this.f46457b.getBigWidth();
        }

        j(af afVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            this.f46457b = afVar;
            this.f46458c = floatRef;
            this.f46459d = floatRef2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class k implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46460a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ af f46461b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f46462c;

        k(af afVar, float f2) {
            this.f46461b = afVar;
            this.f46462c = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46460a, false, 42794, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46460a, false, 42794, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            FrameLayout content = this.f46461b.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, PushConstants.CONTENT);
            float f2 = this.f46462c;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                content.setTranslationX(f2 + (((Float) animatedValue).floatValue() * this.f46461b.f46421f));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public final RemoteImageView getBigImage() {
        return this.f46418c;
    }

    public final float getBigWidth() {
        return this.g;
    }

    public final ImageView getCloseBtn() {
        return this.f46420e;
    }

    public final boolean getClosed() {
        return this.q;
    }

    public final boolean getCollapsed() {
        return this.k;
    }

    public final FrameLayout getContent() {
        return this.f46417b;
    }

    @Nullable
    public final Disposable getDisposable() {
        return this.m;
    }

    public final boolean getImageLoaded() {
        return this.l;
    }

    public final View getRoot() {
        return this.p;
    }

    @Nullable
    public final AnimatorSet getSet() {
        return this.n;
    }

    public final RemoteImageView getSmallImage() {
        return this.f46419d;
    }

    public final float getSmallWidth() {
        return this.h;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46416a, false, 42772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46416a, false, 42772, new Class[0], Void.TYPE);
            return;
        }
        this.f46417b.setVisibility(8);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f46416a, false, 42774, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46416a, false, 42774, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Disposable disposable = this.m;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46416a, false, 42771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46416a, false, 42771, new Class[0], Void.TYPE);
            return;
        }
        if (this.l) {
            com.ss.android.ugc.aweme.main.guide.a a2 = com.ss.android.ugc.aweme.main.guide.a.h.a();
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            a2.b(context);
            this.f46417b.setVisibility(0);
        }
    }

    public final void setClosed(boolean z) {
        this.q = z;
    }

    public final void setCollapsed(boolean z) {
        this.k = z;
    }

    public final void setDisposable(@Nullable Disposable disposable) {
        this.m = disposable;
    }

    public final void setImageLoaded(boolean z) {
        this.l = z;
    }

    public final void setSet(@Nullable AnimatorSet animatorSet) {
        this.n = animatorSet;
    }

    public final void setOnImageClickListener(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f46416a, false, 42765, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f46416a, false, 42765, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "onclick");
        this.i = function02;
    }

    public final void setOnImageLoadedListener(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f46416a, false, 42766, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f46416a, false, 42766, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "loaded");
        this.j = function02;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private af(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.p = LayoutInflater.from(context).inflate(C0906R.layout.md, this, true);
        this.f46417b = (FrameLayout) this.p.findViewById(C0906R.id.bx0);
        this.f46418c = (RemoteImageView) this.f46417b.findViewById(C0906R.id.ky);
        this.f46419d = (RemoteImageView) this.f46417b.findViewById(C0906R.id.cs9);
        this.f46420e = (ImageView) this.f46417b.findViewById(C0906R.id.tm);
        this.f46421f = com.ss.android.ttve.utils.c.a(context, 10.0f);
        this.g = com.ss.android.ttve.utils.c.a(context, 100.0f);
        this.h = com.ss.android.ttve.utils.c.a(context, 36.0f);
        this.f46420e.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46422a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ af f46423b;

            {
                this.f46423b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46422a, false, 42778, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46422a, false, 42778, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                this.f46423b.b();
                this.f46423b.setClosed(true);
            }
        });
        this.f46418c.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46424a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ af f46425b;

            {
                this.f46425b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46424a, false, 42779, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46424a, false, 42779, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                Function0<Unit> function0 = this.f46425b.i;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        this.f46419d.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46426a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ af f46427b;

            {
                this.f46427b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46426a, false, 42780, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46426a, false, 42780, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                Function0<Unit> function0 = this.f46427b.i;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
    }

    public /* synthetic */ af(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, null, 0);
    }
}
