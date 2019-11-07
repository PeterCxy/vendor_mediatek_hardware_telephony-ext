package org.lineageos.mediatek.telephony;

import android.hardware.radio.V1_0.SetupDataCallResult;

import com.android.internal.telephony.RadioIndication;

import java.util.ArrayList;

import vendor.mediatek.hardware.radio.V2_0.IRadioIndication;
import vendor.mediatek.hardware.radio.V2_0.IncomingCallNotification;
import vendor.mediatek.hardware.radio.V2_0.MtkSetupDataCallResult;

public class MtkRadioIndication2 extends IRadioIndication.Stub {
    MtkRIL mRil;
    RadioIndication mIndication;

    MtkRadioIndication2(MtkRIL ril, RadioIndication indication) {
        mRil = ril;
        mIndication = indication;
    }

    //++ Radio V1_0
    public void radioStateChanged(int type, int radioState) {
        mIndication.radioStateChanged(type, radioState);
    }

    public void callStateChanged(int type) {
        mIndication.callStateChanged(type);
    }

    public void networkStateChanged(int type) {
        mIndication.networkStateChanged(type);
    }

    public void newSms(int type, ArrayList<Byte> pdu) {
        mIndication.newSms(type, pdu);
    }

    public void newSmsStatusReport(int type, ArrayList<Byte> pdu) {
        mIndication.newSmsStatusReport(type, pdu);
    }

    public void newSmsOnSim(int type, int recordNumber) {
        mIndication.newSmsOnSim(type, recordNumber);
    }

    public void onUssd(int type, int modeType, String msg) {
        mIndication.onUssd(type, modeType, msg);
    }

    public void nitzTimeReceived(int type, String nitzTime, long receivedTime) {
        mIndication.nitzTimeReceived(type, nitzTime, receivedTime);
    }

    public void currentSignalStrength(int type, android.hardware.radio.V1_0.SignalStrength signalStrength) {
        mIndication.currentSignalStrength(type, signalStrength);
    }

    public void dataCallListChanged(int type, ArrayList<SetupDataCallResult> dcList) {
        mIndication.dataCallListChanged(type, dcList);
    }

    public void suppSvcNotify(int type, android.hardware.radio.V1_0.SuppSvcNotification suppSvc) {
        mIndication.suppSvcNotify(type, suppSvc);
    }

    public void stkSessionEnd(int type) {
        mIndication.stkSessionEnd(type);
    }

    public void stkProactiveCommand(int type, String cmd) {
        mIndication.stkProactiveCommand(type, cmd);
    }

    public void stkEventNotify(int type, String cmd) {
        mIndication.stkEventNotify(type, cmd);
    }

    public void stkCallSetup(int type, long timeout) {
        mIndication.stkCallSetup(type, timeout);
    }

    public void simSmsStorageFull(int type) {
        mIndication.simSmsStorageFull(type);
    }

    public void simRefresh(int type, android.hardware.radio.V1_0.SimRefreshResult refreshResult) {
        mIndication.simRefresh(type, refreshResult);
    }

    public void callRing(int type, boolean isGsm, android.hardware.radio.V1_0.CdmaSignalInfoRecord record) {
        mIndication.callRing(type, isGsm, record);
    }

    public void simStatusChanged(int type) {
        mIndication.simStatusChanged(type);
    }

    public void cdmaNewSms(int type, android.hardware.radio.V1_0.CdmaSmsMessage msg) {
        mIndication.cdmaNewSms(type, msg);
    }

    public void newBroadcastSms(int type, ArrayList<Byte> data) {
        mIndication.newBroadcastSms(type, data);
    }

    public void cdmaRuimSmsStorageFull(int type) {
        mIndication.cdmaRuimSmsStorageFull(type);
    }

    public void restrictedStateChanged(int type, int state) {
        mIndication.restrictedStateChanged(type, state);
    }

    public void enterEmergencyCallbackMode(int type) {
        mIndication.enterEmergencyCallbackMode(type);
    }

    public void cdmaCallWaiting(int type, android.hardware.radio.V1_0.CdmaCallWaiting callWaitingRecord) {
        mIndication.cdmaCallWaiting(type, callWaitingRecord);
    }

    public void cdmaOtaProvisionStatus(int type, int status) {
        mIndication.cdmaOtaProvisionStatus(type, status);
    }

