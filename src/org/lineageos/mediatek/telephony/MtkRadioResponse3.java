package org.lineageos.mediatek.telephony;

import android.hardware.radio.V1_0.ActivityStatsInfo;
import android.hardware.radio.V1_0.CallForwardInfo;
import android.hardware.radio.V1_0.Call;
import android.hardware.radio.V1_0.CardStatus;
import android.hardware.radio.V1_0.CarrierRestrictions;
import android.hardware.radio.V1_0.CdmaBroadcastSmsConfigInfo;
import android.hardware.radio.V1_0.CellInfo;
import android.hardware.radio.V1_0.DataRegStateResult;
import android.hardware.radio.V1_0.HardwareConfig;
import android.hardware.radio.V1_0.IccIoResult;
import android.hardware.radio.V1_0.GsmBroadcastSmsConfigInfo;
import android.hardware.radio.V1_0.LastCallFailCauseInfo;
import android.hardware.radio.V1_0.LceDataInfo;
import android.hardware.radio.V1_0.LceStatusInfo;
import android.hardware.radio.V1_0.NeighboringCell;
import android.hardware.radio.V1_0.OperatorInfo;
import android.hardware.radio.V1_0.RadioCapability;
import android.hardware.radio.V1_0.RadioResponseInfo;
import android.hardware.radio.V1_0.SendSmsResult;
import android.hardware.radio.V1_0.SetupDataCallResult;
import android.hardware.radio.V1_0.SignalStrength;
import android.hardware.radio.V1_0.VoiceRegStateResult;
import android.hardware.radio.V1_1.KeepaliveStatus;

import com.android.internal.telephony.RadioResponse;
import com.android.internal.telephony.RIL;

import java.util.ArrayList;

import vendor.mediatek.hardware.radio.V3_0.*;

public class MtkRadioResponse3 extends IRadioResponse.Stub {
    MtkRIL mRil;
    RadioResponse mResponse;

    MtkRadioResponse3(MtkRIL ril, RadioResponse response) {
        mRil = ril;
        mResponse = response;
    }
    
