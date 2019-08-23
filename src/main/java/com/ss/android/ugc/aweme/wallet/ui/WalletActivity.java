package com.ss.android.ugc.aweme.wallet.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.aweme.views.e;
import com.ss.android.ugc.aweme.wallet.a.a;
import com.ss.android.ugc.aweme.wallet.a.b;
import com.ss.android.ugc.aweme.wallet.a.c;
import com.ss.android.ugc.aweme.wallet.adapter.WalletListAdapter;
import com.ss.android.ugc.aweme.wallet.model.WalletEntranceResponse;
import java.util.List;
import java.util.Map;

public class WalletActivity extends AmeBaseActivity implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76578a;

    /* renamed from: b  reason: collision with root package name */
    private c f76579b;

    /* renamed from: c  reason: collision with root package name */
    private WalletListAdapter f76580c;
    @BindView(2131493371)
    DmtButton mBtnCharge;
    @BindView(2131493417)
    ButtonTitleBar mBtnTitleBar;
    @BindView(2131496765)
    RemoteImageView mRIVBanner;
    @BindView(2131496882)
    RecyclerView mRvWalletItemList;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497897)
    DmtTextView mTvDoubiBalance;

    public final int a() {
        return C0906R.layout.er;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f76578a, false, 89820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76578a, false, 89820, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wallet.ui.WalletActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wallet.ui.WalletActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76578a, false, 89821, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76578a, false, 89821, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wallet.ui.WalletActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void aq_() {
        if (PatchProxy.isSupport(new Object[0], this, f76578a, false, 89808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76578a, false, 89808, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.mStatusView.d();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f76578a, false, 89817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76578a, false, 89817, new Class[0], Void.TYPE);
            return;
        }
        this.f76579b.c();
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f76578a, false, 89818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76578a, false, 89818, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(C0906R.anim.cx, C0906R.anim.da);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f76578a, false, 89819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76578a, false, 89819, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.c.a.a.a();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f76578a, false, 89814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76578a, false, 89814, new Class[0], Void.TYPE);
            return;
        }
        eb.a(this, getResources().getColor(C0906R.color.yx));
    }

    public void exit(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f76578a, false, 89815, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76578a, false, 89815, new Class[]{View.class}, Void.TYPE);
            return;
        }
        finish();
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f76578a, false, 89812, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f76578a, false, 89812, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f76578a, false, 89809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76578a, false, 89809, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.mStatusView.f();
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131493371})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f76578a, false, 89813, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76578a, false, 89813, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            r.a("enter_charge", (Map) null);
            com.ss.android.ugc.aweme.wallet.a.a(this, "page_charge");
        }
    }

    public final void a(WalletEntranceResponse walletEntranceResponse) {
        WalletEntranceResponse walletEntranceResponse2 = walletEntranceResponse;
        if (PatchProxy.isSupport(new Object[]{walletEntranceResponse2}, this, f76578a, false, 89811, new Class[]{WalletEntranceResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{walletEntranceResponse2}, this, f76578a, false, 89811, new Class[]{WalletEntranceResponse.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (walletEntranceResponse.isShowBanner() && walletEntranceResponse.getBanner() != null) {
                this.mRIVBanner.setVisibility(0);
                this.mRIVBanner.setImageURI(walletEntranceResponse.getBanner().f76570b);
                if (walletEntranceResponse.isCanEnterBanner()) {
                    this.mRIVBanner.setOnClickListener(new b(this, walletEntranceResponse2));
                }
            }
            if (walletEntranceResponse.getMyWallet() != null) {
                this.mTvDoubiBalance.setText(String.valueOf(walletEntranceResponse.getMyWallet().f76577a));
            }
            WalletListAdapter walletListAdapter = this.f76580c;
            List<WalletEntranceResponse.b> cells = walletEntranceResponse.getCells();
            if (PatchProxy.isSupport(new Object[]{cells}, walletListAdapter, WalletListAdapter.f76558a, false, 89794, new Class[]{List.class}, Void.TYPE)) {
                WalletListAdapter walletListAdapter2 = walletListAdapter;
                PatchProxy.accessDispatch(new Object[]{cells}, walletListAdapter2, WalletListAdapter.f76558a, false, 89794, new Class[]{List.class}, Void.TYPE);
            } else {
                walletListAdapter.f76559b = cells;
                walletListAdapter.notifyItemRangeInserted(0, walletListAdapter.getItemCount());
            }
            if (PatchProxy.isSupport(new Object[0], this, f76578a, false, 89810, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f76578a, false, 89810, new Class[0], Void.TYPE);
                return;
            }
            if (isViewValid()) {
                this.mStatusView.b(true);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f76578a, false, 89805, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f76578a, false, 89805, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wallet.ui.WalletActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f76578a, false, 89806, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76578a, false, 89806, new Class[0], Void.TYPE);
        } else {
            com.bytedance.ies.dmt.ui.widget.c a2 = e.a(this, new a(this));
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this);
            dmtDefaultView.setStatus(a2);
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) this).a((int) C0906R.string.b5r).c((View) dmtDefaultView));
            this.mBtnTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76581a;

                public final void a(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f76581a, false, 89824, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f76581a, false, 89824, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    WalletActivity.this.exit(view2);
                }

                public final void b(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f76581a, false, 89825, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f76581a, false, 89825, new Class[]{View.class}, Void.TYPE);
                    } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                        WalletActivity.this.a("https://wallet.snssdk.com/douyin/withdraw/faq?hide_nav_bar=1", null);
                    }
                }
            });
            this.f76580c = new WalletListAdapter();
            this.mRvWalletItemList.setAdapter(this.f76580c);
            this.mRvWalletItemList.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        if (PatchProxy.isSupport(new Object[0], this, f76578a, false, 89807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76578a, false, 89807, new Class[0], Void.TYPE);
        } else {
            this.f76579b = new c(new b(), this);
            c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wallet.ui.WalletActivity", "onCreate", false);
    }

    public final void a(String str, String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, null}, this, f76578a, false, 89816, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, null}, this, f76578a, false, 89816, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (!StringUtils.isEmpty(null)) {
            r.a((String) null, (Map) null);
        }
        h.a().a(str3);
    }
}
