package mBankingBaseFactory;

import java.lang.reflect.Field;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ObjectRepository extends AppiumController {
	
	/**
	 *  Login Page
	 */
	@AndroidFindBy(id = "com.fss.pnbpsp:id/editText_login_password")
	public static MobileElement pwdBox;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/button_ok")
	public static MobileElement okBtn;
	
	@AndroidFindBy (xpath="//android.widget.Button[@text='OK']")
	protected MobileElement okbtn;      //bottomband ok
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/button_submit")
	public static MobileElement submit;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text='Are you sure want to exit?']")
	public MobileElement exitDialog;
	/**
	 * Welcome Page
	 */
	@AndroidFindBy(id = "com.fss.pnbpsp:id/imageView3")
	public MobileElement welcomeBankLogo;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/drawermenu")
	public static MobileElement menuDrawer;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/logout_btn")
	public static MobileElement logoutBtn;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/button_yes")
	public static MobileElement yesBtn;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/button_no")
	public static MobileElement noBtn;
	
	/**
	 * Add Bank Page
	 */
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/txt_SelectBank")
	public static MobileElement addbankBtn;

	@AndroidFindBy(id = "com.fss.pnbpsp:id/textView_pagetitle_header")
	public static MobileElement pageTitle;

	@AndroidFindBy(id = "com.fss.pnbpsp:id/backIcon")
	public static MobileElement inAppBackBtn;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/autoCompleteTextView1")
	public static MobileElement searchBankBox;

	@AndroidFindBy(id = "com.fss.pnbpsp:id/img_SelectBank")
	public static MobileElement addBankSelect;
	
/*	com.fss.pnbpsp:id/button_yes
	com.fss.pnbpsp:id/textView1_description*/
	
	/**
	 * SetUPI PIN
	 */
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/txt_SetPIN")
	public static MobileElement setPINBtn;

	@AndroidFindBy(id = "com.fss.pnbpsp:id/imageView_arrow")
	public static MobileElement viewArrow;

	@AndroidFindBy(id = "com.fss.pnbpsp:id/editText_debitcardno")
	public static MobileElement debitCardBox;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/textView1_expirymonth")
	public static MobileElement expMonthBox;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/textView1_expiryyear")
	public static MobileElement expYearBox;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/button_submit")
	public static MobileElement submitBtn;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/form_item_title")
	public static MobileElement NFormTitle;

	@AndroidFindBy (xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.ImageView[2]")
	public MobileElement NTickBtn;
	
	@AndroidFindBy (xpath = "//*[@class='android.widget.Button'][@text='RESEND']")
	public MobileElement resendBtn;

	@AndroidFindBy(id = "com.fss.pnbpsp:id/form_item_image")
	public static MobileElement otpTickImg;
	
	@AndroidFindBy (xpath = "//*[@class='android.widget.Button'][@text='Detecting OTP']")
	public MobileElement detectingOTP;


	/**
	 *  Balance Enquiry
	 */
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/heading")
	public static MobileElement infoHeader;
	
	/**
	 * Pay Money
	 */
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/txt_sendmony")
	public static MobileElement payMoney;
	
	@AndroidFindBy (xpath="//android.widget.TextView")
	public MobileElement PayeeOptnList;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/spinner_virtual_address")
	public static MobileElement payeeAddSpinner;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/company")
	public static MobileElement fromAcc;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/company")
	public static MobileElement payeeAddType;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/edittext_VIR_ACC_ADR_MOB1")
	public static MobileElement VirTextbox;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/edittext_AMOUNT_VIR1")
	public static MobileElement virAmt;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/editText_RemarksOptional")
	public static MobileElement payremark;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/edittext_IFSC_IIN_MMID1")
	public static MobileElement ifscfield;
	
	//com.fss.pnbpsp:id/button_submit;
	
/*	
	com.fss.pnbpsp:id/edittext_VIR_ACC_ADR_MOB1
	
	com.fss.pnbpsp:id/edittext_IFSC_IIN_MMID1
	
	com.fss.pnbpsp:id/edittext_AMOUNT1
	
	com.fss.pnbpsp:id/edittext_VIR_ACC_ADR_MOB1
	
	com.fss.pnbpsp:id/spinner_BANKNAME_IIN1
	
	android.widget.TextView
	
	com.fss.pnbpsp:id/edittext_AMOUNT1
	
	com.fss.pnbpsp:id/imgview_search1
	
	com.fss.pnbpsp:id/imgview_qrscan1
	
	*/
	
	/**
	 *  Collect Money
	 */
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/txt_CollectMoney")
	public static MobileElement collectMoney;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/spinner_from_account")
	public static MobileElement fromAccSpinner;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/spinner_from_account_VPA")
	public static MobileElement fromAccVPA;

	@AndroidFindBy(id = "com.fss.pnbpsp:id/textview_ExpDate")
	public static MobileElement expDate;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/textview_ExpTime")
	public static MobileElement expTime;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/company")
	public static MobileElement payeeVPA;
	
	@AndroidFindBy (xpath = "//*[@class='android.widget.RelativeLayout'][@index='1']")
	public MobileElement list;
	
	//android:id/pm_label
	//android:id/am_label
	/**
	 * change PIN
	 */
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/txt_ChangePIN")
	public MobileElement changepin;
	
	@AndroidFindBy(id = "com.fss.pnbpsp:id/item_textview_bankname")
	public MobileElement pinacc;
	/**
	 * 
	 */
	
	
	
	
	
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
