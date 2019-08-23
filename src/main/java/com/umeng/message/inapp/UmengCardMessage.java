package com.umeng.message.inapp;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.umeng.message.common.c;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.h;
import com.umeng.message.proguard.j;
import com.umeng.message.view.UCloseView;
import org.json.JSONObject;

public final class UmengCardMessage extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81199a = "com.umeng.message.inapp.UmengCardMessage";
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Activity f81200b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public UInAppMessage f81201c;

    /* renamed from: d  reason: collision with root package name */
    private String f81202d;

    /* renamed from: e  reason: collision with root package name */
    private Bitmap f81203e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f81204f;
    private int g;
    private int h;
    private int i;
    private int j;
    /* access modifiers changed from: private */
    public UInAppHandler k;
    private IUmengInAppMsgCloseCallback l;
    private boolean m;
    /* access modifiers changed from: private */
    public boolean n;
    /* access modifiers changed from: private */
    public boolean o;
    /* access modifiers changed from: private */
    public boolean p;
    private String[] q = {"18", "16", "16"};

    private int a(boolean z) {
        return z ? 1 : 0;
    }

    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public final void onDestroy() {
        super.onDestroy();
        d.a((Context) this.f81200b).a(this.f81201c.msg_id, this.f81201c.msg_type, 0, a(this.n), 0, 0, a(this.p), 0, a(this.o));
        this.p = false;
        this.n = false;
        this.o = false;
        this.m = false;
        if (this.l != null) {
            this.l.onClose();
        }
    }

    public final void onStart() {
        super.onStart();
        if (!this.m) {
            d.a((Context) this.f81200b).a(this.f81201c.msg_id, this.f81201c.msg_type, 1, 0, 0, 0, 0, 0, 0);
        }
        this.m = true;
    }

    private View a() {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(this.f81200b);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(Color.parseColor("#33000000"));
        if (getResources().getConfiguration().orientation == 1) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        } else if (this.f81201c.msg_type == 2) {
            layoutParams = new RelativeLayout.LayoutParams(this.g, this.h);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        }
        int a2 = j.a(this.f81200b, 30.0f);
        int a3 = j.a(this.f81200b, 15.0f);
        layoutParams.setMargins(a2, a3, a2, a3);
        layoutParams.addRule(13);
        this.f81204f = new FrameLayout(this.f81200b);
        this.f81204f.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        int a4 = j.a(this.f81200b, 12.0f);
        layoutParams2.setMargins(a4, a4, a4, a4);
        ImageView imageView = new ImageView(this.f81200b);
        imageView.setLayoutParams(layoutParams2);
        imageView.setAdjustViewBounds(true);
        imageView.setId(h.c());
        imageView.setImageBitmap(this.f81203e);
        this.f81204f.addView(imageView);
        int a5 = j.a(this.f81200b, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a5, a5, 5);
        UCloseView uCloseView = new UCloseView(this.f81200b);
        uCloseView.setLayoutParams(layoutParams3);
        this.f81204f.addView(uCloseView);
        relativeLayout.addView(this.f81204f);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean unused = UmengCardMessage.this.n = true;
                if (!TextUtils.equals("none", UmengCardMessage.this.f81201c.action_type)) {
                    UmengCardMessage.this.k.handleInAppMessage(UmengCardMessage.this.f81200b, UmengCardMessage.this.f81201c, 16);
                    UmengCardMessage.this.dismiss();
                }
            }
        });
        uCloseView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean unused = UmengCardMessage.this.p = true;
                UmengCardMessage.this.dismiss();
            }
        });
        return relativeLayout;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.requestWindowFeature(1);
        return onCreateDialog;
    }

    /* access modifiers changed from: package-private */
    public final void a(IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback) {
        this.l = iUmengInAppMsgCloseCallback;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        RelativeLayout.LayoutParams layoutParams;
        super.onConfigurationChanged(configuration);
        if (this.f81204f != null) {
            if (configuration.orientation == 1) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            }
            int a2 = j.a(this.f81200b, 30.0f);
            int a3 = j.a(this.f81200b, 15.0f);
            layoutParams.setMargins(a2, a3, a2, a3);
            layoutParams.addRule(13);
            this.f81204f.setLayoutParams(layoutParams);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 16973830);
        setRetainInstance(true);
        try {
            this.f81200b = getActivity();
            Bundle arguments = getArguments();
            this.f81201c = new UInAppMessage(new JSONObject(arguments.getString("msg")));
            this.f81202d = arguments.getString("label");
            byte[] byteArray = arguments.getByteArray("bitmapByte");
            if (byteArray != null) {
                this.f81203e = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
            this.k = InAppMessageManager.getInstance(this.f81200b).getInAppHandler();
        } catch (Exception unused) {
        }
        if (this.f81201c.msg_type == 5 || this.f81201c.msg_type == 6) {
            String[] b2 = InAppMessageManager.getInstance(this.f81200b).b();
            if (b2 != null) {
                this.q = b2;
            }
        }
    }

    private View a(Rect rect) {
        RelativeLayout relativeLayout = new RelativeLayout(this.f81200b);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(Color.parseColor("#33000000"));
        if (getResources().getConfiguration().orientation == 1) {
            this.i = rect.width() - j.a(this.f81200b, 70.0f);
            if (this.f81201c.msg_type == 5) {
                this.j = (this.i / 6) * 5;
            } else {
                this.j = (this.i / 2) * 3;
            }
        } else {
            this.j = rect.height() - j.a(this.f81200b, 65.0f);
            this.i = (this.j / 5) * 6;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.i, this.j);
        layoutParams.addRule(13);
        LinearLayout linearLayout = new LinearLayout(this.f81200b);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int a2 = j.a(this.f81200b, 20.0f);
        layoutParams2.setMargins(a2, a2, a2, a2);
        TextView textView = new TextView(this.f81200b);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setText(this.f81201c.title);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        textView.setTextSize((float) Integer.parseInt(this.q[0]));
        textView.setTextColor(Color.parseColor("#000000"));
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.setMargins(a2, 0, a2, 0);
        layoutParams3.weight = 1.0f;
        ScrollView scrollView = new ScrollView(this.f81200b);
        scrollView.setLayoutParams(layoutParams3);
        scrollView.setScrollBarStyle(16777216);
        scrollView.setVerticalScrollBarEnabled(false);
        TextView textView2 = new TextView(this.f81200b);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView2.setText(this.f81201c.content);
        textView2.setTextSize((float) Integer.parseInt(this.q[1]));
        textView2.setTextColor(Color.parseColor("#000000"));
        scrollView.addView(textView2);
        linearLayout.addView(scrollView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(j.a(this.f81200b, 1.0f), Color.parseColor("#D8D8D8"));
        gradientDrawable.setCornerRadius(20.0f);
        gradientDrawable.setColor(-1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, j.a(this.f81200b, 35.0f));
        layoutParams4.setMargins(a2, j.a(this.f81200b, 30.0f), a2, a2);
        TextView textView3 = new TextView(this.f81200b);
        textView3.setLayoutParams(layoutParams4);
        textView3.setGravity(17);
        textView3.setBackgroundColor(Color.parseColor("#FFFFFF"));
        textView3.setText(this.f81201c.button_text);
        textView3.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        textView3.setTextSize((float) Integer.parseInt(this.q[2]));
        textView3.setTextColor(Color.parseColor("#000000"));
        textView3.setBackgroundDrawable(gradientDrawable);
        linearLayout.addView(textView3);
        relativeLayout.addView(linearLayout);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean unused = UmengCardMessage.this.n = true;
                UmengCardMessage.this.k.handleInAppMessage(UmengCardMessage.this.f81200b, UmengCardMessage.this.f81201c, 18);
                UmengCardMessage.this.dismiss();
            }
        });
        return relativeLayout;
    }

    private View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(c.a((Context) this.f81200b).e("umeng_custom_card_message"), viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(c.a((Context) this.f81200b).b("umeng_card_message_image"));
        imageView.setImageBitmap(this.f81203e);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean unused = UmengCardMessage.this.n = true;
                if (!TextUtils.equals("none", UmengCardMessage.this.f81201c.action_type)) {
                    UmengCardMessage.this.k.handleInAppMessage(UmengCardMessage.this.f81200b, UmengCardMessage.this.f81201c, 16);
                    UmengCardMessage.this.dismiss();
                }
            }
        });
        ((Button) inflate.findViewById(c.a((Context) this.f81200b).b("umeng_card_message_ok"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean unused = UmengCardMessage.this.o = true;
                if (!TextUtils.equals("none", UmengCardMessage.this.f81201c.action_type)) {
                    UmengCardMessage.this.k.handleInAppMessage(UmengCardMessage.this.f81200b, UmengCardMessage.this.f81201c, 19);
                    UmengCardMessage.this.dismiss();
                }
            }
        });
        ((Button) inflate.findViewById(c.a((Context) this.f81200b).b("umeng_card_message_close"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                boolean unused = UmengCardMessage.this.p = true;
                UmengCardMessage.this.dismiss();
            }
        });
        return inflate;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Rect rect;
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            this.h = rect.height() - j.a(this.f81200b, 65.0f);
            double d2 = (double) this.h;
            Double.isNaN(d2);
            this.g = (int) (d2 * 1.2d);
            this.i = rect.width() - j.a(this.f81200b, 70.0f);
            this.j = (this.i / 2) * 3;
        } else {
            rect = null;
        }
        if (this.f81201c.msg_type == 2 || this.f81201c.msg_type == 3) {
            return a();
        }
        if (this.f81201c.msg_type == 4) {
            return a(layoutInflater, viewGroup, bundle);
        }
        if ((this.f81201c.msg_type == 5 || this.f81201c.msg_type == 6) && rect != null) {
            return a(rect);
        }
        return null;
    }
}
