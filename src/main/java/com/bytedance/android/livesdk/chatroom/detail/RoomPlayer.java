package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.TextureView;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

@Keep
public class RoomPlayer {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a mAudioFocusController;
    private final a mCallback;
    private final Context mContext;
    @DecodeStatus
    private int mDecodeStatus;
    private com.bytedance.android.livesdk.player.a mLivePlayController;
    private String mMediaErrorMessage;
    private f.a mSrConfig;
    private boolean mStopOnPlayingOther;
    private final com.bytedance.android.livesdkapi.depend.model.live.a mStreamType;
    private String mStreamUrl;
    private final TextureView mTextureView;
    private final String sdkParams;

    public @interface DecodeStatus {
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9908a = new int[g.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.android.livesdkapi.depend.d.g$b[] r0 = com.bytedance.android.livesdkapi.depend.d.g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9908a = r0
                int[] r0 = f9908a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.COMPLETE_PLAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f9908a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f9908a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.DISPLAYED_PLAY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f9908a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.STOP_WHEN_PLAYING_OTHER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f9908a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.STOP_WHEN_JOIN_INTERACT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f9908a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.INTERACT_SEI     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f9908a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.BUFFERING_START     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f9908a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.BUFFERING_END     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f9908a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.VIDEO_SIZE_CHANGED     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer.AnonymousClass1.<clinit>():void");
        }
    }

    public interface a {
        void a(int i, int i2);

        void a(Exception exc);

        void a(Object obj);

        void j();

        void k();

        void l();

        void m();
    }

    @DecodeStatus
    public int getDecodeStatus() {
        return this.mDecodeStatus;
    }

    public String getMediaErrorMessage() {
        return this.mMediaErrorMessage;
    }

    public long getAudioLostFocusTime() {
        if (this.mAudioFocusController == null) {
            return -1;
        }
        return this.mAudioFocusController.f9912d;
    }

    public void onBackground() {
        if (this.mAudioFocusController != null) {
            this.mAudioFocusController.f9911c = true;
        }
    }

    public boolean isVideoHorizontal() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 4111, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 4111, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mLivePlayController != null && this.mLivePlayController.a()) {
            z = true;
        }
        return z;
    }

    public void onForeground() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 4107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 4107, new Class[0], Void.TYPE);
        } else if (this.mAudioFocusController != null) {
            this.mAudioFocusController.f9911c = false;
            this.mAudioFocusController.a(this.mContext);
        }
    }

    public boolean tryResumePlay() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 4106, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 4106, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.mStopOnPlayingOther) {
            return false;
        } else {
            this.mStopOnPlayingOther = false;
            doStartPlay();
            return true;
        }
    }

    private void doStartPlay() {
        g.d a2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 4112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 4112, new Class[0], Void.TYPE);
            return;
        }
        this.mAudioFocusController.a(this.mContext);
        try {
            com.bytedance.android.livesdk.player.a aVar = this.mLivePlayController;
            String str = this.mStreamUrl;
            TextureView textureView = this.mTextureView;
            int ordinal = this.mStreamType.ordinal();
            if (this.mSrConfig == null) {
                a2 = null;
            } else {
                a2 = g.d.a().a(this.mSrConfig.f18732a).b(this.mSrConfig.f18733b).a(this.mSrConfig.f18734c).a();
            }
            aVar.a(str, textureView, ordinal, a2, new h(this), this.sdkParams);
        } catch (Exception e2) {
            this.mCallback.a(e2);
        }
    }

    public boolean start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 4102, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 4102, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mLivePlayController != null) {
            return true;
        } else {
            if (TextUtils.isEmpty(this.mStreamUrl)) {
                return false;
            }
            this.mLivePlayController = j.q().a();
            this.mAudioFocusController = new a(this.mLivePlayController);
            doStartPlay();
            return true;
        }
    }

    public void stopWhenJoinInteract(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 4104, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 4104, new Class[]{Context.class}, Void.TYPE);
        } else if (this.mLivePlayController != null) {
            this.mLivePlayController.b(context);
        }
    }

    public void stopWhenPlayingOther(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 4105, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 4105, new Class[]{Context.class}, Void.TYPE);
        } else if (this.mLivePlayController != null) {
            this.mLivePlayController.f(context);
        }
    }

    public void getVideoSize(int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{iArr}, this, changeQuickRedirect, false, 4110, new Class[]{int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iArr}, this, changeQuickRedirect, false, 4110, new Class[]{int[].class}, Void.TYPE);
        } else if (this.mLivePlayController != null && iArr != null) {
            int e2 = this.mLivePlayController.e();
            iArr[0] = 65535 & e2;
            iArr[1] = e2 >> 16;
        }
    }

    public void setAnchorInteractMode(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 4108, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 4108, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mLivePlayController != null) {
            this.mLivePlayController.a(z);
        }
    }

    public void setMute(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 4113, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 4113, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mLivePlayController != null) {
            this.mLivePlayController.a(z, this.mContext);
        }
    }

    public void setScreenOrientation(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 4109, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 4109, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mLivePlayController != null) {
            this.mLivePlayController.b(z);
        }
    }

    public void stop(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 4103, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 4103, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mAudioFocusController != null) {
            if (z) {
                this.mAudioFocusController.b(this.mContext);
            } else {
                this.mAudioFocusController.a();
            }
            this.mAudioFocusController = null;
        }
        if (this.mLivePlayController != null) {
            this.mLivePlayController.a(this.mContext);
            if (z) {
                this.mLivePlayController.e(this.mContext);
            }
            this.mLivePlayController = null;
        }
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doStartPlay$0$RoomPlayer(g.b bVar, Object obj) {
        if (this.mAudioFocusController != null && this.mLivePlayController != null) {
            switch (AnonymousClass1.f9908a[bVar.ordinal()]) {
                case 1:
                    this.mCallback.j();
                    return;
                case 2:
                    this.mCallback.j();
                    if (this.mDecodeStatus != 1) {
                        this.mDecodeStatus = 2;
                    }
                    if (obj != null) {
                        this.mMediaErrorMessage = obj.toString();
                        return;
                    }
                    break;
                case 3:
                    this.mDecodeStatus = 1;
                    this.mAudioFocusController.a(this.mContext);
                    this.mCallback.k();
                    return;
                case 4:
                    this.mStopOnPlayingOther = true;
                    this.mAudioFocusController.b(this.mContext);
                    return;
                case 5:
                    this.mStopOnPlayingOther = true;
                    return;
                case 6:
                    this.mCallback.a(obj);
                    return;
                case e.l /*?: ONE_ARG  (7 int)*/:
                    this.mCallback.l();
                    return;
                case 8:
                    this.mCallback.m();
                    return;
                case 9:
                    int parseInt = Integer.parseInt((String) obj);
                    this.mCallback.a(65535 & parseInt, parseInt >> 16);
                    break;
            }
        }
    }

    public RoomPlayer(String str, com.bytedance.android.livesdkapi.depend.model.live.a aVar, @Nullable f.a aVar2, TextureView textureView, a aVar3, Context context, String str2) {
        this.mStreamUrl = str;
        this.mSrConfig = aVar2;
        this.mStreamType = aVar;
        this.mTextureView = textureView;
        this.mCallback = aVar3;
        this.mContext = context;
        this.sdkParams = str2;
    }
}
