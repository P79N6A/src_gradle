package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.photomovie.transition.ITransition;
import com.ss.android.ugc.aweme.photomovie.transition.f;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.sticker.c.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerPresenter;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.f;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class InfoStickerViewImpl implements LifecycleObserver, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4006a;

    /* renamed from: b  reason: collision with root package name */
    public FragmentActivity f4007b;

    /* renamed from: c  reason: collision with root package name */
    public c.a f4008c;

    /* renamed from: d  reason: collision with root package name */
    public a f4009d;

    /* renamed from: e  reason: collision with root package name */
    public cb f4010e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4011f;
    public LinearLayout g;
    public SearchInfoStickerPresenter h;
    public EditText i;
    private FrameLayout j;
    private View k;
    private InfoStickerPagerAdapter l;
    private AVDmtTabLayout m;
    private m n;
    private ViewPagerBottomSheetBehavior o;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f4006a, false, 79366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4006a, false, 79366, new Class[0], Void.TYPE);
            return;
        }
        if (this.f4009d != null) {
            this.f4009d.b(new com.ss.android.ugc.aweme.shortvideo.sticker.c.c());
        }
        this.o.b(5);
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4006a, false, 79373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4006a, false, 79373, new Class[0], Void.TYPE);
            return;
        }
        InfoStickerViewModel a2 = InfoStickerModule.a(this.f4007b);
        if (PatchProxy.isSupport(new Object[0], a2, InfoStickerViewModel.f69782a, false, 79391, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, InfoStickerViewModel.f69782a, false, 79391, new Class[0], Void.TYPE);
        } else {
            InfoStickerRepository infoStickerRepository = a2.f69783b;
            if (PatchProxy.isSupport(new Object[0], infoStickerRepository, InfoStickerRepository.f69728a, false, 79325, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], infoStickerRepository, InfoStickerRepository.f69728a, false, 79325, new Class[0], Void.TYPE);
            } else {
                infoStickerRepository.f69731d.clear();
            }
        }
        if (org.greenrobot.eventbus.c.a().b((Object) this)) {
            org.greenrobot.eventbus.c.a().c(this);
        }
        this.k = null;
        this.f4007b = null;
    }

    public final void a() {
        com.ss.android.ugc.aweme.themechange.base.a aVar;
        int i2;
        SearchInfoStickerFragment searchInfoStickerFragment;
        if (PatchProxy.isSupport(new Object[0], this, f4006a, false, 79365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4006a, false, 79365, new Class[0], Void.TYPE);
            return;
        }
        this.j.removeAllViews();
        if (PatchProxy.isSupport(new Object[0], this, f4006a, false, 79367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4006a, false, 79367, new Class[0], Void.TYPE);
        } else if (this.k == null) {
            this.f4007b.getLifecycle().addObserver(this);
            org.greenrobot.eventbus.c.a().a((Object) this);
            this.k = LayoutInflater.from(this.f4007b).inflate(C0906R.layout.g6, this.j, false);
            FrameLayout frameLayout = (FrameLayout) this.k.findViewById(C0906R.id.cvg);
            this.m = (AVDmtTabLayout) this.k.findViewById(C0906R.id.cvw);
            final ViewPager viewPager = (ViewPager) this.k.findViewById(C0906R.id.duu);
            if (PatchProxy.isSupport(new Object[0], this, f4006a, false, 79368, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4006a, false, 79368, new Class[0], Void.TYPE);
            } else if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableSearchGIF)) {
                RelativeLayout relativeLayout = (RelativeLayout) this.k.findViewById(C0906R.id.aug);
                relativeLayout.setVisibility(0);
                this.g = (LinearLayout) this.k.findViewById(C0906R.id.auf);
                this.i = (EditText) this.k.findViewById(C0906R.id.di0);
                TextView textView = (TextView) this.k.findViewById(C0906R.id.di2);
                this.i.setCursorVisible(false);
                this.i.clearFocus();
                this.h = new SearchInfoStickerPresenter(this.k, this.f4007b);
                SearchInfoStickerPresenter searchInfoStickerPresenter = this.h;
                if (PatchProxy.isSupport(new Object[0], searchInfoStickerPresenter, SearchInfoStickerPresenter.f4012a, false, 79434, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], searchInfoStickerPresenter, SearchInfoStickerPresenter.f4012a, false, 79434, new Class[0], Void.TYPE);
                } else {
                    w wVar = searchInfoStickerPresenter.f4014c;
                    if (PatchProxy.isSupport(new Object[]{searchInfoStickerPresenter}, wVar, w.f70115a, false, 79459, new Class[]{SearchInfoStickerPresenter.class}, Void.TYPE)) {
                        Object[] objArr = {searchInfoStickerPresenter};
                        w wVar2 = wVar;
                        PatchProxy.accessDispatch(objArr, wVar2, w.f70115a, false, 79459, new Class[]{SearchInfoStickerPresenter.class}, Void.TYPE);
                    } else {
                        wVar.m = searchInfoStickerPresenter;
                        if (PatchProxy.isSupport(new Object[0], wVar, w.f70115a, false, 79460, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], wVar, w.f70115a, false, 79460, new Class[0], Void.TYPE);
                        } else {
                            wVar.f70116b = (TextView) wVar.n.findViewById(C0906R.id.di2);
                            wVar.g = (DmtStatusView) wVar.n.findViewById(C0906R.id.cvd);
                            wVar.f70117c = (FrameLayout) wVar.n.findViewById(C0906R.id.cge);
                            wVar.f70118d = (EditText) wVar.n.findViewById(C0906R.id.di0);
                            wVar.f70120f = (FrameLayout) wVar.n.findViewById(C0906R.id.auh);
                            wVar.h = (RelativeLayout) wVar.n.findViewById(C0906R.id.cl7);
                            wVar.f70119e = (ImageButton) wVar.n.findViewById(C0906R.id.ns);
                        }
                        wVar.f70118d.setOnEditorActionListener(wVar.m);
                        wVar.f70118d.addTextChangedListener(wVar.l);
                        wVar.f70117c.setOnClickListener(wVar.m);
                        wVar.f70116b.setOnClickListener(wVar.m);
                        wVar.f70119e.setOnClickListener(wVar.m);
                        wVar.g.setBuilder(DmtStatusView.a.a((Context) wVar.j).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new x(wVar)).a((int) C0906R.string.f4486dmt, (int) C0906R.string.dmu).c(1));
                        wVar.q = new f.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f70121a;

                            public final void a(int i) {
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70121a, false, 79473, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70121a, false, 79473, new Class[]{Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w.this.g.getLayoutParams();
                                layoutParams.bottomMargin = i;
                                w.this.g.setLayoutParams(layoutParams);
                            }

                            public final void b(int i) {
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70121a, false, 79474, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70121a, false, 79474, new Class[]{Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w.this.g.getLayoutParams();
                                layoutParams.bottomMargin = 0;
                                w.this.g.setLayoutParams(layoutParams);
                            }
                        };
                        if (PatchProxy.isSupport(new Object[0], null, SearchInfoStickerFragment.f69790a, true, 79413, new Class[0], SearchInfoStickerFragment.class)) {
                            searchInfoStickerFragment = (SearchInfoStickerFragment) PatchProxy.accessDispatch(new Object[0], null, SearchInfoStickerFragment.f69790a, true, 79413, new Class[0], SearchInfoStickerFragment.class);
                        } else {
                            searchInfoStickerFragment = new SearchInfoStickerFragment();
                        }
                        wVar.i = searchInfoStickerFragment;
                        wVar.k = wVar.j.getSupportFragmentManager();
                    }
                    searchInfoStickerPresenter.f4014c.i.f69794e = new r(searchInfoStickerPresenter);
                }
                this.h.f4015d = new SearchInfoStickerPresenter.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f69775a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f69775a, false, 79379, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f69775a, false, 79379, new Class[0], Void.TYPE);
                            return;
                        }
                        InfoStickerViewImpl.this.i.setCursorVisible(false);
                        InfoStickerViewImpl.this.i.clearFocus();
                        InfoStickerViewImpl.this.g.setVisibility(0);
                        InfoStickerViewImpl.this.a(false);
                    }
                };
                this.n = new m(this.f4007b, relativeLayout, textView);
                this.i.setOnTouchListener(new View.OnTouchListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f69777a;

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        String str;
                        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f69777a, false, 79380, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f69777a, false, 79380, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        }
                        if (motionEvent.getAction() == 1) {
                            InfoStickerViewImpl.this.g.setVisibility(4);
                            SearchInfoStickerPresenter searchInfoStickerPresenter = InfoStickerViewImpl.this.h;
                            if (PatchProxy.isSupport(new Object[0], searchInfoStickerPresenter, SearchInfoStickerPresenter.f4012a, false, 79438, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], searchInfoStickerPresenter, SearchInfoStickerPresenter.f4012a, false, 79438, new Class[0], Void.TYPE);
                            } else if (!searchInfoStickerPresenter.f4016e) {
                                searchInfoStickerPresenter.f4016e = true;
                                w wVar = searchInfoStickerPresenter.f4014c;
                                if (PatchProxy.isSupport(new Object[0], wVar, w.f70115a, false, 79467, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], wVar, w.f70115a, false, 79467, new Class[0], Void.TYPE);
                                } else {
                                    wVar.f70118d.post(new z(wVar));
                                    wVar.f70120f.setVisibility(0);
                                    wVar.p = new f(wVar.j);
                                    wVar.p.a(wVar.q);
                                }
                                searchInfoStickerPresenter.a(0);
                            }
                            InfoStickerViewImpl.this.i.requestFocus();
                            InfoStickerViewImpl.this.i.setCursorVisible(true);
                            InfoStickerViewImpl.this.a(true);
                            d a2 = new d().a("creation_id", InfoStickerViewImpl.this.f4010e.creationId).a("shoot_way", InfoStickerViewImpl.this.f4010e.mShootWay).a("content_source", InfoStickerViewImpl.this.f4010e.getAvetParameter().getContentSource()).a("content_type", InfoStickerViewImpl.this.f4010e.getAvetParameter().getContentType());
                            if (InfoStickerViewImpl.this.f4011f) {
                                str = "edit_post_page";
                            } else {
                                str = "video_edit_page";
                            }
                            r.a("sticker_search_keyword", (Map) a2.a("enter_from", str).a("tab_name", "贴图").f34114b);
                        }
                        return false;
                    }
                });
            }
            this.l = new InfoStickerPagerAdapter(this.f4007b.getSupportFragmentManager(), viewPager);
            this.l.f69727c = this.f4011f;
            viewPager.setAdapter(this.l);
            viewPager.setOffscreenPageLimit(3);
            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(this.m));
            if (PatchProxy.isSupport(new Object[]{viewPager}, this, f4006a, false, 79371, new Class[]{ViewPager.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewPager}, this, f4006a, false, 79371, new Class[]{ViewPager.class}, Void.TYPE);
            } else {
                this.m.a(new TabLayout.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f69779a;

                    public final void b(TabLayout.e eVar) {
                    }

                    public final void c(TabLayout.e eVar) {
                    }

                    public final void a(TabLayout.e eVar) {
                        String str;
                        String str2;
                        if (PatchProxy.isSupport(new Object[]{eVar}, this, f69779a, false, 79381, new Class[]{TabLayout.e.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{eVar}, this, f69779a, false, 79381, new Class[]{TabLayout.e.class}, Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                        d a2 = d.a().a("scene_id", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR).a("creation_id", InfoStickerViewImpl.this.f4010e.creationId).a("shoot_way", InfoStickerViewImpl.this.f4010e.mShootWay).a("draft_id", InfoStickerViewImpl.this.f4010e.draftId);
                        if (eVar.f70400f == 0) {
                            str = "表情";
                        } else {
                            str = "emoji";
                        }
                        d a3 = a2.a("tab_name", str);
                        if (InfoStickerViewImpl.this.f4011f) {
                            str2 = "edit_post_page";
                        } else {
                            str2 = "video_edit_page";
                        }
                        aVar.a("click_prop_tab", a3.a("enter_from", str2).f34114b);
                        viewPager.setCurrentItem(eVar.f70400f, true);
                    }
                });
            }
            InfoStickerPagerAdapter infoStickerPagerAdapter = this.l;
            if (PatchProxy.isSupport(new Object[]{infoStickerPagerAdapter}, this, f4006a, false, 79370, new Class[]{InfoStickerPagerAdapter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{infoStickerPagerAdapter}, this, f4006a, false, 79370, new Class[]{InfoStickerPagerAdapter.class}, Void.TYPE);
            } else {
                this.m.b();
                this.m.setMaxTabModeForCount(infoStickerPagerAdapter.getCount());
                int i3 = 0;
                while (i3 < infoStickerPagerAdapter.getCount()) {
                    AVDmtTabLayout aVDmtTabLayout = this.m;
                    TabLayout.e a2 = this.m.a();
                    Object[] objArr2 = {Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect = InfoStickerPagerAdapter.f69725a;
                    InfoStickerPagerAdapter infoStickerPagerAdapter2 = infoStickerPagerAdapter;
                    if (PatchProxy.isSupport(objArr2, infoStickerPagerAdapter, changeQuickRedirect, false, 79310, new Class[]{Integer.TYPE}, View.class)) {
                        aVar = (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, infoStickerPagerAdapter2, InfoStickerPagerAdapter.f69725a, false, 79310, new Class[]{Integer.TYPE}, View.class);
                    } else {
                        com.ss.android.ugc.aweme.themechange.base.a a3 = AVDmtTabLayout.w.a(infoStickerPagerAdapter2.f69726b.getContext(), true);
                        if (i3 == 0) {
                            i2 = C0906R.string.cdr;
                        } else {
                            i2 = C0906R.string.ar2;
                        }
                        a3.setText(i2);
                        a3.setOnClickListener(new l(infoStickerPagerAdapter2, i3));
                        aVar = a3;
                    }
                    aVDmtTabLayout.a(a2.a(aVar));
                    i3++;
                    infoStickerPagerAdapter = infoStickerPagerAdapter2;
                }
            }
            viewPager.setCurrentItem(0);
            this.o = ViewPagerBottomSheetBehavior.a(frameLayout);
            this.o.l = new ViewPagerBottomSheetBehavior.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69767a;

                public final void a(@NonNull View view, float f2) {
                }

                public final void a(@NonNull View view, int i) {
                    if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f69767a, false, 79374, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f69767a, false, 79374, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 4) {
                        if (InfoStickerViewImpl.this.f4009d != null) {
                            InfoStickerViewImpl.this.f4009d.e();
                        }
                    } else if (i == 1) {
                        KeyboardUtils.c(InfoStickerViewImpl.this.i);
                    }
                }
            };
            this.o.a(viewPager);
            this.f4009d = new com.ss.android.ugc.aweme.shortvideo.sticker.c.a(this.j, this.k, frameLayout);
            this.f4009d.a((com.ss.android.ugc.aweme.photomovie.transition.f) new f.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69769a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f69769a, false, 79375, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f69769a, false, 79375, new Class[0], Void.TYPE);
                        return;
                    }
                    if (InfoStickerViewImpl.this.f4008c != null) {
                        InfoStickerViewImpl.this.f4008c.a();
                    }
                    if (InfoStickerViewImpl.this.h != null) {
                        InfoStickerViewImpl.this.h.a(true);
                    }
                    if (m.a().b() && InfoStickerViewImpl.this.f4007b != null) {
                        InfoStickerModule.a(InfoStickerViewImpl.this.f4007b).b();
                    }
                }

                public final void d() {
                    if (PatchProxy.isSupport(new Object[0], this, f69769a, false, 79376, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f69769a, false, 79376, new Class[0], Void.TYPE);
                        return;
                    }
                    if (InfoStickerViewImpl.this.f4008c != null) {
                        InfoStickerViewImpl.this.f4008c.b();
                    }
                    if (InfoStickerViewImpl.this.h != null) {
                        InfoStickerViewImpl.this.h.a(false);
                    }
                    if (InfoStickerViewImpl.this.f4007b != null) {
                        InfoStickerModule.a(InfoStickerViewImpl.this.f4007b).a();
                    }
                }
            });
            this.k.findViewById(C0906R.id.cvy).setOnClickListener(new ax() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69771a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f69771a, false, 79377, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f69771a, false, 79377, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    InfoStickerViewImpl.this.f4009d.b(new com.ss.android.ugc.aweme.shortvideo.sticker.c.c());
                }
            });
            InfoStickerModule.a(this.f4007b).c().observe(this.f4007b, new Observer<Effect>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69773a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Effect effect = (Effect) obj;
                    int i = 1;
                    if (PatchProxy.isSupport(new Object[]{effect}, this, f69773a, false, 79378, new Class[]{Effect.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect}, this, f69773a, false, 79378, new Class[]{Effect.class}, Void.TYPE);
                        return;
                    }
                    if (InfoStickerViewImpl.this.f4008c != null) {
                        if (PatchProxy.isSupport(new Object[]{effect}, null, n.f70095a, true, 79361, new Class[]{Effect.class}, Integer.TYPE)) {
                            i = ((Integer) PatchProxy.accessDispatch(new Object[]{effect}, null, n.f70095a, true, 79361, new Class[]{Effect.class}, Integer.TYPE)).intValue();
                        } else if (effect.getTags().contains("weather")) {
                            i = 2;
                        } else if (effect.getTags().contains("time")) {
                            i = 3;
                        } else if (effect.getTags().contains("date")) {
                            i = 4;
                        }
                        switch (i) {
                            case 2:
                                InfoStickerViewImpl.this.f4008c.a(effect, String.valueOf(InfoStickerModule.a(InfoStickerViewImpl.this.f4007b).f69784c));
                                return;
                            case 3:
                            case 4:
                                InfoStickerViewImpl.this.f4008c.a(effect, String.valueOf(System.currentTimeMillis() / 1000));
                                return;
                            default:
                                InfoStickerViewImpl.this.f4008c.a(effect, null);
                                break;
                        }
                    }
                }
            });
        }
        this.f4009d.a((ITransition) new com.ss.android.ugc.aweme.shortvideo.sticker.c.c());
        this.o.b(3);
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.qrcode.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f4006a, false, 79372, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f4006a, false, 79372, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE);
        } else if (m.a().b()) {
            InfoStickerModule.a(this.f4007b).b();
        } else {
            InfoStickerModule.a(this.f4007b).a();
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4006a, false, 79369, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4006a, false, 79369, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            m mVar = this.n;
            if (PatchProxy.isSupport(new Object[0], mVar, m.f70089a, false, 79359, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mVar, m.f70089a, false, 79359, new Class[0], Void.TYPE);
            } else {
                mVar.a(true);
            }
        } else {
            m mVar2 = this.n;
            if (PatchProxy.isSupport(new Object[0], mVar2, m.f70089a, false, 79358, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mVar2, m.f70089a, false, 79358, new Class[0], Void.TYPE);
                return;
            }
            mVar2.a(false);
        }
    }

    public InfoStickerViewImpl(FragmentActivity fragmentActivity, FrameLayout frameLayout, cb cbVar, c.a aVar) {
        this.f4007b = fragmentActivity;
        this.j = frameLayout;
        this.f4008c = aVar;
        this.f4010e = cbVar;
    }
}
