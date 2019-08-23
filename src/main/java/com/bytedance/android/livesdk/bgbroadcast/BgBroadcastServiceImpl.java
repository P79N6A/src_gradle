package com.bytedance.android.livesdk.bgbroadcast;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.projection.MediaProjection;
import android.support.annotation.Keep;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.live.a.c.b;
import com.bytedance.android.livesdkapi.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class BgBroadcastServiceImpl extends com.bytedance.android.livesdkapi.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static MediaProjection sProjection;
    private a mLiveStatus;
    private Room mRoom;
    private b mStatusReport;
    private com.ss.ugc.live.c.a.c.b mStatusService;
    private a mStrategy;
    private Service mStub;
    private a.C0130a mUiListener;

    enum a {
        IDLE,
        LIVING,
        FINISHED;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, changeQuickRedirect, false, 3274, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, changeQuickRedirect, false, 3274, new Class[]{Configuration.class}, Void.TYPE);
        }
    }

    public static MediaProjection getProjection() {
        return sProjection;
    }

    public boolean isLiveFinished() {
        if (this.mLiveStatus == a.FINISHED) {
            return true;
        }
        return false;
    }

    public void startAudio() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3278, new Class[0], Void.TYPE);
            return;
        }
        this.mStrategy.b();
    }

    public void stopAudio() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3279, new Class[0], Void.TYPE);
            return;
        }
        this.mStrategy.c();
    }

    public void stopService() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3280, new Class[0], Void.TYPE);
            return;
        }
        this.mStub.stopSelf();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3273, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3273, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStatusReport != null) {
            this.mStatusReport.a();
        }
        stopStream(1, true);
        this.mRoom = null;
        TTLiveSDKContext.getLiveService().d().a((Room) null);
        this.mStatusService = null;
        this.mLiveStatus = a.IDLE;
        if (this.mStrategy != null) {
            this.mStrategy.g();
            this.mStrategy = null;
        }
        this.mUiListener = null;
        sProjection = null;
    }

    public void startBgActivity() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3281, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStub != null) {
            Intent intent = new Intent(this.mStub, TTLiveSDKContext.getHostService().c().a(6));
            intent.addFlags(268435456);
            ac.e().startActivity(intent);
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3272, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3272, new Class[0], Void.TYPE);
        } else if (TTLiveSDKContext.getHostService() == null) {
            this.mStub.stopSelf();
        } else {
            this.mRoom = TTLiveSDKContext.getLiveService().d().a();
            if (!Room.isValid(this.mRoom)) {
                this.mStub.stopSelf();
                return;
            }
            this.mStatusReport = new b(this.mRoom);
            this.mStatusReport.f15790b = new l(this);
            this.mStatusService = new com.ss.ugc.live.c.a.c.b(this.mStatusReport);
            this.mLiveStatus = a.IDLE;
            if (this.mRoom.isScreenshot) {
                this.mStrategy = new com.bytedance.android.livesdk.bgbroadcast.game.a(this.mStub, this.mRoom);
                sProjection = null;
            } else {
                this.mStrategy = new com.bytedance.android.livesdk.bgbroadcast.a.a();
            }
            this.mStrategy.f9164a = new m(this);
        }
    }

    public static void setProjection(MediaProjection mediaProjection) {
        sProjection = mediaProjection;
    }

    public void bindService(Service service) {
        this.mStub = service;
    }

    public void setLiveStatusListener(a.C0130a aVar) {
        this.mUiListener = aVar;
    }

    public void unBindService(Service service) {
        this.mStub = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$1$BgBroadcastServiceImpl(int i) {
        stopStream(i, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$0$BgBroadcastServiceImpl(int i) {
        if (i == 30001 || i == 50002 || i == 30003) {
            stopStream(1, false);
            if (this.mUiListener != null) {
                this.mUiListener.a();
            }
        }
    }

    public boolean startStream(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 3276, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 3276, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.mLiveStatus == a.LIVING) {
            return true;
        } else {
            if (this.mStrategy == null || !this.mStrategy.a(z)) {
                return false;
            }
            this.mStatusService.a();
            this.mLiveStatus = a.LIVING;
            return true;
        }
    }

    public void stopStream(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3277, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3277, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        stopStream(i, false);
    }

    private void stopStream(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 3282, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, changeQuickRedirect, false, 3282, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.mLiveStatus == a.LIVING) {
            this.mStrategy.a();
            this.mStatusService.a(i);
            this.mLiveStatus = a.FINISHED;
        }
    }

    public void setData(Intent intent, boolean z) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 3275, new Class[]{Intent.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 3275, new Class[]{Intent.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setData(intent, z);
        this.mStrategy.a(intent2, z);
    }
}
