package com.java.utils;

import java.util.Arrays;
import java.util.List;

public final class Constants {

	public static final List<String> BASE_PRODUCT_NAMES = Arrays.asList("SIMODIS", "MIRAVIS DUO", "INCIPIO", "CHESS");

	public static final class StatusCode {

		public static final long noContent = 204;
		public static final long otpExpired = 410;
		public static final long invalidOtp = 422;
		public static final long loggedInOtherDevice = 103;
		public static final long badRequest = 400;
		public static final long unAuthorized = 401;
		public static final long notFound = 404;
		public static final long methodNotAllowed = 405;
		public static final long success = 200;
		public static final long error = 500;
		public static final long fileNotFound = 104;
		public static final long otpCode = 122;
		public static final long loggedOut = 601;
		public static final long notExits = 201;
		public static final long logout = 201;
		public static final long exsits = 409;
		
		public static final long partialSuccess = 206;


		public static final long STATUS_CODE_NO_ACTIVE_PROGRAMS = 404;
		public static final long STATUS_CODE_NO_ACTIVE_PRODUCTS = 404;
		public static final long STATUS_PRODUCT_ALREADY_SCANNED = 409;

		/** Pay out codes */
		public static final long payout_code = 400;

		public static final long recalim_code = 444;
		public static final long scan_limit_exceed = 300;

	}

	public static final class Messages {
		
		
	
		    public static final String alredyScanningInProgress = "Scanning is already in progress.";
		    public static final String bothScannerConnected = "Both front and back scanners connected and waiting for input.";
		    public static final String onlyFrontConnected = "Only front scanner connected. Waiting for back scanner.";
		    public static final String onlyBackConnected = "Only back scanner connected. Waiting for front scanner.";
		    public static final String bothScannerFailed = "Both scanners failed to connect.";
		    public static final String errorConnection = "Error connecting to scanners.";
		

		

		public static final String invalidAuthKey = "Invalid Authorization.";
		public static final String authKeyNotFound = "Authorization Key Not Found.";
		public static final String emptyRequestBody = "Empty Request Body";
		public static final String emptyDeviceType = "Empty Device Type";
		public static final String emptyEmployeeId = "Empty Employee Id";
		public static final String emptyFcmToken = "Empty FCM Token";
		public static final String emptyDeviceId = "Empty Device Id";
		public static final String loggedOutMessage = "User Logged Out";
		public static final String noUserFound = "User not found.";
		public static final String invaidCredentials = "Invalid Credentials.";
		public static final String noOtpFound = "OTP Not Generated";

		public static final String otpExpired = "OTP Expired";
		public static final String noActiveUserFound = "No Active User Found";
		public static final String invalidOTP = "Invalid OTP";
		public static final String error = "An unexpected error occurred";
		public static final String success = "Success";
		public static final String emptyMobileNumber = "Empty Mobile Number";
		public static final String emptyPassword = "Password Was Empty";
		public static final String emptyList = "Empty List";
		public static final String fileNotFound = "Please Upload The File";
		public static final String useNotInRange = "User Not In Range";
		public static final String loggedInAnotherDevice = "Already logged in another device. Do you want to procced.";
		public static final String qrCodeAlreadyScanned = "Qr Code Was Already Scanned";
		public static final String idnotfound = "Id Not Found.";
		public static final String notEligibleForGift = "Not Eligible For Gift";
		public static final String notEligibleForLoyalty = "Not Eligible For Loyalty Program";
		public static final String badRequest = "Bad Request";
		public static final String notransaction = "Data not available!";

		public static final String NO_ACTIVE_PROGRAMS_FOUND = "No active programs found.";
		public static final String NO_ACTIVE_PRODUCTS_FOUND = "No active products found.";
		public static final String PRODUCT_ALREADY_SCANNED = "Product Already Scanned.";
		public static final String PRODUCT_NOT_SCANNED = "Product Not Scanned.";

		public static final String invalid_input = "JSON data is missing!";

		/** Pay out Messages */
		public static final String mobleNumberPayout_msg = "For mobile payout, mobile_number is required.";
		public static final String upiPayout_msg = "UPI payout requires UPI ID.";
		public static final String bankPayout_msg = "Bank payout requires IFSC and account number.";

		public static final String recalim_msg = "The Money Will Be Credited In 48 Hours!";
		public static final String claim_msg = "Trasaction Happened Already.";

		public static final String product_scan_limit = "You've reached max scanning limit for this product,Please Scan Other Product.";
		public static final String scanning_limit = "You've reached max scanning limit of products to get reward.";
		public static final String cash_limit = "You've reached maximum cash limit of 1000 Rs.";
		public static final String ml_limit = "You've reached max ML limit of products to get reward.";

		public static final String upi_lmit_exceed = "UPI ID limit exceeded. Use another UPI ID.";
		public static final String bank_ac_lmit_exceed = "Bank Account limit exceeded. Use another Account.";
		public static final String invalid_upiId = "Invalid UPI ID. Please use your first registered UPI ID:";
		public static final String invalid_bank_no = "Invalid Bank Account. Please use your first registered Bank AC:";
		public static final String mobile_lmit_exceed = "Mobile limit exceeded. Use another Number.";
		
		
		public static final String mobile_upi_lmit_exceed = "The cash redemption limit for this mobile-linked UPI ID has been exceeded.";

	}

	public static final class ScanCount {
		public static final Long growerMaxScansOnProductNdSKU = 5l;
		public static final Long growerTotalMaxScanCount = 10l;
	}

	public static final class AcerLimitation {
		public static final String ml_120 = "0.12L";
		public static final String ml_240 = "0.24L";
		public static final String ml_1000 = "1L";
	}

	public static final class CashBackProducts {
		public static final String incipio = "INCIPIO";
		public static final String simodis = "SIMODIS";
		public static final String miravis = "MIRAVIS";
	}

	public static final class CultarProducts {
		public static final String cultar_1000_ml = "CULTAR 1 L";
		public static final String cultar_5000_ml = "CULTAR 5 L";
	}
}
