package com.ss.android.ugc.aweme.tile;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import android.support.annotation.RequiresApi;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ag;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/tile/PublishTileService;", "Landroid/service/quicksettings/TileService;", "()V", "onClick", "", "onCreate", "onStartListening", "onTileAdded", "onTileRemoved", "updateState", "state", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@RequiresApi(api = 24)
public final class PublishTileService extends TileService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74591a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f74592b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/tile/PublishTileService$Companion;", "", "()V", "PUBLISH_TILE_EVENT_ADD", "", "PUBLISH_TILE_EVENT_REMOVE", "PUBLISH_TILE_EVENT_START_AFTER_APPLICATION", "PUBLISH_TILE_EVENT_START_ONCLICK", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onTileAdded() {
        if (PatchProxy.isSupport(new Object[0], this, f74591a, false, 86935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74591a, false, 86935, new Class[0], Void.TYPE);
            return;
        }
        super.onTileAdded();
        r.a("add_to_notificationbar", (Map) d.a().f34114b);
    }

    public final void onTileRemoved() {
        if (PatchProxy.isSupport(new Object[0], this, f74591a, false, 86936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74591a, false, 86936, new Class[0], Void.TYPE);
            return;
        }
        super.onTileRemoved();
        r.a("delete_from_notificationbar", (Map) d.a().f34114b);
    }

    public final void onClick() {
        if (PatchProxy.isSupport(new Object[0], this, f74591a, false, 86939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74591a, false, 86939, new Class[0], Void.TYPE);
            return;
        }
        super.onClick();
        int appId = AppLog.getAppId();
        if (appId <= 0) {
            appId = 1128;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(e.f34153c + appId + "://openRecord?recordParam=withStickerPanel&_t=" + System.currentTimeMillis()));
        try {
            intent.addFlags(268435456);
            intent.putExtra("from_tile_service", true);
            startActivityAndCollapse(intent);
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2);
        }
        r.a("click_shoot_notificationbar", (Map) d.a().f34114b);
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f74591a, false, 86934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74591a, false, 86934, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        long uptimeMillis = SystemClock.uptimeMillis();
        ag i = ag.i();
        Intrinsics.checkExpressionValueIsNotNull(i, "FirstFeedShowTimeHelper.get()");
        long j = uptimeMillis - i.f3146f;
        if (j <= 1000) {
            r.a("active_in_notificationbar", (Map) d.a().a("time", j).f34114b);
        }
    }

    public final void onStartListening() {
        if (PatchProxy.isSupport(new Object[0], this, f74591a, false, 86937, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74591a, false, 86937, new Class[0], Void.TYPE);
            return;
        }
        super.onStartListening();
        if (PatchProxy.isSupport(new Object[]{1}, this, f74591a, false, 86938, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1}, this, f74591a, false, 86938, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            qsTile.setState(1);
        }
        if (qsTile != null) {
            qsTile.updateTile();
        }
    }
}
