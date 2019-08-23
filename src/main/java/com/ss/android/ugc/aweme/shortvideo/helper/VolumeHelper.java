package com.ss.android.ugc.aweme.shortvideo.helper;

import android.support.annotation.FloatRange;
import android.support.annotation.StringRes;
import android.view.View;
import android.view.ViewStub;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.base.n;
import org.json.JSONException;
import org.json.JSONObject;

public class VolumeHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68102a;

    /* renamed from: b  reason: collision with root package name */
    public int f68103b;

    /* renamed from: c  reason: collision with root package name */
    public int f68104c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f68105d;

    /* renamed from: e  reason: collision with root package name */
    public a f68106e;

    /* renamed from: f  reason: collision with root package name */
    public b f68107f;
    public e g;
    private com.ss.android.ugc.aweme.base.activity.a h;
    @BindView(2131493413)
    View mChangeLayout;
    @BindView(2131493651)
    SeekBar mMusicSeekBar;
    @BindView(2131493862)
    TextView mMusicTv;
    @BindView(2131493861)
    TextView mPeopleVoiceTv;
    @BindView(2131493650)
    SeekBar mVoiceSeekBar;

    public interface a {
        void a(@FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3);
    }

    public interface b {
        void a();
    }

    public VolumeHelper() {
        this.f68103b = 50;
        this.f68104c = 50;
        this.h = new f(this);
        this.f68105d = false;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f68102a, false, 77496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68102a, false, 77496, new Class[0], Void.TYPE);
        } else if (this.f68105d) {
            this.mMusicSeekBar.setProgress(this.f68103b);
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f68102a, false, 77497, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68102a, false, 77497, new Class[0], Void.TYPE);
        } else if (this.f68105d) {
            this.mVoiceSeekBar.setProgress(this.f68104c);
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68102a, false, 77492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68102a, false, 77492, new Class[0], Void.TYPE);
            return;
        }
        this.mChangeLayout.setAlpha(0.0f);
        this.mChangeLayout.setVisibility(0);
        this.mChangeLayout.animate().alpha(1.0f).setDuration(200).start();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68102a, false, 77493, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68102a, false, 77493, new Class[0], Void.TYPE);
            return;
        }
        this.mChangeLayout.setAlpha(1.0f);
        this.mChangeLayout.animate().alpha(1.0f).setDuration(200).start();
        this.mChangeLayout.setVisibility(4);
    }

    @OnClick({2131493310})
    @Optional
    public void onVolumeChange() {
        if (PatchProxy.isSupport(new Object[0], this, f68102a, false, 77498, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68102a, false, 77498, new Class[0], Void.TYPE);
            return;
        }
        if (this.f68107f != null) {
            this.f68107f.a();
        }
        try {
            n.b("aweme_short_video_volume_set", (String) null, new JSONObject().put("mVoiceVolume", this.f68104c).put("mMusicVolume", this.f68103b));
        } catch (JSONException unused) {
        }
    }

    public final VolumeHelper a(a aVar) {
        this.f68106e = aVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean c(int i) {
        if (i != 4 || !this.f68105d || this.f68107f == null) {
            return false;
        }
        this.f68107f.a();
        return true;
    }

    public VolumeHelper(boolean z) {
        int i = 50;
        this.f68103b = 50;
        this.f68104c = 50;
        this.h = new g(this);
        this.f68105d = false;
        this.f68104c = z ? 0 : i;
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68102a, false, 77491, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68102a, false, 77491, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f68105d) {
            if (z) {
                a();
                this.g.a(this.h);
                return;
            }
            b();
            this.g.b(this.h);
        }
    }

    public View a(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, f68102a, false, 77486, new Class[]{View.class}, View.class)) {
            return ((ViewStub) view2.findViewById(C0906R.id.cwf)).inflate();
        }
        return (View) PatchProxy.accessDispatch(new Object[]{view2}, this, f68102a, false, 77486, new Class[]{View.class}, View.class);
    }

    public final VolumeHelper b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68102a, false, 77495, new Class[]{Integer.TYPE}, VolumeHelper.class)) {
            return (VolumeHelper) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68102a, false, 77495, new Class[]{Integer.TYPE}, VolumeHelper.class);
        }
        this.f68104c = i;
        d();
        return this;
    }

    public final VolumeHelper a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68102a, false, 77494, new Class[]{Integer.TYPE}, VolumeHelper.class)) {
            return (VolumeHelper) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68102a, false, 77494, new Class[]{Integer.TYPE}, VolumeHelper.class);
        }
        this.f68103b = i;
        c();
        return this;
    }

    public final VolumeHelper b(boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68102a, false, 77490, new Class[]{Boolean.TYPE}, VolumeHelper.class)) {
            return (VolumeHelper) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68102a, false, 77490, new Class[]{Boolean.TYPE}, VolumeHelper.class);
        }
        if (this.f68105d) {
            this.mMusicSeekBar.setEnabled(z);
            SeekBar seekBar = this.mMusicSeekBar;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            seekBar.setAlpha(f2);
        }
        return this;
    }

    public final VolumeHelper a(boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68102a, false, 77489, new Class[]{Boolean.TYPE}, VolumeHelper.class)) {
            return (VolumeHelper) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68102a, false, 77489, new Class[]{Boolean.TYPE}, VolumeHelper.class);
        }
        if (this.f68105d) {
            this.mVoiceSeekBar.setEnabled(z);
            SeekBar seekBar = this.mVoiceSeekBar;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            seekBar.setAlpha(f2);
        }
        return this;
    }

    public final VolumeHelper a(View view, @StringRes int i, @StringRes int i2) {
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f68102a, false, 77488, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, VolumeHelper.class)) {
            return (VolumeHelper) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f68102a, false, 77488, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, VolumeHelper.class);
        } else if (this.f68105d) {
            return this;
        } else {
            this.mChangeLayout = a(view);
            ButterKnife.bind((Object) this, this.mChangeLayout);
            this.mMusicSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68108a;

                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f68108a, false, 77502, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z)}, this, f68108a, false, 77502, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    float f2 = (((float) VolumeHelper.this.f68104c) * 1.0f) / 100.0f;
                    float f3 = (((float) i2) * 1.0f) / 100.0f;
                    if (VolumeHelper.this.f68106e != null) {
                        VolumeHelper.this.f68106e.a(f2, f3);
                    }
                    VolumeHelper.this.f68103b = i2;
                }
            });
            this.mVoiceSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68110a;

                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f68110a, false, 77503, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z)}, this, f68110a, false, 77503, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    float f2 = (((float) i2) * 1.0f) / 100.0f;
                    float f3 = (((float) VolumeHelper.this.f68103b) * 1.0f) / 100.0f;
                    if (VolumeHelper.this.f68106e != null) {
                        VolumeHelper.this.f68106e.a(f2, f3);
                    }
                    VolumeHelper.this.f68104c = i2;
                }
            });
            if (i3 > 0) {
                this.mMusicTv.setText(i3);
            }
            if (i4 > 0) {
                this.mPeopleVoiceTv.setText(i4);
            }
            this.f68105d = true;
            return this;
        }
    }
}
