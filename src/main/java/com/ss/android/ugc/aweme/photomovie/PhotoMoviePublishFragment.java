package com.ss.android.ugc.aweme.photomovie;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.Pair;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.model.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.draft.l;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.ah;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PoiAndGoodsPublishModel;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.bw;
import com.ss.android.ugc.aweme.shortvideo.da;
import com.ss.android.ugc.aweme.shortvideo.dk;
import com.ss.android.ugc.aweme.shortvideo.dl;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e;
import com.ss.android.ugc.aweme.shortvideo.ek;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.gy;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.publish.a;
import com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.h;
import com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.ss.android.ugc.aweme.tools.a.g;
import com.ss.android.ugc.aweme.util.KeyBoardMonitor;
import com.ss.android.ugc.aweme.utils.ax;
import com.tencent.bugly.CrashModule;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class PhotoMoviePublishFragment extends Fragment implements View.OnClickListener, d, da {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58857a;

    /* renamed from: b  reason: collision with root package name */
    public PhotoMovieContext f58858b;

    /* renamed from: c  reason: collision with root package name */
    SettingItemSwitch f58859c;

    /* renamed from: d  reason: collision with root package name */
    SettingItemSwitch f58860d;

    /* renamed from: e  reason: collision with root package name */
    a f58861e = new a();

    /* renamed from: f  reason: collision with root package name */
    gy f58862f;
    dl g;
    LinearLayout h;
    bw i;
    ImageView j;
    FrameLayout k;
    ek l;
    com.ss.android.ugc.aweme.shortvideo.publish.d m;
    public boolean n;
    Handler o;
    List<Pair<Class<?>, IAVPublishExtension<?>>> p = com.ss.android.ugc.aweme.port.in.a.t.a(AVPublishContentType.PhotoMovie);
    View.OnTouchListener q = new l(this);
    private PermissionSettingItem r;
    private View s;
    private w t;
    private TextView u;
    private TextView v;
    private HashTagMentionEditText w;
    private CheckBox x;
    private FrameLayout y;

    public final boolean b() {
        return false;
    }

    public final void e() {
        this.n = true;
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58857a, false, 64025, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58857a, false, 64025, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f58857a, false, 64027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58857a, false, 64027, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58857a, false, 64026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58857a, false, 64026, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58857a, false, 64028, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58857a, false, 64028, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final String a() {
        if (this.f58858b == null) {
            return null;
        }
        return this.f58858b.commerceData;
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f58857a, false, 64014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58857a, false, 64014, new Class[0], Void.TYPE);
            return;
        }
        this.f58858b.getPhotoMovieCover(new r(this));
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58857a, false, 64024, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58857a, false, 64024, new Class[0], Void.TYPE);
            return;
        }
        this.f58858b.mainBusinessData = e.updateSDKShareContextWhenSaveOrPost(this.f58858b.mIsFromDraft, this.f58858b.mainBusinessData);
        this.t = (w) com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().fromJson(e.getShareContext(this.f58858b.mainBusinessData), w.class);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f58857a, false, 64017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58857a, false, 64017, new Class[0], Void.TYPE);
            return;
        }
        a(getView(), null);
        super.onDestroyView();
        this.l.c();
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.p) {
            ((IAVPublishExtension) pair.second).onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f58857a, false, 64010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58857a, false, 64010, new Class[0], Void.TYPE);
        } else if (this.f58858b != null) {
            ah.a<Boolean> a2 = com.ss.android.ugc.aweme.port.in.a.o.a();
            if (this.f58858b.isPrivate == 1) {
                z = true;
            }
            a2.a(Boolean.valueOf(z));
            c a3 = com.ss.android.ugc.aweme.photomovie.edit.c.a(this.f58858b);
            com.ss.android.ugc.aweme.draft.a.a aVar = new com.ss.android.ugc.aweme.draft.a.a();
            this.f58862f.b();
            aVar.f43423a = this.f58862f.c();
            List<AVTextExtraStruct> d2 = this.f58862f.d();
            if (d2 != null) {
                aVar.f43424b = d2;
            }
            if (this.f58861e.a() != null) {
                aVar.f43425c = Collections.singletonList(this.f58861e.f68864b);
            }
            a3.y = this.g.a();
            a3.f43435c = aVar;
            r.onEvent(MobClick.obtain().setEventName("publish").setLabelName("save").setJsonObject(new t().a("shoot_way", getActivity().getIntent().getStringExtra("shoot_way")).a()));
            l.a().c(a3);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().notifyDraftUpdate(a3);
            for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.p) {
                ((IAVPublishExtension) pair.second).onSaveDraft(b.a(this.f58858b));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f58857a, false, 64018, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58857a, false, 64018, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().finish();
            g.a(com.ss.android.ugc.aweme.shortvideo.r.a((BaseShortVideoContext) this.f58858b), com.ss.android.ugc.aweme.shortvideo.r.b((BaseShortVideoContext) this.f58858b), com.ss.android.ugc.aweme.tools.a.e.PUBLISH, com.ss.android.ugc.aweme.tools.a.e.SEND_REQUEST);
            this.f58858b.mOutputVideoPath = ff.b(".mp4");
            this.f58858b.mInputAudioPath = ff.b(".wav");
            this.f58858b.mSyncPlatforms = this.l.a();
            Bundle bundle = new Bundle();
            bundle.putInt("video_type", 0);
            bundle.putParcelable("photo_movie_publish_args", this.f58858b);
            bundle.putString("shoot_way", this.f58858b.mShootWay);
            Publish.PublishBundle = bundle;
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().startPublish(getActivity(), bundle);
            r.onEvent(MobClick.obtain().setEventName("publish").setLabelName("submit"));
            for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.p) {
                ((IAVPublishExtension) pair.second).onPublish(b.a(this.f58858b));
            }
            PoiAndGoodsPublishModel poiAndGoodsPublishModel = (PoiAndGoodsPublishModel) AVPublishExtensionUtils.findModel(this.p, PoiAndGoodsPublishModel.class);
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f58858b.creationId).a("shoot_way", this.f58858b.mShootWay).a("filter_list", this.f58858b.mFilterName).a("filter_id_list", this.f58858b.mFilterId).a("prop_selected_from", this.f58858b.mPropSource).a("privacy_status", com.ss.android.ugc.aweme.photo.publish.Publish.a(this.g.a())).a("draft_id", this.f58858b.draftId);
            if (this.f58858b.musicOrigin == null) {
                str = "original";
            } else {
                str = this.f58858b.musicOrigin;
            }
            Map<String, String> map = a2.a("music_selected_from", str).a("content_type", "slideshow").a("content_source", "upload").a("enter_from", "video_post_page").f34114b;
            if (poiAndGoodsPublishModel.getMobParams() != null) {
                map.putAll(poiAndGoodsPublishModel.getMobParams());
            }
            r.a("publish", (Map) map);
            if (this.f58858b.isSaveLocal()) {
                r.a("download", (Map) new com.ss.android.ugc.aweme.app.d.d().a("scene_id", (int) CrashModule.MODULE_ID).a("group_id", "").a("enter_from", "video_post_page").a("download_type", "self").a("download_method", "download_with_publish").f34114b);
            }
        }
    }

    public final void a(String str) {
        if (this.f58858b != null) {
            this.f58858b.commerceData = str;
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58857a, false, 64023, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58857a, false, 64023, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58857a, false, 64020, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58857a, false, 64020, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        this.g.a(bundle);
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.p) {
            ((IAVPublishExtension) pair.second).onSaveInstanceState(bundle);
        }
        bundle.putSerializable("challenge", this.f58861e.f68864b);
        bundle.putBoolean("contentModified", this.n);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58857a, false, 64009, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58857a, false, 64009, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.a7p) {
            if (!com.ss.android.ugc.aweme.port.in.a.x.c()) {
                com.ss.android.ugc.aweme.port.in.a.x.a((Fragment) this, "photo_movie_post_page", "click_save_draft", (Bundle) null, (f.a) null);
                return;
            }
            r.a("save_draft", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f58858b.creationId).a("shoot_way", this.f58858b.mShootWay).a("draft_id", this.f58858b.draftId).a("content_type", "slideshow").a("content_source", "upload").a("enter_from", "video_post_page").f34114b);
            this.f58858b.poiId = ((PoiAndGoodsPublishModel) AVPublishExtensionUtils.findModel(this.p, PoiAndGoodsPublishModel.class)).getPoiContext();
            f();
            c();
            com.bytedance.ies.dmt.ui.d.a.a((Context) com.ss.android.ugc.aweme.port.in.a.f61119b, getString(C0906R.string.c15), 1, 1).a();
            Intent intent = new Intent(getActivity(), com.ss.android.ugc.aweme.port.in.a.f61121d.a());
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", true);
            if (this.t != null && !this.f58858b.mIsFromDraft) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG", this.t);
            }
            startActivity(intent);
        }
    }

    private void a(View view, View.OnTouchListener onTouchListener) {
        View view2 = view;
        View.OnTouchListener onTouchListener2 = onTouchListener;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{view2, onTouchListener2}, this, f58857a, false, 64022, new Class[]{View.class, View.OnTouchListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, onTouchListener2}, this, f58857a, false, 64022, new Class[]{View.class, View.OnTouchListener.class}, Void.TYPE);
        } else if (view.getId() != C0906R.id.g2) {
            if (!(view2 instanceof EditText)) {
                view.setOnTouchListener(onTouchListener);
            }
            if (view2 instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    if (i2 >= viewGroup.getChildCount()) {
                        break;
                    }
                    a(viewGroup.getChildAt(i2), onTouchListener2);
                    i2++;
                }
            }
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        View view2 = view;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{view2, bundle2}, this, f58857a, false, 64012, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle2}, this, f58857a, false, 64012, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getActivity().getWindow().setSharedElementReenterTransition(new AutoTransition());
            getActivity().getWindow().setSharedElementExitTransition(new AutoTransition());
        }
        if (PatchProxy.isSupport(new Object[0], this, f58857a, false, 64007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58857a, false, 64007, new Class[0], Void.TYPE);
        } else {
            this.f58858b = (PhotoMovieContext) getActivity().getIntent().getParcelableExtra("photo_movie_context");
        }
        if (PatchProxy.isSupport(new Object[]{view2}, this, f58857a, false, 64006, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f58857a, false, 64006, new Class[]{View.class}, Void.TYPE);
        } else {
            this.s = view2.findViewById(C0906R.id.a7p);
        }
        if (PatchProxy.isSupport(new Object[0], this, f58857a, false, 64008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58857a, false, 64008, new Class[0], Void.TYPE);
        } else {
            this.s.setOnClickListener(this);
        }
        this.o = new Handler();
        a(view2, this.q);
        this.r = (PermissionSettingItem) view2.findViewById(C0906R.id.bxe);
        this.g = dl.a(this, this.r, 0);
        VideoPublishFragment.a(this.r, (Activity) getActivity());
        this.g.a((dk) new dk() {
        });
        this.h = (LinearLayout) view2.findViewById(C0906R.id.b_k);
        this.f58859c = (SettingItemSwitch) view2.findViewById(C0906R.id.cac);
        if (!com.ss.android.ugc.aweme.setting.l.a() || !com.ss.android.ugc.aweme.setting.l.a(this.f58858b)) {
            this.f58859c.setVisibility(8);
        } else {
            this.f58859c.setVisibility(0);
            if (com.ss.android.ugc.aweme.port.in.a.L.b(e.a.ReactDuetSettingCurrent) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f58859c.setChecked(z3);
            this.f58859c.setOnSettingItemClickListener(new m(this));
        }
        this.f58860d = (SettingItemSwitch) view2.findViewById(C0906R.id.vm);
        com.ss.android.ugc.aweme.port.in.a.t.a(this.f58860d, false, null);
        this.u = (TextView) view2.findViewById(C0906R.id.g1);
        this.w = (HashTagMentionEditText) view2.findViewById(C0906R.id.a92);
        this.v = (TextView) view2.findViewById(C0906R.id.g2);
        this.f58862f = gy.a(this, this.w, this.v, this.u, 0);
        this.i = bw.a(this.f58862f, view2);
        this.m = new com.ss.android.ugc.aweme.shortvideo.publish.d(this);
        this.m.a(this.h);
        this.l = ek.a((Fragment) this, view);
        this.l.a(this.f58858b.mShootWay);
        try {
            z = com.ss.android.ugc.aweme.global.config.settings.g.b().bb().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            z = true;
        }
        if (com.ss.android.g.a.a() && z) {
            this.l.f67535b.a(getString(C0906R.string.c64));
        }
        this.f58862f.a();
        this.f58862f.a(this.f58858b.challenges);
        this.j = (ImageView) view2.findViewById(C0906R.id.ar7);
        this.j.setScaleType(ImageView.ScaleType.CENTER_CROP);
        g();
        this.j.setOnClickListener(new n(this));
        if (PatchProxy.isSupport(new Object[]{view2}, this, f58857a, false, 64015, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f58857a, false, 64015, new Class[]{View.class}, Void.TYPE);
        } else {
            view2.findViewById(C0906R.id.sm).setOnClickListener(new ax(800) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58866a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f58866a, false, 64040, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f58866a, false, 64040, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (PatchProxy.isSupport(new Object[0], this, f58866a, false, 64041, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58866a, false, 64041, new Class[0], Void.TYPE);
                    } else {
                        r.a("click_cover_entrance", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", PhotoMoviePublishFragment.this.f58858b.creationId).a("enter_from", "video_post_page").a("content_type", "photo").a("shoot_way", PhotoMoviePublishFragment.this.f58858b.mShootWay).a("content_source", "upload").f34114b);
                    }
                    FragmentActivity activity = PhotoMoviePublishFragment.this.getActivity();
                    PhotoMovieContext photoMovieContext = PhotoMoviePublishFragment.this.f58858b;
                    if (PatchProxy.isSupport(new Object[]{activity, photoMovieContext, 4}, null, PhotoMovieChooseCoverActivity.f58795a, true, 63894, new Class[]{Activity.class, PhotoMovieContext.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity, photoMovieContext, 4}, null, PhotoMovieChooseCoverActivity.f58795a, true, 63894, new Class[]{Activity.class, PhotoMovieContext.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    Intent intent = new Intent(activity, PhotoMovieChooseCoverActivity.class);
                    intent.putExtra("photo_movie_context", photoMovieContext);
                    activity.startActivityForResult(intent, 4);
                    activity.overridePendingTransition(C0906R.anim.r, C0906R.anim.s);
                }
            });
        }
        this.k = (FrameLayout) view2.findViewById(C0906R.id.c8h);
        this.k.setOnClickListener(new o(this));
        List list = this.f58858b.challenges;
        if (list != null && !list.isEmpty()) {
            this.f58861e.f68864b = (com.ss.android.ugc.aweme.shortvideo.c) list.get(0);
        }
        if (this.f58858b.mIsFromDraft) {
            this.f58858b.mShootWay = "edit_draft";
        }
        this.g.a(this.f58858b.isPrivate);
        this.f58862f.a(this.f58858b.title);
        if (this.f58858b.structList != null) {
            this.f58862f.b(this.f58858b.structList);
        }
        this.f58862f.a(this.f58858b.challenges);
        if (bundle2 != null) {
            this.f58861e.f68864b = (com.ss.android.ugc.aweme.shortvideo.c) bundle2.getSerializable("challenge");
            this.g.b(bundle2);
            this.n = bundle2.getBoolean("contentModified");
        }
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.p) {
            AVPublishContentType aVPublishContentType = AVPublishContentType.PhotoMovie;
            PublishOutput a2 = b.a(this.f58858b);
            String str = this.f58858b.poiData;
            ExtensionMisc extensionMisc = new ExtensionMisc(str, null, this.f58858b.poiId, b(), this.f58858b.commerceData, null, true);
            ((IAVPublishExtension) pair.second).onCreate(this, (LinearLayout) view2.findViewById(C0906R.id.abb), bundle, aVPublishContentType, a2, extensionMisc, new p(this));
        }
        com.ss.android.ugc.aweme.port.in.a.t.a(AVPublishContentType.PhotoMovie, this.p);
        ah.a<Boolean> a3 = com.ss.android.ugc.aweme.port.in.a.o.a();
        if (this.f58858b.isPrivate == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        a3.a(Boolean.valueOf(z2));
        if (this.l.f67535b.d().getVisibility() == 0 && !com.ss.android.ugc.aweme.i18n.c.a() && this.l.f67535b.d().getVisibility() == 0) {
            r.onEvent(MobClick.obtain().setEventName("fans_power_show").setLabelName("edit_page").setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("shoot_way", this.f58858b.mShootWay).b()));
        }
        gy gyVar = this.f58862f;
        h hVar = new h(this.h);
        if (PatchProxy.isSupport(new Object[]{hVar}, gyVar, gy.f68017a, false, 74789, new Class[]{KeyBoardMonitor.a.class}, Void.TYPE)) {
            gy gyVar2 = gyVar;
            PatchProxy.accessDispatch(new Object[]{hVar}, gyVar2, gy.f68017a, false, 74789, new Class[]{KeyBoardMonitor.a.class}, Void.TYPE);
        } else {
            KeyBoardMonitor keyBoardMonitor = new KeyBoardMonitor(gyVar.f68018b);
            HashTagMentionEditText hashTagMentionEditText = gyVar.f68019c;
            if (PatchProxy.isSupport(new Object[]{hashTagMentionEditText, hVar}, keyBoardMonitor, KeyBoardMonitor.f4283a, false, 87812, new Class[]{EditText.class, KeyBoardMonitor.a.class}, Void.TYPE)) {
                KeyBoardMonitor keyBoardMonitor2 = keyBoardMonitor;
                PatchProxy.accessDispatch(new Object[]{hashTagMentionEditText, hVar}, keyBoardMonitor2, KeyBoardMonitor.f4283a, false, 87812, new Class[]{EditText.class, KeyBoardMonitor.a.class}, Void.TYPE);
            } else {
                keyBoardMonitor.f4284b = hashTagMentionEditText.getRootView();
                keyBoardMonitor.f4285c = hVar;
                if (keyBoardMonitor.f4284b != null) {
                    keyBoardMonitor.f4284b.getViewTreeObserver().addOnGlobalLayoutListener(keyBoardMonitor);
                }
            }
        }
        this.f58862f.a((da) this);
        this.x = (CheckBox) view2.findViewById(C0906R.id.sd);
        this.y = (FrameLayout) view2.findViewById(C0906R.id.ag4);
        if (com.ss.android.ugc.aweme.i18n.c.a() || !com.ss.android.ugc.aweme.property.f.p()) {
            this.y.setVisibility(8);
        } else {
            this.x.setChecked(((Boolean) com.ss.android.ugc.aweme.port.in.a.o.b().a()).booleanValue());
            this.x.setOnCheckedChangeListener(q.f59024b);
        }
        if (PatchProxy.isSupport(new Object[0], this, f58857a, false, 64013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58857a, false, 64013, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.account.model.e e2 = com.ss.android.ugc.aweme.port.in.a.x.e();
            if (e2 != null && e2.d()) {
                this.l.f67535b.d().setVisibility(8);
            }
        }
        if (PatchProxy.isSupport(new Object[]{view2}, this, f58857a, false, 64016, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f58857a, false, 64016, new Class[]{View.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.port.in.a.x.a()) {
            this.r.setVisibility(8);
            this.v.setVisibility(8);
            this.u.setVisibility(8);
            this.f58860d.setVisibility(8);
            v.a(false, this.f58859c);
            view2.findViewById(C0906R.id.a7t).setVisibility(8);
            View findViewById = view2.findViewById(C0906R.id.sg);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new s(this));
            if (!(this.l == null || this.l.f67535b == null)) {
                this.l.f67535b.d().setVisibility(8);
            }
            this.w.setHint(C0906R.string.sl);
            this.w.setMentionTextColor(ContextCompat.getColor(getContext(), C0906R.color.zt));
        }
        this.i.a(this, true, bw.f65842b);
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58857a, false, 64011, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.pf, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58857a, false, 64011, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f58857a, false, 64019, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f58857a, false, 64019, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.p) {
            ((IAVPublishExtension) pair.second).onActivityResult(i4, i5, intent2);
        }
        this.l.a(i4, i5, intent2);
        if (i4 == 1) {
            if (i5 == -1) {
                this.f58861e.f68864b = com.ss.android.ugc.aweme.port.in.a.f61122e.a(intent2);
            } else {
                this.f58861e.f68864b = null;
            }
            this.n = true;
        }
        if (i4 == 2 && i5 == -1 && intent2 != null) {
            int intExtra = intent2.getIntExtra("extra.PERMISSION", 0);
            this.g.a(intent2);
            this.n = true;
            r.onEvent(MobClick.obtain().setEventName("scope_control").setLabelName("edit_page").setJsonObject(new t().a("to_status", com.ss.android.ugc.aweme.photo.publish.Publish.a(intExtra)).a()));
        }
        if (i4 == 3 && i5 == -1) {
            this.f58862f.a(intent2);
            this.n = true;
        }
        if (i4 == 4 && i5 == -1 && intent2 != null && intent2.getParcelableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT") != null) {
            this.f58858b = (PhotoMovieContext) intent2.getParcelableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT");
            g();
        }
    }
}
