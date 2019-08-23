package com.ss.ttvideoengine.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONArray;

public enum VideoEventManager {
    instance;
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private JSONArray mJsonArray;
    private VideoEventListener mListener;

    public final synchronized JSONArray popAllEvents() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91535, new Class[0], JSONArray.class)) {
            return (JSONArray) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91535, new Class[0], JSONArray.class);
        }
        JSONArray jSONArray = this.mJsonArray;
        this.mJsonArray = new JSONArray();
        return jSONArray;
    }

    public final void setListener(VideoEventListener videoEventListener) {
        this.mListener = videoEventListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void addEvent(org.json.JSONObject r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0051 }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x0051 }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x0051 }
            r4 = 0
            r5 = 91536(0x16590, float:1.28269E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0051 }
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r9] = r2     // Catch:{ all -> 0x0051 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0051 }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0051 }
            r1[r9] = r11     // Catch:{ all -> 0x0051 }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x0051 }
            r4 = 0
            r5 = 91536(0x16590, float:1.28269E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0051 }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r6[r9] = r0     // Catch:{ all -> 0x0051 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0051 }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            monitor-exit(r10)
            return
        L_0x0034:
            if (r11 != 0) goto L_0x0038
            monitor-exit(r10)
            return
        L_0x0038:
            java.lang.String r1 = "VideoEventManager"
            java.lang.String r2 = r11.toString()     // Catch:{ all -> 0x0051 }
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r1, r2)     // Catch:{ all -> 0x0051 }
            org.json.JSONArray r1 = r10.mJsonArray     // Catch:{ all -> 0x0051 }
            r1.put(r11)     // Catch:{ all -> 0x0051 }
            com.ss.ttvideoengine.log.VideoEventListener r0 = r10.mListener     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004f
            com.ss.ttvideoengine.log.VideoEventListener r0 = r10.mListener     // Catch:{ all -> 0x0051 }
            r0.onEvent()     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r10)
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.log.VideoEventManager.addEvent(org.json.JSONObject):void");
    }
}
