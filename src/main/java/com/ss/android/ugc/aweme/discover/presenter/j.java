package com.ss.android.ugc.aweme.discover.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.model.o;
import com.ss.android.ugc.aweme.discover.base.g;
import com.ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.follow.presenter.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u00052\u00020\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0018\u00104\u001a\u0002052\u000e\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0004J\b\u00107\u001a\u000205H\u0004J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0016J\u0017\u0010:\u001a\u0002052\b\u0010;\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010<J\u0018\u0010=\u001a\u0002052\u000e\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0004R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R\u0013\u0010(\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u0012\u0010/\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0010R\u001e\u00101\u001a\u0012\u0012\u0004\u0012\u00028\u000002j\b\u0012\u0004\u0012\u00028\u0000`3X\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/presenter/SearchBaseModel;", "T", "RESPONSE", "Lcom/ss/android/ugc/aweme/discover/model/SearchApiResult;", "Lcom/ss/android/ugc/aweme/follow/presenter/DetailFeedBaseListModel;", "Lcom/ss/android/ugc/aweme/discover/presenter/SearchSourceOwner;", "Lcom/ss/android/ugc/aweme/discover/base/SearchCommonRequestId;", "()V", "guideSearchWordList", "", "Lcom/ss/android/ugc/aweme/discover/model/GuideSearchWord;", "getGuideSearchWordList", "()Ljava/util/List;", "hotSearchSource", "", "getHotSearchSource", "()I", "setHotSearchSource", "(I)V", "preventSuicide", "Lcom/ss/android/ugc/aweme/discover/model/SearchPreventSuicide;", "getPreventSuicide", "()Lcom/ss/android/ugc/aweme/discover/model/SearchPreventSuicide;", "queryCorrectInfo", "Lcom/ss/android/ugc/aweme/discover/model/QueryCorrectInfo;", "getQueryCorrectInfo", "()Lcom/ss/android/ugc/aweme/discover/model/QueryCorrectInfo;", "requestId", "", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "searchAdInfo", "Lcom/ss/android/ugc/aweme/commercialize/model/SearchAdInfo;", "getSearchAdInfo", "()Lcom/ss/android/ugc/aweme/commercialize/model/SearchAdInfo;", "searchId", "getSearchId", "setSearchId", "searchNilInfo", "Lcom/ss/android/ugc/aweme/discover/model/SearchNilInfo;", "getSearchNilInfo", "()Lcom/ss/android/ugc/aweme/discover/model/SearchNilInfo;", "searchSource", "getSearchSource", "setSearchSource", "searchType", "getSearchType", "set", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "addList", "", "list", "clearList", "getItems", "", "handleData", "data", "(Lcom/ss/android/ugc/aweme/discover/model/SearchApiResult;)V", "setList", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class j<T, RESPONSE extends SearchApiResult> extends a<T, RESPONSE> implements g {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f42714d;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<T> f42715a = new LinkedHashSet<>();
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private String f42716b = "";

    /* renamed from: e  reason: collision with root package name */
    public int f42717e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f42718f;
    @Nullable
    public String g;

    @NotNull
    public final String c() {
        return this.f42716b;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f42714d, false, 37197, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42714d, false, 37197, new Class[0], Void.TYPE);
            return;
        }
        this.f42715a.clear();
    }

    @Nullable
    public final QueryCorrectInfo d() {
        if (PatchProxy.isSupport(new Object[0], this, f42714d, false, 37200, new Class[0], QueryCorrectInfo.class)) {
            return (QueryCorrectInfo) PatchProxy.accessDispatch(new Object[0], this, f42714d, false, 37200, new Class[0], QueryCorrectInfo.class);
        } else if (this.mData == null) {
            return null;
        } else {
            Object obj = this.mData;
            Intrinsics.checkExpressionValueIsNotNull(obj, "mData");
            return ((SearchApiResult) obj).queryCorrectInfo;
        }
    }

    @Nullable
    public final SearchPreventSuicide e() {
        if (PatchProxy.isSupport(new Object[0], this, f42714d, false, 37201, new Class[0], SearchPreventSuicide.class)) {
            return (SearchPreventSuicide) PatchProxy.accessDispatch(new Object[0], this, f42714d, false, 37201, new Class[0], SearchPreventSuicide.class);
        } else if (this.mData == null) {
            return null;
        } else {
            Object obj = this.mData;
            Intrinsics.checkExpressionValueIsNotNull(obj, "mData");
            return ((SearchApiResult) obj).suicidePrevent;
        }
    }

    @Nullable
    public final o f() {
        if (PatchProxy.isSupport(new Object[0], this, f42714d, false, 37202, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, f42714d, false, 37202, new Class[0], o.class);
        } else if (this.mData == null) {
            return null;
        } else {
            Object obj = this.mData;
            Intrinsics.checkExpressionValueIsNotNull(obj, "mData");
            return ((SearchApiResult) obj).adInfo;
        }
    }

    @NotNull
    public List<T> getItems() {
        if (!PatchProxy.isSupport(new Object[0], this, f42714d, false, 37204, new Class[0], List.class)) {
            return new ArrayList<>(this.f42715a);
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f42714d, false, 37204, new Class[0], List.class);
    }

    @Nullable
    public final List<GuideSearchWord> g() {
        if (PatchProxy.isSupport(new Object[0], this, f42714d, false, 37203, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f42714d, false, 37203, new Class[0], List.class);
        } else if (this.mData == null) {
            return null;
        } else {
            Object obj = this.mData;
            Intrinsics.checkExpressionValueIsNotNull(obj, "mData");
            List<GuideSearchWord> list = ((SearchApiResult) obj).guideSearchWordList;
            if (list != null && list.size() < 3) {
                list = null;
            }
            return list;
        }
    }

    public void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f42714d, false, 37198, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f42714d, false, 37198, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.f42716b = str2;
    }

    public final void b(@Nullable List<? extends T> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f42714d, false, 37195, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f42714d, false, 37195, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f42715a.clear();
        if (list != null) {
            this.f42715a.addAll(list);
        }
    }

    public final void c(@Nullable List<? extends T> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f42714d, false, 37196, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f42714d, false, 37196, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list != null) {
            this.f42715a.addAll(list);
        }
    }

    /* renamed from: a */
    public void handleData(@Nullable RESPONSE response) {
        String str;
        if (PatchProxy.isSupport(new Object[]{response}, this, f42714d, false, 37205, new Class[]{SearchApiResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{response}, this, f42714d, false, 37205, new Class[]{SearchApiResult.class}, Void.TYPE);
            return;
        }
        if (response != null && this.mListQueryType == 1) {
            if (PatchProxy.isSupport(new Object[]{response}, this, f42714d, false, 37206, new Class[]{SearchApiResult.class}, SearchApiResult.class)) {
                SearchApiResult searchApiResult = (SearchApiResult) PatchProxy.accessDispatch(new Object[]{response}, this, f42714d, false, 37206, new Class[]{SearchApiResult.class}, SearchApiResult.class);
            } else {
                Intrinsics.checkParameterIsNotNull(response, "data");
                g.a.a(this, response);
            }
            this.f42718f = response.getRequestId();
            if (response.logPb == null) {
                str = "";
            } else {
                LogPbBean logPbBean = response.logPb;
                Intrinsics.checkExpressionValueIsNotNull(logPbBean, "data.logPb");
                str = logPbBean.getImprId();
            }
            this.g = str;
        }
    }
}
