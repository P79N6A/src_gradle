package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.WorkerThread;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.chooser.f;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.e.b;
import com.ss.android.ugc.aweme.im.sdk.BaseViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.input.p;
import com.ss.android.ugc.aweme.im.sdk.chat.net.s;
import com.ss.android.ugc.aweme.im.sdk.d.l;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.widget.GridSpacingItemDecoration;
import com.ss.android.ugc.aweme.im.sdk.widget.WrapGridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PhotoSelectActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50773a;

    /* renamed from: b  reason: collision with root package name */
    public int f50774b;

    /* renamed from: c  reason: collision with root package name */
    public int f50775c;

    /* renamed from: d  reason: collision with root package name */
    public String f50776d;

    /* renamed from: e  reason: collision with root package name */
    public WrapGridLayoutManager f50777e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f50778f;
    public View g;
    public View h;
    public TextView i;
    public ImageView j;
    public TextView k;
    public p l;
    public au.a m;
    public PhotoGridSelectAdapter n;
    public a o;
    public m p;
    public int q;
    private final int r = 3;
    private View s;

    static class MenuAdapter extends RecyclerView.Adapter<MenuHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50788a;

        /* renamed from: b  reason: collision with root package name */
        private List<a> f50789b;

        /* renamed from: c  reason: collision with root package name */
        private View.OnClickListener f50790c;

        public int getItemCount() {
            if (!PatchProxy.isSupport(new Object[0], this, f50788a, false, 51059, new Class[0], Integer.TYPE)) {
                return this.f50789b.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50788a, false, 51059, new Class[0], Integer.TYPE)).intValue();
        }

        private MenuAdapter(View.OnClickListener onClickListener) {
            this.f50789b = new ArrayList();
            this.f50790c = onClickListener;
        }

        public final void a(List<a> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f50788a, false, 51056, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f50788a, false, 51056, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f50789b.clear();
            this.f50789b.addAll(list);
            notifyDataSetChanged();
        }

        /* synthetic */ MenuAdapter(View.OnClickListener onClickListener, byte b2) {
            this(onClickListener);
        }

        public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            MenuHolder menuHolder = (MenuHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{menuHolder, Integer.valueOf(i)}, this, f50788a, false, 51058, new Class[]{MenuHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{menuHolder, Integer.valueOf(i)}, this, f50788a, false, 51058, new Class[]{MenuHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            menuHolder.a(this.f50789b.get(i));
        }

        public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2 = viewGroup;
            if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f50788a, false, 51057, new Class[]{ViewGroup.class, Integer.TYPE}, MenuHolder.class)) {
                return new MenuHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.s8, viewGroup2, false), this.f50790c, (byte) 0);
            }
            return (MenuHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f50788a, false, 51057, new Class[]{ViewGroup.class, Integer.TYPE}, MenuHolder.class);
        }
    }

    static class MenuHolder extends BaseViewHolder<a> {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f50791c;

        /* renamed from: d  reason: collision with root package name */
        private RemoteImageView f50792d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f50793e;

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f50791c, false, 51061, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50791c, false, 51061, new Class[0], Void.TYPE);
                return;
            }
            super.c();
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f50791c, false, 51060, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50791c, false, 51060, new Class[0], Void.TYPE);
                return;
            }
            super.b();
            this.f50792d = (RemoteImageView) this.itemView.findViewById(C0906R.id.aw8);
            this.f50793e = (TextView) this.itemView.findViewById(C0906R.id.ay2);
        }

        public final void a(a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f50791c, false, 51062, new Class[]{a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f50791c, false, 51062, new Class[]{a.class}, Void.TYPE);
                return;
            }
            super.a(aVar);
            this.f50793e.setText(String.format(Locale.ENGLISH, "%1$s（%2$d）", new Object[]{aVar.f50822e, Integer.valueOf(aVar.f50818a)}));
            RemoteImageView remoteImageView = this.f50792d;
            c.a(remoteImageView, "file://" + aVar.f50821d, 150, 150);
            this.itemView.setTag(aVar);
        }

        private MenuHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            view.setOnClickListener(onClickListener);
        }

        /* synthetic */ MenuHolder(View view, View.OnClickListener onClickListener, byte b2) {
            this(view, onClickListener);
        }
    }

    final class PhotoGridSelectAdapter extends RecyclerView.Adapter<PhotoHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50794a;

        /* renamed from: c  reason: collision with root package name */
        private List<i> f50796c;

        /* renamed from: d  reason: collision with root package name */
        private p f50797d;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemCount() {
            if (!PatchProxy.isSupport(new Object[0], this, f50794a, false, 51067, new Class[0], Integer.TYPE)) {
                return this.f50796c.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50794a, false, 51067, new Class[0], Integer.TYPE)).intValue();
        }

        private PhotoGridSelectAdapter() {
            this.f50796c = new ArrayList();
            if (PatchProxy.isSupport(new Object[0], this, f50794a, false, 51069, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50794a, false, 51069, new Class[0], Void.TYPE);
                return;
            }
            this.f50797d = new p() {

                /* renamed from: b  reason: collision with root package name */
                public static ChangeQuickRedirect f50800b;

                public final void onClick(View view) {
                    View view2 = view;
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f50800b, false, 51071, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f50800b, false, 51071, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    Object tag = view.getTag();
                    if (tag != null && (tag instanceof i)) {
                        i iVar = (i) tag;
                        if (view.getId() == C0906R.id.bxr) {
                            if (1 == PhotoSelectActivity.this.q) {
                                PhotoSelectActivity photoSelectActivity = PhotoSelectActivity.this;
                                j fromMediaModel = j.fromMediaModel(iVar.f50847b);
                                if (PatchProxy.isSupport(new Object[]{photoSelectActivity, fromMediaModel}, null, EmojiAddActivity.f50472a, true, 50767, new Class[]{Activity.class, j.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{photoSelectActivity, fromMediaModel}, null, EmojiAddActivity.f50472a, true, 50767, new Class[]{Activity.class, j.class}, Void.TYPE);
                                } else {
                                    Intent intent = new Intent(photoSelectActivity, EmojiAddActivity.class);
                                    intent.putExtra("photo_param", fromMediaModel);
                                    photoSelectActivity.startActivityForResult(intent, 17);
                                }
                            } else {
                                PhotoSelectActivity photoSelectActivity2 = PhotoSelectActivity.this;
                                String str = PhotoSelectActivity.this.f50776d;
                                int a2 = PhotoGridSelectAdapter.this.a(iVar, PhotoSelectActivity.this.f50777e.findFirstVisibleItemPosition(), PhotoSelectActivity.this.f50777e.findLastVisibleItemPosition());
                                if (PatchProxy.isSupport(new Object[]{photoSelectActivity2, str, Integer.valueOf(a2), 48}, null, PhotoPreviewListActivity.f50759a, true, 51012, new Class[]{Activity.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{photoSelectActivity2, str, Integer.valueOf(a2), 48}, null, PhotoPreviewListActivity.f50759a, true, 51012, new Class[]{Activity.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                } else {
                                    Intent intent2 = new Intent(photoSelectActivity2, PhotoPreviewListActivity.class);
                                    intent2.putExtra("session_id", str);
                                    intent2.putExtra("photo_start_index", a2);
                                    photoSelectActivity2.startActivityForResult(intent2, 48);
                                }
                            }
                        } else if (view.getId() == C0906R.id.cn3) {
                            if (view.isSelected()) {
                                PhotoSelectActivity.this.p.b(iVar);
                            } else if (PhotoSelectActivity.this.p.c() >= m.f50859b) {
                                UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.axf);
                                return;
                            } else {
                                PhotoSelectActivity.this.p.a(iVar);
                            }
                            iVar.f50848c = true;
                            view2.setSelected(!view.isSelected());
                            PhotoSelectActivity.this.n.notifyDataSetChanged();
                            TextView textView = PhotoSelectActivity.this.i;
                            if (PhotoSelectActivity.this.p.c() <= 0) {
                                z = false;
                            }
                            textView.setEnabled(z);
                            PhotoSelectActivity.this.i.setText(PhotoSelectActivity.this.p.d());
                        }
                    }
                }
            };
        }

        @WorkerThread
        public final void a(List<f> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f50794a, false, 51063, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f50794a, false, 51063, new Class[]{List.class}, Void.TYPE);
            } else if (list != null && !list.isEmpty()) {
                this.f50796c.clear();
                ArrayList arrayList = new ArrayList(list.size());
                for (f a2 : list) {
                    arrayList.add(i.a(a2));
                }
                this.f50796c.addAll(arrayList);
                PhotoSelectActivity.this.p.f50862d = arrayList;
                com.ss.android.b.a.a.a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50798a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f50798a, false, 51070, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f50798a, false, 51070, new Class[0], Void.TYPE);
                            return;
                        }
                        PhotoGridSelectAdapter.this.notifyDataSetChanged();
                    }
                });
            }
        }

        /* synthetic */ PhotoGridSelectAdapter(PhotoSelectActivity photoSelectActivity, byte b2) {
            this();
        }

        public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f50794a, false, 51064, new Class[]{ViewGroup.class, Integer.TYPE}, PhotoHolder.class)) {
                return (PhotoHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f50794a, false, 51064, new Class[]{ViewGroup.class, Integer.TYPE}, PhotoHolder.class);
            }
            return new PhotoHolder(View.inflate(viewGroup.getContext(), C0906R.layout.yg, null), this.f50797d);
        }

        public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            PhotoHolder photoHolder = (PhotoHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{photoHolder, Integer.valueOf(i)}, this, f50794a, false, 51065, new Class[]{PhotoHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{photoHolder, Integer.valueOf(i)}, this, f50794a, false, 51065, new Class[]{PhotoHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, f50794a, false, 51066, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50794a, false, 51066, new Class[0], Void.TYPE);
            } else if (PhotoSelectActivity.this.f50774b == 0) {
                PhotoSelectActivity.this.f50774b = PhotoSelectActivity.this.f50778f.getMeasuredWidth() / 3;
                PhotoSelectActivity.this.f50775c = (int) ((((float) PhotoSelectActivity.this.f50774b) / 3.0f) * 4.0f);
            }
            photoHolder.a(this.f50796c.get(i));
        }

        public final int a(i iVar, int i, int i2) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f50794a, false, 51068, new Class[]{i.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{iVar2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f50794a, false, 51068, new Class[]{i.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int i3 = i;
            while (iVar2 != null && i3 <= i2 && i3 < this.f50796c.size()) {
                if (this.f50796c.get(i3).equals(iVar)) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
    }

    class PhotoHolder extends BaseViewHolder<i> {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f50802c;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f50804e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f50805f;
        private RemoteImageView g;
        private View h;
        private View i;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f50802c, false, 51072, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50802c, false, 51072, new Class[0], Void.TYPE);
                return;
            }
            this.f50804e = (ImageView) this.itemView.findViewById(C0906R.id.cn3);
            this.f50805f = (TextView) this.itemView.findViewById(C0906R.id.cn4);
            this.g = (RemoteImageView) this.itemView.findViewById(C0906R.id.bxr);
            this.h = this.itemView.findViewById(C0906R.id.bxt);
            this.i = this.itemView.findViewById(C0906R.id.cn5);
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f50802c, false, 51073, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50802c, false, 51073, new Class[0], Void.TYPE);
                return;
            }
            PhotoSelectActivity.this.m.a(this.g, this.f50804e);
            p.a((View.OnClickListener) this.f3361b, this.g, this.f50804e);
        }

        public final void a(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f50802c, false, 51074, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar2}, this, f50802c, false, 51074, new Class[]{i.class}, Void.TYPE);
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams.width = PhotoSelectActivity.this.f50774b;
            layoutParams.height = PhotoSelectActivity.this.f50775c;
            this.g.setLayoutParams(layoutParams);
            this.h.setLayoutParams(layoutParams);
            c.a(this.g, "file://" + iVar2.f50847b.f27990b, PhotoSelectActivity.this.f50774b, PhotoSelectActivity.this.f50775c);
            if (iVar2.f50848c) {
                PhotoSelectActivity.this.p.a(this.g, this.i, this.f50805f, this.f50804e, this.h, iVar2.f50847b.f27990b);
                iVar2.f50848c = false;
            } else {
                PhotoSelectActivity.this.p.a(this.f50805f, this.f50804e, this.h, iVar2.f50847b.f27990b);
            }
            this.f50804e.setTag(iVar2);
            this.g.setTag(iVar2);
            if (1 == PhotoSelectActivity.this.q) {
                this.i.setVisibility(8);
            }
        }

        public PhotoHolder(View view, p pVar) {
            super(view, pVar);
        }
    }

    static final class a extends l {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50806a;

        /* renamed from: b  reason: collision with root package name */
        View f50807b;

        /* renamed from: c  reason: collision with root package name */
        public PhotoSelectActivity f50808c;

        /* renamed from: d  reason: collision with root package name */
        public final List<a> f50809d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public boolean f50810e;

        /* renamed from: f  reason: collision with root package name */
        private PopupWindow f50811f;
        private View g;
        private RecyclerView h;
        private MenuAdapter i;
        private View.OnClickListener j;

        public final boolean a() {
            if (!PatchProxy.isSupport(new Object[0], this, f50806a, false, 51046, new Class[0], Boolean.TYPE)) {
                return this.f50811f.isShowing();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50806a, false, 51046, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final void dismiss() {
            if (PatchProxy.isSupport(new Object[0], this, f50806a, false, 51051, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50806a, false, 51051, new Class[0], Void.TYPE);
                return;
            }
            l.a(this.f50811f);
        }

        public final void onDestroy() {
            if (PatchProxy.isSupport(new Object[0], this, f50806a, false, 51047, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50806a, false, 51047, new Class[0], Void.TYPE);
                return;
            }
            if (this.f50808c != null) {
                this.f50808c.unregisterLifeCycleMonitor(this);
            }
            this.f50808c = null;
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f50806a, false, 51050, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50806a, false, 51050, new Class[0], Void.TYPE);
            } else if (this.f50808c != null && !this.f50808c.isFinishing()) {
                if (this.f50809d.isEmpty()) {
                    l.a(this.f50811f);
                    UIUtils.displayToast(this.f50807b.getContext(), (int) C0906R.string.aov);
                    return;
                }
                this.i.a(this.f50809d);
                this.f50811f.showAsDropDown(this.f50807b, 0, b.a(GlobalContext.getContext(), 10.0f));
            }
        }

        public a(PhotoSelectActivity photoSelectActivity, View view, View.OnClickListener onClickListener) {
            this.f50808c = photoSelectActivity;
            this.f50807b = view;
            this.j = onClickListener;
            photoSelectActivity.registerLifeCycleMonitor(this);
            if (PatchProxy.isSupport(new Object[0], this, f50806a, false, 51048, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50806a, false, 51048, new Class[0], Void.TYPE);
                return;
            }
            this.g = View.inflate(GlobalContext.getContext(), C0906R.layout.a7h, null);
            this.f50811f = new PopupWindow(this.g, -1, GlobalContext.getContext().getResources().getDisplayMetrics().heightPixels / 2, true);
            this.f50811f.setAnimationStyle(C0906R.style.g1);
            this.f50811f.setOnDismissListener(new PopupWindow.OnDismissListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50812a;

                public final void onDismiss() {
                    if (PatchProxy.isSupport(new Object[0], this, f50812a, false, 51052, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50812a, false, 51052, new Class[0], Void.TYPE);
                        return;
                    }
                    PhotoSelectActivity photoSelectActivity = a.this.f50808c;
                    if (PatchProxy.isSupport(new Object[0], photoSelectActivity, PhotoSelectActivity.f50773a, false, 51040, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], photoSelectActivity, PhotoSelectActivity.f50773a, false, 51040, new Class[0], Void.TYPE);
                        return;
                    }
                    RotateAnimation rotateAnimation = new RotateAnimation(180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(400);
                    rotateAnimation.setFillAfter(true);
                    photoSelectActivity.j.startAnimation(rotateAnimation);
                }
            });
            this.f50811f.setTouchable(true);
            this.h = (RecyclerView) this.g.findViewById(C0906R.id.bcz);
            this.h.setLayoutManager(new LinearLayoutManager(GlobalContext.getContext(), 1, false));
            this.i = new MenuAdapter(this.j, (byte) 0);
            this.h.setAdapter(this.i);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50773a, false, 51041, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50773a, false, 51041, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public final boolean a() {
        if (1 == this.q) {
            return true;
        }
        return false;
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f50773a, false, 51032, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50773a, false, 51032, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        this.p.f();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f50773a, false, 51031, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50773a, false, 51031, new Class[0], Void.TYPE);
            return;
        }
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onResume", true);
        super.onResume();
        if (this.n != null) {
            this.n.notifyDataSetChanged();
        }
        TextView textView = this.i;
        if (this.p.c() <= 0) {
            z = false;
        }
        textView.setEnabled(z);
        this.i.setText(this.p.d());
        this.g.setSelected(this.p.f50861c);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onResume", false);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50773a, false, 51030, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50773a, false, 51030, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putString("session_id", this.f50776d);
        bundle.putInt("album_action", this.q);
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50773a, false, 51029, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50773a, false, 51029, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.a3);
        com.ss.android.ugc.aweme.im.sdk.d.a.b().setupStatusBar(this);
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50773a, false, 51034, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50773a, false, 51034, new Class[]{Bundle.class}, Void.TYPE);
        } else {
            if (bundle != null) {
                this.f50776d = bundle.getString("session_id");
                this.q = bundle.getInt("album_action");
            } else {
                this.f50776d = getIntent().getStringExtra("session_id");
                this.q = getIntent().getIntExtra("album_action", 0);
            }
            this.p = m.a();
        }
        if (PatchProxy.isSupport(new Object[0], this, f50773a, false, 51035, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50773a, false, 51035, new Class[0], Void.TYPE);
        } else {
            this.f50778f = (RecyclerView) findViewById(C0906R.id.bxs);
            this.g = findViewById(C0906R.id.c_p);
            this.s = findViewById(C0906R.id.mh);
            this.i = (TextView) findViewById(C0906R.id.cno);
            this.i.setText(this.p.d());
            TextView textView = this.i;
            if (this.p.c() > 0) {
                z = true;
            } else {
                z = false;
            }
            textView.setEnabled(z);
            this.h = findViewById(C0906R.id.j5);
            this.k = (TextView) findViewById(C0906R.id.e4);
            this.j = (ImageView) findViewById(C0906R.id.e0);
            if (1 == this.q) {
                this.s.setVisibility(8);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f50773a, false, 51037, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50773a, false, 51037, new Class[0], Void.TYPE);
        } else {
            if (this.l == null) {
                this.l = new p() {

                    /* renamed from: b  reason: collision with root package name */
                    public static ChangeQuickRedirect f50779b;

                    public final void onClick(View view) {
                        View view2 = view;
                        if (PatchProxy.isSupport(new Object[]{view2}, this, f50779b, false, 51042, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view2}, this, f50779b, false, 51042, new Class[]{View.class}, Void.TYPE);
                        } else if (view2.equals(PhotoSelectActivity.this.i)) {
                            new com.ss.android.ugc.aweme.im.sdk.a.b(PhotoSelectActivity.this, new com.ss.android.ugc.aweme.im.sdk.a.c() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f50781a;

                                public final void sendMsg() {
                                    if (PatchProxy.isSupport(new Object[0], this, f50781a, false, 51043, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f50781a, false, 51043, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    PhotoSelectActivity photoSelectActivity = PhotoSelectActivity.this;
                                    if (PatchProxy.isSupport(new Object[0], photoSelectActivity, PhotoSelectActivity.f50773a, false, 51036, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], photoSelectActivity, PhotoSelectActivity.f50773a, false, 51036, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (bc.c()) {
                                        s.a().b(photoSelectActivity.f50776d, j.fromPhotoItems(photoSelectActivity.p.b()));
                                    } else {
                                        s.a().a(photoSelectActivity.f50776d, (List<j>) j.fromPhotoItems(photoSelectActivity.p.b()));
                                    }
                                    photoSelectActivity.p.e();
                                    org.greenrobot.eventbus.c.a().d(new com.ss.android.ugc.aweme.im.sdk.chat.a.a(new j()));
                                    photoSelectActivity.finish();
                                }
                            }).sendMsg();
                        } else if (view2.equals(PhotoSelectActivity.this.g)) {
                            PhotoSelectActivity.this.g.setSelected(!PhotoSelectActivity.this.g.isSelected());
                            PhotoSelectActivity.this.p.f50861c = PhotoSelectActivity.this.g.isSelected();
                        } else if (view2.equals(PhotoSelectActivity.this.h)) {
                            PhotoSelectActivity.this.p.f();
                            PhotoSelectActivity.this.finish();
                        } else {
                            if (view2.equals(PhotoSelectActivity.this.j) || view2.equals(PhotoSelectActivity.this.k)) {
                                if (PhotoSelectActivity.this.o == null) {
                                    PhotoSelectActivity.this.o = new a(PhotoSelectActivity.this, PhotoSelectActivity.this.j, PhotoSelectActivity.this.l);
                                }
                                if (!PhotoSelectActivity.this.o.a()) {
                                    PhotoSelectActivity photoSelectActivity = PhotoSelectActivity.this;
                                    if (PatchProxy.isSupport(new Object[0], photoSelectActivity, PhotoSelectActivity.f50773a, false, 51039, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], photoSelectActivity, PhotoSelectActivity.f50773a, false, 51039, new Class[0], Void.TYPE);
                                    } else {
                                        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
                                        rotateAnimation.setDuration(400);
                                        rotateAnimation.setFillAfter(true);
                                        photoSelectActivity.j.startAnimation(rotateAnimation);
                                    }
                                    a aVar = PhotoSelectActivity.this.o;
                                    if (PatchProxy.isSupport(new Object[0], aVar, a.f50806a, false, 51049, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], aVar, a.f50806a, false, 51049, new Class[0], Void.TYPE);
                                    } else if (aVar.f50808c != null && !aVar.f50808c.isFinishing()) {
                                        if (aVar.f50810e && aVar.f50809d.isEmpty()) {
                                            UIUtils.displayToast(aVar.f50807b.getContext(), (int) C0906R.string.aov);
                                        } else if (aVar.f50810e) {
                                            aVar.b();
                                        } else {
                                            com.ss.android.b.a.a.a.a(new Runnable() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f50814a;

                                                public final void run() {
                                                    if (PatchProxy.isSupport(new Object[0], this, f50814a, false, 51053, new Class[0], Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[0], this, f50814a, false, 51053, new Class[0], Void.TYPE);
                                                        return;
                                                    }
                                                    List a2 = b.a(a.this.f50808c.a());
                                                    a.this.f50810e = true;
                                                    a.this.f50809d.clear();
                                                    a.this.f50809d.addAll(a2);
                                                    com.ss.android.b.a.a.a.b(new Runnable() {

                                                        /* renamed from: a  reason: collision with root package name */
                                                        public static ChangeQuickRedirect f50816a;

                                                        public final void run() {
                                                            if (PatchProxy.isSupport(new Object[0], this, f50816a, false, 51054, new Class[0], Void.TYPE)) {
                                                                PatchProxy.accessDispatch(new Object[0], this, f50816a, false, 51054, new Class[0], Void.TYPE);
                                                                return;
                                                            }
                                                            a.this.b();
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                }
                            } else if (view.getId() == C0906R.id.avr) {
                                Object tag = view.getTag();
                                if (tag != null) {
                                    final a aVar2 = (a) tag;
                                    PhotoSelectActivity.this.k.setText(aVar2.f50822e);
                                    if (PhotoSelectActivity.this.o.a()) {
                                        PhotoSelectActivity.this.o.dismiss();
                                    }
                                    com.ss.android.b.a.a.a.a(new Runnable() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f50783a;

                                        public final void run() {
                                            if (PatchProxy.isSupport(new Object[0], this, f50783a, false, 51044, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], this, f50783a, false, 51044, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            PhotoSelectActivity.this.n.a(b.a(PhotoSelectActivity.this, aVar2.f50820c, PhotoSelectActivity.this.a()));
                                        }
                                    });
                                }
                            }
                        }
                    }
                };
            }
            if (this.m == null) {
                this.m = au.a.h();
            }
            this.m.a(this.h, this.g, this.i, this.j, this.k);
            p.a((View.OnClickListener) this.l, this.i, this.g, this.h, this.j, this.k);
        }
        if (PatchProxy.isSupport(new Object[0], this, f50773a, false, 51038, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50773a, false, 51038, new Class[0], Void.TYPE);
        } else {
            this.f50777e = new WrapGridLayoutManager(this, 3);
            this.f50778f.setLayoutManager(this.f50777e);
            if (this.n == null) {
                this.n = new PhotoGridSelectAdapter(this, (byte) 0);
                this.n.setHasStableIds(true);
            }
            this.f50778f.addItemDecoration(new GridSpacingItemDecoration(3, (int) UIUtils.dip2Px(this, 3.0f), true));
            this.f50778f.setAdapter(this.n);
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50786a;

                public final void run() {
                    List list;
                    if (PatchProxy.isSupport(new Object[0], this, f50786a, false, 51045, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50786a, false, 51045, new Class[0], Void.TYPE);
                        return;
                    }
                    if (PhotoSelectActivity.this.a()) {
                        list = b.a(PhotoSelectActivity.this, 0, 0, Integer.MAX_VALUE, true);
                    } else {
                        PhotoSelectActivity photoSelectActivity = PhotoSelectActivity.this;
                        if (PatchProxy.isSupport(new Object[]{photoSelectActivity}, null, b.f50823a, true, 50946, new Class[]{Context.class}, List.class)) {
                            list = (List) PatchProxy.accessDispatch(new Object[]{photoSelectActivity}, null, b.f50823a, true, 50946, new Class[]{Context.class}, List.class);
                        } else {
                            list = b.a(photoSelectActivity, 360, 360, Integer.MAX_VALUE, false);
                        }
                    }
                    PhotoSelectActivity.this.n.a(list);
                }
            });
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onCreate", false);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f50773a, false, 51033, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f50773a, false, 51033, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i4 == 49 && intent2 != null && intent2.getBooleanExtra("send_photo", false)) {
            org.greenrobot.eventbus.c.a().d(new com.ss.android.ugc.aweme.im.sdk.chat.a.a(new j()));
            finish();
        }
        if (i2 == 17 && i4 == -1) {
            finish();
        }
    }
}