    //++ Radio V1_0
    public void getIccCardStatusResponse(RadioResponseInfo info, CardStatus cardStatus) {
        mResponse.getIccCardStatusResponse(info, cardStatus);
    }
    public void supplyIccPinForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.supplyIccPinForAppResponse(info, remainingRetries);
    }

    public void supplyIccPukForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.supplyIccPukForAppResponse(info, remainingRetries);
    }

    public void supplyIccPin2ForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.supplyIccPin2ForAppResponse(info, remainingRetries);
    }

    public void supplyIccPuk2ForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.supplyIccPuk2ForAppResponse(info, remainingRetries);
    }

    public void changeIccPinForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.changeIccPinForAppResponse(info, remainingRetries);
    }

    public void changeIccPin2ForAppResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.changeIccPin2ForAppResponse(info, remainingRetries);
    }

    public void supplyNetworkDepersonalizationResponse(RadioResponseInfo info, int remainingRetries) {
        mResponse.supplyNetworkDepersonalizationResponse(info, remainingRetries);
    }

    public void getCurrentCallsResponse(RadioResponseInfo info, ArrayList<Call> calls) {
        mResponse.getCurrentCallsResponse(info, calls);
    }

    public void dialResponse(RadioResponseInfo info) {
        mResponse.dialResponse(info);
    }

    public void getIMSIForAppResponse(RadioResponseInfo info, String imsi) {
        mResponse.getIMSIForAppResponse(info, imsi);
    }

    public void hangupConnectionResponse(RadioResponseInfo info) {
        mResponse.hangupConnectionResponse(info);
    }

    public void hangupWaitingOrBackgroundResponse(RadioResponseInfo info) {
        mResponse.hangupWaitingOrBackgroundResponse(info);
    }

    public void hangupForegroundResumeBackgroundResponse(RadioResponseInfo info) {
        mResponse.hangupForegroundResumeBackgroundResponse(info);
    }

    public void switchWaitingOrHoldingAndActiveResponse(RadioResponseInfo info) {
        mResponse.switchWaitingOrHoldingAndActiveResponse(info);
    }

    public void conferenceResponse(RadioResponseInfo info) {
        mResponse.conferenceResponse(info);
    }

    public void rejectCallResponse(RadioResponseInfo info) {
        mResponse.rejectCallResponse(info);
    }

    public void getLastCallFailCauseResponse(RadioResponseInfo info, LastCallFailCauseInfo failCauseinfo) {
        mResponse.getLastCallFailCauseResponse(info, failCauseinfo);
    }

    public void getSignalStrengthResponse(RadioResponseInfo info, SignalStrength sigStrength) {
        mResponse.getSignalStrengthResponse(info, sigStrength);
    }

    public void getVoiceRegistrationStateResponse(RadioResponseInfo info, VoiceRegStateResult voiceRegResponse) {
        mResponse.getVoiceRegistrationStateResponse(info, voiceRegResponse);
    }

    public void getDataRegistrationStateResponse(RadioResponseInfo info, DataRegStateResult dataRegResponse) {
        mResponse.getDataRegistrationStateResponse(info, dataRegResponse);
    }

    public void getOperatorResponse(RadioResponseInfo info, String longName, String shortName, String numeric) {
        mResponse.getOperatorResponse(info, longName, shortName, numeric);
    }

    public void setRadioPowerResponse(RadioResponseInfo info) {
        mResponse.setRadioPowerResponse(info);
    }

    public void sendDtmfResponse(RadioResponseInfo info) {
        mResponse.sendDtmfResponse(info);
    }

    public void sendSmsResponse(RadioResponseInfo info, SendSmsResult sms) {
        mResponse.sendSmsResponse(info, sms);
    }

    public void sendSMSExpectMoreResponse(RadioResponseInfo info, SendSmsResult sms) {
        mResponse.sendSMSExpectMoreResponse(info, sms);
    }

    public void setupDataCallResponse(RadioResponseInfo info, SetupDataCallResult dcResponse) {
        mResponse.setupDataCallResponse(info, dcResponse);
    }

    public void iccIOForAppResponse(RadioResponseInfo info, IccIoResult iccIo) {
        mResponse.iccIOForAppResponse(info, iccIo);
    }

    public void sendUssdResponse(RadioResponseInfo info) {
        mResponse.sendUssdResponse(info);
    }

    public void cancelPendingUssdResponse(RadioResponseInfo info) {
        mResponse.cancelPendingUssdResponse(info);
    }

    public void getClirResponse(RadioResponseInfo info, int n, int m) {
        mResponse.getClirResponse(info, n, m);
    }

    public void setClirResponse(RadioResponseInfo info) {
        mResponse.setClirResponse(info);
    }

    public void getCallForwardStatusResponse(RadioResponseInfo info, ArrayList<CallForwardInfo> callForwardInfos) {
        mResponse.getCallForwardStatusResponse(info, callForwardInfos);
    }

    public void setCallForwardResponse(RadioResponseInfo info) {
        mResponse.setCallForwardResponse(info);
    }

    public void getCallWaitingResponse(RadioResponseInfo info, boolean enable, int serviceClass) {
        mResponse.getCallWaitingResponse(info, enable, serviceClass);
    }

    public void setCallWaitingResponse(RadioResponseInfo info) {
        mResponse.setCallWaitingResponse(info);
    }

    public void acknowledgeLastIncomingGsmSmsResponse(RadioResponseInfo info) {
        mResponse.acknowledgeLastIncomingGsmSmsResponse(info);
    }

    public void acceptCallResponse(RadioResponseInfo info) {
        mResponse.acceptCallResponse(info);
    }

    public void deactivateDataCallResponse(RadioResponseInfo info) {
        mResponse.deactivateDataCallResponse(info);
    }

    public void getFacilityLockForAppResponse(RadioResponseInfo info, int response) {
        mResponse.getFacilityLockForAppResponse(info, response);
    }

    public void setFacilityLockForAppResponse(RadioResponseInfo info, int retry) {
        mResponse.setFacilityLockForAppResponse(info, retry);
    }

    public void setBarringPasswordResponse(RadioResponseInfo info) {
        mResponse.setBarringPasswordResponse(info);
    }

    public void getNetworkSelectionModeResponse(RadioResponseInfo info, boolean manual) {
        mResponse.getNetworkSelectionModeResponse(info, manual);
    }

    public void setNetworkSelectionModeAutomaticResponse(RadioResponseInfo info) {
        mResponse.setNetworkSelectionModeAutomaticResponse(info);
    }

    public void setNetworkSelectionModeManualResponse(RadioResponseInfo info) {
        mResponse.setNetworkSelectionModeManualResponse(info);
    }

    public void getAvailableNetworksResponse(RadioResponseInfo info, ArrayList<OperatorInfo> networkInfos) {
        mResponse.getAvailableNetworksResponse(info, networkInfos);
    }

    public void startDtmfResponse(RadioResponseInfo info) {
        mResponse.startDtmfResponse(info);
    }

    public void stopDtmfResponse(RadioResponseInfo info) {
        mResponse.stopDtmfResponse(info);
    }

    public void getBasebandVersionResponse(RadioResponseInfo info, String version) {
        mResponse.getBasebandVersionResponse(info, version);
    }

    public void separateConnectionResponse(RadioResponseInfo info) {
        mResponse.separateConnectionResponse(info);
    }

    public void setMuteResponse(RadioResponseInfo info) {
        mResponse.setMuteResponse(info);
    }

    public void getMuteResponse(RadioResponseInfo info, boolean enable) {
        mResponse.getMuteResponse(info, enable);
    }

    public void getClipResponse(RadioResponseInfo info, int status) {
        mResponse.getClipResponse(info, status);
    }

    public void getDataCallListResponse(RadioResponseInfo info, ArrayList<SetupDataCallResult> dcResponse) {
        mResponse.getDataCallListResponse(info, dcResponse);
    }

    public void setSuppServiceNotificationsResponse(RadioResponseInfo info) {
        mResponse.setSuppServiceNotificationsResponse(info);
    }

    public void writeSmsToSimResponse(RadioResponseInfo info, int index) {
        mResponse.writeSmsToSimResponse(info, index);
    }

    public void deleteSmsOnSimResponse(RadioResponseInfo info) {
        mResponse.deleteSmsOnSimResponse(info);
    }

    public void setBandModeResponse(RadioResponseInfo info) {
        mResponse.setBandModeResponse(info);
    }

    public void getAvailableBandModesResponse(RadioResponseInfo info, ArrayList<Integer> bandModes) {
        mResponse.getAvailableBandModesResponse(info, bandModes);
    }

    public void sendEnvelopeResponse(RadioResponseInfo info, String commandResponse) {
        mResponse.sendEnvelopeResponse(info, commandResponse);
    }

    public void sendTerminalResponseToSimResponse(RadioResponseInfo info) {
        mResponse.sendTerminalResponseToSimResponse(info);
    }

    public void handleStkCallSetupRequestFromSimResponse(RadioResponseInfo info) {
        mResponse.handleStkCallSetupRequestFromSimResponse(info);
    }

    public void explicitCallTransferResponse(RadioResponseInfo info) {
        mResponse.explicitCallTransferResponse(info);
    }

    public void setPreferredNetworkTypeResponse(RadioResponseInfo info) {
        mResponse.setPreferredNetworkTypeResponse(info);
    }

    public void getPreferredNetworkTypeResponse(RadioResponseInfo info, int nwType) {
        mResponse.getPreferredNetworkTypeResponse(info, nwType);
    }

    public void getNeighboringCidsResponse(RadioResponseInfo info, ArrayList<NeighboringCell> cells) {
        mResponse.getNeighboringCidsResponse(info, cells);
    }

    public void setLocationUpdatesResponse(RadioResponseInfo info) {
        mResponse.setLocationUpdatesResponse(info);
    }

    public void setCdmaSubscriptionSourceResponse(RadioResponseInfo info) {
        mResponse.setCdmaSubscriptionSourceResponse(info);
    }

    public void setCdmaRoamingPreferenceResponse(RadioResponseInfo info) {
        mResponse.setCdmaRoamingPreferenceResponse(info);
    }

    public void getCdmaRoamingPreferenceResponse(RadioResponseInfo info, int type) {
        mResponse.getCdmaRoamingPreferenceResponse(info, type);
    }

    public void setTTYModeResponse(RadioResponseInfo info) {
        mResponse.setTTYModeResponse(info);
    }

    public void getTTYModeResponse(RadioResponseInfo info, int mode) {
        mResponse.getTTYModeResponse(info, mode);
    }

    public void setPreferredVoicePrivacyResponse(RadioResponseInfo info) {
        mResponse.setPreferredVoicePrivacyResponse(info);
    }

    public void getPreferredVoicePrivacyResponse(RadioResponseInfo info, boolean enable) {
        mResponse.getPreferredVoicePrivacyResponse(info, enable);
    }

    public void sendCDMAFeatureCodeResponse(RadioResponseInfo info) {
        mResponse.sendCDMAFeatureCodeResponse(info);
    }

    public void sendBurstDtmfResponse(RadioResponseInfo info) {
        mResponse.sendBurstDtmfResponse(info);
    }

    public void sendCdmaSmsResponse(RadioResponseInfo info, SendSmsResult sms) {
        mResponse.sendCdmaSmsResponse(info, sms);
    }

    public void acknowledgeLastIncomingCdmaSmsResponse(RadioResponseInfo info) {
        mResponse.acknowledgeLastIncomingCdmaSmsResponse(info);
    }

    public void getGsmBroadcastConfigResponse(RadioResponseInfo info, ArrayList<GsmBroadcastSmsConfigInfo> configs) {
        mResponse.getGsmBroadcastConfigResponse(info, configs);
    }

    public void setGsmBroadcastConfigResponse(RadioResponseInfo info) {
        mResponse.setGsmBroadcastConfigResponse(info);
    }

    public void setGsmBroadcastActivationResponse(RadioResponseInfo info) {
        mResponse.setGsmBroadcastActivationResponse(info);
    }

    public void getCdmaBroadcastConfigResponse(RadioResponseInfo info, ArrayList<CdmaBroadcastSmsConfigInfo> configs) {
        mResponse.getCdmaBroadcastConfigResponse(info, configs);
    }

    public void setCdmaBroadcastConfigResponse(RadioResponseInfo info) {
        mResponse.setCdmaBroadcastConfigResponse(info);
    }

    public void setCdmaBroadcastActivationResponse(RadioResponseInfo info) {
        mResponse.setCdmaBroadcastActivationResponse(info);
    }

    public void getCDMASubscriptionResponse(RadioResponseInfo info, String mdn, String hSid, String hNid, String min, String prl) {
        mResponse.getCDMASubscriptionResponse(info, mdn, hSid, hNid, min, prl);
    }

    public void writeSmsToRuimResponse(RadioResponseInfo info, int index) {
        mResponse.writeSmsToRuimResponse(info, index);
    }

    public void deleteSmsOnRuimResponse(RadioResponseInfo info) {
        mResponse.deleteSmsOnRuimResponse(info);
    }

    public void getDeviceIdentityResponse(RadioResponseInfo info, String imei, String imeisv, String esn, String meid) {
        mResponse.getDeviceIdentityResponse(info, imei, imeisv, esn, meid);
    }

    public void exitEmergencyCallbackModeResponse(RadioResponseInfo info) {
        mResponse.exitEmergencyCallbackModeResponse(info);
    }

    public void getSmscAddressResponse(RadioResponseInfo info, String smsc) {
        mResponse.getSmscAddressResponse(info, smsc);
    }

    public void setSmscAddressResponse(RadioResponseInfo info) {
        mResponse.setSmscAddressResponse(info);
    }

    public void reportSmsMemoryStatusResponse(RadioResponseInfo info) {
        mResponse.reportSmsMemoryStatusResponse(info);
    }

    public void reportStkServiceIsRunningResponse(RadioResponseInfo info) {
        mResponse.reportStkServiceIsRunningResponse(info);
    }

    public void getCdmaSubscriptionSourceResponse(RadioResponseInfo info, int source) {
        mResponse.getCdmaSubscriptionSourceResponse(info, source);
    }

    public void requestIsimAuthenticationResponse(RadioResponseInfo info, String response) {
        mResponse.requestIsimAuthenticationResponse(info, response);
    }

    public void acknowledgeIncomingGsmSmsWithPduResponse(RadioResponseInfo info) {
        mResponse.acknowledgeIncomingGsmSmsWithPduResponse(info);
    }

    public void sendEnvelopeWithStatusResponse(RadioResponseInfo info, IccIoResult iccIo) {
        mResponse.sendEnvelopeWithStatusResponse(info, iccIo);
    }

    public void getVoiceRadioTechnologyResponse(RadioResponseInfo info, int rat) {
        mResponse.getVoiceRadioTechnologyResponse(info, rat);
    }

    public void getCellInfoListResponse(RadioResponseInfo info, ArrayList<CellInfo> cellInfo) {
        mResponse.getCellInfoListResponse(info, cellInfo);
    }

    public void setCellInfoListRateResponse(RadioResponseInfo info) {
        mResponse.setCellInfoListRateResponse(info);
    }

    public void setInitialAttachApnResponse(RadioResponseInfo info) {
        mResponse.setInitialAttachApnResponse(info);
    }

    public void getImsRegistrationStateResponse(RadioResponseInfo info, boolean isRegistered, int ratFamily) {
        mResponse.getImsRegistrationStateResponse(info, isRegistered, ratFamily);
    }

    public void sendImsSmsResponse(RadioResponseInfo info, SendSmsResult sms) {
        mResponse.sendImsSmsResponse(info, sms);
    }

    public void iccTransmitApduBasicChannelResponse(RadioResponseInfo info, IccIoResult result) {
        mResponse.iccTransmitApduBasicChannelResponse(info, result);
    }

    public void iccOpenLogicalChannelResponse(RadioResponseInfo info, int channelId, ArrayList<Byte> selectResponse) {
        mResponse.iccOpenLogicalChannelResponse(info, channelId, selectResponse);
    }

    public void iccCloseLogicalChannelResponse(RadioResponseInfo info) {
        mResponse.iccCloseLogicalChannelResponse(info);
    }

    public void iccTransmitApduLogicalChannelResponse(RadioResponseInfo info, IccIoResult result) {
        mResponse.iccTransmitApduLogicalChannelResponse(info, result);
    }

    public void nvReadItemResponse(RadioResponseInfo info, String result) {
        mResponse.nvReadItemResponse(info, result);
    }

    public void nvWriteItemResponse(RadioResponseInfo info) {
        mResponse.nvWriteItemResponse(info);
    }

    public void nvWriteCdmaPrlResponse(RadioResponseInfo info) {
        mResponse.nvWriteCdmaPrlResponse(info);
    }

    public void nvResetConfigResponse(RadioResponseInfo info) {
        mResponse.nvResetConfigResponse(info);
    }

    public void setUiccSubscriptionResponse(RadioResponseInfo info) {
        mResponse.setUiccSubscriptionResponse(info);
    }

    public void setDataAllowedResponse(RadioResponseInfo info) {
        mResponse.setDataAllowedResponse(info);
    }

    public void getHardwareConfigResponse(RadioResponseInfo info, ArrayList<HardwareConfig> config) {
        mResponse.getHardwareConfigResponse(info, config);
    }

    public void requestIccSimAuthenticationResponse(RadioResponseInfo info, IccIoResult result) {
        mResponse.requestIccSimAuthenticationResponse(info, result);
    }

    public void setDataProfileResponse(RadioResponseInfo info) {
        mResponse.setDataProfileResponse(info);
    }

    public void requestShutdownResponse(RadioResponseInfo info) {
        mResponse.requestShutdownResponse(info);
    }

    public void getRadioCapabilityResponse(RadioResponseInfo info, RadioCapability rc) {
        mResponse.getRadioCapabilityResponse(info, rc);
    }

    public void setRadioCapabilityResponse(RadioResponseInfo info, RadioCapability rc) {
        mResponse.setRadioCapabilityResponse(info, rc);
    }

    public void startLceServiceResponse(RadioResponseInfo info, LceStatusInfo statusInfo) {
        mResponse.startLceServiceResponse(info, statusInfo);
    }

    public void stopLceServiceResponse(RadioResponseInfo info, LceStatusInfo statusInfo) {
        mResponse.stopLceServiceResponse(info, statusInfo);
    }

    public void pullLceDataResponse(RadioResponseInfo info, LceDataInfo lceInfo) {
        mResponse.pullLceDataResponse(info, lceInfo);
    }

    public void getModemActivityInfoResponse(RadioResponseInfo info, ActivityStatsInfo activityInfo) {
        mResponse.getModemActivityInfoResponse(info, activityInfo);
    }

    public void setAllowedCarriersResponse(RadioResponseInfo info, int numAllowed) {
        mResponse.setAllowedCarriersResponse(info, numAllowed);
    }

    public void getAllowedCarriersResponse(RadioResponseInfo info, boolean allAllowed, CarrierRestrictions carriers) {
        mResponse.getAllowedCarriersResponse(info, allAllowed, carriers);
    }

    public void sendDeviceStateResponse(RadioResponseInfo info) {
        mResponse.sendDeviceStateResponse(info);
    }

    public void setIndicationFilterResponse(RadioResponseInfo info) {
        mResponse.setIndicationFilterResponse(info);
    }

    public void setSimCardPowerResponse(RadioResponseInfo info) {
        mResponse.setSimCardPowerResponse(info);
    }

    public void acknowledgeRequest(int serial) {
        mResponse.acknowledgeRequest(serial);
    }
    //-- Radio V1_0

    //++ Radio V1_1
    public void setCarrierInfoForImsiEncryptionResponse(RadioResponseInfo info) {
        mResponse.setCarrierInfoForImsiEncryptionResponse(info);
    }

    public void setSimCardPowerResponse_1_1(RadioResponseInfo info) {
        mResponse.setSimCardPowerResponse_1_1(info);
    }

    public void startNetworkScanResponse(RadioResponseInfo info) {
        mResponse.startNetworkScanResponse(info);
    }

    public void stopNetworkScanResponse(RadioResponseInfo info) {
        mResponse.stopNetworkScanResponse(info);
    }

    public void startKeepaliveResponse(RadioResponseInfo info, KeepaliveStatus status) {
        mResponse.startKeepaliveResponse(info, status);
    }

    public void stopKeepaliveResponse(RadioResponseInfo info) {
        mResponse.stopKeepaliveResponse(info);
    }
    //-- Radio V1_1
    
    //++ Radio V1_2
    public void getCellInfoListResponse_1_2(RadioResponseInfo responseInfo, ArrayList<android.hardware.radio.V1_2.CellInfo> cellInfo) {
        mResponse.getCellInfoListResponse_1_2(responseInfo, cellInfo);
    }
    
    public void getIccCardStatusResponse_1_2(RadioResponseInfo responseInfo, android.hardware.radio.V1_2.CardStatus cardStatus) {
        mResponse.getIccCardStatusResponse_1_2(responseInfo, cardStatus);
    }
    
    public void setSignalStrengthReportingCriteriaResponse(RadioResponseInfo responseInfo) {
        mResponse.setSignalStrengthReportingCriteriaResponse(responseInfo);
    }
    
    public void setLinkCapacityReportingCriteriaResponse(RadioResponseInfo responseInfo) {
        mResponse.setLinkCapacityReportingCriteriaResponse(responseInfo);
    }
    
    public void getCurrentCallsResponse_1_2(RadioResponseInfo responseInfo, ArrayList<android.hardware.radio.V1_2.Call> calls) {
        mResponse.getCurrentCallsResponse_1_2(responseInfo, calls);
    }
    
    public void getSignalStrengthResponse_1_2(RadioResponseInfo responseInfo, android.hardware.radio.V1_2.SignalStrength signalStrength) {
        mResponse.getSignalStrengthResponse_1_2(responseInfo, signalStrength);
    }
    
    public void getVoiceRegistrationStateResponse_1_2(RadioResponseInfo responseInfo, android.hardware.radio.V1_2.VoiceRegStateResult voiceRegResponse) {
        mResponse.getVoiceRegistrationStateResponse_1_2(responseInfo, voiceRegResponse);
    }
    
    public void getDataRegistrationStateResponse_1_2(RadioResponseInfo responseInfo, android.hardware.radio.V1_2.DataRegStateResult dataRegResponse) {
        mResponse.getDataRegistrationStateResponse_1_2(responseInfo, dataRegResponse);
    }
    //-- Radio V1_2
    
    //++ MTK Radio V3_0
    public void sendEmbmsAtCommandResponse(RadioResponseInfo responseInfo, String data) {
        mRil.riljLogMtk("[MTK]< sendEmbmsAtCommandResponse not implemented");
    }

    public void setRoamingEnableResponse(RadioResponseInfo responseInfo) {
        mRil.riljLogMtk("[MTK]< setRoamingEnableResponse not implemented");
    }

    public void getRoamingEnableResponse(RadioResponseInfo responseInfo, ArrayList<Integer> data) {
        mRil.riljLogMtk("[MTK]< getRoamingEnableResponse not implemented");
    }

    public void queryPhbStorageInfoResponse(RadioResponseInfo info, ArrayList<Integer> storageInfo) {
        mRil.riljLogMtk("[MTK]< queryPhbStorageInfoResponse not implemented");
    }

    public void writePhbEntryResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< writePhbEntryResponse not implemented");
    }

    public void readPhbEntryResponse(RadioResponseInfo info, ArrayList<PhbEntryStructure> phbEntries) {
        mRil.riljLogMtk("[MTK]< readPhbEntryResponse not implemented");
    }

    public void queryUPBCapabilityResponse(RadioResponseInfo info, ArrayList<Integer> upbCapability) {
        mRil.riljLogMtk("[MTK]< queryUPBCapabilityResponse not implemented");
    }

    public void editUPBEntryResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< editUPBEntryResponse not implemented");
    }

    public void deleteUPBEntryResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< deleteUPBEntryResponse not implemented");
    }

    public void readUPBGasListResponse(RadioResponseInfo info, ArrayList<String> gasList) {
        mRil.riljLogMtk("[MTK]< readUPBGasListResponse not implemented");
    }

    public void readUPBGrpEntryResponse(RadioResponseInfo info, ArrayList<Integer> grpEntries) {
        mRil.riljLogMtk("[MTK]< readUPBGrpEntryResponse not implemented");
    }

    public void writeUPBGrpEntryResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< writeUPBGrpEntryResponse not implemented");
    }

    public void getPhoneBookStringsLengthResponse(RadioResponseInfo info, ArrayList<Integer> stringLengthInfo) {
        mRil.riljLogMtk("[MTK]< getPhoneBookStringsLengthResponse not implemented");
    }

    public void getPhoneBookMemStorageResponse(RadioResponseInfo info, PhbMemStorageResponse phbMemStorage) {
        mRil.riljLogMtk("[MTK]< getPhoneBookMemStorageResponse not implemented");
    }

    public void setPhoneBookMemStorageResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setPhoneBookMemStorageResponse not implemented");
    }

    public void readPhoneBookEntryExtResponse(RadioResponseInfo info, ArrayList<PhbEntryExt> phbEntryExts) {
        mRil.riljLogMtk("[MTK]< readPhoneBookEntryExtResponse not implemented");
    }

    public void writePhoneBookEntryExtResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< writePhoneBookEntryExtResponse not implemented");
    }

    public void queryUPBAvailableResponse(RadioResponseInfo info, ArrayList<Integer> upbAvailable) {
        mRil.riljLogMtk("[MTK]< queryUPBAvailableResponse not implemented");
    }

    public void readUPBEmailEntryResponse(RadioResponseInfo info, String email) {
        mRil.riljLogMtk("[MTK]< readUPBEmailEntryResponse not implemented");
    }

    public void readUPBSneEntryResponse(RadioResponseInfo info, String sne) {
        mRil.riljLogMtk("[MTK]< readUPBSneEntryResponse not implemented");
    }

    public void readUPBAnrEntryResponse(RadioResponseInfo info, ArrayList<PhbEntryStructure> anrs) {
        mRil.riljLogMtk("[MTK]< readUPBAnrEntryResponse not implemented");
    }

    public void readUPBAasListResponse(RadioResponseInfo info, ArrayList<String> aasList) {
        mRil.riljLogMtk("[MTK]< readUPBAasListResponse not implemented");
    }

    public void setPhonebookReadyResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setPhonebookReadyResponse not implemented");
    }

    public void setClipResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setClipResponse not implemented");
    }

    public void getColpResponse(RadioResponseInfo info, int n, int m) {
        mRil.riljLogMtk("[MTK]< getColpResponse not implemented");
    }

    public void getColrResponse(RadioResponseInfo info, int n) {
        mRil.riljLogMtk("[MTK]< getColrResponse not implemented");
    }

    public void sendCnapResponse(RadioResponseInfo info, int n, int m) {
        mRil.riljLogMtk("[MTK]< sendCnapResponse not implemented");
    }

    public void setColpResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setColpResponse not implemented");
    }

    public void setColrResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setColrResponse not implemented");
    }

    public void queryCallForwardInTimeSlotStatusResponse(RadioResponseInfo info, ArrayList<CallForwardInfoEx> callForwardInfoExs) {
        mRil.riljLogMtk("[MTK]< queryCallForwardInTimeSlotStatusResponse not implemented");
    }

    public void setCallForwardInTimeSlotResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setCallForwardInTimeSlotResponse not implemented");
    }

    public void runGbaAuthenticationResponse(RadioResponseInfo info, ArrayList<String> resList) {
        mRil.riljLogMtk("[MTK]< runGbaAuthenticationResponse not implemented");
    }

    public void hangupAllResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< hangupAllResponse not implemented");
    }

    public void setCallIndicationResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setCallIndicationResponse");
        // acceptCallResponse() calls responseVoid(), that's the only reason it's here
        mResponse.acceptCallResponse(info);
    }

    public void emergencyDialResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< emergencyDialResponse not implemented");
    }

    public void setEccServiceCategoryResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setEccServiceCategoryResponse not implemented");
    }

    public void setEccListResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setEccListResponse not implemented");
    }

    public void currentStatusResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< currentStatusResponse not implemented");
    }

    public void eccPreferredRatResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< eccPreferredRatResponse not implemented");
    }

    public void setVoicePreferStatusResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setVoicePreferStatusResponse not implemented");
    }

    public void setEccNumResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setEccNumResponse not implemented");
    }

    public void getEccNumResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< getEccNumResponse not implemented");
    }

    public void setModemPowerResponse(RadioResponseInfo responseInfo) {
        mRil.riljLogMtk("[MTK]< setModemPowerResponse not implemented");
    }

    public void triggerModeSwitchByEccResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< triggerModeSwitchByEccResponse not implemented");
    }

    public void getATRResponse(RadioResponseInfo info, String response) {
        mRil.riljLogMtk("[MTK]< getATRResponse not implemented");
    }

    public void getIccidResponse(RadioResponseInfo info, String response) {
        mRil.riljLogMtk("[MTK]< getIccidResponse not implemented");
    }

    public void setSimPowerResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setSimPowerResponse not implemented");
    }

    public void queryNetworkLockResponse(RadioResponseInfo info, int catagory, int state, int retry_cnt, int autolock_cnt, int num_set, int total_set, int key_state) {
        mRil.riljLogMtk("[MTK]< queryNetworkLockResponse not implemented");
    }

    public void setNetworkLockResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setNetworkLockResponse not implemented");
    }

    public void supplyDepersonalizationResponse(RadioResponseInfo info, int remainingRetries) {
        mRil.riljLogMtk("[MTK]< supplyDepersonalizationResponse not implemented");
    }

    public void vsimNotificationResponse(RadioResponseInfo info, VsimEvent event) {
        mRil.riljLogMtk("[MTK]< vsimNotificationResponse not implemented");
    }

    public void vsimOperationResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< vsimOperationResponse not implemented");
    }

    public void getSmsParametersResponse(RadioResponseInfo info, SmsParams param) {
        mRil.riljLogMtk("[MTK]< getSmsParametersResponse not implemented");
    }

    public void setSmsParametersResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setSmsParametersResponse not implemented");
    }

    public void getSmsMemStatusResponse(RadioResponseInfo info, SmsMemStatus status) {
        mRil.riljLogMtk("[MTK]< getSmsMemStatusResponse not implemented");
    }

    public void setEtwsResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setEtwsResponse not implemented");
    }

    public void removeCbMsgResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< removeCbMsgResponse not implemented");
    }

    public void setGsmBroadcastLangsResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setGsmBroadcastLangsResponse not implemented");
    }

    public void getGsmBroadcastLangsResponse(RadioResponseInfo info, String langs) {
        mRil.riljLogMtk("[MTK]< getGsmBroadcastLangsResponse not implemented");
    }

    public void getGsmBroadcastActivationRsp(RadioResponseInfo info, int active) {
        mRil.riljLogMtk("[MTK]< getGsmBroadcastActivationRsp not implemented");
    }

    public void setSmsFwkReadyRsp(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setSmsFwkReadyRsp not implemented");
    }

    public void sendRequestRawResponse(RadioResponseInfo info, ArrayList<Byte> data) {
        mRil.riljLogMtk("[MTK]< sendRequestRawResponse not implemented");
    }

    public void sendRequestStringsResponse(RadioResponseInfo info, ArrayList<String> data) {
        mRil.riljLogMtk("[MTK]< sendRequestStringsResponse not implemented");
    }

    public void setResumeRegistrationResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setResumeRegistrationResponse not implemented");
    }

    public void storeModemTypeResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< storeModemTypeResponse not implemented");
    }

    public void reloadModemTypeResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< reloadModemTypeResponse not implemented");
    }

    public void getSmsRuimMemoryStatusResponse(RadioResponseInfo info, SmsMemStatus memStatus) {
        mRil.riljLogMtk("[MTK]< getSmsRuimMemoryStatusResponse not implemented");
    }

    public void setNetworkSelectionModeManualWithActResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setNetworkSelectionModeManualWithActResponse not implemented");
    }

    public void getAvailableNetworksWithActResponse(RadioResponseInfo info, ArrayList<OperatorInfoWithAct> networkInfosWithAct) {
        mRil.riljLogMtk("[MTK]< getAvailableNetworksWithActResponse not implemented");
    }

    public void getSignalStrengthWithWcdmaEcioResponse(RadioResponseInfo info, SignalStrengthWithWcdmaEcio signalStrength) {
        mRil.riljLogMtk("[MTK]< getSignalStrengthWithWcdmaEcioResponse not implemented");
    }

    public void cancelAvailableNetworksResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< cancelAvailableNetworksResponse not implemented");
    }

    public void getFemtocellListResponse(RadioResponseInfo responseInfo, ArrayList<String> femtoList) {
        mRil.riljLogMtk("[MTK]< getFemtocellListResponse not implemented");
    }

    public void abortFemtocellListResponse(RadioResponseInfo responseInfo) {
        mRil.riljLogMtk("[MTK]< abortFemtocellListResponse not implemented");
    }

    public void selectFemtocellResponse(RadioResponseInfo responseInfo) {
        mRil.riljLogMtk("[MTK]< selectFemtocellResponse not implemented");
    }

    public void queryFemtoCellSystemSelectionModeResponse(RadioResponseInfo responseInfo, int mode) {
        mRil.riljLogMtk("[MTK]< queryFemtoCellSystemSelectionModeResponse not implemented");
    }

    public void setFemtoCellSystemSelectionModeResponse(RadioResponseInfo responseInfo) {
        mRil.riljLogMtk("[MTK]< setFemtoCellSystemSelectionModeResponse not implemented");
    }

    public void setServiceStateToModemResponse(RadioResponseInfo responseInfo) {
        mRil.riljLogMtk("[MTK]< setServiceStateToModemResponse not implemented");
    }

    public void setRxTestConfigResponse(RadioResponseInfo responseInfo, ArrayList<Integer> respAntConf) {
        mRil.riljLogMtk("[MTK]< setRxTestConfigResponse not implemented");
    }

    public void getRxTestResultResponse(RadioResponseInfo responseInfo, ArrayList<Integer> respAntInfo) {
        mRil.riljLogMtk("[MTK]< getRxTestResultResponse not implemented");
    }

    public void getPOLCapabilityResponse(RadioResponseInfo responseInfo, ArrayList<Integer> polCapability) {
        mRil.riljLogMtk("[MTK]< getPOLCapabilityResponse not implemented");
    }

    public void getCurrentPOLListResponse(RadioResponseInfo responseInfo, ArrayList<String> polList) {
        mRil.riljLogMtk("[MTK]< getCurrentPOLListResponse not implemented");
    }

    public void setPOLEntryResponse(RadioResponseInfo responseInfo) {
        mRil.riljLogMtk("[MTK]< setPOLEntryResponse not implemented");
    }

    public void setFdModeResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setFdModeResponse not implemented");
    }

    public void setTrmResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setTrmResponse not implemented");
    }

    public void handleStkCallSetupRequestFromSimWithResCodeResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< handleStkCallSetupRequestFromSimWithResCodeResponse not implemented");
    }

    public void setPdnReuseResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setPdnReuseResponse not implemented");
    }

    public void setOverrideApnResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setOverrideApnResponse not implemented");
    }

    public void setPdnNameReuseResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setPdnNameReuseResponse not implemented");
    }

    public void resetRadioResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< resetRadioResponse not implemented");
    }

    public void restartRILDResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< restartRILDResponse not implemented");
    }

    public void syncDataSettingsToMdResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< syncDataSettingsToMdResponse not implemented");
    }

    public void resetMdDataRetryCountResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< resetMdDataRetryCountResponse not implemented");
    }

    public void setRemoveRestrictEutranModeResponse(RadioResponseInfo responseInfo) {
        mRil.riljLogMtk("[MTK]< setRemoveRestrictEutranModeResponse not implemented");
    }

    public void setLteAccessStratumReportResponse(RadioResponseInfo responseInfo) {
        mRil.riljLogMtk("[MTK]< setLteAccessStratumReportResponse not implemented");
    }

    public void setLteUplinkDataTransferResponse(RadioResponseInfo responseInfo) {
        mRil.riljLogMtk("[MTK]< setLteUplinkDataTransferResponse not implemented");
    }

    public void setE911StateResponse(RadioResponseInfo responseInfo) {
        mRil.riljLogMtk("[MTK]< setE911StateResponse not implemented");
    }

    public void setApcModeResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setApcModeResponse not implemented");
    }

    public void getApcInfoResponse(RadioResponseInfo info, ArrayList<Integer> cellInfo) {
        mRil.riljLogMtk("[MTK]< getApcInfoResponse not implemented");
    }

    public void dataConnectionAttachResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< dataConnectionAttachResponse not implemented");
    }

    public void dataConnectionDetachResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< dataConnectionDetachResponse not implemented");
    }

    public void resetAllConnectionsResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< resetAllConnectionsResponse not implemented");
    }

    public void setLteReleaseVersionResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setLteReleaseVersionResponse not implemented");
    }

    public void getLteReleaseVersionResponse(RadioResponseInfo info, int mode) {
        mRil.riljLogMtk("[MTK]< getLteReleaseVersionResponse not implemented");
    }

    public void reportAirplaneModeResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< reportAirplaneModeResponse not implemented");
    }

    public void reportSimModeResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< reportSimModeResponse not implemented");
    }

    public void setSilentRebootResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setSilentRebootResponse not implemented");
    }

    public void setTxPowerStatusResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setTxPowerStatusResponse not implemented");
    }

    public void setPropImsHandoverResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setPropImsHandoverResponse not implemented");
    }

    public void setOperatorConfigurationResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setOperatorConfigurationResponse not implemented");
    }

    public void setSuppServPropertyResponse(RadioResponseInfo info) {
        mRil.riljLogMtk("[MTK]< setSuppServPropertyResponse not implemented");
    }

    public void getSuppServPropertyResponse(RadioResponseInfo info, String value) {
        mRil.riljLogMtk("[MTK]< getSuppServPropertyResponse not implemented");
    }

    public void supplyDeviceNetworkDepersonalizationResponse(RadioResponseInfo info, int remainingRetries) {
        mRil.riljLogMtk("[MTK]< supplyDeviceNetworkDepersonalizationResponse not implemented");
    }
    //-- MTK Radio V3_0
}
