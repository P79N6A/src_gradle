package com.ss.android.ugc.aweme.photo.setfilter;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.transition.Slide;
import android.transition.Transition;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.PhotoView;
import com.ss.android.ugc.aweme.port.in.a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class PhotoSetFilterActivity extends AmeActivity implements View.OnClickListener, View.OnTouchListener, f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58762a;

    /* renamed from: b  reason: collision with root package name */
    public SetFilterLayout f58763b;

    /* renamed from: c  reason: collision with root package name */
    public int f58764c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f58765d;

    /* renamed from: e  reason: collision with root package name */
    private PhotoView f58766e;

    /* renamed from: f  reason: collision with root package name */
    private PhotoContext f58767f;
    private ImageView g;

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58762a, false, 63867, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58762a, false, 63867, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58762a, false, 63870, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58762a, false, 63870, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58762a, false, 63871, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58762a, false, 63871, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private JSONObject a() {
        if (PatchProxy.isSupport(new Object[0], this, f58762a, false, 63869, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f58762a, false, 63869, new Class[0], JSONObject.class);
        }
        String str = "upload";
        if (this.f58767f.mPhotoFrom == 1) {
            str = "direct_shoot";
        }
        return new t().a("is_photo", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("shoot_way", str).a("position", "mid_page").a();
    }

    public void onCreate(Bundle bundle) {
        int i;
        Observer observer;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58762a, false, 63859, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58762a, false, 63859, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity", "onCreate", true);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cy);
        this.f58767f = (PhotoContext) getIntent().getSerializableExtra("photo_model");
        this.f58765d = getIntent().getBooleanExtra("is_first_open_filter", true);
        if (this.f58765d) {
            i = 0;
        } else {
            i = this.f58767f.mFilterIndex;
        }
        this.f58764c = i;
        if (PatchProxy.isSupport(new Object[0], this, f58762a, false, 63860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58762a, false, 63860, new Class[0], Void.TYPE);
        } else {
            this.f58766e = (PhotoView) findViewById(C0906R.id.bxq);
            this.f58766e.a(this, this.f58767f);
            this.f58766e.a(w.a(this.f58764c).j, this.f58767f.mFilterRate);
            this.f58763b = (SetFilterLayout) findViewById(C0906R.id.ads);
            this.f58763b.setPhotoContext(this.f58767f);
            this.f58763b.setOnFilterChangeListener(this);
            this.f58763b.setData(a.d().b());
            MutableLiveData<List<h>> a2 = a.d().a();
            if (PatchProxy.isSupport(new Object[0], this, f58762a, false, 63868, new Class[0], Observer.class)) {
                observer = (Observer) PatchProxy.accessDispatch(new Object[0], this, f58762a, false, 63868, new Class[0], Observer.class);
            } else {
                observer = new Observer<List<h>>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58770a;

                    public final /* synthetic */ void onChanged(@Nullable Object obj) {
                        List list = (List) obj;
                        if (PatchProxy.isSupport(new Object[]{list}, this, f58770a, false, 63873, new Class[]{List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list}, this, f58770a, false, 63873, new Class[]{List.class}, Void.TYPE);
                            return;
                        }
                        PhotoSetFilterActivity.this.f58763b.setData(list);
                    }
                };
            }
            a2.observe(this, observer);
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
                    public static ChangeQuickRedirect f58768a;

                    public final void onTransitionCancel(Transition transition) {
                    }

                    public final void onTransitionPause(Transition transition) {
                    }

                    public final void onTransitionResume(Transition transition) {
                    }

                    public final void onTransitionStart(Transition transition) {
                    }

                    public final void onTransitionEnd(Transition transition) {
                        if (PatchProxy.isSupport(new Object[]{transition}, this, f58768a, false, 63872, new Class[]{Transition.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{transition}, this, f58768a, false, 63872, new Class[]{Transition.class}, Void.TYPE);
                            return;
                        }
                        PhotoSetFilterActivity.this.f58763b.setFilterIndex(PhotoSetFilterActivity.this.f58764c);
                    }
                });
            } else {
                this.f58763b.setFilterIndex(this.f58764c);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity", "onCreate", false);
    }

    public final void a(PhotoContext photoContext, int i) {
        if (PatchProxy.isSupport(new Object[]{photoContext, Integer.valueOf(i)}, this, f58762a, false, 63861, new Class[]{PhotoContext.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext, Integer.valueOf(i)}, this, f58762a, false, 63861, new Class[]{PhotoContext.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f58767f = photoContext;
        int i2 = this.f58764c;
        if (i != 0) {
            i2 = photoContext.mFilterIndex;
        }
        this.f58766e.a(w.a(i2).j, photoContext.mFilterRate);
        if (i == 1 || i == 0) {
            if (i == 1) {
                r.onEvent(new MobClick().setLabelName("mid_page").setEventName("filter_confirm").setJsonObject(a()));
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
            r.a((Context) this, "filter_strength", "mid_page", String.valueOf((int) (photoContext.mFilterRate * 100.0f)), PushConstants.PUSH_TYPE_NOTIFY, a());
        } else if (i == 5) {
            JSONObject a2 = a();
            try {
                a2.put("filter_name", w.b(this.f58767f.mFilterIndex));
            } catch (JSONException unused) {
            }
            r.a((Context) this, "filter_click", "mid_page", PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, a2);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f58762a, false, 63862, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f58762a, false, 63862, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f58762a, false, 63863, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f58762a, false, 63863, new Class[]{View.class}, Void.TYPE);
            } else if (view != null) {
                ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.5f}).start();
            }
            if (PatchProxy.isSupport(new Object[0], this, f58762a, false, 63865, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58762a, false, 63865, new Class[0], Void.TYPE);
            } else {
                this.f58766e.a(w.a(this.f58767f.mFilterIndex).j, 0.0f);
            }
        } else if (motionEvent.getAction() == 1) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f58762a, false, 63864, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f58762a, false, 63864, new Class[]{View.class}, Void.TYPE);
            } else if (view != null) {
                ObjectAnimator.ofFloat(view, "alpha", new float[]{0.5f, 1.0f}).start();
            }
            if (PatchProxy.isSupport(new Object[0], this, f58762a, false, 63866, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58762a, false, 63866, new Class[0], Void.TYPE);
            } else {
                this.f58766e.a(w.a(this.f58767f.mFilterIndex).j, this.f58767f.mFilterRate);
            }
        }
        return false;
    }
}
