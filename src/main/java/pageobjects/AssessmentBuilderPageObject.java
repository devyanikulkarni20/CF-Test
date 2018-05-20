package pageobjects;

import core.CoreTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssessmentBuilderPageObject extends CoreTest
{
    public AssessmentBuilderPageObject(RemoteWebDriver driver)
{
    this.driver = driver;
    PageFactory.initElements(driver, this);
}

    //Common Assessment Builder page objects
    @FindBy(className="notranslate")
    WebElement AddQuestionInstruction;

    @FindBy(className="attach-image")
    WebElement QiAttachImage;

    @FindBy(className="resource-list-item")
    WebElement SelectImageFromlist;

    @FindBy(css = ".cf-button.button-primary.mod-no-form-fill")
    WebElement AttachImageButton;

    @FindBy(className="editable-title__title-input")
    WebElement ABTitleField;

    @FindBy(css="button.builder-header__menu-button")
    WebElement ABHamburgerIcon;

    @FindBy(css=".save.button-tertiary.light")
    WebElement HamburgerSaveButton;

    @FindBy(className="rw-dropdownlist")
    WebElement SelectQuestiontypeDropdownButton;

    @FindBy(css="#root > div > div > main > div.cf-element-layout--two-col-00-11__content-wrapper > section > div > ul > div.list-item.section-footer > div > div.section-footer > button.cf-button.button-secondary.p-icon-plus.mod-no-form-fill > span")
    WebElement AddQuestionButton;

    @FindBy(className="react-toggle-track-x")
    WebElement ToggleButton;

    //MCQ Question page objects

    @FindBy(css="#root > div > div > main > div.cf-element-layout--two-col-00-11__content-wrapper > section > div > ul > div:nth-child(2) > div > div.cf-assessment-question-container__body-container > div > div > div.cfab-question-content__question-and-options > div > div.answer-options-container > ol > li:nth-child(1) > div > div > div.secondary-options-container > span > button")
    WebElement CorectOptionButton;

    //SHORT ANSWER type question page objects

    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[1]/div/div/div[2]/div/div[1]/label/input")
    WebElement CheckCaseSensitiveAnswers;

    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[1]/div/div/div[2]/div/div[2]/label/input")
    WebElement CheckMaxLengthChar;

    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div/input")
    WebElement MaxCharTextBox;

    @FindBy(className="feedback-text-input")
    WebElement ShortAnswerFeedbackField;

    //MATH QUESTION type question page objects

    @FindBy(className="react-toggle-thumb")
    WebElement Numbertolerance;

    @FindBy(css="#react-aria-modal-dialog > div > div > footer > div > button.cf-button.button-primary.caution.mod-no-form-fill > span")
    WebElement MQAddOptions;

    @FindBy(className="cf-assessment-answer-option-number-input")
    WebElement TextIntoOptions;

    //True False page objects

    @FindBy(css=".cf-button.button-secondary.mod-no-form-fill.true-false-button")
    WebElement TrueButton;

    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/input")
    WebElement TrueFeedback;

    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/input")
    WebElement FalseFeedback;

    //ESSAY QUESTION Page objects

    @FindBy(css=".toggle.max-character-length-input")
    WebElement MaxWordCountButton;

    @FindBy(className="rw-input")
    WebElement MaxWordCountBox;

    //Match List page objects

    //First Choicetextbox
    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/table/thead/tr/th[2]/div/div/div/div[2]/div[2]/div")
    WebElement CH1Textbox;
    //Second choice textbox
    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/table/thead/tr/th[3]/div/div/div/div[2]/div[2]/div")
    WebElement CH2Textbox;

    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[1]/div/div/div/div[2]/div[2]/div")
    WebElement Op1Textbox;

    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/table/tbody/tr[2]/td[1]/div/div/div/div[2]/div[2]/div")
    WebElement Op2Textbox;

    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[2]/div/input")
    WebElement Op1Radiobutton11;

    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/table/tbody/tr[2]/td[3]/div/input")
    WebElement Op2Radiobutton22;

    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[1]/div[2]/input")
    WebElement op1FeedbackField;

    @FindBy(xpath=".//*[@id='root']/div[1]/div/main/div[2]/section/div/ul/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/table/tbody/tr[2]/td[1]/div[2]/input")
    WebElement op2FeedbackField;

    public void enterQuestionInstruction(String QIText)
    {
        //wait.forElementVisible(AddQuestionInstruction);
        AddQuestionInstruction.clear();
        //AddQuestionInstruction.click();
        AddQuestionInstruction.sendKeys(QIText);
    }

    public void attchedImageToQI()
    {
       // wait.forElementVisible(QiAttachImage);
        QiAttachImage.click();
    }

    public void selectImageFromAttachimageList()
    {
       // wait.forElementVisible(SelectImageFromlist);
        SelectImageFromlist.click();
    }

    public void clickOnAttachImageButton()
    {
        //wait.forElementClickable(AttachImageButton);
        AttachImageButton.click();
    }

    public void updateAssessmentTitle(String TitleText)
    {
        //wait.forElementVisible(ABTitleField);
        ABTitleField.clear();
        ABTitleField.sendKeys(TitleText);
    }

    public void clickOnHamburgerIcon()
    {
        //wait.forElementVisible(ABHamburgerIcon);
        ABHamburgerIcon.click();
    }
    public void saveAssessmentManually()
    {
        //wait.forElementVisible(HamburgerSaveButton);
        HamburgerSaveButton.click();
    }
    public void clickOnAddQuestionButtonFromBuilder()
    {
        //wait.forElementVisible(AddQuestionButton);
        AddQuestionButton.click();
    }
    public void clickonSelectQuestionDropdown()
    {
       // wait.forElementVisible(SelectQuestiontypeDropdownButton);
        SelectQuestiontypeDropdownButton.click();
    }
    public void enableFeedbackButton()
    {
        //wait.forElementVisible(ToggleButton);
        ToggleButton.click();
    }

    //MCQ Methods

    public void ClickOnCorrectOptionButton()
    {
        CorectOptionButton.click();
    }

    //SHORT ANSWER type question methods

    public void clickOnCheckCaseSensitiveAnswers()
    {
        //waitForVisibility(CheckCaseSensitiveAnswers);
        CheckCaseSensitiveAnswers.click();
    }
    public void clickOnCheckMaxLengthChar()
    {
        //waitForVisibility(CheckMaxLengthChar);
        CheckMaxLengthChar.click();
    }
    public void enterMaxLengthCharDigit()
    {
        //waitForVisibility(MaxCharTextBox);
        MaxCharTextBox.click();
        MaxCharTextBox.clear();
        MaxCharTextBox.sendKeys("10");
    }
    public void enterTextInShortAnswerFeedbackField()
    {
        //waitForVisibility(ShortAnswerFeedbackField);
        ShortAnswerFeedbackField.sendKeys("This is feedback for SHORT answer question");
    }

    //MATH QUESTION type question methods

    public void enableNumbrTolerance()
    {
        Numbertolerance.click();
    }
    public void addOptionsToMathQuestion()
    {
        MQAddOptions.click();
    }
    public void enterTextIntoOptiosField(String optionText)
    {
        TextIntoOptions.sendKeys(optionText);
    }

    // TRUE FALSE mathods

    public void clickOnTrueButton()
    {
        TrueButton.click();
    }
    public void enterFeedbackInTrueField(String trueFieldText)
    {
        TrueFeedback.sendKeys(trueFieldText);
    }
    public void enterFeedbackInFalseField(String falseFieldText)
    {
        TrueFeedback.sendKeys(falseFieldText);
    }

    //Esssay methods

    public void clickOnMaxWordCount()
    {

       // wait.forElementVisible(MaxWordCountButton);
        MaxWordCountButton.click();
    }
    public void enterInMaxWordCountBox(String M)
    {
        MaxWordCountBox.click();
        MaxWordCountBox.clear();
        MaxWordCountBox.sendKeys(M);
    }

    //MATCH LIST methods

    public void enterTextInFirstChoiceFields(String chText)
    {
        CH1Textbox.sendKeys(chText);
    }
    public void enterTextInSecondChoiceFields(String ch2Text)
    {
        CH2Textbox.sendKeys(ch2Text);
    }
    public void enterTextInOption1Fields(String opText)
    {
        Op1Textbox.sendKeys(opText);
    }
    public void enterTextInOption2Fields(String op2Text)
    {
        Op2Textbox.sendKeys(op2Text);
    }
    public void selectRadioButons()
    {
        Op1Radiobutton11.click();
        Op2Radiobutton22.click();
    }
    public void enterOP1FeedbackText(String op1feedback)
    {
        op1FeedbackField.sendKeys(op1feedback);
    }
    public void enterOP2FeedbackText(String op2feedback)
    {
        op2FeedbackField.sendKeys(op2feedback);
    }
}