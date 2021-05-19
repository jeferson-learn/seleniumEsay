package com.jeferson.suites;

import com.jeferson.testcases.TestCase;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({TestCase.class,})
//@SelectPackages("testcases")
public class Suite {

}
