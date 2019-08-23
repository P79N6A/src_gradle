package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.t;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.chatroom.bl.d;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.f;
import com.bytedance.android.livesdk.gift.assets.g;
import com.bytedance.android.livesdk.gift.assets.h;
import com.bytedance.android.livesdk.gift.effect.video.VideoGiftView;
import com.bytedance.android.livesdk.gift.l;
import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.message.model.ab;
import com.bytedance.android.livesdk.utils.ac;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.d.a.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.h.e;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoGiftWidget extends LiveRecyclableWidget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12859a;
    private static final int i = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.a()).intValue();

    /* renamed from: b  reason: collision with root package name */
    final h f12860b = f.a("effects");

    /* renamed from: c  reason: collision with root package name */
    public VideoGiftView f12861c;

    /* renamed from: d  reason: collision with root package name */
    public List<com.bytedance.android.livesdk.gift.effect.b.a> f12862d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12863e;

    /* renamed from: f  reason: collision with root package name */
    public a f12864f = new a(this, (byte) 0);
    public com.bytedance.android.livesdk.gift.effect.b.a g;
    c h = new c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12872a;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f12872a, false, 7573, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12872a, false, 7573, new Class[0], Void.TYPE);
                return;
            }
            if (VideoGiftWidget.this.f12861c != null) {
                VideoGiftWidget.this.f12861c.setVisibility(4);
                VideoGiftWidget.this.f12861c.a();
            }
            VideoGiftWidget.this.f12863e = false;
            a(false, true);
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f12872a, false, 7574, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12872a, false, 7574, new Class[0], Void.TYPE);
                return;
            }
            if (VideoGiftWidget.this.f12861c != null) {
                VideoGiftWidget.this.f12861c.setVisibility(4);
                VideoGiftWidget.this.f12861c.a();
            }
            VideoGiftWidget.this.f12863e = false;
            a(false, true);
            VideoGiftWidget.this.a();
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f12872a, false, 7572, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12872a, false, 7572, new Class[0], Void.TYPE);
            } else if (VideoGiftWidget.this.f12861c != null) {
                VideoGiftWidget.this.f12861c.setVisibility(0);
                VideoGiftView videoGiftView = VideoGiftWidget.this.f12861c;
                if (PatchProxy.isSupport(new Object[0], videoGiftView, VideoGiftView.f14964a, false, 9622, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], videoGiftView, VideoGiftView.f14964a, false, 9622, new Class[0], Void.TYPE);
                } else if (videoGiftView.g.m) {
                    videoGiftView.f14965b.setVisibility(0);
                    videoGiftView.f14965b.a(0);
                }
                VideoGiftView videoGiftView2 = VideoGiftWidget.this.f12861c;
                if (PatchProxy.isSupport(new Object[0], videoGiftView2, VideoGiftView.f14964a, false, 9621, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], videoGiftView2, VideoGiftView.f14964a, false, 9621, new Class[0], Void.TYPE);
                } else if (videoGiftView2.h != null) {
                    videoGiftView2.f14967d.setVisibility(0);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(videoGiftView2.f14967d, "alpha", new float[]{0.0f, 0.0f}).setDuration(videoGiftView2.h.f16584d);
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(videoGiftView2.f14967d, "alpha", new float[]{0.0f, 1.0f}).setDuration(500);
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(videoGiftView2.f14967d, "alpha", new float[]{1.0f, 1.0f}).setDuration(videoGiftView2.h.f16585e - 500);
                    ObjectAnimator duration4 = ObjectAnimator.ofFloat(videoGiftView2.f14967d, "alpha", new float[]{1.0f, 0.0f}).setDuration(500);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(new Animator[]{duration, duration2, duration3, duration4});
                    animatorSet.start();
                }
                a(true, false);
            }
        }

        private void a(boolean z, boolean z2) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f12872a, false, 7575, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f12872a, false, 7575, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (!(VideoGiftWidget.this.g == null || VideoGiftWidget.this.g.g == null || VideoGiftWidget.this.g.g.getId() != ((com.bytedance.android.live.e.a) b.a(com.bytedance.android.live.e.a.class)).user().b())) {
                d.INSTANCE.setBigGiftPlayStateEvent(z, z2, VideoGiftWidget.this.g);
            }
        }

        public final void a(float f2, float f3, float f4, float f5) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f12872a, false, 7571, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f12872a, false, 7571, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            if (VideoGiftWidget.this.f12861c != null) {
                VideoGiftView videoGiftView = VideoGiftWidget.this.f12861c;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, videoGiftView, VideoGiftView.f14964a, false, 9619, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                    VideoGiftView videoGiftView2 = videoGiftView;
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, videoGiftView2, VideoGiftView.f14964a, false, 9619, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
                } else if (videoGiftView.h != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) videoGiftView.f14967d.getLayoutParams();
                    layoutParams.width = (int) ((((float) videoGiftView.h.h) / 10000.0f) * f2);
                    layoutParams.height = (int) ((((float) videoGiftView.h.i) / 10000.0f) * f3);
                    videoGiftView.f14967d.setLayoutParams(layoutParams);
                    videoGiftView.f14967d.setX(((((float) videoGiftView.h.f16586f) / 10000.0f) * f2) + f4);
                    videoGiftView.f14967d.setY(((((float) videoGiftView.h.g) / 10000.0f) * f3) + f5);
                    videoGiftView.f14968e.setTextSize(0, UIUtils.dip2Px(videoGiftView.getContext(), (float) (videoGiftView.h.f16582b / 100)));
                    if (!StringUtils.isEmpty(videoGiftView.h.m)) {
                        try {
                            videoGiftView.f14968e.setShadowLayer((float) ac.a((float) (videoGiftView.h.l / 100)), (float) ac.a((float) (videoGiftView.h.j / 100)), (float) ac.a((float) (videoGiftView.h.k / 100)), Color.parseColor(videoGiftView.h.m));
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    e eVar = videoGiftView.h.f16581a;
                    if (PatchProxy.isSupport(new Object[]{eVar}, videoGiftView, VideoGiftView.f14964a, false, 9620, new Class[]{e.class}, Void.TYPE)) {
                        VideoGiftView videoGiftView3 = videoGiftView;
                        PatchProxy.accessDispatch(new Object[]{eVar}, videoGiftView3, VideoGiftView.f14964a, false, 9620, new Class[]{e.class}, Void.TYPE);
                    } else if (eVar != null) {
                        videoGiftView.f14968e.setText(((com.bytedance.android.live.room.c) b.a(com.bytedance.android.live.room.c.class)).parsePatternAndGetSpannable(eVar.f18783b, eVar));
                    }
                    if (videoGiftView.h.f16583c == null) {
                        videoGiftView.f14969f.setVisibility(8);
                    } else {
                        com.bytedance.android.live.core.utils.fresco.a.a(videoGiftView.getContext()).a(videoGiftView.h.f16583c).a(ImageView.ScaleType.FIT_XY).a(videoGiftView.f14969f);
                        videoGiftView.f14969f.setVisibility(0);
                    }
                }
            }
        }
    };
    private Room j;
    private com.bytedance.android.livesdk.utils.ac<com.bytedance.android.livesdk.gift.effect.b.a> k;
    private long l;
    private long m;
    private ac.a n = new ac.a<com.bytedance.android.livesdk.gift.effect.b.a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12865a;

        public final /* synthetic */ boolean a(Object obj, Object obj2) {
            com.bytedance.android.livesdk.gift.effect.b.a aVar = (com.bytedance.android.livesdk.gift.effect.b.a) obj;
            com.bytedance.android.livesdk.gift.effect.b.a aVar2 = (com.bytedance.android.livesdk.gift.effect.b.a) obj2;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{aVar, aVar2}, this, f12865a, false, 7567, new Class[]{com.bytedance.android.livesdk.gift.effect.b.a.class, com.bytedance.android.livesdk.gift.effect.b.a.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar, aVar2}, this, f12865a, false, 7567, new Class[]{com.bytedance.android.livesdk.gift.effect.b.a.class, com.bytedance.android.livesdk.gift.effect.b.a.class}, Boolean.TYPE)).booleanValue();
            }
            if (aVar.f14781c == aVar2.f14781c) {
                if (VideoGiftWidget.this.f12862d.indexOf(aVar) <= VideoGiftWidget.this.f12862d.indexOf(aVar2)) {
                    return false;
                }
                z = true;
            } else if (aVar.f14781c < aVar2.f14781c) {
                return true;
            }
            return z;
        }
    };
    private com.bytedance.android.livesdkapi.depend.d.a.d o = new com.bytedance.android.livesdkapi.depend.d.a.d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12874a;

        public final void a(boolean z, int i, int i2, String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f12874a, false, 7576, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f12874a, false, 7576, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            a aVar = VideoGiftWidget.this.f12864f;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), str2}, aVar, a.f12876a, false, 7578, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), str2}, aVar2, a.f12876a, false, 7578, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            long j = -1;
            String str3 = "";
            if (aVar.f12877b != null) {
                j = aVar.f12877b.getId();
                if (aVar.f12877b.getResourceModel() != null && !t.a(aVar.f12877b.getResourceModel().f14743a)) {
                    str3 = aVar.f12877b.getResourceModel().f14743a.get(0);
                }
            }
            new com.bytedance.android.livesdk.j.h().a("gift_id", (Object) Long.valueOf(j)).a("gift_resource", (Object) str3).a(PushConstants.EXTRA, (Object) Integer.valueOf(i2)).a("code", (Object) Integer.valueOf(i)).a("error_info", (Object) str2).a("hotsoon_live_video_gift_play_success_rate", z ^ true ? 1 : 0);
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "VIDEO_GIFT_PLAY_SUCCESS_RATE");
            hashMap.put("gift_id", Long.valueOf(j));
            hashMap.put("gift_resource", str3);
            hashMap.put(PushConstants.EXTRA, Integer.valueOf(i2));
            hashMap.put("code", Integer.valueOf(i));
            hashMap.put("error_info", str2);
            com.bytedance.android.livesdk.j.c.b().a("ttlive_gift", (Map<String, Object>) hashMap);
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z), new Long(j), str3, Integer.valueOf(i), str2, Integer.valueOf(i2)}, null, o.f15142a, true, 9302, new Class[]{Boolean.TYPE, Long.TYPE, String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j), str3, Integer.valueOf(i), str2, Integer.valueOf(i2)}, null, o.f15142a, true, 9302, new Class[]{Boolean.TYPE, Long.TYPE, String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("gift_id", Long.valueOf(j));
            hashMap2.put(PushConstants.WEB_URL, str3);
            hashMap2.put("error_code", Integer.valueOf(i));
            hashMap2.put("error_msg", str2);
            hashMap2.put("asset_show_extra", Integer.valueOf(i2));
            if (z) {
                com.bytedance.android.live.core.d.e.a(o.a("ttlive_gift_asset_show_status"), 0, (Map<String, Object>) hashMap2);
                return;
            }
            com.bytedance.android.live.core.d.e.a(o.a("ttlive_gift_asset_show_status"), 1, (Map<String, Object>) hashMap2);
            com.bytedance.android.live.core.d.e.a(o.b("ttlive_gift_asset_show_status"), 1, (Map<String, Object>) hashMap2);
            com.bytedance.android.livesdk.j.a.a.a().a(com.bytedance.android.livesdk.j.a.b.Gift.info, "ttlive_gift_asset_show_status", 1, (Map) hashMap2);
        }
    };

    class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12876a;

        /* renamed from: b  reason: collision with root package name */
        AssetsModel f12877b;

        private a() {
        }

        /* access modifiers changed from: package-private */
        public final void a(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f12876a, false, 7577, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f12876a, false, 7577, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            this.f12877b = ((IGiftService) b.a(IGiftService.class)).getAssets("effects", j2);
        }

        /* synthetic */ a(VideoGiftWidget videoGiftWidget, byte b2) {
            this();
        }
    }

    public int getLayoutId() {
        return C0906R.layout.anw;
    }

    public void onInit(@Nullable Object[] objArr) {
    }

    public final void a(String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8}, this, f12859a, false, 7566, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, str7, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f12859a, false, 7566, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str5);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("gift_id", str6);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("msg_id", str7);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("asset_id", str8);
        }
        com.bytedance.android.livesdk.j.c.b().c("ttlive_gift", hashMap);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f12859a, false, 7563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12859a, false, 7563, new Class[0], Void.TYPE);
            return;
        }
        this.f12862d.clear();
        this.k.b();
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12859a, false, 7552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12859a, false, 7552, new Class[0], Void.TYPE);
            return;
        }
        this.f12860b.a();
        this.f12863e = false;
        this.l = 0;
        this.m = 0;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f12859a, false, 7559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12859a, false, 7559, new Class[0], Void.TYPE);
        } else if (!this.f12862d.isEmpty() && !this.f12863e) {
            com.bytedance.android.livesdk.gift.effect.b.a remove = this.f12862d.remove(0);
            this.g = remove;
            this.k.a(remove);
            AssetsModel c2 = this.f12860b.c(remove.f14780b);
            if (c2 == null) {
                a("特效列表找不到该Id", String.valueOf(remove.j), String.valueOf(remove.f14779a), null);
                a((int) C0906R.string.d3u);
            } else if (c2.getResourceType() != 4) {
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "特效资源类型有误");
                hashMap.put("asset_type", Integer.valueOf(c2.getResourceType()));
                hashMap.put("asset_id", Long.valueOf(remove.f14780b));
                hashMap.put("gift_id", Long.valueOf(remove.j));
                hashMap.put("msg_id", Long.valueOf(remove.f14779a));
                com.bytedance.android.livesdk.j.c.b().c("ttlive_gift", hashMap);
            } else if (!TextUtils.isEmpty(remove.f14782d)) {
                this.f12863e = true;
                this.f12864f.a(remove.f14780b);
                this.f12861c.a(remove, this.j.getOwner());
                a("播放视频礼物", String.valueOf(remove.j), String.valueOf(remove.f14779a), null);
            } else {
                a("临时下载该特效失败", String.valueOf(remove.j), String.valueOf(remove.f14779a), null);
                a((int) C0906R.string.deh);
            }
        }
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12859a, false, 7560, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12859a, false, 7560, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == C0906R.string.deh) {
            if (System.currentTimeMillis() - this.l > 30000) {
                this.l = System.currentTimeMillis();
                ai.a(i2);
            }
        } else if (i2 == C0906R.string.d3u && System.currentTimeMillis() - this.m > 30000) {
            this.m = System.currentTimeMillis();
            ai.a(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(com.bytedance.android.live.d.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f12859a, false, 7561, new Class[]{com.bytedance.android.live.d.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f12859a, false, 7561, new Class[]{com.bytedance.android.live.d.b.class}, Void.TYPE);
        } else if (bVar == com.bytedance.android.live.d.b.PK || bVar == com.bytedance.android.live.d.b.PENAL) {
            this.f12861c.a(true);
        } else {
            this.f12861c.a(false);
        }
    }

    public final void b(com.bytedance.android.livesdk.gift.effect.b.a aVar) {
        Object obj;
        int i2;
        com.bytedance.android.livesdk.gift.effect.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f12859a, false, 7557, new Class[]{com.bytedance.android.livesdk.gift.effect.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f12859a, false, 7557, new Class[]{com.bytedance.android.livesdk.gift.effect.b.a.class}, Void.TYPE);
        } else if (isViewValid() && aVar2 != null) {
            if (!aVar2.f14783e) {
                this.f12862d.add(aVar2);
                com.bytedance.android.livesdk.utils.ac<com.bytedance.android.livesdk.gift.effect.b.a> acVar = this.k;
                if (!PatchProxy.isSupport(new Object[]{aVar2}, acVar, com.bytedance.android.livesdk.utils.ac.f17565a, false, 13713, new Class[]{Object.class}, Boolean.TYPE)) {
                    if (acVar.f17568d != acVar.f17567c) {
                        acVar.f17568d++;
                        acVar.f17566b[acVar.f17568d] = aVar2;
                        if (!PatchProxy.isSupport(new Object[0], acVar, com.bytedance.android.livesdk.utils.ac.f17565a, false, 13715, new Class[0], Void.TYPE)) {
                            int i3 = acVar.f17568d;
                            while (true) {
                                int i4 = i3;
                                i3 /= 2;
                                if (i3 <= 0 || !acVar.f17569e.a(acVar.f17566b[i4], acVar.f17566b[i3])) {
                                    break;
                                }
                                acVar.a(i3, i4);
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[0], acVar, com.bytedance.android.livesdk.utils.ac.f17565a, false, 13715, new Class[0], Void.TYPE);
                        }
                    } else if (!acVar.f17569e.a(aVar2, acVar.f17566b[1])) {
                        acVar.f17566b[1] = aVar2;
                        acVar.a();
                    }
                } else {
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2}, acVar, com.bytedance.android.livesdk.utils.ac.f17565a, false, 13713, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                }
            } else {
                this.f12862d.add(0, aVar2);
            }
            if (PatchProxy.isSupport(new Object[0], this, f12859a, false, 7558, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12859a, false, 7558, new Class[0], Void.TYPE);
            } else if (this.f12862d.size() > i) {
                com.bytedance.android.livesdk.utils.ac<com.bytedance.android.livesdk.gift.effect.b.a> acVar2 = this.k;
                if (PatchProxy.isSupport(new Object[0], acVar2, com.bytedance.android.livesdk.utils.ac.f17565a, false, 13716, new Class[0], Object.class)) {
                    obj = PatchProxy.accessDispatch(new Object[0], acVar2, com.bytedance.android.livesdk.utils.ac.f17565a, false, 13716, new Class[0], Object.class);
                } else if (acVar2.f17568d <= 0) {
                    obj = null;
                } else {
                    Object obj2 = acVar2.f17566b[1];
                    Object[] objArr = acVar2.f17566b;
                    Object[] objArr2 = acVar2.f17566b;
                    acVar2.f17568d = acVar2.f17568d - 1;
                    objArr[1] = objArr2[i2];
                    acVar2.a();
                    obj = obj2;
                }
                com.bytedance.android.livesdk.gift.effect.b.a aVar3 = (com.bytedance.android.livesdk.gift.effect.b.a) obj;
                if (aVar3 != null) {
                    this.f12862d.remove(aVar3);
                }
            }
            a();
        }
    }

    public void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12859a, false, 7551, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12859a, false, 7551, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.j = (Room) this.dataCenter.get("data_room");
        this.f12862d = new ArrayList();
        this.k = new com.bytedance.android.livesdk.utils.ac<>(i + 1, this.n);
        if (PatchProxy.isSupport(new Object[0], this, f12859a, false, 7553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12859a, false, 7553, new Class[0], Void.TYPE);
            return;
        }
        this.f12861c = (VideoGiftView) this.contentView;
        this.f12861c.setPortrait(((Boolean) this.dataCenter.get("data_is_portrait", Boolean.TRUE)).booleanValue());
        VideoGiftView videoGiftView = this.f12861c;
        Context context = this.context;
        c cVar = this.h;
        com.bytedance.android.livesdkapi.depend.d.a.d dVar = this.o;
        if (PatchProxy.isSupport(new Object[]{context, this, cVar, dVar}, videoGiftView, VideoGiftView.f14964a, false, 9614, new Class[]{Context.class, LifecycleOwner.class, c.class, com.bytedance.android.livesdkapi.depend.d.a.d.class}, Void.TYPE)) {
            VideoGiftView videoGiftView2 = videoGiftView;
            PatchProxy.accessDispatch(new Object[]{context, this, cVar, dVar}, videoGiftView2, VideoGiftView.f14964a, false, 9614, new Class[]{Context.class, LifecycleOwner.class, c.class, com.bytedance.android.livesdkapi.depend.d.a.d.class}, Void.TYPE);
        } else {
            videoGiftView.i = ((IGiftService) b.a(IGiftService.class)).giftPlayControllerManager().a(context.hashCode());
            if (videoGiftView.i != null) {
                videoGiftView.i.a(cVar);
                videoGiftView.i.a(dVar);
                View a2 = videoGiftView.i.a();
                if (a2 != null) {
                    ViewGroup viewGroup = (ViewGroup) a2.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(a2);
                    }
                }
                videoGiftView.i.a((ViewGroup) videoGiftView.f14966c);
            }
        }
        this.f12861c.setUserEventListener(new com.bytedance.android.live.gift.e() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12867a;

            public final void a(long j) {
                if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f12867a, false, 7568, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f12867a, false, 7568, new Class[]{Long.TYPE}, Void.TYPE);
                    return;
                }
                if (!(j == 0 || VideoGiftWidget.this.dataCenter == null)) {
                    VideoGiftWidget.this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j));
                }
            }
        });
        a(((com.bytedance.android.live.d.a) b.a(com.bytedance.android.live.d.a.class)).getCurrentPkState());
    }

    public final void a(final com.bytedance.android.livesdk.gift.effect.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12859a, false, 7556, new Class[]{com.bytedance.android.livesdk.gift.effect.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12859a, false, 7556, new Class[]{com.bytedance.android.livesdk.gift.effect.b.a.class}, Void.TYPE);
        } else if (aVar != null) {
            this.f12860b.a(aVar.f14780b, new g() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12869a;

                public final void a(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f12869a, false, 7570, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f12869a, false, 7570, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    VideoGiftWidget.this.a("获取特效资源本地路径失败", String.valueOf(aVar.j), String.valueOf(aVar.f14779a), String.valueOf(aVar.f14780b));
                    aVar.a("");
                    VideoGiftWidget.this.b(aVar);
                }

                public final void a(long j, String str) {
                    long j2 = j;
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, f12869a, false, 7569, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, f12869a, false, 7569, new Class[]{Long.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    aVar.a(str2);
                    VideoGiftWidget.this.b(aVar);
                }
            }, 4);
        }
    }

    public final void a(ab abVar) {
        if (PatchProxy.isSupport(new Object[]{abVar}, this, f12859a, false, 7554, new Class[]{ab.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{abVar}, this, f12859a, false, 7554, new Class[]{ab.class}, Void.TYPE);
        } else if (isViewValid()) {
            com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(abVar.f16432d);
            if (findGiftById == null) {
                a((int) C0906R.string.d3u);
                return;
            }
            if ((findGiftById.f15106e == 2 || findGiftById.f15106e == 8) && abVar.h != 1) {
                a(l.a(abVar, this.j.getOwner()));
            }
        }
    }
}
