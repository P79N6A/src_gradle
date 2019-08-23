package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.a;
import com.ss.android.ugc.aweme.story.api.d;
import com.ss.android.ugc.aweme.story.api.f;
import com.ss.android.ugc.aweme.story.base.view.StoryCircleView;
import com.ss.android.ugc.aweme.story.comment.model.c;
import com.ss.android.ugc.aweme.story.comment.view.CommentFragment;
import com.ss.android.ugc.aweme.story.detail.e;
import org.jetbrains.annotations.NotNull;

public class ViewerListViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72263a = null;
    static int p = 0;
    static int q = 1;
    private static int z = 2;

    /* renamed from: b  reason: collision with root package name */
    public CommentFragment f72264b;

    /* renamed from: c  reason: collision with root package name */
    AvatarImageView f72265c;

    /* renamed from: d  reason: collision with root package name */
    TextView f72266d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f72267e;

    /* renamed from: f  reason: collision with root package name */
    View f72268f;
    DmtTextView g;
    DmtTextView h;
    DmtTextView i;
    DmtTextView j;
    LinearLayout k;
    RemoteImageView l;
    c m;
    public User n;
    IUserService o = ((IUserService) ServiceManager.get().getService(IUserService.class));
    int r;
    d s;
    e t;
    public DialogInterface.OnClickListener u = new DialogInterface.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72275a;

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f72275a, false, 83013, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f72275a, false, 83013, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            ViewerListViewHolder.this.a(true);
        }
    };
    public DialogInterface.OnClickListener v = new DialogInterface.OnClickListener() {
        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    };
    private StoryCircleView w;
    private AnimationImageView x;
    private LinearLayout y;

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f72263a, false, 82996, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72263a, false, 82996, new Class[0], Boolean.TYPE)).booleanValue();
        }
        f fVar = (f) ServiceManager.get().getService(f.class);
        if (fVar != null && fVar != null && this.m.getIsFriend() && fVar.b() && ((this.n.getStoryBlockInfo() == null || !this.n.getStoryBlockInfo().isBlocked()) && !a(this.n) && !fVar.d())) {
            return true;
        }
        return false;
    }

    private void b(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f72263a, false, 82999, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f72263a, false, 82999, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        boolean a2 = a();
        RemoteImageView remoteImageView = this.l;
        if (!a2) {
            i2 = 8;
        }
        remoteImageView.setVisibility(i2);
    }

    public final void a(final boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f72263a, false, 83003, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f72263a, false, 83003, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.s = (d) ServiceManager.get().getService(d.class);
        this.s.a(this.f72264b.getContext(), this.n.getUid(), z2 ? 1 : 0, (a<Integer>) new a<Integer>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72277a;

            public final /* synthetic */ void a(Object obj) {
                String str;
                Integer num = (Integer) obj;
                if (PatchProxy.isSupport(new Object[]{num}, this, f72277a, false, 83014, new Class[]{Integer.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{num}, this, f72277a, false, 83014, new Class[]{Integer.class}, Void.TYPE);
                    return;
                }
                ViewerListViewHolder.this.n.setBlock(z2);
                ViewerListViewHolder.this.a(z2, true);
                Context context = ViewerListViewHolder.this.f72264b.getContext();
                if (z2) {
                    str = "隐藏成功";
                } else {
                    str = "取消隐藏成功";
                }
                com.bytedance.ies.dmt.ui.d.a.b(context, str).a();
            }

            public final void a(@NotNull String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f72277a, false, 83015, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f72277a, false, 83015, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.b((Context) ViewerListViewHolder.this.f72264b.getActivity(), "请求出错").a();
            }
        });
    }

    public ViewerListViewHolder(View view) {
        super(view);
        this.f72265c = (AvatarImageView) view.findViewById(C0906R.id.hk);
        this.w = (StoryCircleView) view.findViewById(C0906R.id.cw3);
        this.x = (AnimationImageView) view.findViewById(C0906R.id.i8);
        this.f72266d = (TextView) view.findViewById(C0906R.id.df7);
        this.f72267e = (ImageView) view.findViewById(C0906R.id.b3b);
        this.h = (DmtTextView) view.findViewById(C0906R.id.dh6);
        this.i = (DmtTextView) view.findViewById(C0906R.id.agr);
        this.y = (LinearLayout) view.findViewById(C0906R.id.bgm);
        this.f72268f = view.findViewById(C0906R.id.anl);
        this.j = (DmtTextView) view.findViewById(C0906R.id.ddg);
        this.g = (DmtTextView) view.findViewById(C0906R.id.dco);
        this.k = (LinearLayout) view.findViewById(C0906R.id.z1);
        this.t = new e(this.f72265c, this.w, this.x);
        this.l = (RemoteImageView) view.findViewById(C0906R.id.b51);
    }

    /* access modifiers changed from: package-private */
    public boolean a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f72263a, false, 82997, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f72263a, false, 82997, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || user.getStoryBlockInfo() == null) {
            return false;
        } else {
            return user.getStoryBlockInfo().isBlock();
        }
    }

    public final void a(boolean z2, boolean z3) {
        int i2;
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f72263a, false, 82998, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f72263a, false, 82998, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.f72267e != null) {
            ImageView imageView = this.f72267e;
            if (z2) {
                i2 = 2130837743;
            } else {
                i2 = 2130837744;
            }
            imageView.setImageResource(i2);
            AvatarImageView avatarImageView = this.f72265c;
            float f4 = 1.0f;
            float f5 = 0.5f;
            if (z2) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            avatarImageView.setAlpha(f2);
            StoryCircleView storyCircleView = this.w;
            if (z2) {
                f3 = 0.5f;
            } else {
                f3 = 1.0f;
            }
            storyCircleView.setAlpha(f3);
            TextView textView = this.f72266d;
            if (z2) {
                f4 = 0.34f;
            }
            textView.setAlpha(f4);
            DmtTextView dmtTextView = this.h;
            if (z2) {
                f5 = 0.34f;
            }
            dmtTextView.setAlpha(f5);
            if (this.n.getStoryBlockInfo() == null) {
                this.n.setStoryBlockInfo(new StoryBlockInfo());
            }
            this.n.getStoryBlockInfo().setBlock(z2);
            b(z3);
            if (!(!z3 || this.m == null || this.n == null)) {
                com.ss.android.ugc.aweme.story.comment.model.a aVar = new com.ss.android.ugc.aweme.story.comment.model.a(this.n.getUid(), z2);
                aVar.f72209c = this.f72264b;
                org.greenrobot.eventbus.c.a().d(aVar);
            }
        }
    }

    public final void a(User user, DmtTextView dmtTextView, int i2) {
        DmtTextView dmtTextView2 = dmtTextView;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{user, dmtTextView2, Integer.valueOf(i2)}, this, f72263a, false, 83001, new Class[]{User.class, DmtTextView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, dmtTextView2, Integer.valueOf(i2)}, this, f72263a, false, 83001, new Class[]{User.class, DmtTextView.class, Integer.TYPE}, Void.TYPE);
        } else if (i3 == p) {
            dmtTextView2.setText(C0906R.string.afp);
            dmtTextView2.setTextColor(dmtTextView.getResources().getColor(C0906R.color.a08));
            dmtTextView2.setBackgroundResource(2130837787);
        } else if (i3 == z) {
            dmtTextView2.setText(C0906R.string.ags);
            dmtTextView2.setTextColor(dmtTextView.getResources().getColor(C0906R.color.a6j));
            dmtTextView2.setBackgroundResource(2130837753);
        } else {
            dmtTextView2.setText(C0906R.string.agr);
            dmtTextView2.setTextColor(dmtTextView.getResources().getColor(C0906R.color.a6j));
            dmtTextView2.setBackgroundResource(2130837753);
        }
    }
}
