package f.a.a.a.a;

import android.content.Context;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    protected e f83092a;

    /* renamed from: b  reason: collision with root package name */
    float f83093b;

    /* renamed from: c  reason: collision with root package name */
    float f83094c;

    /* renamed from: d  reason: collision with root package name */
    final float f83095d;

    /* renamed from: e  reason: collision with root package name */
    final float f83096e;

    /* renamed from: f  reason: collision with root package name */
    private VelocityTracker f83097f;
    private boolean g;

    public boolean a() {
        return false;
    }

    public final void a(e eVar) {
        this.f83092a = eVar;
    }

    /* access modifiers changed from: package-private */
    public float a(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    /* access modifiers changed from: package-private */
    public float b(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    public a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f83096e = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f83095d = (float) viewConfiguration.getScaledTouchSlop();
    }

    public boolean c(MotionEvent motionEvent) {
        boolean z = false;
        switch (motionEvent.getAction()) {
            case 0:
                this.f83097f = VelocityTracker.obtain();
                if (this.f83097f != null) {
                    this.f83097f.addMovement(motionEvent);
                }
                this.f83093b = a(motionEvent);
                this.f83094c = b(motionEvent);
                this.g = false;
                break;
            case 1:
                if (this.g && this.f83097f != null) {
                    this.f83093b = a(motionEvent);
                    this.f83094c = b(motionEvent);
                    this.f83097f.addMovement(motionEvent);
                    this.f83097f.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    float xVelocity = this.f83097f.getXVelocity();
                    float yVelocity = this.f83097f.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f83096e) {
                        this.f83092a.a(this.f83093b, this.f83094c, -xVelocity, -yVelocity);
                    }
                }
                if (this.f83097f != null) {
                    this.f83097f.recycle();
                    this.f83097f = null;
                    break;
                }
                break;
            case 2:
                float a2 = a(motionEvent);
                float b2 = b(motionEvent);
                float f2 = a2 - this.f83093b;
                float f3 = b2 - this.f83094c;
                if (!this.g) {
                    if (FloatMath.sqrt((f2 * f2) + (f3 * f3)) >= this.f83095d) {
                        z = true;
                    }
                    this.g = z;
                }
                if (this.g) {
                    this.f83092a.a(f2, f3);
                    this.f83093b = a2;
                    this.f83094c = b2;
                    if (this.f83097f != null) {
                        this.f83097f.addMovement(motionEvent);
                        break;
                    }
                }
                break;
            case 3:
                if (this.f83097f != null) {
                    this.f83097f.recycle();
                    this.f83097f = null;
                    break;
                }
                break;
        }
        return true;
    }
}
