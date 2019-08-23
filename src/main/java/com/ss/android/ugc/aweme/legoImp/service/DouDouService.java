package com.ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import android.hardware.SensorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.common.l;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.LegoService;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.services.IAVService;
import org.jetbrains.annotations.NotNull;

public class DouDouService implements LegoService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private l douDetector;
    public a listener;
    private l.b onDouListener;

    class EnsureDouDetectorTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public f type() {
            return f.BACKGROUND;
        }

        EnsureDouDetectorTask() {
        }

        public void run(@NotNull Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55221, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55221, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.framework.a.a.a("EnsureDouDetectorTask");
            if (DouDouService.this.switchDouDetectorBySetting(context)) {
                DouDouService.this.onResume();
            }
        }
    }

    public interface a {
        boolean a();
    }

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    public void onDestroy() {
        if (this.listener != null) {
            this.listener = null;
        }
        if (this.onDouListener != null) {
            this.onDouListener = null;
        }
    }

    public void ensureDouDetector() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55215, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55215, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.lego.a.i.a().a(new EnsureDouDetectorTask()).a();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55218, new Class[0], Void.TYPE);
            return;
        }
        if (this.douDetector != null) {
            this.douDetector.b();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55217, new Class[0], Void.TYPE);
            return;
        }
        if (this.douDetector != null) {
            l lVar = this.douDetector;
            if (PatchProxy.isSupport(new Object[0], lVar, l.f40244a, false, 33281, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], lVar, l.f40244a, false, 33281, new Class[0], Void.TYPE);
            } else if (lVar.f40247d != null) {
                SensorManager sensorManager = lVar.f40246c;
                if (sensorManager != null) {
                    sensorManager.registerListener(lVar, lVar.f40247d, 2);
                }
                lVar.a();
                com.ss.android.ugc.aweme.common.a.a aVar = lVar.f40249f;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public void setDouDouListener(a aVar) {
        this.listener = aVar;
    }

    public void enableDouDetection(boolean z) {
        if (this.douDetector != null) {
            this.douDetector.f40245b = z;
        }
    }

    public void init(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55213, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55213, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("DouDouService");
        initDouDetectorAndActivityMonitor(context);
    }

    private void initDouDetectorAndActivityMonitor(final Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55214, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55214, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.onDouListener == null) {
            this.onDouListener = new l.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53111a;

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f53111a, false, 55220, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f53111a, false, 55220, new Class[0], Void.TYPE);
                        return;
                    }
                    DouDouService.this.switchDouDetectorBySetting(context);
                }

                public final boolean a() {
                    if (PatchProxy.isSupport(new Object[0], this, f53111a, false, 55219, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53111a, false, 55219, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (!DouDouService.this.switchDouDetectorBySetting(context) || DouDouService.this.listener == null) {
                        return false;
                    } else {
                        return DouDouService.this.listener.a();
                    }
                }
            };
        }
        this.douDetector = new l(context, this.onDouListener);
    }

    public boolean switchDouDetectorBySetting(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55216, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55216, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!((IAVService) ServiceManager.get().getService(IAVService.class)).storySettingService().getStorySettingDoudouSwitch() || MainPageExperimentHelper.d() || TimeLockRuler.isTeenModeON() || com.ss.android.ugc.aweme.main.g.a.c() || b.i()) {
            if (this.douDetector != null) {
                this.douDetector.b();
                this.douDetector = null;
            }
            return false;
        } else {
            if (this.douDetector == null) {
                initDouDetectorAndActivityMonitor(context);
            }
            return true;
        }
    }
}
