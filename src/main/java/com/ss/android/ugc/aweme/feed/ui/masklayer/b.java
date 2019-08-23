package com.ss.android.ugc.aweme.feed.ui.masklayer;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.h.n;
import com.ss.android.ugc.aweme.feed.model.FeedSelfseeNoticeModel;
import com.ss.android.ugc.aweme.feed.model.MaskLayerOption;
import com.ss.android.ugc.aweme.feed.share.a.c;
import com.ss.android.ugc.aweme.feed.ui.g;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46699a;

    /* renamed from: b  reason: collision with root package name */
    private final MaskLayerOptionsAdapter f46700b;

    /* renamed from: c  reason: collision with root package name */
    private final MaskLayerOption f46701c;

    b(MaskLayerOptionsAdapter maskLayerOptionsAdapter, MaskLayerOption maskLayerOption) {
        this.f46700b = maskLayerOptionsAdapter;
        this.f46701c = maskLayerOption;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46699a, false, 43399, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46699a, false, 43399, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        MaskLayerOptionsAdapter maskLayerOptionsAdapter = this.f46700b;
        MaskLayerOption maskLayerOption = this.f46701c;
        if (!a.a(view)) {
            int i = maskLayerOption.mType;
            if (i != 5) {
                switch (i) {
                    case 1:
                        if (!PatchProxy.isSupport(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43392, new Class[0], Void.TYPE)) {
                            if (PatchProxy.isSupport(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43396, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43396, new Class[0], Void.TYPE);
                            } else {
                                h.a(maskLayerOptionsAdapter.f46688e, "download", new d().a("group_id", maskLayerOptionsAdapter.f46688e.getAid()).a("impr_type", aa.s(maskLayerOptionsAdapter.f46688e)).a("author_id", maskLayerOptionsAdapter.f46688e.getAuthorUid()).a("enter_from", maskLayerOptionsAdapter.g).a("download_type", (maskLayerOptionsAdapter.f46688e.getAuthor() == null || !TextUtils.equals(com.ss.android.ugc.aweme.account.d.a().getCurUserId(), maskLayerOptionsAdapter.f46688e.getAuthor().getUid())) ? "other" : "self").a("download_method", "long_press_download").a("log_pb", ai.a().a(aa.c(maskLayerOptionsAdapter.f46688e))).a("play_mode", AwemeAppData.p().ap ? "auto" : "normal"));
                            }
                            if (!maskLayerOptionsAdapter.f46688e.isPreventDownload()) {
                                if (c.a(maskLayerOptionsAdapter.f46685b, maskLayerOptionsAdapter.f46688e)) {
                                    if (!com.ss.android.ugc.aweme.commercialize.utils.c.L(maskLayerOptionsAdapter.f46688e) || com.ss.android.g.a.a()) {
                                        if (!com.ss.android.g.a.a() && maskLayerOptionsAdapter.f46686c.checkStatus("download")) {
                                            if (maskLayerOptionsAdapter.f46688e.getAwemeType() != 2 || !g.e(maskLayerOptionsAdapter.f46688e)) {
                                                if (!TextUtils.isEmpty("download")) {
                                                    if ((maskLayerOptionsAdapter.f46688e.getDistributeType() == 2 || maskLayerOptionsAdapter.f46688e.getDistributeType() == 3 || maskLayerOptionsAdapter.f46688e.getDistributeType() == 1) && maskLayerOptionsAdapter.f46688e.getVideoControl() != null) {
                                                        if (maskLayerOptionsAdapter.f46688e.getVideoControl().preventDownloadType != 3) {
                                                            if (maskLayerOptionsAdapter.f46688e.getVideoControl().preventDownloadType != 2) {
                                                                if (maskLayerOptionsAdapter.f46688e.getVideoControl().preventDownloadType == 4) {
                                                                    com.bytedance.ies.dmt.ui.d.a.c(maskLayerOptionsAdapter.f46685b, maskLayerOptionsAdapter.f46685b.getResources().getString(C0906R.string.pi)).a();
                                                                    break;
                                                                }
                                                            } else {
                                                                maskLayerOptionsAdapter.f46686c.a((IShareService.ShareStruct) null);
                                                                break;
                                                            }
                                                        } else {
                                                            com.bytedance.ies.dmt.ui.d.a.c(maskLayerOptionsAdapter.f46685b, maskLayerOptionsAdapter.f46685b.getResources().getString(C0906R.string.hv)).a();
                                                            break;
                                                        }
                                                    }
                                                    maskLayerOptionsAdapter.f46686c.onAction(maskLayerOptionsAdapter.f46687d, "download");
                                                    break;
                                                }
                                            } else {
                                                n nVar = new n(maskLayerOptionsAdapter.f46685b);
                                                nVar.a(new FeedSelfseeNoticeModel());
                                                nVar.a(maskLayerOptionsAdapter.f46688e.getAid());
                                                break;
                                            }
                                        }
                                    } else {
                                        com.bytedance.ies.dmt.ui.d.a.b(maskLayerOptionsAdapter.f46685b, (int) C0906R.string.ca).a();
                                        break;
                                    }
                                }
                            } else {
                                com.bytedance.ies.dmt.ui.d.a.c(maskLayerOptionsAdapter.f46685b, maskLayerOptionsAdapter.f46685b.getResources().getString(C0906R.string.pi)).a();
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43392, new Class[0], Void.TYPE);
                            break;
                        }
                        break;
                    case 2:
                        if (!PatchProxy.isSupport(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43393, new Class[0], Void.TYPE)) {
                            if (PatchProxy.isSupport(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43397, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43397, new Class[0], Void.TYPE);
                            } else {
                                h.b(maskLayerOptionsAdapter.f46688e, maskLayerOptionsAdapter.f46688e.isCollected() ? "cancel_favourite_video" : "favourite_video", d.a().a("enter_from", maskLayerOptionsAdapter.g).a("group_id", maskLayerOptionsAdapter.f46688e.getAid()).a("author_id", maskLayerOptionsAdapter.f46688e.getAuthorUid()).a("log_pb", ai.a().a(aa.c(maskLayerOptionsAdapter.f46688e))).a("enter_method", "long_press"));
                            }
                            if (com.ss.android.ugc.aweme.commercialize.utils.c.L(maskLayerOptionsAdapter.f46688e)) {
                                com.bytedance.ies.dmt.ui.d.a.b(maskLayerOptionsAdapter.f46685b, (int) C0906R.string.ca).a();
                            } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                                if (!PatchProxy.isSupport(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43390, new Class[0], Void.TYPE)) {
                                    String aid = maskLayerOptionsAdapter.f46688e != null ? maskLayerOptionsAdapter.f46688e.getAid() : "";
                                    e.a(com.ss.android.ugc.aweme.framework.core.a.b().a(), maskLayerOptionsAdapter.g, "click_favorite_video", ad.a().a("group_id", aid).a("log_pb", aa.g(aid)).f75487b, (f) new d(maskLayerOptionsAdapter));
                                    break;
                                } else {
                                    PatchProxy.accessDispatch(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43390, new Class[0], Void.TYPE);
                                    break;
                                }
                            } else {
                                maskLayerOptionsAdapter.a();
                            }
                            if (com.ss.android.g.a.a() && AbTestManager.a().aW()) {
                                com.ss.android.ugc.aweme.base.sharedpref.e.d().b("last_share_type", "TYPE_FAVORITE");
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43393, new Class[0], Void.TYPE);
                            break;
                        }
                    case 3:
                        if (!PatchProxy.isSupport(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43394, new Class[0], Void.TYPE)) {
                            if (!TextUtils.isEmpty("dislike")) {
                                maskLayerOptionsAdapter.f46686c.g = "long_press";
                                maskLayerOptionsAdapter.f46686c.onAction(maskLayerOptionsAdapter.f46687d, "dislike");
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43394, new Class[0], Void.TYPE);
                            break;
                        }
                        break;
                }
            } else {
                if (PatchProxy.isSupport(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43395, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], maskLayerOptionsAdapter, MaskLayerOptionsAdapter.f46684a, false, 43395, new Class[0], Void.TYPE);
                } else {
                    bg.a(new com.ss.android.ugc.aweme.follow.b.a(maskLayerOptionsAdapter.f46688e, "long_press"));
                }
            }
            if (maskLayerOptionsAdapter.h != null) {
                maskLayerOptionsAdapter.h.a(false);
            }
        }
    }
}
