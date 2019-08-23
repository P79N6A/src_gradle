package com.ss.android.ugc.aweme.im.sdk.relations.adapter;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Build;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.common.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.BaseViewHolder;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.utils.ax;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public abstract class AbsRelationListAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f52046b;

    /* renamed from: a  reason: collision with root package name */
    private Animator.AnimatorListener f52047a = new Animator.AnimatorListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52054a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f52054a, false, 52822, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f52054a, false, 52822, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            AbsRelationListAdapter.this.notifyDataSetChanged();
        }
    };

    /* renamed from: c  reason: collision with root package name */
    protected int f52048c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f52049d = false;

    /* renamed from: e  reason: collision with root package name */
    protected List<IMContact> f52050e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f52051f;
    protected String g;
    public LinkedHashSet<IMContact> h = new LinkedHashSet<>();
    protected View i;
    protected RecyclerView j;
    public LinearLayoutManager k;
    public Runnable l;
    public a m;
    protected RecyclerView.OnScrollListener n;

    public class ViewHolder extends BaseViewHolder<IMContact> {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f52056c;

        /* renamed from: d  reason: collision with root package name */
        protected ImageView f52057d;

        /* renamed from: e  reason: collision with root package name */
        protected int f52058e = Math.round(UIUtils.dip2Px(GlobalContext.getContext(), 16.0f));

        /* renamed from: f  reason: collision with root package name */
        protected int f52059f;
        private AvatarImageView h;
        private TextView i;
        private TextView j;
        private TextView k;
        private ImageView l;
        private ImageView m;
        private View n;

        public final void c() {
        }

        public void a() {
            if (PatchProxy.isSupport(new Object[0], this, f52056c, false, 52823, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52056c, false, 52823, new Class[0], Void.TYPE);
                return;
            }
            super.a();
            this.itemView.setBackground(c.e(this.itemView.getContext()));
        }

        public final Animator d() {
            if (PatchProxy.isSupport(new Object[0], this, f52056c, false, 52830, new Class[0], Animator.class)) {
                return (Animator) PatchProxy.accessDispatch(new Object[0], this, f52056c, false, 52830, new Class[0], Animator.class);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f52059f, this.f52058e});
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52062a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f52062a, false, 52833, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f52062a, false, 52833, new Class[]{ValueAnimator.class}, Void.TYPE);
                    } else if (ViewHolder.this.f52057d != null) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ViewHolder.this.f52057d.getLayoutParams();
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        ViewHolder.this.f52057d.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            return ofInt;
        }

        public final Animator e() {
            if (PatchProxy.isSupport(new Object[0], this, f52056c, false, 52831, new Class[0], Animator.class)) {
                return (Animator) PatchProxy.accessDispatch(new Object[0], this, f52056c, false, 52831, new Class[0], Animator.class);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f52058e, this.f52059f});
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52064a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f52064a, false, 52834, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f52064a, false, 52834, new Class[]{ValueAnimator.class}, Void.TYPE);
                    } else if (ViewHolder.this.f52057d != null) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ViewHolder.this.f52057d.getLayoutParams();
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        ViewHolder.this.f52057d.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            return ofInt;
        }

        public void b() {
            if (PatchProxy.isSupport(new Object[0], this, f52056c, false, 52824, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52056c, false, 52824, new Class[0], Void.TYPE);
                return;
            }
            super.b();
            this.n = this.itemView.findViewById(C0906R.id.bbl);
            this.h = (AvatarImageView) this.itemView.findViewById(C0906R.id.i4);
            this.f52057d = (ImageView) this.itemView.findViewById(C0906R.id.sc);
            this.i = (TextView) this.itemView.findViewById(C0906R.id.bps);
            this.j = (TextView) this.itemView.findViewById(C0906R.id.a49);
            this.l = (ImageView) this.itemView.findViewById(C0906R.id.agx);
            this.k = (TextView) this.itemView.findViewById(C0906R.id.d41);
            this.m = (ImageView) this.itemView.findViewById(C0906R.id.dr5);
        }

        public ViewHolder(View view) {
            super(view);
            int i2;
            view.setTag(this);
            if (m.b()) {
                i2 = -32;
            } else {
                i2 = -18;
            }
            this.f52059f = ((int) UIUtils.dip2Px(GlobalContext.getContext(), (float) i2)) - 1;
        }

        public void a(IMContact iMContact, int i2) {
            int i3;
            if (PatchProxy.isSupport(new Object[]{iMContact, Integer.valueOf(i2)}, this, f52056c, false, 52825, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iMContact, Integer.valueOf(i2)}, this, f52056c, false, 52825, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.a(iMContact);
            if (iMContact.getType() != -1) {
                if (PatchProxy.isSupport(new Object[]{iMContact}, this, f52056c, false, 52826, new Class[]{IMContact.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMContact}, this, f52056c, false, 52826, new Class[]{IMContact.class}, Void.TYPE);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f52057d.getLayoutParams();
                    if (AbsRelationListAdapter.this.f52051f) {
                        if (AbsRelationListAdapter.this.h.contains(iMContact)) {
                            this.f52057d.setSelected(true);
                        } else {
                            this.f52057d.setSelected(false);
                        }
                        if (Build.VERSION.SDK_INT > 16) {
                            if (marginLayoutParams.getMarginStart() != this.f52058e) {
                                marginLayoutParams.setMargins(this.f52058e, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                                marginLayoutParams.setMarginStart(this.f52058e);
                                this.f52057d.setLayoutParams(marginLayoutParams);
                            }
                        } else if (marginLayoutParams.leftMargin != this.f52058e) {
                            marginLayoutParams.setMargins(this.f52058e, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                            this.f52057d.setLayoutParams(marginLayoutParams);
                        }
                    } else {
                        this.f52057d.setSelected(false);
                        if (Build.VERSION.SDK_INT > 16) {
                            if (marginLayoutParams.getMarginStart() != this.f52059f) {
                                marginLayoutParams.setMargins(this.f52059f, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                                marginLayoutParams.setMarginStart(this.f52059f);
                                this.f52057d.setLayoutParams(marginLayoutParams);
                            }
                        } else if (marginLayoutParams.leftMargin != this.f52059f) {
                            marginLayoutParams.setMargins(this.f52059f, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                            this.f52057d.setLayoutParams(marginLayoutParams);
                        }
                    }
                }
                if (PatchProxy.isSupport(new Object[]{iMContact, Integer.valueOf(i2)}, this, f52056c, false, 52827, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMContact, Integer.valueOf(i2)}, this, f52056c, false, 52827, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE);
                } else {
                    if (iMContact.getType() == 2) {
                        this.k.setText(C0906R.string.awm);
                        this.k.setVisibility(0);
                        this.n.setVisibility(8);
                    } else if (iMContact.getType() == 3) {
                        View view = this.n;
                        if (i2 == 0) {
                            i3 = 8;
                        } else {
                            i3 = 0;
                        }
                        view.setVisibility(i3);
                        this.k.setText(C0906R.string.avd);
                        this.k.setVisibility(0);
                    } else {
                        this.k.setVisibility(8);
                        this.n.setVisibility(8);
                    }
                    UrlModel displayAvatar = iMContact.getDisplayAvatar();
                    if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.h, 2130839027);
                    } else {
                        com.ss.android.ugc.aweme.base.c.b(this.h, displayAvatar);
                    }
                    if (PatchProxy.isSupport(new Object[]{iMContact}, this, f52056c, false, 52828, new Class[]{IMContact.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{iMContact}, this, f52056c, false, 52828, new Class[]{IMContact.class}, Void.TYPE);
                    } else {
                        IMUser a2 = e.a(iMContact);
                        ax.a(this.m, a2);
                        if (a2 != null) {
                            AbsRelationListAdapter.this.a(this.i, a2, AbsRelationListAdapter.this.g);
                            if (!TextUtils.isEmpty(AbsRelationListAdapter.this.a(iMContact)) && !TextUtils.isEmpty(AbsRelationListAdapter.this.g)) {
                                AbsRelationListAdapter.this.b(this.j, a2, AbsRelationListAdapter.this.g);
                            } else if (TextUtils.isEmpty(AbsRelationListAdapter.this.a(iMContact))) {
                                this.j.setVisibility(8);
                            } else {
                                this.j.setVisibility(0);
                                this.j.setText(AbsRelationListAdapter.this.a(iMContact));
                            }
                            if (d.a(a2) || a2.getFollowStatus() != 2) {
                                this.l.setVisibility(8);
                            } else {
                                this.l.setVisibility(0);
                            }
                            z.a().g(a2.getUid(), "contact");
                        } else {
                            this.j.setVisibility(8);
                            this.l.setVisibility(8);
                            if (TextUtils.isEmpty(AbsRelationListAdapter.this.g)) {
                                this.i.setText(iMContact.getDisplayName());
                            } else {
                                AbsRelationListAdapter.this.a(this.i, iMContact.getDisplayName(), AbsRelationListAdapter.this.g, 0);
                            }
                        }
                    }
                }
                if (PatchProxy.isSupport(new Object[0], this, f52056c, false, 52829, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52056c, false, 52829, new Class[0], Void.TYPE);
                } else if (AbsRelationListAdapter.this.m != null) {
                    this.itemView.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52060a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f52060a, false, 52832, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f52060a, false, 52832, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            AbsRelationListAdapter.this.m.a(ViewHolder.this.itemView, ViewHolder.this.getAdapterPosition());
                        }
                    });
                }
                this.h.setTag(50331648, 50331649);
                this.h.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, 50331648);
                this.itemView.setTag(83886080, iMContact);
            }
        }
    }

    public interface a {
        void a(View view, int i);
    }

    public abstract String a(IMContact iMContact);

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f52046b, false, 52799, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f52046b, false, 52799, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f52051f != z) {
            this.f52051f = z;
            if (!this.f52051f) {
                this.h.clear();
            }
            if (this.f52051f) {
                d();
                return;
            }
            e();
        }
    }

    public final IMContact[] a() {
        if (!PatchProxy.isSupport(new Object[0], this, f52046b, false, 52803, new Class[0], IMContact[].class)) {
            return (IMContact[]) this.h.toArray(new IMContact[0]);
        }
        return (IMContact[]) PatchProxy.accessDispatch(new Object[0], this, f52046b, false, 52803, new Class[0], IMContact[].class);
    }

    @MainThread
    public final void a(List<IMContact> list, CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{list, charSequence}, this, f52046b, false, 52806, new Class[]{List.class, CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, charSequence}, this, f52046b, false, 52806, new Class[]{List.class, CharSequence.class}, Void.TYPE);
            return;
        }
        this.f52048c = 1;
        this.g = charSequence.toString();
        this.f52050e.clear();
        this.f52050e.addAll(list);
        notifyDataSetChanged();
    }

    public final int c() {
        if (this.i != null) {
            return 1;
        }
        return 0;
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f52046b, false, 52804, new Class[0], Integer.TYPE)) {
            return this.h.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52046b, false, 52804, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemCount() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f52046b, false, 52809, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52046b, false, 52809, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f52050e != null && !this.f52050e.isEmpty()) {
            i2 = this.f52050e.size();
        }
        return i2;
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f52046b, false, 52814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52046b, false, 52814, new Class[0], Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builder = null;
        for (int i2 = 0; i2 < this.k.getChildCount(); i2++) {
            View childAt = this.k.getChildAt(i2);
            if (childAt != null) {
                ViewHolder viewHolder = (ViewHolder) childAt.getTag();
                if (builder == null) {
                    builder = animatorSet.play(viewHolder.d());
                } else {
                    builder.with(viewHolder.d());
                }
            }
        }
        animatorSet.setDuration(300);
        animatorSet.addListener(this.f52047a);
        animatorSet.start();
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f52046b, false, 52815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52046b, false, 52815, new Class[0], Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builder = null;
        for (int i2 = 0; i2 < this.k.getChildCount(); i2++) {
            View childAt = this.k.getChildAt(i2);
            if (childAt != null) {
                ViewHolder viewHolder = (ViewHolder) childAt.getTag();
                if (builder == null) {
                    builder = animatorSet.play(viewHolder.e());
                } else {
                    builder.with(viewHolder.e());
                }
            }
        }
        animatorSet.setDuration(300);
        animatorSet.addListener(this.f52047a);
        animatorSet.start();
    }

    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52046b, false, 52801, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52046b, false, 52801, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        notifyItemChanged(i2);
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f52046b, false, 52812, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f52046b, false, 52812, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.j = null;
    }

    public final boolean b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52046b, false, 52817, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52046b, false, 52817, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i2 < c()) {
            return true;
        } else {
            return false;
        }
    }

    public int getItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52046b, false, 52810, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52046b, false, 52810, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f52050e.get(i2).getType() == -1) {
            return -1;
        } else {
            return 0;
        }
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f52046b, false, 52811, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f52046b, false, 52811, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.j = recyclerView;
        this.k = (LinearLayoutManager) this.j.getLayoutManager();
        if (PatchProxy.isSupport(new Object[0], this, f52046b, false, 52813, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52046b, false, 52813, new Class[0], Void.TYPE);
        } else if (this.n == null) {
            this.n = new RecyclerView.OnScrollListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52052a;

                public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f52052a, false, 52821, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f52052a, false, 52821, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    int findLastCompletelyVisibleItemPosition = AbsRelationListAdapter.this.k.findLastCompletelyVisibleItemPosition();
                    if (AbsRelationListAdapter.this.f52048c == 0 && findLastCompletelyVisibleItemPosition == AbsRelationListAdapter.this.getItemCount() - 1 && AbsRelationListAdapter.this.l != null) {
                        com.ss.android.b.a.a.a.b(AbsRelationListAdapter.this.l);
                    }
                }
            };
        }
        this.j.addOnScrollListener(this.n);
    }

    @MainThread
    public final void a(List<IMContact> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f52046b, false, 52805, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f52046b, false, 52805, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.g = null;
        this.f52050e.clear();
        if (this.f52048c == 1) {
            this.f52048c = 0;
        }
        this.f52050e.addAll(list);
        if (this.f52050e.isEmpty()) {
            IMUser iMUser = new IMUser();
            iMUser.setType(-1);
            this.f52050e.add(iMUser);
        } else if (this.f52050e.size() != 1 || this.f52050e.get(0).getType() != -1) {
            if (this.f52050e.get(0).getType() == -1) {
                this.f52050e.remove(0);
            }
        } else {
            return;
        }
        notifyDataSetChanged();
    }

    @NonNull
    /* renamed from: a */
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        int i3;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f52046b, false, 52807, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class)) {
            return (ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f52046b, false, 52807, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 0) {
            i3 = C0906R.layout.zp;
        } else {
            i3 = C0906R.layout.y5;
        }
        return new ViewHolder(from.inflate(i3, viewGroup2, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i2) {
        ViewHolder viewHolder2 = viewHolder;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f52046b, false, 52808, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f52046b, false, 52808, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        viewHolder2.a(this.f52050e.get(i3), i3);
    }

    public final void a(TextView textView, IMUser iMUser, String str) {
        TextView textView2 = textView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{textView2, iMUser, str2}, this, f52046b, false, 52818, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, iMUser, str2}, this, f52046b, false, 52818, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str)) {
            textView2.setText(iMUser.getDisplayName());
        } else {
            if (m.a()) {
                String nickName = iMUser.getNickName();
                if (!TextUtils.isEmpty(nickName) && !nickName.contains(str2)) {
                    str2 = str.toLowerCase();
                    int indexOf = nickName.toLowerCase().indexOf(str2);
                    if (indexOf != -1) {
                        str2 = nickName.substring(indexOf, Math.min(str2.length() + indexOf, nickName.length()));
                    }
                }
            } else if (iMUser.getSearchType() == 5) {
                str2 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), iMUser.getRemarkInitial(), str2);
            } else if (iMUser.getSearchType() == 3) {
                str2 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str2);
            }
            a(textView2, iMUser.getDisplayName(), str2, 0);
        }
    }

    public final void b(TextView textView, IMUser iMUser, String str) {
        TextView textView2 = textView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{textView2, iMUser, str2}, this, f52046b, false, 52819, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, iMUser, str2}, this, f52046b, false, 52819, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 5) {
            if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 3) {
            if (!TextUtils.isEmpty(iMUser.getRemarkName())) {
                a(textView, GlobalContext.getContext().getResources().getString(C0906R.string.avn, new Object[]{iMUser.getNickName()}), com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str2), 3);
                textView.setVisibility(0);
                return;
            } else if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 1) {
            String displayId = iMUser.getDisplayId();
            String a2 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(displayId, com.ss.android.ugc.aweme.im.sdk.relations.a.a.c(displayId).toLowerCase(), com.ss.android.ugc.aweme.im.sdk.relations.a.a.b(displayId), str2);
            a(textView, GlobalContext.getContext().getResources().getString(C0906R.string.ao6) + displayId, a2, 4);
            textView.setVisibility(0);
            return;
        } else if (iMUser.getSearchType() == 2) {
            a(textView, GlobalContext.getContext().getResources().getString(C0906R.string.aqe, new Object[]{iMUser.getContactName()}), com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str2), 6);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public final void a(TextView textView, String str, String str2, int i2) {
        TextView textView2 = textView;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{textView2, str3, str4, Integer.valueOf(i2)}, this, f52046b, false, 52820, new Class[]{TextView.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, str3, str4, Integer.valueOf(i2)}, this, f52046b, false, 52820, new Class[]{TextView.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        textView2.setText(com.ss.android.ugc.aweme.im.sdk.relations.a.d.a(ContextCompat.getColor(textView.getContext(), C0906R.color.qo), str3, str4, i2));
    }
}
