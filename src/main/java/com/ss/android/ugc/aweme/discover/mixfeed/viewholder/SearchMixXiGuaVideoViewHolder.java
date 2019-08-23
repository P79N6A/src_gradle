package com.ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import com.ss.android.ugc.aweme.discover.mob.e;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.ap;
import com.ss.android.ugc.aweme.discover.ui.av;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0006\u0010\u0013\u001a\u00020\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixXiGuaVideoViewHolder;", "Lcom/ss/android/ugc/aweme/discover/adapter/AbsSearchViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mixFeed", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "searchMixCell", "Lcom/ss/android/ugc/aweme/discover/ui/SearchMixXiGuaVideoCell;", "searchResultParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "bind", "", "param", "showViewMore", "", "getIdList", "", "getView", "mobShow", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMixXiGuaVideoViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f42632c;
    public static final a g = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public SearchResultParam f42633d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.mixfeed.a f42634e;

    /* renamed from: f  reason: collision with root package name */
    public final av f42635f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J9\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixXiGuaVideoViewHolder$Companion;", "", "()V", "SCHEMA_XIGUA_MINI_APP", "", "create", "Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixXiGuaVideoViewHolder;", "parent", "Landroid/view/ViewGroup;", "getXiGuaVideoDetailSchema", "videoId", "keyword", "getXiGuaVideoListSchema", "mobXiGuaMPClick", "", "appId", "rank", "", "pos", "groupId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42636a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(@NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull String str3, @Nullable String str4) {
            String str5 = str;
            String str6 = str2;
            Integer num2 = num;
            String str7 = str3;
            String str8 = str4;
            if (PatchProxy.isSupport(new Object[]{str5, str6, num2, str7, str8}, this, f42636a, false, 36949, new Class[]{String.class, String.class, Integer.class, String.class, String.class}, Void.TYPE)) {
                Object[] objArr = {str5, str6, num2, str7, str8};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f42636a, false, 36949, new Class[]{String.class, String.class, Integer.class, String.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str5, "appId");
            Intrinsics.checkParameterIsNotNull(str7, "pos");
            r.a("mp_click", (Map) d.a().a("mp_id", str5).a("enter_from", "general_search").a("query", str6).a("group_id", str8).a("search_id", e.a().a(3)).a("rank", (Object) num2).a("pos", str7).f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "toViewAll"}, k = 3, mv = {1, 1, 15})
    static final class b implements ap.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42637a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchMixXiGuaVideoViewHolder f42638b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f42639c;

        b(SearchMixXiGuaVideoViewHolder searchMixXiGuaVideoViewHolder, View view) {
            this.f42638b = searchMixXiGuaVideoViewHolder;
            this.f42639c = view;
        }

        public final void a() {
            String str;
            String str2;
            if (PatchProxy.isSupport(new Object[0], this, f42637a, false, 36950, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42637a, false, 36950, new Class[0], Void.TYPE);
                return;
            }
            SearchResultParam searchResultParam = this.f42638b.f42633d;
            if (searchResultParam != null) {
                String keyword = searchResultParam.getKeyword();
                if (keyword != null) {
                    com.ss.android.ugc.aweme.miniapp_api.model.b bVar = new com.ss.android.ugc.aweme.miniapp_api.model.b();
                    a aVar = SearchMixXiGuaVideoViewHolder.g;
                    if (PatchProxy.isSupport(new Object[]{keyword}, aVar, a.f42636a, false, 36946, new Class[]{String.class}, String.class)) {
                        a aVar2 = aVar;
                        str = (String) PatchProxy.accessDispatch(new Object[]{keyword}, aVar2, a.f42636a, false, 36946, new Class[]{String.class}, String.class);
                    } else {
                        StringBuilder sb = new StringBuilder("sslocal://microapp?app_id=tt2bdc5d61b4f69b9e&start_page=");
                        String format = String.format("pages/index/index?keyword=%s", Arrays.copyOf(new Object[]{keyword}, 1));
                        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                        String encode = URLEncoder.encode(format, "UTF-8");
                        Intrinsics.checkExpressionValueIsNotNull(encode, "URLEncoder.encode(starPage, \"UTF-8\")");
                        sb.append(encode);
                        str = sb.toString();
                        Intrinsics.checkExpressionValueIsNotNull(str, "sb.toString()");
                    }
                    IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
                    iMiniAppService.openMiniApp(this.f42639c.getContext(), str, bVar);
                    a aVar3 = SearchMixXiGuaVideoViewHolder.g;
                    String appId = iMiniAppService.getAppId(str);
                    Intrinsics.checkExpressionValueIsNotNull(appId, "miniAppService.getAppId(schema)");
                    SearchResultParam searchResultParam2 = this.f42638b.f42633d;
                    if (searchResultParam2 != null) {
                        str2 = searchResultParam2.getKeyword();
                    } else {
                        str2 = null;
                    }
                    aVar3.a(appId, str2, Integer.valueOf(this.f42638b.getAdapterPosition()), "more", null);
                }
            }
        }
    }

    @NotNull
    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f42632c, false, 36942, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f42632c, false, 36942, new Class[0], View.class);
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchMixXiGuaVideoViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f42635f = new av(this, view, context, new b(this, view));
    }
}
