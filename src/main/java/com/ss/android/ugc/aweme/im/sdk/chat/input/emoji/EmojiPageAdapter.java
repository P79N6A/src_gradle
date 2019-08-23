package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.viewpager.SwipeControlledViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.a.d;
import com.ss.android.ugc.aweme.im.sdk.chat.input.IInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.input.c;
import com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiGridView;
import com.ss.android.ugc.aweme.im.sdk.chat.input.tab.a;
import com.ss.android.ugc.aweme.im.sdk.chat.view.b;
import com.ss.android.ugc.aweme.im.sdk.resources.k;
import com.ss.android.ugc.aweme.im.sdk.utils.az;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class EmojiPageAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50511a;

    /* renamed from: b  reason: collision with root package name */
    public IInputView f50512b;

    /* renamed from: c  reason: collision with root package name */
    public SwipeControlledViewPager f50513c;

    /* renamed from: d  reason: collision with root package name */
    public d f50514d;

    /* renamed from: e  reason: collision with root package name */
    public long f50515e;

    /* renamed from: f  reason: collision with root package name */
    public float f50516f;
    public long g;
    public long h;
    public boolean i = true;
    public int j = -1;
    public Handler k = new Handler(Looper.getMainLooper());
    public float l;
    public float m;
    b n;
    private a o;

    public final int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    public final int getCount() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f50511a, false, 50825, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50511a, false, 50825, new Class[0], Integer.TYPE)).intValue();
        }
        e f2 = this.o.f();
        if (PatchProxy.isSupport(new Object[0], f2, e.f50561a, false, 50845, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], f2, e.f50561a, false, 50845, new Class[0], Integer.TYPE)).intValue();
        }
        for (c e2 : f2.f50563c) {
            i2 += e2.e();
        }
        return i2;
    }

    @NonNull
    public final /* synthetic */ Object instantiateItem(@NonNull ViewGroup viewGroup, int i2) {
        EmojiGridView emojiGridView;
        View view;
        final ViewGroup viewGroup2 = viewGroup;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f50511a, false, 50826, new Class[]{ViewGroup.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f50511a, false, 50826, new Class[]{ViewGroup.class, Integer.TYPE}, View.class);
        }
        c c2 = this.o.f().c(i3);
        if (c2 == null || !c2.g()) {
            View view2 = new d(viewGroup.getContext()).f50560a;
            if (viewGroup2.indexOfChild(view2) < 0) {
                viewGroup2.addView(view2);
            }
            return view2;
        }
        if (c2.h() == 3) {
            k.a();
            if (k.c() != 1) {
                k.a();
                if (k.c() != 0) {
                    if (c2.i() == 0) {
                        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f50511a, false, 50827, new Class[]{ViewGroup.class}, View.class)) {
                            view = (View) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f50511a, false, 50827, new Class[]{ViewGroup.class}, View.class);
                        } else {
                            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a3l, viewGroup2, false);
                            view.findViewById(C0906R.id.df).setOnClickListener(new View.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f50520a;

                                public final void onClick(View view) {
                                    if (PatchProxy.isSupport(new Object[]{view}, this, f50520a, false, 50834, new Class[]{View.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{view}, this, f50520a, false, 50834, new Class[]{View.class}, Void.TYPE);
                                        return;
                                    }
                                    ClickInstrumentation.onClick(view);
                                    EmojiManagerActivity.a(viewGroup2.getContext());
                                }
                            });
                        }
                        if (viewGroup2.indexOfChild(view) < 0) {
                            viewGroup2.addView(view);
                        }
                        return view;
                    }
                }
            }
            View view3 = new d(viewGroup.getContext()).f50560a;
            if (viewGroup2.indexOfChild(view3) < 0) {
                viewGroup2.addView(view3);
            }
            return view3;
        }
        EmojiGridView emojiGridView2 = new EmojiGridView(viewGroup.getContext(), c2.h());
        final List<c> d2 = this.o.f().d(i3);
        if (PatchProxy.isSupport(new Object[]{d2}, emojiGridView2, EmojiGridView.f50484a, false, 50801, new Class[]{List.class}, Void.TYPE)) {
            EmojiGridView emojiGridView3 = emojiGridView2;
            PatchProxy.accessDispatch(new Object[]{d2}, emojiGridView3, EmojiGridView.f50484a, false, 50801, new Class[]{List.class}, Void.TYPE);
        } else {
            EmojiGridView.a aVar = emojiGridView2.f50488e;
            if (PatchProxy.isSupport(new Object[]{d2}, aVar, EmojiGridView.a.f50494a, false, 50803, new Class[]{List.class}, Void.TYPE)) {
                Object[] objArr = {d2};
                EmojiGridView.a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr, aVar2, EmojiGridView.a.f50494a, false, 50803, new Class[]{List.class}, Void.TYPE);
            } else {
                aVar.f50495b.clear();
                aVar.f50495b.addAll(d2);
                aVar.notifyDataSetChanged();
            }
            emojiGridView2.f50488e.notifyDataSetChanged();
        }
        View view4 = emojiGridView2.f50486c;
        if (viewGroup2.indexOfChild(view4) < 0) {
            viewGroup2.addView(view4);
        }
        if (c2.h() == 2 || c2.h() == 3) {
            emojiGridView2.f50487d.setSelector(new ColorDrawable(0));
            final GridView gridView = emojiGridView2.f50487d;
            emojiGridView = emojiGridView2;
            if (PatchProxy.isSupport(new Object[]{gridView, d2}, this, f50511a, false, 50829, new Class[]{GridView.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gridView, d2}, this, f50511a, false, 50829, new Class[]{GridView.class, List.class}, Void.TYPE);
            } else {
                final ArrayList arrayList = new ArrayList();
                gridView.setOnTouchListener(new View.OnTouchListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50523a;

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        final View view2 = view;
                        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f50523a, false, 50835, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f50523a, false, 50835, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        }
                        switch (motionEvent.getAction()) {
                            case 0:
                                EmojiPageAdapter.this.h = System.currentTimeMillis();
                                EmojiPageAdapter.this.g = 0;
                                EmojiPageAdapter.this.f50515e = System.currentTimeMillis();
                                EmojiPageAdapter.this.f50516f = motionEvent.getX();
                                arrayList.clear();
                                EmojiPageAdapter.this.l = motionEvent.getX();
                                EmojiPageAdapter.this.m = motionEvent.getY();
                                for (int i = 0; i < gridView.getChildCount(); i++) {
                                    arrayList.add(gridView.getChildAt(i));
                                }
                                EmojiPageAdapter.this.k.removeCallbacksAndMessages(null);
                                EmojiPageAdapter.this.k.postDelayed(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f50528a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f50528a, false, 50836, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f50528a, false, 50836, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        EmojiPageAdapter.this.a(EmojiPageAdapter.this.l, EmojiPageAdapter.this.m, arrayList, d2, view2);
                                    }
                                }, 500);
                                break;
                            case 1:
                            case 3:
                                EmojiPageAdapter.this.k.removeCallbacksAndMessages(null);
                                EmojiPageAdapter emojiPageAdapter = EmojiPageAdapter.this;
                                if (PatchProxy.isSupport(new Object[0], emojiPageAdapter, EmojiPageAdapter.f50511a, false, 50832, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], emojiPageAdapter, EmojiPageAdapter.f50511a, false, 50832, new Class[0], Void.TYPE);
                                } else if (emojiPageAdapter.n != null && emojiPageAdapter.n.isShowing()) {
                                    emojiPageAdapter.n.dismiss();
                                }
                                if (EmojiPageAdapter.this.j >= 0) {
                                    View findViewById = ((View) arrayList.get(EmojiPageAdapter.this.j)).findViewById(C0906R.id.a9e);
                                    if (findViewById != null) {
                                        findViewById.setBackground(new ColorDrawable(0));
                                    }
                                }
                                EmojiPageAdapter.this.j = -1;
                                EmojiPageAdapter.this.i = true;
                                EmojiPageAdapter.this.f50513c.setSwipeEnabled(EmojiPageAdapter.this.i);
                                EmojiPageAdapter.this.f50515e = 0;
                                EmojiPageAdapter.this.g = System.currentTimeMillis() - EmojiPageAdapter.this.h;
                                break;
                            case 2:
                                EmojiPageAdapter.this.a(motionEvent.getX(), motionEvent.getY(), arrayList, d2, view);
                                break;
                        }
                        if (EmojiPageAdapter.this.g < 500) {
                            return false;
                        }
                        return true;
                    }
                });
            }
        } else {
            emojiGridView = emojiGridView2;
        }
        emojiGridView.f50487d.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50517a;

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{adapterView, view, Integer.valueOf(i), new Long(j2)}, this, f50517a, false, 50833, new Class[]{AdapterView.class, View.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{adapterView, view, Integer.valueOf(i), new Long(j2)}, this, f50517a, false, 50833, new Class[]{AdapterView.class, View.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
                    return;
                }
                c cVar = (c) d2.get(i);
                if (cVar.f50559c == 2130838997) {
                    EmojiPageAdapter.this.f50512b.a(67);
                } else if (cVar.f50559c == 2130839895) {
                    EmojiManagerActivity.a(view.getContext());
                } else if (cVar.a()) {
                    EmojiPageAdapter.this.f50514d.a(cVar);
                } else {
                    EmojiPageAdapter.this.f50512b.a(cVar.f50558b);
                }
            }
        });
        return view4;
    }

    public EmojiPageAdapter(IInputView iInputView, SwipeControlledViewPager swipeControlledViewPager, a aVar) {
        this.f50513c = swipeControlledViewPager;
        this.f50512b = iInputView;
        this.o = aVar;
        this.f50514d = new d(iInputView, this.f50513c.getContext());
    }

    public final void destroyItem(ViewGroup viewGroup, int i2, @NonNull Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2), obj}, this, f50511a, false, 50828, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2), obj}, this, f50511a, false, 50828, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        viewGroup2.removeView((View) obj);
    }

    private void a(int i2, UrlModel urlModel, View view, Activity activity, boolean z) {
        int i3 = i2;
        UrlModel urlModel2 = urlModel;
        View view2 = view;
        Activity activity2 = activity;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), urlModel2, view2, activity2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f50511a, false, 50831, new Class[]{Integer.TYPE, UrlModel.class, View.class, Activity.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), urlModel2, view2, activity2, Byte.valueOf(z)}, this, f50511a, false, 50831, new Class[]{Integer.TYPE, UrlModel.class, View.class, Activity.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.j != i3) {
            view2.setBackgroundResource(2130840479);
            this.j = i3;
            double screenWidth = (double) UIUtils.getScreenWidth(activity);
            Double.isNaN(screenWidth);
            int i5 = (int) (screenWidth * 0.32d);
            int i6 = (i5 * 9) / 120;
            int i7 = (i6 * 56) / 27;
            double d2 = (double) i5;
            double d3 = (double) i6;
            Double.isNaN(d3);
            Double.isNaN(d2);
            int i8 = (int) (d2 - ((d3 * 1.42d) / 9.0d));
            int i9 = i8 + i6;
            int i10 = i3 % 4;
            View inflate = LayoutInflater.from(activity).inflate(C0906R.layout.a3o, null);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.width = i5;
            layoutParams.height = i9;
            inflate.setLayoutParams(layoutParams);
            if (this.n == null || !this.n.isShowing()) {
                this.n = new b();
            } else {
                this.n.dismiss();
            }
            this.n.a(inflate, activity2);
            this.n.f51039b = 0;
            int i11 = i5 - i7;
            int i12 = i11 / 2;
            if (i10 == 0) {
                i12 = (view.getWidth() - i7) / 2;
            } else if (i10 == 1 || i10 == 2) {
                i4 = (-(i5 - view.getWidth())) / 2;
            } else if (i10 == 3) {
                i4 = -(i5 - view.getWidth());
                i12 = i11 - ((view.getWidth() - i7) / 2);
            } else {
                i4 = 0;
            }
            RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(C0906R.id.b2e);
            remoteImageView.setBackgroundResource(2130840178);
            remoteImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            ViewGroup.LayoutParams layoutParams2 = remoteImageView.getLayoutParams();
            layoutParams2.width = i5;
            layoutParams2.height = i5;
            int dip2Px = (int) UIUtils.dip2Px(activity2, 10.0f);
            remoteImageView.setPadding(dip2Px, dip2Px, dip2Px, dip2Px);
            remoteImageView.setLayoutParams(layoutParams2);
            ImageView imageView = (ImageView) inflate.findViewById(C0906R.id.b69);
            imageView.setImageResource(2130840177);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.width = i7;
            marginLayoutParams.height = i6;
            marginLayoutParams.setMargins(i12, i8, 0, 0);
            imageView.setLayoutParams(marginLayoutParams);
            this.n.a(view2, i4, -((int) UIUtils.dip2Px(activity2, 2.0f)));
            if (z) {
                az.b(remoteImageView, urlModel2);
            } else {
                com.ss.android.ugc.aweme.base.c.b(remoteImageView, urlModel2);
            }
            this.n.update(i5, i9);
        }
    }

    public final void a(float f2, float f3, List<View> list, List<c> list2, View view) {
        List<View> list3 = list;
        List<c> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), list3, list4, view}, this, f50511a, false, 50830, new Class[]{Float.TYPE, Float.TYPE, List.class, List.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), list3, list4, view}, this, f50511a, false, 50830, new Class[]{Float.TYPE, Float.TYPE, List.class, List.class, View.class}, Void.TYPE);
            return;
        }
        Iterator<View> it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            View next = it2.next();
            if (f2 <= ((float) next.getLeft()) || f2 >= ((float) next.getRight()) || f3 >= ((float) next.getBottom()) || f3 <= ((float) next.getTop())) {
                i2++;
            } else {
                if (this.j != i2 && System.currentTimeMillis() - this.f50515e > 500 && Math.abs(f2 - this.f50516f) < 20.0f) {
                    this.i = false;
                    this.f50513c.setSwipeEnabled(false);
                    this.k.removeCallbacksAndMessages(null);
                }
                if (this.j >= 0 && i2 != this.j) {
                    View findViewById = list3.get(this.j).findViewById(C0906R.id.a9e);
                    if (findViewById != null) {
                        findViewById.setBackground(new ColorDrawable(0));
                    }
                }
                if (!this.i && i2 < list2.size()) {
                    View findViewById2 = list3.get(i2).findViewById(C0906R.id.a9e);
                    c cVar = list4.get(i2);
                    if (cVar.a() && findViewById2 != null) {
                        if (cVar.f50557a.getStickerType() == 2) {
                            a(i2, cVar.f50557a.getAnimateUrl(), findViewById2, (Activity) view.getContext(), cVar.f50557a.isAnimate());
                        } else {
                            UrlModel urlModel = new UrlModel();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("file://" + com.ss.android.ugc.aweme.im.sdk.resources.a.b(cVar.f50557a));
                            urlModel.setUrlList(arrayList);
                            urlModel.setUri("file://" + com.ss.android.ugc.aweme.im.sdk.resources.a.b(cVar.f50557a));
                            a(i2, urlModel, findViewById2, (Activity) view.getContext(), cVar.f50557a.isAnimate());
                        }
                    }
                    return;
                }
            }
        }
    }
}
