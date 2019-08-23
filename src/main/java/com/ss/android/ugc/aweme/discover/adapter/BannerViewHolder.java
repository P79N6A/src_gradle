package com.ss.android.ugc.aweme.discover.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.k;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.base.b;
import com.ss.android.ugc.aweme.discover.mob.c;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.profile.api.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ug.a.a;
import com.ss.android.ugc.aweme.utils.ag;
import com.ss.android.ugc.aweme.utils.ex;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class BannerViewHolder extends RecyclerView.ViewHolder implements WeakHandler.IHandler {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f41531c;

    /* renamed from: a  reason: collision with root package name */
    private int f41532a;

    /* renamed from: b  reason: collision with root package name */
    private int f41533b;

    /* renamed from: d  reason: collision with root package name */
    public Banner f41534d;

    /* renamed from: e  reason: collision with root package name */
    private int f41535e;

    /* renamed from: f  reason: collision with root package name */
    private WeakHandler f41536f = new WeakHandler(Looper.getMainLooper(), this);
    @BindView(2131496925)
    RemoteImageView mSdCover;

    @OnClick({2131496925})
    public void clickCover() {
        if (PatchProxy.isSupport(new Object[0], this, f41531c, false, 35493, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41531c, false, 35493, new Class[0], Void.TYPE);
            return;
        }
        if (!ex.b() && this.f41534d != null && !TextUtils.isEmpty(this.f41534d.getSchema())) {
            StringBuilder sb = new StringBuilder();
            String schema = this.f41534d.getSchema();
            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
            if (a.a(this.itemView.getContext(), schema)) {
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trySetJumpToFissionH5(schema);
                a(schema);
                return;
            }
            if (schema.startsWith("https://") || schema.startsWith("http://")) {
                try {
                    sb.append("aweme://ame/webview/?url=");
                    sb.append(URLEncoder.encode(schema, "ISO-8859-1"));
                    sb.append("&title=");
                    sb.append(URLEncoder.encode(this.f41534d.getTitle(), "UTF-8"));
                } catch (Exception unused) {
                }
                Context context = this.itemView.getContext();
                Intent a2 = b.a(context, Uri.parse(sb.toString()));
                a2.setClass(context, CrossPlatformActivity.class);
                a2.putExtra("hide_more", false);
                a2.putExtra("enter_from", "banner");
                context.startActivity(a2);
            } else if (schema.startsWith("sslocal://studio/task/create")) {
                if (this.itemView.getContext() instanceof Activity) {
                    this.itemView.getContext().startActivity(com.ss.android.ugc.aweme.shortvideo.k.a.f68275b.a((Activity) this.itemView.getContext(), Uri.parse(schema)));
                }
            } else if (schema.startsWith("sslocal://live")) {
                e.a().a(this.f41536f, Uri.parse(schema).getQueryParameter("user_id"));
            } else if (schema.startsWith("sslocal://showcaseh5")) {
                g.d(this.itemView.getContext(), schema);
            } else if (iMiniAppService.isAppBrandSchema(schema)) {
                iMiniAppService.openMiniApp(this.itemView.getContext(), schema, new b.a().b("banner").a());
            } else {
                sb.append(schema);
                h.a().a(sb.toString());
            }
            a(sb.toString());
        }
    }

    public BannerViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f41532a = UIUtils.getScreenWidth(view.getContext());
    }

    private void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f41531c, false, 35494, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f41531c, false, 35494, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a((Context) null, "banner_click", "click", Long.toString(this.f41534d.getCreativeId()), (long) (this.f41535e + 1));
        r.a("banner_click", (Map) new c().setBannerId(this.f41534d.getBid()).setClientOrder(this.f41535e + 1).setTagId(ag.a(str)).buildParams());
        if (this.f41534d.isAd()) {
            com.ss.android.ugc.aweme.commercialize.log.g.a(this.itemView.getContext(), this.f41534d, this.f41535e + 1);
        }
        if (k.a("aweme://challenge/detail/:id", str2)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", "banner");
                jSONObject.put("enter_method", "click_banner");
                jSONObject.put("tag_id", str2.substring(str2.lastIndexOf(47) + 1));
                jSONObject.put("scene_id", "1008");
                Banner banner = this.f41534d;
                if (banner != null) {
                    String bid = banner.getBid();
                    if (bid != null) {
                        jSONObject.put("banner_id", bid);
                    }
                }
                r.a("enter_tag_detail", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f41531c, false, 35495, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f41531c, false, 35495, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        Context context = this.itemView.getContext();
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.bytedance.ies.dmt.ui.d.a.b(context, ((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg()).a();
        } else if (obj instanceof Exception) {
            com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.bgg).a();
        } else {
            if (i == 0 && (obj instanceof User)) {
                User user = (User) message.obj;
                if (!user.isLive()) {
                    com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.b5v).a();
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("live.intent.extra.REQUEST_ID", this.f41534d.getRequestId());
                com.ss.android.ugc.aweme.story.live.c.a(context, user, "discovery", bundle);
            }
        }
    }

    public void a(Banner banner, int i) {
        Banner banner2 = banner;
        if (PatchProxy.isSupport(new Object[]{banner2, Integer.valueOf(i)}, this, f41531c, false, 35492, new Class[]{Banner.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{banner2, Integer.valueOf(i)}, this, f41531c, false, 35492, new Class[]{Banner.class, Integer.TYPE}, Void.TYPE);
        } else if (banner2 != null && banner2 != this.f41534d) {
            this.f41534d = banner2;
            this.f41535e = i;
            if (this.f41534d.getBannerUrl() != null && !CollectionUtils.isEmpty(this.f41534d.getBannerUrl().getUrlList())) {
                RemoteImageView remoteImageView = this.mSdCover;
                String str = this.f41534d.getBannerUrl().getUrlList().get(0);
                int i2 = this.f41532a;
                int i3 = this.f41533b;
                if (PatchProxy.isSupport(new Object[]{remoteImageView, str, Integer.valueOf(i2), Integer.valueOf(i3)}, null, com.ss.android.ugc.aweme.base.c.f34655a, true, 23953, new Class[]{RemoteImageView.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{remoteImageView, str, Integer.valueOf(i2), Integer.valueOf(i3)}, null, com.ss.android.ugc.aweme.base.c.f34655a, true, 23953, new Class[]{RemoteImageView.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (remoteImageView != null) {
                    if (TextUtils.isEmpty(str)) {
                        com.ss.android.ugc.aweme.base.c.a(remoteImageView, 2130839027);
                    } else {
                        ResizeOptions resizeOptions = null;
                        if (i2 > 0 && i3 > 0) {
                            resizeOptions = new ResizeOptions(i2, i3);
                        }
                        ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str));
                        if (resizeOptions != null) {
                            newBuilderWithSource.setResizeOptions(resizeOptions);
                        }
                        remoteImageView.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(remoteImageView.getController())).setImageRequest(newBuilderWithSource.build())).setAutoPlayAnimations(true)).build());
                    }
                }
            }
            com.ss.android.ugc.aweme.commercialize.ad.c cVar = new com.ss.android.ugc.aweme.commercialize.ad.c((float) u.a(4.0d), this.itemView.getContext().getResources().getColor(C0906R.color.a1x));
            cVar.setAlpha(76);
            DmtTextView dmtTextView = (DmtTextView) this.itemView.findViewById(C0906R.id.w2);
            if (dmtTextView != null) {
                dmtTextView.setBackgroundDrawable(cVar);
                if (this.f41534d.getAdData() == null || this.f41534d.getAdData().getAdLabel() == null) {
                    dmtTextView.setVisibility(8);
                } else {
                    dmtTextView.setText(this.f41534d.getAdData().getAdLabel().text);
                    dmtTextView.setVisibility(0);
                }
            }
        }
    }
}
