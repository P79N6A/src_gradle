package anet.channel.a;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.flow.FlowStat;
import anet.channel.flow.INetworkAnalysis;
import anet.channel.util.ALog;
import com.taobao.analysis.FlowCenter;

public class a implements INetworkAnalysis {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1158a;

    public a() {
        try {
            Class.forName("com.taobao.analysis.FlowCenter");
            this.f1158a = true;
        } catch (Exception unused) {
            this.f1158a = false;
            ALog.e("DefaultNetworkAnalysis", "no NWNetworkAnalysisSDK sdk", null, new Object[0]);
        }
    }

    public void commitFlow(FlowStat flowStat) {
        if (this.f1158a) {
            FlowCenter.getInstance().commitFlow(GlobalAppRuntimeInfo.getContext(), flowStat.refer, flowStat.protocoltype, flowStat.req_identifier, flowStat.upstream, flowStat.downstream);
        }
    }
}
