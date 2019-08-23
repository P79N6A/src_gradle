package com.bytedance.android.livesdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.dialog.b;
import com.bytedance.android.livesdk.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.chatroom.api.BanUserInfoApi;
import com.bytedance.android.livesdk.chatroom.event.v;
import com.bytedance.android.livesdk.chatroom.model.Game;
import com.bytedance.android.livesdk.chatroom.model.ae;
import com.bytedance.android.livesdk.chatroom.ui.aj;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.effect.LiveBeautyDialogFragment;
import com.bytedance.android.livesdk.effect.LiveBeautyFragment;
import com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter;
import com.bytedance.android.livesdk.effect.f;
import com.bytedance.android.livesdk.effect.j;
import com.bytedance.android.livesdk.effect.k;
import com.bytedance.android.livesdk.effect.model.FilterModel;
import com.bytedance.android.livesdk.share.a;
import com.bytedance.android.livesdk.sticker.a.c;
import com.bytedance.android.livesdk.sticker.h;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.utils.af;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.al;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.utils.u;
import com.bytedance.android.livesdk.widget.LiveTagPicker;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.depend.model.a.d;
import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.BuildConfig;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public class StartLiveFragmentDefault extends BaseFragment implements aj.a, a.C0119a, LiveTagPicker.a, e, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8844a;

    /* renamed from: b  reason: collision with root package name */
    static Gson f8845b = com.bytedance.android.live.a.a();
    Game A;
    b B;
    String C = "";
    public List<FilterModel> D;
    LiveFilterAdapter.a E = new LiveFilterAdapter.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8847a;

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8847a, false, 2974, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8847a, false, 2974, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (StartLiveFragmentDefault.this.s != null) {
                StartLiveFragmentDefault.this.s.b(i);
            }
            com.bytedance.android.livesdk.w.b.E.a(Integer.valueOf(i));
            if (StartLiveFragmentDefault.this.s != null) {
                float a2 = f.a(j.a().f13785b, i);
                if (!((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.a()).booleanValue()) {
                    float f2 = a2 / 100.0f;
                    if (((Float) com.bytedance.android.livesdk.w.b.F.a()).floatValue() > f2) {
                        StartLiveFragmentDefault.this.s.a(f2);
                        com.bytedance.android.livesdk.w.b.F.a(Float.valueOf(f2));
                    }
                } else if (!Lists.isEmpty(j.a().f13785b) && i >= 0 && i < j.a().f13785b.size()) {
                    com.bytedance.android.livesdk.sticker.b.a b2 = com.bytedance.android.livesdk.v.j.q().p().a().b(h.a("beautyTag", j.a().f13785b.get(i)));
                    if (!(b2 == null || b2.h == null)) {
                        c o = com.bytedance.android.livesdk.v.j.q().o();
                        o.a(com.bytedance.android.livesdk.sticker.c.a.f17264e, b2);
                        Float c2 = o.c(b2.h.f17256b);
                        if (c2 == null) {
                            c2 = Float.valueOf(k.a(b2, b2.h.f17255a));
                        }
                        int i2 = (int) a2;
                        if (c2.floatValue() > k.a(b2, i2)) {
                            o.a(b2.h.f17256b, k.a(b2, i2));
                        }
                    }
                }
            }
            String str = "";
            List<FilterModel> list = j.a().f13785b;
            if (i < list.size()) {
                str = list.get(i).getFilterId();
            }
            StartLiveFragmentDefault.this.s();
            HashMap hashMap = new HashMap();
            hashMap.put("filter_id", str);
            com.bytedance.android.livesdk.j.a.a().a("live_take_filter_select", StartLiveFragmentDefault.this.b(hashMap), new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click").g("click").a("live_take_page"));
        }
    };
    boolean F = false;
    private WeakHandler G;
    private View H;
    private boolean I;
    private ImageView J;
    private View K;
    private HSImageView L;
    private EditText M;
    private int N;
    private int O = 109;
    private TextView P;
    private View Q;
    private View R;
    private View S;
    private View T;
    private View U;
    private View V;
    private View W;
    private View X;
    private View Y;
    private TextView Z;
    private View aa;
    private View ab;
    private TextView ac;
    private View ad;
    private ImageView ae;
    private TextView af;
    private View ag;
    private ImageView ah;
    private TextView ai;
    private TextView aj;
    private View ak;
    private View al;
    private View am;
    private View an;
    private a ao;
    private LiveBeautyDialogFragment ap;
    private boolean aq;
    private b.e ar;
    private String as;
    private ProgressDialog at;
    private Disposable au;
    private boolean av = false;
    private View.OnClickListener aw = new bo(this);

    /* renamed from: c  reason: collision with root package name */
    public Activity f8846c;
    Room h;
    public View i;
    View j;
    aj k;
    CheckedTextView l;
    m m;
    public HSImageView n;
    public TextView o;
    public p p;
    public com.bytedance.android.live.base.model.user.f q;
    public String r;
    public d s;
    public com.bytedance.android.livesdkapi.depend.model.live.a t;
    int u = 1;
    com.bytedance.ies.e.b v;
    public User w;
    public final CompositeDisposable x = new CompositeDisposable();
    int y = 0;
    public int z = 0;

    public final void a(HashMap<String, String> hashMap) {
    }

    public final Fragment l() {
        return this;
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f8844a, false, 2872, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f8844a, false, 2872, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        String errorMsg = th instanceof com.bytedance.android.live.a.a.b.a ? ((com.bytedance.android.live.a.a.b.a) th).getErrorMsg() : null;
        if (TextUtils.isEmpty(errorMsg)) {
            errorMsg = getString(C0906R.string.dha);
        }
        this.r = null;
        if (b_()) {
            this.p.c();
            com.bytedance.android.live.uikit.d.a.a(getContext(), errorMsg);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Game game) {
        if (PatchProxy.isSupport(new Object[]{game}, this, f8844a, false, 2901, new Class[]{Game.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{game}, this, f8844a, false, 2901, new Class[]{Game.class}, Void.TYPE);
        } else if (game == null) {
            this.ag.setVisibility(0);
            this.ae.setVisibility(8);
            this.af.setText(C0906R.string.dcw);
        } else {
            this.ag.setVisibility(8);
            this.ae.setVisibility(0);
            com.bytedance.android.livesdk.chatroom.f.b.a(this.ae, game.icon);
            this.af.setText(game.name);
        }
    }

    public final void a(ae aeVar) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{aeVar}, this, f8844a, false, 2913, new Class[]{ae.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aeVar}, this, f8844a, false, 2913, new Class[]{ae.class}, Void.TYPE);
            return;
        }
        this.ac.setText(aeVar == null ? getString(C0906R.string.dd6) : aeVar.f11092b);
        View view = this.ad;
        if (aeVar == null) {
            i2 = 8;
        }
        view.setVisibility(i2);
        Map map = (Map) com.bytedance.android.livesdk.w.b.C.a();
        map.put(this.t.name(), f8845b.toJson((Object) aeVar));
        com.bytedance.android.livesdk.w.b.C.a(map);
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.live.a aVar) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f8844a, false, 2916, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f8844a, false, 2916, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE);
        } else if (b_()) {
            if (this.H != null) {
                View view = this.H;
                if (aVar == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                    z2 = false;
                }
                view.setClickable(z2);
            }
            if (aVar != this.t) {
                this.t = aVar;
                if (!(this.ar == null || this.ar.f9317b == null)) {
                    this.ar.f9317b.setVisibility(4);
                }
                if (this.aj != null) {
                    this.aj.setVisibility(4);
                }
                if (this.k != null && this.k.isShowing()) {
                    this.k.dismiss();
                }
                int i2 = 8;
                switch (aVar) {
                    case VIDEO:
                        this.ac.setVisibility(0);
                        this.J.setVisibility(0);
                        this.K.setVisibility(8);
                        this.R.setVisibility(0);
                        this.j.setVisibility(8);
                        this.ak.setVisibility(8);
                        this.U.setVisibility(8);
                        this.L.setVisibility(8);
                        this.P.setText(C0906R.string.cqr);
                        this.Z.setText(C0906R.string.d8j);
                        this.al.setVisibility(0);
                        this.S.setVisibility(0);
                        break;
                    case AUDIO:
                        this.ac.setVisibility(0);
                        this.J.setVisibility(4);
                        this.K.setVisibility(8);
                        this.R.setVisibility(8);
                        this.j.setVisibility(8);
                        this.ak.setVisibility(8);
                        this.U.setVisibility(8);
                        this.L.setVisibility(0);
                        this.P.setText(C0906R.string.cqt);
                        this.Z.setText(C0906R.string.d8h);
                        this.al.setVisibility(8);
                        this.S.setVisibility(8);
                        break;
                    case THIRD_PARTY:
                        this.ac.setVisibility(0);
                        this.J.setVisibility(4);
                        this.K.setVisibility(0);
                        this.R.setVisibility(8);
                        this.j.setVisibility(8);
                        this.ak.setVisibility(8);
                        this.U.setVisibility(8);
                        this.L.setVisibility(0);
                        this.P.setText(C0906R.string.cqu);
                        this.Z.setText(C0906R.string.d8i);
                        this.al.setVisibility(8);
                        this.S.setVisibility(8);
                        break;
                    case SCREEN_RECORD:
                        this.ac.setVisibility(8);
                        this.J.setVisibility(4);
                        this.K.setVisibility(0);
                        this.R.setVisibility(8);
                        this.j.setVisibility(0);
                        this.ak.setVisibility(0);
                        this.U.setVisibility(0);
                        a(this.A);
                        h();
                        this.L.setVisibility(0);
                        this.P.setText(C0906R.string.cqs);
                        this.Z.setText(C0906R.string.d8g);
                        this.al.setVisibility(8);
                        this.S.setVisibility(8);
                        break;
                }
                ae aeVar = (ae) f8845b.fromJson((String) ((Map) com.bytedance.android.livesdk.w.b.C.a()).get(this.t.name()), ae.class);
                this.ac.setText(aeVar == null ? getString(C0906R.string.dd6) : aeVar.f11092b);
                this.ad.setVisibility(aeVar == null ? 8 : 0);
                View view2 = this.ab;
                if (this.t != com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
                i();
                if (aVar != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                    float screenWidth = ((float) UIUtils.getScreenWidth(getContext())) / ((float) UIUtils.getScreenHeight(getContext()));
                    if (aVar == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                        this.L.setBackgroundResource(2130840792);
                    } else if (this.w == null || this.w.getAvatarLarge() == null) {
                        this.L.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setImageRequest(ImageRequestBuilder.newBuilderWithResourceId(2130841197).setPostprocessor(new u(5, screenWidth, null)).build())).setOldController(this.L.getController())).build());
                    } else {
                        com.bytedance.android.livesdk.chatroom.f.b.a(this.L, this.w.getAvatarLarge(), (Postprocessor) new u(5, screenWidth, null));
                    }
                    this.L.setVisibility(0);
                }
                r();
            }
        }
    }

    private boolean w() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2904, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2904, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Boolean bool = (Boolean) this.j.getTag(C0906R.id.d7u);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f8844a, false, 2917, new Class[0], String.class)) {
            return s.INST.getBeautyFilePath();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2917, new Class[0], String.class);
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f8844a, false, 2918, new Class[0], String.class)) {
            return s.INST.getFaceReshapeFilePath();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2918, new Class[0], String.class);
    }

    public final int e() {
        if (!PatchProxy.isSupport(new Object[0], this, f8844a, false, 2925, new Class[0], Integer.TYPE)) {
            return ((Integer) com.bytedance.android.livesdk.w.b.g.b()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2925, new Class[0], Integer.TYPE)).intValue();
    }

    public final void i() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2908, new Class[0], Void.TYPE);
            return;
        }
        View view = this.V;
        if (this.ac.getVisibility() == 8 && this.i.getVisibility() == 8) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2928, new Class[0], Void.TYPE);
            return;
        }
        o();
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2929, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2929, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null && this.m.isShowing()) {
            this.m.dismiss();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2876, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (!this.av) {
            this.G.removeMessages(2333);
        }
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2935, new Class[0], Void.TYPE);
        } else if (j.a().d()) {
            this.T.setVisibility(0);
        } else {
            this.T.setVisibility(8);
        }
    }

    private float A() {
        if (!PatchProxy.isSupport(new Object[0], this, f8844a, false, 2923, new Class[0], Float.TYPE)) {
            return ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13831c.f13834a * ((Float) com.bytedance.android.livesdk.w.b.H.a()).floatValue();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2923, new Class[0], Float.TYPE)).floatValue();
    }

    private float B() {
        if (!PatchProxy.isSupport(new Object[0], this, f8844a, false, 2924, new Class[0], Float.TYPE)) {
            return ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13832d.f13834a * ((Float) com.bytedance.android.livesdk.w.b.I.a()).floatValue();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2924, new Class[0], Float.TYPE)).floatValue();
    }

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2883, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2883, new Class[0], Void.TYPE);
            return;
        }
        TTLiveSDKContext.getHostService().b().b().a((d.a) com.bytedance.android.livesdk.w.e.LAST_SHARE_CHANNEL, this.C);
        com.bytedance.android.livesdk.w.b.r.a(this.C);
        com.bytedance.android.livesdk.j.a.a().a("live_action", new Object[0]);
        if (this.h != null) {
            if (!com.bytedance.android.livesdk.o.a.a(com.bytedance.android.livesdkapi.j.a.LiveResource)) {
                com.bytedance.android.livesdkapi.j.a.LiveResource.checkInstall(this.f8846c, new i.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f8857a;

                    public final void b(String str) {
                    }

                    public final void a(String str) {
                        if (PatchProxy.isSupport(new Object[]{str}, this, f8857a, false, 2980, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f8857a, false, 2980, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        com.bytedance.android.livesdkapi.j.a.LiveResource.load(StartLiveFragmentDefault.this.f8846c, !com.bytedance.android.live.uikit.a.a.f());
                        StartLiveFragmentDefault.this.d();
                    }
                });
            } else {
                d();
            }
        }
    }

    private int x() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2909, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2909, new Class[0], Integer.TYPE)).intValue();
        }
        ae aeVar = (ae) f8845b.fromJson((String) ((Map) com.bytedance.android.livesdk.w.b.C.a()).get(this.t.name()), ae.class);
        if (aeVar == null) {
            return -1;
        }
        return aeVar.f11091a;
    }

    private float y() {
        if (!PatchProxy.isSupport(new Object[0], this, f8844a, false, 2920, new Class[0], Float.TYPE)) {
            return ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * ((Float) com.bytedance.android.livesdk.w.b.F.a()).floatValue();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2920, new Class[0], Float.TYPE)).floatValue();
    }

    private float z() {
        if (!PatchProxy.isSupport(new Object[0], this, f8844a, false, 2922, new Class[0], Float.TYPE)) {
            return ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13830b.f13834a * ((Float) com.bytedance.android.livesdk.w.b.G.a()).floatValue();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2922, new Class[0], Float.TYPE)).floatValue();
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2899, new Class[0], Void.TYPE);
            return;
        }
        if (this.ap == null) {
            this.ap = LiveBeautyDialogFragment.a(new LiveBeautyFragment.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8865a;

                public final void a(float f2) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8865a, false, 2985, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8865a, false, 2985, new Class[]{Float.TYPE}, Void.TYPE);
                        return;
                    }
                    if (StartLiveFragmentDefault.this.s != null) {
                        StartLiveFragmentDefault.this.s.a(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * f2);
                    }
                }

                public final void b(float f2) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8865a, false, 2986, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8865a, false, 2986, new Class[]{Float.TYPE}, Void.TYPE);
                        return;
                    }
                    if (StartLiveFragmentDefault.this.s != null) {
                        StartLiveFragmentDefault.this.s.b(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13830b.f13834a * f2);
                    }
                }

                public final void c(float f2) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8865a, false, 2987, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8865a, false, 2987, new Class[]{Float.TYPE}, Void.TYPE);
                        return;
                    }
                    if (StartLiveFragmentDefault.this.s != null) {
                        StartLiveFragmentDefault.this.s.c(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13831c.f13834a * f2);
                    }
                }

                public final void d(float f2) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f8865a, false, 2988, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f8865a, false, 2988, new Class[]{Float.TYPE}, Void.TYPE);
                        return;
                    }
                    if (StartLiveFragmentDefault.this.s != null) {
                        StartLiveFragmentDefault.this.s.d(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13832d.f13834a * f2);
                    }
                }
            }, this.E, true, 0, true);
            this.ap.f13685b = new cb(this);
        }
        this.ap.show(getChildFragmentManager(), "beauty_filter_dialog_tag");
        e(8);
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2903, new Class[0], Void.TYPE);
            return;
        }
        Boolean bool = (Boolean) this.j.getTag(C0906R.id.d7u);
        if (bool == null) {
            bool = Boolean.valueOf(this.v.a("hotsoon.pref.LAST_SET_LANDSCAPE", true));
            this.j.setTag(C0906R.id.d7u, bool);
        }
        if (!bool.booleanValue()) {
            this.ah.setImageResource(2130841388);
            this.ai.setText(C0906R.string.dd1);
            return;
        }
        this.ah.setImageResource(2130841386);
        this.ai.setText(C0906R.string.dcy);
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2930, new Class[0], Void.TYPE);
        } else if (this.s != null) {
            this.s.a(y());
            this.s.b(z());
            this.s.c(A());
            this.s.d(B());
        }
    }

    public final List<Pair<String, String>> n() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2919, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2919, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        for (FilterModel next : j.a().f13785b) {
            arrayList.add(new Pair(next.getName(), next.getFilterPath()));
        }
        return arrayList;
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2911, new Class[0], Void.TYPE);
        } else if (com.bytedance.android.livesdk.o.a.a(com.bytedance.android.livesdkapi.j.a.LiveResource)) {
            p();
        } else if (!NetworkUtils.isNetworkAvailable(this.f8846c)) {
            com.bytedance.android.live.uikit.d.a.a((Context) this.f8846c, (int) C0906R.string.csv);
        } else if (NetworkUtils.getNetworkType(this.f8846c) == NetworkUtils.NetworkType.MOBILE_2G) {
            com.bytedance.android.live.uikit.d.a.a((Context) this.f8846c, (int) C0906R.string.dg1);
        } else if (this.z <= 3) {
            com.bytedance.android.livesdkapi.j.a.LiveResource.checkInstall(getContext(), new i.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8849a;

                public final void b(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f8849a, false, 2990, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f8849a, false, 2990, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    StartLiveFragmentDefault.this.o();
                    StartLiveFragmentDefault.this.z++;
                }

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f8849a, false, 2989, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f8849a, false, 2989, new Class[]{String.class}, Void.TYPE);
                    } else if (!NetworkUtils.isNetworkAvailable(StartLiveFragmentDefault.this.f8846c)) {
                        com.bytedance.android.live.uikit.d.a.a((Context) StartLiveFragmentDefault.this.f8846c, (int) C0906R.string.csv);
                    } else if (NetworkUtils.getNetworkType(StartLiveFragmentDefault.this.f8846c) == NetworkUtils.NetworkType.MOBILE_2G) {
                        com.bytedance.android.live.uikit.d.a.a((Context) StartLiveFragmentDefault.this.f8846c, (int) C0906R.string.dg1);
                    } else {
                        StartLiveFragmentDefault.this.p();
                    }
                }
            });
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2875, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (!this.av) {
            if (this.I) {
                u();
                this.I = false;
            }
            m();
            if (!this.aq) {
                if (!com.bytedance.android.livesdk.m.d.a((Context) getActivity(), "android.permission.ACCESS_FINE_LOCATION") && (this.ap == null || this.ap.getDialog() == null || !this.ap.getDialog().isShowing())) {
                    this.i.setVisibility(0);
                    this.i.setOnClickListener(this.aw);
                    i();
                }
            }
            this.i.setVisibility(8);
            i();
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2912, new Class[0], Void.TYPE);
            return;
        }
        if (!s.INST.isLoadedRes()) {
            if (TTLiveSDKContext.getHostService().e() != null) {
                TTLiveSDKContext.getHostService().e();
                TTLiveSDKContext.getHostService().e().b(com.bytedance.android.livesdkapi.j.a.LiveResource.getPackageName());
            }
            if (this.m == null) {
                this.m = new m.a(getContext(), 2).a((DialogInterface.OnDismissListener) new ce(this)).c();
            }
            s.INST.isLoadedRes.observe(this, new cf(this));
        }
    }

    @SuppressLint({"CheckResult"})
    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2915, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2915, new Class[0], Void.TYPE);
        } else if (this.am != null) {
            com.bytedance.android.live.base.model.user.i a2 = TTLiveSDKContext.getHostService().k().a();
            if (com.bytedance.android.livesdkapi.a.a.f18614b || a2 == null || !a2.isEnableShowCommerceSale() || this.t != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                this.am.setVisibility(8);
                return;
            }
            this.am.setVisibility(0);
            com.bytedance.android.livesdk.commerce.c.a(a2.getId()).subscribe(new ck(this), new cm(this));
        }
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2882, new Class[0], Void.TYPE);
            return;
        }
        TTLiveSDKContext.getLiveService().d().a(this.h);
        this.I = com.bytedance.android.livesdk.share.e.a(this.f8846c, this.C, this.h);
        com.bytedance.android.livesdk.w.b.r.a(this.C);
        String str = this.C;
        if (StringUtils.equal(this.C, "weixin_moment")) {
            str = "weixin_moment";
        }
        com.bytedance.android.livesdk.j.f.a((Context) this.f8846c).a("share_my_live_share", str, this.h.getId(), 0);
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live_interact");
        hashMap.put("event_page", "live_take_page");
        hashMap.put("room_id", String.valueOf(this.h.getId()));
        hashMap.put("platform", str);
        com.bytedance.android.livesdk.j.a.a().a("live_take_share", hashMap, new Object[0]);
        if (!this.I) {
            u();
            return;
        }
        int intValue = ((Integer) LiveSettingKeys.START_LIVE_SHARE_TIMEOUT.a()).intValue();
        if (intValue > 0) {
            this.G.sendEmptyMessageDelayed(2333, ((long) intValue) * 1000);
        }
    }

    public final void d() {
        Class cls;
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2884, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2884, new Class[0], Void.TYPE);
            return;
        }
        try {
            Activity activity = this.f8846c;
            if (this.t.isStreamingBackground) {
                cls = TTLiveSDKContext.getHostService().c().a(6);
            } else {
                cls = TTLiveSDKContext.getHostService().c().a(5);
            }
            Intent intent = new Intent(activity, cls);
            if (com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY == this.t || com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD == this.t) {
                com.bytedance.android.livesdk.w.b.U.a(Boolean.FALSE);
            }
            if (com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD == this.t) {
                intent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", w());
            }
            com.bytedance.android.livesdk.w.b.B.a(this.t.name());
            this.f8846c.startActivity(intent);
            TTLiveSDKContext.getLiveService().d().a(this.h);
            TTLiveSDKContext.getHostService().b().a().b(true);
            this.f8846c.finish();
            this.f8846c.overridePendingTransition(0, 0);
            TTLiveSDKContext.getLiveService().i().a();
        } catch (Exception unused) {
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2874, new Class[0], Void.TYPE);
            return;
        }
        if (!this.av) {
            j.a().b((j.a) new cs(this));
            if (this.k != null && this.k.isShowing()) {
                this.k.dismiss();
                this.k.f11830b = null;
            }
            if (this.m != null && this.m.isShowing()) {
                this.m.dismiss();
            }
            if (this.p != null) {
                this.p.c();
                this.p = null;
            }
            this.k = null;
            if (this.au != null && !this.au.isDisposed()) {
                this.au.dispose();
            }
            this.r = null;
            com.bytedance.android.livesdk.v.j.q().f().a(this.ar);
            this.x.clear();
        }
        super.onDestroyView();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"CheckResult"})
    public void q() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2914, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.live.base.model.user.i a2 = TTLiveSDKContext.getHostService().k().a();
        if (a2 != null) {
            com.bytedance.android.livesdkapi.depend.g.a aVar = new com.bytedance.android.livesdkapi.depend.g.a("has_show_commodity_dialog", Boolean.FALSE);
            if (((Boolean) aVar.a()).booleanValue()) {
                com.bytedance.android.livesdk.commerce.c.b(a2.getId()).subscribe(new cg(this), new ch(this));
            } else {
                new b.a(this.f8846c).a((int) C0906R.string.dcl).b((int) C0906R.string.dck).a((int) C0906R.string.dcj, (DialogInterface.OnClickListener) new ci(this, aVar)).b((int) C0906R.string.dci, cj.f13569b).a(false).a().show();
            }
        }
    }

    private boolean v() {
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2887, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2887, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!TTLiveSDKContext.getHostService().k().c()) {
            TTLiveSDKContext.getHostService().k().a(getActivity(), com.bytedance.android.livesdk.user.i.a().a(ac.a((int) C0906R.string.det)).a(-1).d("video_take").e("open_live").c("bottom_tab").a()).subscribe((Observer<? super T>) new g<com.bytedance.android.live.base.model.user.i>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8859a;

                public final void onSubscribe(Disposable disposable) {
                    Disposable disposable2 = disposable;
                    if (PatchProxy.isSupport(new Object[]{disposable2}, this, f8859a, false, 2981, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable2}, this, f8859a, false, 2981, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    super.onSubscribe(disposable);
                    StartLiveFragmentDefault.this.x.add(disposable2);
                }
            });
            return false;
        } else if (!NetworkUtils.isNetworkAvailable(this.f8846c)) {
            com.bytedance.android.live.uikit.d.a.a((Context) this.f8846c, (int) C0906R.string.csv);
            return false;
        } else if (NetworkUtils.getNetworkType(this.f8846c) == NetworkUtils.NetworkType.MOBILE_2G) {
            com.bytedance.android.live.uikit.d.a.a((Context) this.f8846c, (int) C0906R.string.dg1);
            return false;
        } else if (!TTLiveSDKContext.getHostService().k().c()) {
            TTLiveSDKContext.getHostService().k().a(getActivity(), com.bytedance.android.livesdk.user.i.a().a(ac.a((int) C0906R.string.det)).a(-1).d("video_take").e("open_live").c("bottom_tab").a()).subscribe((Observer<? super T>) new g<com.bytedance.android.live.base.model.user.i>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8861a;

                public final void onSubscribe(Disposable disposable) {
                    Disposable disposable2 = disposable;
                    if (PatchProxy.isSupport(new Object[]{disposable2}, this, f8861a, false, 2982, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable2}, this, f8861a, false, 2982, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    super.onSubscribe(disposable);
                    StartLiveFragmentDefault.this.x.add(disposable2);
                }
            });
            return false;
        } else if (!TTLiveSDKContext.getHostService().k().a().childrenManagerForbidCreateLiveRoom()) {
            return true;
        } else {
            com.bytedance.android.live.uikit.d.a.a((Context) this.f8846c, (int) C0906R.string.cqp);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String str;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2888, new Class[0], Void.TYPE);
            return;
        }
        this.O = 10001;
        if (v()) {
            if (this.t != com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY || x() != -1) {
                if (this.t.isStreamingBackground) {
                    Room a2 = TTLiveSDKContext.getLiveService().d().a();
                    if (a2 != null && ((a2.isScreenshot && this.t == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) || (a2.isThirdParty && this.t == com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY))) {
                        this.h = a2;
                        u();
                        return;
                    }
                }
                long j2 = 0;
                if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        Game game = this.A;
                        if (game == null) {
                            ai.a((int) C0906R.string.dk_);
                            this.U.performClick();
                            return;
                        }
                        j2 = game.gameId;
                        if (BgBroadcastServiceImpl.getProjection() == null) {
                            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection");
                            if (mediaProjectionManager == null) {
                                ai.a((int) C0906R.string.dk8);
                                return;
                            } else {
                                startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 20001);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                long j3 = j2;
                this.O = 109;
                if (this.at == null) {
                    this.at = af.a(this.f8846c, getString(C0906R.string.cuj));
                }
                if (!this.at.isShowing()) {
                    this.at.show();
                }
                String obj = this.M.getText().toString();
                a(obj);
                com.bytedance.android.livesdk.chatroom.bl.h a3 = com.bytedance.android.livesdk.chatroom.bl.h.a();
                WeakHandler weakHandler = this.G;
                if (this.q == null) {
                    str = null;
                } else {
                    str = this.q.f7759b.get(0);
                }
                String str2 = str;
                com.bytedance.android.livesdkapi.depend.model.live.a aVar = this.t;
                int x2 = x();
                if (this.t != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO || this.l == null || !this.l.isChecked()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                a3.a(weakHandler, obj, str2, aVar, x2, j3, z2, 1);
                com.bytedance.android.livesdk.j.f.a((Context) this.f8846c);
            } else if (getActivity() != null) {
                new m.a(getActivity(), 0).a(false).c((CharSequence) getActivity().getString(C0906R.string.dhh)).b(0, (int) C0906R.string.cpw, (DialogInterface.OnClickListener) new bu(this)).c();
            }
        }
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.a.d dVar) {
        this.s = dVar;
    }

    public final void b(String str) {
        this.C = str;
    }

    public final void c(int i2) {
        this.N = 10;
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f8844a, false, 2934, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f8844a, false, 2934, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            s();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8844a, false, 2868, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8844a, false, 2868, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    public void onEvent(v vVar) {
        if (PatchProxy.isSupport(new Object[]{vVar}, this, f8844a, false, 2873, new Class[]{v.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vVar}, this, f8844a, false, 2873, new Class[]{v.class}, Void.TYPE);
            return;
        }
        r();
    }

    private boolean c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f8844a, false, 2910, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f8844a, false, 2910, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!isAdded()) {
            return false;
        } else {
            Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag(str2);
            if (findFragmentByTag != null && (findFragmentByTag instanceof DialogFragment)) {
                DialogFragment dialogFragment = (DialogFragment) findFragmentByTag;
                if (dialogFragment.getDialog() == null || !dialogFragment.getDialog().isShowing()) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    private void f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8844a, false, 2889, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8844a, false, 2889, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
    }

    public final HashMap<String, String> b(HashMap<String, String> hashMap) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{hashMap}, this, f8844a, false, 2865, new Class[]{HashMap.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{hashMap}, this, f8844a, false, 2865, new Class[]{HashMap.class}, HashMap.class);
        }
        if (this.h != null) {
            j2 = this.h.getId();
        } else {
            j2 = 0;
        }
        hashMap.put("room_id", String.valueOf(j2));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8844a, false, 2906, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8844a, false, 2906, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.Q.setVisibility(i2);
        this.P.setVisibility(i2);
    }

    private void a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f8844a, false, 2897, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f8844a, false, 2897, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", "click");
        hashMap.put("event_belong", "live");
        hashMap.put("event_page", "live_action");
        hashMap.put("event_module", PushConstants.TITLE);
        hashMap.put("live_edit_type", PushConstants.TITLE);
        if (str.length() == 0) {
            str2 = "off";
        } else {
            str2 = "on";
        }
        hashMap.put("title_status", str2);
        com.bytedance.android.livesdk.j.a.a().a("live_edit_features", hashMap, new Object[0]);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("event_type", "click");
        hashMap2.put("event_belong", "live");
        hashMap2.put("event_page", "live_action");
        hashMap2.put("event_module", "action");
        hashMap2.put("is_beauty", "off");
        com.bytedance.android.livesdk.j.a.a().a("live_action", hashMap2, new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8844a, false, 2905, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8844a, false, 2905, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.Y.setVisibility(i2);
        this.W.setVisibility(i2);
        this.ao.setVisibility(i2);
        this.M.setVisibility(i2);
        if (i2 != 0) {
            this.aj.setVisibility(i2);
        }
        a(this.o, i2);
        a(this.n, i2);
        a(this.an, i2);
        if (i2 == 0) {
            if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            this.ab.setVisibility(i3);
            this.ac.setVisibility(i3);
            ae aeVar = (ae) f8845b.fromJson((String) ((Map) com.bytedance.android.livesdk.w.b.C.a()).get(this.t.name()), ae.class);
            View view = this.ad;
            if (i3 != 0 || aeVar == null) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            view.setVisibility(i4);
            if (!this.aq) {
                if (!com.bytedance.android.livesdk.m.d.a((Context) getActivity(), "android.permission.ACCESS_FINE_LOCATION") && (this.ap == null || this.ap.getDialog() == null || !this.ap.getDialog().isShowing())) {
                    this.i.setVisibility(0);
                    this.i.setOnClickListener(this.aw);
                }
            }
            this.i.setVisibility(8);
        } else {
            this.ab.setVisibility(i2);
            this.ad.setVisibility(i2);
            this.ac.setVisibility(i2);
            this.i.setVisibility(i2);
        }
        i();
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8844a, false, 2871, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8844a, false, 2871, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.f8846c = getActivity();
        this.G = new WeakHandler(this);
        if (!this.av) {
            p pVar = new p(this.f8846c, this, "cover", 1, 1, BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, new bp(this));
            this.p = pVar;
            com.bytedance.android.livesdk.j.f.a((Context) this.f8846c);
            this.H.post(new ca(this));
            this.ao.a(getActivity(), this);
            j.a().a((j.a) new cl(this));
            j.a().c();
            this.al.setVisibility(0);
            this.S.setVisibility(0);
        }
    }

    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8844a, false, 2927, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8844a, false, 2927, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        boolean c2 = c("beauty_filter_dialog_tag");
        boolean c3 = c("filter_dialog_tag");
        if (!c2 && !c3) {
            String str = "";
            List<FilterModel> list = j.a().f13785b;
            if (i2 < list.size()) {
                str = list.get(i2).getFilterId();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", "draw");
            hashMap.put("filter_id", str);
            com.bytedance.android.livesdk.j.a.a().a("live_take_filter_select", b(hashMap), new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click").a("live_take_page"));
            com.bytedance.android.livesdk.w.b.E.a(Integer.valueOf(i2));
            float a2 = f.a(j.a().f13785b, i2);
            if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.a()).booleanValue()) {
                if (!Lists.isEmpty(j.a().f13785b) && i2 >= 0 && i2 < j.a().f13785b.size()) {
                    com.bytedance.android.livesdk.sticker.b.a b2 = com.bytedance.android.livesdk.v.j.q().p().a().b(h.a("beautyTag", j.a().f13785b.get(i2)));
                    if (b2 != null) {
                        c o2 = com.bytedance.android.livesdk.v.j.q().o();
                        o2.a(com.bytedance.android.livesdk.sticker.c.a.f17264e, b2);
                        int i3 = (int) a2;
                        if (o2.c(b2.h.f17256b).floatValue() > k.a(b2, i3)) {
                            o2.a(b2.h.f17256b, k.a(b2, i3));
                        }
                    }
                }
            } else if (y() > (((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * a2) / 100.0f) {
                float f2 = a2 / 100.0f;
                this.s.a(f2);
                com.bytedance.android.livesdk.w.b.F.a(Float.valueOf(f2));
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8844a, false, 2926, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8844a, false, 2926, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.w.b.g.b(Integer.valueOf(i2));
    }

    public void handleMsg(Message message) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{message}, this, f8844a, false, 2878, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f8844a, false, 2878, new Class[]{Message.class}, Void.TYPE);
        } else if (message.obj instanceof Exception) {
            Exception exc = (Exception) message.obj;
            if (message.what == 1) {
                if (b_()) {
                    if (this.at != null) {
                        this.at.dismiss();
                    }
                    if (exc instanceof com.bytedance.android.live.a.a.b.a) {
                        int errorCode = ((com.bytedance.android.live.a.a.b.a) exc).getErrorCode();
                        if (errorCode != 10018) {
                            switch (errorCode) {
                                case 30010:
                                    if (!PatchProxy.isSupport(new Object[0], this, f8844a, false, 2885, new Class[0], Void.TYPE)) {
                                        if (this.f8846c != null) {
                                            if (this.B == null) {
                                                b.a aVar = new b.a(this.f8846c);
                                                aVar.a((CharSequence) getString(C0906R.string.dlb)).b((int) C0906R.string.cpz, (DialogInterface.OnClickListener) new cx(this)).a((int) C0906R.string.dl_, (DialogInterface.OnClickListener) new bq(this)).b((int) C0906R.string.dla);
                                                aVar.a((DialogInterface.OnCancelListener) new br(this));
                                                this.B = aVar.a();
                                                this.B.setCanceledOnTouchOutside(true);
                                            }
                                            this.B.show();
                                            com.bytedance.android.livesdk.j.f.a((Context) this.f8846c);
                                            break;
                                        }
                                    } else {
                                        PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2885, new Class[0], Void.TYPE);
                                        break;
                                    }
                                    break;
                                case 30011:
                                    if (!PatchProxy.isSupport(new Object[0], this, f8844a, false, 2880, new Class[0], Void.TYPE)) {
                                        new m.a(getContext(), 0).a(true).c((int) C0906R.string.dkb).b(0, (int) C0906R.string.cq_, (DialogInterface.OnClickListener) new cv(this)).b(1, (int) C0906R.string.cpv, cw.f13664b).a().show();
                                        break;
                                    } else {
                                        PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2880, new Class[0], Void.TYPE);
                                        break;
                                    }
                                default:
                                    l.a((Context) this.f8846c, (Throwable) exc, (int) C0906R.string.cuk);
                                    break;
                            }
                        } else {
                            if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2886, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2886, new Class[0], Void.TYPE);
                            } else {
                                com.bytedance.android.live.base.model.user.i a2 = TTLiveSDKContext.getHostService().k().a();
                                if (!(this.f8846c == null || a2 == null)) {
                                    this.x.add(((BanUserInfoApi) com.bytedance.android.livesdk.v.j.q().d().a(BanUserInfoApi.class)).getBanUserInfo().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new bs(this), bt.f9656b));
                                }
                            }
                        }
                    } else {
                        l.a((Context) this.f8846c, (Throwable) exc, (int) C0906R.string.cuk);
                    }
                }
                com.bytedance.android.livesdk.j.f.a((Context) this.f8846c);
                if (this.t != com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                    z2 = false;
                }
                com.bytedance.android.livesdk.live.a.a(exc, z2);
            }
        } else if (message.what == 1) {
            this.h = (Room) message.obj;
            if (!Room.isValid(this.h)) {
                if (this.at != null) {
                    this.at.dismiss();
                }
                IllegalStateException illegalStateException = new IllegalStateException("invalid room");
                l.a((Context) this.f8846c, (Throwable) illegalStateException, (int) C0906R.string.cuk);
                if (this.t != com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                    z2 = false;
                }
                com.bytedance.android.livesdk.live.a.a(illegalStateException, z2);
            } else if (!com.bytedance.android.livesdkapi.a.a.f18616d || !((Boolean) LiveSettingKeys.VIGO_FLAME_DIAMOND_GUIDE_SWITCH.a()).booleanValue() || !((Boolean) com.bytedance.android.livesdk.w.b.ak.a()).booleanValue()) {
                a(this.h.getId());
            } else {
                m.a a3 = new m.a(getContext()).d((int) C0906R.string.d04);
                a3.c((CharSequence) ac.a((int) C0906R.string.d8y) + "\n" + ac.a((int) C0906R.string.d8z)).b(0, (int) C0906R.string.d48, ct.f13658b).a((DialogInterface.OnDismissListener) new cu(this)).c();
                com.bytedance.android.livesdk.w.b.ak.a(Boolean.FALSE);
            }
        } else {
            if (message.what == 2333) {
                u();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f8844a, false, 2881, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f8844a, false, 2881, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.at != null && this.at.isShowing()) {
            this.at.dismiss();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live_take");
        hashMap.put("event_type", "click");
        hashMap.put("enter_from", this.as);
        hashMap.put("event_page", "live_take_page");
        hashMap.put("room_id", String.valueOf(this.h.getId()));
        if (this.h.isLiveTypeAudio()) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        hashMap.put("live_type", str);
        hashMap.put("streaming_type", this.t.logStreamingType);
        if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
            Game game = this.A;
            if (game != null) {
                hashMap.put("game_name", game.name);
            }
        }
        com.bytedance.android.livesdk.j.a.a().a("live_take", hashMap, new Object[0]);
        if (this.M.getText() != null && !TextUtils.isEmpty(this.M.getText())) {
            HashMap hashMap2 = new HashMap();
            if (this.h.isLiveTypeAudio()) {
                str9 = "voice_live";
            } else {
                str9 = "video_live";
            }
            hashMap2.put("live_type", str9);
            hashMap2.put("streaming_type", this.t.logStreamingType);
            com.bytedance.android.livesdk.j.a.a().a("pm_live_take_title_write", hashMap2, new com.bytedance.android.livesdk.j.c.j().b("live_take").f("other").a("live_take_page"), new com.bytedance.android.livesdk.j.c.k());
        }
        f.a(j2);
        float floatValue = ((Float) com.bytedance.android.livesdk.w.b.F.a()).floatValue() * 100.0f;
        float floatValue2 = ((Float) com.bytedance.android.livesdk.w.b.G.a()).floatValue() * 100.0f;
        float floatValue3 = ((Float) com.bytedance.android.livesdk.w.b.H.a()).floatValue() * 100.0f;
        float floatValue4 = ((Float) com.bytedance.android.livesdk.w.b.I.a()).floatValue() * 100.0f;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("event_page", "live_take_page");
        if (this.h.isLiveTypeAudio()) {
            str2 = "voice_live";
        } else {
            str2 = "video_live";
        }
        hashMap3.put("live_type", str2);
        hashMap3.put("streaming_type", this.t.logStreamingType);
        hashMap3.put("anchor_id", String.valueOf(this.w.getId()));
        if (x() == -1) {
            str3 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        }
        hashMap3.put("is_tag", str3);
        if (this.t == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO && !(floatValue == 0.0f && floatValue2 == 0.0f && floatValue3 == 0.0f && floatValue4 == 0.0f)) {
            str4 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str4 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        hashMap3.put("is_beauty", str4);
        if (this.t != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
            str5 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str5 = String.valueOf(floatValue);
        }
        hashMap3.put("beauty_white", str5);
        if (this.t != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
            str6 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str6 = String.valueOf(floatValue2);
        }
        hashMap3.put("beauty_skin", str6);
        if (this.t != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
            str7 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str7 = String.valueOf(floatValue3);
        }
        hashMap3.put("beauty_bigeye", str7);
        if (this.t != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
            str8 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str8 = String.valueOf(floatValue4);
        }
        hashMap3.put("beauty_facethin", str8);
        com.bytedance.android.livesdk.j.a.a().a("pm_live_take_edit_features", hashMap3, new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click"));
        if (TextUtils.isEmpty(this.C)) {
            u();
        } else {
            t();
        }
    }

    private void a(View view, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f8844a, false, 2907, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f8844a, false, 2907, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f8844a, false, 2870, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f8844a, false, 2870, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.v = com.bytedance.ies.e.b.a(getContext());
        String a2 = this.v.a("hotsoon.pref.LAST_SET_GAME", (String) null);
        if (!TextUtils.isEmpty(a2)) {
            this.A = Game.fromJson(a2);
        }
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2879, new Class[0], Void.TYPE);
        } else {
            this.L = (HSImageView) this.H.findViewById(C0906R.id.c_2);
            this.X = this.H.findViewById(C0906R.id.dji);
            this.Z = (TextView) this.H.findViewById(C0906R.id.djh);
            this.Z.setOnClickListener(this.aw);
            this.J = (ImageView) this.H.findViewById(C0906R.id.aiw);
            this.J.setOnClickListener(this.aw);
            this.K = this.H.findViewById(C0906R.id.bec);
            this.K.setOnClickListener(this.aw);
            this.aa = this.H.findViewById(C0906R.id.ti);
            this.aa.setOnClickListener(this.aw);
            this.Y = this.H.findViewById(C0906R.id.cun);
            this.M = (EditText) this.H.findViewById(C0906R.id.bf9);
            this.V = this.H.findViewById(C0906R.id.czl);
            this.i = this.H.findViewById(C0906R.id.d89);
            this.ab = this.H.findViewById(C0906R.id.csn);
            this.ac = (TextView) this.H.findViewById(C0906R.id.csm);
            this.ac.setOnClickListener(this.aw);
            this.ad = this.H.findViewById(C0906R.id.tt);
            this.ad.setOnClickListener(this.aw);
            this.W = this.H.findViewById(C0906R.id.diu);
            this.ao = (a) this.H.findViewById(C0906R.id.du2);
            this.Q = this.H.findViewById(C0906R.id.co9);
            this.R = this.H.findViewById(C0906R.id.co7);
            this.R.setOnClickListener(this.aw);
            this.j = this.H.findViewById(C0906R.id.cog);
            this.j.setOnClickListener(this.aw);
            this.S = this.H.findViewById(C0906R.id.coa);
            this.S.setOnClickListener(this.aw);
            this.T = this.H.findViewById(C0906R.id.aw1);
            this.U = this.H.findViewById(C0906R.id.cob);
            this.U.setOnClickListener(this.aw);
            this.al = this.H.findViewById(C0906R.id.col);
            this.am = this.H.findViewById(C0906R.id.co8);
            this.am.setOnClickListener(this.aw);
            this.l = (CheckedTextView) this.H.findViewById(C0906R.id.xo);
            this.ae = (ImageView) this.H.findViewById(C0906R.id.coc);
            this.ag = this.H.findViewById(C0906R.id.cod);
            this.af = (TextView) this.H.findViewById(C0906R.id.coe);
            this.ah = (ImageView) this.H.findViewById(C0906R.id.coh);
            this.ai = (TextView) this.H.findViewById(C0906R.id.coi);
            this.ak = this.H.findViewById(C0906R.id.f4431com);
            this.P = (TextView) this.H.findViewById(C0906R.id.aih);
            this.P.setOnClickListener(this.aw);
            this.aj = (TextView) this.H.findViewById(C0906R.id.ddw);
            this.n = (HSImageView) this.H.findViewById(C0906R.id.bdj);
            this.n.setImageResource(2130840959);
            this.n.setOnClickListener(this.aw);
            this.o = (TextView) this.H.findViewById(C0906R.id.ddu);
            this.an = this.H.findViewById(C0906R.id.bdk);
            if (this.N != 0) {
                f(this.N);
            } else {
                f(20);
            }
            if (!this.av) {
                this.w.getAvatarMedium();
                int i3 = 8;
                if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2890, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2890, new Class[0], Void.TYPE);
                } else {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        int intValue = ((Integer) com.bytedance.android.livesdk.w.b.t.a()).intValue();
                        if (com.bytedance.android.livesdkapi.a.a.f18616d) {
                            this.aq = true;
                            this.i.setVisibility(8);
                        } else {
                            if (com.bytedance.android.livesdk.m.d.a((Context) activity, "android.permission.ACCESS_FINE_LOCATION")) {
                                this.i.setVisibility(8);
                                com.bytedance.android.livesdk.w.b.t.a(0);
                            } else if (intValue <= 5) {
                                this.i.setVisibility(0);
                                this.i.setOnClickListener(this.aw);
                                com.bytedance.android.livesdk.w.b.t.a(Integer.valueOf(intValue + 1));
                            } else {
                                this.aq = true;
                            }
                        }
                        i();
                    }
                }
                TextView textView = this.Z;
                if (com.bytedance.android.livesdkapi.a.a.f18615c) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                View view2 = this.X;
                if (!com.bytedance.android.livesdkapi.a.a.f18615c) {
                    i3 = 0;
                }
                view2.setVisibility(i3);
            }
        }
        com.bytedance.android.livesdk.effect.a.a();
        if (PatchProxy.isSupport(new Object[0], this, f8844a, false, 2936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8844a, false, 2936, new Class[0], Void.TYPE);
            return;
        }
        if (b_()) {
            this.o.setText(getString(C0906R.string.d10));
            this.o.setAlpha(0.64f);
            this.x.add(com.bytedance.android.livesdk.v.j.q().d().g().anchorCoverStatus().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new cn(this), co.f13579b));
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f8844a, false, 2877, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f8844a, false, 2877, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (!this.av) {
            if (i4 != 20001 || Build.VERSION.SDK_INT < 21) {
                TTLiveSDKContext.getHostService().o();
                if (i5 != 120) {
                    this.p.a(i4, i5, intent2);
                } else if (i4 == 10001) {
                    f();
                } else {
                    if (i4 == 10002) {
                        g();
                    }
                }
            } else {
                if (i5 == -1) {
                    MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection");
                    if (mediaProjectionManager != null) {
                        MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(i5, intent2);
                        if (mediaProjection != null) {
                            BgBroadcastServiceImpl.setProjection(mediaProjection);
                            f();
                            return;
                        }
                    }
                }
                ai.a((int) C0906R.string.dk8);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f8844a, false, 2869, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f8844a, false, 2869, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.H = LayoutInflater.from(getContext()).inflate(C0906R.layout.aik, viewGroup, false);
        if (TTLiveSDKContext.getHostService() == null || TTLiveSDKContext.getHostService().k() == null) {
            ai.a((int) C0906R.string.cw6);
            getActivity().finish();
            this.av = true;
        } else {
            this.w = (User) TTLiveSDKContext.getHostService().k().a();
            if (this.w.getId() != ((Long) com.bytedance.android.livesdk.w.b.A.a()).longValue()) {
                com.bytedance.android.livesdk.w.b.A.a(Long.valueOf(this.w.getId()));
                com.bytedance.android.livesdk.w.b.B.a(com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO.name());
            }
        }
        com.bytedance.android.livesdk.u.a.a().a(v.class).compose(com.bytedance.android.live.core.rxutils.i.a(this)).subscribe((Consumer<? super T>) new Consumer<v>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8852a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                v vVar = (v) obj;
                if (PatchProxy.isSupport(new Object[]{vVar}, this, f8852a, false, 2977, new Class[]{v.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{vVar}, this, f8852a, false, 2977, new Class[]{v.class}, Void.TYPE);
                    return;
                }
                StartLiveFragmentDefault.this.onEvent(vVar);
            }
        });
        return this.H;
    }

    public static void a(String str, al.b bVar, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str5, bVar, null, str6}, null, f8844a, true, 2867, new Class[]{String.class, al.b.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, bVar, null, str6}, null, f8844a, true, 2867, new Class[]{String.class, al.b.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (str5.equals("android.permission.ACCESS_FINE_LOCATION")) {
            str4 = "system_position";
        } else if (str5.equals("android.permission.READ_PHONE_STATE")) {
            str4 = "call";
        } else if (str5.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
            str4 = "save";
        } else {
            str4 = null;
        }
        if (!TextUtils.isEmpty(str4)) {
            com.bytedance.android.livesdk.j.c.j jVar = new com.bytedance.android.livesdk.j.c.j();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(null)) {
                jVar.d(null);
            }
            if (!TextUtils.isEmpty(str3)) {
                jVar.g(str6);
            }
            hashMap.put("popup_type", str4);
            com.bytedance.android.livesdk.j.a.a().a("system_popup", hashMap, jVar.b("video").f(bVar.getType()));
        }
    }
}
