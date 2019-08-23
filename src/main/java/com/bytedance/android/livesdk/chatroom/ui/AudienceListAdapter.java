package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.m;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.i;
import com.bytedance.android.live.core.widget.FitTextView;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.utils.v;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class AudienceListAdapter extends AbsAudienceListAdapter<AudienceViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11492a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11493b;

    /* renamed from: c  reason: collision with root package name */
    private final LayoutInflater f11494c;

    /* renamed from: d  reason: collision with root package name */
    private View.OnClickListener f11495d = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11497a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f11498c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f11497a, true, 5649, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f11497a, true, 5649, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("AudienceListAdapter.java", AnonymousClass1.class);
            f11498c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.AudienceListAdapter$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 54);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f11497a, false, 5648, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f11497a, false, 5648, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f11498c, this, this, view));
            if (view.getTag() != null && (view.getTag() instanceof Long)) {
                if (AudienceListAdapter.this.f11493b) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event_belong", "live_take");
                    hashMap.put("event_type", "click");
                    hashMap.put("event_page", "live_take_detail");
                    hashMap.put("path", "top_online_pic");
                    com.bytedance.android.livesdk.j.a.a().a("pm_live_take_anchor_c_audience", hashMap, new k());
                }
                UserProfileEvent userProfileEvent = new UserProfileEvent(((Long) view.getTag()).longValue());
                userProfileEvent.setClickUserPosition("top_single_room_rank");
                com.bytedance.android.livesdk.u.a.a().a((Object) userProfileEvent);
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private List<com.bytedance.android.livesdk.rank.model.b> f11496e = new ArrayList();

    static class AudienceViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11500a;

        /* renamed from: b  reason: collision with root package name */
        View f11501b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f11502c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f11503d;

        /* renamed from: e  reason: collision with root package name */
        ImageView f11504e;

        /* renamed from: f  reason: collision with root package name */
        ImageView f11505f;
        FitTextView g;

        AudienceViewHolder(View view) {
            super(view);
            this.f11501b = view;
            this.f11502c = (ImageView) view.findViewById(C0906R.id.hk);
            this.f11503d = (ImageView) view.findViewById(C0906R.id.hs);
            this.f11504e = (ImageView) view.findViewById(C0906R.id.aof);
            this.f11505f = (ImageView) view.findViewById(C0906R.id.a1r);
            this.g = (FitTextView) view.findViewById(C0906R.id.zi);
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11492a, false, 5647, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11492a, false, 5647, new Class[0], Void.TYPE);
            return;
        }
        this.f11496e.clear();
        notifyDataSetChanged();
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f11492a, false, 5644, new Class[0], Integer.TYPE)) {
            return this.f11496e.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11492a, false, 5644, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(boolean z) {
        this.f11493b = z;
    }

    public AudienceListAdapter(Context context) {
        this.f11494c = LayoutInflater.from(context.getApplicationContext());
    }

    public final void a(long j) {
        User user;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f11492a, false, 5646, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f11492a, false, 5646, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        int size = this.f11496e.size() - 1;
        while (size >= 0) {
            com.bytedance.android.livesdk.rank.model.b bVar = this.f11496e.get(size);
            if (bVar != null) {
                user = bVar.f17025b;
            } else {
                user = null;
            }
            if (user == null || user.getId() != j) {
                size--;
            } else {
                this.f11496e.remove(size);
                notifyDataSetChanged();
                return;
            }
        }
    }

    public final void a(List<com.bytedance.android.livesdk.rank.model.b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f11492a, false, 5645, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f11492a, false, 5645, new Class[]{List.class}, Void.TYPE);
        } else if (list != null) {
            this.f11496e.clear();
            if (!CollectionUtils.isEmpty(list)) {
                this.f11496e.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11492a, false, 5642, new Class[]{ViewGroup.class, Integer.TYPE}, AudienceViewHolder.class)) {
            return new AudienceViewHolder(this.f11494c.inflate(C0906R.layout.alt, viewGroup2, false));
        }
        return (AudienceViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11492a, false, 5642, new Class[]{ViewGroup.class, Integer.TYPE}, AudienceViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        String str;
        String sb;
        int i3;
        float f2;
        float f3;
        AudienceViewHolder audienceViewHolder = (AudienceViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{audienceViewHolder, Integer.valueOf(i)}, this, f11492a, false, 5643, new Class[]{AudienceViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{audienceViewHolder, Integer.valueOf(i)}, this, f11492a, false, 5643, new Class[]{AudienceViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.rank.model.b bVar = this.f11496e.get(i);
        View.OnClickListener onClickListener = this.f11495d;
        if (PatchProxy.isSupport(new Object[]{bVar, onClickListener}, audienceViewHolder, AudienceViewHolder.f11500a, false, 5650, new Class[]{com.bytedance.android.livesdk.rank.model.b.class, View.OnClickListener.class}, Void.TYPE)) {
            AudienceViewHolder audienceViewHolder2 = audienceViewHolder;
            PatchProxy.accessDispatch(new Object[]{bVar, onClickListener}, audienceViewHolder2, AudienceViewHolder.f11500a, false, 5650, new Class[]{com.bytedance.android.livesdk.rank.model.b.class, View.OnClickListener.class}, Void.TYPE);
        } else if (bVar != null && bVar.f17025b != null) {
            User user = bVar.f17025b;
            if (user.getAvatarThumb() == null || CollectionUtils.isEmpty(user.getAvatarThumb().getUrls())) {
                com.bytedance.android.livesdk.chatroom.f.b.a(audienceViewHolder.f11502c, 2130841468);
            } else {
                com.bytedance.android.livesdk.chatroom.f.b.a(audienceViewHolder.f11502c, user.getAvatarThumb(), 2130841468);
            }
            if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g() || com.bytedance.android.live.uikit.a.a.f() || com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.j()) {
                if (user.getBorder() == null || user.getBorder().f7750b == null || CollectionUtils.isEmpty(user.getBorder().f7750b.getUrls())) {
                    audienceViewHolder.f11503d.setVisibility(8);
                } else {
                    audienceViewHolder.f11503d.setVisibility(0);
                    com.bytedance.android.livesdk.chatroom.f.b.a(audienceViewHolder.f11503d, user.getBorder().f7750b);
                }
                if (bVar.f17026c > 0) {
                    long j = bVar.f17026c;
                    Object[] objArr = {new Long(j)};
                    if (PatchProxy.isSupport(objArr, null, v.f17641a, true, 13693, new Class[]{Long.TYPE}, String.class)) {
                        Object[] objArr2 = {new Long(j)};
                        Object[] objArr3 = objArr2;
                        sb = (String) PatchProxy.accessDispatch(objArr3, null, v.f17641a, true, 13693, new Class[]{Long.TYPE}, String.class);
                    } else {
                        if (com.bytedance.android.live.uikit.a.a.a()) {
                            str = "w";
                        } else {
                            str = "万";
                        }
                        if (j < 10000) {
                            sb = String.valueOf(j);
                        } else if (j < 1000000) {
                            DecimalFormat decimalFormat = new DecimalFormat("#.#" + str);
                            double d2 = (double) j;
                            Double.isNaN(d2);
                            sb = decimalFormat.format((d2 * 1.0d) / 10000.0d);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            double d3 = (double) j;
                            Double.isNaN(d3);
                            sb2.append(i.a("%.0f", Double.valueOf((d3 * 1.0d) / 10000.0d)));
                            sb2.append(str);
                            sb = sb2.toString();
                        }
                    }
                    String str2 = sb;
                    FitTextView fitTextView = audienceViewHolder.g;
                    FitTextView fitTextView2 = audienceViewHolder.g;
                    float a2 = (float) ac.a(20.0f);
                    float a3 = (float) ac.a(32.0f);
                    float b2 = ac.b(9.0f);
                    Object[] objArr4 = {fitTextView2, str2, Float.valueOf(a2), Float.valueOf(a3), Float.valueOf(b2)};
                    ChangeQuickRedirect changeQuickRedirect = AudienceViewHolder.f11500a;
                    FitTextView fitTextView3 = fitTextView;
                    float f4 = b2;
                    float f5 = a3;
                    float f6 = a2;
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    FitTextView fitTextView4 = fitTextView2;
                    String str3 = str2;
                    FitTextView fitTextView5 = fitTextView3;
                    if (PatchProxy.isSupport(objArr4, audienceViewHolder, changeQuickRedirect2, false, 5652, new Class[]{TextView.class, String.class, Float.TYPE, Float.TYPE, Float.TYPE}, Float.TYPE)) {
                        i3 = 4;
                        f2 = ((Float) PatchProxy.accessDispatch(new Object[]{fitTextView4, str3, Float.valueOf(f6), Float.valueOf(f5), Float.valueOf(f4)}, audienceViewHolder, AudienceViewHolder.f11500a, false, 5652, new Class[]{TextView.class, String.class, Float.TYPE, Float.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
                    } else {
                        i3 = 4;
                        if (fitTextView4 == null) {
                            f2 = 0.0f;
                        } else {
                            TextPaint paint = fitTextView4.getPaint();
                            paint.setTextSize(f4);
                            float measureText = paint.measureText(str3) + ((float) fitTextView4.getPaddingLeft()) + ((float) fitTextView4.getPaddingRight());
                            if (measureText > f5) {
                                f3 = f5;
                            } else {
                                f3 = measureText;
                            }
                            if (f3 < f6) {
                                f2 = f6;
                            } else {
                                f2 = f3;
                            }
                        }
                    }
                    fitTextView5.setWidth((int) f2);
                    audienceViewHolder.g.setText(str3, TextView.BufferType.NORMAL);
                    int i4 = 2130840645;
                    switch (bVar.f17027d) {
                        case 1:
                            i4 = 2130840642;
                            break;
                        case 2:
                            i4 = 2130840643;
                            break;
                        case 3:
                            i4 = 2130840644;
                            break;
                    }
                    audienceViewHolder.g.setBackgroundResource(i4);
                    audienceViewHolder.g.setVisibility(0);
                    audienceViewHolder.f11504e.setVisibility(i3);
                } else {
                    audienceViewHolder.g.setVisibility(8);
                    if (PatchProxy.isSupport(new Object[]{user}, audienceViewHolder, AudienceViewHolder.f11500a, false, 5651, new Class[]{User.class}, Void.TYPE)) {
                        Object[] objArr5 = {user};
                        AudienceViewHolder audienceViewHolder3 = audienceViewHolder;
                        PatchProxy.accessDispatch(objArr5, audienceViewHolder3, AudienceViewHolder.f11500a, false, 5651, new Class[]{User.class}, Void.TYPE);
                    } else {
                        m userHonor = user.getUserHonor();
                        if (userHonor == null || userHonor.m() <= 0 || com.bytedance.android.livesdkapi.a.a.f18615c) {
                            audienceViewHolder.f11504e.setVisibility(4);
                        } else {
                            audienceViewHolder.f11504e.setVisibility(0);
                            com.bytedance.android.livesdk.chatroom.f.b.a(audienceViewHolder.f11504e, userHonor.n());
                        }
                    }
                }
                if (!com.bytedance.android.live.uikit.a.a.f() && !com.bytedance.android.live.uikit.a.a.a() && !com.bytedance.android.live.uikit.a.a.j()) {
                    int i5 = bVar.f17027d;
                    if (user.getBorder() != null || !bVar.h || i5 <= 0) {
                        audienceViewHolder.f11505f.setVisibility(8);
                    } else {
                        switch (i5) {
                            case 1:
                                i2 = 2130841185;
                                break;
                            case 2:
                                i2 = 2130841342;
                                break;
                            case 3:
                                i2 = 2130841135;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        if (i2 != 0) {
                            Drawable c2 = ac.c(i2);
                            if (c.a(ac.e()) && Build.VERSION.SDK_INT >= 19) {
                                c2.setAutoMirrored(true);
                            }
                            audienceViewHolder.f11505f.setImageDrawable(c2);
                            audienceViewHolder.f11505f.setVisibility(0);
                        } else {
                            audienceViewHolder.f11505f.setVisibility(8);
                        }
                    }
                }
                audienceViewHolder.f11501b.setTag(Long.valueOf(user.getId()));
                audienceViewHolder.f11501b.setOnClickListener(onClickListener);
            }
        }
    }
}
