package com.bytedance.android.livesdk.x.a;

import android.content.Context;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import com.bytedance.android.livesdk.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.livesdk.chatroom.model.Game;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.widget.aa;
import com.bytedance.android.livesdkapi.depend.model.live.a;
import com.bytedance.android.livesdkapi.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18592a;

    /* renamed from: b  reason: collision with root package name */
    private Game f18593b;

    /* renamed from: c  reason: collision with root package name */
    private aa f18594c;

    /* renamed from: d  reason: collision with root package name */
    private a f18595d;

    public final void a(f.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f18592a, false, 13335, new Class[]{f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f18592a, false, 13335, new Class[]{f.a.class}, Void.TYPE);
            return;
        }
        if (this.f18595d == a.SCREEN_RECORD) {
            Context context = aVar.b().f18760a;
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f18593b == null) {
                    if (this.f18594c != null) {
                        aa aaVar = this.f18594c;
                        if (PatchProxy.isSupport(new Object[0], aaVar, aa.f18400a, false, 14677, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], aaVar, aa.f18400a, false, 14677, new Class[0], Void.TYPE);
                            return;
                        }
                        ai.a((int) C0906R.string.dk_);
                        aaVar.f18404e.performClick();
                    }
                    return;
                } else if (BgBroadcastServiceImpl.getProjection() == null) {
                    MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
                    if (mediaProjectionManager == null) {
                        ai.a((int) C0906R.string.dk8);
                        return;
                    } else {
                        aVar.b().f18761b.startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 20001);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        aVar.a();
    }

    public final void a(Game game, aa aaVar, a aVar) {
        this.f18593b = game;
        this.f18594c = aaVar;
        this.f18595d = aVar;
    }
}
