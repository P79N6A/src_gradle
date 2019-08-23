package com.bytedance.android.livesdk.live;

import android.os.Message;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.e.x;
import com.bytedance.android.livesdk.chatroom.e.y;
import com.bytedance.android.livesdk.chatroom.model.WaitingReviewInfo;
import com.bytedance.android.livesdk.chatroom.ui.IllegalReviewDialog;
import com.bytedance.android.livesdk.message.model.ax;
import com.bytedance.android.livesdk.utils.n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class d extends b<a> implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15824a;

    /* renamed from: b  reason: collision with root package name */
    String f15825b;

    /* renamed from: c  reason: collision with root package name */
    public long f15826c;

    /* renamed from: d  reason: collision with root package name */
    public WeakHandler f15827d;

    /* renamed from: e  reason: collision with root package name */
    public int f15828e = 1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15829f;
    public IllegalReviewDialog g;
    private int h = 10;
    private String i;
    private Disposable j;
    private int k;
    private int l;

    public interface a extends com.bytedance.ies.a.a {
        void a(CharSequence charSequence);

        void a(boolean z);

        void a(boolean z, CharSequence charSequence, CharSequence charSequence2);

        void a(boolean z, CharSequence charSequence, String str);

        void a(boolean z, String str);

        void b(CharSequence charSequence);

        void g();

        void h();

        void i();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15824a, false, 10257, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15824a, false, 10257, new Class[0], Void.TYPE);
        } else if (b() != null) {
            ((a) b()).g();
            h.a().b(this.f15827d, this.f15826c);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f15824a, false, 10263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15824a, false, 10263, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.f15827d.removeMessages(1);
        this.f15827d.removeMessages(2);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f15824a, false, 10268, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15824a, false, 10268, new Class[0], Void.TYPE);
            return;
        }
        this.f15827d.removeMessages(1);
        this.f15827d.removeMessages(2);
        this.f15828e = 1;
        if (this.j != null) {
            this.j.dispose();
            this.j = null;
        }
        if (b() != null) {
            ((a) b()).a(false);
            this.f15829f = false;
            ((a) b()).a(false, (CharSequence) null, (CharSequence) null);
        }
        if (this.g != null) {
            this.g.dismiss();
        }
    }

    public void c() {
        SpannableString spannableString;
        if (PatchProxy.isSupport(new Object[0], this, f15824a, false, 10265, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15824a, false, 10265, new Class[0], Void.TYPE);
        } else if (b() != null) {
            String a2 = ac.a((int) C0906R.string.dei);
            if (this.k <= 1) {
                spannableString = new SpannableString(ac.a((int) C0906R.string.d0k));
            } else {
                SpannableString spannableString2 = new SpannableString(n.a(Locale.CHINA, ac.a((int) C0906R.string.dbv), Integer.valueOf(this.l)));
                spannableString2.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.aes)), 4, String.valueOf(this.l).length() + 4, 18);
                spannableString = spannableString2;
            }
            ((a) b()).a(true, (CharSequence) a2, (CharSequence) spannableString);
        }
    }

    public d(long j2) {
        this.f15826c = j2;
        this.f15827d = new WeakHandler(this);
        this.f15825b = ac.a((int) C0906R.string.d0m) + "（%ds）";
    }

    private CharSequence b(ax axVar) {
        ax axVar2 = axVar;
        if (PatchProxy.isSupport(new Object[]{axVar2}, this, f15824a, false, 10259, new Class[]{ax.class}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{axVar2}, this, f15824a, false, 10259, new Class[]{ax.class}, CharSequence.class);
        }
        CharSequence a2 = y.a(axVar2.f16523e, "");
        if (!com.bytedance.android.live.uikit.a.a.d() || TextUtils.isEmpty(a2)) {
            a2 = ac.a((int) C0906R.string.d0o);
        }
        return a2;
    }

    private CharSequence c(ax axVar) {
        ax axVar2 = axVar;
        if (PatchProxy.isSupport(new Object[]{axVar2}, this, f15824a, false, 10260, new Class[]{ax.class}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{axVar2}, this, f15824a, false, 10260, new Class[]{ax.class}, CharSequence.class);
        }
        CharSequence a2 = y.a(axVar2.h, "");
        if (!com.bytedance.android.live.uikit.a.a.d() || TextUtils.isEmpty(a2)) {
            a2 = ac.a((int) C0906R.string.db4);
        }
        return a2;
    }

    private CharSequence d(ax axVar) {
        ax axVar2 = axVar;
        if (PatchProxy.isSupport(new Object[]{axVar2}, this, f15824a, false, 10261, new Class[]{ax.class}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{axVar2}, this, f15824a, false, 10261, new Class[]{ax.class}, CharSequence.class);
        }
        SpannableStringBuilder spannableStringBuilder = x.f10027b;
        Spannable a2 = y.a(axVar2.f16524f, "");
        if (!com.bytedance.android.live.uikit.a.a.d() || TextUtils.isEmpty(a2)) {
            if (axVar.supportDisplayText()) {
                spannableStringBuilder = y.a(axVar2.baseMessage.j, "");
            }
            if (spannableStringBuilder == x.f10027b && !TextUtils.isEmpty(axVar2.f16520b)) {
                spannableStringBuilder = new SpannableStringBuilder(ac.a((int) C0906R.string.dky));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.aes)), 8, spannableStringBuilder.length(), 33);
                spannableStringBuilder.insert(0, ac.a((int) C0906R.string.ddw) + axVar2.f16520b + "\n");
            }
        } else {
            spannableStringBuilder = new SpannableStringBuilder(a2);
            Spannable a3 = y.a(axVar2.g, "");
            if (!TextUtils.isEmpty(a3)) {
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                spannableStringBuilder2.append("\n");
                spannableStringBuilder2.append(a3);
            }
        }
        return spannableStringBuilder;
    }

    public final void a(ax axVar) {
        ax axVar2 = axVar;
        if (PatchProxy.isSupport(new Object[]{axVar2}, this, f15824a, false, 10256, new Class[]{ax.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{axVar2}, this, f15824a, false, 10256, new Class[]{ax.class}, Void.TYPE);
        } else if (b() != null && axVar2 != null) {
            if (2 == axVar2.f16521c && this.f15828e == 1) {
                this.f15828e = 2;
                this.h = 10;
                this.i = axVar2.f16520b;
                ((a) b()).a(b(axVar));
                ((a) b()).b(d(axVar));
                String a2 = n.a(Locale.CHINA, this.f15825b, Integer.valueOf(this.h));
                if (com.bytedance.android.live.uikit.a.a.d()) {
                    ((a) b()).a(true, c(axVar), axVar2.i);
                } else {
                    ((a) b()).a(false, (CharSequence) null, (String) null);
                }
                ((a) b()).a(false, a2);
                ((a) b()).a(true);
                this.f15827d.sendEmptyMessageDelayed(1, 600000);
                if (this.j == null || this.j.isDisposed()) {
                    this.j = com.bytedance.android.livesdk.utils.b.b.a(0, 10, 1000, 1000, TimeUnit.MILLISECONDS).compose(i.a()).doOnComplete(new e(this)).subscribe((Consumer<? super T>) new f<Object>(this));
                }
                return;
            }
            if (3 == axVar2.f16521c && this.f15828e != 1) {
                if (b() != null) {
                    ((a) b()).h();
                }
                e();
            }
        }
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f15824a, false, 10262, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f15824a, false, 10262, new Class[]{Message.class}, Void.TYPE);
        } else if (b() != null && this.f15828e != 1) {
            int i2 = message2.what;
            if (i2 == 25) {
                Object obj = message2.obj;
                if (PatchProxy.isSupport(new Object[]{obj}, this, f15824a, false, 10266, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{obj}, this, f15824a, false, 10266, new Class[]{Object.class}, Void.TYPE);
                } else {
                    if ((obj instanceof com.bytedance.android.live.a.a.a) && b() != null) {
                        e();
                    }
                }
            } else if (i2 != 34) {
                switch (i2) {
                    case 1:
                        ((a) b()).i();
                        return;
                    case 2:
                        h.a().c(this.f15827d, this.f15826c);
                        return;
                }
            } else {
                if (message2.obj instanceof WaitingReviewInfo) {
                    WaitingReviewInfo waitingReviewInfo = (WaitingReviewInfo) message2.obj;
                    if (PatchProxy.isSupport(new Object[]{waitingReviewInfo}, this, f15824a, false, 10267, new Class[]{WaitingReviewInfo.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{waitingReviewInfo}, this, f15824a, false, 10267, new Class[]{WaitingReviewInfo.class}, Void.TYPE);
                    } else {
                        this.k = Math.abs(waitingReviewInfo.getWaitingCount());
                        this.l = Math.abs(waitingReviewInfo.getWaitingTime()) / 60;
                        if (this.l <= 0) {
                            this.l++;
                        }
                        if (this.f15829f) {
                            c();
                        }
                        if (!this.f15829f && this.g.isViewValid()) {
                            IllegalReviewDialog illegalReviewDialog = this.g;
                            if (PatchProxy.isSupport(new Object[]{(byte) 0}, illegalReviewDialog, IllegalReviewDialog.f11517a, false, 5760, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{(byte) 0}, illegalReviewDialog, IllegalReviewDialog.f11517a, false, 5760, new Class[]{Boolean.TYPE}, Void.TYPE);
                            } else {
                                illegalReviewDialog.f11521e.setVisibility(8);
                            }
                            IllegalReviewDialog illegalReviewDialog2 = this.g;
                            if (PatchProxy.isSupport(new Object[]{(byte) 1}, illegalReviewDialog2, IllegalReviewDialog.f11517a, false, 5761, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{(byte) 1}, illegalReviewDialog2, IllegalReviewDialog.f11517a, false, 5761, new Class[]{Boolean.TYPE}, Void.TYPE);
                            } else {
                                illegalReviewDialog2.f11518b.setVisibility(0);
                            }
                            IllegalReviewDialog illegalReviewDialog3 = this.g;
                            String a2 = ac.a((int) C0906R.string.dej);
                            if (PatchProxy.isSupport(new Object[]{a2}, illegalReviewDialog3, IllegalReviewDialog.f11517a, false, 5755, new Class[]{CharSequence.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{a2}, illegalReviewDialog3, IllegalReviewDialog.f11517a, false, 5755, new Class[]{CharSequence.class}, Void.TYPE);
                            } else {
                                illegalReviewDialog3.f11519c.setText(a2);
                            }
                            IllegalReviewDialog illegalReviewDialog4 = this.g;
                            String a3 = ac.a((int) C0906R.string.ddx);
                            if (PatchProxy.isSupport(new Object[]{a3}, illegalReviewDialog4, IllegalReviewDialog.f11517a, false, 5756, new Class[]{CharSequence.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{a3}, illegalReviewDialog4, IllegalReviewDialog.f11517a, false, 5756, new Class[]{CharSequence.class}, Void.TYPE);
                            } else {
                                illegalReviewDialog4.f11520d.setText(a3);
                            }
                            if (this.k <= 5) {
                                this.f15828e = 5;
                                this.g.a(false, this.k, this.l);
                                this.g.a(true, (CharSequence) ac.a((int) C0906R.string.d0l));
                            } else {
                                this.f15828e = 4;
                                this.g.a(true, this.k, this.l);
                                this.g.a(false, (CharSequence) null);
                            }
                            List waitingReviewRules = waitingReviewInfo.getWaitingReviewRules();
                            if (waitingReviewRules != null && !waitingReviewRules.isEmpty()) {
                                this.g.a(waitingReviewRules);
                            }
                        }
                    }
                }
                this.f15827d.sendEmptyMessageDelayed(2, 10000);
            }
        }
    }
}
