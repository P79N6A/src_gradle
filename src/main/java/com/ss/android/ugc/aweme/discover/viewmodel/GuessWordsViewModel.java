package com.ss.android.ugc.aweme.discover.viewmodel;

import a.g;
import a.i;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.base.sharedpref.f;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/GuessWordsViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "guessLiveData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "Lcom/ss/android/ugc/aweme/discover/api/common/ResultModel;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/TypeWords;", "getGuessLiveData", "()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "inboxLiveData", "getInboxLiveData", "searchSP", "Lcom/ss/android/ugc/aweme/base/sharedpref/SharedPreferencesWrapper;", "kotlin.jvm.PlatformType", "getInboxWord", "Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "refreshGuessWord", "", "refreshInBoxWord", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GuessWordsViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43223a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f43224e = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<TypeWords>> f43225b = new com.ss.android.ugc.aweme.arch.widgets.base.b<>();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<TypeWords>> f43226c = new com.ss.android.ugc.aweme.arch.widgets.base.b<>();

    /* renamed from: d  reason: collision with root package name */
    public final f f43227d = e.e();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/GuessWordsViewModel$Companion;", "", "()V", "BUSINESS_ID_GUESS", "", "BUSINESS_ID_INBOX", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestWordResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    public static final class b<TTaskResult, TContinuationResult> implements g<SuggestWordResponse, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GuessWordsViewModel f43229b;

        public b(GuessWordsViewModel guessWordsViewModel) {
            this.f43229b = guessWordsViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.ss.android.ugc.aweme.discover.model.suggest.TypeWords} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f43228a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 38168(0x9518, float:5.3485E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f43228a
                r3 = 0
                r4 = 38168(0x9518, float:5.3485E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r18
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x0137
            L_0x0039:
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
                boolean r0 = r19.b()
                if (r0 == 0) goto L_0x00ff
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse r0 = (com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse) r0
                if (r0 == 0) goto L_0x00e2
                java.util.List<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords> r0 = r0.data
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r1 = r7.f43229b
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel.f43223a
                r14 = 0
                r15 = 38166(0x9516, float:5.3482E-41)
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.suggest.Word> r17 = com.ss.android.ugc.aweme.discover.model.suggest.Word.class
                r12 = r1
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                r3 = 0
                if (r2 == 0) goto L_0x007c
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel.f43223a
                r14 = 0
                r15 = 38166(0x9516, float:5.3482E-41)
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.suggest.Word> r17 = com.ss.android.ugc.aweme.discover.model.suggest.Word.class
                r12 = r1
                r16 = r2
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = (com.ss.android.ugc.aweme.discover.model.suggest.Word) r1
                goto L_0x00a6
            L_0x007c:
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r1 = r1.f43226c
                java.lang.Object r1 = r1.getValue()
                com.ss.android.ugc.aweme.discover.api.a.a r1 = (com.ss.android.ugc.aweme.discover.api.a.a) r1
                if (r1 == 0) goto L_0x00a5
                T r1 = r1.f42103b
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r1 = (com.ss.android.ugc.aweme.discover.model.suggest.TypeWords) r1
                if (r1 == 0) goto L_0x00a5
                java.util.List<com.ss.android.ugc.aweme.discover.model.suggest.Word> r1 = r1.words
                if (r1 == 0) goto L_0x00a5
                r2 = r1
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                r2 = r2 ^ r9
                if (r2 == 0) goto L_0x009b
                goto L_0x009c
            L_0x009b:
                r1 = r3
            L_0x009c:
                if (r1 == 0) goto L_0x00a5
                java.lang.Object r1 = r1.get(r10)
                com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = (com.ss.android.ugc.aweme.discover.model.suggest.Word) r1
                goto L_0x00a6
            L_0x00a5:
                r1 = r3
            L_0x00a6:
                if (r1 == 0) goto L_0x00b9
                if (r0 == 0) goto L_0x00b9
                java.lang.Object r2 = kotlin.collections.CollectionsKt.first((java.util.List<? extends T>) r0)
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r2 = (com.ss.android.ugc.aweme.discover.model.suggest.TypeWords) r2
                if (r2 == 0) goto L_0x00b9
                java.util.List<com.ss.android.ugc.aweme.discover.model.suggest.Word> r2 = r2.words
                if (r2 == 0) goto L_0x00b9
                r2.add(r10, r1)
            L_0x00b9:
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r1 = r7.f43229b
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r1 = r1.f43225b
                com.ss.android.ugc.aweme.discover.api.a.a r2 = new com.ss.android.ugc.aweme.discover.api.a.a
                if (r0 == 0) goto L_0x00c8
                java.lang.Object r4 = kotlin.collections.CollectionsKt.first((java.util.List<? extends T>) r0)
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r4 = (com.ss.android.ugc.aweme.discover.model.suggest.TypeWords) r4
                goto L_0x00c9
            L_0x00c8:
                r4 = r3
            L_0x00c9:
                r2.<init>(r4)
                r1.setValue(r2)
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r1 = r7.f43229b
                com.ss.android.ugc.aweme.base.sharedpref.f r1 = r1.f43227d
                java.lang.String r2 = "key_guess_words"
                if (r0 == 0) goto L_0x00de
                java.lang.Object r0 = kotlin.collections.CollectionsKt.first((java.util.List<? extends T>) r0)
                r3 = r0
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r3 = (com.ss.android.ugc.aweme.discover.model.suggest.TypeWords) r3
            L_0x00de:
                r1.a((java.lang.String) r2, (java.lang.Object) r3)
                goto L_0x0137
            L_0x00e2:
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r7.f43229b
                com.ss.android.ugc.aweme.base.sharedpref.f r0 = r0.f43227d
                java.lang.String r1 = "key_guess_words"
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords> r2 = com.ss.android.ugc.aweme.discover.model.suggest.TypeWords.class
                java.lang.Object r0 = r0.a((java.lang.String) r1, (java.lang.Class<T>) r2)
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r0 = (com.ss.android.ugc.aweme.discover.model.suggest.TypeWords) r0
                if (r0 == 0) goto L_0x0137
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r1 = r7.f43229b
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r1 = r1.f43225b
                com.ss.android.ugc.aweme.discover.api.a.a r2 = new com.ss.android.ugc.aweme.discover.api.a.a
                r2.<init>(r0)
                r1.setValue(r2)
                goto L_0x0137
            L_0x00ff:
                boolean r0 = r19.d()
                if (r0 == 0) goto L_0x0137
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r7.f43229b
                com.ss.android.ugc.aweme.base.sharedpref.f r0 = r0.f43227d
                java.lang.String r1 = "key_guess_words"
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords> r2 = com.ss.android.ugc.aweme.discover.model.suggest.TypeWords.class
                java.lang.Object r0 = r0.a((java.lang.String) r1, (java.lang.Class<T>) r2)
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r0 = (com.ss.android.ugc.aweme.discover.model.suggest.TypeWords) r0
                if (r0 == 0) goto L_0x0122
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r1 = r7.f43229b
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r1 = r1.f43225b
                com.ss.android.ugc.aweme.discover.api.a.a r2 = new com.ss.android.ugc.aweme.discover.api.a.a
                r2.<init>(r0)
                r1.setValue(r2)
                goto L_0x0137
            L_0x0122:
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r7.f43229b
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r0 = r0.f43225b
                com.ss.android.ugc.aweme.discover.api.a.a r1 = new com.ss.android.ugc.aweme.discover.api.a.a
                java.lang.Exception r2 = r19.f()
                java.lang.String r3 = "it.error"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r1.<init>((java.lang.Exception) r2)
                r0.setValue(r1)
            L_0x0137:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel.b.then(a.i):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestWordResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class c<TTaskResult, TContinuationResult> implements g<SuggestWordResponse, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43230a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GuessWordsViewModel f43231b;

        c(GuessWordsViewModel guessWordsViewModel) {
            this.f43231b = guessWordsViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.ss.android.ugc.aweme.discover.model.suggest.TypeWords} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f43230a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 38169(0x9519, float:5.3486E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0033
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f43230a
                r3 = 0
                r4 = 38169(0x9519, float:5.3486E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x00c7
            L_0x0033:
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r0)
                boolean r0 = r10.b()
                if (r0 == 0) goto L_0x008f
                java.lang.Object r0 = r10.e()
                com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse r0 = (com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse) r0
                if (r0 == 0) goto L_0x0072
                java.util.List<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords> r0 = r0.data
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r1 = r9.f43231b
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r1 = r1.f43226c
                com.ss.android.ugc.aweme.discover.api.a.a r2 = new com.ss.android.ugc.aweme.discover.api.a.a
                r3 = 0
                if (r0 == 0) goto L_0x0058
                java.lang.Object r4 = kotlin.collections.CollectionsKt.first((java.util.List<? extends T>) r0)
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r4 = (com.ss.android.ugc.aweme.discover.model.suggest.TypeWords) r4
                goto L_0x0059
            L_0x0058:
                r4 = r3
            L_0x0059:
                r2.<init>(r4)
                r1.setValue(r2)
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r1 = r9.f43231b
                com.ss.android.ugc.aweme.base.sharedpref.f r1 = r1.f43227d
                java.lang.String r2 = "key_inbox_word"
                if (r0 == 0) goto L_0x006e
                java.lang.Object r0 = kotlin.collections.CollectionsKt.first((java.util.List<? extends T>) r0)
                r3 = r0
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r3 = (com.ss.android.ugc.aweme.discover.model.suggest.TypeWords) r3
            L_0x006e:
                r1.a((java.lang.String) r2, (java.lang.Object) r3)
                goto L_0x00c7
            L_0x0072:
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r9.f43231b
                com.ss.android.ugc.aweme.base.sharedpref.f r0 = r0.f43227d
                java.lang.String r1 = "key_inbox_word"
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords> r2 = com.ss.android.ugc.aweme.discover.model.suggest.TypeWords.class
                java.lang.Object r0 = r0.a((java.lang.String) r1, (java.lang.Class<T>) r2)
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r0 = (com.ss.android.ugc.aweme.discover.model.suggest.TypeWords) r0
                if (r0 == 0) goto L_0x00c7
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r1 = r9.f43231b
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r1 = r1.f43226c
                com.ss.android.ugc.aweme.discover.api.a.a r2 = new com.ss.android.ugc.aweme.discover.api.a.a
                r2.<init>(r0)
                r1.setValue(r2)
                goto L_0x00c7
            L_0x008f:
                boolean r0 = r10.d()
                if (r0 == 0) goto L_0x00c7
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r9.f43231b
                com.ss.android.ugc.aweme.base.sharedpref.f r0 = r0.f43227d
                java.lang.String r1 = "key_inbox_word"
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords> r2 = com.ss.android.ugc.aweme.discover.model.suggest.TypeWords.class
                java.lang.Object r0 = r0.a((java.lang.String) r1, (java.lang.Class<T>) r2)
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r0 = (com.ss.android.ugc.aweme.discover.model.suggest.TypeWords) r0
                if (r0 == 0) goto L_0x00b2
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r1 = r9.f43231b
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r1 = r1.f43226c
                com.ss.android.ugc.aweme.discover.api.a.a r2 = new com.ss.android.ugc.aweme.discover.api.a.a
                r2.<init>(r0)
                r1.setValue(r2)
                goto L_0x00c7
            L_0x00b2:
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r9.f43231b
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r0 = r0.f43226c
                com.ss.android.ugc.aweme.discover.api.a.a r1 = new com.ss.android.ugc.aweme.discover.api.a.a
                java.lang.Exception r2 = r10.f()
                java.lang.String r3 = "it.error"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r1.<init>((java.lang.Exception) r2)
                r0.setValue(r1)
            L_0x00c7:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel.c.then(a.i):java.lang.Object");
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43223a, false, 38167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43223a, false, 38167, new Class[0], Void.TYPE);
            return;
        }
        ((SuggestWordsApi) com.ss.android.ugc.aweme.discover.api.a.b.f42106b.create(SuggestWordsApi.class)).getSuggestWords("10006").a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(this), i.f1052b);
    }
}
