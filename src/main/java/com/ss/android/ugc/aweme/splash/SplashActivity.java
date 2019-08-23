package com.ss.android.ugc.aweme.splash;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.splash.c;
import com.ss.android.ad.splash.h;
import com.ss.android.ad.splash.m;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.i;
import com.ss.android.sdk.app.f;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.j;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.e.d;
import com.ss.android.ugc.aweme.base.utils.l;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.ab;
import com.ss.android.ugc.aweme.commercialize.utils.aj;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.service.DouDouService;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImp.task.MobLaunchEventTask;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.setting.model.RetryPolicyItem;
import com.ss.android.ugc.aweme.u.u;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.ee;
import com.ss.android.ugc.aweme.utils.o;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.io.File;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

@Keep
@AddPageTrace
public class SplashActivity extends FragmentActivity implements WeakHandler.IHandler, a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static i sConfirmWelcomeType = i.FULL_SCREEN_WELCOME;
    public static boolean sShowWelcomeCheckBox;
    private DouDouService.a douDouListener;
    public boolean isFirstShow;
    protected volatile boolean mAlive = true;
    protected boolean mAllowAd = true;
    protected boolean mAllowNetwork;
    public boolean mConfirmPush;
    private Dialog mDialog = null;
    public boolean mDirectlyGoMain;
    protected boolean mFirstResume = true;
    protected final Handler mHandler = new WeakHandler(this);
    protected boolean mInited;
    protected boolean mJumped;
    protected boolean mNeedSaveData;
    private boolean mSelectCheckBox;
    protected boolean mTrackSession;
    private boolean preloadSubmitted = false;
    public m splashAdNative;

    public interface a {
        void a();

        void b();
    }

    static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71560a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<SplashActivity> f71561b;

        b(SplashActivity splashActivity) {
            this.f71561b = new WeakReference<>(splashActivity);
        }

        public final void a(@NonNull View view) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{view}, this, f71560a, false, 81866, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f71560a, false, 81866, new Class[]{View.class}, Void.TYPE);
                return;
            }
            SplashActivity splashActivity = (SplashActivity) this.f71561b.get();
            if (splashActivity != null) {
                AbTestManager a2 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71939, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71939, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    AbTestModel d2 = a2.d();
                    if (d2 == null || !d2.splashVideoTransit) {
                        z = false;
                    }
                }
                if (!z || !com.ss.android.ugc.aweme.commercialize.splash.a.a().i) {
                    splashActivity.goMainActivity();
                    return;
                }
                Intent intent = new Intent(splashActivity, TransitActivity.class);
                intent.putExtra("main", splashActivity.getMainIntent());
                splashActivity.startActivity(intent);
                if (!splashActivity.isFinishing()) {
                    splashActivity.finish();
                    splashActivity.overridePendingTransition(0, 0);
                }
            }
        }

        static final /* synthetic */ void a(SplashActivity splashActivity, String str) {
            Message message = new Message();
            message.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString("splash_open_url_extra", str);
            message.setData(bundle);
            splashActivity.mHandler.sendMessage(message);
        }

        public final void a(long j, String str) {
            long j2 = j;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, f71560a, false, 81867, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, f71560a, false, 81867, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            } else if (((SplashActivity) this.f71561b.get()) != null) {
                g.a((Context) this.f71561b.get(), j2, str2);
            }
        }

        public final void a(@NonNull View view, @NonNull h hVar) {
            h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{view, hVar2}, this, f71560a, false, 81865, new Class[]{View.class, h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, hVar2}, this, f71560a, false, 81865, new Class[]{View.class, h.class}, Void.TYPE);
                return;
            }
            SplashActivity splashActivity = (SplashActivity) this.f71561b.get();
            if (splashActivity != null) {
                String str = hVar2.f22810d;
                String str2 = hVar2.h;
                if (!StringUtils.isEmpty(str)) {
                    if (!splashActivity.tryOpenByScheme(str, str2, hVar2.f22807a, hVar2.f22809c, new k(splashActivity))) {
                        splashActivity.mHandler.sendEmptyMessage(100);
                    }
                    splashActivity.mDirectlyGoMain = true;
                }
            }
        }
    }

    public boolean checkAppShortCut() {
        return false;
    }

    public boolean isSplashShowing() {
        return true;
    }

    public void onBackPressed() {
    }

    public void onDialogShowOrDismiss(DialogInterface dialogInterface, boolean z) {
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 81844, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 81844, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public boolean quickLaunch() {
        return false;
    }

    private void initDouDouService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81819, new Class[0], Void.TYPE);
            return;
        }
        if (this.douDouListener == null) {
            this.douDouListener = new DouDouService.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71545a;

                public final boolean a() {
                    if (PatchProxy.isSupport(new Object[0], this, f71545a, false, 81853, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71545a, false, 81853, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    aj.a(SplashActivity.this.splashAdNative);
                    return true;
                }
            };
        }
        ((DouDouService) com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class)).setDouDouListener(this.douDouListener);
    }

    @MeasureFunction
    public void doInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81839, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81839, new Class[0], Void.TYPE);
            return;
        }
        BaseAppData.a().b((Context) this);
    }

    public void goMainActivity() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81835, new Class[0], Void.TYPE);
            return;
        }
        goMainActivity(null);
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81842, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
    }

    public void saveAllowNetwork() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81831, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81831, new Class[0], Void.TYPE);
            return;
        }
        this.mAllowNetwork = true;
        BaseAppData.b(getApplicationContext(), this.mAllowNetwork);
    }

    public void tryInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81838, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81838, new Class[0], Void.TYPE);
            return;
        }
        if (!this.mInited) {
            doInit();
            this.mInited = true;
        }
    }

    @MeasureFunction
    public void tryShowAdAndGoNext() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81833, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81833, new Class[0], Void.TYPE);
        } else if (showSplashAd()) {
            submitPreload();
        } else {
            goMainActivity();
        }
    }

    @MeasureFunction
    public void tryShowShortCutDlg() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81828, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81828, new Class[0], Void.TYPE);
            return;
        }
        if (!checkAppShortCut() || !showShortcutDlg()) {
            tryShowAdAndGoNext();
        }
    }

    private boolean isHotStart() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81821, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81821, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Intent intent = getIntent();
        if (!isTaskRoot() || intent == null || !intent.hasCategory("android.intent.category.LAUNCHER") || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return false;
        }
        return true;
    }

    private void mobLaunchMob() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81826, new Class[0], Void.TYPE);
            return;
        }
        String str = "";
        try {
            Intent intent = getIntent();
            Uri uri = null;
            if (intent != null) {
                uri = intent.getData();
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                if (uri != null) {
                    str = uri.getQueryParameter("gd_label");
                }
                if (booleanExtra || str != null) {
                    mobLaunchLogMob(uri);
                    return;
                }
            }
            r.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName("enter_launch"));
            mobLaunchLogMob(uri);
        } catch (Exception unused) {
        }
    }

    private void reportLaunchTime() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81824, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81824, new Class[0], Void.TYPE);
            return;
        }
        if (k.f() != -1) {
            long currentTimeMillis = System.currentTimeMillis() - k.f();
            int b2 = AwemeAppData.p().b();
            int e2 = AwemeAppData.p().e();
            if (b2 != e2) {
                z = true;
            }
            if (j.a().f34191b) {
                com.ss.android.ugc.aweme.lego.a.i.a().a(new MobLaunchEventTask(z, currentTimeMillis)).a();
            }
            if (b2 == 0) {
                AwemeAppData.p().a(e2);
            }
        }
    }

    private void submitPreload() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81818, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a() || this.preloadSubmitted) {
            this.preloadSubmitted = true;
            com.ss.android.ugc.aweme.lego.a.i.d().a(new com.ss.android.ugc.aweme.requesttask.b.a()).a();
            ((MainLooperOptService) com.ss.android.ugc.aweme.lego.a.i.a(MainLooperOptService.class)).updateState(MainLooperOptService.a.WATCH_ACTIVITY);
        }
    }

    public Resources getResources() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81843, new Class[0], Resources.class)) {
            return (Resources) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81843, new Class[0], Resources.class);
        } else if (d.a(this)) {
            return new d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
        } else {
            return super.getResources();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81841, new Class[0], Void.TYPE);
            return;
        }
        if (this.mDialog != null) {
            l.a(this.mDialog);
        }
        this.mHandler.removeMessages(100);
        this.mAlive = false;
        super.onDestroy();
        if (!com.ss.android.g.a.a()) {
            ((DouDouService) com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class)).onDestroy();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81834, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.mNeedSaveData) {
            BaseAppData.a().f(this);
            this.mNeedSaveData = false;
        }
        if (!com.ss.android.g.a.a()) {
            ((DouDouService) com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class)).onPause();
        }
    }

    private void calculateStartTime() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81820, new Class[0], Void.TYPE);
            return;
        }
        long a2 = o.a(1);
        if (a2 <= 0 || a2 >= 30000) {
            a2 = 0;
        }
        o.f75913c = a2;
        if (PatchProxy.isSupport(new Object[]{2L}, null, o.f75911a, true, 87914, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{2L}, null, o.f75911a, true, 87914, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        o.f75912b.a(2, SystemClock.uptimeMillis());
    }

    private void hotStartIntercept() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81822, new Class[0], Void.TYPE);
            return;
        }
        if (isHotStart() && com.ss.android.g.a.a()) {
            com.ss.android.ugc.aweme.setting.r a2 = com.ss.android.ugc.aweme.setting.r.a();
            if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.setting.r.f64008a, false, 72076, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.setting.r.f64008a, false, 72076, new Class[0], Void.TYPE);
                return;
            }
            for (int i = 0; i < a2.f64013f.size(); i++) {
                RetryPolicyItem valueAt = a2.f64013f.valueAt(i);
                if (valueAt != null && System.currentTimeMillis() - valueAt.lastResponseTime > ((long) com.ss.android.ugc.aweme.setting.r.f64012e)) {
                    valueAt.retryListener.b();
                }
            }
        }
    }

    @MeasureFunction
    private boolean showSplashAd() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81840, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81840, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TimeLockRuler.isTeenModeON() || !this.mAllowAd || this.splashAdNative == null) {
            return false;
        } else {
            com.ss.android.ugc.aweme.commercialize.splash.a.a().b();
            com.ss.android.ugc.aweme.commercialize.splash.a.a().n = true;
            final ViewGroup a2 = this.splashAdNative.a(getBaseContext());
            com.ss.android.ugc.aweme.commercialize.splash.a.a().n = false;
            if (a2 == null) {
                return false;
            }
            ag.i().h();
            o.f75914d = true;
            v.b((Activity) this);
            a2.setBackgroundResource(2130840558);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            try {
                setContentView(relativeLayout);
                relativeLayout.addView(a2);
                a2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f71557a;

                    public final boolean onPreDraw() {
                        if (PatchProxy.isSupport(new Object[0], this, f71557a, false, 81864, new Class[0], Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71557a, false, 81864, new Class[0], Boolean.TYPE)).booleanValue();
                        }
                        if (!SplashActivity.this.isFirstShow) {
                            SplashActivity.this.isFirstShow = true;
                            a2.getViewTreeObserver().removeOnPreDrawListener(this);
                        }
                        return true;
                    }
                });
                return true;
            } catch (RuntimeException e2) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("exception", e2.toString());
                n.a("splash_set_content_view", jSONObject);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public boolean showShortcutDlg() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81832, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81832, new Class[0], Boolean.TYPE)).booleanValue();
        }
        BaseAppData a2 = BaseAppData.a();
        if (!a2.l() || a2.K) {
            return false;
        }
        a2.a(true);
        this.mNeedSaveData = true;
        try {
            AlertDialog.Builder a3 = com.ss.android.a.a.a(this);
            a3.setTitle((int) C0906R.string.ak);
            a3.setMessage((int) C0906R.string.cam);
            a3.setPositiveButton((int) C0906R.string.ca9, (DialogInterface.OnClickListener) new j(this));
            a3.setNegativeButton((int) C0906R.string.ca7, (DialogInterface.OnClickListener) null);
            AlertDialog create = a3.create();
            f fVar = new f(new com.ss.android.sdk.app.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71555a;

                public final void onCancel(DialogInterface dialogInterface) {
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f71555a, false, 81863, new Class[]{DialogInterface.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f71555a, false, 81863, new Class[]{DialogInterface.class}, Void.TYPE);
                        return;
                    }
                    SplashActivity.this.onDialogShowOrDismiss(dialogInterface, false);
                    SplashActivity.this.tryShowAdAndGoNext();
                }

                public final void onShow(DialogInterface dialogInterface) {
                    DialogInterface dialogInterface2 = dialogInterface;
                    if (PatchProxy.isSupport(new Object[]{dialogInterface2}, this, f71555a, false, 81862, new Class[]{DialogInterface.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface2}, this, f71555a, false, 81862, new Class[]{DialogInterface.class}, Void.TYPE);
                        return;
                    }
                    SplashActivity.this.onDialogShowOrDismiss(dialogInterface2, true);
                }
            });
            create.setOnDismissListener(fVar);
            create.setOnShowListener(fVar);
            create.show();
            this.mDialog = create;
        } catch (Exception unused) {
            tryShowAdAndGoNext();
        }
        return true;
    }

    public void tryShowNotifyDialog() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81830, new Class[0], Void.TYPE);
        } else if (!this.mConfirmPush) {
            try {
                View inflate = LayoutInflater.from(this).inflate(C0906R.layout.f0, null);
                ((TextView) inflate.findViewById(C0906R.id.yp)).setText(C0906R.string.am8);
                ((CheckBox) inflate.findViewById(C0906R.id.cd_)).setVisibility(8);
                AlertDialog.Builder a2 = com.ss.android.a.a.a(this);
                a2.setTitle((int) C0906R.string.cal);
                a2.setView(inflate);
                a2.setPositiveButton((int) C0906R.string.cap, (DialogInterface.OnClickListener) new h(this));
                a2.setNegativeButton((int) C0906R.string.cao, (DialogInterface.OnClickListener) new i(this));
                AlertDialog create = a2.create();
                f fVar = new f(new com.ss.android.sdk.app.c() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f71553a;

                    public final void onCancel(DialogInterface dialogInterface) {
                    }

                    public final void onShow(DialogInterface dialogInterface) {
                        DialogInterface dialogInterface2 = dialogInterface;
                        if (PatchProxy.isSupport(new Object[]{dialogInterface2}, this, f71553a, false, 81860, new Class[]{DialogInterface.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface2}, this, f71553a, false, 81860, new Class[]{DialogInterface.class}, Void.TYPE);
                            return;
                        }
                        SplashActivity.this.onDialogShowOrDismiss(dialogInterface2, true);
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f71553a, false, 81861, new Class[]{DialogInterface.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f71553a, false, 81861, new Class[]{DialogInterface.class}, Void.TYPE);
                            return;
                        }
                        SplashActivity.this.onDialogShowOrDismiss(dialogInterface, false);
                        SplashActivity.this.mConfirmPush = true;
                        com.ss.android.di.push.a.a().setConfirmPush(SplashActivity.this, SplashActivity.this.mConfirmPush);
                        SplashActivity.this.tryInit();
                        SplashActivity.this.tryShowAdAndGoNext();
                    }
                });
                create.setOnDismissListener(fVar);
                create.setOnShowListener(fVar);
                create.show();
                this.mDialog = create;
            } catch (Exception unused) {
                this.mConfirmPush = true;
                com.ss.android.di.push.a.a().setConfirmPush(this, this.mConfirmPush);
                tryInit();
                tryShowAdAndGoNext();
            }
        }
    }

    public Intent getMainIntent() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81837, new Class[0], Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81837, new Class[0], Intent.class);
        }
        Intent intent = getIntent();
        com.ss.android.ugc.aweme.share.systemshare.a aVar = new com.ss.android.ugc.aweme.share.systemshare.a();
        if (PatchProxy.isSupport(new Object[]{intent}, aVar, com.ss.android.ugc.aweme.share.systemshare.a.f65294a, false, 73818, new Class[]{Intent.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.share.systemshare.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{intent}, aVar2, com.ss.android.ugc.aweme.share.systemshare.a.f65294a, false, 73818, new Class[]{Intent.class}, Void.TYPE);
        } else {
            aVar.f65295b = false;
            aVar.f65297d = null;
            aVar.f65296c = 0;
            if (intent != null) {
                if (StringUtils.equal(intent.getAction(), "android.intent.action.SEND")) {
                    if (PatchProxy.isSupport(new Object[]{intent}, aVar, com.ss.android.ugc.aweme.share.systemshare.a.f65294a, false, 73820, new Class[]{Intent.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.share.systemshare.a aVar3 = aVar;
                        PatchProxy.accessDispatch(new Object[]{intent}, aVar3, com.ss.android.ugc.aweme.share.systemshare.a.f65294a, false, 73820, new Class[]{Intent.class}, Void.TYPE);
                    } else {
                        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                        if (uri != null) {
                            String a2 = com.ss.android.ugc.aweme.framework.e.h.a(k.a(), uri);
                            if (bm.a(a2)) {
                                if (aVar.b(intent.getType())) {
                                    aVar.f65296c = 2;
                                } else if (aVar.a(intent.getType())) {
                                    aVar.f65296c = 1;
                                }
                                aVar.f65297d = new File(a2);
                                aVar.f65295b = true;
                            }
                        }
                    }
                } else if (StringUtils.equal(intent.getAction(), "android.intent.action.SEND_MULTIPLE")) {
                    aVar.a(intent);
                } else if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isFromOpenSdk(intent)) {
                    if (PatchProxy.isSupport(new Object[]{intent}, aVar, com.ss.android.ugc.aweme.share.systemshare.a.f65294a, false, 73819, new Class[]{Intent.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.share.systemshare.a aVar4 = aVar;
                        PatchProxy.accessDispatch(new Object[]{intent}, aVar4, com.ss.android.ugc.aweme.share.systemshare.a.f65294a, false, 73819, new Class[]{Intent.class}, Void.TYPE);
                    } else {
                        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).handleOpenSdk(intent, new IBridgeService.a(intent) {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f65300a;

                            /* renamed from: b */
                            final /* synthetic */ Intent f65301b;

                            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.share.systemshare.a.1.a(java.util.ArrayList):void, dex: classes5.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.share.systemshare.a.1.a(java.util.ArrayList):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                            
*/

                            public final void b(
/*
Method generation error in method: com.ss.android.ugc.aweme.share.systemshare.a.1.b(java.util.ArrayList):void, dex: classes5.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.share.systemshare.a.1.b(java.util.ArrayList):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                            
*/
                        });
                    }
                }
            }
        }
        Intent intent2 = new Intent(this, ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService().a());
        intent2.setFlags(335544320);
        if (PatchProxy.isSupport(new Object[]{intent, intent2}, null, ab.f39666a, true, 32523, new Class[]{Intent.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent, intent2}, null, ab.f39666a, true, 32523, new Class[]{Intent.class, Intent.class}, Void.TYPE);
        } else if (intent != null) {
            intent2.setAction(intent.getAction());
        }
        ab.a(intent, intent2);
        if (!(intent == null || intent.getExtras() == null)) {
            intent2.putExtras(intent.getExtras());
        }
        if (aVar.f65295b) {
            intent2.putExtra("sys_send_action", aVar);
            l.a("system_share");
        }
        return intent2;
    }

    @MeasureFunction
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 81827, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 81827, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashActivity", "onResume", true);
        ag.i().h();
        if (isFinishing()) {
            com.ss.android.ugc.aweme.shortvideo.util.f.a(this);
            ExceptionMonitor.ensureNotReachHere("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashActivity", "onResume", false);
            return;
        }
        super.onResume();
        if (this.mDirectlyGoMain) {
            goMainActivity();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashActivity", "onResume", false);
            return;
        }
        Intent intent = getIntent();
        if (!this.mAllowNetwork) {
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras != null && extras.getBoolean("from_widget_provider") && (this.mDialog == null || !this.mDialog.isShowing())) {
                    showConfirmUseNetworkDlg(new a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f71547a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f71547a, false, 81854, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f71547a, false, 81854, new Class[0], Void.TYPE);
                                return;
                            }
                            SplashActivity.this.saveAllowNetwork();
                            SplashActivity.this.finish();
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f71547a, false, 81855, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f71547a, false, 81855, new Class[0], Void.TYPE);
                                return;
                            }
                            SplashActivity.this.finish();
                        }
                    });
                    ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashActivity", "onResume", false);
                    return;
                }
            }
            if (this.mDialog == null || !this.mDialog.isShowing()) {
                showConfirmUseNetworkDlg(new a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f71549a;

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f71549a, false, 81857, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f71549a, false, 81857, new Class[0], Void.TYPE);
                            return;
                        }
                        SplashActivity.this.finish();
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f71549a, false, 81856, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f71549a, false, 81856, new Class[0], Void.TYPE);
                            return;
                        }
                        SplashActivity.this.saveAllowNetwork();
                        if (SplashActivity.this.mConfirmPush) {
                            SplashActivity.this.tryInit();
                            SplashActivity.this.tryShowAdAndGoNext();
                            return;
                        }
                        SplashActivity.this.tryShowNotifyDialog();
                    }
                });
            }
        }
        if (!this.mFirstResume || this.mJumped) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashActivity", "onResume", false);
            return;
        }
        this.mFirstResume = false;
        if (!this.mAllowNetwork || !this.mConfirmPush) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashActivity", "onResume", false);
            return;
        }
        if (intent != null) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null && extras2.getBoolean("from_notification")) {
                com.ss.android.common.lib.a.a(this, "more_tab", "notify_click");
                com.ss.android.common.lib.a.a(this, "apn", "recall");
            }
        }
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null) {
            iPluginService.monitorPlugins();
        }
        if (quickLaunch()) {
            goMainActivity();
        }
        if (!com.ss.android.g.a.a()) {
            ((DouDouService) com.ss.android.ugc.aweme.lego.a.i.a(DouDouService.class)).onResume();
        }
        ee.a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashActivity", "onResume", false);
    }

    @MeasureFunction
    public void goMainActivity(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 81836, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 81836, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        submitPreload();
        this.mHandler.removeMessages(100);
        if (!this.mJumped) {
            this.mJumped = true;
            if (this.mAlive) {
                if (this.mNeedSaveData) {
                    BaseAppData.a().f(this);
                    this.mNeedSaveData = false;
                }
                Intent mainIntent = getMainIntent();
                if (bundle != null) {
                    mainIntent.putExtra("extra_splash_data", bundle);
                }
                startActivity(mainIntent);
                if (!isFinishing()) {
                    finish();
                }
            }
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, changeQuickRedirect, false, 81816, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, changeQuickRedirect, false, 81816, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (this.mAlive && message.what == 100) {
            goMainActivity(message.getData());
        }
    }

    private void mobLaunchLogMob(Uri uri) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2}, this, changeQuickRedirect, false, 81825, new Class[]{Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri2}, this, changeQuickRedirect, false, 81825, new Class[]{Uri.class}, Void.TYPE);
            return;
        }
        String str = "";
        if (uri2 != null) {
            str = uri2.getQueryParameter("enter_to");
        }
        long d2 = com.ss.android.ugc.aweme.aj.b.b().d(com.ss.android.ugc.aweme.framework.e.a.a().getApplicationContext(), "red_point_count");
        u f2 = new u().a("enter_launch").f(Integer.toString(1));
        if (str == null) {
            str = "";
        }
        u e2 = f2.c(str).e(Long.toString(d2));
        e2.f75153b = getIntent().getStringExtra("_aweme_open_sdk_params_client_key");
        e2.e();
        j.a().f34192c = false;
    }

    @SuppressLint({"InflateParams"})
    @MeasureFunction
    public void showConfirmUseNetworkDlg(a aVar) {
        boolean z;
        Dialog dialog;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 81829, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 81829, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (sConfirmWelcomeType == i.FULL_SCREEN_WELCOME) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                AlertDialog.Builder a2 = com.ss.android.a.a.a(this);
                View inflate = LayoutInflater.from(this).inflate(C0906R.layout.f0, null);
                CheckBox checkBox = (CheckBox) inflate.findViewById(C0906R.id.cd_);
                if (sShowWelcomeCheckBox) {
                    checkBox.setVisibility(0);
                } else {
                    checkBox.setVisibility(8);
                }
                checkBox.setOnCheckedChangeListener(new c(this));
                checkBox.setChecked(this.mSelectCheckBox);
                a2.setView(inflate);
                a2.setTitle((int) C0906R.string.am_);
                a2.setCancelable(false);
                a2.setPositiveButton((int) C0906R.string.ca9, (DialogInterface.OnClickListener) new d(aVar));
                a2.setNegativeButton((int) C0906R.string.cas, (DialogInterface.OnClickListener) null);
                dialog = a2.create();
            } catch (Exception unused) {
                if (aVar != null) {
                    aVar.a();
                }
                return;
            }
        } else {
            dialog = new Dialog(this);
            dialog.setCancelable(false);
            dialog.requestWindowFeature(1);
            dialog.setContentView(C0906R.layout.asq);
            dialog.getWindow().setBackgroundDrawableResource(2130840612);
            dialog.getWindow().setLayout(-1, -1);
            View findViewById = dialog.findViewById(C0906R.id.q6);
            View findViewById2 = dialog.findViewById(C0906R.id.buf);
            CheckBox checkBox2 = (CheckBox) dialog.findViewById(C0906R.id.cd_);
            if (sShowWelcomeCheckBox) {
                checkBox2.setVisibility(0);
            } else {
                checkBox2.setVisibility(8);
            }
            checkBox2.setOnCheckedChangeListener(new e(this));
            checkBox2.setChecked(this.mSelectCheckBox);
            findViewById.setOnClickListener(new f(dialog, aVar));
            findViewById2.setOnClickListener(new g(dialog, aVar));
        }
        f fVar = new f(new com.ss.android.sdk.app.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71551a;

            public final void onCancel(DialogInterface dialogInterface) {
            }

            public final void onShow(DialogInterface dialogInterface) {
                DialogInterface dialogInterface2 = dialogInterface;
                if (PatchProxy.isSupport(new Object[]{dialogInterface2}, this, f71551a, false, 81858, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface2}, this, f71551a, false, 81858, new Class[]{DialogInterface.class}, Void.TYPE);
                    return;
                }
                SplashActivity.this.onDialogShowOrDismiss(dialogInterface2, true);
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f71551a, false, 81859, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f71551a, false, 81859, new Class[]{DialogInterface.class}, Void.TYPE);
                    return;
                }
                SplashActivity.this.onDialogShowOrDismiss(dialogInterface, false);
                if (!SplashActivity.this.mAllowNetwork) {
                    SplashActivity.this.finish();
                }
            }
        });
        dialog.setOnDismissListener(fVar);
        dialog.setOnShowListener(fVar);
        dialog.show();
        this.mDialog = dialog;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x012e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x029a */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0161 A[Catch:{ Throwable -> 0x02a0, Exception -> 0x02a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01f2 A[Catch:{ Throwable -> 0x02a0, Exception -> 0x02a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x020c A[Catch:{ Throwable -> 0x02a0, Exception -> 0x02a7 }] */
    @com.ss.android.ugc.thermometer.annotation.MeasureFunction
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r26) {
        /*
            r25 = this;
            r8 = r25
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r26
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 81817(0x13f99, float:1.1465E-40)
            r2 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r26
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 81817(0x13f99, float:1.1465E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.splash.SplashActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            com.ss.android.ugc.aweme.feed.ag r0 = com.ss.android.ugc.aweme.feed.ag.i()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ag.f3141a
            r14 = 0
            r15 = 40158(0x9cde, float:5.6273E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            r2 = 0
            if (r1 == 0) goto L_0x006b
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ag.f3141a
            r14 = 0
            r15 = 40158(0x9cde, float:5.6273E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x007b
        L_0x006b:
            long r4 = r0.g
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0075
            r0.h()
            goto L_0x007b
        L_0x0075:
            long r4 = android.os.SystemClock.uptimeMillis()
            r0.g = r4
        L_0x007b:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.z.a.f76943a
            r14 = 1
            r15 = 63337(0xf769, float:8.8754E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x00b0
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.z.a.f76943a
            r14 = 1
            r15 = 63337(0xf769, float:8.8754E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02a8
        L_0x00b0:
            com.ss.android.ugc.aweme.app.r r0 = com.ss.android.ugc.aweme.app.k.h()
            if (r0 != 0) goto L_0x02a8
            com.ss.android.ugc.aweme.app.k r0 = com.ss.android.ugc.aweme.app.k.a()
            if (r0 != 0) goto L_0x02a8
            android.content.Context r0 = r25.getApplicationContext()
            if (r0 == 0) goto L_0x02a8
            android.content.pm.ApplicationInfo r0 = r25.getApplicationInfo()
            if (r0 == 0) goto L_0x02a8
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            java.lang.String r0 = r0.getName()
            android.content.pm.ApplicationInfo r1 = r25.getApplicationInfo()
            java.lang.String r1 = r1.className
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x02a8
            android.content.Context r0 = r25.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x02a7 }
            r11[r10] = r8     // Catch:{ Exception -> 0x02a7 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.z.a.f76943a     // Catch:{ Exception -> 0x02a7 }
            r14 = 1
            r15 = 63338(0xf76a, float:8.8755E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r1[r10] = r4     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a7 }
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x02a7 }
            if (r1 == 0) goto L_0x0114
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x02a7 }
            r11[r10] = r8     // Catch:{ Exception -> 0x02a7 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.z.a.f76943a     // Catch:{ Exception -> 0x02a7 }
            r14 = 1
            r15 = 63338(0xf76a, float:8.8755E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r1[r10] = r4     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a7 }
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x02a7 }
            goto L_0x012e
        L_0x0114:
            android.content.pm.ApplicationInfo r1 = r25.getApplicationInfo()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r1 = r1.className     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x012e }
            java.lang.Class[] r4 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x012e }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch:{ Exception -> 0x012e }
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x012e }
            java.lang.Object r1 = r1.newInstance(r4)     // Catch:{ Exception -> 0x012e }
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ Exception -> 0x012e }
            com.ss.android.ugc.aweme.z.a.f76944b = r1     // Catch:{ Exception -> 0x012e }
        L_0x012e:
            android.app.Application r1 = com.ss.android.ugc.aweme.z.a.f76944b     // Catch:{ Exception -> 0x02a7 }
            r4 = 4
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x02a7 }
            r11[r10] = r0     // Catch:{ Exception -> 0x02a7 }
            r11[r9] = r0     // Catch:{ Exception -> 0x02a7 }
            r5 = 2
            r11[r5] = r1     // Catch:{ Exception -> 0x02a7 }
            r6 = 0
            r7 = 3
            r11[r7] = r6     // Catch:{ Exception -> 0x02a7 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.z.a.f76943a     // Catch:{ Exception -> 0x02a7 }
            r14 = 1
            r15 = 63341(0xf76d, float:8.876E-41)
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<android.app.Application> r3 = android.app.Application.class
            r2[r9] = r3     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<android.app.Application> r3 = android.app.Application.class
            r2[r5] = r3     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r7] = r3     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a7 }
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x02a7 }
            if (r2 == 0) goto L_0x018c
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x02a7 }
            r11[r10] = r0     // Catch:{ Exception -> 0x02a7 }
            r11[r9] = r0     // Catch:{ Exception -> 0x02a7 }
            r11[r5] = r1     // Catch:{ Exception -> 0x02a7 }
            r11[r7] = r6     // Catch:{ Exception -> 0x02a7 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.z.a.f76943a     // Catch:{ Exception -> 0x02a7 }
            r14 = 1
            r15 = 63341(0xf76d, float:8.876E-41)
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r10] = r2     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r1[r9] = r2     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r1[r5] = r2     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r7] = r2     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a7 }
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x02a7 }
            goto L_0x01d3
        L_0x018c:
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Throwable -> 0x02a0 }
            java.lang.Object r3 = com.ss.android.ugc.aweme.z.a.a(r0, r2)     // Catch:{ Throwable -> 0x02a0 }
            java.lang.String r11 = "mInitialApplication"
            java.lang.reflect.Field r11 = r2.getDeclaredField(r11)     // Catch:{ Throwable -> 0x02a0 }
            r11.setAccessible(r9)     // Catch:{ Throwable -> 0x02a0 }
            java.lang.Object r12 = r11.get(r3)     // Catch:{ Throwable -> 0x02a0 }
            android.app.Application r12 = (android.app.Application) r12     // Catch:{ Throwable -> 0x02a0 }
            if (r1 == 0) goto L_0x01ac
            if (r12 != r0) goto L_0x01ac
            r11.set(r3, r1)     // Catch:{ Throwable -> 0x02a0 }
        L_0x01ac:
            if (r1 == 0) goto L_0x01d0
            java.lang.String r11 = "mAllApplications"
            java.lang.reflect.Field r11 = r2.getDeclaredField(r11)     // Catch:{ Throwable -> 0x02a0 }
            r11.setAccessible(r9)     // Catch:{ Throwable -> 0x02a0 }
            java.lang.Object r11 = r11.get(r3)     // Catch:{ Throwable -> 0x02a0 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ Throwable -> 0x02a0 }
            r12 = 0
        L_0x01be:
            int r13 = r11.size()     // Catch:{ Throwable -> 0x02a0 }
            if (r12 >= r13) goto L_0x01d0
            java.lang.Object r13 = r11.get(r12)     // Catch:{ Throwable -> 0x02a0 }
            if (r13 != r0) goto L_0x01cd
            r11.set(r12, r1)     // Catch:{ Throwable -> 0x02a0 }
        L_0x01cd:
            int r12 = r12 + 1
            goto L_0x01be
        L_0x01d0:
            com.ss.android.ugc.aweme.z.a.a(r0, r1, r6, r2, r3)     // Catch:{ Throwable -> 0x02a0 }
        L_0x01d3:
            android.content.Context r0 = r0.getBaseContext()     // Catch:{ Exception -> 0x02a7 }
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x02a7 }
            r11[r10] = r0     // Catch:{ Exception -> 0x02a7 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.z.a.f76943a     // Catch:{ Exception -> 0x02a7 }
            r14 = 1
            r15 = 63339(0xf76b, float:8.8757E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r10] = r2     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a7 }
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x02a7 }
            if (r1 == 0) goto L_0x020c
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x02a7 }
            r11[r10] = r0     // Catch:{ Exception -> 0x02a7 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.z.a.f76943a     // Catch:{ Exception -> 0x02a7 }
            r14 = 1
            r15 = 63339(0xf76b, float:8.8757E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1     // Catch:{ Exception -> 0x02a7 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02a7 }
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x02a7 }
            goto L_0x02a8
        L_0x020c:
            android.app.Application r1 = com.ss.android.ugc.aweme.z.a.f76944b     // Catch:{ Exception -> 0x02a7 }
            if (r1 == 0) goto L_0x02a8
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            android.app.Application r2 = com.ss.android.ugc.aweme.z.a.f76944b     // Catch:{ Exception -> 0x029a }
            java.lang.String r3 = "attach"
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x029a }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r6[r10] = r11     // Catch:{ Exception -> 0x029a }
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x029a }
            r11[r10] = r0     // Catch:{ Exception -> 0x029a }
            r0 = 5
            java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x029a }
            r12[r10] = r1     // Catch:{ Exception -> 0x029a }
            r12[r9] = r2     // Catch:{ Exception -> 0x029a }
            r12[r5] = r3     // Catch:{ Exception -> 0x029a }
            r12[r7] = r6     // Catch:{ Exception -> 0x029a }
            r12[r4] = r11     // Catch:{ Exception -> 0x029a }
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.z.a.f76943a     // Catch:{ Exception -> 0x029a }
            r21 = 1
            r22 = 63340(0xf76c, float:8.8758E-41)
            java.lang.Class[] r13 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.Class> r14 = java.lang.Class.class
            r13[r10] = r14     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            r13[r9] = r14     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r13[r5] = r14     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.Class[]> r14 = java.lang.Class[].class
            r13[r7] = r14     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.Object[]> r14 = java.lang.Object[].class
            r13[r4] = r14     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.Object> r24 = java.lang.Object.class
            r18 = r12
            r23 = r13
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x029a }
            if (r12 == 0) goto L_0x0290
            java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x029a }
            r12[r10] = r1     // Catch:{ Exception -> 0x029a }
            r12[r9] = r2     // Catch:{ Exception -> 0x029a }
            r12[r5] = r3     // Catch:{ Exception -> 0x029a }
            r12[r7] = r6     // Catch:{ Exception -> 0x029a }
            r12[r4] = r11     // Catch:{ Exception -> 0x029a }
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.z.a.f76943a     // Catch:{ Exception -> 0x029a }
            r21 = 1
            r22 = 63340(0xf76c, float:8.8758E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r0[r10] = r1     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r9] = r1     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r5] = r1     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.Class[]> r1 = java.lang.Class[].class
            r0[r7] = r1     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r0[r4] = r1     // Catch:{ Exception -> 0x029a }
            java.lang.Class<java.lang.Object> r24 = java.lang.Object.class
            r18 = r12
            r23 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x029a }
            java.lang.Object r0 = (java.lang.Object) r0     // Catch:{ Exception -> 0x029a }
            goto L_0x029a
        L_0x0290:
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r3, r6)     // Catch:{ Exception -> 0x029a }
            r0.setAccessible(r9)     // Catch:{ Exception -> 0x029a }
            r0.invoke(r2, r11)     // Catch:{ Exception -> 0x029a }
        L_0x029a:
            android.app.Application r0 = com.ss.android.ugc.aweme.z.a.f76944b     // Catch:{ Exception -> 0x02a7 }
            r0.onCreate()     // Catch:{ Exception -> 0x02a7 }
            goto L_0x02a8
        L_0x02a0:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x02a7 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x02a7 }
            throw r1     // Catch:{ Exception -> 0x02a7 }
        L_0x02a7:
        L_0x02a8:
            r0 = 2131493323(0x7f0c01cb, float:1.8610123E38)
            r8.setTheme(r0)
            super.onCreate(r26)
            com.ss.android.ugc.aweme.commercialize.splash.a r0 = com.ss.android.ugc.aweme.commercialize.splash.a.a()
            r0.j = r9
            com.ss.android.ugc.aweme.commercialize.splash.a r0 = com.ss.android.ugc.aweme.commercialize.splash.a.a()
            android.content.Intent r1 = r25.getIntent()
            r0.a((android.content.Intent) r1)
            boolean r0 = r25.isTaskRoot()
            if (r0 != 0) goto L_0x02d3
            r25.goMainActivity()
            java.lang.String r0 = "com.ss.android.ugc.aweme.splash.SplashActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        L_0x02d3:
            com.ss.android.ugc.aweme.app.d.b r0 = com.ss.android.ugc.aweme.app.d.b.a()
            r0.f34110b = r10
            r8.mAlive = r9
            r8.mFirstResume = r9
            r8.mJumped = r10
            r25.reportLaunchTime()
            r25.mobLaunchMob()
            com.ss.android.ugc.aweme.app.j r0 = com.ss.android.ugc.aweme.app.j.a()
            r0.f34191b = r10
            r25.calculateStartTime()
            com.ss.android.ugc.aweme.lego.a r0 = com.ss.android.ugc.aweme.lego.a.i
            com.ss.android.ugc.aweme.lego.a$f r0 = r0.a()
            com.ss.android.ugc.aweme.legoImp.task.UploadInstallEventTask r1 = new com.ss.android.ugc.aweme.legoImp.task.UploadInstallEventTask
            r1.<init>()
            com.ss.android.ugc.aweme.lego.a$f r0 = r0.a(r1)
            r0.a()
            android.content.Context r0 = r25.getApplicationContext()
            boolean r0 = com.ss.android.newmedia.BaseAppData.i(r0)
            r8.mAllowNetwork = r0
            android.content.Context r0 = r25.getApplicationContext()
            boolean r0 = com.ss.android.newmedia.BaseAppData.g(r0)
            r8.mConfirmPush = r0
            android.content.Context r0 = r25.getApplicationContext()
            boolean r0 = com.ss.android.newmedia.BaseAppData.h(r0)
            r8.mSelectCheckBox = r0
            boolean r0 = r8.mAllowNetwork
            if (r0 != 0) goto L_0x0328
            com.ss.android.newmedia.i r0 = sConfirmWelcomeType
            com.ss.android.newmedia.i r1 = com.ss.android.newmedia.i.NO_WELCOME
            if (r0 != r1) goto L_0x033e
        L_0x0328:
            com.ss.android.newmedia.i r0 = sConfirmWelcomeType
            com.ss.android.newmedia.i r1 = com.ss.android.newmedia.i.NO_WELCOME
            if (r0 != r1) goto L_0x0331
            r25.saveAllowNetwork()
        L_0x0331:
            r8.mTrackSession = r9
            boolean r0 = r8.mConfirmPush
            if (r0 == 0) goto L_0x033b
            r25.tryInit()
            goto L_0x033e
        L_0x033b:
            r25.tryShowNotifyDialog()
        L_0x033e:
            r25.hotStartIntercept()
            boolean r0 = r8.mJumped
            if (r0 != 0) goto L_0x0371
            boolean r0 = r8.mAllowNetwork
            if (r0 == 0) goto L_0x0371
            boolean r0 = r8.mConfirmPush
            if (r0 == 0) goto L_0x0371
            r25.tryInit()
            boolean r0 = r25.quickLaunch()
            if (r0 != 0) goto L_0x0371
            android.content.Context r0 = r25.getApplicationContext()
            com.ss.android.ad.splash.l r0 = com.ss.android.ugc.aweme.splash.SplashAdManagerHolder.a((android.content.Context) r0)
            com.ss.android.ad.splash.m r0 = r0.d()
            r8.splashAdNative = r0
            com.ss.android.ad.splash.m r0 = r8.splashAdNative
            com.ss.android.ugc.aweme.splash.SplashActivity$b r1 = new com.ss.android.ugc.aweme.splash.SplashActivity$b
            r1.<init>(r8)
            r0.a((com.ss.android.ad.splash.c) r1)
            r25.tryShowShortCutDlg()
        L_0x0371:
            com.ss.android.ugc.aweme.lego.a r0 = com.ss.android.ugc.aweme.lego.a.i
            com.ss.android.ugc.aweme.lego.a$f r0 = r0.a()
            com.ss.android.ugc.aweme.legoImp.task.AntispamApiUploadTask r1 = new com.ss.android.ugc.aweme.legoImp.task.AntispamApiUploadTask
            r1.<init>()
            com.ss.android.ugc.aweme.lego.a$f r0 = r0.a(r1)
            r0.a()
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x038c
            r25.initDouDouService()
        L_0x038c:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x03a7
            java.lang.String r0 = "sys_status"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "voiceover"
            boolean r3 = android.support.v4.app.AccessibilityUtil.isAccessibilityEnabled(r25)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (int) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
        L_0x03a7:
            com.ss.android.ugc.aweme.feed.ag r0 = com.ss.android.ugc.aweme.feed.ag.i()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ag.f3141a
            r14 = 0
            r15 = 40159(0x9cdf, float:5.6275E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x03d3
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.ag.f3141a
            r14 = 0
            r15 = 40159(0x9cdf, float:5.6275E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03e5
        L_0x03d3:
            long r1 = r0.h
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x03df
            r0.h()
            goto L_0x03e5
        L_0x03df:
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.h = r1
        L_0x03e5:
            java.lang.String r0 = "com.ss.android.ugc.aweme.splash.SplashActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.splash.SplashActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$showConfirmUseNetworkDlg$0$SplashActivity(CompoundButton compoundButton, boolean z) {
        BaseAppData.a(getApplicationContext(), z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$showConfirmUseNetworkDlg$2$SplashActivity(CompoundButton compoundButton, boolean z) {
        BaseAppData.a(getApplicationContext(), z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$tryShowNotifyDialog$5$SplashActivity(DialogInterface dialogInterface, int i) {
        com.ss.android.di.push.a.a().setNotifyEnabled(this, true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$tryShowNotifyDialog$6$SplashActivity(DialogInterface dialogInterface, int i) {
        com.ss.android.di.push.a.a().setNotifyEnabled(this, false);
    }

    static final /* synthetic */ void lambda$showConfirmUseNetworkDlg$1$SplashActivity(a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.a();
        }
    }

    static final /* synthetic */ void lambda$showConfirmUseNetworkDlg$3$SplashActivity(Dialog dialog, a aVar, View view) {
        l.a(dialog);
        if (aVar != null) {
            aVar.b();
        }
    }

    static final /* synthetic */ void lambda$showConfirmUseNetworkDlg$4$SplashActivity(Dialog dialog, a aVar, View view) {
        l.a(dialog);
        if (aVar != null) {
            aVar.a();
        }
    }

    public boolean tryOpenByScheme(String str, String str2, long j, String str3, m mVar) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2), str3, mVar}, this, changeQuickRedirect, false, 81823, new Class[]{String.class, String.class, Long.TYPE, String.class, m.class}, Boolean.TYPE)) {
            Object[] objArr = {str, str2, new Long(j2), str3, mVar};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 81823, new Class[]{String.class, String.class, Long.TYPE, String.class, m.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.util.c.a("openSplashScheme: from = SplashActivity");
        return o.a(this, str, str2, j, str3, mVar);
    }
}