    public void cdmaInfoRec(int type, android.hardware.radio.V1_0.CdmaInformationRecords records) {
        mIndication.cdmaInfoRec(type, records);
    }

    public void indicateRingbackTone(int type, boolean start) {
        mIndication.indicateRingbackTone(type, start);
    }

    public void resendIncallMute(int type) {
        mIndication.resendIncallMute(type);
    }

    public void cdmaSubscriptionSourceChanged(int type, int cdmaSource) {
        mIndication.cdmaSubscriptionSourceChanged(type, cdmaSource);
    }

    public void cdmaPrlChanged(int type, int version) {
        mIndication.cdmaPrlChanged(type, version);
    }

    public void exitEmergencyCallbackMode(int type) {
        mIndication.exitEmergencyCallbackMode(type);
    }

    public void rilConnected(int type) {
        mIndication.rilConnected(type);
    }

    public void voiceRadioTechChanged(int type, int rat) {
        mIndication.voiceRadioTechChanged(type, rat);
    }

    public void cellInfoList(int type, ArrayList<android.hardware.radio.V1_0.CellInfo> records) {
        mIndication.cellInfoList(type, records);
    }

    public void imsNetworkStateChanged(int type) {
        mIndication.imsNetworkStateChanged(type);
    }

    public void subscriptionStatusChanged(int type, boolean activate) {
        mIndication.subscriptionStatusChanged(type, activate);
    }

    public void srvccStateNotify(int type, int state) {
        mIndication.srvccStateNotify(type, state);
    }

    public void hardwareConfigChanged(int type, ArrayList<android.hardware.radio.V1_0.HardwareConfig> configs) {
        mIndication.hardwareConfigChanged(type, configs);
    }

    public void radioCapabilityIndication(int type, android.hardware.radio.V1_0.RadioCapability rc) {
        mIndication.radioCapabilityIndication(type, rc);
    }

    public void onSupplementaryServiceIndication(int type, android.hardware.radio.V1_0.StkCcUnsolSsResult ss) {
        mIndication.onSupplementaryServiceIndication(type, ss);
    }

    public void stkCallControlAlphaNotify(int type, String alpha) {
        mIndication.stkCallControlAlphaNotify(type, alpha);
    }

    public void lceData(int type, android.hardware.radio.V1_0.LceDataInfo lce) {
        mIndication.lceData(type, lce);
    }

    public void pcoData(int type, android.hardware.radio.V1_0.PcoDataInfo pco) {
        mIndication.pcoData(type, pco);
    }

    public void modemReset(int type, String reason) {
        mIndication.modemReset(type, reason);
    }
    //-- Radio V1_0

    //++ Radio V1_1
    public void carrierInfoForImsiEncryption(int type) {
        mIndication.carrierInfoForImsiEncryption(type);
    }

    public void networkScanResult(int type, android.hardware.radio.V1_1.NetworkScanResult result) {
        mIndication.networkScanResult(type, result);
    }

    public void keepaliveStatus(int type, android.hardware.radio.V1_1.KeepaliveStatus status) {
        mIndication.keepaliveStatus(type, status);
    }

    //-- Radio V1_1

    //++ MTK Radio V2_0
    public void incomingCallIndication(int indicationType, IncomingCallNotification notification) {
        mRil.processIndicationMtk(indicationType);
        mRil.riljLogMtk("[UNSL][MTK]< incomingCallIndication");
        mRil.setCallIndication(
            Integer.parseInt(notification.callId), Integer.parseInt(notification.seqNo));
    }

    public void cipherIndication() {
        mRil.riljLogMtk("[UNSL][MTK]< cipherIndication not implemented");
    }

    public void crssIndication() {
        mRil.riljLogMtk("[UNSL][MTK]< crssIndication not implemented");
    }

    public void vtStatusInfoIndication() {
        mRil.riljLogMtk("[UNSL][MTK]< vtStatusInfoIndication not implemented");
    }

    public void speechCodecInfoIndication() {
        mRil.riljLogMtk("[UNSL][MTK]< speechCodecInfoIndication not implemented");
    }

    public void cdmaCallAccepted() {
        mRil.riljLogMtk("[UNSL][MTK]< cdmaCallAccepted not implemented");
    }

    public void onVirtualSimOn() {
        mRil.riljLogMtk("[UNSL][MTK]< onVirtualSimOn not implemented");
    }

    public void onVirtualSimOff() {
        mRil.riljLogMtk("[UNSL][MTK]< onVirtualSimOff not implemented");
    }

