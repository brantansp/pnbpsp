package mBankingBaseFactory;

import java.lang.reflect.Field;

import org.openqa.selenium.By;
import org.openqa.selenium.support.How;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ObjectRepository extends AppiumController {

	/**
	 * com.fss.pnbpsp com.fss.vijayapsp com.fss.unbipsp
	 */

	/**
	 * Login Page
	 */
	

	public static final String packageName = "com.fss.vijayapsp";
	
	@AndroidFindBy(id = packageName + ":id/editText_login_password")
	public static MobileElement pwdBox;
	
	@AndroidFindBy(id = packageName + ":id/button_ok")
	public static MobileElement okBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	protected MobileElement okbtn; // bottomband ok

	@AndroidFindBy(id = packageName + ":id/button_submit")
	public static MobileElement submit;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Are you sure want to exit?']")
	public MobileElement exitDialog;
	/**
	 * Welcome Page
	 */
	@AndroidFindBy(id = packageName + ":id/imageView3")
	public MobileElement welcomeBankLogo;

	@AndroidFindBy(id = packageName + ":id/drawermenu")
	public static MobileElement menuDrawer;

	@AndroidFindBy(id = packageName + ":id/logout_btn")
	public static MobileElement logoutBtn;

	@AndroidFindBy(id = packageName + ":id/button_yes")
	public static MobileElement yesBtn;

	@AndroidFindBy(id = packageName + ":id/button_no")
	public static MobileElement noBtn;

	/**
	 * Add Bank Page
	 */

	@AndroidFindBy(id = packageName + ":id/spinner_virtual_address")
	public static MobileElement selectAcc;

	@AndroidFindBy(id = packageName + ":id/txt_SelectBank")
	public static MobileElement addbankBtn;

	@AndroidFindBy(id = packageName + ":id/textView_pagetitle_header")
	public static MobileElement pageTitle;

	@AndroidFindBy(id = packageName + ":id/backIcon")
	public static MobileElement inAppBackBtn;

	@AndroidFindBy(id = packageName + ":id/autoCompleteTextView1")
	public static MobileElement searchBankBox;

	@AndroidFindBy(id = packageName + ":id/img_SelectBank")
	public static MobileElement addBankSelect;

	@AndroidFindBy(id = packageName + ":id/company")
	public static MobileElement selectAc;

	@AndroidFindBy(id = "android:id/button1")
	public static MobileElement ok;

	/*
	 * com.fss.vijayapsp:id/button_yes
	 * com.fss.vijayapsp:id/textView1_description
	 */

	/**
	 * SetUPI PIN
	 */

	@AndroidFindBy(id = packageName + ":id/txt_SetPIN")
	public static MobileElement setPINBtn;

	@AndroidFindBy(id = packageName + ":id/imageView_arrow")
	public static MobileElement viewArrow;

	@AndroidFindBy(id = packageName + ":id/editText_debitcardno")
	public static MobileElement debitCardBox;

	@AndroidFindBy(id = packageName + ":id/textView1_expirymonth")
	public static MobileElement expMonthBox;

	@AndroidFindBy(id = packageName + ":id/textView1_expiryyear")
	public static MobileElement expYearBox;

	@AndroidFindBy(id = packageName + ":id/button_submit")
	public static MobileElement submitBtn;

	@AndroidFindBy(id = packageName + ":id/form_item_title")
	public static MobileElement NFormTitle;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.ImageView[2]")
	public MobileElement NTickBtn;

	@AndroidFindBy(xpath = "//*[@class='android.widget.Button'][@text='RESEND']")
	public MobileElement resendBtn;

	@AndroidFindBy(id = packageName + ":id/form_item_image")
	public static MobileElement otpTickImg;

	public static String otpTickImgS= packageName + ":id/form_item_image";
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.Button'][@text='Detecting OTP']")
	public MobileElement detectingOTP;

	/**
	 * Balance Enquiry
	 */

	@AndroidFindBy(id = packageName + ":id/heading")
	public static MobileElement infoHeader;

	/**
	 * Pay Money
	 */

	@AndroidFindBy(id = packageName + ":id/txt_sendmony")
	public static MobileElement payMoney;

	@AndroidFindBy(xpath = "//android.widget.TextView")
	public MobileElement PayeeOptnList;

	@AndroidFindBy(id = packageName + ":id/spinner_virtual_address")
	public static MobileElement payeeAddSpinner;

	@AndroidFindBy(id = packageName + ":id/company")
	public static MobileElement fromAcc;

	@AndroidFindBy(id = packageName + ":id/company")
	public static MobileElement payeeAddType;

	@AndroidFindBy(id = packageName + ":id/edittext_VIR_ACC_ADR_MOB1")
	public static MobileElement VirTextbox;

	@AndroidFindBy(id = packageName + ":id/edittext_AMOUNT_VIR1")
	public static MobileElement virAmt;

	@AndroidFindBy(id = packageName + ":id/editText_RemarksOptional")
	public static MobileElement payremark;

	@AndroidFindBy(id = packageName + ":id/edittext_IFSC_IIN_MMID1")
	public static MobileElement ifscfield;

	// com.fss.vijayapsp:id/button_submit;

	/*
	 * com.fss.vijayapsp:id/edittext_VIR_ACC_ADR_MOB1
	 * 
	 * com.fss.vijayapsp:id/edittext_IFSC_IIN_MMID1
	 * 
	 * com.fss.vijayapsp:id/edittext_AMOUNT1
	 * 
	 * com.fss.vijayapsp:id/edittext_VIR_ACC_ADR_MOB1
	 * 
	 * com.fss.vijayapsp:id/spinner_BANKNAME_IIN1
	 * 
	 * android.widget.TextView
	 * 
	 * com.fss.vijayapsp:id/edittext_AMOUNT1
	 * 
	 * com.fss.vijayapsp:id/imgview_search1
	 * 
	 * com.fss.vijayapsp:id/imgview_qrscan1
	 * 
	 */

	/**
	 * Collect Money
	 */

	@AndroidFindBy(id = packageName + ":id/txt_CollectMoney")
	public static MobileElement collectMoney;

	@AndroidFindBy(id = packageName + ":id/spinner_from_account")
	public static MobileElement fromAccSpinner;

	@AndroidFindBy(id = packageName + ":id/spinner_from_account_VPA")
	public static MobileElement fromAccVPA;

	@AndroidFindBy(id = packageName + ":id/textview_ExpDate")
	public static MobileElement expDate;

	@AndroidFindBy(id = packageName + ":id/textview_ExpTime")
	public static MobileElement expTime;

	@AndroidFindBy(id = packageName + ":id/company")
	public static MobileElement payeeVPA;

	@AndroidFindBy(xpath = "//*[@class='android.widget.RelativeLayout'][@index='1']")
	public MobileElement list;

	// android:id/pm_label
	// android:id/am_label
	/**
	 * change PIN
	 */

	@AndroidFindBy(id = packageName + ":id/txt_ChangePIN")
	public MobileElement changepin;

	@AndroidFindBy(id = packageName + ":id/item_textview_bankname")
	public MobileElement pinacc;

	/**
	 * Silent SMS page
	 */

	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView'][@index='0']")
	public static MobileElement textViewNotes;

	@AndroidFindBy(xpath = "//*[@class='android.widget.Button'][@index='0']")
	public MobileElement clickMe;

	@AndroidFindBy(id = packageName + ":id/editText_FirstName")
	public MobileElement firstName;

	@AndroidFindBy(id = packageName + ":id/editText_LastName")
	public MobileElement lastName;

	@AndroidFindBy(id = packageName + ":id/auto_email")
	public MobileElement autoEmail;

	@AndroidFindBy(id = packageName + ":id/textview_DOB")
	public MobileElement dob;

	@AndroidFindBy(id = "android:id/date_picker_header_year")
	public MobileElement yearHeader;

	@AndroidFindBy(xpath = "//*[@class='android.widget.RadioButton'][@text='Male']")
	public static MobileElement genderMale;

	@AndroidFindBy(xpath = "//*[@class='android.widget.RadioButton'][@text='Female']")
	public static MobileElement genderFemale;

	@AndroidFindBy(xpath = "//*[@class='android.widget.Button'][@text='CONFIRM REGISTRATION']")
	public static MobileElement confirmRegistration;

	@AndroidFindBy(id = packageName + ":id/editText_AadhaarNumber")
	public MobileElement aadhar;

	@AndroidFindBy(id = packageName + ":id/editText_password")
	public MobileElement pwd;

	@AndroidFindBy(id = packageName + ":id/editText_ConfirmPassword")
	public MobileElement pwdRenter;

	@AndroidFindBy(id = packageName + ":id/termsCheck")
	public static MobileElement acceptTerms;

	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView'][@text='I accept terms and conditions']")
	public static MobileElement terms;

	/**
	 * AddVirAcc
	 */

	@AndroidFindBy(id = "com.fss.pnbpsp:id/spinner_for_psphandle")
	public static MobileElement psphandle;

	@AndroidFindBy(id = packageName + ":id/textView_timebound_limit")
	public static MobileElement timeLimit;

	@AndroidFindBy(id = "android:id/date_picker_header_date")
	public static MobileElement pickedDate;

	@AndroidFindBy(id = "android:id/prev")
	public static MobileElement prevMnth;

	@AndroidFindBy(id = "android:id/next")
	public static MobileElement nextMnth;

	@AndroidFindBy(id = packageName + ":id/editText_amount_bound_limit")
	public static MobileElement virAmtLimit;

	/**
	 * Manage Accounts
	 */

	@AndroidFindBy(id = packageName + ":id/editText_qr_input_amount")
	public static MobileElement qrTxnAmt;

	@AndroidFindBy(id = packageName + ":id/editText_qr_input_minamount")
	public static MobileElement qrMinAmt;

	@AndroidFindBy(id = packageName + ":id/editText_qr_input_remarks")
	public static MobileElement qrRemark;

	@AndroidFindBy(id = packageName + ":id/imageView1_qrcodeimage")
	public static MobileElement qrScanImage;

	public static String qrImageView = packageName + ":id/imageView_qrgenerate";

	public static String qrEditImage = packageName + ":id/imageView_edit";

	public static String qrDeleteImage = packageName + ":id/imageView_delete";

	@AndroidFindBy(id = packageName + ":id/imageView_editprofile")
	public static MobileElement viewEditProfile;

	@AndroidFindBy(id = packageName + ":id/editText_available_limit")
	public static MobileElement qrVirAmtLimit;

	/**
	 * Menu Drawer
	 */

	@AndroidFindBy(id = packageName + ":id/startdate_cal")
	public static MobileElement complainStartDate;

	@AndroidFindBy(id = packageName + ":id/enddate_cal")
	public static MobileElement complainEndDate;

	@AndroidFindBy(id = packageName + ":id/submit_tran_status_btn")
	public static MobileElement complainSubmit;

	/**
	 * Change Password
	 */

	@AndroidFindBy(id = packageName + ":id/editText_oldpassword")
	public static MobileElement changePwdOld;

	@AndroidFindBy(id = packageName + ":id/editText_newpassword")
	public static MobileElement changePwdNew;

	@AndroidFindBy(id = packageName + ":id/editText_confirmpassword")
	public static MobileElement changePwdCfm;

	/**
	 * Edit Profile
	 */

	@AndroidFindBy(id = packageName + ":id/editIcon")
	public static MobileElement editProfile;

	/**
	 * Participants
	 */

	@AndroidFindBy(id = packageName + ":id/fab")
	public static MobileElement addParticipant;

	@AndroidFindBy(id = packageName + ":id/editText_VirAddress")
	public static MobileElement addParticipantVirAdd;

	@AndroidFindBy(id = packageName + ":id/editText_PayeeNickName")
	public static MobileElement addParticipantPayeeNickName;

	@AndroidFindBy(id = packageName + ":id/editText_PayeeAddress")
	public static MobileElement addParticipantAddr;

	@AndroidFindBy(id = packageName + ":id/editText_IFSC_code")
	public static MobileElement addParticipantIFSC_code;

}
