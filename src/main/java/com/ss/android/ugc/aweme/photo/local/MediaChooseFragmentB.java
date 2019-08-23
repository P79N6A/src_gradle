package com.ss.android.ugc.aweme.photo.local;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.utils.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.effect.NoScrollViewPager;
import com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapterB;
import com.ss.android.ugc.aweme.mediachoose.MediaAdapterB;
import com.ss.android.ugc.aweme.mediachoose.VideoChooseFragmentB;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.gesture.a.b;
import com.ss.android.ugc.aweme.shortvideo.local.ChooseMediaGestureLayout;
import com.ss.android.ugc.aweme.shortvideo.local.d;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MediaChooseFragmentB extends AmeBaseFragment implements View.OnClickListener, ChooseMediaGestureLayout.a, VideoRecordGestureLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58593a;

    /* renamed from: b  reason: collision with root package name */
    public NoScrollViewPager f58594b;

    /* renamed from: c  reason: collision with root package name */
    public ImageChooseAdapterB.b f58595c;

    /* renamed from: d  reason: collision with root package name */
    public MediaAdapterB.b f58596d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f58597e;

    /* renamed from: f  reason: collision with root package name */
    public int f58598f = 2;
    int g;
    public ImageView h;
    public VideoChooseFragmentB i;
    public ImageChooseFragmentB j;
    public d k;
    public boolean l;
    float m;
    float n;
    private TextView o;
    private TextView p;
    private RelativeLayout q;
    private ChooseMediaGestureLayout r;
    private ImageView s;
    private RelativeLayout t;
    private LinearLayout u;
    private PhotoMovieContext v = new PhotoMovieContext();
    private View.OnTouchListener w = new View.OnTouchListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58599a;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f58599a, false, 63702, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f58599a, false, 63702, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (MediaChooseFragmentB.this.k == null) {
                return false;
            } else {
                switch (motionEvent.getAction()) {
                    case 0:
                        MediaChooseFragmentB.this.n = motionEvent.getRawY();
                        MediaChooseFragmentB.this.m = motionEvent.getY();
                        break;
                    case 1:
                        if (!MediaChooseFragmentB.this.k.b()) {
                            if (((float) MediaChooseFragmentB.this.k.c()) <= c.a(MediaChooseFragmentB.this.h.getContext(), 150.0f)) {
                                MediaChooseFragmentB.this.k.d();
                            } else if (((float) MediaChooseFragmentB.this.k.c()) >= c.a(MediaChooseFragmentB.this.h.getContext(), 250.0f)) {
                                MediaChooseFragmentB.this.k.f();
                            } else {
                                MediaChooseFragmentB.this.k.e();
                            }
                        } else if (MediaChooseFragmentB.this.k.h() > c.a(MediaChooseFragmentB.this.h.getContext(), 100.0f)) {
                            MediaChooseFragmentB.this.k.f();
                            return true;
                        } else {
                            MediaChooseFragmentB.this.k.g();
                        }
                        MediaChooseFragmentB.this.m = 0.0f;
                        break;
                    case 2:
                        if (MediaChooseFragmentB.this.m == 0.0f) {
                            MediaChooseFragmentB.this.m = motionEvent.getY();
                        }
                        if (MediaChooseFragmentB.this.n == 0.0f) {
                            MediaChooseFragmentB.this.n = motionEvent.getRawY();
                        }
                        float y = motionEvent.getY() - MediaChooseFragmentB.this.m;
                        float rawY = motionEvent.getRawY() - MediaChooseFragmentB.this.n;
                        if (!MediaChooseFragmentB.this.k.b()) {
                            MediaChooseFragmentB.this.k.a(rawY);
                            MediaChooseFragmentB.this.k.b(y);
                            return true;
                        }
                        int h = (int) (MediaChooseFragmentB.this.k.h() + y);
                        if (h > 0) {
                            MediaChooseFragmentB.this.k.a(h);
                            return true;
                        }
                        break;
                }
                return true;
            }
        }
    };

    class MediaTypeAdapter extends FragmentPagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58601a;

        public int getCount() {
            return MediaChooseFragmentB.this.f58598f;
        }

        public Fragment getItem(int i) {
            ImageChooseFragmentB imageChooseFragmentB;
            VideoChooseFragmentB videoChooseFragmentB;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58601a, false, 63703, new Class[]{Integer.TYPE}, Fragment.class)) {
                return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58601a, false, 63703, new Class[]{Integer.TYPE}, Fragment.class);
            } else if (i2 == 0) {
                MediaChooseFragmentB mediaChooseFragmentB = MediaChooseFragmentB.this;
                int color = MediaChooseFragmentB.this.getResources().getColor(C0906R.color.a3l);
                int color2 = MediaChooseFragmentB.this.getResources().getColor(C0906R.color.a2p);
                com.ss.android.ugc.aweme.shortvideo.c cVar = (com.ss.android.ugc.aweme.shortvideo.c) MediaChooseFragmentB.this.getArguments().getSerializable("challenge");
                MediaAdapterB.b bVar = MediaChooseFragmentB.this.f58596d;
                if (PatchProxy.isSupport(new Object[]{3, Integer.valueOf(color), Integer.valueOf(color2), cVar, bVar}, null, VideoChooseFragmentB.f55222a, true, 58580, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.c.class, MediaAdapterB.b.class}, VideoChooseFragmentB.class)) {
                    videoChooseFragmentB = (VideoChooseFragmentB) PatchProxy.accessDispatch(new Object[]{3, Integer.valueOf(color), Integer.valueOf(color2), cVar, bVar}, null, VideoChooseFragmentB.f55222a, true, 58580, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.c.class, MediaAdapterB.b.class}, VideoChooseFragmentB.class);
                } else {
                    VideoChooseFragmentB videoChooseFragmentB2 = new VideoChooseFragmentB();
                    Bundle bundle = new Bundle();
                    bundle.putInt("ARG_NUM_COLUMNS", 3);
                    bundle.putInt("ARG_TEXT_COLOR", color);
                    bundle.putInt("ARG_SHADOW_COLOR", color2);
                    bundle.putSerializable("challenge", cVar);
                    videoChooseFragmentB2.setArguments(bundle);
                    videoChooseFragmentB2.i = bVar;
                    videoChooseFragmentB = videoChooseFragmentB2;
                }
                mediaChooseFragmentB.i = videoChooseFragmentB;
                MediaChooseFragmentB.this.i.l = MediaChooseFragmentB.this.f58597e;
                MediaChooseFragmentB.this.i.k = MediaChooseFragmentB.this;
                return MediaChooseFragmentB.this.i;
            } else if (i2 == 1) {
                MediaChooseFragmentB mediaChooseFragmentB2 = MediaChooseFragmentB.this;
                MediaChooseFragmentB mediaChooseFragmentB3 = MediaChooseFragmentB.this;
                int color3 = MediaChooseFragmentB.this.getResources().getColor(C0906R.color.a3l);
                int color4 = MediaChooseFragmentB.this.getResources().getColor(C0906R.color.a2p);
                ImageChooseAdapterB.b bVar2 = MediaChooseFragmentB.this.f58595c;
                if (PatchProxy.isSupport(new Object[]{mediaChooseFragmentB3, 3, Integer.valueOf(color3), Integer.valueOf(color4), bVar2}, null, ImageChooseFragmentB.f58573a, true, 63658, new Class[]{MediaChooseFragmentB.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, ImageChooseAdapterB.b.class}, ImageChooseFragmentB.class)) {
                    imageChooseFragmentB = (ImageChooseFragmentB) PatchProxy.accessDispatch(new Object[]{mediaChooseFragmentB3, 3, Integer.valueOf(color3), Integer.valueOf(color4), bVar2}, null, ImageChooseFragmentB.f58573a, true, 63658, new Class[]{MediaChooseFragmentB.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, ImageChooseAdapterB.b.class}, ImageChooseFragmentB.class);
                } else {
                    ImageChooseFragmentB imageChooseFragmentB2 = new ImageChooseFragmentB();
                    imageChooseFragmentB2.k = mediaChooseFragmentB3;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("ARG_NUM_COLUMNS", 3);
                    bundle2.putInt("ARG_TEXT_COLOR", color3);
                    bundle2.putInt("ARG_SHADOW_COLOR", color4);
                    imageChooseFragmentB2.setArguments(bundle2);
                    imageChooseFragmentB2.g = bVar2;
                    imageChooseFragmentB = imageChooseFragmentB2;
                }
                mediaChooseFragmentB2.j = imageChooseFragmentB;
                MediaChooseFragmentB.this.j.h = MediaChooseFragmentB.this;
                return MediaChooseFragmentB.this.j;
            } else {
                throw new IllegalArgumentException("unknown position: " + i2);
            }
        }

        MediaTypeAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }
    }

    public final boolean a(float f2) {
        return false;
    }

    public final boolean a(MotionEvent motionEvent) {
        return false;
    }

    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    public final boolean a(b bVar) {
        return false;
    }

    public final boolean a(b bVar, float f2, float f3) {
        return false;
    }

    public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.c cVar) {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final boolean b(float f2) {
        return false;
    }

    public final boolean b(MotionEvent motionEvent) {
        return false;
    }

    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    public final boolean c() {
        return false;
    }

    public final boolean c(float f2) {
        return false;
    }

    public final boolean c(MotionEvent motionEvent) {
        return false;
    }

    public final boolean d(MotionEvent motionEvent) {
        return false;
    }

    public final boolean e(MotionEvent motionEvent) {
        return false;
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f58593a, false, 63690, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58593a, false, 63690, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f58594b == null) {
            return false;
        } else {
            if (this.f58594b.getCurrentItem() == 0) {
                z = true;
            }
            return z;
        }
    }

    public final void b(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f58593a, false, 63698, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f58593a, false, 63698, new Class[]{b.class}, Void.TYPE);
        } else if (!this.k.b()) {
            if (((float) this.k.c()) <= c.a(this.h.getContext(), 150.0f)) {
                this.k.d();
            } else {
                this.k.e();
            }
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58593a, false, 63689, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58593a, false, 63689, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            com.ss.android.ugc.aweme.mediachoose.a.d.a(getActivity().getApplicationContext());
        }
        this.f58594b.setAdapter(new MediaTypeAdapter(getChildFragmentManager()));
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58593a, false, 63687, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58593a, false, 63687, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.g = getArguments().getInt("ARG_SUPPORT_FLAGS", 0);
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f58593a, false, 63695, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f58593a, false, 63695, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 1) {
            this.o.setTextColor(Color.parseColor("#161823"));
            this.p.setTextColor(Color.parseColor("#80161823"));
            TextPaint paint = this.o.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
            TextPaint paint2 = this.p.getPaint();
            if (paint2 != null) {
                paint2.setFakeBoldText(false);
            }
        } else {
            this.o.setTextColor(Color.parseColor("#80161823"));
            this.p.setTextColor(Color.parseColor("#161823"));
            TextPaint paint3 = this.o.getPaint();
            if (paint3 != null) {
                paint3.setFakeBoldText(false);
            }
            TextPaint paint4 = this.p.getPaint();
            if (paint4 != null) {
                paint4.setFakeBoldText(true);
            }
        }
    }

    public final void b(List<ImageChooseAdapterB.a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f58593a, false, 63697, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f58593a, false, 63697, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (ImageChooseAdapterB.a aVar : list) {
                    arrayList.add(aVar.f56315e);
                }
                this.v.mImageList = arrayList;
            }
            this.k.a(this.v);
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f58593a, false, 63693, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58593a, false, 63693, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.dk8) {
            b(1);
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("tab_name", "video").a("previous_page", this.k.a().a());
            if (this.k.b()) {
                str2 = "upload_page";
            } else {
                str2 = "multi_shoot_page";
            }
            r.a("enter_upload_tab", (Map) a2.a("enter_from", str2).a("creation_id", this.k.a().b()).a("shoot_way", this.k.a().c()).f34114b);
            this.f58594b.setCurrentItem(0);
            this.h.setVisibility(8);
            return;
        }
        if (id == C0906R.id.dk9) {
            b(2);
            this.h.setVisibility(0);
            com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a().a("tab_name", "photo").a("previous_page", this.k.a().a());
            if (this.k.b()) {
                str = "upload_page";
            } else {
                str = "multi_shoot_page";
            }
            r.a("enter_upload_tab", (Map) a3.a("enter_from", str).a("creation_id", this.k.a().b()).a("shoot_way", this.k.a().c()).f34114b);
            if (this.f58594b.getCurrentItem() == 1) {
                ((ImageChooseFragmentB) a((ViewPager) this.f58594b, 1)).a();
                if (this.l) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.h, "rotation", new float[]{180.0f, 0.0f});
                    ofFloat.setDuration(300);
                    ofFloat.start();
                } else {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.h, "rotation", new float[]{0.0f, 180.0f});
                    ofFloat2.setDuration(300);
                    ofFloat2.start();
                }
                this.l = !this.l;
                return;
            }
            this.f58594b.setCurrentItem(1);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f58593a, false, 63701, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f58593a, false, 63701, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.s != null) {
            switch (i2) {
                case 1:
                    this.s.setImageResource(2130838800);
                    return;
                case 2:
                    this.s.setImageResource(2130838888);
                    break;
            }
        }
    }

    public final void a(List<a> list) {
        List<a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f58593a, false, 63691, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f58593a, false, 63691, new Class[]{List.class}, Void.TYPE);
            return;
        }
        VideoChooseFragmentB videoChooseFragmentB = (VideoChooseFragmentB) a((ViewPager) this.f58594b, 0);
        if (videoChooseFragmentB != null) {
            if (PatchProxy.isSupport(new Object[]{list2}, videoChooseFragmentB, VideoChooseFragmentB.f55222a, false, 58582, new Class[]{List.class}, Void.TYPE)) {
                VideoChooseFragmentB videoChooseFragmentB2 = videoChooseFragmentB;
                PatchProxy.accessDispatch(new Object[]{list2}, videoChooseFragmentB2, VideoChooseFragmentB.f55222a, false, 58582, new Class[]{List.class}, Void.TYPE);
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                i2 = (int) (((long) i2) + list2.get(i3).h);
            }
            if (((long) i2) <= videoChooseFragmentB.m) {
                UIUtils.displayToast((Context) videoChooseFragmentB.getActivity(), videoChooseFragmentB.getString(C0906R.string.dp6, Long.valueOf(videoChooseFragmentB.m / 1000)));
            } else if (i2 > 3600000) {
                UIUtils.displayToast((Context) videoChooseFragmentB.getActivity(), (int) C0906R.string.bcy);
            } else {
                com.ss.android.ugc.aweme.mediachoose.a.d.a().b();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    com.ss.android.ugc.aweme.mediachoose.a.d.a().a(list2.get(i4));
                }
                String str = list2.get(0).f56315e;
                if (PatchProxy.isSupport(new Object[]{str}, videoChooseFragmentB, VideoChooseFragmentB.f55222a, false, 58583, new Class[]{String.class}, Void.TYPE)) {
                    VideoChooseFragmentB videoChooseFragmentB3 = videoChooseFragmentB;
                    PatchProxy.accessDispatch(new Object[]{str}, videoChooseFragmentB3, VideoChooseFragmentB.f55222a, false, 58583, new Class[]{String.class}, Void.TYPE);
                } else if (videoChooseFragmentB.isViewValid()) {
                    if (!videoChooseFragmentB.l) {
                        videoChooseFragmentB.a(str);
                    } else if (videoChooseFragmentB.getActivity() != null) {
                        videoChooseFragmentB.a((Activity) videoChooseFragmentB.getActivity(), str, true, 60000);
                    }
                }
            }
        }
    }

    private static String a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f58593a, true, 63700, new Class[]{Integer.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f58593a, true, 63700, new Class[]{Integer.TYPE, Integer.TYPE}, String.class);
        }
        return "android:switcher:" + i2 + ":" + i3;
    }

    @Nullable
    public final Fragment a(ViewPager viewPager, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewPager, Integer.valueOf(i2)}, this, f58593a, false, 63699, new Class[]{ViewPager.class, Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{viewPager, Integer.valueOf(i2)}, this, f58593a, false, 63699, new Class[]{ViewPager.class, Integer.TYPE}, Fragment.class);
        } else if (!isAdded()) {
            return null;
        } else {
            return getChildFragmentManager().findFragmentByTag(a(viewPager.getId(), i2));
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String str;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58593a, false, 63688, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58593a, false, 63688, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.aa2, viewGroup2, false);
        this.f58594b = (NoScrollViewPager) inflate.findViewById(C0906R.id.duu);
        this.f58594b.setNoScroll(true);
        this.u = (LinearLayout) inflate.findViewById(C0906R.id.bi7);
        if (this.g == 0 || com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.AmericaRecordOptim) != 0) {
            this.u.setVisibility(8);
            this.f58598f = 1;
        }
        this.o = (TextView) inflate.findViewById(C0906R.id.dk8);
        this.p = (TextView) inflate.findViewById(C0906R.id.dk9);
        this.h = (ImageView) inflate.findViewById(C0906R.id.b5u);
        this.q = (RelativeLayout) inflate.findViewById(C0906R.id.cgm);
        this.t = (RelativeLayout) inflate.findViewById(C0906R.id.cg1);
        this.s = (ImageView) inflate.findViewById(C0906R.id.b38);
        this.t.setOnTouchListener(this.w);
        this.u.setOnTouchListener(this.w);
        this.r = (ChooseMediaGestureLayout) inflate.findViewById(C0906R.id.ajc);
        this.r.setOnGestureListener(this);
        this.r.setInterceptTouchEvent(this);
        this.o.setOnClickListener(this);
        this.p.setOnClickListener(this);
        if (!(this.k == null || this.k.a() == null)) {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("tab_name", "video").a("previous_page", this.k.a().a());
            if (this.k.b()) {
                str = "video_shoot_page";
            } else {
                str = "multi_shoot_page";
            }
            r.a("enter_upload_tab", (Map) a2.a("enter_from", str).a("creation_id", this.k.a().b()).a("shoot_way", this.k.a().c()).f34114b);
        }
        b(1);
        return inflate;
    }

    public static MediaChooseFragmentB a(@Nullable com.ss.android.ugc.aweme.shortvideo.c cVar, int i2, ImageChooseAdapterB.b bVar, MediaAdapterB.b bVar2) {
        MediaAdapterB.b bVar3 = bVar2;
        if (PatchProxy.isSupport(new Object[]{null, Integer.valueOf(i2), null, bVar3}, null, f58593a, true, 63686, new Class[]{com.ss.android.ugc.aweme.shortvideo.c.class, Integer.TYPE, ImageChooseAdapterB.b.class, MediaAdapterB.b.class}, MediaChooseFragmentB.class)) {
            return (MediaChooseFragmentB) PatchProxy.accessDispatch(new Object[]{null, Integer.valueOf(i2), null, bVar3}, null, f58593a, true, 63686, new Class[]{com.ss.android.ugc.aweme.shortvideo.c.class, Integer.TYPE, ImageChooseAdapterB.b.class, MediaAdapterB.b.class}, MediaChooseFragmentB.class);
        }
        MediaChooseFragmentB mediaChooseFragmentB = new MediaChooseFragmentB();
        Bundle bundle = new Bundle();
        bundle.putSerializable("challenge", null);
        bundle.putInt("ARG_SUPPORT_FLAGS", i2);
        mediaChooseFragmentB.setArguments(bundle);
        mediaChooseFragmentB.f58595c = null;
        mediaChooseFragmentB.f58596d = bVar3;
        return mediaChooseFragmentB;
    }
}