    public void onImeiLock() {
        mRil.riljLogMtk("[UNSL][MTK]< onImeiLock not implemented");
    }

    public void onImsiRefreshDone() {
        mRil.riljLogMtk("[UNSL][MTK]< onImsiRefreshDone not implemented");
    }

    public void newEtwsInd() {
        mRil.riljLogMtk("[UNSL][MTK]< newEtwsInd not implemented");
    }

    public void meSmsStorageFullInd() {
        mRil.riljLogMtk("[UNSL][MTK]< meSmsStorageFullInd not implemented");
    }

    public void smsReadyInd() {
        mRil.riljLogMtk("[UNSL][MTK]< smsReadyInd not implemented");
    }

    public void dataCallListChangedEx(int indicationType,
        ArrayList<MtkSetupDataCallResult> mtkDcList) {
        mRil.riljLogMtk("[UNSL][MTK]< dataCallListChangedEx");
        ArrayList<SetupDataCallResult> dcList = new java.util.ArrayList<SetupDataCallResult>();
        mtkDcList.forEach(entry -> dcList.add(entry.dcr));
        mIndication.dataCallListChanged(indicationType, dcList);
    }

    public void responseCsNetworkStateChangeInd() {
        mRil.riljLogMtk("[UNSL][MTK]< responseCsNetworkStateChangeInd not implemented");
    }

    public void eMBMSAtInfoIndication() {
        mRil.riljLogMtk("[UNSL][MTK]< eMBMSAtInfoIndication not implemented");
    }

    public void eMBMSSessionStatusIndication() {
        mRil.riljLogMtk("[UNSL][MTK]< eMBMSSessionStatusIndication not implemented");
    }

    public void responsePsNetworkStateChangeInd() {
        mRil.riljLogMtk("[UNSL][MTK]< responsePsNetworkStateChangeInd not implemented");
    }

    public void responseInvalidSimInd() {
        mRil.riljLogMtk("[UNSL][MTK]< responseInvalidSimInd not implemented");
    }

    public void responseNetworkEventInd() {
        mRil.riljLogMtk("[UNSL][MTK]< responseNetworkEventInd not implemented");
    }

    public void responseModulationInfoInd() {
        mRil.riljLogMtk("[UNSL][MTK]< responseModulationInfoInd not implemented");
    }

    public void dataAllowedNotification() {
        mRil.riljLogMtk("[UNSL][MTK]< dataAllowedNotification not implemented");
    }

    public void onPseudoCellInfoInd() {
        mRil.riljLogMtk("[UNSL][MTK]< onPseudoCellInfoInd not implemented");
    }

    public void plmnChangedIndication() {
        mRil.riljLogMtk("[UNSL][MTK]< plmnChangedIndication not implemented");
    }

    public void registrationSuspendedIndication() {
        mRil.riljLogMtk("[UNSL][MTK]< registrationSuspendedIndication not implemented");
    }

    public void gmssRatChangedIndication() {
        mRil.riljLogMtk("[UNSL][MTK]< gmssRatChangedIndication not implemented");
    }

    public void worldModeChangedIndication() {
        mRil.riljLogMtk("[UNSL][MTK]< worldModeChangedIndication not implemented");
    }

    public void resetAttachApnInd() {
        mRil.riljLogMtk("[UNSL][MTK]< resetAttachApnInd not implemented");
    }

    public void mdChangedApnInd() {
        mRil.riljLogMtk("[UNSL][MTK]< mdChangedApnInd not implemented");
    }

    public void esnMeidChangeInd() {
        mRil.riljLogMtk("[UNSL][MTK]< esnMeidChangeInd not implemented");
    }

    public void responseFemtocellInfo() {
        mRil.riljLogMtk("[UNSL][MTK]< responseFemtocellInfo not implemented");
    }

    public void phbReadyNotification() {
        mRil.riljLogMtk("[UNSL][MTK]< phbReadyNotification not implemented");
    }

    public void bipProactiveCommand() {
        mRil.riljLogMtk("[UNSL][MTK]< bipProactiveCommand not implemented");
    }

    public void triggerOtaSP() {
        mRil.riljLogMtk("[UNSL][MTK]< triggerOtaSP not implemented");
    }

    public void onStkMenuReset() {
        mRil.riljLogMtk("[UNSL][MTK]< onStkMenuReset not implemented");
    }

