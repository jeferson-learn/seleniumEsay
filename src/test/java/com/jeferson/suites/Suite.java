package com.jeferson.suites;

import com.jeferson.testcases.InputFormsTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({InputFormsTest.class,})
//@SelectPackages("testcases")
public class Suite {

}
