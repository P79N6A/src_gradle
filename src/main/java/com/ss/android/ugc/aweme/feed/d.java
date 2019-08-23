package com.ss.android.ugc.aweme.feed;

import a.i;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.comment.ui.VideoCommentDialogFragment2;
import com.ss.android.ugc.aweme.commercialize.utils.DouplusTitleHelper;
import com.ss.android.ugc.aweme.commercialize.utils.t;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchMixFeedFragment;
import com.ss.android.ugc.aweme.favorites.ui.UnFavouritesDialog;
import com.ss.android.ugc.aweme.feed.c.a;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.h.n;
import com.ss.android.ugc.aweme.feed.h.o;
import com.ss.android.ugc.aweme.feed.h.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeAdStatus;
import com.ss.android.ugc.aweme.feed.model.FeedSelfseeNoticeModel;
import com.ss.android.ugc.aweme.feed.ui.DeleteDialog;
import com.ss.android.ugc.aweme.feed.ui.PrivateDialog;
import com.ss.android.ugc.aweme.feed.ui.g;
import com.ss.android.ugc.aweme.feed.ui.p;
import com.ss.android.ugc.aweme.forward.view.FeedDetailActivity;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.freeflowcard.b.a;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment;
import com.ss.android.ugc.aweme.newfollow.userstate.UserStateFragment;
import com.ss.android.ugc.aweme.poi.ui.AbsPoiAwemeFeedFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AbsProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.UserProfileFragment;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.d.c;
import com.ss.android.ugc.aweme.setting.d.e;
import com.ss.android.ugc.aweme.setting.d.f;
import com.ss.android.ugc.aweme.setting.d.h;
import com.ss.android.ugc.aweme.setting.model.RestrictAwemeModel;
import com.ss.android.ugc.aweme.setting.model.RestrictUserModel;
import com.ss.android.ugc.aweme.share.BaseShareDialog;
import com.ss.android.ugc.aweme.share.MyHorizontalScrollView;
import com.ss.android.ugc.aweme.share.ShareDialog;
import com.ss.android.ugc.aweme.share.ag;
import com.ss.android.ugc.aweme.share.bf;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.ck;
import com.ss.android.ugc.aweme.share.seconditem.a;
import com.ss.android.ugc.aweme.share.seconditem.j;
import com.ss.android.ugc.aweme.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public class d extends a implements s, c, e, ag.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45158a;
    private String A;
    private String B;
    private String C;
    private List<View> D;
    private com.ss.android.ugc.aweme.setting.s E;
    private ag F;

    /* renamed from: b  reason: collision with root package name */
    public aa<ar> f45159b;

    /* renamed from: c  reason: collision with root package name */
    public p f45160c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.feed.h.p f45161d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f45162e;

    /* renamed from: f  reason: collision with root package name */
    h f45163f;
    f g;
    public b.a h;
    com.ss.android.ugc.aweme.share.seconditem.b i;
    public IShareService.ShareStruct j;
    public IShareService.SharePage k;
    ShareDialog l;
    public boolean m;
    boolean n;
    private PrivateDialog w;
    private UnFavouritesDialog x;
    private com.ss.android.ugc.aweme.feed.listener.c y;
    private com.ss.android.ugc.aweme.feed.h.b z;

    public final Activity c() {
        return this.p;
    }

    public final Context d() {
        return this.p;
    }

    public final Fragment e() {
        return this.q;
    }

    public final String f() {
        return this.t;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f45158a, false, 39954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45158a, false, 39954, new Class[0], Void.TYPE);
            return;
        }
        this.f45161d = new com.ss.android.ugc.aweme.feed.h.p(d());
        this.f45161d.a(new o());
        this.g = new f(new RestrictAwemeModel(), this);
        this.f45163f = new h(new RestrictUserModel(), this);
    }

    public static boolean a(Aweme aweme) {
        if (!PatchProxy.isSupport(new Object[]{aweme}, null, f45158a, true, 39957, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return aweme != null && aweme.getAwemeType() == 2;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45158a, true, 39957, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    @TargetApi(8)
    @RequiresApi(api = 8)
    public final void a(Activity activity, Aweme aweme) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        final Aweme aweme2 = aweme;
        boolean z6 = false;
        if (PatchProxy.isSupport(new Object[]{activity, aweme2}, this, f45158a, false, 39958, new Class[]{Activity.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, aweme2}, this, f45158a, false, 39958, new Class[]{Activity.class, Aweme.class}, Void.TYPE);
        } else if (c() != null && !c().isFinishing() && aweme2 != null) {
            ag.i().h();
            if (!com.ss.android.ugc.aweme.u.aa.p(aweme) || (!aweme.isProhibited() && (aweme.getVideoControl() == null || aweme.getVideoControl().timerStatus != 0))) {
                if (PatchProxy.isSupport(new Object[]{aweme2}, null, com.ss.android.ugc.aweme.favorites.d.b.f44282a, true, 39683, new Class[]{Aweme.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, null, com.ss.android.ugc.aweme.favorites.d.b.f44282a, true, 39683, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                } else {
                    z2 = aweme2 != null && !aweme.isCanPlay() && aweme.isCollected();
                }
                if (z2) {
                    if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45158a, false, 40017, new Class[]{Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45158a, false, 40017, new Class[]{Aweme.class}, Void.TYPE);
                    } else if (c() != null && !c().isFinishing()) {
                        if (this.x == null) {
                            this.x = new UnFavouritesDialog(c(), aweme2, this.r);
                        }
                        try {
                            if (!this.x.isShowing()) {
                                this.x.show();
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45158a, false, 39964, new Class[]{Aweme.class}, Boolean.TYPE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45158a, false, 39964, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        if (aweme2 != null) {
                            boolean booleanValue = ((Boolean) SharePrefCache.inst().getIsPrivateAvailable().c()).booleanValue();
                            boolean z7 = aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 0;
                            if (booleanValue && !z7 && aweme.getAuthor() != null && StringUtils.equal(com.ss.android.ugc.aweme.account.d.a().getCurUserId(), b(aweme))) {
                                z3 = true;
                            }
                        }
                        z3 = false;
                    }
                    if (z3) {
                        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45158a, false, 39956, new Class[]{Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45158a, false, 39956, new Class[]{Aweme.class}, Void.TYPE);
                        } else {
                            if (c() != null) {
                                p pVar = new p(c(), this.f45159b, this.r, this.s, com.ss.android.ugc.aweme.forward.e.a.a());
                                this.f45160c = pVar;
                                this.f45160c.f46811c = aweme2;
                                this.w = new PrivateDialog(c(), this.f45159b, this.r, this.s);
                                this.w.setActionHandler(this.f45160c);
                                if (u.f75965b.d(aweme2)) {
                                    j(aweme2);
                                    if (this.j != null) {
                                        HashMap<String, String> hashMap = this.j.extraParams;
                                        if (hashMap == null) {
                                            hashMap = new HashMap<>();
                                        }
                                        hashMap.put("IS_FRIEND_PRIVATE", "true");
                                    }
                                    this.w.updateShareStruct(this.j);
                                    this.w.g = b.a(aweme.getAid(), this.w, c(), this.j, true, true, this.w);
                                }
                                if (a(aweme)) {
                                    PrivateDialog privateDialog = this.w;
                                    if (PatchProxy.isSupport(new Object[]{aweme2}, privateDialog, PrivateDialog.f46233a, false, 42936, new Class[]{Aweme.class}, Boolean.TYPE)) {
                                        z6 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, privateDialog, PrivateDialog.f46233a, false, 42936, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                                    } else if (!(aweme2 == null || aweme.getAuthor() == null || aweme.getImageInfos() == null)) {
                                        z6 = true;
                                    }
                                    if (z6) {
                                        this.w.f46235c = aweme2;
                                        this.w.show();
                                    }
                                } else {
                                    PrivateDialog privateDialog2 = this.w;
                                    if (PatchProxy.isSupport(new Object[]{aweme2}, privateDialog2, PrivateDialog.f46233a, false, 42911, new Class[]{Aweme.class}, Boolean.TYPE)) {
                                        z6 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, privateDialog2, PrivateDialog.f46233a, false, 42911, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                                    } else if (!(aweme2 == null || aweme.getAuthor() == null || aweme.getVideo() == null)) {
                                        z6 = true;
                                    }
                                    if (z6) {
                                        this.w.f46235c = aweme2;
                                        this.w.show();
                                    }
                                }
                            }
                            return;
                        }
                    } else {
                        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45158a, false, 39959, new Class[]{Aweme.class}, Boolean.TYPE)) {
                            z4 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45158a, false, 39959, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            if (aweme.isProhibited() || aweme.isDelete()) {
                                com.bytedance.ies.dmt.ui.d.a.b(d(), (int) C0906R.string.drx).a();
                            } else {
                                boolean z8 = aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 1;
                                boolean z9 = aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 2;
                                if (z8) {
                                    com.bytedance.ies.dmt.ui.d.a.b(d(), (int) C0906R.string.drx).a();
                                } else if (!z9 || aweme.getAuthor().getFollowStatus() == 2) {
                                    z4 = true;
                                } else {
                                    com.bytedance.ies.dmt.ui.d.a.b(d(), (int) C0906R.string.drx).a();
                                }
                            }
                            z4 = false;
                        }
                        if (z4) {
                            ck ckVar = new ck();
                            ckVar.f64973b = aweme2;
                            ckVar.n = this.r;
                            if (PatchProxy.isSupport(new Object[0], this, f45158a, false, 39961, new Class[0], Boolean.TYPE)) {
                                z5 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45158a, false, 39961, new Class[0], Boolean.TYPE)).booleanValue();
                            } else {
                                z5 = TextUtils.equals(this.r, "homepage_follow") || TextUtils.equals(this.r, "general_search") || (TextUtils.equals(this.r, "personal_homepage") && TextUtils.isEmpty(this.t)) || (TextUtils.equals(this.r, "others_homepage") && TextUtils.isEmpty(this.t));
                            }
                            if (z5) {
                                this.l = new ShareDialog(c(), ckVar, (byte) 0);
                            } else {
                                this.l = new ShareDialog(c(), ckVar);
                            }
                            this.l.u = this.r;
                            j(aweme2);
                            this.l.updateShareStruct(this.j);
                            if (aweme2 != null && aweme.getAwemeType() != 13 && !g.e(aweme) && !m(aweme2) && !TimeLockRuler.isTeenModeON() && aweme.getAwemeControl().canShare() && (!u.f75965b.d(aweme2) || u.f75965b.b(aweme2))) {
                                if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45158a, false, 39997, new Class[]{Aweme.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45158a, false, 39997, new Class[]{Aweme.class}, Void.TYPE);
                                } else {
                                    this.h = b.a(aweme.getAid(), this.l, c(), this.j, true, true, this.l);
                                    if (this.l != null) {
                                        this.l.r = this.h;
                                    }
                                }
                            }
                            this.k = this.l;
                            p pVar2 = new p(c(), this.f45159b, this.r, this.s, com.ss.android.ugc.aweme.forward.e.a.a(), this.j);
                            this.f45160c = pVar2;
                            this.f45160c.f46813e = this.l;
                            if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45158a, false, 39960, new Class[]{Aweme.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45158a, false, 39960, new Class[]{Aweme.class}, Void.TYPE);
                            } else {
                                i.a((Callable<TResult>) new Callable<Void>() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f45177a;

                                    public final /* synthetic */ Object call() throws Exception {
                                        UrlModel urlModel;
                                        if (PatchProxy.isSupport(new Object[0], this, f45177a, false, 40055, new Class[0], Void.class)) {
                                            return (Void) PatchProxy.accessDispatch(new Object[0], this, f45177a, false, 40055, new Class[0], Void.class);
                                        } else if (aweme2 == null || aweme2.getVideo() == null) {
                                            return null;
                                        } else {
                                            if (aweme2.getVideo().getOriginCover() != null) {
                                                urlModel = aweme2.getVideo().getOriginCover();
                                            } else {
                                                urlModel = aweme2.getVideo().getCover();
                                            }
                                            if (urlModel != null) {
                                                List<String> urlList = urlModel.getUrlList();
                                                if (urlList != null && !urlList.isEmpty()) {
                                                    com.ss.android.ugc.aweme.base.c.b(urlList.get(0));
                                                }
                                            }
                                            return null;
                                        }
                                    }
                                });
                            }
                            this.l.setActionHandler(this.f45160c);
                            this.l.setShareCallback(this.f45160c);
                            this.f45160c.f46811c = aweme2;
                            this.l.setOnShowListener(new DialogInterface.OnShowListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f45164a;

                                public final void onShow(DialogInterface dialogInterface) {
                                    int i;
                                    DialogInterface dialogInterface2 = dialogInterface;
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface2}, this, f45164a, false, 40040, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface2}, this, f45164a, false, 40040, new Class[]{DialogInterface.class}, Void.TYPE);
                                    } else if (d.this.d() != null) {
                                        if ((aweme2.getAuthor() != null && aweme2.getAuthor().isSecret()) || u.f75965b.d(aweme2)) {
                                            ShareDialog shareDialog = d.this.l;
                                            if (PatchProxy.isSupport(new Object[0], shareDialog, BaseShareDialog.f64482d, false, 72959, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], shareDialog, BaseShareDialog.f64482d, false, 72959, new Class[0], Void.TYPE);
                                            } else {
                                                shareDialog.h.setVisibility(8);
                                                shareDialog.f64487f.setVisibility(8);
                                                shareDialog.l.setVisibility(8);
                                            }
                                        }
                                        if (!aweme2.getAwemeControl().canShare() || TimeLockRuler.isTeenModeON()) {
                                            TextView textView = d.this.l.h;
                                            if (TimeLockRuler.isTeenModeON()) {
                                                i = C0906R.string.cij;
                                            } else {
                                                i = C0906R.string.a22;
                                            }
                                            textView.setText(i);
                                            d.this.l.h.setTextColor(d.this.d().getResources().getColor(C0906R.color.p9));
                                            d.this.l.h.setAlpha(0.34f);
                                        }
                                        d.this.a((IShareService.SharePage) d.this.l, aweme2, d.this.f45160c, d.this.j);
                                        d.this.a(dialogInterface2, aweme2);
                                        FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface2).findViewById(C0906R.id.a3z);
                                        if (frameLayout != null) {
                                            BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                                            from.setPeekHeight(frameLayout.getHeight());
                                            from.setSkipCollapsed(true);
                                        }
                                        d dVar = d.this;
                                        if (PatchProxy.isSupport(new Object[0], dVar, d.f45158a, false, 40018, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], dVar, d.f45158a, false, 40018, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        if (dVar.i != null && dVar.i.getVisibility() == 0) {
                                            com.ss.android.ugc.aweme.share.seconditem.b bVar = dVar.i;
                                            if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.share.seconditem.b.g, false, 73697, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.share.seconditem.b.g, false, 73697, new Class[0], Void.TYPE);
                                            } else if (!bVar.h && !((Boolean) SharePrefCache.inst().getIsFirstShowFavouriteAnimation().c()).booleanValue()) {
                                                bVar.setMIsShowAnimation(true);
                                                SharePrefCache.inst().getIsFirstShowFavouriteAnimation().a(Boolean.TRUE);
                                                if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.share.seconditem.a.f65271a, false, 73684, new Class[0], Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.share.seconditem.a.f65271a, false, 73684, new Class[0], Void.TYPE);
                                                    return;
                                                }
                                                bVar.f65272f = true;
                                                bVar.getShareImageView().animate().scaleX(1.03f).scaleY(1.03f).setDuration(130).withEndAction(new a.C0705a(bVar)).start();
                                            }
                                        }
                                    }
                                }
                            });
                            this.l.setOnDismissListener(new DialogInterface.OnDismissListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f45173a;

                                public final void onDismiss(DialogInterface dialogInterface) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f45173a, false, 40053, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f45173a, false, 40053, new Class[]{DialogInterface.class}, Void.TYPE);
                                        return;
                                    }
                                    d.this.f45159b.a(new ar(28));
                                    d dVar = d.this;
                                    if (PatchProxy.isSupport(new Object[0], dVar, d.f45158a, false, 40019, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], dVar, d.f45158a, false, 40019, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (dVar.i != null && dVar.i.getVisibility() == 0) {
                                        dVar.i.a();
                                    }
                                }
                            });
                            this.l.setOnKeyListener(new DialogInterface.OnKeyListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f45175a;

                                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f45175a, false, 40054, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f45175a, false, 40054, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                                    } else if (i != 4 || d.this.h == null) {
                                        return false;
                                    } else {
                                        return d.this.h.b();
                                    }
                                }
                            });
                            if (k(aweme2)) {
                                if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45158a, false, 39998, new Class[]{Aweme.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45158a, false, 39998, new Class[]{Aweme.class}, Void.TYPE);
                                } else if (this.l != null) {
                                    ShareDialog shareDialog = this.l;
                                    com.ss.android.ugc.aweme.newfollow.ui.c a2 = com.ss.android.ugc.aweme.newfollow.ui.c.a(e(), aweme2, this.l, this.r);
                                    if (PatchProxy.isSupport(new Object[]{a2, 0}, shareDialog, ShareDialog.f64541a, false, 73301, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{a2, 0}, shareDialog, ShareDialog.f64541a, false, 73301, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                                    } else if (shareDialog.f64543c != null) {
                                        shareDialog.f64543c.addView(a2, 0);
                                    }
                                }
                            }
                            com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29089c, com.ss.android.experiencekit.c.d.BEGIN);
                            try {
                                this.l.show();
                                com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29089c, com.ss.android.experiencekit.c.d.END);
                                return;
                            } catch (Exception e2) {
                                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception(e2.getMessage() + c().getClass().getSimpleName()));
                            }
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            DeleteDialog deleteDialog = new DeleteDialog(c(), this.f45159b, this.r, this.s);
            deleteDialog.f46104c = aweme2;
            deleteDialog.show();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x025a, code lost:
        if (r0 != false) goto L_0x025c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0597 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0627 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0699  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x06be A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x08ab  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x08cf  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0928  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x094c  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x09a3  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x09c0  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0a86  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0aa4  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0aec  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0b12  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0b30 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0b94  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0bad  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.framework.services.IShareService.SharePage r26, com.ss.android.ugc.aweme.feed.model.Aweme r27, com.ss.android.ugc.aweme.feed.ui.p r28, com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct r29) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = 4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r8
            r14 = 1
            r0[r14] = r9
            r15 = 2
            r0[r15] = r10
            r6 = 3
            r0[r6] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$SharePage> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.SharePage.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r1 = com.ss.android.ugc.aweme.feed.ui.p.class
            r5[r15] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r6] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r3 = 0
            r4 = 39975(0x9c27, float:5.6017E-41)
            r1 = r25
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0068
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            r0[r14] = r9
            r0[r15] = r10
            r6 = 3
            r0[r6] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39975(0x9c27, float:5.6017E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$SharePage> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.SharePage.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r1 = com.ss.android.ugc.aweme.feed.ui.p.class
            r5[r15] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r6] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0068:
            r6 = 3
            com.ss.android.ugc.aweme.utils.u r0 = com.ss.android.ugc.aweme.utils.u.f75965b
            boolean r0 = r0.d(r9)
            r5 = 1092616192(0x41200000, float:10.0)
            r4 = 17
            r16 = 4621819117588971520(0x4024000000000000, double:10.0)
            r3 = -2
            if (r0 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.utils.u r0 = com.ss.android.ugc.aweme.utils.u.f75965b
            boolean r0 = r0.b(r9)
            if (r0 != 0) goto L_0x008a
            r7.c(r9, r10, r11)
            r25.a((com.ss.android.ugc.aweme.framework.services.IShareService.SharePage) r26, (com.ss.android.ugc.aweme.feed.model.Aweme) r27)
        L_0x0086:
            r12 = 17
            goto L_0x0b7a
        L_0x008a:
            if (r9 == 0) goto L_0x00b1
            int r0 = r27.getAwemeType()
            r1 = 13
            if (r0 != r1) goto L_0x00b1
            r7.c(r9, r10, r11)
            r7.d(r9, r10, r11)
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.aM()
            if (r0 != 0) goto L_0x00a7
            r7.a((com.ss.android.ugc.aweme.feed.model.Aweme) r9, (com.ss.android.ugc.aweme.feed.ui.p) r10, (com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct) r11)
        L_0x00a7:
            boolean r0 = com.ss.android.ugc.aweme.share.cg.c()
            if (r0 == 0) goto L_0x0086
            r7.l(r9)
            goto L_0x0086
        L_0x00b1:
            android.app.Activity r0 = r7.p
            boolean r0 = com.ss.android.ugc.aweme.longvideo.b.a.b(r0)
            if (r0 == 0) goto L_0x018b
            r7.c(r9, r10, r11)
            com.ss.android.ugc.aweme.longvideo.g r0 = com.ss.android.ugc.aweme.longvideo.g.f53947b
            com.ss.android.ugc.aweme.feed.model.LongVideo r0 = r0.a(r9)
            if (r0 == 0) goto L_0x0179
            com.ss.android.ugc.aweme.feed.model.VideoControl r1 = r0.getVideoControl()
            if (r1 == 0) goto L_0x0179
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r0.getVideoControl()
            int r0 = r0.preventDownloadType
            if (r0 != 0) goto L_0x0179
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.longvideo.b.a.f53876a
            r21 = 1
            r22 = 56736(0xdda0, float:7.9504E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r13] = r2
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r18 = r0
            r23 = r1
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r0 == 0) goto L_0x0115
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.longvideo.b.a.f53876a
            r21 = 1
            r22 = 56736(0xdda0, float:7.9504E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r13] = r2
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r18 = r0
            r23 = r1
        L_0x010a:
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0174
        L_0x0115:
            com.ss.android.ugc.aweme.longvideo.b.a$a r0 = com.ss.android.ugc.aweme.longvideo.b.a.f53877b
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.longvideo.b.a.C0621a.f53878a
            r21 = 0
            r22 = 56743(0xdda7, float:7.9514E-41)
            java.lang.Class[] r2 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r6 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r13] = r6
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r18 = r1
            r19 = r0
            r23 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r1 == 0) goto L_0x0150
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.longvideo.b.a.C0621a.f53878a
            r21 = 0
            r22 = 56743(0xdda7, float:7.9514E-41)
            java.lang.Class[] r2 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r6 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r13] = r6
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r18 = r1
            r19 = r0
            r23 = r2
            goto L_0x010a
        L_0x0150:
            if (r9 == 0) goto L_0x0173
            com.ss.android.ugc.aweme.longvideo.g r0 = com.ss.android.ugc.aweme.longvideo.g.f53947b
            com.ss.android.ugc.aweme.feed.model.LongVideo r0 = r0.a(r9)
            if (r0 == 0) goto L_0x015f
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
            goto L_0x0160
        L_0x015f:
            r1 = 0
        L_0x0160:
            if (r1 == 0) goto L_0x0173
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            java.lang.String r1 = "longVideo.video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getDownloadAddr()
            if (r0 == 0) goto L_0x0173
            r0 = 1
            goto L_0x0174
        L_0x0173:
            r0 = 0
        L_0x0174:
            if (r0 == 0) goto L_0x0179
            r7.b(r9, r10, r11)
        L_0x0179:
            r25.a((com.ss.android.ugc.aweme.framework.services.IShareService.SharePage) r26, (com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.aM()
            if (r0 != 0) goto L_0x0086
            r7.l(r9)
            goto L_0x0086
        L_0x018b:
            boolean r0 = r7.m(r9)
            if (r0 == 0) goto L_0x019f
            boolean r0 = r7.e(r9)
            if (r0 != 0) goto L_0x019f
            r7.c(r9, r10, r11)
            r25.a((com.ss.android.ugc.aweme.framework.services.IShareService.SharePage) r26, (com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            goto L_0x0086
        L_0x019f:
            r7.c(r9, r10, r11)
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r18 = 0
            r19 = 39972(0x9c24, float:5.6013E-41)
            java.lang.Class[] r1 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r20 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r13] = r20
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r20 = com.ss.android.ugc.aweme.feed.ui.p.class
            r1[r14] = r20
            java.lang.Class r20 = java.lang.Void.TYPE
            r21 = r1
            r1 = r25
            r12 = -2
            r3 = r18
            r4 = r19
            r5 = r21
            r12 = 3
            r6 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01f2
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39972(0x9c24, float:5.6013E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r1 = com.ss.android.ugc.aweme.feed.ui.p.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x01ec:
            r5 = 1092616192(0x41200000, float:10.0)
            r6 = 17
            goto L_0x02f3
        L_0x01f2:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.x.a(r27)
            if (r0 != 0) goto L_0x025c
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.commercialize.utils.s.f39824a
            r21 = 1
            r22 = 32437(0x7eb5, float:4.5454E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r13] = r2
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r18 = r0
            r23 = r1
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r0 == 0) goto L_0x0239
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.commercialize.utils.s.f39824a
            r21 = 1
            r22 = 32437(0x7eb5, float:4.5454E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r13] = r2
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r18 = r0
            r23 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x025a
        L_0x0239:
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            if (r0 == 0) goto L_0x0259
            boolean r0 = r0.isMe()
            if (r0 == 0) goto L_0x0259
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct r0 = r0.getCommercePermission()
            if (r0 == 0) goto L_0x0259
            int r0 = r0.topItem
            if (r0 != r14) goto L_0x0259
            r0 = 1
            goto L_0x025a
        L_0x0259:
            r0 = 0
        L_0x025a:
            if (r0 == 0) goto L_0x01ec
        L_0x025c:
            android.content.Context r0 = r25.d()
            com.ss.android.ugc.aweme.feed.d$16 r1 = new com.ss.android.ugc.aweme.feed.d$16
            r1.<init>(r9)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r13] = r0
            r2[r14] = r9
            r2[r15] = r1
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.share.seconditem.k.f65291a
            r21 = 1
            r22 = 73734(0x12006, float:1.03323E-40)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r13] = r4
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r3[r14] = r4
            java.lang.Class<android.view.View$OnClickListener> r4 = android.view.View.OnClickListener.class
            r3[r15] = r4
            java.lang.Class<com.ss.android.ugc.aweme.share.seconditem.k> r24 = com.ss.android.ugc.aweme.share.seconditem.k.class
            r18 = r2
            r23 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r2 == 0) goto L_0x02c0
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r13] = r0
            r2[r14] = r9
            r2[r15] = r1
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.share.seconditem.k.f65291a
            r21 = 1
            r22 = 73734(0x12006, float:1.03323E-40)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r14] = r1
            java.lang.Class<android.view.View$OnClickListener> r1 = android.view.View.OnClickListener.class
            r0[r15] = r1
            java.lang.Class<com.ss.android.ugc.aweme.share.seconditem.k> r24 = com.ss.android.ugc.aweme.share.seconditem.k.class
            r18 = r2
            r23 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            com.ss.android.ugc.aweme.share.seconditem.k r0 = (com.ss.android.ugc.aweme.share.seconditem.k) r0
            r5 = 1092616192(0x41200000, float:10.0)
            r6 = 17
            goto L_0x02ee
        L_0x02c0:
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r2.<init>(r3, r3)
            int r3 = com.ss.android.ugc.aweme.base.utils.u.a((double) r16)
            r2.leftMargin = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            if (r3 < r6) goto L_0x02dd
            r5 = 1092616192(0x41200000, float:10.0)
            float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r5)
            int r3 = (int) r3
            r2.setMarginStart(r3)
            goto L_0x02df
        L_0x02dd:
            r5 = 1092616192(0x41200000, float:10.0)
        L_0x02df:
            com.ss.android.ugc.aweme.share.seconditem.k r3 = new com.ss.android.ugc.aweme.share.seconditem.k
            r3.<init>(r0)
            r3.setLayoutParams(r2)
            r3.setData((com.ss.android.ugc.aweme.feed.model.Aweme) r9)
            r3.setItemOnClickListener(r1)
            r0 = r3
        L_0x02ee:
            java.util.List<android.view.View> r1 = r7.D
            r1.add(r0)
        L_0x02f3:
            if (r9 == 0) goto L_0x0326
            int r0 = r27.getDistributeType()
            if (r0 != r15) goto L_0x0326
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r27.getVideoControl()
            if (r0 == 0) goto L_0x0326
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r27.getVideoControl()
            int r0 = r0.preventDownloadType
            if (r0 == 0) goto L_0x0322
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r27.getVideoControl()
            int r0 = r0.preventDownloadType
            if (r0 == r15) goto L_0x0322
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r27.getVideoControl()
            int r0 = r0.preventDownloadType
            if (r0 == r12) goto L_0x0322
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r27.getVideoControl()
            int r0 = r0.preventDownloadType
            r1 = 4
            if (r0 != r1) goto L_0x0329
        L_0x0322:
            r7.b(r9, r10, r11)
            goto L_0x0329
        L_0x0326:
            r7.b(r9, r10, r11)
        L_0x0329:
            r25.a((com.ss.android.ugc.aweme.framework.services.IShareService.SharePage) r26, (com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39991(0x9c37, float:5.604E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r18 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r13] = r18
            java.lang.Class r18 = java.lang.Void.TYPE
            r19 = r1
            r1 = r25
            r5 = r19
            r6 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0365
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39991(0x9c37, float:5.604E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0425
        L_0x0365:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.commercialize.utils.c.f39774a
            r21 = 1
            r22 = 32233(0x7de9, float:4.5168E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r13] = r2
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r18 = r0
            r23 = r1
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r0 == 0) goto L_0x03a6
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.commercialize.utils.c.f39774a
            r21 = 1
            r22 = 32233(0x7de9, float:4.5168E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r13] = r2
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r18 = r0
            r23 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x03d8
        L_0x03a6:
            if (r9 != 0) goto L_0x03aa
        L_0x03a8:
            r0 = 0
            goto L_0x03d8
        L_0x03aa:
            boolean r0 = r27.isAd()
            if (r0 != 0) goto L_0x03b1
            goto L_0x03a8
        L_0x03b1:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getAdIntroUrlItem()
            java.lang.Object r0 = r0.c()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03c6
            goto L_0x03a8
        L_0x03c6:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getShowAdIntroItem()
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L_0x03d8:
            if (r0 == 0) goto L_0x0425
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.u(r27)
            if (r0 != 0) goto L_0x0425
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.u(r27)
            if (r0 != 0) goto L_0x0425
            java.lang.String r0 = "show_adcooperation"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "group_id"
            java.lang.String r3 = r27.getAid()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            java.lang.String r3 = r27.getAuthorUid()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r7.r
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            android.content.Context r0 = r25.d()
            r1 = 2131558507(0x7f0d006b, float:1.8742332E38)
            r2 = 2130839478(0x7f0207b6, float:1.7283968E38)
            com.ss.android.ugc.aweme.feed.w r3 = new com.ss.android.ugc.aweme.feed.w
            r3.<init>(r7, r9)
            com.ss.android.ugc.aweme.share.seconditem.j r0 = com.ss.android.ugc.aweme.share.seconditem.j.a((android.content.Context) r0, (int) r1, (int) r2, (android.view.View.OnClickListener) r3)
            java.util.List<android.view.View> r1 = r7.D
            r1.add(r0)
        L_0x0425:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39996(0x9c3c, float:5.6046E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x045e
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39996(0x9c3c, float:5.6046E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x04b3
        L_0x045e:
            if (r9 == 0) goto L_0x04b2
            boolean r0 = r27.hasStickerID()
            if (r0 == 0) goto L_0x04b2
            java.lang.String r0 = "prop_reuse_icon"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "prop_id"
            java.lang.String r3 = r27.getStickerIDs()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "action_type"
            java.lang.String r3 = "show"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "group_id"
            java.lang.String r3 = r27.getAid()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            android.app.Activity r0 = r7.p
            if (r0 == 0) goto L_0x04b0
            android.content.Context r0 = r25.d()
            r1 = 2131562164(0x7f0d0eb4, float:1.874975E38)
            r2 = 2130839625(0x7f020849, float:1.7284266E38)
            com.ss.android.ugc.aweme.feed.d$7 r3 = new com.ss.android.ugc.aweme.feed.d$7
            r3.<init>(r9)
            com.ss.android.ugc.aweme.share.seconditem.j r0 = com.ss.android.ugc.aweme.share.seconditem.j.a((android.content.Context) r0, (int) r1, (int) r2, (android.view.View.OnClickListener) r3)
            int r1 = com.ss.android.ugc.aweme.setting.h.ci8
            java.lang.String r2 = "reuse_sticker"
            r0.setTag(r1, r2)
            java.util.List<android.view.View> r1 = r7.D
            r1.add(r0)
        L_0x04b0:
            r0 = 1
            goto L_0x04b3
        L_0x04b2:
            r0 = 0
        L_0x04b3:
            if (r0 != 0) goto L_0x0565
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39995(0x9c3b, float:5.6045E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04ee
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39995(0x9c3b, float:5.6045E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            goto L_0x0565
        L_0x04ee:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r0 = r0.avSettingsService()
            boolean r0 = r0.showMvThemeRecordMode()
            if (r0 != 0) goto L_0x0505
            goto L_0x0565
        L_0x0505:
            com.ss.android.ugc.aweme.shortvideo.j r0 = r27.getUploadMiscInfoStruct()
            if (r0 == 0) goto L_0x0565
            com.ss.android.ugc.aweme.shortvideo.j r0 = r27.getUploadMiscInfoStruct()
            java.lang.String r0 = r0.mvThemeId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0518
            goto L_0x0565
        L_0x0518:
            com.ss.android.ugc.aweme.shortvideo.j r0 = r27.getUploadMiscInfoStruct()
            java.lang.String r0 = r0.mvThemeId
            java.lang.String r1 = "mvtheme_reuse_icon"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "mv_id"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r3 = "action_type"
            java.lang.String r4 = "show"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "group_id"
            java.lang.String r4 = r27.getAid()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r2)
            android.app.Activity r1 = r7.p
            if (r1 != 0) goto L_0x0546
            goto L_0x0565
        L_0x0546:
            android.content.Context r1 = r25.d()
            r2 = 2131562165(0x7f0d0eb5, float:1.8749751E38)
            r3 = 2130839624(0x7f020848, float:1.7284264E38)
            com.ss.android.ugc.aweme.feed.d$6 r4 = new com.ss.android.ugc.aweme.feed.d$6
            r4.<init>(r9, r0)
            com.ss.android.ugc.aweme.share.seconditem.j r0 = com.ss.android.ugc.aweme.share.seconditem.j.a((android.content.Context) r1, (int) r2, (int) r3, (android.view.View.OnClickListener) r4)
            int r1 = com.ss.android.ugc.aweme.setting.h.ci8
            java.lang.String r2 = "reuse_mv_template"
            r0.setTag(r1, r2)
            java.util.List<android.view.View> r1 = r7.D
            r1.add(r0)
        L_0x0565:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39993(0x9c39, float:5.6042E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0597
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39993(0x9c39, float:5.6042E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x05f5
        L_0x0597:
            if (r9 == 0) goto L_0x05a7
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r27.getVideoControl()
            if (r0 == 0) goto L_0x05a7
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r27.getVideoControl()
            boolean r0 = r0.isAllowDuet
            if (r0 == 0) goto L_0x05f5
        L_0x05a7:
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            com.ss.android.ugc.aweme.app.an r0 = r0.M()
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x05f5
            boolean r0 = r27.canDuet()
            if (r0 == 0) goto L_0x05f5
            boolean r0 = com.ss.android.g.a.b()
            if (r0 != 0) goto L_0x05f5
            android.content.Context r0 = r25.d()
            if (r0 == 0) goto L_0x05f5
            android.content.Context r0 = r25.d()
            com.ss.android.ugc.aweme.share.seconditem.i r0 = com.ss.android.ugc.aweme.share.seconditem.i.a(r0)
            r1 = 2130838894(0x7f02056e, float:1.7282783E38)
            r0.setBackground(r1)
            r1 = 2131559725(0x7f0d052d, float:1.8744802E38)
            r0.setText((int) r1)
            com.ss.android.ugc.aweme.feed.g r1 = new com.ss.android.ugc.aweme.feed.g
            r1.<init>(r7, r9)
            r0.setOnItemClickListener(r1)
            int r1 = com.ss.android.ugc.aweme.setting.h.ci8
            java.lang.String r2 = "duet"
            r0.setTag(r1, r2)
            java.util.List<android.view.View> r1 = r7.D
            r1.add(r0)
        L_0x05f5:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39994(0x9c3a, float:5.6044E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0627
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39994(0x9c3a, float:5.6044E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0673
        L_0x0627:
            if (r9 == 0) goto L_0x0637
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r27.getVideoControl()
            if (r0 == 0) goto L_0x0637
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r27.getVideoControl()
            boolean r0 = r0.isAllowReact
            if (r0 == 0) goto L_0x0673
        L_0x0637:
            android.content.Context r0 = r25.d()
            if (r0 == 0) goto L_0x0673
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r1 = r27.getStatus()
            if (r1 == 0) goto L_0x0673
            boolean r2 = r27.canReact()
            boolean r1 = r1.isDelete()
            if (r2 == 0) goto L_0x0673
            if (r1 != 0) goto L_0x0673
            com.ss.android.ugc.aweme.share.seconditem.i r0 = com.ss.android.ugc.aweme.share.seconditem.i.a(r0)
            r1 = 2130839308(0x7f02070c, float:1.7283623E38)
            r0.setBackground(r1)
            r1 = 2131561993(0x7f0d0e09, float:1.8749402E38)
            r0.setText((int) r1)
            com.ss.android.ugc.aweme.feed.h r1 = new com.ss.android.ugc.aweme.feed.h
            r1.<init>(r7, r9)
            r0.setOnItemClickListener(r1)
            int r1 = com.ss.android.ugc.aweme.setting.h.ci8
            java.lang.String r2 = "react"
            r0.setTag(r1, r2)
            java.util.List<android.view.View> r1 = r7.D
            r1.add(r0)
        L_0x0673:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r9
            r0[r14] = r10
            r0[r15] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39977(0x9c29, float:5.602E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r1 = com.ss.android.ugc.aweme.feed.ui.p.class
            r5[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x06be
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r9
            r0[r14] = r10
            r0[r15] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39977(0x9c29, float:5.602E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r1 = com.ss.android.ugc.aweme.feed.ui.p.class
            r5[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0885
        L_0x06be:
            if (r9 == 0) goto L_0x06ce
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r27.getVideoControl()
            if (r0 == 0) goto L_0x06ce
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r27.getVideoControl()
            boolean r0 = r0.isAllowDynamicWallpaper
            if (r0 == 0) goto L_0x0885
        L_0x06ce:
            boolean r0 = com.ss.android.ugc.aweme.livewallpaper.c.e.a((com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            if (r0 == 0) goto L_0x079c
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.livewallpaper.c.e.f53685a
            r21 = 1
            r22 = 56288(0xdbe0, float:7.8876E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r13] = r2
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r0
            r23 = r1
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r0 == 0) goto L_0x0711
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.livewallpaper.c.e.f53685a
            r21 = 1
            r22 = 56288(0xdbe0, float:7.8876E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r13] = r2
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r0
            r23 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0885
        L_0x0711:
            java.lang.String r0 = ""
            if (r9 == 0) goto L_0x0751
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "type "
            r0.<init>(r1)
            int r1 = r27.getAwemeType()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.feed.model.Video r1 = r27.getVideo()
            if (r1 == 0) goto L_0x0751
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " width "
            r2.append(r0)
            int r0 = r1.getWidth()
            r2.append(r0)
            java.lang.String r0 = " height "
            r2.append(r0)
            int r0 = r1.getHeight()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x0751:
            java.lang.String r1 = "livewall_not_show"
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.app.d.c r3 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r4 = "abvalue"
            com.ss.android.ugc.aweme.setting.AbTestManager r5 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r5 = r5.ad()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.ss.android.ugc.aweme.app.d.c r3 = r3.a((java.lang.String) r4, (java.lang.Integer) r5)
            java.lang.String r4 = "setting"
            com.ss.android.ugc.aweme.app.SharePrefCache r5 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r5 = r5.getUseLiveWallpaper()
            java.lang.Object r5 = r5.c()
            java.lang.Integer r5 = (java.lang.Integer) r5
            com.ss.android.ugc.aweme.app.d.c r3 = r3.a((java.lang.String) r4, (java.lang.Integer) r5)
            java.lang.String r4 = "isInValidValueAweme"
            boolean r5 = com.ss.android.ugc.aweme.livewallpaper.c.e.b((com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            com.ss.android.ugc.aweme.app.d.c r3 = r3.a((java.lang.String) r4, (java.lang.Boolean) r5)
            java.lang.String r4 = "message"
            com.ss.android.ugc.aweme.app.d.c r0 = r3.a((java.lang.String) r4, (java.lang.String) r0)
            org.json.JSONObject r0 = r0.b()
            com.ss.android.ugc.aweme.app.n.a(r1, r2, r0)
            goto L_0x0885
        L_0x079c:
            android.content.Context r0 = r25.d()
            if (r0 == 0) goto L_0x0885
            if (r9 != 0) goto L_0x07a6
            goto L_0x0885
        L_0x07a6:
            java.lang.String r0 = r7.r
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r13] = r9
            r1[r14] = r0
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.livewallpaper.c.e.f53685a
            r21 = 1
            r22 = 56270(0xdbce, float:7.8851E-41)
            java.lang.Class[] r2 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r13] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r14] = r3
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r1
            r23 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r1 == 0) goto L_0x07f0
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r13] = r9
            r1[r14] = r0
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.livewallpaper.c.e.f53685a
            r21 = 1
            r22 = 56270(0xdbce, float:7.8851E-41)
            java.lang.Class[] r0 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r13] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r14] = r2
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r1
            r23 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0855
        L_0x07f0:
            if (r9 == 0) goto L_0x0855
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x081e
            java.lang.String r1 = "wall_paper_show"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "group_id"
            java.lang.String r4 = r27.getAid()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "request_id"
            java.lang.String r4 = r27.getRequestId()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
            goto L_0x0855
        L_0x081e:
            com.ss.android.ugc.aweme.app.d.c r1 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r2 = "request_id"
            java.lang.String r3 = r27.getRequestId()
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.app.d.c r0 = r1.a((java.lang.String) r2, (java.lang.String) r0)
            com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r2 = "share_video_tab"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
            java.lang.String r2 = "wall_paper_show"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
            java.lang.String r2 = r27.getAid()
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setValue(r2)
            org.json.JSONObject r0 = r0.b()
            com.ss.android.ugc.aweme.common.MobClick r0 = r1.setJsonObject(r0)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
        L_0x0855:
            android.content.Context r0 = r25.d()
            r1 = 2131562408(0x7f0d0fa8, float:1.8750244E38)
            r2 = 2130839613(0x7f02083d, float:1.7284242E38)
            com.ss.android.ugc.aweme.feed.d$18 r3 = new com.ss.android.ugc.aweme.feed.d$18
            r3.<init>(r9, r10, r11)
            com.ss.android.ugc.aweme.share.seconditem.j r0 = com.ss.android.ugc.aweme.share.seconditem.j.a((android.content.Context) r0, (int) r1, (int) r2, (android.view.View.OnClickListener) r3)
            if (r9 == 0) goto L_0x0875
            int r1 = r27.getDownloadStatus()
            if (r1 != r14) goto L_0x0875
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setAlpha(r1)
        L_0x0875:
            int r1 = com.ss.android.ugc.aweme.setting.h.ci8
            java.lang.String r2 = "live_photo"
            r0.setTag(r1, r2)
            java.util.List<android.view.View> r1 = r7.D
            com.ss.android.ugc.aweme.share.seconditem.j r0 = a((com.ss.android.ugc.aweme.share.seconditem.j) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r9)
            r1.add(r0)
        L_0x0885:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r9
            r0[r14] = r10
            r0[r15] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39987(0x9c33, float:5.6034E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r1 = com.ss.android.ugc.aweme.feed.ui.p.class
            r5[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x08cf
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r9
            r0[r14] = r10
            r0[r15] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39987(0x9c33, float:5.6034E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r1 = com.ss.android.ugc.aweme.feed.ui.p.class
            r5[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0902
        L_0x08cf:
            java.lang.String r0 = r7.r
            java.lang.String r1 = "homepage_hot"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0902
            java.lang.String r0 = b((com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            boolean r0 = com.ss.android.ugc.aweme.share.cg.a((java.lang.String) r0)
            if (r0 != 0) goto L_0x0902
            android.content.Context r0 = r25.d()
            r1 = 2131561468(0x7f0d0bfc, float:1.8748337E38)
            r2 = 2130839604(0x7f020834, float:1.7284223E38)
            com.ss.android.ugc.aweme.feed.d$5 r3 = new com.ss.android.ugc.aweme.feed.d$5
            r3.<init>(r10, r11)
            com.ss.android.ugc.aweme.share.seconditem.j r0 = com.ss.android.ugc.aweme.share.seconditem.j.a((android.content.Context) r0, (int) r1, (int) r2, (android.view.View.OnClickListener) r3)
            int r1 = com.ss.android.ugc.aweme.setting.h.ci8
            java.lang.String r2 = "dislike"
            r0.setTag(r1, r2)
            java.util.List<android.view.View> r1 = r7.D
            r1.add(r0)
        L_0x0902:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r9
            r0[r14] = r10
            r0[r15] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39976(0x9c28, float:5.6018E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r1 = com.ss.android.ugc.aweme.feed.ui.p.class
            r5[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x094c
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r9
            r0[r14] = r10
            r0[r15] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39976(0x9c28, float:5.6018E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r1 = com.ss.android.ugc.aweme.feed.ui.p.class
            r5[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0989
        L_0x094c:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getIsPrivateAvailable()
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0989
            java.lang.String r0 = b((com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            boolean r0 = com.ss.android.ugc.aweme.share.cg.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0989
            android.content.Context r0 = r25.d()
            r1 = 2131562332(0x7f0d0f5c, float:1.875009E38)
            r2 = 2130839618(0x7f020842, float:1.7284252E38)
            com.ss.android.ugc.aweme.feed.d$17 r3 = new com.ss.android.ugc.aweme.feed.d$17
            r3.<init>(r9, r10, r11)
            com.ss.android.ugc.aweme.share.seconditem.j r0 = com.ss.android.ugc.aweme.share.seconditem.j.a((android.content.Context) r0, (int) r1, (int) r2, (android.view.View.OnClickListener) r3)
            int r1 = com.ss.android.ugc.aweme.setting.h.ci8
            java.lang.String r2 = "privacy"
            r0.setTag(r1, r2)
            java.util.List<android.view.View> r1 = r7.D
            r1.add(r0)
        L_0x0989:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39988(0x9c34, float:5.6035E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x09c0
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39988(0x9c34, float:5.6035E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x09ba:
            r6 = 1092616192(0x41200000, float:10.0)
            r12 = 17
            goto L_0x0a61
        L_0x09c0:
            boolean r0 = com.ss.android.ugc.aweme.setting.d.a()
            if (r0 == 0) goto L_0x09ba
            android.content.Context r0 = r25.d()
            if (r0 == 0) goto L_0x09ba
            if (r9 == 0) goto L_0x09ba
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            if (r0 == 0) goto L_0x09ba
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            boolean r0 = r0.isMe()
            if (r0 == 0) goto L_0x09ba
            android.content.Context r0 = r25.d()
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r13] = r0
            r1[r14] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.share.seconditem.d.f65279a
            r21 = 1
            r22 = 73700(0x11fe4, float:1.03276E-40)
            java.lang.Class[] r2 = new java.lang.Class[r15]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r13] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r14] = r3
            java.lang.Class<com.ss.android.ugc.aweme.share.seconditem.d> r24 = com.ss.android.ugc.aweme.share.seconditem.d.class
            r18 = r1
            r23 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r1 == 0) goto L_0x0a31
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r13] = r0
            r1[r14] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.share.seconditem.d.f65279a
            r21 = 1
            r22 = 73700(0x11fe4, float:1.03276E-40)
            java.lang.Class[] r0 = new java.lang.Class[r15]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r13] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r14] = r2
            java.lang.Class<com.ss.android.ugc.aweme.share.seconditem.d> r24 = com.ss.android.ugc.aweme.share.seconditem.d.class
            r18 = r1
            r23 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            com.ss.android.ugc.aweme.share.seconditem.d r0 = (com.ss.android.ugc.aweme.share.seconditem.d) r0
            r6 = 1092616192(0x41200000, float:10.0)
            r12 = 17
            goto L_0x0a5c
        L_0x0a31:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            int r2 = com.ss.android.ugc.aweme.base.utils.u.a((double) r16)
            r1.leftMargin = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r12 = 17
            if (r2 < r12) goto L_0x0a4e
            r6 = 1092616192(0x41200000, float:10.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r6)
            int r2 = (int) r2
            r1.setMarginStart(r2)
            goto L_0x0a50
        L_0x0a4e:
            r6 = 1092616192(0x41200000, float:10.0)
        L_0x0a50:
            com.ss.android.ugc.aweme.share.seconditem.d r2 = new com.ss.android.ugc.aweme.share.seconditem.d
            r2.<init>(r0)
            r2.setLayoutParams(r1)
            r2.setData(r9)
            r0 = r2
        L_0x0a5c:
            java.util.List<android.view.View> r1 = r7.D
            r1.add(r0)
        L_0x0a61:
            r7.d(r9, r10, r11)
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r8
            r0[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39968(0x9c20, float:5.6007E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$SharePage> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.SharePage.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r14] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r1 = r25
            r6 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0aa4
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r8
            r0[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39968(0x9c20, float:5.6007E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$SharePage> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.SharePage.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0ae2
        L_0x0aa4:
            java.lang.String r0 = b((com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r1 = r1.getCurUserId()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0ae2
            boolean r0 = r27.isUserPost()
            if (r0 == 0) goto L_0x0ae2
            if (r9 == 0) goto L_0x0ac3
            java.lang.String r0 = r27.getAdSchedule()
            goto L_0x0ac5
        L_0x0ac3:
            java.lang.String r0 = ""
        L_0x0ac5:
            if (r0 == 0) goto L_0x0ac8
            goto L_0x0aca
        L_0x0ac8:
            java.lang.String r0 = ""
        L_0x0aca:
            android.content.Context r1 = r25.d()
            r2 = 2131561197(0x7f0d0aed, float:1.8747788E38)
            r3 = 2130839681(0x7f020881, float:1.728438E38)
            com.ss.android.ugc.aweme.feed.d$14 r4 = new com.ss.android.ugc.aweme.feed.d$14
            r4.<init>(r9, r0)
            com.ss.android.ugc.aweme.share.seconditem.j r0 = com.ss.android.ugc.aweme.share.seconditem.j.a((android.content.Context) r1, (int) r2, (int) r3, (android.view.View.OnClickListener) r4)
            java.util.List<android.view.View> r1 = r7.D
            r1.add(r0)
        L_0x0ae2:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.aM()
            if (r0 != 0) goto L_0x0af2
            r7.a((com.ss.android.ugc.aweme.feed.model.Aweme) r9, (com.ss.android.ugc.aweme.feed.ui.p) r10, (com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct) r11)
            r7.l(r9)
        L_0x0af2:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r8
            r0[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39969(0x9c21, float:5.6008E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$SharePage> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.SharePage.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0b30
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r8
            r0[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39969(0x9c21, float:5.6008E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$SharePage> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.SharePage.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0b7a
        L_0x0b30:
            if (r9 == 0) goto L_0x0b7a
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.isOb()
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0b7a
            android.support.v4.app.Fragment r0 = r25.e()
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment
            if (r0 == 0) goto L_0x0b7a
            android.content.Context r0 = r25.d()
            r1 = 2131562152(0x7f0d0ea8, float:1.8749725E38)
            r2 = 2130839272(0x7f0206e8, float:1.728355E38)
            com.ss.android.ugc.aweme.feed.q r3 = new com.ss.android.ugc.aweme.feed.q
            r3.<init>(r7, r9)
            com.ss.android.ugc.aweme.share.seconditem.j r0 = com.ss.android.ugc.aweme.share.seconditem.j.a((android.content.Context) r0, (int) r1, (int) r2, (android.view.View.OnClickListener) r3)
            r8.addBottomShareItem(r0)
            android.content.Context r0 = r25.d()
            r1 = 2131558957(0x7f0d022d, float:1.8743244E38)
            r2 = 2130838808(0x7f020518, float:1.7282609E38)
            com.ss.android.ugc.aweme.feed.r r3 = new com.ss.android.ugc.aweme.feed.r
            r3.<init>(r7, r9)
            com.ss.android.ugc.aweme.share.seconditem.j r0 = com.ss.android.ugc.aweme.share.seconditem.j.a((android.content.Context) r0, (int) r1, (int) r2, (android.view.View.OnClickListener) r3)
            r8.addBottomShareItem(r0)
        L_0x0b7a:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39989(0x9c35, float:5.6037E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0bad
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39989(0x9c35, float:5.6037E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0c39
        L_0x0bad:
            boolean r0 = com.ss.android.ugc.aweme.g.a.a()
            if (r0 == 0) goto L_0x0c39
            android.content.Context r0 = r25.d()
            if (r0 == 0) goto L_0x0c39
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.t(r27)
            if (r0 == 0) goto L_0x0c39
            android.content.Context r0 = r25.d()
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r13] = r0
            r1[r14] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.share.seconditem.e.f65281a
            r21 = 1
            r22 = 73707(0x11feb, float:1.03286E-40)
            java.lang.Class[] r2 = new java.lang.Class[r15]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r13] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r14] = r3
            java.lang.Class<com.ss.android.ugc.aweme.share.seconditem.e> r24 = com.ss.android.ugc.aweme.share.seconditem.e.class
            r18 = r1
            r23 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r1 == 0) goto L_0x0c0e
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r13] = r0
            r1[r14] = r9
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.share.seconditem.e.f65281a
            r21 = 1
            r22 = 73707(0x11feb, float:1.03286E-40)
            java.lang.Class[] r0 = new java.lang.Class[r15]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r13] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r14] = r2
            java.lang.Class<com.ss.android.ugc.aweme.share.seconditem.e> r24 = com.ss.android.ugc.aweme.share.seconditem.e.class
            r18 = r1
            r23 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            com.ss.android.ugc.aweme.share.seconditem.e r0 = (com.ss.android.ugc.aweme.share.seconditem.e) r0
            goto L_0x0c34
        L_0x0c0e:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            int r2 = com.ss.android.ugc.aweme.base.utils.u.a((double) r16)
            r1.leftMargin = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r12) goto L_0x0c28
            r2 = 1092616192(0x41200000, float:10.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r2)
            int r2 = (int) r2
            r1.setMarginStart(r2)
        L_0x0c28:
            com.ss.android.ugc.aweme.share.seconditem.e r2 = new com.ss.android.ugc.aweme.share.seconditem.e
            r2.<init>(r0)
            r2.setLayoutParams(r1)
            r2.setAweme(r9)
            r0 = r2
        L_0x0c34:
            java.util.List<android.view.View> r1 = r7.D
            r1.add(r0)
        L_0x0c39:
            com.ss.android.ugc.aweme.share.ag r0 = new com.ss.android.ugc.aweme.share.ag
            android.app.Activity r1 = r7.p
            r0.<init>(r1, r9, r11, r7)
            r7.F = r0
            r25.a((com.ss.android.ugc.aweme.framework.services.IShareService.SharePage) r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.d.a(com.ss.android.ugc.aweme.framework.services.IShareService$SharePage, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.ui.p, com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Aweme aweme, IShareService.ShareStruct shareStruct, View view) {
        if (com.ss.android.ugc.aweme.c.a.a.a(view) || !f(aweme)) {
            return;
        }
        if (!m(aweme) || !cg.a(b(aweme))) {
            this.z = new com.ss.android.ugc.aweme.feed.h.b(aweme);
            this.z.a(new com.ss.android.ugc.aweme.feed.h.a());
            this.z.a(this);
            this.z.a(aweme.getAid(), Integer.valueOf(com.ss.android.ugc.aweme.account.d.a().getCurUser().getUid() == null ? 1 : 0));
            r.onEvent(MobClick.obtain().setEventName("click_dou_plus").setLabelName(this.r).setValue(aweme.getAid()));
            r.a("click_dou_plus", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", shareStruct.enterFrom).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).a("is_self", this.v ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY).f34114b);
            if (this.l != null) {
                this.l.dismiss();
            }
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.c(d(), (int) C0906R.string.ph).a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x020a, code lost:
        if (r0.g.intValue() <= 3) goto L_0x0212;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.DialogInterface r28, com.ss.android.ugc.aweme.feed.model.Aweme r29) {
        /*
            r27 = this;
            r7 = r27
            r9 = r29
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r28
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.content.DialogInterface> r1 = android.content.DialogInterface.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 39999(0x9c3f, float:5.605E-41)
            r1 = r27
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r28
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39999(0x9c3f, float:5.605E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.content.DialogInterface> r1 = android.content.DialogInterface.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            r8 = r28
            android.support.design.widget.BottomSheetDialog r8 = (android.support.design.widget.BottomSheetDialog) r8
            r0 = 2131166326(0x7f070476, float:1.7946894E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 == 0) goto L_0x0062
            android.support.design.widget.BottomSheetBehavior r1 = android.support.design.widget.BottomSheetBehavior.from(r0)
            int r0 = r0.getHeight()
            r1.setPeekHeight(r0)
            r1.setSkipCollapsed(r12)
        L_0x0062:
            boolean r0 = a((com.ss.android.ugc.aweme.feed.model.Aweme) r29)
            if (r0 == 0) goto L_0x0256
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 40000(0x9c40, float:5.6052E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.design.widget.BottomSheetDialog> r1 = android.support.design.widget.BottomSheetDialog.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r27
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a6
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 40000(0x9c40, float:5.6052E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.design.widget.BottomSheetDialog> r1 = android.support.design.widget.BottomSheetDialog.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00a6:
            r0 = 2131169890(0x7f071262, float:1.7954123E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.HorizontalScrollView r0 = (android.widget.HorizontalScrollView) r0
            if (r0 == 0) goto L_0x0256
            r0.removeAllViews()
            android.app.Activity r1 = r27.c()
            com.ss.android.ugc.aweme.feed.ui.p r2 = r7.f45160c
            com.ss.android.ugc.aweme.feed.i r3 = new com.ss.android.ugc.aweme.feed.i
            r3.<init>(r7, r9, r8)
            r4 = 4
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r11] = r1
            r13[r12] = r0
            r13[r10] = r2
            r5 = 3
            r13[r5] = r3
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.share.cg.f64940a
            r16 = 1
            r17 = 73312(0x11e60, float:1.02732E-40)
            java.lang.Class[] r6 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r8 = android.app.Activity.class
            r6[r11] = r8
            java.lang.Class<android.widget.HorizontalScrollView> r8 = android.widget.HorizontalScrollView.class
            r6[r12] = r8
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r8 = com.ss.android.ugc.aweme.feed.ui.p.class
            r6[r10] = r8
            java.lang.Class<com.ss.android.ugc.aweme.share.cg$a> r8 = com.ss.android.ugc.aweme.share.cg.a.class
            r6[r5] = r8
            java.lang.Class<android.widget.LinearLayout> r19 = android.widget.LinearLayout.class
            r18 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r6 == 0) goto L_0x011f
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r11] = r1
            r13[r12] = r0
            r13[r10] = r2
            r13[r5] = r3
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.share.cg.f64940a
            r16 = 1
            r17 = 73312(0x11e60, float:1.02732E-40)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r11] = r1
            java.lang.Class<android.widget.HorizontalScrollView> r1 = android.widget.HorizontalScrollView.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r1 = com.ss.android.ugc.aweme.feed.ui.p.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.share.cg$a> r1 = com.ss.android.ugc.aweme.share.cg.a.class
            r0[r5] = r1
            java.lang.Class<android.widget.LinearLayout> r19 = android.widget.LinearLayout.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            goto L_0x0241
        L_0x011f:
            r2 = 5
            com.douyin.baseshare.a[] r2 = new com.douyin.baseshare.a[r2]
            com.douyin.share.l r6 = new com.douyin.share.l
            r6.<init>(r1)
            r2[r11] = r6
            com.douyin.share.m r6 = new com.douyin.share.m
            r6.<init>(r1)
            r2[r12] = r6
            com.douyin.share.d r6 = new com.douyin.share.d
            r6.<init>(r1)
            r2[r10] = r6
            com.douyin.share.b r6 = new com.douyin.share.b
            r6.<init>(r1)
            r2[r5] = r6
            com.douyin.share.n r6 = new com.douyin.share.n
            r6.<init>(r1)
            r2[r4] = r6
            android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()
            boolean r4 = com.ss.android.ugc.aweme.profile.q.a((android.content.Context) r4)
            if (r4 != 0) goto L_0x0155
            java.lang.String r4 = "rocket"
            com.douyin.baseshare.a[] r2 = com.ss.android.ugc.aweme.share.cg.a((com.douyin.baseshare.a[]) r2, (java.lang.String) r4)
        L_0x0155:
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r1)
            r4.setOrientation(r11)
            r0.addView(r4)
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r13[r11] = r1
            r13[r12] = r3
            r13[r10] = r4
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.share.cg.f64940a
            r16 = 1
            r17 = 73313(0x11e61, float:1.02733E-40)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r0[r11] = r6
            java.lang.Class<com.ss.android.ugc.aweme.share.cg$a> r6 = com.ss.android.ugc.aweme.share.cg.a.class
            r0[r12] = r6
            java.lang.Class<android.widget.LinearLayout> r6 = android.widget.LinearLayout.class
            r0[r10] = r6
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x01af
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r13[r11] = r1
            r13[r12] = r3
            r13[r10] = r4
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.share.cg.f64940a
            r16 = 1
            r17 = 73313(0x11e61, float:1.02733E-40)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r0[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.share.cg$a> r5 = com.ss.android.ugc.aweme.share.cg.a.class
            r0[r12] = r5
            java.lang.Class<android.widget.LinearLayout> r5 = android.widget.LinearLayout.class
            r0[r10] = r5
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x022b
        L_0x01af:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r6 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r22 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r23 = 0
            r24 = 71781(0x11865, float:1.00587E-40)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class r26 = java.lang.Integer.TYPE
            r20 = r6
            r21 = r0
            r25 = r8
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r20, r21, r22, r23, r24, r25, r26)
            if (r6 == 0) goto L_0x01ea
            java.lang.Object[] r5 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r22 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r23 = 0
            r24 = 71781(0x11865, float:1.00587E-40)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class r26 = java.lang.Integer.TYPE
            r20 = r5
            r21 = r0
            r25 = r6
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0218
        L_0x01ea:
            java.lang.Integer r6 = r0.g
            if (r6 != 0) goto L_0x0212
            com.ss.android.ugc.aweme.setting.model.AbTestModel r6 = r0.d()
            if (r6 == 0) goto L_0x020c
            int r6 = r6.imShareStyle
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.g = r6
            java.lang.Integer r6 = r0.g
            int r6 = r6.intValue()
            if (r6 < 0) goto L_0x020c
            java.lang.Integer r6 = r0.g
            int r6 = r6.intValue()
            if (r6 <= r5) goto L_0x0212
        L_0x020c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r0.g = r5
        L_0x0212:
            java.lang.Integer r0 = r0.g
            int r0 = r0.intValue()
        L_0x0218:
            if (r0 != r12) goto L_0x022b
            com.ss.android.ugc.aweme.share.c r0 = new com.ss.android.ugc.aweme.share.c
            r0.<init>(r1)
            com.ss.android.ugc.aweme.share.cg$2 r5 = new com.ss.android.ugc.aweme.share.cg$2
            r5.<init>(r3, r0)
            com.ss.android.ugc.aweme.share.seconditem.j r0 = com.ss.android.ugc.aweme.share.cg.a((android.app.Activity) r1, (com.douyin.baseshare.a) r0, (android.view.View.OnClickListener) r5)
            r4.addView(r0)
        L_0x022b:
            int r0 = r2.length
            r5 = 0
        L_0x022d:
            if (r5 >= r0) goto L_0x0240
            r6 = r2[r5]
            com.ss.android.ugc.aweme.share.cg$1 r8 = new com.ss.android.ugc.aweme.share.cg$1
            r8.<init>(r3, r6)
            com.ss.android.ugc.aweme.share.seconditem.j r6 = com.ss.android.ugc.aweme.share.cg.a((android.app.Activity) r1, (com.douyin.baseshare.a) r6, (android.view.View.OnClickListener) r8)
            r4.addView(r6)
            int r5 = r5 + 1
            goto L_0x022d
        L_0x0240:
            r0 = r4
        L_0x0241:
            boolean r1 = r7.k(r9)
            if (r1 == 0) goto L_0x0256
            android.support.v4.app.Fragment r1 = r27.e()
            com.ss.android.ugc.aweme.share.ShareDialog r2 = r7.l
            java.lang.String r3 = r7.r
            com.ss.android.ugc.aweme.newfollow.ui.c r1 = com.ss.android.ugc.aweme.newfollow.ui.c.a(r1, r9, r2, r3)
            r0.addView(r1, r11)
        L_0x0256:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.d.a(android.content.DialogInterface, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Aweme aweme, BottomSheetDialog bottomSheetDialog, com.douyin.baseshare.a aVar) {
        if (!aVar.a()) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) c(), aVar.c(), 0).a();
        } else if (a(aweme)) {
            if (g.d(aweme)) {
                if (this.f45160c == null || this.f45160c.checkStatus(aVar.d())) {
                    com.ss.android.ugc.aweme.feed.share.a.b bVar = new com.ss.android.ugc.aweme.feed.share.a.b(c());
                    bVar.i = new l(this, aweme, aVar);
                    bVar.a(aweme, true);
                } else {
                    bottomSheetDialog.dismiss();
                    return;
                }
            }
        } else if (g.b(aweme)) {
            aVar.a(com.ss.android.ugc.aweme.feed.share.i.a(d(), aweme));
        }
        bottomSheetDialog.dismiss();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Aweme aweme, com.douyin.baseshare.a aVar, String str) {
        if (j() && c() != null) {
            aVar.b(com.ss.android.ugc.aweme.feed.share.i.c(d(), aweme, str));
            IShareService.ShareResult shareResult = new IShareService.ShareResult();
            shareResult.identifier = aweme.getAid();
            shareResult.success = true;
            shareResult.type = aVar.d();
            this.f45160c.onShareComplete(shareResult);
        }
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.comment.a aVar) {
        boolean z2;
        com.ss.android.ugc.aweme.commercialize.model.c cVar;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f45158a, false, 40001, new Class[]{com.ss.android.ugc.aweme.comment.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f45158a, false, 40001, new Class[]{com.ss.android.ugc.aweme.comment.a.class}, Void.TYPE);
            return;
        }
        Aweme aweme = aVar.f36268b;
        if (aweme != null) {
            if (c() == null) {
                com.ss.android.ugc.aweme.comment.a.a.b("getActivity() is null");
                return;
            }
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f45158a, false, 40002, new Class[]{Aweme.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f45158a, false, 40002, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
            } else {
                z2 = com.ss.android.ugc.aweme.u.aa.p(aweme) && aweme.isProhibited();
            }
            if (z2) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) c(), (int) C0906R.string.px).a();
                return;
            }
            com.ss.android.ugc.aweme.comment.d.b enableComment = ((com.ss.android.ugc.aweme.comment.d.b) new com.ss.android.ugc.aweme.comment.d.b(aweme.getAid()).setRequestId(g(aweme).optString("request_id")).setAuthorUid(aweme.getAuthor() != null ? aweme.getAuthor().getUid() : "")).setEventType(this.r).setSource(0).setMyProfile(this.v).setEnableComment(!aweme.isCmtSwt());
            if (aweme.getAdCommentStruct() == null) {
                cVar = null;
            } else {
                cVar = aweme.getAdCommentStruct().setAid(aweme.getAid());
            }
            com.ss.android.ugc.aweme.comment.d.b commentClose = enableComment.setAdCommentStruct(cVar).setCommentClose(com.ss.android.ugc.aweme.setting.d.b(aweme));
            if (com.ss.android.ugc.aweme.setting.d.b(aweme) || com.ss.android.ugc.aweme.setting.d.a(aweme)) {
                z3 = false;
            }
            com.ss.android.ugc.aweme.comment.d.b enterMethod = commentClose.setCommentLimited(z3).forceRefresh(aVar.h).setPageType(this.s).setPoiId(aVar.g).setScrollToTop(aVar.f36270d).setPreviousPage(aVar.j).setIsLongItem(com.ss.android.ugc.aweme.longvideo.b.a.a(this.p)).setEnterMethod(aVar.i);
            if (!TextUtils.isEmpty(aVar.f36269c)) {
                enterMethod.setInsertCids(aVar.f36269c, aVar.f36271e, aVar.f36272f);
            }
            VideoCommentDialogFragment2 a2 = VideoCommentDialogFragment2.a(c(), aweme, enterMethod);
            if (a2 != null) {
                if (!a2.isAdded() && aweme.getAuthor() != null && aweme.isCmtSwt()) {
                    if (aweme.getAuthor().isAdFake() || aweme.isAd()) {
                        com.ss.android.ugc.aweme.framework.a.a.a("CommentForbidRight", " aweme id = " + aweme.getAid() + " author id = " + b(aweme) + " current uid = " + com.ss.android.ugc.aweme.account.d.a().getCurUserId());
                    } else {
                        com.ss.android.ugc.aweme.framework.a.a.a("CommentForbidError", " aweme id = " + aweme.getAid() + " author id = " + b(aweme) + " current uid = " + com.ss.android.ugc.aweme.account.d.a().getCurUserId());
                    }
                }
                a2.p = new j(this, aweme);
                a2.q = new k(this, aweme);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(final Aweme aweme, ar arVar) {
        if (arVar.f45292b == 20) {
            boolean z2 = false;
            this.f45161d.a(aweme, 0);
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f45158a, false, 40003, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme}, this, f45158a, false, 40003, new Class[]{Aweme.class}, Void.TYPE);
            } else if (c() != null && am.b(aweme)) {
                if (PatchProxy.isSupport(new Object[]{aweme}, this, com.ss.android.ugc.aweme.feed.c.a.o, false, 40948, new Class[]{Aweme.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, com.ss.android.ugc.aweme.feed.c.a.o, false, 40948, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                } else if (aweme != null) {
                    User author = aweme.getAuthor();
                    if (author != null) {
                        z2 = TextUtils.equals(author.getUid(), com.ss.android.ugc.aweme.account.d.a().getCurUser().getUid());
                    }
                }
                if (z2) {
                    new AlertDialog.Builder(d()).setMessage((int) C0906R.string.br7).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f45227a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45227a, false, 40048, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45227a, false, 40048, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            r.onEvent(new MobClick().setEventName("private_permission").setLabelName("cancel").setValue(aweme.getAid()));
                        }
                    }).setPositiveButton((int) C0906R.string.b4_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f45224a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45224a, false, 40047, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45224a, false, 40047, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            d.this.f45161d.a(aweme.getAid(), 1);
                            r.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(aweme.getAid()));
                        }
                    }).show();
                }
            }
        }
    }

    public final void a(AwemeAdStatus awemeAdStatus, String str) {
        AwemeAdStatus awemeAdStatus2 = awemeAdStatus;
        if (PatchProxy.isSupport(new Object[]{awemeAdStatus2, str}, this, f45158a, false, 40004, new Class[]{AwemeAdStatus.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeAdStatus2, str}, this, f45158a, false, 40004, new Class[]{AwemeAdStatus.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{awemeAdStatus2, str}, this, f45158a, false, 40005, new Class[]{AwemeAdStatus.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeAdStatus2, str}, this, f45158a, false, 40005, new Class[]{AwemeAdStatus.class, String.class}, Void.TYPE);
            return;
        }
        if (awemeAdStatus2 != null && c() != null) {
            String str2 = "https://aweme.snssdk.com" + awemeAdStatus2.url + "&from=" + this.r + "&hide_status_bar=0&status_bar_color=ffffff";
            Intent intent = new Intent(c(), CrossPlatformActivity.class);
            intent.setData(Uri.parse(str2));
            intent.putExtra("hide_nav_bar", true);
            intent.putExtra("bundle_webview_background", c().getResources().getColor(C0906R.color.ao4));
            if (TextUtils.equals("MX4 Pro", Build.MODEL) && TextUtils.equals("meizu", Build.BRAND.toLowerCase())) {
                intent.putExtra("is_adjust_pan", true);
                intent.putExtra("bundle_fix_webview", false);
            }
            intent.putExtra("dou_plus_fail_monitor_url", str2);
            c().startActivity(intent);
        }
    }

    public final void a(Exception exc, AwemeAdStatus awemeAdStatus, String str, Aweme aweme) {
        String str2;
        Exception exc2 = exc;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{exc2, awemeAdStatus, str3, aweme}, this, f45158a, false, 40006, new Class[]{Exception.class, AwemeAdStatus.class, String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, awemeAdStatus, str3, aweme}, this, f45158a, false, 40006, new Class[]{Exception.class, AwemeAdStatus.class, String.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc2;
            com.bytedance.ies.dmt.ui.d.a.b((Context) c(), aVar.getErrorMsg()).a();
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.r).a("group_id", str3);
            if (aweme == null) {
                str2 = "";
            } else {
                str2 = aweme.getAuthorUid();
            }
            r.a("dou_promote_layer_show", (Map) a2.a("author_id", str2).f34114b);
            if (aVar.getErrorCode() == 2352) {
                r.a("promote_layer_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.r).a(PushConstants.CONTENT, "gd_promoted").a("group_id", str3).f34114b);
            }
        }
    }

    public final void a(final a.C0575a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f45158a, false, 40009, new Class[]{a.C0575a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f45158a, false, 40009, new Class[]{a.C0575a.class}, Void.TYPE);
        } else if (!this.f45162e) {
            this.f45162e = true;
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45167a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f45167a, false, 40049, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45167a, false, 40049, new Class[0], Void.TYPE);
                    } else if (d.this.c() != null && !d.this.c().isFinishing()) {
                        final com.ss.android.ugc.aweme.app.d.d dVar = new com.ss.android.ugc.aweme.app.d.d();
                        dVar.a("enter_from", d.this.r);
                        com.ss.android.ugc.aweme.freeflowcard.c cVar = new com.ss.android.ugc.aweme.freeflowcard.c(d.this.c());
                        AnonymousClass1 r3 = new a.C0575a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f45170a;

                            public final void b(Dialog dialog) {
                                if (PatchProxy.isSupport(new Object[]{dialog}, this, f45170a, false, 40051, new Class[]{Dialog.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialog}, this, f45170a, false, 40051, new Class[]{Dialog.class}, Void.TYPE);
                                    return;
                                }
                                x.a(dialog);
                                d.this.f45162e = false;
                                com.ss.android.ugc.aweme.freeflowcard.b.a().i = false;
                                r.onEvent(MobClick.obtain().setEventName("cancel").setLabelName("no_wifi"));
                                r.a("no_wifi_cancel", (Map) com.ss.android.ugc.aweme.freeflowcard.b.a().a(dVar, d.this.d()).f34114b);
                                com.ss.android.ugc.aweme.freeflowcard.data.a.a().a(0, ((com.ss.android.ugc.aweme.freeflowcard.b.a) dialog).b());
                                if (aVar != null) {
                                    aVar.b(dialog);
                                }
                            }

                            public final void a(Dialog dialog) {
                                Dialog dialog2 = dialog;
                                boolean z = false;
                                if (PatchProxy.isSupport(new Object[]{dialog2}, this, f45170a, false, 40050, new Class[]{Dialog.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialog2}, this, f45170a, false, 40050, new Class[]{Dialog.class}, Void.TYPE);
                                    return;
                                }
                                x.a(dialog);
                                d.this.f45162e = false;
                                boolean z2 = dialog2 instanceof com.ss.android.ugc.aweme.freeflowcard.b.e;
                                if (!z2) {
                                    com.ss.android.ugc.aweme.freeflowcard.b.a().i = true;
                                    r.a("no_wifi_continue", (Map) com.ss.android.ugc.aweme.freeflowcard.b.a().a(dVar, d.this.d()).f34114b);
                                } else {
                                    r.a("wifi_continue", (Map) com.ss.android.ugc.aweme.freeflowcard.b.a().a(dVar, d.this.d()).f34114b);
                                }
                                r.onEvent(MobClick.obtain().setEventName("confirm").setLabelName("no_wifi"));
                                if (!m.a().b()) {
                                    com.ss.android.ugc.aweme.freeflowcard.data.a.a().a(1, ((com.ss.android.ugc.aweme.freeflowcard.b.a) dialog2).b());
                                }
                                if (((com.ss.android.ugc.aweme.freeflowcard.b.a) dialog2).b()) {
                                    com.ss.android.ugc.aweme.freeflowcard.data.b.b c2 = com.ss.android.ugc.aweme.freeflowcard.data.a.a().c();
                                    c2.isOpen = true;
                                    c2.changeType = 1;
                                    c2.monthlyState = 0;
                                    c2.resetTime = com.ss.android.ugc.aweme.freeflowcard.a.c();
                                    com.ss.android.ugc.aweme.freeflowcard.data.a.a().a(c2);
                                }
                                com.ss.android.ugc.aweme.freeflowcard.a.d a2 = com.ss.android.ugc.aweme.freeflowcard.a.d.a();
                                if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.freeflowcard.a.d.f48555a, false, 46151, new Class[0], Boolean.TYPE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.freeflowcard.a.d.f48555a, false, 46151, new Class[0], Boolean.TYPE)).booleanValue();
                                } else if (a2.e()) {
                                    com.ss.android.ugc.aweme.freeflowcard.data.b.b c3 = com.ss.android.ugc.aweme.freeflowcard.data.a.a().c();
                                    if (c3.isOpen || c3.changeType != 1) {
                                        z = a2.f();
                                    }
                                } else if (com.ss.android.ugc.aweme.freeflowcard.data.a.a().c().isOpen && com.ss.android.ugc.aweme.freeflowcard.data.a.a().c().monthlyState != 1) {
                                    z = a2.f();
                                }
                                if (!z && !z2) {
                                    UIUtils.displayToast((Context) d.this.c(), (int) C0906R.string.bbz);
                                }
                                if (aVar != null) {
                                    aVar.a(dialog2);
                                }
                            }
                        };
                        if (PatchProxy.isSupport(new Object[]{r3}, cVar, com.ss.android.ugc.aweme.freeflowcard.c.f48593a, false, 46032, new Class[]{a.C0575a.class}, com.ss.android.ugc.aweme.freeflowcard.c.class)) {
                            com.ss.android.ugc.aweme.freeflowcard.c cVar2 = cVar;
                            cVar = (com.ss.android.ugc.aweme.freeflowcard.c) PatchProxy.accessDispatch(new Object[]{r3}, cVar2, com.ss.android.ugc.aweme.freeflowcard.c.f48593a, false, 46032, new Class[]{a.C0575a.class}, com.ss.android.ugc.aweme.freeflowcard.c.class);
                        } else {
                            cVar.f48594b.k = r3;
                        }
                        cVar.f48595c = d.this.r;
                        cVar.f48594b.j = cVar.f48595c;
                        com.ss.android.ugc.aweme.freeflowcard.b.a aVar = cVar.f48594b;
                        try {
                            if (d.this.c() == null || d.this.c().isFinishing()) {
                                d.this.f45162e = false;
                            } else {
                                aVar.show();
                                r.onEvent(MobClick.obtain().setEventName("no_wifi").setLabelName("alert"));
                                if (aVar instanceof com.ss.android.ugc.aweme.freeflowcard.b.e) {
                                    r.a("wifi_alert", (Map) com.ss.android.ugc.aweme.freeflowcard.b.a().a(dVar, d.this.d()).f34114b);
                                } else {
                                    r.a("no_wifi_alert", (Map) com.ss.android.ugc.aweme.freeflowcard.b.a().a(dVar, d.this.d()).a("network", NetworkUtils.getNetworkAccessType((Context) d.this.c())).f34114b);
                                }
                            }
                            aVar.setCanceledOnTouchOutside(false);
                            aVar.setCancelable(false);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f45158a, false, 40012, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f45158a, false, 40012, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(d(), (Throwable) exc2);
    }

    public final j a(Aweme aweme, IShareService.ShareStruct shareStruct, boolean z2) {
        int i2;
        j jVar;
        Boolean bool;
        Aweme aweme2 = aweme;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{aweme2, shareStruct2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f45158a, false, 40020, new Class[]{Aweme.class, IShareService.ShareStruct.class, Boolean.TYPE}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{aweme2, shareStruct2, Byte.valueOf(z2)}, this, f45158a, false, 40020, new Class[]{Aweme.class, IShareService.ShareStruct.class, Boolean.TYPE}, j.class);
        }
        if (PatchProxy.isSupport(new Object[]{aweme2, shareStruct2, Byte.valueOf(z2)}, this, f45158a, false, 39990, new Class[]{Aweme.class, IShareService.ShareStruct.class, Boolean.TYPE}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{aweme2, shareStruct2, Byte.valueOf(z2)}, this, f45158a, false, 39990, new Class[]{Aweme.class, IShareService.ShareStruct.class, Boolean.TYPE}, j.class);
        }
        if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = com.ss.android.ugc.aweme.global.config.settings.g.b();
            if (PatchProxy.isSupport(new Object[0], b2, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48679, new Class[0], Boolean.class)) {
                bool = (Boolean) PatchProxy.accessDispatch(new Object[0], b2, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48679, new Class[0], Boolean.class);
            } else if (b2.f49569c == null) {
                bool = b2.f49568b.getWithDouplusEntry();
            } else {
                bool = (Boolean) com.ss.android.ugc.aweme.global.config.settings.pojo.a.a(b2.f49569c, "with_douplus_entry", Boolean.class, b2.f49568b.getWithDouplusEntry());
            }
            if (!bool.booleanValue()) {
                return null;
            }
        } else if (!com.ss.android.ugc.aweme.commercialize.utils.c.f(aweme) || TimeLockRuler.isContentFilterOn()) {
            return null;
        }
        this.n = false;
        if (z2) {
            r.a("show_dou_plus", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", shareStruct2.enterFrom).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).f34114b);
        } else {
            ShareDialog shareDialog = this.l;
            u uVar = new u(this, shareStruct2, aweme2);
            if (PatchProxy.isSupport(new Object[]{uVar}, shareDialog, BaseShareDialog.f64482d, false, 72952, new Class[]{MyHorizontalScrollView.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{uVar}, shareDialog, BaseShareDialog.f64482d, false, 72952, new Class[]{MyHorizontalScrollView.a.class}, Void.TYPE);
            } else if (shareDialog.m != null) {
                shareDialog.m.setListener(uVar);
            }
            if (this.m) {
                ShareDialog shareDialog2 = this.l;
                if (PatchProxy.isSupport(new Object[0], shareDialog2, BaseShareDialog.f64482d, false, 72953, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], shareDialog2, BaseShareDialog.f64482d, false, 72953, new Class[0], Void.TYPE);
                } else if (shareDialog2.m != null) {
                    MyHorizontalScrollView myHorizontalScrollView = shareDialog2.m;
                    if (PatchProxy.isSupport(new Object[0], myHorizontalScrollView, MyHorizontalScrollView.f64492a, false, 73108, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], myHorizontalScrollView, MyHorizontalScrollView.f64492a, false, 73108, new Class[0], Void.TYPE);
                    } else {
                        myHorizontalScrollView.postDelayed(new bf(myHorizontalScrollView), 100);
                    }
                }
            }
        }
        v vVar = new v(this, aweme2, shareStruct2);
        if (AbTestManager.a().aR() == 2) {
            i2 = C0906R.string.a6k;
        } else {
            i2 = !cg.a(b(aweme)) ? C0906R.string.alx : C0906R.string.a6h;
        }
        String a2 = DouplusTitleHelper.a(cg.a(b(aweme)) ? 1 : 2);
        if (a2 == null) {
            jVar = j.a(d(), i2, 2130839606, (View.OnClickListener) vVar);
        } else {
            Context d2 = d();
            jVar = PatchProxy.isSupport(new Object[]{d2, a2, 2130839606, vVar}, null, j.g, true, 73727, new Class[]{Context.class, String.class, Integer.TYPE, View.OnClickListener.class}, j.class) ? (j) PatchProxy.accessDispatch(new Object[]{d2, a2, 2130839606, vVar}, null, j.g, true, 73727, new Class[]{Context.class, String.class, Integer.TYPE, View.OnClickListener.class}, j.class) : j.a(d2, a2, com.ss.android.ugc.bytex.a.a.a.a(d2.getResources(), 2130839606), (View.OnClickListener) vVar);
        }
        return jVar;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45158a, false, 39955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45158a, false, 39955, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.f45161d != null) {
            this.f45161d.j();
        }
        if (this.l != null) {
            this.l.setOnShowListener(null);
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f45158a, false, 40011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45158a, false, 40011, new Class[0], Void.TYPE);
            return;
        }
        UIUtils.displayToast(d(), (int) C0906R.string.c01);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f45158a, false, 40013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45158a, false, 40013, new Class[0], Void.TYPE);
            return;
        }
        UIUtils.displayToast(d(), (int) C0906R.string.nh);
    }

    public final boolean i() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f45158a, false, 40015, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45158a, false, 40015, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.k != null && this.k.isShowing()) {
            z2 = true;
        }
        return z2;
    }

    public final void b_(String str) {
        this.r = str;
    }

    public final void c_(String str) {
        this.t = str;
    }

    public static String b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45158a, true, 39965, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45158a, true, 39965, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            User author = aweme.getAuthor();
            if (author == null) {
                return "";
            }
            return author.getUid();
        }
    }

    public static boolean c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45158a, true, 39979, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45158a, true, 39979, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.getAwemeControl().canShare()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean m(Aweme aweme) {
        User user;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45158a, false, 39973, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f45158a, false, 39973, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        if (user != null) {
            return user.isSecret();
        }
        return false;
    }

    public final boolean e(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45158a, false, 39984, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f45158a, false, 39984, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme.getAuthor() == null || !TextUtils.equals(com.ss.android.ugc.aweme.account.d.a().getCurUserId(), aweme.getAuthor().getUid())) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean f(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45158a, false, 39992, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f45158a, false, 39992, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.commercialize.utils.c.L(aweme)) {
            return true;
        } else {
            r.a("dou_promote_layer_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.r).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).f34114b);
            com.bytedance.ies.dmt.ui.d.a.b(d(), (int) C0906R.string.ca).a();
            this.l.dismiss();
            return false;
        }
    }

    public final JSONObject g(Aweme aweme) {
        if (!PatchProxy.isSupport(new Object[]{aweme}, this, f45158a, false, 40007, new Class[]{Aweme.class}, JSONObject.class)) {
            return a(a.a().b(aweme, this.s), aweme);
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{aweme}, this, f45158a, false, 40007, new Class[]{Aweme.class}, JSONObject.class);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i(Aweme aweme) {
        com.ss.android.ugc.aweme.commercialize.utils.g.a(d(), (String) SharePrefCache.inst().getAdIntroUrlItem().c(), d().getString(C0906R.string.c7));
        r.a("click_adcooperation", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).a("enter_from", this.r).f34114b);
        if (this.l != null) {
            this.l.dismiss();
        }
    }

    public static boolean d(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45158a, true, 39980, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45158a, true, 39980, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme != null && aweme.getAwemeControl().canForward()) {
            return false;
        } else {
            if (aweme != null && aweme.getAwemeControl().canShare()) {
                com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.a21).a();
            }
            return true;
        }
    }

    private void j(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45158a, false, 39962, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f45158a, false, 39962, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (a(aweme)) {
            if (!(aweme.getAuthor() == null || aweme.getImageInfos() == null)) {
                this.j = com.ss.android.ugc.aweme.feed.share.i.c(c(), aweme, "");
            }
        } else if (!(aweme == null || aweme.getAuthor() == null || aweme.getVideo() == null)) {
            this.j = com.ss.android.ugc.aweme.feed.share.i.a(d(), aweme);
        }
        if (this.j == null) {
            this.j = new IShareService.ShareStruct();
        }
        if (this.j != null) {
            this.j.authorId = com.ss.android.ugc.aweme.u.aa.a(aweme);
            this.j.enterFrom = this.r;
            this.j.contentType = com.ss.android.ugc.aweme.u.aa.o(aweme);
            if (com.ss.android.ugc.aweme.u.aa.c(this.r)) {
                this.j.poiId = com.ss.android.ugc.aweme.u.aa.e(aweme);
                this.j.poiType = com.ss.android.ugc.aweme.u.aa.h(aweme);
            }
            this.j.cityInfo = com.ss.android.ugc.aweme.u.aa.a();
            this.j.distnceInfo = com.ss.android.ugc.aweme.u.aa.i(aweme);
            this.j.logPb = ai.a().a(com.ss.android.ugc.aweme.u.aa.c(aweme));
            this.j.isLongItem = com.ss.android.ugc.aweme.longvideo.b.a.a(c());
        }
    }

    private boolean k(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45158a, false, 39963, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f45158a, false, 39963, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.isShowForwardEntrance() || e() == null) {
            return false;
        } else {
            if (!com.ss.android.g.a.a() && ((e() instanceof FollowFeedFragment) || (e() instanceof UserStateFragment))) {
                return true;
            }
            if ((e() instanceof AbsProfileFragment) || (e() instanceof UserProfileFragment) || (e() instanceof SearchMixFeedFragment) || (e() instanceof AbsPoiAwemeFeedFragment) || FeedDetailActivity.c()) {
                return false;
            }
            return true;
        }
    }

    private void l(Aweme aweme) {
        int i2;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45158a, false, 39966, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f45158a, false, 39966, new Class[]{Aweme.class}, Void.TYPE);
        } else if (!m(aweme)) {
            if (aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() != 0) {
                z2 = false;
            }
            if (aweme.getAuthor() != null) {
                StringUtils.equal(com.ss.android.ugc.aweme.account.d.a().getCurUserId(), b(aweme));
            }
            n nVar = new n(d());
            nVar.a(new FeedSelfseeNoticeModel());
            if (!a(aweme) && z2) {
                Context d2 = d();
                if (AbTestManager.a().bh() || aweme.isForwardAweme()) {
                    i2 = C0906R.string.bua;
                } else {
                    i2 = C0906R.string.bu_;
                }
                this.D.add(a(j.a(d2, i2, 2130839620, (View.OnClickListener) new e(this, aweme, nVar)), aweme));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.List<android.view.View>} */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0149, code lost:
        if (r2 == false) goto L_0x01ea;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.ugc.aweme.framework.services.IShareService.SharePage r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$SharePage> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.SharePage.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 39974(0x9c26, float:5.6016E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f45158a
            r3 = 0
            r4 = 39974(0x9c26, float:5.6016E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$SharePage> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.SharePage.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.share.ag r0 = r7.F
            java.util.List<android.view.View> r1 = r7.D
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ag.f64620c
            r14 = 0
            r15 = 73033(0x11d49, float:1.02341E-40)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r2[r10] = r3
            java.lang.Class<java.util.List> r17 = java.util.List.class
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0074
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.share.ag.f64620c
            r12 = 0
            r13 = 73033(0x11d49, float:1.02341E-40)
            java.lang.Class[] r14 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r14[r10] = r1
            java.lang.Class<java.util.List> r15 = java.util.List.class
            r9 = r2
            r10 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            goto L_0x01f9
        L_0x0074:
            com.ss.android.ugc.aweme.utils.u r2 = com.ss.android.ugc.aweme.utils.u.f75965b
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f64622e
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.utils.u r2 = com.ss.android.ugc.aweme.utils.u.f75965b
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f64622e
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto L_0x01f9
        L_0x0088:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f64622e
            if (r2 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f64622e
            int r2 = r2.getAwemeType()
            r3 = 13
            if (r2 == r3) goto L_0x01f9
        L_0x0096:
            android.app.Activity r2 = r0.f64621d
            boolean r2 = com.ss.android.ugc.aweme.longvideo.b.a.b(r2)
            if (r2 != 0) goto L_0x01ea
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f64622e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ag.f64620c
            r14 = 0
            r15 = 73031(0x11d47, float:1.02338E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r3[r10] = r4
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x00db
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ag.f64620c
            r14 = 0
            r15 = 73031(0x11d47, float:1.02338E-40)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x00eb
        L_0x00db:
            if (r2 == 0) goto L_0x00e2
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            goto L_0x00e3
        L_0x00e2:
            r2 = 0
        L_0x00e3:
            if (r2 == 0) goto L_0x00ea
            boolean r2 = r2.isSecret()
            goto L_0x00eb
        L_0x00ea:
            r2 = 0
        L_0x00eb:
            if (r2 == 0) goto L_0x014d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f64622e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ag.f64620c
            r14 = 0
            r15 = 73032(0x11d48, float:1.0234E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r3[r10] = r4
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x012a
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.share.ag.f64620c
            r14 = 0
            r15 = 73032(0x11d48, float:1.0234E-40)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x0149
        L_0x012a:
            com.ss.android.ugc.aweme.profile.model.User r3 = r2.getAuthor()
            if (r3 == 0) goto L_0x0148
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r3 = r3.getCurUserId()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            java.lang.String r2 = r2.getUid()
            boolean r2 = android.text.TextUtils.equals(r3, r2)
            if (r2 == 0) goto L_0x0148
            r2 = 1
            goto L_0x0149
        L_0x0148:
            r2 = 0
        L_0x0149:
            if (r2 != 0) goto L_0x014d
            goto L_0x01ea
        L_0x014d:
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getCurUser()
            int r3 = r2.getDouPlusShareLocation()
            if (r3 != r9) goto L_0x018a
            com.ss.android.ugc.aweme.share.ag$a r2 = r0.g
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f64622e
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r4 = r0.f64623f
            com.ss.android.ugc.aweme.share.seconditem.j r2 = r2.a(r3, r4, r9)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f64622e
            java.lang.String r0 = com.ss.android.ugc.aweme.share.ag.a(r0)
            boolean r0 = com.ss.android.ugc.aweme.share.cg.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0178
            if (r2 == 0) goto L_0x01f9
            r1.add(r10, r2)
            goto L_0x01f9
        L_0x0178:
            if (r2 == 0) goto L_0x01f9
            int r0 = r1.size()
            if (r0 != 0) goto L_0x0185
            r1.add(r2)
            goto L_0x01f9
        L_0x0185:
            r1.add(r9, r2)
            goto L_0x01f9
        L_0x018a:
            int r2 = r2.getDouPlusShareLocation()
            if (r2 != 0) goto L_0x01f9
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f64622e
            java.lang.String r2 = com.ss.android.ugc.aweme.share.ag.a(r2)
            boolean r2 = com.ss.android.ugc.aweme.share.cg.a((java.lang.String) r2)
            if (r2 == 0) goto L_0x01da
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r2 = r2.aS()
            if (r2 != r9) goto L_0x01c0
            com.ss.android.ugc.aweme.share.ag$a r2 = r0.g
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f64622e
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r0.f64623f
            com.ss.android.ugc.aweme.share.seconditem.j r0 = r2.a(r3, r0, r9)
            if (r0 == 0) goto L_0x01f9
            int r2 = r1.size()
            if (r2 != 0) goto L_0x01bc
            r1.add(r0)
            goto L_0x01f9
        L_0x01bc:
            r1.add(r9, r0)
            goto L_0x01f9
        L_0x01c0:
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r2 = r2.aS()
            if (r2 != 0) goto L_0x01f9
            com.ss.android.ugc.aweme.share.ag$a r2 = r0.g
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f64622e
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r0.f64623f
            com.ss.android.ugc.aweme.share.seconditem.j r0 = r2.a(r3, r0, r10)
            if (r0 == 0) goto L_0x01f9
            r1.add(r0)
            goto L_0x01f9
        L_0x01da:
            com.ss.android.ugc.aweme.share.ag$a r2 = r0.g
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f64622e
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r0.f64623f
            com.ss.android.ugc.aweme.share.seconditem.j r0 = r2.a(r3, r0, r10)
            if (r0 == 0) goto L_0x01f9
            r1.add(r0)
            goto L_0x01f9
        L_0x01ea:
            com.ss.android.ugc.aweme.share.ag$a r2 = r0.g
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f64622e
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r0.f64623f
            com.ss.android.ugc.aweme.share.seconditem.j r0 = r2.a(r3, r0, r10)
            if (r0 == 0) goto L_0x01f9
            r1.add(r0)
        L_0x01f9:
            r7.D = r1
            java.util.List<android.view.View> r0 = r7.D
            java.util.Iterator r0 = r0.iterator()
        L_0x0201:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0211
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            r8.addBottomShareItem(r1)
            goto L_0x0201
        L_0x0211:
            java.util.List<android.view.View> r0 = r7.D
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.d.a(com.ss.android.ugc.aweme.framework.services.IShareService$SharePage):void");
    }

    public final void b(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f45158a, false, 40014, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f45158a, false, 40014, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(d(), (Throwable) exc2);
    }

    public final void h(Aweme aweme) {
        String str;
        String str2;
        boolean z2;
        String str3;
        String str4;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45158a, false, 40010, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45158a, false, 40010, new Class[]{Aweme.class}, Void.TYPE);
        } else if (c() != null && aweme2 != null) {
            HashMap hashMap = new HashMap();
            if (aweme.isAd()) {
                hashMap = t.a(aweme2, this.r);
            } else {
                hashMap.put("enter_from", this.r);
                hashMap.put("author_id", aweme.getAuthorUid());
                if (aweme.isAd()) {
                    str4 = "";
                } else {
                    str4 = aweme.getAid();
                }
                hashMap.put("group_id", str4);
            }
            if (aweme.isAd()) {
                str = "tip_off";
            } else {
                str = "report";
            }
            if (aweme.isAd() || !com.ss.android.ugc.aweme.u.aa.d(this.r)) {
                r.a(str, (Map) hashMap);
            } else {
                hashMap.put("log_pb", ai.a().a(com.ss.android.ugc.aweme.u.aa.c(aweme)));
                r.a(str, com.ss.android.ugc.aweme.u.aa.a((Map<String, String>) hashMap));
            }
            if (com.ss.android.ugc.aweme.commercialize.utils.c.u(aweme)) {
                Activity c2 = c();
                if (PatchProxy.isSupport(new Object[]{c2, aweme2}, null, com.ss.android.ugc.aweme.report.a.f63552a, true, 70683, new Class[]{Activity.class, Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{c2, aweme2}, null, com.ss.android.ugc.aweme.report.a.f63552a, true, 70683, new Class[]{Activity.class, Aweme.class}, Void.TYPE);
                    return;
                }
                if (!(aweme2 == null || c2 == null)) {
                    boolean a2 = com.ss.android.g.a.a();
                    if (a2 || com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                        User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                        if (curUser == null || !curUser.isDisciplineMember()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (a2) {
                            str3 = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getReportUrl();
                        } else {
                            str3 = "https://aweme.snssdk.com/falcon/douyin_falcon/report/index.html";
                        }
                        Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
                        t.a(buildUpon, aweme2, "creative", com.ss.android.ugc.aweme.report.a.a(aweme)).appendQueryParameter("object_id", aweme.getAid()).appendQueryParameter("is_douplus", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        if (a2) {
                            buildUpon.appendQueryParameter("locale", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
                        }
                        if (((Boolean) SharePrefCache.inst().getIsFirstReportVideo().c()).booleanValue() && !z2) {
                            buildUpon.appendQueryParameter("isFirst", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        }
                        Intent intent = new Intent(c2, CrossPlatformActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("show_load_dialog", false);
                        bundle.putBoolean("hide_nav_bar", true);
                        bundle.putString("status_bar_color", c2.getResources().getString(C0906R.color.yx).replace("#", ""));
                        intent.putExtras(bundle);
                        intent.setData(buildUpon.build());
                        c2.startActivity(intent);
                    } else {
                        com.ss.android.ugc.aweme.login.e.a(c2, "report", "");
                    }
                }
            } else if (!aweme.isAd() || aweme.getAwemeRawAd() == null || !aweme.getAwemeRawAd().isReportEnable()) {
                Activity c3 = c();
                String aid = aweme.getAid();
                if (aweme.getAuthor() == null) {
                    str2 = "";
                } else {
                    str2 = aweme.getAuthor().getUid();
                }
                if (PatchProxy.isSupport(new Object[]{c3, aweme2, aid, str2}, null, com.ss.android.ugc.aweme.report.a.f63552a, true, 70684, new Class[]{Activity.class, Aweme.class, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{c3, aweme2, aid, str2}, null, com.ss.android.ugc.aweme.report.a.f63552a, true, 70684, new Class[]{Activity.class, Aweme.class, String.class, String.class}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.report.a.a(c3, com.ss.android.ugc.aweme.report.a.a(aweme), aid, str2);
            } else {
                com.ss.android.ugc.aweme.report.a.a(c(), t.a(aweme2, "creative", "ad"));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Aweme aweme, View view) {
        if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (TimeLockRuler.isTeenModeON()) {
                com.bytedance.ies.dmt.ui.d.a.c(d(), d().getString(C0906R.string.chy)).a();
                return;
            }
            if (this.l != null) {
                this.l.dismiss();
            }
            new com.ss.android.ugc.aweme.shortvideo.i.a().a(c(), aweme, this.r);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(Aweme aweme, View view) {
        if (!com.ss.android.ugc.aweme.c.a.a.a(view) && f(aweme)) {
            new a.C0185a(d()).a((int) C0906R.string.bzw).a((int) C0906R.string.bzu, (DialogInterface.OnClickListener) new n(this, aweme)).b((int) C0906R.string.pm, o.f45628b).a().a();
        }
    }

    public static j a(j jVar, Aweme aweme) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2, aweme}, null, f45158a, true, 39981, new Class[]{j.class, Aweme.class}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{jVar2, aweme}, null, f45158a, true, 39981, new Class[]{j.class, Aweme.class}, j.class);
        }
        if (aweme == null || !aweme.getAwemeControl().canShare() || TimeLockRuler.isTeenModeON()) {
            jVar2.setIconAlpha(0.34f);
            jVar2.setTextColor(C0906R.color.i2);
            jVar2.setTextAlpha(0.34f);
        }
        return jVar2;
    }

    private JSONObject a(JSONObject jSONObject, Aweme aweme) {
        JSONObject jSONObject2;
        if (PatchProxy.isSupport(new Object[]{jSONObject, aweme}, this, f45158a, false, 40008, new Class[]{JSONObject.class, Aweme.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject, aweme}, this, f45158a, false, 40008, new Class[]{JSONObject.class, Aweme.class}, JSONObject.class);
        } else if (this.u != null) {
            if (jSONObject == null) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = jSONObject;
            }
            try {
                jSONObject2.put("enter_from", this.r);
                if ("like_banner".equals(this.u)) {
                    jSONObject2.put("previous_page", this.u);
                } else {
                    jSONObject2.put("enter_method", this.u);
                }
                if (a(aweme)) {
                    jSONObject2.put("is_photo", 1);
                } else {
                    jSONObject2.put("is_photo", 0);
                }
                jSONObject2.put("author_id", aweme.getAuthorUid());
                if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.u.aa.e(aweme))) {
                    jSONObject2.put("poi_id", com.ss.android.ugc.aweme.u.aa.e(aweme));
                }
                if (com.ss.android.ugc.aweme.u.aa.c(this.r)) {
                    jSONObject2.put("poi_type", com.ss.android.ugc.aweme.u.aa.h(aweme));
                    jSONObject2.put("city_info", com.ss.android.ugc.aweme.u.aa.a());
                    jSONObject2.put("distance_info", com.ss.android.ugc.aweme.u.aa.i(aweme));
                }
            } catch (JSONException unused) {
            }
            return jSONObject2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Aweme aweme, View view) {
        if (com.ss.android.ugc.aweme.c.a.a.a(view) || !f(aweme)) {
            return;
        }
        if (TimeLockRuler.isTeenModeON()) {
            com.bytedance.ies.dmt.ui.d.a.c(d(), d().getString(C0906R.string.chy)).a();
            return;
        }
        if (this.l != null) {
            this.l.dismiss();
        }
        new com.ss.android.ugc.aweme.shortvideo.util.n().a(aweme, c(), this.r);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(Aweme aweme, View view) {
        if (!com.ss.android.ugc.aweme.c.a.a.a(view) && f(aweme)) {
            String string = d().getResources().getString(C0906R.string.ng);
            String string2 = d().getResources().getString(C0906R.string.ni);
            m mVar = new m(this, aweme);
            if (PatchProxy.isSupport(new Object[]{string, string2, string, (byte) 1, mVar}, this, f45158a, false, 39971, new Class[]{String.class, String.class, String.class, Boolean.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{string, string2, string, (byte) 1, mVar}, this, f45158a, false, 39971, new Class[]{String.class, String.class, String.class, Boolean.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE);
                return;
            }
            if (c() != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(c());
                builder.setTitle((CharSequence) string).setMessage((CharSequence) string2).setPositiveButton((CharSequence) string, (DialogInterface.OnClickListener) mVar);
                builder.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f45184a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45184a, false, 40057, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45184a, false, 40057, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        dialogInterface.dismiss();
                    }
                });
                builder.create().show();
            }
        }
    }

    private void a(IShareService.SharePage sharePage, Aweme aweme) {
        com.ss.android.ugc.aweme.share.seconditem.b bVar;
        IShareService.SharePage sharePage2 = sharePage;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{sharePage2, aweme2}, this, f45158a, false, 39970, new Class[]{IShareService.SharePage.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sharePage2, aweme2}, this, f45158a, false, 39970, new Class[]{IShareService.SharePage.class, Aweme.class}, Void.TYPE);
        } else if (aweme2 != null && d() != null) {
            Context d2 = d();
            String str = this.r;
            if (PatchProxy.isSupport(new Object[]{d2, aweme2, sharePage2, str}, null, com.ss.android.ugc.aweme.share.seconditem.b.g, true, 73692, new Class[]{Context.class, Aweme.class, IShareService.SharePage.class, String.class}, com.ss.android.ugc.aweme.share.seconditem.b.class)) {
                bVar = (com.ss.android.ugc.aweme.share.seconditem.b) PatchProxy.accessDispatch(new Object[]{d2, aweme2, sharePage2, str}, null, com.ss.android.ugc.aweme.share.seconditem.b.g, true, 73692, new Class[]{Context.class, Aweme.class, IShareService.SharePage.class, String.class}, com.ss.android.ugc.aweme.share.seconditem.b.class);
            } else {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int a2 = com.ss.android.ugc.aweme.base.utils.u.a(10.0d);
                layoutParams.leftMargin = a2;
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(a2);
                }
                com.ss.android.ugc.aweme.share.seconditem.b bVar2 = new com.ss.android.ugc.aweme.share.seconditem.b(d2);
                bVar2.setLayoutParams(layoutParams);
                bVar2.setData(aweme2);
                bVar2.setDialog(sharePage2);
                bVar2.setEnterFrom(str);
                bVar = bVar2;
            }
            this.i = bVar;
            this.i.setTag(com.ss.android.ugc.aweme.setting.h.ci8, "favorite");
            this.D.add(this.i);
        }
    }

    public final void a(String str, String str2, String str3) {
        this.C = str3;
        this.A = str;
        this.B = str2;
    }

    private d(String str, int i2, aa<ar> aaVar) {
        super(str, i2);
        this.D = new ArrayList();
        this.E = new com.ss.android.ugc.aweme.setting.s();
        this.F = null;
        this.n = false;
        this.f45159b = aaVar;
        com.ss.android.ugc.aweme.setting.u.a();
    }

    private void d(Aweme aweme, p pVar, IShareService.ShareStruct shareStruct) {
        final Aweme aweme2 = aweme;
        final p pVar2 = pVar;
        final IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{aweme2, pVar2, shareStruct2}, this, f45158a, false, 39986, new Class[]{Aweme.class, p.class, IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, pVar2, shareStruct2}, this, f45158a, false, 39986, new Class[]{Aweme.class, p.class, IShareService.ShareStruct.class}, Void.TYPE);
            return;
        }
        if (cg.a(b(aweme))) {
            this.D.add(j.a(d(), (int) C0906R.string.a4f, 2130839603, (View.OnClickListener) new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45208a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f45208a, false, 40043, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f45208a, false, 40043, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!com.ss.android.ugc.aweme.c.a.a.a(view) && d.this.f(aweme2)) {
                        if (!pVar2.checkStatus("report")) {
                            d.this.l.dismiss();
                        }
                        if (!TextUtils.isEmpty("report")) {
                            pVar2.onAction(shareStruct2, "report");
                        }
                        d.this.l.dismiss();
                    }
                }
            }));
        }
    }

    private void b(Aweme aweme, p pVar, IShareService.ShareStruct shareStruct) {
        final Aweme aweme2 = aweme;
        final p pVar2 = pVar;
        final IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{aweme2, pVar2, shareStruct2}, this, f45158a, false, 39983, new Class[]{Aweme.class, p.class, IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, pVar2, shareStruct2}, this, f45158a, false, 39983, new Class[]{Aweme.class, p.class, IShareService.ShareStruct.class}, Void.TYPE);
        } else if (this.p != null) {
            View a2 = com.ss.android.ugc.aweme.share.seconditem.f.a(this.p, aweme2, new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45199a;

                public final void onClick(View view) {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f45199a, false, 40041, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f45199a, false, 40041, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!com.ss.android.ugc.aweme.c.a.a.a(view) && !d.c(aweme2)) {
                        if ((aweme2.getDistributeType() == 2 || aweme2.getDistributeType() == 3 || aweme2.getDistributeType() == 1) && aweme2.getVideoControl() != null) {
                            if (aweme2.getVideoControl().preventDownloadType == 3) {
                                com.bytedance.ies.dmt.ui.d.a.c(d.this.d(), d.this.d().getResources().getString(C0906R.string.hv)).a();
                                return;
                            } else if (aweme2.getVideoControl().preventDownloadType == 2) {
                                pVar2.a((IShareService.ShareStruct) null);
                                return;
                            } else if (aweme2.getVideoControl().preventDownloadType == 4) {
                                com.bytedance.ies.dmt.ui.d.a.c(d.this.d(), d.this.d().getResources().getString(C0906R.string.pi)).a();
                                return;
                            }
                        }
                        if (aweme2.isPreventDownload()) {
                            com.bytedance.ies.dmt.ui.d.a.c(d.this.d(), d.this.d().getResources().getString(C0906R.string.pi)).a();
                        } else if (!com.ss.android.ugc.aweme.feed.share.a.c.c(aweme2)) {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) d.this.p, d.this.p.getString(C0906R.string.ah8)).a();
                        } else {
                            if (com.ss.android.ugc.aweme.u.aa.d(d.this.r)) {
                                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                                com.ss.android.ugc.aweme.app.d.d a3 = a2.a("group_id", aweme2.getAid()).a("author_id", aweme2.getAuthorUid()).a("enter_from", d.this.r);
                                if (d.this.e(aweme2)) {
                                    str3 = "self";
                                } else {
                                    str3 = "other";
                                }
                                com.ss.android.ugc.aweme.app.d.d a4 = a3.a("download_type", str3);
                                if (AwemeAppData.p().ap) {
                                    str4 = "auto";
                                } else {
                                    str4 = "normal";
                                }
                                a4.a("play_mode", str4).a("is_long_item", com.ss.android.ugc.aweme.longvideo.b.a.b(d.this.p) ? 1 : 0).a("impr_type", com.ss.android.ugc.aweme.u.aa.s(aweme2)).a("download_method", "click_download_icon");
                                a2.a("log_pb", ai.a().a(com.ss.android.ugc.aweme.u.aa.c(aweme2)));
                                com.ss.android.ugc.aweme.poi.e.h.b(aweme2, "download", a2);
                            } else {
                                Aweme aweme = aweme2;
                                com.ss.android.ugc.aweme.app.d.d a5 = new com.ss.android.ugc.aweme.app.d.d().a("group_id", aweme2.getAid()).a("author_id", aweme2.getAuthorUid());
                                if (d.this.e(aweme2)) {
                                    str = "self";
                                } else {
                                    str = "other";
                                }
                                com.ss.android.ugc.aweme.app.d.d a6 = a5.a("download_type", str).a("enter_from", d.this.r).a("impr_type", com.ss.android.ugc.aweme.u.aa.s(aweme2));
                                if (AwemeAppData.p().ap) {
                                    str2 = "auto";
                                } else {
                                    str2 = "normal";
                                }
                                com.ss.android.ugc.aweme.poi.e.h.a(aweme, "download", a6.a("play_mode", str2).a("is_long_item", com.ss.android.ugc.aweme.longvideo.b.a.b(d.this.p) ? 1 : 0).a("download_method", "click_download_icon"));
                            }
                            if (d.this.f(aweme2)) {
                                if (!pVar2.checkStatus("download")) {
                                    d.this.l.dismiss();
                                } else if (aweme2.getAwemeType() != 2 || !g.e(aweme2)) {
                                    if (!TextUtils.isEmpty("download")) {
                                        pVar2.onAction(shareStruct2, "download");
                                    }
                                    d.this.l.dismiss();
                                } else {
                                    n nVar = new n(d.this.d());
                                    nVar.a(new FeedSelfseeNoticeModel());
                                    nVar.a(aweme2.getAid());
                                    d.this.l.dismiss();
                                }
                            }
                        }
                    }
                }
            });
            a2.setTag(com.ss.android.ugc.aweme.setting.h.ci8, "save");
            List<View> list = this.D;
            if (!TimeLockRuler.isTeenModeON() || aweme2 == null || !aweme.getAwemeControl().canShare()) {
                a2 = a((j) a2, aweme2);
            }
            list.add(a2);
        }
    }

    private void c(Aweme aweme, p pVar, IShareService.ShareStruct shareStruct) {
        final p pVar2 = pVar;
        final IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{aweme, pVar2, shareStruct2}, this, f45158a, false, 39985, new Class[]{Aweme.class, p.class, IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, pVar2, shareStruct2}, this, f45158a, false, 39985, new Class[]{Aweme.class, p.class, IShareService.ShareStruct.class}, Void.TYPE);
        } else if (!cg.a(b(aweme)) && d() != null) {
            j a2 = j.a(d(), (int) C0906R.string.bzd, 2130839623, (View.OnClickListener) new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45204a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f45204a, false, 40042, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f45204a, false, 40042, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                        if (!pVar2.checkStatus("report")) {
                            d.this.l.dismiss();
                        }
                        if (!TextUtils.isEmpty("report")) {
                            pVar2.onAction(shareStruct2, "report");
                        }
                        d.this.l.dismiss();
                    }
                }
            });
            a2.setTag(com.ss.android.ugc.aweme.setting.h.ci8, "report");
            this.D.add(a2);
        }
    }

    private void a(Aweme aweme, p pVar, IShareService.ShareStruct shareStruct) {
        Aweme aweme2 = aweme;
        p pVar2 = pVar;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{aweme2, pVar2, shareStruct2}, this, f45158a, false, 39978, new Class[]{Aweme.class, p.class, IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, pVar2, shareStruct2}, this, f45158a, false, 39978, new Class[]{Aweme.class, p.class, IShareService.ShareStruct.class}, Void.TYPE);
        } else if (!a(aweme) && !m(aweme)) {
            this.D.add(a(j.a(d(), (int) C0906R.string.c6j, 2130839601, (View.OnClickListener) new s(this, aweme2, pVar2, shareStruct2)), aweme2));
        }
    }

    public d(String str, int i2, aa<ar> aaVar, com.ss.android.ugc.aweme.feed.listener.c cVar) {
        this(str, i2, aaVar);
        this.y = cVar;
    }
}
