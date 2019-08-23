package com.bytedance.android.livesdk.chatroom.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.PointF;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.d.d;
import com.bytedance.android.livesdk.chatroom.d.e;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.io.File;
import java.io.IOException;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;
import org.json.JSONException;
import org.json.JSONObject;

public class q extends Dialog implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, SurfaceHolder.Callback, View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13538a;

    /* renamed from: e  reason: collision with root package name */
    private static final String f13539e = q.class.getSimpleName();
    private static final /* synthetic */ a.C0900a y;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13540b;

    /* renamed from: c  reason: collision with root package name */
    public int f13541c;

    /* renamed from: d  reason: collision with root package name */
    public CompositeDisposable f13542d = new CompositeDisposable();

    /* renamed from: f  reason: collision with root package name */
    private final Activity f13543f;
    private boolean g;
    private HSImageView h;
    private SurfaceView i;
    private View j;
    private View k;
    private boolean l;
    private int m;
    private String n;
    private MediaPlayer o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private WeakHandler t;
    private m u;
    private String v;
    private String w;
    private Room x;

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f13538a, true, 7933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f13538a, true, 7933, new Class[0], Void.TYPE);
        } else {
            b bVar = new b("LiveRecordShareDialog.java", q.class);
            y = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.widget.LiveRecordShareDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 189);
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13538a, false, 7920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13538a, false, 7920, new Class[0], Void.TYPE);
        } else if (!this.p && !this.r) {
            if (this.q) {
                ai.a((int) C0906R.string.dao);
                return;
            }
            this.p = true;
            a(true);
            new e(this.t, 0).execute(new String[]{this.n});
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13538a, false, 7922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13538a, false, 7922, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.g = true;
        if (this.m == 0) {
            this.h.setImageURI(Uri.fromFile(new File(this.n)));
        } else {
            this.i.getHolder().addCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13538a, false, 7923, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13538a, false, 7923, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.t.removeCallbacksAndMessages(null);
        this.g = false;
        if (this.u != null && this.u.isShowing()) {
            this.u.dismiss();
        }
        if (1 == this.m && this.o != null) {
            this.o.stop();
            this.o.release();
        }
        if (this.f13540b) {
            h a2 = h.a();
            long id = this.x.getId();
            int i2 = this.f13541c;
            String labels = this.x.getLabels();
            if (PatchProxy.isSupport(new Object[]{null, new Long(id), Integer.valueOf(i2), 3, labels}, a2, h.f9797a, false, 3999, new Class[]{Handler.class, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                h hVar = a2;
                PatchProxy.accessDispatch(new Object[]{null, new Long(id), Integer.valueOf(i2), 3, labels}, hVar, h.f9797a, false, 3999, new Class[]{Handler.class, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            } else if (!com.bytedance.android.live.uikit.a.a.f()) {
                ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).sendShare(id, new o().a("target_id", String.valueOf(i2)).a("share_type", "3").a("common_label_list", String.valueOf(labels)).f17622b).compose(i.a()).subscribe(i.c(), i.b());
            }
        }
        this.f13542d.clear();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, f13538a, false, 7925, new Class[]{MediaPlayer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, f13538a, false, 7925, new Class[]{MediaPlayer.class}, Void.TYPE);
        } else if (this.g) {
            mediaPlayer.start();
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, f13538a, false, 7926, new Class[]{MediaPlayer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, f13538a, false, 7926, new Class[]{MediaPlayer.class}, Void.TYPE);
        } else if (this.g) {
            mediaPlayer.start();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f13538a, false, 7928, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f13538a, false, 7928, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        if (this.o != null) {
            this.o.stop();
        }
    }

    private View a(int i2) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13538a, false, 7929, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13538a, false, 7929, new Class[]{Integer.TYPE}, View.class);
        }
        View inflate = getLayoutInflater().inflate(C0906R.layout.ant, null);
        inflate.setTag(Integer.valueOf(i2));
        inflate.setOnClickListener(this);
        ImageView imageView = (ImageView) inflate.findViewById(C0906R.id.ar6);
        TextView textView = (TextView) inflate.findViewById(C0906R.id.text);
        switch (i2) {
            case 1:
                i4 = 2130841463;
                i3 = C0906R.string.dax;
                break;
            case 2:
                i4 = 2130841462;
                i3 = C0906R.string.das;
                break;
            case 3:
                i4 = 2130841459;
                i3 = C0906R.string.dau;
                break;
            case 4:
                i4 = 2130841461;
                i3 = C0906R.string.dls;
                break;
            case 5:
                i4 = 2130841460;
                i3 = C0906R.string.dav;
                break;
            case 6:
                i4 = 2130841252;
                i3 = C0906R.string.daw;
                break;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                i4 = 2130841251;
                i3 = C0906R.string.dat;
                break;
            default:
                i4 = -1;
                i3 = -1;
                break;
        }
        if (i4 != -1) {
            imageView.setImageResource(i4);
        }
        if (i3 != -1) {
            textView.setText(i3);
        }
        return inflate;
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f13538a, false, 7918, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f13538a, false, 7918, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 == 2) {
                if (message.obj instanceof String) {
                    this.w = (String) message.obj;
                    return;
                }
                ai.a((int) C0906R.string.dag);
            }
            return;
        }
        this.p = false;
        a(false);
        if (message.obj instanceof File) {
            this.n = ((File) message.obj).getAbsolutePath();
            getContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile((File) message.obj)));
            ai.a((int) C0906R.string.dao);
            this.q = true;
            return;
        }
        ai.a((int) C0906R.string.dan);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13538a, false, 7917, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13538a, false, 7917, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(y, this, this, view));
        if (C0906R.id.ti == view.getId()) {
            dismiss();
        } else if (C0906R.id.er == view.getId()) {
            a();
        }
        if (view.getTag() instanceof Integer) {
            int intValue = ((Integer) view.getTag()).intValue();
            switch (intValue) {
                case 1:
                    a(intValue, "weixin", "user_weixin");
                    return;
                case 2:
                    a(intValue, "weixin_moment", "user_weixin_moment");
                    return;
                case 3:
                    a(intValue, "qq", "user_qq");
                    return;
                case 4:
                    if (!TTLiveSDKContext.getHostService().g().a(this.f13543f, "weibo")) {
                        ai.a((int) C0906R.string.dlt);
                        return;
                    } else {
                        a(intValue, "weibo", "user_weibo");
                        return;
                    }
                case 5:
                    a(intValue, "qzone", "user_qzone");
                    return;
                case 6:
                    a();
                    return;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                    if (!PatchProxy.isSupport(new Object[0], this, f13538a, false, 7921, new Class[0], Void.TYPE)) {
                        if (!this.p && !this.r) {
                            if (!this.s) {
                                if (this.o != null) {
                                    int duration = this.o.getDuration();
                                    if (duration <= 0 || duration > 15000) {
                                        ai.a((int) C0906R.string.dak);
                                        break;
                                    }
                                }
                            } else {
                                ai.a((int) C0906R.string.dal);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        PatchProxy.accessDispatch(new Object[0], this, f13538a, false, 7921, new Class[0], Void.TYPE);
                        return;
                    }
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13538a, false, 7914, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13538a, false, 7914, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        View findViewById = findViewById(C0906R.id.ti);
        this.h = (HSImageView) findViewById(C0906R.id.ar6);
        this.i = (SurfaceView) findViewById(C0906R.id.drc);
        this.j = findViewById(C0906R.id.er);
        this.k = findViewById(C0906R.id.gb);
        ((GenericDraweeHierarchy) this.h.getHierarchy()).setActualImageFocusPoint(new PointF(0.5f, 0.0f));
        if (this.m == 0) {
            this.h.setVisibility(0);
            this.i.setVisibility(8);
        } else {
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            this.i.getHolder().addCallback(this);
        }
        findViewById.setOnClickListener(this);
        if (this.l) {
            if (PatchProxy.isSupport(new Object[0], this, f13538a, false, 7915, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f13538a, false, 7915, new Class[0], Void.TYPE);
            } else {
                this.k.setVisibility(8);
                this.j.setVisibility(0);
                this.j.setOnClickListener(this);
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f13538a, false, 7916, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f13538a, false, 7916, new Class[0], Void.TYPE);
            } else if (1 == this.m) {
                this.j.setVisibility(0);
                this.k.setVisibility(8);
                this.j.setOnClickListener(this);
            } else {
                this.k.setVisibility(0);
                this.j.setVisibility(8);
                LinearLayout linearLayout = (LinearLayout) findViewById(C0906R.id.aa);
                if (d.a(getContext(), "com.tencent.mm")) {
                    linearLayout.addView(a(1));
                    linearLayout.addView(a(2));
                }
                if (d.a(getContext(), "com.tencent.mobileqq")) {
                    linearLayout.addView(a(3));
                }
                linearLayout.addView(a(4));
            }
        }
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f13538a, false, 7932, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f13538a, false, 7932, new Class[]{String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", this.x.getRequestId());
            jSONObject.put("log_pb", this.x.getLog_pb());
            jSONObject.put("source", this.x.getUserFrom());
            f.a(getContext()).a("share_cut", str, this.x.getId(), this.x.getId(), jSONObject);
        } catch (JSONException unused) {
        }
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13538a, false, 7930, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13538a, false, 7930, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z) {
            if (this.u != null && this.u.isShowing()) {
                this.u.dismiss();
            }
        } else if (this.u == null) {
            this.u = new m.a(getContext(), 2).a(false).c();
        } else {
            if (!this.u.isShowing()) {
                this.u.show();
            }
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13538a, false, 7924, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13538a, false, 7924, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        mediaPlayer.release();
        this.o = null;
        ai.a((int) C0906R.string.db3);
        return false;
    }

    private void a(final int i2, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str3, str4}, this, f13538a, false, 7919, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str3, str4}, this, f13538a, false, 7919, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
        } else if (this.m == 0) {
            TTLiveSDKContext.getHostService().g().a(this.f13543f, com.bytedance.android.livesdkapi.depend.h.b.a().f(str3).d(this.n).a()).observeOn(AndroidSchedulers.mainThread()).subscribe((SingleObserver<? super T>) new SingleObserver<Object>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13544a;

                public final void onSuccess(Object obj) {
                }

                public final void onError(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f13544a, false, 7935, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f13544a, false, 7935, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    ai.a((int) C0906R.string.dar);
                }

                public final void onSubscribe(Disposable disposable) {
                    Disposable disposable2 = disposable;
                    if (PatchProxy.isSupport(new Object[]{disposable2}, this, f13544a, false, 7934, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable2}, this, f13544a, false, 7934, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    q.this.f13542d.add(disposable2);
                }
            });
            a(str4);
        } else if (TextUtils.isEmpty(this.w)) {
            new com.bytedance.android.livesdk.chatroom.d.a(this.t, 2).execute(new String[]{this.n});
        } else if (!TextUtils.isEmpty(this.v)) {
            int i3 = i2;
            TTLiveSDKContext.getHostService().g().a(this.f13543f, com.bytedance.android.livesdkapi.depend.h.b.a().f(str3).d(this.w).a()).observeOn(AndroidSchedulers.mainThread()).subscribe((SingleObserver<? super T>) new SingleObserver<Object>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13546a;

                public final void onSuccess(Object obj) {
                    q.this.f13540b = true;
                    q.this.f13541c = i2;
                }

                public final void onError(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f13546a, false, 7937, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f13546a, false, 7937, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    ai.a((int) C0906R.string.dar);
                }

                public final void onSubscribe(Disposable disposable) {
                    Disposable disposable2 = disposable;
                    if (PatchProxy.isSupport(new Object[]{disposable2}, this, f13546a, false, 7936, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable2}, this, f13546a, false, 7936, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    q.this.f13542d.add(disposable2);
                }
            });
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f13538a, false, 7927, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f13538a, false, 7927, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.m == 1) {
            if (this.o != null) {
                this.o.reset();
            } else {
                this.o = new MediaPlayer();
            }
            this.o.setSurface(surfaceHolder.getSurface());
            try {
                this.o.setOnCompletionListener(this);
                this.o.setOnPreparedListener(this);
                this.o.setOnErrorListener(this);
                this.o.setDataSource(this.n);
                this.o.setVolume(0.0f, 0.0f);
                this.o.prepareAsync();
            } catch (IOException unused) {
                this.o = null;
                ai.a((int) C0906R.string.db3);
            }
        }
    }

    public q(Activity activity, Room room, boolean z, int i2, String str) {
        super(activity, C0906R.style.w5);
        setContentView(LayoutInflater.from(activity).inflate(C0906R.layout.agw, null), new ViewGroup.LayoutParams((int) UIUtils.dip2Px(activity, 306.0f), (int) UIUtils.dip2Px(activity, 541.0f)));
        setCancelable(false);
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("Type is illegal");
        } else if (!TextUtils.isEmpty(str)) {
            this.x = room;
            this.l = z;
            this.m = i2;
            this.n = str;
            this.t = new WeakHandler(this);
            this.f13543f = activity;
        } else {
            throw new RuntimeException("File path is empty");
        }
    }
}
