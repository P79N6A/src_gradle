package com.ss.android.ugc.aweme.feed.ui;

import a.g;
import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgUserLimit;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\"H\u0002J\u0018\u0010+\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019H\u0002J\u0010\u0010,\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/FissionFeedPendantManager;", "", "layout", "Landroid/view/View;", "fllFeedFragmentPanel", "Lcom/ss/android/ugc/aweme/feed/panel/FullFeedFragmentPanel;", "setting", "Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UgAwemeActivitySetting;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/feed/panel/FullFeedFragmentPanel;Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UgAwemeActivitySetting;)V", "mActivitySetting", "getMActivitySetting", "()Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UgAwemeActivitySetting;", "mFissionFeedPendantView", "Lcom/ss/android/ugc/aweme/feed/ui/FissionFeedPendantView;", "getMFissionFeedPendantView", "()Lcom/ss/android/ugc/aweme/feed/ui/FissionFeedPendantView;", "setMFissionFeedPendantView", "(Lcom/ss/android/ugc/aweme/feed/ui/FissionFeedPendantView;)V", "mFullFeedFragmentPanel", "getMFullFeedFragmentPanel", "()Lcom/ss/android/ugc/aweme/feed/panel/FullFeedFragmentPanel;", "mLayout", "getMLayout", "()Landroid/view/View;", "scrolledUpCount", "", "getScrolledUpCount$main_douyinCnRelease", "()I", "setScrolledUpCount$main_douyinCnRelease", "(I)V", "threshold", "getThreshold$main_douyinCnRelease", "setThreshold$main_douyinCnRelease", "dealPageSelected", "", "previousPos", "currentPos", "isCurrentAwemeAd", "", "shouldShowFissionFeedPendant", "context", "Landroid/content/Context;", "tryHideFissionFeedPendant", "tryReshowOrCollapseFissionFeedPendant", "tryShowFissionFeedPendant", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46404a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final UgAwemeActivitySetting f46405b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public af f46406c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final View f46407d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final FullFeedFragmentPanel f46408e;

    /* renamed from: f  reason: collision with root package name */
    public int f46409f;
    public int g = 3;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class a<V> implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46410a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ae f46411b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f46412c;

        a(ae aeVar, Context context) {
            this.f46411b = aeVar;
            this.f46412c = context;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, f46410a, false, 42761, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46410a, false, 42761, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = this.f46411b.a(this.f46412c);
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class b<TTaskResult, TContinuationResult> implements g<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ae f46414b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f46415c;

        b(ae aeVar, Context context) {
            this.f46414b = aeVar;
            this.f46415c = context;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6 A[Catch:{ a -> 0x0187 }] */
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void then(a.i<java.lang.Boolean> r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f46413a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r3 = 0
                r4 = 42762(0xa70a, float:5.9922E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003b
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f46413a
                r3 = 0
                r4 = 42762(0xa70a, float:5.9922E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r1 = r18
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Void r0 = (java.lang.Void) r0
                return r0
            L_0x003b:
                java.lang.String r0 = "task"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
                java.lang.Object r0 = r19.e()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                java.lang.String r1 = "shouldShow"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                boolean r0 = r0.booleanValue()
                r1 = 0
                if (r0 == 0) goto L_0x0187
                com.ss.android.ugc.aweme.feed.ui.ae r0 = r7.f46414b
                com.ss.android.ugc.aweme.feed.ui.af r2 = new com.ss.android.ugc.aweme.feed.ui.af
                android.content.Context r3 = r7.f46415c
                r4 = 6
                r2.<init>(r3, r1, r10, r4)
                r0.f46406c = r2
                com.ss.android.ugc.aweme.feed.ui.ae r0 = r7.f46414b
                android.view.View r0 = r0.f46407d
                boolean r0 = r0 instanceof android.widget.FrameLayout
                if (r0 == 0) goto L_0x0075
                com.ss.android.ugc.aweme.feed.ui.ae r0 = r7.f46414b
                android.view.View r0 = r0.f46407d
                android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
                com.ss.android.ugc.aweme.feed.ui.ae r2 = r7.f46414b
                com.ss.android.ugc.aweme.feed.ui.af r2 = r2.f46406c
                android.view.View r2 = (android.view.View) r2
                r0.addView(r2)
            L_0x0075:
                com.ss.android.ugc.aweme.feed.ui.ae r0 = r7.f46414b
                com.ss.android.ugc.aweme.feed.ui.af r0 = r0.f46406c
                if (r0 == 0) goto L_0x0085
                com.ss.android.ugc.aweme.feed.ui.ae$b$1 r2 = new com.ss.android.ugc.aweme.feed.ui.ae$b$1
                r2.<init>(r7)
                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                r0.setOnImageClickListener(r2)
            L_0x0085:
                com.ss.android.ugc.aweme.feed.ui.ae r0 = r7.f46414b
                com.ss.android.ugc.aweme.feed.ui.af r0 = r0.f46406c
                if (r0 == 0) goto L_0x0095
                com.ss.android.ugc.aweme.feed.ui.ae$b$2 r2 = new com.ss.android.ugc.aweme.feed.ui.ae$b$2
                r2.<init>(r7)
                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                r0.setOnImageLoadedListener(r2)
            L_0x0095:
                com.ss.android.ugc.aweme.feed.ui.ae r0 = r7.f46414b     // Catch:{ a -> 0x0187 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r0.f46405b     // Catch:{ a -> 0x0187 }
                if (r0 == 0) goto L_0x00a6
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r0 = r0.getNewFeedPendant()     // Catch:{ a -> 0x0187 }
                if (r0 == 0) goto L_0x00a6
                java.util.List r0 = r0.getResourceUrl()     // Catch:{ a -> 0x0187 }
                goto L_0x00a7
            L_0x00a6:
                r0 = r1
            L_0x00a7:
                if (r0 == 0) goto L_0x0187
                int r2 = r0.size()     // Catch:{ a -> 0x0187 }
                r3 = 2
                if (r2 != r3) goto L_0x0187
                com.ss.android.ugc.aweme.feed.ui.ae r2 = r7.f46414b     // Catch:{ a -> 0x0187 }
                com.ss.android.ugc.aweme.feed.ui.af r2 = r2.f46406c     // Catch:{ a -> 0x0187 }
                if (r2 == 0) goto L_0x0187
                java.lang.Object r4 = r0.get(r10)     // Catch:{ a -> 0x0187 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r4 = (com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel) r4     // Catch:{ a -> 0x0187 }
                java.lang.Object r0 = r0.get(r9)     // Catch:{ a -> 0x0187 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r0 = (com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel) r0     // Catch:{ a -> 0x0187 }
                java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ a -> 0x0187 }
                r11[r10] = r4     // Catch:{ a -> 0x0187 }
                r11[r9] = r0     // Catch:{ a -> 0x0187 }
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ui.af.f46416a     // Catch:{ a -> 0x0187 }
                r14 = 0
                r15 = 42775(0xa717, float:5.994E-41)
                java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ a -> 0x0187 }
                java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel> r6 = com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel.class
                r5[r10] = r6     // Catch:{ a -> 0x0187 }
                java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel> r6 = com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel.class
                r5[r9] = r6     // Catch:{ a -> 0x0187 }
                java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ a -> 0x0187 }
                r12 = r2
                r16 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ a -> 0x0187 }
                if (r5 == 0) goto L_0x0103
                java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ a -> 0x0187 }
                r11[r10] = r4     // Catch:{ a -> 0x0187 }
                r11[r9] = r0     // Catch:{ a -> 0x0187 }
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ui.af.f46416a     // Catch:{ a -> 0x0187 }
                r14 = 0
                r15 = 42775(0xa717, float:5.994E-41)
                java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ a -> 0x0187 }
                java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel> r3 = com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel.class
                r0[r10] = r3     // Catch:{ a -> 0x0187 }
                java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel> r3 = com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel.class
                r0[r9] = r3     // Catch:{ a -> 0x0187 }
                java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ a -> 0x0187 }
                r12 = r2
                r16 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ a -> 0x0187 }
                goto L_0x0187
            L_0x0103:
                if (r4 == 0) goto L_0x0187
                if (r0 == 0) goto L_0x0187
                com.ss.android.ugc.aweme.base.model.UrlModel r3 = new com.ss.android.ugc.aweme.base.model.UrlModel     // Catch:{ a -> 0x0187 }
                r3.<init>()     // Catch:{ a -> 0x0187 }
                java.lang.String r5 = r4.getUri()     // Catch:{ a -> 0x0187 }
                r3.setUri(r5)     // Catch:{ a -> 0x0187 }
                java.util.List r4 = r4.getUrlList()     // Catch:{ a -> 0x0187 }
                r3.setUrlList(r4)     // Catch:{ a -> 0x0187 }
                com.ss.android.ugc.aweme.base.model.UrlModel r4 = new com.ss.android.ugc.aweme.base.model.UrlModel     // Catch:{ a -> 0x0187 }
                r4.<init>()     // Catch:{ a -> 0x0187 }
                java.lang.String r5 = r0.getUri()     // Catch:{ a -> 0x0187 }
                r4.setUri(r5)     // Catch:{ a -> 0x0187 }
                java.util.List r0 = r0.getUrlList()     // Catch:{ a -> 0x0187 }
                r4.setUrlList(r0)     // Catch:{ a -> 0x0187 }
                com.ss.android.ugc.aweme.feed.ui.af$e r0 = new com.ss.android.ugc.aweme.feed.ui.af$e     // Catch:{ a -> 0x0187 }
                r0.<init>(r2, r3)     // Catch:{ a -> 0x0187 }
                io.reactivex.ObservableOnSubscribe r0 = (io.reactivex.ObservableOnSubscribe) r0     // Catch:{ a -> 0x0187 }
                io.reactivex.Observable r0 = io.reactivex.Observable.create(r0)     // Catch:{ a -> 0x0187 }
                r5 = 3
                io.reactivex.Observable r0 = r0.retry((long) r5)     // Catch:{ a -> 0x0187 }
                java.lang.String r3 = "Observable.create(Observ…              }).retry(3)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)     // Catch:{ a -> 0x0187 }
                com.ss.android.ugc.aweme.feed.ui.af$f r3 = new com.ss.android.ugc.aweme.feed.ui.af$f     // Catch:{ a -> 0x0187 }
                r3.<init>(r2, r4)     // Catch:{ a -> 0x0187 }
                io.reactivex.ObservableOnSubscribe r3 = (io.reactivex.ObservableOnSubscribe) r3     // Catch:{ a -> 0x0187 }
                io.reactivex.Observable r3 = io.reactivex.Observable.create(r3)     // Catch:{ a -> 0x0187 }
                io.reactivex.Observable r3 = r3.retry((long) r5)     // Catch:{ a -> 0x0187 }
                java.lang.String r4 = "Observable.create(Observ…              }).retry(3)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ a -> 0x0187 }
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0     // Catch:{ a -> 0x0187 }
                io.reactivex.ObservableSource r3 = (io.reactivex.ObservableSource) r3     // Catch:{ a -> 0x0187 }
                com.ss.android.ugc.aweme.feed.ui.af$c r4 = com.ss.android.ugc.aweme.feed.ui.af.c.f46431b     // Catch:{ a -> 0x0187 }
                io.reactivex.functions.BiFunction r4 = (io.reactivex.functions.BiFunction) r4     // Catch:{ a -> 0x0187 }
                io.reactivex.Observable r0 = io.reactivex.Observable.zip(r0, r3, r4)     // Catch:{ a -> 0x0187 }
                com.ss.android.ugc.aweme.feed.ui.af$d r3 = new com.ss.android.ugc.aweme.feed.ui.af$d     // Catch:{ a -> 0x0187 }
                r3.<init>(r2)     // Catch:{ a -> 0x0187 }
                io.reactivex.functions.Consumer r3 = (io.reactivex.functions.Consumer) r3     // Catch:{ a -> 0x0187 }
                io.reactivex.disposables.Disposable r0 = r0.subscribe((io.reactivex.functions.Consumer<? super T>) r3)     // Catch:{ a -> 0x0187 }
                r2.m = r0     // Catch:{ a -> 0x0187 }
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r2.f46418c     // Catch:{ a -> 0x0187 }
                android.graphics.drawable.Drawable r0 = r0.getDrawable()     // Catch:{ a -> 0x0187 }
                r0.setVisible(r9, r10)     // Catch:{ a -> 0x0187 }
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r2.f46419d     // Catch:{ a -> 0x0187 }
                java.lang.String r2 = "smallImage"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)     // Catch:{ a -> 0x0187 }
                android.graphics.drawable.Drawable r0 = r0.getDrawable()     // Catch:{ a -> 0x0187 }
                r0.setVisible(r9, r10)     // Catch:{ a -> 0x0187 }
            L_0x0187:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.ae.b.then(a.i):java.lang.Void");
        }
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f46404a, false, 42757, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46404a, false, 42757, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Aweme ag = this.f46408e.ag();
        if (ag != null) {
            z = ag.isAd();
        }
        return z;
    }

    public final boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f46404a, false, 42755, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, f46404a, false, 42755, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || this.f46405b == null || this.f46406c != null || com.ss.android.ugc.aweme.main.guide.a.h.a().c(context)) {
            return false;
        } else {
            try {
                UgNewFeedPendant newFeedPendant = this.f46405b.getNewFeedPendant();
                Intrinsics.checkExpressionValueIsNotNull(newFeedPendant, "mActivitySetting.newFeedPendant");
                Integer disappearAfter = newFeedPendant.getDisappearAfter();
                Intrinsics.checkExpressionValueIsNotNull(disappearAfter, "mActivitySetting.newFeedPendant.disappearAfter");
                this.g = disappearAfter.intValue();
                if (!this.f46405b.getOverallSwitch().booleanValue()) {
                    return false;
                }
                try {
                    UgNewFeedPendant newFeedPendant2 = this.f46405b.getNewFeedPendant();
                    Intrinsics.checkExpressionValueIsNotNull(newFeedPendant2, "mActivitySetting.newFeedPendant");
                    UgUserLimit userLimit = newFeedPendant2.getUserLimit();
                    Intrinsics.checkExpressionValueIsNotNull(userLimit, "mActivitySetting.newFeedPendant.userLimit");
                    Integer activeDays = userLimit.getActiveDays();
                    if (activeDays == null) {
                        Intrinsics.throwNpe();
                    }
                    int intValue = activeDays.intValue();
                    UgNewFeedPendant newFeedPendant3 = this.f46405b.getNewFeedPendant();
                    Intrinsics.checkExpressionValueIsNotNull(newFeedPendant3, "mActivitySetting.newFeedPendant");
                    UgUserLimit userLimit2 = newFeedPendant3.getUserLimit();
                    Intrinsics.checkExpressionValueIsNotNull(userLimit2, "mActivitySetting.newFeedPendant.userLimit");
                    Boolean showForActive = userLimit2.getShowForActive();
                    com.ss.android.ugc.aweme.main.guide.a a2 = com.ss.android.ugc.aweme.main.guide.a.h.a();
                    Intrinsics.checkExpressionValueIsNotNull(showForActive, "active");
                    if (!a2.a(context, 7, intValue, showForActive.booleanValue())) {
                        return false;
                    }
                    return true;
                } catch (com.bytedance.ies.a unused) {
                    return true;
                }
            } catch (com.bytedance.ies.a unused2) {
                return false;
            }
        }
    }

    public ae(@NotNull View view, @NotNull FullFeedFragmentPanel fullFeedFragmentPanel, @Nullable UgAwemeActivitySetting ugAwemeActivitySetting) {
        Intrinsics.checkParameterIsNotNull(view, "layout");
        Intrinsics.checkParameterIsNotNull(fullFeedFragmentPanel, "fllFeedFragmentPanel");
        this.f46405b = ugAwemeActivitySetting;
        this.f46407d = view;
        this.f46408e = fullFeedFragmentPanel;
    }
}
