package com.ss.android.ugc.aweme.photo.setfilter;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Slide;
import android.transition.Transition;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.effect.c.a.a;
import com.ss.android.ugc.aweme.filter.aa;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.PhotoView;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class EffectPhotoSetFilterActivity extends AmeActivity implements View.OnClickListener, View.OnTouchListener, f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58730a;

    /* renamed from: b  reason: collision with root package name */
    public EffectSetFilterLayout f58731b;

    /* renamed from: c  reason: collision with root package name */
    public int f58732c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f58733d;

    /* renamed from: e  reason: collision with root package name */
    private PhotoView f58734e;

    /* renamed from: f  reason: collision with root package name */
    private PhotoContext f58735f;
    private ImageView g;
    private Handler h;

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58730a, false, 63808, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58730a, false, 63808, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58730a, false, 63812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58730a, false, 63812, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58730a, false, 63813, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58730a, false, 63813, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private JSONObject b() {
        if (PatchProxy.isSupport(new Object[0], this, f58730a, false, 63811, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f58730a, false, 63811, new Class[0], JSONObject.class);
        }
        String str = "upload";
        if (this.f58735f.mPhotoFrom == 1) {
            str = "direct_shoot";
        }
        return new t().a("is_photo", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("shoot_way", str).a("position", "mid_page").a();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f58730a, false, 63809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58730a, false, 63809, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        EffectSetFilterLayout effectSetFilterLayout = this.f58731b;
        if (PatchProxy.isSupport(new Object[0], effectSetFilterLayout, EffectSetFilterLayout.f58738a, false, 63841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], effectSetFilterLayout, EffectSetFilterLayout.f58738a, false, 63841, new Class[0], Void.TYPE);
            return;
        }
        for (Map.Entry next : effectSetFilterLayout.i.entrySet()) {
            aa.a().b((h) next.getKey(), (a) next.getValue());
        }
    }

    private void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f58730a, false, 63802, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58730a, false, 63802, new Class[0], Void.TYPE);
            return;
        }
        h a2 = w.a(this.f58735f.mFilterIndex);
        EffectCategoryResponse b2 = com.ss.android.ugc.aweme.port.in.a.d().b(a2);
        if (b2 == null) {
            str = "";
        } else {
            str = b2.name;
        }
        com.ss.android.ugc.aweme.utils.a.f75468b.a("select_filter", d.a().a("creation_id", this.f58735f.creationId).a("shoot_way", this.f58735f.mShootWay).a("draft_id", this.f58735f.draftId).a("enter_method", "click").a("enter_from", "video_shoot_page").a("filter_name", a2.f47600d).a("filter_id", a2.f47598b).a("tab_name", str).f34114b);
    }

    public void onCreate(Bundle bundle) {
        int i;
        Observer observer;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58730a, false, 63799, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58730a, false, 63799, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onCreate", true);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cu);
        if (fc.a()) {
            getWindow().clearFlags(1024);
            if (ToolUtils.isFlyme()) {
                StatusBarUtils.setTranslucent(this);
            } else {
                StatusBarUtils.setTransparent(this);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
        }
        this.h = new SafeHandler(this);
        this.f58735f = (PhotoContext) getIntent().getSerializableExtra("photo_model");
        this.f58733d = getIntent().getBooleanExtra("is_first_open_filter", true);
        if (this.f58733d) {
            i = 0;
        } else {
            i = this.f58735f.mFilterIndex;
        }
        this.f58732c = i;
        if (PatchProxy.isSupport(new Object[0], this, f58730a, false, 63800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58730a, false, 63800, new Class[0], Void.TYPE);
        } else {
            this.f58734e = (PhotoView) findViewById(C0906R.id.bxq);
            if (fc.a()) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f58734e.getLayoutParams();
                layoutParams.topMargin = fc.c(this);
                this.f58734e.setLayoutParams(layoutParams);
            }
            this.f58734e.a(this, this.f58735f);
            this.f58734e.a(w.a(this.f58732c).j, this.f58735f.mFilterRate);
            this.f58731b = (EffectSetFilterLayout) findViewById(C0906R.id.ads);
            this.f58731b.setPhotoContext(this.f58735f);
            this.f58731b.setOnFilterChangeListener(this);
            this.f58731b.setData(com.ss.android.ugc.aweme.port.in.a.d().b());
            MediatorLiveData<Map<EffectCategoryResponse, List<h>>> mediatorLiveData = com.ss.android.ugc.aweme.port.in.a.d().f47503d;
            if (PatchProxy.isSupport(new Object[0], this, f58730a, false, 63810, new Class[0], Observer.class)) {
                observer = (Observer) PatchProxy.accessDispatch(new Object[0], this, f58730a, false, 63810, new Class[0], Observer.class);
            } else {
                observer = new b(this);
            }
            mediatorLiveData.observe(this, observer);
            this.g = (ImageView) findViewById(C0906R.id.adk);
            this.g.setOnClickListener(this);
            this.g.setOnTouchListener(this);
            if (Build.VERSION.SDK_INT >= 21) {
                Slide slide = new Slide();
                slide.setDuration(300);
                getWindow().setEnterTransition(slide);
                getWindow().setReturnTransition(slide);
                getWindow().getSharedElementEnterTransition().addListener(new Transition.TransitionListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58736a;

                    public final void onTransitionCancel(Transition transition) {
                    }

                    public final void onTransitionPause(Transition transition) {
                    }

                    public final void onTransitionResume(Transition transition) {
                    }

                    public final void onTransitionStart(Transition transition) {
                    }

                    public final void onTransitionEnd(Transition transition) {
                        if (PatchProxy.isSupport(new Object[]{transition}, this, f58736a, false, 63816, new Class[]{Transition.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{transition}, this, f58736a, false, 63816, new Class[]{Transition.class}, Void.TYPE);
                            return;
                        }
                        EffectPhotoSetFilterActivity.this.f58731b.setFilterIndex(EffectPhotoSetFilterActivity.this.f58732c);
                    }
                });
            } else {
                this.h.post(new a(this));
            }
        }
        a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onCreate", false);
    }

    public final void a(PhotoContext photoContext, int i) {
        if (PatchProxy.isSupport(new Object[]{photoContext, Integer.valueOf(i)}, this, f58730a, false, 63801, new Class[]{PhotoContext.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext, Integer.valueOf(i)}, this, f58730a, false, 63801, new Class[]{PhotoContext.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f58735f = photoContext;
        int i2 = this.f58732c;
        if (i != 0) {
            i2 = photoContext.mFilterIndex;
        }
        this.f58734e.a(w.a(i2).j, photoContext.mFilterRate);
        if (i == 1 || i == 0) {
            if (i == 1) {
                r.onEvent(new MobClick().setLabelName("mid_page").setEventName("filter_confirm").setJsonObject(b()));
            }
            Intent intent = new Intent();
            intent.putExtra("photo_model", photoContext);
            intent.putExtra("set_filter_result", i);
            setResult(-1, intent);
            if (Build.VERSION.SDK_INT >= 21) {
                finishAfterTransition();
            } else {
                finish();
            }
        } else if (i == 2) {
            r.a((Context) this, "filter_strength", "mid_page", String.valueOf((int) (photoContext.mFilterRate * 100.0f)), PushConstants.PUSH_TYPE_NOTIFY, b());
        } else if (i == 5) {
            JSONObject b2 = b();
            try {
                b2.put("filter_name", w.b(this.f58735f.mFilterIndex));
            } catch (JSONException unused) {
            }
            r.a((Context) this, "filter_click", "mid_page", PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, b2);
            a();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f58730a, false, 63803, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f58730a, false, 63803, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f58730a, false, 63804, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f58730a, false, 63804, new Class[]{View.class}, Void.TYPE);
            } else if (view != null) {
                ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.5f}).start();
            }
            if (PatchProxy.isSupport(new Object[0], this, f58730a, false, 63806, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58730a, false, 63806, new Class[0], Void.TYPE);
            } else {
                this.f58734e.a(w.a(this.f58735f.mFilterIndex).j, 0.0f);
            }
        } else if (motionEvent.getAction() == 1) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f58730a, false, 63805, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f58730a, false, 63805, new Class[]{View.class}, Void.TYPE);
            } else if (view != null) {
                ObjectAnimator.ofFloat(view, "alpha", new float[]{0.5f, 1.0f}).start();
            }
            if (PatchProxy.isSupport(new Object[0], this, f58730a, false, 63807, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58730a, false, 63807, new Class[0], Void.TYPE);
            } else {
                this.f58734e.a(w.a(this.f58735f.mFilterIndex).j, this.f58735f.mFilterRate);
            }
        }
        return false;
    }
}
