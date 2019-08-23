package com.ss.android.ugc.aweme.discover.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixXiGuaVideoViewHolder;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.XiGuaVideo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.net.URLEncoder;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/XiGuaVideoItemViewHolder;", "Lcom/ss/android/ugc/aweme/discover/adapter/AbsSearchViewHolder;", "itemView", "Landroid/view/View;", "cardViewHolder", "Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixXiGuaVideoViewHolder;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixXiGuaVideoViewHolder;)V", "videoCover", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "videoDuration", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "videoExtraInfo", "videoTitle", "bind", "", "videoItem", "Lcom/ss/android/ugc/aweme/discover/model/SearchXiGuaVideo;", "searchParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "getView", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class XiGuaVideoItemViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f43066c;
    public static final a i = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public SearchMixXiGuaVideoViewHolder f43067d;

    /* renamed from: e  reason: collision with root package name */
    final RemoteImageView f43068e;

    /* renamed from: f  reason: collision with root package name */
    final DmtTextView f43069f;
    final DmtTextView g;
    final DmtTextView h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/XiGuaVideoItemViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/discover/ui/XiGuaVideoItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "cardViewHolder", "Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixXiGuaVideoViewHolder;", "getDuration", "", "millis", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43070a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43071a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ XiGuaVideoItemViewHolder f43072b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ XiGuaVideo f43073c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SearchResultParam f43074d;

        b(XiGuaVideoItemViewHolder xiGuaVideoItemViewHolder, XiGuaVideo xiGuaVideo, SearchResultParam searchResultParam) {
            this.f43072b = xiGuaVideoItemViewHolder;
            this.f43073c = xiGuaVideo;
            this.f43074d = searchResultParam;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            if (PatchProxy.isSupport(new Object[]{view}, this, f43071a, false, 38129, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f43071a, false, 38129, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.miniapp_api.model.b bVar = new com.ss.android.ugc.aweme.miniapp_api.model.b();
            SearchMixXiGuaVideoViewHolder.a aVar = SearchMixXiGuaVideoViewHolder.g;
            String videoId = this.f43073c.getVideoId();
            SearchResultParam searchResultParam = this.f43074d;
            Integer num = null;
            if (searchResultParam != null) {
                str = searchResultParam.getKeyword();
            } else {
                str = null;
            }
            if (PatchProxy.isSupport(new Object[]{videoId, str}, aVar, SearchMixXiGuaVideoViewHolder.a.f42636a, false, 36947, new Class[]{String.class, String.class}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{videoId, str}, aVar, SearchMixXiGuaVideoViewHolder.a.f42636a, false, 36947, new Class[]{String.class, String.class}, String.class);
            } else {
                StringBuilder sb = new StringBuilder("sslocal://microapp?app_id=tt2bdc5d61b4f69b9e&start_page=");
                String format = String.format("pages/detail/index?group_id=%s&keyword=%s", Arrays.copyOf(new Object[]{videoId, str}, 2));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                String encode = URLEncoder.encode(format, "UTF-8");
                Intrinsics.checkExpressionValueIsNotNull(encode, "URLEncoder.encode(starPage, \"UTF-8\")");
                sb.append(encode);
                str2 = sb.toString();
                Intrinsics.checkExpressionValueIsNotNull(str2, "sb.toString()");
            }
            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
            View view2 = this.f43072b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            iMiniAppService.openMiniApp(view2.getContext(), str2, bVar);
            SearchMixXiGuaVideoViewHolder.a aVar2 = SearchMixXiGuaVideoViewHolder.g;
            String appId = iMiniAppService.getAppId(str2);
            Intrinsics.checkExpressionValueIsNotNull(appId, "miniAppService.getAppId(schema)");
            SearchResultParam searchResultParam2 = this.f43074d;
            if (searchResultParam2 != null) {
                str3 = searchResultParam2.getKeyword();
            } else {
                str3 = null;
            }
            SearchMixXiGuaVideoViewHolder searchMixXiGuaVideoViewHolder = this.f43072b.f43067d;
            if (searchMixXiGuaVideoViewHolder != null) {
                num = Integer.valueOf(searchMixXiGuaVideoViewHolder.getAdapterPosition());
            }
            aVar2.a(appId, str3, num, "list_item", this.f43073c.getVideoId());
        }
    }

    @NotNull
    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f43066c, false, 38125, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f43066c, false, 38125, new Class[0], View.class);
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XiGuaVideoItemViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(C0906R.id.drj);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.videoCover)");
        this.f43068e = (RemoteImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.drk);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.videoDuration)");
        this.f43069f = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.drq);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.videoTitle)");
        this.g = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.drm);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.videoExtraInfo)");
        this.h = (DmtTextView) findViewById4;
    }
}
