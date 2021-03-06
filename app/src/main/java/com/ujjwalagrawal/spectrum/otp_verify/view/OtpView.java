package com.ujjwalagrawal.spectrum.otp_verify.view;


import com.ujjwalagrawal.spectrum.otp_verify.model.OtpResponse;

/**
 * Created by ujjwal on 24/10/17.
 */

public interface OtpView {

    void showProgressBar(boolean show);
    void showMessage(String message);
    void OtpStatus(OtpResponse otpResponse);
    void checkNetwork();
    void verifyBtnClickable();
}
