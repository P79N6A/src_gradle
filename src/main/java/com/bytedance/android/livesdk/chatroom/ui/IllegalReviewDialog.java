package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LiveDialogFragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.model.aj;
import com.bytedance.android.livesdk.live.d;
import com.bytedance.android.livesdk.v.j;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class IllegalReviewDialog extends LiveDialogFragment implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11517a;
    private static final /* synthetic */ a.C0900a o;

    /* renamed from: b  reason: collision with root package name */
    public RelativeLayout f11518b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f11519c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f11520d;

    /* renamed from: e  reason: collision with root package name */
    public LoadingStatusView f11521e;

    /* renamed from: f  reason: collision with root package name */
    private Context f11522f;
    private View g;
    private ProgressBar h;
    private TextView i;
    private TextView j;
    private TextView k;
    private LinearLayout l;
    private List<aj> m;
    private d n;

    static {
        if (PatchProxy.isSupport(new Object[0], null, f11517a, true, 5767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11517a, true, 5767, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("IllegalReviewDialog.java", IllegalReviewDialog.class);
        o = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.IllegalReviewDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 269);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11517a, false, 5752, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11517a, false, 5752, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f11517a, false, 5765, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f11517a, false, 5765, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            d dVar = this.n;
            if (PatchProxy.isSupport(new Object[0], dVar, d.f15824a, false, 10264, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar, d.f15824a, false, 10264, new Class[0], Void.TYPE);
            } else if (dVar.f15828e != 1) {
                dVar.f15829f = true;
                dVar.c();
            }
        }
        super.onDismiss(dialogInterface);
    }

    public void onClick(View view) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f11517a, false, 5766, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11517a, false, 5766, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(o, this, this, view));
        if (view instanceof HSImageView) {
            if (view.getTag() != null) {
                i2 = ((Integer) view.getTag()).intValue();
            } else {
                i2 = -1;
            }
            if (this.m != null && !this.m.isEmpty() && i2 >= 0 && i2 < this.m.size()) {
                aj ajVar = this.m.get(i2);
                if (PatchProxy.isSupport(new Object[]{ajVar}, this, f11517a, false, 5754, new Class[]{aj.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{ajVar}, this, f11517a, false, 5754, new Class[]{aj.class}, Void.TYPE);
                } else if (ajVar != null && !TextUtils.isEmpty(ajVar.f11098a)) {
                    j.q().f().a(getContext(), c.b(ajVar.f11098a));
                    if (ajVar.f11098a.contains("health_score")) {
                        com.bytedance.android.livesdk.j.a.a().a("livesdk_know_health_score_page_show", new com.bytedance.android.livesdk.j.c.j().e("shield"));
                    }
                }
            }
        }
    }

    public final void a(List<aj> list) {
        byte b2;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        List<aj> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f11517a, false, 5762, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f11517a, false, 5762, new Class[]{List.class}, Void.TYPE);
        } else if (list2 != null && !list.isEmpty()) {
            this.l.setVisibility(0);
            this.m = list2;
            if (this.l.getChildCount() == this.m.size()) {
                b2 = 1;
            } else {
                b2 = 0;
            }
            if (b2 == 0) {
                this.l.removeAllViews();
            }
            for (int i4 = 0; i4 < list.size(); i4++) {
                aj ajVar = list2.get(i4);
                if (ajVar != null && !TextUtils.isEmpty(ajVar.f11099b)) {
                    String str = ajVar.f11099b;
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(b2), Integer.valueOf(i4), str}, this, f11517a, false, 5763, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(b2), Integer.valueOf(i4), str}, this, f11517a, false, 5763, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                    } else if (b2 == 0) {
                        HSImageView hSImageView = new HSImageView(this.f11522f);
                        hSImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        hSImageView.setHierarchy(new GenericDraweeHierarchyBuilder(ac.a()).setRoundingParams(RoundingParams.fromCornersRadius((float) ac.a(4.0f))).build());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        layoutParams.weight = 1.0f;
                        if (i4 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i4 == this.m.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z) {
                            i2 = 0;
                        } else {
                            i2 = ac.a(4.25f);
                        }
                        if (z2) {
                            i3 = 0;
                        } else {
                            i3 = ac.a(4.25f);
                        }
                        layoutParams.setMargins(i2, 0, i3, 0);
                        hSImageView.setLayoutParams(layoutParams);
                        hSImageView.setOnClickListener(this);
                        hSImageView.setTag(Integer.valueOf(i4));
                        com.bytedance.android.livesdk.chatroom.f.b.a(hSImageView, str);
                        this.l.addView(hSImageView);
                    } else {
                        HSImageView hSImageView2 = (HSImageView) this.l.getChildAt(i4);
                        if (hSImageView2 != null) {
                            com.bytedance.android.livesdk.chatroom.f.b.a(hSImageView2, str);
                        }
                    }
                }
            }
        }
    }

    public static IllegalReviewDialog a(Context context, d dVar) {
        Context context2 = context;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{context2, dVar2}, null, f11517a, true, 5749, new Class[]{Context.class, d.class}, IllegalReviewDialog.class)) {
            return (IllegalReviewDialog) PatchProxy.accessDispatch(new Object[]{context2, dVar2}, null, f11517a, true, 5749, new Class[]{Context.class, d.class}, IllegalReviewDialog.class);
        }
        IllegalReviewDialog illegalReviewDialog = new IllegalReviewDialog();
        illegalReviewDialog.f11522f = context2;
        illegalReviewDialog.n = dVar2;
        return illegalReviewDialog;
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f11517a, false, 5751, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f11517a, false, 5751, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.n != null) {
            d dVar = this.n;
            if (PatchProxy.isSupport(new Object[0], dVar, d.f15824a, false, 10258, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar, d.f15824a, false, 10258, new Class[0], Void.TYPE);
                return;
            }
            dVar.f15827d.removeMessages(2);
            dVar.f15828e = 3;
            h.a().c(dVar.f15827d, dVar.f15826c);
        }
    }

    public final void a(boolean z, CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), charSequence}, this, f11517a, false, 5759, new Class[]{Boolean.TYPE, CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), charSequence}, this, f11517a, false, 5759, new Class[]{Boolean.TYPE, CharSequence.class}, Void.TYPE);
        } else if (z) {
            this.k.setVisibility(0);
            this.k.setText(charSequence);
        } else {
            this.k.setVisibility(8);
        }
    }

    private Spannable a(String str, int i2, int i3) {
        String str2 = str;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{str2, 4, Integer.valueOf(i3)}, this, f11517a, false, 5764, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[]{str2, 4, Integer.valueOf(i3)}, this, f11517a, false, 5764, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Spannable.class);
        }
        SpannableString spannableString = new SpannableString(str2);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) ac.b(25.0f));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ac.b((int) C0906R.color.sg));
        spannableString.setSpan(absoluteSizeSpan, 4, i4, 18);
        spannableString.setSpan(foregroundColorSpan, 4, i4, 18);
        return spannableString;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f11517a, false, 5750, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f11517a, false, 5750, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.g = layoutInflater.inflate(C0906R.layout.agf, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[0], this, f11517a, false, 5753, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11517a, false, 5753, new Class[0], Void.TYPE);
        } else {
            this.f11518b = (RelativeLayout) this.g.findViewById(C0906R.id.z1);
            this.f11519c = (TextView) this.g.findViewById(C0906R.id.anq);
            this.f11520d = (TextView) this.g.findViewById(C0906R.id.ann);
            this.h = (ProgressBar) this.g.findViewById(C0906R.id.anm);
            this.i = (TextView) this.g.findViewById(C0906R.id.dwh);
            this.j = (TextView) this.g.findViewById(C0906R.id.dwi);
            this.k = (TextView) this.g.findViewById(C0906R.id.rb);
            this.l = (LinearLayout) this.g.findViewById(C0906R.id.mf);
            this.f11521e = (LoadingStatusView) this.g.findViewById(C0906R.id.bix);
            this.f11521e.setBuilder(LoadingStatusView.a.a(getContext()).a(getResources().getDimensionPixelSize(C0906R.dimen.ms)));
            this.f11521e.setVisibility(0);
            this.f11521e.b();
            this.f11521e.setVisibility(0);
            this.f11521e.b();
        }
        return this.g;
    }

    public final void a(boolean z, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11517a, false, 5758, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11517a, false, 5758, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (z) {
            this.i.setVisibility(0);
            this.i.setText(a(ac.a((int) C0906R.string.dbx, Integer.valueOf(i2)), 4, String.valueOf(i2).length() + 4));
            this.j.setVisibility(0);
            this.j.setText(a(ac.a((int) C0906R.string.dby, Integer.valueOf(i3)), 4, String.valueOf(i3).length() + 4));
        } else {
            this.i.setVisibility(4);
            this.j.setVisibility(4);
        }
    }
}
