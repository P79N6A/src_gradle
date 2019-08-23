package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.port.in.r;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/CommerceStickerGoodsInfo;", "", "commerceStickerGoodsLayout", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/widget/LinearLayout;Landroid/content/Context;)V", "mStickerGoodsImage", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mStickerGoodsText", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "initCommerceStickerGoodsLayout", "", "commerceGoodsLayout", "showCommerceSticker", "bean", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "shootWay", "", "updateStickerGoodsLayout", "", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69510a;

    /* renamed from: b  reason: collision with root package name */
    public DmtTextView f69511b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteImageView f69512c;

    /* renamed from: d  reason: collision with root package name */
    private final LinearLayout f69513d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f69514e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f69516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FaceStickerBean f69517c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f69518d;

        a(d dVar, FaceStickerBean faceStickerBean, String str) {
            this.f69516b = dVar;
            this.f69517c = faceStickerBean;
            this.f69518d = str;
        }

        public final void onClick(View view) {
            Context context;
            String str;
            Context context2;
            String str2;
            if (PatchProxy.isSupport(new Object[]{view}, this, f69515a, false, 78547, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f69515a, false, 78547, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.utils.a.f75468b.a("click_transform_link", com.ss.android.ugc.aweme.app.d.d.a().a("prop_id", this.f69517c.getStickerId()).a("shoot_way", this.f69518d).a("carrier_type", "prop_panel").f34114b);
            r rVar = com.ss.android.ugc.aweme.port.in.a.n;
            DmtTextView dmtTextView = this.f69516b.f69511b;
            if (dmtTextView != null) {
                context = dmtTextView.getContext();
            } else {
                context = null;
            }
            c faceStickerCommerceBean = this.f69517c.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean != null) {
                str = faceStickerCommerceBean.f71642c;
            } else {
                str = null;
            }
            if (!rVar.a(context, str, false)) {
                r rVar2 = com.ss.android.ugc.aweme.port.in.a.n;
                DmtTextView dmtTextView2 = this.f69516b.f69511b;
                if (dmtTextView2 != null) {
                    context2 = dmtTextView2.getContext();
                } else {
                    context2 = null;
                }
                c faceStickerCommerceBean2 = this.f69517c.getFaceStickerCommerceBean();
                if (faceStickerCommerceBean2 != null) {
                    str2 = faceStickerCommerceBean2.f71641b;
                } else {
                    str2 = null;
                }
                rVar2.a(context2, str2, (String) null);
            }
        }
    }

    public d(@NotNull LinearLayout linearLayout, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "commerceStickerGoodsLayout");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f69513d = linearLayout;
        this.f69514e = context;
        LinearLayout linearLayout2 = this.f69513d;
        if (PatchProxy.isSupport(new Object[]{linearLayout2}, this, f69510a, false, 78544, new Class[]{LinearLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linearLayout2}, this, f69510a, false, 78544, new Class[]{LinearLayout.class}, Void.TYPE);
            return;
        }
        this.f69512c = (RemoteImageView) linearLayout2.findViewById(C0906R.id.xi);
        this.f69511b = (DmtTextView) linearLayout2.findViewById(C0906R.id.xk);
    }

    public final boolean a(@Nullable Effect effect, @Nullable String str) {
        String str2;
        Effect effect2 = effect;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{effect2, str3}, this, f69510a, false, 78545, new Class[]{Effect.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2, str3}, this, f69510a, false, 78545, new Class[]{Effect.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        FaceStickerBean a2 = q.a(effect);
        Intrinsics.checkExpressionValueIsNotNull(a2, "StickerConfig.covert(effect)");
        if (effect2 != null && effect2.is_busi) {
            c faceStickerCommerceBean = a2.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean != null && 1 == faceStickerCommerceBean.f71644e) {
                if (PatchProxy.isSupport(new Object[]{a2, str3}, this, f69510a, false, 78546, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{a2, str3}, this, f69510a, false, 78546, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.utils.a.f75468b.a("show_transform_link", com.ss.android.ugc.aweme.app.d.d.a().a("prop_id", a2.getStickerId()).a("shoot_way", str3).a("carrier_type", "prop_panel").f34114b);
                    this.f69513d.setVisibility(0);
                    RemoteImageView remoteImageView = this.f69512c;
                    UrlModel iconUrl = a2.getIconUrl();
                    Intrinsics.checkExpressionValueIsNotNull(iconUrl, "bean.iconUrl");
                    com.ss.android.ugc.aweme.base.c.a(remoteImageView, iconUrl.getUrlList().get(0));
                    DmtTextView dmtTextView = this.f69511b;
                    if (dmtTextView != null) {
                        c faceStickerCommerceBean2 = a2.getFaceStickerCommerceBean();
                        if (faceStickerCommerceBean2 != null) {
                            str2 = faceStickerCommerceBean2.f71643d;
                        } else {
                            str2 = null;
                        }
                        dmtTextView.setText(str2);
                    }
                    if (com.ss.android.g.a.a()) {
                        DmtTextView dmtTextView2 = this.f69511b;
                        if (dmtTextView2 != null) {
                            dmtTextView2.setFontType("ProximaNova-Semibold");
                        }
                    } else {
                        DmtTextView dmtTextView3 = this.f69511b;
                        if (dmtTextView3 != null) {
                            dmtTextView3.setFontType("PingFangSC-Medium");
                        }
                    }
                    this.f69513d.setOnClickListener(new a(this, a2, str3));
                }
                return true;
            }
        }
        this.f69513d.setVisibility(8);
        return false;
    }
}
