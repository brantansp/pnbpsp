package mBankingBaseFactory;

import java.lang.reflect.Field;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ObjectRepository extends AppiumController {
	
	/**
	 * com.fss.pnbpsp
	 * com.fss.vijayapsp
	 * com.fss.unbipsp
	 */
	
	/**
	 *  Login Page
	 */
	@AndroidFindBy(id = "com.fss.vijayapsp:id/editText_login_password")
	public static MobileElement pwdBox;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/button_ok")
	public static MobileElement okBtn;
	
	@AndroidFindBy (xpath="//android.widget.Button[@text='OK']")
	protected MobileElement okbtn;      //bottomband ok
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/button_submit")
	public static MobileElement submit;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Are you sure want to exit?']")
	public MobileElement exitDialog;
	/**
	 * Welcome Page
	 */
	@AndroidFindBy(id = "com.fss.vijayapsp:id/imageView3")
	public MobileElement welcomeBankLogo;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/drawermenu")
	public static MobileElement menuDrawer;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/logout_btn")
	public static MobileElement logoutBtn;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/button_yes")
	public static MobileElement yesBtn;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/button_no")
	public static MobileElement noBtn;
	
	/**
	 * Add Bank Page
	 */
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/spinner_virtual_address")
    public static MobileElement selectAcc;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/txt_SelectBank")
	public static MobileElement addbankBtn;

	@AndroidFindBy(id = "com.fss.vijayapsp:id/textView_pagetitle_header")
	public static MobileElement pageTitle;

	@AndroidFindBy(id = "com.fss.vijayapsp:id/backIcon")
	public static MobileElement inAppBackBtn;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/autoCompleteTextView1")
	public static MobileElement searchBankBox;

	@AndroidFindBy(id = "com.fss.vijayapsp:id/img_SelectBank")
	public static MobileElement addBankSelect;
	
	@AndroidFindBy(id ="com.fss.vijayapsp:id/company")
	public static MobileElement selectAc;
	
	@AndroidFindBy(id="android:id/button1")
    public static MobileElement ok;
	
/*	com.fss.vijayapsp:id/button_yes
	com.fss.vijayapsp:id/textView1_description*/
	
	/**
	 * SetUPI PIN
	 */
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/txt_SetPIN")
	public static MobileElement setPINBtn;

	@AndroidFindBy(id = "com.fss.vijayapsp:id/imageView_arrow")
	public static MobileElement viewArrow;

	@AndroidFindBy(id = "com.fss.vijayapsp:id/editText_debitcardno")
	public static MobileElement debitCardBox;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/textView1_expirymonth")
	public static MobileElement expMonthBox;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/textView1_expiryyear")
	public static MobileElement expYearBox;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/button_submit")
	public static MobileElement submitBtn;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/form_item_title")
	public static MobileElement NFormTitle;

	@AndroidFindBy (xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.ImageView[2]")
	public MobileElement NTickBtn;
	
	@AndroidFindBy (xpath = "//*[@class='android.widget.Button'][@text='RESEND']")
	public MobileElement resendBtn;

	@AndroidFindBy(id = "com.fss.vijayapsp:id/form_item_image")
	public static MobileElement otpTickImg;
	
	@AndroidFindBy (xpath = "//*[@class='android.widget.Button'][@text='Detecting OTP']")
	public MobileElement detectingOTP;


	/**
	 *  Balance Enquiry
	 */
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/heading")
	public static MobileElement infoHeader;
	
	/**
	 * Pay Money
	 */
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/txt_sendmony")
	public static MobileElement payMoney;
	
	@AndroidFindBy (xpath="//android.widget.TextView")
	public MobileElement PayeeOptnList;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/spinner_virtual_address")
	public static MobileElement payeeAddSpinner;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/company")
	public static MobileElement fromAcc;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/company")
	public static MobileElement payeeAddType;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/edittext_VIR_ACC_ADR_MOB1")
	public static MobileElement VirTextbox;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/edittext_AMOUNT_VIR1")
	public static MobileElement virAmt;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/editText_RemarksOptional")
	public static MobileElement payremark;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/edittext_IFSC_IIN_MMID1")
	public static MobileElement ifscfield;
	
	//com.fss.vijayapsp:id/button_submit;
	
/*	
	com.fss.vijayapsp:id/edittext_VIR_ACC_ADR_MOB1
	
	com.fss.vijayapsp:id/edittext_IFSC_IIN_MMID1
	
	com.fss.vijayapsp:id/edittext_AMOUNT1
	
	com.fss.vijayapsp:id/edittext_VIR_ACC_ADR_MOB1
	
	com.fss.vijayapsp:id/spinner_BANKNAME_IIN1
	
	android.widget.TextView
	
	com.fss.vijayapsp:id/edittext_AMOUNT1
	
	com.fss.vijayapsp:id/imgview_search1
	
	com.fss.vijayapsp:id/imgview_qrscan1
	
	*/
	
	/**
	 *  Collect Money
	 */
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/txt_CollectMoney")
	public static MobileElement collectMoney;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/spinner_from_account")
	public static MobileElement fromAccSpinner;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/spinner_from_account_VPA")
	public static MobileElement fromAccVPA;

	@AndroidFindBy(id = "com.fss.vijayapsp:id/textview_ExpDate")
	public static MobileElement expDate;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/textview_ExpTime")
	public static MobileElement expTime;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/company")
	public static MobileElement payeeVPA;
	
	@AndroidFindBy (xpath = "//*[@class='android.widget.RelativeLayout'][@index='1']")
	public MobileElement list;
	
	//android:id/pm_label
	//android:id/am_label
	/**
	 * change PIN
	 */
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/txt_ChangePIN")
	public MobileElement changepin;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/item_textview_bankname")
	public MobileElement pinacc;
	
	/**
	 * Silent SMS page 
	 */
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.TextView'][@index='0']")
    public static MobileElement textViewNotes;	
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][@index='0']")
	public MobileElement clickMe;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/editText_FirstName")
	public MobileElement firstName;
		
	@AndroidFindBy(id = "com.fss.vijayapsp:id/editText_LastName")
	public MobileElement lastName;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/auto_email")
	public MobileElement autoEmail;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/textview_DOB")
	public MobileElement dob;
	
	@AndroidFindBy(id = "android:id/date_picker_header_year")
	public MobileElement yearHeader;
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.RadioButton'][@text='Male']")
    public static MobileElement genderMale;	
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.RadioButton'][@text='Female']")
    public static MobileElement genderFemale;	
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][@text='CONFIRM REGISTRATION']")
    public static MobileElement confirmRegistration;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/editText_AadhaarNumber")
	public MobileElement aadhar;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/editText_password")
	public MobileElement pwd;
	
	@AndroidFindBy(id = "com.fss.vijayapsp:id/editText_ConfirmPassword")
	public MobileElement pwdRenter;
	
	@AndroidFindBy(id ="com.fss.vijayapsp:id/termsCheck")
    public static MobileElement acceptTerms;
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.TextView'][@text='I accept terms and conditions']")
    public static MobileElement terms;
	
	/**
	 * AddVirAcc
	 */
	
	@AndroidFindBy(id="com.fss.pnbpsp:id/spinner_for_psphandle")
    public static MobileElement psphandle;
	                                       
	@AndroidFindBy(id="com.fss.vijayapsp:id/textView_timebound_limit")
	 public static MobileElement timeLimit;
	
	@AndroidFindBy(id="android:id/date_picker_header_date")
	public static MobileElement pickedDate;
	
	@AndroidFindBy(id="android:id/prev")
	public static MobileElement prevMnth;
	
	@AndroidFindBy(id="android:id/next")
	public static MobileElement nextMnth;
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_amount_bound_limit")
	public static MobileElement virAmtLimit; 
	
	/**
	 *Manage Accounts  
	 */
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_qr_input_amount")
	public static MobileElement qrTxnAmt; 
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_qr_input_minamount")
	public static MobileElement qrMinAmt;	
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_qr_input_remarks")
	public static MobileElement qrRemark;
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/imageView1_qrcodeimage")
	public static MobileElement qrScanImage;
	
	public static String qrImageView= "com.fss.vijayapsp:id/imageView_qrgenerate";
	
	public static String qrEditImage= "com.fss.vijayapsp:id/imageView_edit";
	
	public static String qrDeleteImage="com.fss.vijayapsp:id/imageView_delete";
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/imageView_editprofile")
	public static MobileElement  viewEditProfile;
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_available_limit")
	public static MobileElement qrVirAmtLimit; 
	
	/**
	 * Menu Drawer
	 */
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/startdate_cal")
	public static MobileElement complainStartDate; 
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/enddate_cal")
	public static MobileElement complainEndDate; 
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/submit_tran_status_btn")
	public static MobileElement complainSubmit; 
	
	/**
	 * Change Password
	 */
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_oldpassword")
	public static MobileElement changePwdOld; 
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_newpassword")
	public static MobileElement changePwdNew; 
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_confirmpassword")
	public static MobileElement changePwdCfm; 
	
	/**
	 * Edit Profile
	 */
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editIcon")
	public static MobileElement editProfile; 
	
	/**
	 * Participants
	 */
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/fab")
	public static MobileElement addParticipant; 
	
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_VirAddress")
	public static MobileElement addParticipantVirAdd; 
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_PayeeNickName")
	public static MobileElement addParticipantPayeeNickName; 
	
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_PayeeAddress")
	public static MobileElement addParticipantAddr; 
	
	@AndroidFindBy(id="com.fss.vijayapsp:id/editText_IFSC_code")
	public static MobileElement addParticipantIFSC_code; 

	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 */
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][@text='Home']")
	public static MobileElement homeBtn;
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][@text='Help']")
	public MobileElement helpBtn;
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][2]")
	public static MobileElement okBtnLogin;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Balance Enquiry']")
	public MobileElement Balance_Enquiry;
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][@text='Confirm']")
	public MobileElement confirmBtn;
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][@text='Cancel']")
	public MobileElement cancelBtn;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Fund Transfer - Within Bank']")
	public MobileElement ftWb;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Fund Transfer - Other Bank']")
	public MobileElement ftOb;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Request to Bank']")
	public MobileElement reqBnk;

	@AndroidFindBy (xpath="//android.widget.EditText[@text='mPIN']")
	protected static MobileElement mPINBox;
	
	@AndroidFindBy (xpath="//android.widget.EditText[@text='Application PIN']")
	protected static MobileElement Application_PIN;
	
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][2]")
	public static MobileElement loginOkBtn;  //login page ok
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Transaction ID']")
	public MobileElement AcknPage;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Fund Transfer - Within Bank']")
	public MobileElement ftHeader;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Mobile-to-Mobile']")
	public MobileElement m2mBtn;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Mobile-to-Account']")
	public MobileElement m2aBtn;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Quick Fund Transfer']")
	public MobileElement qFt;

	@AndroidFindBy (xpath="//android.widget.TextView[@text='Beneficiary Registration']")
	public MobileElement BenReg;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Beneficiary Payment']")
	public MobileElement BenPay;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Beneficiary Details']")
	public MobileElement BenDetl;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Beneficiary Deregistration']")
	public MobileElement BenDereg;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Select A/C']")
	public MobileElement selectAcPage;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Beneficiary Mobile No.']")
	protected MobileElement benMobNo;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Amount (Rs.)']")
	protected MobileElement amnt;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Remarks']")
	protected MobileElement remarks;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Mobile No.']")
	protected MobileElement mobNo;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Nickname']")
	protected MobileElement nickname;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Beneficiary A/C List']")
	public MobileElement benACList;
	
	@AndroidFindBy(xpath="//*[@text='Yes']")
	public MobileElement exitYesBtn;
	
	@AndroidFindBy(xpath="//*[@text='No']")
	public MobileElement exitNoBtn;
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][@text='Change mPIN']")
	public MobileElement changemPINBtn;
	
	@AndroidFindBy(className= "android.widget.EditText[1]")
	public static MobileElement oldmPIN;
	
	@AndroidFindBy(className= "android.widget.EditText[2]")
	public MobileElement newmPIN;
	
	@AndroidFindBy(className= "android.widget.EditText[2]")
	public MobileElement reEntermPIN;
	
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][@text='Exit']")
	public static MobileElement exitBtn;
	
	//com.fss.united:id/Gridtext
	//@AndroidFindBy(id = "com.fss.united:id/Gridtext")
	@AndroidFindBy (xpath="//android.widget.TextView[@index='0']")
	public MobileElement welcomeText;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@index='1']")
	public MobileElement helpTextView;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Banking']")
	public static MobileElement Banking;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	public MobileElement headerText;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='24X7Fund Transfer']")
	public MobileElement impsBtn;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Payment']")
	public MobileElement paymentBtn;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Other Services']")
	public MobileElement otherServicesbtn;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='My Setup']")
	public MobileElement mySetupBtn;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Inbox']")
	public MobileElement inboxBtn;
	
	@AndroidFindBy(id = "com.fss.united:id/header")
	public MobileElement logoHeader;
	
	@AndroidFindBy(className= "android.widget.ImageView")
	public MobileElement logoView;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	public MobileElement loginBox;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='About Us']")
	public MobileElement aboutUsLink;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Forgot Password']")
	public MobileElement forgotPasswordLink;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Products']")
	public MobileElement productsLink;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Refer']")
	public MobileElement referLink;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='ePassbook']")
	public MobileElement ePassbookLink;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Feedback']")
	public MobileElement feedbackLink;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Locator']")
	public MobileElement locatorLink;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Wallet']")
	public MobileElement walletLink;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@index='0']")
	public MobileElement acList;

	
}
