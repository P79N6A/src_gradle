package com.ss.android.ugc.aweme.discover.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.MicroAppStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.Map;

public class SearchMiniAppViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f41822c;

    /* renamed from: d  reason: collision with root package name */
    public MicroAppStruct f41823d;
    @BindView(2131494950)
    public RemoteImageView mAvatarIV;
    @BindView(2131494953)
    public RemoteImageView mAvatarSmallIV;
    @BindView(2131498006)
    public TextView mSummaryTV;
    @BindView(2131498007)
    public TextView mTitleTV;

    public final View a() {
        return this.itemView;
    }

    public SearchMiniAppViewHolder(final View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        final IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
        if (this.f41823d != null && !TextUtils.isEmpty(this.f41823d.schema) && iMiniAppService.isMinAppAvailable(view.getContext(), this.f41823d.schema)) {
            iMiniAppService.preloadMiniApp(this.f41823d.appId, this.f41823d.type);
        }
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41824a;

            public final void onClick(View view) {
                String str;
                if (PatchProxy.isSupport(new Object[]{view}, this, f41824a, false, 35815, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41824a, false, 35815, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (SearchMiniAppViewHolder.this.f41823d != null && !TextUtils.isEmpty(SearchMiniAppViewHolder.this.f41823d.schema)) {
                    d a2 = d.a().a("enter_from", "general_search").a("mp_id", SearchMiniAppViewHolder.this.f41823d.appId);
                    if (SearchMiniAppViewHolder.this.f41823d.type == 2) {
                        str = "micro_game";
                    } else {
                        str = "micro_app";
                    }
                    r.a("mp_click", (Map) a2.a("_param_for_special", str).f34114b);
                    if (((Integer) SharePrefCache.inst().getDownloadMicroApp().c()).intValue() != 0) {
                        iMiniAppService.openMiniApp(view.getContext(), SearchMiniAppViewHolder.this.f41823d.schema, new b.a().b("general_search").c("022001").a());
                    }
                }
            }
        });
    }
}
