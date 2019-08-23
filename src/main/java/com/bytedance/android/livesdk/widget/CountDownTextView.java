package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.android.livesdk.utils.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0014J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nJ\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/android/livesdk/widget/CountDownTextView;", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mListener", "Lcom/bytedance/android/livesdk/widget/CountDownTextView$CountDownListener;", "mTimeSubscribe", "Lio/reactivex/disposables/Disposable;", "onDetachedFromWindow", "", "setCountDownListener", "listener", "startCountDown", "stringId", "start", "", "end", "CountDownListener", "liveutility_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class CountDownTextView extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18208a;

    /* renamed from: b  reason: collision with root package name */
    public Disposable f18209b;

    /* renamed from: c  reason: collision with root package name */
    public a f18210c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/android/livesdk/widget/CountDownTextView$CountDownListener;", "", "()V", "onChanger", "", "view", "Landroid/widget/TextView;", "count", "", "onStart", "onStop", "liveutility_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static abstract class a {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f18211c;

        public void a(@NotNull TextView textView) {
            TextView textView2 = textView;
            if (PatchProxy.isSupport(new Object[]{textView2}, this, f18211c, false, 14363, new Class[]{TextView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textView2}, this, f18211c, false, 14363, new Class[]{TextView.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(textView2, "view");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "aLong", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 13})
    public static final class b<T> implements Consumer<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18212a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CountDownTextView f18213b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f18214c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f18215d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f18216e;

        public b(CountDownTextView countDownTextView, int i, long j, long j2) {
            this.f18213b = countDownTextView;
            this.f18214c = i;
            this.f18215d = j;
            this.f18216e = j2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            if (PatchProxy.isSupport(new Object[]{l}, this, f18212a, false, 14364, new Class[]{Long.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{l}, this, f18212a, false, 14364, new Class[]{Long.class}, Void.TYPE);
                return;
            }
            if (l != null && l.longValue() == 0) {
                a aVar = this.f18213b.f18210c;
                if (aVar != null) {
                    TextView textView = this.f18213b;
                    if (PatchProxy.isSupport(new Object[]{textView}, aVar, a.f18211c, false, 14361, new Class[]{TextView.class}, Void.TYPE)) {
                        a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{textView}, aVar2, a.f18211c, false, 14361, new Class[]{TextView.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(textView, "view");
                    }
                }
            }
            CountDownTextView countDownTextView = this.f18213b;
            Resources resources = this.f18213b.getResources();
            int i = this.f18214c;
            long j = this.f18215d;
            Intrinsics.checkExpressionValueIsNotNull(l, "aLong");
            countDownTextView.setText(resources.getString(i, new Object[]{ah.a(j - l.longValue())}));
            a aVar3 = this.f18213b.f18210c;
            if (aVar3 != null) {
                TextView textView2 = this.f18213b;
                long longValue = this.f18215d - l.longValue();
                if (PatchProxy.isSupport(new Object[]{textView2, new Long(longValue)}, aVar3, a.f18211c, false, 14362, new Class[]{TextView.class, Long.TYPE}, Void.TYPE)) {
                    a aVar4 = aVar3;
                    PatchProxy.accessDispatch(new Object[]{textView2, new Long(longValue)}, aVar4, a.f18211c, false, 14362, new Class[]{TextView.class, Long.TYPE}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(textView2, "view");
                }
            }
            if (l.longValue() == this.f18215d - this.f18216e) {
                a aVar5 = this.f18213b.f18210c;
                if (aVar5 != null) {
                    aVar5.a(this.f18213b);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    public static final class c<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f18217a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @JvmOverloads
    public CountDownTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public CountDownTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f18208a, false, 14356, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18208a, false, 14356, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        Disposable disposable = this.f18209b;
        if (disposable != null && !disposable.isDisposed()) {
            Disposable disposable2 = this.f18209b;
            if (disposable2 != null) {
                disposable2.dispose();
            }
        }
    }

    public final void setCountDownListener(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f18208a, false, 14358, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f18208a, false, 14358, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "listener");
        this.f18210c = aVar2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountDownTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public /* synthetic */ CountDownTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
