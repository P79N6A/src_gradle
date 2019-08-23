package com.bytedance.android.livesdk.kickout.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.live.uikit.recyclerview.LoadMoreRecyclerViewAdapter;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.a;

public class BannedListAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f15745f;
    public List<User> g = new ArrayList();
    public boolean h;
    private Context i;
    private String j;
    private long k;

    static class FooterViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15746a;

        /* renamed from: b  reason: collision with root package name */
        TextView f15747b;

        public FooterViewHolder(View view) {
            super(view);
            this.f15747b = (TextView) view.findViewById(C0906R.id.d9h);
        }
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f15745f, false, 10207, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15745f, false, 10207, new Class[0], Integer.TYPE)).intValue();
        } else if (this.h) {
            return this.g.size() + 1;
        } else {
            return this.g.size();
        }
    }

    public final int a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f15745f, false, 10208, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f15745f, false, 10208, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (!this.h || i2 != this.g.size()) {
            return super.a(i2);
        } else {
            return 4099;
        }
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f15745f, false, 10204, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f15745f, false, 10204, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        int size = this.g.size() - 1;
        while (size >= 0) {
            User user = this.g.get(size);
            if (user == null || user.getId() != j2) {
                size--;
            } else {
                this.g.remove(size);
                notifyDataSetChanged();
                return;
            }
        }
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f15745f, false, 10206, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f15745f, false, 10206, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i2 == 4099) {
            return new FooterViewHolder(LayoutInflater.from(this.i).inflate(C0906R.layout.aix, viewGroup, false));
        } else {
            BannedViewHolder bannedViewHolder = new BannedViewHolder(this.i, LayoutInflater.from(this.i).inflate(C0906R.layout.aiy, viewGroup, false), this.j, this.k);
            return bannedViewHolder;
        }
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        ImageModel imageModel;
        int i3;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f15745f, false, 10205, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f15745f, false, 10205, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getItemViewType(i4) == 4099) {
            FooterViewHolder footerViewHolder = (FooterViewHolder) viewHolder;
            if (footerViewHolder != null) {
                String str = this.j;
                if (PatchProxy.isSupport(new Object[]{str}, footerViewHolder, FooterViewHolder.f15746a, false, 10209, new Class[]{String.class}, Void.TYPE)) {
                    FooterViewHolder footerViewHolder2 = footerViewHolder;
                    PatchProxy.accessDispatch(new Object[]{str}, footerViewHolder2, FooterViewHolder.f15746a, false, 10209, new Class[]{String.class}, Void.TYPE);
                } else {
                    TextView textView = footerViewHolder.f15747b;
                    if (str.equals("activity_kick_out")) {
                        i3 = C0906R.string.cyx;
                    } else {
                        i3 = C0906R.string.cyw;
                    }
                    textView.setText(i3);
                }
            }
            return;
        }
        BannedViewHolder bannedViewHolder = (BannedViewHolder) viewHolder;
        if (bannedViewHolder != null) {
            List<User> list = this.g;
            if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, bannedViewHolder, BannedViewHolder.f15748a, false, 10212, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {list, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect = BannedViewHolder.f15748a;
                BannedViewHolder bannedViewHolder2 = bannedViewHolder;
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                PatchProxy.accessDispatch(objArr, bannedViewHolder2, changeQuickRedirect2, false, 10212, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            } else if (list != null) {
                bannedViewHolder.h = list;
                User user = list.get(i4);
                if (user != null) {
                    if (user.getAvatarThumb() != null) {
                        b.b(bannedViewHolder.f15749b, user.getAvatarThumb());
                    } else {
                        bannedViewHolder.f15749b.setImageResource(2130841141);
                    }
                    bannedViewHolder.f15749b.setOnClickListener(new a(user));
                    bannedViewHolder.f15752e.setText(bannedViewHolder.a(user));
                    if (user.getUserHonor() != null) {
                        imageModel = user.getUserHonor().j();
                    } else {
                        imageModel = null;
                    }
                    if (imageModel == null || CollectionUtils.isEmpty(imageModel.getUrls())) {
                        bannedViewHolder.f15753f.setVisibility(8);
                    } else {
                        b.a((ImageView) bannedViewHolder.f15753f, imageModel, (q.a) new q.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f15754a;

                            public final void a(ImageModel imageModel) {
                            }

                            public final void a(ImageModel imageModel, Exception exc) {
                            }

                            public final void a(ImageModel imageModel, int i, int i2, boolean z) {
                                if (PatchProxy.isSupport(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f15754a, false, 10221, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f15754a, false, 10221, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                                    return;
                                }
                                ViewGroup.LayoutParams layoutParams = BannedViewHolder.this.f15753f.getLayoutParams();
                                int a2 = ac.a(32.0f);
                                layoutParams.width = a2;
                                layoutParams.height = (a2 * i2) / i;
                                BannedViewHolder.this.f15753f.setLayoutParams(layoutParams);
                            }
                        });
                        bannedViewHolder.f15753f.setVisibility(0);
                    }
                    bannedViewHolder.f15750c.setOnClickListener(new View.OnClickListener(i4) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f15756a;

                        /* renamed from: d  reason: collision with root package name */
                        private static final /* synthetic */ a.C0900a f15757d;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ int f15758b;

                        static {
                            if (PatchProxy.isSupport(new Object[0], null, f15756a, true, 10223, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], null, f15756a, true, 10223, new Class[0], Void.TYPE);
                                return;
                            }
                            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("BannedViewHolder.java", AnonymousClass2.class);
                            f15757d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.kickout.ui.BannedViewHolder$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 134);
                        }

                        public void onClick(View view) {
                            String str;
                            int i;
                            View view2 = view;
                            if (PatchProxy.isSupport(new Object[]{view2}, this, f15756a, false, 10222, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view2}, this, f15756a, false, 10222, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f15757d, this, this, view2));
                            BannedViewHolder bannedViewHolder = BannedViewHolder.this;
                            int i2 = this.f15758b;
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, bannedViewHolder, BannedViewHolder.f15748a, false, 10211, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                BannedViewHolder bannedViewHolder2 = bannedViewHolder;
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, bannedViewHolder2, BannedViewHolder.f15748a, false, 10211, new Class[]{Integer.TYPE}, Void.TYPE);
                            } else if (!NetworkUtils.isNetworkAvailable(bannedViewHolder.g)) {
                                com.bytedance.android.live.uikit.d.a.a(bannedViewHolder.g, (int) C0906R.string.cst);
                            } else {
                                User user = bannedViewHolder.h.get(i2);
                                String str2 = bannedViewHolder.i;
                                if (PatchProxy.isSupport(new Object[]{user, str2}, bannedViewHolder, BannedViewHolder.f15748a, false, 10213, new Class[]{User.class, String.class}, Void.TYPE)) {
                                    BannedViewHolder bannedViewHolder3 = bannedViewHolder;
                                    PatchProxy.accessDispatch(new Object[]{user, str2}, bannedViewHolder3, BannedViewHolder.f15748a, false, 10213, new Class[]{User.class, String.class}, Void.TYPE);
                                    return;
                                }
                                if (user != null) {
                                    bannedViewHolder.l = user;
                                    String string = bannedViewHolder.g.getString(C0906R.string.cq3);
                                    if (TextUtils.isEmpty(bannedViewHolder.a(user))) {
                                        str = "";
                                    } else {
                                        str = bannedViewHolder.a(user);
                                    }
                                    Context context = bannedViewHolder.g;
                                    if (str2.equals("activity_banned_talk")) {
                                        i = C0906R.string.cq4;
                                    } else {
                                        i = C0906R.string.cq5;
                                    }
                                    String string2 = context.getString(i);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + " " + str + " " + string2);
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(bannedViewHolder.g.getResources().getColor(C0906R.color.a8u)), string.length() + 1, string.length() + 1 + str.length(), 33);
                                    new m.a(bannedViewHolder.g).c((CharSequence) spannableStringBuilder).b(1, (int) C0906R.string.cpz, b.f15763b).b(0, (int) C0906R.string.cpw, (DialogInterface.OnClickListener) new c(bannedViewHolder, str2, user)).c();
                                }
                            }
                        }

                        {
                            this.f15758b = r2;
                        }
                    });
                }
            }
        }
    }

    public BannedListAdapter(Context context, String str, long j2) {
        this.i = context;
        this.j = str;
        this.k = j2;
    }
}
