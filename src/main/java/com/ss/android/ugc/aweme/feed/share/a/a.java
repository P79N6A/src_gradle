package com.ss.android.ugc.aweme.feed.share.a;

import a.i;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.retrofit2.Call;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.z;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.linkselector.LinkSelector;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.newmedia.ui.webview.SSWebView;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.a.b.c;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.aa;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import com.ss.android.ugc.aweme.feed.share.e;
import com.ss.android.ugc.aweme.feedback.a.a.b;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.longvideo.g;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.share.cf;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.channelshare.ChannelShareDialogLimited;
import com.ss.android.ugc.aweme.share.cl;
import com.ss.android.ugc.aweme.shortvideo.view.a;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.en;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.aweme.video.e.f;
import com.ss.android.ugc.aweme.web.j;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public class a implements d {
    private static final String A = (((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().shortVideoRootDir() + "share/");
    private static final String B = (A + "tmp/");
    private static final String C = (A + "pic/");
    private static final String D = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45798a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f45799b = (A + "out/");
    private String E;
    private String F;
    private String[] G;
    private en H;
    private int I;
    private String J;
    private String K;
    private b L;
    private UrlModel M;
    private int N;
    private long O = 0;
    private long P = 0;
    private long Q;

    /* renamed from: c  reason: collision with root package name */
    public int f45800c = 100;

    /* renamed from: d  reason: collision with root package name */
    public String f45801d;

    /* renamed from: e  reason: collision with root package name */
    public String f45802e;

    /* renamed from: f  reason: collision with root package name */
    public int f45803f;
    protected String g;
    public com.ss.android.ugc.aweme.shortvideo.view.a h;
    public String i;
    protected Activity j;
    public Aweme k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public com.ss.android.ugc.aweme.video.local.a p;
    public Handler q = new Handler(Looper.getMainLooper()) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45804a;

        public final void handleMessage(Message message) {
            ValueAnimator valueAnimator;
            ObjectAnimator objectAnimator;
            ObjectAnimator objectAnimator2;
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f45804a, false, 42340, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f45804a, false, 42340, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            if (1 == message2.what && a.this.h != null && a.this.h.isShowing()) {
                a.this.h.f71280d = new a.C0742a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f45806a;

                    public final void a() {
                        String str;
                        if (PatchProxy.isSupport(new Object[0], this, f45806a, false, 42341, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f45806a, false, 42341, new Class[0], Void.TYPE);
                            return;
                        }
                        a.this.l = true;
                        a.this.m = true;
                        if (a.this.n) {
                            if (com.ss.android.ugc.a.b.a().f31517b != null) {
                                String str2 = a.this.t;
                                if (PatchProxy.isSupport(new Object[]{str2}, null, com.ss.android.ugc.aweme.net.a.a.f56817c, true, 60847, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str2}, null, com.ss.android.ugc.aweme.net.a.a.f56817c, true, 60847, new Class[]{String.class}, Void.TYPE);
                                } else if (com.ss.android.ugc.aweme.net.a.a.f56818d.containsKey(str2)) {
                                    Call call = com.ss.android.ugc.aweme.net.a.a.f56818d.get(str2);
                                    if (call != null) {
                                        com.ss.android.ugc.aweme.net.a.a.f56818d.remove(str2);
                                        call.cancel();
                                    }
                                }
                            } else {
                                String str3 = a.this.t;
                                a aVar = a.this;
                                if (PatchProxy.isSupport(new Object[]{str3, aVar}, null, com.ss.android.ugc.aweme.video.local.b.f76143a, true, 89122, new Class[]{String.class, c.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str3, aVar}, null, com.ss.android.ugc.aweme.video.local.b.f76143a, true, 89122, new Class[]{String.class, c.class}, Void.TYPE);
                                } else {
                                    com.ss.android.ugc.aweme.app.application.initialization.a.a(str3, (c) aVar);
                                }
                            }
                        } else if (a.this.o) {
                            ((IAVService) ServiceManager.get().getService(IAVService.class)).waIWaterMarkService().cancelWaterMark();
                        }
                        a.this.c();
                        com.ss.android.ugc.aweme.app.d.d a2 = new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "share_event");
                        if (a.this.k == null) {
                            str = "";
                        } else {
                            str = a.this.k.getAid();
                        }
                        r.a("download_cancel", (Map) a2.a("group_id", str).f34114b);
                    }
                };
                com.ss.android.ugc.aweme.shortvideo.view.a aVar = a.this.h;
                int dip2Px = (int) UIUtils.dip2Px(a.this.j, 180.0f);
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(dip2Px)}, aVar, com.ss.android.ugc.aweme.shortvideo.view.a.f71277a, false, 81205, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(dip2Px)}, aVar, com.ss.android.ugc.aweme.shortvideo.view.a.f71277a, false, 81205, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (aVar.f71279c) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    aVar.g = aVar.findViewById(C0906R.id.chu);
                    ObjectAnimator objectAnimator3 = null;
                    if (aVar.g != null) {
                        valueAnimator = ValueAnimator.ofInt(new int[]{aVar.g.getWidth(), dip2Px});
                        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f71286a;

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f71286a, false, 81208, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f71286a, false, 81208, new Class[]{ValueAnimator.class}, Void.TYPE);
                                    return;
                                }
                                a.this.g.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                a.this.g.requestLayout();
                            }
                        });
                        valueAnimator.setInterpolator(new LinearInterpolator());
                        valueAnimator.setDuration(200);
                        valueAnimator.setTarget(aVar.g);
                    } else {
                        valueAnimator = null;
                    }
                    aVar.f71282f = (ImageView) aVar.findViewById(C0906R.id.q4);
                    if (aVar.f71282f != null) {
                        objectAnimator = ObjectAnimator.ofFloat(aVar.f71282f, "alpha", new float[]{0.0f, 1.0f});
                        objectAnimator.setDuration(200);
                    } else {
                        objectAnimator = null;
                    }
                    aVar.f71281e = (TextView) aVar.findViewById(C0906R.id.bmn);
                    if (aVar.f71281e != null) {
                        objectAnimator3 = ObjectAnimator.ofFloat(aVar.f71281e, "alpha", new float[]{1.0f, 0.0f});
                        objectAnimator3.setDuration(100);
                        objectAnimator3.addListener(new Animator.AnimatorListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f71288a;

                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f71288a, false, 81209, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f71288a, false, 81209, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                a.this.f71281e.setText(C0906R.string.a7y);
                            }
                        });
                        objectAnimator2 = ObjectAnimator.ofFloat(aVar.f71281e, "alpha", new float[]{0.0f, 1.0f});
                        objectAnimator2.setDuration(100);
                    } else {
                        objectAnimator2 = null;
                    }
                    animatorSet.play(valueAnimator).with(objectAnimator);
                    animatorSet.play(objectAnimator).before(objectAnimator3);
                    animatorSet.play(objectAnimator3).before(objectAnimator2);
                    animatorSet.start();
                }
                a.this.h.a(true, 0.0f, a.this.j);
            }
        }
    };
    public com.ss.android.ugc.aweme.feed.share.a.a.a r;
    public int s;
    public String t;
    public String u;
    boolean v = false;
    boolean w = false;
    boolean x = false;
    public IShareService.ShareStruct y;
    public Runnable z = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45808a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f45808a, false, 42355, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45808a, false, 42355, new Class[0], Void.TYPE);
                return;
            }
            try {
                if (a.this.h != null) {
                    com.ss.android.ugc.aweme.shortvideo.view.a aVar = a.this.h;
                    int i = 100;
                    if (a.this.f45803f < 100) {
                        i = a.this.f45803f;
                    }
                    aVar.a(i);
                }
            } catch (Exception unused) {
            }
        }
    };

    public void onCancel() {
    }

    public void onDownloadPause() {
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f45798a, false, 42309, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f45798a, false, 42309, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            if (PatchProxy.isSupport(new Object[]{str2}, this, f45798a, false, 42310, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f45798a, false, 42310, new Class[]{String.class}, Void.TYPE);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str2);
                com.bytedance.ies.dmt.ui.d.a.a((Context) this.j, PatchProxy.isSupport(new Object[0], null, f.f76060a, true, 89335, new Class[0], Integer.TYPE) ? ((Integer) PatchProxy.accessDispatch(new Object[0], null, f.f76060a, true, 89335, new Class[0], Integer.TYPE)).intValue() : C0906R.string.drl, 1).a();
                Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                intent.setData(Uri.fromFile(file));
                k.a().sendBroadcast(intent);
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45798a, false, 42318, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45798a, false, 42318, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            try {
                this.h.dismiss();
            } catch (Exception unused) {
            }
            this.h = null;
        }
    }

    public final void e() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f45798a, false, 42327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45798a, false, 42327, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.video.b.c(this.f45801d);
        if (this.G == null) {
            i2 = 0;
        } else {
            i2 = this.G.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            com.ss.android.ugc.aweme.video.b.c(this.G[i3]);
        }
    }

    private boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f45798a, false, 42317, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45798a, false, 42317, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.video.b.h()) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.j, (int) C0906R.string.c1x).a();
            return false;
        } else if (com.ss.android.ugc.aweme.video.b.i() >= 20971520) {
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.j, (int) C0906R.string.c1y).a();
            return false;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f45798a, false, 42325, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45798a, false, 42325, new Class[0], Void.TYPE);
            return;
        }
        this.n = false;
        this.o = false;
        if (this.q.hasMessages(1)) {
            this.q.removeMessages(1);
        }
        if (this.l) {
            com.ss.android.ugc.aweme.video.b.c(this.f45802e);
        }
        com.ss.android.b.a.a.a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45812a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f45812a, false, 42359, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45812a, false, 42359, new Class[0], Void.TYPE);
                    return;
                }
                a.this.e();
                if (a.this.j != null) {
                    a.this.b();
                    if (a.this.m) {
                        a.this.m = false;
                        com.bytedance.ies.dmt.ui.d.a.b((Context) a.this.j, (int) C0906R.string.c1j).a();
                        return;
                    }
                    com.bytedance.ies.dmt.ui.d.a.b((Context) a.this.j, (int) C0906R.string.a7i).a();
                }
            }
        });
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f45798a, false, 42326, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45798a, false, 42326, new Class[0], Void.TYPE);
            return;
        }
        this.n = false;
        this.o = false;
        if (this.q.hasMessages(1)) {
            this.q.removeMessages(1);
        }
        if (this.l) {
            com.ss.android.ugc.aweme.video.b.c(this.f45802e);
            this.l = false;
            return;
        }
        e();
        com.ss.android.b.a.a.a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45814a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f45814a, false, 42360, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45814a, false, 42360, new Class[0], Void.TYPE);
                    return;
                }
                a.this.b();
                if (a.this.j != null) {
                    a.this.a(a.this.f45802e);
                }
            }
        });
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f45798a, false, 42316, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45798a, false, 42316, new Class[0], Void.TYPE);
            return;
        }
        if (this.p == null) {
            this.p = new com.ss.android.ugc.aweme.video.local.a();
        }
        this.p.a(this);
        com.ss.android.ugc.aweme.video.local.a aVar = this.p;
        Activity activity = this.j;
        String aid = this.k.getAid();
        String str = this.K;
        String str2 = this.t;
        String str3 = B;
        aVar.a(activity, aid, str, str2, str3, this.i + ".mp4");
        if (this.h != null && this.h.isShowing()) {
            this.h.f71280d = new a.C0742a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45842a;

                public final void a() {
                    String str;
                    if (PatchProxy.isSupport(new Object[0], this, f45842a, false, 42354, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45842a, false, 42354, new Class[0], Void.TYPE);
                    } else if (a.this.p != null) {
                        com.ss.android.ugc.aweme.video.local.a aVar = a.this.p;
                        Activity activity = a.this.j;
                        if (PatchProxy.isSupport(new Object[]{activity}, aVar, com.ss.android.ugc.aweme.video.local.a.f76129a, false, 89108, new Class[]{Context.class}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.video.local.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{activity}, aVar2, com.ss.android.ugc.aweme.video.local.a.f76129a, false, 89108, new Class[]{Context.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(activity, "context");
                            Downloader.getInstance(activity).pause(aVar.f76132b);
                        }
                        a.this.b();
                        com.ss.android.ugc.aweme.app.d.d a2 = new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "share_event").a("is_long_item", com.ss.android.ugc.aweme.longvideo.b.a.b(a.this.j) ? 1 : 0);
                        if (a.this.k == null) {
                            str = "";
                        } else {
                            str = a.this.k.getAid();
                        }
                        r.a("download_cancel", (Map) a2.a("group_id", str).f34114b);
                    }
                }
            };
            this.h.a(true, 1.0f, this.j);
        }
    }

    private boolean b(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f45798a, false, 42313, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f45798a, false, 42313, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (aweme2 != null && aweme.getDistributeType() == 3) {
            if (com.ss.android.ugc.aweme.longvideo.b.a.b(this.j)) {
                LongVideo a2 = g.f53947b.a(aweme2);
                if (a2 == null || a2.getVideoControl() == null || aweme.getVideoControl().preventDownloadType != 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static boolean c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45798a, true, 42337, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45798a, true, 42337, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (!AbTestManager.a().A() || aweme == null) {
            return false;
        } else {
            UrlModel uIAlikeDownloadAddr = aweme.getVideo().getUIAlikeDownloadAddr();
            if (uIAlikeDownloadAddr == null || uIAlikeDownloadAddr.getUrlList() == null || uIAlikeDownloadAddr.getUrlList().isEmpty()) {
                return false;
            }
            return true;
        }
    }

    private static boolean d(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45798a, true, 42338, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45798a, true, 42338, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (!AbTestManager.a().B() || aweme == null) {
            return false;
        } else {
            UrlModel captionDownloadAddr = aweme.getVideo().getCaptionDownloadAddr();
            if (captionDownloadAddr == null || captionDownloadAddr.getUrlList() == null || captionDownloadAddr.getUrlList().isEmpty()) {
                return false;
            }
            return true;
        }
    }

    public void onDownloadStart(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f45798a, false, 42329, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f45798a, false, 42329, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.Q = System.currentTimeMillis();
        this.n = true;
        this.o = false;
        b.a.a().a("download_start");
    }

    public final void b(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f45798a, false, 42334, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f45798a, false, 42334, new Class[]{String.class}, Void.TYPE);
        } else if (AbTestManager.a().aP() == 1) {
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45822a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f45822a, false, 42344, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45822a, false, 42344, new Class[0], Void.TYPE);
                        return;
                    }
                    e a2 = com.ss.android.ugc.aweme.feed.share.f.a().a(str);
                    cl a3 = cg.a(str, cg.a());
                    if (a3 != null) {
                        com.bytedance.ies.dmt.ui.d.a.c((Context) a.this.j, a3.i, 0).a();
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.a((Context) a.this.j, a.this.j.getString(C0906R.string.ajy, new Object[]{a2.b()}), 0).a();
                    }
                    cg.a(a2, (Context) a.this.j);
                }
            });
        } else {
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45825a;

                public final void run() {
                    Integer num;
                    if (PatchProxy.isSupport(new Object[0], this, f45825a, false, 42345, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45825a, false, 42345, new Class[0], Void.TYPE);
                    } else if (a.this.j != null && !a.this.j.isFinishing()) {
                        cl a2 = cg.a(str, cg.a());
                        if (a2 != null) {
                            AbTestManager a3 = AbTestManager.a();
                            if (PatchProxy.isSupport(new Object[0], a3, AbTestManager.f63777a, false, 71918, new Class[0], Integer.class)) {
                                num = (Integer) PatchProxy.accessDispatch(new Object[0], a3, AbTestManager.f63777a, false, 71918, new Class[0], Integer.class);
                            } else {
                                AbTestModel d2 = a3.d();
                                if (d2 != null) {
                                    int i = d2.shareLimitDialogStyle;
                                    if (i < 0 || i > 1) {
                                        i = 0;
                                    }
                                    num = Integer.valueOf(i);
                                } else {
                                    num = 0;
                                }
                            }
                            if (num.intValue() == 1 && !TextUtils.isEmpty(a2.l)) {
                                ChannelShareDialogLimited channelShareDialogLimited = new ChannelShareDialogLimited(a.this.j, str, a2);
                                View inflate = View.inflate(a.this.j, C0906R.layout.h9, null);
                                SSWebView sSWebView = (SSWebView) inflate.findViewById(C0906R.id.dx2);
                                sSWebView.setVerticalScrollBarEnabled(false);
                                Activity activity = a.this.j;
                                String str = a2.l;
                                if (PatchProxy.isSupport(new Object[]{sSWebView, activity, null, str}, null, com.ss.android.ugc.aweme.views.g.f76462a, true, 89478, new Class[]{SSWebView.class, Context.class, String.class, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{sSWebView, activity, null, str}, null, com.ss.android.ugc.aweme.views.g.f76462a, true, 89478, new Class[]{SSWebView.class, Context.class, String.class, String.class}, Void.TYPE);
                                } else {
                                    WebSettings settings = sSWebView.getSettings();
                                    sSWebView.getSettings().setTextZoom(100);
                                    sSWebView.getSettings().setJavaScriptEnabled(true);
                                    settings.setLoadsImagesAutomatically(true);
                                    settings.setDefaultTextEncodingName("utf-8");
                                    sSWebView.setBackgroundColor(0);
                                    sSWebView.setWebViewClient(new j() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f76464a;

                                        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                                            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f76464a, false, 89482, new Class[]{WebView.class, String.class}, Boolean.TYPE)) {
                                                return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str}, this, f76464a, false, 89482, new Class[]{WebView.class, String.class}, Boolean.TYPE)).booleanValue();
                                            }
                                            Intent webUriIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getWebUriIntent(webView.getContext(), Uri.parse(str));
                                            if (webUriIntent != null) {
                                                webView.getContext().startActivity(webUriIntent);
                                            }
                                            return true;
                                        }
                                    });
                                    if (!TextUtils.isEmpty(str)) {
                                        sSWebView.loadData(str, "text/html;charset=UTF-8", null);
                                    }
                                }
                                channelShareDialogLimited.f64949e = inflate;
                                channelShareDialogLimited.f64950f = new ChannelShareDialogLimited.a() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f45828a;

                                    public final void a() {
                                        if (PatchProxy.isSupport(new Object[0], this, f45828a, false, 42346, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f45828a, false, 42346, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        a.this.c(str);
                                    }

                                    public final void b() {
                                        if (PatchProxy.isSupport(new Object[0], this, f45828a, false, 42347, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f45828a, false, 42347, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putSerializable("share_struct", a.this.y);
                                        com.ss.android.ugc.aweme.im.b.a().wrapperShareToX(a.this.j, bundle, 9);
                                    }
                                };
                                channelShareDialogLimited.show();
                            } else if (!TextUtils.isEmpty(a2.k)) {
                                try {
                                    Dialog b2 = new a.C0185a(a.this.j).a(a2.m, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f45830a;

                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45830a, false, 42348, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45830a, false, 42348, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                                return;
                                            }
                                            a.this.c(str);
                                        }
                                    }).a(true).a(com.ss.android.ugc.aweme.views.g.a(a.this.j, null, a2.k)).b((View) com.ss.android.ugc.aweme.views.g.a(a2.j, a.this.j)).a().b();
                                    b2.setCanceledOnTouchOutside(false);
                                    b2.setOwnerActivity(a.this.j);
                                } catch (WindowManager.BadTokenException unused) {
                                }
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(a.this.j);
                                builder.setMessage((CharSequence) a2.f64991f);
                                builder.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f45834a;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45834a, false, 42350, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45834a, false, 42350, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        dialogInterface.dismiss();
                                    }
                                }).setPositiveButton((int) C0906R.string.ak1, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f45832a;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45832a, false, 42349, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f45832a, false, 42349, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        a.this.c(str);
                                        dialogInterface.dismiss();
                                    }
                                });
                                builder.show();
                            }
                            r.a("download_share_alert_show", (Map) null);
                        }
                    }
                }
            });
        }
    }

    private boolean a(Aweme aweme) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45798a, false, 42311, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f45798a, false, 42311, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f45798a, false, 42312, new Class[]{Aweme.class}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f45798a, false, 42312, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getDistributeType() != 2 || aweme.getVideoControl() == null || aweme.getVideoControl().preventDownloadType != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && !b(aweme)) {
            return false;
        }
        return true;
    }

    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f45798a, false, 42335, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f45798a, false, 42335, new Class[]{String.class}, Void.TYPE);
            return;
        }
        cg.a(com.ss.android.ugc.aweme.feed.share.f.a().a(str2), (Context) this.j);
        r.a("download_share_alert_download", (Map) null);
    }

    public void onError(com.ss.android.ugc.a.c cVar) {
        boolean z2;
        com.ss.android.ugc.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f45798a, false, 42336, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f45798a, false, 42336, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE);
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.Q);
        String str = this.t;
        if (this.x || this.v || this.w) {
            z2 = false;
        } else {
            z2 = true;
        }
        cf.a(null, valueOf, str, z2, Integer.valueOf(cVar2.f31519a), cVar2.f31520b);
        this.n = false;
        if (this.j != null) {
            if (this.l) {
                com.ss.android.ugc.aweme.video.b.c(this.f45802e);
                this.l = false;
                return;
            }
            b.a.a().a("download_error", String.valueOf(cVar2.f31519a));
            Aweme aweme = this.k;
            String str2 = this.t;
            if (PatchProxy.isSupport(new Object[]{aweme, cVar2, str2}, null, aa.f33673a, true, 22508, new Class[]{Aweme.class, com.ss.android.ugc.a.c.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme, cVar2, str2}, null, aa.f33673a, true, 22508, new Class[]{Aweme.class, com.ss.android.ugc.a.c.class, String.class}, Void.TYPE);
            } else {
                StringBuilder sb = new StringBuilder("IESDownloadError:");
                if (cVar2 != null) {
                    sb.append("error_code:");
                    sb.append(cVar2.f31519a);
                    sb.append(",");
                    sb.append("error_message:");
                    sb.append(cVar2.f31520b);
                }
                if (aweme != null) {
                    sb.append(",");
                    sb.append("aweme_id:");
                    sb.append(aweme.getAid());
                }
                aa.a(sb.toString(), str2);
            }
            if (this.I < 3) {
                this.I++;
                if (this.M != null && !CollectionUtils.isEmpty(this.M.getUrlList())) {
                    this.t = LinkSelector.a().a(this.M.getUrlList().get(this.I % this.M.getUrlList().size()));
                }
                this.t = com.ss.android.ugc.aweme.video.e.b.a(this.t);
                if (!a(this.k)) {
                    com.ss.android.ugc.aweme.app.application.initialization.a.a(new e.a().a(this.t).b(this.J).a(), (d) this);
                } else if (this.p != null) {
                    this.p.a(this.j, this.k.getAid(), this.K, this.t, B, this.i + ".mp4");
                }
            } else {
                bg.a(new com.ss.android.ugc.aweme.feed.f.a(3));
                c();
                if (this.p != null) {
                    com.ss.android.ugc.aweme.video.local.a aVar = this.p;
                    Activity activity = this.j;
                    if (PatchProxy.isSupport(new Object[]{activity}, aVar, com.ss.android.ugc.aweme.video.local.a.f76129a, false, 89109, new Class[]{Context.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity}, aVar, com.ss.android.ugc.aweme.video.local.a.f76129a, false, 89109, new Class[]{Context.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(activity, "context");
                        Downloader.getInstance(activity).cancel(aVar.f76132b);
                    }
                }
                String str3 = cVar2.f31520b + "    ***  重试次数 *** :" + this.I;
                if (NetworkUtils.isNetworkAvailable(k.a())) {
                    com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a().a("errorCode", Integer.valueOf(cVar2.f31519a)).a("errorDes", str3);
                    if (a(this.k)) {
                        a2.a("longVideo", (Integer) 1);
                    } else {
                        a2.a("longVideo", (Integer) 0);
                    }
                    n.a("aweme_download_error_rate", 1, a2.b());
                }
                com.ss.android.ugc.aweme.app.d.a.a("aweme_movie_download_log", "", str3, this.t);
            }
        }
    }

    public void onDownloadSuccess(String str) {
        String str2;
        String str3;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{str4}, this, f45798a, false, 42331, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4}, this, f45798a, false, 42331, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.n = false;
        if (this.l) {
            com.ss.android.ugc.aweme.video.b.c(this.f45802e);
            this.l = false;
            return;
        }
        bg.a(new com.ss.android.ugc.aweme.feed.f.a(3));
        if (str4 != null) {
            File file = new File(str4);
            if (file.exists()) {
                com.ss.android.ugc.traffic.a aVar = com.ss.android.ugc.traffic.a.y;
                com.ss.android.ugc.traffic.a.a(com.ss.android.ugc.traffic.a.f77808b, file.length());
            }
            if (PatchProxy.isSupport(new Object[]{str4}, this, f45798a, false, 42333, new Class[]{String.class}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{str4}, this, f45798a, false, 42333, new Class[]{String.class}, String.class);
            } else {
                AbTestManager a2 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71797, new Class[0], Boolean.TYPE)) {
                    z4 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71797, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    AbTestModel d2 = a2.d();
                    if (d2 == null || d2.shareDownloadModifyMd5 != 1) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                }
                if (z4 && bm.a(str)) {
                    File file2 = new File(str4);
                    StringBuffer stringBuffer = new StringBuffer("temp_uuid_");
                    stringBuffer.append(file2.getName());
                    new File(file2.getParent(), stringBuffer.toString()).getAbsolutePath();
                }
                str2 = str4;
            }
            this.f45801d = str2;
            String str5 = this.f45801d;
            if (str5.length() == 0) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("WaterMarkComposer download file size == 0: " + this.t));
                c();
                return;
            }
            this.H.a();
            this.O = System.currentTimeMillis() - this.Q;
            this.P = file.length() / this.O;
            if (this.x || this.v || this.w) {
                if (this.x || this.v) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.v = z2;
                if (this.x || this.w) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.w = z3;
                a(this.v, this.w);
            } else {
                String trim = str5.trim();
                this.f45802e = new File(f.a(this.j), trim.substring(trim.lastIndexOf("/") + 1)).getPath();
                FFMpegManager a3 = FFMpegManager.a();
                String str6 = this.f45802e;
                if (PatchProxy.isSupport(new Object[]{str5, str6}, a3, FFMpegManager.f29312a, false, 16198, new Class[]{String.class, String.class}, Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{str5, str6}, a3, FFMpegManager.f29312a, false, 16198, new Class[]{String.class, String.class}, Integer.TYPE)).intValue();
                } else {
                    i2 = a3.f29314b.remuxVideo(str5, str6);
                }
                if (i2 != 0) {
                    com.ss.android.ugc.aweme.video.b.c(str5, this.f45802e);
                }
                cf.a(this.f45802e, Long.valueOf(this.O), this.t, false, -1, "success");
                d();
                this.q.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f45816a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f45816a, false, 42342, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f45816a, false, 42342, new Class[0], Void.TYPE);
                            return;
                        }
                        a.this.b();
                    }
                });
                if (cg.a(this.u, 3)) {
                    b(this.u);
                }
            }
            if (com.ss.android.ugc.aweme.g.a.a() && AbTestManager.a().f().showWatermarkDebugInfo && this.k != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("视频信息\n  hasWatermark = " + this.k.getVideo().isHasWaterMark() + " hasSuffixMark = " + this.k.getVideo().hasEndWaterMark() + " awemeId = " + this.k.getAid());
                if (this.v || this.w) {
                    str3 = "客户端合成水印";
                } else {
                    str3 = "服务端处理";
                }
                sb.append(str3);
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.j, sb.toString(), 1).a();
            }
        }
        String aid = this.k.getAid();
        int awemeType = this.k.getAwemeType();
        if (!PatchProxy.isSupport(new Object[]{aid, Integer.valueOf(awemeType)}, this, f45798a, false, 42332, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            switch (this.N) {
                case 0:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType), 0);
                    break;
                case 1:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType), 1);
                    break;
                case 2:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType), 2);
                    break;
                case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE:
                case 2000:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType), 3);
                    break;
                case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST:
                case 2001:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType), 4);
                    break;
                case 3002:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType), 5);
                    break;
                case 3003:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType), 9);
                    break;
                case 4000:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType), 6);
                    break;
                case 4001:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType), 8);
                    break;
                case 5000:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType), 7);
                    break;
                case 8000:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType), 20);
                    break;
                default:
                    this.L.a(aid, 0, 0, 1, Integer.valueOf(awemeType));
                    break;
            }
        } else {
            PatchProxy.accessDispatch(new Object[]{aid, Integer.valueOf(awemeType)}, this, f45798a, false, 42332, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        }
        final long currentTimeMillis = System.currentTimeMillis() - this.Q;
        final String str7 = this.f45802e;
        i.a((Callable<TResult>) new Callable<Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45818a;

            public final /* synthetic */ Object call() throws Exception {
                long j;
                if (PatchProxy.isSupport(new Object[0], this, f45818a, false, 42343, new Class[0], Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[0], this, f45818a, false, 42343, new Class[0], Void.class);
                }
                String a2 = ey.a(str7);
                File file = new File(str7);
                long j2 = 0;
                if (file.exists()) {
                    j = file.length();
                } else {
                    j = 0;
                }
                boolean equals = TextUtils.equals(a2, "20");
                com.ss.android.ugc.aweme.app.d.c cVar = new com.ss.android.ugc.aweme.app.d.c();
                if (currentTimeMillis != 0) {
                    j2 = j / currentTimeMillis;
                }
                n.a("aweme_download_error_rate", 0, cVar.a("Download_Rate", Long.valueOf(j2)).a("Download_duration", Long.valueOf(currentTimeMillis)).a("file_size", Long.valueOf(j)).a("errorDesc", "success").a("errorCode", (Integer) -1).a(PushConstants.WEB_URL, a.this.t).a("isMp4", Boolean.valueOf(equals)).b());
                r.a("download_end", (Map) new com.ss.android.ugc.aweme.app.d.d().a("is_long_item", com.ss.android.ugc.aweme.longvideo.b.a.b(a.this.j) ? 1 : 0).a("end_download", System.currentTimeMillis()).a("download_id", DigestUtils.md5Hex(a.this.i + z.a() + System.currentTimeMillis())).a("package_size", j).a("duration", currentTimeMillis).a("is_buffer", 0).a("impr_type", com.ss.android.ugc.aweme.u.aa.s(a.this.k)).a("is_self_video", c.a(a.this.k) ? 1 : 0).f34114b);
                return null;
            }
        });
    }

    private void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f45798a, false, 42323, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f45798a, false, 42323, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(z2, z3, com.ss.android.ugc.aweme.shortvideo.festival.k.INSTANCE.getWaterPicDir());
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0599  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r27, java.lang.String r28) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45798a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42314(0xa54a, float:5.9295E-41)
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45798a
            r3 = 0
            r4 = 42314(0xa54a, float:5.9295E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            boolean r0 = r26.a((com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            r6 = 3
            r5 = 2131560093(0x7f0d069d, float:1.8745549E38)
            r4 = 2131561430(0x7f0d0bd6, float:1.874826E38)
            if (r0 == 0) goto L_0x02dc
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45798a
            r3 = 0
            r16 = 42315(0xa54b, float:5.9296E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r17 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r11] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r1[r12] = r17
            java.lang.Class r17 = java.lang.Void.TYPE
            r18 = r1
            r1 = r26
            r13 = 2131561430(0x7f0d0bd6, float:1.874826E38)
            r4 = r16
            r14 = 2131560093(0x7f0d069d, float:1.8745549E38)
            r5 = r18
            r15 = 3
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45798a
            r3 = 0
            r4 = 42315(0xa54b, float:5.9296E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00a1:
            r7.k = r8
            r7.u = r9
            if (r8 == 0) goto L_0x02db
            com.ss.android.ugc.aweme.feed.model.Video r0 = r27.getVideo()
            if (r0 == 0) goto L_0x02db
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            if (r0 == 0) goto L_0x02db
            boolean r0 = r26.f()
            if (r0 != 0) goto L_0x00bb
            goto L_0x02db
        L_0x00bb:
            android.app.Activity r0 = r7.j
            boolean r0 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r0)
            if (r0 != 0) goto L_0x00d4
            android.app.Activity r0 = r7.j
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r13, (int) r12)
            r0.a()
            com.ss.android.ugc.aweme.app.aa$a r0 = com.ss.android.ugc.aweme.app.aa.a.NETWORK
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.k
            com.ss.android.ugc.aweme.app.aa.a((com.ss.android.ugc.aweme.app.aa.a) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            return
        L_0x00d4:
            boolean r0 = com.ss.android.ugc.aweme.feed.share.a.c.c(r27)
            if (r0 != 0) goto L_0x00ea
            android.app.Activity r0 = r7.j
            android.app.Activity r1 = r7.j
            java.lang.String r1 = r1.getString(r14)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
            return
        L_0x00ea:
            boolean r0 = com.ss.android.ugc.aweme.feed.share.a.c.b(r27)
            if (r0 != 0) goto L_0x00ff
            com.ss.android.ugc.aweme.app.aa$a r0 = com.ss.android.ugc.aweme.app.aa.a.AUDITING
            com.ss.android.ugc.aweme.app.aa.a((com.ss.android.ugc.aweme.app.aa.a) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r8)
            com.ss.android.ugc.aweme.feed.share.a.a.a r0 = r7.r
            if (r0 == 0) goto L_0x00fe
            com.ss.android.ugc.aweme.feed.share.a.a.a r0 = r7.r
            r0.b()
        L_0x00fe:
            return
        L_0x00ff:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r27.getVideo()
            boolean r1 = r26.b((com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            if (r1 == 0) goto L_0x010f
            com.ss.android.ugc.aweme.longvideo.j r0 = com.ss.android.ugc.aweme.longvideo.j.f53966b
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.a(r8)
        L_0x010f:
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getPlayAddrH264()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getDownloadAddr()
            r7.M = r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            if (r0 != 0) goto L_0x0122
            java.lang.String r0 = ""
            goto L_0x012a
        L_0x0122:
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            java.lang.String r0 = r0.getNickname()
        L_0x012a:
            r7.E = r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            java.lang.String r0 = r0.getUniqueId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0143
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            java.lang.String r0 = r0.getShortId()
            goto L_0x014b
        L_0x0143:
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            java.lang.String r0 = r0.getUniqueId()
        L_0x014b:
            r7.F = r0
            java.lang.String r0 = r7.E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0167
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "@"
            r0.<init>(r2)
            java.lang.String r2 = r7.E
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r7.E = r0
        L_0x0167:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getUri()
            r0.append(r1)
            java.lang.String r1 = r7.F
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.bytedance.common.utility.DigestUtils.md5Hex((java.lang.String) r0)
            r7.i = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.g
            r0.append(r1)
            java.lang.String r1 = r7.i
            r0.append(r1)
            java.lang.String r1 = ".mp4"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.f45802e = r0
            java.lang.String r0 = r7.f45802e
            boolean r0 = com.ss.android.ugc.aweme.video.b.b((java.lang.String) r0)
            if (r0 == 0) goto L_0x01b5
            r26.d()
            java.lang.String r0 = r7.u
            boolean r0 = com.ss.android.ugc.aweme.share.cg.a((java.lang.String) r0, (int) r15)
            if (r0 == 0) goto L_0x01b4
            java.lang.String r0 = r7.u
            r7.b((java.lang.String) r0)
        L_0x01b4:
            return
        L_0x01b5:
            com.ss.android.ugc.aweme.shortvideo.view.a r0 = r7.h
            if (r0 != 0) goto L_0x01d3
            android.app.Activity r0 = r7.j
            android.app.Activity r1 = r7.j
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131559711(0x7f0d051f, float:1.8744774E38)
            java.lang.String r1 = r1.getString(r2)
            com.ss.android.ugc.aweme.shortvideo.view.a r0 = com.ss.android.ugc.aweme.shortvideo.view.a.a(r0, r1)
            r7.h = r0
            com.ss.android.ugc.aweme.shortvideo.view.a r0 = r7.h
            r0.a((boolean) r11)
        L_0x01d3:
            com.ss.android.ugc.aweme.shortvideo.view.a r0 = r7.h
            r0.a((int) r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = B
            r0.append(r1)
            java.lang.String r1 = r7.i
            r0.append(r1)
            java.lang.String r1 = ".mp4"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = com.ss.android.ugc.aweme.video.b.b((java.lang.String) r0)
            if (r1 != 0) goto L_0x01fe
            java.lang.String r1 = B
            com.ss.android.ugc.aweme.video.b.a((java.lang.String) r1, (boolean) r11)
        L_0x01fb:
            r1 = 100
            goto L_0x0205
        L_0x01fe:
            r1 = 60
            r7.f45800c = r1
            r7.f45801d = r0
            goto L_0x01fb
        L_0x0205:
            r7.f45800c = r1
            com.ss.android.ugc.aweme.utils.en r1 = r7.H
            java.lang.String r2 = "download_time"
            java.lang.String r3 = "download"
            r1.a(r2, r3)
            r7.I = r11
            r7.J = r0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.M
            if (r0 == 0) goto L_0x023a
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.M
            java.util.List r0 = r0.getUrlList()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x023a
            com.ss.android.linkselector.LinkSelector r0 = com.ss.android.linkselector.LinkSelector.a()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r7.M
            java.util.List r1 = r1.getUrlList()
            java.lang.Object r1 = r1.get(r11)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r0.a((java.lang.String) r1)
            r7.t = r0
        L_0x023a:
            java.lang.String r0 = r7.t
            r7.K = r0
            java.lang.String r0 = r7.t
            java.lang.String r0 = com.ss.android.ugc.aweme.video.e.b.a(r0)
            r7.t = r0
            r7.s = r11
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r7.M
            r2 = 0
            if (r1 == 0) goto L_0x028f
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r7.M
            long r4 = r1.getSize()
            double r4 = (double) r4
            r8 = 4652218415073722368(0x4090000000000000, double:1024.0)
            java.lang.Double.isNaN(r4)
            double r4 = r4 / r8
            double r4 = r4 / r8
            r1 = 2131562199(0x7f0d0ed7, float:1.874982E38)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0283
            java.lang.String r0 = "%.2fM"
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Double r3 = java.lang.Double.valueOf(r4)
            r2[r11] = r3
            java.lang.String r0 = java.lang.String.format(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.view.a r2 = r7.h
            android.app.Activity r3 = r7.j
            java.lang.Object[] r6 = new java.lang.Object[r12]
            r6[r11] = r0
            java.lang.String r1 = r3.getString(r1, r6)
            r2.setMessage(r1)
            goto L_0x0290
        L_0x0283:
            com.ss.android.ugc.aweme.shortvideo.view.a r2 = r7.h
            android.app.Activity r3 = r7.j
            java.lang.String r1 = r3.getString(r1)
            r2.setMessage(r1)
            goto L_0x0290
        L_0x028f:
            r4 = r2
        L_0x0290:
            com.ss.android.ugc.aweme.base.utils.m r1 = com.ss.android.ugc.aweme.base.utils.m.a()
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x02d7
            r1 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d7
            android.app.Activity r1 = r7.j
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = com.ss.android.a.a.a(r1)
            android.app.Activity r2 = r7.j
            r3 = 2131561131(0x7f0d0aab, float:1.8747654E38)
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r11] = r0
            java.lang.String r0 = r2.getString(r3, r4)
            r1.setMessage((java.lang.CharSequence) r0)
            r1.setCancelable(r11)
            r0 = 2131559490(0x7f0d0442, float:1.8744326E38)
            com.ss.android.ugc.aweme.feed.share.a.a$7 r2 = new com.ss.android.ugc.aweme.feed.share.a.a$7
            r2.<init>()
            r1.setPositiveButton((int) r0, (android.content.DialogInterface.OnClickListener) r2)
            r0 = 2131559011(0x7f0d0263, float:1.8743354E38)
            com.ss.android.ugc.aweme.feed.share.a.a$8 r2 = new com.ss.android.ugc.aweme.feed.share.a.a$8
            r2.<init>()
            r1.setNegativeButton((int) r0, (android.content.DialogInterface.OnClickListener) r2)
            com.bytedance.ies.uikit.dialog.AlertDialog r0 = r1.create()
            r0.show()
            return
        L_0x02d7:
            r26.a()
            return
        L_0x02db:
            return
        L_0x02dc:
            r13 = 2131561430(0x7f0d0bd6, float:1.874826E38)
            r14 = 2131560093(0x7f0d069d, float:1.8745549E38)
            r15 = 3
            r7.k = r8
            r7.u = r9
            if (r8 == 0) goto L_0x066d
            com.ss.android.ugc.aweme.feed.model.Video r0 = r27.getVideo()
            if (r0 == 0) goto L_0x066d
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            if (r0 == 0) goto L_0x066d
            boolean r0 = r26.f()
            if (r0 != 0) goto L_0x02fd
            goto L_0x066d
        L_0x02fd:
            android.app.Activity r0 = r7.j
            boolean r0 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r0)
            if (r0 != 0) goto L_0x0316
            android.app.Activity r0 = r7.j
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r13, (int) r12)
            r0.a()
            com.ss.android.ugc.aweme.app.aa$a r0 = com.ss.android.ugc.aweme.app.aa.a.NETWORK
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.k
            com.ss.android.ugc.aweme.app.aa.a((com.ss.android.ugc.aweme.app.aa.a) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            return
        L_0x0316:
            boolean r0 = com.ss.android.ugc.aweme.feed.share.a.c.c(r27)
            if (r0 != 0) goto L_0x032c
            android.app.Activity r0 = r7.j
            android.app.Activity r1 = r7.j
            java.lang.String r1 = r1.getString(r14)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
            return
        L_0x032c:
            boolean r0 = com.ss.android.ugc.aweme.feed.share.a.c.b(r27)
            if (r0 != 0) goto L_0x0341
            com.ss.android.ugc.aweme.app.aa$a r0 = com.ss.android.ugc.aweme.app.aa.a.AUDITING
            com.ss.android.ugc.aweme.app.aa.a((com.ss.android.ugc.aweme.app.aa.a) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r8)
            com.ss.android.ugc.aweme.feed.share.a.a.a r0 = r7.r
            if (r0 == 0) goto L_0x0340
            com.ss.android.ugc.aweme.feed.share.a.a.a r0 = r7.r
            r0.b()
        L_0x0340:
            return
        L_0x0341:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r27.getVideo()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r9 = r0.getPlayAddrH264()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r27.getVideo()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getDownloadAddr()
            boolean r1 = com.ss.android.ugc.aweme.d.a.a(r27)
            if (r1 != 0) goto L_0x0452
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r8
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.feed.share.a.c.f45858a
            r22 = 1
            r23 = 42388(0xa594, float:5.9398E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r11] = r3
            java.lang.Class r25 = java.lang.Boolean.TYPE
            r19 = r1
            r24 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r1 == 0) goto L_0x039a
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r8
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.feed.share.a.c.f45858a
            r22 = 1
            r23 = 42388(0xa594, float:5.9398E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r11] = r3
            java.lang.Class r25 = java.lang.Boolean.TYPE
            r19 = r1
            r24 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x03b3
        L_0x039a:
            boolean r1 = com.ss.android.ugc.aweme.feed.share.a.c.d(r27)
            if (r1 != 0) goto L_0x03b2
            boolean r1 = com.ss.android.ugc.aweme.feed.share.a.c.e(r27)
            if (r1 == 0) goto L_0x03a7
            goto L_0x03b2
        L_0x03a7:
            if (r8 == 0) goto L_0x03b0
            boolean r1 = com.ss.android.ugc.aweme.feed.share.a.c.a(r27)
            if (r1 == 0) goto L_0x03b0
            goto L_0x03b2
        L_0x03b0:
            r1 = 0
            goto L_0x03b3
        L_0x03b2:
            r1 = 1
        L_0x03b3:
            if (r1 == 0) goto L_0x03b7
            goto L_0x0452
        L_0x03b7:
            boolean r1 = d(r27)
            if (r1 != 0) goto L_0x0405
            boolean r1 = c((com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            if (r1 != 0) goto L_0x0405
            com.ss.android.ugc.aweme.feed.model.Video r1 = r27.getVideo()
            boolean r1 = r1.hasEndWaterMark()
            if (r1 == 0) goto L_0x03ce
            goto L_0x0405
        L_0x03ce:
            com.ss.android.ugc.aweme.feed.model.Video r1 = r27.getVideo()
            boolean r1 = r1.isHasWaterMark()
            if (r1 == 0) goto L_0x03ef
            if (r0 == 0) goto L_0x03e9
            java.util.List r1 = r0.getUrlList()
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x03e5
            goto L_0x03e9
        L_0x03e5:
            r7.M = r0
            goto L_0x0462
        L_0x03e9:
            com.ss.android.ugc.aweme.app.aa$a r0 = com.ss.android.ugc.aweme.app.aa.a.DOWNLOAD_URL
            com.ss.android.ugc.aweme.app.aa.a((com.ss.android.ugc.aweme.app.aa.a) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r8)
            return
        L_0x03ef:
            if (r9 == 0) goto L_0x03ff
            java.util.List r0 = r9.getUrlList()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03fc
            goto L_0x03ff
        L_0x03fc:
            r7.M = r9
            goto L_0x0462
        L_0x03ff:
            com.ss.android.ugc.aweme.app.aa$a r0 = com.ss.android.ugc.aweme.app.aa.a.PLAY_URL
            com.ss.android.ugc.aweme.app.aa.a((com.ss.android.ugc.aweme.app.aa.a) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r8)
            return
        L_0x0405:
            boolean r0 = d(r27)
            if (r0 == 0) goto L_0x0414
            com.ss.android.ugc.aweme.feed.model.Video r0 = r27.getVideo()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getCaptionDownloadAddr()
            goto L_0x0449
        L_0x0414:
            boolean r0 = c((com.ss.android.ugc.aweme.feed.model.Aweme) r27)
            if (r0 == 0) goto L_0x0434
            com.ss.android.ugc.aweme.feed.model.Video r0 = r27.getVideo()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getUIAlikeDownloadAddr()
            if (r0 == 0) goto L_0x042e
            java.util.List r1 = r0.getUrlList()
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0449
        L_0x042e:
            com.ss.android.ugc.aweme.app.aa$a r0 = com.ss.android.ugc.aweme.app.aa.a.UI_ALIKE_WATERMARK_DOWNLOAD_URL
            com.ss.android.ugc.aweme.app.aa.a((com.ss.android.ugc.aweme.app.aa.a) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r8)
            return
        L_0x0434:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r27.getVideo()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getSuffixLogoDownloadAddr()
            if (r0 == 0) goto L_0x044c
            java.util.List r1 = r0.getUrlList()
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0449
            goto L_0x044c
        L_0x0449:
            r7.M = r0
            goto L_0x0462
        L_0x044c:
            com.ss.android.ugc.aweme.app.aa$a r0 = com.ss.android.ugc.aweme.app.aa.a.SUFFIX_LOGO_DOWNLOAD_URL
            com.ss.android.ugc.aweme.app.aa.a((com.ss.android.ugc.aweme.app.aa.a) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r8)
            return
        L_0x0452:
            if (r9 == 0) goto L_0x0667
            java.util.List r0 = r9.getUrlList()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0460
            goto L_0x0667
        L_0x0460:
            r7.M = r9
        L_0x0462:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f45798a
            r3 = 0
            r4 = 42321(0xa551, float:5.9304E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x048f
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f45798a
            r3 = 0
            r4 = 42321(0xa551, float:5.9304E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r26
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x04a2
        L_0x048f:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.k
            boolean r0 = com.ss.android.ugc.aweme.d.a.a(r0)
            if (r0 != 0) goto L_0x04a1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.k
            boolean r0 = com.ss.android.ugc.aweme.feed.share.a.c.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0, (boolean) r11)
            if (r0 == 0) goto L_0x04a1
            r0 = 1
            goto L_0x04a2
        L_0x04a1:
            r0 = 0
        L_0x04a2:
            r7.v = r0
            r7.w = r11
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f45798a
            r3 = 0
            r4 = 42322(0xa552, float:5.9306E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04d3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f45798a
            r3 = 0
            r4 = 42322(0xa552, float:5.9306E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r26
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x04ef
        L_0x04d3:
            boolean r0 = com.ss.android.ugc.aweme.g.a.a()
            if (r0 == 0) goto L_0x04ee
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.LocalAbTestModel r0 = r0.f()
            if (r0 == 0) goto L_0x04ee
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.LocalAbTestModel r0 = r0.f()
            boolean r0 = r0.forceMakeClientWatermark
            goto L_0x04ef
        L_0x04ee:
            r0 = 0
        L_0x04ef:
            r7.x = r0
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.festival.g.a()
            if (r0 == 0) goto L_0x04fd
            r7.v = r12
            r7.x = r12
            r7.M = r9
        L_0x04fd:
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            if (r0 != 0) goto L_0x0506
            java.lang.String r0 = ""
            goto L_0x050e
        L_0x0506:
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            java.lang.String r0 = r0.getNickname()
        L_0x050e:
            r7.E = r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            java.lang.String r0 = r0.getUniqueId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0527
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            java.lang.String r0 = r0.getShortId()
            goto L_0x052f
        L_0x0527:
            com.ss.android.ugc.aweme.profile.model.User r0 = r27.getAuthor()
            java.lang.String r0 = r0.getUniqueId()
        L_0x052f:
            r7.F = r0
            java.lang.String r0 = r7.E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x054b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@"
            r0.<init>(r1)
            java.lang.String r1 = r7.E
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.E = r0
        L_0x054b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.getUri()
            r0.append(r1)
            java.lang.String r1 = r7.F
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.bytedance.common.utility.DigestUtils.md5Hex((java.lang.String) r0)
            r7.i = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.g
            r0.append(r1)
            java.lang.String r1 = r7.i
            r0.append(r1)
            java.lang.String r1 = ".mp4"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.f45802e = r0
            java.lang.String r0 = r7.f45802e
            boolean r0 = com.ss.android.ugc.aweme.video.b.b((java.lang.String) r0)
            if (r0 == 0) goto L_0x0599
            r26.d()
            java.lang.String r0 = r7.u
            boolean r0 = com.ss.android.ugc.aweme.share.cg.a((java.lang.String) r0, (int) r15)
            if (r0 == 0) goto L_0x0598
            java.lang.String r0 = r7.u
            r7.b((java.lang.String) r0)
        L_0x0598:
            return
        L_0x0599:
            com.ss.android.ugc.aweme.shortvideo.view.a r0 = r7.h
            if (r0 != 0) goto L_0x05b7
            android.app.Activity r0 = r7.j
            android.app.Activity r1 = r7.j
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131559711(0x7f0d051f, float:1.8744774E38)
            java.lang.String r1 = r1.getString(r2)
            com.ss.android.ugc.aweme.shortvideo.view.a r0 = com.ss.android.ugc.aweme.shortvideo.view.a.a(r0, r1)
            r7.h = r0
            com.ss.android.ugc.aweme.shortvideo.view.a r0 = r7.h
            r0.a((boolean) r11)
        L_0x05b7:
            com.ss.android.ugc.aweme.shortvideo.view.a r0 = r7.h
            r0.a((int) r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = B
            r0.append(r1)
            java.lang.String r1 = r7.i
            r0.append(r1)
            java.lang.String r1 = ".mp4"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = com.ss.android.ugc.aweme.video.b.b((java.lang.String) r0)
            if (r1 != 0) goto L_0x05e2
            java.lang.String r1 = B
            com.ss.android.ugc.aweme.video.b.a((java.lang.String) r1, (boolean) r11)
        L_0x05df:
            r1 = 100
            goto L_0x05f1
        L_0x05e2:
            r1 = 60
            r7.f45800c = r1
            r7.f45801d = r0
            boolean r1 = r7.v
            if (r1 != 0) goto L_0x065f
            boolean r1 = r7.w
            if (r1 == 0) goto L_0x05df
            goto L_0x065f
        L_0x05f1:
            r7.f45800c = r1
            com.ss.android.ugc.aweme.utils.en r1 = r7.H
            java.lang.String r2 = "download_time"
            java.lang.String r3 = "download"
            r1.a(r2, r3)
            r7.I = r11
            r7.J = r0
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r7.M
            if (r1 == 0) goto L_0x0626
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r7.M
            java.util.List r1 = r1.getUrlList()
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0626
            com.ss.android.linkselector.LinkSelector r1 = com.ss.android.linkselector.LinkSelector.a()
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r7.M
            java.util.List r2 = r2.getUrlList()
            java.lang.Object r2 = r2.get(r11)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = r1.a((java.lang.String) r2)
            r7.t = r1
        L_0x0626:
            java.lang.String r1 = r7.t
            java.lang.String r1 = com.ss.android.ugc.aweme.video.e.b.a(r1)
            r7.t = r1
            com.ss.android.ugc.a.e$a r1 = new com.ss.android.ugc.a.e$a
            r1.<init>()
            java.lang.String r2 = r7.t
            com.ss.android.ugc.a.e$a r1 = r1.a((java.lang.String) r2)
            com.ss.android.ugc.a.e$a r0 = r1.b(r0)
            com.ss.android.ugc.a.e r0 = r0.a()
            java.lang.String r1 = r27.getAid()
            com.ss.android.ugc.aweme.video.local.b.a(r1, r0, r7)
            r7.s = r11
            android.os.Handler r0 = r7.q
            com.ss.android.ugc.aweme.feed.share.a.a$6 r1 = new com.ss.android.ugc.aweme.feed.share.a.a$6
            r1.<init>()
            r2 = 60000(0xea60, double:2.9644E-319)
            r0.postDelayed(r1, r2)
            android.os.Handler r0 = r7.q
            r1 = 30000(0x7530, double:1.4822E-319)
            r0.sendEmptyMessageDelayed(r12, r1)
            return
        L_0x065f:
            boolean r0 = r7.v
            boolean r1 = r7.w
            r7.a((boolean) r0, (boolean) r1)
            return
        L_0x0667:
            com.ss.android.ugc.aweme.app.aa$a r0 = com.ss.android.ugc.aweme.app.aa.a.PLAY_URL
            com.ss.android.ugc.aweme.app.aa.a((com.ss.android.ugc.aweme.app.aa.a) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r8)
            return
        L_0x066d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.share.a.a.a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    public a(Activity activity, int i2, IShareService.ShareStruct shareStruct) {
        this.j = activity;
        this.g = f.a(activity);
        this.y = shareStruct;
        if (!TextUtils.isEmpty(this.g)) {
            File file = new File(this.g);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        this.N = i2;
        this.H = new en();
        this.L = new com.ss.android.ugc.aweme.common.b();
        this.L.a(new com.ss.android.ugc.aweme.feed.h.c());
    }

    private void a(boolean z2, boolean z3, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), str2}, this, f45798a, false, 42324, new Class[]{Boolean.TYPE, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3), str2}, this, f45798a, false, 42324, new Class[]{Boolean.TYPE, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.n = false;
        this.o = true;
        AnonymousClass11 r0 = new com.ss.android.ugc.aweme.aq.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45810a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f45810a, false, 42358, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45810a, false, 42358, new Class[0], Void.TYPE);
                    return;
                }
                a.this.o = false;
                if (a.this.l) {
                    com.ss.android.ugc.aweme.video.b.c(a.this.f45802e);
                    a.this.l = false;
                    return;
                }
                b.a.a().a("water_mark_error");
                String str = a.this.f45801d;
                String str2 = a.this.f45802e;
                Aweme aweme = a.this.k;
                if (PatchProxy.isSupport(new Object[]{str, str2, aweme}, null, aa.f33673a, true, 22507, new Class[]{String.class, String.class, Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, str2, aweme}, null, aa.f33673a, true, 22507, new Class[]{String.class, String.class, Aweme.class}, Void.TYPE);
                } else {
                    StringBuilder sb = new StringBuilder("WaterMark:");
                    sb.append("inputPath:");
                    sb.append(str);
                    sb.append(",");
                    sb.append("outputPath:");
                    sb.append(str2);
                    if (aweme != null) {
                        sb.append(",");
                        sb.append("aweme_id:");
                        sb.append(aweme.getAid());
                    }
                    aa.a(sb.toString());
                }
                a.this.c();
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f45810a, false, 42356, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f45810a, false, 42356, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                a.this.f45803f = (a.this.f45800c - 60) + ((i * 60) / a.this.f45800c);
                a.this.q.post(a.this.z);
            }

            public final void a(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f45810a, false, 42357, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f45810a, false, 42357, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                a.this.o = false;
                if (a.this.l) {
                    com.ss.android.ugc.aweme.video.b.c(a.this.f45802e);
                    a.this.l = false;
                    return;
                }
                a.this.d();
                if (cg.a(a.this.u, 3)) {
                    a.this.b(a.this.u);
                }
            }
        };
        b.a.a().a("water_mark_start");
        com.ss.android.ugc.aweme.aq.a aVar = new com.ss.android.ugc.aweme.aq.a();
        boolean z4 = z2;
        boolean z5 = z3;
        aVar.a(this.f45801d).b(this.f45802e).a(this.k.getAuthor(), this.k.getVideo()).a(z2).b(z3).a((com.ss.android.ugc.aweme.aq.b) r0).c(com.ss.android.g.a.a()).d(this.t).b(this.O).a(this.P).c(str2);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).waIWaterMarkService().waterMark(aVar);
    }

    public void onDownloadProgress(int i2, long j2, long j3) {
        int i3 = i2;
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, f45798a, false, 42330, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, f45798a, false, 42330, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.s = i3;
            if (this.v || this.w) {
                this.f45803f = (i3 * 40) / this.f45800c;
            } else {
                this.f45803f = i3;
            }
            com.ss.android.b.a.a.a.b(this.z);
        }
    }
}
