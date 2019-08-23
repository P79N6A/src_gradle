package com.ss.android.ugc.aweme.feed.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.utils.DouplusTitleHelper;
import com.ss.android.ugc.aweme.commercialize.utils.x;
import com.ss.android.ugc.aweme.commercialize.views.PrivateShareTopItemView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.h.o;
import com.ss.android.ugc.aweme.feed.h.p;
import com.ss.android.ugc.aweme.feed.h.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeAdStatus;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.share.a.a.a;
import com.ss.android.ugc.aweme.feed.share.a.c;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.h;
import com.ss.android.ugc.aweme.livewallpaper.c.e;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.share.bu;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.shortvideo.util.n;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.u.z;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.utils.bi;
import com.ss.android.ugc.aweme.utils.cr;
import com.ss.android.ugc.aweme.utils.eq;
import com.ss.android.ugc.aweme.utils.u;
import java.util.ArrayList;
import java.util.Map;

public class PrivateDialog extends IShareService.SharePage implements s, a, b.C0026b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46233a;

    /* renamed from: b  reason: collision with root package name */
    aa<ar> f46234b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f46235c;
    @BindView(2131493455)
    public DmtTextView cancel;

    /* renamed from: d  reason: collision with root package name */
    public p f46236d = new p(getContext());
    @BindView(2131494018)
    LinearLayout douPlusShareItem;
    @BindView(2131495538)
    View duet;

    /* renamed from: e  reason: collision with root package name */
    public String f46237e;

    /* renamed from: f  reason: collision with root package name */
    public Activity f46238f;
    public b.a g;
    private View h;
    private com.ss.android.ugc.aweme.feed.share.a.a i;
    @BindView(2131494019)
    ImageView ivDou;
    @BindView(2131495500)
    View ivLiveWallpaper;
    @BindView(2131496460)
    ImageView ivPrivate;
    @BindView(2131496709)
    ImageView ivReport;
    private com.ss.android.ugc.aweme.livewallpaper.a.b j;
    private int k;
    private int l;
    private com.ss.android.ugc.aweme.feed.share.a.b m;
    @BindView(2131493381)
    View mBtnFavouriteWrapper;
    @BindView(2131493380)
    com.ss.android.ugc.aweme.share.seconditem.b mCollectItemView;
    @BindView(2131495271)
    View mMultiShareRv;
    @BindView(2131496852)
    CoordinatorLayout mRootView;
    @BindView(2131495296)
    LinearLayout mSecondLayout;
    @BindView(2131496991)
    View mSecondRv;
    @BindView(2131495804)
    public DmtEditText mSendEt;
    @BindView(2131495803)
    public RemoteImageView mShareCover;
    @BindView(2131497663)
    FrameLayout mTopExternalLayout;
    @BindView(2131494036)
    ImageView mTvSaveVideo;
    @BindView(2131495577)
    View react;
    @BindView(2131495581)
    View reuseMvView;
    @BindView(2131495580)
    View reuseSticker;
    @BindView(2131496461)
    LinearLayout seeAdsPlanItem;
    @BindView(2131497030)
    public DmtTextView send;
    @BindView(2131498533)
    PrivateShareTopItemView shareTopItemView;
    @BindView(2131495706)
    RelativeLayout tlVideoPublic;
    @BindView(2131494029)
    DmtTextView tvDou;
    @BindView(2131496463)
    TextView tvPrivate;

    public void setPanelTitle(String str) {
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f46233a, false, 42916, new Class[0], Boolean.TYPE)) {
            return StringUtils.equal(d.a().getCurUserId(), this.f46235c.getAuthorUid());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42916, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @OnClick({2131493455})
    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42928, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42913, new Class[0], Void.TYPE);
            return;
        }
        super.dismiss();
        if (this.g != null) {
            this.g.a();
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42915, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42915, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
    }

    private boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42937, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42937, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (ContextCompat.checkSelfPermission(this.f46238f, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        } else {
            com.ss.android.ugc.aweme.ac.b.a(this.f46238f, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46241a;

                public final void a(String[] strArr, int[] iArr) {
                    if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f46241a, false, 42950, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f46241a, false, 42950, new Class[]{String[].class, int[].class}, Void.TYPE);
                        return;
                    }
                    if (iArr.length > 0 && iArr[0] == -1 && !ActivityCompat.shouldShowRequestPermissionRationale(PrivateDialog.this.f46238f, strArr[0])) {
                        bc.a(PrivateDialog.this.f46238f, C0906R.string.fs, C0906R.string.pm, null, C0906R.string.a0x, new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f46243a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46243a, false, 42951, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46243a, false, 42951, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                bi.a(PrivateDialog.this.f46238f);
                            }
                        }).show();
                    }
                }
            });
            return false;
        }
    }

    public final h a() {
        if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42942, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42942, new Class[0], h.class);
        }
        h hVar = new h();
        hVar.f50072a = this.cancel;
        hVar.f50076e = this.mSecondRv;
        hVar.j = this.mShareCover;
        hVar.f50075d = this.mMultiShareRv;
        hVar.k = this.mSendEt;
        hVar.f50077f = this.h;
        hVar.f50073b = this.send;
        hVar.l = this;
        return hVar;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42939, new Class[0], Void.TYPE);
            return;
        }
        String a2 = c.a();
        if (TextUtils.isEmpty(a2)) {
            a2 = this.f46238f.getString(C0906R.string.a7m);
        }
        Toast makeText = Toast.makeText(this.f46238f, a2, 1);
        if (PatchProxy.isSupport(new Object[]{makeText}, null, ay.f46534a, true, 42962, new Class[]{Toast.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{makeText}, null, ay.f46534a, true, 42962, new Class[]{Toast.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT == 25) {
            eq.a(makeText);
        }
        makeText.show();
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42912, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        Aweme aweme = this.f46235c;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f46233a, false, 42914, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f46233a, false, 42914, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (!(this.ivPrivate == null || this.tvPrivate == null || aweme == null || aweme.getStatus() == null)) {
            this.l = aweme.getStatus().getPrivateStatus();
        }
    }

    public void addShareViewInTop(View view) {
        this.h = view;
    }

    public void addBottomShareItem(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f46233a, false, 42940, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f46233a, false, 42940, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.mSecondLayout.addView(view2);
    }

    @SuppressLint({"CI_NewApi"})
    public void onCreate(Bundle bundle) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f46233a, false, 42910, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f46233a, false, 42910, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.k2);
        ButterKnife.bind((Dialog) this);
        Activity ownerActivity = getOwnerActivity();
        if (PatchProxy.isSupport(new Object[]{ownerActivity}, null, f46233a, true, 42934, new Class[]{Activity.class}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{ownerActivity}, null, f46233a, true, 42934, new Class[]{Activity.class}, Integer.TYPE)).intValue();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ownerActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
        }
        Context context = getContext();
        if (PatchProxy.isSupport(new Object[]{context}, null, f46233a, true, 42935, new Class[]{Context.class}, Integer.TYPE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f46233a, true, 42935, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i3 = resources.getDimensionPixelSize(identifier);
            } else {
                i3 = 0;
            }
        }
        int i6 = i2 - i3;
        if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42938, new Class[0], Void.TYPE);
        } else if (this.ivLiveWallpaper != null) {
            View view = this.ivLiveWallpaper;
            if (e.a(this.f46235c)) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
        }
        Window window = getWindow();
        if (window != null) {
            if (i6 == 0) {
                i6 = -1;
            }
            window.setLayout(-1, i6);
            CoordinatorLayout coordinatorLayout = this.mRootView;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout}, this, f46233a, false, 42933, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout}, this, f46233a, false, 42933, new Class[]{View.class}, Void.TYPE);
            } else {
                final BottomSheetBehavior from = BottomSheetBehavior.from((View) coordinatorLayout.getParent());
                if (from != null) {
                    from.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f46255a;

                        public final void onSlide(@NonNull View view, float f2) {
                        }

                        public final void onStateChanged(@NonNull View view, int i) {
                            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f46255a, false, 42961, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f46255a, false, 42961, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            if (i == 5) {
                                PrivateDialog.this.dismiss();
                                from.setState(4);
                            }
                        }
                    });
                }
            }
            window.setGravity(80);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        if (x.a(this.f46235c)) {
            this.shareTopItemView.setVisibility(0);
            this.shareTopItemView.setData(this.f46235c);
            this.shareTopItemView.setItemOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46239a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f46239a, false, 42949, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f46239a, false, 42949, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    PrivateDialog.this.dismiss();
                }
            });
        }
        if (com.ss.android.ugc.aweme.commercialize.utils.c.f(this.f46235c) && !TimeLockRuler.isContentFilterOn()) {
            this.douPlusShareItem.setVisibility(0);
            if (AbTestManager.a().aR() == 2) {
                i4 = C0906R.string.a6k;
            } else {
                i4 = C0906R.string.a6h;
            }
            this.ivDou.setImageResource(2130839606);
            String a2 = DouplusTitleHelper.a(1);
            if (a2 != null) {
                this.tvDou.setText(a2);
            } else {
                this.tvDou.setText(i4);
            }
            this.douPlusShareItem.setOnClickListener(new av(this));
        }
        this.react.setOnClickListener(new aw(this));
        this.duet.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46245a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46245a, false, 42952, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46245a, false, 42952, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                new n().a(PrivateDialog.this.f46235c, PrivateDialog.this.f46238f, PrivateDialog.this.f46237e);
                PrivateDialog.this.dismiss();
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46247a;

            public final void onShow(DialogInterface dialogInterface) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f46247a, false, 42953, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f46247a, false, 42953, new Class[]{DialogInterface.class}, Void.TYPE);
                    return;
                }
                if (PrivateDialog.this.g != null) {
                    PrivateDialog.this.g.a();
                }
                if (PrivateDialog.this.f46235c == null || !PrivateDialog.this.f46235c.canReact() || !PrivateDialog.this.c()) {
                    PrivateDialog.this.react.setVisibility(8);
                } else {
                    PrivateDialog.this.react.setVisibility(0);
                }
                if (!((Boolean) com.ss.android.ugc.aweme.app.x.a().M().c()).booleanValue() || PrivateDialog.this.f46235c == null || !PrivateDialog.this.f46235c.canDuet() || !PrivateDialog.this.c()) {
                    PrivateDialog.this.duet.setVisibility(8);
                } else {
                    PrivateDialog.this.duet.setVisibility(0);
                }
                if (PrivateDialog.this.f46235c == null || !PrivateDialog.this.f46235c.hasStickerID() || !PrivateDialog.this.c()) {
                    PrivateDialog.this.reuseSticker.setVisibility(8);
                } else {
                    PrivateDialog.this.reuseSticker.setVisibility(0);
                }
                if (PrivateDialog.this.reuseSticker.getVisibility() == 8) {
                    if (PrivateDialog.this.f46235c == null || PrivateDialog.this.f46235c.getUploadMiscInfoStruct() == null || TextUtils.isEmpty(PrivateDialog.this.f46235c.getUploadMiscInfoStruct().mvThemeId)) {
                        PrivateDialog.this.reuseMvView.setVisibility(8);
                    } else {
                        PrivateDialog.this.reuseMvView.setVisibility(0);
                    }
                }
            }
        });
        setOnKeyListener(new DialogInterface.OnKeyListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46249a;

            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f46249a, false, 42954, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f46249a, false, 42954, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (i != 4 || PrivateDialog.this.g == null) {
                    return false;
                } else {
                    return PrivateDialog.this.g.b();
                }
            }
        });
        this.reuseSticker.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46251a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46251a, false, 42955, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46251a, false, 42955, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                bv bvVar = new bv(PrivateDialog.this.f46238f);
                ArrayList arrayList = new ArrayList();
                for (String str : PrivateDialog.this.f46235c.getStickerIDs().split(",")) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
                FaceStickerBean.sCurPropSource = "prop_reuse";
                bvVar.h = PrivateDialog.this.f46235c.getMusic();
                bvVar.a(arrayList, true, true);
            }
        });
        this.reuseMvView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46253a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f46253a, false, 42956, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46253a, false, 42956, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (PrivateDialog.this.f46235c.getUploadMiscInfoStruct() != null && !TextUtils.isEmpty(PrivateDialog.this.f46235c.getUploadMiscInfoStruct().mvThemeId)) {
                    new bu(PrivateDialog.this.f46238f).a(PrivateDialog.this.f46235c.getUploadMiscInfoStruct().mvThemeId);
                }
            }
        });
        if (TextUtils.equals(com.ss.android.ugc.aweme.u.aa.a(this.f46235c), d.a().getCurUserId()) && this.f46235c.isUserPost()) {
            this.seeAdsPlanItem.setVisibility(0);
        }
        if (this.h != null) {
            FrameLayout frameLayout = this.mTopExternalLayout;
            frameLayout.getClass();
            frameLayout.addView(this.h);
        }
        if (u.f75965b.b(this.f46235c)) {
            this.mCollectItemView.setData(this.f46235c);
            this.mCollectItemView.setDialog(this);
            this.mCollectItemView.setEnterFrom(this.f46237e);
            this.mBtnFavouriteWrapper.setVisibility(0);
            return;
        }
        this.mBtnFavouriteWrapper.setVisibility(8);
    }

    @OnClick({2131494036, 2131496709, 2131496460, 2131495501, 2131496461})
    public void onCick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f46233a, false, 42917, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46233a, false, 42917, new Class[]{View.class}, Void.TYPE);
        } else if (this.f46235c != null) {
            if (this.f46235c.getShareInfo() == null) {
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bgg).a();
                return;
            }
            AwemeStatus status = this.f46235c.getStatus();
            if (status == null || !status.isDelete()) {
                int id = view.getId();
                if (id == C0906R.id.a6z) {
                    if (d()) {
                        Aweme aweme = this.f46235c;
                        if (PatchProxy.isSupport(new Object[]{aweme}, this, f46233a, false, 42924, new Class[]{Aweme.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f46233a, false, 42924, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                        } else if (aweme == null || aweme.getAwemeType() != 2) {
                            z = false;
                        }
                        if (z) {
                            if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42923, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42923, new Class[0], Void.TYPE);
                            } else {
                                if (this.m == null) {
                                    this.m = new com.ss.android.ugc.aweme.feed.share.a.b(this.f46238f);
                                }
                                this.m.a(this.f46235c, "");
                            }
                        } else {
                            if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42922, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42922, new Class[0], Void.TYPE);
                            } else {
                                if (this.i == null) {
                                    this.i = new com.ss.android.ugc.aweme.feed.share.a.a(this.f46238f, this.k, this.mShareStruct);
                                }
                                if (this.f46235c != null) {
                                    Aweme aweme2 = this.f46235c;
                                    com.ss.android.ugc.aweme.app.d.d a2 = new com.ss.android.ugc.aweme.app.d.d().a("group_id", this.f46235c.getAid()).a("impr_type", com.ss.android.ugc.aweme.u.aa.s(this.f46235c)).a("enter_from", this.f46237e);
                                    if (c()) {
                                        str5 = "self";
                                    } else {
                                        str5 = "other";
                                    }
                                    com.ss.android.ugc.aweme.poi.e.h.a(aweme2, "download", a2.a("download_type", str5).a("download_method", "click_download_icon"));
                                }
                                this.i.a(this.f46235c, "download");
                            }
                        }
                        dismiss();
                        return;
                    }
                } else if (id == C0906R.id.cdm) {
                    if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42932, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42932, new Class[0], Void.TYPE);
                    } else if (this.f46238f != null && !this.f46238f.isFinishing()) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(this.f46238f);
                        if (com.ss.android.ugc.aweme.commercialize.star.a.f39483f.a(this.f46235c)) {
                            builder.setMessage((int) C0906R.string.a4m);
                        } else if (cr.a(this.f46235c)) {
                            builder.setMessage((CharSequence) this.f46238f.getResources().getString(C0906R.string.a4s, new Object[]{this.f46235c.getDescendantsModel().getNotifyMsg()}));
                        } else {
                            builder.setMessage((int) C0906R.string.a4l);
                        }
                        builder.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).setPositiveButton((int) C0906R.string.a4k, (DialogInterface.OnClickListener) new ax(this)).show();
                    }
                    com.ss.android.ugc.aweme.app.d.c a3 = new com.ss.android.ugc.aweme.app.d.c().a("author_id", com.ss.android.ugc.aweme.u.aa.a(this.f46235c));
                    if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42920, new Class[0], String.class)) {
                        str3 = (String) PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42920, new Class[0], String.class);
                    } else {
                        AbTestModel d2 = AbTestManager.a().d();
                        if (d2 != null) {
                            if (d2.shareButtonStyle == 1) {
                                str3 = "plain";
                            } else if (d2.shareButtonStyle == 2) {
                                str3 = "text";
                            } else if (d2.shareButtonStyle == 3) {
                                str3 = "num";
                            }
                        }
                        str3 = "";
                    }
                    com.ss.android.ugc.aweme.app.d.c a4 = a3.a("style", str3);
                    if (PatchProxy.isSupport(new Object[]{"delete"}, this, f46233a, false, 42919, new Class[]{String.class}, String.class)) {
                        str4 = (String) PatchProxy.accessDispatch(new Object[]{"delete"}, this, f46233a, false, 42919, new Class[]{String.class}, String.class);
                    } else {
                        boolean a5 = cg.a("delete", 3);
                        boolean z2 = com.douyin.share.h.a().f23231a;
                        boolean a6 = cg.a("delete", 5);
                        if (a5) {
                            str4 = "download_then_share";
                        } else if (a6) {
                            str4 = "token";
                        } else if (!TextUtils.equals("delete", "weixin_moments")) {
                            str4 = "normal_share";
                        } else if (z2) {
                            str4 = "system_share";
                        } else {
                            str4 = "normal_share";
                        }
                    }
                    com.ss.android.ugc.aweme.app.d.c a7 = a4.a("share_mode", str4).a("content_type", com.ss.android.ugc.aweme.u.aa.o(this.f46235c)).a("is_photo", com.ss.android.ugc.aweme.u.aa.n(this.f46235c)).a("request_id", com.ss.android.ugc.aweme.u.aa.a(this.f46235c, this.k)).a("is_long_item", Integer.valueOf(com.ss.android.ugc.aweme.longvideo.b.a.b(this.f46238f) ? 1 : 0)).a("enter_from", this.f46237e);
                    if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.u.aa.e(this.f46235c))) {
                        a7.a("poi_id", com.ss.android.ugc.aweme.u.aa.e(this.f46235c));
                    }
                    if (com.ss.android.ugc.aweme.u.aa.c(this.f46237e)) {
                        a7.a("poi_type", com.ss.android.ugc.aweme.u.aa.h(this.f46235c)).a("city_info", com.ss.android.ugc.aweme.u.aa.a()).a("distance_info", com.ss.android.ugc.aweme.u.aa.i(this.f46235c));
                    }
                    r.onEvent(MobClick.obtain().setEventName("share_video").setLabelName("delete").setValue(com.ss.android.ugc.aweme.u.aa.m(this.f46235c)).setJsonObject(a7.b()));
                    return;
                } else {
                    if (id == C0906R.id.c6j) {
                        if (!com.ss.android.ugc.aweme.c.a.a.a(this.ivPrivate)) {
                            this.mActionHandler.onAction(this.mShareStruct, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE);
                        } else {
                            return;
                        }
                    } else if (id == C0906R.id.bfd) {
                        if (d()) {
                            if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42921, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42921, new Class[0], Void.TYPE);
                            } else if (this.f46235c != null) {
                                e.a(this.f46235c, this.f46237e);
                                if (this.j == null) {
                                    this.j = new com.ss.android.ugc.aweme.livewallpaper.a.b(this.f46238f);
                                }
                                this.j.c(this.f46235c);
                            }
                            dismiss();
                            return;
                        }
                    } else if (id == C0906R.id.c6k) {
                        if (PatchProxy.isSupport(new Object[0], this, f46233a, false, 42918, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f46233a, false, 42918, new Class[0], Void.TYPE);
                        } else {
                            z.a a8 = z.a("promote_layer_show").a("enter_from", this.f46237e).a(PushConstants.CONTENT, "promote_plan");
                            if (this.f46235c == null) {
                                str = "";
                            } else {
                                str = this.f46235c.getAid();
                            }
                            a8.a("group_id", str).e();
                            if (this.f46235c != null) {
                                str2 = this.f46235c.getAdSchedule();
                            } else {
                                str2 = "";
                            }
                            if (str2 == null) {
                                str2 = "";
                            }
                            new a.C0185a(getContext()).a((int) C0906R.string.ba3).b(str2).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) null).a().b();
                        }
                    }
                    dismiss();
                }
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.dr2).a();
        }
    }

    public void addBottomShareItem(View view, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2)}, this, f46233a, false, 42941, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2)}, this, f46233a, false, 42941, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mSecondLayout.addView(view2, i2);
    }

    public final void a(AwemeAdStatus awemeAdStatus, String str) {
        if (PatchProxy.isSupport(new Object[]{awemeAdStatus, str}, this, f46233a, false, 42943, new Class[]{AwemeAdStatus.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeAdStatus, str}, this, f46233a, false, 42943, new Class[]{AwemeAdStatus.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{awemeAdStatus, str}, this, f46233a, false, 42944, new Class[]{AwemeAdStatus.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeAdStatus, str}, this, f46233a, false, 42944, new Class[]{AwemeAdStatus.class, String.class}, Void.TYPE);
            return;
        }
        if (!(awemeAdStatus == null || this.f46238f == null)) {
            String str2 = "https://aweme.snssdk.com" + awemeAdStatus.url + "&from=" + this.f46237e + "&hide_status_bar=0&status_bar_color=ffffff";
            Intent intent = new Intent(this.f46238f, CrossPlatformActivity.class);
            intent.setData(Uri.parse(str2));
            intent.putExtra("hide_nav_bar", true);
            intent.putExtra("bundle_webview_background", this.f46238f.getResources().getColor(C0906R.color.ao4));
            if (TextUtils.equals("MX4 Pro", Build.MODEL) && TextUtils.equals("meizu", Build.BRAND.toLowerCase())) {
                intent.putExtra("is_adjust_pan", true);
                intent.putExtra("bundle_fix_webview", false);
            }
            intent.putExtra("dou_plus_fail_monitor_url", str2);
            this.f46238f.startActivity(intent);
        }
    }

    public PrivateDialog(Activity activity, aa<ar> aaVar, String str, int i2) {
        super(activity, C0906R.style.tf);
        this.f46238f = activity;
        setOwnerActivity(activity);
        this.f46234b = aaVar;
        this.f46237e = str;
        this.f46236d.a(new o());
        this.k = i2;
    }

    public final void a(Exception exc, AwemeAdStatus awemeAdStatus, String str, Aweme aweme) {
        String str2;
        Exception exc2 = exc;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{exc2, awemeAdStatus, str3, aweme}, this, f46233a, false, 42945, new Class[]{Exception.class, AwemeAdStatus.class, String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, awemeAdStatus, str3, aweme}, this, f46233a, false, 42945, new Class[]{Exception.class, AwemeAdStatus.class, String.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc2;
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f46238f, aVar.getErrorMsg()).a();
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.f46237e).a("group_id", str3);
            if (aweme == null) {
                str2 = "";
            } else {
                str2 = aweme.getAuthorUid();
            }
            r.a("dou_promote_layer_show", (Map) a2.a("author_id", str2).f34114b);
            if (aVar.getErrorCode() == 2352) {
                r.a("promote_layer_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.f46237e).a(PushConstants.CONTENT, "gd_promoted").a("group_id", str3).f34114b);
            }
        }
    }
}
