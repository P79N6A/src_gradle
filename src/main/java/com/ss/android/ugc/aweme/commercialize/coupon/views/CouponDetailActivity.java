package com.ss.android.ugc.aweme.commercialize.coupon.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.coupon.a;
import com.ss.android.ugc.aweme.commercialize.coupon.a.b;
import com.ss.android.ugc.aweme.commercialize.coupon.a.e;
import com.ss.android.ugc.aweme.commercialize.coupon.a.f;
import com.ss.android.ugc.aweme.commercialize.coupon.a.h;
import com.ss.android.ugc.aweme.commercialize.coupon.model.CouponMessage;
import com.ss.android.ugc.aweme.commercialize.coupon.model.a;
import com.ss.android.ugc.aweme.commercialize.coupon.model.c;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class CouponDetailActivity extends AmeSSActivity implements e, f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2896a;
    @BindView(2131493187)
    AvatarImageView avatarImageView;

    /* renamed from: b  reason: collision with root package name */
    private b f2897b;

    /* renamed from: c  reason: collision with root package name */
    private h f2898c;
    @BindView(2131493814)
    View couponDivideView;
    @BindView(2131493817)
    LinearLayout couponListBt;
    @BindView(2131493819)
    View couponNumberFL;
    @BindView(2131493820)
    TextView couponNumberTitleTv;
    @BindView(2131493821)
    TextView couponNumberTv;
    @BindView(2131493823)
    TextView couponStatusTv;
    @BindView(2131493825)
    DmtTextView couponUseBt;

    /* renamed from: d  reason: collision with root package name */
    private c f2899d;

    /* renamed from: e  reason: collision with root package name */
    private int f2900e;

    /* renamed from: f  reason: collision with root package name */
    private String f2901f = "";
    private String g = "";
    private boolean h;
    @BindView(2131494568)
    RemoteImageView headImageIv;
    @BindView(2131494569)
    ImageView headImageIvBg;
    private int i;
    private boolean j;
    @BindView(2131493355)
    RemoteImageView mBRCodeIV;
    @BindView(2131498004)
    DmtTextView mMerchantDetail;
    @BindView(2131496570)
    RemoteImageView mQRCodeIV;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131494885)
    View merchantContact;
    @BindView(2131494886)
    View merchantDetail;
    @BindView(2131494887)
    View merchantMoreBtn;
    @BindView(2131495759)
    TextView merchantNameTv;
    @BindView(2131494888)
    View merchantPoiList;
    @BindView(2131494889)
    View merchantPosition;
    @BindView(2131497618)
    TextView titleView;
    @BindView(2131498413)
    TextView validEndTimeTv;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2896a, false, 30492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2896a, false, 30492, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2896a, false, 30493, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2896a, false, 30493, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2896a, false, 30481, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2896a, false, 30481, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.f();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2896a, false, 30472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2896a, false, 30472, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f2896a, false, 30474, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2896a, false, 30474, new Class[0], Void.TYPE);
            return;
        }
        ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f2896a, false, 30491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2896a, false, 30491, new Class[0], Void.TYPE);
            return;
        }
        if (this.j && this.i != -1) {
            Intent intent = new Intent();
            intent.putExtra("coupon_list_position", this.i);
            intent.putExtra("coupon_info", this.f2899d);
            setResult(-1, intent);
        }
        super.finish();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2896a, false, 30483, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2896a, false, 30483, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2899d.getStatus() == a.StatusValid.value) {
            this.couponStatusTv.setVisibility(8);
            if (this.mQRCodeIV.getVisibility() == 0) {
                this.mQRCodeIV.setImageAlpha(255);
            }
            if (this.mBRCodeIV.getVisibility() == 0) {
                this.mBRCodeIV.setImageAlpha(255);
            }
        } else {
            this.couponStatusTv.setText(com.ss.android.ugc.aweme.commercialize.coupon.a.a(this, this.f2899d.getStatus(), false));
            this.couponStatusTv.setVisibility(0);
            this.couponNumberTv.setTextColor(getResources().getColor(C0906R.color.im));
            if (this.mBRCodeIV.getVisibility() == 0) {
                this.mBRCodeIV.setImageAlpha(87);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mBRCodeIV.getLayoutParams();
                layoutParams.topMargin = u.a(12.0d);
                this.mBRCodeIV.setLayoutParams(layoutParams);
            }
            if (this.mQRCodeIV.getVisibility() == 0) {
                this.mQRCodeIV.setImageAlpha(87);
                if (this.mBRCodeIV.getVisibility() == 8) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mQRCodeIV.getLayoutParams();
                    layoutParams2.topMargin = u.a(8.0d);
                    this.mQRCodeIV.setLayoutParams(layoutParams2);
                }
            }
            if (a(this.f2899d)) {
                this.couponUseBt.setClickable(false);
                this.couponUseBt.setBackgroundResource(2130838547);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.couponNumberFL.getLayoutParams();
                layoutParams3.topMargin = u.a(4.0d);
                this.couponNumberFL.setLayoutParams(layoutParams3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2896a, false, 30479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2896a, false, 30479, new Class[0], Void.TYPE);
        } else if (this.f2900e == 0 || TextUtils.isEmpty(this.f2901f)) {
            if (isViewValid()) {
                this.mStatusView.f();
            }
        } else {
            this.f2897b.a(this.f2900e, this.f2901f);
        }
    }

    private String a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2896a, false, 30487, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f2896a, false, 30487, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (char c2 : str.toCharArray()) {
                if (i2 % 4 == 0) {
                    sb.append(" ");
                }
                sb.append(c2);
                i2++;
            }
            return sb.toString();
        }
    }

    private void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2896a, false, 30489, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f2896a, false, 30489, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("click_coupon_link", (Map) d.a().a("enter_from", "coupon_detail").a("previous_page", "coupon_detail").a("destination", str2).a("source_type", com.ss.android.ugc.aweme.commercialize.coupon.a.a(this.f2899d)).f34114b);
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.b.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f2896a, false, 30476, new Class[]{com.ss.android.websocket.b.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f2896a, false, 30476, new Class[]{com.ss.android.websocket.b.b.c.class}, Void.TYPE);
            return;
        }
        Object obj = cVar.f78210c;
        if (obj != null && (obj instanceof CouponMessage)) {
            CouponMessage couponMessage = (CouponMessage) obj;
            if (PatchProxy.isSupport(new Object[]{couponMessage}, this, f2896a, false, 30477, new Class[]{CouponMessage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{couponMessage}, this, f2896a, false, 30477, new Class[]{CouponMessage.class}, Void.TYPE);
            } else if (couponMessage != null && couponMessage.msgType == 1 && TextUtils.equals(this.f2899d.getCodeId(), couponMessage.codeId)) {
                this.j = true;
                this.f2899d.setStatus(a.StatusRedeemed.value);
                b();
            }
        }
    }

    private boolean a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f2896a, false, 30486, new Class[]{c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar}, this, f2896a, false, 30486, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
        } else if (cVar.getCouponSource() == 1 && cVar.getCouponType() == 1) {
            return true;
        } else {
            return false;
        }
    }

    @OnClick({2131494886, 2131494885, 2131493825, 2131493215, 2131494888, 2131494889, 2131494887})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f2896a, false, 30488, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f2896a, false, 30488, new Class[]{View.class}, Void.TYPE);
        } else if (this.f2899d != null) {
            String valueOf = String.valueOf(this.f2899d.getUserId());
            int id = view.getId();
            if (id == C0906R.id.iz) {
                finish();
            } else if (id == C0906R.id.awn) {
                UserProfileActivity.a((Context) this, valueOf, this.f2899d.getSecUid(), "coupon");
                b("others_homepage");
            } else if (id == C0906R.id.awl) {
                this.f2898c.a(valueOf);
                b("message");
            } else if (id == C0906R.id.awm) {
                b("coupon_desc");
                g.a((Context) this, this.f2899d.getDetailUrl(), "", true, (Map<String, String>) null);
            } else if (id == C0906R.id.awo) {
                if (!CollectionUtils.isEmpty(this.f2899d.getPoiList())) {
                    b("coupon_restaurant");
                    if (this.f2899d.getPoiList().size() == 1) {
                        PoiDetailActivity.a(this, new l.a().c((String) this.f2899d.getPoiList().get(0)).l("click_coupon_restaurant").i("coupon_detail").a());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("poi_coupon_id", this.f2900e);
                    bundle.putString("poi_coupon_code_id", this.f2901f);
                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openPoiCouponScopeActivity(this, bundle);
                }
            } else if (id == C0906R.id.a19) {
                b("use_now_h5");
                g.a((Context) this, this.f2899d.getUsePageLink(), getString(C0906R.string.a3_), true, (Map<String, String>) null);
            } else {
                if (id == C0906R.id.awp) {
                    b("store_h5");
                    g.a((Context) this, this.f2899d.getStorePageLink(), "", true, (Map<String, String>) null);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2896a, false, 30471, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2896a, false, 30471, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b2);
        ButterKnife.bind((Activity) this);
        if (PatchProxy.isSupport(new Object[0], this, f2896a, false, 30473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2896a, false, 30473, new Class[0], Void.TYPE);
        } else {
            com.bytedance.ies.dmt.ui.widget.c a2 = com.ss.android.ugc.aweme.views.e.a(this, new b(this));
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this);
            dmtDefaultView.setSupportDelayVisible(true);
            dmtDefaultView.setStatus(a2);
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) this).a((int) C0906R.string.b5r).c((View) dmtDefaultView));
            this.mStatusView.setUseScreenHeight(getResources().getDimensionPixelSize(C0906R.dimen.lj));
            ((GenericDraweeHierarchy) this.headImageIv.getHierarchy()).setRoundingParams(RoundingParams.fromCornersRadii((float) u.a(8.0d), (float) u.a(8.0d), 0.0f, 0.0f));
            com.ss.android.ugc.aweme.utils.c.a(this.merchantPoiList);
            com.ss.android.ugc.aweme.utils.c.a(this.merchantContact);
            com.ss.android.ugc.aweme.utils.c.a(this.merchantDetail);
            com.ss.android.ugc.aweme.utils.c.a(this.merchantMoreBtn);
        }
        if (PatchProxy.isSupport(new Object[0], this, f2896a, false, 30475, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2896a, false, 30475, new Class[0], Void.TYPE);
        } else {
            this.f2897b = new b(new com.ss.android.ugc.aweme.commercialize.coupon.a.a(), this);
            this.f2898c = new h(new com.ss.android.ugc.aweme.commercialize.coupon.a.g(), this);
            try {
                this.f2900e = Integer.parseInt(getIntent().getStringExtra("coupon_id"));
            } catch (Exception unused) {
            }
            this.f2901f = getIntent().getStringExtra("code_id");
            if (!this.mStatusView.f20470b) {
                this.mStatusView.d();
            }
            this.g = getIntent().getStringExtra("enter_from");
            this.i = getIntent().getIntExtra("coupon_list_position", -1);
            a();
        }
        bg.c(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity", "onCreate", false);
    }

    public final void a(com.ss.android.ugc.aweme.commercialize.coupon.model.d dVar) {
        String str;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        com.ss.android.ugc.aweme.commercialize.coupon.model.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f2896a, false, 30480, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.model.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f2896a, false, 30480, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.model.d.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.b(true);
            if (PatchProxy.isSupport(new Object[]{dVar2}, this, f2896a, false, 30482, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.model.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar2}, this, f2896a, false, 30482, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.model.d.class}, Void.TYPE);
            } else if (dVar2 == null) {
                this.mStatusView.f();
                this.f2899d = null;
            } else {
                c cVar = dVar2.f38587a;
                this.f2899d = cVar;
                if (cVar == null) {
                    this.mStatusView.f();
                } else {
                    com.ss.android.ugc.aweme.base.c.b(this.headImageIv, cVar.getHeadImageUrl());
                    com.ss.android.ugc.aweme.base.c.b(this.avatarImageView, cVar.getLogoImageUrl());
                    int i5 = 8;
                    if (cVar.isDefaultHeadImage()) {
                        this.headImageIvBg.setVisibility(8);
                    } else {
                        this.headImageIvBg.setVisibility(0);
                    }
                    this.titleView.setText(cVar.getTitle());
                    this.merchantNameTv.setText(cVar.getMerchantName());
                    this.validEndTimeTv.setText(getResources().getString(C0906R.string.a3b, new Object[]{cVar.getValidEnd()}));
                    DmtTextView dmtTextView = this.mMerchantDetail;
                    int payType = cVar.getPayType();
                    if (!PatchProxy.isSupport(new Object[]{this, Integer.valueOf(payType)}, null, com.ss.android.ugc.aweme.commercialize.coupon.a.f38536a, true, 30426, new Class[]{Context.class, Integer.TYPE}, String.class)) {
                        switch (a.AnonymousClass1.f38538b[com.ss.android.ugc.aweme.commercialize.coupon.model.f.Companion.a(payType).ordinal()]) {
                            case 1:
                                str = getResources().getString(C0906R.string.a2m);
                                break;
                            case 2:
                                str = getResources().getString(C0906R.string.a2x);
                                break;
                            default:
                                str = "";
                                break;
                        }
                    } else {
                        str = (String) PatchProxy.accessDispatch(new Object[]{this, Integer.valueOf(payType)}, null, com.ss.android.ugc.aweme.commercialize.coupon.a.f38536a, true, 30426, new Class[]{Context.class, Integer.TYPE}, String.class);
                    }
                    dmtTextView.setText(str);
                    if (a(cVar)) {
                        this.mBRCodeIV.setVisibility(8);
                        this.mQRCodeIV.setVisibility(8);
                    } else {
                        if (cVar.getCodabarImageUrl() != null) {
                            this.mBRCodeIV.setVisibility(0);
                            com.ss.android.ugc.aweme.base.c.a(this.mBRCodeIV, cVar.getCodabarImageUrl());
                        }
                        if (cVar.getQrCodeUrl() != null) {
                            this.mQRCodeIV.setVisibility(0);
                            if (this.mBRCodeIV.getVisibility() == 8) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mQRCodeIV.getLayoutParams();
                                layoutParams.width = u.a(220.0d);
                                layoutParams.height = u.a(220.0d);
                                layoutParams.topMargin = u.a(16.0d);
                                this.mQRCodeIV.setLayoutParams(layoutParams);
                            }
                            com.ss.android.ugc.aweme.base.c.b(this.mQRCodeIV, cVar.getQrCodeUrl());
                        }
                    }
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f2896a, false, 30484, new Class[]{c.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar}, this, f2896a, false, 30484, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
                    } else if (cVar.getCouponSource() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        this.merchantMoreBtn.setVisibility(0);
                        View view = this.merchantPoiList;
                        if (CollectionUtils.isEmpty(cVar.getPoiList())) {
                            i4 = 8;
                        } else {
                            i4 = 0;
                        }
                        view.setVisibility(i4);
                        this.merchantPosition.setVisibility(8);
                        this.merchantContact.setVisibility(0);
                        this.merchantDetail.setVisibility(0);
                        this.couponNumberTv.setText(a(cVar.getCode()));
                    } else {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f2896a, false, 30485, new Class[]{c.class}, Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar}, this, f2896a, false, 30485, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
                        } else if (cVar.getCouponSource() == 1 && cVar.getCouponType() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            this.merchantMoreBtn.setVisibility(8);
                            this.merchantPoiList.setVisibility(8);
                            View view2 = this.merchantPosition;
                            if (cVar.getStorePageLink() == null) {
                                i3 = 8;
                            } else {
                                i3 = 0;
                            }
                            view2.setVisibility(i3);
                            this.merchantContact.setVisibility(8);
                            View view3 = this.merchantDetail;
                            if (cVar.getDetailUrl() != null) {
                                i5 = 0;
                            }
                            view3.setVisibility(i5);
                            this.couponNumberTv.setText(cVar.getCode());
                        } else if (a(cVar)) {
                            this.merchantMoreBtn.setVisibility(8);
                            this.merchantPoiList.setVisibility(8);
                            this.merchantPosition.setVisibility(8);
                            this.merchantContact.setVisibility(8);
                            View view4 = this.merchantDetail;
                            if (cVar.getDetailUrl() == null) {
                                i2 = 8;
                            } else {
                                i2 = 0;
                            }
                            view4.setVisibility(i2);
                            this.couponNumberTv.setText(a(cVar.getCode()));
                            this.couponDivideView.setVisibility(8);
                            this.couponUseBt.setVisibility(0);
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.couponNumberFL.getLayoutParams();
                            layoutParams2.topMargin = u.a(12.0d);
                            this.couponNumberFL.setLayoutParams(layoutParams2);
                            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.couponListBt.getLayoutParams();
                            layoutParams3.topMargin = u.a(16.0d);
                            this.couponListBt.setLayoutParams(layoutParams3);
                        }
                    }
                    b();
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f2896a, false, 30478, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2896a, false, 30478, new Class[0], Void.TYPE);
                return;
            }
            if (!this.h && !TextUtils.isEmpty(this.g) && this.f2899d != null) {
                r.a("click_coupon", (Map) d.a().a("enter_from", this.g).a("previous_page", this.g).a("coupon_id", this.f2899d.getCouponId()).a("enter_method", "click_message").a("coupon_type", com.ss.android.ugc.aweme.commercialize.coupon.a.a(this, this.f2899d.getStatus(), true)).a("source_type", com.ss.android.ugc.aweme.commercialize.coupon.a.a(this.f2899d)).f34114b);
            }
        }
    }

    public final void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f2896a, false, 30490, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f2896a, false, 30490, new Class[]{User.class}, Void.TYPE);
            return;
        }
        IIMService a2 = com.ss.android.ugc.aweme.im.b.a(false);
        if (com.ss.android.ugc.aweme.im.b.b() && a2 != null) {
            a2.startChat((Context) this, com.ss.android.ugc.aweme.im.b.a(user));
        }
    }

    public static void a(Context context, int i2, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2), str2}, null, f2896a, true, 30469, new Class[]{Context.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2), str2}, null, f2896a, true, 30469, new Class[]{Context.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, CouponDetailActivity.class);
        intent.putExtra("coupon_id", String.valueOf(i2));
        intent.putExtra("code_id", str2);
        context2.startActivity(intent);
    }
}
