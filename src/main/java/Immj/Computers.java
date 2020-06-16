package Immj;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Computers extends Utils{

LoadProp prop = new LoadProp();

private By _AddANewComputer = By.id("add");
private By _ComputerName = By.id("name");
//date formate is "yyyy-mm-dd"
private By _IntroduceDate = By.id("introduced");
//date formate is "yyyy-mm-dd"
private By _DiscontinuedDate = By.id("discontinued");
private By _Company = By.id("company");

private By _SubmitBtn = By.cssSelector("input.btn.primary");
private By _Message = By.xpath("//*[@id=\"main\"]/div[1]");
private By _SearchBox = By.id("searchbox");
private By _SubmitSearch = By.id("searchsubmit");
private By _EditComputer = By.linkText("Lenovo 350");
    //By.xpath("//a[@href='/computers/575']");
private By _SaveEdit = By.xpath("//input[@value='Save this computer']");
private By _SuccessEditAlert = By.xpath("//*[@class='alert-message warning']");
private By _ComputerToBeDeleted = By.linkText("Lenovo 350");
    //By.xpath("//a[@href='/computers/578']");
private By _DeleteComputerButton = By.xpath("//input[@value='Delete this computer']");
private By _SuccessDeleteMessage = By.xpath("//*[@class='alert-message warning']");

public void addComputer (){

    clickElement(_AddANewComputer);
}

public void fillDetails(){

waitForElementToLoad(_ComputerName,5);
enterText(_ComputerName,prop.getProperty("computerName"));
enterText(_IntroduceDate,prop.getProperty("introDate"));
enterText(_DiscontinuedDate,prop.getProperty("discontDate"));
selectByValue(_Company,prop.getProperty("Comp"));
clickElement(_SubmitBtn);
}

public void successMessage(){
    Assert.assertEquals(prop.getProperty("SuccessMessage"),getTextFromElement(_Message));

}

public void searchComputer (){
    enterText(_SearchBox,prop.getProperty("computerName"));
    clickElement(_SubmitSearch);
}

public void selectEditComputer(){
    waitForClickable(_EditComputer,5);
    clickElement(_EditComputer);

}

public void editComputer(String RevIntroDate){
    waitForElementToLoad(_IntroduceDate,5);
    clearAndEnterText(_IntroduceDate,RevIntroDate);
}

public void saveComputerEdit(){
    clickElement(_SaveEdit);
    Assert.assertEquals(prop.getProperty("SuccessEditAlertMessage"), getTextFromElement(_SuccessEditAlert));
}

public void searchComputerToDelete(){
    enterText(_SearchBox,prop.getProperty("computerName"));
    clickElement(_SubmitSearch);
}

public void selectComputerToDelete(){
    waitForClickable(_ComputerToBeDeleted,10);
    clickElement(_ComputerToBeDeleted);
}

public void clickDeleteButton(){
    clickElement(_DeleteComputerButton);
}

public void successDeleteMessage(){
    Assert.assertEquals(prop.getProperty("SuccessDeleteMessage"),getTextFromElement(_SuccessDeleteMessage));

}

}
