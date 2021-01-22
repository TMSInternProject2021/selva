package com.quinbay.TMS.Action;

import Pages.UndoConnectionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UndoConnectionAction {

    public UndoConnectionPage undoConnectionPage;
    public UndoConnectionAction(WebDriver driver){
        undoConnectionPage= PageFactory.initElements(driver, UndoConnectionPage.class);
    }

    public void del_Connection_Action() throws InterruptedException {
        undoConnectionPage.del_connection();
    }
    public void undo_Connection_Action(){
        undoConnectionPage.undo_connection();
    }

    public boolean verify_UndoAction(){
       return  undoConnectionPage.verify_undo();
    }
}
