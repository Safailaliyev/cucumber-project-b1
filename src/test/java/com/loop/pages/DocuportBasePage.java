package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class DocuportBasePage {


        public DocuportBasePage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        public void navbar(String advisor){
            Driver.getDriver().findElement(By.xpath("//span[.='"+ advisor +"']"));
            BrowserUtils.justWait(1);
        }

    public String getNavbar(String navbar){
        String actual = Driver.getDriver().findElement(By.xpath("//span[normalize-space(.)='" +navbar + "']")).getText();
        return actual.substring(0);
    }
        ///html/body/div/div[2]/main/nav/div[1]/div[2]/div/div/a[1]/div[2]/div/span
    //i[contains(@class, 'mdi-folder-download')]

//    use cucumber framework
//    use page object model design
//if possible apple scenario outline
//
//    task1:
//    create the following pages for docuport
//  - Login Page
//  - Base Page or Common Page
//    and locate the elements
//
//    task2:
//            - validate left navigate items of docuport for 3 user
// - use data table
}
