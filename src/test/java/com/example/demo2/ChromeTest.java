package com.example.demo2;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;


public class ChromeTest {
    @Test
    public void foo() {
        Selenide.open("https://github.com/");
        $$(By.xpath(".//*")).shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}

