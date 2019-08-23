package com.ss.android.ugc.aweme.newfollow.util;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.annotation.Nonnull;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57419a;

    private static int a(@Nonnull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f57419a, true, 61907, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f57419a, true, 61907, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 3;
        return scaledTouchSlop * scaledTouchSlop;
    }

    private static int b(@Nonnull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f57419a, true, 61908, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f57419a, true, 61908, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        int scaledDoubleTapSlop = ViewConfiguration.get(context).getScaledDoubleTapSlop();
        return scaledDoubleTapSlop * scaledDoubleTapSlop;
    }

    public static boolean a(int i, MotionEvent motionEvent, MotionEvent motionEvent2, @Nonnull Context context) {
        if (PatchProxy.isSupport(new Object[]{0, motionEvent, motionEvent2, context}, null, f57419a, true, 61910, new Class[]{Integer.TYPE, MotionEvent.class, MotionEvent.class, Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{0, motionEvent, motionEvent2, context}, null, f57419a, true, 61910, new Class[]{Integer.TYPE, MotionEvent.class, MotionEvent.class, Context.class}, Boolean.TYPE)).booleanValue();
        } else if (motionEvent == null || motionEvent2 == null) {
            return false;
        } else {
            int x = (int) (motionEvent2.getX() - motionEvent.getX());
            int y = (int) (motionEvent2.getY() - motionEvent.getY());
            int i2 = (x * x) + (y * y);
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 3;
            if (i2 > a(context) || Math.abs(x) >= scaledTouchSlop) {
                return true;
            }
            return false;
        }
    }

    public static boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3, @Nonnull Context context) {
        if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, motionEvent3, context}, null, f57419a, true, 61909, new Class[]{MotionEvent.class, MotionEvent.class, MotionEvent.class, Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, motionEvent3, context}, null, f57419a, true, 61909, new Class[]{MotionEvent.class, MotionEvent.class, MotionEvent.class, Context.class}, Boolean.TYPE)).booleanValue();
        }
        int b2 = b(context);
        if (motionEvent == null || motionEvent2 == null || motionEvent3 == null) {
            return false;
        }
        long eventTime = motionEvent3.getEventTime() - motionEvent2.getEventTime();
        if (eventTime > ((long) ViewConfiguration.getDoubleTapTimeout()) || eventTime < 40) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
        int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
        if ((x * x) + (y * y) < b2) {
            return true;
        }
        return false;
    }
}
