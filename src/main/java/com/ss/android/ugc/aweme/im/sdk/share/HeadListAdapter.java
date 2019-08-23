package com.ss.android.ugc.aweme.im.sdk.share;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.BaseViewHolder;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.utils.ap;
import com.ss.android.ugc.aweme.im.sdk.utils.ar;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.sdk.utils.ax;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.bytex.a.a.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class HeadListAdapter extends RecyclerView.Adapter<HeadViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52356a;

    /* renamed from: b  reason: collision with root package name */
    public int f52357b;

    /* renamed from: c  reason: collision with root package name */
    public List<IMContact> f52358c;

    /* renamed from: d  reason: collision with root package name */
    protected LinkedHashSet<IMContact> f52359d = new LinkedHashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public View.OnClickListener f52360e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f52361f = false;

    public class HeadViewHolder extends BaseViewHolder<IMContact> {
        public HeadViewHolder(ViewGroup viewGroup, int i) {
            super(viewGroup, i);
        }
    }

    public class MoreViewHolder extends HeadViewHolder {

        /* renamed from: d  reason: collision with root package name */
        public static ChangeQuickRedirect f52363d;

        /* renamed from: f  reason: collision with root package name */
        private AvatarImageView f52365f;
        private Drawable g;

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f52363d, false, 53183, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52363d, false, 53183, new Class[0], Void.TYPE);
                return;
            }
            au.b(this.f52365f);
            this.f52365f.setOnClickListener(HeadListAdapter.this.f52360e);
        }

        public final void b() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f52363d, false, 53181, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52363d, false, 53181, new Class[0], Void.TYPE);
                return;
            }
            super.b();
            this.f52365f = (AvatarImageView) this.itemView.findViewById(C0906R.id.sz);
            Resources resources = GlobalContext.getContext().getResources();
            if (m.a()) {
                i = 2130839012;
            } else {
                i = 2130839011;
            }
            this.g = a.a(resources, i);
            if (Build.VERSION.SDK_INT >= 19) {
                this.g.setAutoMirrored(true);
            }
        }

        public final /* synthetic */ void a(Object obj, int i) {
            IMContact iMContact = (IMContact) obj;
            if (PatchProxy.isSupport(new Object[]{iMContact, Integer.valueOf(i)}, this, f52363d, false, 53182, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iMContact, Integer.valueOf(i)}, this, f52363d, false, 53182, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f52365f.setImageDrawable(this.g);
        }

        public MoreViewHolder(ViewGroup viewGroup, int i) {
            super(viewGroup, C0906R.layout.wk);
        }
    }

    public class ViewHolder extends HeadViewHolder {

        /* renamed from: d  reason: collision with root package name */
        public static ChangeQuickRedirect f52366d;

        /* renamed from: f  reason: collision with root package name */
        private TextView f52368f;
        private AvatarImageView g;
        private View h;
        private ImageView i;
        private View j;
        private int k;

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f52366d, false, 53185, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52366d, false, 53185, new Class[0], Void.TYPE);
                return;
            }
            if (!HeadListAdapter.this.f52361f) {
                au.b(this.g);
            }
            this.g.setOnClickListener(HeadListAdapter.this.f52360e);
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f52366d, false, 53184, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52366d, false, 53184, new Class[0], Void.TYPE);
                return;
            }
            super.b();
            this.f52368f = (TextView) this.itemView.findViewById(C0906R.id.bps);
            this.g = (AvatarImageView) this.itemView.findViewById(C0906R.id.i4);
            this.i = (ImageView) this.itemView.findViewById(C0906R.id.dr5);
            this.h = this.itemView.findViewById(C0906R.id.dr6);
            this.j = this.itemView.findViewById(C0906R.id.aml);
            this.k = this.itemView.getContext().getResources().getDimensionPixelSize(C0906R.dimen.hc);
        }

        private void a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f52366d, false, 53187, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f52366d, false, 53187, new Class[]{String.class}, Void.TYPE);
                return;
            }
            this.f52368f.setText(ar.a(new SpannableStringBuilder(ap.a(str)), this.f52368f.getPaint(), this.k, this.f52368f.getMaxLines(), 0, 0));
        }

        public final /* synthetic */ void a(Object obj, int i2) {
            int i3;
            int i4 = i2;
            IMContact iMContact = (IMContact) obj;
            if (PatchProxy.isSupport(new Object[]{iMContact, Integer.valueOf(i2)}, this, f52366d, false, 53186, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iMContact, Integer.valueOf(i2)}, this, f52366d, false, 53186, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.a(iMContact, i4);
            if (iMContact == null) {
                this.itemView.setTag(null);
                return;
            }
            this.g.setTag(iMContact);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52366d, false, 53189, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52366d, false, 53189, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
                if (Build.VERSION.SDK_INT >= 17) {
                    if (i4 == 0) {
                        layoutParams.setMarginStart((int) UIUtils.dip2Px(this.itemView.getContext(), 12.0f));
                    } else if (HeadListAdapter.this.f52357b == 0 && i4 == HeadListAdapter.this.f52358c.size() - 1) {
                        layoutParams.setMarginEnd((int) UIUtils.dip2Px(this.itemView.getContext(), 26.0f));
                    } else {
                        layoutParams.setMarginStart((int) UIUtils.dip2Px(this.itemView.getContext(), 6.0f));
                        layoutParams.setMarginEnd(0);
                    }
                } else if (i4 == 0) {
                    layoutParams.leftMargin = (int) UIUtils.dip2Px(this.itemView.getContext(), 12.0f);
                } else if (HeadListAdapter.this.f52357b == 0 && i4 == HeadListAdapter.this.f52358c.size() - 1) {
                    layoutParams.rightMargin = (int) UIUtils.dip2Px(this.itemView.getContext(), 26.0f);
                } else {
                    layoutParams.leftMargin = (int) UIUtils.dip2Px(this.itemView.getContext(), 6.0f);
                    layoutParams.rightMargin = 0;
                }
                this.itemView.setLayoutParams(layoutParams);
            }
            String displayName = iMContact.getDisplayName();
            if (TextUtils.isEmpty(displayName)) {
                this.f52368f.setText("");
            } else if (iMContact instanceof IMUser) {
                a(displayName);
            } else if (iMContact instanceof IMConversation) {
                IMConversation iMConversation = (IMConversation) iMContact;
                if (iMConversation.getConversationType() == d.a.f20886a) {
                    a(displayName);
                } else if (iMConversation.getConversationType() == d.a.f20887b) {
                    if (PatchProxy.isSupport(new Object[]{displayName, iMConversation}, this, f52366d, false, 53188, new Class[]{String.class, IMConversation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{displayName, iMConversation}, this, f52366d, false, 53188, new Class[]{String.class, IMConversation.class}, Void.TYPE);
                    } else {
                        String a2 = ap.a(displayName);
                        b a3 = com.bytedance.im.core.d.d.a().a(iMConversation.getConversationId());
                        if (a3 == null) {
                            i3 = 0;
                        } else {
                            i3 = a3.getMemberCount();
                        }
                        String string = this.f52368f.getContext().getString(C0906R.string.ast, new Object[]{Integer.valueOf(i3)});
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2 + string);
                        spannableStringBuilder.setSpan(new ClickableSpan() {
                            public final void onClick(@NonNull View view) {
                            }
                        }, a2.length(), spannableStringBuilder.length(), 34);
                        SpannableStringBuilder a4 = ar.a(spannableStringBuilder, this.f52368f.getPaint(), this.k, this.f52368f.getMaxLines(), string.length(), (int) (this.f52368f.getPaint().measureText(string) + 0.5f));
                        if (Build.VERSION.SDK_INT >= 23) {
                            this.f52368f.setBreakStrategy(0);
                        }
                        this.f52368f.setText(a4.toString());
                    }
                }
            }
            IMUser a5 = e.a(iMContact);
            if (a5 != null) {
                c.b(this.g, a5.getDisplayAvatar());
            } else if (iMContact instanceof IMConversation) {
                IMConversation iMConversation2 = (IMConversation) iMContact;
                if (PatchProxy.isSupport(new Object[]{iMConversation2}, this, f52366d, false, 53190, new Class[]{IMConversation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMConversation2}, this, f52366d, false, 53190, new Class[]{IMConversation.class}, Void.TYPE);
                } else {
                    UrlModel displayAvatar = iMConversation2.getDisplayAvatar();
                    if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().isEmpty()) {
                        c.a((RemoteImageView) this.g, 2130840086);
                    } else {
                        c.b(this.g, displayAvatar);
                    }
                }
            }
            ax.a(this.i, a5);
            if (HeadListAdapter.this.f52361f) {
                if (HeadListAdapter.this.f52359d.contains(iMContact)) {
                    this.j.setVisibility(0);
                    this.h.setVisibility(this.i.getVisibility());
                    return;
                }
                this.j.setVisibility(8);
                this.h.setVisibility(8);
            }
        }

        public ViewHolder(ViewGroup viewGroup, int i2) {
            super(viewGroup, C0906R.layout.a0m);
        }
    }

    public final IMContact[] a() {
        if (!PatchProxy.isSupport(new Object[0], this, f52356a, false, 53171, new Class[0], IMContact[].class)) {
            return (IMContact[]) this.f52359d.toArray(new IMContact[0]);
        }
        return (IMContact[]) PatchProxy.accessDispatch(new Object[0], this, f52356a, false, 53171, new Class[0], IMContact[].class);
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f52356a, false, 53174, new Class[0], Integer.TYPE)) {
            return this.f52359d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52356a, false, 53174, new Class[0], Integer.TYPE)).intValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f52356a, false, 53176, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52356a, false, 53176, new Class[0], Void.TYPE);
            return;
        }
        this.f52359d.clear();
        notifyDataSetChanged();
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f52356a, false, 53179, new Class[0], Integer.TYPE)) {
            return this.f52358c.size() + this.f52357b;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52356a, false, 53179, new Class[0], Integer.TYPE)).intValue();
    }

    public HeadListAdapter(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[0], this, f52356a, false, 53172, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52356a, false, 53172, new Class[0], Void.TYPE);
        } else {
            if (this.f52358c == null) {
                this.f52358c = new ArrayList();
            }
            com.ss.android.ugc.aweme.im.service.b abInterface = ((IIMService) com.ss.android.ugc.aweme.im.sdk.g.a.a(IIMService.class)).getAbInterface();
            if (abInterface != null) {
                this.f52361f = abInterface.d();
            }
        }
        this.f52360e = onClickListener;
    }

    public final boolean b(IMContact iMContact) {
        IMContact iMContact2 = iMContact;
        if (!PatchProxy.isSupport(new Object[]{iMContact2}, this, f52356a, false, 53175, new Class[]{IMContact.class}, Boolean.TYPE)) {
            return this.f52359d.contains(iMContact2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMContact2}, this, f52356a, false, 53175, new Class[]{IMContact.class}, Boolean.TYPE)).booleanValue();
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52356a, false, 53180, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52356a, false, 53180, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i >= this.f52358c.size()) {
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean a(IMContact iMContact) {
        if (PatchProxy.isSupport(new Object[]{iMContact}, this, f52356a, false, 53173, new Class[]{IMContact.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMContact}, this, f52356a, false, 53173, new Class[]{IMContact.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f52359d.contains(iMContact)) {
            this.f52359d.remove(iMContact);
            return false;
        } else {
            this.f52359d.add(iMContact);
            return true;
        }
    }

    public final void a(List<IMContact> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, (byte) 1}, this, f52356a, false, 53170, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, (byte) 1}, this, f52356a, false, 53170, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f52357b = 1;
        this.f52358c.clear();
        this.f52358c.addAll(list);
        notifyDataSetChanged();
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        HeadViewHolder headViewHolder = (HeadViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{headViewHolder, Integer.valueOf(i)}, this, f52356a, false, 53178, new Class[]{HeadViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{headViewHolder, Integer.valueOf(i)}, this, f52356a, false, 53178, new Class[]{HeadViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (i < this.f52358c.size()) {
            headViewHolder.a(this.f52358c.get(i), i);
        } else {
            headViewHolder.a(null, i);
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f52356a, false, 53177, new Class[]{ViewGroup.class, Integer.TYPE}, HeadViewHolder.class)) {
            return (HeadViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f52356a, false, 53177, new Class[]{ViewGroup.class, Integer.TYPE}, HeadViewHolder.class);
        } else if (i == 0) {
            return new ViewHolder(viewGroup, C0906R.layout.a0m);
        } else {
            return new MoreViewHolder(viewGroup, C0906R.layout.wk);
        }
    }
}
