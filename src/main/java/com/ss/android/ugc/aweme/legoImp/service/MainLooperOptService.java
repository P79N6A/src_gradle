package com.ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Printer;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.lego.LegoService;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class MainLooperOptService implements LegoService {
    private static final Boolean LOG_OPEN = Boolean.FALSE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Class<?> activityThreadClass;
    private Class<?> choreographerClass;
    public boolean enable = true;
    public Handler frameHandler;
    private Class<?> handlerClass;
    public int launchActivityMsg = 100;
    public Handler mH;
    private Choreographer mainChoreographer = Choreographer.getInstance();
    public MessageQueue mainMessageQueue;
    private Class<?> messageClass;
    private Class<?> messageQueueClass;
    private Printer msgListener = new Printer() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53114a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f53116c;

        public final void println(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f53114a, false, 55236, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f53114a, false, 55236, new Class[]{String.class}, Void.TYPE);
            } else if (!MainLooperOptService.this.enable || com.ss.android.ugc.aweme.lego.a.g()) {
                MainLooperOptService.log("Boot Finish");
                Looper.getMainLooper().setMessageLogging(null);
                MainLooperOptService.this.reset();
            } else if (!MainLooperOptService.this.watchSuccess.get(MainLooperOptService.this.watchState).booleanValue()) {
                switch (AnonymousClass2.f53117a[MainLooperOptService.this.watchState.ordinal()]) {
                    case 1:
                        if (!this.f53116c) {
                            this.f53116c = MainLooperOptService.this.moveMessageToFront(MainLooperOptService.this.mH, MainLooperOptService.this.mainMessageQueue, MainLooperOptService.this.pauseActivityMsg);
                            if (this.f53116c) {
                                MainLooperOptService.log("PAUSE_ACTIVITY opt success");
                                MainLooperOptService.this.printMessages(MainLooperOptService.this.mainMessageQueue);
                            }
                        }
                        if (MainLooperOptService.this.moveMessageToFront(MainLooperOptService.this.mH, MainLooperOptService.this.mainMessageQueue, MainLooperOptService.this.launchActivityMsg)) {
                            MainLooperOptService.log("LAUNCH_ACTIVITY opt success");
                            MainLooperOptService.this.printMessages(MainLooperOptService.this.mainMessageQueue);
                            MainLooperOptService.this.watchSuccess.put(a.WATCH_ACTIVITY, Boolean.TRUE);
                            return;
                        }
                        break;
                    case 2:
                        if (MainLooperOptService.this.moveMessageToFront(MainLooperOptService.this.frameHandler, MainLooperOptService.this.mainMessageQueue, 0)) {
                            MainLooperOptService.log("MSG_ON_MEASURE opt success");
                            MainLooperOptService.this.printMessages(MainLooperOptService.this.mainMessageQueue);
                            MainLooperOptService.this.watchSuccess.put(a.WATCH_ON_MEASURE, Boolean.TRUE);
                            return;
                        }
                        break;
                    case 3:
                        if (MainLooperOptService.this.viewRootImplHandler == null) {
                            MainLooperOptService.log("viewRootImplHandler is null");
                            MainLooperOptService.this.watchSuccess.put(a.WATCH_WINDOW_FOCUS_CHANGE, Boolean.TRUE);
                            return;
                        } else if (MainLooperOptService.this.moveMessageToFront(MainLooperOptService.this.viewRootImplHandler, MainLooperOptService.this.mainMessageQueue, 6)) {
                            MainLooperOptService.log("MSG_WINDOW_FOCUS_CHANGED opt success");
                            MainLooperOptService.this.printMessages(MainLooperOptService.this.mainMessageQueue);
                            MainLooperOptService.this.watchSuccess.put(a.WATCH_WINDOW_FOCUS_CHANGE, Boolean.TRUE);
                            return;
                        }
                        break;
                    case 4:
                        if (MainLooperOptService.this.moveMessageToFront(MainLooperOptService.this.frameHandler, MainLooperOptService.this.mainMessageQueue, 0)) {
                            MainLooperOptService.log("MSG_ON_DRAW opt success");
                            MainLooperOptService.this.printMessages(MainLooperOptService.this.mainMessageQueue);
                            MainLooperOptService.this.watchSuccess.put(a.WATCH_ON_DRAW, Boolean.TRUE);
                            MainLooperOptService.log("Opt Finish");
                            Looper.getMainLooper().setMessageLogging(null);
                            break;
                        }
                        break;
                }
            }
        }
    };
    public int pauseActivityMsg = BaseLoginOrRegisterActivity.o;
    private Class<?> viewRootImplClass;
    public Handler viewRootImplHandler;
    public a watchState;
    public Map<a, Boolean> watchSuccess;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53117a = new int[a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a[] r0 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53117a = r0
                int[] r0 = f53117a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r1 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.a.WATCH_ACTIVITY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f53117a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r1 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.a.WATCH_ON_MEASURE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f53117a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r1 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.a.WATCH_WINDOW_FOCUS_CHANGE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f53117a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService$a r1 = com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.a.WATCH_ON_DRAW     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService.AnonymousClass2.<clinit>():void");
        }
    }

    class ResetTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public f type() {
            return f.BOOT_FINISH;
        }

        private ResetTask() {
        }

        public void run(@NotNull Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55237, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55237, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.framework.a.a.a("ResetTask");
            MainLooperOptService.this.reset();
        }
    }

    public enum a {
        WATCH_INIT,
        WATCH_ACTIVITY,
        WATCH_ON_MEASURE,
        WATCH_WINDOW_FOCUS_CHANGE,
        WATCH_ON_DRAW;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    public void reset() {
        this.enable = false;
        this.mH = null;
        this.frameHandler = null;
        this.viewRootImplHandler = null;
        this.mainMessageQueue = null;
        this.mainChoreographer = null;
    }

    static final /* synthetic */ void lambda$logMeasure$1$MainLooperOptService() {
        ag i = ag.i();
        if (PatchProxy.isSupport(new Object[0], i, ag.f3141a, false, 40165, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i, ag.f3141a, false, 40165, new Class[0], Void.TYPE);
        } else if (i.n > 0) {
            i.h();
        } else {
            i.n = SystemClock.uptimeMillis();
        }
    }

    private Handler hookActivityThreadHandler() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55226, new Class[0], Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55226, new Class[0], Handler.class);
        }
        try {
            Object invoke = this.activityThreadClass.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = this.activityThreadClass.getDeclaredField("mH");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(invoke);
        } catch (Exception unused) {
            return null;
        }
    }

    private void logMeasure() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55225, new Class[0], Void.TYPE);
            return;
        }
        this.mainChoreographer.postFrameCallback(a.f53119b);
        try {
            Method declaredMethod = Class.forName("android.view.Choreographer").getDeclaredMethod("postCallbackDelayedInternal", new Class[]{Integer.TYPE, Object.class, Object.class, Long.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.mainChoreographer, new Object[]{3, b.f53121b, null, 0});
        } catch (Throwable unused) {
        }
    }

    public void enable(boolean z) {
        this.enable = z;
    }

    static final /* synthetic */ void lambda$logMeasure$0$MainLooperOptService(long j) {
        ag i = ag.i();
        if (PatchProxy.isSupport(new Object[0], i, ag.f3141a, false, 40164, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i, ag.f3141a, false, 40164, new Class[0], Void.TYPE);
        } else if (i.m > 0) {
            i.h();
        } else {
            i.m = SystemClock.uptimeMillis();
        }
    }

    public static void log(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 55233, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 55233, new Class[]{String.class}, Void.TYPE);
            return;
        }
        LOG_OPEN.booleanValue();
    }

    private Message getNextMessage(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, changeQuickRedirect, false, 55231, new Class[]{Message.class}, Message.class)) {
            return (Message) PatchProxy.accessDispatch(new Object[]{message2}, this, changeQuickRedirect, false, 55231, new Class[]{Message.class}, Message.class);
        }
        try {
            Field declaredField = this.messageClass.getDeclaredField("next");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(message2);
            if (obj != null) {
                return (Message) obj;
            }
        } catch (Exception e2) {
            log(e2.getMessage());
        }
        return null;
    }

    private Handler hookChoreographerHandler(Choreographer choreographer) {
        Choreographer choreographer2 = choreographer;
        if (PatchProxy.isSupport(new Object[]{choreographer2}, this, changeQuickRedirect, false, 55227, new Class[]{Choreographer.class}, Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[]{choreographer2}, this, changeQuickRedirect, false, 55227, new Class[]{Choreographer.class}, Handler.class);
        }
        try {
            Field declaredField = this.choreographerClass.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(choreographer2);
        } catch (Exception e2) {
            log(e2.getMessage());
            return null;
        }
    }

    private MessageQueue hookMainMessageQueue(Handler handler) {
        Handler handler2 = handler;
        if (PatchProxy.isSupport(new Object[]{handler2}, this, changeQuickRedirect, false, 55229, new Class[]{Handler.class}, MessageQueue.class)) {
            return (MessageQueue) PatchProxy.accessDispatch(new Object[]{handler2}, this, changeQuickRedirect, false, 55229, new Class[]{Handler.class}, MessageQueue.class);
        }
        try {
            Field declaredField = this.handlerClass.getDeclaredField("mQueue");
            declaredField.setAccessible(true);
            return (MessageQueue) declaredField.get(handler2);
        } catch (Exception e2) {
            log(e2.getMessage());
            return null;
        }
    }

    private Handler hookViewRootImplHandler(ViewParent viewParent) {
        ViewParent viewParent2 = viewParent;
        if (PatchProxy.isSupport(new Object[]{viewParent2}, this, changeQuickRedirect, false, 55228, new Class[]{ViewParent.class}, Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[]{viewParent2}, this, changeQuickRedirect, false, 55228, new Class[]{ViewParent.class}, Handler.class);
        }
        try {
            Field declaredField = this.viewRootImplClass.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(viewParent2);
        } catch (Exception e2) {
            log(e2.getMessage());
            return null;
        }
    }

    public void printMessages(MessageQueue messageQueue) {
        if (PatchProxy.isSupport(new Object[]{messageQueue}, this, changeQuickRedirect, false, 55232, new Class[]{MessageQueue.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{messageQueue}, this, changeQuickRedirect, false, 55232, new Class[]{MessageQueue.class}, Void.TYPE);
        } else if (LOG_OPEN.booleanValue()) {
            try {
                Field declaredField = this.messageQueueClass.getDeclaredField("mMessages");
                declaredField.setAccessible(true);
                Message message = (Message) declaredField.get(messageQueue);
                StringBuilder sb = new StringBuilder("message: ");
                while (message != null) {
                    sb.append(message.what);
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    message = getNextMessage(message);
                }
                log(sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    public void updateRootView(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, changeQuickRedirect, false, 55224, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, changeQuickRedirect, false, 55224, new Class[]{View.class}, Void.TYPE);
        } else if (this.viewRootImplHandler == null) {
            View rootView = view.getRootView();
            if (rootView != null) {
                this.viewRootImplHandler = hookViewRootImplHandler(rootView.getParent());
            }
        }
    }

    public void updateState(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 55223, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 55223, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.enable && com.ss.android.ugc.aweme.lego.a.f() && !com.ss.android.ugc.aweme.lego.a.g()) {
            log("update state to: " + aVar);
            this.watchState = aVar;
            this.watchSuccess.put(this.watchState, Boolean.FALSE);
        }
    }

    public void init(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55222, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55222, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("MainLooperOptService");
        logMeasure();
        try {
            this.activityThreadClass = Class.forName("android.app.ActivityThread");
            this.choreographerClass = Class.forName("android.view.Choreographer");
            this.viewRootImplClass = Class.forName("android.view.ViewRootImpl");
            this.handlerClass = Class.forName("android.os.Handler");
            this.messageQueueClass = Class.forName("android.os.MessageQueue");
            this.messageClass = Class.forName("android.os.Message");
            this.mH = hookActivityThreadHandler();
            this.frameHandler = hookChoreographerHandler(this.mainChoreographer);
            this.mainMessageQueue = hookMainMessageQueue(this.mH);
            this.watchSuccess = new HashMap();
            if (!(this.mH == null || this.mainMessageQueue == null || this.frameHandler == null)) {
                for (a put : a.values()) {
                    this.watchSuccess.put(put, Boolean.FALSE);
                }
                this.watchSuccess.put(a.WATCH_INIT, Boolean.TRUE);
                this.watchState = a.WATCH_INIT;
                Looper.getMainLooper().setMessageLogging(this.msgListener);
            }
            com.ss.android.ugc.aweme.lego.a.i.a().a(new ResetTask()).a();
        } catch (Exception unused) {
        }
    }

    public boolean moveMessageToFront(Handler handler, MessageQueue messageQueue, int i) {
        Handler handler2 = handler;
        MessageQueue messageQueue2 = messageQueue;
        if (PatchProxy.isSupport(new Object[]{handler2, messageQueue2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 55230, new Class[]{Handler.class, MessageQueue.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{handler2, messageQueue2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 55230, new Class[]{Handler.class, MessageQueue.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            Field declaredField = this.messageQueueClass.getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            Message message = (Message) declaredField.get(messageQueue2);
            while (message != null) {
                if (message.what == i && message.getTarget() == handler2) {
                    Message obtain = Message.obtain(message);
                    handler.removeMessages(message.what);
                    handler.sendMessageAtFrontOfQueue(obtain);
                    return true;
                }
                message = getNextMessage(message);
            }
        } catch (Exception e2) {
            log(e2.getMessage());
        }
        return false;
    }
}