    public void onMdDataRetryCountReset() {
        mRil.riljLogMtk("[UNSL][MTK]< onMdDataRetryCountReset not implemented");
    }

    public void onRemoveRestrictEutran() {
        mRil.riljLogMtk("[UNSL][MTK]< onRemoveRestrictEutran not implemented");
    }

    public void onPcoStatus() {
        mRil.riljLogMtk("[UNSL][MTK]< onPcoStatus not implemented");
    }

    public void onLteAccessStratumStateChanged() {
        mRil.riljLogMtk("[UNSL][MTK]< onLteAccessStratumStateChanged not implemented");
    }

    public void onSimPlugIn() {
        mRil.riljLogMtk("[UNSL][MTK]< onSimPlugIn not implemented");
    }

    public void onSimPlugOut() {
        mRil.riljLogMtk("[UNSL][MTK]< onSimPlugOut not implemented");
    }

    public void onSimMissing() {
        mRil.riljLogMtk("[UNSL][MTK]< onSimMissing not implemented");
    }

    public void onSimRecovery() {
        mRil.riljLogMtk("[UNSL][MTK]< onSimRecovery not implemented");
    }

    public void onSimTrayPlugIn() {
        mRil.riljLogMtk("[UNSL][MTK]< onSimTrayPlugIn not implemented");
    }

    public void onSimCommonSlotNoChanged() {
        mRil.riljLogMtk("[UNSL][MTK]< onSimCommonSlotNoChanged not implemented");
    }

    public void onSimMeLockEvent() {
        mRil.riljLogMtk("[UNSL][MTK]< onSimMeLockEvent not implemented");
    }

    public void networkInfoInd() {
        mRil.riljLogMtk("[UNSL][MTK]< networkInfoInd not implemented");
    }

    public void cfuStatusNotify() {
        mRil.riljLogMtk("[UNSL][MTK]< cfuStatusNotify not implemented");
    }

    public void pcoDataAfterAttached() {
        mRil.riljLogMtk("[UNSL][MTK]< pcoDataAfterAttached not implemented");
    }

    public void confSRVCC() {
        mRil.riljLogMtk("[UNSL][MTK]< confSRVCC not implemented");
    }

    public void onVsimEventIndication() {
        mRil.riljLogMtk("[UNSL][MTK]< onVsimEventIndication not implemented");
    }

    public void volteLteConnectionStatus() {
        mRil.riljLogMtk("[UNSL][MTK]< volteLteConnectionStatus not implemented");
    }

    public void dedicatedBearerActivationInd() {
        mRil.riljLogMtk("[UNSL][MTK]< dedicatedBearerActivationInd not implemented");
    }

    public void dedicatedBearerModificationInd() {
        mRil.riljLogMtk("[UNSL][MTK]< dedicatedBearerModificationInd not implemented");
    }

    public void dedicatedBearerDeactivationInd() {
        mRil.riljLogMtk("[UNSL][MTK]< dedicatedBearerDeactivationInd not implemented");
    }

    public void onWifiMonitoringThreshouldChanged() {
        mRil.riljLogMtk("[UNSL][MTK]< onWifiMonitoringThreshouldChanged not implemented");
    }

    public void onWifiPdnActivate() {
        mRil.riljLogMtk("[UNSL][MTK]< onWifiPdnActivate not implemented");
    }

    public void onWfcPdnError() {
        mRil.riljLogMtk("[UNSL][MTK]< onWfcPdnError not implemented");
    }

    public void onPdnHandover() {
        mRil.riljLogMtk("[UNSL][MTK]< onPdnHandover not implemented");
    }

    public void onWifiRoveout() {
        mRil.riljLogMtk("[UNSL][MTK]< onWifiRoveout not implemented");
    }

    public void onLocationRequest() {
        mRil.riljLogMtk("[UNSL][MTK]< onLocationRequest not implemented");
    }

    public void onWfcPdnStateChanged() {
        mRil.riljLogMtk("[UNSL][MTK]< onWfcPdnStateChanged not implemented");
    }

    public void onNattKeepAliveChanged() {
        mRil.riljLogMtk("[UNSL][MTK]< onNattKeepAliveChanged not implemented");
    }

    public void oemHookRaw() {
        mRil.riljLogMtk("[UNSL][MTK]< oemHookRaw not implemented");
    }
    //-- MTK Radio V2_0
}
