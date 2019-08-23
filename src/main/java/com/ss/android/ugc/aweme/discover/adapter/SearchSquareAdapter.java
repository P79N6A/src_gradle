package com.ss.android.ugc.aweme.discover.adapter;

import android.arch.lifecycle.LifecycleOwner;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.base.MultiTypeAdapter;
import com.ss.android.ugc.aweme.discover.delegate.a.d;
import com.ss.android.ugc.aweme.discover.delegate.a.e;
import com.ss.android.ugc.aweme.discover.delegate.a.f;
import com.ss.android.ugc.aweme.discover.delegate.a.h;
import com.ss.android.ugc.aweme.discover.delegate.a.i;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001;B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00028\u00000 j\b\u0012\u0004\u0012\u00028\u0000`!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020#2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(J\u000e\u0010*\u001a\u00020#2\u0006\u0010$\u001a\u00020+J\u0016\u0010,\u001a\u00020#2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010(J\u000e\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u00020#2\u0006\u0010$\u001a\u000202J\u001c\u00103\u001a\u00020#2\f\u00104\u001a\b\u0012\u0004\u0012\u0002050(2\u0006\u00106\u001a\u000207J\u001e\u00108\u001a\u00020#2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010(2\u0006\u00109\u001a\u000200J\u0016\u0010:\u001a\u00020#2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u00008BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "SuggestType", "", "Lcom/ss/android/ugc/aweme/discover/base/MultiTypeAdapter;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "getLifecycleOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "mDataStore", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter$DataStore;", "getMDataStore", "()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter$DataStore;", "mDataStore$delegate", "Lkotlin/Lazy;", "mHistoryDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryDelegate;", "mHistoryLastDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryLastDelegate;", "mHotSearchImageDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/HotSearchImageDelegate;", "mHotSearchOrGuessWordDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/HotSearchOrGuessWordDelegate;", "mSearchHistoryMvpDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryMvpDelegate;", "mSuggestDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchSuggestDelegate;", "mSuggestFirstDelegate", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchSuggestFirstDelegate;", "getSearchHistoryCount", "", "getSearchSuggestList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setGuessWordHandler", "", "handler", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IGuessWordHandler;", "setGuessWordList", "list", "", "Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "setHotSearchHandler", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IHotSearchHandler;", "setHotSearchList", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "setNeedRefreshHotSearchOrGuessWord", "needRefresh", "", "setSearchHistoryHandler", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchHistoryHandler;", "setSearchHistoryLast", "rawHistoryList", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistory;", "last", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryLastDelegate$HistoryLast;", "setSearchHistoryList", "resetLast", "setSearchSuggestList", "DataStore", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchSquareAdapter<SuggestType> extends MultiTypeAdapter<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41869a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f41870b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchSquareAdapter.class), "mDataStore", "getMDataStore()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter$DataStore;"))};

    /* renamed from: c  reason: collision with root package name */
    public final f f41871c = new f();

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.delegate.a.a f41872d = new com.ss.android.ugc.aweme.discover.delegate.a.a(this.h);

    /* renamed from: e  reason: collision with root package name */
    public final d f41873e = new d();

    /* renamed from: f  reason: collision with root package name */
    public e f41874f = new e();
    public com.ss.android.ugc.aweme.discover.delegate.a.b g = new com.ss.android.ugc.aweme.discover.delegate.a.b(this.h);
    @NotNull
    public final LifecycleOwner h;
    private h i = new h(this);
    private i j = new i(this);
    private final Lazy k = aa.a(new b(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0014\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#J\u0014\u0010$\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0#J\u0016\u0010%\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010#J\u000e\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0014J\u0014\u0010(\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#J\u0014\u0010)\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100#R+\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR+\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u00068FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\bR+\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0004j\b\u0012\u0004\u0012\u00020\u0010`\u00068FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00068FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001a\u0010\bR+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0004j\b\u0012\u0004\u0012\u00020\u0010`\u00068FX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001d\u0010\b¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter$DataStore;", "", "(Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;)V", "guessWordList", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "Lkotlin/collections/ArrayList;", "getGuessWordList", "()Ljava/util/ArrayList;", "guessWordList$delegate", "Lkotlin/Lazy;", "hotSearchList", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "getHotSearchList", "hotSearchList$delegate", "rawHistoryList", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistory;", "getRawHistoryList", "rawHistoryList$delegate", "searchHistoryLast", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryLastDelegate$HistoryLast;", "getSearchHistoryLast", "()Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryLastDelegate$HistoryLast;", "setSearchHistoryLast", "(Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryLastDelegate$HistoryLast;)V", "suggestList", "getSuggestList", "suggestList$delegate", "viewHistoryList", "getViewHistoryList", "viewHistoryList$delegate", "notifyDataChanged", "", "setGuessWordList", "list", "", "setHotSearchList", "setRawSearchHistoryList", "setSearchHistoryLastData", "last", "setSuggestList", "setViewSearchHistoryList", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41875a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ KProperty[] f41876b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "rawHistoryList", "getRawHistoryList()Ljava/util/ArrayList;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "viewHistoryList", "getViewHistoryList()Ljava/util/ArrayList;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "hotSearchList", "getHotSearchList()Ljava/util/ArrayList;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "guessWordList", "getGuessWordList()Ljava/util/ArrayList;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "suggestList", "getSuggestList()Ljava/util/ArrayList;"))};
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public e.b f41877c = e.b.TYPE_NONE;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Lazy f41879e = aa.a(c.INSTANCE);
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Lazy f41880f = aa.a(e.INSTANCE);
        @NotNull
        private final Lazy g = aa.a(b.INSTANCE);
        @NotNull
        private final Lazy h = aa.a(C0532a.INSTANCE);
        @NotNull
        private final Lazy i = aa.a(d.INSTANCE);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "Lkotlin/collections/ArrayList;", "SuggestType", "", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter$a$a  reason: collision with other inner class name */
        static final class C0532a extends Lambda implements Function0<ArrayList<Word>> {
            public static final C0532a INSTANCE = new C0532a();
            public static ChangeQuickRedirect changeQuickRedirect;

            C0532a() {
                super(0);
            }

            @NotNull
            public final ArrayList<Word> invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35895, new Class[0], ArrayList.class)) {
                    return new ArrayList<>();
                }
                return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35895, new Class[0], ArrayList.class);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "Lkotlin/collections/ArrayList;", "SuggestType", "", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class b extends Lambda implements Function0<ArrayList<HotSearchItem>> {
            public static final b INSTANCE = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
                super(0);
            }

            @NotNull
            public final ArrayList<HotSearchItem> invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35896, new Class[0], ArrayList.class)) {
                    return new ArrayList<>();
                }
                return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35896, new Class[0], ArrayList.class);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistory;", "Lkotlin/collections/ArrayList;", "SuggestType", "", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class c extends Lambda implements Function0<ArrayList<SearchHistory>> {
            public static final c INSTANCE = new c();
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
                super(0);
            }

            @NotNull
            public final ArrayList<SearchHistory> invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35897, new Class[0], ArrayList.class)) {
                    return new ArrayList<>();
                }
                return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35897, new Class[0], ArrayList.class);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "SuggestType", "Lkotlin/collections/ArrayList;", "", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class d extends Lambda implements Function0<ArrayList<SuggestType>> {
            public static final d INSTANCE = new d();
            public static ChangeQuickRedirect changeQuickRedirect;

            d() {
                super(0);
            }

            @NotNull
            public final ArrayList<SuggestType> invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35898, new Class[0], ArrayList.class)) {
                    return new ArrayList<>();
                }
                return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35898, new Class[0], ArrayList.class);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistory;", "Lkotlin/collections/ArrayList;", "SuggestType", "", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class e extends Lambda implements Function0<ArrayList<SearchHistory>> {
            public static final e INSTANCE = new e();
            public static ChangeQuickRedirect changeQuickRedirect;

            e() {
                super(0);
            }

            @NotNull
            public final ArrayList<SearchHistory> invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35899, new Class[0], ArrayList.class)) {
                    return new ArrayList<>();
                }
                return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35899, new Class[0], ArrayList.class);
            }
        }

        @NotNull
        private ArrayList<SearchHistory> c() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f41875a, false, 35882, new Class[0], ArrayList.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f41875a, false, 35882, new Class[0], ArrayList.class);
            } else {
                value = this.f41879e.getValue();
            }
            return (ArrayList) value;
        }

        @NotNull
        private ArrayList<HotSearchItem> d() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f41875a, false, 35885, new Class[0], ArrayList.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f41875a, false, 35885, new Class[0], ArrayList.class);
            } else {
                value = this.g.getValue();
            }
            return (ArrayList) value;
        }

        @NotNull
        private ArrayList<Word> e() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f41875a, false, 35886, new Class[0], ArrayList.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f41875a, false, 35886, new Class[0], ArrayList.class);
            } else {
                value = this.h.getValue();
            }
            return (ArrayList) value;
        }

        @NotNull
        public final ArrayList<SearchHistory> a() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f41875a, false, 35883, new Class[0], ArrayList.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f41875a, false, 35883, new Class[0], ArrayList.class);
            } else {
                value = this.f41880f.getValue();
            }
            return (ArrayList) value;
        }

        @NotNull
        public final ArrayList<SuggestType> b() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f41875a, false, 35887, new Class[0], ArrayList.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f41875a, false, 35887, new Class[0], ArrayList.class);
            } else {
                value = this.i.getValue();
            }
            return (ArrayList) value;
        }

        private final void f() {
            if (PatchProxy.isSupport(new Object[0], this, f41875a, false, 35894, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f41875a, false, 35894, new Class[0], Void.TYPE);
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (!c().isEmpty()) {
                arrayList.add(c());
            }
            if (!a().isEmpty()) {
                arrayList.addAll(a());
            }
            if (this.f41877c != e.b.TYPE_NONE) {
                arrayList.add(this.f41877c);
            }
            if (!d().isEmpty()) {
                arrayList.add(d());
            }
            if (!e().isEmpty()) {
                arrayList.add(e());
            }
            if (!b().isEmpty()) {
                arrayList.add(i.a.TYPE_LIST);
                arrayList.addAll(b());
            }
            SearchSquareAdapter.this.n.clear();
            SearchSquareAdapter.this.n.addAll(arrayList);
            SearchSquareAdapter.this.notifyDataSetChanged();
        }

        public a() {
        }

        public final void a(@NotNull e.b bVar) {
            e.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f41875a, false, 35890, new Class[]{e.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f41875a, false, 35890, new Class[]{e.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar2, "last");
            this.f41877c = bVar2;
            f();
        }

        public final void b(@NotNull List<? extends SearchHistory> list) {
            List<? extends SearchHistory> list2 = list;
            if (PatchProxy.isSupport(new Object[]{list2}, this, f41875a, false, 35889, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2}, this, f41875a, false, 35889, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list2, "list");
            a().clear();
            a().addAll(list2);
            f();
        }

        public final void c(@NotNull List<HotSearchItem> list) {
            List<HotSearchItem> list2 = list;
            if (PatchProxy.isSupport(new Object[]{list2}, this, f41875a, false, 35891, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2}, this, f41875a, false, 35891, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list2, "list");
            d().clear();
            d().addAll(list2);
            f();
        }

        public final void d(@NotNull List<Word> list) {
            List<Word> list2 = list;
            if (PatchProxy.isSupport(new Object[]{list2}, this, f41875a, false, 35892, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2}, this, f41875a, false, 35892, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list2, "list");
            e().clear();
            e().addAll(list2);
            f();
        }

        public final void e(@NotNull List<? extends SuggestType> list) {
            List<? extends SuggestType> list2 = list;
            if (PatchProxy.isSupport(new Object[]{list2}, this, f41875a, false, 35893, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2}, this, f41875a, false, 35893, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list2, "list");
            b().clear();
            b().addAll(list2);
            f();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
            if (r0 != false) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.Nullable java.util.List<? extends com.ss.android.ugc.aweme.discover.model.SearchHistory> r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f41875a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<java.util.List> r1 = java.util.List.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 35888(0x8c30, float:5.029E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0032
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f41875a
                r3 = 0
                r4 = 35888(0x8c30, float:5.029E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<java.util.List> r1 = java.util.List.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0032:
                com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter r0 = com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter.this
                java.util.List<T> r0 = r0.n
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L_0x003b:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0059
                java.lang.Object r2 = r0.next()
                boolean r3 = r2 instanceof java.util.List
                if (r3 == 0) goto L_0x0052
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends T>) r2)
                boolean r2 = r2 instanceof com.ss.android.ugc.aweme.discover.model.SearchHistory
                goto L_0x0053
            L_0x0052:
                r2 = 0
            L_0x0053:
                if (r2 == 0) goto L_0x0056
                goto L_0x005a
            L_0x0056:
                int r1 = r1 + 1
                goto L_0x003b
            L_0x0059:
                r1 = -1
            L_0x005a:
                if (r1 < 0) goto L_0x006e
                r0 = r10
                java.util.Collection r0 = (java.util.Collection) r0
                if (r0 == 0) goto L_0x006a
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0068
                goto L_0x006a
            L_0x0068:
                r0 = 0
                goto L_0x006b
            L_0x006a:
                r0 = 1
            L_0x006b:
                if (r0 == 0) goto L_0x006e
                goto L_0x006f
            L_0x006e:
                r7 = 0
            L_0x006f:
                java.util.ArrayList r0 = r9.c()
                r0.clear()
                if (r7 == 0) goto L_0x0085
                com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter r0 = com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter.this
                java.util.List<T> r0 = r0.n
                r0.remove(r1)
                com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter r0 = com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter.this
                r0.notifyItemRemoved(r1)
                return
            L_0x0085:
                if (r10 == 0) goto L_0x0091
                java.util.ArrayList r0 = r9.c()
                r1 = r10
                java.util.Collection r1 = (java.util.Collection) r1
                r0.addAll(r1)
            L_0x0091:
                r9.f()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter.a.a(java.util.List):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter$DataStore;", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "SuggestType", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<a> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchSquareAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SearchSquareAdapter searchSquareAdapter) {
            super(0);
            this.this$0 = searchSquareAdapter;
        }

        @NotNull
        public final a invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 35900, new Class[0], a.class)) {
                return new a<>();
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 35900, new Class[0], a.class);
        }
    }

    public final a a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f41869a, false, 35871, new Class[0], a.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f41869a, false, 35871, new Class[0], a.class);
        } else {
            value = this.k.getValue();
        }
        return (a) value;
    }

    public final void a(@Nullable List<HotSearchItem> list) {
        List<HotSearchItem> list2;
        a aVar;
        if (PatchProxy.isSupport(new Object[]{list}, this, f41869a, false, 35877, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f41869a, false, 35877, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.g.f42247d = true;
        if (CollectionUtils.isEmpty(list)) {
            aVar = a();
            list2 = Collections.emptyList();
            Intrinsics.checkExpressionValueIsNotNull(list2, "Collections.emptyList()");
        } else {
            a a2 = a();
            if (list == null) {
                Intrinsics.throwNpe();
            }
            aVar = a2;
            list2 = list;
        }
        aVar.c(list2);
    }

    public final void b(@Nullable List<Word> list) {
        List<Word> list2;
        a aVar;
        if (PatchProxy.isSupport(new Object[]{list}, this, f41869a, false, 35878, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f41869a, false, 35878, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.g.f42247d = true;
        if (CollectionUtils.isEmpty(list)) {
            aVar = a();
            list2 = Collections.emptyList();
            Intrinsics.checkExpressionValueIsNotNull(list2, "Collections.emptyList()");
        } else {
            a a2 = a();
            if (list == null) {
                Intrinsics.throwNpe();
            }
            aVar = a2;
            list2 = list;
        }
        aVar.d(list2);
    }

    public final void c(@Nullable List<? extends SuggestType> list) {
        List<? extends SuggestType> list2;
        a aVar;
        if (PatchProxy.isSupport(new Object[]{list}, this, f41869a, false, 35879, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f41869a, false, 35879, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (CollectionUtils.isEmpty(list)) {
            aVar = a();
            list2 = Collections.emptyList();
            Intrinsics.checkExpressionValueIsNotNull(list2, "Collections.emptyList()");
        } else {
            a a2 = a();
            if (list == null) {
                Intrinsics.throwNpe();
            }
            aVar = a2;
            list2 = list;
        }
        aVar.e(list2);
    }

    public SearchSquareAdapter(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        this.h = lifecycleOwner;
        if (com.ss.android.ugc.aweme.discover.helper.b.l()) {
            a(this.f41871c);
            a(this.f41872d);
        } else {
            a(this.f41873e);
            a(this.f41874f);
            a(this.g);
        }
        a(this.i);
        a(this.j);
    }

    public final void a(@Nullable List<? extends SearchHistory> list, boolean z) {
        e.b bVar;
        List<? extends SearchHistory> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f41869a, false, 35875, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f41869a, false, 35875, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.discover.helper.b.l()) {
            a().a((List) list2);
        } else {
            ArrayList arrayList = new ArrayList();
            if (z) {
                bVar = e.b.TYPE_NONE;
            } else {
                bVar = a().f41877c;
            }
            e.b a2 = this.f41874f.a(list2, arrayList, bVar);
            a().b(arrayList);
            a().a(a2);
        }
    }
}
